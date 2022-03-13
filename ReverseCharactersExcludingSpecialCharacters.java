class ReverseCharactersExcludingSpecialCharacters
{
    public String reverse(String str)
    {
        StringBuilder s = new StringBuilder(str);
        int l=0;
        int r=str.length()-1;
        while (l < r) {
             if (!Character.isLetter(s.charAt(l)))
                l++;
             else if (!Character.isLetter(s.charAt(r)))
                r--;
             else {
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
