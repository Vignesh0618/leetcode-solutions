LEETCODE DAILY CHALLENGE SOLUTION
  PRBLM NO: 997

  SOLUTION:


class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] countTrust = new int[n+1];

        for(int[] judge : trust) {
            countTrust[judge[0]]--;
            countTrust[judge[1]]++;
        }

        for(int i=1; i<=n; i++) {
            if(countTrust[i]==n-1) {
                return i;
            }
        }  
        return -1;
    }
}
