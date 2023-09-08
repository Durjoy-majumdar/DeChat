package p284zb;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.debugger.C81695a0;
import com.tencent.p014mm.plugin.appbrand.debugger.C81738h0;
import com.tencent.p014mm.plugin.appbrand.debugger.C81740p;
import com.tencent.p014mm.plugin.appbrand.debugger.C81743t;
import com.tencent.p014mm.plugin.appbrand.debugger.C81745v;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83133y6;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p1044ub.C90629b;
import p284zb.C91635f;
import te3.hw4;
import te3.ow4;

/* renamed from: zb.s */
public class C91655s<SERVICE extends C91635f> extends C91640i<SERVICE> implements C81740p {

    /* renamed from: j */
    public static final C90629b f262634j = new C91657b((C91656a) null);

    /* renamed from: h */
    public C81743t f262635h;

    /* renamed from: i */
    public C81745v f262636i;

    /* renamed from: zb.s$b */
    public static final class C91657b implements C90629b {
        public C91657b(C91656a aVar) {
        }
    }

    public C91655s(SERVICE service) {
        super(service);
        mo124765a0(C81740p.class, this);
    }

    /* renamed from: D0 */
    public void mo120898D0(AppBrandRuntime appBrandRuntime) {
        super.mo120898D0(appBrandRuntime);
        ((C91635f) mo124764Z()).mo114842M();
        C81743t tVar = new C81743t();
        this.f262635h = tVar;
        tVar.mo114110b((C91635f) mo124764Z(), ((C91635f) mo124764Z()).getRuntime().mo113036W().f234797A);
        this.f262635h.f239902x = ((C91635f) mo124764Z()).getRuntime().mo113036W().f234799C;
        this.f262636i.mo114117x(this.f262635h);
    }

    /* renamed from: G0 */
    public boolean mo122605G0(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "{}";
        }
        C81695a0 a0Var = this.f262636i.f239914h;
        a0Var.getClass();
        hw4 hw4 = new hw4();
        hw4.f183563e = i;
        hw4.f183562d = str;
        a0Var.mo114052h(C81738h0.m100298d(hw4, a0Var.f239778b, "callInterfaceResult"));
        return true;
    }

    /* renamed from: H0 */
    public boolean mo122606H0(String str, String str2, int i) {
        String str3;
        String str4 = "{}";
        if (TextUtils.isEmpty(str2)) {
            str2 = str4;
        }
        Log.m105919d("Luggage.MPRemoteDebugServiceLogic", "dispatch, event: %s, data size: %s, srcId: %d", str, Integer.valueOf(str2.length()), Integer.valueOf(i));
        C81745v vVar = this.f262636i;
        vVar.f239911e = str;
        if (!TextUtils.isEmpty(str2)) {
            str4 = str2;
        }
        Object[] objArr = new Object[6];
        objArr[0] = "WeixinJSBridge";
        objArr[1] = "WeixinJSBridge";
        objArr[2] = str;
        objArr[3] = str4;
        if (i == 0) {
            str3 = "undefined";
        } else {
            str3 = i + "";
        }
        objArr[4] = str3;
        objArr[5] = C83133y6.m101969b();
        vVar.evaluateJavascript(String.format("typeof %s !== 'undefined' && %s.subscribeHandler(\"%s\", %s, %s, %s)", objArr), (ValueCallback<String>) null);
        return true;
    }

    /* renamed from: I */
    public void mo114091I(String str) {
        Log.m105919d("Luggage.MPRemoteDebugServiceLogic", "RemoteDebugInfo %s", str);
        ow4 ow4 = new ow4();
        ow4.f184718e = ((C91635f) mo124764Z()).mo114341l0().getComponentId();
        ow4.f184717d = str;
        this.f262636i.f239914h.mo114052h(C81738h0.m100298d(ow4, this.f262635h, "domEvent"));
    }

    /* renamed from: Q */
    public String mo114093Q() {
        JSONObject k0 = ((C91635f) mo124764Z()).mo114340k0();
        return String.format("var __wxConfig = %s;\nvar __wxIndexPage = \"%s\"", new Object[]{k0.toString(), ((C91635f) mo124764Z()).getRuntime().mo113008F().f239599G});
    }

    /* renamed from: e0 */
    public C83165i mo120919e0() {
        C81745v vVar = new C81745v();
        this.f262636i = vVar;
        return vVar;
    }

    /* renamed from: g */
    public boolean mo114094g(String str) {
        return false;
    }

    /* renamed from: n0 */
    public final boolean mo125524n0() {
        return false;
    }

    /* renamed from: q0 */
    public boolean mo123167q0() {
        return true;
    }

    /* renamed from: r0 */
    public boolean mo120921r0() {
        return false;
    }

    /* renamed from: v0 */
    public void mo120923v0() {
        ((C91635f) mo124764Z()).mo114336g0();
    }

    /* renamed from: x0 */
    public void mo120924x0() {
    }

    /* renamed from: z0 */
    public void mo120926z0() {
        super.mo120926z0();
        this.f262636i.f239916j.bringToFront();
    }
}
