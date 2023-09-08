package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import f40.C86709a0;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.b2 */
public class C6207b2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C117747y f22908d;

    public C6207b2(MsgHandler msgHandler, C117747y yVar) {
        this.f22908d = yVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f22908d);
    }
}
