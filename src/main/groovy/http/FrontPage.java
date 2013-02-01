package http;

import org.codehaus.groovy.runtime.DefaultGroovyMethods;
import org.ratpackframework.Response;
import org.ratpackframework.session.Session;
import org.vertx.java.core.Handler;

public class FrontPage implements Handler<Response> {

    @Override
    public void handle(Response response) {
        Session session = response.getRequest().getSession();
        if (session.containsKey("subject")) {
            response.redirect("/user");
        } else {
            response.redirect("/login");
        }
    }

}