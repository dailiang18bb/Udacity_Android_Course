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
    
    Toast toast = new Toast(getApplicationContext());
    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
    toast.setDuration(Toast.LENGTH_LONG);
    toast.setView(layout);
    toast.show();

    
