package gobiiQCNotification;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diversityarrays.kdcompute.api.ExceptionMsg;
import com.diversityarrays.kdcompute.gobiiqc.containers.Notification;
import com.google.gson.Gson;

@SpringBootApplication
@RestController
@EnableAutoConfiguration(exclude = {
		org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class})
public class QCNotification  extends SpringBootServletInitializer {

	@RequestMapping(value="/brapi/v1/instructions/qualitycontrol",  method = RequestMethod.POST)
	public void qcNotification(@RequestParam("notification") String notificationJson) {
		Notification notification = new Gson().fromJson(notificationJson, Notification.class);
		if(notification.getPayload()==null && notification.getHeader()==null){
			ExceptionMsg exception = new Gson().fromJson(notificationJson, ExceptionMsg.class);
			Logger.getGlobal().log(Level.WARNING,"Received:\n"+notificationJson);
		}else{
			Logger.getGlobal().log(Level.INFO,"Received:\n"+notificationJson);
		}
	}

	public static void main(String args[]) {
		SpringApplication.run(QCNotification.class,args);
	}
}
