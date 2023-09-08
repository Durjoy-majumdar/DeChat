package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.d1 */
public class C1668d1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f11341d;

    public C1668d1(JsApiAddNativeDownloadTask jsApiAddNativeDownloadTask, Context context) {
        this.f11341d = context;
    }

    public void run() {
        Context context = this.f11341d;
        C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f8t), 0).show();
    }
}
