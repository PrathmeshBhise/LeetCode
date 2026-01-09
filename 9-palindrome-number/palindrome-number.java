class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        StringBuilder str1= new StringBuilder(str);
        String rev = str1.reverse().toString();
        if(str.equals(rev)){
            return true;
        }
        else{
            return false;
        }
        
    }
}