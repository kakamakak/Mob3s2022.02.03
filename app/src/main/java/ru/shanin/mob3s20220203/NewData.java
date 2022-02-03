package ru.shanin.mob3s20220203;

public class NewData {

    public static final String[] streets = new String[20];

    static {
        for (int i = 0; i < streets.length; i++) {
            streets[i] = genString((int) (Math.random() * 6 + 5));
        }
    }

    public static String genAddress() {
        StringBuilder result = new StringBuilder();
        return result
                .append(streets[(int) (Math.random() * 20)])
                .append(", ")
                .append(genHouseNumber())
                .toString();
    }

    public static String genPathToPhoto() {
        return "pathToPhoto";
    }


    public static String genNumber(int length) {
        String digits = "0123456789";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++)
            result.append(
                    digits.charAt(
                            (int) (Math.random() * 10)
                    )
            );
        return result.toString();
    }

    public static String genPhoneNumber() {
//        StringBuilder result = new StringBuilder("+79");
//        return result.append(genNumber(9)).toString();
        return "+79" + genNumber(9);
    }

    public static String genPostIndex() {
        return genNumber(6);
    }

    public static String genString(int length) {
        String alphabetInUpperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String alphabetInLowerCase = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder result = new StringBuilder();
        result.append(
                alphabetInUpperCase.charAt(
                        (int) (Math.random() * 26)
                )
        );
        for (int i = 0; i < length - 1; i++) {
            result.append(
                    alphabetInLowerCase.charAt(
                            (int) (Math.random() * 26)
                    )
            );
        }
        return result.toString();
    }

    public static String genFirstName() {
        return genString(6);
    }

    public static String genSecondName() {
        return genString(4);
    }

    public static String genHouseNumber() {
        return genNumber(3);
    }


}
