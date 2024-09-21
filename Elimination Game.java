class Solution {
    public int lastRemaining(int n) {
        boolean left=true;
        int rem=n,step=1,head=1;
        while(rem>1){
            if(left || rem % 2 == 1){
                head+=step;
            }
            rem/=2;
            step*=2;
            left=!left;
        }
        return head;
    
    }
}
