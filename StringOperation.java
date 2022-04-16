public class StringOperation {
        public static void main(String[] args) {
            String s1 = "AbcD";
            String s2 = "abcd";
            String s3 = "AbcD";

            // equals returns true/false based on the equality of the strings
            if(s3.equals(s1)){
                System.out.println("Equal 1");
            }

            if(s1.equals(s2)){
                System.out.println("Equal 2");
            }

            String s4 = "Abir Hasan";
            String s5 = "Hasan";

            // contains: checks if one string is a part of another string
            if(s4.contains(s5)){
                System.out.println("Contain 1");
            }

            if(s5.contains(s4)){   // false
                System.out.println("Contain 2");   // will not print
            }

            int index = s4.indexOf(s5); // index=5
            System.out.println(index);

            // String s3 = "AbcD";
            // String s4 = "Abir Hasan";
            int index1 = s4.indexOf(s3); // index1=-1
            System.out.println(index1);

            System.out.println(s3.charAt(0)); // A
            System.out.println(s3.charAt(1)); // b

            String s6 = s3.toUpperCase(); // s6: ABCD
            String s7 = s3.toLowerCase(); // s7: abcd
            System.out.println(s6);
            System.out.println(s7);



            // String conversion

            // Primitive type to String
            int v1 = 100;
            double d1 = 3.51;

            String s8 = v1 + "";
            String s9 = d1 + "";
            System.out.println(s8); // 100
            System.out.println(s9); // 3.51

            // String to primitive type
            int v2 = Integer.parseInt(s8);
            double d2 = Double.parseDouble(s9);

            System.out.println(v2 + " " + d2);


            String s10 = "AbcEfXyz12";
            // Substring
            // beginIndex (inclusive); endIndex (exclusive)

            String s11 = s10.substring(3, 8); // EfXyz
            String s12 = s10.substring(0, 5); // AbcEf
            System.out.println(s11);
            System.out.println(s12);

            // beginIndex (inclusive)
            // endIndex (not given, length of string)
            int startIndex = s10.length() - 5;
            String s13 = s10.substring(startIndex); // Xyz12
            System.out.println(s13);

        }
    }

