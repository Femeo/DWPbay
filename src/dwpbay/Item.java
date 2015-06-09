package dwpbay;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Item {
	
	private int itemID ;
	private String title ;
	private String category ;
	private String description ;
	private String picture ;
	private double price ;
	private boolean onSale ;
	private double reservePrice ;
	private LocalDate startDate ;
	private LocalTime startTime ;
	
	public Item(int itemID, String title, String category, String description, String picture, double price, boolean onSale, double reservePrice, LocalDate startDate, LocalTime startTime) {
		this.itemID = itemID ;
		this.title = title ;
		this.category = category ;
		this.description = description ;
		this.picture = picture ;
		this.price = price ;
		this.onSale = onSale ;
		this.reservePrice = reservePrice ;
		this.startDate = startDate ;
		this.startTime = startTime ;
	}

}
