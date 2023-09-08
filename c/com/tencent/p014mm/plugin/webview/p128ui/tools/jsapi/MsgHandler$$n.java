package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.model.C6025b0;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$n */
public class MsgHandler$$n implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C6025b0 f22822d;

    public MsgHandler$$n(MsgHandler msgHandler, C6025b0 b0Var) {
        this.f22822d = b0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f22822d);
    }
}
