package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.model.C6066y;
import f40.C86709a0;
import ob0.C11385n;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.s3 */
public class C6312s3 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C6066y f23180d;

    /* renamed from: e */
    public final /* synthetic */ C11385n f23181e;

    public C6312s3(MsgHandler msgHandler, C6066y yVar, C11385n nVar) {
        this.f23180d = yVar;
        this.f23181e = nVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f23180d);
        C86709a0.m107524d().mo123470p(1393, this.f23181e);
    }
}
