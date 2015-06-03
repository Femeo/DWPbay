package dwpbay;

import java.util.*;

public class DirectoryBean {

	private HashMap<Integer, ItemsBean> items = new HashMap<Integer, ItemsBean>();
	private static Integer index ; 
	
	public void setItems(int index, ItemsBean item){
	    Integer i = new Integer(index);
		items.put(i,item);
	}
	
	public void next() {
		index++;
	}
	
	public void reset() {
		index=0;
	}
	
	public ItemsBean getItems(){
		return items.get(index);
	}
	
	
	public int getSize() {
		return items.size();
	}
	
	public boolean beforeEndOfMap(){
		return index < items.size();
	
}
}
