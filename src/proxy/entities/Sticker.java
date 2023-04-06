package proxy.entities;

public class Sticker {

    private Long id;

    private String name;

    private double price;

    public Sticker() {
	// TODO Auto-generated constructor stub
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public double getPrice() {
	return price;
    }

    public void setPrice(double price) {
	this.price = price;
    }

    @Override
    public String toString() {
	return String.format("{id=%s, name=%s, price=%s}",
		id, name, price);
    }

}
