package ru.shanin.mob3s20220203;

public class NewData {

    private static String genNumber(int length) {
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

    private static String genPhoneNumber() {
//        StringBuilder result = new StringBuilder("+79");
//        return result.append(genNumber(9)).toString();
        return "+79" + genNumber(9);
    }

    private static String genString(int length) {
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

    private static String genFirstName() {
        return genString(8);
    }

    private static String genSecondName() {
        return genString(5);
    }

    private static int genAge() {
        return (int) (14 + Math.random() * 5);
    }


    public static Contact newContact() {
        String fn = genFirstName();
        String sn = genSecondName();
        String ph = genPhoneNumber();
        String em = fn + "_" + sn + "@gmail.com";
        int age = genAge();

        return new Contact(
                fn, sn,
                age,
                em, ph
        );


    }


}
