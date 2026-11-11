public class ArrayProblem1 {// class ng program
    public static void main(String[] args) { // main method

        double [] temp = new double[5];//gumawa ng array "temp" na saktong 5 yung laman

        temp[0] = 32.5;// temperature para sa unang araw, nasa index 0
        temp[1] = 34.0;// temperature para sa ikalawang araw, nasa index 1
        temp[2] = 31.8;// temperature para sa ikatlong araw, nasa index 2
        temp[3] = 33.2;// temperature para sa ikaapat na araw, nasa index 3
        temp[4] = 35.1;// temperature para sa ikalimang araw, nasa index 4

        System.out.println("Temperatures in five days : "); // priniprint yung "Temperatures in five days : "

        for (int i = 0; i < temp.length; i++) {// loop para mag run mula index 0-4
            System.out.println("Day " + (i + 1) + ": " + temp[i]);// priniprint yung mga araw at temperature, (i +1) para mag start sa day 1 imbes na day 0
        }
        temp[2] = 32.0; // inupdate yung temperature sa pangatlong araw
        System.out.print("Updated temperature for day 3 : " + temp[2]);// nagpriprint ng bagong temperatue sa pangatlong araw
    }
}
