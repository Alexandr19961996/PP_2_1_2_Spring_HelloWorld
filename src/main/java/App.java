import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("beanOne message: " + beanOne.getMessage() + "; " +
                "beanTwo message: " + beanTwo.getMessage() + "; " + (beanOne == beanTwo));

        Cat beanThree = (Cat) applicationContext.getBean("cat");
        Cat beanFour = (Cat) applicationContext.getBean("cat");
        System.out.println("beanThree name: " + beanThree + "; " +
                "beanFour name: " + beanFour + "; " + (beanThree == beanFour));
    }
}