package com.devsuperior.dsvendas.dto;

import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Sale;

public class SaleDTO {

	private Long id;
	private Integer visited;
	private Integer deals;
	private double amount;
	private LocalDate date;

	private SellerDTO seller;

	public SaleDTO() {
		super();
	}

	public SaleDTO(Long id, Integer visited, Integer deals, double amount, LocalDate date, SellerDTO seller) {
		super();
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}

	// Com o sale da entidade
	public SaleDTO(Sale entity) {
		super();
		this.id = entity.getId();
		this.visited = entity.getVisited();
		this.deals = entity.getDeals();
		this.amount = entity.getAmount();
		this.date = entity.getDate();
		this.seller = new SellerDTO(entity.getSeller());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDTO getSeller() {
		return seller;
	}

	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}

	@Override
	public String toString() {
		return "SaleDTO [id=" + id + ", visited=" + visited + ", deals=" + deals + ", amount=" + amount + ", date="
				+ date + ", seller=" + seller + "]";
	}

}
