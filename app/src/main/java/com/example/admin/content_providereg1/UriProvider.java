package com.example.admin.content_providereg1;

import android.net.Uri;

/**
 * Created by Admin on 1/31/2017.
 */
//this file will be exposed to outside world
    //URI-Uniform Resource Identifier
    //declare column name and prepare URIs for your table
public class UriProvider {

    public static final String _ID = "_id";//integer
    public static final String Name = "sanme";//string
    public static final String Sub = "ssub";//string

    //prepare URI for student information table

    public static final Uri STUDENT_URI =
            Uri.parse("content://com.techpalle.android/studenttable");
}
