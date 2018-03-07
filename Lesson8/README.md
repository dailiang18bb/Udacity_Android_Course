    <EditText
            android:id="@+id/name_EditView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:hint="NAME"
            android:inputType="textCapWords"/>



    EditText getNameEditView = (EditText) findViewById(R.id.name_EditView);
    return getNameEditView.getText().toString();
    
    
    
