package com.store;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

public class MallController {
	@Autowired
	 private MallService service;
	 
	 // RESTful API methods for Retrieval operations
	 @GetMapping("/mall")
	 public List<MallEntity> list() 
	 {
	 return service.listAll();
	 }
	 
	 @GetMapping("/mall/{id}")
	 public ResponseEntity<MallEntity> get(@PathVariable Integer id) 
	 {
	 try
	 {
	 MallEntity mall = service.get(id);
	 return new ResponseEntity<MallEntity>(mall, HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<MallEntity>(HttpStatus.NOT_FOUND);
	 }
}
	// RESTful API method for Create operation
	 @PostMapping("/mall")
	 public void add(@RequestBody MallEntity mall) 
	 {
	 service.save(mall);
	 }
	 
	 // RESTful API method for Update operation
	 @PutMapping("/mall/{id}")
	 public ResponseEntity<?> update(@RequestBody MallEntity mall, @PathVariable Integer id) 
	 {
	 try
	 {
	 MallEntity existMall = service.get(id);
	 service.save(mall);
	 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Delete operation
	 @DeleteMapping("/mall/{id}")
	 public void delete(@PathVariable Integer id) 
	 {
	 service.delete(id);
	 }
	}
