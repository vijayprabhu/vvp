package person.me.vijay.twofive.rc;

import java.net.Inet4Address;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import person.me.vijay.twofive.model.Resource;

@RestController
@RequestMapping("keepalive")
public class MyResourceController {
	
	@RequestMapping("/status")
	public String getStatus() {
		return "I'm up and Running";
	}
	
	
	@RequestMapping("/config")
	
	public Resource getConfig() {
		
		Resource resource = new Resource();
		try {
			resource.setHostname(Inet4Address.getLocalHost().getHostName());
			resource.setIp(Inet4Address.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resource;
	}
}
