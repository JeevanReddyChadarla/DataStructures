class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0, maxi = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            maxi = Math.max(maxi, sum);
        }
        return maxi;
    }
}