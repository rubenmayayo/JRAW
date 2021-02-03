package net.dean.jraw.models;

import com.fasterxml.jackson.databind.JsonNode;

import net.dean.jraw.models.FlairTemplate;
import net.dean.jraw.models.JsonModel;
import net.dean.jraw.models.meta.JsonProperty;

import java.util.Date;

/**
 * Represents a post draft
 */
public final class Draft extends JsonModel {
    /** Instantiates a new Draft */
    public Draft(JsonNode dataNode) {
        super(dataNode);
    }

    /**
     * Gets the body of the post or link
     */
    @JsonProperty(nullable = true)
    public String getBody() {
        return data("body");
    }

    /**
     * Gets the ID of this draft
     */
    @JsonProperty(nullable = true)
    public String getId() {
        return data("id");
    }

    /**
     * Gets the subreddit of this draft
     */
    @JsonProperty(nullable = true)
    public String getSubreddit() {
        return data("subreddit");
    }

    /**
     * Gets the kind of this post (link, markdown, richtext)
     */
    @JsonProperty(nullable = true)
    public String getKind() {
        return data("kind");
    }

    /**
     * Gets the title of the post
     */
    @JsonProperty(nullable = true)
    public String getTitle() {
        return data("title");
    }

    /**
     * Gets the date this object was modified in local time
     * @return Date modified in local time
     */
    protected final Date getModified() {
        // created in seconds, Date constructor wants milliseconds
        return new Date(getDataNode().get("modified").longValue() * 1000);
    }

    /**
     * Gets the date this object was created in local time
     * @return Date created in local time
     */
    protected final Date getCreated() {
        // created in seconds, Date constructor wants milliseconds
        return new Date(getDataNode().get("created").longValue() * 1000);
    }

    /** Checks if the post is nsfw */
    @JsonProperty
    public Boolean isNsfw() {
        if (!data.has("nsfw")) {
            return false;
        }

        return data("nsfw", Boolean.class);
    }

    /** Checks if the post is spoiler */
    @JsonProperty
    public Boolean isSpoiler() {
        if (!data.has("spoiler")) {
            return false;
        }

        return data("spoiler", Boolean.class);
    }

    /** Checks if the post is original content */
    @JsonProperty
    public Boolean isOriginalContent() {
        if (!data.has("original_content")) {
            return false;
        }

        return data("original_content", Boolean.class);
    }

    /** Checks if send replies is enabled */
    @JsonProperty
    public Boolean isSendReplies() {
        if (!data.has("send_replies")) {
            return false;
        }

        return data("send_replies", Boolean.class);
    }

    /** Checks if draft has public link */
    @JsonProperty
    public Boolean isPublicLink() {
        if (!data.has("is_public_link")) {
            return false;
        }

        return data("is_public_link", Boolean.class);
    }

    /** Get the flair for this post */
    @JsonProperty(nullable = true)
    public FlairTemplate getFlair() {
        if (!data.has("flair")) {
            return null;
        }

        return new FlairTemplate(data.get("flair"));
    }


}
