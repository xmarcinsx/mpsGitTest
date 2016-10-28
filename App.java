package pl.mps;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String text = "hello world!";
        System.out.println( text );
        text = StringUtils.capitalize(text);
        System.out.println( text );
    }
}
