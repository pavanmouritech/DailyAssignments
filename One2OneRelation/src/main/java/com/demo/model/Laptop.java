package com.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop implements Serializable{
 
    /**
     * 
     */
    private static final long serialVersionUID = 7045864360843711487L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lid;
    private String model, brand, cpu;
    
	public Long getLid() {
		return lid;
	}
	public void setLid(Long lid) {
		this.lid = lid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, cpu, lid, model);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(cpu, other.cpu) && Objects.equals(lid, other.lid)
				&& Objects.equals(model, other.model);
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", model=" + model + ", brand=" + brand + ", cpu=" + cpu + "]";
	}
    
}
