package net.dean.jraw.models;

import com.fasterxml.jackson.databind.JsonNode;

import net.dean.jraw.models.meta.JsonProperty;
import net.dean.jraw.models.meta.Model;

/** This class represents a subreddit, such as /r/pics. */
@Model(kind = Model.Kind.SUBREDDIT)
public final class SubredditSearch extends Thing implements Comparable<SubredditSearch> {

    /** Instantiates a new Subreddit */
    public SubredditSearch(JsonNode dataNode) {
        super(dataNode);
    }

    /** Gets the amount of active users this subreddit has seen in the last 15 minutes */
    @JsonProperty
    public Integer getAccountsActive() {
        return data("active_user_count", Integer.class);
    }

    /** Gets the "human readable" name of the subreddit (ex: "pics") */
    @JsonProperty
    public String getName() {
        return data("name");
    }

    /** Gets the amount of users subscribed to this subreddit */
    @JsonProperty
    public Long getSubscriberCount() {
        return data("subscriber_count", Long.class);
    }


    /** Gets the URL to the icon displayed at the top of the subreddit. May be empty if none is available. */
    @JsonProperty
    public String getIconImage() {
        return data("icon_img", String.class);
    }

    /** Gets the key color */
    @JsonProperty
    public String getKeyColor() {
        return data("key_color", String.class);
    }

    @Override
    public int compareTo(SubredditSearch subreddit) {
        return getName().compareToIgnoreCase(subreddit.getName());
    }

}
