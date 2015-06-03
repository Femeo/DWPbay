package dwpbay;

import java.time.LocalDateTime;

public class Item {
	
	private int itemID ;
	private String title ;
	private String category ;
	private String description ;
	private String picture ;
	private Double price ;
	private boolean onSale ;
	private Double reservePrice ;
	private LocalDateTime startDateTime ;
	
	public Item(int itemID, String title, String category, String description, String picture, Double price, boolean onSale, Double reservePrice, LocalDateTime startDateTime) {
		this.itemID = itemID ;
		this.title = title ;
		this.category = category ;
		this.description = description ;
		this.picture = picture ;
		this.price = price ;
		this.onSale = onSale ;
		this.reservePrice = reservePrice ;
		this.startDateTime = startDateTime ;
	}

}
