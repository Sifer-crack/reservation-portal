package com.samandreev.restaurant.reservation_portal_backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;


@Data
@Entity
@Builder
@Table(name = "users")

@NoArgsConstructor
@AllArgsConstructor
public class UserEntity implements UserDetails{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", nullable = false)
	private Long userId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	/*
	@Column(name = "reservation_id")
	private LocalDateTime reservationId;
	*/
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
