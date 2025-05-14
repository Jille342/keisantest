import org.w3c.dom.CDATASection;

import java.io.Console;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double[] a= {};
    public static double[] b={};

    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Console is not available. Run this from a real terminal.");
            return;
        }

        String inputMode = console.readLine("Please Enter Mode 1:Average 2:Working now :");
        int mode = Integer.parseInt(inputMode);
        if(mode == 1){
            String data =console.readLine("Please enter Data splitted by |,| :");
            a = dData(data);
            double average = average(a);
            System.out.println("The average of the date is :"+average+" .");
        }
        if(mode ==2) {
            if (a.length != b.length) {
                System.exit(0);
            } else {

            }
        }
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

    }
    public static double sum(double[] d){
        double sum = 0;
        for (double v : d) {
            sum += v;
        }
        return sum;
    }
    public static double average(double[] d){
        return sum(d)/d.length;
    }
    public static double[] dData(String data){
        String[] parts = data.split(",");
        double[] d = new double[parts.length];
        for(int i = 0; i< parts.length; i++){
            d[i] = Double.parseDouble(parts[i]);
        }
        return d;
    }
}