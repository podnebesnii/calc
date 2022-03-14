public class testi {

    public static boolean contains(String test) {
        boolean exists = true;
        try {
            calc.Rim.valueOf(test);
        } catch (IllegalArgumentException e) {
            exists = false;
        }
        return exists;
    }


}

