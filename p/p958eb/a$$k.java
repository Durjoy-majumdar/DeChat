package p958eb;

import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.page.C83813h0;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.sdk.platformtools.Log;
import p284zb.C91635f;

/* renamed from: eb.a$$k */
public class a$$k implements MagicBrushView.C80321c {

    /* renamed from: a */
    public boolean f251299a = true;

    /* renamed from: b */
    public final /* synthetic */ C86470a f251300b;

    public a$$k(C86470a aVar, a$$b a__b) {
        this.f251300b = aVar;
    }

    /* renamed from: b */
    public void mo55504b(Object obj, int i, int i2) {
        mo120930g();
    }

    /* renamed from: e */
    public void mo55505e(Object obj, boolean z) {
    }

    /* renamed from: f */
    public void mo55506f(Object obj, int i, int i2, boolean z, boolean z2) {
        if (this.f251299a) {
            this.f251299a = false;
            C83226n.m102128e(this.f251300b.mo125521g0(), KSProcessWeAppLaunch.stepSurfaceAvailable);
            return;
        }
        mo120930g();
    }

    /* renamed from: g */
    public final void mo120930g() {
        C91635f fVar = (C91635f) this.f251300b.mo124764Z();
        if (fVar != null) {
            Log.m105924i("Luggage.AppBrandGameServiceLogicImp", "hy: on resizeWindow");
            C83813h0 h0Var = new C83813h0();
            fVar.getClass();
            h0Var.mo115161k(fVar);
            h0Var.mo115158h();
        }
    }
}
