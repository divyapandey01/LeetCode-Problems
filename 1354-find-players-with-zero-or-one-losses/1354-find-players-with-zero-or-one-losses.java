class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<matches.length; i++){
            for(int j=0; j<matches[i].length; j++){
                map.put(matches[i][j], 0);
            }
        }
        for(int i=0; i<matches.length; i++){
            map.put(matches[i][1], map.getOrDefault(matches[i][1], 0) +1);
        }
        List<List<Integer>> list = new ArrayList<>(2);
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        for(Integer key : map.keySet()){
            if(map.get(key) == 0){
                list.get(0).add(key);
            }
            if(map.get(key) == 1) {
                list.get(1).add(key);
            }
        }
        return list;

    }
}