package singleton;

public class StreamingConfig {

    private static StreamingConfig instance;
    private String defaultQuality;
    private String region;

    private StreamingConfig() {
        this.defaultQuality = "1080p";
        this.region = "Indonesia";
    }

    public static StreamingConfig getInstance() {
        if (instance == null) {
            instance = new StreamingConfig();
        }
        return instance;
    }

    public String getDefaultQuality() {
        return defaultQuality;
    }

    public void setDefaultQuality(String defaultQuality) {
        this.defaultQuality = defaultQuality;
    }

    public String getRegion() {
        return region;
    }
}
