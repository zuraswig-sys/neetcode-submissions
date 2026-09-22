class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null || t==null || s.length()!=t.length())
        {
            return false;
        }
        char[] schar=s.toCharArray();
        char[] tchar=t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        String ssort=new String(schar);
        String tsort=new String(tchar);
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
