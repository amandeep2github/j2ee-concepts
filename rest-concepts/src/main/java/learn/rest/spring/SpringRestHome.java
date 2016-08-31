package learn.rest.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SpringRestHome {
	@ResponseBody
	@RequestMapping(value="/spring-rest")
	public String home(){
		return "Welcome! this is Spring Rest.";
	}
}
