package com.tencent.luggage.game.page;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import br0.C39836d;
import br0.C79778e;
import bt0.C79808b;
import com.tencent.luggage.game.page.C80209a;
import com.tencent.luggage.game.page.WAGamePageViewContainerLayout;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C1523c3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.page.AppBrandPageFullScreenView;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.plugin.appbrand.page.C83809g3;
import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.p014mm.plugin.appbrand.page.C83827i3;
import com.tencent.p014mm.plugin.appbrand.page.C83833j3;
import com.tencent.p014mm.plugin.appbrand.page.C83863o2;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import cr0.C86127t;
import di3.C86312j;
import fy3.C32226l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p1017od.C89153a;
import p1017od.C89157e;
import p1044ub.C90630c;
import p169ib.C87685a;
import p169ib.C87686c;
import p225rc.C89923l;
import p284zb.C91635f;
import p284zb.C91640i;
import p547hb.C46016a;
import p547hb.C87463b;
import p547hb.C87464c;
import p547hb.C87467f;
import p547hb.C87470h;
import p547hb.g$$a;
import p547hb.g$$b;
import p547hb.g$$c;
import p547hb.g$$d;
import p547hb.g$$f;
import p747xb.C91145a;
import p927ab.C79484f;
import p935cb.C79973e;
import p935cb.C79977g;
import p935cb.C79979h;
import p935cb.C79980i;
import p935cb.C79985j;
import p958eb.C86474e;
import p958eb.C86476g;
import p963fc.C86812g;
import p985jb.C87912b;
import qq0.C89829z;
import rq0.C90086e;
import rq0.C90091i;
import rx3.C13598b0;
import u24.C90595a;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.luggage.game.page.b */
public class C80211b<PAGE extends C90630c> extends C91145a<PAGE> implements C87464c, C80209a.C80210c {

    /* renamed from: f */
    public WAGamePageViewContainerLayout f234768f;

    /* renamed from: g */
    public MagicBrushView f234769g;

    /* renamed from: h */
    public C83873p2 f234770h;

    /* renamed from: i */
    public C80209a f234771i;

    /* renamed from: j */
    public final AtomicBoolean f234772j = new AtomicBoolean(false);

    /* renamed from: n */
    public final AtomicBoolean f234773n = new AtomicBoolean(true);

    /* renamed from: o */
    public Bitmap f234774o;

    /* renamed from: p */
    public Bitmap f234775p;

    /* renamed from: q */
    public ImageView f234776q;

    /* renamed from: r */
    public final C46016a f234777r = new C46016a();

    /* renamed from: s */
    public final AtomicBoolean f234778s = new AtomicBoolean(false);

    /* renamed from: t */
    public final ArrayList<C87685a> f234779t = new ArrayList<>(3);

    /* renamed from: u */
    public final View.OnAttachStateChangeListener f234780u = new C80212a();

    /* renamed from: com.tencent.luggage.game.page.b$a */
    public class C80212a implements View.OnAttachStateChangeListener {

        /* renamed from: com.tencent.luggage.game.page.b$a$a */
        public class C80213a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View.OnAttachStateChangeListener f234782d;

            public C80213a(View.OnAttachStateChangeListener onAttachStateChangeListener) {
                this.f234782d = onAttachStateChangeListener;
            }

            public void run() {
                C80211b.this.f234768f.removeOnAttachStateChangeListener(this.f234782d);
            }
        }

        public C80212a() {
        }

        public void onViewAttachedToWindow(View view) {
            Log.m105924i("Luggage.Game.WAGamePageViewRenderer", "WAGamePageView onAttachedToWindow, notify mb foreground once");
            C80211b.this.f234769g.getMagicBrush().mo111506d();
            C80211b.this.f234769g.post(new C80213a(this));
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.tencent.luggage.game.page.b$b */
    public class C80214b implements C83809g3 {
        public C80214b() {
        }

        /* renamed from: a */
        public void mo111277a(AppBrandPageFullScreenView appBrandPageFullScreenView) {
            if (appBrandPageFullScreenView != null && appBrandPageFullScreenView.getParent() == null) {
                C80211b.this.f234768f.addView(appBrandPageFullScreenView, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    /* renamed from: com.tencent.luggage.game.page.b$c */
    public class C80215c implements C83833j3 {
        public C80215c() {
        }
    }

    /* renamed from: com.tencent.luggage.game.page.b$d */
    public class C80216d implements Runnable {
        public C80216d() {
        }

        public void run() {
            ImageView imageView = C80211b.this.f234776q;
            if (imageView != null) {
                if (imageView.getDrawable() instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) C80211b.this.f234776q.getDrawable();
                    C80211b.this.f234776q.setImageDrawable((Drawable) null);
                    try {
                        bitmapDrawable.getBitmap().recycle();
                    } catch (Exception e) {
                        Log.printErrStackTrace("Luggage.Game.WAGamePageViewRenderer", e, "hy: cleanupCoverScreenshot error!", new Object[0]);
                    }
                }
                C80211b.this.f234776q.setVisibility(8);
            }
        }
    }

    /* renamed from: com.tencent.luggage.game.page.b$e */
    public class C80217e implements Runnable {
        public C80217e() {
        }

        public void run() {
            C80211b.this.mo111256g0();
            C80211b.this.f234768f.setOnConfigurationChangedListener((WAGamePageViewContainerLayout.C80207a) null);
        }
    }

    /* renamed from: com.tencent.luggage.game.page.b$f */
    public class C80218f implements WAGamePageViewContainerLayout.C80207a {

        /* renamed from: a */
        public final /* synthetic */ boolean f234788a;

        public C80218f(boolean z) {
            this.f234788a = z;
        }
    }

    /* renamed from: com.tencent.luggage.game.page.b$g */
    public class C80219g implements Runnable {
        public C80219g() {
        }

        public void run() {
            C80211b.this.f234776q.setVisibility(0);
            C80211b bVar = C80211b.this;
            bVar.f234776q.setImageBitmap(bVar.f234774o);
        }
    }

    public C80211b(PAGE page) {
        super(page);
        mo111265k0();
        mo111248X(new C87686c(), true);
        C91640i<? extends C91635f> iVar = page.mo116160O0().f262593H;
        synchronized (this.f260368e) {
            ((HashMap) this.f260368e).putAll(iVar.f260368e);
        }
    }

    /* renamed from: C */
    public void mo111238C() {
    }

    /* renamed from: D */
    public Bitmap mo111239D(int i, boolean z) {
        Log.m105924i("Luggage.Game.WAGamePageViewRenderer", "got message doGetCanvasBitmap");
        Bitmap bitmap = null;
        if (i == -1) {
            Log.m105920e("Luggage.Game.WAGamePageViewRenderer", "got message doGetCanvasBitmap canvasId is illegal");
            return null;
        }
        Log.m105925i("Luggage.Game.WAGamePageViewRenderer", "got message doGetCanvasBitmap canvasId:%d,sync:%b", Integer.valueOf(i), Boolean.valueOf(z));
        MagicBrushView magicBrushView = this.f234769g;
        if (magicBrushView == null) {
            Log.m105921e("Luggage.Game.WAGamePageViewRenderer", "captureCanvas with [%d], view == null", Integer.valueOf(i));
        } else {
            bitmap = magicBrushView.getMagicBrush().f235098n.mo123492a(this.f234769g.getVirtualElementId(), i, false, 2500);
        }
        Log.m105924i("Luggage.Game.WAGamePageViewRenderer", "got message doGetCanvasBitmap end");
        return bitmap;
    }

    /* renamed from: E */
    public void mo111237E(View view) {
        if (view.getVisibility() == 0 && this.f234778s.compareAndSet(false, true)) {
            ((C90630c) mo124764Z()).mo116176e1("onNativeWidgetViewAdded");
        }
    }

    /* renamed from: F */
    public C83797e3 mo111240F(Context context) {
        return this.f234777r;
    }

    /* renamed from: G */
    public View mo111241G(LayoutInflater layoutInflater) {
        WAGamePageViewContainerLayout wAGamePageViewContainerLayout = new WAGamePageViewContainerLayout(layoutInflater.getContext(), (AttributeSet) null);
        this.f234768f = wAGamePageViewContainerLayout;
        return wAGamePageViewContainerLayout;
    }

    /* renamed from: H */
    public void mo111242H(C87685a aVar) {
        this.f234779t.remove(aVar);
    }

    /* renamed from: J */
    public boolean mo111243J(String str, C83817h4 h4Var) {
        return true;
    }

    /* renamed from: K */
    public void mo111244K() {
        super.mo111244K();
        this.f234769g.getMagicBrush().mo111504c();
    }

    /* renamed from: L */
    public Bitmap mo111245L() {
        if (this.f234775p == null) {
            return null;
        }
        Log.m105924i("Luggage.Game.WAGamePageViewRenderer", "hy: getCanvasSecurityGuardBitmap");
        return this.f234775p;
    }

    /* renamed from: T */
    public void mo111246T() {
        mo124765a0(C90091i.class, new C87912b((C83780d1) mo124764Z()));
        mo124765a0(C90086e.class, new C87467f((C83780d1) mo124764Z(), mo116498d0().mo113008F().f239611q.f239621a));
        if (((C90630c) mo124764Z()).f244577X instanceof C86127t) {
            this.f234768f.f234759e = ((C86127t) ((C90630c) mo124764Z()).f244577X).mo120548w();
        }
    }

    /* renamed from: W */
    public void mo111247W(View view) {
        Class cls = C86474e.class;
        C86474e eVar = (C86474e) mo116072t(cls);
        if (eVar == null) {
            Log.printErrStackTrace("Luggage.Game.WAGamePageViewRenderer", new C86476g(), "hy: not on game service!", new Object[0]);
            return;
        }
        MagicBrushView i0 = mo111261i0(mo125216c0());
        this.f234769g = i0;
        i0.setId(C0966R.C0970id.f5902ru);
        C80301a U = eVar.mo120910U();
        this.f234769g.setMagicBrush(U);
        U.f235095k.mo125229a(new g$$f(this));
        this.f234768f.addView(this.f234769g, 0, new FrameLayout.LayoutParams(-1, -1));
        C80209a aVar = new C80209a(mo125216c0());
        this.f234771i = aVar;
        aVar.setNativeWidgetAddedCallback(this);
        this.f234768f.addView(this.f234771i, -1, new ViewGroup.LayoutParams(-1, -1));
        C87463b bVar = new C87463b(this.f234771i);
        this.f234770h = bVar;
        C39836d F0 = ((C90630c) mo124764Z()).mo116151F0();
        bVar.f244874h = F0;
        F0.mo62473a(new C83863o2(bVar));
        this.f234770h.mo116445w(new C80214b());
        C83873p2 p2Var = this.f234770h;
        C80215c cVar = new C80215c();
        p2Var.getClass();
        Log.m105925i("MicroMsg.AppBrandWebViewCustomViewContainer", "setUnderViewAttacher notnull:%b", Boolean.TRUE);
        p2Var.f244879m = cVar;
        FrameLayout frameLayout = p2Var.f244878l;
        if (frameLayout != null && frameLayout.getParent() == null) {
            this.f234768f.addView(frameLayout, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        boolean z = ((C90630c) mo124764Z()).getRuntime().mo113051d0().f234889w;
        boolean z2 = ((C90630c) mo124764Z()).getRuntime().mo113051d0().f234889w;
        if (z || z2) {
            C86474e eVar2 = (C86474e) ((C90630c) mo124764Z()).mo116160O0().mo125517G0(cls);
            if (eVar2 != null) {
                C79980i A = eVar2.mo120894A();
                C82554k kVar = (C82554k) mo124764Z();
                C80301a U2 = eVar2.mo120910U();
                WAGamePageViewContainerLayout wAGamePageViewContainerLayout = this.f234768f;
                C87470h hVar = new C87470h(this, eVar2);
                A.getClass();
                A.f234269f = U2;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new IllegalStateException("You can only init GameInspector in main thread.");
                } else if (A.f234267d == 0) {
                    A.f234264a = wAGamePageViewContainerLayout.getContext();
                    if (z) {
                        C79977g gVar = new C79977g(A.f234264a);
                        A.f234265b = gVar;
                        gVar.f234260i = hVar;
                    }
                    if (z2) {
                        C80301a aVar2 = A.f234269f;
                        Context context = A.f234264a;
                        if (C79484f.f233043b == null) {
                            synchronized (C79484f.class) {
                                if (C79484f.f233043b == null) {
                                    C79484f.f233043b = new C79484f();
                                }
                            }
                        }
                        C79484f fVar = C79484f.f233043b;
                        fVar.getClass();
                        Class cls2 = C1523c3.class;
                        if (C86312j.m106916h(cls2)) {
                            ((C1523c3) C86312j.m106911c(cls2)).waitFor();
                        }
                        A.f234266c = new C79973e(fVar.f233044a, aVar2, context, kVar);
                    }
                    wAGamePageViewContainerLayout.setClipChildren(false);
                    float f = A.f234264a.getResources().getDisplayMetrics().density;
                    if (A.f234266c != null) {
                        wAGamePageViewContainerLayout.addView(A.f234266c.f234247a.getView(), new FrameLayout.LayoutParams(-1, -1));
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 8388693;
                        layoutParams.bottomMargin = (int) (55.0f * f);
                        int i = (int) (15.0f * f);
                        layoutParams.rightMargin = i;
                        layoutParams.leftMargin = i;
                        wAGamePageViewContainerLayout.addView(A.f234266c.f234251e, layoutParams);
                    }
                    if (A.f234265b != null) {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams2.topMargin = C89923l.f258408a.mo117501g(A.f234264a);
                        layoutParams2.leftMargin = (int) (f * 16.0f);
                        wAGamePageViewContainerLayout.addView(A.f234265b, layoutParams2);
                    }
                    synchronized (A.f234268e) {
                        if (A.f234267d == 0) {
                            A.f234267d = 1;
                            if (z2 && A.f234266c != null) {
                                C79973e eVar3 = A.f234266c;
                                eVar3.f234247a.getView().post(new C79979h(A));
                            }
                        }
                    }
                }
            } else {
                Log.printErrStackTrace("Luggage.Game.WAGamePageViewRenderer", new C86476g(), "hy: you're not on game service!", new Object[0]);
            }
        }
        ImageView imageView = new ImageView(mo125216c0());
        this.f234776q = imageView;
        imageView.setVisibility(8);
        this.f234768f.addView(this.f234776q, new FrameLayout.LayoutParams(-1, -1));
        this.f234768f.addOnAttachStateChangeListener(this.f234780u);
    }

    /* renamed from: X */
    public void mo111248X(C87685a aVar, boolean z) {
        if (z) {
            this.f234779t.add(0, aVar);
        } else {
            this.f234779t.add(aVar);
        }
    }

    /* renamed from: a */
    public boolean mo111249a(int i, String str) {
        ((C90630c) mo124764Z()).mo116160O0().mo109647a(i, str);
        return true;
    }

    /* renamed from: b */
    public void mo111250b() {
        super.mo111250b();
        mo111256g0();
        mo111255f0();
        C119179t tVar = C119157j.f356862d;
        ArrayList<C87685a> arrayList = this.f234779t;
        Objects.requireNonNull(arrayList);
        ((C119157j) tVar).mo183895z(new g$$c(arrayList));
        Class cls = C86474e.class;
        if (!(mo124764Z() == null || ((C90630c) mo124764Z()).mo116160O0() == null || ((C90630c) mo124764Z()).mo116160O0().mo125517G0(cls) == null)) {
            C79980i A = ((C86474e) ((C90630c) mo124764Z()).mo116160O0().mo125517G0(cls)).mo120894A();
            A.f234267d = 2;
            A.f234270g.f256078a.clear();
            A.f234269f = null;
            if (A.f234266c != null) {
                A.f234266c.f234247a.destroy();
                A.f234266c = null;
            }
            C79977g gVar = A.f234265b;
            if (gVar != null) {
                gVar.f234261j.stopTimer();
                gVar.f234260i = null;
                ((ArrayList) gVar.f234258g).clear();
                A.f234265b = null;
            }
        }
        WAGamePageViewContainerLayout wAGamePageViewContainerLayout = this.f234768f;
        if (wAGamePageViewContainerLayout != null && wAGamePageViewContainerLayout.f234759e != null) {
            wAGamePageViewContainerLayout.f234759e = null;
        }
    }

    /* renamed from: c */
    public MagicBrushView mo111251c() {
        return this.f234769g;
    }

    /* renamed from: e */
    public boolean mo111252e(String str, String str2, int[] iArr) {
        ((C90630c) mo124764Z()).mo116160O0().mo109652f(str, str2, 0);
        return true;
    }

    /* renamed from: e0 */
    public final void mo111253e0(ArrayList<C87685a> arrayList, C32226l<Bitmap, C13598b0> lVar) {
        C86812g d0 = mo116498d0();
        if (d0 == null) {
            Log.m105928w("Luggage.Game.WAGamePageViewRenderer", "hy: runtime released. no screen canvas captured");
            lVar.invoke(null);
        } else if (arrayList.isEmpty()) {
            Log.m105928w("Luggage.Game.WAGamePageViewRenderer", "hy: ran through all the delegates and not found anyone can provide with capturing");
            lVar.invoke(null);
        } else {
            arrayList.remove(0).mo9700a(d0, new g$$d(this, lVar, arrayList));
        }
    }

    /* renamed from: f */
    public boolean mo111254f(String str, String str2, int i) {
        ((C90630c) mo124764Z()).mo116160O0().mo109652f(str, str2, i);
        return true;
    }

    /* renamed from: f0 */
    public final void mo111255f0() {
        if (this.f234775p != null) {
            try {
                Log.m105924i("Luggage.Game.WAGamePageViewRenderer", "hy: cleanupCanvasSecurityGuard");
                this.f234775p.recycle();
            } catch (Exception e) {
                Log.printErrStackTrace("Luggage.Game.WAGamePageViewRenderer", e, "hy: cleanupCanvasSecurityGuard error!", new Object[0]);
            }
            this.f234775p = null;
        }
    }

    /* renamed from: g0 */
    public final void mo111256g0() {
        if (this.f234776q != null) {
            C80216d dVar = new C80216d();
            if (Looper.getMainLooper() == Looper.myLooper()) {
                dVar.run();
            } else {
                try {
                    ((C119157j) C119157j.f356862d).mo183895z(dVar).get();
                } catch (InterruptedException | ExecutionException e) {
                    Log.m105921e("Luggage.Game.WAGamePageViewRenderer", "cleanupCoverScreenshot await ui get exception %s", e);
                }
            }
        }
        Bitmap bitmap = this.f234774o;
        if (bitmap != null) {
            try {
                bitmap.recycle();
            } catch (Exception e2) {
                Log.printErrStackTrace("Luggage.Game.WAGamePageViewRenderer", e2, "hy: cleanupCoverScreenshot error!", new Object[0]);
            }
            this.f234774o = null;
        }
    }

    public C83873p2 getCustomViewContainer() {
        return this.f234770h;
    }

    /* renamed from: h */
    public void mo111258h() {
        ((C119157j) C119157j.f356862d).mo183895z(new C80217e());
    }

    /* renamed from: h0 */
    public final void mo111259h0(boolean z, boolean z2) {
        if (!this.f234772j.get()) {
            Log.m105928w("Luggage.Game.WAGamePageViewRenderer", "hy: should not show cover");
            return;
        }
        C79778e.C79780b a = ((C90630c) mo124764Z()).f244577X.getOrientationHandler().mo109917a();
        if (C90595a.m113498b(new C79778e.C79780b[]{C79778e.C79780b.LANDSCAPE_SENSOR, C79778e.C79780b.LANDSCAPE_LOCKED, C79778e.C79780b.LANDSCAPE_LEFT, C79778e.C79780b.LANDSCAPE_RIGHT}, a)) {
            Log.m105924i("Luggage.Game.WAGamePageViewRenderer", "hy:deal with landscape games");
            if (this.f234776q == null) {
                Log.m105928w("Luggage.Game.WAGamePageViewRenderer", "markBeforeStartToTransparent coverImage is NULL, return");
            } else {
                this.f234768f.setOnConfigurationChangedListener(new C80218f(z2));
            }
        } else if (z) {
            MMHandlerThread.postToMainThread(new C80219g());
        }
    }

    /* renamed from: i */
    public void mo111260i() {
        Log.m105924i("Luggage.Game.WAGamePageViewRenderer", "hy: markBeforeStartToBackground");
        try {
            mo111255f0();
            this.f234775p = this.f234769g.getMagicBrush().f235098n.mo123494c();
        } catch (Exception e) {
            Log.printErrStackTrace("Luggage.Game.WAGamePageViewRenderer", e, "hy: captureDefaultWindow error!", new Object[0]);
        }
    }

    /* renamed from: i0 */
    public MagicBrushView mo111261i0(Context context) {
        return new MagicBrushView(context, MagicBrushView.C80327h.SurfaceView);
    }

    /* renamed from: j */
    public C83827i3 mo111262j() {
        return this.f234771i;
    }

    /* renamed from: j0 */
    public final C83181q mo111263j0() {
        if (mo116498d0() == null || mo116498d0().mo113047b0().getJsRuntime() == null) {
            return null;
        }
        return (C83181q) mo116498d0().mo113047b0().getJsRuntime().mo63321n0(C83181q.class);
    }

    /* renamed from: k */
    public void mo111264k() {
        super.mo111264k();
        this.f234772j.set(false);
        if (this.f234773n.get()) {
            mo111256g0();
        }
        mo111255f0();
        this.f234769g.getMagicBrush().mo111506d();
    }

    /* renamed from: k0 */
    public void mo111265k0() {
        mo124765a0(C87464c.class, this);
    }

    /* renamed from: l */
    public void mo111266l(boolean z, boolean z2, C87685a aVar) {
        mo111256g0();
        this.f234773n.set(z2);
        this.f234772j.set(true);
        if (mo111263j0() == null || mo111263j0().mo115422q()) {
            Log.m105924i("Luggage.Game.WAGamePageViewRenderer", "hy:markBeforeStartToTransparent");
            mo111270v(new g$$b(this, aVar, z, z2));
        }
    }

    /* renamed from: l0 */
    public void mo111267l0(MBRuntime mBRuntime, List<C79985j> list) {
        C89153a aVar;
        if (mBRuntime == null) {
            Log.m105920e("Luggage.Game.WAGamePageViewRenderer", "hy: can not retrieve runtime!");
            return;
        }
        C89157e eVar = mBRuntime.f235059h;
        synchronized (eVar.f256898a) {
            aVar = eVar.f256900c;
        }
        list.add(new C79985j("RT-FPS", "" + Math.round(aVar.f256873a)));
        list.add(new C79985j("EX-FPS", "" + Math.round(aVar.f256874b)));
        list.add(new C79985j("Jank", "" + aVar.f256875c));
        list.add(new C79985j("BigJank", "" + aVar.f256876d));
        list.add(new C79985j("Stutter", String.format(Locale.ENGLISH, "%.2f%%", new Object[]{Float.valueOf(aVar.f256877e * 100.0f)})));
    }

    /* renamed from: p */
    public Map<String, C82870p> mo111268p() {
        return Collections.emptyMap();
    }

    /* renamed from: r */
    public RelativeLayout.LayoutParams mo111269r(View view, View view2) {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    /* renamed from: v */
    public void mo111270v(C32226l<Bitmap, C13598b0> lVar) {
        C83181q j0 = mo111263j0();
        if (j0 != null) {
            j0.post(new g$$a(this, lVar));
            return;
        }
        Log.m105928w("Luggage.Game.WAGamePageViewRenderer", "hy: js thread handler is empty");
        if (lVar != null) {
            lVar.invoke(null);
        }
    }

    /* renamed from: w */
    public boolean mo111271w() {
        return false;
    }

    /* renamed from: x */
    public void mo111272x(C79808b bVar) {
        bVar.setFullscreenMode(true);
        C89829z.m112323b(bVar.getCapsuleView());
        C89829z.m112322a(bVar);
    }

    /* renamed from: y */
    public void mo111273y() {
        if (this.f234778s.compareAndSet(false, true)) {
            ((C90630c) mo124764Z()).mo116176e1("onFirstFrame");
            C83226n.m102128e(mo125215b0(), KSProcessWeAppLaunch.stepPageReady_Game);
            C83226n.m102128e(mo125215b0(), KSProcessWeAppLaunch.stepPageInit_Game);
        }
    }
}
