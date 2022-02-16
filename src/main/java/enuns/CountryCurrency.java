package enuns;


public enum CountryCurrency {
    LT("Lithuania", "EUR"),
    UK("United Kingdom", "GBP");

    private final String name;
    private final String currency;

    CountryCurrency(String name, String currency) {
        this.name = name;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }

}
