package Homework12;

public enum Currency implements CurrencyForm {
    RUBLE("рубль", "рубля", "рублей", "копейка", "копейки", "копеек");
    //Тут можно добавить иные валюты
    private final String oneMain;
    private final String fewMain;
    private final String manyMain;
    private final String oneFractional;
    private final String fewFractional;
    private final String manyFractional;

    Currency(String oneMain, String fewMain, String manyMain, String oneFractional, String fewFractional, String manyFractional) {
        this.oneMain = oneMain;
        this.fewMain = fewMain;
        this.manyMain = manyMain;
        this.oneFractional = oneFractional;
        this.fewFractional = fewFractional;
        this.manyFractional = manyFractional;
    }

    @Override
    public String getMainForm(int n) {
        return getForm(n, oneMain, fewMain, manyMain);
    }

    @Override
    public String getFractionalForm(int n) {
        return getForm(n, oneFractional, fewFractional, manyFractional);
    }

    private String getForm(int n, String oneForm, String fewForm, String manyForm) {
        if (n % 10 == 1 && n % 100 != 11) {
            return oneForm;
        } else if (2 <= n % 10 && n % 10 <= 4 && (n % 100 < 10 || n % 100 >= 20)) {
            return fewForm;
        } else {
            return manyForm;
        }
    }
}
