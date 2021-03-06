package com.infy.UserMS.dto;

import com.infy.UserMS.entity.CartEntity;

public class CartDTO {
	private int buyerId;
	private int prodId;
	private int quantity;
	
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//Converts Entity to DTO
	public static CartDTO valueOf(CartEntity cart) {
		CartDTO cartDTO = new CartDTO();
		cartDTO.setBuyerId(cart.getBuyerId());
		cartDTO.setProdId(cart.getProdId());
		cartDTO.setQuantity(cart.getQuantity());
		return cartDTO;
	}
	// Converts DTO into Entity
	public CartEntity createEntity() {
		CartEntity cart = new CartEntity();
		cart.setBuyerId(this.getBuyerId());
		cart.setProdId(this.getProdId());
		cart.setQuantity(this.getQuantity());
		return cart;
	}
	
	

}
