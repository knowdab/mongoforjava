import static spark.Spark.get;

/**
 * Created by bookboogie on 2015. 10. 31..
 */
public class HelloWorldSparkStyle {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World from Spark");
    }
}
