package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityCloseBeforeReadyStruct;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.plugin.appbrand.app.C81194z;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.C83506v1;
import com.tencent.p014mm.plugin.appbrand.p026ui.wxa_container.AppBrandContainerFragmentActivity;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.model.C84170q;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent;
import com.tencent.p014mm.plugin.appbrand.service.AppBrandUIFinishEvent;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataFragmentActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import cp0.C86082d;
import cp0.C86083e;
import cp0.C86085g;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C24570s;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import jy3.C117370c;
import jy3.C88045a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C88989a;
import nj3.C88990b;
import ny3.C89104m;
import p1042u.C90590d;
import p224ra.C89909e;
import p385u2.C111105a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import u24.C90599h;
import wi0.C66117m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataFragmentActivity;", "Lcom/tencent/mm/plugin/appbrand/launching/v1;", "<init>", "()V", "AppBrandUIEnterAnimationCompleteEventListener", "AppBrandUIFinishEventListener", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI */
public class AppBrandPreLoadingUI extends MMSecDataFragmentActivity implements C83506v1 {

    /* renamed from: C */
    public static final /* synthetic */ C89104m<Object>[] f246400C = {C24560g0.m30726b(new C24570s(AppBrandPreLoadingUI.class, "isForeground", "isForeground()Z", 0))};

    /* renamed from: A */
    public final C13601g f246401A = C36568h.m40985a(new C84444f(this));

    /* renamed from: B */
    public final C13601g f246402B;

    /* renamed from: j */
    public String f246403j = "";

    /* renamed from: n */
    public C86085g f246404n;

    /* renamed from: o */
    public final C117370c f246405o = new C84442d(Boolean.TRUE, this);

    /* renamed from: p */
    public int f246406p = -1;

    /* renamed from: q */
    public Intent f246407q;

    /* renamed from: r */
    public boolean f246408r;

    /* renamed from: s */
    public String f246409s = "";

    /* renamed from: t */
    public boolean f246410t;

    /* renamed from: u */
    public AppBrandUIEnterAnimationCompleteEventListener f246411u;

    /* renamed from: v */
    public AppBrandUIFinishEventListener f246412v;

    /* renamed from: w */
    public C84170q f246413w = new C84170q();

    /* renamed from: x */
    public String f246414x = "";

    /* renamed from: y */
    public WxaAttributes.WxaVersionInfo f246415y;

    /* renamed from: z */
    public C86082d f246416z;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI$AppBrandUIEnterAnimationCompleteEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/plugin/appbrand/service/AppBrandUIEnterAnimationCompleteEvent;", "<init>", "(Lcom/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI;)V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI$AppBrandUIEnterAnimationCompleteEventListener */
    public final class AppBrandUIEnterAnimationCompleteEventListener extends IListener<AppBrandUIEnterAnimationCompleteEvent> {
        public AppBrandUIEnterAnimationCompleteEventListener() {
            super(C40008f.f107254d);
        }

        public boolean callback(IEvent iEvent) {
            AppBrandUIEnterAnimationCompleteEvent appBrandUIEnterAnimationCompleteEvent = (AppBrandUIEnterAnimationCompleteEvent) iEvent;
            C87412m.m108594g(appBrandUIEnterAnimationCompleteEvent, "event");
            String str = appBrandUIEnterAnimationCompleteEvent.f80563d.f80564a;
            Log.m105924i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "AppBrandUIEnterAnimationCompleteEvent.callback: eventHash=" + appBrandUIEnterAnimationCompleteEvent.hashCode() + ", targetUiName = " + AppBrandPreLoadingUI.this.f246414x + ", received = " + str);
            if (!C87412m.m108589b(AppBrandPreLoadingUI.this.f246414x, appBrandUIEnterAnimationCompleteEvent.f80563d.f80564a)) {
                return false;
            }
            AppBrandPreLoadingUI.this.finish();
            return false;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI$AppBrandUIFinishEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/plugin/appbrand/service/AppBrandUIFinishEvent;", "<init>", "(Lcom/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI;)V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI$AppBrandUIFinishEventListener */
    public final class AppBrandUIFinishEventListener extends IListener<AppBrandUIFinishEvent> {
        public AppBrandUIFinishEventListener() {
            super(C40008f.f107254d);
        }

        public boolean callback(IEvent iEvent) {
            AppBrandUIFinishEvent appBrandUIFinishEvent = (AppBrandUIFinishEvent) iEvent;
            C87412m.m108594g(appBrandUIFinishEvent, "event");
            StringBuilder sb = new StringBuilder();
            sb.append("AppBrandUIFinishEvent.callback: eventHash=");
            sb.append(appBrandUIFinishEvent.hashCode());
            sb.append(", targetUiName=");
            sb.append(AppBrandPreLoadingUI.this.f246414x);
            sb.append(", received=");
            AppBrandUIFinishEvent.C29632a aVar = appBrandUIFinishEvent.f80565d;
            String str = null;
            sb.append(aVar != null ? aVar.f80566a : null);
            Log.m105924i("MicroMsg.AppBrand.AppBrandPreLoadingUI", sb.toString());
            String str2 = AppBrandPreLoadingUI.this.f246414x;
            AppBrandUIFinishEvent.C29632a aVar2 = appBrandUIFinishEvent.f80565d;
            if (aVar2 != null) {
                str = aVar2.f80566a;
            }
            if (!C90599h.m113509b(str2, str)) {
                return false;
            }
            AppBrandPreLoadingUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI$a */
    public static final class C84439a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandPreLoadingUI f246417d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84439a(AppBrandPreLoadingUI appBrandPreLoadingUI) {
            super(0);
            this.f246417d = appBrandPreLoadingUI;
        }

        public Object invoke() {
            AppBrandPreLoadingUI appBrandPreLoadingUI = this.f246417d;
            appBrandPreLoadingUI.f246408r = true;
            appBrandPreLoadingUI.mo117084P7();
            this.f246417d.finish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI$b */
    public static final class C84440b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandPreLoadingUI f246418d;

        /* renamed from: e */
        public final /* synthetic */ String f246419e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84440b(AppBrandPreLoadingUI appBrandPreLoadingUI, String str) {
            super(0);
            this.f246418d = appBrandPreLoadingUI;
            this.f246419e = str;
        }

        public Object invoke() {
            if (!this.f246418d.isDestroyed() && !this.f246418d.isFinishing()) {
                C86085g b = C86083e.f250564a.mo120506b(this.f246418d.f246406p);
                String str = null;
                Intent intent = b != null ? b.f250570b : null;
                if (intent == null) {
                    Log.m105924i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "attach[" + this.f246419e + "]: onProgressLoadSuccess and get a null intent");
                } else {
                    AppBrandPreLoadingUI appBrandPreLoadingUI = this.f246418d;
                    ComponentName component = intent.getComponent();
                    if (component != null) {
                        str = component.getClassName();
                    }
                    if (str == null) {
                        str = "null";
                    }
                    appBrandPreLoadingUI.f246414x = str;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onProgressLoadSuccess targetUiName:");
                    sb.append(this.f246418d.f246414x);
                    sb.append(", isForeground:");
                    AppBrandPreLoadingUI appBrandPreLoadingUI2 = this.f246418d;
                    C117370c cVar = appBrandPreLoadingUI2.f246405o;
                    C89104m<Object>[] mVarArr = AppBrandPreLoadingUI.f246400C;
                    sb.append(((Boolean) ((C88045a) cVar).mo122486c(appBrandPreLoadingUI2, mVarArr[0])).booleanValue());
                    Log.m105924i("MicroMsg.AppBrand.AppBrandPreLoadingUI", sb.toString());
                    AppBrandPreLoadingUI appBrandPreLoadingUI3 = this.f246418d;
                    if (((Boolean) ((C88045a) appBrandPreLoadingUI3.f246405o).mo122486c(appBrandPreLoadingUI3, mVarArr[0])).booleanValue()) {
                        AppBrandPreLoadingUI appBrandPreLoadingUI4 = this.f246418d;
                        Object clone = intent.clone();
                        C87412m.m108592e(clone, "null cannot be cast to non-null type android.content.Intent");
                        Intent intent2 = (Intent) clone;
                        this.f246418d.getClass();
                        intent2.setFlags(intent2.getFlags() & -268435457);
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent2);
                        AppBrandPreLoadingUI appBrandPreLoadingUI5 = appBrandPreLoadingUI4;
                        C117292a.m165358d(appBrandPreLoadingUI5, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI$attach$4", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        appBrandPreLoadingUI4.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(appBrandPreLoadingUI5, "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI$attach$4", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        this.f246418d.f246407q = intent;
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI$c */
    public static final class C84441c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandPreLoadingUI f246420d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84441c(AppBrandPreLoadingUI appBrandPreLoadingUI) {
            super(0);
            this.f246420d = appBrandPreLoadingUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f246420d.getIntent().getIntExtra("MicroMsg.AppBrandPreLoadingLogic.scene", 1000));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI$d */
    public static final class C84442d extends C88045a<Boolean> {

        /* renamed from: b */
        public final /* synthetic */ AppBrandPreLoadingUI f246421b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84442d(Object obj, AppBrandPreLoadingUI appBrandPreLoadingUI) {
            super(obj);
            this.f246421b = appBrandPreLoadingUI;
        }

        /* renamed from: a */
        public void mo117086a(C89104m<?> mVar, Boolean bool, Boolean bool2) {
            C87412m.m108594g(mVar, "property");
            boolean booleanValue = bool2.booleanValue();
            boolean booleanValue2 = bool.booleanValue();
            if (booleanValue && !booleanValue2) {
                AppBrandPreLoadingUI appBrandPreLoadingUI = this.f246421b;
                if (appBrandPreLoadingUI.f246407q != null) {
                    Bundle bundle = Build.VERSION.SDK_INT >= 31 ? ActivityOptions.makeCustomAnimation(appBrandPreLoadingUI, 0, 0).toBundle() : null;
                    AppBrandPreLoadingUI appBrandPreLoadingUI2 = this.f246421b;
                    Intent intent = appBrandPreLoadingUI2.f246407q;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(bundle);
                    aVar.mo10233c(intent);
                    AppBrandPreLoadingUI appBrandPreLoadingUI3 = appBrandPreLoadingUI2;
                    C117292a.m165358d(appBrandPreLoadingUI3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI$special$$inlined$observable$1", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
                    appBrandPreLoadingUI2.startActivity((Intent) aVar.mo10231a(0), (Bundle) aVar.mo10231a(1));
                    C117292a.m165359e(appBrandPreLoadingUI3, "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI$special$$inlined$observable$1", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
                    this.f246421b.f246407q = null;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI$e */
    public static final class C84443e extends C87413o implements C32224a<C84560k4> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandPreLoadingUI f246422d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84443e(AppBrandPreLoadingUI appBrandPreLoadingUI) {
            super(0);
            this.f246422d = appBrandPreLoadingUI;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
            r2 = r2.f250571c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r4 = this;
                com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI r0 = r4.f246422d
                ny3.m<java.lang.Object>[] r1 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI.f246400C
                int r1 = r0.mo117083O7()
                r2 = 4
                if (r1 != r2) goto L_0x0037
                cp0.e r1 = cp0.C86083e.f250564a
                com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI r2 = r4.f246422d
                int r2 = r2.f246406p
                monitor-enter(r1)
                android.util.SparseArray<cp0.g> r3 = cp0.C86083e.f250565b     // Catch:{ all -> 0x0034 }
                java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x0034 }
                cp0.g r2 = (cp0.C86085g) r2     // Catch:{ all -> 0x0034 }
                monitor-exit(r1)
                r1 = 0
                if (r2 == 0) goto L_0x0027
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r2 = r2.f250571c
                if (r2 == 0) goto L_0x0027
                com.tencent.mm.plugin.appbrand.ui.h4 r2 = com.tencent.p014mm.plugin.appbrand.p026ui.C84686v0.m104334c(r0, r2)
                goto L_0x0028
            L_0x0027:
                r2 = r1
            L_0x0028:
                if (r2 != 0) goto L_0x003c
                com.tencent.mm.plugin.appbrand.ui.x0 r2 = new com.tencent.mm.plugin.appbrand.ui.x0
                com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI r3 = r4.f246422d
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r3 = r3.f246415y
                r2.<init>(r0, r1, r3)
                goto L_0x003c
            L_0x0034:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            L_0x0037:
                com.tencent.mm.plugin.appbrand.ui.v2 r2 = new com.tencent.mm.plugin.appbrand.ui.v2
                r2.<init>(r0)
            L_0x003c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI.C84443e.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI$f */
    public static final class C84444f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandPreLoadingUI f246423d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84444f(AppBrandPreLoadingUI appBrandPreLoadingUI) {
            super(0);
            this.f246423d = appBrandPreLoadingUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f246423d.getIntent().getIntExtra("MicroMsg.AppBrandPreLoadingLogic.splashFlavor", 5));
        }
    }

    public AppBrandPreLoadingUI() {
        C36568h.m40985a(new C84441c(this));
        this.f246402B = C36568h.m40985a(new C84443e(this));
    }

    /* renamed from: M7 */
    public final void mo117081M7(Intent intent, String str) {
        SparseArray<C86085g> sparseArray;
        C86085g gVar;
        String stringExtra = intent.getStringExtra("MicroMsg.AppBrandPreLoadingLogic.icon");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = intent.getStringExtra("MicroMsg.AppBrandPreLoadingLogic.name");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        String stringExtra3 = intent.getStringExtra("MicroMsg.AppBrandPreLoadingLogic.appId");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f246403j = stringExtra3;
        this.f246415y = (WxaAttributes.WxaVersionInfo) intent.getParcelableExtra("MicroMsg.AppBrandPreLoadingLogic.versionInfo");
        String stringExtra4 = intent.getStringExtra("MicroMsg.AppBrandPreLoadingLogic.targetActivityName");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f246414x = stringExtra4;
        int intExtra = intent.getIntExtra("MicroMsg.AppBrandPreLoadingLogic.intentKey", -1);
        this.f246406p = intExtra;
        C86083e eVar = C86083e.f250564a;
        synchronized (eVar) {
            sparseArray = C86083e.f250565b;
            C86085g gVar2 = sparseArray.get(intExtra);
            if (gVar2 == null) {
                Log.m105924i("MicroMsg.AppBrand.PendingIntentPoster", "updateCtx: get a null task by intentKey = " + intExtra);
            } else {
                gVar2.f250569a = this;
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        int i = this.f246406p;
        synchronized (eVar) {
            gVar = sparseArray.get(i);
        }
        C66117m mVar = null;
        AppBrandInitConfigWC appBrandInitConfigWC = gVar != null ? gVar.f250571c : null;
        if (appBrandInitConfigWC != null) {
            ((C84674s4) C89909e.m112436a(C84674s4.class)).mo111331Gm(this, appBrandInitConfigWC);
            AppBrandStatObject appBrandStatObject = appBrandInitConfigWC.f234834c1;
            if (appBrandStatObject != null && 1225 == appBrandStatObject.f245533f) {
                Log.m105924i("MicroMsg.WMPFVoip.WmpfVoipWindowFlags", "add, activity: " + this);
                Window window = getWindow();
                if (window != null) {
                    window.addFlags(6815744);
                }
            } else {
                Log.m105924i("MicroMsg.WMPFVoip.WmpfVoipWindowFlags", "clear, activity: " + this);
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.clearFlags(6815744);
                }
            }
        }
        AppBrandUIEnterAnimationCompleteEventListener appBrandUIEnterAnimationCompleteEventListener = this.f246411u;
        if (appBrandUIEnterAnimationCompleteEventListener != null) {
            appBrandUIEnterAnimationCompleteEventListener.dead();
        }
        AppBrandUIEnterAnimationCompleteEventListener appBrandUIEnterAnimationCompleteEventListener2 = new AppBrandUIEnterAnimationCompleteEventListener();
        appBrandUIEnterAnimationCompleteEventListener2.alive();
        this.f246411u = appBrandUIEnterAnimationCompleteEventListener2;
        AppBrandUIFinishEventListener appBrandUIFinishEventListener = this.f246412v;
        if (appBrandUIFinishEventListener != null) {
            appBrandUIFinishEventListener.dead();
        }
        AppBrandUIFinishEventListener appBrandUIFinishEventListener2 = new AppBrandUIFinishEventListener();
        appBrandUIFinishEventListener2.alive();
        this.f246412v = appBrandUIFinishEventListener2;
        String stringExtra5 = intent.getStringExtra("MicroMsg.AppBrandPreLoadingLogic.serviceName");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.f246409s = stringExtra5;
        mo117082N7().mo1912q(stringExtra, stringExtra2);
        C84560k4 N7 = mo117082N7();
        C84690v2 v2Var = N7 instanceof C84690v2 ? (C84690v2) N7 : null;
        if (v2Var != null) {
            if (appBrandInitConfigWC != null) {
                mVar = appBrandInitConfigWC.f239372B1;
            }
            if (mVar == null) {
                mVar = C66117m.NORMAL;
            }
            v2Var.setTheme(mVar);
        }
        if (mo117082N7() instanceof C84565m4) {
            C84560k4 N72 = mo117082N7();
            C87412m.m108592e(N72, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.IAppBrandLoadingSplashCloseable");
            ((C84565m4) N72).mo117194F(new C84439a(this));
        }
        Log.m105924i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "attach[" + str + "]: uiFlavor = " + mo117083O7() + ", iconUrl = " + stringExtra + ", name = " + stringExtra2);
        Intent intent2 = new Intent();
        intent2.setClassName(this, this.f246409s);
        C86082d dVar = new C86082d(this.f246406p, "MicroMsg.AppBrand.AppBrandPreLoadingUI", new C84440b(this, str));
        this.f246416z = dVar;
        try {
            this.f246410t = bindService(intent2, dVar, 65);
            Log.m105924i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "attach[" + str + "]: bind " + this.f246409s + " ret = " + this.f246410t);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrand.AppBrandPreLoadingUI", "attach[" + str + "]: bindService fail", e);
        }
        C84170q qVar = new C84170q();
        this.f246413w = qVar;
        qVar.f245768a = Util.currentTicks();
    }

    /* renamed from: N7 */
    public final C84560k4 mo117082N7() {
        return (C84560k4) ((C36570n) this.f246402B).getValue();
    }

    /* renamed from: O7 */
    public final int mo117083O7() {
        return ((Number) ((C36570n) this.f246401A).getValue()).intValue();
    }

    /* renamed from: P7 */
    public final void mo117084P7() {
        this.f246404n = C86083e.f250564a.mo120506b(this.f246406p);
        Log.m105924i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "tryToInterruptPost: interrupt #" + this.f246406p + " successful");
    }

    public void finish() {
        if (!isFinishing() && !isDestroyed()) {
            super.finish();
            Log.m105924i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "finish: isCloseByUser:" + this.f246408r + ", appId:" + this.f246403j);
            if (this.f246408r) {
                C86085g gVar = this.f246404n;
                if (gVar != null) {
                    AppBrandInitConfigWC appBrandInitConfigWC = gVar.f250571c;
                    C84170q qVar = this.f246413w;
                    C87412m.m108591d(gVar);
                    AppBrandStatObject appBrandStatObject = gVar.f250572d;
                    qVar.getClass();
                    qVar.f245775h = appBrandInitConfigWC.f234837q;
                    C84072q1.m103587b(appBrandInitConfigWC.f239362d);
                    qVar.f245770c = C84116i0.m103659b(MMApplicationContext.getContext());
                    qVar.f245771d = appBrandInitConfigWC.f239362d;
                    qVar.f245772e = appBrandInitConfigWC.f234802F;
                    qVar.f245773f = appBrandInitConfigWC.f239365g;
                    qVar.f245774g = appBrandStatObject.f245533f;
                    qVar.f245776i = qVar.f245769b ? 1 : 0;
                    qVar.f245777j = Util.ticksToNow(qVar.f245768a);
                    qVar.f245778k = Util.nowMilliSecond();
                    qVar.f245779l = appBrandInitConfigWC.f234839s;
                    qVar.f245780m = (long) appBrandInitConfigWC.f239379j1.f245835g;
                    qVar.f245781n = appBrandInitConfigWC.f239379j1.f245832d;
                    this.f246413w.mo116844a();
                    QualitySession qualitySession = appBrandInitConfigWC.f239379j1;
                    WeAppQualityCloseBeforeReadyStruct weAppQualityCloseBeforeReadyStruct = new WeAppQualityCloseBeforeReadyStruct();
                    weAppQualityCloseBeforeReadyStruct.f236774d = weAppQualityCloseBeforeReadyStruct.mo86045b("InstanceId", qualitySession.f245832d, true);
                    weAppQualityCloseBeforeReadyStruct.f236775e = weAppQualityCloseBeforeReadyStruct.mo86045b("AppId", qualitySession.f245833e, true);
                    weAppQualityCloseBeforeReadyStruct.f236776f = (long) qualitySession.f245837i;
                    int i = qualitySession.f245834f;
                    weAppQualityCloseBeforeReadyStruct.f236777g = i != 1 ? i != 2 ? i != 3 ? null : WeAppQualityCloseBeforeReadyStruct.C80764a.demo : WeAppQualityCloseBeforeReadyStruct.C80764a.debug : WeAppQualityCloseBeforeReadyStruct.C80764a.release;
                    weAppQualityCloseBeforeReadyStruct.f236778h = (long) qualitySession.f245835g;
                    weAppQualityCloseBeforeReadyStruct.f236780j = (long) qualitySession.f245836h;
                    weAppQualityCloseBeforeReadyStruct.f236783m = weAppQualityCloseBeforeReadyStruct.mo86045b("username", appBrandInitConfigWC.f234839s, true);
                    weAppQualityCloseBeforeReadyStruct.f236784n = 2;
                    weAppQualityCloseBeforeReadyStruct.f236785o = 0;
                    weAppQualityCloseBeforeReadyStruct.f236786p = weAppQualityCloseBeforeReadyStruct.mo86045b("networkType", C84116i0.m103659b(MMApplicationContext.getContext()), true);
                    weAppQualityCloseBeforeReadyStruct.f236787q = appBrandInitConfigWC.f234825W0 ? 1 : 0;
                    weAppQualityCloseBeforeReadyStruct.f236788r = 2;
                    long j = appBrandInitConfigWC.f234800D;
                    weAppQualityCloseBeforeReadyStruct.f236781k = j;
                    weAppQualityCloseBeforeReadyStruct.mo86048e("StartTimeStampMs", j);
                    long nowMilliSecond = Util.nowMilliSecond();
                    weAppQualityCloseBeforeReadyStruct.f236782l = nowMilliSecond;
                    weAppQualityCloseBeforeReadyStruct.mo86048e("EndTimeStampMs", nowMilliSecond);
                    long j2 = weAppQualityCloseBeforeReadyStruct.f236782l - weAppQualityCloseBeforeReadyStruct.f236781k;
                    weAppQualityCloseBeforeReadyStruct.f236779i = j2;
                    weAppQualityCloseBeforeReadyStruct.mo86046c("CostTimeMs", j2);
                    weAppQualityCloseBeforeReadyStruct.f236789s = 0;
                    weAppQualityCloseBeforeReadyStruct.mo86054n();
                    this.f246404n = null;
                }
                if (mo117083O7() == 5) {
                    ((C84674s4) C89909e.m112436a(C84674s4.class)).mo111332aG(this);
                } else if (mo117083O7() == 4) {
                    super.overridePendingTransition(MMFragmentActivity$$c.f318646c, MMFragmentActivity$$c.f318647d);
                }
            } else {
                View findViewById = findViewById(16908290);
                if (findViewById != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI", "finish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById, "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI", "finish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                super.overridePendingTransition(0, 0);
            }
        }
    }

    public boolean isSupportNavigationSwipeBack() {
        return false;
    }

    public void onBackPressed() {
        this.f246408r = true;
        mo117084P7();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        Intent intent;
        requestWindowFeature(10);
        boolean z = true;
        requestWindowFeature(1);
        setTheme(C84532g3.m104119a(isTaskRoot()));
        super.onCreate(bundle);
        C81194z zVar = C81194z.f238510d;
        int taskId = getTaskId();
        zVar.getClass();
        C90590d<Integer> dVar = C81194z.f238521r;
        synchronized (dVar) {
            dVar.add(Integer.valueOf(taskId));
        }
        if (!(bundle == null || (intent = (Intent) bundle.getParcelable("MicroMsg.AppBrandPreLoadingUI.intent")) == null)) {
            Log.m105924i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "onCreate: saved intent != null");
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        FrameLayout frameLayout = new FrameLayout(this);
        setContentView((View) frameLayout);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (BuildInfo.DEBUG || WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
            MultiProcessMMKV a = C1510o.f10864a.mo1516a();
            if (a == null || !a.getBoolean("enable_pre_loading_rainbow", false)) {
                z = false;
            }
            if (z) {
                C2026y0 y0Var = C2026y0.f11974d;
                mo117082N7().mo1913r(Color.rgb(((Number) y0Var.invoke()).intValue(), ((Number) y0Var.invoke()).intValue(), ((Number) y0Var.invoke()).intValue()));
            }
        }
        Intent intent2 = getIntent();
        C87412m.m108593f(intent2, "intent");
        mo117081M7(intent2, "onCreate");
        frameLayout.addView(mo117082N7().getView(), layoutParams);
        AppBrandContainerFragmentActivity.m104355N7(this, C111105a.m151500b(this, C0966R.color.f2928b));
    }

    public void onDestroy() {
        C81194z zVar = C81194z.f238510d;
        int taskId = getTaskId();
        zVar.getClass();
        C90590d<Integer> dVar = C81194z.f238521r;
        synchronized (dVar) {
            dVar.remove(Integer.valueOf(taskId));
        }
        super.onDestroy();
        Intent intent = new Intent();
        intent.setClassName(this, this.f246409s);
        if (this.f246410t) {
            try {
                C86082d dVar2 = this.f246416z;
                if (dVar2 != null) {
                    C87412m.m108591d(dVar2);
                    unbindService(dVar2);
                }
                stopService(intent);
            } catch (Exception e) {
                Log.m105925i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "onDestroy: ", e);
            }
        }
        AppBrandUIEnterAnimationCompleteEventListener appBrandUIEnterAnimationCompleteEventListener = this.f246411u;
        if (appBrandUIEnterAnimationCompleteEventListener != null) {
            appBrandUIEnterAnimationCompleteEventListener.dead();
        }
        AppBrandUIFinishEventListener appBrandUIFinishEventListener = this.f246412v;
        if (appBrandUIFinishEventListener != null) {
            appBrandUIFinishEventListener.dead();
        }
    }

    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        C88990b.m111194c(this, (C88990b.C61771c) null);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            this.f246407q = null;
            this.f246408r = false;
            mo117081M7(intent, "onNewIntent");
        }
    }

    public void onPause() {
        super.onPause();
        if (!this.f246408r) {
            overridePendingTransition(0, 0);
        }
        ((C88045a) this.f246405o).mo122487d(this, f246400C[0], Boolean.FALSE);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        C87412m.m108594g(bundle, "savedInstanceState");
        super.onRestoreInstanceState(bundle);
        Log.m105924i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "onRestoreInstanceState: pendingIntent = " + this.f246407q);
        Intent intent = this.f246407q;
        if (intent != null) {
            bundle.putParcelable("MicroMsg.AppBrandPreLoadingUI.intent", intent);
        }
    }

    public void onResume() {
        super.onResume();
        ((C88045a) this.f246405o).mo122487d(this, f246400C[0], Boolean.TRUE);
    }
}
