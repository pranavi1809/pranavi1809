class ReverseCharactersExcludingSpecialCharacters
{
    public String reverse(String str)
    {
        StringBuilder s = new StringBuilder(str);
        int l=0;
        int r=str.length()-1;
        while (l < r) {
            while (l < s.length() && !Character.isLetter(s.charAt(l)))
                l++;
            while (r > 0 && !Character.isLetter(s.charAt(r)))
                r--;
            if (l < r) {
                char temp = s.charAt(l);
                s.setCharAt(l, s.charAt(r));
                s.setCharAt(r, temp);
                l++;
                r--;
            }
        }
        return s.toString();
    }
}
