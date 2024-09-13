package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

	public Object getName() {
		
		return null;
	}

	public Object getPrice() {
		
		return null;
	}

	public void setName(Object name2) {
		
		
	}

	public void setPrice(Object price2) {
		
	}
}
