import java.util.*;

public class StringParsing {
    private String text;
    private int vowels;
    private int cons;
    private String longestWord;
    private HashMap<String, Integer> hashWords = new HashMap<String, Integer>();
    private String top_5[];
    private int top_5_freq[];

    public StringParsing(String _text){
        this.text = _text;
    }

    public void parse(){
        for (int i =0; i < text.length(); i++){
        
        int c = text.charAt(i);
       // primu task
        if ("aeiou".indexOf(c) < 0)
            this.vowels++;
        else if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            this.cons++;
            
        // number of words
        String[] words = this.text.split("\\s+");
        
        int longest_word = -1;
        String lw  = "";
        for (String word : words)
        {
            if (hashWords.containsKey(word)){
                hashWords.put(word, hashWords.get(word)+1);
            }
            else
                hashWords.put(word, 1);
            
            if (longest_word < word.length())
            {
                longest_word = word.length();
                lw = word;
            }
        }
        // top 5 words
        this.longestWord = lw;
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
        hashWords.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
        int index = 0;
        for(Map.Entry<String, Integer> dt: reverseSortedMap.entrySet()){
            if(index==5) break;
            this.top_5[index] = dt.getKey();
            this.top_5_freq[index] = dt.getValue();
            index++;
        }
        }

    }

    public int getVowels()
    {
        return this.vowels;
    }

    public int getCons()
    {
        return this.cons;
    }
    public void getWords()
    {
        for (int i =0; i < 5; i++)
        {
            System.out.println(this.top_5[i] + " " + this.top_5_freq[i]);
        }
    }
    public String getLongestWord(){
        return this.longestWord;
    }





}
