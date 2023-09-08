package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import lg3.C76697h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.a2 */
public class C6201a2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MsgHandler f22896d;

    public C6201a2(MsgHandler msgHandler) {
        this.f22896d = msgHandler;
    }

    public void run() {
        Context context = this.f22896d.f22697d;
        C76701a.makeText(context, (CharSequence) C76697h.m92348a(context).getString(C0966R.string.f8u), 0).show();
    }
}
