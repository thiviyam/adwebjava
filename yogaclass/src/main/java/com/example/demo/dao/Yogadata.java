package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Customdetails;

public interface Yogadata extends JpaRepository<Customdetails, Integer>
{

}
