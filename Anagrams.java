    static boolean isAnagram(String a, String b) {
        
        if (a.length() != b.length()){
            return false;
        }
        
        char [] a_chars = a.toLowerCase().toCharArray();
        char [] b_chars = b.toLowerCase().toCharArray();
        
        int length = a.length();
        for (int i=0; i < length-1; i++){
            for (int j = i+1; j < length; j++){
                char temp;
                if (a_chars[i] > a_chars[j]){
                    temp = a_chars[i];
                    a_chars[i] = a_chars[j];
                    a_chars[j] = temp;
                }
                if (b_chars[i] > b_chars[j]){
                    temp = b_chars[i];
                    b_chars[i] = b_chars[j];
                    b_chars[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < length; i++){
            if (a_chars[i] != b_chars[i]){
                return false;
            }
        }
        
        return true;
    }