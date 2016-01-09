package com.lhf.test.mydagger2test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;


public class MainActivity extends Activity {
    private ApplicationComponent applicationComponent;

    @Inject
    User user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        applicationComponent = DaggerApplicationComponent
                .builder()
                .androidModule(new AndroidModule())
                .build();
        applicationComponent.inject(this);

        user.setName("lhf");
        user.setAge("27");
        Log.i("LHF",user.getName()+","+user.getAge());



    }
}
