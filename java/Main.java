import java.util.*;

public class Main {
    public static void main(String[] args) {
        example1();
        example2();
    }
        private static void example1() {
            Map<String, Integer> hm = new HashMap<>();
            String[] fruitVegetables = {
                    "Apple", "Orange", "Watermelon",
                    "Melon", "Tomato", "Potato",
                    "Tangerine", "Strawberry", "Tomato",
                    "Melon", "Blueberry", "Apple",
                    "Grape", "Orange", "Apricot"
            };

            for (int i = 0; i < fruitVegetables.length; i++) {
                if (hm.containsKey(fruitVegetables[i])) // if true
                    hm.put(fruitVegetables[i], hm.get(fruitVegetables[i]) + 1);
                else
                    hm.put(fruitVegetables[i], 1);
            }
            System.out.println("NumRepetition: " + hm);
            Set<String> setUniqueWords = new TreeSet<String>();
            setUniqueWords.addAll(Arrays.asList(fruitVegetables));
            System.out.println("uniqKeys: " + setUniqueWords);
        }
        private static void example2 (){

        PhoneNum phoneNum = new PhoneNum();

            phoneNum.add("Tony Black", "88005553535");
            phoneNum.add("Jenifer Jouly", "88005553535");
            phoneNum.add("Megan Trace", "88005553535");
            phoneNum.add("Jonny Bravo", "88005553535");
            phoneNum.add("Tom and Jerry", "88005553535");
            phoneNum.add("Jekky Li", "88005553535");
            phoneNum.add("Nick Montana", "88005553535");

            System.out.println(phoneNum.get("Tony Black"));
            System.out.println(phoneNum.get(""));
        }
    }


