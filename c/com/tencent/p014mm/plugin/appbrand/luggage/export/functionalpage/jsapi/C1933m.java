package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import android.content.Intent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C1715u;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import org.json.JSONObject;
import p170ic.C87687a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.m */
public final class C1933m extends C1715u {

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.m$a */
    public static final class C1934a extends C87413o implements C32226l<MMActivity, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C1933m f11807d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f11808e;

        /* renamed from: f */
        public final /* synthetic */ C82381f f11809f;

        /* renamed from: g */
        public final /* synthetic */ int f11810g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1934a(C1933m mVar, JSONObject jSONObject, C82381f fVar, int i) {
            super(1);
            this.f11807d = mVar;
            this.f11808e = jSONObject;
            this.f11809f = fVar;
            this.f11810g = i;
        }

        public Object invoke(Object obj) {
            MMActivity mMActivity = (MMActivity) obj;
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            mMActivity.mmSetOnActivityResultCallback(new C1932l(this.f11809f, this.f11810g, this.f11807d, mMActivity));
            Intent w = this.f11807d.mo1706w(this.f11808e);
            if (w == null) {
                C82381f fVar = this.f11809f;
                if (fVar != null) {
                    fVar.mo109647a(this.f11810g, this.f11807d.mo115109j("fail:invalid data"));
                }
                mMActivity.finish();
            } else {
                C88144b.m109795m(mMActivity, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", w, C87687a.m109085a(this.f11807d));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C83571d.m102592a(fVar != null ? fVar.getContext() : null, new C1934a(this, jSONObject, fVar, i));
    }
}
