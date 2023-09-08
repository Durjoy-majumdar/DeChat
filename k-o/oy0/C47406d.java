package oy0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.network.C81038d0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0;
import com.tencent.p014mm.plugin.brandservice.webprefetcher.debug.C40819a;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import gy3.C87412m;
import iy0.C46353a;
import java.util.HashMap;
import my0.C47140c;
import sx3.C26236u;
import z04.C112551y;

/* renamed from: oy0.d */
public final class C47406d extends C47140c<C81038d0> {

    /* renamed from: a */
    public final /* synthetic */ String f127185a;

    /* renamed from: b */
    public final /* synthetic */ String f127186b;

    /* renamed from: c */
    public final /* synthetic */ C46353a f127187c;

    public C47406d(String str, String str2, C46353a aVar) {
        this.f127185a = str;
        this.f127186b = str2;
        this.f127187c = aVar;
    }

    /* renamed from: a */
    public boolean mo63626a(Object obj, int i, HashMap hashMap) {
        C87412m.m108594g((C81038d0) obj, "connection");
        C87412m.m108594g(hashMap, "headers");
        C40819a.m44118d(hashMap, "fetchRes");
        if (i != 200) {
            return false;
        }
        this.f127187c.mo71770l().putAll(hashMap);
        this.f127187c.mo71770l().put("status", C26236u.m33719b(String.valueOf(i)));
        C40717k0.C40719b f = C40717k0.m43988f(hashMap);
        if (f == C40717k0.C40719b.UNKNOWN) {
            f = C40717k0.C40719b.JS;
        }
        this.f127187c.mo71784z(f, this.f127185a);
        return true;
    }

    /* renamed from: c */
    public void mo63628c(Object obj) {
        String str;
        C81038d0 d0Var = (C81038d0) obj;
        C87412m.m108594g(d0Var, "connection");
        boolean z = true;
        if (this.f127185a.length() > 0) {
            if (this.f127186b.length() <= 0) {
                z = false;
            }
            if (z) {
                String str2 = this.f127185a;
                if (C112551y.m153819s(this.f127186b, C113600ck.f339986i, false)) {
                    str = HttpWrapperBase.PROTOCAL_HTTPS + str2;
                } else {
                    str = HttpWrapperBase.PROTOCAL_HTTP + str2;
                }
                d0Var.mo112921e(FirebaseAnalytics.C113379b.ORIGIN, str);
                d0Var.mo112921e("referer", this.f127186b);
            }
        }
    }
}
