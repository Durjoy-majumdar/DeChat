package p547hb;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: hb.d */
public class C87465d extends C83820i0 {

    /* renamed from: L */
    public C83780d1 f253442L;

    /* renamed from: M */
    public String f253443M;

    public C87465d(Context context, C83849m0 m0Var) {
        super(context, m0Var);
        setForceDisableMeasureCache(true);
        Log.m105924i("MicroMsg.WAGamePage", "hy: WAGamePage on create");
    }

    /* renamed from: B */
    public void mo114316B(long j, String str, C83817h4 h4Var) {
        this.f253443M = str;
        this.f253442L.mo116169X0(j, str, h4Var);
    }

    /* renamed from: D */
    public void mo116224D() {
        super.mo116224D();
        this.f253442L.mo116171Z0();
    }

    /* renamed from: E */
    public void mo116225E() {
        super.mo116225E();
        this.f253442L.mo116174c1();
    }

    /* renamed from: F */
    public void mo116226F() {
        super.mo116226F();
        setEnableGesture(false);
        this.f253442L.mo116175d1();
    }

    /* renamed from: N */
    public void mo116228N(String str, C83780d1 d1Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public void mo116229f() {
        this.f253442L.mo114329F();
    }

    /* renamed from: g */
    public View mo114317g() {
        C83780d1 p = getContainer().mo116364p(this.f253443M);
        this.f253442L = p;
        return p.f244552D;
    }

    public C83780d1 getCurrentPageView() {
        return this.f253442L;
    }

    public String getCurrentUrl() {
        return this.f253443M;
    }

    /* renamed from: h */
    public boolean mo116296h(long j, String str, C83817h4 h4Var, JSONObject jSONObject) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: n */
    public void mo116232n(String str, String str2, int[] iArr) {
        this.f253442L.mo109652f(str, str2, 0);
    }

    /* renamed from: s */
    public C83780d1 mo116233s(int i, boolean z) {
        if (this.f253442L.getComponentId() == i) {
            return this.f253442L;
        }
        return null;
    }

    public void setCurrentUrl(String str) {
        this.f253443M = str;
    }

    public void setInitialUrl(String str) {
        this.f253443M = str;
    }

    /* renamed from: v */
    public boolean mo116235v(String str) {
        return true;
    }
}
