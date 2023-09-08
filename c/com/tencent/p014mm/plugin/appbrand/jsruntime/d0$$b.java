package com.tencent.p014mm.plugin.appbrand.jsruntime;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.d0$$b */
public final /* synthetic */ class d0$$b implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ int f11784a;

    /* renamed from: b */
    public final /* synthetic */ String f11785b;

    public /* synthetic */ d0$$b(int i, String str) {
        this.f11784a = i;
        this.f11785b = str;
    }

    public final void onReceiveValue(Object obj) {
        int i = this.f11784a;
        Log.m105925i("Luggage.NativeTransLogic", "enableXwebNativeTrans componentId:%s, appId:%s, typeof ntrans:%s", Integer.valueOf(i), this.f11785b, (String) obj);
    }
}
