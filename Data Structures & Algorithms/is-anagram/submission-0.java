class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()|| s.length()==0 || t.length()==0)
        {
            return false;
        }
        else
        {
            char[] scharArray=s.toCharArray();
            char[] tcharArray=t.toCharArray();
            Arrays.sort(scharArray);
            Arrays.sort(tcharArray);
            String ssort= new String(scharArray);
            String tsort= new String(tcharArray);
            if(ssort.equals(tsort))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
