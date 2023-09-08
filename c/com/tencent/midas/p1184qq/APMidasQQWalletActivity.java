package com.tencent.midas.p1184qq;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.control.APMidasPayHelper;
import com.tencent.midas.plugin.APPluginInterfaceManager;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;

/* renamed from: com.tencent.midas.qq.APMidasQQWalletActivity */
public class APMidasQQWalletActivity extends HellActivity {
    private static final String TAG = "APMidasQQWalletActivity";

    private void handleIntent(Intent intent) {
        APLog.m161210d(TAG, "handleIntent get called!");
        try {
            APPluginInterfaceManager.initPluginInterface(this, APMidasPayHelper.MIDAS_PLUGIN_NAME, APMidasPayHelper.PKG_DISTRIBUTE, APMidasPayHelper.MED_DISTRIBUTE_HANDLE_QQ_WALLET_INTENT, new Object[]{this, intent});
        } catch (Exception e) {
            APLog.m161212e(TAG, "handleIntent got exception = " + e.toString());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            getIntent().getStringExtra("wxpay");
            try {
                requestWindowFeature(1);
                handleIntent(getIntent());
                finish();
            } catch (Throwable unused) {
                finish();
            }
        } catch (Exception unused2) {
            finish();
        }
    }
}
