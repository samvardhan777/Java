class TwelveDays {

    private String[] Dates = {
        "first", "second", "third", "fourth", "fifth", "sixth",
        "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
};

private String[] Rhythms = {
        "a Partridge in a Pear Tree",
        "two Turtle Doves",
        "three French Hens",
        "four Calling Birds",
        "five Gold Rings",
        "six Geese-a-Laying",
        "seven Swans-a-Swimming",
        "eight Maids-a-Milking",
        "nine Ladies Dancing",
        "ten Lords-a-Leaping",
        "eleven Pipers Piping",
        "twelve Drummers Drumming"
};

private String Statement1 = "On the ";
private String Statement2 = " day of Christmas my true love gave to me: ";

String verse(int verseNumber) {
    StringBuilder STR = new StringBuilder();
    
    STR.append(Statement1);
    STR.append(Dates[verseNumber - 1]);
    STR.append(Statement2);
    
    for (int i = verseNumber; i > 0; i--) {
        STR.append(Rhythms[i - 1]);
        if (i != 1) {
            STR.append(", ");
        }
        if (i == 2) {
            STR.append("and ");
        }
    }
    
    STR.append(".\n");
    return STR.toString();
}

String verses(int startVerse, int endVerse) {
    StringBuilder STR1 = new StringBuilder();
    for (int i = startVerse; i <= endVerse; i++) {
        STR1.append(verse(i));
        if (i != endVerse) 
        {
            STR1.append("\n");
        }   
    }
    return STR1.toString();
}

String sing() 
{
    return verses(1, 12);
}
}
