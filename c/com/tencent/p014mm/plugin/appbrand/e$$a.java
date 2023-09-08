package com.tencent.p014mm.plugin.appbrand;

import android.content.Context;
import java.util.Locale;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.appbrand.e$$a */
public final /* synthetic */ class e$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f10898d;

    /* renamed from: e */
    public final /* synthetic */ int f10899e;

    public /* synthetic */ e$$a(Context context, int i) {
        this.f10898d = context;
        this.f10899e = i;
    }

    public final void run() {
        Context context = this.f10898d;
        int i = this.f10899e;
        C76701a.makeText(context, (CharSequence) String.format(Locale.ENGLISH, "setV8MinimalCodeLength:%d", new Object[]{Integer.valueOf(i)}), 0).show();
    }
}
