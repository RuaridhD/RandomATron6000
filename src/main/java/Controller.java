import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;
import static spark.route.HttpMethod.get;

public class Controller {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        staticFileLocation("/public");

        RandomATron names = new RandomATron();

        get ("/one", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            String result = names.randomiseNamesPickOne();
            model.put("oneName", result);
            return new ModelAndView(model, "oneName.vtl");
        }, velocityTemplateEngine);

        get ("/two", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            ArrayList result = names.randomiseNamesPickTwo();
            String nameOne = result.get(0).toString();
            String nameTwo = result.get(1).toString();
            model.put("nameOne", nameOne);
            model.put("nameTwo", nameTwo);
            return new ModelAndView(model, "twoNames.vtl");
        }, velocityTemplateEngine);


    }
}
