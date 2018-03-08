
    void setText (char[] text, int start, int len)

Parameters
    
    text char: char array to be displayed
    start int: start index in the char array
    len int: length of char count after start


Only can use String or charSequence

e.g.

    setText ("" + number);
    setText (String.valueOf(number);

______________________________________________________________________________________________________________

Escape Sequences

A character preceded by a backslash (\) is an escape sequence and has special meaning to the compiler. The following table shows the Java escape sequences:


    Escape            Escape Sequence
    Sequences         Description
    
    \t	Insert a tab in the text at this point.
    \b	Insert a backspace in the text at this point.
    \n	Insert a newline in the text at this point.
    \r	Insert a carriage return in the text at this point.
    \f	Insert a formfeed in the text at this point.
    \'	Insert a single quote character in the text at this point.
    \"	Insert a double quote character in the text at this point.
    \\	Insert a backslash character in the text at this point.
