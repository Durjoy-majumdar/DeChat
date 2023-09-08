package p936cc;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.plugin.appbrand.page.m0$$c0;
import com.tencent.p014mm.plugin.appbrand.report.model.C84138b;
import com.tencent.p014mm.plugin.appbrand.report.model.C84147j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.WeakHashMap;
import p1044ub.C90630c;
import p849e3.C107168a0;
import p849e3.C107207u;
import p963fc.C86812g;
import sq0.C90327a;
import sq0.C90328b;
import sq0.C90339i;

/* renamed from: cc.a */
public class C79994a extends C83849m0 {

    /* renamed from: H */
    public long f234295H = 0;

    /* renamed from: I */
    public C84147j f234296I;

    public C79994a(Context context, C86812g gVar) {
        super(context, gVar);
        if (!gVar.mo121254q1()) {
            mo116334Y(C90339i.WITH_CONFIRM_DIALOG, new C90327a());
        }
        mo116334Y(C90339i.SILENT, new C90328b());
        getReporter();
    }

    /* renamed from: C */
    public void mo110172C() {
        super.mo110172C();
        if (getPageCount() > 0) {
            getReporter().mo115891h((C90630c) getCurrentPage().getCurrentPageView());
        }
    }

    /* renamed from: D */
    public void mo110173D() {
        if (getPageCount() > 0) {
            getReporter().mo115884a((C90630c) getCurrentPage().getCurrentPageView());
        }
    }

    /* renamed from: E */
    public void mo110174E() {
        super.mo110174E();
        if (getPageCount() > 0) {
            getReporter().mo115885b((C90630c) getCurrentPage().getCurrentPageView());
        }
    }

    /* renamed from: F */
    public m0$$c0 mo110175F(C83820i0 i0Var, C83820i0 i0Var2) {
        m0$$c0 F = super.mo110175F(i0Var, i0Var2);
        getReporter().mo115893k(0);
        getReporter().mo115895m((C90630c) i0Var2.getCurrentPageView(), (C90630c) i0Var.getCurrentPageView(), C83817h4.NAVIGATE_BACK);
        return F;
    }

    /* renamed from: G */
    public void mo110176G(C83820i0 i0Var, C83820i0 i0Var2, C83817h4 h4Var) {
        super.mo110176G(i0Var, i0Var2, h4Var);
        long currentTimeMillis = System.currentTimeMillis() - this.f234295H;
        getReporter().mo115889f(currentTimeMillis, h4Var);
        Log.m105925i("Luggage.AppBrandPageContainerLU", "onNavigateEnd received, appId:%s, time: %d", getAppId(), Long.valueOf(currentTimeMillis));
        getReporter().mo115895m((C90630c) i0Var2.getCurrentPageView(), i0Var == null ? null : (C90630c) i0Var.getCurrentPageView(), h4Var);
    }

    /* renamed from: H */
    public m0$$c0 mo110177H(C83820i0 i0Var, C83820i0 i0Var2, C83817h4 h4Var, String str, boolean z) {
        this.f234295H = System.currentTimeMillis();
        return super.mo110177H(i0Var, i0Var2, h4Var, str, z);
    }

    public C84147j getReporter() {
        if (this.f234296I == null) {
            this.f234296I = new C84138b(getRuntime());
        }
        return this.f234296I;
    }

    public final boolean post(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145207b(this) || getRuntime() == null || !getRuntime().mo121251g1()) {
            return super.post(runnable);
        }
        MMHandlerThread.postToMainThread(runnable);
        return true;
    }

    public final boolean postDelayed(Runnable runnable, long j) {
        if (runnable == null) {
            return false;
        }
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145207b(this) || getRuntime() == null || !getRuntime().mo121251g1()) {
            return super.postDelayed(runnable, j);
        }
        MMHandlerThread.postToMainThreadDelayed(runnable, j);
        return true;
    }

    public final void postOnAnimation(Runnable runnable) {
        if (runnable != null) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145207b(this) || getRuntime() == null || !getRuntime().mo121251g1()) {
                super.postOnAnimation(runnable);
            } else {
                MMHandlerThread.postToMainThreadDelayed(runnable, ValueAnimator.getFrameDelay());
            }
        }
    }

    public final void postOnAnimationDelayed(Runnable runnable, long j) {
        if (runnable != null) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145207b(this) || getRuntime() == null || !getRuntime().mo121251g1()) {
                super.postOnAnimationDelayed(runnable, j);
            } else {
                MMHandlerThread.postToMainThreadDelayed(runnable, ValueAnimator.getFrameDelay() + j);
            }
        }
    }

    public C86812g getRuntime() {
        return (C86812g) super.getRuntime();
    }
}
