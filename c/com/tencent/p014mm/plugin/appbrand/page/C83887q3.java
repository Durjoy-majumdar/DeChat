package com.tencent.p014mm.plugin.appbrand.page;

import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import br0.C79773b;
import br0.C79778e;
import bt0.C79808b;
import com.tencent.p014mm.plugin.appbrand.utils.C84752i2;
import com.tencent.p014mm.plugin.appbrand.utils.C84777q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.vendor.HuaweiKt;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p1031sb.C90154a;
import p225rc.C89923l;
import p747xb.C91159m;
import rq0.C90084c;
import rq0.C90086e;
import u24.C90595a;

/* renamed from: com.tencent.mm.plugin.appbrand.page.q3 */
public final class C83887q3 implements C90086e, C90084c {

    /* renamed from: a */
    public final C83780d1 f244929a;

    /* renamed from: b */
    public final C91159m f244930b;

    /* renamed from: c */
    public volatile String f244931c;

    /* renamed from: d */
    public boolean f244932d = false;

    /* renamed from: e */
    public boolean f244933e = false;

    /* renamed from: f */
    public boolean f244934f = false;

    /* renamed from: g */
    public boolean f244935g = false;

    /* renamed from: h */
    public Configuration f244936h;

    /* renamed from: i */
    public C83894f f244937i;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.q3$a */
    public class C83888a implements View.OnLayoutChangeListener {

        /* renamed from: com.tencent.mm.plugin.appbrand.page.q3$a$a */
        public class C83889a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View.OnLayoutChangeListener f244939d;

            public C83889a(View.OnLayoutChangeListener onLayoutChangeListener) {
                this.f244939d = onLayoutChangeListener;
            }

            public void run() {
                C83887q3.this.f244929a.f244555G.removeOnLayoutChangeListener(this.f244939d);
            }
        }

        public C83888a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (!TextUtils.isEmpty(C83887q3.this.f244929a.mo116162Q0())) {
                C83887q3 q3Var = C83887q3.this;
                if (q3Var.f244933e) {
                    try {
                        q3Var.f244929a.f244555G.removeOnLayoutChangeListener(this);
                    } catch (ConcurrentModificationException unused) {
                        C83887q3.this.f244929a.mo116274i0(new C83889a(this));
                    }
                } else {
                    Log.m105925i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "pageArea onLayoutChange appId[%s], url[%s], frozen[%b]", q3Var.f244929a.getAppId(), C83887q3.this.f244929a.mo116162Q0(), Boolean.valueOf(C83887q3.this.f244934f));
                    C83887q3 q3Var2 = C83887q3.this;
                    if (q3Var2.f244934f) {
                        q3Var2.f244935g = true;
                    } else {
                        q3Var2.mo116464g();
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.q3$b */
    public class C83890b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f244941d;

        /* renamed from: e */
        public final /* synthetic */ Map f244942e;

        public C83890b(String str, Map map) {
            this.f244941d = str;
            this.f244942e = map;
        }

        public void run() {
            C83887q3.this.mo116470n(this.f244941d, this.f244942e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.q3$c */
    public class C83891c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C79778e.C79779a f244944d;

        public C83891c(C79778e.C79779a aVar) {
            this.f244944d = aVar;
        }

        public void run() {
            C83887q3.this.mo116463f(this.f244944d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.q3$d */
    public class C83892d implements C79778e.C79779a {

        /* renamed from: a */
        public final AtomicBoolean f244946a = new AtomicBoolean(false);

        /* renamed from: b */
        public final /* synthetic */ C79778e.C79779a f244947b;

        public C83892d(C79778e.C79779a aVar) {
            this.f244947b = aVar;
        }

        /* renamed from: g */
        public void mo109919g(C79778e.C79780b bVar, boolean z) {
            boolean andSet = this.f244946a.getAndSet(true);
            Log.m105925i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "resetPageOrientation, onOrientationChanged, appId[%s] url[%s] orientation[%s] success[%b], hasFiredCallback[%b]", C83887q3.this.mo116465i(), C83887q3.this.mo116467k(), bVar, Boolean.valueOf(z), Boolean.valueOf(andSet));
            if (!andSet) {
                C79778e.C79779a aVar = this.f244947b;
                if (aVar != null) {
                    aVar.mo109919g(bVar, z);
                }
                C83887q3.this.mo116469m(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.q3$e */
    public class C83893e extends C79773b {
        public C83893e() {
        }

        /* renamed from: f */
        public void mo109901f() {
            C83887q3.this.f244929a.mo116151F0().mo62478f(this);
            C83887q3 q3Var = C83887q3.this;
            if (!q3Var.f244933e && q3Var.f244932d) {
                q3Var.mo116463f((C79778e.C79779a) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.q3$f */
    public class C83894f {

        /* renamed from: a */
        public Runnable f244950a = new C83895a();

        /* renamed from: b */
        public ViewTreeObserver.OnGlobalLayoutListener f244951b;

        /* renamed from: com.tencent.mm.plugin.appbrand.page.q3$f$a */
        public class C83895a implements Runnable {
            public C83895a() {
            }

            public void run() {
                C83887q3.this.mo116469m(false);
            }
        }

        public C83894f(C83888a aVar) {
        }

        /* renamed from: a */
        public final void mo116476a() {
            ViewGroup viewGroup = C83887q3.this.f244929a.f244552D;
            if (viewGroup != null) {
                viewGroup.removeCallbacks(this.f244950a);
                if (this.f244951b != null) {
                    viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this.f244951b);
                }
            }
        }
    }

    public C83887q3(C83780d1 d1Var) {
        this.f244929a = d1Var;
        this.f244930b = new C91159m(d1Var);
        d1Var.f244555G.addOnLayoutChangeListener(new C83888a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0126, code lost:
        if (r0.mo109920a(r5) == false) goto L_0x0141;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo116460a() {
        /*
            r14 = this;
            com.tencent.mm.plugin.appbrand.page.d1 r0 = r14.f244929a
            br0.c r0 = r0.f244577X
            if (r0 != 0) goto L_0x0008
            r0 = 0
            goto L_0x000c
        L_0x0008:
            br0.e r0 = r0.getOrientationHandler()
        L_0x000c:
            r1 = 2
            java.lang.String r2 = "Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0129
            boolean r5 = r0 instanceof er0.C86645a
            if (r5 == 0) goto L_0x0019
            goto L_0x0129
        L_0x0019:
            br0.e$b r0 = r0.mo109917a()
            java.lang.String r5 = r14.f244931c
            br0.e$b r5 = br0.C79778e.C79780b.m96933b(r5)
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = r14.mo116465i()
            r6[r4] = r7
            java.lang.String r7 = r14.mo116467k()
            r6[r3] = r7
            r6[r1] = r0
            r7 = 3
            r6[r7] = r5
            java.lang.String r8 = "willResizeByOrientation appId[%s], url[%s] current[%s], desire[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r6)
            br0.e$b r6 = br0.C79778e.C79780b.UNSPECIFIED
            if (r6 != r5) goto L_0x0043
            goto L_0x0140
        L_0x0043:
            com.tencent.mm.plugin.appbrand.page.d1 r6 = r14.f244929a
            br0.c r8 = r6.f244577X
            boolean r8 = r8 instanceof cr0.C86127t
            if (r8 == 0) goto L_0x0086
            android.content.Context r6 = r6.getContext()
            boolean r6 = com.tencent.p014mm.plugin.appbrand.utils.C84777q1.m104442b(r6)
            if (r6 != 0) goto L_0x0056
            goto L_0x0063
        L_0x0056:
            com.tencent.mm.plugin.appbrand.page.d1 r6 = r14.f244929a     // Catch:{ NullPointerException -> 0x0063 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r6 = r6.getRuntime()     // Catch:{ NullPointerException -> 0x0063 }
            com.tencent.mm.plugin.appbrand.config.a r6 = r6.mo113008F()     // Catch:{ NullPointerException -> 0x0063 }
            boolean r6 = r6.f239618x     // Catch:{ NullPointerException -> 0x0063 }
            goto L_0x0064
        L_0x0063:
            r6 = 0
        L_0x0064:
            if (r6 != 0) goto L_0x0070
            boolean r6 = r14.mo116468l()
            if (r6 != 0) goto L_0x0070
            r14.mo116471o()
            goto L_0x0086
        L_0x0070:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = r14.mo116465i()
            r0[r4] = r1
            java.lang.String r1 = r14.mo116467k()
            r0[r3] = r1
            java.lang.String r1 = "willResizeByOrientation appId[%s], url[%s], fixed orientation device"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
            goto L_0x0140
        L_0x0086:
            com.tencent.mm.plugin.appbrand.page.d1 r6 = r14.f244929a
            android.content.Context r6 = r6.getContext()
            java.lang.String r8 = "ctx"
            gy3.C87412m.m108594g(r6, r8)
            com.tencent.mm.plugin.appbrand.utils.q1$a r8 = com.tencent.p014mm.plugin.appbrand.utils.C84777q1.m104441a(r6)
            android.content.res.Resources r9 = r6.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            int r10 = r8.f247200a
            float r10 = (float) r10
            float r11 = r9.xdpi
            float r10 = r10 / r11
            double r10 = (double) r10
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = java.lang.Math.pow(r10, r12)
            int r8 = r8.f247201b
            float r8 = (float) r8
            float r9 = r9.ydpi
            float r8 = r8 / r9
            double r8 = (double) r8
            double r8 = java.lang.Math.pow(r8, r12)
            double r10 = r10 + r8
            double r8 = java.lang.Math.sqrt(r10)
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.screenLayout
            r6 = r6 & 15
            if (r6 < r7) goto L_0x00d0
            r6 = 4619567317775286272(0x401c000000000000, double:7.0)
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x00d0
            r6 = 1
            goto L_0x00d1
        L_0x00d0:
            r6 = 0
        L_0x00d1:
            if (r6 != 0) goto L_0x00da
            java.lang.String r6 = "folderFixedOrientationDeviceCompatible not large screen"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            r6 = 0
            goto L_0x00f4
        L_0x00da:
            rc.l r6 = p225rc.C89923l.f258408a
            boolean r6 = r6.mo117502h()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "folderFixedOrientationDeviceCompatible ret="
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
        L_0x00f4:
            if (r6 == 0) goto L_0x010b
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = r14.mo116465i()
            r0[r4] = r1
            java.lang.String r1 = r14.mo116467k()
            r0[r3] = r1
            java.lang.String r1 = "willResizeByOrientation appId[%s], url[%s] return false for folder orientaion fixed"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
            goto L_0x0140
        L_0x010b:
            com.tencent.mm.plugin.appbrand.page.d1 r1 = r14.f244929a     // Catch:{ NullPointerException -> 0x0118 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r1.getRuntime()     // Catch:{ NullPointerException -> 0x0118 }
            com.tencent.mm.plugin.appbrand.config.a r1 = r1.mo113008F()     // Catch:{ NullPointerException -> 0x0118 }
            boolean r1 = r1.f239618x     // Catch:{ NullPointerException -> 0x0118 }
            goto L_0x0119
        L_0x0118:
            r1 = 0
        L_0x0119:
            if (r1 == 0) goto L_0x011e
            r14.mo116471o()
        L_0x011e:
            if (r5 != 0) goto L_0x0122
            br0.e$b r5 = br0.C79778e.C79780b.PORTRAIT
        L_0x0122:
            boolean r0 = r0.mo109920a(r5)
            if (r0 != 0) goto L_0x0140
            goto L_0x0141
        L_0x0129:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.tencent.mm.plugin.appbrand.page.d1 r1 = r14.f244929a
            java.lang.String r1 = r1.getAppId()
            r0[r4] = r1
            com.tencent.mm.plugin.appbrand.page.d1 r1 = r14.f244929a
            java.lang.String r1 = r1.mo116162Q0()
            r0[r3] = r1
            java.lang.String r1 = "__willResize NULL orientationHandler, appId:%s, url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r0)
        L_0x0140:
            r3 = 0
        L_0x0141:
            xb.m r0 = r14.f244930b
            r0.f261391f = r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83887q3.mo116460a():boolean");
    }

    /* renamed from: b */
    public void mo116449b() {
        this.f244932d = false;
        this.f244930b.f261389d = false;
    }

    /* renamed from: c */
    public void mo116450c() {
        if (this.f244936h == null) {
            C83820i0 i0Var = this.f244929a.f244572U;
            Objects.requireNonNull(i0Var);
            this.f244936h = new Configuration(i0Var.getResources().getConfiguration());
        }
        this.f244932d = true;
        if (this.f244929a.mo116151F0() == null || !this.f244929a.mo116151F0().mo62479g()) {
            mo116463f((C79778e.C79779a) null);
        } else {
            this.f244929a.mo116151F0().mo62473a(new C83893e());
        }
        C91159m mVar = this.f244930b;
        if (mVar.f261386a) {
            Log.m105925i("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "onForeground dispatch ViewDidResize appId[%s] url[%s]", mVar.f261392g.getAppId(), mVar.f261392g.mo116162Q0());
            mVar.mo125223c();
            mVar.f261386a = false;
        }
        mVar.f261389d = true;
    }

    /* renamed from: d */
    public String mo116461d() {
        return this.f244931c;
    }

    /* renamed from: e */
    public void mo116462e(String str) {
        this.f244931c = str;
        mo116463f((C79778e.C79779a) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo116463f(br0.C79778e.C79779a r11) {
        /*
            r10 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto L_0x0015
            com.tencent.mm.plugin.appbrand.page.d1 r0 = r10.f244929a
            com.tencent.mm.plugin.appbrand.page.q3$c r1 = new com.tencent.mm.plugin.appbrand.page.q3$c
            r1.<init>(r11)
            r0.mo109673t(r1)
            return
        L_0x0015:
            boolean r0 = r10.f244933e
            java.lang.String r1 = "Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]"
            r2 = 1
            r3 = 2
            r4 = 0
            if (r0 == 0) goto L_0x0035
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.String r0 = r10.mo116465i()
            r11[r4] = r0
            com.tencent.mm.plugin.appbrand.page.d1 r0 = r10.f244929a
            java.lang.String r0 = r0.mo116162Q0()
            r11[r2] = r0
            java.lang.String r0 = "resetPageOrientation but destroyed, appId:%s url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r0, r11)
            return
        L_0x0035:
            r10.mo116469m(r2)
            com.tencent.mm.plugin.appbrand.page.q3$d r0 = new com.tencent.mm.plugin.appbrand.page.q3$d
            r0.<init>(r11)
            com.tencent.mm.plugin.appbrand.page.d1 r11 = r10.f244929a
            br0.c r11 = r11.f244577X
            boolean r11 = r11 instanceof cr0.C86127t
            br0.e r5 = r10.mo116466j()
            br0.e$b r5 = r5.mo109917a()
            br0.e$b[] r6 = br0.C79778e.C79780b.f233803n
            boolean r5 = u24.C90595a.m113498b(r6, r5)
            r6 = 0
            if (r5 == 0) goto L_0x0096
            if (r11 == 0) goto L_0x0096
            boolean r11 = r10.mo116468l()
            if (r11 != 0) goto L_0x007e
            com.tencent.mm.plugin.appbrand.page.d1 r11 = r10.f244929a
            android.content.Context r11 = r11.getContext()
            boolean r11 = com.tencent.p014mm.plugin.appbrand.utils.C84777q1.m104442b(r11)
            if (r11 != 0) goto L_0x0069
            goto L_0x0076
        L_0x0069:
            com.tencent.mm.plugin.appbrand.page.d1 r11 = r10.f244929a     // Catch:{ NullPointerException -> 0x0076 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r11 = r11.getRuntime()     // Catch:{ NullPointerException -> 0x0076 }
            com.tencent.mm.plugin.appbrand.config.a r11 = r11.mo113008F()     // Catch:{ NullPointerException -> 0x0076 }
            boolean r11 = r11.f239618x     // Catch:{ NullPointerException -> 0x0076 }
            goto L_0x0077
        L_0x0076:
            r11 = 0
        L_0x0077:
            if (r11 == 0) goto L_0x007a
            goto L_0x007e
        L_0x007a:
            r10.mo116471o()
            goto L_0x0096
        L_0x007e:
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.String r3 = r10.mo116465i()
            r11[r4] = r3
            java.lang.String r3 = r10.mo116467k()
            r11[r2] = r3
            java.lang.String r2 = "resetPageOrientation appId[%s], url[%s], tabletLandscapeCompatible"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r11)
            r0.mo109919g(r6, r4)
            return
        L_0x0096:
            com.tencent.mm.plugin.appbrand.page.d1 r11 = r10.f244929a
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r11 = r11.getRuntime()
            boolean r11 = r11.mo113071o0()
            if (r11 == 0) goto L_0x00ae
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r2 = "resetPageOrientation, wxa is showing launch ad, ignore changing orientation"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r1, r2, r11)
            r0.mo109919g(r6, r4)
            return
        L_0x00ae:
            r11 = 3
            java.lang.Object[] r5 = new java.lang.Object[r11]
            java.lang.String r7 = r10.mo116465i()
            r5[r4] = r7
            java.lang.String r7 = r10.mo116467k()
            r5[r2] = r7
            java.lang.String r7 = r10.f244931c
            r5[r3] = r7
            java.lang.String r7 = "resetPageOrientation, before trigger, appId[%s] url[%s] orientation[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r1, r7, r5)
            java.lang.String r5 = r10.f244931c
            java.lang.String r7 = "portrait"
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r7)
            r5.getClass()
            r8 = -1
            int r9 = r5.hashCode()
            switch(r9) {
                case -2022952606: goto L_0x00fb;
                case 3005871: goto L_0x00f0;
                case 729267099: goto L_0x00e7;
                case 1430647483: goto L_0x00dc;
                default: goto L_0x00db;
            }
        L_0x00db:
            goto L_0x0105
        L_0x00dc:
            java.lang.String r7 = "landscape"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x00e5
            goto L_0x0105
        L_0x00e5:
            r8 = 3
            goto L_0x0105
        L_0x00e7:
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x00ee
            goto L_0x0105
        L_0x00ee:
            r8 = 2
            goto L_0x0105
        L_0x00f0:
            java.lang.String r7 = "auto"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x00f9
            goto L_0x0105
        L_0x00f9:
            r8 = 1
            goto L_0x0105
        L_0x00fb:
            java.lang.String r7 = "landscapeLeft"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0104
            goto L_0x0105
        L_0x0104:
            r8 = 0
        L_0x0105:
            switch(r8) {
                case 0: goto L_0x0158;
                case 1: goto L_0x014e;
                case 2: goto L_0x0144;
                case 3: goto L_0x013a;
                default: goto L_0x0108;
            }
        L_0x0108:
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Object[] r11 = new java.lang.Object[r11]
            com.tencent.mm.plugin.appbrand.page.d1 r7 = r10.f244929a
            java.lang.String r7 = r7.getAppId()
            r11[r4] = r7
            com.tencent.mm.plugin.appbrand.page.d1 r7 = r10.f244929a
            java.lang.String r7 = r7.mo116162Q0()
            r11[r2] = r7
            java.lang.String r2 = r10.f244931c
            r11[r3] = r2
            java.lang.String r2 = "resetPageOrientation get invalid value, appId[%s], url[%s], orientation[%s]"
            java.lang.String r11 = java.lang.String.format(r5, r2, r11)
            com.tencent.mm.plugin.appbrand.page.d1 r2 = r10.f244929a
            boolean r2 = r2.f241593r
            if (r2 != 0) goto L_0x0134
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r11)
            r0.mo109919g(r6, r4)
            goto L_0x0161
        L_0x0134:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r11)
            throw r0
        L_0x013a:
            br0.e r11 = r10.mo116466j()
            br0.e$b r1 = br0.C79778e.C79780b.LANDSCAPE_SENSOR
            r11.mo109918b(r1, r0)
            goto L_0x0161
        L_0x0144:
            br0.e r11 = r10.mo116466j()
            br0.e$b r1 = br0.C79778e.C79780b.PORTRAIT
            r11.mo109918b(r1, r0)
            goto L_0x0161
        L_0x014e:
            br0.e r11 = r10.mo116466j()
            br0.e$b r1 = br0.C79778e.C79780b.UNSPECIFIED
            r11.mo109918b(r1, r0)
            goto L_0x0161
        L_0x0158:
            br0.e r11 = r10.mo116466j()
            br0.e$b r1 = br0.C79778e.C79780b.LANDSCAPE_LEFT
            r11.mo109918b(r1, r0)
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83887q3.mo116463f(br0.e$a):void");
    }

    /* renamed from: g */
    public final void mo116464g() {
        if (this.f244929a.mo116160O0() != null && !this.f244933e) {
            C91159m mVar = this.f244930b;
            int width = mVar.f261392g.f244555G.getWidth();
            int height = mVar.f261392g.f244555G.getHeight();
            if (width <= 0 || height <= 0) {
                Log.m105921e("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "onPageLayout wtf invalid window size [%d %d], appId[%s], url[%s]", Integer.valueOf(width), Integer.valueOf(height), mVar.f261392g.getAppId(), mVar.f261392g.mo116162Q0());
                return;
            }
            boolean z = (width == mVar.f261387b && height == mVar.f261388c) ? false : true;
            mVar.f261387b = width;
            mVar.f261388c = height;
            int[] a = C84752i2.m104413a(mVar.f261392g);
            boolean z2 = mVar.mo125222b(width, height) && mVar.mo125222b(a[0], a[1]);
            boolean z3 = (mVar.f261387b == 0 || mVar.f261388c == 0) ? false : true;
            Log.m105925i("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "onPageLayout appId[%s], url[%s], hadInit[%b], winSizeChanged[%b], winSizeMatched[%b], foreground[%b], needDispatch[%b]", mVar.f261392g.getAppId(), mVar.f261392g.mo116162Q0(), Boolean.valueOf(z3), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(mVar.f261389d), Boolean.valueOf(mVar.f261386a));
            boolean z4 = (z3 && z && z2) || (mVar.f261391f && z2);
            if (!z4 && mVar.f261391f) {
                Log.m105921e("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "onPageLayout appId[%s], url[%s], window[%d x %d], screen[%d x %d]", mVar.f261392g.getAppId(), mVar.f261392g.mo116162Q0(), Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(a[0]), Integer.valueOf(a[1]));
            }
            if (!z4) {
                mVar.f261386a = false;
            } else if (mVar.f261389d) {
                mVar.mo125223c();
            } else {
                mVar.f261386a = true;
            }
        }
    }

    /* renamed from: h */
    public void mo116451h(C79808b bVar) {
    }

    /* renamed from: i */
    public final String mo116465i() {
        return this.f244929a.getAppId();
    }

    /* renamed from: j */
    public final C79778e mo116466j() {
        return this.f244929a.f244577X.getOrientationHandler();
    }

    /* renamed from: k */
    public final String mo116467k() {
        return this.f244929a.mo116162Q0();
    }

    /* renamed from: l */
    public final boolean mo116468l() {
        if (this.f244929a.f244577X.shouldInLargeScreenCompatMode()) {
            return false;
        }
        C89923l lVar = C89923l.f258408a;
        if (!lVar.mo117503i() || !C84777q1.m104442b(this.f244929a.getContext())) {
            return HuaweiKt.hasHuaweiMagicWindowFeature() && C84777q1.m104442b(this.f244929a.getContext()) && !lVar.mo117503i();
        }
        return true;
    }

    /* renamed from: m */
    public final void mo116469m(boolean z) {
        this.f244934f = z;
        if (!z && this.f244935g) {
            Log.m105925i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "emitPageLayout after mPageLayoutFrozen reset false, appId[%s] url[%s] mDestroyed[%b]", this.f244929a.getAppId(), this.f244929a.mo116162Q0(), Boolean.valueOf(this.f244933e));
            mo116464g();
            this.f244935g = false;
        }
    }

    /* renamed from: n */
    public void mo116470n(String str, Map<String, Object> map) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f244929a.mo109673t(new C83890b(str, map));
            return;
        }
        C91159m mVar = this.f244930b;
        if (map != null) {
            ((HashMap) mVar.f261390e).putAll(map);
        } else {
            mVar.getClass();
        }
        mo116462e(str);
    }

    /* renamed from: o */
    public final boolean mo116471o() {
        if (!C90595a.m113498b(C79778e.C79780b.f233803n, mo116466j().mo109917a())) {
            return false;
        }
        ((C90154a) this.f244929a.mo109671p(C90154a.class)).getClass();
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2;
        if (this.f244932d && !this.f244933e && (configuration2 = this.f244936h) != null && configuration2.orientation != configuration.orientation) {
            this.f244936h = new Configuration(configuration);
            if (this.f244937i == null) {
                this.f244937i = new C83894f((C83888a) null);
            }
            C83894f fVar = this.f244937i;
            C83887q3.this.mo116469m(true);
            fVar.mo116476a();
            ViewGroup viewGroup = C83887q3.this.f244929a.f244552D;
            Objects.requireNonNull(viewGroup);
            viewGroup.postDelayed(fVar.f244950a, 100);
            ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
            C83906r3 r3Var = new C83906r3(fVar);
            fVar.f244951b = r3Var;
            viewTreeObserver.addOnGlobalLayoutListener(r3Var);
        }
    }

    public void onDestroy() {
        this.f244932d = false;
        this.f244933e = true;
        C83894f fVar = this.f244937i;
        if (fVar != null) {
            fVar.mo116476a();
            fVar.f244951b = null;
            fVar.f244950a = null;
        }
    }
}
