public class TimeCalc {
    public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = (totalMinutes/60);
        int finalHour = totalHours % 24;
        int finalMinutes = totalMinutes - (totalHours * 60);

        String min = "" + finalMinutes;
        if (finalMinutes < 10)
            {min = "0"+ finalMinutes;}
        
        String hour = "" + finalHour;
        if (finalHour < 10)
            {hour = "0" + finalHour;}
        System.out.println (hour+":"+min);

    }
}
