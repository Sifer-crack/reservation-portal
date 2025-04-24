package com.semionandreev.restaurant.reservationbackend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@Builder
@Entity
@Table(name = "users")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int user_id;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
	@Column(name = "email", unique = true)
	private String email;
	
	@Column(name = "phone", unique = true)
	private String phone;
	
	@Column(name = "password")
	private String password;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities(){
		return List.of();
	}
	
	@Override
	public String getPassword(){
		return password;
	}
	
	@Override
	public String getUsername(){
		return email;
	}
	
	@Override
	public boolean isAccountNonExpired(){
		return UserDetails.super.isAccountNonExpired();
	}
	
	@Override
	public boolean isAccountNonLocked(){
		return UserDetails.super.isAccountNonLocked();
	}
	
	@Override
	public boolean isCredentialsNonExpired(){
		return UserDetails.super.isCredentialsNonExpired();
	}
	
	@Override
	public boolean isEnabled(){
		return UserDetails.super.isEnabled();
	}
}
