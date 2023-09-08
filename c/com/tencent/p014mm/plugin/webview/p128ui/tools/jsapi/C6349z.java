package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.model.C6047m0;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.z */
public class C6349z implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C6047m0 f23257d;

    public C6349z(MsgHandler msgHandler, C6047m0 m0Var) {
        this.f23257d = m0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f23257d);
    }
}
