package net.dean.jraw.paginators;

import net.dean.jraw.EndpointImplementation;
import net.dean.jraw.Endpoints;
import net.dean.jraw.RedditClient;
import net.dean.jraw.models.Listing;
import net.dean.jraw.models.Subreddit;

import java.util.HashMap;
import java.util.Map;

/**
 * This class provides a way to search for subreddits by both name and description
 */
public class SubredditSearchPaginator extends Paginator<Subreddit> {
    public static final SubredditSearchSort DEFAULT_SORTING = SubredditSearchSort.RELEVANCE;
    private String query;
    private SubredditSearchSort sorting;


    /**
     * Instantiates a new Paginator
     *
     * @param creator The RedditClient that will be used to send HTTP requests
     * @param query   What to search for
     */
    public SubredditSearchPaginator(RedditClient creator, String query) {
        super(creator, Subreddit.class);
        this.query = query;
        this.sorting = DEFAULT_SORTING;
    }

    @Override
    protected String getBaseUri() {
        return "/subreddits/search";
    }

    @Override
    @EndpointImplementation(Endpoints.SUBREDDITS_SEARCH)
    public Listing<Subreddit> next(boolean forceNetwork) throws IllegalStateException {
        return super.next(forceNetwork);
    }

    @Override
    protected Map<String, String> getExtraQueryArgs() {
        Map<String, String> args = new HashMap<>(super.getExtraQueryArgs());
        args.put("q", query);
        args.put("sort", sorting.name().toLowerCase());
        return args;
    }

    @Override
    public void setSorting(Sorting sorting) {
        throw new UnsupportedOperationException("Use setSearchSorting(SubredditSearchSort)");
    }

    /**
     * Sets the new sorting and invalidates the paginator
     * @param sorting The new sorting
     */
    public void setSearchSorting(SubredditSearchSort sorting) {
        this.sorting = sorting;
        invalidate();
    }

    /**
     * Gets the current sorting
     * @return The current sorting
     */
    public SubredditSearchSort getSearchSorting() {
        return sorting;
    }

    @Override
    protected String getSortingString() {
        return sorting.name().toLowerCase();
    }

    /**
     * How the search results can be sorted
     */
    public enum SubredditSearchSort {
        RELEVANCE,
        ACTIVITY
    }
}
