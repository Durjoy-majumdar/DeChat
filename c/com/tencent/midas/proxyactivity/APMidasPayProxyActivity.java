package com.tencent.midas.proxyactivity;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.plugin.APPluginProxyActivity;

public class APMidasPayProxyActivity extends APPluginProxyActivity {
    public void onActivityResult(int i, int i2, Intent intent) {
        APLog.m161214i("APMidasPayProxyActivity", "onActivityResult requestCode:" + i + " resultCode:" + i2);
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
