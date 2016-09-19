package controllers;

import configs.sidebar.MenuItem;
import play.api.Configuration;
import play.api.Environment;
import play.api.Play;
import play.mvc.*;
import com.typesafe.config.ConfigFactory;

import views.html.*;

import javax.inject.Inject;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class MainController extends Controller {
    @Inject
    private Configuration configuration;

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        System.out.println("hehe");
        System.out.println(configuration.getConfigList("sidebar.general"));
//        System.out.println(configuration.getString("sidebar").get());
        return ok(main.render());
    }
}