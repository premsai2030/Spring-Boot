package looking.jpa.fields;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
@Autowired
	fetching fetch;
	
	@RequestMapping("/home")
	public List<data_base_fields> display() {
		return fetch.gettall();
	}
	@RequestMapping(method =RequestMethod.POST,value = "/home")
	public void put(@RequestBody data_base_fields add) {
		 fetch.put(add);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/home/{id}")
	public void del(data_base_fields id) {
		fetch.find(id); 
		
	}
}
