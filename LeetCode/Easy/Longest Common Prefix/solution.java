class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        int i=1;
        int k=0;
        
        while(i<strs.length){
            if (strs[i].length()<(s.length())){
                s=strs[i];
                k=i;
            }
            i++;
        }
        for(int j=0;j<strs.length;j++){
            String word=strs[j];
            if(j==k){

            }
            else{
                String update="";
                for(int x=0;x<s.length();x++){
                    if(s.charAt(x)==word.charAt(x)){
                        update+=word.charAt(x);
                    }
                    else{
                        break;
                    }
                }
                s=update;

            }
        }
        return s;
    }

}