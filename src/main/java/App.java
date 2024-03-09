import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        //System.out.println(bean.getMessage());
        HelloWorld bean_2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        //System.out.println(bean.getMessage());
        Cat cat_1 = (Cat) applicationContext.getBean("cat");
        Cat cat_2 = (Cat) applicationContext.getBean("cat");

        System.out.println(bean == bean_2);
        System.out.println(cat_1 == cat_2);
    }
}

