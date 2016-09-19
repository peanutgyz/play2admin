package controllers;

import com.google.inject.Inject;
import play.Configuration;
import play.api.Play;
import play.mvc.*;
import com.typesafe.config.ConfigFactory;

import views.html.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    @Inject
    private Configuration config;
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index(String path) {

        System.out.println(ConfigFactory.load().getList("sidebar.general"));
        switch (path) {
            case "page" : return ok(index.render(page.render(), config));
            default:
                return notFound("Not Found");
        }
    }
}