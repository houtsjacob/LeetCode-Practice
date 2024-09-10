class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        //get UAM for all users
        HashMap<Integer, HashSet<Integer>> logMap = new HashMap<>();
        
        for(int i = 0; i < logs.length; i++) {
            int ID = logs[i][0];
            int time = logs[i][1];
            
            if(logMap.containsKey(ID)) {
                logMap.get(ID).add(time);
            } else {
                HashSet<Integer> set = new HashSet<>();
                set.add(time);
                logMap.put(ID, set);
            }
        }
        
        //convert UAM into the answer array
        int[] answer = new int[k];
        
        for(HashSet<Integer> set : logMap.values()) {
            int UAM = set.size();
            ++answer[UAM - 1];
        }
        
        
        return answer;
    }
}