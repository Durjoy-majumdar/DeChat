package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.DialogInterface;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.j3 */
public final class C6501j3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23608d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23609e;

    /* renamed from: f */
    public final /* synthetic */ String f23610f;

    /* renamed from: g */
    public final /* synthetic */ boolean f23611g;

    public C6501j3(C13855j jVar, C13851h1 h1Var, String str, boolean z) {
        this.f23608d = jVar;
        this.f23609e = h1Var;
        this.f23610f = str;
        this.f23611g = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        JsApiShowOpenIMContactProfile.f23361d.mo7423e(this.f23608d, this.f23609e, this.f23610f, this.f23611g);
    }
}
