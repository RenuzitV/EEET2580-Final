package dramaholic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@ServletComponentScan
@EnableAsync
@SpringBootApplication (scanBasePackages={"dramaholic"})
public class DramaholicApplication {

	public static void main(String[] args) {
		SpringApplication.run(DramaholicApplication.class, args);
	}

}
