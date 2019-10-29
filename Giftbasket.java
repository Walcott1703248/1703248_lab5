
public class Giftbasket {
private int id;
private String type;
private float cost;

public Giftbasket() {
	this.id=0;
	this.type="";
	this.cost=0;
}
public Giftbasket(int id ,String type, float cost) {
	id=id;
	type=type;
	cost=cost;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public float getCost() {
	return cost;
}
public void setCost(float cost) {
	this.cost = cost;
}



}
