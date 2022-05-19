import java.lang.reflect.InvocationHandler;
public class TicketSubjectDynamicProxy extends DynamicProxy{

    public static <T> T newProxyInstance(TrainStation trainStation) {
        ClassLoader classLoader = trainStation.getClass().getClassLoader();
        Class<?>[] interfaces = trainStation.getClass().getInterfaces();
        InvocationHandler invocationHandler = new DemoInvocationHandler(trainStation);
        return newProxyInstance(classLoader, interfaces, invocationHandler);

    }
}