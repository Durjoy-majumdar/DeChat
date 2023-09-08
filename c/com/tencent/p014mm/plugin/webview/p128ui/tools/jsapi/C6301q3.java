package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.model.C6066y;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.q3 */
public class C6301q3 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C6066y f23141d;

    public C6301q3(MsgHandler msgHandler, C6066y yVar) {
        this.f23141d = yVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f23141d);
    }
}
