 public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int length = s.length();
        for (int i = 0; i < length-k+1; i++){
            String substring = s.substring(i,i+k);
            
            if (smallest.matches("") || substring.compareTo(smallest) < 0){
                smallest = substring;
            }
            
            if (largest.matches("") || substring.compareTo(largest) > 0){
                largest = substring;
            }
        }
        
        return smallest + "\n" + largest;
    }

