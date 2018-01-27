package net.dean.jraw.paginators;

import net.dean.jraw.EndpointImplementation;
import net.dean.jraw.Endpoints;
import net.dean.jraw.RedditClient;
import net.dean.jraw.models.Listing;
import net.dean.jraw.models.Subreddit;

/**
 * This paginator will iterate through users based on certain criteria.
 */
public class UserStream extends GenericPaginator<Subreddit> {

    /**
     * Instantiates a new AllSubredditsPaginator
     *
     * @param creator The RedditClient that will be used to send HTTP requests
     * @param where One of "popular", "new"
     */
    public UserStream(RedditClient creator, String where) {
        super(creator, Subreddit.class, where);
    }

    @Override
    @EndpointImplementation({
            Endpoints.USERS_POPULAR,
            Endpoints.USERS_NEW,
            Endpoints.USERS_WHERE
    })
    public Listing<Subreddit> next() {
        // Just call super so that we can add the @EndpointImplementation annotation
        return super.next(where.equalsIgnoreCase("new"));
    }

    @Override
    public String getUriPrefix() {
        return "/users/";
    }

    @Override
    public String[] getWhereValues() {
        return new String[] {"popular", "new"};
    }
}
