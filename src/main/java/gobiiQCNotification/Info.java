package gobiiQCNotification;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Info {
	
	@RequestMapping(value="/",  method = RequestMethod.GET)
	@ResponseBody
	public String qcNotificationRoot() {
		return "Usage:  POST:/brapi/v1/instructions/qualitycontrol?notification=[NOTIFICATION PAYLOAD AS JSON]";
	}
	
	@RequestMapping(value="/brapi/v1/instructions/qualitycontrol",  method = RequestMethod.GET)
	@ResponseBody
	public String qcNotification() {
		return "Usage:  POST:/brapi/v1/instructions/qualitycontrol?notification=[NOTIFICATION PAYLOAD AS JSON]";
	}
}
