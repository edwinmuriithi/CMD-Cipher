public class Encoding {
    private int mKey;
    private String mInputText;

    public Encoding(String inputText,int key) {
        mKey = key;
        mInputText = inputText;
    }
    public String getInputText() {
        return mInputText;
    }
    public int getKey()
    {
        return mKey;
    }
    public boolean isValidInputText()
    {
        char[] chars = mInputText.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }

    public boolean isNotEmpty()
    {
        return !mInputText.trim().isEmpty();
    }
    public boolean isValidKey()
    {
        return mKey >1 && mKey < 26;

    }

    public String encode()
    {

    }
}