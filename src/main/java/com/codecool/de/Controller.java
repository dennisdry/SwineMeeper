package com.codecool.de;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.HashMap;

public class Controller {

    public static ModelAndView renderHome(Request req, Response res) {
        HashMap<String, String> map = new HashMap<>();
        return new ModelAndView(map, "home");
    }

}
