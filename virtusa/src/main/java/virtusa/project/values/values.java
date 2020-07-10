package virtusa.project.values;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class values {
@Autowired
values1 val;
	@RequestMapping("/helo")
public String display() {
val.setIntString("hii prem sai vittal");
	return val.getIntString();
	}
	@RequestMapping("/helo/{y}")
	public String ok(@PathVariable String y) {
			return val.ok(y);
	
	}
	@RequestMapping(method = RequestMethod.POST,value = "/helo/{add}")
	public String add(@PathVariable String add) {
		return val.lol(add);
	}
}
