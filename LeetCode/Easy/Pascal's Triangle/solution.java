class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list=new ArrayList<>();
        
        int temp=0;
        while(numRows-- >0){
            temp++;
            List<Integer> list1=new ArrayList<>();
            list1.add(1);
            for(int i=1;i<temp-1;i++){
                list1.add(list.get(temp-2).get(i-1)+list.get(temp-2).get(i));
            }
            if (temp > 1) {
                list1.add(1);
            }
            list.add(list1);
        }
    return list;
    }
}