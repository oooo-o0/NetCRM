package com.example.app.domain;

import java.time.LocalDateTime;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
public class Member {
	private Integer id;
	@NotBlank
	@Size(max=10)
	private String name;
	@Range(min=0, max=120)
	private Integer age;
	@Size(max=255)
	private String address;
	private LocalDateTime created;
	private MemberType type;
}
