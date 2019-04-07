package main;
public class Item{
    public String itemName;
    public int mrp;
    public  void addItem(String itemName,int mrpItem){
        //write your code here
       this.itemName=itemName;
       this.mrp=mrpItem;
    }
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
    

public static void main(String args[])
{
	Item it=new Item();
	it.setItemName(" My experiment with truth");
	it.setMrp(40);
	System.out.println(it.getItemName());
	System.out.println(it.getMrp());
   
}
}

