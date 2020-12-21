public class FictionBook extends Book implements Discount{
    public String category;
    public double promotionalPrice;

    public FictionBook() {
    }

    public FictionBook(String category, double promotionalPrice) {
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    public FictionBook(double bookCode, String name, double price, String author, String category, double promotionalPrice) {
        super(bookCode, name, price, author);
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPromotionalPrice() {
        return promotionalPrice;
    }

    public void setPromotionalPrice(double promotionalPrice) {
        this.promotionalPrice = promotionalPrice;
    }


    @Override
    public double setDiscount(int percent) {
        return promotionalPrice = getPrice() *(100-percent)/100;
    }
}
