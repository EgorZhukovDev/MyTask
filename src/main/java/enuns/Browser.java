package enuns;

public enum Browser {

    CHROME("chrome"),
    FIREFOX("firefox");

    private String browserType;

    Browser(String browserType) {
        this.browserType = browserType;
    }

    public String getValue() {
        return browserType;
    }

}
