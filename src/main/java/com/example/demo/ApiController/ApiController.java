package com.example.demo.ApiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.ApiModel.ApiModel;
import com.example.demo.ApiService.userService;




@RestController
public class ApiController {
	@Autowired
       userService c;
       
	
	@PostMapping("addall")
	public List<ApiModel> addALL(@RequestBody List<ApiModel> cd){
		return c.add(cd);
	}
	@GetMapping("show")
	public List<ApiModel> show(){
		return c.show();
	}
	@PutMapping("modify")
	public ApiModel update(ApiModel cd) {
		return c.update(cd);
	}
	@DeleteMapping("del/{id}")
	public String ddel(@PathVariable int id) {
		c.deleteid(id);
		return "Deleted";
	}
	@GetMapping("show/{name}")
	public List<ApiModel> sort(@PathVariable String  name){
		return c.sortinfo(name);
	}
	@GetMapping("show/{pagno}/{pagesize}")
	public List<ApiModel> getpage(@PathVariable int pagno,@PathVariable int pagesize){
		return c.getbypage(pagno, pagesize);
	}
	@GetMapping("show/{pageno}/{pagesize}/{name}")
	public List<ApiModel> getpagesort(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String name){
		return c.getbypagesort(pageno, pagesize,name);
	}


}
