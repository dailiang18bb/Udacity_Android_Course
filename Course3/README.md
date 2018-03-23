
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
