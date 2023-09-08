package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.map.lib.callbacks.TileOverlayCallback;
import com.tencent.map.lib.models.AnnocationText;
import com.tencent.map.lib.models.AnnocationTextResult;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.lib.models.IndoorCellInfo;
import com.tencent.map.lib.models.MaskLayer;
import com.tencent.map.lib.models.PolygonInfo;
import com.tencent.map.lib.models.SubMarkerInfo;
import com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.p1182od.ArcLineOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.engine.jni.JNI;
import com.tencent.mapsdk.engine.jni.models.TappedElement;
import com.tencent.mapsdk.internal.C114216sq;
import com.tencent.mapsdk.internal.C114375z;
import com.tencent.tencentmap.mapsdk.maps.CustomRender;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapComponent;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Circle;
import com.tencent.tencentmap.mapsdk.maps.model.CircleOptions;
import com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;
import com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider;
import com.tencent.tencentmap.mapsdk.maps.model.Polyline;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
import com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle;
import com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider;
import java.io.File;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.mq */
public final class C113961mq extends C113570bs implements C113536be, C113724fi {

    /* renamed from: M */
    private static final int f340866M = 50;

    /* renamed from: N */
    private static final int f340867N = 6;

    /* renamed from: P */
    private static final int f340868P = 100;

    /* renamed from: Q */
    private static final int f340869Q = 100;

    /* renamed from: R */
    private static final float f340870R = 2.0f;

    /* renamed from: A */
    public C114141rg f340871A;

    /* renamed from: B */
    public boolean f340872B = true;

    /* renamed from: C */
    public Rect f340873C;

    /* renamed from: D */
    public int f340874D = 18;

    /* renamed from: E */
    public int f340875E = 14;

    /* renamed from: F */
    public CustomRender f340876F;

    /* renamed from: G */
    public C114018oo f340877G;

    /* renamed from: H */
    public C114117qo f340878H;

    /* renamed from: I */
    public List<C114016om> f340879I;

    /* renamed from: J */
    public C113551bi f340880J;

    /* renamed from: K */
    public TencentMap.OnVectorOverlayClickListener f340881K;

    /* renamed from: L */
    public C113711ev f340882L = null;

    /* renamed from: O */
    private final int f340883O;

    /* renamed from: S */
    private final LinkedBlockingQueue<C113963a> f340884S;

    /* renamed from: T */
    private C114009oc f340885T;

    /* renamed from: U */
    private C55065kz<Integer, Integer> f340886U;

    /* renamed from: V */
    private C55065kz<Integer, List<Integer>> f340887V;

    /* renamed from: W */
    private boolean f340888W = true;

    /* renamed from: X */
    private boolean f340889X = false;

    /* renamed from: Y */
    private int f340890Y = 0;

    /* renamed from: Z */
    private int f340891Z = 0;

    /* renamed from: aa */
    private float f340892aa = 0.5f;

    /* renamed from: ab */
    private float f340893ab = 0.5f;

    /* renamed from: ac */
    private boolean f340894ac = true;

    /* renamed from: ad */
    private Rect f340895ad;

    /* renamed from: ae */
    private boolean f340896ae;

    /* renamed from: af */
    private int f340897af;

    /* renamed from: ag */
    private String f340898ag;

    /* renamed from: g */
    public C114216sq f340899g;

    /* renamed from: h */
    public C80350mb f340900h;

    /* renamed from: i */
    public C113503ad f340901i;

    /* renamed from: j */
    public C114136rc f340902j;

    /* renamed from: k */
    public C113554bj f340903k;

    /* renamed from: l */
    public C113960mp f340904l;

    /* renamed from: m */
    public C113532ba f340905m;

    /* renamed from: n */
    public C113707es f340906n;

    /* renamed from: o */
    public Rect f340907o;

    /* renamed from: p */
    public boolean f340908p;

    /* renamed from: q */
    public boolean f340909q;

    /* renamed from: r */
    public C114371w f340910r;

    /* renamed from: s */
    public C113967e f340911s;

    /* renamed from: t */
    public C114367v f340912t;

    /* renamed from: u */
    public C114004nx f340913u;

    /* renamed from: v */
    public volatile boolean f340914v = false;

    /* renamed from: w */
    public boolean f340915w = true;

    /* renamed from: x */
    public C114005ny f340916x;

    /* renamed from: y */
    public C113965c f340917y;

    /* renamed from: z */
    public C113966d f340918z;

    /* renamed from: com.tencent.mapsdk.internal.mq$a */
    public interface C113963a {
        /* renamed from: a */
        void mo54067a(GL10 gl10);
    }

    /* renamed from: com.tencent.mapsdk.internal.mq$b */
    public enum C113964b {
        UnderMainMap(2),
        Under3DBuiding(4),
        UnderHandDraw(6),
        UnderPoi(8),
        UnderToplayer(10),
        AboveToplayer(12);
        

        /* renamed from: g */
        public int f340927g;

        private C113964b(int i) {
            this.f340927g = i;
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.mq$d */
    public class C113966d implements C113718fc {

        /* renamed from: a */
        public List<MapRouteSection> f340930a;

        /* renamed from: b */
        public List<GeoPoint> f340931b;

        public C113966d() {
            C113961mq.this.mo172430a((C113718fc) this);
        }

        /* renamed from: a */
        private void m158201a() {
            C113961mq.this.mo172448b((C113718fc) this);
        }

        /* renamed from: b */
        private void m158203b() {
            C113961mq.this.f340899g.mo172961w();
            this.f340930a = null;
            this.f340931b = null;
        }

        /* renamed from: a */
        private void m158202a(List<MapRouteSection> list, List<GeoPoint> list2) {
            this.f340930a = list;
            this.f340931b = list2;
            C113961mq.this.f340899g.mo172919a(list, list2);
        }

        /* renamed from: a */
        public final void mo172060a(Language language) {
            if (language != Language.zh) {
                C113961mq.this.f340899g.mo172961w();
            } else if (this.f340930a != null && this.f340931b != null) {
                C113961mq.this.f340899g.mo172919a(this.f340930a, this.f340931b);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.mq$e */
    public class C113967e {

        /* renamed from: b */
        private final ArrayList<C113968f> f340934b;

        /* renamed from: c */
        private C113968f f340935c;

        public /* synthetic */ C113967e(C113961mq mqVar, byte b) {
            this();
        }

        /* renamed from: d */
        private C113968f m158209d() {
            C113968f fVar;
            synchronized (this.f340934b) {
                fVar = this.f340934b.size() > 0 ? this.f340934b.get(0) : null;
            }
            return fVar;
        }

        /* renamed from: b */
        public final boolean mo172470b() {
            boolean z;
            synchronized (this.f340934b) {
                ArrayList<C113968f> arrayList = this.f340934b;
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        z = false;
                    }
                }
                z = true;
            }
            return z;
        }

        /* renamed from: c */
        public final synchronized C113968f mo172471c() {
            C113968f d = m158209d();
            this.f340935c = d;
            if (d == null) {
                return null;
            }
            if (d.mo172474c()) {
                m158208a(this.f340935c);
                return null;
            }
            C113961mq.this.f340901i.mo171242e();
            C113968f fVar = this.f340935c;
            Rect rect = fVar.f340944i;
            int i = fVar.f340942g;
            int i2 = fVar.f340943h;
            Rect rect2 = new Rect();
            int a = (int) (C113801hf.m157135a(C113961mq.this.getContext()) * 20.0f);
            int width = ((C113961mq.this.f340907o.width() - i) / 2) + a;
            rect2.right = width;
            rect2.left = width;
            int height = ((C113961mq.this.f340907o.height() - i2) / 2) + a;
            rect2.bottom = height;
            rect2.top = height;
            C113961mq.this.f340901i.mo171239c(rect, rect2);
            return this.f340935c;
        }

        private C113967e() {
            this.f340934b = new ArrayList<>();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m158206a(C113709et etVar, Rect rect, C113725fj fjVar, int i, int i2) {
            C113968f fVar = new C113968f(C113961mq.this, etVar, rect, fjVar, i, i2, (byte) 0);
            synchronized (this.f340934b) {
                this.f340934b.add(fVar);
            }
            C113889km.m157537a("snapshot addSnapshotRequest");
            C113961mq.this.f340914v = true;
        }

        /* renamed from: a */
        public final synchronized void mo172467a() {
            C113889km.m157537a("snapshot cancel");
            synchronized (this.f340934b) {
                this.f340934b.clear();
            }
            C113968f fVar = this.f340935c;
            if (fVar != null) {
                fVar.f340945j = 1;
                fVar.f340940e = 0;
            }
        }

        /* renamed from: a */
        public final synchronized void mo172469a(GL10 gl10, C113960mp mpVar) {
            if (C113961mq.this.f340899g != null) {
                C113709et etVar = this.f340935c.f340941f;
                if (etVar != null) {
                    etVar.mo171427a(gl10);
                }
                mpVar.mo172409a();
            }
        }

        /* renamed from: a */
        public final synchronized void mo172468a(GL10 gl10) {
            C113968f fVar = this.f340935c;
            if (fVar != null && !fVar.mo172474c()) {
                C113968f fVar2 = this.f340935c;
                m158205a(gl10, fVar2.f340942g, fVar2.f340943h);
                m158208a(this.f340935c);
            }
        }

        /* renamed from: a */
        private void m158208a(C113968f fVar) {
            if (fVar != null && !fVar.mo172472a()) {
                fVar.mo172473b();
                synchronized (this.f340934b) {
                    this.f340934b.remove(fVar);
                }
                C113961mq.this.f340901i.mo171243f();
            }
        }

        /* renamed from: a */
        private Bitmap m158205a(GL10 gl10, int i, int i2) {
            int i3 = i * i2;
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            IntBuffer wrap = IntBuffer.wrap(iArr);
            wrap.position(0);
            gl10.glReadPixels((C113961mq.this.f340907o.width() - i) / 2, (C113961mq.this.f340907o.height() - i2) / 2, i, i2, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, wrap);
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i; i5++) {
                    int i6 = iArr[(i4 * i) + i5];
                    iArr2[(((i2 - i4) - 1) * i) + i5] = (i6 & -16711936) | ((i6 << 16) & 16711680) | ((i6 >> 16) & 255);
                }
            }
            try {
                return Bitmap.createBitmap(iArr2, i, i2, Bitmap.Config.RGB_565);
            } catch (OutOfMemoryError unused) {
                return Bitmap.createBitmap(iArr2, i, i2, Bitmap.Config.RGB_565);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.mq$f */
    public class C113968f {

        /* renamed from: a */
        public static final int f340936a = 0;

        /* renamed from: b */
        public static final int f340937b = 1;

        /* renamed from: c */
        public static final int f340938c = 2;

        /* renamed from: d */
        public static final int f340939d = 3;

        /* renamed from: e */
        public int f340940e;

        /* renamed from: f */
        public C113709et f340941f;

        /* renamed from: g */
        public int f340942g;

        /* renamed from: h */
        public int f340943h;

        /* renamed from: i */
        public Rect f340944i;

        /* renamed from: j */
        public int f340945j;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C113725fj f340947l;

        public /* synthetic */ C113968f(C113961mq mqVar, C113709et etVar, Rect rect, C113725fj fjVar, int i, int i2, byte b) {
            this(etVar, rect, fjVar, i, i2);
        }

        /* renamed from: c */
        private static /* synthetic */ int m158218c(C113968f fVar) {
            int i = fVar.f340940e;
            fVar.f340940e = i + 1;
            return i;
        }

        private C113968f(C113709et etVar, Rect rect, C113725fj fjVar, int i, int i2) {
            this.f340940e = 0;
            this.f340941f = etVar;
            this.f340944i = rect;
            this.f340947l = fjVar;
            this.f340942g = i;
            this.f340943h = i2;
            this.f340945j = 0;
        }

        /* renamed from: d */
        private void m158220d() {
            this.f340945j = 1;
            this.f340940e = 0;
        }

        /* renamed from: e */
        private boolean m158222e() {
            StringBuilder sb = new StringBuilder("is processing:");
            sb.append(this.f340945j == 3);
            C113889km.m157537a(sb.toString());
            return this.f340945j == 3;
        }

        /* renamed from: a */
        public final synchronized boolean mo172472a() {
            return this.f340945j == 2;
        }

        /* renamed from: b */
        public final synchronized void mo172473b() {
            this.f340945j = 2;
            this.f340940e = 0;
        }

        /* renamed from: c */
        public final boolean mo172474c() {
            return this.f340945j == 1;
        }

        /* renamed from: a */
        private void m158216a(int i) {
            this.f340945j = i;
        }
    }

    public C113961mq(Context context, TencentMapOptions tencentMapOptions, C113568bp bpVar) {
        super(context, tencentMapOptions, bpVar);
        C113532ba baVar = (C113532ba) bpVar;
        this.f340905m = baVar;
        this.f340880J = new C113551bi(baVar, this);
        this.f340899g = new C114216sq(context, this);
        this.f340912t = new C114367v(this);
        this.f340907o = new Rect();
        C113554bj bjVar = new C113554bj(this.f340880J, this);
        this.f340903k = bjVar;
        this.f340905m.mo171557a((C113534bc) bjVar);
        this.f340878H = new C114117qo(getContext(), this);
        this.f340906n = new C114373y(this);
        C113503ad adVar = new C113503ad(this);
        this.f340901i = adVar;
        this.f340899g.f342025f = adVar;
        this.f340900h = new C80350mb();
        this.f340904l = new C113960mp(this, this.f340899g);
        this.f340911s = new C113967e(this, (byte) 0);
        this.f340884S = new LinkedBlockingQueue<>();
        this.f340879I = new CopyOnWriteArrayList();
        if (getContext() != null) {
            this.f340883O = (int) (((double) (getContext().getResources().getDisplayMetrics().density * 6.0f)) + 0.5d);
        } else {
            this.f340883O = 6;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        int width = windowManager.getDefaultDisplay().getWidth();
        int height = windowManager.getDefaultDisplay().getHeight();
        Rect rect = this.f340907o;
        if (rect != null) {
            rect.set(0, 0, width, height);
        }
    }

    /* renamed from: I */
    private C114216sq m157992I() {
        return this.f340899g;
    }

    /* renamed from: J */
    private boolean m157993J() {
        C114216sq sqVar = this.f340899g;
        if (sqVar == null || sqVar.f342024e == 0) {
            return false;
        }
        if (SystemClock.elapsedRealtime() - sqVar.f342030k > 560) {
            sqVar.f342023d.nativeClearDownloadURLCache(sqVar.f342024e);
            sqVar.f342030k = SystemClock.elapsedRealtime();
        }
        return sqVar.f342023d.nativeGenerateTextures(sqVar.f342024e);
    }

    /* renamed from: K */
    private C113932lh m157994K() {
        return this.f340913u.mo172558d();
    }

    /* renamed from: L */
    private C80350mb m157995L() {
        return this.f340900h;
    }

    /* renamed from: M */
    private void m157996M() {
        C114136rc rcVar;
        if (this.f340899g != null) {
            this.f340914v = true;
            this.f340872B = true;
            mo172458h(true);
            if (this.f340915w) {
                C114375z zVar = this.f340901i.f339685o;
                C114375z.C114376a aVar = zVar.f342855d;
                if (aVar != null) {
                    aVar.destroy();
                }
                C114375z.C114376a aVar2 = new C114375z.C114376a();
                zVar.f342855d = aVar2;
                aVar2.start();
                this.f340915w = false;
            } else {
                C114375z zVar2 = this.f340901i.f339685o;
                if (zVar2 != null) {
                    zVar2.mo173096b();
                }
            }
            C113532ba baVar = this.f340905m;
            if (baVar != null) {
                baVar.getMapRenderView().mo171862d();
            }
            if (this.f340908p) {
                this.f340899g.mo172950l();
            }
            if (this.f340909q && (rcVar = this.f340902j) != null) {
                rcVar.mo172757b();
            }
            C114141rg rgVar = this.f340871A;
            if (rgVar != null) {
                rgVar.f341667g = false;
                synchronized (rgVar.f341670j) {
                    rgVar.f341670j.notifyAll();
                }
            }
        }
    }

    /* renamed from: N */
    private void m157997N() {
        C114136rc rcVar;
        if (this.f340899g != null) {
            this.f340914v = false;
            this.f340872B = false;
            mo172458h(false);
            C114141rg rgVar = this.f340871A;
            if (rgVar != null) {
                rgVar.f341667g = true;
            }
            C114375z zVar = this.f340901i.f339685o;
            if (zVar != null) {
                zVar.mo173093a();
            }
            this.f340899g.mo172951m();
            if (this.f340909q && (rcVar = this.f340902j) != null) {
                rcVar.mo172756a();
            }
        }
    }

    /* renamed from: O */
    private void m157998O() {
        C114136rc rcVar;
        if (this.f340909q && (rcVar = this.f340902j) != null) {
            rcVar.mo172756a();
        }
    }

    /* renamed from: P */
    private void m157999P() {
        if (this.f340899g != null) {
            mo172432a((C113963a) new C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C113961mq.this.f340899g != null) {
                        C113961mq.this.f340900h.mo111671a(gl10);
                    }
                }
            });
        }
    }

    /* renamed from: Q */
    private C114371w m158000Q() {
        return this.f340910r;
    }

    /* renamed from: R */
    private void m158001R() {
        C80350mb mbVar;
        if (this.f340899g != null && (mbVar = this.f340900h) != null) {
            mbVar.mo111670a();
        }
    }

    /* renamed from: S */
    private Rect m158002S() {
        return this.f340873C;
    }

    /* renamed from: T */
    private void m158003T() {
        this.f340914v = true;
    }

    /* renamed from: U */
    private int m158004U() {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            return sqVar.mo171855e();
        }
        return -1;
    }

    /* renamed from: V */
    private void m158005V() {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo171854d();
        }
    }

    /* renamed from: W */
    private void m158006W() {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo171856f();
        }
    }

    /* renamed from: X */
    private boolean m158007X() {
        return this.f340909q;
    }

    /* renamed from: Y */
    private void m158008Y() {
        if (this.f340918z == null) {
            this.f340918z = new C113966d();
        }
        C113966d dVar = this.f340918z;
        C113961mq.this.f340899g.mo172961w();
        dVar.f340930a = null;
        dVar.f340931b = null;
    }

    /* renamed from: Z */
    private boolean m158009Z() {
        C114216sq sqVar = this.f340899g;
        return sqVar != null && ((Integer) sqVar.mo172900a(new CallbackRunnable<Integer>(mo172412D()) {
            /* renamed from: a */
            private Integer m159996a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeIsCityHasTraffic(C114216sq.this.f342024e, r2));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeIsCityHasTraffic(C114216sq.this.f342024e, r2));
            }
        }, 0)).intValue() == 1;
    }

    /* renamed from: aA */
    private C114117qo m158048aA() {
        return this.f340878H;
    }

    /* renamed from: aa */
    private String[] m158049aa() {
        Rect q = this.f340901i.mo171254q();
        Point[] pointArr = {new Point(q.centerX(), q.centerY()), new Point(q.left, q.top), new Point(q.left, q.bottom), new Point(q.right, q.top), new Point(q.right, q.bottom)};
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 5; i++) {
            Point point = pointArr[i];
            String a = mo172422a(new GeoPoint(point.y, point.x));
            if (!C40002he.m42805a(a)) {
                hashSet.add(a);
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    /* renamed from: ab */
    private void m158050ab() {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172950l();
            this.f340908p = true;
        }
    }

    /* renamed from: ac */
    private void m158051ac() {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172951m();
            this.f340908p = false;
        }
    }

    /* renamed from: ad */
    private boolean m158052ad() {
        return this.f340908p;
    }

    /* renamed from: ae */
    private boolean m158053ae() {
        return this.f340889X;
    }

    /* renamed from: af */
    private void m158054af() {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113963a) new C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeShowTraffic(C114216sq.this.f342024e);
                    }
                }
            });
        }
    }

    /* renamed from: ag */
    private void m158055ag() {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113963a) new C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeHideTraffic(C114216sq.this.f342024e);
                    }
                }
            });
        }
    }

    /* renamed from: ah */
    private void m158056ah() {
        this.f340911s.mo172467a();
    }

    /* renamed from: ai */
    private void m158057ai() {
        this.f340914v = true;
    }

    /* renamed from: aj */
    private boolean m158058aj() {
        return ((double) this.f340901i.mo171246i()) > 1.0E-10d;
    }

    /* renamed from: ak */
    private String[] m158059ak() {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            return (String[]) sqVar.mo172900a(new CallbackRunnable<String[]>() {
                /* renamed from: a */
                private String[] m159998a() {
                    if (0 == C114216sq.this.f342024e) {
                        return null;
                    }
                    return C114216sq.this.f342023d.nativeGetIndoorFloorNames(C114216sq.this.f342024e);
                }

                public final /* synthetic */ Object run() {
                    if (0 == C114216sq.this.f342024e) {
                        return null;
                    }
                    return C114216sq.this.f342023d.nativeGetIndoorFloorNames(C114216sq.this.f342024e);
                }
            }, null);
        }
        return null;
    }

    /* renamed from: al */
    private void m158060al() {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113963a) new C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeResetIndoorCellInfo(C114216sq.this.f342024e);
                    }
                }
            });
        }
    }

    /* renamed from: am */
    private String m158061am() {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            return (String) sqVar.mo172900a(new CallbackRunnable<String>() {
                /* renamed from: a */
                private String m160002a() {
                    if (C114216sq.this.f342024e == 0) {
                        return null;
                    }
                    return C114216sq.this.f342023d.nativeGetActiveIndoorBuildingGUID(C114216sq.this.f342024e);
                }

                public final /* synthetic */ Object run() {
                    if (C114216sq.this.f342024e == 0) {
                        return null;
                    }
                    return C114216sq.this.f342023d.nativeGetActiveIndoorBuildingGUID(C114216sq.this.f342024e);
                }
            }, null);
        }
        return null;
    }

    /* renamed from: an */
    private Rect m158062an() {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            return (Rect) sqVar.mo172900a(new CallbackRunnable<Rect>() {
                /* renamed from: a */
                private Rect m160001a() {
                    if (0 == C114216sq.this.f342024e) {
                        return null;
                    }
                    return C114216sq.this.f342023d.nativeGetIndoorBound(C114216sq.this.f342024e);
                }

                public final /* synthetic */ Object run() {
                    if (0 == C114216sq.this.f342024e) {
                        return null;
                    }
                    return C114216sq.this.f342023d.nativeGetIndoorBound(C114216sq.this.f342024e);
                }
            }, null);
        }
        return null;
    }

    @Deprecated
    /* renamed from: ao */
    private boolean m158063ao() {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            return sqVar.mo172960v();
        }
        return false;
    }

    /* renamed from: ap */
    private C113960mp m158064ap() {
        return this.f340904l;
    }

    /* renamed from: aq */
    private C114141rg m158065aq() {
        return this.f340871A;
    }

    /* renamed from: ar */
    private C114004nx m158066ar() {
        return this.f340913u;
    }

    /* renamed from: as */
    private String m158067as() {
        return this.f340898ag;
    }

    /* renamed from: at */
    private C113551bi m158068at() {
        return this.f340880J;
    }

    @Deprecated
    /* renamed from: au */
    private boolean m158069au() {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            return sqVar.mo172947j();
        }
        return false;
    }

    /* renamed from: av */
    private String m158070av() {
        C114216sq sqVar = this.f340899g;
        if (sqVar == null) {
            return null;
        }
        return (String) sqVar.mo172900a(new CallbackRunnable<String>() {
            /* renamed from: a */
            private String m160063a() {
                if (C114216sq.this.f342024e == 0) {
                    return null;
                }
                return C114216sq.this.f342023d.getMapEngineRenderStatus(C114216sq.this.f342024e);
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return null;
                }
                return C114216sq.this.f342023d.getMapEngineRenderStatus(C114216sq.this.f342024e);
            }
        }, null);
    }

    /* renamed from: aw */
    private String m158071aw() {
        C114216sq sqVar = this.f340899g;
        if (sqVar == null) {
            return null;
        }
        return sqVar.mo171844a();
    }

    /* renamed from: ax */
    private void m158072ax() {
        C114018oo ooVar = this.f340877G;
        if (ooVar != null) {
            ooVar.mo172580m_();
        }
    }

    /* renamed from: ay */
    private void m158073ay() {
        List<C114016om> list = this.f340879I;
        if (list != null && !list.isEmpty()) {
            for (C114016om h : this.f340879I) {
                h.mo172578h();
            }
        }
    }

    /* renamed from: az */
    private void m158074az() {
        List<C114016om> list = this.f340879I;
        if (list != null && !list.isEmpty()) {
            for (C114016om i : this.f340879I) {
                i.mo172579i();
            }
        }
    }

    /* renamed from: i */
    private void m158105i(int i) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113963a) new C113963a(i) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (0 != C114216sq.this.f342024e && C114216sq.this.f342029j != null) {
                        C114216sq.this.f342023d.nativeSetIndoorFloor(C114216sq.this.f342024e, r2);
                    }
                }
            });
        }
    }

    /* renamed from: j */
    private void m158107j(int i) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null && 0 != sqVar.f342024e) {
            sqVar.mo172914a((C113963a) new C113963a(i) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetLocationCircleColor(C114216sq.this.f342024e, r6);
                    }
                }
            });
        }
    }

    /* renamed from: k */
    private void m158108k(int i) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172927b(i);
        }
        C114367v vVar = this.f340912t;
        if (vVar != null) {
            vVar.f342783b.f342818n = i;
        }
    }

    /* renamed from: l */
    private void m158110l(boolean z) {
        this.f340899g.mo172944h(z);
    }

    /* renamed from: m */
    private void m158112m(boolean z) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113963a) new C113963a(z) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (0 != C114216sq.this.f342024e) {
                        C114216sq.this.f342023d.nativeSetBuilding3DEffect(C114216sq.this.f342024e, r2);
                    }
                }
            });
        }
    }

    /* renamed from: n */
    private void m158113n(boolean z) {
        C114216sq sqVar = this.f340899g;
        if (0 != sqVar.f342024e) {
            sqVar.mo172914a((C113963a) new C113963a(z) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetLocationCircleHidden(C114216sq.this.f342024e, r6);
                    }
                }
            });
        }
    }

    /* renamed from: o */
    private void m158116o(boolean z) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null && sqVar.f342024e != 0) {
            sqVar.mo172914a((C113963a) new C113963a(z) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetIndoorBuildingPickEnabled(C114216sq.this.f342024e, r6);
                    }
                }
            });
        }
    }

    @Deprecated
    /* renamed from: p */
    private void m158117p(boolean z) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172945i(z);
        }
    }

    /* renamed from: q */
    private void m158118q(boolean z) {
        C113503ad adVar = this.f340901i;
        adVar.f339669G = z;
        adVar.f339696z.mo171638f().mo172932b(adVar.f339669G);
    }

    /* renamed from: r */
    private void m158119r(boolean z) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172932b(z);
        }
        this.f340914v = true;
    }

    /* renamed from: t */
    private void m158121t(boolean z) {
        C113503ad adVar = this.f340901i;
        if (adVar != null) {
            adVar.f339674L = z;
        }
    }

    /* renamed from: u */
    private void m158122u(boolean z) {
        C113503ad adVar = this.f340901i;
        if (adVar != null) {
            adVar.f339675M = z;
        }
    }

    /* renamed from: A */
    public final C113571bt mo171786A() {
        return this.f340899g;
    }

    /* renamed from: B */
    public final void mo172410B() {
        C114136rc rcVar;
        if (this.f340909q && (rcVar = this.f340902j) != null) {
            rcVar.mo172757b();
        }
    }

    /* renamed from: C */
    public final void mo172411C() {
        C114375z.C114376a aVar;
        File[] listFiles;
        Map<Integer, C114110qj> map;
        C114117qo qoVar = this.f340878H;
        if (!(qoVar == null || (map = qoVar.f341589g) == null || map.isEmpty())) {
            C114110qj[] qjVarArr = (C114110qj[]) qoVar.f341589g.values().toArray(new C114110qj[qoVar.f341589g.keySet().size()]);
            for (C114110qj remove : qjVarArr) {
                remove.remove();
            }
        }
        Context context = getContext();
        if (context != null) {
            File file = new File(C113959ml.m157965a(context, (TencentMapOptions) null).mo172403b().getPath() + C114110qj.f341563n);
            if (!(!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length == 0)) {
                long currentTimeMillis = System.currentTimeMillis();
                for (File file2 : listFiles) {
                    if (currentTimeMillis - file2.lastModified() > TimeUnit.DAYS.toMillis(7)) {
                        C113884kf.m157500b(file2);
                    }
                }
            }
        }
        mo172434a((C114014ok) null);
        this.f340877G = null;
        this.f340901i.mo171230b((C113724fi) this);
        this.f340879I.clear();
        C113966d dVar = this.f340918z;
        if (dVar != null) {
            C113961mq.this.mo172448b((C113718fc) dVar);
        }
        C114375z zVar = this.f340901i.f339685o;
        if (!(zVar == null || (aVar = zVar.f342855d) == null)) {
            aVar.destroy();
        }
        this.f340915w = true;
        C114141rg rgVar = this.f340871A;
        if (rgVar != null) {
            rgVar.f341668h = true;
            rgVar.f341666f = false;
            synchronized (rgVar.f341670j) {
                rgVar.f341670j.notifyAll();
            }
        }
        C113554bj bjVar = this.f340903k;
        if (bjVar != null) {
            bjVar.mo171686b();
        }
        C114136rc rcVar = this.f340902j;
        if (rcVar != null) {
            rcVar.mo172758c();
        }
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            C113934lj ljVar = sqVar.f342026g;
            if (ljVar != null) {
                ljVar.mo172362b(sqVar.f342027h);
                sqVar.f342026g.mo172356a();
            }
            if (sqVar.f342024e != 0) {
                long j = sqVar.f342024e;
                synchronized (sqVar.f342031l) {
                    sqVar.f342024e = 0;
                    sqVar.f342023d.nativeDestroyEngine(j);
                }
            }
            sqVar.f342029j = null;
            sqVar.f342023d.destory();
        }
    }

    /* renamed from: D */
    public final String mo172412D() {
        return mo172422a(this.f340901i.f339663A.f342794m);
    }

    /* renamed from: E */
    public final Language mo172413E() {
        if (this.f340917y == null) {
            this.f340917y = new C113965c();
        }
        return this.f340917y.mo172463a();
    }

    /* renamed from: F */
    public final C113565bo mo172414F() {
        C113532ba baVar = this.f340905m;
        if (baVar == null) {
            return null;
        }
        return (C113565bo) baVar.getMapContext();
    }

    /* renamed from: G */
    public final ArrayList<MapPoi> mo172415G() {
        C114216sq sqVar = this.f340899g;
        if (sqVar == null) {
            return null;
        }
        return sqVar.mo172963y();
    }

    /* renamed from: H */
    public final boolean mo172416H() {
        C114216sq sqVar = this.f340899g;
        if (sqVar == null) {
            return false;
        }
        return ((Boolean) sqVar.mo172900a(new CallbackRunnable<Boolean>(1) {
            /* renamed from: a */
            private Boolean m160066a() {
                return C114216sq.this.f342024e == 0 ? Boolean.FALSE : Boolean.valueOf(C114216sq.this.f342023d.checkMapLoadFinishedTask(C114216sq.this.f342024e, r2));
            }

            public final /* synthetic */ Object run() {
                return C114216sq.this.f342024e == 0 ? Boolean.FALSE : Boolean.valueOf(C114216sq.this.f342023d.checkMapLoadFinishedTask(C114216sq.this.f342024e, r2));
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: d_ */
    public final void mo172064d_() {
    }

    /* renamed from: f */
    public final C114216sq mo171638f() {
        return this.f340899g;
    }

    /* renamed from: g */
    public final Rect mo171639g() {
        return this.f340907o;
    }

    /* renamed from: h */
    public final float mo171640h() {
        if (getContext() == null) {
            return 1.0f;
        }
        return C113801hf.m157135a(getContext());
    }

    /* renamed from: s */
    public final Map<Class<? extends TencentMapComponent.Component>, Class<? extends TencentMapComponent.Component>> mo171807s() {
        HashMap hashMap = new HashMap();
        hashMap.put(C113645dy.class, C114157ro.class);
        return hashMap;
    }

    public final String toString() {
        C114367v vVar = this.f340912t;
        return vVar != null ? vVar.toString() : "";
    }

    /* renamed from: x */
    public final String mo171811x() {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            return (String) sqVar.mo172900a(new CallbackRunnable<String>() {
                /* renamed from: a */
                private String m160058a() {
                    return C114216sq.this.f342024e == 0 ? "" : C114216sq.this.f342023d.nativeGetMapEngineVersion(C114216sq.this.f342024e);
                }

                public final /* synthetic */ Object run() {
                    return C114216sq.this.f342024e == 0 ? "" : C114216sq.this.f342023d.nativeGetMapEngineVersion(C114216sq.this.f342024e);
                }
            }, "");
        }
        return null;
    }

    /* renamed from: y */
    public final String mo171812y() {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            return (String) sqVar.mo172900a(new CallbackRunnable<String>() {
                /* renamed from: a */
                private String m160059a() {
                    return C114216sq.this.f342024e == 0 ? "" : C114216sq.this.f342023d.nativeGetDataEngineVersion(C114216sq.this.f342024e);
                }

                public final /* synthetic */ Object run() {
                    return C114216sq.this.f342024e == 0 ? "" : C114216sq.this.f342023d.nativeGetDataEngineVersion(C114216sq.this.f342024e);
                }
            }, "");
        }
        return null;
    }

    /* renamed from: b */
    private void m158083b(GL10 gl10) {
        if (this.f340884S.size() != 0) {
            boolean z = true;
            while (z) {
                C113963a poll = this.f340884S.poll();
                if (poll != null) {
                    try {
                        poll.mo54067a(gl10);
                    } catch (Exception unused) {
                    }
                } else {
                    z = false;
                }
            }
        }
    }

    /* renamed from: f */
    private void m158096f(int i) {
        C113970ms a;
        C113554bj bjVar = this.f340903k;
        if (bjVar != null && (a = bjVar.mo171681a(C113995no.class, i)) != null) {
            a.remove();
        }
    }

    /* renamed from: g */
    private void m158100g(int i) {
        C114216sq sqVar = this.f340899g;
        sqVar.mo172914a((C113963a) new C113963a(i) {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeSetMapFontSize(C114216sq.this.f342024e, r2);
                }
            }
        });
    }

    @Deprecated
    /* renamed from: l */
    private void m158109l(int i) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172937d(i);
            this.f340914v = true;
        }
    }

    /* renamed from: a */
    public final boolean mo172443a(Context context, C114004nx nxVar, C113932lh lhVar, C114007oa oaVar) {
        this.f340913u = nxVar;
        C114009oc c = nxVar.mo172557c();
        this.f340885T = c;
        C114005ny e = nxVar.mo172559e();
        this.f340916x = e;
        this.f340910r = new C114371w(context, this, c, e);
        if (this.f340902j == null) {
            C114136rc rcVar = new C114136rc(this, lhVar);
            this.f340902j = rcVar;
            C113532ba baVar = this.f340905m;
            if (baVar != null) {
                baVar.mo171566a((TencentMap.OnCameraChangeListener) rcVar);
            }
        }
        boolean a = m158047a(context, oaVar);
        if (a) {
            TencentMapOptions tencentMapOptions = this.f339858a;
            if (tencentMapOptions != null) {
                this.f340899g.mo172915a(tencentMapOptions.getTrafficStyle());
            }
            C114216sq sqVar = this.f340899g;
            if (0 != sqVar.f342024e) {
                sqVar.mo172914a((C113963a) new C113963a() {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (C114216sq.this.f342024e != 0) {
                            C114216sq.this.f342023d.nativeHideCompass(C114216sq.this.f342024e);
                        }
                    }
                });
            }
            this.f340899g.mo172942f(true);
            this.f340899g.mo172942f(true);
            this.f340899g.mo172943g(true);
            this.f340899g.mo172905a(20);
            this.f340899g.mo172927b(3);
            this.f340901i.mo171214a((C113724fi) this);
            int i = this.f340883O;
            mo172446b(i, i);
        }
        return a;
    }

    /* renamed from: c */
    public final C113554bj mo171635c() {
        return this.f340903k;
    }

    /* renamed from: d */
    public final C113707es mo171636d() {
        return this.f340906n;
    }

    /* renamed from: e */
    public final C114367v mo171637e() {
        return this.f340912t;
    }

    /* renamed from: c */
    private void m158087c(int i, int i2) {
        if (this.f340899g != null) {
            this.f340914v = true;
            this.f340907o.set(0, 0, i, i2);
            mo172428a(0, 0, i, i2, false);
            this.f340901i.mo171251n();
        }
    }

    /* renamed from: d */
    private void m158089d(int i, int i2) {
        Rect rect = this.f340907o;
        if (rect != null) {
            rect.set(0, 0, i, i2);
        }
    }

    /* renamed from: e */
    private void m158093e(int i, int i2) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 > 255) {
                i2 = 255;
            }
            int i3 = 255 - i2;
            if (i3 == 0) {
                i3 = 1;
            }
            sqVar.mo172914a((C113963a) new C113963a(i, i3) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeUpdateMaskLayer(C114216sq.this.f342024e, r2, r3);
                    }
                }
            });
        }
    }

    /* renamed from: h */
    private void m158102h(int i) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113963a) new C113963a(i) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        int i = r2;
                        if (i == 1) {
                            C114216sq.this.f342023d.nativeSetTrafficColor(C114216sq.this.f342024e, C114216sq.f342012n, C114216sq.f342014p, C114216sq.f342017s, -16777063);
                        } else if (i == 2) {
                            C114216sq.this.f342023d.nativeSetTrafficColor(C114216sq.this.f342024e, C114216sq.f342013o, C114216sq.f342015q, C114216sq.f342018t, -16777063);
                        } else {
                            C114216sq.this.f342023d.nativeSetTrafficColor(C114216sq.this.f342024e, C114216sq.f342012n, C114216sq.f342014p, C114216sq.f342016r, -16777063);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: i */
    private void m158106i(int i, int i2) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113963a) new C113963a(i, i2) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeBringElementBelow(C114216sq.this.f342024e, r2, r3);
                    }
                }
            });
        }
    }

    @Deprecated
    /* renamed from: m */
    private void m158111m(int i) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172939e(i);
        }
    }

    /* renamed from: s */
    private void m158120s(boolean z) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113963a) new C113963a(z) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeEnableBuilding(C114216sq.this.f342024e, r2);
                    }
                }
            });
        }
    }

    /* renamed from: n */
    private static boolean m158114n(int i) {
        return C114367v.m160528b(i);
    }

    /* renamed from: o */
    private void m158115o(int i) {
        C114216sq sqVar = this.f340899g;
        sqVar.mo172914a((C113963a) new C113963a(i) {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeSetIndoorConfigType(C114216sq.this.f342024e, r2);
                }
            }
        });
    }

    /* renamed from: g */
    public final void mo172457g(boolean z) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172943g(z);
        }
    }

    /* renamed from: j */
    public final void mo172460j(boolean z) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172948k(z);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.mq$c */
    public class C113965c {

        /* renamed from: b */
        private List<C113718fc> f340929b = new CopyOnWriteArrayList();

        public C113965c() {
        }

        /* renamed from: b */
        private void m158196b(Language language) {
            if (C113961mq.this.f340899g != null) {
                C114216sq a = C113961mq.this.f340899g;
                a.mo172914a((C113963a) new C113963a(language.ordinal()) {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (C114216sq.this.f342024e != 0) {
                            C114216sq.this.f342023d.nativeSetLanguage(C114216sq.this.f342024e, r2);
                        }
                    }
                });
                boolean unused = C113961mq.this.f340914v = true;
                C113961mq.this.f340914v = true;
                mo172465a(language);
            }
        }

        /* renamed from: a */
        public final Language mo172463a() {
            if (C113961mq.this.f340899g == null) {
                return Language.zh;
            }
            if (C113961mq.this.f340899g.mo172962x() == 1) {
                return Language.en;
            }
            return Language.zh;
        }

        /* renamed from: a */
        public final void mo172464a(C113718fc fcVar) {
            if (fcVar != null) {
                synchronized (this.f340929b) {
                    if (!this.f340929b.contains(fcVar)) {
                        this.f340929b.add(fcVar);
                    }
                }
            }
        }

        /* renamed from: b */
        public final void mo172466b(C113718fc fcVar) {
            if (fcVar != null) {
                this.f340929b.remove(fcVar);
            }
        }

        /* renamed from: a */
        public final synchronized void mo172465a(Language language) {
            for (C113718fc next : this.f340929b) {
                if (next != null) {
                    next.mo172060a(language);
                }
            }
        }
    }

    /* renamed from: b */
    private void m158081b(C114131qz qzVar) {
        C114133rb rbVar;
        List<C114131qz> list;
        C114136rc rcVar = this.f340902j;
        if (rcVar != null && (rbVar = rcVar.f341648b) != null && qzVar != null && (list = rbVar.f341638a) != null) {
            list.remove(qzVar);
        }
    }

    /* renamed from: d */
    private boolean m158090d(int i) {
        CustomRender customRender;
        if (i != C113964b.AboveToplayer.f340927g || (customRender = this.f340876F) == null) {
            return false;
        }
        customRender.onDrawFrame();
        return true;
    }

    /* renamed from: e */
    private void m158092e(int i) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113963a) new C113963a(i) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeRemoveMaskLayer(C114216sq.this.f342024e, r2);
                    }
                }
            });
        }
    }

    @Deprecated
    /* renamed from: h */
    private void m158103h(int i, int i2) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172928b(i, i2);
        }
    }

    /* renamed from: i */
    public final void mo172459i(boolean z) {
        if (this.f340871A == null) {
            this.f340871A = new C114141rg(this);
        }
        C114141rg rgVar = this.f340871A;
        rgVar.f341666f = z;
        if (z) {
            try {
                synchronized (rgVar.f341670j) {
                    rgVar.f341670j.start();
                }
            } catch (Exception unused) {
            }
        } else {
            rgVar.f341666f = false;
            synchronized (rgVar.f341670j) {
                rgVar.f341670j.notifyAll();
            }
        }
    }

    /* renamed from: l */
    public final boolean mo171803l() {
        return C114367v.m160528b(this.f340901i.mo171250m());
    }

    /* renamed from: m */
    public final float mo171645m() {
        return this.f339858a.getMapFrameRate();
    }

    /* renamed from: n */
    public final boolean mo171646n() {
        return this.f339858a.isOpaque();
    }

    /* renamed from: f */
    private void m158097f(int i, int i2) {
        if (i != 0 && i2 != 0) {
            C114216sq sqVar = this.f340899g;
            sqVar.mo172914a((C113963a) new C113963a(i, i2) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetMarkerMainSubRelation(C114216sq.this.f342024e, r2, r3);
                    }
                }
            });
        }
    }

    /* renamed from: g */
    private void m158101g(int i, int i2) {
        this.f340875E = i;
        this.f340874D = i2;
    }

    /* renamed from: j */
    public final int mo171642j() {
        return this.f339858a.getExtSurfaceWidth();
    }

    /* renamed from: k */
    public final void mo172461k(boolean z) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113963a) new C113963a(z) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeEnableBaseMap(C114216sq.this.f342024e, r2);
                    }
                }
            });
        }
    }

    /* renamed from: o */
    public final boolean mo171647o() {
        return this.f339858a.isMSAA();
    }

    /* renamed from: e */
    public final void mo172455e(boolean z) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172940e(z);
        }
    }

    /* renamed from: h */
    public final void mo172458h(boolean z) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172946j(z);
        }
    }

    /* renamed from: c */
    private int m158085c(C113733fq fqVar) {
        if (this.f340903k == null || fqVar.f340237u == null) {
            return -1;
        }
        C113995no noVar = (C113995no) this.f340903k.mo171680a(m158076b(fqVar));
        if (noVar != null) {
            return noVar.mo172479b();
        }
        return -1;
    }

    /* renamed from: d */
    private boolean m158091d(String str) {
        C114216sq sqVar = this.f340899g;
        if (sqVar == null) {
            return false;
        }
        return ((Boolean) sqVar.mo172900a(new CallbackRunnable<Boolean>(str) {
            /* renamed from: a */
            private Boolean m159946a() {
                return C114216sq.this.f342024e == 0 ? Boolean.FALSE : Boolean.valueOf(C114216sq.this.f342023d.nativeHasStreetRoad(C114216sq.this.f342024e, r2));
            }

            public final /* synthetic */ Object run() {
                return C114216sq.this.f342024e == 0 ? Boolean.FALSE : Boolean.valueOf(C114216sq.this.f342023d.nativeHasStreetRoad(C114216sq.this.f342024e, r2));
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: g */
    private int m158099g(String str) {
        C114216sq sqVar = this.f340899g;
        if (sqVar == null) {
            return -1;
        }
        return ((Integer) sqVar.mo172900a(new CallbackRunnable<Integer>(str) {
            /* renamed from: a */
            private Integer m160062a() {
                if (C114216sq.this.f342024e == 0) {
                    return -1;
                }
                return Integer.valueOf(C114216sq.this.f342023d.getIndoorOutlineZoom(C114216sq.this.f342024e, r2));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return -1;
                }
                return Integer.valueOf(C114216sq.this.f342023d.getIndoorOutlineZoom(C114216sq.this.f342024e, r2));
            }
        }, -1)).intValue();
    }

    /* renamed from: f */
    public final void mo172456f(boolean z) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172942f(z);
        }
    }

    /* renamed from: k */
    public final int mo171643k() {
        return this.f339858a.getExtSurfaceHeight();
    }

    /* renamed from: e */
    private void m158094e(String str) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null && 0 != sqVar.f342024e) {
            sqVar.mo172914a((C113963a) new C113963a(str) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetCompassImage(C114216sq.this.f342024e, r6);
                    }
                }
            });
        }
    }

    /* renamed from: h */
    private void m158104h(String str) {
        C114005ny nyVar = this.f340916x;
        if (nyVar != null) {
            nyVar.mo172561a(str);
        }
    }

    /* renamed from: b */
    public final void mo172447b(PolygonInfo polygonInfo) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null && polygonInfo != null) {
            sqVar.mo172914a((C113963a) new C113963a(polygonInfo) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        JNI c = C114216sq.this.f342023d;
                        long b = C114216sq.this.f342024e;
                        PolygonInfo polygonInfo = r2;
                        c.nativeUpdatePolygon(b, polygonInfo.polygonId, polygonInfo.borderLineId, polygonInfo);
                    }
                }
            });
        }
    }

    /* renamed from: f */
    private void m158098f(String str) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113963a) new C113963a(str) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeMapLoadKMLFile(C114216sq.this.f342024e, r2);
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo172454d(boolean z) {
        if (this.f340899g != null) {
            C113889km.m157545b(C0949kl.f2236f, "setIndoorEnabled:".concat(String.valueOf(z)));
            this.f340899g.mo172936c(z);
        }
    }

    /* renamed from: b */
    public static C113997nq m158076b(C113733fq fqVar) {
        C113997nq nqVar = new C113997nq(fqVar.f340237u, fqVar.f340218b);
        if (!TextUtils.isEmpty(fqVar.f340224h)) {
            SubMarkerInfo subMarkerInfo = new SubMarkerInfo();
            subMarkerInfo.iconName(fqVar.f340224h);
            subMarkerInfo.iconWidth(fqVar.f340225i);
            subMarkerInfo.iconHeight(fqVar.f340226j);
            subMarkerInfo.avoidAnnotation(true);
            subMarkerInfo.avoidOtherMarker(true);
            nqVar.subMarkerInfo(subMarkerInfo);
        }
        nqVar.iconWidth(fqVar.f340219c);
        nqVar.iconHeight(fqVar.f340220d);
        nqVar.avoidAnnotation(true);
        nqVar.avoidOtherMarker(true);
        float f = fqVar.f340223g;
        nqVar.scale(f, f);
        nqVar.priority(fqVar.f340234r);
        nqVar.displayLevel(2);
        nqVar.minScaleLevel(fqVar.f340235s);
        nqVar.maxScaleLevel(fqVar.f340236t);
        return nqVar;
    }

    /* renamed from: c */
    public final void mo172453c(boolean z) {
        this.f340888W = z;
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113963a) new C113963a(z) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (0 != C114216sq.this.f342024e) {
                        C114216sq.this.f342023d.nativeSetBuilding3DEffect(C114216sq.this.f342024e, r2);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo172452c(String str) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172931b(str);
        }
    }

    /* renamed from: i */
    public final Object mo171641i() {
        return this.f339858a.getExtSurface();
    }

    /* renamed from: c */
    public final void mo172451c(int i) {
        C113503ad adVar = this.f340901i;
        if (adVar != null) {
            adVar.mo171224b(i);
        }
    }

    /* renamed from: a */
    private boolean m158047a(Context context, C114007oa oaVar) {
        String c = this.f340885T.mo172566c();
        String a = this.f340885T.mo172564a();
        String b = this.f340885T.mo172565b();
        try {
            if (!this.f340913u.mo172555a()) {
                c = this.f340885T.mo172567d();
            }
            String str = c;
            C113889km.m157545b(C0949kl.f2236f, "newEngine config:".concat(String.valueOf(str)));
            this.f340910r.mo173080a();
            return this.f340899g.mo172923a(context, oaVar, this.f340910r, str, a, b);
        } finally {
            this.f340910r.mo173081b();
        }
    }

    /* renamed from: b */
    public final void mo172449b(String str) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            this.f340898ag = str;
            if (sqVar.f342024e != 0) {
                sqVar.mo172914a((C113963a) new C113963a(str) {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (C114216sq.this.f342024e != 0) {
                            C114216sq.this.f342023d.nativeMapSetSatelliteServerFullUrl(C114216sq.this.f342024e, r6);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: b */
    private static Point[] m158084b(Rect rect) {
        return new Point[]{new Point(rect.centerX(), rect.centerY()), new Point(rect.left, rect.top), new Point(rect.left, rect.bottom), new Point(rect.right, rect.top), new Point(rect.right, rect.bottom)};
    }

    /* renamed from: a */
    public final void mo172433a(C114009oc ocVar) {
        if (ocVar != null) {
            this.f340885T = ocVar;
            if (this.f340899g != null) {
                String c = ocVar.mo172566c();
                String a = this.f340885T.mo172564a();
                String b = this.f340885T.mo172565b();
                C113889km.m157545b(C0949kl.f2236f, "resetMapPath config:".concat(String.valueOf(c)));
                if (!C40002he.m42805a(b) && !C40002he.m42805a(a)) {
                    try {
                        this.f340910r.mo173080a();
                        C114216sq sqVar = this.f340899g;
                        sqVar.mo172914a((C113963a) new C113963a(c, a, b) {
                            /* renamed from: a */
                            public final void mo54067a(GL10 gl10) {
                                if (C114216sq.this.f342024e != 0) {
                                    C114216sq.this.f342023d.nativeResetEnginePath(C114216sq.this.f342024e, r2, r3, r4);
                                }
                            }
                        });
                    } finally {
                        this.f340910r.mo173081b();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo172450b(boolean z) {
        if (this.f340889X != z) {
            this.f340889X = z;
            C114216sq sqVar = this.f340899g;
            if (sqVar != null) {
                sqVar.mo172920a(z);
            }
        }
    }

    /* renamed from: b */
    private void m158082b(List<IndoorCellInfo> list) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113963a) new C113963a(list) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetIndoorCellInfo(C114216sq.this.f342024e, r2);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private String m158077b(GeoPoint geoPoint) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            return (String) sqVar.mo172900a(new CallbackRunnable<String>(geoPoint) {
                /* renamed from: a */
                private String m160003a() {
                    if (0 == C114216sq.this.f342024e) {
                        return null;
                    }
                    return C114216sq.this.f342023d.nativeGetCurIndoorName(C114216sq.this.f342024e, r2);
                }

                public final /* synthetic */ Object run() {
                    if (0 == C114216sq.this.f342024e) {
                        return null;
                    }
                    return C114216sq.this.f342023d.nativeGetCurIndoorName(C114216sq.this.f342024e, r2);
                }
            }, null);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo172432a(C113963a aVar) {
        try {
            this.f340884S.put(aVar);
        } catch (InterruptedException e) {
            C113889km.m157540a(e.getMessage(), (Throwable) e);
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: b */
    public final void mo172445b(int i) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172905a(i);
        }
        C114367v vVar = this.f340912t;
        if (vVar != null) {
            vVar.f342783b.f342819o = i;
        }
    }

    /* renamed from: a */
    public final C113503ad mo171633a() {
        return this.f340901i;
    }

    /* renamed from: a */
    private void m158026a(Rect rect) {
        Rect rect2 = this.f340907o;
        if (rect2 != null && rect != null) {
            this.f340873C = rect;
            int width = rect2.width();
            int height = this.f340907o.height();
            int i = rect.left;
            int i2 = rect.bottom;
            mo172428a(i, i2, (width - rect.right) - i, (height - i2) - rect.top, true);
        }
    }

    @Deprecated
    /* renamed from: b */
    private void m158078b(int i, int i2, int i3) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172908a(i, i2, i3);
        }
    }

    /* renamed from: b */
    public final void mo172446b(int i, int i2) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172907a(i + 50, i2 + 50);
        }
    }

    /* renamed from: b */
    private void m158080b(C114016om omVar) {
        if (!this.f340879I.isEmpty()) {
            this.f340879I.remove(omVar);
        }
    }

    /* renamed from: b */
    public final void mo172448b(C113718fc fcVar) {
        if (this.f340917y == null) {
            this.f340917y = new C113965c();
        }
        this.f340917y.mo172466b(fcVar);
    }

    /* renamed from: a */
    public final void mo172428a(int i, int i2, int i3, int i4, boolean z) {
        this.f340899g.mo172909a(i, i2, i3, i4);
        this.f340890Y = i3;
        this.f340891Z = i4;
        if (z) {
            mo172424a(this.f340892aa, this.f340893ab, this.f340894ac);
        }
    }

    /* renamed from: b */
    private void m158079b(C113711ev evVar) {
        C113532ba baVar = this.f340905m;
        if (baVar != null) {
            baVar.mo171579b(evVar);
        }
    }

    /* renamed from: a */
    public final void mo172424a(float f, float f2, boolean z) {
        this.f340892aa = f;
        this.f340893ab = f2;
        double d = (double) f;
        double d2 = (double) f2;
        Rect rect = this.f340907o;
        if (rect != null) {
            if (this.f340891Z > 0) {
                d2 = 0.5d - (((0.5d - d2) * ((double) rect.height())) / ((double) this.f340891Z));
            }
            if (this.f340890Y > 0) {
                d = 0.5d - (((0.5d - d) * ((double) this.f340907o.width())) / ((double) this.f340890Y));
            }
        }
        this.f340899g.mo172903a((float) d, (float) d2, z);
    }

    /* renamed from: a */
    public final boolean mo172444a(GL10 gl10) {
        int i;
        Collection<C113971mt> values;
        if (this.f340899g == null) {
            return false;
        }
        Map<Class<? extends C113973mu>, C113971mt> map = this.f340903k.f339824i;
        if (!(map == null || (values = map.values()) == null || values.isEmpty())) {
            for (C113971mt d : values) {
                d.mo172493d();
            }
        }
        this.f340901i.f339685o.mo173100g();
        if (this.f340884S.size() != 0) {
            boolean z = true;
            while (z) {
                C113963a poll = this.f340884S.poll();
                if (poll != null) {
                    try {
                        poll.mo54067a(gl10);
                    } catch (Exception unused) {
                    }
                } else {
                    z = false;
                }
            }
        }
        C114216sq sqVar = this.f340899g;
        sqVar.mo172914a((C113963a) new C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (0 != C114216sq.this.f342024e) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (C114216sq.this.f342032w == 0) {
                        C114216sq.this.f342023d.nativeUpdateFrame(C114216sq.this.f342024e, 0.0d);
                    } else {
                        C114216sq.this.f342023d.nativeUpdateFrame(C114216sq.this.f342024e, (double) (elapsedRealtime - C114216sq.this.f342032w));
                    }
                    long unused = C114216sq.this.f342032w = elapsedRealtime;
                }
            }
        });
        C114216sq sqVar2 = this.f340899g;
        C114216sq.C1142837 r3 = new CallbackRunnable<Boolean>() {
            /* renamed from: a */
            private Boolean m160087a() {
                return 0 == C114216sq.this.f342024e ? Boolean.FALSE : Boolean.valueOf(C114216sq.this.f342023d.nativeNeedDispaly(C114216sq.this.f342024e));
            }

            public final /* synthetic */ Object run() {
                return 0 == C114216sq.this.f342024e ? Boolean.FALSE : Boolean.valueOf(C114216sq.this.f342023d.nativeNeedDispaly(C114216sq.this.f342024e));
            }
        };
        Boolean bool = Boolean.FALSE;
        boolean z2 = ((Boolean) sqVar2.mo172900a(r3, bool)).booleanValue() || this.f340914v;
        if (z2) {
            C113968f c = this.f340911s.mo172471c();
            if (c == null) {
                this.f340903k.f339819d.f339812i.mo171649a(gl10);
            } else if (this.f340911s != null && this.f340899g.mo172947j()) {
                this.f340911s.mo172469a(gl10, this.f340904l);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C114216sq sqVar3 = this.f340899g;
            ((Boolean) sqVar3.mo172900a(new CallbackRunnable<Boolean>() {
                /* renamed from: a */
                private Boolean m159936a() {
                    return Boolean.valueOf(C114216sq.this.f342023d.nativeDrawFrame(C114216sq.this.f342024e));
                }

                public final /* synthetic */ Object run() {
                    return Boolean.valueOf(C114216sq.this.f342023d.nativeDrawFrame(C114216sq.this.f342024e));
                }
            }, bool)).booleanValue();
            this.f340914v = false;
            if (!this.f340905m.mo171550N()) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                long j = 0;
                Object c2 = C113896kq.m157667c(C0950kp.f2278X, "nativeTotalTime");
                if (c2 != null) {
                    j = ((Long) c2).longValue();
                }
                C113896kq.m157655a(C0950kp.f2278X, "nativeTime", (Object) Long.valueOf(elapsedRealtime2));
                C113896kq.m157655a(C0950kp.f2278X, "nativeTotalTime", (Object) Long.valueOf(j + elapsedRealtime2));
                C113896kq.m157674e(C0950kp.f2278X);
            }
            if (!this.f340911s.mo172470b() && c != null) {
                if (c.mo172474c()) {
                    c.f340940e = 0;
                } else if (this.f340899g.mo172947j() || (i = c.f340940e) >= 100) {
                    c.f340940e = 0;
                    this.f340911s.mo172468a(gl10);
                } else {
                    c.f340940e = i + 1;
                }
            }
        }
        C113960mp mpVar = this.f340904l;
        if (mpVar != null) {
            mpVar.mo172409a();
        }
        return z2;
    }

    /* renamed from: a */
    private void m158035a(C114131qz qzVar) {
        C114133rb rbVar;
        List<C114131qz> list;
        C114136rc rcVar = this.f340902j;
        if (rcVar != null && (rbVar = rcVar.f341648b) != null && qzVar != null && (list = rbVar.f341638a) != null) {
            list.add(qzVar);
        }
    }

    /* renamed from: a */
    public final void mo172440a(boolean z) {
        if (this.f340902j != null) {
            this.f340909q = z;
            if (z) {
                C114216sq sqVar = this.f340899g;
                if (sqVar != null) {
                    sqVar.mo172914a((C113963a) new C113963a() {
                        /* renamed from: a */
                        public final void mo54067a(GL10 gl10) {
                            if (C114216sq.this.f342024e != 0) {
                                C114216sq.this.f342023d.nativeShowTraffic(C114216sq.this.f342024e);
                            }
                        }
                    });
                }
                C114136rc rcVar = this.f340902j;
                C113961mq mqVar = rcVar.f341647a;
                if (mqVar != null) {
                    mqVar.f340901i.mo171215a((C113726fk) rcVar);
                    if (rcVar.f341648b == null) {
                        rcVar.f341648b = new C114133rb(rcVar.f341647a, rcVar.f341649c);
                    }
                    try {
                        rcVar.f341648b.start();
                    } catch (Exception unused) {
                    }
                }
            } else {
                C114216sq sqVar2 = this.f340899g;
                if (sqVar2 != null) {
                    sqVar2.mo172914a((C113963a) new C113963a() {
                        /* renamed from: a */
                        public final void mo54067a(GL10 gl10) {
                            if (C114216sq.this.f342024e != 0) {
                                C114216sq.this.f342023d.nativeHideTraffic(C114216sq.this.f342024e);
                            }
                        }
                    });
                }
                this.f340902j.mo172758c();
            }
        }
    }

    /* renamed from: a */
    private void m158045a(int[] iArr, int i, boolean z) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null && iArr != null && i != 0) {
            sqVar.mo172914a((C113963a) new C113963a(iArr, i, z) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (0 != C114216sq.this.f342024e) {
                        C114216sq.this.f342023d.nativeSetIconsHidden(C114216sq.this.f342024e, r2, r3, r4);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m158044a(int[] iArr, int i) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null && iArr != null && i != 0) {
            sqVar.mo172922a(iArr, i);
        }
    }

    /* renamed from: a */
    public final int mo172417a(PolygonInfo polygonInfo) {
        C114216sq sqVar = this.f340899g;
        if (sqVar == null || polygonInfo == null) {
            return -1;
        }
        int i = 0;
        int intValue = ((Integer) sqVar.mo172900a(new CallbackRunnable<Integer>(polygonInfo) {
            /* renamed from: a */
            private Integer m160073a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeAddPolygon(C114216sq.this.f342024e, r2));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeAddPolygon(C114216sq.this.f342024e, r2));
            }
        }, 0)).intValue();
        if (this.f340886U == null) {
            this.f340886U = new C55065kz<>();
        }
        if (this.f340887V == null) {
            this.f340887V = new C55065kz<>();
        }
        this.f340886U.mo76185a(Integer.valueOf(intValue), Integer.valueOf(polygonInfo.borderLineId));
        ArrayList arrayList = new ArrayList();
        while (true) {
            int[] iArr = polygonInfo.holeLineIds;
            if (i < iArr.length) {
                arrayList.add(Integer.valueOf(iArr[i]));
                i++;
            } else {
                this.f340887V.mo76185a(Integer.valueOf(intValue), arrayList);
                return intValue;
            }
        }
    }

    /* renamed from: a */
    private void m158025a(int i, boolean z) {
        C55065kz<Integer, Integer> kzVar;
        if (this.f340899g != null && (kzVar = this.f340886U) != null) {
            Integer a = kzVar.mo76184a(Integer.valueOf(i));
            int intValue = a != null ? a.intValue() : 0;
            C55065kz<Integer, List<Integer>> kzVar2 = this.f340887V;
            if (kzVar2 != null) {
                List a2 = kzVar2.mo76184a(Integer.valueOf(i));
                int[] iArr = new int[0];
                if (a2 != null) {
                    iArr = new int[a2.size()];
                    for (int i2 = 0; i2 < a2.size(); i2++) {
                        iArr[i2] = ((Integer) a2.get(i2)).intValue();
                    }
                }
                C114216sq sqVar = this.f340899g;
                sqVar.mo172914a((C113963a) new C113963a(i, intValue, z, iArr) {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (C114216sq.this.f342024e != 0 && r2 >= 0 && C114216sq.this.f342029j != null) {
                            C114216sq.this.f342023d.nativeSetPolygonHidden(C114216sq.this.f342024e, r2, r3, r4, r5);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo172426a(int i) {
        C55065kz<Integer, Integer> kzVar;
        if (this.f340899g != null && (kzVar = this.f340886U) != null) {
            Integer a = kzVar.mo76184a(Integer.valueOf(i));
            int intValue = a != null ? a.intValue() : 0;
            C55065kz<Integer, List<Integer>> kzVar2 = this.f340887V;
            if (kzVar2 != null) {
                List a2 = kzVar2.mo76184a(Integer.valueOf(i));
                int[] iArr = new int[0];
                if (a2 != null) {
                    iArr = new int[a2.size()];
                    for (int i2 = 0; i2 < a2.size(); i2++) {
                        iArr[i2] = ((Integer) a2.get(i2)).intValue();
                    }
                }
                C114216sq sqVar = this.f340899g;
                sqVar.mo172914a((C113963a) new C113963a(i, intValue, iArr) {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (C114216sq.this.f342024e != 0 && r2 >= 0 && C114216sq.this.f342029j != null) {
                            C114216sq.this.f342023d.nativeDeletePolygon(C114216sq.this.f342024e, r2, r3, r4);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private Circle m158015a(CircleOptions circleOptions) {
        C113551bi biVar = this.f340880J;
        if (biVar == null) {
            return null;
        }
        return biVar.mo171671a(circleOptions);
    }

    /* renamed from: a */
    public final Polyline mo172420a(PolylineOptions polylineOptions) {
        C113551bi biVar = this.f340880J;
        if (biVar == null || polylineOptions == null) {
            return null;
        }
        return biVar.mo171673a(polylineOptions);
    }

    /* renamed from: a */
    private Marker m158018a(MarkerOptions markerOptions) {
        C113551bi biVar = this.f340880J;
        if (biVar == null || markerOptions == null) {
            return null;
        }
        return biVar.mo171672a(markerOptions);
    }

    /* renamed from: a */
    private int m158011a(int i, int i2, int i3, int i4, int i5, float f) {
        if (this.f340899g == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        if (i > 255) {
            i = 255;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 > 255) {
            i2 = 255;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 > 255) {
            i3 = 255;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i4 > 255) {
            i4 = 255;
        }
        MaskLayer maskLayer = new MaskLayer();
        maskLayer.color = new int[]{i, i2, i3, 255 - i4};
        Rect rect = this.f340907o;
        if (rect != null) {
            maskLayer.width = rect.width();
            maskLayer.height = this.f340907o.height();
        }
        maskLayer.zIndex = f;
        maskLayer.layer = i5;
        C114216sq sqVar = this.f340899g;
        return ((Integer) sqVar.mo172900a(new CallbackRunnable<Integer>(maskLayer) {
            /* renamed from: a */
            private Integer m159939a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeAddMaskLayer(C114216sq.this.f342024e, r2));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeAddMaskLayer(C114216sq.this.f342024e, r2));
            }
        }, 0)).intValue();
    }

    /* renamed from: a */
    private void m158043a(List<MapRouteSection> list, List<GeoPoint> list2) {
        if (this.f340918z == null) {
            this.f340918z = new C113966d();
        }
        C113966d dVar = this.f340918z;
        dVar.f340930a = list;
        dVar.f340931b = list2;
        C113961mq.this.f340899g.mo172919a(list, list2);
    }

    /* renamed from: a */
    private AnnocationTextResult m158013a(AnnocationText annocationText) {
        C114216sq sqVar = this.f340899g;
        return (AnnocationTextResult) sqVar.mo172900a(new CallbackRunnable<AnnocationTextResult>(annocationText) {
            /* renamed from: a */
            private AnnocationTextResult m160042a() {
                if (0 == C114216sq.this.f342024e) {
                    return null;
                }
                return C114216sq.this.f342023d.nativeCreateAnnotationTextBitmap(C114216sq.this.f342024e, r2);
            }

            public final /* synthetic */ Object run() {
                if (0 == C114216sq.this.f342024e) {
                    return null;
                }
                return C114216sq.this.f342023d.nativeCreateAnnotationTextBitmap(C114216sq.this.f342024e, r2);
            }
        }, null);
    }

    /* renamed from: a */
    public final void mo172431a(C113733fq fqVar) {
        C113970ms a;
        if (this.f340903k != null) {
            C113997nq b = m158076b(fqVar);
            C113554bj bjVar = this.f340903k;
            int i = fqVar.f340217a;
            C113971mt mtVar = bjVar.f339824i.get(b.getClass());
            if (mtVar != null && (a = mtVar.mo172485a(i)) != null) {
                a.mo172478a(b);
                mtVar.mo172487a(a);
            }
        }
    }

    /* renamed from: a */
    private List<Integer> m158020a(Rect rect, int i) {
        C114216sq sqVar = this.f340899g;
        return (List) sqVar.mo172900a(new CallbackRunnable<List<Integer>>(rect, i) {
            /* renamed from: a */
            private List<Integer> m160044a() {
                ArrayList arrayList = null;
                if (0 == C114216sq.this.f342024e) {
                    return null;
                }
                int[] iArr = new int[100];
                int nativeQueryCityCodeList = C114216sq.this.f342023d.nativeQueryCityCodeList(C114216sq.this.f342024e, r2, r3, iArr, 100);
                if (nativeQueryCityCodeList > 0) {
                    arrayList = new ArrayList(nativeQueryCityCodeList);
                    for (int i = 0; i < nativeQueryCityCodeList; i++) {
                        arrayList.add(Integer.valueOf(iArr[i]));
                    }
                }
                return arrayList;
            }

            public final /* synthetic */ Object run() {
                if (0 == C114216sq.this.f342024e) {
                    return null;
                }
                int[] iArr = new int[100];
                int nativeQueryCityCodeList = C114216sq.this.f342023d.nativeQueryCityCodeList(C114216sq.this.f342024e, r2, r3, iArr, 100);
                if (nativeQueryCityCodeList <= 0) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(nativeQueryCityCodeList);
                for (int i = 0; i < nativeQueryCityCodeList; i++) {
                    arrayList.add(Integer.valueOf(iArr[i]));
                }
                return arrayList;
            }
        }, null);
    }

    /* renamed from: a */
    public final String mo172422a(GeoPoint geoPoint) {
        C114216sq sqVar = this.f340899g;
        if (sqVar == null) {
            return "";
        }
        return sqVar.mo172901a(geoPoint);
    }

    /* renamed from: a */
    public final void mo172437a(String str) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null && sqVar.f342024e != 0) {
            sqVar.mo172914a((C113963a) new C113963a(str) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetServerHost(C114216sq.this.f342024e, r6);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m158030a(C113709et etVar, int i, int i2, C113725fj fjVar) {
        Rect bound = etVar.getBound(this.f340906n);
        if (bound != null && i > 0 && i2 > 0 && fjVar != null) {
            this.f340911s.m158206a(etVar, bound, fjVar, i, i2);
        }
    }

    /* renamed from: a */
    private void m158031a(C113709et etVar, Rect rect, int i, int i2, C113725fj fjVar) {
        if (etVar != null && rect != null && i > 0 && i2 > 0 && fjVar != null) {
            this.f340911s.m158206a(etVar, rect, fjVar, i, i2);
        }
    }

    /* renamed from: a */
    private void m158027a(Rect rect, int i, int i2, C113725fj fjVar) {
        if (rect != null && i > 0 && i2 > 0 && fjVar != null) {
            this.f340911s.m158206a((C113709et) null, rect, fjVar, i, i2);
        }
    }

    /* renamed from: a */
    private void m158042a(List<LatLngBounds> list) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172918a(list);
        }
    }

    /* renamed from: a */
    private void m158024a(int i, int i2, int i3, int i4) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113963a) new C113963a(i2, i, i3, i4) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetTrafficColor(C114216sq.this.f342024e, r2, r3, r4, r5);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo172429a(GeoPoint geoPoint, float f, float f2, boolean z) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172911a(geoPoint, f, f2, z);
        }
    }

    /* renamed from: a */
    public final void mo172441a(boolean z, boolean z2) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null && 0 != sqVar.f342024e && sqVar.f342029j != null) {
            sqVar.mo172914a((C113963a) new C113963a(false, z, false, z2) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetLocationFollow(C114216sq.this.f342024e, r3, r4, r5, r6);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo172423a(float f) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172902a(f);
        }
    }

    /* renamed from: a */
    private void m158028a(Rect rect, Rect rect2, boolean z) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172910a(rect, rect2, z);
        }
    }

    /* renamed from: a */
    public final void mo172442a(String[] strArr) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null && sqVar.f342024e != 0) {
            sqVar.mo172914a((C113963a) new C113963a(strArr) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetShowIndoorBuildingWhiteList(C114216sq.this.f342024e, r6);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final int mo172418a(String str, float f, float f2) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            return sqVar.mo172897a(str, f, f2);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo172439a(String str, String str2, String str3, String str4, String str5) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172917a(str, str2, str3, str4, str5);
        }
    }

    /* renamed from: a */
    public final void mo172425a(float f, int i, LatLng latLng) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172904a(f, i, latLng);
        }
    }

    /* renamed from: a */
    private void m158029a(GeoPoint geoPoint, RectF rectF, boolean z) {
        C113961mq mqVar;
        Rect rect;
        if (!(rectF == null || (rect = this.f340873C) == null)) {
            rectF.left -= (float) rect.left;
            rectF.top -= (float) rect.top;
            rectF.right -= (float) rect.right;
            rectF.bottom -= (float) rect.bottom;
        }
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            int i = this.f340875E;
            int i2 = this.f340874D;
            if (0 != sqVar.f342024e && (mqVar = sqVar.f342029j) != null) {
                mqVar.mo172432a((C113963a) new C113963a(rectF, geoPoint, i, i2, z) {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (C114216sq.this.f342024e != 0) {
                            JNI c = C114216sq.this.f342023d;
                            long b = C114216sq.this.f342024e;
                            RectF rectF = r3;
                            c.nativeSetFlagOfZoomToSpanForLocation(b, rectF.top, rectF.left, rectF.bottom, rectF.right);
                            C114216sq.this.f342023d.nativeZoomToSpanForNavigation(C114216sq.this.f342024e, r4, r5, r6, r7);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private void m158023a(int i, int i2, int i3) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null && 0 != sqVar.f342024e && sqVar.f342029j != null) {
            sqVar.mo172914a((C113963a) new C113963a(i, i2, i3) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetMarkerScaleLevelRange(C114216sq.this.f342024e, r6, r7, r8);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo172434a(C114014ok okVar) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.f342028i = okVar;
        }
    }

    @Deprecated
    /* renamed from: a */
    private int m158012a(TileOverlayCallback tileOverlayCallback, boolean z) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            return sqVar.mo172896a(tileOverlayCallback, z);
        }
        return -1;
    }

    /* renamed from: a */
    private void m158033a(C114015ol olVar) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.f342023d.setMapCallbackGetGLContext(olVar);
        }
    }

    /* renamed from: a */
    public final void mo172427a(int i, int i2) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113963a) new C113963a(i, i2) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeBringElementAbove(C114216sq.this.f342024e, r2, r3);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m158022a(int i, float f) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172906a(i, f);
        }
    }

    /* renamed from: a */
    private void m158038a(Language language) {
        if (this.f340917y == null) {
            this.f340917y = new C113965c();
        }
        C113965c cVar = this.f340917y;
        C114216sq sqVar = C113961mq.this.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113963a) new C113963a(language.ordinal()) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetLanguage(C114216sq.this.f342024e, r2);
                    }
                }
            });
            C113961mq.this.f340914v = true;
            C113961mq.this.f340914v = true;
            cVar.mo172465a(language);
        }
    }

    /* renamed from: a */
    public final void mo172430a(C113718fc fcVar) {
        if (this.f340917y == null) {
            this.f340917y = new C113965c();
        }
        this.f340917y.mo172464a(fcVar);
    }

    /* renamed from: a */
    public final void mo172435a(C114016om omVar) {
        List<C114016om> list = this.f340879I;
        if (list != null) {
            list.add(omVar);
        }
    }

    /* renamed from: a */
    public final TappedElement mo172419a(float f, float f2) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            return sqVar.mo172899a(f, f2);
        }
        return null;
    }

    /* renamed from: a */
    private float m158010a(double d, GeoPoint geoPoint) {
        C113707es esVar;
        if (!(geoPoint == null || this.f340912t == null || (esVar = this.f340906n) == null)) {
            double metersPerPixel = esVar.metersPerPixel(((double) geoPoint.getLatitudeE6()) / 1000000.0d);
            if (metersPerPixel != 0.0d) {
                return (float) (d / metersPerPixel);
            }
        }
        return 0.0f;
    }

    /* renamed from: a */
    private void m158036a(CustomRender customRender) {
        this.f340876F = customRender;
        this.f340914v = true;
    }

    /* renamed from: a */
    private VectorHeatOverlay m158019a(VectorHeatOverlayOptions vectorHeatOverlayOptions) {
        if (this.f340899g == null) {
            return null;
        }
        C113792gv gvVar = this.f339861d;
        if (gvVar != null) {
            gvVar.mo172161h().mo172172a();
        }
        return (VectorHeatOverlay) this.f340903k.mo171680a(new C113976mx(vectorHeatOverlayOptions));
    }

    /* renamed from: a */
    public final <V extends VectorOverlay> V mo172421a(VectorOverlayProvider vectorOverlayProvider) {
        if (this.f340899g == null) {
            return null;
        }
        if (vectorOverlayProvider instanceof AggregationOverlayProvider) {
            C113792gv gvVar = this.f339861d;
            if (gvVar != null) {
                gvVar.mo172161h().mo172172a();
            }
            return (C113975mw) this.f340903k.mo171680a(new C113976mx((AggregationOverlayProvider) vectorOverlayProvider));
        } else if (vectorOverlayProvider instanceof GradientVectorOverlayProvider) {
            C113792gv gvVar2 = this.f339861d;
            if (gvVar2 != null) {
                gvVar2.mo172162i().f340398a++;
            }
            return (C113989ni) this.f340903k.mo171680a(new C113991nk((GradientVectorOverlayProvider) vectorOverlayProvider));
        } else if (vectorOverlayProvider instanceof ArcLineOverlayProvider) {
            C113792gv gvVar3 = this.f339861d;
            if (gvVar3 != null) {
                gvVar3.mo172163j().f340389a++;
            }
            return (C113978mz) this.f340903k.mo171680a(new C113981nb((ArcLineOverlayProvider) vectorOverlayProvider));
        } else if (vectorOverlayProvider instanceof DotScatterPlotOverlayProvider) {
            C113792gv gvVar4 = this.f339861d;
            if (gvVar4 != null) {
                gvVar4.mo172164k().f340395a++;
            }
            return (C113998nr) this.f340903k.mo171680a(new C114000nt(this.f340899g.mo172893B(), (DotScatterPlotOverlayProvider) vectorOverlayProvider));
        } else if (vectorOverlayProvider instanceof BitmapScatterPlotOverlayProvider) {
            C113792gv gvVar5 = this.f339861d;
            if (gvVar5 != null) {
                gvVar5.mo172165l().f340390a++;
            }
            return (C113998nr) this.f340903k.mo171680a(new C114000nt(this.f340899g.mo172893B(), (BitmapScatterPlotOverlayProvider) vectorOverlayProvider));
        } else if (vectorOverlayProvider instanceof TrailOverlayProvider) {
            C113792gv gvVar6 = this.f339861d;
            if (gvVar6 != null) {
                gvVar6.mo172166m().f340446a++;
            }
            return (C114001nu) this.f340903k.mo171680a(new C114003nw((TrailOverlayProvider) vectorOverlayProvider));
        } else if (!(vectorOverlayProvider instanceof GLModelOverlayProvider)) {
            return null;
        } else {
            C113792gv gvVar7 = this.f339861d;
            if (gvVar7 != null) {
                gvVar7.mo172167n().f340396a++;
            }
            return (C113984ne) this.f340903k.mo171680a(new C113983nd((GLModelOverlayProvider) vectorOverlayProvider));
        }
    }

    /* renamed from: a */
    private void m158041a(VectorOverlay vectorOverlay, VectorOverlayProvider vectorOverlayProvider) {
        Class<C113998nr> cls = C113998nr.class;
        if (this.f340899g != null) {
            if (vectorOverlayProvider instanceof AggregationOverlayProvider) {
                C113975mw mwVar = (C113975mw) this.f340903k.mo171681a(C113975mw.class, ((C113975mw) vectorOverlay).mo172479b());
                if (mwVar != null) {
                    mwVar.mo172478a(new C113976mx((AggregationOverlayProvider) vectorOverlayProvider));
                } else {
                    mo172421a(vectorOverlayProvider);
                }
            } else if (vectorOverlayProvider instanceof GradientVectorOverlayProvider) {
                C113989ni niVar = (C113989ni) this.f340903k.mo171681a(C113989ni.class, ((C113989ni) vectorOverlay).mo172479b());
                if (niVar != null) {
                    niVar.mo172478a(new C113991nk((GradientVectorOverlayProvider) vectorOverlayProvider));
                } else {
                    mo172421a(vectorOverlayProvider);
                }
            } else if (vectorOverlayProvider instanceof ArcLineOverlayProvider) {
                C113978mz mzVar = (C113978mz) this.f340903k.mo171681a(C113978mz.class, ((C113978mz) vectorOverlay).mo172479b());
                if (mzVar != null) {
                    mzVar.mo172478a(new C113981nb((ArcLineOverlayProvider) vectorOverlayProvider));
                } else {
                    mo172421a(vectorOverlayProvider);
                }
            } else if (vectorOverlayProvider instanceof DotScatterPlotOverlayProvider) {
                C113998nr nrVar = (C113998nr) this.f340903k.mo171681a(cls, ((C113998nr) vectorOverlay).mo172479b());
                if (nrVar != null) {
                    nrVar.mo172478a(new C114000nt(this.f340899g.mo172893B(), (DotScatterPlotOverlayProvider) vectorOverlayProvider));
                } else {
                    mo172421a(vectorOverlayProvider);
                }
            } else if (vectorOverlayProvider instanceof BitmapScatterPlotOverlayProvider) {
                C113998nr nrVar2 = (C113998nr) this.f340903k.mo171681a(cls, ((C113998nr) vectorOverlay).mo172479b());
                if (nrVar2 != null) {
                    nrVar2.mo172478a(new C114000nt(this.f340899g.mo172893B(), (BitmapScatterPlotOverlayProvider) vectorOverlayProvider));
                } else {
                    mo172421a(vectorOverlayProvider);
                }
            } else if (vectorOverlayProvider instanceof TrailOverlayProvider) {
                C114001nu nuVar = (C114001nu) this.f340903k.mo171681a(C114001nu.class, ((C114001nu) vectorOverlay).mo172479b());
                if (nuVar != null) {
                    nuVar.mo172478a(new C114003nw((TrailOverlayProvider) vectorOverlayProvider));
                } else {
                    mo172421a(vectorOverlayProvider);
                }
            } else if (vectorOverlayProvider instanceof GLModelOverlayProvider) {
                C113984ne neVar = (C113984ne) this.f340903k.mo171681a(C113984ne.class, ((C113984ne) vectorOverlay).mo172479b());
                if (neVar != null) {
                    neVar.mo172478a(new C113983nd((GLModelOverlayProvider) vectorOverlayProvider));
                } else {
                    mo172421a(vectorOverlayProvider);
                }
            }
        }
    }

    /* renamed from: a */
    private GroundOverlay m158016a(GroundOverlayOptions groundOverlayOptions) {
        if (this.f340899g == null) {
            return null;
        }
        C113792gv gvVar = this.f339861d;
        if (gvVar != null) {
            gvVar.mo172168o().f340397a++;
        }
        return (GroundOverlay) this.f340903k.mo171680a(new C113988nh(this.f340899g.mo172893B(), groundOverlayOptions));
    }

    /* renamed from: a */
    private IntersectionOverlay m158017a(IntersectionOverlayOptions intersectionOverlayOptions) {
        if (this.f340899g == null) {
            return null;
        }
        return (IntersectionOverlay) this.f340903k.mo171680a(new C113994nn(intersectionOverlayOptions));
    }

    /* renamed from: a */
    private void m158039a(OverSeaTileProvider overSeaTileProvider) {
        C113532ba baVar = this.f340905m;
        if (baVar != null) {
            baVar.mo171571a(overSeaTileProvider);
        }
    }

    /* renamed from: a */
    private void m158040a(TrafficStyle trafficStyle) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172915a(trafficStyle);
        }
    }

    /* renamed from: a */
    private void m158032a(C113711ev evVar) {
        C113532ba baVar = this.f340905m;
        if (baVar != null) {
            baVar.mo171559a(evVar);
        }
    }

    /* renamed from: a */
    public final void mo172438a(String str, String str2) {
        C114216sq sqVar = this.f340899g;
        if (sqVar != null) {
            sqVar.mo172916a(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo172436a(LatLngBounds latLngBounds, int i) {
        if (this.f340899g != null) {
            if (latLngBounds == null || latLngBounds.isEmptySpan()) {
                this.f340899g.mo172921a((double[]) null, (double[]) null, 0);
                return;
            }
            this.f340899g.mo172921a(new double[]{latLngBounds.getLonWest(), latLngBounds.getLatSouth(), latLngBounds.getLonEast(), latLngBounds.getLatNorth()}, new double[]{0.0d, 0.0d, (double) this.f340890Y, (double) this.f340891Z}, i);
        }
    }

    /* renamed from: a */
    private void m158034a(C114018oo ooVar) {
        this.f340877G = ooVar;
    }

    /* renamed from: a */
    private void m158037a(TencentMap.OnVectorOverlayClickListener onVectorOverlayClickListener) {
        this.f340881K = onVectorOverlayClickListener;
    }

    /* renamed from: a */
    private boolean m158046a(float f, float f2, C113711ev evVar) {
        C114216sq sqVar;
        if (this.f340882L == null) {
            C113971mt mtVar = this.f340903k.f339824i.get(C113983nd.class);
            if ((mtVar != null ? mtVar.mo172498i() : false) && (sqVar = this.f340899g) != null) {
                sqVar.f342023d.scheduleClickOnNextRender(sqVar.f342024e, f, f2);
                this.f340882L = evVar;
                return true;
            }
        }
        this.f340882L = null;
        return false;
    }

    /* renamed from: a */
    private void m158021a(float f, float f2, long j, String str, String str2) {
        Pair<VectorOverlay, TencentMap.IClickedObject> pair;
        TencentMap.OnVectorOverlayClickListener onVectorOverlayClickListener;
        if (j > 0) {
            LatLng fromScreenLocation = this.f340906n.fromScreenLocation(new Point((int) f, (int) f2));
            C113971mt mtVar = this.f340903k.f339824i.get(C113983nd.class);
            if (mtVar != null) {
                pair = mtVar.mo172484a(fromScreenLocation, j, str, str2);
            } else {
                pair = new Pair<>((Object) null, (Object) null);
            }
            Object obj = pair.first;
            if (!(obj == null || (onVectorOverlayClickListener = this.f340881K) == null)) {
                onVectorOverlayClickListener.onClicked((VectorOverlay) obj, (TencentMap.IClickedObject) pair.second);
            }
        } else {
            this.f340882L.mo172042b(f, f2);
        }
        this.f340882L = null;
    }
}
