public class Main {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(2, -2020));
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;

                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }


    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        }

        // TRADITIONAL VERSION
        switch (month) {
            case 1:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                }
                return 28;
            // TODO: YOU do the rest for 3 - 12
            default:
                return -1;


        }

    }
}

