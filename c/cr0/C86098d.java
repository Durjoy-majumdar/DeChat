package cr0;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.content.res.Configuration;
import android.os.Build;
import android.util.Rational;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import br0.C79778e;
import com.tencent.p014mm.plugin.appbrand.utils.C84785t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.atomic.AtomicBoolean;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: cr0.d */
public final class C86098d implements C86097c {

    /* renamed from: a */
    public final C86127t f250585a;

    /* renamed from: b */
    public final C13601g f250586b = C36568h.m40985a(new C86100b(this));

    /* renamed from: c */
    public final Activity f250587c;

    /* renamed from: cr0.d$a */
    public /* synthetic */ class C86099a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f250588a;

        static {
            int[] iArr = new int[C79778e.C79780b.values().length];
            iArr[0] = 1;
            f250588a = iArr;
        }
    }

    /* renamed from: cr0.d$b */
    public static final class C86100b extends C87413o implements C32224a<C86097c> {

        /* renamed from: d */
        public final /* synthetic */ C86098d f250589d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86100b(C86098d dVar) {
            super(0);
            this.f250589d = dVar;
        }

        public Object invoke() {
            Activity activity = this.f250589d.f250587c;
            return activity != null ? C86105f.m106605c(activity) : (C86097c) C84785t0.m104465a("Luggage.WXA.ActivityWindowOrientationHandlerProxyImpl.Dummy", C86097c.class);
        }
    }

    /* renamed from: cr0.d$c */
    public static final class C86101c implements C79778e.C79779a {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f250590a;

        /* renamed from: b */
        public final /* synthetic */ View f250591b;

        /* renamed from: c */
        public final /* synthetic */ C79778e.C79779a f250592c;

        /* renamed from: d */
        public final /* synthetic */ C86098d f250593d;

        /* renamed from: cr0.d$c$a */
        public static final class C86102a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C86104c f250594d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C86102a(C86104c cVar) {
                super(0);
                this.f250594d = cVar;
            }

            public Object invoke() {
                this.f250594d.mo120528a("globalLayout x2");
                return C13598b0.f38549a;
            }
        }

        /* renamed from: cr0.d$c$b */
        public static final class C86103b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C86104c f250595d;

            public C86103b(C86104c cVar) {
                this.f250595d = cVar;
            }

            public final void run() {
                this.f250595d.mo120528a("timeout");
            }
        }

        /* renamed from: cr0.d$c$c */
        public static final class C86104c implements C32226l<String, C13598b0> {

            /* renamed from: d */
            public final AtomicBoolean f250596d = new AtomicBoolean(true);

            /* renamed from: e */
            public final /* synthetic */ C79778e.C79780b f250597e;

            /* renamed from: f */
            public final /* synthetic */ boolean f250598f;

            /* renamed from: g */
            public final /* synthetic */ C79778e.C79779a f250599g;

            /* renamed from: h */
            public final /* synthetic */ C86098d f250600h;

            public C86104c(C79778e.C79780b bVar, boolean z, C79778e.C79779a aVar, C86098d dVar) {
                this.f250597e = bVar;
                this.f250598f = z;
                this.f250599g = aVar;
                this.f250600h = dVar;
            }

            /* renamed from: a */
            public void mo120528a(String str) {
                C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_REASON);
                if (this.f250596d.getAndSet(false)) {
                    Log.m105924i("Luggage.WXA.ActivityWindowOrientationHandlerProxyImpl", "requestDeviceOrientation, will invoke outer listener reason:[" + str + "], orientation:" + this.f250597e + " success:" + this.f250598f);
                    C79778e.C79779a aVar = this.f250599g;
                    if (aVar != null) {
                        aVar.mo109919g(this.f250597e, this.f250598f);
                    }
                    C86127t tVar = this.f250600h.f250585a;
                    C79778e.C79780b bVar = this.f250597e;
                    if (bVar != null) {
                        bVar.name();
                    }
                    tVar.getClass();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo120528a((String) obj);
                return C13598b0.f38549a;
            }
        }

        public C86101c(AtomicBoolean atomicBoolean, View view, C79778e.C79779a aVar, C86098d dVar) {
            this.f250590a = atomicBoolean;
            this.f250591b = view;
            this.f250592c = aVar;
            this.f250593d = dVar;
        }

        /* renamed from: g */
        public final void mo109919g(C79778e.C79780b bVar, boolean z) {
            Log.m105924i("Luggage.WXA.ActivityWindowOrientationHandlerProxyImpl", "requestDeviceOrientation, callback from AppBrandDeviceOrientationHandler, orientation:" + bVar + ", success:" + z);
            C86104c cVar = new C86104c(bVar, z, this.f250592c, this.f250593d);
            if (!z || this.f250590a.get()) {
                cVar.mo120528a("syncReturn");
                return;
            }
            View view = this.f250591b;
            C86102a aVar = new C86102a(cVar);
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C7126e(new C8478d0(), 2, view, aVar));
            this.f250591b.postDelayed(new C86103b(cVar), 100);
        }
    }

    public C86098d(C86127t tVar) {
        C87412m.m108594g(tVar, "windowActivity");
        this.f250585a = tVar;
        this.f250587c = tVar.mo120548w();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        r0 = r0.getDefaultDisplay();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public br0.C79778e.C79780b mo109917a() {
        /*
            r5 = this;
            android.app.Activity r0 = r5.f250587c
            if (r0 == 0) goto L_0x000d
            cr0.c r0 = r5.mo120526c()
            br0.e$b r0 = r0.mo109917a()
            return r0
        L_0x000d:
            cr0.t r0 = r5.f250585a
            android.content.Context r0 = r0.f250648d
            java.lang.Class<android.view.WindowManager> r1 = android.view.WindowManager.class
            java.lang.Object r0 = p385u2.C111105a.m151502d(r0, r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r1 = 0
            if (r0 == 0) goto L_0x002b
            android.view.Display r0 = r0.getDefaultDisplay()
            if (r0 == 0) goto L_0x002b
            int r0 = r0.getRotation()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            r2 = 1
            if (r0 != 0) goto L_0x0030
            goto L_0x0037
        L_0x0030:
            int r3 = r0.intValue()
            if (r3 != 0) goto L_0x0037
            goto L_0x0041
        L_0x0037:
            r3 = 2
            if (r0 != 0) goto L_0x003b
            goto L_0x0043
        L_0x003b:
            int r4 = r0.intValue()
            if (r4 != r3) goto L_0x0043
        L_0x0041:
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            br0.e$b r1 = br0.C79778e.C79780b.PORTRAIT
            goto L_0x0061
        L_0x0049:
            if (r0 != 0) goto L_0x004c
            goto L_0x0055
        L_0x004c:
            int r3 = r0.intValue()
            if (r3 != r2) goto L_0x0055
            br0.e$b r1 = br0.C79778e.C79780b.LANDSCAPE_LEFT
            goto L_0x0061
        L_0x0055:
            r2 = 3
            if (r0 != 0) goto L_0x0059
            goto L_0x0061
        L_0x0059:
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x0061
            br0.e$b r1 = br0.C79778e.C79780b.LANDSCAPE_RIGHT
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cr0.C86098d.mo109917a():br0.e$b");
    }

    /* renamed from: b */
    public void mo109918b(C79778e.C79780b bVar, C79778e.C79779a aVar) {
        Activity activity = this.f250587c;
        if (activity == null) {
            if (aVar != null) {
                aVar.mo109919g(mo109917a(), false);
            }
        } else if (activity.isFinishing() || this.f250587c.isDestroyed()) {
            Log.m105920e("Luggage.WXA.ActivityWindowOrientationHandlerProxyImpl", "requestDeviceOrientation but activity(" + this.f250587c + ") destroyed");
            if (aVar != null) {
                aVar.mo109919g(mo120526c().mo109917a(), false);
            }
        } else if (Build.VERSION.SDK_INT < 26 || !this.f250587c.isInPictureInPictureMode()) {
            Window window = this.f250587c.getWindow();
            View decorView = window != null ? window.getDecorView() : null;
            if (decorView != null) {
                ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    C86127t tVar = this.f250585a;
                    if (bVar != null) {
                        bVar.name();
                    }
                    tVar.getClass();
                    mo120526c().mo109918b(bVar, new C86101c(atomicBoolean, decorView, aVar, this));
                    atomicBoolean.set(false);
                    return;
                }
            }
            mo120526c().mo109918b(bVar, aVar);
        } else {
            C86127t tVar2 = this.f250585a;
            if (bVar != null) {
                bVar.name();
            }
            tVar2.getClass();
            int i = bVar == null ? -1 : C86099a.f250588a[bVar.ordinal()];
            if (i != -1) {
                if (i != 1) {
                    this.f250587c.enterPictureInPictureMode(new PictureInPictureParams.Builder().setAspectRatio(new Rational(16, 9)).build());
                    if (aVar != null) {
                        aVar.mo109919g(bVar, true);
                        C13598b0 b0Var = C13598b0.f38549a;
                        return;
                    }
                    return;
                }
                this.f250587c.enterPictureInPictureMode(new PictureInPictureParams.Builder().setAspectRatio(new Rational(9, 16)).build());
                if (aVar != null) {
                    aVar.mo109919g(bVar, true);
                    C13598b0 b0Var2 = C13598b0.f38549a;
                }
            } else if (aVar != null) {
                aVar.mo109919g(mo120526c().mo109917a(), false);
                C13598b0 b0Var3 = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: c */
    public final C86097c mo120526c() {
        Object value = ((C36570n) this.f250586b).getValue();
        C87412m.m108593f(value, "<get-handler>(...)");
        return (C86097c) value;
    }

    public void onConfigurationChanged(Configuration configuration) {
        mo120526c().onConfigurationChanged(configuration);
    }

    public void onPause() {
        mo120526c().onPause();
    }

    public void onResume() {
        mo120526c().onResume();
    }

    public void release() {
        Activity activity = this.f250587c;
        if (activity == null || activity.isDestroyed() || this.f250587c.isFinishing()) {
            mo120526c().release();
        }
        if (C87412m.m108589b(this.f250585a.f250650f, this)) {
            this.f250585a.f250650f = null;
        }
    }
}
