package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82841n6;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.m6 */
public class C82643m6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f241804d;

    public C82643m6(C82841n6.C82842a aVar, Context context) {
        this.f241804d = context;
    }

    public void run() {
        Context context = this.f241804d;
        C75026b.m89951a((Activity) context, context.getString(C0966R.string.cph));
    }
}
