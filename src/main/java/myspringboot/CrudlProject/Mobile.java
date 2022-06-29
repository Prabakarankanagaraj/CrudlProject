package myspringboot.CrudlProject;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id @GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="mobile_id")
	private int mobId;
	@Column(name="mobile_brand")
	private String brand;
	@Column(name="mobile_model")
	private String model;
	@Column(name="mobile_cost")
	private int cost;
	@Column(name="mobile_megaArms")
	private int megaArms; 
	
	
	@Override
	public String toString() {
		return "Mobile [mobId=" + mobId + ", brand=" + brand + ", model=" + model + ", cost=" + cost + ", megaArms="
				+ megaArms + ", getmobId()=" + getMobId() + ", getbrand()=" + getBrand() + ", getmodel()=" + getModel()
				+ ", getCost()=" + getCost() + ", getmegaArms()=" + getMegaArms() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Mobile(int mobId, String brand, String model, int cost, int megaArms) {
		super();
		this.mobId = mobId;
		this.brand = brand;
		this.model = model;
		this.cost = cost;
		this.megaArms = megaArms;
	}
	public int getMobId() {
		return mobId;
	}
	public void setMobId(int mobId) {
		this.mobId = mobId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getMegaArms() {
		return megaArms;
	}
	public void setMegaArms(int megaArms) {
		this.megaArms = megaArms;
	}
	
	

}
