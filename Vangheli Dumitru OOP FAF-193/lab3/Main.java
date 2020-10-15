class Main {

    public static void main(String[] Args)
    {
        String veryLongString = "The Dark Knight Rises is a 2012 superhero film directed by Christopher Nolan, who co-wrote the screenplay with his brother Jonathan Nolan, and the story with David S. Goyer.[5]. \r\n "+
        "Based on the DC Comics character Batman, it is the final installment in Nolan's The Dark Knight Trilogy, and the sequel to The Dark Knight (2008).\r\n" +
        " Christian Bale stars as Bruce Wayne / Batman, alongside Michael Caine, Gary Oldman, Anne Hathaway, Tom Hardy, Marion Cotillard, Joseph Gordon-Levitt, and Morgan Freeman. \r\n" +
        "Eight years after the events of The Dark Knight, the revolutionary Bane forces Bruce Wayne to resume his role as Batman and save Gotham City from nuclear destruction.\r\n" +
"Christopher Nolan was hesitant about returning to the series for a third film, but agreed after developing a story with his brother and Goyer that he felt would conclude the series on a satisfactory note.\r\n" +
" Nolan drew inspiration from Bane's comic book debut in the 1993 Knightfal storyline, the 1986 series The Dark Knight Returns, and the 1999 storyline No Man's Land.\r\n" +
 "Filming took place from May to November 2011 in locations including Jodhpur, London, Nottingham, Glasgow, Los Angeles, New York City, Newark, and Pittsburgh.\r\n" + 
  "Nolan used IMAX 70 mm film cameras for much of the filming, including the first six minutes of the film, to optimize the quality of the picture.\r\n" + 
   "A vehicle variation of the Batplane and Batcopter termed the Bat, an underground prison set, and a new Batcave set were created specifically for the film. \r\n " +
   "As with The Dark Knight, viral marketing campaigns began early during production.\r\n" +
    "When filming concluded, Warner Bros. refocused its campaign, developing promotional websites, releasing the first six minutes of the film, screening theatrical trailers, and sending out information regarding the film's plot.\r\n" +
"The Dark Knight Rises premiered in New York City on July 16, 2012. The film was released in the United States and the United Kingdom on July 20, 2012.\r\n"  +
"The film received positive reviews, with praise being directed toward the performances, action sequences, screenplay, direction, musical score, and emotional depth, with many critics deeming it a satisfying conclusion to the trilogy. \r\n"  +
"The consensus at Rotten Tomatoes calls it ambitious, thoughtful, and potent.\r\n " +
"The film grossed over $1 billion worldwide, making it the second film in the Batman film series to earn $1 billion. In addition to being Nolan's highest-grossing film, it became the seventh-highest-grossing film of all time at the time of its release, as well as the third-highest-grossing film of 2012. \r\n " ;
        


        StringParsing finalString = new StringParsing(veryLongString);
       finalString.parse();
       System.out.println( finalString.getVowels());
       System.out.println( finalString.getCons());
        finalString.getWords();
       System.out.println( finalString.getLongestWord());


    }
}