import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml,classpath:spring-mybatis.xml,classpath:spring-security.xml")
public class SecurityTest {
	
	
	@Test
	public void test() {
		System.out.println("test");
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

	}
}
