package po0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONException;
import org.json.JSONObject;
import p975hd.C87476a;

/* renamed from: po0.a */
public final class C89392a implements C87476a {

    /* renamed from: a */
    public int f257401a;

    /* renamed from: b */
    public String f257402b = "";

    /* renamed from: c */
    public C81823b f257403c;

    /* renamed from: po0.a$a */
    public static final class C89393a extends C82919r2 {
        private static final int CTRL_INDEX = 704;
        private static final String NAME = "onXWebCastingInterrupt";
    }

    /* renamed from: po0.a$b */
    public static final class C89394b extends C82919r2 {
        private static final int CTRL_INDEX = 695;
        private static final String NAME = "onXWebCastingUserSelect";
    }

    /* renamed from: po0.a$c */
    public static final class C89395c extends C82919r2 {
        private static final int CTRL_INDEX = 543;
        private static final String NAME = "onXWebVideoEnded";
    }

    /* renamed from: po0.a$d */
    public static final class C89396d extends C82919r2 {
        private static final int CTRL_INDEX = 542;
        private static final String NAME = "onXWebVideoPause";
    }

    /* renamed from: po0.a$e */
    public static final class C89397e extends C82919r2 {
        private static final int CTRL_INDEX = 541;
        private static final String NAME = "onXWebVideoPlay";
    }

    /* renamed from: po0.a$f */
    public static final class C89398f extends C82919r2 {
        private static final int CTRL_INDEX = 547;
        private static final String NAME = "onXWebVideoProgress";
    }

    /* renamed from: po0.a$g */
    public static final class C89399g extends C82919r2 {
        private static final int CTRL_INDEX = 544;
        private static final String NAME = "onXWebVideoTimeUpdate";
    }

    /* renamed from: po0.a$h */
    public static final class C89400h extends C82919r2 {
        private static final int CTRL_INDEX = 540;
        private static final String NAME = "onXWebVideoWaiting";
    }

    /* renamed from: po0.a$i */
    public static final class C89401i extends C82919r2 {
        private static final int CTRL_INDEX = 697;
        private static final String NAME = "onXWebDLNACastingStateChange";
    }

    /* renamed from: a */
    public final void mo123727a(C82919r2 r2Var, JSONObject jSONObject) {
        if (r2Var != null) {
            if (!(r2Var instanceof C89399g) && !(r2Var instanceof C89398f)) {
                Log.m105925i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "dispatch event:%s, data:%s", r2Var.mo114779e(), jSONObject.toString());
            }
            C82919r2 m = r2Var.mo115163m(jSONObject.toString());
            C81823b bVar = this.f257403c;
            if (bVar != null) {
                C87412m.m108591d(bVar);
                C82381f g = bVar.mo62544g();
                if (g == null) {
                    return;
                }
                if (g instanceof C81925i2) {
                    C81925i2 i2Var = (C81925i2) g;
                    C87412m.m108591d(m);
                    i2Var.mo109669n(m, (int[]) null);
                    C83780d1 l0 = i2Var.mo114341l0();
                    if (l0 != null) {
                        l0.mo109669n(m, (int[]) null);
                    }
                } else if (g instanceof C83780d1) {
                    C83780d1 d1Var = (C83780d1) g;
                    C87412m.m108591d(m);
                    d1Var.mo109669n(m, (int[]) null);
                    C81925i2 O0 = d1Var.mo116160O0();
                    if (O0 != null) {
                        O0.mo109669n(m, (int[]) null);
                    }
                } else {
                    g.mo109669n(m, (int[]) null);
                }
            }
        }
    }

    /* renamed from: b */
    public final JSONObject mo123728b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", this.f257402b);
        return jSONObject;
    }

    /* renamed from: c */
    public void mo123729c() {
        try {
            JSONObject b = mo123728b();
            b.put("timeStamp", System.currentTimeMillis());
            b.put("type", "DLNA");
            mo123727a(new C89400h(), b);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "OnXWebVideoWaiting fail", e);
        }
    }

    /* renamed from: d */
    public void mo123730d(boolean z) {
        Log.m105924i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onXWebCastingUserSelect: ");
        try {
            JSONObject b = mo123728b();
            b.put("type", "DLNA");
            b.put("state", z ? "success" : "fail");
            mo123727a(new C89394b(), b);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "OnXWebCastingUserSelect fail", e);
        }
    }

    /* renamed from: e */
    public void mo123731e(boolean z) {
        String str = z ? "success" : "fail";
        Log.m105924i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onXWebDLNACastingStateChange: status = " + str);
        try {
            JSONObject b = mo123728b();
            b.put("status", str);
            mo123727a(new C89401i(), b);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onXWebDLNACastingStateChange fail", e);
        }
    }
}
