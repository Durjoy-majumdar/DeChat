package p747xb;

import android.view.ViewGroup;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82540i0;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C85004y;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C24564k0;
import gy3.C8480h;
import gy3.C87412m;
import p572jd.C87949e;
import p572jd.C87951l;

/* renamed from: xb.b */
public final class C91146b implements C84967l0.C84970c, C82531i.C82535d, C82531i.C82533b, C82531i.C82534c, C87949e {

    /* renamed from: d */
    public final C83780d1 f261360d;

    /* renamed from: e */
    public final C82540i0 f261361e = new C82540i0();

    /* renamed from: f */
    public int f261362f;

    /* renamed from: g */
    public C84967l0 f261363g;

    /* renamed from: h */
    public boolean f261364h;

    /* renamed from: i */
    public boolean f261365i = true;

    public C91146b(C83780d1 d1Var, C8480h hVar) {
        this.f261360d = d1Var;
    }

    /* renamed from: b */
    public void mo22089b() {
        if (this.f261364h && this.f261360d.mo116160O0() != null) {
            C82540i0 i0Var = this.f261361e;
            C81925i2 O0 = this.f261360d.mo116160O0();
            C87412m.m108593f(O0, "mPageView.service");
            i0Var.mo114873s(0, O0, this.f261360d, (Integer) null);
        }
        C84967l0 l0Var = this.f261363g;
        if (l0Var != null) {
            l0Var.mo117847e(this);
        }
        this.f261363g = null;
        C87951l lVar = C87951l.f254518a;
        C24564k0.m30737a(C87951l.f254519b).remove(this);
    }

    /* renamed from: c */
    public void mo22090c() {
        ViewGroup viewGroup = this.f261360d.f244552D;
        if (viewGroup != null) {
            C87412m.m108591d(viewGroup);
            C84967l0 e = C85004y.m104826e(viewGroup);
            this.f261363g = e;
            if (e != null) {
                e.mo117844a(this);
            }
            C87951l lVar = C87951l.f254518a;
            C87951l.f254519b.add(this);
        }
    }

    /* renamed from: d */
    public void mo117850d(boolean z) {
        this.f261364h = z;
        if (this.f261365i) {
            C82540i0 i0Var = this.f261361e;
            int i = z ? this.f261362f : 0;
            C81925i2 O0 = this.f261360d.mo116160O0();
            C87412m.m108593f(O0, "mPageView.service");
            i0Var.mo114873s(i, O0, this.f261360d, (Integer) null);
            return;
        }
        Log.m105924i("MicroMsg.AppBrandPageViewKeyboardHeightEmitter", "onKeyboardStateChanged been called, but interrupted");
    }

    /* renamed from: e */
    public void mo117851e(int i) {
        this.f261362f = i;
    }

    public int getHeight() {
        return this.f261362f;
    }

    /* renamed from: k */
    public void mo122410k(boolean z) {
        Log.m105924i("MicroMsg.AppBrandPageViewKeyboardHeightEmitter", "canDispatchKeyboardStatusChanged: " + z);
        this.f261365i = z;
    }

    public void onDestroy() {
        C84967l0 l0Var = this.f261363g;
        if (l0Var != null) {
            l0Var.mo117847e(this);
        }
        C87951l lVar = C87951l.f254518a;
        C24564k0.m30737a(C87951l.f254519b).remove(this);
    }
}
