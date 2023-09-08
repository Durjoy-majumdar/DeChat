package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.JsApiShowOpenIMContactProfile;
import p239sv.C77793t;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.i3 */
public final class C6496i3 implements C77793t {

    /* renamed from: a */
    public final /* synthetic */ C1256g<Bundle> f23592a;

    /* renamed from: b */
    public final /* synthetic */ JsApiShowOpenIMContactProfile.C6399a f23593b;

    /* renamed from: c */
    public final /* synthetic */ C89779i0 f23594c;

    public C6496i3(C1256g<Bundle> gVar, JsApiShowOpenIMContactProfile.C6399a aVar, C89779i0 i0Var) {
        this.f23592a = gVar;
        this.f23593b = aVar;
        this.f23594c = i0Var;
    }

    public final void onResult(boolean z, String str, String str2) {
        String str3;
        if (z) {
            str3 = "ok";
        } else {
            str3 = "fail_" + str;
        }
        C1256g<Bundle> gVar = this.f23592a;
        if (gVar != null) {
            gVar.mo894a(this.f23593b.mo7428a(str3, str2));
        }
        this.f23594c.dismiss();
    }
}
