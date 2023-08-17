
class Room {
	private int roomnumber;
	private int capacity;
	private double pricepernight;
	public boolean reserved = true;
	public int getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getPricepernight() {
		return pricepernight;
	}
	public void setPricepernight(double pricepernight) {
		this.pricepernight = pricepernight;
	}
	
	public boolean availability() {
		return reserved;
	}
	public void reservation() {
		if(reserved) {
			System.out.println("Room Reserved Successfully....!!!!");
		}
		else {
			System.out.println("Already reserved");
		}
	}
	public void reservation(String checkin,String checkout) {
		if(reserved) {
			System.out.print(checkin + " Reserved Successfully " + checkout);
		}
		else {
			System.out.println("Already Reserved");
		}
	}
 	@Override
	public String toString() {
		return "Room No : " + roomnumber + "\nCapacity pre Room : " +capacity+ "\nPrice for the Room :" + pricepernight;
	}
	public static void main(String[] args) {
		Room r = new Room();
		r.setCapacity(2);
		r.setPricepernight(10000);
		r.setRoomnumber(99);
		if(r.availability()) {
			r.reservation();
			r.reservation("16/08/2023","17/09/2023");
		}
		System.out.println();
		System.out.println(r.toString());
		r.toString();
		
	}
	

}
