<!--- Generated 2020-12-18 at 22:31:50 CET. Use `gradle endpoints:update` to update. DO NOT MODIFY DIRECTLY -->
#Endpoints

This file contains a list of all the endpoints (regardless of if they have been implemented) that can be found at the [official reddit API docs](https://www.reddit.com/dev/api/oauth). To update this file, run `gradle endpoints:update`.

So far **144** endpoints (out of 233 total) have been implemented.

##(any scope)
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/friend`](https://www.reddit.com/dev/api/oauth#POST_api_friend)|None
`POST`|[`/api/unfriend`](https://www.reddit.com/dev/api/oauth#POST_api_unfriend)|None
`POST`|[`/api/comment`](https://www.reddit.com/dev/api/oauth#POST_api_comment)|[`AccountManager.reply(Contribution, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#reply(net.dean.jraw.models.Contribution, java.lang.String))
`GET`|[`/api/needs_captcha`](https://www.reddit.com/dev/api/oauth#GET_api_needs_captcha)|[`CaptchaHelper.isNecessary()`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/CaptchaHelper.html#isNecessary())
`POST`|[`/api/new_captcha`](https://www.reddit.com/dev/api/oauth#POST_api_new_captcha)|[`CaptchaHelper.getNew()`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/CaptchaHelper.html#getNew())
`GET`|[`/api/v1/scopes`](https://www.reddit.com/dev/api/oauth#GET_api_v1_scopes)|[`RedditClient.getScopeDetails(String[])`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/RedditClient.html#getScopeDetails([Ljava.lang.String;))
`GET`|[`/captcha/{iden}`](https://www.reddit.com/dev/api/oauth#GET_captcha_%7Biden%7D)|[`CaptchaHelper.get(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/CaptchaHelper.html#get(java.lang.String))

##account
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/block_user`](https://www.reddit.com/dev/api/oauth#POST_api_block_user)|None
`PATCH`|[`/api/v1/me/prefs`](https://www.reddit.com/dev/api/oauth#PATCH_api_v1_me_prefs)|[`AccountManager.updatePreferences(AccountPreferencesEditor)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#updatePreferences(net.dean.jraw.AccountPreferencesEditor))

##creddits
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/v1/gold/gild/{fullname}`](https://www.reddit.com/dev/api/oauth#POST_api_v1_gold_gild_%7Bfullname%7D)|[`AccountManager.giveGold(PublicContribution)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#giveGold(net.dean.jraw.models.PublicContribution))
`POST`|[`/api/v1/gold/give/{username}`](https://www.reddit.com/dev/api/oauth#POST_api_v1_gold_give_%7Busername%7D)|[`AccountManager.giveGold(String, int)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#giveGold(java.lang.String, int))

##edit
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/del`](https://www.reddit.com/dev/api/oauth#POST_api_del)|[`ModerationManager.delete(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/ModerationManager.html#delete(java.lang.String))
`POST`|[`/api/editusertext`](https://www.reddit.com/dev/api/oauth#POST_api_editusertext)|[`AccountManager.updateContribution(PublicContribution, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#updateContribution(net.dean.jraw.models.PublicContribution, java.lang.String))
`POST`|[`/api/live/{thread}/delete_update`](https://www.reddit.com/dev/api/oauth#POST_api_live_%7Bthread%7D_delete_update)|[`LiveThreadManager.deleteUpdate(LiveThread, LiveUpdate)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/LiveThreadManager.html#deleteUpdate(net.dean.jraw.models.LiveThread, net.dean.jraw.models.LiveUpdate))
`POST`|[`/api/live/{thread}/strike_update`](https://www.reddit.com/dev/api/oauth#POST_api_live_%7Bthread%7D_strike_update)|[`LiveThreadManager.strikeUpdate(LiveThread, LiveUpdate)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/LiveThreadManager.html#strikeUpdate(net.dean.jraw.models.LiveThread, net.dean.jraw.models.LiveUpdate))
`POST`|[`/api/sendreplies`](https://www.reddit.com/dev/api/oauth#POST_api_sendreplies)|[`AccountManager.sendRepliesToInbox(Submission, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#sendRepliesToInbox(net.dean.jraw.models.Submission, boolean))

##flair
Method|Endpoint|Implemention
:----:|--------|------------
`GET`|[`/api/link_flair`](https://www.reddit.com/dev/api/oauth#GET_api_link_flair)|None
`GET`|[`/api/link_flair_v2`](https://www.reddit.com/dev/api/oauth#GET_api_link_flair_v2)|None
`GET`|[`/api/user_flair`](https://www.reddit.com/dev/api/oauth#GET_api_user_flair)|None
`GET`|[`/api/user_flair_v2`](https://www.reddit.com/dev/api/oauth#GET_api_user_flair_v2)|None
`POST`|[`/api/flairselector`](https://www.reddit.com/dev/api/oauth#POST_api_flairselector)|[`AccountManager.getFlairChoices(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#getFlairChoices(java.lang.String))
`POST`|[`/api/selectflair`](https://www.reddit.com/dev/api/oauth#POST_api_selectflair)|[`ModerationManager.setFlair(String, FlairTemplate, String, Submission, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/ModerationManager.html#setFlair(java.lang.String, net.dean.jraw.models.FlairTemplate, java.lang.String, net.dean.jraw.models.Submission, java.lang.String))
`POST`|[`/api/setflairenabled`](https://www.reddit.com/dev/api/oauth#POST_api_setflairenabled)|[`AccountManager.setFlairEnabled(String, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#setFlairEnabled(java.lang.String, boolean))

##history
Method|Endpoint|Implemention
:----:|--------|------------
`GET`|[`/user/{username}/comments`](https://www.reddit.com/dev/api/oauth#GET_user_%7Busername%7D_comments)|[`UserContributionPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserContributionPaginator.html#next(boolean))
`GET`|[`/user/{username}/downvoted`](https://www.reddit.com/dev/api/oauth#GET_user_%7Busername%7D_downvoted)|[`UserContributionPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserContributionPaginator.html#next(boolean))
`GET`|[`/user/{username}/gilded`](https://www.reddit.com/dev/api/oauth#GET_user_%7Busername%7D_gilded)|[`UserContributionPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserContributionPaginator.html#next(boolean))
`GET`|[`/user/{username}/hidden`](https://www.reddit.com/dev/api/oauth#GET_user_%7Busername%7D_hidden)|[`UserContributionPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserContributionPaginator.html#next(boolean))
`GET`|[`/user/{username}/overview`](https://www.reddit.com/dev/api/oauth#GET_user_%7Busername%7D_overview)|[`UserContributionPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserContributionPaginator.html#next(boolean))
`GET`|[`/user/{username}/saved`](https://www.reddit.com/dev/api/oauth#GET_user_%7Busername%7D_saved)|[`UserContributionPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserContributionPaginator.html#next(boolean))
`GET`|[`/user/{username}/submitted`](https://www.reddit.com/dev/api/oauth#GET_user_%7Busername%7D_submitted)|[`UserContributionPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserContributionPaginator.html#next(boolean))
`GET`|[`/user/{username}/upvoted`](https://www.reddit.com/dev/api/oauth#GET_user_%7Busername%7D_upvoted)|[`UserContributionPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserContributionPaginator.html#next(boolean))
`GET`|[`/user/{username}/{where}`](https://www.reddit.com/dev/api/oauth#GET_user_%7Busername%7D_%7Bwhere%7D)|[`UserContributionPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserContributionPaginator.html#next(boolean))

##identity
Method|Endpoint|Implemention
:----:|--------|------------
`GET`|[`/api/v1/me`](https://www.reddit.com/dev/api/oauth#GET_api_v1_me)|[`RedditClient.me()`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/RedditClient.html#me())
`GET`|[`/api/v1/me/prefs`](https://www.reddit.com/dev/api/oauth#GET_api_v1_me_prefs)|[`AccountManager.getPreferences(List)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#getPreferences(java.util.List))
`GET`|[`/api/v1/me/trophies`](https://www.reddit.com/dev/api/oauth#GET_api_v1_me_trophies)|[`RedditClient.getTrophies(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/RedditClient.html#getTrophies(java.lang.String))

##livemanage
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/live/{thread}/accept_contributor_invite`](https://www.reddit.com/dev/api/oauth#POST_api_live_%7Bthread%7D_accept_contributor_invite)|None
`POST`|[`/api/live/{thread}/close_thread`](https://www.reddit.com/dev/api/oauth#POST_api_live_%7Bthread%7D_close_thread)|None
`POST`|[`/api/live/{thread}/invite_contributor`](https://www.reddit.com/dev/api/oauth#POST_api_live_%7Bthread%7D_invite_contributor)|None
`POST`|[`/api/live/{thread}/leave_contributor`](https://www.reddit.com/dev/api/oauth#POST_api_live_%7Bthread%7D_leave_contributor)|None
`POST`|[`/api/live/{thread}/rm_contributor`](https://www.reddit.com/dev/api/oauth#POST_api_live_%7Bthread%7D_rm_contributor)|None
`POST`|[`/api/live/{thread}/rm_contributor_invite`](https://www.reddit.com/dev/api/oauth#POST_api_live_%7Bthread%7D_rm_contributor_invite)|None
`POST`|[`/api/live/{thread}/set_contributor_permissions`](https://www.reddit.com/dev/api/oauth#POST_api_live_%7Bthread%7D_set_contributor_permissions)|None
`POST`|[`/api/live/{thread}/edit`](https://www.reddit.com/dev/api/oauth#POST_api_live_%7Bthread%7D_edit)|[`LiveThreadManager.edit(LiveThread, String, boolean, String, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/LiveThreadManager.html#edit(net.dean.jraw.models.LiveThread, java.lang.String, boolean, java.lang.String, java.lang.String))

##modconfig
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/delete_sr_banner`](https://www.reddit.com/dev/api/oauth#POST_api_delete_sr_banner)|None
`POST`|[`/api/delete_sr_header`](https://www.reddit.com/dev/api/oauth#POST_api_delete_sr_header)|None
`POST`|[`/api/delete_sr_icon`](https://www.reddit.com/dev/api/oauth#POST_api_delete_sr_icon)|None
`POST`|[`/api/delete_sr_img`](https://www.reddit.com/dev/api/oauth#POST_api_delete_sr_img)|None
`POST`|[`/api/site_admin`](https://www.reddit.com/dev/api/oauth#POST_api_site_admin)|None
`POST`|[`/api/subreddit_stylesheet`](https://www.reddit.com/dev/api/oauth#POST_api_subreddit_stylesheet)|None
`POST`|[`/api/upload_sr_img`](https://www.reddit.com/dev/api/oauth#POST_api_upload_sr_img)|None
`GET`|[`/r/{subreddit}/about/edit`](https://www.reddit.com/dev/api/oauth#GET_r_%7Bsubreddit%7D_about_edit)|None
`GET`|[`/stylesheet`](https://www.reddit.com/dev/api/oauth#GET_stylesheet)|[`RedditClient.getStylesheet(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/RedditClient.html#getStylesheet(java.lang.String))

##modcontributors
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/unmute/message/author`](https://www.reddit.com/dev/api/oauth#POST_api_unmute_message_author)|None
`POST`|[`/api_mute_message_author`](https://www.reddit.com/dev/api/oauth#POST_api_mute_message_author)|None

##modflair
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/clearflairtemplates`](https://www.reddit.com/dev/api/oauth#POST_api_clearflairtemplates)|None
`POST`|[`/api/deleteflair`](https://www.reddit.com/dev/api/oauth#POST_api_deleteflair)|None
`POST`|[`/api/deleteflairtemplate`](https://www.reddit.com/dev/api/oauth#POST_api_deleteflairtemplate)|None
`POST`|[`/api/flair`](https://www.reddit.com/dev/api/oauth#POST_api_flair)|None
`POST`|[`/api/flairconfig`](https://www.reddit.com/dev/api/oauth#POST_api_flairconfig)|None
`POST`|[`/api/flaircsv`](https://www.reddit.com/dev/api/oauth#POST_api_flaircsv)|None
`GET`|[`/api/flairlist`](https://www.reddit.com/dev/api/oauth#GET_api_flairlist)|None
`POST`|[`/api/flairtemplate`](https://www.reddit.com/dev/api/oauth#POST_api_flairtemplate)|None

##modlog
Method|Endpoint|Implemention
:----:|--------|------------
`GET`|[`/about/log`](https://www.reddit.com/dev/api/oauth#GET_about_log)|[`ModLogPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/ModLogPaginator.html#next(boolean))

##modmail
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/mod/bulk_read`](https://www.reddit.com/dev/api/oauth#POST_api_mod_bulk_read)|None
`GET`|[`/api/mod/conversations`](https://www.reddit.com/dev/api/oauth#GET_api_mod_conversations)|None
`POST`|[`/api/mod/conversations`](https://www.reddit.com/dev/api/oauth#POST_api_mod_conversations)|None
`POST`|[`/api/mod/conversations/read`](https://www.reddit.com/dev/api/oauth#POST_api_mod_conversations_read)|None
`GET`|[`/api/mod/conversations/subreddits`](https://www.reddit.com/dev/api/oauth#GET_api_mod_conversations_subreddits)|None
`POST`|[`/api/mod/conversations/unread`](https://www.reddit.com/dev/api/oauth#POST_api_mod_conversations_unread)|None
`GET`|[`/api/mod/conversations/unread/count`](https://www.reddit.com/dev/api/oauth#GET_api_mod_conversations_unread_count)|None
`GET`|[`/api/mod/conversations/{conversation}`](https://www.reddit.com/dev/api/oauth#GET_api_mod_conversations_%7Bconversation%7D)|None
`POST`|[`/api/mod/conversations/{conversation}`](https://www.reddit.com/dev/api/oauth#POST_api_mod_conversations_%7Bconversation%7D)|None
`POST`|[`/api/mod/conversations/{conversation}/archive`](https://www.reddit.com/dev/api/oauth#POST_api_mod_conversations_%7Bconversation%7D_archive)|None
`DELETE`|[`/api/mod/conversations/{conversation}/highlight`](https://www.reddit.com/dev/api/oauth#DELETE_api_mod_conversations_%7Bconversation%7D_highlight)|None
`POST`|[`/api/mod/conversations/{conversation}/highlight`](https://www.reddit.com/dev/api/oauth#POST_api_mod_conversations_%7Bconversation%7D_highlight)|None
`POST`|[`/api/mod/conversations/{conversation}/mute`](https://www.reddit.com/dev/api/oauth#POST_api_mod_conversations_%7Bconversation%7D_mute)|None
`POST`|[`/api/mod/conversations/{conversation}/unarchive`](https://www.reddit.com/dev/api/oauth#POST_api_mod_conversations_%7Bconversation%7D_unarchive)|None
`POST`|[`/api/mod/conversations/{conversation}/unmute`](https://www.reddit.com/dev/api/oauth#POST_api_mod_conversations_%7Bconversation%7D_unmute)|None
`GET`|[`/api/mod/conversations/{conversation}/user`](https://www.reddit.com/dev/api/oauth#GET_api_mod_conversations_%7Bconversation%7D_user)|None

##modothers
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/setpermissions`](https://www.reddit.com/dev/api/oauth#POST_api_setpermissions)|None

##modposts
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/distinguish`](https://www.reddit.com/dev/api/oauth#POST_api_distinguish)|None
`POST`|[`/api/approve`](https://www.reddit.com/dev/api/oauth#POST_api_approve)|[`ModerationManager.approve(Thing)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/ModerationManager.html#approve(net.dean.jraw.models.Thing))
`POST`|[`/api/ignore_reports`](https://www.reddit.com/dev/api/oauth#POST_api_ignore_reports)|[`ModerationManager.setIgnoreReports(Submission, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/ModerationManager.html#setIgnoreReports(net.dean.jraw.models.Submission, boolean))
`POST`|[`/api/lock`](https://www.reddit.com/dev/api/oauth#POST_api_lock)|[`ModerationManager.setLocked(Submission, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/ModerationManager.html#setLocked(net.dean.jraw.models.Submission, boolean))
`POST`|[`/api/marknsfw`](https://www.reddit.com/dev/api/oauth#POST_api_marknsfw)|[`ModerationManager.setNsfw(Submission, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/ModerationManager.html#setNsfw(net.dean.jraw.models.Submission, boolean))
`POST`|[`/api/remove`](https://www.reddit.com/dev/api/oauth#POST_api_remove)|[`ModerationManager.remove(Thing, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/ModerationManager.html#remove(net.dean.jraw.models.Thing, boolean))
`POST`|[`/api/set_contest_mode`](https://www.reddit.com/dev/api/oauth#POST_api_set_contest_mode)|[`ModerationManager.setContestMode(Submission, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/ModerationManager.html#setContestMode(net.dean.jraw.models.Submission, boolean))
`POST`|[`/api/set_subreddit_sticky`](https://www.reddit.com/dev/api/oauth#POST_api_set_subreddit_sticky)|[`ModerationManager.setSticky(Submission, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/ModerationManager.html#setSticky(net.dean.jraw.models.Submission, boolean))
`POST`|[`/api/set_suggested_sort`](https://www.reddit.com/dev/api/oauth#POST_api_set_suggested_sort)|[`ModerationManager.setSuggestedSort(Submission, CommentSort)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/ModerationManager.html#setSuggestedSort(net.dean.jraw.models.Submission, net.dean.jraw.models.CommentSort))
`POST`|[`/api/spoiler`](https://www.reddit.com/dev/api/oauth#POST_api_spoiler)|[`ModerationManager.setSpoiler(Submission, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/ModerationManager.html#setSpoiler(net.dean.jraw.models.Submission, boolean))
`POST`|[`/api/unignore_reports`](https://www.reddit.com/dev/api/oauth#POST_api_unignore_reports)|[`ModerationManager.setIgnoreReports(Submission, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/ModerationManager.html#setIgnoreReports(net.dean.jraw.models.Submission, boolean))
`POST`|[`/api/unlock`](https://www.reddit.com/dev/api/oauth#POST_api_unlock)|[`ModerationManager.setLocked(Submission, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/ModerationManager.html#setLocked(net.dean.jraw.models.Submission, boolean))
`POST`|[`/api/unmarknsfw`](https://www.reddit.com/dev/api/oauth#POST_api_unmarknsfw)|[`ModerationManager.setNsfw(Submission, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/ModerationManager.html#setNsfw(net.dean.jraw.models.Submission, boolean))
`POST`|[`/api/unspoiler`](https://www.reddit.com/dev/api/oauth#POST_api_unspoiler)|[`ModerationManager.setSpoiler(Submission, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/ModerationManager.html#setSpoiler(net.dean.jraw.models.Submission, boolean))

##modself
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/accept_moderator_invite`](https://www.reddit.com/dev/api/oauth#POST_api_accept_moderator_invite)|None
`POST`|[`/api/leavecontributor`](https://www.reddit.com/dev/api/oauth#POST_api_leavecontributor)|None
`POST`|[`/api/leavemoderator`](https://www.reddit.com/dev/api/oauth#POST_api_leavemoderator)|None

##modwiki
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/wiki/alloweditor/add`](https://www.reddit.com/dev/api/oauth#POST_api_wiki_alloweditor_add)|None
`POST`|[`/api/wiki/alloweditor/del`](https://www.reddit.com/dev/api/oauth#POST_api_wiki_alloweditor_del)|None
`POST`|[`/api/wiki/alloweditor/{act}`](https://www.reddit.com/dev/api/oauth#POST_api_wiki_alloweditor_%7Bact%7D)|None
`POST`|[`/api/wiki/hide`](https://www.reddit.com/dev/api/oauth#POST_api_wiki_hide)|None
`POST`|[`/api/wiki/revert`](https://www.reddit.com/dev/api/oauth#POST_api_wiki_revert)|None
`POST`|[`/wiki/settings/{page}`](https://www.reddit.com/dev/api/oauth#POST_wiki_settings_%7Bpage%7D)|None
`GET`|[`/wiki/settings/{page}`](https://www.reddit.com/dev/api/oauth#GET_wiki_settings_%7Bpage%7D)|[`WikiManager.getSettings(String, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/WikiManager.html#getSettings(java.lang.String, java.lang.String))

##mysubreddits
Method|Endpoint|Implemention
:----:|--------|------------
`GET`|[`/api/v1/me/friends/{username}`](https://www.reddit.com/dev/api/oauth#GET_api_v1_me_friends_%7Busername%7D)|[`AccountManager.getFriend(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#getFriend(java.lang.String))
`GET`|[`/api/v1/me/karma`](https://www.reddit.com/dev/api/oauth#GET_api_v1_me_karma)|[`AccountManager.getKarmaBreakdown()`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#getKarmaBreakdown())
`GET`|[`/subreddits/mine/contributor`](https://www.reddit.com/dev/api/oauth#GET_subreddits_mine_contributor)|[`UserSubredditsPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserSubredditsPaginator.html#next(boolean))
`GET`|[`/subreddits/mine/moderator`](https://www.reddit.com/dev/api/oauth#GET_subreddits_mine_moderator)|[`UserSubredditsPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserSubredditsPaginator.html#next(boolean))
`GET`|[`/subreddits/mine/subscriber`](https://www.reddit.com/dev/api/oauth#GET_subreddits_mine_subscriber)|[`UserSubredditsPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserSubredditsPaginator.html#next(boolean))
`GET`|[`/subreddits/mine/{where}`](https://www.reddit.com/dev/api/oauth#GET_subreddits_mine_%7Bwhere%7D)|[`UserSubredditsPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserSubredditsPaginator.html#next(boolean))

##privatemessages
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/block`](https://www.reddit.com/dev/api/oauth#POST_api_block)|None
`POST`|[`/api/del_msg`](https://www.reddit.com/dev/api/oauth#POST_api_del_msg)|None
`POST`|[`/api/unblock_subreddit`](https://www.reddit.com/dev/api/oauth#POST_api_unblock_subreddit)|None
`GET`|[`/api/v1/me/notifications`](https://www.reddit.com/dev/api/oauth#GET_api_v1_me_notifications)|None
`PATCH`|[`/api/v1/me/notifications/{id}`](https://www.reddit.com/dev/api/oauth#PATCH_api_v1_me_notifications_%7Bid%7D)|None
`POST`|[`/api/compose`](https://www.reddit.com/dev/api/oauth#POST_api_compose)|[`InboxManager.compose(String, String, String, String, Captcha, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/InboxManager.html#compose(java.lang.String, java.lang.String, java.lang.String, java.lang.String, net.dean.jraw.models.Captcha, java.lang.String))
`POST`|[`/api/read_all_messages`](https://www.reddit.com/dev/api/oauth#POST_api_read_all_messages)|[`InboxManager.setAllRead()`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/InboxManager.html#setAllRead())
`POST`|[`/api/read_message`](https://www.reddit.com/dev/api/oauth#POST_api_read_message)|[`InboxManager.setRead(boolean, Message, Message[])`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/InboxManager.html#setRead(boolean, net.dean.jraw.models.Message, [Lnet.dean.jraw.models.Message;))
`POST`|[`/api/unread_message`](https://www.reddit.com/dev/api/oauth#POST_api_unread_message)|[`InboxManager.setRead(boolean, Message, Message[])`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/InboxManager.html#setRead(boolean, net.dean.jraw.models.Message, [Lnet.dean.jraw.models.Message;))
`GET`|[`/message/inbox`](https://www.reddit.com/dev/api/oauth#GET_message_inbox)|[`InboxPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/InboxPaginator.html#next(boolean))
`GET`|[`/message/sent`](https://www.reddit.com/dev/api/oauth#GET_message_sent)|[`InboxPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/InboxPaginator.html#next(boolean))
`GET`|[`/message/unread`](https://www.reddit.com/dev/api/oauth#GET_message_unread)|[`InboxPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/InboxPaginator.html#next(boolean))
`GET`|[`/message/{where}`](https://www.reddit.com/dev/api/oauth#GET_message_%7Bwhere%7D)|[`InboxPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/InboxPaginator.html#next(boolean))
`GET`|[`/notification/all`](https://www.reddit.com/dev/api/oauth#GET_notification_all)|[`NotificationPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/NotificationPaginator.html#next(boolean))
`GET`|[`/notification/comments`](https://www.reddit.com/dev/api/oauth#GET_notification_comments)|[`NotificationPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/NotificationPaginator.html#next(boolean))
`GET`|[`/notification/mentions`](https://www.reddit.com/dev/api/oauth#GET_notification_mentions)|[`NotificationPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/NotificationPaginator.html#next(boolean))
`GET`|[`/notification/selfreply`](https://www.reddit.com/dev/api/oauth#GET_notification_selfreply)|[`NotificationPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/NotificationPaginator.html#next(boolean))
`GET`|[`/notification/unread`](https://www.reddit.com/dev/api/oauth#GET_notification_unread)|[`NotificationPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/NotificationPaginator.html#next(boolean))
`GET`|[`/notification/where`](https://www.reddit.com/dev/api/oauth#GET_notification_where)|[`NotificationPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/NotificationPaginator.html#next(boolean))

##read
Method|Endpoint|Implemention
:----:|--------|------------
`GET`|[`/api/filter/{filterpath}`](https://www.reddit.com/dev/api/oauth#GET_api_filter_%7Bfilterpath%7D)|None
`GET`|[`/api/filter/{filterpath}/r/{srname}`](https://www.reddit.com/dev/api/oauth#GET_api_filter_%7Bfilterpath%7D_r_%7Bsrname%7D)|None
`POST`|[`/api/quarantine_optin`](https://www.reddit.com/dev/api/oauth#POST_api_quarantine_optin)|None
`POST`|[`/api/quarantine_optout`](https://www.reddit.com/dev/api/oauth#POST_api_quarantine_optout)|None
`GET`|[`/api/v1/{subreddit}/emojis/all`](https://www.reddit.com/dev/api/oauth#GET_api_v1_%7Bsubreddit%7D_emojis_all)|None
`GET`|[`/gilded`](https://www.reddit.com/dev/api/oauth#GET_gilded)|None
`GET`|[`/related/{article}`](https://www.reddit.com/dev/api/oauth#GET_related_%7Barticle%7D)|None
`GET`|[`/rules`](https://www.reddit.com/dev/api/oauth#GET_rules)|None
`GET`|[`/sidebar`](https://www.reddit.com/dev/api/oauth#GET_sidebar)|None
`GET`|[`/sticky`](https://www.reddit.com/dev/api/oauth#GET_sticky)|None
`GET`|[`/about/banned`](https://www.reddit.com/dev/api/oauth#GET_about_banned)|[`UserRecordPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserRecordPaginator.html#next(boolean))
`GET`|[`/about/contributors`](https://www.reddit.com/dev/api/oauth#GET_about_contributors)|[`UserRecordPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserRecordPaginator.html#next(boolean))
`GET`|[`/about/edited`](https://www.reddit.com/dev/api/oauth#GET_about_edited)|[`ModeratorPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/ModeratorPaginator.html#next(boolean))
`GET`|[`/about/moderators`](https://www.reddit.com/dev/api/oauth#GET_about_moderators)|[`UserRecordPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserRecordPaginator.html#next(boolean))
`GET`|[`/about/modqueue`](https://www.reddit.com/dev/api/oauth#GET_about_modqueue)|[`ModeratorPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/ModeratorPaginator.html#next(boolean))
`GET`|[`/about/muted`](https://www.reddit.com/dev/api/oauth#GET_about_muted)|[`UserRecordPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserRecordPaginator.html#next(boolean))
`GET`|[`/about/reports`](https://www.reddit.com/dev/api/oauth#GET_about_reports)|[`ModeratorPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/ModeratorPaginator.html#next(boolean))
`GET`|[`/about/spam`](https://www.reddit.com/dev/api/oauth#GET_about_spam)|[`ModeratorPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/ModeratorPaginator.html#next(boolean))
`GET`|[`/about/unmoderated`](https://www.reddit.com/dev/api/oauth#GET_about_unmoderated)|[`ModeratorPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/ModeratorPaginator.html#next(boolean))
`GET`|[`/about/wikibanned`](https://www.reddit.com/dev/api/oauth#GET_about_wikibanned)|[`UserRecordPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserRecordPaginator.html#next(boolean))
`GET`|[`/about/wikicontributors`](https://www.reddit.com/dev/api/oauth#GET_about_wikicontributors)|[`UserRecordPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserRecordPaginator.html#next(boolean))
`GET`|[`/about/{location}`](https://www.reddit.com/dev/api/oauth#GET_about_%7Blocation%7D)|[`ModeratorPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/ModeratorPaginator.html#next(boolean))
`GET`|[`/about/{where}`](https://www.reddit.com/dev/api/oauth#GET_about_%7Bwhere%7D)|[`UserRecordPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserRecordPaginator.html#next(boolean))
`GET`|[`/api/info`](https://www.reddit.com/dev/api/oauth#GET_api_info)|[`RedditClient.get(String[])`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/RedditClient.html#get([Ljava.lang.String;))
`GET`|[`/api/morechildren`](https://www.reddit.com/dev/api/oauth#GET_api_morechildren)|[`CommentNode.getMoreComments(RedditClient, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/models/CommentNode.html#getMoreComments(net.dean.jraw.RedditClient, boolean))
`GET`|[`/api/multi/mine`](https://www.reddit.com/dev/api/oauth#GET_api_multi_mine)|[`MultiRedditManager.mine()`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/MultiRedditManager.html#mine())
`GET`|[`/api/multi/user/{username}`](https://www.reddit.com/dev/api/oauth#GET_api_multi_user_%7Busername%7D)|[`MultiRedditManager.getPublicMultis(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/MultiRedditManager.html#getPublicMultis(java.lang.String))
`GET`|[`/api/multi/{multipath}`](https://www.reddit.com/dev/api/oauth#GET_api_multi_%7Bmultipath%7D)|[`MultiRedditManager.get(String, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/MultiRedditManager.html#get(java.lang.String, java.lang.String))
`GET`|[`/api/multi/{multipath}/description`](https://www.reddit.com/dev/api/oauth#GET_api_multi_%7Bmultipath%7D_description)|[`MultiRedditManager.get(String, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/MultiRedditManager.html#get(java.lang.String, java.lang.String))
`PUT`|[`/api/multi/{multipath}/description`](https://www.reddit.com/dev/api/oauth#PUT_api_multi_%7Bmultipath%7D_description)|[`MultiRedditManager.updateDescription(String, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/MultiRedditManager.html#updateDescription(java.lang.String, java.lang.String))
`GET`|[`/api/multi/{multipath}/r/{srname}`](https://www.reddit.com/dev/api/oauth#GET_api_multi_%7Bmultipath%7D_r_%7Bsrname%7D)|[`MultiRedditManager.get(String, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/MultiRedditManager.html#get(java.lang.String, java.lang.String))
`GET`|[`/api/recommend/sr/{srnames}`](https://www.reddit.com/dev/api/oauth#GET_api_recommend_sr_%7Bsrnames%7D)|[`RedditClient.getRecommendations(List, List)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/RedditClient.html#getRecommendations(java.util.List, java.util.List))
`POST`|[`/api/search_reddit_names`](https://www.reddit.com/dev/api/oauth#POST_api_search_reddit_names)|[`RedditClient.searchSubreddits(String, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/RedditClient.html#searchSubreddits(java.lang.String, boolean))
`POST`|[`/api/search_subreddits`](https://www.reddit.com/dev/api/oauth#POST_api_search_subreddits)|[`RedditClient.searchSubredditsCustom(String, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/RedditClient.html#searchSubredditsCustom(java.lang.String, boolean))
`GET`|[`/api/subreddit_autocomplete`](https://www.reddit.com/dev/api/oauth#GET_api_subreddit_autocomplete)|[`RedditClient.subredditAutocomplete(String, boolean, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/RedditClient.html#subredditAutocomplete(java.lang.String, boolean, boolean))
`GET`|[`/api/subreddits_by_topic`](https://www.reddit.com/dev/api/oauth#GET_api_subreddits_by_topic)|[`RedditClient.getSubredditsByTopic(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/RedditClient.html#getSubredditsByTopic(java.lang.String))
`GET`|[`/api/v1/me/blocked`](https://www.reddit.com/dev/api/oauth#GET_api_v1_me_blocked)|[`ImportantUserPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/ImportantUserPaginator.html#next(boolean))
`GET`|[`/api/v1/me/friends`](https://www.reddit.com/dev/api/oauth#GET_api_v1_me_friends)|[`ImportantUserPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/ImportantUserPaginator.html#next(boolean))
`GET`|[`/api/v1/user/{username}/trophies`](https://www.reddit.com/dev/api/oauth#GET_api_v1_user_%7Busername%7D_trophies)|[`RedditClient.getTrophies(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/RedditClient.html#getTrophies(java.lang.String))
`GET`|[`/by_id/{names}`](https://www.reddit.com/dev/api/oauth#GET_by_id_%7Bnames%7D)|[`SpecificPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/SpecificPaginator.html#next(boolean))
`GET`|[`/comments/{article}`](https://www.reddit.com/dev/api/oauth#GET_comments_%7Barticle%7D)|[`RedditClient.getSubmission(SubmissionRequest)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/RedditClient.html#getSubmission(net.dean.jraw.http.SubmissionRequest))
`GET`|[`/controversial`](https://www.reddit.com/dev/api/oauth#GET_controversial)|[`SubredditPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/SubredditPaginator.html#next(boolean))
`GET`|[`/duplicates/{article}`](https://www.reddit.com/dev/api/oauth#GET_duplicates_%7Barticle%7D)|[`DuplicatesPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/DuplicatesPaginator.html#next(boolean))
`GET`|[`/hot`](https://www.reddit.com/dev/api/oauth#GET_hot)|[`SubredditPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/SubredditPaginator.html#next(boolean))
`GET`|[`/live/{thread}`](https://www.reddit.com/dev/api/oauth#GET_live_%7Bthread%7D)|[`LiveThreadPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/LiveThreadPaginator.html#next(boolean))
`GET`|[`/live/{thread}/about`](https://www.reddit.com/dev/api/oauth#GET_live_%7Bthread%7D_about)|[`LiveThreadManager.get(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/LiveThreadManager.html#get(java.lang.String))
`GET`|[`/live/{thread}/contributors`](https://www.reddit.com/dev/api/oauth#GET_live_%7Bthread%7D_contributors)|[`LiveThreadManager.getContributors(LiveThread)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/LiveThreadManager.html#getContributors(net.dean.jraw.models.LiveThread))
`GET`|[`/live/{thread}/discussions`](https://www.reddit.com/dev/api/oauth#GET_live_%7Bthread%7D_discussions)|[`LiveThreadManager.getDiscussions(LiveThread)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/LiveThreadManager.html#getDiscussions(net.dean.jraw.models.LiveThread))
`GET`|[`/new`](https://www.reddit.com/dev/api/oauth#GET_new)|[`SubredditPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/SubredditPaginator.html#next(boolean))
`GET`|[`/prefs/blocked`](https://www.reddit.com/dev/api/oauth#GET_prefs_blocked)|[`ImportantUserPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/ImportantUserPaginator.html#next(boolean))
`GET`|[`/prefs/friends`](https://www.reddit.com/dev/api/oauth#GET_prefs_friends)|[`ImportantUserPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/ImportantUserPaginator.html#next(boolean))
`GET`|[`/prefs/{where}`](https://www.reddit.com/dev/api/oauth#GET_prefs_%7Bwhere%7D)|[`ImportantUserPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/ImportantUserPaginator.html#next(boolean))
`GET`|[`/r/{subreddit}/about`](https://www.reddit.com/dev/api/oauth#GET_r_%7Bsubreddit%7D_about)|[`RedditClient.getSubreddit(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/RedditClient.html#getSubreddit(java.lang.String))
`GET`|[`/r/{subreddit}/about/rules`](https://www.reddit.com/dev/api/oauth#GET_r_%7Bsubreddit%7D_about_rules)|[`RedditClient.getRules(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/RedditClient.html#getRules(java.lang.String))
`GET`|[`/random`](https://www.reddit.com/dev/api/oauth#GET_random)|[`RedditClient.getRandomSubmission(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/RedditClient.html#getRandomSubmission(java.lang.String))
`GET`|[`/search`](https://www.reddit.com/dev/api/oauth#GET_search)|[`SubmissionSearchPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/SubmissionSearchPaginator.html#next(boolean))
`GET`|[`/subreddits/default`](https://www.reddit.com/dev/api/oauth#GET_subreddits_default)|[`SubredditStream.next()`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/SubredditStream.html#next())
`GET`|[`/subreddits/gold`](https://www.reddit.com/dev/api/oauth#GET_subreddits_gold)|[`SubredditStream.next()`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/SubredditStream.html#next())
`GET`|[`/subreddits/new`](https://www.reddit.com/dev/api/oauth#GET_subreddits_new)|[`SubredditStream.next()`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/SubredditStream.html#next())
`GET`|[`/subreddits/popular`](https://www.reddit.com/dev/api/oauth#GET_subreddits_popular)|[`SubredditStream.next()`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/SubredditStream.html#next())
`GET`|[`/subreddits/search`](https://www.reddit.com/dev/api/oauth#GET_subreddits_search)|[`SubredditSearchPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/SubredditSearchPaginator.html#next(boolean))
`GET`|[`/subreddits/{where}`](https://www.reddit.com/dev/api/oauth#GET_subreddits_%7Bwhere%7D)|[`SubredditStream.next()`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/SubredditStream.html#next())
`GET`|[`/top`](https://www.reddit.com/dev/api/oauth#GET_top)|[`SubredditPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/SubredditPaginator.html#next(boolean))
`GET`|[`/user/{username}/about`](https://www.reddit.com/dev/api/oauth#GET_user_%7Busername%7D_about)|[`RedditClient.getUser(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/RedditClient.html#getUser(java.lang.String))
`GET`|[`/users/new`](https://www.reddit.com/dev/api/oauth#GET_users_new)|[`UserStream.next()`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserStream.html#next())
`GET`|[`/users/popular`](https://www.reddit.com/dev/api/oauth#GET_users_popular)|[`UserStream.next()`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserStream.html#next())
`GET`|[`/users/{where}`](https://www.reddit.com/dev/api/oauth#GET_users_%7Bwhere%7D)|[`UserStream.next()`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/UserStream.html#next())
`GET`|[`/{sort}`](https://www.reddit.com/dev/api/oauth#GET_%7Bsort%7D)|[`SubredditPaginator.next(boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/paginators/SubredditPaginator.html#next(boolean))

##report
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/live/{thread}/report`](https://www.reddit.com/dev/api/oauth#POST_api_live_%7Bthread%7D_report)|None
`POST`|[`/api/report`](https://www.reddit.com/dev/api/oauth#POST_api_report)|None
`POST`|[`/api/hide`](https://www.reddit.com/dev/api/oauth#POST_api_hide)|[`AccountManager.hide(boolean, Submission, Submission[])`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#hide(boolean, net.dean.jraw.models.Submission, [Lnet.dean.jraw.models.Submission;))
`POST`|[`/api/unhide`](https://www.reddit.com/dev/api/oauth#POST_api_unhide)|[`AccountManager.hide(boolean, Submission, Submission[])`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#hide(boolean, net.dean.jraw.models.Submission, [Lnet.dean.jraw.models.Submission;))

##save
Method|Endpoint|Implemention
:----:|--------|------------
`GET`|[`/api/saved_categories`](https://www.reddit.com/dev/api/oauth#GET_api_saved_categories)|None
`POST`|[`/api/store_visits`](https://www.reddit.com/dev/api/oauth#POST_api_store_visits)|None
`POST`|[`/api/save`](https://www.reddit.com/dev/api/oauth#POST_api_save)|[`AccountManager.setSaved(PublicContribution, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#setSaved(net.dean.jraw.models.PublicContribution, boolean))
`POST`|[`/api/unsave`](https://www.reddit.com/dev/api/oauth#POST_api_unsave)|[`AccountManager.setSaved(PublicContribution, boolean)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#setSaved(net.dean.jraw.models.PublicContribution, boolean))

##submit
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/submit_gallery_post.json`](https://www.reddit.com/dev/api/oauth#POST_api_submit_gallery_post.json)|None
`GET`|[`/api/v1/{subreddit}/post_requirements`](https://www.reddit.com/dev/api/oauth#GET_api_v1_%7Bsubreddit%7D_post_requirements)|None
`POST`|[`/api/live/create`](https://www.reddit.com/dev/api/oauth#POST_api_live_create)|[`LiveThreadManager.create(String, boolean, String, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/LiveThreadManager.html#create(java.lang.String, boolean, java.lang.String, java.lang.String))
`POST`|[`/api/live/{thread}/update`](https://www.reddit.com/dev/api/oauth#POST_api_live_%7Bthread%7D_update)|[`LiveThreadManager.postUpdate(LiveThread, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/LiveThreadManager.html#postUpdate(net.dean.jraw.models.LiveThread, java.lang.String))
`POST`|[`/api/submit`](https://www.reddit.com/dev/api/oauth#POST_api_submit)|[`AccountManager.submitRaw(SubmissionBuilder, Captcha, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#submitRaw(net.dean.jraw.managers.AccountManager$SubmissionBuilder, net.dean.jraw.models.Captcha, java.lang.String))
`GET`|[`/api/submit_text`](https://www.reddit.com/dev/api/oauth#GET_api_submit_text)|[`RedditClient.getSubmitText(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/RedditClient.html#getSubmitText(java.lang.String))

##subscribe
Method|Endpoint|Implemention
:----:|--------|------------
`DELETE`|[`/api/filter/{filterpath}`](https://www.reddit.com/dev/api/oauth#DELETE_api_filter_%7Bfilterpath%7D)|None
`POST`|[`/api/filter/{filterpath}`](https://www.reddit.com/dev/api/oauth#POST_api_filter_%7Bfilterpath%7D)|None
`PUT`|[`/api/filter/{filterpath}`](https://www.reddit.com/dev/api/oauth#PUT_api_filter_%7Bfilterpath%7D)|None
`DELETE`|[`/api/filter/{filterpath}/r/{srname}`](https://www.reddit.com/dev/api/oauth#DELETE_api_filter_%7Bfilterpath%7D_r_%7Bsrname%7D)|None
`PUT`|[`/api/filter/{filterpath}/r/{srname}`](https://www.reddit.com/dev/api/oauth#PUT_api_filter_%7Bfilterpath%7D_r_%7Bsrname%7D)|None
`POST`|[`/api/multi/copy`](https://www.reddit.com/dev/api/oauth#POST_api_multi_copy)|[`MultiRedditManager.copy(String, String, String, String, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/MultiRedditManager.html#copy(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String))
`POST`|[`/api/multi/rename`](https://www.reddit.com/dev/api/oauth#POST_api_multi_rename)|[`MultiRedditManager.rename(String, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/MultiRedditManager.html#rename(java.lang.String, java.lang.String))
`DELETE`|[`/api/multi/{multipath}`](https://www.reddit.com/dev/api/oauth#DELETE_api_multi_%7Bmultipath%7D)|[`MultiRedditManager.delete(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/MultiRedditManager.html#delete(java.lang.String))
`POST`|[`/api/multi/{multipath}`](https://www.reddit.com/dev/api/oauth#POST_api_multi_%7Bmultipath%7D)|[`MultiRedditManager.createOrUpdate(MultiRedditUpdateRequest)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/MultiRedditManager.html#createOrUpdate(net.dean.jraw.http.MultiRedditUpdateRequest))
`PUT`|[`/api/multi/{multipath}`](https://www.reddit.com/dev/api/oauth#PUT_api_multi_%7Bmultipath%7D)|[`MultiRedditManager.createOrUpdate(MultiRedditUpdateRequest)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/MultiRedditManager.html#createOrUpdate(net.dean.jraw.http.MultiRedditUpdateRequest))
`DELETE`|[`/api/multi/{multipath}/r/{srname}`](https://www.reddit.com/dev/api/oauth#DELETE_api_multi_%7Bmultipath%7D_r_%7Bsrname%7D)|[`MultiRedditManager.removeSubreddit(String, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/MultiRedditManager.html#removeSubreddit(java.lang.String, java.lang.String))
`PUT`|[`/api/multi/{multipath}/r/{srname}`](https://www.reddit.com/dev/api/oauth#PUT_api_multi_%7Bmultipath%7D_r_%7Bsrname%7D)|[`MultiRedditManager.addSubreddit(String, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/MultiRedditManager.html#addSubreddit(java.lang.String, java.lang.String))
`POST`|[`/api/subscribe`](https://www.reddit.com/dev/api/oauth#POST_api_subscribe)|[`AccountManager.subscribe(Subreddit)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#subscribe(net.dean.jraw.models.Subreddit))
`DELETE`|[`/api/v1/me/friends/{username}`](https://www.reddit.com/dev/api/oauth#DELETE_api_v1_me_friends_%7Busername%7D)|[`AccountManager.deleteFriend(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#deleteFriend(java.lang.String))
`PUT`|[`/api/v1/me/friends/{username}`](https://www.reddit.com/dev/api/oauth#PUT_api_v1_me_friends_%7Busername%7D)|[`AccountManager.banUser(String, String, String, String, String, int)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#banUser(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int))

##vote
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/vote`](https://www.reddit.com/dev/api/oauth#POST_api_vote)|[`AccountManager.vote(Thing, VoteDirection)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/AccountManager.html#vote(net.dean.jraw.models.Thing, net.dean.jraw.models.VoteDirection))

##wikiedit
Method|Endpoint|Implemention
:----:|--------|------------
`POST`|[`/api/wiki/edit`](https://www.reddit.com/dev/api/oauth#POST_api_wiki_edit)|None

##wikiread
Method|Endpoint|Implemention
:----:|--------|------------
`GET`|[`/wiki/discussions/{page}`](https://www.reddit.com/dev/api/oauth#GET_wiki_discussions_%7Bpage%7D)|None
`GET`|[`/wiki/revisions`](https://www.reddit.com/dev/api/oauth#GET_wiki_revisions)|None
`GET`|[`/wiki/revisions/{page}`](https://www.reddit.com/dev/api/oauth#GET_wiki_revisions_%7Bpage%7D)|None
`GET`|[`/wiki/pages`](https://www.reddit.com/dev/api/oauth#GET_wiki_pages)|[`WikiManager.getPages(String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/WikiManager.html#getPages(java.lang.String))
`GET`|[`/wiki/{page}`](https://www.reddit.com/dev/api/oauth#GET_wiki_%7Bpage%7D)|[`WikiManager.get(String, String)`](https://thatjavanerd.github.io/JRAW/docs/git/net/dean/jraw/managers/WikiManager.html#get(java.lang.String, java.lang.String))
