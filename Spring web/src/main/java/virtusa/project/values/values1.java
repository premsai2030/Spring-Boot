package virtusa.project.values;
import java.util.*;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;




@RestController
public class values1 {
String intString ;

public String getIntString() {
	return intString;
}

public void setIntString(String intString) {
	this.intString = intString;
}

public String ok(String pass) {
return pass+" using get method";	
	
}
public String lol(String kk) {
		return kk+" using post method";
	}
}
