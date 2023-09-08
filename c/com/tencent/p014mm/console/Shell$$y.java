package com.tencent.p014mm.console;

import android.content.Intent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.console.Shell$$y */
public class Shell$$y implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        int intExtra = intent.getIntExtra(FirebaseAnalytics.C113379b.LEVEL, 0);
        Log.m105929w("MicroMsg.Shell", "kiro set Log.level=%d", Integer.valueOf(Log.getLogLevel()));
        Log.setLevel(intExtra, false);
    }
}
