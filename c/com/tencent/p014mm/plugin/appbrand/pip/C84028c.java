package com.tencent.p014mm.plugin.appbrand.pip;

import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.plugin.appbrand.utils.C84790v1;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandPipContainerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import hm0.C87558e;
import hm0.C87559f;
import hm0.C87560g;
import hm0.C87564i;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.c */
public class C84028c {

    /* renamed from: A */
    public int f245313A;

    /* renamed from: B */
    public int f245314B;

    /* renamed from: C */
    public int f245315C;

    /* renamed from: D */
    public int f245316D;

    /* renamed from: E */
    public int f245317E = AppBrandPipContainerView.f247475y0;

    /* renamed from: F */
    public int f245318F = AppBrandPipContainerView.f247474x0;

    /* renamed from: G */
    public int f245319G = AppBrandPipContainerView.f247461Q0;

    /* renamed from: H */
    public int f245320H = AppBrandPipContainerView.f247463R0;

    /* renamed from: I */
    public int f245321I = AppBrandPipContainerView.f247465S0;

    /* renamed from: J */
    public int f245322J = AppBrandPipContainerView.f247467T0;

    /* renamed from: K */
    public int f245323K;

    /* renamed from: L */
    public int f245324L;

    /* renamed from: M */
    public int f245325M;

    /* renamed from: N */
    public int f245326N;

    /* renamed from: O */
    public int f245327O;

    /* renamed from: P */
    public int f245328P;

    /* renamed from: Q */
    public int f245329Q;

    /* renamed from: R */
    public int f245330R;

    /* renamed from: a */
    public final String f245331a = ("MicroMsg.AppBrand.AppBrandPipContainerOnPageSwitchHandler#" + hashCode());

    /* renamed from: b */
    public final C83780d1 f245332b;

    /* renamed from: c */
    public final AppBrandPipContainerView f245333c;

    /* renamed from: d */
    public final View f245334d;

    /* renamed from: e */
    public final C87560g f245335e;

    /* renamed from: f */
    public final C87564i f245336f;

    /* renamed from: g */
    public final C84790v1 f245337g;

    /* renamed from: h */
    public volatile boolean f245338h = false;

    /* renamed from: i */
    public volatile boolean f245339i = false;

    /* renamed from: j */
    public int f245340j;

    /* renamed from: k */
    public int f245341k;

    /* renamed from: l */
    public C84031c f245342l = null;

    /* renamed from: m */
    public int f245343m;

    /* renamed from: n */
    public int f245344n;

    /* renamed from: o */
    public int f245345o;

    /* renamed from: p */
    public int f245346p;

    /* renamed from: q */
    public int f245347q;

    /* renamed from: r */
    public int f245348r;

    /* renamed from: s */
    public int f245349s;

    /* renamed from: t */
    public int f245350t;

    /* renamed from: u */
    public int f245351u;

    /* renamed from: v */
    public int f245352v;

    /* renamed from: w */
    public int f245353w;

    /* renamed from: x */
    public int f245354x;

    /* renamed from: y */
    public int f245355y;

    /* renamed from: z */
    public int f245356z;

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.c$a */
    public class C84029a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Point f245357d;

        /* renamed from: e */
        public final /* synthetic */ Point f245358e;

        /* renamed from: f */
        public final /* synthetic */ int f245359f;

        /* renamed from: g */
        public final /* synthetic */ int f245360g;

        public C84029a(Point point, Point point2, int i, int i2) {
            this.f245357d = point;
            this.f245358e = point2;
            this.f245359f = i;
            this.f245360g = i2;
        }

        public void run() {
            if (C84028c.this.f245338h) {
                Log.m105924i(C84028c.this.f245331a, "handleVideoPage2PipStart, true == mHandleStarted");
                return;
            }
            int l = C84028c.this.f245335e.mo110200l();
            int m = C84028c.this.f245335e.mo110201m();
            Point point = this.f245357d;
            int i = point.x;
            Point point2 = this.f245358e;
            boolean z = false;
            Log.m105925i(C84028c.this.f245331a, "handleVideoPage2PipStart, originVideoPosX: %d, originVideoPosY: %d", Integer.valueOf(i + point2.x), Integer.valueOf(point.y + point2.y));
            C84028c cVar = C84028c.this;
            AppBrandPipContainerView appBrandPipContainerView = cVar.f245333c;
            Point point3 = this.f245357d;
            int i2 = point3.x;
            int i3 = point3.y;
            Point point4 = this.f245358e;
            if (cVar.f245342l == null) {
                cVar.f245342l = new C84031c((C84026b) null);
            }
            C84031c cVar2 = cVar.f245342l;
            cVar2.f245365a = i2;
            cVar2.f245366b = i3;
            cVar2.f245367c = point4;
            appBrandPipContainerView.mo117657a(cVar2);
            C84028c cVar3 = C84028c.this;
            int i4 = this.f245359f;
            int i5 = this.f245360g;
            cVar3.getClass();
            if (!((-1 == i4 || -1 == i5) ? false : true) ? l >= m : i4 >= i5) {
                z = true;
            }
            if (z) {
                cVar3.f245355y = AppBrandPipContainerView.f247454J;
                cVar3.f245356z = AppBrandPipContainerView.f247455K;
            } else {
                cVar3.f245355y = AppBrandPipContainerView.f247458N;
                cVar3.f245356z = AppBrandPipContainerView.f247459P;
            }
            View view = cVar3.f245334d;
            if (view instanceof C87559f) {
                ((C87559f) view).mo122016a(z ? C87558e.LANDSCAPE : C87558e.PORTRAIT);
            }
            C84028c cVar4 = C84028c.this;
            AppBrandPipContainerView appBrandPipContainerView2 = cVar4.f245333c;
            int i6 = cVar4.f245355y;
            int i7 = cVar4.f245356z;
            appBrandPipContainerView2.f247496r = appBrandPipContainerView2.mo117669k(appBrandPipContainerView2.f247496r, i6);
            appBrandPipContainerView2.mo117673o(appBrandPipContainerView2.f247497s, i7);
            Log.m105924i("MicroMsg.AppBrand.AppBrandPipContainerView", "adjustStablePos, mStablePosX: " + appBrandPipContainerView2.f247496r + ", mStablePosY: " + appBrandPipContainerView2.f247497s);
            appBrandPipContainerView2.mo117660d(appBrandPipContainerView2.f247496r, appBrandPipContainerView2.f247497s);
            C84028c cVar5 = C84028c.this;
            cVar5.mo116682a(0.0f, cVar5.f245343m, cVar5.f245344n, cVar5.f245345o, cVar5.f245346p, cVar5.f245347q, cVar5.f245348r, cVar5.f245349s, cVar5.f245350t, cVar5.f245351u, cVar5.f245352v, cVar5.f245353w, cVar5.f245354x);
            C84028c.this.f245338h = true;
            C84028c cVar6 = C84028c.this;
            if (cVar6.f245337g != null) {
                Log.m105924i(cVar6.f245331a, "handleVideoPage2PipStart, run afterStartTask");
                C84028c.this.f245337g.mo117505a();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.c$b */
    public class C84030b implements C87560g.C87561a {

        /* renamed from: a */
        public final /* synthetic */ Point f245362a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f245363b;

        public C84030b(Point point, Runnable runnable) {
            this.f245362a = point;
            this.f245363b = runnable;
        }

        /* renamed from: a */
        public void mo116681a(int i, int i2) {
            if (C84028c.this.f245339i) {
                Log.m105924i(C84028c.this.f245331a, "handleVideoPage2PipStart, onVideoPositionGot, released");
                return;
            }
            Point point = this.f245362a;
            point.x = i;
            point.y = i2;
            this.f245363b.run();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.c$c */
    public class C84031c implements AppBrandPipContainerView.C84917d {

        /* renamed from: a */
        public int f245365a;

        /* renamed from: b */
        public int f245366b;

        /* renamed from: c */
        public Point f245367c = null;

        public C84031c(C84026b bVar) {
        }

        /* renamed from: a */
        public void mo116688a(int i, int i2) {
            int i3;
            int i4;
            int i5;
            Log.m105918d(C84028c.this.f245331a, "MyOnStablePositionChangeListener, onStablePositionChange");
            if (C84028c.this.f245339i) {
                Log.m105924i(C84028c.this.f245331a, "onStablePositionChange, onVideoPositionGot, released");
                return;
            }
            int videoWidth = C84028c.this.f245336f.getVideoWidth();
            int videoHeight = C84028c.this.f245336f.getVideoHeight();
            if (videoWidth == 0 || videoHeight == 0) {
                Log.m105928w(C84028c.this.f245331a, "MyOnStablePositionChangeListener, 0 == realVideoWidth || 0 == reaVideoHeight");
                return;
            }
            int l = C84028c.this.f245335e.mo110200l();
            int m = C84028c.this.f245335e.mo110201m();
            if (this.f245367c == null) {
                this.f245367c = C84028c.this.mo116683b();
            }
            Point point = this.f245367c;
            if (point == null) {
                Log.m105928w(C84028c.this.f245331a, "MyOnStablePositionChangeListener, null == mWebView2PipContainerParentOffset");
                return;
            }
            int i6 = this.f245365a;
            int i7 = this.f245366b + point.y;
            Log.m105925i(C84028c.this.f245331a, "MyOnStablePositionChangeListener, originVideoPosX: %d, originVideoPosY: %d", Integer.valueOf(i6), Integer.valueOf(i7));
            C84028c cVar = C84028c.this;
            cVar.getClass();
            boolean z = (-1 == videoWidth || -1 == videoHeight) ? false : true;
            if (!z ? l >= m : videoWidth >= videoHeight) {
                cVar.f245355y = AppBrandPipContainerView.f247454J;
                cVar.f245356z = AppBrandPipContainerView.f247455K;
                i4 = AppBrandPipContainerView.f247456L;
                i3 = AppBrandPipContainerView.f247457M;
            } else {
                cVar.f245355y = AppBrandPipContainerView.f247458N;
                cVar.f245356z = AppBrandPipContainerView.f247459P;
                i4 = AppBrandPipContainerView.f247460Q;
                i3 = AppBrandPipContainerView.f247462R;
            }
            int stablePosX = cVar.f245333c.getStablePosX();
            int stablePosY = cVar.f245333c.getStablePosY();
            int i8 = videoWidth;
            Log.m105925i(cVar.f245331a, "calculateStablePipContainerSizeAndPosition, stablePosX: %d, stablePosY: %d", Integer.valueOf(stablePosX), Integer.valueOf(stablePosY));
            cVar.f245313A = Math.min(Math.max(0, stablePosX), cVar.f245340j - cVar.f245355y);
            cVar.f245314B = Math.min(Math.max(0, stablePosY), cVar.f245341k - cVar.f245356z);
            Log.m105925i(cVar.f245331a, "calculateStablePipContainerSizeAndPosition, mEndPipContainerPosX: %d, mEndPipContainerPosY: %d", Integer.valueOf(cVar.f245313A), Integer.valueOf(cVar.f245314B));
            if (!z) {
                i5 = l;
                videoHeight = m;
            } else {
                i5 = i8;
            }
            float f = (float) i5;
            float f2 = (((float) i4) + 0.0f) / f;
            float f3 = (float) videoHeight;
            float f4 = (((float) i3) + 0.0f) / f3;
            if (f2 >= f4) {
                cVar.f245315C = i4;
                cVar.f245316D = (int) Math.ceil((double) (f2 * f3));
            } else {
                cVar.f245315C = (int) Math.ceil((double) (f4 * f));
                cVar.f245316D = i3;
            }
            cVar.f245347q = l;
            cVar.f245348r = m;
            Log.m105919d(cVar.f245331a, "calculateStablePipContainerSize, mStartVideoContainerWidth: %d, mStartVideoContainerHeight: %d", Integer.valueOf(l), Integer.valueOf(cVar.f245348r));
            cVar.f245344n = (int) (((((float) cVar.f245356z) + 0.0f) / ((float) cVar.f245316D)) * ((float) cVar.f245348r));
            int i9 = (int) (((((float) cVar.f245355y) + 0.0f) / ((float) cVar.f245315C)) * ((float) cVar.f245347q));
            cVar.f245343m = i9;
            Log.m105919d(cVar.f245331a, "calculateStablePipContainerSize, mStartPipContainerWidth: %d, mStartPipContainerHeight: %d", Integer.valueOf(i9), Integer.valueOf(cVar.f245344n));
            cVar.f245315C = i4;
            cVar.f245316D = i3;
            float f5 = (((float) cVar.f245343m) + 0.0f) / ((float) cVar.f245355y);
            float f6 = (((float) cVar.f245344n) + 0.0f) / ((float) cVar.f245356z);
            Log.m105919d(cVar.f245331a, "calculateStablePipContainerSize, start2EndWidthRatio: %f, start2EndHeightRatio: %f", Float.valueOf(f5), Float.valueOf(f6));
            int min = Math.min(Math.max(i6, -cVar.f245343m), cVar.f245340j);
            int min2 = Math.min(Math.max(i7, -cVar.f245344n), cVar.f245341k);
            Log.m105919d(cVar.f245331a, "calculateStablePipContainerSize, originVideoPosX: %d, originVideoPosY: %d", Integer.valueOf(min), Integer.valueOf(min2));
            if (z) {
                cVar.f245345o = min - ((int) ((f5 * ((float) (cVar.f245355y - i4))) / 2.0f));
                cVar.f245346p = min2 - ((int) ((((float) (cVar.f245356z - i3)) * f6) / 2.0f));
            } else {
                int i15 = cVar.f245347q;
                cVar.f245345o = (min + ((l - i15) / 2)) - ((cVar.f245343m - i15) / 2);
                int i16 = cVar.f245348r;
                cVar.f245346p = (min2 + ((m - i16) / 2)) - ((cVar.f245344n - i16) / 2);
            }
            cVar.f245349s = (int) Math.ceil((double) (((float) (cVar.f245343m - cVar.f245347q)) * 0.5f));
            cVar.f245350t = (int) Math.ceil((double) (((float) (cVar.f245344n - cVar.f245348r)) * 0.4f));
            cVar.f245351u = (int) Math.ceil((double) (((float) (cVar.f245344n - cVar.f245348r)) * 0.6f));
            cVar.f245352v = (int) (((float) cVar.f245320H) * f6);
            cVar.f245353w = (int) (((float) cVar.f245321I) * f6);
            cVar.f245354x = (int) (f6 * ((float) cVar.f245322J));
        }
    }

    public C84028c(C83780d1 d1Var, AppBrandPipContainerView appBrandPipContainerView, View view, C87560g gVar, C87564i iVar, C84790v1 v1Var) {
        this.f245332b = d1Var;
        this.f245333c = appBrandPipContainerView;
        this.f245334d = view;
        this.f245335e = gVar;
        this.f245336f = iVar;
        this.f245337g = v1Var;
    }

    /* renamed from: a */
    public final void mo116682a(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15, int i16, int i17) {
        int i18 = i5;
        int i19 = i6;
        float f2 = f / 100.0f;
        int i25 = (int) (((float) i7) * f2);
        int i26 = (int) (((float) i8) * f2);
        int i27 = (int) (((float) i9) * f2);
        int i28 = (i25 * 2) + i18;
        int i29 = i19 + i26 + i27;
        int i35 = (int) (f2 * ((float) i17));
        ViewGroup.LayoutParams layoutParams = this.f245333c.getLayoutParams();
        layoutParams.width = i28;
        layoutParams.height = i29;
        this.f245333c.setLayoutParams(layoutParams);
        this.f245333c.setX((float) (i3 + ((i - i28) / 2)));
        this.f245333c.setY((float) (i4 + ((i2 - i29) / 2)));
        ViewGroup.LayoutParams layoutParams2 = this.f245334d.getLayoutParams();
        layoutParams2.width = i18;
        layoutParams2.height = i19;
        this.f245334d.setLayoutParams(layoutParams2);
        this.f245333c.mo117671m(i18, i25, i26, i27, (int) (((float) i15) * f2), (int) (((float) i16) * f2), i35);
    }

    /* renamed from: b */
    public final Point mo116683b() {
        C83797e3 e3Var = this.f245332b.f244558J;
        if (e3Var == null) {
            Log.m105928w(this.f245331a, "calculateWebView2PipContainerParentOffset, null == appBrandWebView");
            return null;
        }
        View contentView = e3Var.getContentView();
        if (contentView == null) {
            Log.m105928w(this.f245331a, "calculateWebView2PipContainerParentOffset, null == webView");
            return null;
        }
        ViewParent parent = this.f245333c.getParent();
        if (!(parent instanceof ViewGroup)) {
            Log.m105928w(this.f245331a, "calculateWebView2PipContainerParentOffset, viewParent is not ViewGroup");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f245340j = viewGroup.getWidth();
        this.f245341k = viewGroup.getHeight();
        Log.m105919d(this.f245331a, "calculateWebView2PipContainerParentOffset, mScreenWidth: %d, mScreenHeight: %d", Integer.valueOf(this.f245340j), Integer.valueOf(this.f245341k));
        ViewParent parent2 = contentView.getParent();
        int i = 0;
        int i2 = 0;
        while (parent2 != null) {
            if (!(parent2 instanceof ViewGroup)) {
                Log.m105928w(this.f245331a, "calculateWebView2PipContainerParentOffset, parent is not ViewGroup");
                return null;
            }
            i = (int) (((float) i) + contentView.getX());
            i2 = (int) (((float) i2) + contentView.getY());
            if (parent2 == viewGroup) {
                Log.m105919d(this.f245331a, "calculateWebView2PipContainerParentOffset, offsetX: %d, offsetY: %d", Integer.valueOf(i), Integer.valueOf(i2));
                return new Point(i, i2);
            }
            contentView = (View) parent2;
            parent2 = contentView.getParent();
        }
        return null;
    }

    /* renamed from: c */
    public void mo116684c() {
        Log.m105924i(this.f245331a, "handleVideoPage2PipEnd");
        if (!this.f245338h) {
            mo116685d(false);
        }
        mo116682a(100.0f, this.f245355y, this.f245356z, this.f245313A, this.f245314B, this.f245315C, this.f245316D, this.f245317E, this.f245318F, this.f245319G, this.f245320H, this.f245321I, this.f245322J);
    }

    /* renamed from: d */
    public final boolean mo116685d(boolean z) {
        int videoWidth = this.f245336f.getVideoWidth();
        int videoHeight = this.f245336f.getVideoHeight();
        if (videoWidth == 0 || videoHeight == 0) {
            Log.m105928w(this.f245331a, "handleVideoPage2PipStart, 0 == realVideoWidth || 0 == reaVideoHeight");
            return false;
        }
        Point b = mo116683b();
        if (b == null) {
            Log.m105928w(this.f245331a, "handleVideoPage2PipStart, null == webView2PipContainerParentOffset");
            return false;
        }
        Point point = new Point();
        C84029a aVar = new C84029a(point, b, videoWidth, videoHeight);
        if (z) {
            this.f245335e.mo110202n(this.f245332b, new C84030b(point, aVar));
            return true;
        }
        Point g = this.f245335e.mo110190g();
        point.x = g.x;
        point.y = g.y;
        aVar.run();
        return true;
    }

    /* renamed from: e */
    public void mo116686e(float f) {
        if (!this.f245338h) {
            Log.m105928w(this.f245331a, "handleVideoTransferProgress, false == mHandleStarted");
            return;
        }
        int i = this.f245343m;
        float f2 = f / 100.0f;
        int i2 = i + ((int) (((float) (this.f245355y - i)) * f2));
        this.f245323K = i2;
        int i3 = this.f245344n;
        this.f245324L = i3 + ((int) (((float) (this.f245356z - i3)) * f2));
        int i4 = this.f245345o;
        this.f245325M = i4 + ((int) (((float) (this.f245313A - i4)) * f2));
        int i5 = this.f245346p;
        this.f245326N = i5 + ((int) (((float) (this.f245314B - i5)) * f2));
        int i6 = this.f245347q;
        int i7 = i6 + ((int) (((float) (this.f245315C - i6)) * f2));
        this.f245327O = i7;
        int i8 = this.f245348r;
        this.f245328P = i8 + ((int) (((float) (this.f245316D - i8)) * f2));
        this.f245329Q = (int) Math.ceil((double) (((float) (i2 - i7)) * 0.5f));
        this.f245330R = (int) Math.ceil((double) (((float) (this.f245324L - this.f245328P)) * 0.4f));
        int ceil = (int) Math.ceil((double) (((float) (this.f245324L - this.f245328P)) * 0.6f));
        int i9 = this.f245352v;
        int i15 = i9 + ((int) (((float) (this.f245320H - i9)) * f2));
        int i16 = this.f245353w;
        int i17 = i16 + ((int) (((float) (this.f245321I - i16)) * f2));
        int i18 = this.f245354x;
        int i19 = i18 + ((int) (f2 * ((float) (this.f245322J - i18))));
        mo116682a(f, this.f245323K, this.f245324L, this.f245325M, this.f245326N, this.f245327O, this.f245328P, this.f245329Q, this.f245330R, ceil, i15, i17, i19);
    }
}
