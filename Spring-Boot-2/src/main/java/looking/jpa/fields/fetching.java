package looking.jpa.fields;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import looking.jpa.db.database;

@RestController
public class fetching {
@Autowired
	database db;
	public List<data_base_fields> gettall() {
	
		List<data_base_fields> kk=new ArrayList<>();
		db.findAll().forEach(kk::add);
		return kk;
		
	}
	public void put(data_base_fields add) {
		db.save(add);
	}
	public void find(data_base_fields id) {
		  db.delete(id);
	}
	
	}

