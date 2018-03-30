
# explicit intent VS implicit intent

Resources

    Example explicit intent
    http://developer.android.com/guide/components/intents-filters.html#ExampleExplicit
    Example implicit intent
    http://developer.android.com/guide/components/intents-filters.html#ExampleSend
    How to create an implicit intent to play a music or video file
    http://developer.android.com/guide/components/intents-common.html#Music
    How to create an implicit intent to send an SMS or MMS message
    http://developer.android.com/guide/components/intents-common.html#Messaging

# inplement onClick method in two ways

1. XML

        <TextView
        android:id="@+id/numbers"
        style="@style/CategoryStyle"
        android:background="@color/category_numbers"
        android:onClick="openNumberAct"
        android:text="@string/category_numbers" />
2.JAVA

    public class MainActivity extends AppCompatActivity {
    View mFamilyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFamilyView = findViewById(R.id.family);
        mFamilyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //put the actions here
            }
        });
    }

# Set label

AndroidManifest.xml

    <activity
    android:name=".PhrasesActivity"
    android:label="@string/category_phrases" />

# Java Array List VS Array

ArrayList has variable length, support Object datatype
Array has fixed length, support primitives and Object datatype

    ArrayList<String> test = new ArrayList<String>();
    test.add("Charles");
    test.add("Leon");
    test.remove("Charles");
    test.size();

# ListView and ArrayAdapter
Android Performance course 
https://classroom.udacity.com/courses/ud825/lessons/3846748822/concepts/37868186490923  
Codepath tutorial on ListView and ArrayAdapter  
https://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView   
Google I/O talk on ListView  
https://www.youtube.com/watch?v=wDBM6wVEO70

numbersActivity.Java

    ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
    ListView listView = (ListView) findViewById(R.id.list);
    listView.setAdapter(itemsAdapter);
    
activity_numbers.xml

    <?xml version="1.0" encoding="utf-8"?>
    <ListView xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:id="@+id/list"
        android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:paddingBottom="@dimen/activity_vertical_margin"
        android:paddingLeft="@dimen/activity_horizontal_margin"
        android:paddingRight="@dimen/activity_horizontal_margin"
        android:paddingTop="@dimen/activity_vertical_margin"
        tools:context="com.example.android.miwok.NumbersActivity"/>

# GridView and ArrayAdapter
https://developer.android.com/guide/topics/ui/layout/gridview.html  
https://github.com/codepath/android_guides/wiki/Using-an-ArrayAdapter-with-ListView  

xml

    android:columnWidth="90dp"
    android:numColumns="auto_fit"
    android:verticalSpacing="10dp"
    android:horizontalSpacing="10dp"
    android:stretchMode="columnWidth"

tools library
https://developer.android.com/studio/write/tool-attributes.html

    xmlns:tools="http://schemas.android.com/tools"
    tools:text="test"

rename the variable once for all `shift` + `Fn` + `F6`  
Java class https://docs.oracle.com/javase/tutorial/java/concepts/class.html  
XML namespace https://en.wikipedia.org/wiki/XML_namespace#Namespace_names  
ArrayAdapter https://developer.android.com/reference/android/widget/ArrayAdapter.html?utm_source=udacity&utm_medium=course&utm_campaign=android_basics  



# Drawable
![density](https://github.com/dailiang18bb/Udacity_Android_Course/blob/master/Course3/Density.png)


# Multiple Constructors for Word Class

    public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImage;

    public Word(String defaultText, String miwokText) {
        mDefaultTranslation = defaultText;
        mMiwokTranslation = miwokText;
    }

    public Word(String defaultText, String miwokText, int mImageSrc) {
        this.mDefaultTranslation = defaultText;
        this.mMiwokTranslation = miwokText;
        this.mImage = mImageSrc;
    }
    }
    
Learn multiple-constructors for the java class, and learn the use of `super()` and `this()`
    
    public class Brick extends Rectangle {
    Color brickColor;

    public Brick(int newX, int newY, int newWidth, int newHeight) {
        super(newX, newY, newWidth, newHeight);
        brickColor = new Color(0, 128, 255);
    }

    public Brick(int newX, int newY) {
        this(newX, newY, 10, 10);
    }

    public Brick() {
        this(0, 0, 10, 10);
    }

    public void setColor(Color newColor) {
        brickColor = newColor;
    }

    public Color getColor() {
        return brickColor;
    }

    } // End Brick

Here we have used this keyword, both to distinguish (or identify) the member variables from the parameters and also to call the same class constructor.  
In CONSTRUCTOR 1, we have initialized the member variables this.name, this.marks and this.section with parameters name, marks and section.  
In CONSTRUCTOR 2, we are calling the CONSTRUCTOR 1 using this keyword.  
Similarly, in CONSTRUCTOR 3 also, we are calling the CONSTRUCTOR 1 using this keyword.  
http://java.meritcampus.com/core-java-topics/this-keyword-in-java-with-example-program

    // CONSTRUCTOR 1
    Student(String name, int marks, char section)
    {
        this.name = name;
        this.marks = marks;
        this.section = section;
    }
    // CONSTRUCTOR 2
    Student(String name, int marks)
    {
        this(name, marks, 'A');
    }
    // CONSTRUCTOR 3
    Student(String name)
    {
        this(name, 0, 'A');
    }
