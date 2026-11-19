public class CoffeeShopAnalyzer { //class ng program
    public static void main(String[] args) { //main method
        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195}; // array ng bilang ng nabentang cups ng kape kada araw
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};// array ng mga araw
        System.out.println("--- Daily Sales ---");// prini-print ang "--- Daily Sales ---"
        for (int i = 0; i < weeklySales.length; i++) {//loop mula index 0 hanggang sa huling array
            System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]);// ipri-prnt yung araw at kung ilan ang nabenta dito
        }
        int totalSales = 0;//
        for (int dailySale : weeklySales) {//loop para kunin ang bawat benta sa array
            totalSales += dailySale;//dinadagdag yung bawat benta kada araw sa totalSales
        }
        double averageSales = (double) totalSales / weeklySales.length;//kinukuh ang average na benta
        System.out.println("\n--- Weekly Summary ---");//prini-print ang --- Weekly Summary ---
        System.out.println("Total Sales: " + totalSales + " cups"); // prini-print ang kabuuang benta saisang linggo
        System.out.println("Average Daily Sales: " + averageSales + " cups");//prini-print ang average na benta kada araw
        int maxSales = weeklySales[0];//nilalagay muna na ang unang araw ang pinakamataas
        int minSales = weeklySales[0];//nilalagay muna na ang unang araw ang pinakamababa
        String bestDay = daysOfWeek[0];// araw na may pinakamataas ang benta
        String worstDay = daysOfWeek[0];//nilalagay ang araw na may pinakamaliit na benta

         for (int i = 1; i < weeklySales.length; i++) {// loop
            if (weeklySales[i] > maxSales) {// kung mas mataas ang benta sa isang weeklySales kaysa sa maxSales,may bagong pinaka mataas
                maxSales = weeklySales[i];// papalitan ang max ng mas mataas
                bestDay = daysOfWeek[i];// mapapalitan rin yung bestDay
            }
            if (weeklySales[i] < minSales) {//
                minSales = weeklySales[i];// ung may mas mababa sa minSales kaysa sa isang weeklySales mapapalitan ang minSales sa mas mababa dito
                worstDay = daysOfWeek[i];//
            }
        }
        System.out.println("\n--- Bests and Worsts ---");// prini-print ang "--- Bests and Worsts ---"
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups.");//prini-print ang best day kasama kung ilang cup ang nabenta
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups.");//prini-print ang araw na may pinakamababang benta
    }
}

