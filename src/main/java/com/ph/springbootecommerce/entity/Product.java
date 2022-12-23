// Similar to HCL MODEL
package com.ph.springbootecommerce.entity;

// imports
import lombok.Data; // <3
import javax.persistence.*; // create table entities

@Entity
@Table(name="product")
@Data // lombok creates getters and setters
public class Product {
	
	//************ values ************
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id; //id
	
	@Column(name = "name")
	private String name; 
	
	@Column(name = "price")
	private double price; 
	
	@Column(name = "description")
	private String description; 

	@Column(name = "count")
	private int count; 
	
	@Column(name = "count_available") 
	private int countAvailable; 
	
	@Column(name = "category")
	private String category; 
	
	@Column(name = "img")
	private String img; 
	

}
