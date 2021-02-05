package com.dumpGround;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * Find a first product in array that occurs only once in the that array,
 * If there is not unique products in the array, null should be return
 */

public class UniqueProduct {
    public static String firstUniqueProduct(String[] products) {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        //System.out.println(firstUniqueProduct(new String[] { "Apple", "Computer", "Apple", "Bag"  }));
        //System.out.println(uniqueString(new String[] { "Apple", "Computer", "Apple", "Bag"  }));
        System.out.println(uniqueString(new String[] { "Apple", "Computer", "Apple", "Aibesh"  }));
    }

    public static String uniqueString1(String[] s) {
        for (int i = 0; i < s.length; i++) {
            boolean unique = true;
            for (int j = i + 1; j < s.length; j++) {
                if (s[j].equals(s[i])) {
                    s[j] = s[s.length - 1]; // <-- handle bug, ensure that dupes aren't
                    // found again.
                    unique = false;
                    break;
                }
            }
            if (unique) {
                return s[i];
            }
        }
        return "";
    }


    public static String uniqueString(String[] products) {
        return Stream.of(products)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(prodEnt -> prodEnt.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(null);
    }


}
