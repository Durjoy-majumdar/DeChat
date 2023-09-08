package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.r1 */
public class C6305r1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f23154d;

    /* renamed from: e */
    public final /* synthetic */ String f23155e;

    /* renamed from: f */
    public final /* synthetic */ String f23156f;

    /* renamed from: g */
    public final /* synthetic */ C13851h1 f23157g;

    /* renamed from: h */
    public final /* synthetic */ JsapiPermissionWrapper f23158h;

    /* renamed from: i */
    public final /* synthetic */ MsgHandler f23159i;

    public C6305r1(MsgHandler msgHandler, String str, String str2, String str3, C13851h1 h1Var, JsapiPermissionWrapper jsapiPermissionWrapper) {
        this.f23159i = msgHandler;
        this.f23154d = str;
        this.f23155e = str2;
        this.f23156f = str3;
        this.f23157g = h1Var;
        this.f23158h = jsapiPermissionWrapper;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C115669n.INSTANCE.mo160131h(14217, this.f23154d, 5, this.f23155e, this.f23156f, 3);
        this.f23159i.mo7229u5(this.f23157g, this.f23158h);
        dialogInterface.dismiss();
    }
}
