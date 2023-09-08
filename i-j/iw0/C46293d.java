package iw0;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.biz.scheme.BizComSchIntermediateUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86299o;
import di0.C86300q;
import di3.C86312j;
import gy3.C87412m;
import java.io.IOException;
import java.lang.ref.WeakReference;
import kr0.C76630x0;
import pe3.C89349b;
import qo3.C89779i0;
import te3.C50589nt;

/* renamed from: iw0.d */
public final class C46293d extends C46290a {

    /* renamed from: a */
    public final String f124740a = "MicroMsg.BizSchemeMiniProgram";

    /* renamed from: iw0.d$a */
    public static final class C46294a implements C86300q {

        /* renamed from: a */
        public final WeakReference<BizComSchIntermediateUI> f124741a;

        /* renamed from: b */
        public final String f124742b = "MicroMsg.BizSchemeMiniProgram";

        public C46294a(WeakReference<BizComSchIntermediateUI> weakReference) {
            C87412m.m108594g(weakReference, "weakUI");
            this.f124741a = weakReference;
        }

        /* renamed from: a */
        public void mo63853a() {
            Log.m105924i(this.f124742b, "onAppBrandProcessDied");
            BizComSchIntermediateUI bizComSchIntermediateUI = this.f124741a.get();
            if (bizComSchIntermediateUI != null) {
                bizComSchIntermediateUI.finish();
            }
        }

        /* renamed from: b */
        public void mo63854b(String str) {
            Log.m105924i(this.f124742b, "onTriggerHalfScreenShare");
        }

        /* renamed from: c */
        public void mo63855c() {
            Log.m105924i(this.f124742b, "onAppBrandUIEnter");
            BizComSchIntermediateUI bizComSchIntermediateUI = this.f124741a.get();
            if (bizComSchIntermediateUI != null) {
                bizComSchIntermediateUI.finish();
            }
        }

        /* renamed from: d */
        public /* synthetic */ void mo63856d() {
        }

        /* renamed from: e */
        public void mo63857e() {
            Log.m105924i(this.f124742b, "onAppBrandPreconditionError");
            BizComSchIntermediateUI bizComSchIntermediateUI = this.f124741a.get();
            if (bizComSchIntermediateUI != null) {
                bizComSchIntermediateUI.finish();
            }
        }

        /* renamed from: f */
        public void mo63858f(boolean z) {
            Log.m105924i(this.f124742b, "onAppBrandUIExit");
            BizComSchIntermediateUI bizComSchIntermediateUI = this.f124741a.get();
            if (bizComSchIntermediateUI != null) {
                bizComSchIntermediateUI.finish();
            }
        }
    }

    /* renamed from: a */
    public boolean mo71703a(BizComSchIntermediateUI bizComSchIntermediateUI, C89349b bVar, C89349b bVar2, String str) {
        C87412m.m108594g(bizComSchIntermediateUI, "ui");
        C87412m.m108594g(bVar, "actionBuffer");
        bizComSchIntermediateUI.f108998g = true;
        C50589nt ntVar = new C50589nt();
        try {
            ntVar.parseFrom(bVar.mo123703f());
            C86299o oVar = new C86299o();
            oVar.f250930b = ntVar.f138752d;
            oVar.f250929a = ntVar.f138753e;
            oVar.f250934f = ntVar.f138754f;
            oVar.f250931c = ntVar.f138755g;
            oVar.f250940l = ntVar.f138757i;
            AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
            oVar.f250947s = appBrandLaunchReferrer;
            appBrandLaunchReferrer.f239397e = ntVar.f138758j;
            appBrandLaunchReferrer.f239396d = 8;
            oVar.f250939k = 1065;
            oVar.f250916E = new C46294a(new WeakReference(bizComSchIntermediateUI));
            String str2 = this.f124740a;
            Log.m105924i(str2, "WeAppOpenBundle init, appid = " + oVar.f250930b + ", username = " + oVar.f250929a + ", enterPath = " + oVar.f250934f + ", versionType = " + oVar.f250931c);
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(bizComSchIntermediateUI.getContext(), oVar);
            C89779i0 i0Var = bizComSchIntermediateUI.f108999h;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            return true;
        } catch (IOException e) {
            String str3 = this.f124740a;
            Log.m105920e(str3, "e = " + e.getMessage());
            return false;
        }
    }
}
