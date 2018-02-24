
Difference between gravity and layout_gravity on Android

Their names should help you:

    android:gravity sets the gravity of the contents (i.e. it's subviews) of the View it's used on.
    android:gravity is the Inside gravity of that View. Specifies in which direction its contents should align.

    android:layout_gravity sets the gravity of the View or Layout relative to its parent.
    android:layout_gravity is the Outside gravity of the View. Specifies the direction in which the View should touch its parent's border.
    
    
    !(https://i.stack.imgur.com/nymDt.png)
    https://github.com/dailiang18bb/Udacity_Android_Course/Lesson6_practiceSet/nymDt.png
________________________________________________________________________________________________

Constant variables

    final int number = 14;
