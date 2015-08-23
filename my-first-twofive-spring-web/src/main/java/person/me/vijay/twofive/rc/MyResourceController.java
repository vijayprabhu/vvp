package person.me.vijay.twofive.rc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("myresources")
public class MyResourceController {
	
	@RequestMapping("/get")
	public String getResource() {
		return "Hello Resource";
	}
	
}
