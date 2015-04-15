package com.applusform.korquiz;

import org.mospi.moml.framework.pub.core.MOMLFragmentActivity;
import android.os.Bundle;

public class MainActivity extends MOMLFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadApplication("moml/applicationInfo.xml");
    }
}
