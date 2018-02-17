package com.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
@Entity
public class Product {

	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private String pdescription;
	private Float price;
	private String imgname;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="cid")
	private Category category;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="sid")
	private Supplier supplier;
	
	@Transient
	MultipartFile pimage;




	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}



	public String getPdescription() {
		return pdescription;
	}

	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getImgname() {
		return imgname;
	}

	public void setImgname(String imgname) {
		this.imgname = imgname;
	}
	
	
	
	
}

