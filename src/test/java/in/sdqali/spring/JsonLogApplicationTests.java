package in.sdqali.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import in.reco.spring.JsonLogApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JsonLogApplication.class)
@WebAppConfiguration
public class JsonLogApplicationTests {

	@Test
	public void contextLoads() {
	}

}
