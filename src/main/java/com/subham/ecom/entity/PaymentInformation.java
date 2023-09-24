package com.subham.ecom.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;

public class PaymentInformation {
	
	@Column(name = "cardholder_name")
	private String cardholder_name;
	
	@Column(name = "card_number")
	private String card_number;
	
	@Column(name = "expiration_date")
	private LocalDate expiration_date;
	
	@Column(name = "cvv")
	private String cvv;
}
