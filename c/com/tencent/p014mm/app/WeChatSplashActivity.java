package com.tencent.p014mm.app;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.splash.SplashActivity;
import wc3.C78537k0;

/* renamed from: com.tencent.mm.app.WeChatSplashActivity */
public class WeChatSplashActivity extends SplashActivity {
    public Resources getResources() {
        return super.getResources();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 26 && !MMActivityController.m163190m()) {
            getWindow().setNavigationBarColor(getResources().getColor(C0966R.color.f2954aa));
        }
    }

    public void onPause() {
        C78537k0.f230022b = true;
        super.onPause();
    }
}
