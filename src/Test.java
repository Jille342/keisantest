import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.Console;

public class Test {
    public static void main(String[] args){
        Console console = System.console();
        String input = console.readLine("Please enter the data");
        double[] d = Main.dData(input);
        double out = (d[1]+d[2])/2 - d[0];
        System.out.println(out);
    }
}
