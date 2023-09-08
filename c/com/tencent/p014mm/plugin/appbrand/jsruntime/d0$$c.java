package com.tencent.p014mm.plugin.appbrand.jsruntime;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.d0$$c */
public final /* synthetic */ class d0$$c implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ int f11786a;

    /* renamed from: b */
    public final /* synthetic */ int f11787b;

    /* renamed from: c */
    public final /* synthetic */ String f11788c;

    public /* synthetic */ d0$$c(int i, int i2, String str) {
        this.f11786a = i;
        this.f11787b = i2;
        this.f11788c = str;
    }

    public final void onReceiveValue(Object obj) {
        int i = this.f11786a;
        int i2 = this.f11787b;
        Log.m105925i("Luggage.NativeTransLogic", "initNativeTransServiceId, serviceId:%d, componentId:%d, appId:%s, typeof ntrans:%s", Integer.valueOf(i), Integer.valueOf(i2), this.f11788c, (String) obj);
    }
}
