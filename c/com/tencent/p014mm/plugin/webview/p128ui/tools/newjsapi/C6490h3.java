package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.JsApiShowOpenIMContactProfile;
import p239sv.C13782a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.h3 */
public final class C6490h3 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C13782a f23578d;

    /* renamed from: e */
    public final /* synthetic */ C1256g<Bundle> f23579e;

    /* renamed from: f */
    public final /* synthetic */ JsApiShowOpenIMContactProfile.C6399a f23580f;

    public C6490h3(C13782a aVar, C1256g<Bundle> gVar, JsApiShowOpenIMContactProfile.C6399a aVar2) {
        this.f23578d = aVar;
        this.f23579e = gVar;
        this.f23580f = aVar2;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f23578d.cancel();
        C1256g<Bundle> gVar = this.f23579e;
        if (gVar != null) {
            gVar.mo894a(this.f23580f.mo7428a("fail_cancel", (String) null));
        }
    }
}
