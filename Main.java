package D_JavaAdvancedOOP.Lecture3_Encapsulation.ExProblem1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

// za da poluchih 100% v judge:
// 1) src -> Package "Box";
// 2) src -> Main class;
// 3) .zip file (Package "Box" + Main.class;

        double length = Double.parseDouble(reader.readLine());
        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());

        try {
            Box box = new Box(length, width, height);
            System.out.println(box);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
