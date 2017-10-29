package net.dean.jraw.paginators;

import net.dean.jraw.EndpointImplementation;
import net.dean.jraw.Endpoints;
import net.dean.jraw.util.JrawUtils;
import net.dean.jraw.RedditClient;
import net.dean.jraw.models.Listing;
import net.dean.jraw.models.Submission;

import java.util.Map;

/**
 * This class allows access to <a href="https://www.reddit.com/search">Reddit's search functionality</a>. This class
 * uses a special enum for sorting the values retrieved called {@link SearchSort}. To set this new sorting, use
 * {@link #setSearchSorting(SearchSort)}.
 */
public class SubmissionSearchPaginator extends Paginator<Submission> {
    public static final SearchSort DEFAULT_SORTING = SearchSort.RELEVANCE;
    public static final SearchSyntax DEFAULT_SYNTAX = SearchSyntax.PLAIN;
    public static final TimePeriod DEFAULT_TIME_PERIOD = TimePeriod.ALL;
    private SearchSort sorting;
    private String subreddit;
    private String query;
    private SearchSyntax syntax;
    private String owner;

    /**
     * Instantiates a new Paginator
     *
     * @param creator The RedditClient that will be used to send HTTP requests
     * @param query   What to search for
     */
    public SubmissionSearchPaginator(RedditClient creator, String query) {
        super(creator, Submission.class);
        this.query = query;
        this.sorting = DEFAULT_SORTING;
        this.syntax = DEFAULT_SYNTAX;
        setTimePeriod(DEFAULT_TIME_PERIOD);
    }

    @Override
    @EndpointImplementation(Endpoints.SEARCH)
    public Listing<Submission> next(boolean forceNetwork) {
        // Just call super so that we can add the @EndpointImplementation annotation
        return super.next(forceNetwork);
    }

    @Override
    protected String getBaseUri() {
        String base = "/search";
        if (subreddit != null) {
            if (owner != null) { // Is a multireddit
                base = "/user/" + owner + "/m/" + subreddit + base;
            }
            else {
                base = "/r/" + subreddit + base;
            }
        }
        return base;
    }

    @Override
    protected Map<String, String> getExtraQueryArgs() {
        return JrawUtils.mapOf(
                "q", query,
                "t", timePeriod.name().toLowerCase(),
                "restrict_sr", subreddit == null ? "off" : "on",
                "sort", sorting.name().toLowerCase(),
                "syntax", syntax.name().toLowerCase()
        );
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
        invalidate();
    }

    public void setMultireddit(String owner, String multireddit) {
        this.owner = owner;
        this.subreddit = multireddit;
        invalidate();
    }

    /**
     * Gets the query this SearchPaginator is searching for.
     * @return The query
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the query and invalidates the paginator.
     * @param query The new query
     */
    public void setQuery(String query) {
        this.query = query;
        invalidate();
    }

    @Override
    public void setSorting(Sorting sorting) {
        throw new UnsupportedOperationException("Use setSearchSorting(SearchSort)");
    }

    /**
     * Sets the new sorting and invalidates the paginator
     * @param sorting The new sorting
     */
    public void setSearchSorting(SearchSort sorting) {
        this.sorting = sorting;
        invalidate();
    }

    /**
     * Gets the current sorting
     * @return The current sorting
     */
    public SearchSort getSearchSorting() {
        return sorting;
    }

    @Override
    protected String getSortingString() {
        return sorting.name().toLowerCase();
    }

    public SearchSyntax getSyntax() {
        return syntax;
    }

    /** Sets the search syntax and invalidates the Paginator */
    public void setSyntax(SearchSyntax syntax) {
        this.syntax = syntax;
        invalidate();
    }

    /**
     * How the search results can be sorted
     */
    public enum SearchSort {
        NEW,
        HOT,
        TOP,
        RELEVANCE,
        COMMENTS
    }

    /** An enumeration of the syntaxes the reddit API can handle in its search functionality */
    public enum SearchSyntax {
        /** Search by plain text, keywords */
        PLAIN,
        /**
         * Amazon's cloudsearch syntax. See <a href="https://www.reddit.com/wiki/search#wiki_cloudsearch_syntax">here</a>
         * for more.
         */
        CLOUDSEARCH,
        /**
         * Lucene is the default search syntax in reddit. It gets translated to cloudsearch
         */
        LUCENE,
    }
}
