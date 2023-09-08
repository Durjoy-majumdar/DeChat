package gk0;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gt0.C87327c0;
import gy3.C8480h;
import gy3.C87412m;
import lp3.C88633e;
import lp3.C88643g;
import mp3.C88819d;
import org.json.JSONObject;
import te3.C90429p4;
import te3.C90437rw3;
import te3.gp4;
import zq0.C91891k0;
import zq0.C91893l0;

/* renamed from: gk0.e */
public class C87237e extends C82268c<C83780d1> {
    private static final int CTRL_INDEX = 209;
    private static final String NAME = "getPhoneNumber";

    /* renamed from: gk0.e$a */
    public static final class C87238a {

        /* renamed from: a */
        public final C90437rw3 f252926a;

        /* renamed from: b */
        public final C90429p4 f252927b;

        /* renamed from: c */
        public final String f252928c;

        /* renamed from: d */
        public final gp4 f252929d;

        public C87238a(C90437rw3 rw32, C90429p4 p4Var, String str, gp4 gp4) {
            C87412m.m108594g(str, "applyWording");
            this.f252926a = rw32;
            this.f252927b = p4Var;
            this.f252928c = str;
            this.f252929d = gp4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C87238a)) {
                return false;
            }
            C87238a aVar = (C87238a) obj;
            return C87412m.m108589b(this.f252926a, aVar.f252926a) && C87412m.m108589b(this.f252927b, aVar.f252927b) && C87412m.m108589b(this.f252928c, aVar.f252928c) && C87412m.m108589b(this.f252929d, aVar.f252929d);
        }

        public int hashCode() {
            C90437rw3 rw32 = this.f252926a;
            int i = 0;
            int hashCode = (rw32 == null ? 0 : rw32.hashCode()) * 31;
            C90429p4 p4Var = this.f252927b;
            int hashCode2 = (((hashCode + (p4Var == null ? 0 : p4Var.hashCode())) * 31) + this.f252928c.hashCode()) * 31;
            gp4 gp4 = this.f252929d;
            if (gp4 != null) {
                i = gp4.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "Info(scopeInfo=" + this.f252926a + ", alertPrivacyInfo=" + this.f252927b + ", applyWording=" + this.f252928c + ", privacyProtectInfo=" + this.f252929d + ')';
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C83780d1 d1Var = (C83780d1) fVar;
        C87412m.m108594g(d1Var, "env");
        C87412m.m108594g(jSONObject2, "data");
        if (d1Var.getContext() == null || !(d1Var.getContext() instanceof Activity)) {
            Log.m105920e("MicroMsg.JsApiGetPhoneNumberNew", "env is null, return");
            d1Var.mo109647a(i2, mo115109j("fail"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiGetPhoneNumberNew", "getPhoneNumber data:%s", jSONObject.toString());
        d1Var.getContext();
        C91893l0 l0Var = C91893l0.f263119a;
        String appId = d1Var.getAppId();
        C87412m.m108593f(appId, "env.appId");
        synchronized (l0Var) {
            C91893l0.f263120b.put(appId, new C91891k0(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (String) null, (String) null, 268435455, (C8480h) null));
        }
        String optString = jSONObject2.optString("api_name", "webapi_getuserwxphone");
        boolean optBoolean = jSONObject2.optBoolean("with_credentials", true);
        C87327c0 c0Var = new C87327c0(d1Var.getContext());
        ((C88633e) C88643g.m110546d()).mo123061d(new C87242g(this, c0Var, d1Var)).mo123064p(new C87243h(this)).mo123064p(new C87244i(this, d1Var, optString, optBoolean)).mo123064p(new C87245j(this, d1Var, optString, optBoolean)).mo123064p(C87246k.f252945a).mo123062e(new C87248m(d1Var, this, c0Var)).mo114039c(C88819d.LOGIC, new C87250n(d1Var, i2, this)).mo123065b(new C87251o(d1Var, i2, this)).mo123066f(C88819d.f256219UI, new C87252p(d1Var, c0Var));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r3 = r3.f252927b;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo121654w(com.tencent.p014mm.plugin.appbrand.page.C83780d1 r2, gk0.C87237e.C87238a r3) {
        /*
            r1 = this;
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r2, r0)
            r2 = 1
            r0 = 0
            if (r3 == 0) goto L_0x0012
            te3.p4 r3 = r3.f252927b
            if (r3 == 0) goto L_0x0012
            boolean r3 = r3.f259729d
            if (r3 != r2) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gk0.C87237e.mo121654w(com.tencent.mm.plugin.appbrand.page.d1, gk0.e$a):boolean");
    }
}
