package p194lc;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowInsets;
import br0.C79774c;
import com.tencent.luggage.skyline.SkylineView;
import com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81826e;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40481j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import com.tencent.skyline.SkylineConfig;
import com.tencent.skyline.SkylineLogic;
import com.tencent.skyline.SkylineRuntime;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import f14.C58901s;
import fy3.C32226l;
import gy3.C24564k0;
import gy3.C87412m;
import gy3.C87413o;
import in3.C87771d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import p1007mc.C88726b;
import p1044ub.C90630c;
import p172io.flutter.embedding.android.FlutterView;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.PluginRegistry;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;
import p172io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import p172io.flutter.plugin.platform.ISkylineTextureHandler;
import p172io.flutter.plugin.platform.SkylineTextureLogic;
import p176jc.C108699q;
import p176jc.C117309c;
import p176jc.C117310g;
import p176jc.C117319i;
import p176jc.C117320k;
import p176jc.C117332o;
import p176jc.C117333p;
import p176jc.C87916a0;
import p176jc.C87919d;
import p176jc.C87920d0;
import p176jc.C87928g0;
import p176jc.C87929h;
import p176jc.C87931h0;
import p176jc.C87933j;
import p176jc.C87934j0;
import p176jc.C87937r;
import p176jc.C87939v;
import p224ra.C89909e;
import p817kd.C46689b;
import p817kd.C88140c;
import p817kd.C88141d;
import p830xc.C53319b;
import p980id.C87697c;
import p993kc.C108996e;
import p993kc.C88135b;
import rq0.C90087f;
import rx3.C13598b0;
import sx3.C110818d0;
import wx3.C15601d;

/* renamed from: lc.y */
public final class C88470y extends C46845l implements C53319b, C90087f {

    /* renamed from: i */
    public static C88140c f255549i;

    /* renamed from: d */
    public final C88453o<C90630c> f255550d;

    /* renamed from: e */
    public final MutableContextWrapper f255551e;

    /* renamed from: f */
    public final C88454p f255552f;

    /* renamed from: g */
    public final C108699q.C87935a f255553g;

    /* renamed from: h */
    public SkylineView f255554h;

    /* renamed from: lc.y$a */
    public static final class C88471a implements ISkylineTextureHandler {
        public void onTextureDestroy(int i, String str, int i2) {
            Log.m105926v("SkylineViewRenderEngine", "onPluginDestroy engineId:" + i + " type:" + str + " id:" + i2);
            C88140c cVar = C88470y.f255549i;
            if (cVar != null) {
                cVar.onPluginDestroy(str, i2);
            }
        }

        public void onTextureReady(int i, String str, int i2, SurfaceTexture surfaceTexture, int i3, int i4) {
            Log.m105924i("SkylineViewRenderEngine", "onTextureReady engineId:" + i + " type:" + str + " id:" + i2 + " surfaceTexture:" + surfaceTexture);
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(i3, i4);
            }
            if (surfaceTexture != null) {
                try {
                    new C88469x(surfaceTexture).mo122880a();
                } catch (Exception e) {
                    Log.m105920e("SkylineViewRenderEngine", "SkylineTextureCleanLogic clean fail! ex:" + e.getMessage());
                }
            }
            C88140c cVar = C88470y.f255549i;
            if (cVar != null) {
                cVar.onPluginReady(str, i2, surfaceTexture);
            }
        }

        public void onTextureTouch(int i, String str, int i2, MotionEvent motionEvent) {
            C87412m.m108594g(motionEvent, "motionEvent");
            Log.m105926v("SkylineViewRenderEngine", "onTextureTouch engineId:" + i + " type:" + str + " id:" + i2 + " motionEvent:" + motionEvent);
            C88140c cVar = C88470y.f255549i;
            if (cVar != null) {
                cVar.onPluginTouch(str, i2, motionEvent);
            }
        }

        public void onTextureUpdate(int i, String str, int i2, int i3, int i4) {
            Log.m105926v("SkylineViewRenderEngine", "onTextureUpdate engineId:" + i + " type:" + str + " id:" + i2 + " width:" + i3 + ", height:" + i4);
        }
    }

    /* renamed from: lc.y$b */
    public static final class C88472b implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C88470y f255555d;

        /* renamed from: lc.y$b$a */
        public static final class C88473a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C88470y f255556d;

            public C88473a(C88470y yVar) {
                this.f255556d = yVar;
            }

            public final void run() {
                Activity A0;
                C90630c cVar = (C90630c) this.f255556d.f255550d.mo124764Z();
                if (cVar != null && (A0 = cVar.mo116146A0()) != null) {
                    C87771d.m109203b(A0).mo122181e();
                }
            }
        }

        public C88472b(C88470y yVar) {
            this.f255555d = yVar;
        }

        public void onViewAttachedToWindow(View view) {
            C87412m.m108594g(view, "v");
            view.post(new C88473a(this.f255555d));
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: lc.y$c */
    public static final class C88474c implements View.OnApplyWindowInsetsListener {

        /* renamed from: d */
        public final /* synthetic */ C32226l<String, C13598b0> f255557d;

        public C88474c(C32226l<? super String, C13598b0> lVar) {
            this.f255557d = lVar;
        }

        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            this.f255557d.invoke("onApplyWindowInsets");
            return windowInsets;
        }
    }

    /* renamed from: lc.y$d */
    public static final class C88475d implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C32226l<String, C13598b0> f255558d;

        public C88475d(C32226l<? super String, C13598b0> lVar) {
            this.f255558d = lVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f255558d.invoke("onSizeChanged");
        }
    }

    /* renamed from: lc.y$e */
    public static final class C88476e extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88454p f255559d;

        /* renamed from: e */
        public final /* synthetic */ C88470y f255560e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88476e(C88454p pVar, C88470y yVar) {
            super(1);
            this.f255559d = pVar;
            this.f255560e = yVar;
        }

        public Object invoke(Object obj) {
            SkylineView skylineView;
            FlutterRenderer obtainRenderer;
            String str = (String) obj;
            C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_REASON);
            if (!((!this.f255559d.f255526h.isEmpty()) || (skylineView = this.f255560e.f255554h) == null || (obtainRenderer = SkylineLogic.INSTANCE.obtainRenderer(skylineView.f235004d)) == null)) {
                SkylineView skylineView2 = this.f255560e.f255554h;
                C87412m.m108591d(skylineView2);
                Log.m105925i("SkylineViewRenderEngine", '[' + str + "]sendViewportMetricsToFlutter, windowId:%d, width:%s, height:%s", Integer.valueOf(skylineView2.f235004d), Integer.valueOf(this.f255559d.getWidth()), Integer.valueOf(this.f255559d.getHeight()));
                C109333n flutterViewportMetricsCompat$luggage_skyline_ext_release = this.f255559d.getFlutterViewportMetricsCompat$luggage_skyline_ext_release();
                flutterViewportMetricsCompat$luggage_skyline_ext_release.f327307a.width = flutterViewportMetricsCompat$luggage_skyline_ext_release.f327308b.getWidth();
                flutterViewportMetricsCompat$luggage_skyline_ext_release.f327307a.height = flutterViewportMetricsCompat$luggage_skyline_ext_release.f327308b.getHeight();
                flutterViewportMetricsCompat$luggage_skyline_ext_release.f327307a.devicePixelRatio = flutterViewportMetricsCompat$luggage_skyline_ext_release.f327308b.getResources().getDisplayMetrics().density;
                flutterViewportMetricsCompat$luggage_skyline_ext_release.f327307a.physicalTouchSlop = ViewConfiguration.get(flutterViewportMetricsCompat$luggage_skyline_ext_release.f327308b.getContext()).getScaledTouchSlop();
                obtainRenderer.setViewportMetrics(flutterViewportMetricsCompat$luggage_skyline_ext_release.f327307a);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: lc.y$f */
    public static final class C88477f extends C88135b {

        /* renamed from: a */
        public final /* synthetic */ C88470y f255561a;

        public C88477f(C88470y yVar) {
            this.f255561a = yVar;
        }

        /* renamed from: b */
        public Context mo122407b() {
            C90630c cVar = (C90630c) this.f255561a.f255550d.mo124764Z();
            if (cVar != null) {
                return cVar.mo116146A0();
            }
            return null;
        }
    }

    /* renamed from: lc.y$g */
    public static final class C88478g implements Choreographer.FrameCallback {

        /* renamed from: d */
        public final /* synthetic */ Runnable f255562d;

        public C88478g(Runnable runnable) {
            this.f255562d = runnable;
        }

        public final void doFrame(long j) {
            this.f255562d.run();
        }
    }

    /* renamed from: lc.y$h */
    public static final class C88479h implements FlutterUiDisplayListener {

        /* renamed from: a */
        public final /* synthetic */ FlutterRenderer f255563a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f255564b;

        public C88479h(FlutterRenderer flutterRenderer, Runnable runnable) {
            this.f255563a = flutterRenderer;
            this.f255564b = runnable;
        }

        public void onFlutterUiDisplayed() {
            this.f255563a.removeIsDisplayingFlutterUiListener(this);
            this.f255564b.run();
        }

        public void onFlutterUiNoLongerDisplayed() {
        }
    }

    static {
        C88141d dVar = (C88141d) C89909e.m112436a(C88141d.class);
        if (dVar == null) {
            dVar = C46689b.getInstance();
        }
        C88140c createClientProxy = dVar.createClientProxy();
        f255549i = createClientProxy;
        C87412m.m108591d(createClientProxy);
        C87697c cVar = (C87697c) C89909e.m112436a(C87697c.class);
        if (cVar == null) {
            if (C81826e.f240086d == null) {
                C81826e.f240086d = new C81826e();
            }
            cVar = C81826e.f240086d;
        }
        createClientProxy.mo122545d(cVar);
        SkylineTextureLogic.INSTANCE.initSkylineTextureHandler(new C88471a());
    }

    public C88470y(C88453o<C90630c> oVar, Context context) {
        C87412m.m108594g(oVar, "skylineRenderer");
        C87412m.m108594g(context, "context");
        this.f255550d = oVar;
        MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(context);
        this.f255551e = mutableContextWrapper;
        int i = C88454p.f255521p;
        C88454p qVar = Build.VERSION.SDK_INT >= 29 ? new C88460q(mutableContextWrapper) : new C88454p(mutableContextWrapper);
        C88476e eVar = new C88476e(qVar, this);
        qVar.addOnAttachStateChangeListener(new C88472b(this));
        qVar.setNoInterceptOnApplyWindowInsetsListener(new C88474c(eVar));
        qVar.addOnLayoutChangeListener(new C88475d(eVar));
        this.f255552f = qVar;
        C108699q.C87935a aVar = new C108699q.C87935a();
        aVar.f254495b = new C88477f(this);
        this.f255553g = aVar;
        this.f255554h = new SkylineView();
    }

    /* renamed from: D0 */
    public void mo116615D0() {
        C79774c cVar;
        mo122881l((AppServiceSkylineExtensionImpl) null);
        C108699q qVar = C108699q.f325532a;
        C108699q.C87935a aVar = this.f255553g;
        C87412m.m108594g(aVar, "handler");
        if (C108699q.f325533b == null) {
            C108996e eVar = new C108996e();
            eVar.f326465c = new C87937r();
            if (Build.VERSION.SDK_INT < 30) {
                eVar.f326479q = C75044y4.m89992d(MMApplicationContext.getContext());
            }
            C108699q.f325533b = eVar;
        }
        ((ArrayList) C108699q.f325539h).add(aVar);
        C90630c cVar2 = (C90630c) this.f255550d.mo124764Z();
        if (cVar2 != null && (cVar = cVar2.f244577X) != null) {
            mo122882u(cVar);
        }
    }

    /* renamed from: V0 */
    public void mo63305V0() {
        SkylineView skylineView = this.f255554h;
        if (skylineView != null) {
            skylineView.mo63305V0();
        }
    }

    /* renamed from: b */
    public void mo63307b() {
        SkylineView skylineView = this.f255554h;
        if (skylineView != null && skylineView.f235010j) {
            skylineView.f235010j = false;
            Log.m105924i("SkylineView", "id:" + skylineView.f235004d + " pause");
            C108699q qVar = C108699q.f325532a;
            C24564k0.m30737a(C108699q.f325538g).remove(skylineView.f235016s);
            C87929h hVar = skylineView.f235007g;
            if (hVar != null) {
                C87929h.C87930a.m109438a(hVar, false, 1, (Object) null);
                skylineView.mo111447u(new C87916a0(skylineView));
            } else {
                C87412m.m108603p("mFlutterViewWrapper");
                throw null;
            }
        }
        this.f255553g.f254494a = false;
    }

    /* renamed from: c */
    public void mo63308c() {
        SkylineView skylineView = this.f255554h;
        if (skylineView != null) {
            skylineView.resume();
        }
        C88454p pVar = this.f255552f;
        if (pVar.f255525g) {
            pVar.f255527i.removeCallbacks(pVar.f255530o);
            if (pVar.getForeground() != null) {
                pVar.f255527i.postDelayed(pVar.f255528j, ValueAnimator.getFrameDelay() * ((long) 5));
                FlutterView flutterView = (FlutterView) C110818d0.m150915M(pVar.f255526h);
                if (flutterView != null) {
                    flutterView.addOnFirstFrameRenderedListener(pVar.f255529n);
                }
            }
        }
        this.f255553g.f254494a = true;
    }

    public void destroy() {
        SkylineView skylineView = this.f255554h;
        if (skylineView != null) {
            skylineView.mo111444i();
        }
        SkylineView skylineView2 = this.f255554h;
        if (skylineView2 != null && !skylineView2.f235011n.getAndSet(true)) {
            Log.m105924i("SkylineView", "id:" + skylineView2.f235004d + " release");
            skylineView2.f235009i.clear();
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            skylineView2.mo111443f(context);
            C108699q qVar = C108699q.f325532a;
            C24564k0.m30737a(C108699q.f325538g).remove(skylineView2.f235016s);
            C0000n0 b = C53930o0.m60555b();
            C53896h0 h0Var = C53872d1.f151117a;
            C53895h.m60466d(b, C58901s.f168555a, (C53934p0) null, new C87931h0(skylineView2, (C15601d<? super C87931h0>) null), 2, (Object) null);
        }
        C108699q qVar2 = C108699q.f325532a;
        C108699q.C87935a aVar = this.f255553g;
        C87412m.m108594g(aVar, "handler");
        ((ArrayList) C108699q.f325539h).remove(aVar);
    }

    /* renamed from: e0 */
    public void mo63310e0(int i, int i2) {
        SkylineView skylineView = this.f255554h;
        if (skylineView != null) {
            Resources resources = this.f255551e.getResources();
            C87412m.m108593f(resources, "context.resources");
            float f = resources.getDisplayMetrics().density;
            float f2 = ((float) i) / f;
            float f3 = ((float) i2) / f;
            Log.m105924i("SkylineView", "updateViewport, call view size[" + f2 + " x " + f3 + ']');
            skylineView.mo111447u(new C87934j0(f2, f3, skylineView));
        }
    }

    /* renamed from: e1 */
    public void mo63311e1(Runnable runnable) {
        SkylineView skylineView;
        if (runnable != null && (skylineView = this.f255554h) != null) {
            FlutterRenderer obtainRenderer = SkylineLogic.INSTANCE.obtainRenderer(skylineView.f235004d);
            if (obtainRenderer == null) {
                runnable.run();
            } else if (obtainRenderer.isDisplayingFlutterUi()) {
                Choreographer.getInstance().postFrameCallback(new C88478g(runnable));
            } else {
                obtainRenderer.addIsDisplayingFlutterUiListener(new C88479h(obtainRenderer, runnable));
            }
        }
    }

    /* renamed from: f */
    public void mo63312f(Context context) {
        if (context != null) {
            this.f255551e.setBaseContext(context);
            SkylineView skylineView = this.f255554h;
            if (skylineView != null) {
                skylineView.mo111443f(context);
            }
        }
    }

    /* renamed from: f0 */
    public void mo63313f0() {
        SkylineView skylineView = this.f255554h;
        if (skylineView != null) {
            skylineView.mo63313f0();
        }
    }

    public int getContentHeight() {
        return getHeight();
    }

    public View getContentView() {
        return this.f255552f;
    }

    public int getHeight() {
        SkylineView skylineView = this.f255554h;
        if (skylineView == null) {
            return 0;
        }
        ViewGroup viewGroup = skylineView.f235006f;
        if (viewGroup != null) {
            return viewGroup.getMeasuredHeight();
        }
        C87412m.m108603p("mContentView");
        throw null;
    }

    public int getWebScrollX() {
        return 0;
    }

    public int getWebScrollY() {
        return 0;
    }

    public C88140c getWebViewPluginClientProxy() {
        C88140c cVar = f255549i;
        C87412m.m108591d(cVar);
        return cVar;
    }

    public int getWidth() {
        SkylineView skylineView = this.f255554h;
        if (skylineView == null) {
            return 0;
        }
        ViewGroup viewGroup = skylineView.f235006f;
        if (viewGroup != null) {
            return viewGroup.getMeasuredWidth();
        }
        C87412m.m108603p("mContentView");
        throw null;
    }

    public View getWrapperView() {
        return this.f255552f;
    }

    /* renamed from: l */
    public final void mo122881l(AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl) {
        AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl2;
        boolean z;
        AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl3;
        SkylineView skylineView;
        boolean z2;
        boolean z3;
        C88454p pVar;
        SkylineView skylineView2;
        PluginRegistry plugins;
        if (appServiceSkylineExtensionImpl == null) {
            C82381f Z = this.f255550d.mo124764Z();
            C87412m.m108591d(Z);
            Object G0 = ((C90630c) Z).mo116160O0().mo125517G0(AppServiceSkylineExtensionImpl.class);
            C87412m.m108591d(G0);
            appServiceSkylineExtensionImpl2 = (AppServiceSkylineExtensionImpl) G0;
        } else {
            appServiceSkylineExtensionImpl2 = appServiceSkylineExtensionImpl;
        }
        SkylineView skylineView3 = this.f255554h;
        C87412m.m108591d(skylineView3);
        C82381f Z2 = this.f255550d.mo124764Z();
        C87412m.m108591d(Z2);
        int componentId = ((C90630c) Z2).getComponentId();
        MutableContextWrapper mutableContextWrapper = this.f255551e;
        SkylineRuntime skylineRuntime = appServiceSkylineExtensionImpl2.f235027d;
        C87412m.m108591d(skylineRuntime);
        C88454p pVar2 = this.f255552f;
        C87412m.m108594g(mutableContextWrapper, "context");
        C87412m.m108594g(pVar2, "contentView");
        C87919d.f254457a.getClass();
        MultiProcessMMKV multiProcessMMKV = C87919d.f254459c;
        boolean z4 = multiProcessMMKV.getInt("renderBackend", 0) == 1;
        boolean z5 = multiProcessMMKV.getBoolean("SwapSurface", true);
        Log.m105924i("SkylineView", "init~~id:" + componentId + " isTextureView:" + z4 + ", isEnabledWxSwapSurface:" + z5 + ", hasInitialized:" + skylineView3.f235014q + ", context:" + mutableContextWrapper);
        if (!skylineView3.f235014q || skylineView3.f235004d != componentId) {
            skylineView3.f235015r = mutableContextWrapper;
            skylineView3.f235004d = componentId;
            skylineView3.f235005e = skylineRuntime;
            skylineView3.f235006f = pVar2;
            DisplayMetrics displayMetrics = mutableContextWrapper.getResources().getDisplayMetrics();
            C117309c cVar = C117309c.f351190a;
            if (!(!C117309c.f351191b.isEmpty()) && !C117309c.f351192c.getAndSet(true)) {
                C117309c.f351193d = z4;
                for (int i = 1; i < 3; i++) {
                    LinkedList<C117310g> linkedList = C117309c.f351191b;
                    boolean z6 = z4 || z5;
                    Context context = MMApplicationContext.getContext();
                    C87412m.m108593f(context, "getContext()");
                    linkedList.add(cVar.mo181976a(context, z6));
                }
            }
            C87939v vVar = C87939v.f254498a;
            SkylineRuntime skylineRuntime2 = skylineView3.f235005e;
            if (skylineRuntime2 != null) {
                long runtimePtr = skylineRuntime2.getRuntimePtr();
                SkylineRuntime skylineRuntime3 = skylineView3.f235005e;
                if (skylineRuntime3 != null) {
                    boolean needCreateRuntime = skylineRuntime3.needCreateRuntime();
                    int i2 = displayMetrics.widthPixels;
                    int i3 = displayMetrics.heightPixels;
                    C87928g0 g0Var = new C87928g0(skylineView3);
                    synchronized (vVar) {
                        C87939v.C87940a aVar = C87939v.f254499b.get(Long.valueOf(runtimePtr));
                        if (aVar == null) {
                            aVar = new C87939v.C87940a(runtimePtr);
                            appServiceSkylineExtensionImpl3 = appServiceSkylineExtensionImpl2;
                            C87939v.f254499b.put(Long.valueOf(runtimePtr), aVar);
                        } else {
                            appServiceSkylineExtensionImpl3 = appServiceSkylineExtensionImpl2;
                        }
                        skylineView = skylineView3;
                        C87939v.f254500c.put(Integer.valueOf(componentId), Long.valueOf(runtimePtr));
                        if (aVar.f254505d) {
                            C87939v.C87941b bVar = aVar.f254503b;
                            bVar.getClass();
                            pVar = pVar2;
                            bVar.f254508a = System.currentTimeMillis();
                            z3 = z4;
                            z2 = z5;
                        } else {
                            pVar = pVar2;
                            boolean z7 = z5;
                            HashMap<Integer, C87939v.C87941b> hashMap = aVar.f254504c;
                            Integer valueOf = Integer.valueOf(componentId);
                            C87939v.C87941b bVar2 = new C87939v.C87941b();
                            z3 = z4;
                            z2 = z7;
                            bVar2.f254508a = System.currentTimeMillis();
                            hashMap.put(valueOf, bVar2);
                        }
                        SkylineConfig skylineConfig = new SkylineConfig();
                        skylineConfig.setId(componentId);
                        skylineConfig.setRuntimePtr(runtimePtr);
                        skylineConfig.setCreateRuntime(needCreateRuntime);
                        skylineConfig.setPreloadTaskRunner(false);
                        double d = (double) mutableContextWrapper.getResources().getDisplayMetrics().density;
                        skylineConfig.setWindowWidth(((double) i2) / d);
                        skylineConfig.setWindowHeight(((double) i3) / d);
                        skylineConfig.setLibraryURI("package:flutter_app_module/main.dart");
                        SkylineLogic skylineLogic = SkylineLogic.INSTANCE;
                        boolean createFlutterEngine = skylineLogic.createFlutterEngine(mutableContextWrapper, skylineConfig);
                        Log.m105924i("SkylineManager", "waitFlutterReady id:" + componentId + " isOk:" + createFlutterEngine);
                        if (createFlutterEngine) {
                            FlutterEngine flutterEngine = skylineLogic.getFlutterEngine(componentId);
                            if (!(flutterEngine == null || (plugins = flutterEngine.getPlugins()) == null)) {
                                plugins.add((FlutterPlugin) new C88726b());
                            }
                            if (aVar.f254505d) {
                                aVar.f254506e = componentId;
                                aVar.f254505d = false;
                            }
                            aVar.f254507f.add(Integer.valueOf(componentId));
                            C87939v.f254501d.put(Integer.valueOf(componentId), g0Var);
                        }
                    }
                    int ordinal = (z3 ? C87933j.TextureViewAlways : z2 ? C87933j.WxSwapSurface : C87933j.Legacy).ordinal();
                    if (ordinal == 0) {
                        skylineView2 = skylineView;
                        z = true;
                        pVar.setEnabledSnapshotCover(true);
                        C117319i iVar = new C117319i(C117309c.f351190a.mo181977b(mutableContextWrapper, false), skylineView2.f235004d, pVar);
                        iVar.mo122401g();
                        skylineView2.f235007g = iVar;
                    } else if (ordinal != 1) {
                        if (ordinal != 2) {
                            C117310g b = C117309c.f351190a.mo181977b(mutableContextWrapper, true);
                            pVar.addView(b, new ViewGroup.LayoutParams(-1, -1));
                            skylineView2 = skylineView;
                            skylineView2.f235007g = new C117332o(b, skylineView2.f235004d);
                        } else {
                            skylineView2 = skylineView;
                            C117309c cVar2 = C117309c.f351190a;
                            C117310g b2 = cVar2.mo181977b(mutableContextWrapper, false);
                            b2.setVisibility(4);
                            pVar.addView(b2, new ViewGroup.LayoutParams(-1, -1));
                            C117310g b3 = cVar2.mo181977b(mutableContextWrapper, true);
                            b3.setVisibility(4);
                            pVar.addView(b3, new ViewGroup.LayoutParams(-1, -1));
                            C13598b0 b0Var = C13598b0.f38549a;
                            skylineView2.f235007g = new C117333p(b2, b3, skylineView2.f235004d);
                        }
                        z = true;
                    } else {
                        skylineView2 = skylineView;
                        z = true;
                        C117310g b4 = C117309c.f351190a.mo181977b(mutableContextWrapper, true);
                        pVar.addView(b4, new ViewGroup.LayoutParams(-1, -1));
                        C117320k kVar = new C117320k(b4, skylineView2.f235004d);
                        kVar.mo122401g();
                        skylineView2.f235007g = kVar;
                    }
                    skylineView2.f235014q = z;
                    appServiceSkylineExtensionImpl2 = appServiceSkylineExtensionImpl3;
                } else {
                    C87412m.m108603p("mSkylineRuntime");
                    throw null;
                }
            } else {
                C87412m.m108603p("mSkylineRuntime");
                throw null;
            }
        } else {
            Log.m105928w("SkylineView", "duplicated init call, id:" + componentId + ", stack:" + android.util.Log.getStackTraceString(new Throwable()));
            z = true;
        }
        appServiceSkylineExtensionImpl2.f235026c = z;
    }

    /* renamed from: n0 */
    public <T extends C40481j> T mo63321n0(Class<T> cls) {
        C87412m.m108591d(cls);
        if (cls.isInstance(this)) {
            return (C40481j) cls.cast(this);
        }
        return null;
    }

    public void setBackgroundColor(int i) {
        SkylineView skylineView = this.f255554h;
        if (skylineView != null) {
            C87929h hVar = skylineView.f235007g;
            if (hVar != null) {
                hVar.setBackgroundColor(i);
            } else {
                C87412m.m108603p("mFlutterViewWrapper");
                throw null;
            }
        }
    }

    /* renamed from: u */
    public final void mo122882u(C79774c cVar) {
        C87412m.m108594g(cVar, "windowAndroid");
        Log.m105924i("SkylineViewRenderEngine", "updateWindowAndroid windowAndroid:" + cVar + " context:" + cVar.getContext());
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(cVar.getContext());
        if (castActivityOrNull != null) {
            SkylineView skylineView = this.f255554h;
            if (skylineView != null) {
                skylineView.mo111447u(new C87920d0(skylineView, castActivityOrNull));
                return;
            }
            return;
        }
        SkylineView skylineView2 = this.f255554h;
        if (skylineView2 != null) {
            skylineView2.mo111444i();
        }
    }
}
