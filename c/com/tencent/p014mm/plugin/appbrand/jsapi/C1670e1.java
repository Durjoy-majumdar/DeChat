package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.e1 */
public class C1670e1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f11345d;

    public C1670e1(JsApiAddNativeDownloadTask jsApiAddNativeDownloadTask, Context context) {
        this.f11345d = context;
    }

    public void run() {
        Context context = this.f11345d;
        C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f8x), 0).show();
    }
}
