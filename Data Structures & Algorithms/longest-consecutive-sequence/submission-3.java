class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> store=new HashSet<>();
        int res=0;
        for(int num:nums)
        {
            store.add(num);
        }

        for(int num: store)
        {
            int length=1;
            if(!store.contains(num-1))
            {
                while(store.contains(num+length))
                {
                    length++;
                }
                res=Math.max(res,length);
            }
        }
        return res;
    }
}
