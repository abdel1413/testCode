
class Solution {
   // public static String removeOuterParentheses(String S) {
//        StringBuilder sb = new StringBuilder();
//        int count = 0;
//        int prev = 0;
//        
//        for (int i = 0; i < S.length(); i++) {
//            if (S.charAt(i) == '(') {
//                count++;
//            }    
//            else {
//                count--;
//                if (count == 0) {
//                    sb.append(S.substring(prev + 1, i));
//                    prev = i + 1;
//                }
//            }
//        }
//        
//        return sb.toString();
//    }
    	
	
//    public static String removeOuterParentheses(String S) {
//    	 
//    	        StringBuilder s = new StringBuilder();
//    	        int opened = 0;
//    	        for (char c : S.toCharArray()) {
//    	            if (c == '(' && opened++ > 0) s.append(c);
//    	            if (c == ')' && opened-- > 1) s.append(c);
//    	        }
//    	        return s.toString();
//    	    }
	
	
public static String removeOuterParentheses(String S) {
        
        StringBuilder sb = new StringBuilder();
        int open=0, close=0, start=0;
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) == '(') {
                open++;
            } else if(S.charAt(i) == ')') {
                close++;
            }
            if(open==close) {
                sb.append(S.substring(start+1, i));
                start=i+1;
            }
        }
        return sb.toString();
    }
    
    


	public static void main(String[] args) {
		System.out.println(removeOuterParentheses("(()())(())"));
		
	}

}
