package com.tencent.p014mm.feature.performance;

import android.graphics.BitmapFactory;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.feature.performance.t */
public class C1252t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f10309d;

    /* renamed from: e */
    public final /* synthetic */ BitmapFactory.Options f10310e;

    public C1252t(C80867u uVar, int i, BitmapFactory.Options options) {
        this.f10309d = i;
        this.f10310e = options;
    }

    public void run() {
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("WARNING: large bitmap decode \n(%s B), [w:%s, h:%s]", new Object[]{Integer.valueOf(this.f10309d), Integer.valueOf(this.f10310e.outWidth), Integer.valueOf(this.f10310e.outHeight)}), 1).show();
    }
}
