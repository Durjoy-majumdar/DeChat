package com.tencent.p014mm.plugin.appbrand.widget.halfscreen;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import bt0.C79811f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy;
import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandGlobalNativeWidgetContainerView;
import com.tencent.p014mm.plugin.appbrand.widget.C84927e;
import com.tencent.p014mm.plugin.appbrand.widget.C85007k;
import com.tencent.p014mm.plugin.appbrand.widget.C85012q;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import fy3.C32224a;
import gy3.C87412m;
import is0.C87794b;
import it0.C87795a;
import it0.C9241c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import jt0.C88029d;
import kotlin.Metadata;
import qq0.C89797e;
import qq0.C89812q;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger */
public final class HalfScreenManger {

    /* renamed from: a */
    public final AppBrandRuntimeWC f247568a;

    /* renamed from: b */
    public boolean f247569b;

    /* renamed from: c */
    public boolean f247570c;

    /* renamed from: d */
    public C85007k f247571d;

    /* renamed from: e */
    public C88029d f247572e = C88029d.C88030a.f254648a;

    /* renamed from: f */
    public C9241c f247573f;

    /* renamed from: g */
    public boolean f247574g;

    /* renamed from: h */
    public final Set<C32224a<C13598b0>> f247575h = new LinkedHashSet();

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$a */
    public enum C68697a {
        NORMAL,
        EMBED
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$EventOnHalfPageCommonHeaderShareButtonClick;", "Lcom/tencent/mm/sdk/event/IEvent;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$EventOnHalfPageCommonHeaderShareButtonClick */
    public static final class EventOnHalfPageCommonHeaderShareButtonClick extends IEvent {

        /* renamed from: d */
        public final String f247576d;

        public EventOnHalfPageCommonHeaderShareButtonClick(String str) {
            C87412m.m108594g(str, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            this.f247576d = str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$b */
    public /* synthetic */ class C84934b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f247577a;

        static {
            int[] iArr = new int[HalfScreenConfig.C55453c.values().length];
            iArr[2] = 1;
            iArr[0] = 2;
            iArr[1] = 3;
            int[] iArr2 = new int[C83817h4.values().length];
            iArr2[0] = 1;
            iArr2[1] = 2;
            iArr2[2] = 3;
            iArr2[7] = 4;
            iArr2[9] = 5;
            iArr2[8] = 6;
            iArr2[3] = 7;
            iArr2[4] = 8;
            iArr2[5] = 9;
            iArr2[6] = 10;
            f247577a = iArr2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$c */
    public static final class C84935c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ HalfScreenManger f247578d;

        public C84935c(HalfScreenManger halfScreenManger) {
            this.f247578d = halfScreenManger;
        }

        public final void run() {
            C79811f fVar;
            boolean z = this.f247578d.mo117784g() && (this.f247578d.mo117782e().mo76932d() || this.f247578d.mo117782e().f157940K);
            C83928t1 J1 = this.f247578d.f247568a.mo113178J1();
            if (!(J1 == null || (fVar = J1.f244553E) == null)) {
                fVar.setStatusBarForegroundStyle(z);
            }
            if (this.f247578d.mo117784g() && this.f247578d.mo117782e().f157940K) {
                Activity R = this.f247578d.f247568a.mo113026R();
                Window window = R != null ? R.getWindow() : null;
                if (window != null) {
                    window.setStatusBarColor(MMApplicationContext.getColor(C0966R.color.f3067q));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$d */
    public static final class C84936d implements C84927e.C84929b {

        /* renamed from: a */
        public final /* synthetic */ HalfScreenConfig f247579a;

        public C84936d(HalfScreenConfig halfScreenConfig) {
            this.f247579a = halfScreenConfig;
        }

        /* renamed from: a */
        public final float[] mo117774a(Context context) {
            return this.f247579a.f157947g.mo76938a(1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$e */
    public static final class C84937e implements C84927e.C84929b {

        /* renamed from: a */
        public final /* synthetic */ HalfScreenConfig f247580a;

        public C84937e(HalfScreenConfig halfScreenConfig) {
            this.f247580a = halfScreenConfig;
        }

        /* renamed from: a */
        public final float[] mo117774a(Context context) {
            return this.f247580a.f157947g.mo76938a(context.getResources().getConfiguration().orientation);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$f */
    public static final class C84938f extends C89812q {

        /* renamed from: a */
        public final /* synthetic */ BaseAppBrandSingleCloseCapsuleBar f247581a;

        /* renamed from: b */
        public final /* synthetic */ HalfScreenManger f247582b;

        public C84938f(BaseAppBrandSingleCloseCapsuleBar baseAppBrandSingleCloseCapsuleBar, HalfScreenManger halfScreenManger) {
            this.f247581a = baseAppBrandSingleCloseCapsuleBar;
            this.f247582b = halfScreenManger;
        }

        /* renamed from: a */
        public void mo117802a(float f) {
            int color = this.f247581a.getContext().getResources().getColor(this.f247581a.mo116124f(C0966R.color.al6));
            C89797e eVar = this.f247582b.f247568a.f238159x;
            int argb = Color.argb((int) (f * ((float) 255)), Color.red(color), Color.green(color), Color.blue(color));
            if (eVar.f258187b != null) {
                eVar.mo124089b().setBackgroundColor(argb);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$g */
    public static final class C84939g implements AppBrandGlobalNativeWidgetContainerView.C84915a {

        /* renamed from: a */
        public final /* synthetic */ HalfScreenManger f247583a;

        public C84939g(HalfScreenManger halfScreenManger) {
            this.f247583a = halfScreenManger;
        }

        /* renamed from: a */
        public final void mo117656a(Canvas canvas, View view) {
            HalfScreenManger halfScreenManger = this.f247583a;
            C87412m.m108593f(view, "child");
            halfScreenManger.mo117786i(canvas, view, C68697a.EMBED);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$h */
    public static final class C84940h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntimeWC f247584d;

        /* renamed from: e */
        public final /* synthetic */ BaseAppBrandSingleCloseCapsuleBar f247585e;

        public C84940h(AppBrandRuntimeWC appBrandRuntimeWC, BaseAppBrandSingleCloseCapsuleBar baseAppBrandSingleCloseCapsuleBar) {
            this.f247584d = appBrandRuntimeWC;
            this.f247585e = baseAppBrandSingleCloseCapsuleBar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f247584d.mo113063k();
            this.f247585e.setCloseBtnListener((View.OnClickListener) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$i */
    public static final class C84941i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ AppBrandInitConfigWC f247586d;

        public C84941i(AppBrandInitConfigWC appBrandInitConfigWC) {
            this.f247586d = appBrandInitConfigWC;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AppBrandInitConfigWC appBrandInitConfigWC = this.f247586d;
            WeAppOpenUICallbackIPCProxy weAppOpenUICallbackIPCProxy = appBrandInitConfigWC.f239392w1;
            if (weAppOpenUICallbackIPCProxy != null) {
                String str = appBrandInitConfigWC.f234815R0.f157959v.f157978e;
                C87412m.m108594g(str, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
                weAppOpenUICallbackIPCProxy.f243388f.mo111345a(new IPCString(str));
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            new EventOnHalfPageCommonHeaderShareButtonClick(appBrandInitConfigWC.f234815R0.f157959v.f157978e).publish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$j */
    public static final class C84942j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C83928t1 f247587d;

        /* renamed from: e */
        public final /* synthetic */ AppBrandRuntimeWC f247588e;

        /* renamed from: f */
        public final /* synthetic */ AppBrandInitConfigWC f247589f;

        public C84942j(C83928t1 t1Var, AppBrandRuntimeWC appBrandRuntimeWC, AppBrandInitConfigWC appBrandInitConfigWC) {
            this.f247587d = t1Var;
            this.f247588e = appBrandRuntimeWC;
            this.f247589f = appBrandInitConfigWC;
        }

        /* JADX WARNING: type inference failed for: r4v6, types: [com.tencent.mm.plugin.appbrand.AppBrandRuntime] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r18) {
            /*
                r17 = this;
                r6 = r17
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r18
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$3"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r17
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                com.tencent.mm.plugin.appbrand.page.t1 r0 = r6.f247587d
                java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.complaint.C81605b.m100094b(r0)
                com.tencent.mm.plugin.appbrand.config.WxaExposedParams$b r1 = new com.tencent.mm.plugin.appbrand.config.WxaExposedParams$b
                r1.<init>()
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r6.f247588e
                com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r2 = r2.mo113213o1()
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r6.f247588e
                com.tencent.mm.plugin.appbrand.page.t1 r3 = r3.mo113178J1()
                gy3.C87412m.m108591d(r3)
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r6.f247588e
                java.lang.String r5 = "runtime"
                gy3.C87412m.m108593f(r4, r5)
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r5 = r4.mo113210l1()
                com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r5 = r5.f234815R0
                java.lang.String r7 = "embedWxa.initConfig.halfScreenConfig"
                gy3.C87412m.m108593f(r5, r7)
                boolean r7 = r5.mo76931c()
                r8 = 1
                if (r7 == 0) goto L_0x005c
                com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r5 = r5.f157932C
                com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r7 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55455e.EMBED
                if (r5 != r7) goto L_0x005c
                r5 = 1
                goto L_0x005d
            L_0x005c:
                r5 = 0
            L_0x005d:
                r7 = 0
                if (r5 == 0) goto L_0x0072
                com.tencent.mm.plugin.appbrand.e3 r5 = r4.f238142e
                if (r5 != 0) goto L_0x0065
                goto L_0x0072
            L_0x0065:
                boolean r9 = r5.mo113124e(r4)
                if (r9 == 0) goto L_0x0072
                com.tencent.mm.plugin.appbrand.AppBrandRuntime r4 = r5.mo113136o(r4)
                r7 = r4
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r7 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r7
            L_0x0072:
                java.lang.String r4 = r2.f261062e
                r1.f239557a = r4
                java.lang.String r4 = ""
                if (r7 != 0) goto L_0x007c
                r5 = r4
                goto L_0x007e
            L_0x007c:
                java.lang.String r5 = r7.f238147j
            L_0x007e:
                r1.f239559c = r5
                r5 = 3
                r1.f239566j = r5
                com.tencent.mm.plugin.appbrand.page.e3 r5 = r3.f244558J
                if (r5 != 0) goto L_0x0088
                goto L_0x008c
            L_0x0088:
                java.lang.String r4 = r3.mo116162Q0()
            L_0x008c:
                r1.f239567k = r4
                com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r3 = r2.f261072r
                int r3 = r3.f238585d
                r1.f239564h = r3
                com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r2 = r2.f261072r
                int r2 = r2.pkgVersion
                r1.f239563g = r2
                r1.f239569m = r0
                android.os.Bundle r15 = new android.os.Bundle
                r15.<init>()
                java.lang.String r0 = "key_is_embed_wxa"
                r15.putBoolean(r0, r8)
                com.tencent.mm.plugin.appbrand.page.t1 r0 = r6.f247587d
                android.content.Context r9 = r0.getContext()
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r6.f247589f
                java.lang.String r10 = r0.f234839s
                r11 = 11
                r13 = 1
                com.tencent.mm.plugin.appbrand.config.WxaExposedParams r14 = r1.mo113977a()
                com.tencent.mm.plugin.appbrand.page.t1 r0 = r6.f247587d
                android.content.Context r0 = r0.getContext()
                com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate r16 = com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate.m893a(r0)
                java.lang.String r12 = ""
                com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandProfileUI.m104017R7(r9, r10, r11, r12, r13, r14, r15, r16)
                java.lang.String r0 = "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$3"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger.C84942j.onClick(android.view.View):void");
        }
    }

    public HalfScreenManger(AppBrandRuntimeWC appBrandRuntimeWC) {
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        this.f247568a = appBrandRuntimeWC;
        int i = C88029d.f254647a;
    }

    /* renamed from: a */
    public final boolean mo117778a(AppBrandRuntimeWC appBrandRuntimeWC, C83817h4 h4Var) {
        if (h4Var == C83817h4.SWITCH_TAB) {
            return false;
        }
        HalfScreenConfig halfScreenConfig = appBrandRuntimeWC.mo113210l1().f234815R0;
        return halfScreenConfig.mo76931c() && halfScreenConfig.f157952o;
    }

    /* renamed from: b */
    public final BaseAppBrandSingleCloseCapsuleBar mo117779b() {
        View findViewById;
        C89797e eVar = this.f247568a.f238159x;
        if (eVar == null || (findViewById = eVar.mo124089b().findViewById(C0966R.C0970id.etd)) == null || !(findViewById instanceof BaseAppBrandSingleCloseCapsuleBar)) {
            return null;
        }
        return (BaseAppBrandSingleCloseCapsuleBar) findViewById;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = r3.getRootView();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final is0.C87794b mo117780c(com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC r3) {
        /*
            r2 = this;
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r3 = r3.mo113212m1()
            r0 = 0
            if (r3 == 0) goto L_0x0015
            android.view.View r3 = r3.getRootView()
            if (r3 == 0) goto L_0x0015
            r1 = 2131297015(0x7f0902f7, float:1.8211963E38)
            android.view.View r3 = r3.findViewById(r1)
            goto L_0x0016
        L_0x0015:
            r3 = r0
        L_0x0016:
            boolean r1 = r3 instanceof is0.C87794b
            if (r1 == 0) goto L_0x001d
            r0 = r3
            is0.b r0 = (is0.C87794b) r0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger.mo117780c(com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC):is0.b");
    }

    /* renamed from: d */
    public final String mo117781d(AppBrandInitConfigWC appBrandInitConfigWC) {
        WxaAttributes.WxaVersionInfo wxaVersionInfo;
        WxaAttributes.HalfPage halfPage;
        boolean z = false;
        if (WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
            z = MultiProcessMMKV.getDefault().getBoolean("appbrand_half_screen_debug_force_firstPageNavigationStyleCustom", false);
        }
        Log.m105924i("MicroMsg.HalfScreenDebugger", "isForceFirstPageNavigationStyleCustom[" + z + ']');
        if (z) {
            Log.m105918d("MicroMsg.HalfScreenManger", "[getFirstPageNavigationStyleConfig] DEBUG force firstPageNavigationStyleCustom");
            return "custom";
        }
        String str = (appBrandInitConfigWC == null || (wxaVersionInfo = appBrandInitConfigWC.f234804H) == null || (halfPage = wxaVersionInfo.f239448A) == null) ? null : halfPage.f239436d;
        return str == null ? "default" : str;
    }

    /* renamed from: e */
    public final HalfScreenConfig mo117782e() {
        HalfScreenConfig halfScreenConfig = this.f247568a.mo113210l1().f234815R0;
        C87412m.m108593f(halfScreenConfig, "runtime.initConfig.halfScreenConfig");
        return halfScreenConfig;
    }

    /* renamed from: f */
    public final boolean mo117783f(C83820i0 i0Var) {
        boolean z = this.f247568a.mo113212m1().mo116367s(i0Var) == 0;
        Log.m105924i("MicroMsg.HalfScreenManger", "wantAnimateHeader backToStackBottomPage[" + z + ']');
        return z;
    }

    /* renamed from: g */
    public final boolean mo117784g() {
        C85007k kVar = this.f247571d;
        return (kVar != null ? kVar.getCurrentStatus() : null) == C85012q.FULL_SCREEN;
    }

    /* renamed from: h */
    public final boolean mo117785h(C83820i0 i0Var) {
        boolean z = this.f247568a.mo113212m1().mo116367s(i0Var) == 0;
        Log.m105924i("MicroMsg.HalfScreenManger", "wantAnimateHeader navigateToNewPageFromStackBottomPage[" + z + ']');
        return z;
    }

    /* renamed from: i */
    public final void mo117786i(Canvas canvas, View view, C68697a aVar) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(aVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        HalfScreenConfig e = mo117782e();
        if (!e.mo76931c()) {
            return;
        }
        if (!e.f157958u && !e.f157951n) {
            return;
        }
        if ((e.f157932C != HalfScreenConfig.C55455e.EMBED || aVar == C68697a.EMBED) && C87412m.m108589b(this.f247572e.mo122476g(), view)) {
            this.f247572e.mo122475f(canvas, view);
        }
    }

    /* renamed from: j */
    public final void mo117787j() {
        BaseAppBrandSingleCloseCapsuleBar b;
        boolean z = true;
        boolean z2 = mo117782e().f157944d == -1 && !mo117782e().f157951n && mo117782e().f157952o;
        if (this.f247568a.f238159x != null) {
            if (!this.f247574g || !mo117782e().mo76931c()) {
                z = false;
            }
            if ((z || z2) && (b = mo117779b()) != null) {
                int color = b.getContext().getResources().getColor(b.mo116124f(C0966R.color.al6));
                C89797e eVar = this.f247568a.f238159x;
                if (eVar.f258187b != null) {
                    eVar.mo124089b().setBackgroundColor(color);
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo117788k() {
        HalfScreenConfig e = mo117782e();
        if (e.mo76931c() && e.f157951n) {
            MMHandlerThread.postToMainThread(new C84935c(this));
        }
    }

    /* renamed from: l */
    public final void mo117789l() {
        C89797e eVar = this.f247568a.f238159x;
        if (eVar != null) {
            eVar.mo124091d(C0966R.C0970id.etd);
        }
        C87794b c = mo117780c(this.f247568a);
        if (c != null) {
            FrameLayout frameLayout = c.f254166e;
            if (frameLayout != null) {
                c.removeView(frameLayout);
            }
            c.f254167f = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117790m(com.tencent.p014mm.plugin.appbrand.widget.AppBrandGlobalNativeWidgetContainerView.C84915a r3) {
        /*
            r2 = this;
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r2.f247568a     // Catch:{ all -> 0x000b }
            com.tencent.mm.plugin.appbrand.e3 r1 = r0.f238142e     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x000b
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r1.mo113136o(r0)     // Catch:{ all -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC
            if (r1 == 0) goto L_0x0019
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r0
            com.tencent.mm.plugin.appbrand.widget.AppBrandGlobalNativeWidgetContainerView r0 = r0.f238123S0
            if (r0 == 0) goto L_0x0019
            r0.setCapsuleBarBackgroundRenderer(r3)
        L_0x0019:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger.mo117790m(com.tencent.mm.plugin.appbrand.widget.AppBrandGlobalNativeWidgetContainerView$a):void");
    }

    /* renamed from: n */
    public final void mo117791n() {
        boolean a = C87795a.Companion.mo122253a(this.f247568a.mo113210l1().f234815R0.f157932C);
        HalfScreenConfig halfScreenConfig = this.f247568a.mo113210l1().f234815R0;
        C87412m.m108593f(halfScreenConfig, "runtime.initConfig.halfScreenConfig");
        this.f247568a.f238153r.setRoundCornerProvider(a ? new C84936d(halfScreenConfig) : (!halfScreenConfig.mo76931c() || this.f247568a.f238298z1.mo117793p()) ? null : new C84937e(halfScreenConfig));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        r0 = r0.f157953p;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo117792o() {
        /*
            r3 = this;
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r3.f247568a
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.mo113210l1()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.f234815R0
            java.lang.String r1 = "runtime.initConfig.halfScreenConfig"
            gy3.C87412m.m108593f(r0, r1)
            boolean r1 = r0.mo76931c()
            r2 = 0
            if (r1 != 0) goto L_0x0016
            return r2
        L_0x0016:
            com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener r0 = r0.f157953p
            if (r0 == 0) goto L_0x001f
            boolean r0 = r0.f239427d
            if (r0 == 0) goto L_0x001f
            r2 = 1
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger.mo117792o():boolean");
    }

    /* renamed from: p */
    public final boolean mo117793p() {
        return mo117782e().mo76932d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        if ((r0.mo116122c() == 0.0f) == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a3, code lost:
        if ((r0.mo116122c() == 1.0f) != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0.getTAG(), "status not change, return");
        r3.mo117802a(r0.mo116122c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117794q(boolean r11, boolean r12) {
        /*
            r10 = this;
            com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar r0 = r10.mo117779b()
            if (r0 == 0) goto L_0x00ff
            r1 = 1
            r2 = 0
            if (r11 == 0) goto L_0x0016
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r3 = r10.mo117782e()
            boolean r3 = r3.mo76931c()
            if (r3 == 0) goto L_0x0016
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            r10.f247574g = r3
            if (r3 == 0) goto L_0x0027
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r3 = r10.mo117782e()
            boolean r3 = r3.mo76931c()
            if (r3 == 0) goto L_0x0027
            r3 = 1
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            if (r3 == 0) goto L_0x002d
            qq0.u r3 = qq0.C36066u.NORMAL
            goto L_0x002f
        L_0x002d:
            qq0.u r3 = qq0.C36066u.WITH_ROUND_CIRCLE
        L_0x002f:
            com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar r4 = r10.mo117779b()
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.appbrand.page.capsulebar.AppBrandSingleCloseCapsuleBar
            if (r5 == 0) goto L_0x003c
            com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandSingleCloseCapsuleBar r4 = (com.tencent.p014mm.plugin.appbrand.page.capsulebar.AppBrandSingleCloseCapsuleBar) r4
            r4.setCloseBtnType(r3)
        L_0x003c:
            com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$f r3 = new com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$f
            r3.<init>(r0, r10)
            boolean r4 = r0.f244548e
            if (r4 == 0) goto L_0x0050
            java.lang.String r11 = r0.getTAG()
            java.lang.String r12 = "is animating, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            goto L_0x00ff
        L_0x0050:
            r4 = 255(0xff, float:3.57E-43)
            if (r11 == 0) goto L_0x005f
            float r5 = r0.mo116122c()
            float r6 = (float) r4
            float r5 = r5 * r6
            int r5 = (int) r5
            r6 = 255(0xff, float:3.57E-43)
            goto L_0x0068
        L_0x005f:
            float r5 = r0.mo116122c()
            float r6 = (float) r4
            float r5 = r5 * r6
            int r5 = (int) r5
            r6 = 0
        L_0x0068:
            java.lang.String r7 = r0.getTAG()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "iconIv.alpha="
            r8.append(r9)
            float r9 = r0.mo116122c()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            if (r11 != 0) goto L_0x0094
            float r7 = r0.mo116122c()
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0091
            r7 = 1
            goto L_0x0092
        L_0x0091:
            r7 = 0
        L_0x0092:
            if (r7 != 0) goto L_0x00a5
        L_0x0094:
            if (r11 == 0) goto L_0x00b7
            float r11 = r0.mo116122c()
            r7 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x00a2
            r11 = 1
            goto L_0x00a3
        L_0x00a2:
            r11 = 0
        L_0x00a3:
            if (r11 == 0) goto L_0x00b7
        L_0x00a5:
            java.lang.String r11 = r0.getTAG()
            java.lang.String r12 = "status not change, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            float r11 = r0.mo116122c()
            r3.mo117802a(r11)
            goto L_0x00ff
        L_0x00b7:
            if (r12 != 0) goto L_0x00c6
            int r6 = r6 / r4
            float r11 = (float) r6
            r0.mo116137e(r11)
            float r11 = r0.mo116122c()
            r3.mo117802a(r11)
            goto L_0x00ff
        L_0x00c6:
            r11 = 2
            int[] r11 = new int[r11]
            r11[r2] = r5
            r11[r1] = r6
            android.animation.ValueAnimator r11 = android.animation.ValueAnimator.ofInt(r11)
            if (r11 == 0) goto L_0x00db
            qq0.m r12 = new qq0.m
            r12.<init>(r0, r3)
            r11.addUpdateListener(r12)
        L_0x00db:
            if (r11 != 0) goto L_0x00de
            goto L_0x00e6
        L_0x00de:
            android.view.animation.DecelerateInterpolator r12 = new android.view.animation.DecelerateInterpolator
            r12.<init>()
            r11.setInterpolator(r12)
        L_0x00e6:
            if (r11 != 0) goto L_0x00e9
            goto L_0x00ee
        L_0x00e9:
            r2 = 300(0x12c, double:1.48E-321)
            r11.setDuration(r2)
        L_0x00ee:
            if (r11 == 0) goto L_0x00f8
            qq0.n r12 = new qq0.n
            r12.<init>(r0)
            r11.addListener(r12)
        L_0x00f8:
            if (r11 == 0) goto L_0x00fd
            r11.start()
        L_0x00fd:
            r0.f244548e = r1
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger.mo117794q(boolean, boolean):void");
    }

    /* renamed from: r */
    public final ValueAnimator mo117795r(long j) {
        C88029d dVar = this.f247572e;
        return dVar.mo122474e(dVar.mo122472c(), this.f247572e.mo122470a(), j);
    }

    /* renamed from: s */
    public final void mo117796s() {
        HalfScreenConfig e = mo117782e();
        if (e.mo76931c() && e.f157932C == HalfScreenConfig.C55455e.EMBED) {
            mo117790m(new C84939g(this));
        } else {
            mo117790m((AppBrandGlobalNativeWidgetContainerView.C84915a) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x029c, code lost:
        r5.mo109614d(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010f, code lost:
        if (r3.mo113212m1().getPageCount() == 1) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011a, code lost:
        if (r3.mo113212m1().getActualPageStackSize() == 1) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0125, code lost:
        if (r3.mo113212m1().getPageCount() == 1) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0127, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0129, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012a, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.HalfScreenManger", "[isFirstPage]  PageOpenType[" + r2 + "]  isFirstPage[" + r7 + "]  pageCount[" + r3.mo113212m1().getPageCount() + "]  actualPageStackSize[" + r3.mo113212m1().getActualPageStackSize() + ']');
        r9 = qq0.C89807l.f258213a;
        r10 = r5.getContext();
        gy3.C87412m.m108593f(r10, "actionBar.context");
        r9 = r9.mo124096a(r3, r10, false);
        r9.getView().setId(com.tencent.p014mm.C0966R.C0970id.etd);
        r9.setCloseBtnListener(new com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger.C84940h(r3, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0190, code lost:
        if (r4.f234815R0.f157959v.f157977d == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0192, code lost:
        r9.mo116123d(true);
        r9.setShareBtnListener(new com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger.C84941i(r4));
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x019f, code lost:
        r9.mo116123d(false);
        r10 = null;
        r9.setShareBtnListener((android.view.View.OnClickListener) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01a6, code lost:
        r9.setTitle(r4.f239363e);
        r9.setWxaIconUrl(r4.f239364f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01b6, code lost:
        if (r4.f234815R0.f157932C != com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55455e.EMBED) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01b8, code lost:
        r9.setTitleClickListener(new com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger.C84942j(r1, r3, r4));
        r6 = mo117780c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01c4, code lost:
        if (r6 == null) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01c6, code lost:
        r11 = r3.mo113028S();
        r1 = r17.getContext();
        gy3.C87412m.m108593f(r1, "pageView.context");
        r1 = (qq0.C89795c) r11.mo116271a(r1, qq0.C89795c.class);
        gy3.C87412m.m108591d(r1);
        r6.setExternalHeaderContainer(r1);
        r1 = r9.getView();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01ee, code lost:
        if (r3.mo113054f0().shouldInLargeScreenCompatMode() == false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01f0, code lost:
        r12 = new android.view.ViewGroup.LayoutParams(r3.mo113054f0().mo109903D5(r3).width, -2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0201, code lost:
        r12 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0202, code lost:
        r9 = r6.f254166e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0204, code lost:
        if (r9 == null) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0206, code lost:
        r9.removeAllViews();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0209, code lost:
        if (r12 == null) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x020b, code lost:
        r9 = r6.f254166e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x020d, code lost:
        if (r9 == null) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x020f, code lost:
        r9.addView(r1, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0213, code lost:
        r9 = r6.f254166e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0215, code lost:
        if (r9 == null) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0217, code lost:
        r9.addView(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x021a, code lost:
        r6.setExternalHeaderAnchor(r3.f238153r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0224, code lost:
        if (mo117793p() == false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x022a, code lost:
        if (mo117784g() != false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0232, code lost:
        if (mo117782e().f157944d != -1) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0235, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0237, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0238, code lost:
        r9.mo116120a(r1);
        r1 = r4.f234815R0.f157934E;
        r3 = r1.f157974d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0241, code lost:
        if (r3 == null) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0247, code lost:
        if (r3.length() != 0) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x024a, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x024c, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x024d, code lost:
        if (r3 != false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x024f, code lost:
        r1 = r1.f157975e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0251, code lost:
        if (r1 == null) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0257, code lost:
        if (r1.length() != 0) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x025a, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x025c, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x025d, code lost:
        if (r1 != false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x025f, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0261, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0262, code lost:
        if (r1 == false) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0264, code lost:
        r1 = r4.f234815R0.f157934E;
        r3 = r1.f157974d;
        r1 = r1.f157975e;
        r9.setTitle(r3);
        r9.setWxaIconUrl(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0272, code lost:
        r1 = r9.getView();
        gy3.C87412m.m108594g(r1, "view");
        r6.mo124089b().addView(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0287, code lost:
        if (r4.f234815R0.f157952o != false) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0289, code lost:
        mo117794q(false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x028d, code lost:
        if (r7 == false) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0291, code lost:
        if (r2 == com.tencent.p014mm.plugin.appbrand.page.C83817h4.f244668o) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0293, code lost:
        mo117794q(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0297, code lost:
        if (r7 != false) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0299, code lost:
        mo117794q(false, false);
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117797t(com.tencent.p014mm.plugin.appbrand.page.C83928t1 r17, com.tencent.p014mm.plugin.appbrand.page.C83817h4 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r3 = "pageView"
            gy3.C87412m.m108594g(r1, r3)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r17.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = r3.mo113210l1()
            java.lang.String r5 = "runtime.initConfig"
            gy3.C87412m.m108593f(r4, r5)
            bt0.b r5 = r1.f244554F
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r6 = r4.f234815R0
            boolean r6 = r6.mo76931c()
            java.lang.String r8 = "runtime.capsuleBarManager"
            if (r6 == 0) goto L_0x02a4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "[trySetupHalfScreenCapsuleBar]  PageOpenType["
            r6.append(r9)
            r6.append(r2)
            java.lang.String r9 = "]  capsuleType["
            r6.append(r9)
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r9 = r4.f234815R0
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c r9 = r9.f157950j
            r6.append(r9)
            r9 = 93
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.String r10 = "MicroMsg.HalfScreenManger"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r6)
            qq0.e r6 = r3.f238159x
            gy3.C87412m.m108593f(r6, r8)
            r16.mo117789l()
            is0.b r8 = r0.mo117780c(r3)
            r11 = -1
            r12 = 0
            r13 = 0
            if (r8 == 0) goto L_0x00e1
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            android.content.Context r15 = r17.getContext()
            r14.<init>(r15)
            r8.setExternalHeaderContainer(r14)
            boolean r14 = r16.mo117793p()
            if (r14 == 0) goto L_0x00e1
            android.content.Context r14 = r17.getContext()
            android.view.LayoutInflater r14 = android.view.LayoutInflater.from(r14)
            r15 = 2131493089(0x7f0c00e1, float:1.8609648E38)
            android.view.View r14 = r14.inflate(r15, r12)
            r15 = 2131305837(0x7f09256d, float:1.8229856E38)
            r14.setId(r15)
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r15 = r16.mo117782e()
            int r15 = r15.f157935F
            if (r15 <= 0) goto L_0x0095
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r15 = r16.mo117782e()
            int r15 = r15.f157935F
            goto L_0x00a4
        L_0x0095:
            android.content.Context r15 = r17.getContext()
            android.content.res.Resources r15 = r15.getResources()
            r12 = 2131165339(0x7f07009b, float:1.7944892E38)
            int r15 = r15.getDimensionPixelOffset(r12)
        L_0x00a4:
            br0.c r12 = r3.mo113054f0()
            boolean r12 = r12.shouldInLargeScreenCompatMode()
            if (r12 == 0) goto L_0x00be
            android.view.ViewGroup$LayoutParams r12 = new android.view.ViewGroup$LayoutParams
            br0.c r7 = r3.mo113054f0()
            android.view.ViewGroup$LayoutParams r7 = r7.mo109903D5(r3)
            int r7 = r7.width
            r12.<init>(r7, r15)
            goto L_0x00c3
        L_0x00be:
            android.view.ViewGroup$LayoutParams r12 = new android.view.ViewGroup$LayoutParams
            r12.<init>(r11, r15)
        L_0x00c3:
            android.widget.FrameLayout r7 = r8.f254166e
            if (r7 == 0) goto L_0x00ca
            r7.removeAllViews()
        L_0x00ca:
            android.widget.FrameLayout r7 = r8.f254166e
            if (r7 == 0) goto L_0x00d1
            r7.addView(r14, r12)
        L_0x00d1:
            com.tencent.mm.plugin.appbrand.widget.e r7 = r3.f238153r
            r8.setExternalHeaderAnchor(r7)
            boolean r7 = r16.mo117784g()
            if (r7 == 0) goto L_0x00e1
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.mo117799v(r7, r13)
        L_0x00e1:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r7 = r4.f234815R0
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c r7 = r7.f157950j
            int r7 = r7.ordinal()
            r8 = 1
            if (r7 == 0) goto L_0x02a0
            if (r7 == r8) goto L_0x00f8
            r1 = 2
            if (r7 == r1) goto L_0x00f3
            goto L_0x02af
        L_0x00f3:
            r5.mo109614d(r13)
            goto L_0x02af
        L_0x00f8:
            if (r2 != 0) goto L_0x00fc
            r7 = -1
            goto L_0x0104
        L_0x00fc:
            int[] r7 = com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger.C84934b.f247577a
            int r12 = r18.ordinal()
            r7 = r7[r12]
        L_0x0104:
            switch(r7) {
                case 1: goto L_0x011d;
                case 2: goto L_0x011d;
                case 3: goto L_0x011d;
                case 4: goto L_0x011d;
                case 5: goto L_0x011d;
                case 6: goto L_0x011d;
                case 7: goto L_0x0112;
                case 8: goto L_0x0112;
                case 9: goto L_0x0127;
                case 10: goto L_0x0127;
                default: goto L_0x0107;
            }
        L_0x0107:
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r7 = r3.mo113212m1()
            int r7 = r7.getPageCount()
            if (r7 != r8) goto L_0x0129
            goto L_0x0127
        L_0x0112:
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r7 = r3.mo113212m1()
            int r7 = r7.getActualPageStackSize()
            if (r7 != r8) goto L_0x0129
            goto L_0x0127
        L_0x011d:
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r7 = r3.mo113212m1()
            int r7 = r7.getPageCount()
            if (r7 != r8) goto L_0x0129
        L_0x0127:
            r7 = 1
            goto L_0x012a
        L_0x0129:
            r7 = 0
        L_0x012a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "[isFirstPage]  PageOpenType["
            r12.append(r14)
            r12.append(r2)
            java.lang.String r14 = "]  isFirstPage["
            r12.append(r14)
            r12.append(r7)
            java.lang.String r14 = "]  pageCount["
            r12.append(r14)
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r14 = r3.mo113212m1()
            int r14 = r14.getPageCount()
            r12.append(r14)
            java.lang.String r14 = "]  actualPageStackSize["
            r12.append(r14)
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r14 = r3.mo113212m1()
            int r14 = r14.getActualPageStackSize()
            r12.append(r14)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            qq0.l r9 = qq0.C89807l.f258213a
            android.content.Context r10 = r5.getContext()
            java.lang.String r12 = "actionBar.context"
            gy3.C87412m.m108593f(r10, r12)
            com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar r9 = r9.mo124096a(r3, r10, r13)
            android.view.View r10 = r9.getView()
            r12 = 2131305847(0x7f092577, float:1.8229876E38)
            r10.setId(r12)
            com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$h r10 = new com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$h
            r10.<init>(r3, r9)
            r9.setCloseBtnListener(r10)
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r10 = r4.f234815R0
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$ShareActionConfig r10 = r10.f157959v
            boolean r10 = r10.f157977d
            if (r10 == 0) goto L_0x019f
            r9.mo116123d(r8)
            com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$i r10 = new com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$i
            r10.<init>(r4)
            r9.setShareBtnListener(r10)
            r10 = 0
            goto L_0x01a6
        L_0x019f:
            r9.mo116123d(r13)
            r10 = 0
            r9.setShareBtnListener(r10)
        L_0x01a6:
            java.lang.String r12 = r4.f239363e
            r9.setTitle(r12)
            java.lang.String r12 = r4.f239364f
            r9.setWxaIconUrl(r12)
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r12 = r4.f234815R0
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r12 = r12.f157932C
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r14 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55455e.EMBED
            if (r12 != r14) goto L_0x0220
            com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$j r6 = new com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$j
            r6.<init>(r1, r3, r4)
            r9.setTitleClickListener(r6)
            is0.b r6 = r0.mo117780c(r3)
            if (r6 == 0) goto L_0x0283
            com.tencent.mm.plugin.appbrand.page.i r11 = r3.mo113028S()
            android.content.Context r1 = r17.getContext()
            java.lang.String r12 = "pageView.context"
            gy3.C87412m.m108593f(r1, r12)
            java.lang.Class<qq0.c> r12 = qq0.C89795c.class
            android.view.View r1 = r11.mo116271a(r1, r12)
            qq0.c r1 = (qq0.C89795c) r1
            gy3.C87412m.m108591d(r1)
            r6.setExternalHeaderContainer(r1)
            android.view.View r1 = r9.getView()
            br0.c r9 = r3.mo113054f0()
            boolean r9 = r9.shouldInLargeScreenCompatMode()
            if (r9 == 0) goto L_0x0201
            android.view.ViewGroup$LayoutParams r12 = new android.view.ViewGroup$LayoutParams
            br0.c r9 = r3.mo113054f0()
            android.view.ViewGroup$LayoutParams r9 = r9.mo109903D5(r3)
            int r9 = r9.width
            r10 = -2
            r12.<init>(r9, r10)
            goto L_0x0202
        L_0x0201:
            r12 = r10
        L_0x0202:
            android.widget.FrameLayout r9 = r6.f254166e
            if (r9 == 0) goto L_0x0209
            r9.removeAllViews()
        L_0x0209:
            if (r12 == 0) goto L_0x0213
            android.widget.FrameLayout r9 = r6.f254166e
            if (r9 == 0) goto L_0x021a
            r9.addView(r1, r12)
            goto L_0x021a
        L_0x0213:
            android.widget.FrameLayout r9 = r6.f254166e
            if (r9 == 0) goto L_0x021a
            r9.addView(r1)
        L_0x021a:
            com.tencent.mm.plugin.appbrand.widget.e r1 = r3.f238153r
            r6.setExternalHeaderAnchor(r1)
            goto L_0x0283
        L_0x0220:
            boolean r1 = r16.mo117793p()
            if (r1 == 0) goto L_0x0237
            boolean r1 = r16.mo117784g()
            if (r1 != 0) goto L_0x0237
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r1 = r16.mo117782e()
            int r1 = r1.f157944d
            if (r1 != r11) goto L_0x0235
            goto L_0x0237
        L_0x0235:
            r1 = 0
            goto L_0x0238
        L_0x0237:
            r1 = 1
        L_0x0238:
            r9.mo116120a(r1)
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r1 = r4.f234815R0
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CustomSubjectInfo r1 = r1.f157934E
            java.lang.String r3 = r1.f157974d
            if (r3 == 0) goto L_0x024c
            int r3 = r3.length()
            if (r3 != 0) goto L_0x024a
            goto L_0x024c
        L_0x024a:
            r3 = 0
            goto L_0x024d
        L_0x024c:
            r3 = 1
        L_0x024d:
            if (r3 != 0) goto L_0x0261
            java.lang.String r1 = r1.f157975e
            if (r1 == 0) goto L_0x025c
            int r1 = r1.length()
            if (r1 != 0) goto L_0x025a
            goto L_0x025c
        L_0x025a:
            r1 = 0
            goto L_0x025d
        L_0x025c:
            r1 = 1
        L_0x025d:
            if (r1 != 0) goto L_0x0261
            r1 = 1
            goto L_0x0262
        L_0x0261:
            r1 = 0
        L_0x0262:
            if (r1 == 0) goto L_0x0272
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r1 = r4.f234815R0
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CustomSubjectInfo r1 = r1.f157934E
            java.lang.String r3 = r1.f157974d
            java.lang.String r1 = r1.f157975e
            r9.setTitle(r3)
            r9.setWxaIconUrl(r1)
        L_0x0272:
            android.view.View r1 = r9.getView()
            java.lang.String r3 = "view"
            gy3.C87412m.m108594g(r1, r3)
            qq0.c r3 = r6.mo124089b()
            r3.addView(r1)
        L_0x0283:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r1 = r4.f234815R0
            boolean r1 = r1.f157952o
            if (r1 != 0) goto L_0x028d
            r0.mo117794q(r13, r13)
            goto L_0x029c
        L_0x028d:
            if (r7 == 0) goto L_0x0297
            com.tencent.mm.plugin.appbrand.page.h4 r1 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.SWITCH_TAB
            if (r2 == r1) goto L_0x0297
            r0.mo117794q(r8, r13)
            goto L_0x029c
        L_0x0297:
            if (r7 != 0) goto L_0x029c
            r0.mo117794q(r13, r13)
        L_0x029c:
            r5.mo109614d(r13)
            goto L_0x02af
        L_0x02a0:
            r5.mo109614d(r8)
            goto L_0x02af
        L_0x02a4:
            qq0.e r1 = r3.f238159x
            gy3.C87412m.m108593f(r1, r8)
            r2 = 2131305847(0x7f092577, float:1.8229876E38)
            r1.mo124091d(r2)
        L_0x02af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger.mo117797t(com.tencent.mm.plugin.appbrand.page.t1, com.tencent.mm.plugin.appbrand.page.h4):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r3 = r1.f234815R0;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117798u() {
        /*
            r4 = this;
            com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar r0 = r4.mo117779b()
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r4.f247568a
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r1.mo113210l1()
            if (r0 == 0) goto L_0x002c
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L_0x001a
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r3 = r1.f234815R0
            if (r3 == 0) goto L_0x001a
            boolean r3 = r3.f157955r
            if (r3 != r0) goto L_0x001a
            r3 = 1
            goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            if (r3 == 0) goto L_0x002c
            java.lang.String r1 = r4.mo117781d(r1)
            java.lang.String r3 = "custom"
            boolean r1 = gy3.C87412m.m108589b(r1, r3)
            if (r1 == 0) goto L_0x002c
            r4.mo117794q(r2, r0)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger.mo117798u():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (gy3.C87412m.m108589b(r1.f28982a, r0) == false) goto L_0x0020;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117799v(float r9, int r10) {
        /*
            r8 = this;
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r8.f247568a
            com.tencent.mm.plugin.appbrand.widget.e r0 = r0.f238153r
            android.view.View r0 = r0.getRootView()
            r1 = 2131305837(0x7f09256d, float:1.8229856E38)
            android.view.View r0 = r0.findViewById(r1)
            if (r0 == 0) goto L_0x0027
            it0.c r1 = r8.f247573f
            if (r1 == 0) goto L_0x0020
            gy3.C87412m.m108591d(r1)
            android.view.View r1 = r1.f28982a
            boolean r1 = gy3.C87412m.m108589b(r1, r0)
            if (r1 != 0) goto L_0x0027
        L_0x0020:
            it0.c r1 = new it0.c
            r1.<init>(r0)
            r8.f247573f = r1
        L_0x0027:
            it0.c r0 = r8.f247573f
            if (r0 == 0) goto L_0x0084
            android.view.View r3 = r0.f28983b     // Catch:{ Exception -> 0x0084 }
            android.view.View r4 = r0.f28984c     // Catch:{ Exception -> 0x0084 }
            if (r3 == 0) goto L_0x0084
            if (r4 == 0) goto L_0x0084
            java.lang.String r1 = "AppBrandHalfScreenPanelHeadIndicatorHolder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0084 }
            r2.<init>()     // Catch:{ Exception -> 0x0084 }
            java.lang.String r5 = "onTranslateYChange translateY:"
            r2.append(r5)     // Catch:{ Exception -> 0x0084 }
            r2.append(r9)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r5 = ",isShow:"
            r2.append(r5)     // Catch:{ Exception -> 0x0084 }
            r5 = 1
            r2.append(r5)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r6 = ",drag:"
            r2.append(r6)     // Catch:{ Exception -> 0x0084 }
            r2.append(r5)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r5 = ",headerArrow.alpha:"
            r2.append(r5)     // Catch:{ Exception -> 0x0084 }
            float r5 = r4.getAlpha()     // Catch:{ Exception -> 0x0084 }
            r2.append(r5)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r5 = ",headerLine.height:"
            r2.append(r5)     // Catch:{ Exception -> 0x0084 }
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()     // Catch:{ Exception -> 0x0084 }
            if (r5 == 0) goto L_0x006e
            int r5 = r5.height     // Catch:{ Exception -> 0x0084 }
            goto L_0x006f
        L_0x006e:
            r5 = 0
        L_0x006f:
            r2.append(r5)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0084 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)     // Catch:{ Exception -> 0x0084 }
            it0.c$d r1 = it0.C9241c.f28978e     // Catch:{ Exception -> 0x0084 }
            android.view.View r2 = r0.f28982a     // Catch:{ Exception -> 0x0084 }
            int r7 = r0.f28985d     // Catch:{ Exception -> 0x0084 }
            r5 = r9
            r6 = r10
            r1.mo10025a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0084 }
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger.mo117799v(float, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13604l<java.lang.Boolean, java.lang.Boolean> mo117800w(com.tencent.p014mm.plugin.appbrand.page.C83820i0 r3, com.tencent.p014mm.plugin.appbrand.page.C83820i0 r4, com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC r5) {
        /*
            r2 = this;
            boolean r3 = r2.mo117785h(r3)
            boolean r4 = r2.mo117783f(r4)
            if (r4 != 0) goto L_0x0014
            if (r3 != 0) goto L_0x0014
            rx3.l r3 = new rx3.l
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.<init>(r4, r4)
            return r3
        L_0x0014:
            java.lang.String r3 = r2.mo117781d(r5)
            java.lang.String r0 = "custom"
            boolean r3 = gy3.C87412m.m108589b(r3, r0)
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L_0x0038
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r3 = r5.f234815R0
            boolean r3 = r3.f157955r
            if (r3 == 0) goto L_0x0038
            com.tencent.mm.plugin.appbrand.widget.k r3 = r2.f247571d
            if (r3 == 0) goto L_0x0031
            com.tencent.mm.plugin.appbrand.widget.q r3 = r3.getCurrentStatus()
            goto L_0x0032
        L_0x0031:
            r3 = 0
        L_0x0032:
            com.tencent.mm.plugin.appbrand.widget.q r5 = com.tencent.p014mm.plugin.appbrand.widget.C85012q.FULL_SCREEN
            if (r3 != r5) goto L_0x0038
            r3 = 1
            goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            if (r4 == 0) goto L_0x0045
            if (r3 == 0) goto L_0x0045
            rx3.l r3 = new rx3.l
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.<init>(r4, r4)
            return r3
        L_0x0045:
            if (r4 != 0) goto L_0x0061
            if (r3 == 0) goto L_0x0061
            com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar r3 = r2.mo117779b()
            if (r3 == 0) goto L_0x0056
            boolean r3 = r3.mo116121b()
            if (r3 != r0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r0 == 0) goto L_0x0061
            rx3.l r3 = new rx3.l
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.<init>(r4, r4)
            return r3
        L_0x0061:
            rx3.l r3 = new rx3.l
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.<init>(r5, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger.mo117800w(com.tencent.mm.plugin.appbrand.page.i0, com.tencent.mm.plugin.appbrand.page.i0, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC):rx3.l");
    }
}
