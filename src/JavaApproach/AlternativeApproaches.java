package JavaApproach;

import java.util.HashSet;

/**
 * ALTERNATIVE APPROACHES to find Two Sum without List/ArrayList
 */

// ============================================
// APPROACH 1: Using 2D Array (No ArrayList)
// ============================================
class TwoSum_2DArray {
    public int[][] TwoSumWith2DArray(int[] a) {
        int target = 10;
        
        // FIRST PASS: Count how many pairs exist
        int count = 0;
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] + a[j] == target) {
                    count++;
                }
            }
        }
        
        // SECOND PASS: Create array and store pairs
        int[][] pairs = new int[count][4];
        int index = 0;
        
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] + a[j] == target) {
                    pairs[index][0] = i;           // index i
                    pairs[index][1] = j;           // index j
                    pairs[index][2] = a[i];        // value at i
                    pairs[index][3] = a[j];        // value at j
                    index++;
                }
            }
        }
        
        return pairs;
    }
}

// ============================================
// APPROACH 2: Just Count Pairs (No Storage)
// ============================================
class TwoSum_CountOnly {
    public int countTwoSumPairs(int[] a) {
        int target = 10;
        int count = 0;
        
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] + a[j] == target) {
                    count++;
                    // Print immediately (or do something with the pair)
                    System.out.println("Pair found at indices [" + i + ", " + j + "] => " + a[i] + " + " + a[j] + " = 10");
                }
            }
        }
        
        return count;
    }
}

// ============================================
// APPROACH 3: HashSet (Optimized - O(n) time)
// ============================================
class TwoSum_HashSet {
    public int[] findOnePairWithHashSet(int[] a) {
        int target = 10;
        HashSet<Integer> seen = new HashSet<>();
        
        for(int i = 0; i < a.length; i++) {
            int complement = target - a[i];  // What number do we need?
            
            if(seen.contains(complement)) {
                // Found a pair!
                return new int[]{complement, a[i]};
            }
            seen.add(a[i]);
        }
        
        return null;  // No pair found
    }
}

// ============================================
// APPROACH 4: Simple Array to Collect Results
// ============================================
class TwoSum_SimpleArray {
    public void findPairsWithSimpleArray(int[] a) {
        int target = 10;
        int count = 0;
        
        // Store indices in a flat array: [i1, j1, i2, j2, i3, j3, ...]
        int[] pairIndices = new int[a.length];  // Worst case: all elements form pairs
        
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] + a[j] == target) {
                    pairIndices[count * 2] = i;
                    pairIndices[count * 2 + 1] = j;
                    count++;
                }
            }
        }
        
        // Print results
        for(int p = 0; p < count; p++) {
            int i = pairIndices[p * 2];
            int j = pairIndices[p * 2 + 1];
            System.out.println("Indices: [" + i + ", " + j + "] => " + a[i] + " + " + a[j] + " = 10");
        }
    }
}

// ============================================
// MAIN: Compare All Approaches
// ============================================
public class AlternativeApproaches {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Target: 10\n");
        
        // APPROACH 1: 2D Array
        System.out.println("=== APPROACH 1: Using 2D Array ===");
        TwoSum_2DArray obj1 = new TwoSum_2DArray();
        int[][] results1 = obj1.TwoSumWith2DArray(arr);
        System.out.println("Pairs found: " + results1.length);
        for(int[] pair : results1) {
            System.out.println("Indices: [" + pair[0] + ", " + pair[1] + "] => Values: " + pair[2] + " + " + pair[3] + " = 10");
        }
        
        // APPROACH 2: Just Count
        System.out.println("\n=== APPROACH 2: Just Count Pairs ===");
        TwoSum_CountOnly obj2 = new TwoSum_CountOnly();
        int count = obj2.countTwoSumPairs(arr);
        System.out.println("Total pairs: " + count);
        
        // APPROACH 3: HashSet (Different - Finds ONE pair)
        System.out.println("\n=== APPROACH 3: HashSet (Finds First Pair) ===");
        TwoSum_HashSet obj3 = new TwoSum_HashSet();
        int[] oneResult = obj3.findOnePairWithHashSet(arr);
        if(oneResult != null) {
            System.out.println("Pair found: " + oneResult[0] + " + " + oneResult[1] + " = 10");
        }
        
        // APPROACH 4: Simple Array
        System.out.println("\n=== APPROACH 4: Using Simple Array ===");
        TwoSum_SimpleArray obj4 = new TwoSum_SimpleArray();
        obj4.findPairsWithSimpleArray(arr);
    }
}
