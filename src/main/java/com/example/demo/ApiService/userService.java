package com.example.demo.ApiService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.ApiModel.ApiModel;
import com.example.demo.ApiRepository.ApiRepository;

@Service
public class userService {
	

	
	
	@Autowired
	ApiRepository cre;
	 public List<ApiModel> add(List<ApiModel> c){
		 return (List<ApiModel>) cre.saveAll(c);
	 }
	 public List<ApiModel> show(){
		 return cre.findAll();
	 }
	 public ApiModel update(ApiModel c) {
		 return cre.saveAndFlush(c);
	 }
	 public void deleteid(int id) {
		   cre.deleteById(id);
	 }
	 public List<ApiModel> sortinfo(String s){
		 return cre.findAll(Sort.by(Sort.Direction.ASC, s));
	 }
	 public List<ApiModel> getbypage(int pagno,int pagsize){
		 Page<ApiModel> c=cre.findAll(PageRequest.of(pagno, pagsize));
		 return c.getContent();
	 }
	 public List<ApiModel> getbypagesort(int pagno,int pagsize,String s){
		 Page<ApiModel> c=cre.findAll(PageRequest.of(pagno,pagsize,Sort.by(Sort.Direction.DESC, s)));
		 return c.getContent();
	 }
	}

