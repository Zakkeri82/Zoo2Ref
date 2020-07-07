package Food;

public enum Food {
    MEAT(1, (int) (Math.random() * 2000), "Мясо"),
    FISH(1, (int) (Math.random() * 600), "Рыба"),
    BONE(1, (int) (Math.random() * 400), "Косточка"),
    APPLE(2, (int) (Math.random() * 100), "Яблоко"),
    CABBAGE(2, (int) (Math.random() * 1000), "Капуста"),
    CARROT(2, (int) (Math.random() * 150), "Морковка");

    private int weight;
    private String translate;
    private int herbOrNo;

    Food(int herbOrNo, int weight, String translate) {
        this.herbOrNo = herbOrNo;
        this.weight = weight;
        this.translate = translate;
    }

    public int getHerbOrNo() {
        return herbOrNo;
    }

    public String getTranslate() {
        return translate;
    }

    public int getWeight() {
        return weight;
    }


}
