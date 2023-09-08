package uj0;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import bt0.C79808b;
import com.tencent.luggage.game.page.C80211b;
import com.tencent.luggage.game.page.WAGamePageViewContainerLayout;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81552b3;
import com.tencent.p014mm.plugin.appbrand.C83196k4;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.C83608m4;
import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84108d;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kg3.C76577a;
import kz1.C88349l;
import p935cb.C79980i;
import p958eb.C86474e;
import rq0.C90091i;
import te3.d65;
import tj0.C90504b;
import vj0.C111524d;

/* renamed from: uj0.k */
public class C90684k<PAGE extends C83928t1> extends C80211b<PAGE> implements C90665a, C88349l.C88356g {

    /* renamed from: v */
    public MagicBrushView f260499v = null;

    /* renamed from: w */
    public C90668d f260500w = null;

    public C90684k(PAGE page) {
        super(page);
    }

    /* renamed from: E */
    public void mo111237E(View view) {
        if (mo124764Z() != null && ((C83928t1) mo124764Z()).getRuntime() != null && C81552b3.m100042a(((C83928t1) mo124764Z()).getRuntime())) {
            super.mo111237E(view);
        }
    }

    /* renamed from: J */
    public boolean mo111243J(String str, C83817h4 h4Var) {
        if (!(mo124764Z() == null || ((C83928t1) mo124764Z()).getRuntime() == null)) {
            AppBrandRuntimeWC J1 = ((C83928t1) mo124764Z()).getRuntime();
            if (C83608m4.m102642a(J1)) {
                String str2 = J1.f238147j;
                C83231l.m102140a(str2, new C83196k4(str2, J1));
                if (J1.mo113210l1().mo111300k()) {
                    ((C83928t1) mo124764Z()).mo116530R1();
                }
            } else {
                C79808b bVar = ((C83928t1) mo124764Z()).f244554F;
                if (bVar != null) {
                    bVar.mo109614d(true);
                }
            }
            J1.f238298z1.mo117797t((C83928t1) mo124764Z(), h4Var);
        }
        return true;
    }

    /* renamed from: K */
    public void mo111244K() {
        C90668d dVar;
        if (C83231l.m102143d(((C83928t1) mo124764Z()).getAppId()) == C83231l.C83235e.CLOSE && (dVar = this.f260500w) != null) {
            d65 d65 = dVar.f260488a;
            if (d65 != null && d65.f182636d) {
                new C90504b().mo124672s(((C83928t1) mo124764Z()).mo116160O0(), C90504b.C90506b.BeforeBack, 0);
            }
        }
        super.mo111244K();
        if (mo125215b0() != null) {
            ((C88349l) C86312j.m106911c(C88349l.class)).mo118242R8(mo125216c0(), mo125215b0(), ((C83928t1) mo124764Z()).getRuntime().f238149o.f239365g);
        }
    }

    /* renamed from: T */
    public void mo111246T() {
        super.mo111246T();
        if (C83608m4.m102642a(((C83928t1) mo124764Z()).getRuntime())) {
            ((C90091i) mo116072t(C90091i.class)).mo116582d();
        }
    }

    /* renamed from: V */
    public C90668d mo124807V() {
        return this.f260500w;
    }

    /* renamed from: W */
    public void mo111247W(View view) {
        super.mo111247W(view);
        if (C83608m4.m102642a(((C83928t1) mo124764Z()).getRuntime())) {
            View view2 = new View(mo125216c0());
            view2.setBackgroundResource(C0966R.color.f2947a4);
            WAGamePageViewContainerLayout wAGamePageViewContainerLayout = this.f234768f;
            wAGamePageViewContainerLayout.addView(view2, wAGamePageViewContainerLayout.indexOfChild(this.f234771i), new FrameLayout.LayoutParams(-1, -1));
            View view3 = new View(mo125216c0());
            view3.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Integer.MIN_VALUE, 0}));
            int f = C75044y4.m89994f(mo125216c0()) + C76577a.m92155f(mo125216c0(), C0966R.dimen.f4058q4);
            this.f234768f.addView(view3, new FrameLayout.LayoutParams(-1, f));
            C86474e eVar = (C86474e) ((C83928t1) mo124764Z()).mo116160O0().mo125517G0(C86474e.class);
            if (eVar != null) {
                C79980i A = eVar.mo120894A();
                if (!(A.f234266c == null || A.f234266c.f234247a.getView() == null)) {
                    View view4 = A.f234266c.f234247a.getView();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view4.getLayoutParams();
                    layoutParams.topMargin = f;
                    layoutParams.bottomMargin = 52;
                    view4.setLayoutParams(layoutParams);
                }
            }
            ((C83928t1) mo124764Z()).mo116151F0().mo62473a(new C90683j(this));
        }
    }

    /* renamed from: b */
    public void mo111250b() {
        Class cls = C88349l.class;
        String appId = ((C83928t1) mo124764Z()).getAppId();
        Log.m105925i("MicroMsg.OnStartReportCanvasDataEvent", "stopListeningOperationEvent, appId:%s", appId);
        MMToClientEvent.C81947d dVar = C90504b.f260113i;
        if (dVar != null) {
            MMToClientEvent.m100657u(appId, dVar);
            C90504b.f260113i = null;
        }
        ((C88349l) C86312j.m106911c(cls)).mo118256lq();
        if (mo125215b0() != null) {
            ((C88349l) C86312j.m106911c(cls)).d20(mo125216c0(), mo125215b0(), ((C83928t1) mo124764Z()).getRuntime().f238149o.f239365g);
        }
        super.mo111250b();
    }

    /* renamed from: c */
    public MagicBrushView mo111251c() {
        return this.f260499v;
    }

    /* renamed from: i0 */
    public MagicBrushView mo111261i0(Context context) {
        long currentTicks = Util.currentTicks();
        this.f260499v = new MagicBrushView(context, (MagicBrushView.C80319b) new C111524d(context));
        C83226n.m102129f(mo125215b0(), KSProcessWeAppLaunch.stepCreateMagicBrushView, "", currentTicks, Util.currentTicks());
        ((C88349l) C86312j.m106911c(C88349l.class)).mo118260yA(this);
        return this.f260499v;
    }

    /* renamed from: k */
    public void mo111264k() {
        super.mo111264k();
        if (mo125215b0() != null) {
            ((C88349l) C86312j.m106911c(C88349l.class)).T80(mo116498d0(), mo125216c0(), mo125215b0(), ((C83928t1) mo124764Z()).getRuntime().f238149o.f239365g);
        }
    }

    /* renamed from: k0 */
    public void mo111265k0() {
        mo124765a0(C90665a.class, this);
    }

    /* renamed from: q */
    public void mo124808q(C84108d dVar) {
        d65 d65 = dVar.f245572d;
        this.f260500w = new C90668d(d65, mo116498d0());
        if (d65 == null || !d65.f182636d) {
            Log.m105928w("MicroMsg.WAGamePageViewRendererWC", "hy: no server config or do not need sample. do not do anything");
            return;
        }
        Log.m105924i("MicroMsg.WAGamePageViewRendererWC", "hy: should do server sample");
        C90668d dVar2 = this.f260500w;
        if (dVar2.f260488a == null || dVar2.mo124812d() == null || Util.isNullOrNil(dVar2.f260488a.f182637e) || !dVar2.f260488a.f182636d || dVar2.f260491d == null) {
            Log.m105928w("MicroMsg.WAGameCanvasSecurityGuard", "hy: should not do server config!");
        } else if (dVar2.mo124813e()) {
            Log.m105918d("MicroMsg.WAGameCanvasSecurityGuard", "hy: running, trigger send event after 1 sec");
            MMHandlerThread.postToMainThreadDelayed(new C90666b(dVar2), 1000);
        } else {
            Log.m105928w("MicroMsg.WAGameCanvasSecurityGuard", "hy: not running!");
        }
    }

    /* renamed from: x */
    public void mo111272x(C79808b bVar) {
        if (C83608m4.m102642a(((C83928t1) mo124764Z()).getRuntime())) {
            bVar.setFullscreenMode(false);
            bVar.setBackgroundAlpha(0.0d);
            bVar.setForegroundColor(-1);
            bVar.setMainTitle(mo116498d0().mo113036W().f239363e);
            return;
        }
        super.mo111272x(bVar);
    }
}
