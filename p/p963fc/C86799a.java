package p963fc;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import br0.C39836d;
import br0.C79774c;
import br0.C79778e;
import br0.C79782g;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C84094r4;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.platform.window.WxaWindowLayoutParams;
import com.tencent.p014mm.plugin.appbrand.utils.C84777q1;
import com.tencent.p014mm.plugin.appbrand.widget.C84927e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import er0.C86645a;
import gy3.C8480h;
import gy3.C87412m;
import p225rc.C89923l;
import p385u2.C111105a;
import zt3.C119157j;

/* renamed from: fc.a */
public abstract class C86799a<C extends AppBrandInitConfigLU> implements C86814i<C>, C79782g {
    private String _softOrientation;
    private final C79778e activityOrientationHandler;
    private final Context ctx;
    private final DisplayMetrics displayMetrics;
    private final boolean dryRun;
    private int heightPx;
    private C initConfig;
    private boolean isFold;
    private final boolean isFoldDevice;
    private boolean isLastInMultiWindowMode;
    private int lastLandscapeVHeight;
    private int lastLandscapeVWidth;
    private int lastOrientation;
    private int lastPortraitVHeight;
    private int lastPortraitVWidth;
    private int lastScreenHDp;
    private int lastScreenWDp;
    private int maxEdge;
    private int minEdge;
    private String orientation;
    private boolean resizable;

    /* renamed from: rt */
    private final AppBrandRuntime f251940rt;
    private float scale;
    private double systemRatio;
    private int widthPx;
    private C86801b windowOrientation;

    /* renamed from: fc.a$a */
    public static class C86800a implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public int f251941d;

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z = true;
            int i9 = this.f251941d + 1;
            this.f251941d = i9;
            C86803d dVar = (C86803d) this;
            if (i9 == 10) {
                dVar.f251946e.removeOnLayoutChangeListener(dVar);
                return;
            }
            if (!(i == i2 && i == i4 && i == i3)) {
                z = false;
            }
            if (i == i5 && i3 == i7 && i4 == i8 && i2 == i6 && !z) {
                Log.m105924i("Luggage.AppBrandWindowLayoutManager", "onLayoutChange: no changed, ignore");
                return;
            }
            if (dVar.f251947f.getInitConfig() != null) {
                C86799a.tuningRtContentView$default(dVar.f251947f, "onConfigurationChanged", false, 2, (Object) null);
            }
            dVar.f251946e.removeOnLayoutChangeListener(dVar);
        }
    }

    /* renamed from: fc.a$b */
    public enum C86801b {
        LANDSCAPE,
        PORTRAIT
    }

    /* renamed from: fc.a$c */
    public static final class C86802c implements C79778e.C79779a {

        /* renamed from: a */
        public final /* synthetic */ C86799a<C> f251945a;

        public C86802c(C86799a<C> aVar) {
            this.f251945a = aVar;
        }

        /* renamed from: g */
        public final void mo109919g(C79778e.C79780b bVar, boolean z) {
            Log.m105925i("Luggage.AppBrandWindowLayoutManager", "request orientation result: [%b]", Boolean.valueOf(z));
            if (this.f251945a.getInitConfig() != null) {
                this.f251945a.tuningRtContentView("requestDeviceOrientation done", true);
            }
        }
    }

    /* renamed from: fc.a$d */
    public static final class C86803d extends C86800a {

        /* renamed from: e */
        public final /* synthetic */ View f251946e;

        /* renamed from: f */
        public final /* synthetic */ C86799a<C> f251947f;

        public C86803d(View view, C86799a<C> aVar) {
            this.f251946e = view;
            this.f251947f = aVar;
        }
    }

    /* renamed from: fc.a$e */
    public static final class C86804e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86799a<C> f251948d;

        /* renamed from: e */
        public final /* synthetic */ boolean f251949e;

        /* renamed from: f */
        public final /* synthetic */ boolean f251950f;

        /* renamed from: g */
        public final /* synthetic */ String f251951g;

        /* renamed from: h */
        public final /* synthetic */ boolean f251952h;

        public C86804e(C86799a<C> aVar, boolean z, boolean z2, String str, boolean z3) {
            this.f251948d = aVar;
            this.f251949e = z;
            this.f251950f = z2;
            this.f251951g = str;
            this.f251952h = z3;
        }

        public final void run() {
            this.f251948d.tuningRtContentView(this.f251949e, this.f251950f, this.f251951g, this.f251952h);
        }
    }

    /* renamed from: fc.a$f */
    public static final class C86805f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86799a<C> f251953d;

        public C86805f(C86799a<C> aVar) {
            this.f251953d = aVar;
        }

        public final void run() {
            C86799a.tuningRtContentView$default(this.f251953d, false, false, "post", false, 8, (Object) null);
        }
    }

    public C86799a(AppBrandRuntime appBrandRuntime, Context context, C79778e eVar, boolean z) {
        C87412m.m108594g(appBrandRuntime, "rt");
        C87412m.m108594g(context, "ctx");
        this.f251940rt = appBrandRuntime;
        this.ctx = context;
        this.activityOrientationHandler = eVar;
        this.dryRun = z;
        this.orientation = "portrait";
        this.scale = 1.0f;
        boolean h = C89923l.f258408a.mo117502h();
        this.isFoldDevice = h;
        this.displayMetrics = new DisplayMetrics();
        this.isFold = h && !appBrandRuntime.mo113054f0().mo109902Bk();
        this.systemRatio = -1.0d;
        this.windowOrientation = parseOrientation(context.getResources().getConfiguration().orientation);
        this.lastOrientation = context.getResources().getConfiguration().orientation;
        this.lastScreenWDp = context.getResources().getConfiguration().screenWidthDp;
        this.lastScreenHDp = context.getResources().getConfiguration().screenHeightDp;
        refreshDisplayInfo();
    }

    private final View getBackgroundView() {
        C84927e eVar = this.f251940rt.f238153r;
        ViewParent parent = eVar != null ? eVar.getParent() : null;
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    private final C86801b parseOrientation(int i) {
        C86801b bVar = C86801b.PORTRAIT;
        if (i == 1) {
            return bVar;
        }
        if (i == 2) {
            return C86801b.LANDSCAPE;
        }
        Log.m105929w("Luggage.AppBrandWindowLayoutManager", "unexpected orientation [%d], fallback to portrait", Integer.valueOf(i));
        return bVar;
    }

    private final void refreshDisplayInfo() {
        Point point = new Point();
        Object systemService = this.ctx.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (!C84777q1.m104442b(this.ctx) || !C89923l.f258408a.mo117496b()) {
            defaultDisplay.getSize(point);
            defaultDisplay.getMetrics(this.displayMetrics);
        } else {
            defaultDisplay.getRealSize(point);
            defaultDisplay.getRealMetrics(this.displayMetrics);
        }
        int i = point.x;
        this.widthPx = i;
        int i2 = point.y;
        this.heightPx = i2;
        this.maxEdge = Math.max(i, i2);
        this.minEdge = Math.min(this.widthPx, this.heightPx);
        Log.m105925i("Luggage.AppBrandWindowLayoutManager", "refreshDisplayInfo: system [w,h] = [%d,%d]", Integer.valueOf(this.widthPx), Integer.valueOf(this.heightPx));
    }

    private final void resetWindowOrientation() {
        if (this.f251940rt.f238122S && this.activityOrientationHandler != null) {
            if (!TextUtils.isEmpty(this._softOrientation)) {
                Log.m105925i("Luggage.AppBrandWindowLayoutManager", "resetWindowOrientation by softOrientation[%s]", this._softOrientation);
                this.activityOrientationHandler.mo109918b(C79778e.C79780b.m96933b(this._softOrientation), (C79778e.C79779a) null);
                return;
            }
            C79778e.C79780b a = this.activityOrientationHandler.mo109917a();
            C87412m.m108593f(a, "activityOrientationHandler.currentOrientation");
            Log.m105925i("Luggage.AppBrandWindowLayoutManager", "resetWindowOrientation with orientation[%s]", a);
            this.activityOrientationHandler.mo109918b(a, (C79778e.C79779a) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void set_softOrientation(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r6
            java.lang.String r3 = "Luggage.AppBrandWindowLayoutManager"
            java.lang.String r4 = "_softOrientation = [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            if (r6 == 0) goto L_0x005b
            int r1 = r6.hashCode()
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r4) goto L_0x003f
            r4 = 729267099(0x2b77bb9b, float:8.8012383E-13)
            if (r1 == r4) goto L_0x0030
            r4 = 1430647483(0x5545f2bb, float:1.36028944E13)
            if (r1 == r4) goto L_0x0023
            goto L_0x005b
        L_0x0023:
            java.lang.String r1 = "landscape"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x005b
            fc.a$b r1 = p963fc.C86799a.C86801b.LANDSCAPE
            r5.windowOrientation = r1
            goto L_0x0065
        L_0x0030:
            java.lang.String r1 = "portrait"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L_0x003a
            goto L_0x005b
        L_0x003a:
            fc.a$b r1 = p963fc.C86799a.C86801b.PORTRAIT
            r5.windowOrientation = r1
            goto L_0x0065
        L_0x003f:
            java.lang.String r1 = "auto"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L_0x0048
            goto L_0x005b
        L_0x0048:
            android.content.Context r1 = r5.ctx
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            fc.a$b r1 = r5.parseOrientation(r1)
            r5.windowOrientation = r1
            goto L_0x0065
        L_0x005b:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r2] = r6
            java.lang.String r2 = "unhandled orientation = [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r2, r1)
        L_0x0065:
            r1 = 0
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r5.f251940rt     // Catch:{ AssertionFailedError -> 0x0079 }
            com.tencent.mm.plugin.appbrand.page.m0 r2 = r2.mo113042Z()     // Catch:{ AssertionFailedError -> 0x0079 }
            if (r2 == 0) goto L_0x007a
            com.tencent.mm.plugin.appbrand.page.d1 r2 = r2.getPageView()     // Catch:{ AssertionFailedError -> 0x0079 }
            if (r2 == 0) goto L_0x007a
            br0.d r1 = r2.mo116151F0()     // Catch:{ AssertionFailedError -> 0x0079 }
            goto L_0x007a
        L_0x0079:
        L_0x007a:
            if (r1 == 0) goto L_0x0089
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.appbrand.C84094r4
            if (r2 == 0) goto L_0x0089
            com.tencent.mm.plugin.appbrand.r4 r1 = (com.tencent.p014mm.plugin.appbrand.C84094r4) r1
            boolean r1 = r1.mo116763i()
            if (r1 == 0) goto L_0x0089
            return
        L_0x0089:
            r5._softOrientation = r6
            java.lang.String r6 = "set softOrientation"
            r5.tuningRtContentView(r6, r0)
            boolean r6 = r5.shouldInLargeScreenCompatMode()
            if (r6 != 0) goto L_0x009b
            boolean r6 = r5.resizable
            if (r6 == 0) goto L_0x00c5
        L_0x009b:
            android.content.Context r6 = r5.ctx
            boolean r6 = r6 instanceof android.app.Activity
            if (r6 == 0) goto L_0x00c5
            br0.e r6 = r5.activityOrientationHandler
            if (r6 == 0) goto L_0x00c5
            java.lang.String r6 = "_softOrientation: unlock orientation"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            android.content.Context r6 = r5.ctx
            android.app.Activity r6 = (android.app.Activity) r6
            int r6 = r6.getRequestedOrientation()
            r0 = 14
            if (r6 == r0) goto L_0x00c5
            r0 = -1
            if (r6 == r0) goto L_0x00c5
            br0.e r6 = r5.activityOrientationHandler
            br0.e$b r0 = br0.C79778e.C79780b.UNSPECIFIED
            fc.a$c r1 = new fc.a$c
            r1.<init>(r5)
            r6.mo109918b(r0, r1)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p963fc.C86799a.set_softOrientation(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public final void tuningRtContentView(String str, boolean z) {
        tuningRtContentView(true, false, str, z);
    }

    public static /* synthetic */ void tuningRtContentView$default(C86799a aVar, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            aVar.tuningRtContentView(str, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tuningRtContentView");
    }

    public C39836d createFullscreenHandler(C39836d.C39839b bVar) {
        Context context = this.ctx;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        C79774c f0 = this.f251940rt.mo113054f0();
        C87412m.m108593f(f0, "rt.windowAndroid");
        return new C84094r4(f0, bVar, activity);
    }

    public boolean forceLightMode() {
        return false;
    }

    public int getBackgroundColor() {
        return C0966R.color.f2930d;
    }

    public final C getInitConfig() {
        return this.initConfig;
    }

    public final int getLastLandscapeVHeight() {
        return this.lastLandscapeVHeight;
    }

    public final int getLastLandscapeVWidth() {
        return this.lastLandscapeVWidth;
    }

    public final int getLastPortraitVHeight() {
        return this.lastPortraitVHeight;
    }

    public final int getLastPortraitVWidth() {
        return this.lastPortraitVWidth;
    }

    public C79778e getOrientationHandler() {
        C79774c f0 = this.f251940rt.mo113054f0();
        C87412m.m108593f(f0, "rt.windowAndroid");
        return new C86645a(f0);
    }

    public final boolean getResizable() {
        return this.resizable;
    }

    public final AppBrandRuntime getRt() {
        return this.f251940rt;
    }

    public float getScale() {
        return this.scale;
    }

    public abstract /* synthetic */ C79774c.C79777c getStatusBar();

    public DisplayMetrics getVDisplayMetrics() {
        return getVDisplayMetrics(false);
    }

    public void init(C c) {
        C87412m.m108594g(c, "initConfig");
        this.initConfig = c;
        this.resizable = c.f234804H.f239471z;
        tuningRtContentView$default(this, true, false, APMidasPluginInfo.LAUNCH_INTERFACE_INIT, false, 8, (Object) null);
    }

    public final boolean isFold() {
        return this.isFold;
    }

    public boolean isLargeScreenWindow() {
        return C84777q1.m104442b(this.ctx) && !shouldInLargeScreenCompatMode();
    }

    public void onAppConfigGot(C81634a aVar) {
        C87412m.m108594g(aVar, "appConfig");
        String str = "portrait";
        this.orientation = str;
        String str2 = aVar.mo113982a().f239663m;
        if (str2 == null) {
            String str3 = aVar.f239611q.f239621a;
            if (str3 != null) {
                if (!(str3.length() == 0)) {
                    str = str3;
                }
            }
            this.orientation = str;
        } else {
            this.orientation = str2;
        }
        boolean z = aVar.f239618x;
        boolean z2 = this.resizable;
        if (z2 != z) {
            this.resizable = z;
            tuningRtContentView$default(this, "redundancy field check fail", false, 2, (Object) null);
            Log.m105929w("Luggage.AppBrandWindowLayoutManager", "setResizableToWindow: redundancy field check fail, please call complexzeng to fix, fromAttr = [%b], fromAppJson = [%b]", Boolean.valueOf(z2), Boolean.valueOf(z));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        if (this.lastOrientation != configuration.orientation && C87412m.m108589b(this._softOrientation, "auto") && shouldInLargeScreenCompatMode() && !this.resizable) {
            this.windowOrientation = parseOrientation(configuration.orientation);
        }
        int i = this.lastOrientation;
        int i2 = configuration.orientation;
        if (!(i == i2 && configuration.screenHeightDp == this.lastScreenHDp && configuration.screenWidthDp == this.lastScreenWDp)) {
            this.isFold = this.isFoldDevice || (!(configuration.screenHeightDp == this.lastScreenHDp && configuration.screenWidthDp == this.lastScreenWDp) && i == i2);
            if (Build.VERSION.SDK_INT >= 24) {
                if (this.f251940rt.mo113054f0().mo109902Bk() || this.isLastInMultiWindowMode) {
                    this.isFold = false;
                }
                this.isLastInMultiWindowMode = this.f251940rt.mo113054f0().mo109902Bk();
            }
            refreshDisplayInfo();
            if (this.isFold && !(configuration.screenHeightDp == this.lastScreenHDp && configuration.screenWidthDp == this.lastScreenWDp)) {
                resetWindowOrientation();
            }
            View backgroundView = getBackgroundView();
            if (backgroundView != null) {
                backgroundView.addOnLayoutChangeListener(new C86803d(backgroundView, this));
            }
        }
        this.lastOrientation = configuration.orientation;
        this.lastScreenHDp = configuration.screenHeightDp;
        this.lastScreenWDp = configuration.screenWidthDp;
    }

    public void onInitConfigUpdated(C c) {
        C87412m.m108594g(c, "initConfig");
        this.initConfig = c;
        this.resizable = c.f234804H.f239471z;
        if (shouldInLargeScreenCompatMode()) {
            Configuration configuration = this.ctx.getResources().getConfiguration();
            C87412m.m108593f(configuration, "ctx.resources.configuration");
            onConfigurationChanged(configuration);
        }
        tuningRtContentView$default(this, true, true, "onInitConfigUpdated", false, 8, (Object) null);
    }

    public final void setInitConfig(C c) {
        this.initConfig = c;
    }

    public final void setLastLandscapeVHeight(int i) {
        this.lastLandscapeVHeight = i;
    }

    public final void setLastLandscapeVWidth(int i) {
        this.lastLandscapeVWidth = i;
    }

    public final void setLastPortraitVHeight(int i) {
        this.lastPortraitVHeight = i;
    }

    public final void setLastPortraitVWidth(int i) {
        this.lastPortraitVWidth = i;
    }

    public final void setResizable(boolean z) {
        this.resizable = z;
    }

    public void setSoftOrientation(String str) {
        C87412m.m108594g(str, "name");
        set_softOrientation(str);
    }

    public boolean shouldInLargeScreenCompatMode() {
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        return C84777q1.m104442b(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if ((r14.systemRatio == -1.0d) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.util.DisplayMetrics getVDisplayMetrics(boolean r15) {
        /*
            r14 = this;
            android.view.View r15 = r14.getBackgroundView()
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.util.DisplayMetrics r1 = r14.displayMetrics
            r0.setTo(r1)
            boolean r1 = r14.isFold
            r2 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 1
            if (r1 == 0) goto L_0x0023
            double r6 = r14.systemRatio
            r8 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0020
            r1 = 1
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x0030
        L_0x0023:
            int r1 = r14.maxEdge
            double r6 = (double) r1
            double r6 = r6 * r3
            int r1 = r14.minEdge
            double r8 = (double) r1
            double r8 = r8 * r3
            double r6 = r6 / r8
            r14.systemRatio = r6
        L_0x0030:
            int r1 = r14.maxEdge
            int r6 = r14.minEdge
            if (r15 == 0) goto L_0x003b
            boolean r7 = r15.isLaidOut()
            goto L_0x003c
        L_0x003b:
            r7 = 0
        L_0x003c:
            if (r7 == 0) goto L_0x0060
            gy3.C87412m.m108591d(r15)
            int r1 = r15.getMeasuredWidth()
            int r6 = r15.getMeasuredHeight()
            if (r1 >= r6) goto L_0x004c
            r1 = r6
        L_0x004c:
            int r6 = r15.getMeasuredWidth()
            int r15 = r15.getMeasuredHeight()
            if (r6 <= r15) goto L_0x0057
            r6 = r15
        L_0x0057:
            double r8 = (double) r1
            double r8 = r8 * r3
            double r10 = (double) r6
            double r10 = r10 * r3
            double r8 = r8 / r10
            r14.systemRatio = r8
        L_0x0060:
            double r3 = r14.systemRatio
            r8 = 4608683618675807573(0x3ff5555555555555, double:1.3333333333333333)
            int r15 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r15 <= 0) goto L_0x0075
            r10 = 4616690018013355122(0x4011c71c71c71c72, double:4.444444444444445)
            int r15 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x0075
            goto L_0x007a
        L_0x0075:
            r3 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
        L_0x007a:
            android.util.DisplayMetrics r15 = r14.displayMetrics
            r0.setTo(r15)
            fc.a$b r15 = r14.windowOrientation
            fc.a$b r10 = p963fc.C86799a.C86801b.PORTRAIT
            if (r15 == r10) goto L_0x0088
            double r11 = (double) r5
            double r3 = r11 / r3
        L_0x0088:
            r15 = 1065353216(0x3f800000, float:1.0)
            double r11 = r14.systemRatio
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 < 0) goto L_0x0096
            boolean r8 = r14.isFold
            if (r8 != 0) goto L_0x0096
            r15 = 1061158912(0x3f400000, float:0.75)
        L_0x0096:
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r9 = r14.f251940rt
            java.lang.String r9 = r9.f238147j
            r8[r2] = r9
            java.lang.Double r9 = java.lang.Double.valueOf(r3)
            r8[r5] = r9
            r9 = 2
            double r11 = r14.systemRatio
            java.lang.Double r11 = java.lang.Double.valueOf(r11)
            r8[r9] = r11
            r9 = 3
            boolean r11 = r14.isFold
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r8[r9] = r11
            r9 = 4
            java.lang.Float r11 = java.lang.Float.valueOf(r15)
            r8[r9] = r11
            java.lang.String r9 = "Luggage.AppBrandWindowLayoutManager"
            java.lang.String r11 = "getVDisplayMetrics(%s): contentRatio = [%f], systemRatio = [%f], isFold = [%b], ratio = [%f]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r8)
            boolean r8 = r14.isFold
            if (r8 == 0) goto L_0x00e7
            fc.a$b r8 = r14.windowOrientation
            if (r8 != r10) goto L_0x00da
            int r8 = r14.lastPortraitVHeight
            if (r8 == 0) goto L_0x00e7
            int r9 = r14.lastPortraitVWidth
            if (r9 == 0) goto L_0x00e7
            r0.heightPixels = r8
            r0.widthPixels = r9
            goto L_0x00e6
        L_0x00da:
            int r8 = r14.lastLandscapeVHeight
            if (r8 == 0) goto L_0x00e7
            int r9 = r14.lastLandscapeVWidth
            if (r9 == 0) goto L_0x00e7
            r0.heightPixels = r8
            r0.widthPixels = r9
        L_0x00e6:
            r2 = 1
        L_0x00e7:
            if (r2 != 0) goto L_0x0104
            fc.a$b r2 = r14.windowOrientation
            if (r2 != r10) goto L_0x00f9
            float r1 = (float) r1
            float r1 = r1 * r15
            int r15 = (int) r1
            r0.heightPixels = r15
            double r1 = (double) r15
            double r1 = r1 / r3
            int r15 = (int) r1
            r0.widthPixels = r15
            goto L_0x0104
        L_0x00f9:
            float r1 = (float) r6
            float r1 = r1 * r15
            int r15 = (int) r1
            r0.heightPixels = r15
            double r1 = (double) r15
            double r1 = r1 / r3
            int r15 = (int) r1
            r0.widthPixels = r15
        L_0x0104:
            if (r7 == 0) goto L_0x011b
            fc.a$b r15 = r14.windowOrientation
            if (r15 != r10) goto L_0x0113
            int r15 = r0.heightPixels
            r14.lastPortraitVHeight = r15
            int r15 = r0.widthPixels
            r14.lastPortraitVWidth = r15
            goto L_0x011b
        L_0x0113:
            int r15 = r0.heightPixels
            r14.lastLandscapeVHeight = r15
            int r15 = r0.widthPixels
            r14.lastLandscapeVWidth = r15
        L_0x011b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p963fc.C86799a.getVDisplayMetrics(boolean):android.util.DisplayMetrics");
    }

    /* access modifiers changed from: private */
    public final void tuningRtContentView(boolean z, boolean z2, String str, boolean z3) {
        if (!C87412m.m108589b(Looper.getMainLooper(), Looper.myLooper())) {
            ((C119157j) C119157j.f356862d).mo183895z(new C86804e(this, z, z2, str, z3));
            return;
        }
        View backgroundView = getBackgroundView();
        if (shouldInLargeScreenCompatMode() && backgroundView != null) {
            DisplayMetrics vDisplayMetrics = getVDisplayMetrics(z3);
            Log.m105925i("Luggage.AppBrandWindowLayoutManager", "tuningRtContentView[%s %s]: orientation = [%s], vdmW = [%d], vdmH = [%d]", str, this.f251940rt.f238147j, this.windowOrientation, Integer.valueOf(vDisplayMetrics.widthPixels), Integer.valueOf(vDisplayMetrics.heightPixels));
            this.f251940rt.f238151p0 = true;
            if ((backgroundView.isLaidOut() || !z) && !z2) {
                int measuredWidth = backgroundView.getMeasuredWidth();
                int measuredHeight = backgroundView.getMeasuredHeight();
                Log.m105925i("Luggage.AppBrandWindowLayoutManager", "tuningRtContentView[%s %s]: width [%d], height[%d]", str, this.f251940rt.f238147j, Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight));
                float f = (((float) measuredWidth) * 1.0f) / ((float) vDisplayMetrics.widthPixels);
                float f2 = (((float) measuredHeight) * 1.0f) / ((float) vDisplayMetrics.heightPixels);
                float min = Math.min(f, f2);
                Log.m105925i("Luggage.AppBrandWindowLayoutManager", "tuningRtContentView[%s %s]: scaleMin = [%f], scaleMax = [%f]", str, this.f251940rt.f238147j, Float.valueOf(min), Float.valueOf(Math.max(f, f2)));
                this.scale = min;
                WxaWindowLayoutParams wxaWindowLayoutParams = new WxaWindowLayoutParams(vDisplayMetrics.widthPixels, vDisplayMetrics.heightPixels);
                wxaWindowLayoutParams.gravity = 17;
                wxaWindowLayoutParams.f245452a = this.scale;
                if (!this.dryRun) {
                    this.f251940rt.mo113054f0().mo109904Lo(wxaWindowLayoutParams, this.f251940rt);
                    this.f251940rt.mo113054f0().mo109905TE(C111105a.m151500b(this.ctx, getBackgroundColor()), this.f251940rt);
                    this.f251940rt.f238153r.setBackgroundColor(C111105a.m151500b(this.ctx, getBackgroundColor()));
                    return;
                }
                return;
            }
            backgroundView.post(new C86805f(this));
        }
    }

    public static /* synthetic */ void tuningRtContentView$default(C86799a aVar, boolean z, boolean z2, String str, boolean z3, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                z3 = false;
            }
            aVar.tuningRtContentView(z, z2, str, z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tuningRtContentView");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C86799a(AppBrandRuntime appBrandRuntime, Context context, C79778e eVar, boolean z, int i, C8480h hVar) {
        this(appBrandRuntime, context, eVar, (i & 8) != 0 ? false : z);
    }
}
