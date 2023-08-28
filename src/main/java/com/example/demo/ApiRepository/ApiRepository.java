package com.example.demo.ApiRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ApiModel.ApiModel;

public interface ApiRepository extends JpaRepository<ApiModel, Integer>{

}
