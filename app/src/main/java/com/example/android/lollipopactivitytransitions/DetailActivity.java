package com.example.android.lollipopactivitytransitions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.lollipopactivitytransitions.models.Contact;

/**
 * Created by Dell on 23-Nov-17.
 */

public class DetailActivity extends AppCompatActivity {


    public final static String ID = "ID";
    public Contact mContact;
    public TextView mName, mPhone, mEmail, mCity;
    public View mView;


    public static Intent newIntent(Context context){
        Intent intent = new Intent(context.getApplicationContext(), DetailActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mContact = Contact.getItem(getIntent().getIntExtra(ID, 0));
        mName = (TextView) findViewById(R.id.DETAILS_name);
        mName.setText(mContact.get(Contact.Field.NAME));
        mPhone = (TextView) findViewById(R.id.DETAILS_phone);
        mPhone.setText(mContact.get(Contact.Field.PHONE));
        mEmail = findViewById(R.id.DETAILS_email);
        mEmail.setText(mContact.get(Contact.Field.EMAIL));
        mCity = findViewById(R.id.DETAILS_city);
        mCity.setText(mContact.get(Contact.Field.CITY));
        mView = findViewById(R.id.DETAILS_circle);

    }
}
