class Solution {

    public int getValue(char c){
        switch(c) {
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return 0; 
    }

    
    }
    public int romanToInt(String s) {

        int n = s.length();
        int num = 0;

        for(int i = 0; i<n-1;i++){
            if(getValue(s.charAt(i))<getValue(s.charAt(i+1))){
                num -= getValue(s.charAt(i));
            }else{
                num += getValue(s.charAt(i));
            }
        }

        return num+getValue(s.charAt(n-1));
        
    }
}