package com.tencent.p014mm.plugin.appbrand.jsruntime;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.d0$$a */
public final /* synthetic */ class d0$$a implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ int f11782a;

    /* renamed from: b */
    public final /* synthetic */ String f11783b;

    public /* synthetic */ d0$$a(int i, String str) {
        this.f11782a = i;
        this.f11783b = str;
    }

    public final void onReceiveValue(Object obj) {
        int i = this.f11782a;
        Log.m105925i("Luggage.NativeTransLogic", "initNativeTransComponentId componentId:%d, appId:%s, typeof ntrans:%s", Integer.valueOf(i), this.f11783b, (String) obj);
    }
}
