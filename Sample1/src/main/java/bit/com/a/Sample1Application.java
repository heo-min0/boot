package bit.com.a;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "bit.com.a") //디비 사용위해 공용패키지를 넣어둔다
public class Sample1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sample1Application.class, args);
	}

}
