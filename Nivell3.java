package m2;

class Nivell3 {
    public static void main(String args[]) {

        int hour = 0;
        int minutes = 0;
        int seconds = 0;

        while(true) {
            //print after each iteration            
            System.out.println(twoDigits(hour) + ':' + twoDigits(minutes) + ':' + twoDigits(seconds));

            //try&catch for the sleep timer here because the compiler throws an error otherwise
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }

            // clock logic starts  here
            seconds++;
            if (seconds == 60) {
                minutes++;
                seconds = 0;
            }
            if (minutes == 60) {
                hour++;
                minutes = 0;
            }
            if (hour == 24) {
                hour = 0;
            }
        }
    }

    //add the missing zero if length of the number is < 2
    private static String twoDigits(int n) {
        String str = Integer.toString(n);
        if (str.length() < 2) {
            str = '0' + str;
        }
        return str;
    }

}

