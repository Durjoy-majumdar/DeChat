package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bt0.C79808b;
import bu0.C79819c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81820e3;
import com.tencent.p014mm.plugin.appbrand.C83608m4;
import com.tencent.p014mm.plugin.appbrand.C84091r2;
import com.tencent.p014mm.plugin.appbrand.ReportStorageSizeTask;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.headless.C81914j;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.event.AppBrandVideoPlayEvent;
import com.tencent.p014mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84499c0;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84560k4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84570o4;
import com.tencent.p014mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandRecommendStatObj;
import com.tencent.p014mm.plugin.appbrand.report.model.C84139c;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84213o;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84223s;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.plugin.appbrand.weishi.C84905f;
import com.tencent.p014mm.plugin.appbrand.widget.C84923d;
import com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fm0.C8136w;
import gy3.C87412m;
import is0.C87794b;
import iu0.C33407g;
import j20.C117292a;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Callable;
import js0.C88024r;
import k20.C60958c;
import k20.C9556a;
import kr0.C88267e;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88431k;
import li0.C88508b;
import li0.C88509c;
import oi0.C62024n;
import op0.C89251a;
import p1010nc.C88916a;
import p194lc.C88435b0;
import p194lc.C88453o;
import p194lc.C88468w;
import p747xb.C38470l;
import p747xb.C91151g;
import p747xb.C91156i;
import p747xb.C91157j;
import p747xb.C91158k;
import p936cc.C79994a;
import qq0.C89797e;
import rq0.C90087f;
import rx3.C13604l;
import u24.C90595a;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC */
public class AppBrandPageContainerWC extends C79994a implements m0$$v {

    /* renamed from: y0 */
    public static final /* synthetic */ int f244405y0 = 0;

    /* renamed from: J */
    public FrameLayout f244406J;

    /* renamed from: K */
    public C83943v f244407K;

    /* renamed from: L */
    public boolean f244408L = false;

    /* renamed from: M */
    public boolean f244409M = false;

    /* renamed from: N */
    public boolean f244410N = false;

    /* renamed from: P */
    public long f244411P;

    /* renamed from: Q */
    public long f244412Q;

    /* renamed from: R */
    public long f244413R;

    /* renamed from: S */
    public String f244414S;

    /* renamed from: T */
    public String f244415T;

    /* renamed from: U */
    public final C91151g f244416U;

    /* renamed from: V */
    public final Deque<C83928t1> f244417V = new LinkedList();

    /* renamed from: W */
    public String f244418W;

    /* renamed from: p0 */
    public IListener<AppBrandVideoPlayEvent> f244419p0;

    /* renamed from: x0 */
    public final C83817h4[] f244420x0;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$a */
    public class C1942a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f11834d;

        public C1942a(AppBrandPageContainerWC appBrandPageContainerWC, View view) {
            this.f11834d = view;
        }

        public void run() {
            View view = this.f11834d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/page/AppBrandPageContainerWC$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/page/AppBrandPageContainerWC$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f11834d.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.f11834d.getParent()).removeView(this.f11834d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$b */
    public class C83732b implements Runnable {

        /* renamed from: d */
        public final C88509c.C88512b f244422d;

        /* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$b$a */
        public class C83733a implements C88509c.C88512b {

            /* renamed from: d */
            public final /* synthetic */ Runnable f244424d;

            public C83733a(Runnable runnable) {
                this.f244424d = runnable;
            }

            /* renamed from: b */
            public void mo113102b(String str, C88508b bVar) {
                if (C88508b.BACKGROUND == bVar) {
                    AppBrandRuntimeWC runtime = AppBrandPageContainerWC.this.getRuntime();
                    Runnable runnable = this.f244424d;
                    if (runnable == null) {
                        runtime.getClass();
                    } else {
                        runtime.f238144g.removeCallbacks(runnable);
                    }
                    AppBrandPageContainerWC.this.getRuntime().f238113K.mo122982e(this);
                }
            }
        }

        public C83732b() {
            C83733a aVar = new C83733a(this);
            this.f244422d = aVar;
            AppBrandPageContainerWC.this.getRuntime().f238113K.mo122978a(aVar);
        }

        public void run() {
            Log.m105925i("MicroMsg.AppBrandPageContainerWC", "debug timeout call runtime onReady, appId:%s", AppBrandPageContainerWC.this.getAppId());
            AppBrandPageContainerWC.this.mo116331J();
            AppBrandPageContainerWC.this.getRuntime().f238113K.mo122982e(this.f244422d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$c */
    public class C83734c implements C89251a.C89253b {

        /* renamed from: a */
        public final /* synthetic */ m0$$y f244426a;

        /* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$c$a */
        public class C83735a implements Runnable {
            public C83735a() {
            }

            public void run() {
                C83734c.this.f244426a.proceed();
            }
        }

        public C83734c(m0$$y m0__y) {
            this.f244426a = m0__y;
        }

        /* renamed from: a */
        public /* synthetic */ void mo114320a(List list) {
        }

        /* renamed from: b */
        public void mo114321b(C89251a.C89255d dVar) {
            AppBrandPageContainerWC.this.mo116338c0(new C83735a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$d */
    public class C83736d implements C84091r2.C84093b {

        /* renamed from: a */
        public final /* synthetic */ String f244429a;

        public C83736d(String str) {
            this.f244429a = str;
        }

        /* renamed from: a */
        public void mo115595a() {
            if (AppBrandPageContainerWC.this.getRuntime() != null) {
                AppBrandPageContainerWC.this.mo116332Q(this.f244429a);
            }
        }

        /* renamed from: b */
        public void mo115596b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$e */
    public class C83737e implements C89251a.C89253b {

        /* renamed from: a */
        public final /* synthetic */ m0$$y f244431a;

        /* renamed from: b */
        public final /* synthetic */ C83817h4 f244432b;

        /* renamed from: c */
        public final /* synthetic */ String f244433c;

        /* renamed from: d */
        public final /* synthetic */ boolean f244434d;

        /* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$e$a */
        public class C83738a implements Runnable {
            public C83738a() {
            }

            public void run() {
                C83737e eVar = C83737e.this;
                if (eVar.f244434d) {
                    eVar.f244431a.setAnimationEnabled(false);
                }
                C83737e.this.f244431a.proceed();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$e$b */
        public class C83739b implements Runnable {
            public C83739b() {
            }

            public void run() {
                C83943v vVar;
                C83737e eVar = C83737e.this;
                if (eVar.f244434d && (vVar = AppBrandPageContainerWC.this.f244407K) != null) {
                    vVar.cancel();
                    AppBrandPageContainerWC.this.f244407K = null;
                }
                C83737e.this.f244431a.cancel();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$e$c */
        public class C83740c implements Runnable {

            /* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$e$c$a */
            public class C83741a implements DialogInterface.OnClickListener {
                public C83741a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (i == -1) {
                        C83737e eVar = C83737e.this;
                        AppBrandPageContainerWC appBrandPageContainerWC = AppBrandPageContainerWC.this;
                        String str = eVar.f244433c;
                        C83817h4 h4Var = eVar.f244432b;
                        m0$$y m0__y = eVar.f244431a;
                        int i2 = AppBrandPageContainerWC.f244405y0;
                        appBrandPageContainerWC.mo116041m0(str, h4Var, m0__y, true);
                    }
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$e$c$b */
            public class C83742b implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C83943v f244440d;

                public C83742b(C83740c cVar, C83943v vVar) {
                    this.f244440d = vVar;
                }

                public void run() {
                    C83943v vVar = this.f244440d;
                    if (vVar != null) {
                        vVar.setVisibility(8);
                        vVar.mo116561e();
                    }
                }
            }

            public C83740c() {
            }

            public void run() {
                AppBrandPageContainerWC appBrandPageContainerWC = AppBrandPageContainerWC.this;
                C83943v vVar = appBrandPageContainerWC.f244407K;
                appBrandPageContainerWC.f244407K = new C83943v(AppBrandPageContainerWC.this.getContext());
                C83741a aVar = new C83741a();
                AppBrandPageContainerWC.this.f244407K.setPositiveButton(aVar);
                AppBrandPageContainerWC.this.f244407K.setNegativeButton(aVar);
                AppBrandPageContainerWC appBrandPageContainerWC2 = AppBrandPageContainerWC.this;
                C83943v vVar2 = appBrandPageContainerWC2.f244407K;
                C83742b bVar = new C83742b(this, vVar);
                vVar2.getClass();
                C87412m.m108594g(appBrandPageContainerWC2, "pageContainer");
                vVar2.f245082C = appBrandPageContainerWC2;
                appBrandPageContainerWC2.addView(vVar2, new FrameLayout.LayoutParams(-1, -1));
                vVar2.bringToFront();
                AppBrandRuntime runtime = appBrandPageContainerWC2.getRuntime();
                C87412m.m108591d(runtime);
                C79808b bVar2 = vVar2.f245084E;
                String str = null;
                if (bVar2 != null) {
                    AppBrandInitConfig W = runtime.mo113036W();
                    String str2 = W != null ? W.f239363e : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    bVar2.setMainTitle(str2);
                    bVar2.setBackgroundColor(0);
                    bVar2.setForegroundStyle(true);
                    bVar2.mo109614d(true);
                }
                ImageView imageView = vVar2.f245085F;
                if (imageView != null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(0.0f);
                    imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    String str3 = C88394b.f255384g;
                    C88394b bVar3 = C88394b.C88418q.f255427a;
                    AppBrandInitConfig W2 = runtime.mo113036W();
                    if (W2 != null) {
                        str = W2.f239364f;
                    }
                    bVar3.mo122786b(imageView, str, C88393a.m110230a(), C88431k.f255437d);
                }
                Animation animation = vVar2.f245081B;
                if (animation != null) {
                    animation.cancel();
                }
                Animation loadAnimation = AnimationUtils.loadAnimation(vVar2.getContext(), MMFragmentActivity$$c.f318644a);
                vVar2.f245081B = loadAnimation;
                C87412m.m108591d(loadAnimation);
                loadAnimation.setAnimationListener(new C83957w(vVar2, bVar));
                Animation animation2 = vVar2.f245081B;
                C87412m.m108591d(animation2);
                vVar2.startAnimation(animation2);
            }
        }

        public C83737e(m0$$y m0__y, C83817h4 h4Var, String str, boolean z) {
            this.f244431a = m0__y;
            this.f244432b = h4Var;
            this.f244433c = str;
            this.f244434d = z;
        }

        /* renamed from: a */
        public void mo114320a(List<String> list) {
            this.f244431a.mo116241c("downloadPackageList", list);
        }

        /* renamed from: b */
        public void mo114321b(C89251a.C89255d dVar) {
            int i = 4;
            int i2 = 2;
            int i3 = 3;
            Log.m105925i("MicroMsg.AppBrandPageContainerWC", "modularizingNewPageNavigation.onLoadResult(%s), appId:%s, type:%s, url:%s", dVar, AppBrandPageContainerWC.this.getAppId(), this.f244432b, this.f244433c);
            int ordinal = dVar.ordinal();
            if (ordinal == 0) {
                C115669n nVar = C115669n.INSTANCE;
                if (this.f244434d) {
                    i2 = 6;
                }
                nVar.mo175911u(937, i2);
                AppBrandPageContainerWC.this.mo116338c0(new C83738a());
            } else if (ordinal == 1) {
                C115669n nVar2 = C115669n.INSTANCE;
                if (this.f244434d) {
                    i3 = 7;
                }
                nVar2.mo175911u(937, i3);
                AppBrandPageContainerWC.this.mo116338c0(new C83740c());
            } else if (ordinal == 2) {
                C115669n nVar3 = C115669n.INSTANCE;
                if (this.f244434d) {
                    i = 8;
                }
                nVar3.mo175911u(937, i);
                AppBrandPageContainerWC.this.mo116338c0(new C83739b());
            }
        }
    }

    static {
        int i = ModularizingPkgRetrieverSeparatedPluginsCompatible.f243356h;
        Log.m105924i("MicroMsg.AppBrand.ModularizingPkgRetrieverSeparatedPluginsCompatible", "trigger <clinit>");
    }

    public AppBrandPageContainerWC(Context context, AppBrandRuntimeWC appBrandRuntimeWC) {
        super(context, appBrandRuntimeWC);
        if (getRuntime().mo121254q1()) {
            this.f244416U = null;
        } else {
            C91151g gVar = new C91151g(this);
            this.f244416U = gVar;
            C33407g gVar2 = C33407g.f90517a;
            gVar.f261372c = 2;
            gVar.f261373d = true;
            gVar.f261374e = true;
            if (C84499c0.m104089c()) {
                setPageNavigationPushTimeout(C84499c0.m104087a());
            }
        }
        this.f244419p0 = new IListener<AppBrandVideoPlayEvent>(C40008f.f107254d) {
            {
                this.__eventId = 839890650;
            }

            public boolean callback(IEvent iEvent) {
                if (((AppBrandVideoPlayEvent) iEvent) == null) {
                    return false;
                }
                Log.m105924i("MicroMsg.AppBrandPageContainerWC", "[weishi] receive weishi play event");
                AppBrandPageContainerWC appBrandPageContainerWC = AppBrandPageContainerWC.this;
                int i = AppBrandPageContainerWC.f244405y0;
                appBrandPageContainerWC.mo116040l0();
                C84905f.m104622c();
                return false;
            }
        };
        this.f244420x0 = new C83817h4[]{C83817h4.APP_LAUNCH, C83817h4.SWITCH_TAB, C83817h4.RE_LAUNCH, C83817h4.AUTO_RE_LAUNCH, C83817h4.REDIRECT_TO};
        setDelegate(this);
    }

    /* renamed from: B */
    public void mo116023B() {
        C83943v vVar = this.f244407K;
        if (vVar != null) {
            vVar.dismiss();
            this.f244407K = null;
            return;
        }
        super.mo116023B();
    }

    /* renamed from: C */
    public void mo110172C() {
        C87794b c;
        super.mo110172C();
        AppBrandRuntime appBrandRuntime = null;
        if (!(getCurrentPage() == null || getCurrentPage().getCurrentPageView() == null)) {
            if (getRuntime().mo113208k1() == 1118) {
                if (this.f244408L && !this.f244409M) {
                    String R0 = getCurrentPage().getCurrentPageView().mo116163R0();
                    String str = this.f244414S;
                    if (str != null && str.equals(R0)) {
                        Log.m105924i("MicroMsg.AppBrandPageContainerWC", "statPageTime onBackground");
                        C84139c cVar = ((C83928t1) getCurrentPage().getCurrentPageView()).f260370X0;
                        this.f244411P = cVar == null ? 0 : cVar.mo116801c();
                        this.f244409M = true;
                    }
                }
                this.f244413R = System.currentTimeMillis() - this.f244412Q;
                if (this.f244408L && this.f244409M && getRuntime().mo121253n1() != null) {
                    Log.m105925i("MicroMsg.AppBrandPageContainerWC", "report pageStayTime:%d, appStayTime:%d", Long.valueOf(this.f244411P), Long.valueOf(this.f244413R));
                    long j = this.f244411P;
                    long j2 = this.f244413R;
                    AppBrandRecommendStatObj appBrandRecommendStatObj = getRuntime().mo121253n1().f245539o;
                    if (appBrandRecommendStatObj != null) {
                        Set<Object> set = C84737f0.f247137a;
                        C88024r.m109571a().postToWorker(new C62024n(1, j, j2, appBrandRecommendStatObj));
                    }
                }
            }
            if (this.f244410N && getRuntime().mo113208k1() == 1162 && System.currentTimeMillis() - this.f244412Q >= 3000) {
                AppBrandLaunchFromNotifyReferrer appBrandLaunchFromNotifyReferrer = getRuntime().mo113210l1().f239384o1;
                String str2 = appBrandLaunchFromNotifyReferrer.f197021d;
                int i = appBrandLaunchFromNotifyReferrer.f197023f;
                String str3 = appBrandLaunchFromNotifyReferrer.f197024g;
                String str4 = appBrandLaunchFromNotifyReferrer.f197025h;
                int i2 = appBrandLaunchFromNotifyReferrer.f197026i;
                String str5 = appBrandLaunchFromNotifyReferrer.f197027j;
                if (!Util.nullAsNil(this.f244415T).equals(str3)) {
                    C115669n.INSTANCE.mo160131h(19724, 4, 0, 0, Integer.valueOf(i2), 0, null, 0, 0, 0, str2, null, null, str3, 0, null, str4, Integer.valueOf(i), null, null, str5);
                    this.f244415T = str3;
                }
            }
        }
        HalfScreenManger halfScreenManger = getRuntime().f238298z1;
        halfScreenManger.f247572e.mo122471b();
        if (halfScreenManger.mo117782e().mo76931c()) {
            C81820e3 e3Var = halfScreenManger.f247568a.f238142e;
            if (e3Var != null) {
                appBrandRuntime = e3Var.getActiveRuntime();
            }
            if (!C87412m.m108589b(appBrandRuntime, halfScreenManger.f247568a) && (c = halfScreenManger.mo117780c(halfScreenManger.f247568a)) != null) {
                c.setExternalHeaderVisibility(8);
            }
        }
    }

    /* renamed from: D */
    public void mo110173D() {
        super.mo110173D();
        C83943v vVar = this.f244407K;
        if (vVar != null) {
            vVar.mo116561e();
            this.f244407K = null;
        }
        IListener<AppBrandVideoPlayEvent> iListener = this.f244419p0;
        if (iListener != null) {
            iListener.dead();
        }
    }

    /* renamed from: E */
    public void mo110174E() {
        C87794b c;
        super.mo110174E();
        C89797e eVar = getRuntime().f238159x;
        if (eVar.f258187b != null) {
            eVar.mo124089b().setBackgroundColor(0);
        }
        mo116039k0();
        HalfScreenManger halfScreenManger = getRuntime().f238298z1;
        halfScreenManger.mo117788k();
        halfScreenManger.mo117787j();
        if (halfScreenManger.mo117782e().mo76931c() && (c = halfScreenManger.mo117780c(halfScreenManger.f247568a)) != null) {
            c.setExternalHeaderVisibility(0);
        }
    }

    /* renamed from: F */
    public m0$$c0 mo110175F(C83820i0 i0Var, C83820i0 i0Var2) {
        C90087f fVar;
        m0$$c0 F = super.mo110175F(i0Var, i0Var2);
        getRuntime().mo113181L1().mo109823a(i0Var2.getCurrentUrl());
        C91151g gVar = this.f244416U;
        if (gVar != null) {
            gVar.getClass();
            gVar.f261370a.post(new C91156i(gVar));
            C83780d1 currentPageView = i0Var2.getCurrentPageView();
            if (!(currentPageView == null || (fVar = (C90087f) currentPageView.mo116150E0(C90087f.class)) == null)) {
                fVar.mo63313f0();
            }
        }
        mo116045q0(i0Var2);
        return F;
    }

    /* renamed from: G */
    public void mo110176G(C83820i0 i0Var, C83820i0 i0Var2, C83817h4 h4Var) {
        C90087f fVar;
        C83817h4 h4Var2 = C83817h4.NAVIGATE_TO;
        super.mo110176G(i0Var, i0Var2, h4Var);
        C83943v vVar = this.f244407K;
        if (vVar != null) {
            vVar.setVisibility(8);
            vVar.mo116561e();
            this.f244407K = null;
        }
        getRuntime().mo113181L1().mo109823a(i0Var2.getCurrentUrl());
        C91151g gVar = this.f244416U;
        if (gVar != null) {
            Class cls = C90087f.class;
            C83817h4 h4Var3 = C83817h4.SWITCH_TAB;
            C87412m.m108594g(h4Var, "type");
            if (h4Var2 == h4Var) {
                gVar.mo125218d(h4Var);
                try {
                    if (gVar.f261370a.getPageCount() > gVar.f261372c) {
                        i0Var2.mo116286K(new C38470l(new C91158k(gVar)));
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th, "[wxa_reload]tryPauseRenderingOfInvisiblePages appId[" + gVar.f261371b + "] type[" + h4Var + "] maxKeepPageCount[" + gVar.f261372c + "] keepInvisbileTabbarPagesActive[" + gVar.f261373d + ']', new Object[0]);
                }
            } else if (h4Var3 == h4Var) {
                try {
                    if (!gVar.f261373d) {
                        C83820i0 currentPage = gVar.f261370a.getCurrentPage();
                        if (currentPage instanceof C83966x) {
                            C83780d1 currentPageView = ((C83966x) currentPage).getCurrentPageView();
                            if (currentPageView != null) {
                                C83966x xVar = (C83966x) currentPage;
                                xVar.getClass();
                                Iterator it = ((HashMap) xVar.f245126T).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    C83780d1 d1Var = (C83780d1) it.next();
                                    if (C87412m.m108589b(currentPageView, d1Var)) {
                                        break;
                                    }
                                    C87412m.m108593f(d1Var, "pv");
                                    C90087f fVar2 = (C90087f) d1Var.mo116150E0(cls);
                                    if (fVar2 != null) {
                                        fVar2.mo63305V0();
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th4) {
                    Log.printErrStackTrace("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th4, "[wxa_reload]tryPauseRenderingOfInvisibleTabbarPages appId[" + gVar.f261371b + "], switch[" + gVar.f261373d + ']', new Object[0]);
                }
            }
            C83780d1 currentPageView2 = i0Var2.getCurrentPageView();
            if (!(currentPageView2 == null || (fVar = (C90087f) currentPageView2.mo116150E0(cls)) == null)) {
                fVar.mo63313f0();
            }
            if (!(h4Var3 == h4Var || h4Var2 == h4Var)) {
                gVar.f261370a.post(new C91157j(gVar, h4Var));
            }
        }
        if (i0Var != null && h4Var == h4Var2 && getRuntime().mo113208k1() == 1118 && this.f244408L && !this.f244409M) {
            String R0 = i0Var.getCurrentPageView() == null ? "" : i0Var.getCurrentPageView().mo116163R0();
            String str = this.f244414S;
            if (str != null && str.equals(R0)) {
                Log.m105924i("MicroMsg.AppBrandPageContainerWC", "statPageTime");
                this.f244411P = ((C83928t1) i0Var.getCurrentPageView()).f260370X0.mo116801c();
                this.f244409M = true;
            }
        }
        mo116045q0(i0Var2);
    }

    /* renamed from: H */
    public m0$$c0 mo110177H(C83820i0 i0Var, C83820i0 i0Var2, C83817h4 h4Var, String str, boolean z) {
        m0$$c0 H = super.mo110177H(i0Var, i0Var2, h4Var, str, z);
        if ((i0Var2 instanceof C83966x) && C83608m4.m102642a(getRuntime())) {
            C79819c tabBar = ((C83966x) i0Var2).getTabBar();
            if (tabBar == null) {
                Log.m105924i("MicroMsg.AppBrandPageContainerWC", "checkSinglePageModeLogic tab null");
            } else {
                Log.m105924i("MicroMsg.AppBrandPageContainerWC", "checkSinglePageModeLogic set tab gone");
                if (tabBar.getVisibility() == 0) {
                    tabBar.setVisibility(8);
                }
            }
        }
        if (C84905f.m104620a(getRuntime())) {
            C83780d1 currentPageView = i0Var2.getCurrentPageView();
            mo116040l0();
            try {
                FrameLayout frameLayout = currentPageView.f244555G;
                FrameLayout frameLayout2 = (FrameLayout) LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6421ee, (ViewGroup) null);
                this.f244406J = frameLayout2;
                frameLayout.addView(this.f244406J, -1, new FrameLayout.LayoutParams(-1, -1));
                Log.m105924i("MicroMsg.AppBrandPageContainerWC", "[weishi] revealWeishiCoverImageIfNeed, showLaunchThumb");
                C84905f.m104623d(getRuntime(), (ImageView) frameLayout2.findViewById(C0966R.C0970id.f359370kk0), new C83755a1(this));
            } catch (NullPointerException unused) {
                Log.m105924i("MicroMsg.AppBrandPageContainerWC", "revealWeishiCoverImageIfNeed, exception, hide without animation");
                mo116040l0();
            }
        }
        C91151g gVar = this.f244416U;
        if (gVar != null) {
            gVar.getClass();
            C87412m.m108594g(i0Var2, LocaleUtil.INDONESIAN_NEWNAME);
            C87412m.m108594g(h4Var, "type");
            gVar.mo125217c(i0Var2);
        }
        return H;
    }

    /* renamed from: I */
    public void mo116024I(C83820i0 i0Var, C83817h4 h4Var) {
        HalfScreenManger halfScreenManger = getRuntime().f238298z1;
        C83928t1 t1Var = (C83928t1) i0Var.getCurrentPageView();
        halfScreenManger.getClass();
        C87412m.m108594g(t1Var, "pageView");
        C87412m.m108594g(h4Var, "type");
        t1Var.getRuntime();
        C84223s T1 = getRuntime().mo113189T1();
        if (T1 != null) {
            C83928t1 t1Var2 = (C83928t1) i0Var.getCurrentPageView();
            T1.getClass();
            C87412m.m108594g(t1Var2, "page");
            if (T1.f246013b && !T1.mo116910c(t1Var2)) {
                T1.mo116909b(t1Var2, C84213o.C84214a.kAppRoute, T1.f246015d);
            }
        }
    }

    /* renamed from: K */
    public void mo116025K(C83817h4 h4Var, C83820i0 i0Var, C83820i0 i0Var2) {
        Log.m105924i("MicroMsg.AppBrandPageContainerWC", "[onPageSwitchCancel]");
        HalfScreenManger halfScreenManger = getRuntime().f238298z1;
        halfScreenManger.getClass();
        C87412m.m108594g(h4Var, "type");
        if (halfScreenManger.mo117778a(halfScreenManger.f247568a, h4Var)) {
            AppBrandInitConfigWC M1 = halfScreenManger.f247568a.mo113210l1();
            C87412m.m108593f(M1, "runtime.initConfig");
            C13604l<Boolean, Boolean> w = halfScreenManger.mo117800w(i0Var, i0Var2, M1);
            if (((Boolean) w.f38555d).booleanValue()) {
                halfScreenManger.mo117794q(!((Boolean) w.f38556e).booleanValue(), false);
            }
        }
    }

    /* renamed from: L */
    public void mo116026L(C83817h4 h4Var, C83820i0 i0Var, C83820i0 i0Var2) {
        AppBrandRuntimeWC appBrandRuntimeWC;
        C83854n nVar;
        super.mo116026L(h4Var, i0Var, i0Var2);
        Log.m105924i("MicroMsg.AppBrandPageContainerWC", "[onPageSwitchEnd]");
        if (getRuntime() != null) {
            HalfScreenManger halfScreenManger = getRuntime().f238298z1;
            halfScreenManger.getClass();
            C87412m.m108594g(h4Var, "type");
            boolean z = false;
            if (halfScreenManger.mo117778a(halfScreenManger.f247568a, h4Var)) {
                AppBrandInitConfigWC M1 = halfScreenManger.f247568a.mo113210l1();
                C87412m.m108593f(M1, "runtime.initConfig");
                C13604l<Boolean, Boolean> w = halfScreenManger.mo117800w(i0Var, i0Var2, M1);
                if (((Boolean) w.f38555d).booleanValue()) {
                    halfScreenManger.mo117794q(((Boolean) w.f38556e).booleanValue(), false);
                }
            }
            halfScreenManger.mo117788k();
            if (!TextUtils.isEmpty(halfScreenManger.f247568a.mo113210l1().f239395z1) && !halfScreenManger.mo117785h(i0Var) && halfScreenManger.mo117783f(i0Var2)) {
                z = true;
            }
            if (z) {
                C84923d dVar = halfScreenManger.f247568a.f238265A1;
                if (dVar != null) {
                    AppBrandInitConfigWC M12 = dVar.f247525a.mo113210l1();
                    C87412m.m108593f(M12, "runtime.initConfig");
                    dVar.mo117749b(M12);
                    return;
                }
                return;
            }
            C84923d dVar2 = halfScreenManger.f247568a.f238265A1;
            if (dVar2 != null && (appBrandRuntimeWC = dVar2.f247525a) != null && (nVar = appBrandRuntimeWC.f238125T0) != null) {
                nVar.mo116409A();
            }
        }
    }

    /* renamed from: N */
    public void mo116027N(C83817h4 h4Var, C83820i0 i0Var, C83820i0 i0Var2, float f) {
        BaseAppBrandSingleCloseCapsuleBar b;
        if (getRuntime() != null) {
            HalfScreenManger halfScreenManger = getRuntime().f238298z1;
            halfScreenManger.getClass();
            C87412m.m108594g(h4Var, "type");
            if (halfScreenManger.mo117778a(halfScreenManger.f247568a, h4Var)) {
                AppBrandInitConfigWC M1 = halfScreenManger.f247568a.mo113210l1();
                C87412m.m108593f(M1, "runtime.initConfig");
                C13604l<Boolean, Boolean> w = halfScreenManger.mo117800w(i0Var, i0Var2, M1);
                if (((Boolean) w.f38555d).booleanValue() && (b = halfScreenManger.mo117779b()) != null) {
                    b.setHeaderAlpha(((Boolean) w.f38556e).booleanValue() ? f : ((float) 100) - f);
                    int color = b.getContext().getResources().getColor(b.mo116124f(C0966R.color.al6));
                    if (!((Boolean) w.f38556e).booleanValue()) {
                        f = ((float) 100) - f;
                    }
                    int argb = Color.argb((int) ((f * 255.0f) / ((float) 100)), Color.red(color), Color.green(color), Color.blue(color));
                    C89797e eVar = halfScreenManger.f247568a.f238159x;
                    if (eVar.f258187b != null) {
                        eVar.mo124089b().setBackgroundColor(argb);
                    }
                }
            }
        }
    }

    /* renamed from: O */
    public void mo116028O(C83817h4 h4Var, C83820i0 i0Var, C83820i0 i0Var2) {
        super.mo116028O(h4Var, i0Var, i0Var2);
        Log.m105924i("MicroMsg.AppBrandPageContainerWC", "[onPageSwitchStart]");
        HalfScreenManger halfScreenManger = getRuntime().f238298z1;
        halfScreenManger.getClass();
        C87412m.m108594g(h4Var, "type");
        HalfScreenConfig e = halfScreenManger.mo117782e();
        if ((e.mo76931c() && e.f157951n) && i0Var2 != null) {
            i0Var2.setForceDisableMeasureCache(true);
        }
    }

    /* renamed from: P */
    public void mo116029P() {
        ReportStorageSizeTask reportStorageSizeTask = new ReportStorageSizeTask();
        reportStorageSizeTask.f238363f = getRuntime().f238147j;
        reportStorageSizeTask.mo114395c();
    }

    /* renamed from: R */
    public boolean mo116030R() {
        C88435b0 b0Var = (C88435b0) getRuntime().mo113021O(C88435b0.class, false);
        if (!(b0Var != null && b0Var.mo122836a())) {
            return false;
        }
        mo116042o0();
        super.mo116030R();
        return true;
    }

    /* renamed from: T */
    public Object mo116031T(C83820i0 i0Var) {
        return AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2496ek);
    }

    /* renamed from: U */
    public Object mo116032U(C83820i0 i0Var) {
        return AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2506eu);
    }

    /* renamed from: W */
    public Object mo116033W(C83820i0 i0Var) {
        return AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2503er);
    }

    /* renamed from: X */
    public Object mo116034X(C83820i0 i0Var) {
        return AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2498em);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo116035a(java.lang.String r3, com.tencent.p014mm.plugin.appbrand.page.C83817h4 r4, com.tencent.p014mm.plugin.appbrand.page.C83849m0 r5, com.tencent.p014mm.plugin.appbrand.page.m0$$y r6) {
        /*
            r2 = this;
            junit.framework.Assert.assertSame(r2, r5)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r2.getRuntime()
            com.tencent.mm.plugin.appbrand.page.h4[] r0 = r2.f244420x0
            boolean r0 = u24.C90595a.m113498b(r0, r4)
            boolean r5 = p194lc.C88468w.m110320a(r5, r3, r0)
            if (r5 == 0) goto L_0x0021
            lc.s r5 = new lc.s
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r2.getRuntime()
            r5.<init>(r6, r0)
            r2.mo116042o0()
        L_0x001f:
            r6 = r5
            goto L_0x0031
        L_0x0021:
            boolean r5 = com.tencent.p014mm.plugin.appbrand.C84091r2.m103627e()
            if (r5 != 0) goto L_0x0031
            com.tencent.mm.plugin.appbrand.page.d5 r5 = new com.tencent.mm.plugin.appbrand.page.d5
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r2.getRuntime()
            r5.<init>(r6, r0)
            goto L_0x001f
        L_0x0031:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r2.getRuntime()
            boolean r5 = r5.mo121251g1()
            r0 = 0
            if (r5 == 0) goto L_0x003f
            r6.setAnimationEnabled(r0)
        L_0x003f:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r2.getRuntime()
            op0.a r5 = r5.mo113040Y()
            boolean r1 = r5.mo123571d()
            if (r1 != 0) goto L_0x0056
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$c r4 = new com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$c
            r4.<init>(r6)
            r5.mo109805a(r3, r4)
            goto L_0x0059
        L_0x0056:
            r2.mo116041m0(r3, r4, r6, r0)
        L_0x0059:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.AppBrandPageContainerWC.mo116035a(java.lang.String, com.tencent.mm.plugin.appbrand.page.h4, com.tencent.mm.plugin.appbrand.page.m0, com.tencent.mm.plugin.appbrand.page.m0$$y):boolean");
    }

    /* renamed from: b */
    public C83820i0 mo116036b(String str, C83817h4 h4Var, C83849m0 m0Var, Callable<C83820i0> callable) {
        if (C83817h4.APP_LAUNCH != h4Var || !getRuntime().mo121250f1()) {
            return null;
        }
        return new C81914j(getContext(), this);
    }

    /* renamed from: c */
    public boolean mo116037c(String str) {
        if (!getRuntime().mo121254q1()) {
            C88435b0 b0Var = (C88435b0) getRuntime().mo113021O(C88435b0.class, false);
            if (b0Var != null && b0Var.mo122836a()) {
                ((C88267e) getRuntime().f238150p).mo122653c();
                C81634a.C81641g gVar = getRuntime().mo113008F().f239619y;
                String[] strArr = gVar.f239631b;
                if (((strArr.length == 1 && C90595a.m113498b(strArr, "skyline")) || C90599h.m113509b(gVar.f239630a, "skyline")) && !C8136w.NAME.equals(str)) {
                    return true;
                }
            }
        }
        if (C84091r2.m103627e()) {
            return false;
        }
        C84091r2.m103628f(new C83736d(str));
        return true;
    }

    /* renamed from: e */
    public boolean mo116038e(C83780d1 d1Var, String str) {
        if (d1Var == null) {
            return false;
        }
        boolean a = C88468w.m110319a(getRuntime(), str);
        if (!d1Var.mo116168W0() && !a) {
            return true;
        }
        if (!d1Var.mo116168W0() || !a) {
            return false;
        }
        ((LinkedList) this.f244417V).pollFirst();
        return true;
    }

    /* renamed from: f0 */
    public boolean mo115881f0(C83820i0 i0Var) {
        boolean[] zArr = {super.mo115881f0(i0Var), !getRuntime().mo113194Y1(), !getRuntime().mo121254q1(), !C84905f.m104620a(getRuntime()), !C83608m4.m102642a(getRuntime())};
        for (int i = 0; i < 5; i++) {
            if (!zArr[i]) {
                Log.m105925i("MicroMsg.AppBrandPageContainerWC", "[%s,%s]->shouldShowActionBarHomeButton: test fail cause #[%d] condition", i0Var.getAppId(), i0Var.getCurrentUrl(), Integer.valueOf(i));
                return false;
            }
        }
        return true;
    }

    /* renamed from: k0 */
    public final void mo116039k0() {
        if (getCurrentPage() != null && getCurrentPage().getCurrentPageView() != null) {
            if (getRuntime().mo113208k1() == 1118) {
                AppBrandRecommendStatObj appBrandRecommendStatObj = getRuntime().mo121253n1() == null ? null : getRuntime().mo121253n1().f245539o;
                if (appBrandRecommendStatObj != null) {
                    Log.m105924i("MicroMsg.AppBrandPageContainerWC", "recommendStatObj is got");
                    if (!TextUtils.isEmpty(appBrandRecommendStatObj.f158162h) && !TextUtils.isEmpty(appBrandRecommendStatObj.f158163i)) {
                        this.f244414S = appBrandRecommendStatObj.f158162h + "?" + appBrandRecommendStatObj.f158163i;
                    } else if (!TextUtils.isEmpty(appBrandRecommendStatObj.f158162h)) {
                        this.f244414S = appBrandRecommendStatObj.f158162h;
                    } else {
                        this.f244414S = getRuntime().mo113030T();
                    }
                    this.f244408L = true;
                    this.f244412Q = System.currentTimeMillis();
                }
            }
            if (getRuntime().mo113208k1() == 1162) {
                this.f244410N = true;
                this.f244412Q = System.currentTimeMillis();
            }
        }
    }

    /* renamed from: l0 */
    public final void mo116040l0() {
        if (this.f244406J != null) {
            Log.m105924i("MicroMsg.AppBrandPageContainerWC", "[weishi] hideWeishiCoverImageIfNeed");
            FrameLayout frameLayout = this.f244406J;
            AppBrandRuntimeWC runtime = getRuntime();
            runtime.mo113025Q0(new C1942a(this, frameLayout), 300);
            this.f244406J = null;
            C84560k4 k4Var = runtime.f238154s;
            if (k4Var instanceof C84570o4) {
                Log.m105924i("MicroMsg.AppBrandPageContainerWC", "[weishi] hideWeishiCoverImageIfNeed, hide");
                ((C84570o4) k4Var).mo117201k(true, "");
            }
        }
    }

    /* renamed from: m0 */
    public final void mo116041m0(String str, C83817h4 h4Var, m0$$y m0__y, boolean z) {
        C115669n.INSTANCE.mo175911u(937, z ? 5 : 1);
        getRuntime().f238115M.mo109805a(str, new C83737e(m0__y, h4Var, str, z));
    }

    /* renamed from: n0 */
    public C83928t1 mo115880d(C83849m0 m0Var, String str) {
        boolean z;
        boolean a = C88468w.m110319a(getRuntime(), str);
        C83928t1 t1Var = null;
        if (TextUtils.isEmpty(this.f244418W) || a) {
            if (a) {
                ((C88267e) getRuntime().f238150p).mo122653c();
            }
            synchronized (this.f244417V) {
                Iterator<C83928t1> it = this.f244417V.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C83928t1 next = it.next();
                    if ((a || next.mo116168W0()) && (!a || !next.mo116168W0())) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        it.remove();
                        t1Var = next;
                        break;
                    }
                }
            }
            return t1Var != null ? t1Var : a ? new C83928t1(C88453o.class) : new C83928t1();
        }
        synchronized (this.f244417V) {
            Iterator<C83928t1> it4 = this.f244417V.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C83928t1 next2 = it4.next();
                if (next2 instanceof C83768b4) {
                    it4.remove();
                    t1Var = next2;
                    break;
                }
            }
        }
        return t1Var != null ? t1Var : new C83768b4(this.f244418W);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.tencent.mm.plugin.appbrand.page.d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.tencent.mm.plugin.appbrand.page.t1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116042o0() {
        /*
            r5 = this;
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r5.getRuntime()
            com.tencent.mm.plugin.appbrand.i2 r0 = r0.f238150p
            kr0.e r0 = (kr0.C88267e) r0
            java.lang.Class<com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl> r1 = com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl.class
            java.lang.Object r0 = r0.mo125517G0(r1)
            com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl r0 = (com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) r0
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r5.getRuntime()
            com.tencent.mm.plugin.appbrand.i2 r1 = r1.f238150p
            kr0.e r1 = (kr0.C88267e) r1
            r0.getClass()
            java.lang.String r2 = "service"
            gy3.C87412m.m108594g(r1, r2)
            r2 = 1
            r0.mo111458h(r1, r2)
            boolean r1 = r0.f235026c
            if (r1 != 0) goto L_0x00a1
            java.util.Deque<com.tencent.mm.plugin.appbrand.page.t1> r1 = r5.f244417V
            monitor-enter(r1)
            java.util.Deque<com.tencent.mm.plugin.appbrand.page.t1> r2 = r5.f244417V     // Catch:{ all -> 0x009e }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x009e }
        L_0x0032:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x009e }
            if (r3 == 0) goto L_0x0046
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x009e }
            com.tencent.mm.plugin.appbrand.page.t1 r3 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r3     // Catch:{ all -> 0x009e }
            boolean r4 = r3.mo116168W0()     // Catch:{ all -> 0x009e }
            if (r4 == 0) goto L_0x0032
            monitor-exit(r1)     // Catch:{ all -> 0x009e }
            goto L_0x0048
        L_0x0046:
            monitor-exit(r1)     // Catch:{ all -> 0x009e }
            r3 = 0
        L_0x0048:
            if (r3 != 0) goto L_0x0067
            java.util.List r1 = r5.getPreloadedPageView()
            java.util.Iterator r1 = r1.iterator()
        L_0x0052:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0067
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.appbrand.page.d1 r2 = (com.tencent.p014mm.plugin.appbrand.page.C83780d1) r2
            boolean r4 = r2.mo116168W0()
            if (r4 == 0) goto L_0x0052
            r3 = r2
            com.tencent.mm.plugin.appbrand.page.t1 r3 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r3
        L_0x0067:
            if (r3 != 0) goto L_0x0084
            com.tencent.mm.plugin.appbrand.page.t1 r3 = new com.tencent.mm.plugin.appbrand.page.t1
            java.lang.Class<lc.o> r1 = p194lc.C88453o.class
            r3.<init>(r1)
            com.tencent.mm.plugin.appbrand.report.quality.q r1 = com.tencent.p014mm.plugin.appbrand.report.quality.C84217q.PreloadBeforeRuntimeInit
            r3.mo124768F1(r1)
            java.util.Deque<com.tencent.mm.plugin.appbrand.page.t1> r1 = r5.f244417V
            monitor-enter(r1)
            java.util.Deque<com.tencent.mm.plugin.appbrand.page.t1> r2 = r5.f244417V     // Catch:{ all -> 0x0081 }
            java.util.LinkedList r2 = (java.util.LinkedList) r2     // Catch:{ all -> 0x0081 }
            r2.add(r3)     // Catch:{ all -> 0x0081 }
            monitor-exit(r1)     // Catch:{ all -> 0x0081 }
            goto L_0x0084
        L_0x0081:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0081 }
            throw r0
        L_0x0084:
            com.tencent.mm.plugin.appbrand.page.r1 r1 = r3.mo116158M0()
            lc.o r1 = (p194lc.C88453o) r1
            lc.y r1 = r1.mo116543B0()
            java.util.Objects.requireNonNull(r1)
            com.tencent.luggage.skyline.SkylineView r2 = r1.f255554h
            gy3.C87412m.m108591d(r2)
            boolean r2 = r2.f235014q
            if (r2 != 0) goto L_0x00a1
            r1.mo122881l(r0)
            goto L_0x00a1
        L_0x009e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009e }
            throw r0
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.AppBrandPageContainerWC.mo116042o0():void");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C83820i0) {
            C83769b5.m102908a((C83820i0) view);
        }
    }

    /* renamed from: p0 */
    public void mo116044p0() {
        getReporter().mo115892j();
        this.f244408L = false;
        this.f244409M = false;
        this.f244410N = false;
        this.f244415T = null;
    }

    /* renamed from: q0 */
    public final void mo116045q0(C83820i0 i0Var) {
        if (getRuntime() != null && getRuntime().f238280P1 != null) {
            if (i0Var.getCurrentPageView().mo116168W0()) {
                C88916a aVar = getRuntime().f238280P1.f256470a;
                if (aVar != null) {
                    View view = aVar.f256456f;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/luggage/skyline/wxa/inspector/SkylineInspector", "showButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/luggage/skyline/wxa/inspector/SkylineInspector", "showButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                C87412m.m108603p("consoleView");
                throw null;
            }
            C88916a aVar3 = getRuntime().f238280P1.f256470a;
            if (aVar3 != null) {
                View view3 = aVar3.f256456f;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/luggage/skyline/wxa/inspector/SkylineInspector", "hideButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/luggage/skyline/wxa/inspector/SkylineInspector", "hideButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C87412m.m108603p("consoleView");
            throw null;
        }
    }

    public void setWAAutoWebViewJs(String str) {
        this.f244418W = str;
    }

    /* renamed from: v */
    public final boolean mo116047v() {
        ListIterator<C83820i0> listIterator = this.f244745p.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next() instanceof C81914j) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0065, code lost:
        if (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC.f238264Q1 != false) goto L_0x0067;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo115883w(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.getAppId()
            uo0.a r1 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPageInit
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102130g(r0, r1)
            java.lang.String r0 = r3.getAppId()
            uo0.a r1 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPageInitUIGroup
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102130g(r0, r1)
            java.lang.String r0 = r3.getAppId()
            uo0.a r1 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepCreatePageUI
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102130g(r0, r1)
            java.lang.String r0 = r3.getAppId()
            uo0.a r1 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepCreatePageUI_Game
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102130g(r0, r1)
            java.lang.String r0 = r3.getAppId()
            uo0.a r1 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPageInitUIGroup_Game
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102128e(r0, r1)
            super.mo115883w(r4)
            java.lang.String r4 = r3.getAppId()
            uo0.a r0 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepCreatePageUI
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102128e(r4, r0)
            java.lang.String r4 = r3.getAppId()
            uo0.a r0 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPageInitUIGroup
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102128e(r4, r0)
            java.lang.String r4 = r3.getAppId()
            uo0.a r0 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepCreatePageUI_Game
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102128e(r4, r0)
            java.lang.String r4 = r3.getAppId()
            uo0.a r0 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPageInitUIGroup_Game
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102128e(r4, r0)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r3.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r4 = r4.mo113213o1()
            boolean r4 = r4.f234889w
            if (r4 != 0) goto L_0x0067
            r3.getRuntime()
            boolean r4 = com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC.f238264Q1
            if (r4 == 0) goto L_0x0075
        L_0x0067:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r3.getRuntime()
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$b r0 = new com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$b
            r0.<init>()
            r1 = 10000(0x2710, double:4.9407E-320)
            r4.mo113025Q0(r0, r1)
        L_0x0075:
            com.tencent.mm.plugin.appbrand.report.quality.e r4 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.f245912a     // Catch:{ all -> 0x007b }
            r4.mo116898b(r3)     // Catch:{ all -> 0x007b }
            goto L_0x008a
        L_0x007b:
            r4 = move-exception
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r4 = "MicroMsg.AppBrandPageContainerWC"
            java.lang.String r1 = "pagecontainerInitReport %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r1, r0)
        L_0x008a:
            r3.mo116039k0()
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r3.getRuntime()
            boolean r4 = com.tencent.p014mm.plugin.appbrand.weishi.C84905f.m104620a(r4)
            if (r4 == 0) goto L_0x009e
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.jsapi.video.event.AppBrandVideoPlayEvent> r4 = r3.f244419p0
            if (r4 == 0) goto L_0x009e
            r4.alive()
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.AppBrandPageContainerWC.mo115883w(java.lang.String):void");
    }

    public AppBrandRuntimeWC getRuntime() {
        return (AppBrandRuntimeWC) super.getRuntime();
    }

    public AppBrandPageContainerWC(Context context, AppBrandRuntimeWC appBrandRuntimeWC, m0$$v m0__v) {
        super(context, appBrandRuntimeWC);
        if (getRuntime().mo121254q1()) {
            this.f244416U = null;
        } else {
            C91151g gVar = new C91151g(this);
            this.f244416U = gVar;
            C33407g gVar2 = C33407g.f90517a;
            gVar.f261372c = 2;
            gVar.f261373d = true;
            gVar.f261374e = true;
            if (C84499c0.m104089c()) {
                setPageNavigationPushTimeout(C84499c0.m104087a());
            }
        }
        this.f244419p0 = new IListener<AppBrandVideoPlayEvent>(C40008f.f107254d) {
            {
                this.__eventId = 839890650;
            }

            public boolean callback(IEvent iEvent) {
                if (((AppBrandVideoPlayEvent) iEvent) == null) {
                    return false;
                }
                Log.m105924i("MicroMsg.AppBrandPageContainerWC", "[weishi] receive weishi play event");
                AppBrandPageContainerWC appBrandPageContainerWC = AppBrandPageContainerWC.this;
                int i = AppBrandPageContainerWC.f244405y0;
                appBrandPageContainerWC.mo116040l0();
                C84905f.m104622c();
                return false;
            }
        };
        this.f244420x0 = new C83817h4[]{C83817h4.APP_LAUNCH, C83817h4.SWITCH_TAB, C83817h4.RE_LAUNCH, C83817h4.AUTO_RE_LAUNCH, C83817h4.REDIRECT_TO};
        setDelegate(m0__v);
    }
}
