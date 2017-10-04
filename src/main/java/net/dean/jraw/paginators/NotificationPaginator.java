package net.dean.jraw.paginators;

import net.dean.jraw.EndpointImplementation;
import net.dean.jraw.Endpoints;
import net.dean.jraw.RedditClient;
import net.dean.jraw.models.Listing;
import net.dean.jraw.models.Message;

/**
 * Provides a way to iterate over a user's inbox
 */
public class NotificationPaginator extends GenericPaginator<Message> {
    /**
     * Instantiates a new NotificationPaginator
     *
     * @param reddit The client to send requests with
     * @param where  One of "all", "unread", "comments", "selfreply", or "mentions"
     */
    public NotificationPaginator(RedditClient reddit, String where) {
        super(reddit, Message.class, where);
    }

    @Override
    protected String getUriPrefix() {
        return "/notification";
    }

    @Override
    public String[] getWhereValues() {
        return new String[] {"all", "unread", "comments", "selfreply", "mentions"};
    }

    @Override
    @EndpointImplementation({
            Endpoints.NOTIFICATION_ALL,
            Endpoints.NOTIFICATION_UNREAD,
            Endpoints.NOTIFICATION_COMMENTS,
            Endpoints.NOTIFICATION_SELFREPLY,
            Endpoints.NOTIFICATION_MENTIONS,
            Endpoints.NOTIFICATION_WHERE
    })
    public Listing<Message> next(boolean forceNetwork) {
        // Just call super so that we can add the @EndpointImplementation annotation
        return super.next(forceNetwork);
    }
}
