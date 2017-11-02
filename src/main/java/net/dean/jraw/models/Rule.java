package net.dean.jraw.models;

import com.fasterxml.jackson.databind.JsonNode;

import net.dean.jraw.RedditClient;
import net.dean.jraw.models.attr.Created;
import net.dean.jraw.models.meta.JsonProperty;
import net.dean.jraw.models.meta.Model;

import java.util.Date;

/**
 * Represents a trophy displayed in a user's trophy case
 *
 * @see RedditClient#getTrophies()
 */
@Model(kind = Model.Kind.NONE)
public final class Rule extends Thing implements Created {
    /**
     * Instantiates a new Trophy
     */
    public Rule(JsonNode dataNode) {
        super(dataNode);
    }

    /** The URL to the 70x70 version of the icon */
    @JsonProperty
    public String getDescription() {
        return data("description");
    }

    /** The URL to the 40x40 version of the icon */
    @JsonProperty
    public String getShortName() {
        return data("short_name");
    }

    /** Optional text that describes to what degree the award was achieved */
    @JsonProperty
    public String getViolationReason() {
        return data("violation_reason");
    }

    /** The award's ID (different than the normal ID) */
    @JsonProperty
    public Integer getPriority() {
        return data("priority", Integer.class);
    }

    /** An external link explaining this award */
    @JsonProperty
    public String getDescriptionHtml() {
        return data("description_html");
    }

    /** Gets the type of this rules */
    @JsonProperty
    public Type getType() {
        JsonNode type = data.get("kind");
        return Type.valueOf(type.asText().toUpperCase());
    }

    @Override
    public Date getCreated() {
        return _getCreated();
    }

    /** This class represents a list of all the available subreddit types */
    public enum Type {
        /** Applies to posts */
        LINK,
        /** Applies to comments */
        COMMENT,
        /** Applies to posts and comments */
        ALL
    }
}
