package com.store;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class MallService 
{
	@Autowired
private MallRepository repo;

public List<MallEntity> listAll() {
return repo.findAll();
	}

public MallEntity get(Integer id) {
return repo.findById(id).get();
}
public void save(MallEntity mall) { 
repo.save(mall);	
}

public void delete(Integer id) {
repo.deleteById();
}

}

