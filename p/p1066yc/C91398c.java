package p1066yc;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83129y;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr0.C86117l;
import cr0.C86118m;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import p830xc.C91165a;
import p980id.C87695a;

/* renamed from: yc.c */
public abstract class C91398c {

    /* renamed from: a */
    public final C87695a f262101a;

    /* renamed from: b */
    public final C83129y f262102b;

    /* renamed from: c */
    public WeakReference<C83780d1> f262103c = null;

    /* renamed from: d */
    public boolean f262104d = false;

    /* renamed from: e */
    public boolean f262105e = false;

    /* renamed from: f */
    public boolean f262106f = false;

    /* renamed from: g */
    public C86118m f262107g = null;

    /* renamed from: h */
    public C82531i.C82534c f262108h = null;

    public C91398c(C87695a aVar, C83129y yVar) {
        this.f262101a = aVar;
        this.f262102b = yVar;
    }

    /* renamed from: a */
    public abstract void mo109535a(String str, C91165a aVar);

    /* renamed from: b */
    public abstract boolean mo109536b();

    /* renamed from: c */
    public void mo125354c(C91165a aVar) {
        C83780d1 d1Var;
        if (this.f262103c == null) {
            C82381f g = aVar.mo62544g();
            if (!(g instanceof C83780d1)) {
                Log.m105928w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "setPageView, component(" + g + ") is not AppBrandPageView");
                if (!(g instanceof C81925i2)) {
                    Log.m105928w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "setPageView, component(" + g + ") is not AppBrandService");
                    return;
                }
                d1Var = ((C81925i2) g).mo114341l0();
            } else {
                d1Var = (C83780d1) g;
            }
            if (!this.f262106f) {
                if (this.f262107g == null) {
                    this.f262107g = new C91392a(this);
                    this.f262108h = new C91396b(this);
                }
                Activity A0 = d1Var.mo116146A0();
                if (A0 == null) {
                    Log.m105928w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "listenOrientationChanged, null == activity");
                } else {
                    C86117l b = C86117l.m106615b(A0);
                    C86118m mVar = this.f262107g;
                    C87412m.m108594g(mVar, "orientationObserver");
                    Log.m105918d(b.f250631a, "addOrientationObserver");
                    b.mo120539a(true);
                    ((CopyOnWriteArrayList) b.f250636f).add(mVar);
                    d1Var.mo114865m(this.f262108h);
                    this.f262106f = true;
                }
            }
            this.f262103c = new WeakReference<>(d1Var);
        }
    }
}
