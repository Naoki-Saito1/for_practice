package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SiteUser {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Size(min=2,max=20)
    private String username;
	
	@Size(min=4,max=255)
    private String password;
	
	@NotBlank
	private String Email;
	
	private int gender;
	
	private boolean admin;
	
	private String role;
	
	private boolean active = true;

}