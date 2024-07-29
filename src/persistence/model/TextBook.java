package persistence.model;

import java.util.Date;

public class TextBook extends Book {

    private String condition; // Condition: "Sách cũ" or "Sách mới"

    public TextBook() {
        super();
    }

    public TextBook(int id, double price, int quantity, String publisher, Date createAt, String condition) {
        super(id, price, quantity, publisher, createAt);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public double totalPrice() {
        double total;
        if ("Sách cũ".equals(condition)) {
            total = getPrice() * getQuantity() * 0.5;
        } else {
            total = getPrice() * getQuantity();
        }
        return total;
    }
}
