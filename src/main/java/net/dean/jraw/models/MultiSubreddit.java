package net.dean.jraw.models;

import com.fasterxml.jackson.databind.JsonNode;
import net.dean.jraw.util.Dimension;
import net.dean.jraw.models.meta.JsonProperty;

/**
 * Represents a subreddit as it is displayed in the multireddit data structure.
 */
public final class MultiSubreddit extends RedditObject {
    /**
     * Instantiates a new MultiSubreddit
     *
     * @param dataNode The node to parse data from
     */
    public MultiSubreddit(JsonNode dataNode) {
        super(dataNode);
    }

    // NOTE: Much of this class is undocumented because this part of the API is fairly new.

    @JsonProperty(nullable = true)
    public String getIconImage() {
        return data("icon_img");
    }

    @JsonProperty(nullable = true)
    public String getKeyColor() {
        return data("key_color");
    }

    @JsonProperty(nullable = true)
    public String getHeaderImage() {
        return data("header_img");
    }

    /** Checks if the user is a moderator of this subreddit */
    @JsonProperty(nullable = true)
    public Boolean isUserModerator() {
        return data("user_is_moderator", Boolean.class);
    }

    /** Checks if the user is banned from this subreddit */
    @JsonProperty(nullable = true)
    public Boolean isUserBanned() {
        return data("user_is_banned", Boolean.class);
    }

    /** Checks if the user is an approved contributor of this subreddit */
    @JsonProperty(nullable = true)
    public Boolean isUserContributor() {
        return data("user_is_contributor", Boolean.class);
    }

    /** Checks if the logged-in user is subscribed to this subreddit */
    @JsonProperty(nullable = true)
    public Boolean isUserSubscriber() {
        return data("user_is_subscriber", Boolean.class);
    }

    /** Gets the URL to the banner displayed at the top of the subreddit. May be empty if none is available. */
    @JsonProperty(nullable = true)
    public String getBannerImage() {
        return data("banner_img", String.class);
    }

    /** Gets the amount of users subscribed to this subreddit */
    @JsonProperty(nullable = true)
    public Long getSubscriberCount() {
        return data("subscribers", Long.class);
    }

    @JsonProperty(nullable = true)
    public Dimension getHeaderSize() {
        return _getHeaderSize();
    }

    @JsonProperty(nullable = true)
    public Dimension getIconSize() {
        return _getDimension("icon_size");
    }

    /** Gets this subreddit's fullname (ex: "t5_2qh33") */
    @JsonProperty(nullable = true)
    public String getFullName() {
        return data("fullname");
    }

    /** Gets this subreddit's human-readable name (ex: "funny") */
    @JsonProperty
    public String getDisplayName() {
        return data("display_name");
    }
}
