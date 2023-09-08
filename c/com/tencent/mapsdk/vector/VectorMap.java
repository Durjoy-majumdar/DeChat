package com.tencent.mapsdk.vector;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.tencent.map.lib.MapLanguage;
import com.tencent.map.lib.callbacks.TileOverlayCallback;
import com.tencent.map.lib.models.AnnocationText;
import com.tencent.map.lib.models.AnnocationTextResult;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.lib.models.IndoorCellInfo;
import com.tencent.map.lib.models.MaskLayer;
import com.tencent.map.lib.models.PolygonInfo;
import com.tencent.map.sdk.comps.vis.VisualLayer;
import com.tencent.map.sdk.comps.vis.VisualLayerOptions;
import com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.p1182od.ArcLineOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.engine.jni.models.TappedElement;
import com.tencent.mapsdk.internal.C0949kl;
import com.tencent.mapsdk.internal.C0950kp;
import com.tencent.mapsdk.internal.C104547ek;
import com.tencent.mapsdk.internal.C104548ha;
import com.tencent.mapsdk.internal.C104556ma;
import com.tencent.mapsdk.internal.C113495aa;
import com.tencent.mapsdk.internal.C113502ac;
import com.tencent.mapsdk.internal.C113503ad;
import com.tencent.mapsdk.internal.C113512af;
import com.tencent.mapsdk.internal.C113515ai;
import com.tencent.mapsdk.internal.C113516aj;
import com.tencent.mapsdk.internal.C113524as;
import com.tencent.mapsdk.internal.C113528aw;
import com.tencent.mapsdk.internal.C113529ax;
import com.tencent.mapsdk.internal.C113532ba;
import com.tencent.mapsdk.internal.C113533bb;
import com.tencent.mapsdk.internal.C113536be;
import com.tencent.mapsdk.internal.C113538bg;
import com.tencent.mapsdk.internal.C113540bh;
import com.tencent.mapsdk.internal.C113551bi;
import com.tencent.mapsdk.internal.C113554bj;
import com.tencent.mapsdk.internal.C113556bk;
import com.tencent.mapsdk.internal.C113558bl;
import com.tencent.mapsdk.internal.C113563bm;
import com.tencent.mapsdk.internal.C113572bv;
import com.tencent.mapsdk.internal.C113645dy;
import com.tencent.mapsdk.internal.C113704ep;
import com.tencent.mapsdk.internal.C113707es;
import com.tencent.mapsdk.internal.C113709et;
import com.tencent.mapsdk.internal.C113710eu;
import com.tencent.mapsdk.internal.C113711ev;
import com.tencent.mapsdk.internal.C113712ew;
import com.tencent.mapsdk.internal.C113713ex;
import com.tencent.mapsdk.internal.C113714ez;
import com.tencent.mapsdk.internal.C113716fa;
import com.tencent.mapsdk.internal.C113717fb;
import com.tencent.mapsdk.internal.C113718fc;
import com.tencent.mapsdk.internal.C113719fd;
import com.tencent.mapsdk.internal.C113720fe;
import com.tencent.mapsdk.internal.C113721ff;
import com.tencent.mapsdk.internal.C113722fg;
import com.tencent.mapsdk.internal.C113723fh;
import com.tencent.mapsdk.internal.C113724fi;
import com.tencent.mapsdk.internal.C113725fj;
import com.tencent.mapsdk.internal.C113726fk;
import com.tencent.mapsdk.internal.C113727fl;
import com.tencent.mapsdk.internal.C113732fo;
import com.tencent.mapsdk.internal.C113801hf;
import com.tencent.mapsdk.internal.C113818hx;
import com.tencent.mapsdk.internal.C113831iz;
import com.tencent.mapsdk.internal.C113865kb;
import com.tencent.mapsdk.internal.C113884kf;
import com.tencent.mapsdk.internal.C113889km;
import com.tencent.mapsdk.internal.C113896kq;
import com.tencent.mapsdk.internal.C113959ml;
import com.tencent.mapsdk.internal.C113960mp;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.mapsdk.internal.C113975mw;
import com.tencent.mapsdk.internal.C113976mx;
import com.tencent.mapsdk.internal.C113978mz;
import com.tencent.mapsdk.internal.C113981nb;
import com.tencent.mapsdk.internal.C113983nd;
import com.tencent.mapsdk.internal.C113984ne;
import com.tencent.mapsdk.internal.C113989ni;
import com.tencent.mapsdk.internal.C113991nk;
import com.tencent.mapsdk.internal.C113998nr;
import com.tencent.mapsdk.internal.C114000nt;
import com.tencent.mapsdk.internal.C114001nu;
import com.tencent.mapsdk.internal.C114003nw;
import com.tencent.mapsdk.internal.C114009oc;
import com.tencent.mapsdk.internal.C114014ok;
import com.tencent.mapsdk.internal.C114016om;
import com.tencent.mapsdk.internal.C114018oo;
import com.tencent.mapsdk.internal.C114020os;
import com.tencent.mapsdk.internal.C114024ow;
import com.tencent.mapsdk.internal.C114034pb;
import com.tencent.mapsdk.internal.C114050ph;
import com.tencent.mapsdk.internal.C114062pj;
import com.tencent.mapsdk.internal.C114065pl;
import com.tencent.mapsdk.internal.C114085pu;
import com.tencent.mapsdk.internal.C114094px;
import com.tencent.mapsdk.internal.C114096qc;
import com.tencent.mapsdk.internal.C114131qz;
import com.tencent.mapsdk.internal.C114133rb;
import com.tencent.mapsdk.internal.C114136rc;
import com.tencent.mapsdk.internal.C114165rp;
import com.tencent.mapsdk.internal.C114175rr;
import com.tencent.mapsdk.internal.C114181rs;
import com.tencent.mapsdk.internal.C114216sq;
import com.tencent.mapsdk.internal.C114322sx;
import com.tencent.mapsdk.internal.C114337tf;
import com.tencent.mapsdk.internal.C114367v;
import com.tencent.mapsdk.internal.C114371w;
import com.tencent.mapsdk.internal.C114375z;
import com.tencent.mapsdk.internal.C24211ig;
import com.tencent.mapsdk.internal.C24212ij;
import com.tencent.mapsdk.internal.C24229it;
import com.tencent.mapsdk.internal.C24236ix;
import com.tencent.mapsdk.internal.C26872ae;
import com.tencent.mapsdk.internal.C26875te;
import com.tencent.mapsdk.internal.C40002he;
import com.tencent.mapsdk.internal.C55064ey;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdate;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory;
import com.tencent.tencentmap.mapsdk.maps.CustomRender;
import com.tencent.tencentmap.mapsdk.maps.LocationSource;
import com.tencent.tencentmap.mapsdk.maps.MapParamConstants;
import com.tencent.tencentmap.mapsdk.maps.Projection;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.UiSettings;
import com.tencent.tencentmap.mapsdk.maps.internal.TencentMapPro;
import com.tencent.tencentmap.mapsdk.maps.model.AoiLayer;
import com.tencent.tencentmap.mapsdk.maps.model.AoiLayerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Arc;
import com.tencent.tencentmap.mapsdk.maps.model.ArcOptions;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import com.tencent.tencentmap.mapsdk.maps.model.Circle;
import com.tencent.tencentmap.mapsdk.maps.model.CircleOptions;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayer;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.GeometryConstants;
import com.tencent.tencentmap.mapsdk.maps.model.IOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.MapFontSize;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;
import com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider;
import com.tencent.tencentmap.mapsdk.maps.model.Polygon;
import com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Polyline;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
import com.tencent.tencentmap.mapsdk.maps.model.RestrictBoundsFitMode;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class VectorMap extends C113563bm {

    /* renamed from: a */
    public static final int f342873a = 0;

    /* renamed from: b */
    public static final int f342874b = 1;

    /* renamed from: c */
    public static final int f342875c = 2;

    /* renamed from: d */
    public static final int f342876d = 3;

    /* renamed from: e */
    public static final int f342877e = 4;

    /* renamed from: f */
    public static final int f342878f = 5;

    /* renamed from: g */
    public static final int f342879g = 11;

    /* renamed from: h */
    public static final int f342880h = 15;

    /* renamed from: i */
    public static final int f342881i = 18;

    /* renamed from: j */
    public static final float f342882j = MapParamConstants.MAX_SKEW_ANGLE;

    /* renamed from: k */
    public static final int f342883k = 0;

    /* renamed from: l */
    public static final int f342884l = 1;

    /* renamed from: m */
    public static final int f342885m = 2;

    /* renamed from: t */
    public static final int f342886t = 0;

    /* renamed from: u */
    public static final int f342887u = 1;

    /* renamed from: v */
    public static final int f342888v = 2;

    /* renamed from: w */
    public static final int f342889w = 3;

    /* renamed from: x */
    private static final int f342890x = 1;

    /* renamed from: y */
    private static final int f342891y = 2;

    /* renamed from: z */
    private static final int f342892z = 3;

    /* renamed from: A */
    private C114065pl f342893A = null;

    /* renamed from: B */
    private C113512af f342894B = null;

    /* renamed from: C */
    private Projection f342895C = null;

    /* renamed from: D */
    private C113495aa f342896D;

    /* renamed from: E */
    private C113502ac f342897E = null;

    /* renamed from: F */
    private C26872ae f342898F = null;

    /* renamed from: G */
    private boolean f342899G = false;

    /* renamed from: H */
    private boolean f342900H = false;

    /* renamed from: I */
    private UiSettings f342901I;

    /* renamed from: J */
    private boolean f342902J;

    /* renamed from: K */
    private TencentMapPro f342903K;

    /* renamed from: L */
    private C114337tf f342904L;

    /* renamed from: M */
    private float f342905M;

    /* renamed from: N */
    private GeoPoint f342906N = new GeoPoint();

    /* renamed from: O */
    private int f342907O = 0;

    /* renamed from: n */
    public boolean f342908n = false;

    /* renamed from: o */
    public C113961mq f342909o;

    /* renamed from: p */
    public boolean f342910p = true;

    /* renamed from: q */
    public C113540bh f342911q;

    /* renamed from: r */
    public C113538bg f342912r = null;

    /* renamed from: s */
    public C114062pj f342913s;

    /* renamed from: com.tencent.mapsdk.vector.VectorMap$3 */
    public static /* synthetic */ class C1143813 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f342916a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tencent.tencentmap.mapsdk.maps.model.Language[] r0 = com.tencent.tencentmap.mapsdk.maps.model.Language.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f342916a = r0
                com.tencent.tencentmap.mapsdk.maps.model.Language r1 = com.tencent.tencentmap.mapsdk.maps.model.Language.en     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f342916a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.tencentmap.mapsdk.maps.model.Language r1 = com.tencent.tencentmap.mapsdk.maps.model.Language.zh     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.vector.VectorMap.C1143813.<clinit>():void");
        }
    }

    public VectorMap(C113961mq mqVar) {
        this.f342909o = mqVar;
    }

    /* renamed from: A */
    private String[] m160683A() {
        C113961mq mqVar = this.f342909o;
        Rect q = mqVar.f340901i.mo171254q();
        Point[] pointArr = {new Point(q.centerX(), q.centerY()), new Point(q.left, q.top), new Point(q.left, q.bottom), new Point(q.right, q.top), new Point(q.right, q.bottom)};
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 5; i++) {
            Point point = pointArr[i];
            String a = mqVar.mo172422a(new GeoPoint(point.y, point.x));
            if (!C40002he.m42805a(a)) {
                hashSet.add(a);
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    /* renamed from: B */
    private Rect m160684B() {
        return this.f342909o.f340901i.mo171254q();
    }

    /* renamed from: C */
    private Rect m160685C() {
        return this.f342909o.f340901i.mo171255r();
    }

    /* renamed from: D */
    private int m160686D() {
        return this.f342909o.f340901i.f339663A.f342783b.f342821q;
    }

    /* renamed from: E */
    private GeoPoint m160687E() {
        return this.f342909o.f340901i.mo171256s();
    }

    /* renamed from: F */
    private GeoPoint m160688F() {
        return this.f342909o.f340901i.mo171257t();
    }

    /* renamed from: G */
    private boolean m160689G() {
        return this.f342909o.f340908p;
    }

    /* renamed from: H */
    private static void m160690H() {
    }

    /* renamed from: I */
    private boolean m160691I() {
        return this.f342909o.f340909q;
    }

    /* renamed from: J */
    private boolean m160692J() {
        C113961mq mqVar = this.f342909o;
        C114216sq sqVar = mqVar.f340899g;
        return sqVar != null && ((Integer) sqVar.mo172900a(new CallbackRunnable<Integer>(mqVar.mo172412D()) {
            /* renamed from: a */
            private Integer m159996a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeIsCityHasTraffic(C114216sq.this.f342024e, str));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeIsCityHasTraffic(C114216sq.this.f342024e, str));
            }
        }, 0)).intValue() == 1;
    }

    /* renamed from: K */
    private static boolean m160693K() {
        return true;
    }

    /* renamed from: L */
    private float m160694L() {
        return this.f342909o.f340901i.f339663A.f342783b.mo173072a();
    }

    /* renamed from: M */
    private void m160695M() {
        this.f342909o.f340901i.mo171219a((Runnable) null);
    }

    /* renamed from: N */
    private void m160696N() {
        this.f342909o.f340901i.mo171235b((Runnable) null);
    }

    /* renamed from: O */
    private void m160697O() {
        this.f342909o.f340901i.mo171253p();
    }

    /* renamed from: P */
    private boolean m160698P() {
        return this.f342909o.f340901i.mo171248k();
    }

    /* renamed from: Q */
    private void m160699Q() {
        C113503ad adVar = this.f342909o.f340901i;
        adVar.mo171252o();
        adVar.mo171247j();
    }

    /* renamed from: R */
    private void m160700R() {
        C113503ad adVar = this.f342909o.f340901i;
        adVar.mo171252o();
        adVar.mo171201a((double) adVar.mo171245h(), (double) MapParamConstants.MAX_SKEW_ANGLE, true);
    }

    /* renamed from: S */
    private void m160701S() {
        C113503ad adVar = this.f342909o.f340901i;
        adVar.mo171252o();
        adVar.f339685o.mo173098e();
        adVar.mo171199a(0.0d, 0.0d);
    }

    /* renamed from: T */
    private void m160702T() {
        C113503ad adVar = this.f342909o.f340901i;
        adVar.mo171252o();
        adVar.f339685o.mo173098e();
        adVar.mo171199a((double) adVar.mo171245h(), (double) MapParamConstants.MAX_SKEW_ANGLE);
    }

    /* renamed from: U */
    private void m160703U() {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null) {
            sqVar.mo171854d();
        }
    }

    /* renamed from: V */
    private void m160704V() {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null) {
            sqVar.mo171856f();
        }
    }

    /* renamed from: W */
    private void m160705W() {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null) {
            sqVar.mo171855e();
        }
    }

    /* renamed from: X */
    private void m160706X() {
        C114371w wVar = this.f342909o.f340910r;
        if (wVar != null) {
            wVar.mo173082c();
        }
    }

    /* renamed from: Y */
    private void m160707Y() {
        this.f342909o.f340903k.f339822g = null;
    }

    /* renamed from: Z */
    private void m160708Z() {
        this.f342909o.f340911s.mo172467a();
    }

    /* renamed from: aA */
    private boolean m160762aA() {
        return this.f342908n;
    }

    /* renamed from: aB */
    private void m160763aB() {
        this.f342908n = true;
    }

    /* renamed from: aC */
    private ArrayList<MapPoi> m160764aC() {
        C113961mq mqVar = this.f342909o;
        if (mqVar == null) {
            return null;
        }
        return mqVar.mo172415G();
    }

    /* renamed from: aD */
    private String m160765aD() {
        C114216sq sqVar;
        C113961mq mqVar = this.f342909o;
        if (mqVar == null || (sqVar = mqVar.f340899g) == null) {
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

    /* renamed from: aE */
    private String m160766aE() {
        C114216sq sqVar;
        C113961mq mqVar = this.f342909o;
        if (mqVar == null || (sqVar = mqVar.f340899g) == null) {
            return null;
        }
        return sqVar.mo171844a();
    }

    /* renamed from: aF */
    private C113961mq m160767aF() {
        return this.f342909o;
    }

    /* renamed from: aG */
    private C113540bh m160768aG() {
        return this.f342911q;
    }

    /* renamed from: aH */
    private void m160769aH() {
        C113538bg bgVar = this.f342912r;
        if (bgVar != null) {
            bgVar.mo171271c();
            bgVar.f339746a = null;
            this.f342912r = null;
        }
        C113540bh bhVar = this.f342911q;
        if (bhVar != null) {
            if (bhVar.f339763b != null) {
                ((VectorMap) bhVar.f339763b.f339878e_).mo173457b(bhVar.f339772k);
                C114322sx sxVar = bhVar.f339763b;
                Handler handler = sxVar.f342519B;
                if (handler != null) {
                    handler.removeCallbacksAndMessages((Object) null);
                }
                Handler handler2 = sxVar.f342526I;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages((Object) null);
                }
                List<C113723fh> list = sxVar.f342591r;
                if (list != null) {
                    list.clear();
                    sxVar.f342591r = null;
                }
                sxVar.mo171612l();
                sxVar.f342592s = null;
                sxVar.f342599z = null;
                sxVar.f342595v = null;
                sxVar.f342521D = null;
                sxVar.f342589p = null;
                bhVar.f339763b = null;
            }
            if (bhVar.f339764c != null) {
                bhVar.f339764c = null;
            }
            C104548ha.C104549a aVar = C104548ha.f309920b;
            if (aVar != null) {
                aVar.mo147865c();
            }
            this.f342911q = null;
        }
    }

    /* renamed from: aI */
    private void m160770aI() {
        C26872ae aeVar = this.f342898F;
        if (aeVar != null) {
            if (aeVar.f74714a != null) {
                aeVar.f74714a = null;
            }
            this.f342898F = null;
        }
        C113502ac acVar = this.f342897E;
        if (acVar != null) {
            if (acVar.f339642a != null) {
                acVar.f339642a = null;
            }
            this.f342897E = null;
        }
        C113495aa aaVar = this.f342896D;
        if (aaVar != null) {
            if (aaVar.f339616b != null) {
                aaVar.f339616b = null;
            }
            this.f342896D = null;
        }
        if (this.f342895C != null) {
            this.f342895C = null;
        }
        C113512af afVar = this.f342894B;
        if (afVar != null) {
            if (afVar.f339724a != null) {
                afVar.f339724a = null;
            }
            this.f342894B = null;
        }
    }

    /* renamed from: aa */
    private long m160771aa() {
        return this.f342909o.f340901i.f339685o.mo173097c();
    }

    /* renamed from: ab */
    private void m160772ab() {
        this.f342909o.f340901i.f339685o.mo173093a();
    }

    /* renamed from: ac */
    private void m160773ac() {
        this.f342909o.f340901i.f339685o.mo173096b();
    }

    /* renamed from: ad */
    private String m160774ad() {
        return this.f342909o.toString();
    }

    /* renamed from: ae */
    private boolean m160775ae() {
        return this.f342909o.f340901i.f339685o.mo173099f();
    }

    /* renamed from: af */
    private void m160776af() {
        this.f342909o.f340901i.f339685o.f342856e = 60;
    }

    /* renamed from: ag */
    private int m160777ag() {
        return this.f342909o.f340901i.f339663A.f342785d;
    }

    /* renamed from: ah */
    private Rect m160778ah() {
        return this.f342909o.f340907o;
    }

    /* renamed from: ai */
    private void m160779ai() {
        this.f342909o.f340901i.mo171242e();
    }

    /* renamed from: aj */
    private void m160780aj() {
        this.f342909o.f340901i.mo171243f();
    }

    /* renamed from: ak */
    private void m160781ak() {
        C114136rc rcVar;
        C113961mq mqVar = this.f342909o;
        if (mqVar.f340909q && (rcVar = mqVar.f340902j) != null) {
            rcVar.mo172756a();
        }
    }

    /* renamed from: al */
    private void m160782al() {
        this.f342909o.mo172410B();
    }

    /* renamed from: am */
    private int m160783am() {
        return this.f342907O;
    }

    /* renamed from: an */
    private C113538bg m160784an() {
        return this.f342912r;
    }

    /* renamed from: ao */
    private String[] m160785ao() {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null) {
            return (String[]) sqVar.mo172900a(new CallbackRunnable<String[]>() {
                /* renamed from: a */
                private java.lang.String[] m159998a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.159.a():java.lang.String[], dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.159.a():java.lang.String[], class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public final /* synthetic */ java.lang.Object run(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.159.run():java.lang.Object, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.159.run():java.lang.Object, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }, null);
        }
        return null;
    }

    /* renamed from: ap */
    private String m160786ap() {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null) {
            return (String) sqVar.mo172900a(new CallbackRunnable<String>() {
                /* renamed from: a */
                private java.lang.String m160002a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.162.a():java.lang.String, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.162.a():java.lang.String, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public final /* synthetic */ java.lang.Object run(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.162.run():java.lang.Object, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.162.run():java.lang.Object, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }, null);
        }
        return null;
    }

    /* renamed from: aq */
    private Rect m160787aq() {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null) {
            return (Rect) sqVar.mo172900a(new CallbackRunnable<Rect>() {
                /* renamed from: a */
                private android.graphics.Rect m160001a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.161.a():android.graphics.Rect, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.161.a():android.graphics.Rect, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public final /* synthetic */ java.lang.Object run(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.161.run():java.lang.Object, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.161.run():java.lang.Object, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }, null);
        }
        return null;
    }

    /* renamed from: ar */
    private C114367v m160788ar() {
        return this.f342909o.f340901i.mo171244g();
    }

    /* renamed from: as */
    private void m160789as() {
        this.f342909o.f340901i.mo171247j();
    }

    /* renamed from: at */
    private C113960mp m160790at() {
        return this.f342909o.f340904l;
    }

    /* renamed from: au */
    private C114367v m160791au() {
        return this.f342909o.f340912t;
    }

    /* renamed from: av */
    private boolean m160792av() {
        return this.f342909o.f340878H.f341588f.mo172960v();
    }

    /* renamed from: aw */
    private Language m160793aw() {
        return this.f342909o.mo172413E();
    }

    /* renamed from: ax */
    private void m160794ax() {
        if (this.f342912r == null) {
            this.f342912r = new C113538bg(this.f342909o, this.f342896D);
        }
        if (this.f342897E == null) {
            this.f342897E = new C113502ac(this.f342912r);
        }
    }

    /* renamed from: ay */
    private boolean m160795ay() {
        return this.f342910p;
    }

    /* renamed from: az */
    private String m160796az() {
        C113961mq mqVar = this.f342909o;
        if (mqVar != null) {
            return mqVar.mo171811x();
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m160822b(GeoPoint geoPoint) {
        return C104547ek.f309914a.contains(geoPoint.getLongitudeE6(), geoPoint.getLatitudeE6());
    }

    /* renamed from: c */
    private String m160824c(GeoPoint geoPoint) {
        return this.f342909o.mo172422a(geoPoint);
    }

    /* renamed from: d */
    private static boolean m160840d(int i, int i2) {
        return GeometryConstants.BOUNDARY_WORLD.contains(i2, i);
    }

    /* renamed from: e */
    private synchronized void m160844e(C113709et etVar) {
        this.f342909o.f340903k.mo171684a(etVar);
        this.f342909o.f340914v = true;
    }

    /* renamed from: f */
    private void m160852f(C113709et etVar) {
        this.f342909o.f340903k.mo171688b(etVar);
        this.f342909o.f340914v = true;
    }

    /* renamed from: g */
    private void m160856g(int i) {
        this.f342909o.mo172426a(i);
    }

    /* renamed from: h */
    private void m160861h(int i) {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(i) {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.107.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.107.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    /* renamed from: i */
    private void m160865i(int i) {
        C113503ad adVar = this.f342909o.f340901i;
        adVar.mo171207a(i, (Runnable) new Runnable() {
            public final void run(
/*
Method generation error in method: com.tencent.mapsdk.internal.ad.4.run():void, dex: classes9.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.ad.4.run():void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        });
    }

    /* renamed from: j */
    private void m160869j(int i) {
        this.f342909o.f340901i.f339685o.mo173094a(i);
    }

    /* renamed from: k */
    private void m160871k(int i) {
        C113961mq mqVar = this.f342909o;
        if (mqVar != null) {
            if (i != 0) {
                int i2 = 17;
                if (i == 1) {
                    mqVar.mo172441a(false, false);
                    if (getMapStyle() != 11) {
                        i2 = 18;
                    }
                    int i3 = i2 - 1;
                    if (this.f342907O == 2) {
                        C113503ad adVar = this.f342909o.f340901i;
                        adVar.mo171207a(i3, (Runnable) new Runnable() {
                            /*  JADX ERROR: Method generation error
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.ad.4.run():void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                */
                            /*  JADX ERROR: Method generation error: Method args not loaded: com.tencent.mapsdk.internal.ad.4.run():void, class status: UNLOADED
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.ad.4.run():void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                */
                            public final void run(
/*
Method generation error in method: com.tencent.mapsdk.internal.ad.4.run():void, dex: classes9.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.ad.4.run():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        });
                    } else {
                        int r = mo173490r();
                        if (r > i3) {
                            i3 = r;
                        }
                        m160730a(this.f342906N, i3);
                    }
                } else if (i == 2) {
                    if (getMapStyle() != 11) {
                        i2 = 18;
                    }
                    int r2 = mo173490r();
                    if (r2 > i2) {
                        i2 = r2;
                    }
                    if (this.f342906N.getLatitudeE6() != 0) {
                        this.f342909o.f340901i.mo171206a(this.f342906N.getLatitudeE6(), this.f342906N.getLongitudeE6(), 2);
                    }
                    float f = this.f342905M;
                    C113503ad adVar2 = this.f342909o.f340901i;
                    adVar2.mo171207a(i2, (Runnable) new Runnable((double) f) {
                        public final void run(
/*
Method generation error in method: com.tencent.mapsdk.internal.ad.5.run():void, dex: classes9.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.ad.5.run():void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    });
                    new Handler().postDelayed(new Runnable() {
                        public final void run() {
                            VectorMap.this.f342909o.mo172441a(true, false);
                        }
                    }, 1000);
                } else if (i == 3) {
                    mqVar.mo172441a(false, true);
                }
            } else {
                mqVar.mo172441a(false, false);
            }
            this.f342907O = i;
        }
    }

    /* renamed from: l */
    private static int m160873l(int i) {
        if (i < 3) {
            i = 3;
        }
        if (i > 22) {
            return 22;
        }
        return i;
    }

    /* renamed from: l */
    private void m160874l(boolean z) {
        C113503ad adVar;
        C113961mq mqVar = this.f342909o;
        if (mqVar != null && (adVar = mqVar.f340901i) != null) {
            adVar.f339675M = z;
        }
    }

    /* renamed from: m */
    private void m160875m(int i) {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null && 0 != sqVar.f342024e) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(i) {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.170.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.170.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    /* renamed from: y */
    private static int m160879y() {
        return 20;
    }

    /* renamed from: z */
    private String m160880z() {
        return this.f342909o.mo172412D();
    }

    public AoiLayer addAoiLayer(String str, AoiLayerOptions aoiLayerOptions, AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener) {
        C114062pj pjVar;
        C114050ph phVar = null;
        if (!this.f342899G && (pjVar = this.f342913s) != null) {
            Iterator<C114050ph> it = pjVar.f341295a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C114050ph next = it.next();
                if (next.getId() != null && next.getId().equals(str)) {
                    phVar = next;
                    break;
                }
            }
            if (phVar == null) {
                phVar = new C114050ph(pjVar, str, aoiLayerOptions, pjVar);
                pjVar.f341295a.add(phVar);
                if (onAoiLayerLoadListener != null) {
                    pjVar.f341298d.put(str, onAoiLayerLoadListener);
                }
            }
            phVar.mo172635a(aoiLayerOptions);
            mo173486n();
        }
        return phVar;
    }

    public Arc addArc(ArcOptions arcOptions) {
        C113961mq mqVar;
        if (this.f342899G || (mqVar = this.f342909o) == null || arcOptions == null) {
            return null;
        }
        C113551bi biVar = mqVar.f340880J;
        C114024ow owVar = new C114024ow(arcOptions, biVar.f339809f);
        C113524as asVar = new C113524as(owVar);
        biVar.f339804a.put(owVar.getId(), asVar);
        biVar.f339806c.add(asVar);
        biVar.mo171675a((C113704ep) owVar);
        return asVar;
    }

    public Circle addCircle(CircleOptions circleOptions) {
        C113961mq mqVar;
        if (this.f342899G || circleOptions == null || (mqVar = this.f342909o) == null) {
            return null;
        }
        return mqVar.f340880J.mo171671a(circleOptions);
    }

    public CustomLayer addCustomLayer(CustomLayerOptions customLayerOptions) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.addCustomLayer(customLayerOptions);
        if (this.f342899G || (aaVar = this.f342896D) == null || (ajVar = aaVar.f339616b) == null) {
            return null;
        }
        return ajVar.mo171285a(customLayerOptions);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [com.tencent.mapsdk.internal.ms] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay addGroundOverlay(com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions r4) {
        /*
            r3 = this;
            boolean r0 = r3.f342899G
            r1 = 0
            if (r0 != 0) goto L_0x0036
            com.tencent.mapsdk.internal.mq r0 = r3.f342909o
            if (r0 == 0) goto L_0x0036
            if (r4 != 0) goto L_0x000c
            goto L_0x0036
        L_0x000c:
            com.tencent.mapsdk.internal.sq r2 = r0.f340899g
            if (r2 != 0) goto L_0x0011
            goto L_0x0033
        L_0x0011:
            com.tencent.mapsdk.internal.gv r1 = r0.f339861d
            if (r1 == 0) goto L_0x001f
            com.tencent.mapsdk.internal.go r1 = r1.mo172168o()
            int r2 = r1.f340397a
            int r2 = r2 + 1
            r1.f340397a = r2
        L_0x001f:
            com.tencent.mapsdk.internal.bj r1 = r0.f340903k
            com.tencent.mapsdk.internal.nh r2 = new com.tencent.mapsdk.internal.nh
            com.tencent.mapsdk.internal.sq r0 = r0.f340899g
            android.content.Context r0 = r0.mo172893B()
            r2.<init>(r0, r4)
            com.tencent.mapsdk.internal.ms r4 = r1.mo171680a(r2)
            r1 = r4
            com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay r1 = (com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay) r1
        L_0x0033:
            r3.mo173486n()
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.vector.VectorMap.addGroundOverlay(com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions):com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay");
    }

    public Marker addMarker(MarkerOptions markerOptions) {
        C113961mq mqVar;
        if (this.f342899G || (mqVar = this.f342909o) == null || markerOptions == null) {
            return null;
        }
        return mqVar.f340880J.mo171672a(markerOptions);
    }

    public void addOnMapLoadedCallback(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.addOnMapLoadedCallback(onMapLoadedCallback);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171301a(onMapLoadedCallback);
        }
    }

    public Polygon addPolygon(PolygonOptions polygonOptions) {
        C113961mq mqVar;
        if (this.f342899G || (mqVar = this.f342909o) == null || polygonOptions == null) {
            return null;
        }
        C113551bi biVar = mqVar.f340880J;
        C114034pb pbVar = new C114034pb(biVar.f339809f, polygonOptions);
        C113529ax axVar = new C113529ax(pbVar);
        biVar.f339804a.put(pbVar.getId(), axVar);
        biVar.f339807d.add(axVar);
        biVar.mo171675a((C113704ep) pbVar);
        return axVar;
    }

    public Polyline addPolyline(PolylineOptions polylineOptions) {
        C113961mq mqVar;
        if (this.f342899G || (mqVar = this.f342909o) == null || polylineOptions == null) {
            return null;
        }
        return mqVar.f340880J.mo171673a(polylineOptions);
    }

    public void addTencentMapGestureListener(TencentMapGestureListener tencentMapGestureListener) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.addTencentMapGestureListener(tencentMapGestureListener);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171312a(tencentMapGestureListener);
        }
    }

    public TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.addTileOverlay(tileOverlayOptions);
        if (this.f342899G || (aaVar = this.f342896D) == null || (ajVar = aaVar.f339616b) == null) {
            return null;
        }
        return ajVar.mo171286a(tileOverlayOptions);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [com.tencent.mapsdk.internal.ms] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay addVectorHeatOverlay(com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions r4) {
        /*
            r3 = this;
            boolean r0 = r3.f342899G
            r1 = 0
            if (r0 != 0) goto L_0x002b
            com.tencent.mapsdk.internal.mq r0 = r3.f342909o
            if (r0 != 0) goto L_0x000a
            goto L_0x002b
        L_0x000a:
            com.tencent.mapsdk.internal.sq r2 = r0.f340899g
            if (r2 != 0) goto L_0x000f
            goto L_0x0028
        L_0x000f:
            com.tencent.mapsdk.internal.gv r1 = r0.f339861d
            if (r1 == 0) goto L_0x001a
            com.tencent.mapsdk.internal.gz r1 = r1.mo172161h()
            r1.mo172172a()
        L_0x001a:
            com.tencent.mapsdk.internal.bj r0 = r0.f340903k
            com.tencent.mapsdk.internal.mx r1 = new com.tencent.mapsdk.internal.mx
            r1.<init>((com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions) r4)
            com.tencent.mapsdk.internal.ms r4 = r0.mo171680a(r1)
            r1 = r4
            com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay r1 = (com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay) r1
        L_0x0028:
            r3.mo173486n()
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.vector.VectorMap.addVectorHeatOverlay(com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions):com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay");
    }

    public <L extends VectorOverlay> L addVectorOverlay(VectorOverlayProvider vectorOverlayProvider) {
        C113961mq mqVar;
        if (this.f342899G || (mqVar = this.f342909o) == null) {
            return null;
        }
        L a = mqVar.mo172421a(vectorOverlayProvider);
        mo173486n();
        return a;
    }

    public VisualLayer addVisualLayer(VisualLayerOptions visualLayerOptions) {
        C113645dy dyVar = (C113645dy) getMapComponent(C113645dy.class);
        if (dyVar != null) {
            return dyVar.mo171967a(visualLayerOptions);
        }
        return null;
    }

    public void animateCamera(CameraUpdate cameraUpdate) {
        C113495aa aaVar;
        if (!this.f342899G && (aaVar = this.f342896D) != null && !aaVar.mo171185b()) {
            this.f342896D.mo171183a(cameraUpdate, 500, (TencentMap.CancelableCallback) null);
        }
    }

    public CameraPosition calculateZoomToSpanLevel(List<IOverlay> list, List<LatLng> list2, int i, int i2, int i3, int i4) {
        ArrayList arrayList;
        if (this.f342899G || this.f342896D == null) {
            return null;
        }
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(i3);
        int abs4 = Math.abs(i4);
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (IOverlay next : list) {
                if (next instanceof C113709et) {
                    arrayList2.add((C113709et) next);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        C113516aj ajVar = this.f342896D.f339616b;
        if (ajVar == null) {
            return null;
        }
        return ajVar.mo171283a(arrayList, list2, abs, abs2, abs3, abs4);
    }

    public void clear() {
        super.clear();
        clearAllOverlays();
    }

    public void clearAllOverlays() {
        C114337tf tfVar;
        super.clearAllOverlays();
        if (!this.f342899G && (tfVar = this.f342904L) != null) {
            tfVar.mo171612l();
        }
    }

    public void clearCache() {
        super.clearCache();
        C113884kf.m157508f(C113959ml.m157965a(getMapContext().getContext(), (TencentMapOptions) null).mo172405c());
    }

    public void clearRouteNameSegments() {
        C113961mq mqVar = this.f342909o;
        if (mqVar.f340918z == null) {
            mqVar.f340918z = new C113961mq.C113966d();
        }
        C113961mq.C113966d dVar = mqVar.f340918z;
        C113961mq.this.f340899g.mo172961w();
        dVar.f340930a = null;
        dVar.f340931b = null;
    }

    /* renamed from: e */
    public final void mo171719e() {
    }

    public void enableAutoMaxSkew(boolean z) {
        C113961mq mqVar;
        super.enableAutoMaxSkew(z);
        if (!this.f342899G && (mqVar = this.f342909o) != null) {
            mqVar.f340912t.f342800s = z;
        }
    }

    public void enableMultipleInfowindow(boolean z) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.enableMultipleInfowindow(z);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171338f(z);
        }
    }

    public String getActivedIndoorBuilding(LatLng latLng) {
        C113495aa aaVar;
        C113516aj ajVar;
        IndoorBuilding u;
        if (this.f342899G || (aaVar = this.f342896D) == null || (ajVar = aaVar.f339616b) == null || (u = ajVar.mo171356u()) == null) {
            return null;
        }
        if (!(u.getBuildingLatLng() == null || latLng == null)) {
            latLng.latitude = u.getBuildingLatLng().latitude;
            latLng.longitude = u.getBuildingLatLng().longitude;
        }
        return u.getBuildingName();
    }

    public String[] getActivedIndoorFloorNames() {
        C113495aa aaVar;
        C113516aj ajVar;
        if (this.f342899G || (aaVar = this.f342896D) == null || (ajVar = aaVar.f339616b) == null) {
            return null;
        }
        return ajVar.mo171354s();
    }

    public List<LatLng> getBounderPoints(Marker marker) {
        C113961mq mqVar;
        C113528aw awVar;
        if (marker == null || (mqVar = this.f342909o) == null || (awVar = (C113528aw) mqVar.f340880J.mo171670a(marker.getId(), C113528aw.class)) == null) {
            return null;
        }
        return awVar.f339728a.mo171378e();
    }

    public CameraPosition getCameraPosition() {
        C113495aa aaVar;
        if (this.f342899G || (aaVar = this.f342896D) == null) {
            return null;
        }
        return aaVar.mo171184a();
    }

    public String getCityName(LatLng latLng) {
        C113495aa aaVar;
        if (this.f342899G || (aaVar = this.f342896D) == null) {
            return "";
        }
        C113516aj ajVar = aaVar.f339616b;
        if (ajVar == null) {
            return null;
        }
        return ajVar.mo171287a(latLng);
    }

    public String getDebugError() {
        C113495aa aaVar;
        C113516aj ajVar;
        if (this.f342899G || (aaVar = this.f342896D) == null || (ajVar = aaVar.f339616b) == null) {
            return null;
        }
        return ajVar.mo171361z();
    }

    public int getIndoorFloorId() {
        C113495aa aaVar;
        C113516aj ajVar;
        if (this.f342899G || (aaVar = this.f342896D) == null || (ajVar = aaVar.f339616b) == null) {
            return -1;
        }
        return ajVar.mo171353r();
    }

    public MapLanguage getLanguage() {
        return C1143813.f342916a[this.f342909o.mo172413E().ordinal()] != 1 ? MapLanguage.LAN_CHINESE : MapLanguage.LAN_ENGLISH;
    }

    public TencentMapContext getMapContext() {
        return this.f342909o;
    }

    public int getMapHeight() {
        return this.f342909o.f339859b.getMapRenderView().getHeight();
    }

    public Rect getMapPadding() {
        return this.f342909o.f340901i.mo171221b();
    }

    public TencentMapPro getMapPro() {
        return this.f342903K;
    }

    public int getMapStyle() {
        C113495aa aaVar;
        if (this.f342899G || (aaVar = this.f342896D) == null) {
            return 0;
        }
        C113516aj ajVar = aaVar.f339616b;
        if (ajVar == null) {
            return -1;
        }
        return ajVar.mo171336f();
    }

    public int getMapType() {
        C113495aa aaVar;
        C113516aj ajVar;
        if (this.f342899G || (aaVar = this.f342896D) == null || (ajVar = aaVar.f339616b) == null) {
            return 1000;
        }
        return ajVar.mo171274A();
    }

    public int getMapWidth() {
        return this.f342909o.f339859b.getMapRenderView().getWidth();
    }

    public float getMaxZoomLevel() {
        C113495aa aaVar;
        if (this.f342899G || (aaVar = this.f342896D) == null) {
            return 0.0f;
        }
        C113516aj ajVar = aaVar.f339616b;
        if (ajVar == null) {
            return -1.0f;
        }
        return ajVar.mo171317b();
    }

    public float getMinZoomLevel() {
        C113495aa aaVar;
        if (this.f342899G || (aaVar = this.f342896D) == null) {
            return 0.0f;
        }
        C113516aj ajVar = aaVar.f339616b;
        if (ajVar == null) {
            return -1.0f;
        }
        return ajVar.mo171327c();
    }

    public Location getMyLocation() {
        if (this.f342899G) {
            return null;
        }
        m160794ax();
        C113515ai aiVar = this.f342897E.f339642a;
        if (aiVar != null) {
            return aiVar.mo171273e();
        }
        return null;
    }

    public UiSettings getUiSettings() {
        if (this.f342899G) {
            return null;
        }
        if (this.f342901I == null) {
            this.f342901I = new C26875te(this.f342898F);
        }
        return this.f342901I;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = (r0 = r2.f342896D).f339616b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getVersion() {
        /*
            r2 = this;
            boolean r0 = r2.f342899G
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0015
            com.tencent.mapsdk.internal.aa r0 = r2.f342896D
            if (r0 != 0) goto L_0x000b
            goto L_0x0015
        L_0x000b:
            com.tencent.mapsdk.internal.aj r0 = r0.f339616b
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            java.lang.String r0 = r0.mo171350o()
            return r0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.vector.VectorMap.getVersion():java.lang.String");
    }

    public float getZoomToSpanLevel(LatLng latLng, LatLng latLng2) {
        C113495aa aaVar;
        C113516aj ajVar;
        if (this.f342899G || (aaVar = this.f342896D) == null) {
            return 0.0f;
        }
        if (latLng == null || latLng2 == null || (ajVar = aaVar.f339616b) == null) {
            return -1.0f;
        }
        return ajVar.mo171276a(latLng, latLng2);
    }

    public boolean isBlockRouteEnabled() {
        return false;
    }

    public boolean isDestroyed() {
        return this.f342899G;
    }

    public boolean isHandDrawMapEnable() {
        C113495aa aaVar;
        C113516aj ajVar;
        if (this.f342899G || (aaVar = this.f342896D) == null || (ajVar = aaVar.f339616b) == null) {
            return false;
        }
        return ajVar.mo171358w();
    }

    public boolean isMyLocationEnabled() {
        if (this.f342899G) {
            return false;
        }
        m160794ax();
        C113515ai aiVar = this.f342897E.f339642a;
        if (aiVar != null) {
            return aiVar.mo171272d();
        }
        return false;
    }

    public boolean isSateLiteEnable() {
        return getMapType() == 1011;
    }

    public boolean isTrafficEnabled() {
        C113495aa aaVar;
        C113516aj ajVar;
        if (this.f342899G || (aaVar = this.f342896D) == null || (ajVar = aaVar.f339616b) == null) {
            return false;
        }
        return ajVar.mo171342h();
    }

    public void loadKMLFile(String str) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.loadKMLFile(str);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171313a(str);
        }
    }

    public void moveCamera(CameraUpdate cameraUpdate) {
        C113495aa aaVar;
        if (!this.f342899G && (aaVar = this.f342896D) != null && !aaVar.mo171185b()) {
            this.f342896D.mo171182a(cameraUpdate);
        }
    }

    /* renamed from: n */
    public final void mo173486n() {
        this.f342909o.f340914v = true;
    }

    /* renamed from: o */
    public final int mo173487o() {
        return this.f342909o.f340912t.f342783b.f342818n;
    }

    /* renamed from: p */
    public final int mo173488p() {
        return this.f342909o.f340912t.f342783b.f342819o;
    }

    /* renamed from: q */
    public final GeoPoint mo173489q() {
        return this.f342909o.f340901i.f339663A.f342794m;
    }

    /* renamed from: r */
    public final int mo173490r() {
        return this.f342909o.f340901i.f339663A.f342783b.f342821q;
    }

    public void removeOnMapLoadedCallback(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.removeOnMapLoadedCallback(onMapLoadedCallback);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171323b(onMapLoadedCallback);
        }
    }

    public void removeTencentMapGestureListener(TencentMapGestureListener tencentMapGestureListener) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.removeTencentMapGestureListener(tencentMapGestureListener);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171325b(tencentMapGestureListener);
        }
    }

    public void resetIndoorCellInfo() {
        C114216sq sqVar;
        super.resetIndoorCellInfo();
        if (!this.f342899G && this.f342896D != null && (sqVar = this.f342909o.f340899g) != null) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.97.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.97.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    /* renamed from: s */
    public final float mo173491s() {
        return this.f342909o.f340901i.f339663A.f342783b.f342820p;
    }

    public void setBaseMapEnabled(boolean z) {
        C113961mq mqVar;
        if (!this.f342899G && (mqVar = this.f342909o) != null) {
            mqVar.mo172461k(z);
        }
    }

    public void setBuilding3dEffectEnable(boolean z) {
        C113961mq mqVar;
        super.setBuilding3dEffectEnable(z);
        if (!this.f342899G && (mqVar = this.f342909o) != null) {
            mqVar.mo172453c(z);
        }
    }

    public void setBuildingBlackList(List<LatLngBounds> list) {
        super.setBuildingBlackList(list);
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null) {
            sqVar.mo172918a(list);
        }
    }

    public void setBuildingEnable(boolean z) {
        super.setBuildingEnable(z);
        setBuilding3dEffectEnable(z);
    }

    public void setCameraCenterProportion(float f, float f2) {
        super.setCameraCenterProportion(f, f2);
        setCameraCenterProportion(f, f2, true);
    }

    public void setCustomRender(CustomRender customRender) {
        C113961mq mqVar;
        super.setCustomRender(customRender);
        if (!this.f342899G && (mqVar = this.f342909o) != null) {
            mqVar.f340876F = customRender;
            mqVar.f340914v = true;
        }
    }

    public void setDrawPillarWith2DStyle(boolean z) {
        C113961mq mqVar;
        super.setDrawPillarWith2DStyle(z);
        if (!this.f342899G && (mqVar = this.f342909o) != null) {
            mqVar.mo172453c(!z);
        }
    }

    public void setForeignLanguage(Language language) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setForeignLanguage(language);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171324b(language);
        }
    }

    public void setHandDrawMapEnable(boolean z) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setHandDrawMapEnable(z);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171335e(z);
        }
    }

    public void setIndoorCellInfo(List<IndoorCellInfo> list) {
        C114216sq sqVar;
        super.setIndoorCellInfo(list);
        if (!this.f342899G && this.f342896D != null && (sqVar = this.f342909o.f340899g) != null) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(list) {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.96.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.96.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    public void setIndoorEnabled(boolean z) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setIndoorEnabled(z);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171329c(z);
        }
    }

    public void setIndoorFloor(int i) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setIndoorFloor(i);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171328c(i);
        }
    }

    public void setIndoorMaskColor(int i) {
        super.setIndoorMaskColor(i);
        C114216sq sqVar = this.f342909o.f340899g;
        if (0 != sqVar.f342024e) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(i) {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.164.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.164.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    public void setInfoWindowAdapter(TencentMap.InfoWindowAdapter infoWindowAdapter) {
        C114337tf tfVar;
        super.setInfoWindowAdapter(infoWindowAdapter);
        if (!this.f342899G && (tfVar = this.f342904L) != null) {
            tfVar.f342654aK = infoWindowAdapter;
        }
    }

    public void setLocationCompassHidden(boolean z) {
        super.setLocationCompassHidden(z);
        this.f342909o.mo172456f(z);
    }

    public void setLocationNavigationGravityLineHidden(boolean z) {
        super.setLocationNavigationGravityLineHidden(z);
        this.f342909o.mo172457g(z);
    }

    public void setLocationSource(LocationSource locationSource) {
        super.setLocationSource(locationSource);
        if (!this.f342899G) {
            m160794ax();
            C113515ai aiVar = this.f342897E.f339642a;
            if (aiVar != null) {
                aiVar.mo171268a(locationSource);
            }
        }
    }

    public void setMapCenterAndScale(float f, float f2, float f3) {
        C113540bh bhVar;
        C114322sx sxVar;
        C113961mq mqVar;
        super.setMapCenterAndScale(f, f2, f3);
        if (!this.f342899G && (bhVar = this.f342911q) != null && (mqVar = sxVar.f342647aD) != null) {
            float f4 = mqVar.f340901i.f339663A.f342783b.f342820p;
            float c = C114337tf.m160331c(f3);
            boolean z = ((double) Math.abs(f4 - c)) > 1.0E-4d;
            (sxVar = bhVar.f339763b).f342649aF = 0;
            C113865kb.m157399a((Runnable) new Runnable((f2 - sxVar.f342648aE) / 10.0f, f, f2, f3, z, c) {
                public final void run(
/*
Method generation error in method: com.tencent.mapsdk.internal.tf.1.run():void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.tf.1.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    public void setMapFontSize(MapFontSize mapFontSize) {
        if (!this.f342899G && this.f342896D != null && mapFontSize != null) {
            C113961mq mqVar = this.f342909o;
            int value = mapFontSize.getValue();
            C114216sq sqVar = mqVar.f340899g;
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(value) {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.61.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.61.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    public void setMapFrameRate(float f) {
        C113572bv bvVar;
        super.setMapFrameRate(f);
        C114337tf tfVar = this.f342904L;
        if (tfVar != null && (bvVar = tfVar.f339874c) != null) {
            bvVar.mo171858a(f);
        }
    }

    public void setMapStyle(int i) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setMapStyle(i);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171291a(i);
        }
    }

    public void setMapType(int i) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setMapType(i);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171337f(i);
        }
    }

    public void setMaxZoomLevel(int i) {
        super.setMaxZoomLevel(i);
        if (!this.f342899G && this.f342896D != null) {
            int l = m160873l(i);
            C113516aj ajVar = this.f342896D.f339616b;
            if (ajVar != null) {
                ajVar.mo171331d(l);
            }
            float f = (float) l;
            if (this.f342896D.mo171184a().zoom > f) {
                animateCamera(CameraUpdateFactory.zoomTo(f));
            }
        }
    }

    public void setMinZoomLevel(int i) {
        super.setMinZoomLevel(i);
        if (!this.f342899G && this.f342896D != null) {
            int l = m160873l(i);
            C113516aj ajVar = this.f342896D.f339616b;
            if (ajVar != null) {
                ajVar.mo171334e(l);
            }
            float f = (float) l;
            if (this.f342896D.mo171184a().zoom < f) {
                animateCamera(CameraUpdateFactory.zoomTo(f));
            }
        }
    }

    public void setMyLocationClickListener(TencentMap.OnMyLocationClickListener onMyLocationClickListener) {
        super.setMyLocationClickListener(onMyLocationClickListener);
        if (!this.f342899G) {
            if (this.f342912r == null) {
                m160794ax();
            }
            this.f342912r.f339750e = onMyLocationClickListener;
        }
    }

    public void setMyLocationEnabled(boolean z) {
        C113515ai aiVar;
        super.setMyLocationEnabled(z);
        if (!this.f342899G) {
            m160794ax();
            if (!z) {
                C113515ai aiVar2 = this.f342897E.f339642a;
                if (aiVar2 != null) {
                    aiVar2.mo171271c();
                }
            } else if (!isMyLocationEnabled() && (aiVar = this.f342897E.f339642a) != null) {
                aiVar.mo171270b();
            }
        }
    }

    public void setMyLocationStyle(MyLocationStyle myLocationStyle) {
        super.setMyLocationStyle(myLocationStyle);
        if (this.f342897E == null) {
            m160794ax();
        }
        C113515ai aiVar = this.f342897E.f339642a;
        if (aiVar != null) {
            aiVar.mo171269a(myLocationStyle);
        }
    }

    public void setOnCameraChangeListener(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setOnCameraChangeListener(onCameraChangeListener);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171295a(onCameraChangeListener);
        }
    }

    public void setOnCompassClickedListener(TencentMap.OnCompassClickedListener onCompassClickedListener) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setOnCompassClickedListener(onCompassClickedListener);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171296a(onCompassClickedListener);
        }
    }

    public void setOnIndoorStateChangeListener(TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setOnIndoorStateChangeListener(onIndoorStateChangeListener);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171298a(onIndoorStateChangeListener);
        }
    }

    public void setOnInfoWindowClickListener(TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setOnInfoWindowClickListener(onInfoWindowClickListener);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171299a(onInfoWindowClickListener);
        }
    }

    public void setOnMapClickListener(TencentMap.OnMapClickListener onMapClickListener) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setOnMapClickListener(onMapClickListener);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171300a(onMapClickListener);
        }
    }

    public void setOnMapLongClickListener(TencentMap.OnMapLongClickListener onMapLongClickListener) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setOnMapLongClickListener(onMapLongClickListener);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171302a(onMapLongClickListener);
        }
    }

    public void setOnMapPoiClickListener(TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        C113495aa aaVar;
        super.setOnMapPoiClickListener(onMapPoiClickListener);
        if (!this.f342899G && (aaVar = this.f342896D) != null) {
            C114062pj pjVar = this.f342913s;
            if (pjVar != null) {
                pjVar.f341297c = onMapPoiClickListener;
            }
            C113516aj ajVar = aaVar.f339616b;
            if (ajVar != null) {
                ajVar.mo171303a(onMapPoiClickListener);
            }
        }
    }

    public void setOnMarkerClickListener(TencentMap.OnMarkerClickListener onMarkerClickListener) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setOnMarkerClickListener(onMarkerClickListener);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171304a(onMarkerClickListener);
        }
    }

    public void setOnMarkerDragListener(TencentMap.OnMarkerDragListener onMarkerDragListener) {
        C113961mq mqVar;
        super.setOnMarkerDragListener(onMarkerDragListener);
        if (!this.f342899G && (mqVar = this.f342909o) != null) {
            mqVar.f340903k.f339818c = onMarkerDragListener;
        }
    }

    public void setOnMyLocationChangeListener(TencentMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        super.setOnMyLocationChangeListener(onMyLocationChangeListener);
        if (!this.f342899G) {
            if (this.f342912r == null) {
                m160794ax();
            }
            this.f342912r.f339747b = onMyLocationChangeListener;
        }
    }

    public void setOnPolygonClickListener(TencentMap.OnPolygonClickListener onPolygonClickListener) {
        C114337tf tfVar;
        super.setOnPolygonClickListener(onPolygonClickListener);
        if (!this.f342899G && (tfVar = this.f342904L) != null) {
            tfVar.mo172996a(onPolygonClickListener);
        }
    }

    public void setOnPolylineClickListener(TencentMap.OnPolylineClickListener onPolylineClickListener) {
        C114337tf tfVar;
        super.setOnPolylineClickListener(onPolylineClickListener);
        if (!this.f342899G && (tfVar = this.f342904L) != null) {
            tfVar.mo172997a(onPolylineClickListener);
        }
    }

    public void setOnScaleViewChangedListener(TencentMap.OnScaleViewChangedListener onScaleViewChangedListener) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setOnScaleViewChangedListener(onScaleViewChangedListener);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171305a(onScaleViewChangedListener);
        }
    }

    public void setOnTapMapViewInfoWindowHidden(boolean z) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setOnTapMapViewInfoWindowHidden(z);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171340g(z);
        }
    }

    public void setOnTrafficEventClickListener(TencentMap.OnTrafficEventClickListener onTrafficEventClickListener) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setOnTrafficEventClickListener(onTrafficEventClickListener);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171306a(onTrafficEventClickListener);
        }
    }

    public void setOnVectorOverlayClickListener(TencentMap.OnVectorOverlayClickListener onVectorOverlayClickListener) {
        C114337tf tfVar;
        super.setOnVectorOverlayClickListener(onVectorOverlayClickListener);
        if (!this.f342899G && (tfVar = this.f342904L) != null) {
            tfVar.f342647aD.f340881K = onVectorOverlayClickListener;
        }
    }

    public void setOverSeaEnable(boolean z) {
        super.setOverSeaEnable(z);
        C114337tf tfVar = this.f342904L;
        if (tfVar != null) {
            tfVar.mo171831m(z);
        }
    }

    public void setOverSeaTileProvider(OverSeaTileProvider overSeaTileProvider) {
        C113961mq mqVar;
        C113532ba baVar;
        super.setOverSeaTileProvider(overSeaTileProvider);
        if (!this.f342899G && (mqVar = this.f342909o) != null && (baVar = mqVar.f340905m) != null) {
            baVar.mo171571a(overSeaTileProvider);
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        C113540bh bhVar = this.f342911q;
        if (bhVar != null) {
            bhVar.mo171653a(i, i2, i3, i4, false);
        }
    }

    public void setPointToCenter(int i, int i2) {
        C113707es v;
        super.setPointToCenter(i, i2);
        if (!this.f342899G && this.f342896D != null && (v = getProjection()) != null) {
            this.f342896D.mo171182a(CameraUpdateFactory.newLatLng(v.fromScreenLocation(new Point(i, i2))));
        }
    }

    public void setPoisEnabled(boolean z) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setPoisEnabled(z);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171344i(z);
        }
    }

    public void setRestrictBounds(LatLngBounds latLngBounds, RestrictBoundsFitMode restrictBoundsFitMode) {
        C113495aa aaVar;
        super.setRestrictBounds(latLngBounds, restrictBoundsFitMode);
        if (!this.f342899G && (aaVar = this.f342896D) != null) {
            int ordinal = restrictBoundsFitMode == null ? 0 : restrictBoundsFitMode.ordinal();
            C113516aj ajVar = aaVar.f339616b;
            if (ajVar != null) {
                ajVar.mo171311a(latLngBounds, ordinal);
            }
        }
    }

    public void setSatelliteEnabled(boolean z) {
        super.setSatelliteEnabled(z);
        if (z) {
            setMapType(1011);
        } else {
            setMapType(1000);
        }
    }

    public void setTencentMapGestureListener(TencentMapGestureListener tencentMapGestureListener) {
        super.setTencentMapGestureListener(tencentMapGestureListener);
        addTencentMapGestureListener(tencentMapGestureListener);
    }

    public void setTrafficEnabled(boolean z) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setTrafficEnabled(z);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171316a(z);
        }
    }

    public void setTrafficMode(int i, int i2) {
        super.setTrafficMode(i, i2);
        if (!this.f342899G && this.f342896D != null) {
            C114216sq sqVar = this.f342909o.f340899g;
            sqVar.mo172930b((C113961mq.C113963a) new C113961mq.C113963a(i, i2) {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.2.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.2.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    public void showBuilding(boolean z) {
        super.showBuilding(z);
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(z) {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.42.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.42.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    public void snapshot(TencentMap.SnapshotReadyCallback snapshotReadyCallback, Bitmap.Config config, int i) {
        C113516aj ajVar;
        super.snapshot(snapshotReadyCallback, config, i);
        C113495aa aaVar = this.f342896D;
        if (aaVar != null && (ajVar = aaVar.f339616b) != null && snapshotReadyCallback != null) {
            aaVar.f339617c = snapshotReadyCallback;
            Handler handler = aaVar.f339618d;
            if (ajVar != null) {
                ajVar.mo171293a(handler, config, i);
            }
        }
    }

    public void stopAnimation() {
        C113495aa aaVar;
        C113516aj ajVar;
        super.stopAnimation();
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171330d();
        }
    }

    /* renamed from: t */
    public final float mo173493t() {
        return this.f342909o.f340901i.mo171245h();
    }

    /* renamed from: u */
    public final float mo173494u() {
        return this.f342909o.f340901i.mo171246i();
    }

    public void updateVectorOverlay(VectorOverlay vectorOverlay, VectorOverlayProvider vectorOverlayProvider) {
        C113961mq mqVar;
        Class<C113998nr> cls = C113998nr.class;
        if (!this.f342899G && (mqVar = this.f342909o) != null) {
            if (mqVar.f340899g != null) {
                if (vectorOverlayProvider instanceof AggregationOverlayProvider) {
                    C113975mw mwVar = (C113975mw) mqVar.f340903k.mo171681a(C113975mw.class, ((C113975mw) vectorOverlay).mo172479b());
                    if (mwVar != null) {
                        mwVar.mo172478a(new C113976mx((AggregationOverlayProvider) vectorOverlayProvider));
                    } else {
                        mqVar.mo172421a(vectorOverlayProvider);
                    }
                } else if (vectorOverlayProvider instanceof GradientVectorOverlayProvider) {
                    C113989ni niVar = (C113989ni) mqVar.f340903k.mo171681a(C113989ni.class, ((C113989ni) vectorOverlay).mo172479b());
                    if (niVar != null) {
                        niVar.mo172478a(new C113991nk((GradientVectorOverlayProvider) vectorOverlayProvider));
                    } else {
                        mqVar.mo172421a(vectorOverlayProvider);
                    }
                } else if (vectorOverlayProvider instanceof ArcLineOverlayProvider) {
                    C113978mz mzVar = (C113978mz) mqVar.f340903k.mo171681a(C113978mz.class, ((C113978mz) vectorOverlay).mo172479b());
                    if (mzVar != null) {
                        mzVar.mo172478a(new C113981nb((ArcLineOverlayProvider) vectorOverlayProvider));
                    } else {
                        mqVar.mo172421a(vectorOverlayProvider);
                    }
                } else if (vectorOverlayProvider instanceof DotScatterPlotOverlayProvider) {
                    C113998nr nrVar = (C113998nr) mqVar.f340903k.mo171681a(cls, ((C113998nr) vectorOverlay).mo172479b());
                    if (nrVar != null) {
                        nrVar.mo172478a(new C114000nt(mqVar.f340899g.mo172893B(), (DotScatterPlotOverlayProvider) vectorOverlayProvider));
                    } else {
                        mqVar.mo172421a(vectorOverlayProvider);
                    }
                } else if (vectorOverlayProvider instanceof BitmapScatterPlotOverlayProvider) {
                    C113998nr nrVar2 = (C113998nr) mqVar.f340903k.mo171681a(cls, ((C113998nr) vectorOverlay).mo172479b());
                    if (nrVar2 != null) {
                        nrVar2.mo172478a(new C114000nt(mqVar.f340899g.mo172893B(), (BitmapScatterPlotOverlayProvider) vectorOverlayProvider));
                    } else {
                        mqVar.mo172421a(vectorOverlayProvider);
                    }
                } else if (vectorOverlayProvider instanceof TrailOverlayProvider) {
                    C114001nu nuVar = (C114001nu) mqVar.f340903k.mo171681a(C114001nu.class, ((C114001nu) vectorOverlay).mo172479b());
                    if (nuVar != null) {
                        nuVar.mo172478a(new C114003nw((TrailOverlayProvider) vectorOverlayProvider));
                    } else {
                        mqVar.mo172421a(vectorOverlayProvider);
                    }
                } else if (vectorOverlayProvider instanceof GLModelOverlayProvider) {
                    C113984ne neVar = (C113984ne) mqVar.f340903k.mo171681a(C113984ne.class, ((C113984ne) vectorOverlay).mo172479b());
                    if (neVar != null) {
                        neVar.mo172478a(new C113983nd((GLModelOverlayProvider) vectorOverlayProvider));
                    } else {
                        mqVar.mo172421a(vectorOverlayProvider);
                    }
                }
            }
            mo173486n();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f342909o;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.mapsdk.internal.C113707es getProjection() {
        /*
            r1 = this;
            boolean r0 = r1.f342899G
            if (r0 != 0) goto L_0x000c
            com.tencent.mapsdk.internal.mq r0 = r1.f342909o
            if (r0 != 0) goto L_0x0009
            goto L_0x000c
        L_0x0009:
            com.tencent.mapsdk.internal.es r0 = r0.f340906n
            return r0
        L_0x000c:
            com.tencent.mapsdk.internal.x r0 = new com.tencent.mapsdk.internal.x
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.vector.VectorMap.getProjection():com.tencent.mapsdk.internal.es");
    }

    /* renamed from: w */
    public final void mo173497w() {
        this.f342909o.f340901i.f339685o.mo173098e();
    }

    /* renamed from: x */
    public final String mo173498x() {
        C113961mq mqVar = this.f342909o;
        if (mqVar != null) {
            return mqVar.mo171812y();
        }
        return null;
    }

    /* renamed from: c */
    private void m160828c(int i) {
        this.f342909o.f340901i.mo171204a(i);
    }

    /* renamed from: g */
    private String m160855g(GeoPoint geoPoint) {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null) {
            return (String) sqVar.mo172900a(new CallbackRunnable<String>(geoPoint) {
                /* renamed from: a */
                private java.lang.String m160003a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.163.a():java.lang.String, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.163.a():java.lang.String, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public final /* synthetic */ java.lang.Object run(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.163.run():java.lang.Object, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.163.run():java.lang.Object, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }, null);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo171701a(Bundle bundle) {
        C114165rp rpVar;
        super.mo171701a(bundle);
        this.f342904L = (C114337tf) this.f342909o.f339859b;
        C114181rs.m159508a().mo172821a(this.f342909o.getContext());
        C113556bk.m156203a().mo171691a(this.f342909o.mo172414F());
        C113540bh bhVar = new C113540bh(this.f342909o, this.f342904L.getMapRenderView(), this.f342909o.f339858a);
        this.f342911q = bhVar;
        this.f342894B = new C113512af(bhVar);
        this.f342896D = new C113495aa(this.f342911q);
        this.f342903K = new TencentMapPro(this.f342911q, this.f342894B);
        this.f342913s = new C114062pj(this.f342909o);
        this.f342898F = new C26872ae(this.f342911q.f339765d);
        C1143791 r6 = new C113558bl.C113562a() {
            /* renamed from: a */
            public final void mo171699a() {
                VectorMap.this.setMyLocationEnabled(true);
                Location myLocation = VectorMap.this.getMyLocation();
                if (myLocation != null) {
                    VectorMap.this.animateCamera(CameraUpdateFactory.newLatLng(new LatLng(myLocation.getLatitude(), myLocation.getLongitude())));
                }
            }
        };
        C113558bl blVar = this.f342911q.f339765d;
        C114175rr rrVar = blVar.f339837d;
        if (rrVar != null) {
            rrVar.f341816d = r6;
        }
        C113961mq mqVar = this.f342909o;
        C113554bj bjVar = mqVar.f340903k;
        TencentMapOptions tencentMapOptions = mqVar.f339858a;
        if (!(tencentMapOptions == null || tencentMapOptions.getExtSurface() == null || (rpVar = blVar.f339838e) == null)) {
            List<C114165rp.C114173c> list = rpVar.f341792r;
            if (!(list == null || bjVar == null)) {
                list.add(bjVar);
            }
            int extSurfaceWidth = tencentMapOptions.getExtSurfaceWidth();
            int extSurfaceHeight = tencentMapOptions.getExtSurfaceHeight();
            blVar.f339835b.measure(View.MeasureSpec.makeMeasureSpec(extSurfaceWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(extSurfaceHeight, 1073741824));
            blVar.mo171655b(extSurfaceWidth, extSurfaceHeight);
        }
        C114065pl plVar = new C114065pl(this.f342911q);
        this.f342893A = plVar;
        C113961mq mqVar2 = this.f342909o;
        plVar.f341305a.mo171694a((C114065pl.C114066a) mqVar2.f340903k, mqVar2.f339858a);
        C114065pl plVar2 = this.f342893A;
        C113896kq.m157663b(C0950kp.f2275U);
        for (AsyncTask execute : plVar2.f341306b) {
            execute.execute(new Object[0]);
        }
        addOnMapLoadedCallback(this.f342909o.f339858a.getOnMapLoadedCallback());
        this.f342902J = true;
    }

    /* renamed from: b */
    private void m160798b(float f, float f2) {
        this.f342909o.f340901i.mo171223b(f, f2, true);
    }

    /* renamed from: d */
    private synchronized void m160837d(C113709et etVar) {
        this.f342909o.f340903k.mo171684a(etVar);
        this.f342909o.f340914v = true;
    }

    /* renamed from: n */
    private void m160876n(int i) {
        C113961mq mqVar = this.f342909o;
        C114216sq sqVar = mqVar.f340899g;
        if (sqVar != null) {
            sqVar.mo172927b(i);
        }
        C114367v vVar = mqVar.f340912t;
        if (vVar != null) {
            vVar.f342783b.f342818n = i;
        }
    }

    public void animateCamera(CameraUpdate cameraUpdate, TencentMap.CancelableCallback cancelableCallback) {
        C113495aa aaVar;
        if (!this.f342899G && (aaVar = this.f342896D) != null && !aaVar.mo171185b()) {
            this.f342896D.mo171183a(cameraUpdate, 500, cancelableCallback);
        }
    }

    public void setCameraCenterProportion(float f, float f2, boolean z) {
        C113495aa aaVar;
        C113516aj ajVar;
        super.setCameraCenterProportion(f, f2, z);
        if (!this.f342899G && (aaVar = this.f342896D) != null && (ajVar = aaVar.f339616b) != null) {
            ajVar.mo171290a(f, f2, z);
        }
    }

    /* renamed from: h */
    private C114096qc m160860h(GeoPoint geoPoint) {
        C114216sq sqVar = this.f342909o.f340899g;
        if (geoPoint == null) {
            geoPoint = new GeoPoint();
        }
        return (C114096qc) sqVar.mo172900a(new CallbackRunnable<C114096qc>(geoPoint) {
            /* renamed from: a */
            private com.tencent.mapsdk.internal.C114096qc m160000a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.160.a():com.tencent.mapsdk.internal.qc, dex: classes9.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.160.a():com.tencent.mapsdk.internal.qc, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            public final /* synthetic */ java.lang.Object run(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.160.run():java.lang.Object, dex: classes9.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.160.run():java.lang.Object, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        }, null);
    }

    public void setPadding(int i, int i2, int i3, int i4, boolean z) {
        super.setPadding(i, i2, i3, i4, z);
        C113540bh bhVar = this.f342911q;
        if (bhVar != null) {
            bhVar.mo171653a(i, i2, i3, i4, z);
        }
    }

    /* renamed from: c */
    private void m160832c(boolean z) {
        if (z) {
            C113961mq mqVar = this.f342909o;
            C114216sq sqVar = mqVar.f340899g;
            if (sqVar != null) {
                sqVar.mo172950l();
                mqVar.f340908p = true;
                return;
            }
            return;
        }
        C113961mq mqVar2 = this.f342909o;
        C114216sq sqVar2 = mqVar2.f340899g;
        if (sqVar2 != null) {
            sqVar2.mo172951m();
            mqVar2.f340908p = false;
        }
    }

    /* renamed from: g */
    private void m160858g(boolean z) {
        this.f342909o.f340899g.mo172942f(z);
    }

    /* renamed from: i */
    private void m160866i(int i, int i2) {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(i, i2) {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.25.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.25.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    /* renamed from: j */
    private void m160870j(boolean z) {
        this.f342910p = z;
        this.f342909o.mo172460j(z);
    }

    @Deprecated
    /* renamed from: o */
    private void m160877o(int i) {
        C113961mq mqVar = this.f342909o;
        C114216sq sqVar = mqVar.f340899g;
        if (sqVar != null) {
            sqVar.mo172937d(i);
            mqVar.f340914v = true;
        }
    }

    @Deprecated
    /* renamed from: p */
    private void m160878p(int i) {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null) {
            sqVar.mo172939e(i);
        }
    }

    public void animateCamera(CameraUpdate cameraUpdate, long j, TencentMap.CancelableCallback cancelableCallback) {
        C113495aa aaVar;
        if (!this.f342899G && (aaVar = this.f342896D) != null && !aaVar.mo171185b()) {
            this.f342896D.mo171183a(cameraUpdate, j, cancelableCallback);
        }
    }

    public void setIndoorFloor(String str, String str2) {
        C113495aa aaVar;
        super.setIndoorFloor(str, str2);
        if (!this.f342899G && (aaVar = this.f342896D) != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            aaVar.f339616b.mo171314a(str, str2);
        }
    }

    /* renamed from: b */
    private void m160806b(C113709et etVar) {
        this.f342909o.f340903k.mo171684a(etVar);
        this.f342909o.f340914v = true;
    }

    /* renamed from: f */
    private void m160851f(GeoPoint geoPoint) {
        m160730a(geoPoint, mo173490r());
    }

    /* renamed from: e */
    private void m160841e(int i) {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(i) {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.168.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.168.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    /* renamed from: f */
    private void m160850f(int i, int i2) {
        C113961mq mqVar = this.f342909o;
        if (mqVar != null) {
            mqVar.f340875E = i;
            mqVar.f340874D = i2;
        }
    }

    public void snapshot(TencentMap.SnapshotReadyCallback snapshotReadyCallback, Bitmap.Config config) {
        super.snapshot(snapshotReadyCallback, config);
        snapshot(snapshotReadyCallback, config, 0);
    }

    @Deprecated
    /* renamed from: g */
    private void m160857g(int i, int i2) {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null) {
            sqVar.mo172928b(i, i2);
        }
    }

    /* renamed from: h */
    private void m160863h(boolean z) {
        this.f342909o.f340878H.f341588f.mo172945i(z);
    }

    /* renamed from: i */
    private void m160867i(boolean z) {
        C113503ad adVar = this.f342909o.f340901i;
        adVar.f339669G = z;
        adVar.f339696z.mo171638f().mo172932b(adVar.f339669G);
    }

    /* renamed from: d */
    private void m160836d(GeoPoint geoPoint) {
        this.f342909o.f340901i.mo171206a(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6(), 1);
    }

    public void snapshot(TencentMap.SnapshotReadyCallback snapshotReadyCallback) {
        super.snapshot(snapshotReadyCallback);
        snapshot(snapshotReadyCallback, Bitmap.Config.ARGB_8888);
    }

    /* renamed from: e */
    private void m160842e(int i, int i2) {
        C114216sq sqVar = this.f342909o.f340899g;
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
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(i, i3) {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.106.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.106.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    /* renamed from: f */
    private void m160853f(boolean z) {
        this.f342909o.mo172455e(z);
    }

    /* renamed from: b */
    private void m160812b(C113719fd fdVar) {
        C113503ad adVar = this.f342909o.f340901i;
        synchronized (adVar.f339687q) {
            adVar.f339687q.remove(fdVar);
        }
    }

    /* renamed from: f */
    private int m160849f(String str) {
        C114216sq sqVar;
        C113961mq mqVar = this.f342909o;
        if (mqVar == null || (sqVar = mqVar.f340899g) == null) {
            return -1;
        }
        return ((Integer) sqVar.mo172900a(new CallbackRunnable<Integer>(str) {
            /* renamed from: a */
            private java.lang.Integer m160062a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.47.a():java.lang.Integer, dex: classes9.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.47.a():java.lang.Integer, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            public final /* synthetic */ java.lang.Object run(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.47.run():java.lang.Object, dex: classes9.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.47.run():java.lang.Object, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        }, -1)).intValue();
    }

    /* renamed from: h */
    private void m160862h(int i, int i2) {
        this.f342909o.mo172427a(i, i2);
    }

    /* renamed from: g */
    public final void mo171723g() {
        C113516aj ajVar;
        super.mo171723g();
        if (!this.f342899G) {
            C113495aa aaVar = this.f342896D;
            if (!(aaVar == null || (ajVar = aaVar.f339616b) == null)) {
                ajVar.mo171348m();
            }
            C114065pl plVar = this.f342893A;
            if (plVar != null) {
                plVar.mo172653a();
            }
            C114062pj pjVar = this.f342913s;
            if (pjVar != null) {
                pjVar.f341297c = null;
                pjVar.f341295a.clear();
                pjVar.f341298d.clear();
            }
            C114181rs.m159508a();
            C26872ae aeVar = this.f342898F;
            if (aeVar != null) {
                if (aeVar.f74714a != null) {
                    aeVar.f74714a = null;
                }
                this.f342898F = null;
            }
            C113502ac acVar = this.f342897E;
            if (acVar != null) {
                if (acVar.f339642a != null) {
                    acVar.f339642a = null;
                }
                this.f342897E = null;
            }
            C113495aa aaVar2 = this.f342896D;
            if (aaVar2 != null) {
                if (aaVar2.f339616b != null) {
                    aaVar2.f339616b = null;
                }
                this.f342896D = null;
            }
            if (this.f342895C != null) {
                this.f342895C = null;
            }
            C113512af afVar = this.f342894B;
            if (afVar != null) {
                if (afVar.f339724a != null) {
                    afVar.f339724a = null;
                }
                this.f342894B = null;
            }
            C113538bg bgVar = this.f342912r;
            if (bgVar != null) {
                bgVar.mo171271c();
                bgVar.f339746a = null;
                this.f342912r = null;
            }
            C113540bh bhVar = this.f342911q;
            if (bhVar != null) {
                if (bhVar.f339763b != null) {
                    ((VectorMap) bhVar.f339763b.f339878e_).mo173457b(bhVar.f339772k);
                    C114322sx sxVar = bhVar.f339763b;
                    Handler handler = sxVar.f342519B;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages((Object) null);
                    }
                    Handler handler2 = sxVar.f342526I;
                    if (handler2 != null) {
                        handler2.removeCallbacksAndMessages((Object) null);
                    }
                    List<C113723fh> list = sxVar.f342591r;
                    if (list != null) {
                        list.clear();
                        sxVar.f342591r = null;
                    }
                    sxVar.mo171612l();
                    sxVar.f342592s = null;
                    sxVar.f342599z = null;
                    sxVar.f342595v = null;
                    sxVar.f342521D = null;
                    sxVar.f342589p = null;
                    bhVar.f339763b = null;
                }
                if (bhVar.f339764c != null) {
                    bhVar.f339764c = null;
                }
                C104548ha.C104549a aVar = C104548ha.f309920b;
                if (aVar != null) {
                    aVar.mo147865c();
                }
                this.f342911q = null;
            }
            this.f342899G = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.tencent.mapsdk.internal.pi$d} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [com.tencent.tencentmap.mapsdk.maps.model.MapPoi] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m160864h(float r11, float r12) {
        /*
            r10 = this;
            com.tencent.mapsdk.engine.jni.models.TappedElement r11 = r10.mo173434a((float) r11, (float) r12)
            r12 = 0
            if (r11 == 0) goto L_0x0074
            com.tencent.mapsdk.internal.pj r0 = r10.f342913s
            if (r0 == 0) goto L_0x0074
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r1 = r0.f341297c
            if (r1 == 0) goto L_0x0074
            int r1 = r11.type
            r2 = 4
            if (r1 != r2) goto L_0x0074
            long r1 = r11.itemId
            java.util.List<com.tencent.mapsdk.internal.ph> r11 = r0.f341295a
            java.util.Iterator r11 = r11.iterator()
        L_0x001c:
            boolean r3 = r11.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r11.next()
            com.tencent.mapsdk.internal.ph r3 = (com.tencent.mapsdk.internal.C114050ph) r3
            com.tencent.mapsdk.internal.pi r5 = r3.f341245b
            if (r5 == 0) goto L_0x0061
            com.tencent.mapsdk.internal.pi$d r5 = r5.f341264a
            if (r5 == 0) goto L_0x0061
            java.util.List<com.tencent.mapsdk.internal.pi$d> r5 = r5.f341282j
            if (r5 == 0) goto L_0x0061
            java.util.Iterator r5 = r5.iterator()
        L_0x0039:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0061
            java.lang.Object r6 = r5.next()
            com.tencent.mapsdk.internal.pi$d r6 = (com.tencent.mapsdk.internal.C114056pi.C114060d) r6
            com.tencent.mapsdk.internal.pj r7 = r3.f341244a
            com.tencent.mapsdk.internal.mq r7 = r7.f341296b
            com.tencent.mapsdk.internal.bj r7 = r7.f340903k
            java.lang.Class<com.tencent.mapsdk.internal.no> r8 = com.tencent.mapsdk.internal.C113995no.class
            int r9 = r6.f341273a
            com.tencent.mapsdk.internal.ms r7 = r7.mo171681a(r8, (int) r9)
            com.tencent.mapsdk.internal.no r7 = (com.tencent.mapsdk.internal.C113995no) r7
            if (r7 == 0) goto L_0x0039
            int r7 = r7.mo172502a()
            long r7 = (long) r7
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 != 0) goto L_0x0039
            r4 = r6
        L_0x0061:
            if (r4 == 0) goto L_0x001c
            java.lang.String r11 = r3.getId()
            com.tencent.tencentmap.mapsdk.maps.model.SubPoi r4 = com.tencent.mapsdk.internal.C114050ph.m158773a((java.lang.String) r11, (com.tencent.mapsdk.internal.C114056pi.C114060d) r4)
        L_0x006b:
            if (r4 == 0) goto L_0x0074
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r11 = r0.f341297c
            r11.onClicked(r4)
            r11 = 1
            return r11
        L_0x0074:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.vector.VectorMap.m160864h(float, float):boolean");
    }

    /* renamed from: i */
    private boolean m160868i(GeoPoint geoPoint) {
        boolean z;
        C113503ad adVar = this.f342909o.f340901i;
        if (geoPoint == null) {
            return true;
        }
        Rect r = adVar.mo171255r();
        boolean contains = r != null ? r.contains(geoPoint.getLongitudeE6(), geoPoint.getLatitudeE6()) : false;
        C113732fo a = adVar.f339664B.mo172027a(adVar.f339663A.f342794m);
        C113732fo a2 = adVar.f339664B.mo172027a(geoPoint);
        if (adVar.f339665C != null) {
            double abs = Math.abs(a.f340215a - a2.f340215a);
            double abs2 = Math.abs(a.f340216b - a2.f340216b);
            if (abs > ((double) adVar.f339665C.width()) || abs2 > ((double) adVar.f339665C.height())) {
                z = false;
                if (!contains || z) {
                    return false;
                }
                return true;
            }
        }
        z = true;
        if (!contains) {
        }
        return false;
    }

    /* renamed from: c */
    private void m160830c(C113709et etVar) {
        this.f342909o.f340903k.mo171684a(etVar);
        this.f342909o.f340914v = true;
    }

    /* renamed from: d */
    private void m160835d(int i) {
        this.f342909o.f340901i.mo171204a(i);
    }

    /* renamed from: e */
    private void m160846e(boolean z) {
        C114216sq sqVar = this.f342909o.f340899g;
        if (0 != sqVar.f342024e) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(z) {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.171.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.171.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    /* renamed from: b */
    private void m160809b(C55064ey eyVar) {
        C113503ad adVar = this.f342909o.f340901i;
        synchronized (adVar.f339688r) {
            adVar.f339688r.remove(eyVar);
        }
    }

    /* renamed from: d */
    private void m160833d(float f) {
        this.f342905M = f;
        C113961mq mqVar = this.f342909o;
        if (mqVar != null) {
            mqVar.mo172423a(f);
            if (this.f342907O == 2 && !m160775ae()) {
                m160797b((double) this.f342905M);
            }
        }
    }

    /* renamed from: f */
    public final void mo171722f() {
        C114062pj pjVar;
        if (!this.f342899G && this.f342896D != null && (pjVar = this.f342913s) != null) {
            this.f342904L.mo171580b((C113717fb) pjVar);
        }
    }

    /* renamed from: e */
    private void m160845e(String str) {
        this.f342909o.mo172449b(str);
    }

    /* renamed from: c */
    private void m160829c(Rect rect, Rect rect2) {
        this.f342909o.f340901i.mo171239c(rect, rect2);
    }

    /* renamed from: e */
    private void m160843e(GeoPoint geoPoint) {
        boolean z;
        if (geoPoint == null) {
            z = false;
        } else {
            int latitudeE6 = geoPoint.getLatitudeE6();
            z = GeometryConstants.BOUNDARY_WORLD.contains(geoPoint.getLongitudeE6(), latitudeE6);
        }
        if (z) {
            this.f342909o.f340901i.mo171211a(geoPoint, (Runnable) null);
        }
    }

    /* renamed from: f */
    private boolean m160854f(float f, float f2) {
        C113554bj bjVar = this.f342909o.f340903k;
        TappedElement a = bjVar.f339816a.mo171638f().mo172899a(f, f2);
        if (a == null || a.type != 3) {
            return false;
        }
        C113710eu euVar = bjVar.f339823h;
        if (euVar == null) {
            return true;
        }
        euVar.mo172034R();
        return true;
    }

    /* renamed from: c */
    private void m160826c(float f, float f2) {
        this.f342909o.f340901i.mo171203a(f, f2, true);
    }

    /* renamed from: d */
    private void m160839d(boolean z) {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null && sqVar.f342024e != 0) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(z) {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.166.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.166.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    /* renamed from: b */
    public final void mo173457b(C113726fk fkVar) {
        this.f342909o.f340901i.mo171231b(fkVar);
    }

    /* renamed from: b */
    private void m160810b(C113716fa faVar) {
        C113503ad adVar = this.f342909o.f340901i;
        if (adVar.f339689s != null) {
            synchronized (adVar.f339690t) {
                adVar.f339689s.remove(faVar);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.tencent.mapsdk.internal.pi$d} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [com.tencent.tencentmap.mapsdk.maps.model.MapPoi] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e8 A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m160847e(float r12, float r13) {
        /*
            r11 = this;
            com.tencent.mapsdk.internal.mq r0 = r11.f342909o
            com.tencent.mapsdk.internal.bj r0 = r0.f340903k
            com.tencent.mapsdk.internal.be r1 = r0.f339816a
            com.tencent.mapsdk.internal.sq r1 = r1.mo171638f()
            com.tencent.mapsdk.engine.jni.models.TappedElement r1 = r1.mo172899a((float) r12, (float) r13)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0020
            int r1 = r1.type
            r4 = 3
            if (r1 != r4) goto L_0x0020
            com.tencent.mapsdk.internal.eu r0 = r0.f339823h
            if (r0 == 0) goto L_0x001e
            r0.mo172034R()
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 != 0) goto L_0x00e9
            com.tencent.mapsdk.internal.bg r0 = r11.f342912r
            if (r0 == 0) goto L_0x006e
            com.tencent.mapsdk.internal.mq r1 = r0.f339749d
            com.tencent.mapsdk.internal.bj r1 = r1.f340903k
            com.tencent.mapsdk.internal.be r1 = r1.f339816a
            com.tencent.mapsdk.internal.sq r1 = r1.mo171638f()
            com.tencent.mapsdk.engine.jni.models.TappedElement r1 = r1.mo172899a((float) r12, (float) r13)
            if (r1 == 0) goto L_0x003e
            int r1 = r1.type
            r4 = 6
            if (r1 != r4) goto L_0x003e
            r1 = 1
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            if (r1 == 0) goto L_0x006f
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMyLocationClickListener r4 = r0.f339750e
            if (r4 == 0) goto L_0x006f
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r1 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng
            r1.<init>()
            android.location.Location r4 = r0.f339748c
            if (r4 == 0) goto L_0x0067
            double r4 = r4.getAltitude()
            r1.setAltitude(r4)
            android.location.Location r4 = r0.f339748c
            double r4 = r4.getLongitude()
            r1.setLongitude(r4)
            android.location.Location r4 = r0.f339748c
            double r4 = r4.getLatitude()
            r1.setLatitude(r4)
        L_0x0067:
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMyLocationClickListener r0 = r0.f339750e
            boolean r1 = r0.onMyLocationClicked(r1)
            goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            if (r1 != 0) goto L_0x00e9
            com.tencent.mapsdk.engine.jni.models.TappedElement r12 = r11.mo173434a((float) r12, (float) r13)
            if (r12 == 0) goto L_0x00e4
            com.tencent.mapsdk.internal.pj r13 = r11.f342913s
            if (r13 == 0) goto L_0x00e4
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r0 = r13.f341297c
            if (r0 == 0) goto L_0x00e4
            int r0 = r12.type
            r1 = 4
            if (r0 != r1) goto L_0x00e4
            long r0 = r12.itemId
            java.util.List<com.tencent.mapsdk.internal.ph> r12 = r13.f341295a
            java.util.Iterator r12 = r12.iterator()
        L_0x008c:
            boolean r4 = r12.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x00db
            java.lang.Object r4 = r12.next()
            com.tencent.mapsdk.internal.ph r4 = (com.tencent.mapsdk.internal.C114050ph) r4
            com.tencent.mapsdk.internal.pi r6 = r4.f341245b
            if (r6 == 0) goto L_0x00d1
            com.tencent.mapsdk.internal.pi$d r6 = r6.f341264a
            if (r6 == 0) goto L_0x00d1
            java.util.List<com.tencent.mapsdk.internal.pi$d> r6 = r6.f341282j
            if (r6 == 0) goto L_0x00d1
            java.util.Iterator r6 = r6.iterator()
        L_0x00a9:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00d1
            java.lang.Object r7 = r6.next()
            com.tencent.mapsdk.internal.pi$d r7 = (com.tencent.mapsdk.internal.C114056pi.C114060d) r7
            com.tencent.mapsdk.internal.pj r8 = r4.f341244a
            com.tencent.mapsdk.internal.mq r8 = r8.f341296b
            com.tencent.mapsdk.internal.bj r8 = r8.f340903k
            java.lang.Class<com.tencent.mapsdk.internal.no> r9 = com.tencent.mapsdk.internal.C113995no.class
            int r10 = r7.f341273a
            com.tencent.mapsdk.internal.ms r8 = r8.mo171681a(r9, (int) r10)
            com.tencent.mapsdk.internal.no r8 = (com.tencent.mapsdk.internal.C113995no) r8
            if (r8 == 0) goto L_0x00a9
            int r8 = r8.mo172502a()
            long r8 = (long) r8
            int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x00a9
            r5 = r7
        L_0x00d1:
            if (r5 == 0) goto L_0x008c
            java.lang.String r12 = r4.getId()
            com.tencent.tencentmap.mapsdk.maps.model.SubPoi r5 = com.tencent.mapsdk.internal.C114050ph.m158773a((java.lang.String) r12, (com.tencent.mapsdk.internal.C114056pi.C114060d) r5)
        L_0x00db:
            if (r5 == 0) goto L_0x00e4
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r12 = r13.f341297c
            r12.onClicked(r5)
            r12 = 1
            goto L_0x00e5
        L_0x00e4:
            r12 = 0
        L_0x00e5:
            if (r12 == 0) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            return r3
        L_0x00e9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.vector.VectorMap.m160847e(float, float):boolean");
    }

    /* renamed from: c */
    public final void mo173459c(float f) {
        this.f342909o.f340901i.mo171202a(f);
    }

    /* renamed from: d */
    private void m160834d(float f, float f2) {
        C113961mq mqVar = this.f342909o;
        if (mqVar != null) {
            C113503ad adVar = mqVar.f340901i;
            adVar.f339667E = f;
            adVar.f339668F = f2;
        }
    }

    /* renamed from: f */
    private static float m160848f(int i) {
        return C114367v.C114369a.m160574a(i);
    }

    /* renamed from: k */
    private void m160872k(boolean z) {
        C113503ad adVar;
        C113961mq mqVar = this.f342909o;
        if (mqVar != null && (adVar = mqVar.f340901i) != null) {
            adVar.f339674L = z;
        }
    }

    /* renamed from: c */
    private void m160827c(float f, float f2, boolean z) {
        C113503ad adVar = this.f342909o.f340901i;
        adVar.f339676N = true;
        adVar.mo171203a(f, f2, z);
    }

    /* renamed from: d */
    private void m160838d(String str) {
        this.f342909o.mo172437a(str);
    }

    /* renamed from: b */
    public final void mo173454b(float f) {
        this.f342909o.f340901i.mo171222b((double) f);
    }

    /* renamed from: d */
    public final void mo171718d() {
        C113495aa aaVar;
        if (!this.f342899G && (aaVar = this.f342896D) != null) {
            C113516aj ajVar = aaVar.f339616b;
            if (ajVar != null) {
                ajVar.mo171349n();
            }
            this.f342900H = true;
        }
    }

    /* renamed from: c */
    private void m160825c(double d) {
        this.f342909o.f340901i.mo171202a((float) d);
    }

    /* renamed from: b */
    public final void mo173458b(boolean z) {
        this.f342909o.mo172440a(z);
    }

    /* renamed from: b */
    private boolean m160823b(String str, byte[] bArr) {
        C114009oc ocVar;
        C114371w wVar = this.f342909o.f340910r;
        if (wVar == null || (ocVar = wVar.f342829b) == null) {
            return false;
        }
        return C114371w.m160593a(new File(ocVar.mo172568e()), str, bArr, wVar.f342832e);
    }

    /* renamed from: c */
    public final void mo173460c(int i, int i2) {
        this.f342909o.mo172446b(i, i2);
    }

    /* renamed from: c */
    private void m160831c(String str) {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null && 0 != sqVar.f342024e) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(str) {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.150.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.150.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    /* renamed from: c */
    public final void mo171714c() {
        C113495aa aaVar;
        if (!this.f342899G && (aaVar = this.f342896D) != null) {
            C113516aj ajVar = aaVar.f339616b;
            if (ajVar != null) {
                ajVar.mo171345j();
            }
            this.f342900H = false;
        }
    }

    /* renamed from: b */
    private void m160813b(C113720fe feVar) {
        C113503ad adVar = this.f342909o.f340901i;
        synchronized (adVar.f339694x) {
            adVar.f339694x.remove(feVar);
        }
    }

    /* renamed from: b */
    private void m160816b(C113724fi fiVar) {
        this.f342909o.f340901i.mo171230b(fiVar);
    }

    /* renamed from: a */
    public final boolean mo171703a() {
        return this.f342902J && !this.f342900H && !this.f342899G;
    }

    /* renamed from: a */
    private static boolean m160759a(GeoPoint geoPoint) {
        if (geoPoint == null) {
            return false;
        }
        int latitudeE6 = geoPoint.getLatitudeE6();
        return GeometryConstants.BOUNDARY_WORLD.contains(geoPoint.getLongitudeE6(), latitudeE6);
    }

    /* renamed from: b */
    private void m160815b(C113722fg fgVar) {
        this.f342909o.f340901i.mo171229b(fgVar);
    }

    /* renamed from: a */
    private void m160751a(C114009oc ocVar) {
        C113961mq mqVar = this.f342909o;
        if (mqVar != null) {
            mqVar.mo172433a(ocVar);
        }
    }

    /* renamed from: b */
    private void m160814b(C113721ff ffVar) {
        C113503ad adVar = this.f342909o.f340901i;
        synchronized (adVar.f339691u) {
            adVar.f339691u.remove(ffVar);
        }
    }

    /* renamed from: a */
    private void m160722a(float f, float f2, boolean z) {
        this.f342909o.f340901i.mo171223b(f, f2, z);
    }

    /* renamed from: a */
    private boolean m160760a(String str) {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar == null) {
            return false;
        }
        return ((Boolean) sqVar.mo172900a(new CallbackRunnable<Boolean>(str) {
            /* renamed from: a */
            private java.lang.Boolean m159946a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.111.a():java.lang.Boolean, dex: classes9.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.111.a():java.lang.Boolean, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            public final /* synthetic */ java.lang.Object run(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.111.run():java.lang.Object, dex: classes9.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.111.run():java.lang.Object, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        }, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: b */
    private void m160819b(C114020os osVar) {
        this.f342909o.f340901i.mo171234b(osVar);
    }

    /* renamed from: a */
    private void m160737a(C113709et etVar) {
        this.f342909o.f340903k.mo171684a(etVar);
        this.f342909o.f340914v = true;
    }

    /* renamed from: b */
    private void m160817b(C113727fl flVar) {
        this.f342909o.f340901i.mo171232b(flVar);
    }

    /* renamed from: b */
    private void m160808b(C113712ew ewVar) {
        List<C113712ew> list;
        C113554bj bjVar = this.f342909o.f340903k;
        if (ewVar != null && (list = bjVar.f339821f) != null) {
            list.remove(ewVar);
        }
    }

    /* renamed from: a */
    private void m160746a(C113719fd fdVar) {
        C113503ad adVar = this.f342909o.f340901i;
        if (fdVar != null) {
            synchronized (adVar.f339687q) {
                if (!adVar.f339687q.contains(fdVar)) {
                    adVar.f339687q.add(fdVar);
                }
            }
        }
    }

    /* renamed from: b */
    private void m160820b(C114131qz qzVar) {
        C114133rb rbVar;
        List<C114131qz> list;
        C114136rc rcVar = this.f342909o.f340902j;
        if (rcVar != null && (rbVar = rcVar.f341648b) != null && qzVar != null && (list = rbVar.f341638a) != null) {
            list.remove(qzVar);
        }
    }

    /* renamed from: a */
    private void m160742a(C55064ey eyVar) {
        C113503ad adVar = this.f342909o.f340901i;
        if (eyVar != null) {
            synchronized (adVar.f339688r) {
                if (!adVar.f339688r.contains(eyVar)) {
                    adVar.f339688r.add(eyVar);
                }
            }
        }
    }

    /* renamed from: b */
    private void m160804b(PolygonInfo polygonInfo) {
        this.f342909o.mo172447b(polygonInfo);
    }

    /* renamed from: g */
    private boolean m160859g(float f, float f2) {
        C113538bg bgVar = this.f342912r;
        boolean z = false;
        if (bgVar != null) {
            TappedElement a = bgVar.f339749d.f340903k.f339816a.mo171638f().mo172899a(f, f2);
            if (a != null && a.type == 6) {
                z = true;
            }
            if (z && bgVar.f339750e != null) {
                LatLng latLng = new LatLng();
                Location location = bgVar.f339748c;
                if (location != null) {
                    latLng.setAltitude(location.getAltitude());
                    latLng.setLongitude(bgVar.f339748c.getLongitude());
                    latLng.setLatitude(bgVar.f339748c.getLatitude());
                }
                return bgVar.f339750e.onMyLocationClicked(latLng);
            }
        }
        return z;
    }

    /* renamed from: b */
    private void m160802b(Rect rect, Rect rect2) {
        this.f342909o.f340901i.mo171226b(rect, rect2);
    }

    /* renamed from: b */
    private void m160803b(GeoPoint geoPoint, Runnable runnable) {
        this.f342909o.f340901i.mo171211a(geoPoint, runnable);
    }

    /* renamed from: a */
    public final void mo173441a(C113726fk fkVar) {
        this.f342909o.f340901i.mo171215a(fkVar);
    }

    /* renamed from: b */
    private void m160799b(float f, float f2, boolean z) {
        this.f342909o.f340901i.mo171203a(f, f2, z);
    }

    /* renamed from: a */
    private void m160744a(C113716fa faVar) {
        C113503ad adVar = this.f342909o.f340901i;
        if (faVar != null) {
            if (adVar.f339689s == null) {
                adVar.f339689s = new ArrayList();
            }
            synchronized (adVar.f339690t) {
                if (!adVar.f339689s.contains(faVar)) {
                    adVar.f339689s.add(faVar);
                }
            }
        }
    }

    /* renamed from: b */
    private void m160801b(Rect rect) {
        this.f342909o.f340901i.mo171225b(rect);
    }

    /* renamed from: b */
    private void m160797b(double d) {
        C113503ad adVar = this.f342909o.f340901i;
        adVar.mo171201a((360.0d - d) % 360.0d, (double) adVar.mo171246i(), true);
    }

    /* renamed from: b */
    private void m160807b(C113711ev evVar) {
        C113532ba baVar;
        C113961mq mqVar = this.f342909o;
        if (mqVar != null && (baVar = mqVar.f340905m) != null) {
            baVar.mo171579b(evVar);
        }
    }

    /* renamed from: a */
    public final void mo173437a(int i, int i2) {
        this.f342909o.f340901i.mo171206a(i, i2, 1);
    }

    /* renamed from: b */
    private void m160821b(String str) {
        this.f342909o.f340899g.mo172931b(str);
    }

    /* renamed from: a */
    public final void mo173436a(float f) {
        this.f342909o.f340901i.mo171198a((double) f);
    }

    /* renamed from: a */
    public final void mo173435a(double d) {
        this.f342909o.f340901i.mo171237c(d);
    }

    /* renamed from: b */
    public final void mo173455b(int i) {
        this.f342909o.mo172445b(i);
    }

    /* renamed from: b */
    public final void mo173456b(int i, int i2) {
        this.f342909o.f340901i.mo171205a(i, i2);
    }

    /* renamed from: a */
    private boolean m160761a(String str, byte[] bArr) {
        C114009oc ocVar;
        C114371w wVar = this.f342909o.f340910r;
        if (wVar == null || (ocVar = wVar.f342829b) == null) {
            return false;
        }
        return C114371w.m160593a(new File(ocVar.mo172566c()), str, bArr, wVar.f342831d);
    }

    /* renamed from: b */
    private void m160805b(C113533bb bbVar) {
        C113503ad adVar = this.f342909o.f340901i;
        if (adVar.f339692v != null) {
            synchronized (adVar.f339693w) {
                adVar.f339692v.remove(bbVar);
            }
        }
    }

    /* renamed from: a */
    private void m160747a(C113720fe feVar) {
        C113503ad adVar = this.f342909o.f340901i;
        if (feVar != null) {
            synchronized (adVar.f339694x) {
                if (!adVar.f339694x.contains(feVar)) {
                    adVar.f339694x.add(feVar);
                }
            }
        }
    }

    /* renamed from: b */
    private void m160800b(int i, float f) {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null) {
            sqVar.mo172906a(i, f);
        }
    }

    /* renamed from: b */
    private void m160811b(C113718fc fcVar) {
        this.f342909o.mo172448b(fcVar);
    }

    /* renamed from: b */
    private void m160818b(C114016om omVar) {
        C113961mq mqVar = this.f342909o;
        if (!mqVar.f340879I.isEmpty()) {
            mqVar.f340879I.remove(omVar);
        }
    }

    /* renamed from: a */
    private void m160749a(C113724fi fiVar) {
        this.f342909o.f340901i.mo171214a(fiVar);
    }

    /* renamed from: b */
    public final void mo171713b() {
        C114062pj pjVar;
        if (!this.f342899G && this.f342896D != null && (pjVar = this.f342913s) != null) {
            this.f342904L.mo171560a((C113717fb) pjVar);
        }
    }

    /* renamed from: a */
    public final void mo173440a(C113722fg fgVar) {
        this.f342909o.f340901i.mo171213a(fgVar);
    }

    /* renamed from: a */
    private void m160748a(C113721ff ffVar) {
        C113503ad adVar = this.f342909o.f340901i;
        if (ffVar != null) {
            synchronized (adVar.f339691u) {
                if (!adVar.f339691u.contains(ffVar)) {
                    adVar.f339691u.add(ffVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m160750a(C113727fl flVar) {
        this.f342909o.f340901i.mo171216a(flVar);
    }

    /* renamed from: a */
    private void m160754a(C114020os osVar) {
        this.f342909o.f340901i.mo171218a(osVar);
    }

    /* renamed from: a */
    private void m160741a(C113713ex exVar) {
        this.f342909o.f340903k.f339820e = exVar;
    }

    /* renamed from: a */
    private void m160740a(C113712ew ewVar) {
        C113554bj bjVar = this.f342909o.f340903k;
        if (ewVar != null) {
            if (bjVar.f339821f == null) {
                bjVar.f339821f = new ArrayList();
            }
            bjVar.f339821f.add(ewVar);
        }
    }

    /* renamed from: a */
    private void m160743a(C113714ez ezVar) {
        this.f342909o.f340903k.f339822g = ezVar;
    }

    /* renamed from: a */
    public final void mo173439a(C113710eu euVar) {
        this.f342909o.f340903k.f339823h = euVar;
    }

    /* renamed from: a */
    private void m160738a(C113709et etVar, int i, int i2, C113725fj fjVar) {
        C113961mq mqVar = this.f342909o;
        Rect bound = etVar.getBound(mqVar.f340906n);
        if (bound != null && i > 0 && i2 > 0 && fjVar != null) {
            mqVar.f340911s.m158206a(etVar, bound, fjVar, i, i2);
        }
    }

    /* renamed from: a */
    private void m160727a(Rect rect, int i, int i2, C113725fj fjVar) {
        C113961mq mqVar = this.f342909o;
        if (rect == null) {
            rect = mqVar.f340901i.mo171254q();
        }
        Rect rect2 = rect;
        if (rect2 != null && i > 0 && i2 > 0 && fjVar != null) {
            mqVar.f340911s.m158206a((C113709et) null, rect2, fjVar, i, i2);
        }
    }

    /* renamed from: a */
    private C24212ij m160716a(int i, Object obj, Object obj2) {
        C113503ad adVar = this.f342909o.f340901i;
        if (i == 0) {
            return C24229it.m30234a((C24211ig) adVar, 0, 1);
        }
        if (i == 1) {
            return C24229it.m30233a((C24211ig) adVar, (C24236ix) new C113818hx(), new Object[]{obj, obj2});
        } else if (i == 2) {
            return C24229it.m30232a((C24211ig) adVar, 3, Math.log10(((Number) obj).doubleValue()) / Math.log10(2.0d), Math.log10(((Number) obj2).doubleValue()) / Math.log10(2.0d));
        } else if (i == 3) {
            double doubleValue = ((Number) obj).doubleValue();
            return C24229it.m30232a((C24211ig) adVar, 2, (double) adVar.mo171245h(), (((Number) obj2).doubleValue() - doubleValue) + ((double) adVar.mo171245h()));
        } else if (i != 4) {
            return null;
        } else {
            double doubleValue2 = ((Number) obj).doubleValue();
            return C24229it.m30232a((C24211ig) adVar, 4, (double) adVar.mo171246i(), (((Number) obj2).doubleValue() - doubleValue2) + ((double) adVar.mo171246i()));
        }
    }

    /* renamed from: a */
    private double m160709a(Rect rect, Rect rect2) {
        C113503ad adVar = this.f342909o.f340901i;
        Rect rect3 = new Rect(adVar.f339696z.mo171639g());
        if (rect2 != null) {
            rect3.left += rect2.left;
            rect3.right -= rect2.right;
            rect3.top += rect2.top;
            rect3.bottom -= rect2.bottom;
        }
        return (double) adVar.mo171196a(rect, rect3);
    }

    /* renamed from: a */
    private void m160755a(C114131qz qzVar) {
        C114133rb rbVar;
        List<C114131qz> list;
        C114136rc rcVar = this.f342909o.f340902j;
        if (rcVar != null && (rbVar = rcVar.f341648b) != null && qzVar != null && (list = rbVar.f341638a) != null) {
            list.add(qzVar);
        }
    }

    /* renamed from: a */
    private int m160714a(PolygonInfo polygonInfo) {
        return this.f342909o.mo172417a(polygonInfo);
    }

    /* renamed from: a */
    private int m160711a(int i, int i2, int i3, int i4, int i5, float f) {
        C113961mq mqVar = this.f342909o;
        if (mqVar.f340899g == null) {
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
        Rect rect = mqVar.f340907o;
        if (rect != null) {
            maskLayer.width = rect.width();
            maskLayer.height = mqVar.f340907o.height();
        }
        maskLayer.zIndex = f;
        maskLayer.layer = i5;
        C114216sq sqVar = mqVar.f340899g;
        return ((Integer) sqVar.mo172900a(new CallbackRunnable<Integer>(maskLayer) {
            /* renamed from: a */
            private java.lang.Integer m159939a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.105.a():java.lang.Integer, dex: classes9.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.105.a():java.lang.Integer, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            public final /* synthetic */ java.lang.Object run(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.105.run():java.lang.Object, dex: classes9.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.105.run():java.lang.Object, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        }, 0)).intValue();
    }

    /* renamed from: a */
    private void m160758a(List<MapRouteSection> list, List<GeoPoint> list2) {
        C113961mq mqVar = this.f342909o;
        if (mqVar.f340918z == null) {
            mqVar.f340918z = new C113961mq.C113966d();
        }
        C113961mq.C113966d dVar = mqVar.f340918z;
        dVar.f340930a = list;
        dVar.f340931b = list2;
        C113961mq.this.f340899g.mo172919a(list, list2);
    }

    /* renamed from: a */
    private List<Integer> m160718a(Rect rect, int i) {
        C114216sq sqVar = this.f342909o.f340899g;
        return (List) sqVar.mo172900a(new CallbackRunnable<List<Integer>>(rect, i) {
            /* renamed from: a */
            private java.util.List<java.lang.Integer> m160044a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.30.a():java.util.List<java.lang.Integer>, dex: classes9.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.30.a():java.util.List<java.lang.Integer>, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            public final /* synthetic */ java.lang.Object run(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.30.run():java.lang.Object, dex: classes9.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.30.run():java.lang.Object, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        }, null);
    }

    /* renamed from: a */
    private AnnocationTextResult m160715a(AnnocationText annocationText) {
        C114216sq sqVar = this.f342909o.f340899g;
        return (AnnocationTextResult) sqVar.mo172900a(new CallbackRunnable<AnnocationTextResult>(annocationText) {
            /* renamed from: a */
            private com.tencent.map.lib.models.AnnocationTextResult m160042a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.29.a():com.tencent.map.lib.models.AnnocationTextResult, dex: classes9.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.29.a():com.tencent.map.lib.models.AnnocationTextResult, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            public final /* synthetic */ java.lang.Object run(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.29.run():java.lang.Object, dex: classes9.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.29.run():java.lang.Object, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        }, null);
    }

    /* renamed from: a */
    private void m160723a(int i, float f) {
        C113503ad adVar = this.f342909o.f340901i;
        adVar.mo171207a(i, (Runnable) new Runnable((double) f) {
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.ad.5.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                */
            /*  JADX ERROR: Method generation error: Method args not loaded: com.tencent.mapsdk.internal.ad.5.run():void, class status: UNLOADED
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.ad.5.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                */
            public final void run(
/*
Method generation error in method: com.tencent.mapsdk.internal.ad.5.run():void, dex: classes9.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.ad.5.run():void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        });
    }

    /* renamed from: a */
    private void m160735a(GeoPoint geoPoint, Runnable runnable) {
        C113503ad adVar = this.f342909o.f340901i;
        if (geoPoint != null) {
            adVar.mo171209a(geoPoint, (float) adVar.f339663A.f342783b.f342821q, runnable);
        }
    }

    /* renamed from: a */
    private void m160730a(GeoPoint geoPoint, int i) {
        this.f342909o.f340901i.mo171210a(geoPoint, i, (Runnable) null);
    }

    /* renamed from: a */
    private void m160731a(GeoPoint geoPoint, int i, Runnable runnable) {
        this.f342909o.f340901i.mo171210a(geoPoint, i, runnable);
    }

    /* renamed from: a */
    private void m160729a(GeoPoint geoPoint, float f, Runnable runnable) {
        int i;
        GeoPoint geoPoint2 = geoPoint;
        Runnable runnable2 = runnable;
        C113503ad adVar = this.f342909o.f340901i;
        if (geoPoint2 != null) {
            adVar.f339685o.mo173098e();
            double d = (double) adVar.f339663A.f342783b.f342820p;
            double d2 = (double) f;
            double d3 = d2 / d;
            int i2 = (d3 > 1.0d ? 1 : (d3 == 1.0d ? 0 : -1));
            if (i2 > 0) {
                i = (int) (d3 / 0.5d);
            } else if (d3 < 1.0d) {
                i = i2 != 0 ? (int) (0.5d / d3) : 0;
            } else {
                adVar.mo171228b(geoPoint2, runnable2);
                return;
            }
            int max = Math.max(60, Math.min(120, (i >> 1) << 1));
            double log10 = Math.log10(d) / Math.log10(2.0d);
            double log102 = Math.log10(d2) / Math.log10(2.0d);
            GeoPoint geoPoint3 = adVar.f339663A.f342794m;
            int i3 = 0;
            while (i3 < max) {
                long j = (long) max;
                int i4 = i3 + 1;
                long j2 = (long) i4;
                double d4 = log10;
                double pow = Math.pow(2.0d, C104556ma.m140030a(log10, log102, j, j2));
                double d5 = log102;
                long j3 = j;
                long j4 = j2;
                double a = C104556ma.m140030a((double) geoPoint3.getLatitudeE6(), (double) geoPoint.getLatitudeE6(), j3, j4);
                double a2 = C104556ma.m140030a((double) geoPoint3.getLongitudeE6(), (double) geoPoint.getLongitudeE6(), j3, j4);
                C113889km.m157537a("debug location anim zoomOut:" + a + "," + a2);
                adVar.mo171233b(new C113831iz(120, new double[]{pow, a, a2}));
                GeoPoint geoPoint4 = geoPoint;
                i3 = i4;
                log10 = d4;
                log102 = d5;
            }
            if (runnable2 != null) {
                adVar.mo171233b(new C113831iz(runnable2));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r2 > ((double) r12)) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m160732a(com.tencent.map.lib.models.GeoPoint r12, android.graphics.Rect r13) {
        /*
            r11 = this;
            com.tencent.mapsdk.internal.mq r0 = r11.f342909o
            com.tencent.mapsdk.internal.ad r0 = r0.f340901i
            com.tencent.mapsdk.internal.es r1 = r0.f339664B
            com.tencent.mapsdk.internal.fo r12 = r1.mo172027a((com.tencent.map.lib.models.GeoPoint) r12)
            double r2 = r12.f340215a
            int r2 = (int) r2
            double r3 = r12.f340216b
            int r3 = (int) r3
            boolean r2 = r13.contains(r2, r3)
            if (r2 != 0) goto L_0x005c
            double r2 = r12.f340215a
            int r4 = r13.left
            double r5 = (double) r4
            r7 = 0
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x0024
        L_0x0021:
            double r4 = (double) r4
            double r4 = r4 - r2
            goto L_0x002d
        L_0x0024:
            int r4 = r13.right
            double r5 = (double) r4
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x002c
            goto L_0x0021
        L_0x002c:
            r4 = r7
        L_0x002d:
            double r2 = r12.f340216b
            int r12 = r13.top
            double r9 = (double) r12
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x003a
        L_0x0036:
            double r12 = (double) r12
            double r7 = r12 - r2
            goto L_0x0042
        L_0x003a:
            int r12 = r13.bottom
            double r9 = (double) r12
            int r13 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r13 <= 0) goto L_0x0042
            goto L_0x0036
        L_0x0042:
            com.tencent.mapsdk.internal.v r12 = r0.f339663A
            com.tencent.map.lib.models.GeoPoint r12 = r12.f342794m
            com.tencent.mapsdk.internal.fo r12 = r1.mo172027a((com.tencent.map.lib.models.GeoPoint) r12)
            double r2 = r12.f340215a
            double r2 = r2 - r4
            r12.f340215a = r2
            double r2 = r12.f340216b
            double r2 = r2 - r7
            r12.f340216b = r2
            com.tencent.map.lib.models.GeoPoint r12 = r1.mo172025a((com.tencent.mapsdk.internal.C113732fo) r12)
            r13 = 0
            r0.mo171211a((com.tencent.map.lib.models.GeoPoint) r12, (java.lang.Runnable) r13)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.vector.VectorMap.m160732a(com.tencent.map.lib.models.GeoPoint, android.graphics.Rect):void");
    }

    /* renamed from: a */
    public final void mo173442a(C113831iz izVar) {
        this.f342909o.f340901i.mo171233b(izVar);
    }

    /* renamed from: a */
    private void m160726a(Rect rect) {
        this.f342909o.f340901i.mo171208a(rect);
    }

    /* renamed from: a */
    private int m160712a(int i, int i2, int i3, int i4, boolean z) {
        C113503ad adVar = this.f342909o.f340901i;
        adVar.f339670H = i;
        adVar.f339671I = i2;
        adVar.f339672J = i3;
        adVar.f339673K = i4;
        Rect rect = adVar.f339665C;
        if (rect == null || rect.width() <= 0 || adVar.f339665C.height() <= 0) {
            adVar.mo171218a((C114020os) new C114020os(z) {
                /* renamed from: a */
                public final void mo171259a(
/*
Method generation error in method: com.tencent.mapsdk.internal.ad.1.a():void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.ad.1.a():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
            C113536be beVar = adVar.f339696z;
            if (!(beVar instanceof C113961mq)) {
                return -2;
            }
            Context context = ((C113961mq) beVar).getContext();
            return (i + i3 > C113801hf.m157140b(context) || i2 + i4 > C113801hf.m157142c(context)) ? -1 : 0;
        } else if (i + i3 > adVar.f339665C.width() || i2 + i4 > adVar.f339665C.height()) {
            return -1;
        } else {
            PointF a = adVar.mo171197a();
            adVar.mo171203a(a.x, a.y, z);
            return 0;
        }
    }

    /* renamed from: a */
    private void m160719a(double d, double d2) {
        C114375z zVar = this.f342909o.f340901i.f339685o;
        synchronized (zVar.f342854c) {
            while (!zVar.f342853b.isEmpty()) {
                ArrayList<C113831iz> arrayList = zVar.f342853b;
                if (arrayList.get(arrayList.size() - 1).f340607z != 3) {
                    break;
                }
                ArrayList<C113831iz> arrayList2 = zVar.f342853b;
                double[] dArr = arrayList2.remove(arrayList2.size() - 1).f340601A;
                d += dArr[0];
                d2 += dArr[1];
            }
            zVar.mo173095a(new C113831iz(3, new double[]{d, d2}));
        }
    }

    /* renamed from: a */
    public final void mo173444a(C114094px pxVar) {
        C113503ad adVar = this.f342909o.f340901i;
        if (adVar.f339686p == null) {
            adVar.f339686p = adVar.f339695y.mo171549M();
        }
        C114085pu puVar = adVar.f339686p;
        puVar.f341389b = pxVar;
        boolean a = pxVar.mo172684a();
        C113532ba baVar = puVar.f341391d;
        if (baVar == null) {
            return;
        }
        if (a) {
            baVar.mo171579b((C113711ev) puVar);
        } else {
            baVar.mo171559a((C113711ev) puVar);
        }
    }

    /* renamed from: a */
    private void m160739a(C113711ev evVar) {
        C113532ba baVar;
        C113961mq mqVar = this.f342909o;
        if (mqVar != null && (baVar = mqVar.f340905m) != null) {
            baVar.mo171559a(evVar);
        }
    }

    /* renamed from: a */
    private void m160728a(GeoPoint geoPoint, float f, float f2, boolean z) {
        this.f342905M = f;
        this.f342906N.setLatitudeE6(geoPoint.getLatitudeE6());
        this.f342906N.setLongitudeE6(geoPoint.getLongitudeE6());
        C113961mq mqVar = this.f342909o;
        if (mqVar != null) {
            mqVar.mo172429a(this.f342906N, this.f342905M, f2, z);
            int i = this.f342907O;
            if (i == 1 || i == 2) {
                m160730a(this.f342906N, mo173490r());
            }
            if (this.f342907O == 2 && !m160775ae()) {
                m160797b((double) this.f342905M);
            }
        }
    }

    /* renamed from: a */
    private void m160733a(GeoPoint geoPoint, RectF rectF, boolean z) {
        C113961mq mqVar;
        Rect rect;
        C113961mq mqVar2 = this.f342909o;
        if (mqVar2 != null) {
            if (!(rectF == null || (rect = mqVar2.f340873C) == null)) {
                rectF.left -= (float) rect.left;
                rectF.top -= (float) rect.top;
                rectF.right -= (float) rect.right;
                rectF.bottom -= (float) rect.bottom;
            }
            C114216sq sqVar = mqVar2.f340899g;
            if (sqVar != null) {
                int i = mqVar2.f340875E;
                int i2 = mqVar2.f340874D;
                if (0 != sqVar.f342024e && (mqVar = sqVar.f342029j) != null) {
                    mqVar.mo172432a((C113961mq.C113963a) new C113961mq.C113963a(rectF, geoPoint, i, i2, z) {
                        /* renamed from: a */
                        public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.3.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.3.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo171700a(int i) {
        super.mo171700a(i);
        if (!this.f342899G && this.f342909o != null) {
            C113889km.m157545b(C0949kl.f2236f, "setIndoorConfigType:".concat(String.valueOf(i)));
            C114216sq sqVar = this.f342909o.f340899g;
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(i) {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.155.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.155.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    /* renamed from: a */
    private void m160721a(float f, float f2, float f3, float f4) {
        C114216sq sqVar = this.f342909o.f340899g;
        if (0 != sqVar.f342024e) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(f, f2, f3, f4) {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.165.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.165.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    /* renamed from: a */
    public final void mo173445a(String[] strArr) {
        this.f342909o.mo172442a(strArr);
    }

    /* renamed from: a */
    private void m160752a(C114014ok okVar) {
        this.f342909o.mo172434a(okVar);
    }

    /* renamed from: a */
    private void m160736a(C113503ad.C113511a aVar) {
        this.f342909o.f340901i.f339666D = aVar;
    }

    /* renamed from: a */
    private void m160725a(int i, int i2, int i3, int i4) {
        C114216sq sqVar;
        C113961mq mqVar = this.f342909o;
        if (mqVar != null && (sqVar = mqVar.f340899g) != null) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(i2, i, i3, i4) {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.22.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.22.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    /* renamed from: a */
    private void m160720a(double d, double d2, double d3, double d4, double d5) {
        this.f342909o.f340901i.mo171200a(d, d2, d3, d4, d5, (Runnable) null);
    }

    /* renamed from: a */
    public final void mo173438a(C113533bb bbVar) {
        this.f342909o.f340901i.mo171212a(bbVar);
    }

    @Deprecated
    /* renamed from: a */
    private int m160713a(TileOverlayCallback tileOverlayCallback, boolean z) {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null) {
            return sqVar.mo172896a(tileOverlayCallback, z);
        }
        return -1;
    }

    @Deprecated
    /* renamed from: a */
    private void m160724a(int i, int i2, int i3) {
        C114216sq sqVar = this.f342909o.f340899g;
        if (sqVar != null) {
            sqVar.mo172908a(i, i2, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0111  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m160734a(com.tencent.map.lib.models.GeoPoint r18, com.tencent.mapsdk.internal.C113830ii r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r17
            com.tencent.mapsdk.internal.mq r2 = r1.f342909o
            com.tencent.mapsdk.internal.ad r2 = r2.f340901i
            android.graphics.Rect r3 = r2.mo171255r()
            r4 = 0
            if (r3 == 0) goto L_0x001c
            int r5 = r18.getLongitudeE6()
            int r6 = r18.getLatitudeE6()
            boolean r3 = r3.contains(r5, r6)
            goto L_0x001d
        L_0x001c:
            r3 = 0
        L_0x001d:
            com.tencent.mapsdk.internal.ad$6 r5 = new com.tencent.mapsdk.internal.ad$6
            r6 = r19
            r5.<init>(r6)
            com.tencent.mapsdk.internal.v r6 = r2.f339663A
            com.tencent.mapsdk.internal.v$a r7 = r6.f342783b
            float r7 = r7.f342820p
            if (r3 != 0) goto L_0x0115
            com.tencent.map.lib.models.GeoPoint r3 = r6.f342794m
            com.tencent.mapsdk.internal.es r6 = r2.f339664B
            com.tencent.mapsdk.internal.fo r6 = r6.mo172027a((com.tencent.map.lib.models.GeoPoint) r3)
            com.tencent.mapsdk.internal.es r8 = r2.f339664B
            com.tencent.mapsdk.internal.fo r8 = r8.mo172027a((com.tencent.map.lib.models.GeoPoint) r0)
            android.graphics.Rect r9 = r2.f339665C
            if (r9 == 0) goto L_0x0068
            double r11 = r6.f340215a
            double r13 = r8.f340215a
            double r11 = r11 - r13
            double r11 = java.lang.Math.abs(r11)
            double r13 = r6.f340216b
            double r8 = r8.f340216b
            double r13 = r13 - r8
            double r8 = java.lang.Math.abs(r13)
            android.graphics.Rect r6 = r2.f339665C
            int r6 = r6.width()
            double r13 = (double) r6
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 > 0) goto L_0x0066
            android.graphics.Rect r6 = r2.f339665C
            int r6 = r6.height()
            double r11 = (double) r6
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x0068
        L_0x0066:
            r6 = 0
            goto L_0x0069
        L_0x0068:
            r6 = 1
        L_0x0069:
            if (r6 != 0) goto L_0x0111
            android.graphics.Rect r6 = r2.f339665C
            if (r6 == 0) goto L_0x007a
            int r4 = r6.width()
            android.graphics.Rect r6 = r2.f339665C
            int r6 = r6.height()
            goto L_0x007b
        L_0x007a:
            r6 = 0
        L_0x007b:
            if (r4 == 0) goto L_0x00eb
            if (r6 == 0) goto L_0x00eb
            if (r3 == 0) goto L_0x00eb
            if (r0 != 0) goto L_0x0084
            goto L_0x00eb
        L_0x0084:
            com.tencent.mapsdk.internal.fo r8 = com.tencent.mapsdk.internal.C113503ad.m155569a((com.tencent.map.lib.models.GeoPoint) r3)
            com.tencent.mapsdk.internal.fo r9 = com.tencent.mapsdk.internal.C113503ad.m155569a((com.tencent.map.lib.models.GeoPoint) r18)
            double r11 = r9.f340215a
            double r13 = r8.f340215a
            double r11 = r11 - r13
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x009b
            double r11 = java.lang.Math.abs(r11)
        L_0x009b:
            r15 = r11
            double r10 = r9.f340216b
            double r8 = r8.f340216b
            double r10 = r10 - r8
            int r8 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x00a9
            double r10 = java.lang.Math.abs(r10)
        L_0x00a9:
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r15 = r15 * r8
            double r10 = r10 * r8
            int r8 = r2.f339670H
            int r4 = r4 - r8
            int r8 = r2.f339672J
            int r4 = r4 - r8
            int r8 = r2.f339671I
            int r6 = r6 - r8
            int r8 = r2.f339673K
            int r6 = r6 - r8
            if (r4 > 0) goto L_0x00be
            r4 = 1
        L_0x00be:
            if (r6 > 0) goto L_0x00c1
            r6 = 1
        L_0x00c1:
            double r8 = (double) r4
            double r15 = r15 / r8
            double r8 = java.lang.Math.log(r15)
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = java.lang.Math.log(r12)
            double r8 = r8 / r14
            double r14 = (double) r6
            double r10 = r10 / r14
            double r10 = java.lang.Math.log(r10)
            double r12 = java.lang.Math.log(r12)
            double r10 = r10 / r12
            double r8 = java.lang.Math.max(r8, r10)
            r10 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r10 = r10 - r8
            float r4 = (float) r10
            com.tencent.mapsdk.internal.v r6 = r2.f339663A
            if (r6 == 0) goto L_0x00ed
            int r4 = (int) r4
            float r4 = com.tencent.mapsdk.internal.C114367v.C114369a.m160574a((int) r4)
            goto L_0x00ed
        L_0x00eb:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x00ed:
            int r6 = r18.getLatitudeE6()
            int r8 = r3.getLatitudeE6()
            int r6 = r6 + r8
            int r6 = r6 / 2
            int r8 = r18.getLongitudeE6()
            int r3 = r3.getLongitudeE6()
            int r8 = r8 + r3
            int r8 = r8 / 2
            com.tencent.map.lib.models.GeoPoint r3 = new com.tencent.map.lib.models.GeoPoint
            r3.<init>((int) r6, (int) r8)
            com.tencent.mapsdk.internal.ad$7 r6 = new com.tencent.mapsdk.internal.ad$7
            r6.<init>(r0, r7, r5)
            r2.mo171227b((com.tencent.map.lib.models.GeoPoint) r3, (float) r4, (java.lang.Runnable) r6)
            return
        L_0x0111:
            r2.mo171228b((com.tencent.map.lib.models.GeoPoint) r0, (java.lang.Runnable) r5)
            return
        L_0x0115:
            r2.mo171228b((com.tencent.map.lib.models.GeoPoint) r0, (java.lang.Runnable) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.vector.VectorMap.m160734a(com.tencent.map.lib.models.GeoPoint, com.tencent.mapsdk.internal.ii):void");
    }

    /* renamed from: a */
    private float m160710a(double d, GeoPoint geoPoint) {
        C113707es esVar;
        C113961mq mqVar = this.f342909o;
        if (!(geoPoint == null || mqVar.f340912t == null || (esVar = mqVar.f340906n) == null)) {
            double metersPerPixel = esVar.metersPerPixel(((double) geoPoint.getLatitudeE6()) / 1000000.0d);
            if (metersPerPixel != 0.0d) {
                return (float) (d / metersPerPixel);
            }
        }
        return 0.0f;
    }

    /* renamed from: a */
    private void m160756a(Language language) {
        C113961mq mqVar = this.f342909o;
        if (mqVar.f340917y == null) {
            mqVar.f340917y = new C113961mq.C113965c();
        }
        C113961mq.C113965c cVar = mqVar.f340917y;
        if (C113961mq.this.f340899g != null) {
            C114216sq a = C113961mq.this.f340899g;
            a.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(language.ordinal()) {
                /* renamed from: a */
                public final void mo54067a(
/*
Method generation error in method: com.tencent.mapsdk.internal.sq.32.a(javax.microedition.khronos.opengles.GL10):void, dex: classes9.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.sq.32.a(javax.microedition.khronos.opengles.GL10):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
            boolean unused = C113961mq.this.f340914v = true;
            C113961mq.this.f340914v = true;
            cVar.mo172465a(language);
        }
    }

    /* renamed from: a */
    private void m160745a(C113718fc fcVar) {
        this.f342909o.mo172430a(fcVar);
    }

    /* renamed from: a */
    public final void mo173443a(C114016om omVar) {
        this.f342909o.mo172435a(omVar);
    }

    /* renamed from: a */
    public final TappedElement mo173434a(float f, float f2) {
        return this.f342909o.mo172419a(f, f2);
    }

    /* renamed from: a */
    public final void mo171702a(boolean z) {
        C113540bh bhVar;
        if (!this.f342899G && (bhVar = this.f342911q) != null) {
            bhVar.f339762a.setZOrderMediaOverlay(z);
        }
    }

    /* renamed from: a */
    private void m160753a(C114018oo ooVar) {
        C113961mq mqVar = this.f342909o;
        if (mqVar != null) {
            mqVar.f340877G = ooVar;
        }
    }

    /* renamed from: a */
    private void m160757a(LatLngBounds latLngBounds, int i) {
        C113961mq mqVar = this.f342909o;
        if (mqVar != null) {
            mqVar.mo172436a(latLngBounds, i);
        }
    }
}
