package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.model.C6036h0;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$s */
public class MsgHandler$$s implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C6036h0 f22857d;

    public MsgHandler$$s(MsgHandler msgHandler, C6036h0 h0Var) {
        this.f22857d = h0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f22857d);
    }
}
