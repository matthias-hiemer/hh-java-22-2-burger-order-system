package model;

public class Menu {

    private int number;
    private float price;
    private String name;
    private String mainDish;
    private String sideDish;
    private String beverage;

    public Menu(int number, float price, String name, String mainDish, String sideDish, String beverage) {
        this.number = number;
        this.price = price;
        this.name = name;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.beverage = beverage;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Menu menu = (Menu) o;

        if (getNumber() != menu.getNumber()) return false;
        if (Float.compare(menu.getPrice(), getPrice()) != 0) return false;
        if (getName() != null ? !getName().equals(menu.getName()) : menu.getName() != null) return false;
        if (getMainDish() != null ? !getMainDish().equals(menu.getMainDish()) : menu.getMainDish() != null)
            return false;
        if (getSideDish() != null ? !getSideDish().equals(menu.getSideDish()) : menu.getSideDish() != null)
            return false;
        return getBeverage() != null ? getBeverage().equals(menu.getBeverage()) : menu.getBeverage() == null;
    }

    @Override
    public int hashCode() {
        int result = getNumber();
        result = 31 * result + (getPrice() != +0.0f ? Float.floatToIntBits(getPrice()) : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getMainDish() != null ? getMainDish().hashCode() : 0);
        result = 31 * result + (getSideDish() != null ? getSideDish().hashCode() : 0);
        result = 31 * result + (getBeverage() != null ? getBeverage().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "number=" + number +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", mainDisch='" + mainDish + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", beverage='" + beverage + '\'' +
                '}';
    }
}
