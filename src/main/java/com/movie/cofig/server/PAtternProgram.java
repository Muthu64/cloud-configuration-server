package com.movie.cofig.server;

public class PAtternProgram
{
    public static void main( String[] args )
    {
        int indexPosition = 0;
        int maxNumber = 0;

        String input = "A|B|C|D|10;E|G|H|E|20;T|Y|U|I|45";

        String[] inputSplitted = input.split( ";" );

        for( int index = 0; index < inputSplitted.length; index++ )
        {
            int numberValueInSplittedInput = Integer.parseInt( inputSplitted[index].split( "\\|" )[4] );

            if( numberValueInSplittedInput > maxNumber )
            {
                maxNumber = numberValueInSplittedInput;
                indexPosition = index;
            }
        }

        System.out.println( inputSplitted[indexPosition] );

    }

}
