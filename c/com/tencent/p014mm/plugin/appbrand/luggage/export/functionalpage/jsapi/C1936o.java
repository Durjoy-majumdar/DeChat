package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import nj3.C76879j;
import p170ic.C87687a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.o */
public final class C1936o extends C87413o implements C32226l<MMActivity, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C1937p f11815d;

    /* renamed from: e */
    public final /* synthetic */ C81879g f11816e;

    /* renamed from: f */
    public final /* synthetic */ int f11817f;

    /* renamed from: g */
    public final /* synthetic */ String f11818g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1936o(C1937p pVar, C81879g gVar, int i, String str) {
        super(1);
        this.f11815d = pVar;
        this.f11816e = gVar;
        this.f11817f = i;
        this.f11818g = str;
    }

    public Object invoke(Object obj) {
        MMActivity mMActivity = (MMActivity) obj;
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        mMActivity.mmSetOnActivityResultCallback(new C1935n(this.f11816e, this.f11817f, this.f11815d, mMActivity));
        C76879j.m92723Q(mMActivity, MMApplicationContext.getContext().getString(C0966R.string.a3h), MMApplicationContext.getContext().getString(C0966R.string.ln6), true, false, (DialogInterface.OnCancelListener) null);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f11818g);
        C13598b0 b0Var = C13598b0.f38549a;
        C88144b.m109796n(mMActivity, "webview", ".ui.tools.WebViewUI", intent, C87687a.m109085a(this.f11815d), true);
        return C13598b0.f38549a;
    }
}
