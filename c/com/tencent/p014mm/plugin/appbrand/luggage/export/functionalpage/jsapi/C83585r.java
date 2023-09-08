package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1709k5;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import nj3.C76879j;
import p170ic.C87687a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.r */
public final class C83585r extends C1709k5 {
    @Deprecated
    public static final int CTRL_INDEX = 406;
    @Deprecated
    public static final String NAME = "private_openUrl";

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.r$a */
    public static final class C83586a extends C87413o implements C32226l<MMActivity, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Intent f244147d;

        /* renamed from: e */
        public final /* synthetic */ C83585r f244148e;

        /* renamed from: f */
        public final /* synthetic */ C82554k f244149f;

        /* renamed from: g */
        public final /* synthetic */ int f244150g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83586a(Intent intent, C83585r rVar, C82554k kVar, int i) {
            super(1);
            this.f244147d = intent;
            this.f244148e = rVar;
            this.f244149f = kVar;
            this.f244150g = i;
        }

        public Object invoke(Object obj) {
            MMActivity mMActivity = (MMActivity) obj;
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            mMActivity.mmSetOnActivityResultCallback(new C83584q(this.f244149f, this.f244150g, this.f244148e, mMActivity));
            C76879j.m92723Q(mMActivity, MMApplicationContext.getContext().getString(C0966R.string.a3h), MMApplicationContext.getContext().getString(C0966R.string.ln6), true, false, (DialogInterface.OnCancelListener) null);
            C88144b.m109796n(mMActivity, "webview", ".ui.tools.WebViewUI", this.f244147d, C87687a.m109085a(this.f244148e), true);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: w */
    public void mo1704w(Context context, Intent intent, C82554k kVar, int i) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(kVar, "component");
        C83571d.m102592a(context, new C83586a(intent, this, kVar, i));
    }
}
