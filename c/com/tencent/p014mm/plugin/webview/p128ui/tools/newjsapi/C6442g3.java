package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.JsApiShowOpenIMContactProfile;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import p239sv.C77792p;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.g3 */
public final class C6442g3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ JsApiShowOpenIMContactProfile.C6399a f23464d;

    /* renamed from: e */
    public final /* synthetic */ JsApiShowOpenIMContactProfile.JumpProfileData f23465e;

    /* renamed from: f */
    public final /* synthetic */ C1256g<Bundle> f23466f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6442g3(JsApiShowOpenIMContactProfile.C6399a aVar, JsApiShowOpenIMContactProfile.JumpProfileData jumpProfileData, C1256g<Bundle> gVar) {
        super(0);
        this.f23464d = aVar;
        this.f23465e = jumpProfileData;
        this.f23466f = gVar;
    }

    public Object invoke() {
        JsApiShowOpenIMContactProfile.C6399a aVar = this.f23464d;
        JsApiShowOpenIMContactProfile.JumpProfileData jumpProfileData = this.f23465e;
        C1256g<Bundle> gVar = this.f23466f;
        aVar.getClass();
        if (jumpProfileData != null) {
            Context context = MMApplicationContext.getContext();
            C89779i0 e = C89779i0.m112248e(context, context.getString(C0966R.string.gat), true, 3, (DialogInterface.OnCancelListener) null);
            e.setOnCancelListener(new C6490h3(((C77792p) C86312j.m106911c(C77792p.class)).mo107726AB(context, jumpProfileData.f23364d, 2, jumpProfileData.f23366f, new C6496i3(gVar, aVar, e)), gVar, aVar));
        } else if (gVar != null) {
            gVar.mo894a(aVar.mo7428a("fail_data_null", (String) null));
        }
        return C13598b0.f38549a;
    }
}
