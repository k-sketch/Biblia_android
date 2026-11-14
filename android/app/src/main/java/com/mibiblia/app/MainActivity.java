package com.mibiblia.app;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // En teléfonos (ancho menor a 480 dp) solo se permite vertical; en tablets, cualquier orientación.
        if (getResources().getConfiguration().smallestScreenWidthDp < 480) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);
        }
        super.onCreate(savedInstanceState);
    }
}
