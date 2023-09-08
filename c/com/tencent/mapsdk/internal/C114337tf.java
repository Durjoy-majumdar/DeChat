package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.mapsdk.internal.C114375z;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.CustomRender;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.GeometryConstants;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.tf */
public abstract class C114337tf extends C113568bp<C113961mq, VectorMap> implements C113532ba, C114007oa, C114018oo {

    /* renamed from: j */
    private static final int f342642j = 10;

    /* renamed from: k */
    private static final int f342643k = 16;

    /* renamed from: aA */
    public volatile boolean f342644aA = false;

    /* renamed from: aB */
    public volatile boolean f342645aB = false;

    /* renamed from: aC */
    public int f342646aC = 0;

    /* renamed from: aD */
    public C113961mq f342647aD;

    /* renamed from: aE */
    public float f342648aE = 0.5f;

    /* renamed from: aF */
    public int f342649aF = 0;

    /* renamed from: aG */
    public C113572bv f342650aG = null;

    /* renamed from: aH */
    public volatile boolean f342651aH;

    /* renamed from: aI */
    public TencentMap.OnPolylineClickListener f342652aI;

    /* renamed from: aJ */
    public TencentMap.OnPolygonClickListener f342653aJ;

    /* renamed from: aK */
    public TencentMap.InfoWindowAdapter f342654aK;

    /* renamed from: aw */
    public List<TencentMap.OnMapLoadedCallback> f342655aw = new CopyOnWriteArrayList();

    /* renamed from: ax */
    public TencentMapGestureListenerList f342656ax = null;

    /* renamed from: ay */
    public boolean f342657ay = true;

    /* renamed from: az */
    public volatile boolean f342658az = false;

    /* renamed from: g */
    private C114090pv f342659g;

    /* renamed from: h */
    private C113969mr f342660h;

    /* renamed from: i */
    private volatile boolean f342661i;

    /* renamed from: l */
    private boolean f342662l;

    /* renamed from: com.tencent.mapsdk.internal.tf$3 */
    public static /* synthetic */ class C1143413 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f342672a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tencent.tencentmap.mapsdk.maps.model.MapViewType[] r0 = com.tencent.tencentmap.mapsdk.maps.model.MapViewType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f342672a = r0
                com.tencent.tencentmap.mapsdk.maps.model.MapViewType r1 = com.tencent.tencentmap.mapsdk.maps.model.MapViewType.TextureView     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f342672a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.tencentmap.mapsdk.maps.model.MapViewType r1 = com.tencent.tencentmap.mapsdk.maps.model.MapViewType.RenderLayer     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f342672a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.tencentmap.mapsdk.maps.model.MapViewType r1 = com.tencent.tencentmap.mapsdk.maps.model.MapViewType.SurfaceView     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114337tf.C1143413.<clinit>():void");
        }
    }

    public C114337tf(Context context, TencentMapOptions tencentMapOptions, ViewGroup viewGroup) {
        super(context, tencentMapOptions, viewGroup);
    }

    /* renamed from: S */
    private void mo172974S() {
        C113572bv bvVar = this.f342650aG;
        if (bvVar != null) {
            bvVar.mo171862d();
        }
    }

    /* renamed from: U */
    private void mo172976U() {
        if (this.f342660h != null) {
            while (!this.f342660h.f340950b) {
                try {
                    this.f342660h.f340949a = true;
                    this.f342660h.mo172475a();
                    if (!this.f342660h.isAlive()) {
                        break;
                    }
                    this.f342660h.join();
                } catch (InterruptedException e) {
                    C113889km.m157537a(Log.getStackTraceString(e));
                }
            }
        }
        this.f342660h = null;
        this.f342661i = false;
    }

    /* renamed from: V */
    private void mo172977V() {
        long currentTimeMillis = System.currentTimeMillis();
        C113792gv gvVar = ((C113961mq) this.f339876d_).f339861d;
        if (gvVar != null) {
            gvVar.mo172154a().mo172145a(true, currentTimeMillis);
        }
        this.f342651aH = false;
    }

    /* renamed from: W */
    private void mo172978W() {
        this.f342651aH = true;
    }

    /* renamed from: ab */
    private TencentMap.InfoWindowAdapter m160327ab() {
        return this.f342654aK;
    }

    /* renamed from: ac */
    private void m160328ac() {
        this.f342644aA = true;
        TencentMapGestureListenerList tencentMapGestureListenerList = this.f342656ax;
        if (tencentMapGestureListenerList != null && this.f342657ay) {
            tencentMapGestureListenerList.onMapStable();
        }
    }

    /* renamed from: b */
    public static /* synthetic */ int m160329b(C114337tf tfVar) {
        int i = tfVar.f342649aF;
        tfVar.f342649aF = i + 1;
        return i;
    }

    /* renamed from: n */
    private void mo172985n(boolean z) {
        C113572bv bvVar = this.f342650aG;
        if (bvVar != null) {
            bvVar.setZOrderMediaOverlay(z);
        }
    }

    /* renamed from: C */
    public final C114004nx mo171539C() {
        C113961mq mqVar = this.f342647aD;
        if (mqVar == null) {
            return null;
        }
        return mqVar.f340913u;
    }

    /* renamed from: D */
    public final void mo171540D() {
        if (this.f342660h == null && this.f342647aD != null) {
            this.f342660h = new C113969mr(this.f342647aD);
        }
        if (!this.f342661i) {
            try {
                this.f342660h.start();
                this.f342661i = true;
            } catch (Exception e) {
                C113889km.m157540a("startTextureCreatorIfNeed failed", (Throwable) e);
            }
        }
    }

    /* renamed from: E */
    public final void mo171541E() {
        mo172976U();
        if (this.f342647aD != null) {
            getEGLContextHash();
            this.f342647aD.mo172411C();
        }
    }

    /* renamed from: F */
    public final void mo171542F() {
        C113572bv bvVar = this.f342650aG;
        if (bvVar != null) {
            bvVar.mo171862d();
        }
        C113961mq mqVar = this.f342647aD;
        if (mqVar != null) {
            mqVar.f340914v = true;
        }
    }

    /* renamed from: G */
    public final Context mo171543G() {
        return this.f339877e;
    }

    /* renamed from: H */
    public final void mo171544H() {
        C113961mq mqVar = this.f342647aD;
        if (mqVar != null) {
            mqVar.f340914v = true;
        }
    }

    /* renamed from: I */
    public final boolean mo171545I() {
        C113961mq mqVar = this.f342647aD;
        if (mqVar != null) {
            C114216sq sqVar = mqVar.f340899g;
            if (sqVar != null ? sqVar.mo172947j() : false) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public final boolean mo171546J() {
        C113961mq mqVar = this.f342647aD;
        if (mqVar == null) {
            return false;
        }
        return mqVar.mo172416H();
    }

    /* renamed from: K */
    public final TencentMapOptions mo171547K() {
        return this.f339879f;
    }

    /* renamed from: N */
    public final boolean mo171550N() {
        return this.f342658az;
    }

    /* renamed from: P */
    public void mo171821P() {
        super.mo171821P();
        mo171570a(this.f339879f);
    }

    /* renamed from: T */
    public void mo172975T() {
    }

    /* renamed from: X */
    public final int mo172993X() {
        C113572bv bvVar = this.f342650aG;
        if (bvVar != null) {
            return bvVar.getWidth();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: Y */
    public final int mo172994Y() {
        C113572bv bvVar = this.f342650aG;
        if (bvVar != null) {
            return bvVar.getHeight();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: Z */
    public final boolean mo172995Z() {
        Context context = this.f339877e;
        if (context == null) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    /* renamed from: aa */
    public final void mo172998aa() {
        if (!this.f342658az) {
            C113865kb.m157399a((Runnable) new Runnable() {
                public final void run() {
                    for (TencentMap.OnMapLoadedCallback next : C114337tf.this.f342655aw) {
                        if (next != null) {
                            next.onMapLoaded();
                        }
                    }
                }
            });
        }
        this.f342658az = true;
    }

    public int getEGLContextHash() {
        EGLContext eglGetCurrentContext;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        if (egl10 == null || (eglGetCurrentContext = egl10.eglGetCurrentContext()) == null) {
            return 0;
        }
        return eglGetCurrentContext.hashCode();
    }

    /* renamed from: l */
    public final void mo171613l(boolean z) {
        this.f342647aD.f340899g.mo172944h(z);
    }

    /* renamed from: m_ */
    public final void mo172580m_() {
        if (this.f342651aH) {
            long currentTimeMillis = System.currentTimeMillis();
            C113792gv gvVar = ((C113961mq) this.f339876d_).f339861d;
            if (gvVar != null) {
                gvVar.mo172154a().mo172145a(true, currentTimeMillis);
            }
            this.f342651aH = false;
        }
    }

    public void onCreated() {
        super.onCreated();
        this.f342650aG = getMapRenderView();
        this.f342659g = new C114090pv(this);
        this.f342651aH = true;
        C113961mq mqVar = ((VectorMap) this.f339878e_).f342909o;
        if (mqVar != null) {
            mqVar.f340877G = this;
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        C114136rc rcVar;
        super.onPause();
        C113969mr mrVar = this.f342660h;
        if (mrVar != null) {
            mrVar.f340949a = true;
        }
        C113961mq mqVar = this.f342647aD;
        if (mqVar.f340899g != null) {
            mqVar.f340914v = false;
            mqVar.f340872B = false;
            mqVar.mo172458h(false);
            C114141rg rgVar = mqVar.f340871A;
            if (rgVar != null) {
                rgVar.f341667g = true;
            }
            C114375z zVar = mqVar.f340901i.f339685o;
            if (zVar != null) {
                zVar.mo173093a();
            }
            mqVar.f340899g.mo172951m();
            if (mqVar.f340909q && (rcVar = mqVar.f340902j) != null) {
                rcVar.mo172756a();
            }
        }
    }

    public void onResume() {
        C114136rc rcVar;
        super.onResume();
        C113969mr mrVar = this.f342660h;
        if (mrVar != null) {
            mrVar.f340949a = false;
            synchronized (mrVar) {
                mrVar.notifyAll();
            }
        }
        C113961mq mqVar = this.f342647aD;
        if (mqVar.f340899g != null) {
            mqVar.f340914v = true;
            mqVar.f340872B = true;
            mqVar.mo172458h(true);
            if (mqVar.f340915w) {
                C114375z zVar = mqVar.f340901i.f339685o;
                C114375z.C114376a aVar = zVar.f342855d;
                if (aVar != null) {
                    aVar.destroy();
                }
                C114375z.C114376a aVar2 = new C114375z.C114376a();
                zVar.f342855d = aVar2;
                aVar2.start();
                mqVar.f340915w = false;
            } else {
                C114375z zVar2 = mqVar.f340901i.f339685o;
                if (zVar2 != null) {
                    zVar2.mo173096b();
                }
            }
            C113532ba baVar = mqVar.f340905m;
            if (baVar != null) {
                baVar.getMapRenderView().mo171862d();
            }
            if (mqVar.f340908p) {
                mqVar.f340899g.mo172950l();
            }
            if (mqVar.f340909q && (rcVar = mqVar.f340902j) != null) {
                rcVar.mo172757b();
            }
            C114141rg rgVar = mqVar.f340871A;
            if (rgVar != null) {
                rgVar.f341667g = false;
                synchronized (rgVar.f341670j) {
                    rgVar.f341670j.notifyAll();
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C114090pv pvVar = this.f342659g;
        if (pvVar != null) {
            return pvVar.onTouch((View) null, motionEvent);
        }
        return false;
    }

    /* renamed from: c */
    public final C113960mp mo171585c() {
        return this.f342647aD.f340904l;
    }

    /* renamed from: a */
    public VectorMap mo171826b(C113961mq mqVar) {
        return new VectorMap(mqVar);
    }

    /* renamed from: b */
    public final /* synthetic */ C113572bv mo171827b(C113565bo boVar, ViewGroup viewGroup) {
        C113572bv bvVar;
        C113961mq mqVar = (C113961mq) boVar;
        int i = C1143413.f342672a[this.f339876d_.f339858a.getMapViewType().ordinal()];
        if (i == 1) {
            bvVar = new C114357ti(mqVar);
        } else if (i != 2) {
            bvVar = new C114358tj(mqVar);
        } else {
            bvVar = new C114356th(mqVar);
        }
        if (viewGroup != null) {
            viewGroup.addView(bvVar.getView());
        }
        return bvVar;
    }

    /* renamed from: a */
    private C113572bv m160322a(C113961mq mqVar, ViewGroup viewGroup) {
        C113572bv bvVar;
        int i = C1143413.f342672a[this.f339876d_.f339858a.getMapViewType().ordinal()];
        if (i == 1) {
            bvVar = new C114357ti(mqVar);
        } else if (i != 2) {
            bvVar = new C114358tj(mqVar);
        } else {
            bvVar = new C114356th(mqVar);
        }
        if (viewGroup != null) {
            viewGroup.addView(bvVar.getView());
        }
        return bvVar;
    }

    /* renamed from: c */
    public static float m160331c(float f) {
        int i = (int) f;
        return ((float) (1 << (i - 3))) * 3.0517578E-5f * ((float) Math.pow(2.0d, (double) (f - ((float) i))));
    }

    /* renamed from: b */
    private C113961mq m160330b(Context context, TencentMapOptions tencentMapOptions) {
        C113961mq mqVar = new C113961mq(context, tencentMapOptions, this);
        this.f342647aD = mqVar;
        return mqVar;
    }

    /* renamed from: a */
    public final void mo171559a(C113711ev evVar) {
        this.f342659g.mo172674a(evVar);
    }

    /* renamed from: a */
    public final void mo171563a(C114009oc ocVar) {
        this.f342647aD.mo172433a(ocVar);
    }

    /* renamed from: b */
    public final void mo171579b(C113711ev evVar) {
        C114090pv pvVar = this.f342659g;
        synchronized (pvVar.f341438a) {
            pvVar.f341438a.mo172683b(evVar);
        }
    }

    /* renamed from: a */
    public final void mo171562a(C114004nx nxVar, C113932lh lhVar) {
        if (this.f342647aD.mo172443a(this.f339877e.getApplicationContext(), nxVar, lhVar, (C114007oa) this)) {
            C113503ad adVar = this.f342647aD.f340901i;
            GeoPoint geoPoint = new GeoPoint(C113503ad.f339662n, C113503ad.f339661m);
            C114367v vVar = adVar.f339663A;
            Rect g = adVar.f339696z.mo171639g();
            int latitudeE6 = geoPoint.getLatitudeE6();
            int longitudeE6 = geoPoint.getLongitudeE6();
            vVar.f342795n = g;
            vVar.f342784c = GeometryConstants.BOUNDARY_WORLD;
            vVar.mo173066c(13);
            vVar.mo173062a(0);
            vVar.mo173063a(latitudeE6, longitudeE6, false);
            adVar.f339696z.mo171638f().mo172932b(adVar.f339669G);
        }
    }

    /* renamed from: b */
    public final C113961mq mo171576b() {
        return this.f342647aD;
    }

    /* renamed from: b */
    public final boolean mo172563b(int i) {
        CustomRender customRender;
        C113961mq mqVar = this.f342647aD;
        if (mqVar == null || i != C113961mq.C113964b.AboveToplayer.f340927g || (customRender = mqVar.f340876F) == null) {
            return false;
        }
        customRender.onDrawFrame();
        return true;
    }

    /* renamed from: a */
    public final void mo171553a(float f, float f2, float f3) {
        C113961mq mqVar = this.f342647aD;
        if (mqVar != null) {
            float f4 = mqVar.f340901i.f339663A.f342783b.f342820p;
            final float c = m160331c(f3);
            final boolean z = ((double) Math.abs(f4 - c)) > 1.0E-4d;
            this.f342649aF = 0;
            final float f5 = (f2 - this.f342648aE) / 10.0f;
            final float f6 = f;
            final float f7 = f2;
            final float f8 = f3;
            C113865kb.m157399a((Runnable) new Runnable() {
                public final void run() {
                    C114337tf tfVar = C114337tf.this;
                    float unused = tfVar.f342648aE = tfVar.f342648aE + f5;
                    C114337tf tfVar2 = C114337tf.this;
                    tfVar2.f342647aD.f340901i.mo171223b(f6, tfVar2.f342648aE, true);
                    if (C114337tf.m160329b(C114337tf.this) < 10) {
                        C113865kb.m157400a(this, 16);
                        return;
                    }
                    C114337tf.this.f342647aD.f340901i.mo171223b(f6, f7, true);
                    float f = f8;
                    if (f >= 3.0f && f <= 20.0f) {
                        if (z) {
                            C114337tf.this.f342647aD.f340901i.mo171207a((int) f8, (Runnable) new Runnable() {
                                public final void run() {
                                    C114337tf.this.f342647aD.f340901i.mo171202a(c);
                                }
                            });
                            return;
                        }
                        C114337tf.this.f342647aD.f340901i.mo171202a(c);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo172980a(GL10 gl10, EGLConfig eGLConfig) {
        C80350mb mbVar;
        C113961mq mqVar = this.f342647aD;
        if (mqVar.f340899g != null && (mbVar = mqVar.f340900h) != null) {
            mbVar.mo111670a();
        }
    }

    /* renamed from: a */
    public void mo172979a(GL10 gl10, int i, int i2) {
        C113961mq mqVar = this.f342647aD;
        if (mqVar.f340899g != null) {
            mqVar.f340914v = true;
            mqVar.f340907o.set(0, 0, i, i2);
            mqVar.mo172428a(0, 0, i, i2, false);
            mqVar.f340901i.mo171251n();
        }
    }

    /* renamed from: a */
    public boolean mo172983a(GL10 gl10) {
        return this.f342647aD.mo172444a(gl10);
    }

    /* renamed from: a */
    private void m160323a(float f, float f2, boolean z) {
        this.f342647aD.f340901i.mo171223b(f, f2, z);
    }

    /* renamed from: a */
    public final void mo172997a(TencentMap.OnPolylineClickListener onPolylineClickListener) {
        this.f342652aI = onPolylineClickListener;
    }

    /* renamed from: a */
    public final void mo172996a(TencentMap.OnPolygonClickListener onPolygonClickListener) {
        this.f342653aJ = onPolygonClickListener;
    }

    /* renamed from: a */
    private void m160325a(TencentMap.InfoWindowAdapter infoWindowAdapter) {
        this.f342654aK = infoWindowAdapter;
    }

    /* renamed from: a */
    private void m160326a(TencentMap.OnVectorOverlayClickListener onVectorOverlayClickListener) {
        this.f342647aD.f340881K = onVectorOverlayClickListener;
    }

    /* renamed from: a */
    public final /* synthetic */ C113565bo mo171824a(Context context, TencentMapOptions tencentMapOptions) {
        C113961mq mqVar = new C113961mq(context, tencentMapOptions, this);
        this.f342647aD = mqVar;
        return mqVar;
    }
}
