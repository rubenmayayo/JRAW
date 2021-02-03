package net.dean.jraw.models;

import net.dean.jraw.models.Subreddit;

import java.util.List;

public class DraftsResponse {

    List<Draft> drafts;
    List<Subreddit> subreddits;

    public DraftsResponse(List<Draft> drafts, List<Subreddit> subreddits) {
        this.drafts = drafts;
        this.subreddits = subreddits;
    }

    public List<Draft> getDrafts() {
        return drafts;
    }

    public List<Subreddit> getSubreddits() {
        return subreddits;
    }
}