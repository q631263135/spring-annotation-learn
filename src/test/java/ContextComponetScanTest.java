import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextComponetScanTest {

    @Test
    public void testCompenetScanAndLookHowManyBeans() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        for (int i = 0; i < beanDefinitionNames.length; i++) {
            System.out.println(beanDefinitionNames[i]);
        }
    }
}
