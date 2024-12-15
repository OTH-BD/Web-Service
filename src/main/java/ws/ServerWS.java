package ws;

import jakarta.xml.ws.Endpoint;

public class ServerWS {

    public static void main(String[] args) {
        String url = "http://localhost:5566/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service déployé sur "+url);
    }

}
