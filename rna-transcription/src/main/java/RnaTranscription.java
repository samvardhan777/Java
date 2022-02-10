class RnaTranscription {

    String transcribe(String dnaStrand)
     {
        char [] d = new char[dnaStrand.length()];
        for (int i = 0; i < dnaStrand.length(); i++) 
        {
            d[i] = dnaStrand.charAt(i);
        }
        for(int j=0;j<dnaStrand.length();j++)
        {
            if(d[j]=='G')
            {
                d[j]='C';
            }
            else if(d[j]=='C')
            {
                d[j]='G';
            }
            else if(d[j]=='T')
            {
                d[j]='A';
            }
             else if(d[j]=='A')
            {
                d[j]='U';
            }
        }
        String RnaString=String.valueOf(d);
        return(RnaString);
    }
}

