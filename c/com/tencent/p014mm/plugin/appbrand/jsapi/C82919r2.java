package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p225rc.C48016e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.r2 */
public class C82919r2 extends C82374e {

    /* renamed from: e */
    public C82381f f242406e;

    /* renamed from: f */
    public String f242407f;

    /* renamed from: g */
    public Map<String, Object> f242408g;

    /* renamed from: h */
    public int f242409h;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.r2$a */
    public class C82920a implements C82381f.C82383b {

        /* renamed from: a */
        public final /* synthetic */ C40482o f242410a;

        public C82920a(C40482o oVar) {
            this.f242410a = oVar;
        }

        /* renamed from: a */
        public void mo114785a(String str) {
        }

        public void proceed() {
            C82919r2.this.mo115157g(this.f242410a);
        }
    }

    /* renamed from: g */
    public final void mo115157g(C40482o oVar) {
        if (oVar == this.f242406e.getJsRuntime()) {
            this.f242406e.mo109652f(mo114779e(), mo115160j(), this.f242409h);
        } else {
            C83133y6.m101968a(oVar, mo114779e(), mo115160j(), this.f242409h);
        }
    }

    /* renamed from: h */
    public void mo115158h() {
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
            Objects.requireNonNull(this.f242406e);
        }
        C82381f fVar = this.f242406e;
        if (fVar != null && fVar.isRunning()) {
            mo115159i(this.f242406e.getJsRuntime());
        }
    }

    /* renamed from: i */
    public void mo115159i(C40482o oVar) {
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
            Objects.requireNonNull(this.f242406e);
            Objects.requireNonNull(oVar);
        }
        C82381f fVar = this.f242406e;
        if (fVar != null) {
            if (oVar == null) {
                oVar = fVar.getJsRuntime();
            }
            if (this.f242406e.mo109648b(mo114779e(), oVar)) {
                C82381f.C82384c interceptor = this.f242406e.getInterceptor();
                if (interceptor == null) {
                    mo115157g(oVar);
                } else {
                    interceptor.mo114219c(this, oVar, new C82920a(oVar));
                }
            }
        }
    }

    /* renamed from: j */
    public String mo115160j() {
        String str = this.f242407f;
        if (str != null) {
            return str;
        }
        Map<String, Object> map = this.f242408g;
        if (map == null) {
            return null;
        }
        C48016e.m53378d(map);
        return new JSONObject(this.f242408g).toString();
    }

    /* renamed from: k */
    public C82919r2 mo115161k(C82381f fVar) {
        if (fVar == null) {
            return this;
        }
        this.f242406e = fVar;
        this.f242409h = 0;
        return this;
    }

    /* renamed from: l */
    public C82919r2 mo115162l(C82381f fVar, int i) {
        mo115161k(fVar);
        this.f242409h = i;
        return this;
    }

    /* renamed from: m */
    public C82919r2 mo115163m(String str) {
        this.f242407f = str;
        return this;
    }

    /* renamed from: n */
    public C82919r2 mo115164n(String str, Object obj) {
        if (this.f242408g == null) {
            this.f242408g = new HashMap();
        }
        this.f242408g.put(str, obj);
        return this;
    }

    /* renamed from: o */
    public C82919r2 mo115165o(Map<String, Object> map) {
        if (map == null) {
            return this;
        }
        C48016e.m53378d(map);
        this.f242408g = map;
        return this;
    }
}
