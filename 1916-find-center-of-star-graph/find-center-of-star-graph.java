class Solution {
    public int findCenter(int[][] edges) {
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < 4; i++) {
            int left = i / 2;
            int right = i % 2;
            
            if(set.contains(edges[left][right])) {
                return edges[left][right];
            }
            
            set.add(edges[left][right]);
        }
        
        return -1;
    }
}