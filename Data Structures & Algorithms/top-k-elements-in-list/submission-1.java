class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count=new HashMap<>();
        for(int num: nums)
        {
            count.put(num, count.getOrDefault(num,0)+1);
        }

        List<Integer> numbers=new ArrayList<>(count.keySet());
        numbers.sort((a,b)->count.get(b)-count.get(a));
        int[] result=new int[k];
        for(int i=0; i<k;i++)
        {
            result[i]=numbers.get(i);
        }

        return result;
    }
}
