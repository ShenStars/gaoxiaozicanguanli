package myfirstMQ;

public class ProduceClient {
	public static void main(String[] args) throws Exception{
		MqClient client=new MqClient();
		client.produce("1910300828  …Ú√¿¡·");
	}
}
