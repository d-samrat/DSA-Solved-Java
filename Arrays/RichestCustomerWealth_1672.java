public class RichestCustomerWealth_1672 {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for(int i=0; i<accounts.length;i++){
            int flag=0;
            for(int ele:accounts[i]){
                flag+=ele;
            }
            wealth = Math.max(flag,wealth);
        }
        return wealth;
    }
}
