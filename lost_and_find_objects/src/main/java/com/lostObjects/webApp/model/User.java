package com.lostObjects.webApp.model;

import java.time.LocalDate;
import java.util.UUID;

import javax.swing.Spring;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table("user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@PrimaryKey
	UUID id;
	Spring first_name;
	String last_name;
	LocalDate bith_date;
	String Email;
}
