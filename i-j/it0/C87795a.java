package it0;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import br0.C39836d;
import br0.C79774c;
import br0.C79778e;
import br0.C79782g;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85924r4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.platform.window.WxaWindowLayoutParams;
import com.tencent.p014mm.plugin.appbrand.widget.C84927e;
import com.tencent.p014mm.plugin.appbrand.widget.C85007k;
import com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import er0.C86645a;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import in3.C87771d;
import jt0.C88026a;
import jt0.C88028c;
import jt0.C88029d;
import p206nj.C11171e;
import p963fc.C86799a;
import p963fc.C86814i;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;

/* renamed from: it0.a */
public final class C87795a implements C86814i<AppBrandInitConfigWC>, C79782g {
    public static final C87797b Companion = new C87797b((C8480h) null);
    public static final String TAG = "MicroMsg.AppBrandHalfWindowLayoutManager";
    /* access modifiers changed from: private */
    public final C79774c baseWindow;
    private C86799a<AppBrandInitConfigLU> centerInsideManager;
    private final Context ctx;
    private int currentWindowStableInsetBottom;
    private int currentWindowStableInsetRight;
    private boolean isMonitorWindowInsets;
    private int lastOrientation;
    private final C13601g onApplyWindowInsetsListener$delegate;
    /* access modifiers changed from: private */

    /* renamed from: rt */
    public final AppBrandRuntimeWC f254168rt;
    private volatile boolean setupGestureController;
    private final boolean shouldUseCenterPopStyle;
    private C87802g wxaHalfScreenEmptyAreaClickHandler;

    /* renamed from: it0.a$a */
    public static final class C87796a extends C86799a<AppBrandInitConfigLU> {
        public final /* synthetic */ C87795a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87796a(C87795a aVar, AppBrandRuntimeWC appBrandRuntimeWC, Context context) {
            super(appBrandRuntimeWC, context, (C79778e) null, true);
            this.this$0 = aVar;
        }

        public C79774c.C79777c getStatusBar() {
            return this.this$0.baseWindow.getStatusBar();
        }
    }

    /* renamed from: it0.a$b */
    public static final class C87797b {
        public C87797b(C8480h hVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
            if (com.tencent.p014mm.plugin.appbrand.utils.C84777q1.m104442b(r0) != false) goto L_0x001c;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo122253a(com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55455e r3) {
            /*
                r2 = this;
                java.lang.String r0 = "mode"
                gy3.C87412m.m108594g(r3, r0)
                rc.l r0 = p225rc.C89923l.f258408a
                boolean r0 = r0.mo117502h()
                if (r0 != 0) goto L_0x001c
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r1 = "getContext()"
                gy3.C87412m.m108593f(r0, r1)
                boolean r0 = com.tencent.p014mm.plugin.appbrand.utils.C84777q1.m104442b(r0)
                if (r0 == 0) goto L_0x002a
            L_0x001c:
                com.tencent.mm.plugin.appbrand.ui.v$a r0 = com.tencent.p014mm.plugin.appbrand.p026ui.C84684v.Companion
                boolean r0 = r0.mo117405b()
                if (r0 != 0) goto L_0x002a
                com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r0 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55455e.EMBED
                if (r3 != r0) goto L_0x002a
                r3 = 1
                goto L_0x002b
            L_0x002a:
                r3 = 0
            L_0x002b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: it0.C87795a.C87797b.mo122253a(com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e):boolean");
        }
    }

    /* renamed from: it0.a$c */
    public enum C87798c {
        WINDOW_INSETS_CHANGE,
        INIT_CONFIG_UPDATED,
        WXA_COLD_LAUNCH
    }

    /* renamed from: it0.a$d */
    public static final class C87799d extends C87413o implements C32224a<C87800b> {

        /* renamed from: d */
        public final /* synthetic */ C87795a f254173d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87799d(C87795a aVar) {
            super(0);
            this.f254173d = aVar;
        }

        public Object invoke() {
            return new C87800b(this.f254173d);
        }
    }

    public C87795a(AppBrandRuntimeWC appBrandRuntimeWC, Context context, C79774c cVar) {
        C87412m.m108594g(appBrandRuntimeWC, "rt");
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(cVar, "baseWindow");
        this.f254168rt = appBrandRuntimeWC;
        this.ctx = context;
        this.baseWindow = cVar;
        this.wxaHalfScreenEmptyAreaClickHandler = new C87802g(appBrandRuntimeWC);
        boolean a = Companion.mo122253a(appBrandRuntimeWC.mo113210l1().f234815R0.f157932C);
        this.shouldUseCenterPopStyle = a;
        if (a) {
            this.centerInsideManager = new C87796a(this, appBrandRuntimeWC, context);
        }
        this.onApplyWindowInsetsListener$delegate = C36568h.m40986b(C13602i.NONE, new C87799d(this));
    }

    private final void applyWindowConfig(AppBrandInitConfigWC appBrandInitConfigWC, C87798c cVar) {
        Log.m105924i(TAG, "applyWindowConfig");
        configHalfScreenConfig(appBrandInitConfigWC, cVar);
        HalfScreenManger halfScreenManger = this.f254168rt.f238298z1;
        C85007k kVar = halfScreenManger.f247571d;
        if (kVar != null) {
            kVar.mo117951f(this.wxaHalfScreenEmptyAreaClickHandler);
        }
        halfScreenManger.mo117791n();
    }

    private final void configGesture(HalfScreenConfig halfScreenConfig) {
        Activity R = this.f254168rt.mo113026R();
        C87412m.m108591d(R);
        boolean z = R.getResources().getConfiguration().orientation == 2;
        C85007k kVar = this.f254168rt.f238298z1.f247571d;
        if (kVar != null) {
            kVar.mo117950e(!z && halfScreenConfig.f157951n, !z && halfScreenConfig.f157956s, halfScreenConfig.f157937H, halfScreenConfig.f157939J, halfScreenConfig.f157941L);
        }
    }

    private final void configHalfScreenConfig(AppBrandInitConfigWC appBrandInitConfigWC, C87798c cVar) {
        WxaWindowLayoutParams wxaWindowLayoutParams;
        HalfScreenConfig halfScreenConfig = appBrandInitConfigWC.f234815R0;
        C87412m.m108593f(halfScreenConfig, "initConfig.halfScreenConfig");
        boolean z = true;
        boolean z2 = false;
        if (!halfScreenConfig.mo76931c()) {
            this.f254168rt.f238153r.setWxaHalfScreenGestureController((C85007k) null);
            HalfScreenManger halfScreenManger = this.f254168rt.f238298z1;
            halfScreenManger.f247571d = null;
            halfScreenManger.f247572e = C88029d.C88030a.f254648a;
            this.setupGestureController = false;
            wxaWindowLayoutParams = new WxaWindowLayoutParams(-1, -1);
            z = false;
        } else if (this.f254168rt.mo113026R() != null) {
            Activity R = this.f254168rt.mo113026R();
            C87412m.m108591d(R);
            wxaWindowLayoutParams = makeLayoutParams(halfScreenConfig, R.getResources().getConfiguration().orientation == 2);
            C85007k kVar = this.f254168rt.f238298z1.f247571d;
            if (kVar != null) {
                kVar.mo117949d(0, -1);
            }
            HalfScreenManger halfScreenManger2 = this.f254168rt.f238298z1;
            if (halfScreenManger2.f247568a.mo113210l1().f234815R0.f157951n || halfScreenManger2.mo117782e().f157944d != -1) {
                z2 = true;
            }
            if (z2) {
                if (!this.setupGestureController) {
                    AppBrandRuntimeWC appBrandRuntimeWC = this.f254168rt;
                    C84927e eVar = appBrandRuntimeWC.f238153r;
                    C87811k kVar2 = new C87811k(appBrandRuntimeWC, new C87805i(appBrandRuntimeWC), (C8480h) null);
                    this.f254168rt.f238298z1.f247571d = kVar2;
                    eVar.setWxaHalfScreenGestureController(kVar2);
                    this.setupGestureController = true;
                }
                C85007k kVar3 = this.f254168rt.f238298z1.f247571d;
                if (kVar3 != null) {
                    int i = wxaWindowLayoutParams.height;
                    int i2 = halfScreenConfig.f157938I;
                    if (i2 != -1) {
                        i2 = Math.max(-1, i2 - getHeaderOuterIndicatorHeight(halfScreenConfig));
                    }
                    kVar3.mo117949d(i, i2);
                }
                configGesture(halfScreenConfig);
            }
            if (halfScreenConfig.f157932C == HalfScreenConfig.C55455e.EMBED && this.f254168rt.f238298z1.f247572e.type() != C88029d.C88032b.TYPE_EMBED) {
                AppBrandRuntimeWC appBrandRuntimeWC2 = this.f254168rt;
                HalfScreenManger halfScreenManger3 = appBrandRuntimeWC2.f238298z1;
                C88028c cVar2 = new C88028c(appBrandRuntimeWC2, this.ctx.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_4));
                halfScreenManger3.getClass();
                halfScreenManger3.f247572e = cVar2;
            } else if (halfScreenConfig.f157932C == HalfScreenConfig.C55455e.NORMAL && this.f254168rt.f238298z1.f247572e.type() != C88029d.C88032b.TYPE_NORMAL) {
                AppBrandRuntimeWC appBrandRuntimeWC3 = this.f254168rt;
                HalfScreenManger halfScreenManger4 = appBrandRuntimeWC3.f238298z1;
                C88026a aVar = new C88026a(appBrandRuntimeWC3, this.ctx.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_4));
                halfScreenManger4.getClass();
                halfScreenManger4.f247572e = aVar;
            }
            if (cVar != C87798c.WINDOW_INSETS_CHANGE && !halfScreenConfig.f157958u) {
                this.f254168rt.f238298z1.f247572e.mo122473d();
            }
            this.f254168rt.mo113054f0().mo109905TE(this.ctx.getResources().getColor(C0966R.color.ahf), this.f254168rt);
        } else {
            return;
        }
        this.f254168rt.mo113054f0().mo109904Lo(wxaWindowLayoutParams, this.f254168rt);
        monitorWindowInsets(z);
    }

    private final Display defaultDisplay() {
        Object systemService = this.ctx.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return ((WindowManager) systemService).getDefaultDisplay();
    }

    private final int getHeaderOuterIndicatorHeight(HalfScreenConfig halfScreenConfig) {
        if (!this.f254168rt.f238298z1.mo117793p()) {
            return 0;
        }
        int i = halfScreenConfig.f157935F;
        return i > 0 ? i : MMApplicationContext.getResources().getDimensionPixelOffset(C0966R.dimen.f3745cw);
    }

    private final C87800b getOnApplyWindowInsetsListener() {
        return (C87800b) this.onApplyWindowInsetsListener$delegate.getValue();
    }

    private final WxaWindowLayoutParams makeLayoutParams(HalfScreenConfig halfScreenConfig, boolean z) {
        WxaWindowLayoutParams wxaWindowLayoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        HalfScreenConfig.C55455e eVar = HalfScreenConfig.C55455e.EMBED;
        if (this.shouldUseCenterPopStyle) {
            return makeLayoutParamsForCenterPop();
        }
        if (z) {
            int i7 = halfScreenConfig.f157961x;
            int min = (i7 == -2 || i7 == -1) ? -1 : Math.min(i7, C75044y4.m89990b(MMApplicationContext.getContext()).y);
            if (halfScreenConfig.f157932C == eVar) {
                min -= MMApplicationContext.getResources().getDimensionPixelOffset(C0966R.dimen.f3677b7);
            }
            int i8 = halfScreenConfig.f157962y;
            if (i8 == -1) {
                i4 = -1;
            } else {
                if (i8 == -2) {
                    i6 = (C75044y4.m89990b(MMApplicationContext.getContext()).x * 3) / 4;
                    i5 = navigationBarWidthToConsume(halfScreenConfig);
                } else {
                    i6 = Math.min(i8, C75044y4.m89990b(MMApplicationContext.getContext()).x);
                    i5 = navigationBarWidthToConsume(halfScreenConfig);
                }
                i4 = i6 - i5;
            }
            if (!(min == -1 || min == -2 || !this.f254168rt.f238298z1.mo117793p())) {
                min = tryMinusHeaderOuterIndicatorHeight(min, halfScreenConfig);
            }
            wxaWindowLayoutParams = new WxaWindowLayoutParams(i4, min);
            wxaWindowLayoutParams.gravity = 85;
        } else {
            int i9 = halfScreenConfig.f157944d;
            if (i9 == -1) {
                i = -1;
            } else {
                if (i9 == -2) {
                    i3 = (C75044y4.m89990b(MMApplicationContext.getContext()).y * 3) / 4;
                    i2 = navigationBarHeightToConsume(halfScreenConfig);
                } else {
                    i3 = Math.min(i9, C75044y4.m89990b(MMApplicationContext.getContext()).y);
                    i2 = navigationBarHeightToConsume(halfScreenConfig);
                }
                i = i3 - i2;
            }
            if (halfScreenConfig.f157932C == eVar) {
                i -= MMApplicationContext.getResources().getDimensionPixelOffset(C0966R.dimen.f3677b7);
            }
            int i15 = halfScreenConfig.f157960w;
            int min2 = (i15 == -1 || i15 == -2) ? -1 : Math.min(i15, C75044y4.m89990b(MMApplicationContext.getContext()).x);
            if (!(i == -1 || i == -2 || !this.f254168rt.f238298z1.mo117793p())) {
                i = tryMinusHeaderOuterIndicatorHeight(i, halfScreenConfig);
            }
            wxaWindowLayoutParams = new WxaWindowLayoutParams(min2, i);
            wxaWindowLayoutParams.gravity = 81;
        }
        Log.m105924i(TAG, "[makeLayoutParams] height=[" + wxaWindowLayoutParams.height + "]  width=[" + wxaWindowLayoutParams.width + "]  isLandScape=[" + z + ']');
        return wxaWindowLayoutParams;
    }

    private final WxaWindowLayoutParams makeLayoutParamsForCenterPop() {
        C86799a<AppBrandInitConfigLU> aVar = this.centerInsideManager;
        C87412m.m108591d(aVar);
        aVar.setSoftOrientation("portrait");
        Log.m105925i(TAG, "wh=%d%d", Integer.valueOf(aVar.getVDisplayMetrics().widthPixels), Integer.valueOf(aVar.getVDisplayMetrics().heightPixels));
        WxaWindowLayoutParams wxaWindowLayoutParams = new WxaWindowLayoutParams((int) (((float) aVar.getVDisplayMetrics().widthPixels) * aVar.getScale()), (C75044y4.m89990b(MMApplicationContext.getContext()).y * 3) / 4);
        wxaWindowLayoutParams.gravity = 81;
        return wxaWindowLayoutParams;
    }

    private final void monitorWindowInsets(boolean z) {
        Activity R = this.f254168rt.mo113026R();
        if (!(R instanceof Activity)) {
            R = null;
        }
        if (R == null) {
            Log.m105928w(TAG, "[monitorWindowInsets] runtime context is null!");
        } else if (!z) {
            this.isMonitorWindowInsets = false;
            C87771d.m109203b(R).mo122182f(getOnApplyWindowInsetsListener());
        } else if (!this.isMonitorWindowInsets) {
            this.isMonitorWindowInsets = true;
            WindowInsets b = C85924r4.m106237b(R);
            if (b != null) {
                onApplyWindowInsets(b);
            }
            C87771d.m109203b(R).mo122180d(getOnApplyWindowInsetsListener());
        }
    }

    private final int navigationBarHeightToConsume(HalfScreenConfig halfScreenConfig) {
        if (halfScreenConfig.f157931B) {
            return this.currentWindowStableInsetBottom;
        }
        return 0;
    }

    private final int navigationBarWidthToConsume(HalfScreenConfig halfScreenConfig) {
        if (halfScreenConfig.f157931B) {
            return this.currentWindowStableInsetRight;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public final void onApplyWindowInsets(WindowInsets windowInsets) {
        boolean z;
        Log.m105924i(TAG, "onApplyWindowInsets insets=" + windowInsets + ", currentWindowStableInsetBottom=" + this.currentWindowStableInsetBottom);
        boolean z2 = true;
        if (this.currentWindowStableInsetBottom != windowInsets.getStableInsetBottom()) {
            this.currentWindowStableInsetBottom = windowInsets.getStableInsetBottom();
            z = true;
        } else {
            z = false;
        }
        if (this.currentWindowStableInsetRight != windowInsets.getStableInsetRight()) {
            this.currentWindowStableInsetRight = windowInsets.getStableInsetRight();
        } else {
            z2 = z;
        }
        if (z2) {
            AppBrandInitConfigWC M1 = this.f254168rt.mo113210l1();
            C87412m.m108593f(M1, "rt.initConfig");
            configHalfScreenConfig(M1, C87798c.WINDOW_INSETS_CHANGE);
        }
    }

    public static final boolean shouldUseCenterPopStyle(HalfScreenConfig.C55455e eVar) {
        return Companion.mo122253a(eVar);
    }

    private final int tryMinusHeaderOuterIndicatorHeight(int i, HalfScreenConfig halfScreenConfig) {
        return i - getHeaderOuterIndicatorHeight(halfScreenConfig);
    }

    public C39836d createFullscreenHandler(C39836d.C39839b bVar) {
        C39836d createFullscreenHandler = this.baseWindow.createFullscreenHandler(bVar);
        C87412m.m108593f(createFullscreenHandler, "baseWindow.createFullscreenHandler(provider)");
        return createFullscreenHandler;
    }

    public boolean forceLightMode() {
        HalfScreenConfig halfScreenConfig = this.f254168rt.mo113210l1().f234815R0;
        return halfScreenConfig.f157948h & halfScreenConfig.mo76931c();
    }

    public C79778e getOrientationHandler() {
        if (this.shouldUseCenterPopStyle) {
            C79774c f0 = this.f254168rt.mo113054f0();
            C87412m.m108593f(f0, "rt.windowAndroid");
            return new C86645a(f0);
        }
        C79778e orientationHandler = this.baseWindow.getOrientationHandler();
        C87412m.m108593f(orientationHandler, "baseWindow.orientationHandler");
        return orientationHandler;
    }

    public float getScale() {
        return this.baseWindow.getScale();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if ((!r0.f157951n && r0.f157944d == -1) == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public br0.C79774c.C79777c getStatusBar() {
        /*
            r4 = this;
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r4.f254168rt
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.mo113210l1()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.f234815R0
            boolean r1 = r0.mo76931c()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001f
            boolean r1 = r0.f157951n
            if (r1 != 0) goto L_0x001b
            int r0 = r0.f157944d
            r1 = -1
            if (r0 != r1) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 != 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            if (r2 == 0) goto L_0x002e
            br0.c$c r0 = new br0.c$c
            r0.<init>()
            r0.f233795a = r3
            r1 = 8
            r0.f233796b = r1
            goto L_0x0034
        L_0x002e:
            br0.c r0 = r4.baseWindow
            br0.c$c r0 = r0.getStatusBar()
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: it0.C87795a.getStatusBar():br0.c$c");
    }

    public DisplayMetrics getVDisplayMetrics() {
        Display display;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            if (C11171e.m11046c(30)) {
                display = this.ctx.getDisplay();
                if (display == null) {
                    display = defaultDisplay();
                }
            } else {
                display = defaultDisplay();
            }
        } catch (Throwable unused) {
            display = defaultDisplay();
        }
        C87412m.m108591d(display);
        display.getRealMetrics(displayMetrics);
        if (this.f254168rt.mo113210l1().f234815R0.mo76931c()) {
            displayMetrics.widthPixels = this.f254168rt.f238153r.getMeasuredWidth();
            displayMetrics.heightPixels = this.f254168rt.f238153r.getMeasuredHeight();
        }
        return displayMetrics;
    }

    public boolean isLargeScreenWindow() {
        return this.baseWindow.isLargeScreenWindow();
    }

    public void onAppConfigGot(C81634a aVar) {
        C87412m.m108594g(aVar, "appConfig");
        C86799a<AppBrandInitConfigLU> aVar2 = this.centerInsideManager;
        if (aVar2 != null) {
            aVar2.onAppConfigGot(aVar);
        }
        Log.m105924i(TAG, "onAppConfigGot");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        Log.m105924i(TAG, "onConfigurationChanged  new[" + configuration.orientation + "]  last[" + this.lastOrientation + ']');
        C86799a<AppBrandInitConfigLU> aVar = this.centerInsideManager;
        if (aVar != null) {
            aVar.onConfigurationChanged(configuration);
        }
        if (configuration.orientation != this.lastOrientation) {
            if (this.f254168rt.mo113067m0()) {
                int i = configuration.orientation;
                boolean z = false;
                if (i != 1 && i == 2) {
                    z = true;
                }
                C79774c f0 = this.f254168rt.mo113054f0();
                HalfScreenConfig halfScreenConfig = this.f254168rt.mo113210l1().f234815R0;
                C87412m.m108593f(halfScreenConfig, "rt.initConfig.halfScreenConfig");
                f0.mo109904Lo(makeLayoutParams(halfScreenConfig, z), this.f254168rt);
                HalfScreenConfig halfScreenConfig2 = this.f254168rt.mo113210l1().f234815R0;
                C87412m.m108593f(halfScreenConfig2, "rt.initConfig.halfScreenConfig");
                configGesture(halfScreenConfig2);
            }
            this.lastOrientation = configuration.orientation;
        }
    }

    public void setSoftOrientation(String str) {
        this.baseWindow.setSoftOrientation(str);
    }

    public boolean shouldInLargeScreenCompatMode() {
        return this.shouldUseCenterPopStyle;
    }

    public void init(AppBrandInitConfigWC appBrandInitConfigWC) {
        C87412m.m108594g(appBrandInitConfigWC, "initConfig");
        C86799a<AppBrandInitConfigLU> aVar = this.centerInsideManager;
        if (aVar != null) {
            aVar.init(appBrandInitConfigWC);
        }
        applyWindowConfig(appBrandInitConfigWC, C87798c.WXA_COLD_LAUNCH);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        r4 = r4.getCurrentPage();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onInitConfigUpdated(com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC r4) {
        /*
            r3 = this;
            java.lang.String r0 = "initConfig"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "MicroMsg.AppBrandHalfWindowLayoutManager"
            java.lang.String r1 = "onInitConfigUpdated"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            fc.a<com.tencent.luggage.sdk.config.AppBrandInitConfigLU> r0 = r3.centerInsideManager
            if (r0 == 0) goto L_0x0013
            r0.onInitConfigUpdated(r4)
        L_0x0013:
            it0.a$c r0 = it0.C87795a.C87798c.INIT_CONFIG_UPDATED
            r3.applyWindowConfig(r4, r0)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r3.f254168rt
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r4 = r4.mo113212m1()
            r0 = 0
            if (r4 == 0) goto L_0x002c
            com.tencent.mm.plugin.appbrand.page.i0 r4 = r4.getCurrentPage()
            if (r4 == 0) goto L_0x002c
            com.tencent.mm.plugin.appbrand.page.d1 r4 = r4.getCurrentPageView()
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            if (r4 == 0) goto L_0x0041
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r3.f254168rt
            com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger r1 = r1.f238298z1
            java.lang.String r2 = "rt.halfScreenManger"
            gy3.C87412m.m108593f(r1, r2)
            r2 = 0
            r1.f247574g = r2
            com.tencent.mm.plugin.appbrand.page.t1 r4 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r4
            r1.mo117797t(r4, r0)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: it0.C87795a.onInitConfigUpdated(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC):void");
    }
}
