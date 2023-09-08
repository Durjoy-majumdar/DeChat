package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import p749xh.C53352w2;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.d2 */
public class C6225d2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53352w2 f22959d;

    /* renamed from: e */
    public final /* synthetic */ String f22960e;

    /* renamed from: f */
    public final /* synthetic */ String f22961f;

    /* renamed from: g */
    public final /* synthetic */ C13851h1 f22962g;

    /* renamed from: h */
    public final /* synthetic */ JsapiPermissionWrapper f22963h;

    /* renamed from: i */
    public final /* synthetic */ MsgHandler f22964i;

    public C6225d2(MsgHandler msgHandler, C53352w2 w2Var, String str, String str2, C13851h1 h1Var, JsapiPermissionWrapper jsapiPermissionWrapper) {
        this.f22964i = msgHandler;
        this.f22959d = w2Var;
        this.f22960e = str;
        this.f22961f = str2;
        this.f22962g = h1Var;
        this.f22963h = jsapiPermissionWrapper;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C115669n.INSTANCE.mo160131h(14217, this.f22959d.field_appId, 5, this.f22960e, this.f22961f, 3);
        this.f22964i.mo7174R5(this.f22962g, this.f22963h);
        dialogInterface.dismiss();
    }
}
