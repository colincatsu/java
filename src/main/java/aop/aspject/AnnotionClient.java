package aop.aspject;import aop.Action;import aop.impl.NoInterfaceAction;import org.springframework.context.ApplicationContext;import org.springframework.context.support.ClassPathXmlApplicationContext;/** * Created with IntelliJ IDEA. * Project: test-jar * Author: Kevin * Date: 2018/9/28 * Time: 下午4:32 */public class AnnotionClient {	public static void main(String[] args) {		ApplicationContext context = new ClassPathXmlApplicationContext("config/spring/local/appcontext-core.xml"); // 获取 Spring Context		Action action = (Action) context.getBean("pureImpl");		action.add("data");		System.out.println("=======");		NoInterfaceAction noInterfaceAction = (NoInterfaceAction) context.getBean("noInterfaceAction");		noInterfaceAction.add("file");	}}