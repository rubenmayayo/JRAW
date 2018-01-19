package net.dean.jraw.models;

import com.fasterxml.jackson.databind.JsonNode;

import net.dean.jraw.RedditClient;
import net.dean.jraw.models.attr.Created;
import net.dean.jraw.models.meta.JsonProperty;
import net.dean.jraw.models.meta.Model;

import java.util.Date;

/**
 * Represents a subreddit rule
 *
 * @see RedditClient#getRules(String subreddit)
 */
@Model(kind = Model.Kind.NONE)
public final class Rule extends Thing implements Created {
    /**
     * Instantiates a new Rules
     */
    public Rule(JsonNode dataNode) {
        super(dataNode);
    }

    /** Description of the rules */
    @JsonProperty
    public String getDescription() {
        return data("description");
    }

    /** Short description of the rule */
    @JsonProperty
    public String getShortName() {
        return data("short_name");
    }

    /** Text that describes the violation reason, used in report dialogs */
    @JsonProperty
    public String getViolationReason() {
        return data("violation_reason");
    }

    /** The rule priority order */
    @JsonProperty
    public Integer getPriority() {
        return data("priority", Integer.class);
    }

    /** Description of the rule in html format */
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

    /** This class represents a list of all the available rule types */
    public enum Type {
        /** Applies to posts */
        LINK,
        /** Applies to comments */
        COMMENT,
        /** Applies to posts and comments */
        ALL
    }
}
