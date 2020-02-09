package net.dean.jraw.models;

import com.fasterxml.jackson.databind.JsonNode;

import net.dean.jraw.models.meta.JsonProperty;

public class Award extends JsonModel {

    public Award(JsonNode dataNode) {
        super(dataNode);
    }

    @JsonProperty
    public String getId() {
        return data("id");
    }

    /** Gets the name */
    @JsonProperty
    public String getName() {
        return data("name");
    }

    /** Gets the description */
    @JsonProperty
    public String getDescription() {
        return data("description");
    }

    /** Gets enabled state */
    @JsonProperty
    public Boolean isEnabled() {
        return data("enabled", Boolean.class);
    }

    /** Gets the price */
    @JsonProperty
    public Integer getCoinPrice() {
        return data("coin_price", Integer.class);
    }

    /** Gets the subreddit coin reward */
    @JsonProperty
    public Integer getSubredditCoinReward() {
        return data("subreddit_coin_reward", Integer.class);
    }

    /** Gets the coin reward */
    @JsonProperty
    public Integer getCoinReward() {
        return data("coin_reward", Integer.class);
    }

    /** Gets the award sub type */
    @JsonProperty
    public String getAwardSubType() {
        return data("award_sub_type");
    }

    /** Gets the award type */
    @JsonProperty
    public String getAwardType() {
        return data("award_type");
    }

    /** Gets the days of premium */
    @JsonProperty
    public Integer getDaysOfPremium() {
        return data("days_of_premium", Integer.class);
    }

    /** Gets the icon in full resolution */
    @JsonProperty
    public String getIconUrl() {
        return data("icon_url");
    }

    /** Gets the icon as object */
    public Icon getIcon() {
        return new Icon(data.get("icon_url").asText(), data.get("icon_width").asInt(), data.get("icon_height").asInt());
    }

    /** Gets the count */
    @JsonProperty
    public int getCount() {
        return data("count", Integer.class);
    }

    /** Gets an array of all resized icons. These Icons will be of lower resolution. */
    @JsonProperty
    public Icon[] getIcons() {
        JsonNode node = data.get("resized_icons");
        Icon[] arr = new Icon[node.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getIcon(node.get(i));
        }

        return arr;
    }

    public String getResizedIcon(int maxWidth) {
        return getResizedIcon(getIcons(), maxWidth);
    }

    private String getResizedIcon(Icon[] icons, int maxWidth) {
        String iconUrl = "";
        for (Icon icon: icons) {
            if (icon != null) {
                if (icon.getWidth() > maxWidth) {
                    break;
                } else {
                    iconUrl = icon.getUrl();
                }
            }
        }
        return iconUrl;
    }

    private Icon getIcon(JsonNode node) {
        return new Icon(node.get("url").asText(), node.get("width").asInt(), node.get("height").asInt());
    }

    /** An immutable class that represents an icon image. */
    public static final class Icon {
        private final String url;
        private final int width;
        private final int height;

        public Icon(String url, int width, int height) {
            this.url = url;
            this.width = width;
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Icon icon = (Icon) o;

            if (width != icon.width) return false;
            if (height != icon.height) return false;
            return url != null ? url.equals(icon.url) : icon.url == null;

        }

        @Override
        public int hashCode() {
            int result = url != null ? url.hashCode() : 0;
            result = 31 * result + width;
            result = 31 * result + height;
            return result;
        }

        @Override
        public String toString() {
            return "Icon {" +
                    "url='" + url + '\'' +
                    ", width=" + width +
                    ", height=" + height +
                    '}';
        }
    }
}
