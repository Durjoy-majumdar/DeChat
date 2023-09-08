package com.tencent.p014mm.plugin.webview.model;

import android.app.Activity;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.model.c1$$a */
public final /* synthetic */ class c1$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Activity f118080d;

    public /* synthetic */ c1$$a(Activity activity) {
        this.f118080d = activity;
    }

    public final void run() {
        Activity activity = this.f118080d;
        Log.m105924i("MicroMsg.SDKOauthUtil", "delayFish activity done");
        activity.finish();
    }
}
