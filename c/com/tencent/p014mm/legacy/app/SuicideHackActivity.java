package com.tencent.p014mm.legacy.app;

import android.os.Bundle;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.legacy.app.SuicideHackActivity */
class SuicideHackActivity extends HellActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("WxSplash.SuicideHackActivity", "onCreate");
        finish();
    }
}
