package test;

import static spark.Spark.*;

import spark.*;

public class Main {

    private static World world = new World();

    public static void main(String[] args) {

        get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                return world.greet();
            }
        });

   }

}
