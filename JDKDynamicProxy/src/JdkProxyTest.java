public class JdkProxyTest {
    public static void main(String[] args) throws Exception{
        TicketSubject  ticketSubject = TicketSubjectDynamicProxy.newProxyInstance(new TrainStation());
        ticketSubject.sell();
    }
}