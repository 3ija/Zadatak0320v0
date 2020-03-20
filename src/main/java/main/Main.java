package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.MyBeanConfig;
import repository.IRepository;
import service.MessageService;
import service.ReportService;

public class Main {
	
	public static void main(String[] args) {
		
		ReportService report = Cont.container.getBean("reportService", ReportService.class);
		report.enableByPredmet(true,"1");
		report.enableByProfesor(true,"1");
		report.printReport();
		
		
		
	}
		
		
		
		
		/*//2.main ne kreiramo preko new operatora
		Main main = new Main();
		main.annotationConfig();
		main.saveMessage("Gladan sam!!!");
	}

	private void annotationConfig() {
		BeanFactory container = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		IRepository txtRepository = (IRepository)container.getBean("txtRepository");
		txtRepository.save("My plain message!");
		
		IRepository xmlRepository = container.getBean("xmlRepository", IRepository.class);
		xmlRepository.save("My xml message!");
		
		((AnnotationConfigApplicationContext)container).close();
	}
	
	private void saveMessage(String message) {
		// 1.U zavisnosti od nekog uslova cuvamo poruku u txt repository ili xml repository
		BeanFactory container = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		MessageService messageService = 
				container.getBean("messageService", MessageService.class);
		messageService.save(message);
		
		((AnnotationConfigApplicationContext)container).close();
	}*/
}
