package JavaApproach;

class TwoSum{
    // Method to find ALL pairs that sum to target using 2D Array approach
    // Time: O(n²), Space: O(k) where k = number of pairs
    public int[][] TwoSumBruteForce(int[] a, int target){
         
         // FIRST PASS: Count how many pairs exist
         int count = 0;
         for(int i=0;i<a.length-1;i++){
             for(int j=i+1;j<a.length;j++){
                 if(a[i]+a[j]==target){
                     count++;
                 }
             }
         }
         
         // Check if any pairs found
         if(count == 0){
             return new int[0][0];  // Return empty 2D array
         }
         
         // SECOND PASS: Create 2D array and store pairs
         int[][] pairs = new int[count][4];
         int index = 0;
         
         for(int i=0;i<a.length-1;i++){
             for(int j=i+1;j<a.length;j++){
                 if(a[i]+a[j]==target){
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

    // Two-Pointer approach - ONLY works on SORTED arrays
    // Time: O(n), Space: O(1)
    // Returns: First pair found as [index_i, index_j] or [-1, -1] if not found
    public int[] TwoSumPointer(int[] a, int target){
        int left = 0;              // ✅ FIXED: Index of start
        int right = a.length - 1;  // ✅ FIXED: Index of end
        
        while(left < right){
            int sum = a[left] + a[right];
            if(sum == target){
                return new int[]{left, right, a[left], a[right]};
            }
            else if(sum > target){
                right--;  // Sum too large, move right pointer left
            }
            else{
                left++;   // Sum too small, move left pointer right
            }
        }
        
        return new int[]{-1, -1};  // No pair found
    }
}

public class TwoPointerandBruteForceApproach {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TwoSum obj = new TwoSum();
        
        int target1 = 10;
        int target2 = 9;
        
        // ========================================
        // BRUTE FORCE APPROACH - Find ALL pairs
        // ========================================
        System.out.println("========== BRUTE FORCE APPROACH ==========");
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Target: " + target1);
        
        int[][] bruteForceResults = obj.TwoSumBruteForce(arr, target1);
        
        if(bruteForceResults.length > 0){
            System.out.println("\n✅ All pairs that sum to " + target1 + ":");
            for(int[] pair : bruteForceResults){
                System.out.println("  Indices: [" + pair[0] + ", " + pair[1] + "] => Values: " + pair[2] + " + " + pair[3] + " = " + target1);
            }
            System.out.println("Total pairs found: " + bruteForceResults.length);
        } else {
            System.out.println("❌ Target not found");
        }
        
        // ========================================
        // TWO-POINTER APPROACH - Find FIRST pair
        // ========================================
        System.out.println("\n========== TWO-POINTER APPROACH ==========");
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Target: " + target2);
        
        int[] twoPointerResult = obj.TwoSumPointer(arr, target2);
        
        if(twoPointerResult[0] != -1){
            System.out.println("\n✅ First pair found:");
            System.out.println("  Indices: [" + twoPointerResult[0] + ", " + twoPointerResult[1] + "] => Values: " + twoPointerResult[2] + " + " + twoPointerResult[3] + " = " + target2);
        } else {
            System.out.println("❌ Target not found");
        }
        
        // ========================================
        // COMPLEXITY COMPARISON
        // ========================================
        System.out.println("\n========== COMPLEXITY COMPARISON ==========");
        System.out.println("Brute Force:  Time O(n²), Space O(k)    - Finds ALL pairs");
        System.out.println("Two Pointer:  Time O(n),  Space O(1)    - Finds FIRST pair (sorted array only)");
    }
}

