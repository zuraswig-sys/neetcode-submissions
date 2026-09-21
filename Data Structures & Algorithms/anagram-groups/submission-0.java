class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res= new HashMap<>();
        for(String s: strs)
        {
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String p=new String(charArray);
            res.putIfAbsent(p, new ArrayList<>());
            res.get(p).add(s); 
        }

        return new ArrayList<>(res.values());
    }
}
