    <EditText
            android:id="@+id/name_EditView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:hint="NAME"
            android:inputType="textCapWords"/>

_________


    EditText getNameEditView = (EditText) findViewById(R.id.name_EditView);
    return getNameEditView.getText().toString();
    
______________
    
        Toast.makeText(getApplication(), R.string.increment_warning_msg, Toast.LENGTH_LONG).show();

    
