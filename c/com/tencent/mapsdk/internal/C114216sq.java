package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.Pair;
import com.tencent.map.lib.callbacks.TileOverlayCallback;
import com.tencent.map.lib.models.AggregationOverlayInfo;
import com.tencent.map.lib.models.AnnocationText;
import com.tencent.map.lib.models.AnnocationTextResult;
import com.tencent.map.lib.models.ArcLineOverlayInfo;
import com.tencent.map.lib.models.CircleInfo;
import com.tencent.map.lib.models.CityTrafficInfo;
import com.tencent.map.lib.models.DataSource;
import com.tencent.map.lib.models.GLModelInfo;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.lib.models.GroundOverlayInfo;
import com.tencent.map.lib.models.HeatmapInfo;
import com.tencent.map.lib.models.IndoorCellInfo;
import com.tencent.map.lib.models.IntersectionOverlayInfo;
import com.tencent.map.lib.models.MapTileID;
import com.tencent.map.lib.models.MarkerInfo;
import com.tencent.map.lib.models.MaskLayer;
import com.tencent.map.lib.models.PolygonInfo;
import com.tencent.map.lib.models.ScatterPlotInfo;
import com.tencent.map.lib.models.TrailOverlayInfo;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.engine.jni.JNI;
import com.tencent.mapsdk.engine.jni.models.TappedElement;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.mapsdk.internal.C114105qf;
import com.tencent.mapsdk.internal.C114367v;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;
import com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
import com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle;
import com.tencent.tencentmap.mapsdk.maps.model.VectorHeatAggregationUnit;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.sq */
public final class C114216sq implements C113569br, C113571bt, C114010od, C114012of, C114013og, C114014ok, C114016om, C114018oo, C114019op {

    /* renamed from: a */
    public static final int f342008a = 0;

    /* renamed from: b */
    public static final int f342009b = -1;

    /* renamed from: c */
    public static final int f342010c = -9;

    /* renamed from: m */
    private static final int f342011m = 256;

    /* renamed from: n */
    private static final int f342012n = -14803236;

    /* renamed from: o */
    private static final int f342013o = -13752731;

    /* renamed from: p */
    private static final int f342014p = -15611905;

    /* renamed from: q */
    private static final int f342015q = -14650226;

    /* renamed from: r */
    private static final int f342016r = -11088785;

    /* renamed from: s */
    private static final int f342017s = -9906011;

    /* renamed from: t */
    private static final int f342018t = -11635864;

    /* renamed from: u */
    private static final int f342019u = -16777063;

    /* renamed from: v */
    private static final int f342020v = -16777063;

    /* renamed from: x */
    private static boolean f342021x;

    /* renamed from: A */
    private final ReentrantLock f342022A = new ReentrantLock();

    /* renamed from: d */
    public JNI f342023d = new JNI();

    /* renamed from: e */
    public volatile long f342024e;

    /* renamed from: f */
    public C114008ob f342025f;

    /* renamed from: g */
    public C113934lj f342026g;

    /* renamed from: h */
    public final C113933li f342027h;

    /* renamed from: i */
    public C114014ok f342028i;

    /* renamed from: j */
    public C113961mq f342029j;

    /* renamed from: k */
    public long f342030k = 0;

    /* renamed from: l */
    public final Object f342031l = new Object();
    /* access modifiers changed from: private */

    /* renamed from: w */
    public long f342032w = 0;

    /* renamed from: y */
    private float f342033y = 1.0f;

    /* renamed from: z */
    private String f342034z = null;

    public C114216sq(Context context, C113961mq mqVar) {
        C1142171 r0 = new C113942lo() {
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
                if (r8 == com.tencent.mapsdk.internal.C104548ha.m139950a()) goto L_0x0045;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
                r8 = r8.length;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
                r8 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
                com.tencent.mapsdk.internal.C113896kq.m157643a(com.tencent.mapsdk.internal.C0949kl.f2232b, "data-length", r8);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
                if (com.tencent.mapsdk.internal.C113896kq.m157669d(com.tencent.mapsdk.internal.C0949kl.f2232b, "req-count") != (com.tencent.mapsdk.internal.C113896kq.m157673e(com.tencent.mapsdk.internal.C0949kl.f2232b, "data-count") + com.tencent.mapsdk.internal.C113896kq.m157669d(com.tencent.mapsdk.internal.C0949kl.f2232b, "cancel-count"))) goto L_?;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
                com.tencent.mapsdk.internal.C113896kq.m157674e(com.tencent.mapsdk.internal.C0949kl.f2232b);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
                return;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo171885a(java.lang.String r7, byte[] r8) {
                /*
                    r6 = this;
                    com.tencent.mapsdk.internal.sq r0 = com.tencent.mapsdk.internal.C114216sq.this
                    java.lang.Object r0 = r0.f342031l
                    monitor-enter(r0)
                    com.tencent.mapsdk.internal.sq r1 = com.tencent.mapsdk.internal.C114216sq.this     // Catch:{ all -> 0x006c }
                    long r1 = r1.f342024e     // Catch:{ all -> 0x006c }
                    r3 = 0
                    int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r5 == 0) goto L_0x006a
                    boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x006c }
                    if (r1 == 0) goto L_0x001a
                    goto L_0x006a
                L_0x001a:
                    com.tencent.mapsdk.internal.sq r1 = com.tencent.mapsdk.internal.C114216sq.this     // Catch:{ all -> 0x006c }
                    com.tencent.mapsdk.engine.jni.JNI r1 = r1.f342023d     // Catch:{ all -> 0x006c }
                    com.tencent.mapsdk.internal.sq r2 = com.tencent.mapsdk.internal.C114216sq.this     // Catch:{ all -> 0x006c }
                    long r2 = r2.f342024e     // Catch:{ all -> 0x006c }
                    com.tencent.mapsdk.shell.events.EngineWriteDataModel r7 = r1.nativeWriteMapDataBlock(r2, r7, r8)     // Catch:{ all -> 0x006c }
                    if (r7 == 0) goto L_0x0038
                    int r1 = r7.resultCode     // Catch:{ all -> 0x006c }
                    if (r1 == 0) goto L_0x0038
                    com.tencent.mapsdk.internal.C114361u.m160481a()     // Catch:{ all -> 0x006c }
                    com.tencent.mapsdk.internal.sm r1 = new com.tencent.mapsdk.internal.sm     // Catch:{ all -> 0x006c }
                    r1.<init>(r7)     // Catch:{ all -> 0x006c }
                L_0x0038:
                    monitor-exit(r0)     // Catch:{ all -> 0x006c }
                    java.lang.String r7 = "TTO"
                    java.lang.String r0 = "data-length"
                    byte[] r1 = com.tencent.mapsdk.internal.C104548ha.m139950a()
                    if (r8 == r1) goto L_0x0045
                    int r8 = r8.length
                    goto L_0x0046
                L_0x0045:
                    r8 = 0
                L_0x0046:
                    com.tencent.mapsdk.internal.C113896kq.m157643a((java.lang.String) r7, (java.lang.String) r0, (int) r8)
                    java.lang.String r7 = "TTO"
                    java.lang.String r8 = "data-count"
                    int r7 = com.tencent.mapsdk.internal.C113896kq.m157673e(r7, r8)
                    java.lang.String r8 = "TTO"
                    java.lang.String r0 = "req-count"
                    int r8 = com.tencent.mapsdk.internal.C113896kq.m157669d(r8, r0)
                    java.lang.String r0 = "TTO"
                    java.lang.String r1 = "cancel-count"
                    int r0 = com.tencent.mapsdk.internal.C113896kq.m157669d(r0, r1)
                    int r7 = r7 + r0
                    if (r8 != r7) goto L_0x0069
                    java.lang.String r7 = "TTO"
                    com.tencent.mapsdk.internal.C113896kq.m157674e(r7)
                L_0x0069:
                    return
                L_0x006a:
                    monitor-exit(r0)     // Catch:{ all -> 0x006c }
                    return
                L_0x006c:
                    r7 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x006c }
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114216sq.C1142171.mo171885a(java.lang.String, byte[]):void");
            }
        };
        this.f342027h = r0;
        C113934lj ljVar = new C113934lj();
        this.f342026g = ljVar;
        ljVar.mo172357a((C113933li) r0);
        this.f342029j = mqVar;
        this.f342033y = context.getResources().getDisplayMetrics().density;
        if (f342021x) {
            C80345kj.m97853a(context, C114207sl.f341929a);
        }
    }

    /* renamed from: C */
    private Object m159696C() {
        return this.f342031l;
    }

    /* renamed from: D */
    private static boolean m159697D() {
        return f342021x;
    }

    /* renamed from: E */
    private void m159698E() {
        this.f342029j.f340914v = true;
    }

    /* renamed from: F */
    private void m159699F() {
        C113934lj ljVar = this.f342026g;
        if (ljVar != null) {
            ljVar.mo172362b(this.f342027h);
            this.f342026g.mo172356a();
        }
        if (this.f342024e != 0) {
            long j = this.f342024e;
            synchronized (this.f342031l) {
                this.f342024e = 0;
                this.f342023d.nativeDestroyEngine(j);
            }
        }
        this.f342029j = null;
        this.f342023d.destory();
    }

    /* renamed from: G */
    private boolean m159700G() {
        if (this.f342024e == 0) {
            return false;
        }
        if (SystemClock.elapsedRealtime() - this.f342030k > 560) {
            this.f342023d.nativeClearDownloadURLCache(this.f342024e);
            this.f342030k = SystemClock.elapsedRealtime();
        }
        return this.f342023d.nativeGenerateTextures(this.f342024e);
    }

    /* renamed from: H */
    private boolean m159701H() {
        return ((Boolean) mo172900a(new CallbackRunnable<Boolean>() {
            /* renamed from: a */
            private Boolean m159936a() {
                return Boolean.valueOf(C114216sq.this.f342023d.nativeDrawFrame(C114216sq.this.f342024e));
            }

            public final /* synthetic */ Object run() {
                return Boolean.valueOf(C114216sq.this.f342023d.nativeDrawFrame(C114216sq.this.f342024e));
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: I */
    private C114132ra[] m159702I() {
        return (C114132ra[]) mo172900a(new CallbackRunnable<C114132ra[]>() {
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.mapsdk.internal.C114132ra[] run() {
                /*
                    r7 = this;
                    com.tencent.mapsdk.internal.sq r0 = com.tencent.mapsdk.internal.C114216sq.this
                    java.lang.Object r0 = r0.f342031l
                    monitor-enter(r0)
                    com.tencent.mapsdk.internal.sq r1 = com.tencent.mapsdk.internal.C114216sq.this     // Catch:{ all -> 0x007a }
                    long r1 = r1.f342024e     // Catch:{ all -> 0x007a }
                    r3 = 0
                    r5 = 0
                    int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r6 != 0) goto L_0x0016
                    monitor-exit(r0)     // Catch:{ all -> 0x007a }
                    return r5
                L_0x0016:
                    com.tencent.mapsdk.internal.sq r1 = com.tencent.mapsdk.internal.C114216sq.this     // Catch:{ all -> 0x007a }
                    com.tencent.mapsdk.engine.jni.JNI r1 = r1.f342023d     // Catch:{ all -> 0x007a }
                    com.tencent.mapsdk.internal.sq r2 = com.tencent.mapsdk.internal.C114216sq.this     // Catch:{ all -> 0x007a }
                    long r2 = r2.f342024e     // Catch:{ all -> 0x007a }
                    int[] r1 = r1.nativeFetchLackedTrafficBlocks(r2)     // Catch:{ all -> 0x007a }
                    monitor-exit(r0)     // Catch:{ all -> 0x007a }
                    if (r1 == 0) goto L_0x0079
                    int r0 = r1.length
                    if (r0 != 0) goto L_0x002d
                    goto L_0x0079
                L_0x002d:
                    int r0 = r1.length
                    int r0 = r0 / 9
                    com.tencent.mapsdk.internal.ra[] r0 = new com.tencent.mapsdk.internal.C114132ra[r0]
                    r2 = 0
                L_0x0033:
                    int r3 = r1.length
                    int r3 = r3 / 9
                    if (r2 >= r3) goto L_0x0078
                    com.tencent.mapsdk.internal.ra r3 = new com.tencent.mapsdk.internal.ra
                    r3.<init>()
                    r0[r2] = r3
                    int r4 = r2 * 9
                    r5 = r1[r4]
                    r3.f341623a = r5
                    int r5 = r4 + 1
                    r5 = r1[r5]
                    r3.f341624b = r5
                    int r5 = r4 + 2
                    r5 = r1[r5]
                    r3.f341626d = r5
                    int r5 = r4 + 3
                    r5 = r1[r5]
                    r3.f341625c = r5
                    int r5 = r4 + 4
                    r5 = r1[r5]
                    r3.f341628f = r5
                    int r5 = r4 + 5
                    r5 = r1[r5]
                    r3.f341627e = r5
                    int r5 = r4 + 6
                    r5 = r1[r5]
                    r3.f341629g = r5
                    int r5 = r4 + 7
                    r5 = r1[r5]
                    r3.f341630h = r5
                    int r4 = r4 + 8
                    r4 = r1[r4]
                    r3.f341631i = r4
                    int r2 = r2 + 1
                    goto L_0x0033
                L_0x0078:
                    return r0
                L_0x0079:
                    return r5
                L_0x007a:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x007a }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114216sq.C11424535.run():com.tencent.mapsdk.internal.ra[]");
            }
        }, (Object) null);
    }

    /* renamed from: J */
    private void m159703J() {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeShowTraffic(C114216sq.this.f342024e);
                }
            }
        });
    }

    /* renamed from: K */
    private void m159704K() {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeHideTraffic(C114216sq.this.f342024e);
                }
            }
        });
    }

    /* renamed from: M */
    private long m159705M() {
        return this.f342024e;
    }

    /* renamed from: N */
    private void m159706N() {
        if (0 != this.f342024e) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeHideCompass(C114216sq.this.f342024e);
                    }
                }
            });
        }
    }

    /* renamed from: O */
    private int m159707O() {
        return ((Integer) mo172900a(new CallbackRunnable<Integer>() {
            /* renamed from: a */
            private Integer m159997a() {
                if (0 == C114216sq.this.f342024e) {
                    return -1;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeGetIndoorCurrentFloorId(C114216sq.this.f342024e));
            }

            public final /* synthetic */ Object run() {
                if (0 == C114216sq.this.f342024e) {
                    return -1;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeGetIndoorCurrentFloorId(C114216sq.this.f342024e));
            }
        }, -1)).intValue();
    }

    /* renamed from: P */
    private String[] m159708P() {
        return (String[]) mo172900a(new CallbackRunnable<String[]>() {
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
        }, (Object) null);
    }

    /* renamed from: Q */
    private Rect m159709Q() {
        return (Rect) mo172900a(new CallbackRunnable<Rect>() {
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
        }, (Object) null);
    }

    /* renamed from: R */
    private String m159710R() {
        return (String) mo172900a(new CallbackRunnable<String>() {
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
        }, (Object) null);
    }

    /* renamed from: S */
    private void m159711S() {
        C113961mq mqVar;
        if (0 != this.f342024e && (mqVar = this.f342029j) != null) {
            mqVar.mo172432a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeZoomOut(C114216sq.this.f342024e);
                    }
                }
            });
        }
    }

    /* renamed from: T */
    private void m159712T() {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
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
    }

    /* renamed from: U */
    private boolean m159713U() {
        return ((Boolean) mo172900a(new CallbackRunnable<Boolean>() {
            /* renamed from: a */
            private Boolean m160087a() {
                return 0 == C114216sq.this.f342024e ? Boolean.FALSE : Boolean.valueOf(C114216sq.this.f342023d.nativeNeedDispaly(C114216sq.this.f342024e));
            }

            public final /* synthetic */ Object run() {
                return 0 == C114216sq.this.f342024e ? Boolean.FALSE : Boolean.valueOf(C114216sq.this.f342023d.nativeNeedDispaly(C114216sq.this.f342024e));
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: V */
    private String m159714V() {
        return (String) mo172900a(new CallbackRunnable<String>() {
            /* renamed from: a */
            private String m160058a() {
                return C114216sq.this.f342024e == 0 ? "" : C114216sq.this.f342023d.nativeGetMapEngineVersion(C114216sq.this.f342024e);
            }

            public final /* synthetic */ Object run() {
                return C114216sq.this.f342024e == 0 ? "" : C114216sq.this.f342023d.nativeGetMapEngineVersion(C114216sq.this.f342024e);
            }
        }, "");
    }

    /* renamed from: W */
    private String m159715W() {
        return (String) mo172900a(new CallbackRunnable<String>() {
            /* renamed from: a */
            private String m160059a() {
                return C114216sq.this.f342024e == 0 ? "" : C114216sq.this.f342023d.nativeGetDataEngineVersion(C114216sq.this.f342024e);
            }

            public final /* synthetic */ Object run() {
                return C114216sq.this.f342024e == 0 ? "" : C114216sq.this.f342023d.nativeGetDataEngineVersion(C114216sq.this.f342024e);
            }
        }, "");
    }

    /* renamed from: X */
    private String m159716X() {
        return (String) mo172900a(new CallbackRunnable<String>() {
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
        }, (Object) null);
    }

    /* renamed from: Y */
    private void m159717Y() {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeResetIndoorCellInfo(C114216sq.this.f342024e);
                }
            }
        });
    }

    /* renamed from: Z */
    private static void m159718Z() {
    }

    /* renamed from: aa */
    private static void m159772aa() {
    }

    /* renamed from: ab */
    private float[] m159773ab() {
        return this.f342023d.nativeGLProjectMatrix();
    }

    /* renamed from: ac */
    private int[] m159774ac() {
        return this.f342023d.nativeGLViewport();
    }

    /* renamed from: ad */
    private float m159775ad() {
        return this.f342023d.nativeGLViewScaleRatio();
    }

    /* renamed from: g */
    private void m159812g(final int i) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    int i = i;
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

    /* renamed from: h */
    private void m159817h(final int i) {
        if (this.f342024e != 0 && i >= 0 && this.f342029j != null) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    C114216sq.this.f342023d.nativeDeleteCircle(C114216sq.this.f342024e, i);
                }
            });
        }
    }

    /* renamed from: i */
    private void m159822i(final int i) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeRemoveMaskLayer(C114216sq.this.f342024e, i);
                }
            }
        });
    }

    /* renamed from: l */
    private static void m159834l(boolean z) {
        f342021x = z;
    }

    /* renamed from: o */
    private void m159840o(final boolean z) {
        if (0 != this.f342024e) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetLocationCircleHidden(C114216sq.this.f342024e, z);
                    }
                }
            });
        }
    }

    /* renamed from: A */
    public final float[] mo172892A() {
        double[] nativeGLViewMatrix = this.f342023d.nativeGLViewMatrix();
        if (nativeGLViewMatrix == null || nativeGLViewMatrix.length == 0) {
            return null;
        }
        PointF a = this.f342029j.f340906n.mo172024a(C113883ke.m157466a(this.f342029j.f340899g.mo172953o()));
        m159768a(nativeGLViewMatrix, (double) a.x, (double) (-a.y));
        float[] fArr = new float[nativeGLViewMatrix.length];
        for (int i = 0; i < nativeGLViewMatrix.length; i++) {
            fArr[i] = new BigDecimal(nativeGLViewMatrix[i]).floatValue();
        }
        return fArr;
    }

    /* renamed from: B */
    public final Context mo172893B() {
        C113961mq mqVar = this.f342029j;
        if (mqVar == null) {
            return null;
        }
        return mqVar.getContext();
    }

    @Deprecated
    /* renamed from: j */
    public final boolean mo172947j() {
        return ((Boolean) mo172900a(new CallbackRunnable<Boolean>() {
            /* renamed from: a */
            private Boolean m159984a() {
                return C114216sq.this.f342024e == 0 ? Boolean.TRUE : Boolean.valueOf(C114216sq.this.f342023d.nativeIsMapDrawFinished(C114216sq.this.f342024e));
            }

            public final /* synthetic */ Object run() {
                return C114216sq.this.f342024e == 0 ? Boolean.TRUE : Boolean.valueOf(C114216sq.this.f342023d.nativeIsMapDrawFinished(C114216sq.this.f342024e));
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* renamed from: k */
    public final GeoPoint[] mo172949k() {
        return (GeoPoint[]) mo172924b(new CallbackRunnable<GeoPoint[]>() {
            /* renamed from: a */
            private GeoPoint[] m159945a() {
                if (C114216sq.this.f342024e == 0) {
                    return new GeoPoint[4];
                }
                double[] dArr = new double[8];
                C114216sq.this.f342023d.nativeFromMapSight(C114216sq.this.f342024e, dArr);
                return new GeoPoint[]{new GeoPoint((int) (dArr[1] * 1000000.0d), (int) (dArr[0] * 1000000.0d)), new GeoPoint((int) (dArr[3] * 1000000.0d), (int) (dArr[2] * 1000000.0d)), new GeoPoint((int) (dArr[5] * 1000000.0d), (int) (dArr[4] * 1000000.0d)), new GeoPoint((int) (dArr[7] * 1000000.0d), (int) (dArr[6] * 1000000.0d))};
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return new GeoPoint[4];
                }
                double[] dArr = new double[8];
                C114216sq.this.f342023d.nativeFromMapSight(C114216sq.this.f342024e, dArr);
                return new GeoPoint[]{new GeoPoint((int) (dArr[1] * 1000000.0d), (int) (dArr[0] * 1000000.0d)), new GeoPoint((int) (dArr[3] * 1000000.0d), (int) (dArr[2] * 1000000.0d)), new GeoPoint((int) (dArr[5] * 1000000.0d), (int) (dArr[4] * 1000000.0d)), new GeoPoint((int) (dArr[7] * 1000000.0d), (int) (dArr[6] * 1000000.0d))};
            }
        }, new GeoPoint[4]);
    }

    /* renamed from: m */
    public final void mo172951m() {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeHideStreetRoad(C114216sq.this.f342024e);
                }
            }
        });
    }

    /* renamed from: m_ */
    public final void mo172580m_() {
        C114018oo ooVar;
        C113961mq mqVar = this.f342029j;
        if (mqVar != null && (ooVar = mqVar.f340877G) != null) {
            ooVar.mo172580m_();
        }
    }

    /* renamed from: n */
    public final boolean mo172952n() {
        return ((Boolean) mo172900a(new CallbackRunnable<Boolean>() {
            /* renamed from: a */
            private Boolean m159973a() {
                return C114216sq.this.f342024e != 0 ? Boolean.valueOf(C114216sq.this.f342023d.nativeNeedRedraw(C114216sq.this.f342024e)) : Boolean.FALSE;
            }

            public final /* synthetic */ Object run() {
                return C114216sq.this.f342024e != 0 ? Boolean.valueOf(C114216sq.this.f342023d.nativeNeedRedraw(C114216sq.this.f342024e)) : Boolean.FALSE;
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: p */
    public final float mo172954p() {
        if (0 == this.f342024e) {
            return 1.0f;
        }
        return (float) this.f342023d.nativeGetScale(this.f342024e);
    }

    /* renamed from: q */
    public final int mo172955q() {
        if (0 == this.f342024e) {
            return 20;
        }
        return this.f342023d.nativeGetScaleLevel(this.f342024e);
    }

    /* renamed from: r */
    public final float mo172956r() {
        if (0 == this.f342024e) {
            return 0.0f;
        }
        return this.f342023d.nativeGetSkew(this.f342024e);
    }

    /* renamed from: s */
    public final float mo172957s() {
        if (0 == this.f342024e) {
            return 0.0f;
        }
        return this.f342023d.nativeGetRotate(this.f342024e);
    }

    /* renamed from: t */
    public final float mo172958t() {
        if (0 == this.f342024e) {
            return 0.0f;
        }
        return this.f342023d.nativeMapSightGetOnScreenHeight(this.f342024e);
    }

    /* renamed from: u */
    public final int mo172959u() {
        if (0 == this.f342024e) {
            return 1;
        }
        return this.f342023d.nativeGetMapStyle(this.f342024e);
    }

    /* renamed from: v */
    public final boolean mo172960v() {
        return ((Boolean) mo172900a(new CallbackRunnable<Boolean>() {
            /* renamed from: a */
            private Boolean m160031a() {
                return C114216sq.this.f342024e == 0 ? Boolean.FALSE : Boolean.valueOf(C114216sq.this.f342023d.nativeIsTileOverlayEnabled(C114216sq.this.f342024e));
            }

            public final /* synthetic */ Object run() {
                return C114216sq.this.f342024e == 0 ? Boolean.FALSE : Boolean.valueOf(C114216sq.this.f342023d.nativeIsTileOverlayEnabled(C114216sq.this.f342024e));
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: w */
    public final void mo172961w() {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (0 != C114216sq.this.f342024e) {
                    C114216sq.this.f342023d.nativeClearRouteNameSegments(C114216sq.this.f342024e);
                }
            }
        });
    }

    /* renamed from: x */
    public final int mo172962x() {
        return ((Integer) mo172900a(new CallbackRunnable<Integer>() {
            /* renamed from: a */
            private Integer m160047a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeGetLanguage(C114216sq.this.f342024e));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeGetLanguage(C114216sq.this.f342024e));
            }
        }, 0)).intValue();
    }

    /* renamed from: y */
    public final ArrayList<MapPoi> mo172963y() {
        return (ArrayList) mo172900a(new CallbackRunnable<ArrayList<MapPoi>>() {
            /* renamed from: a */
            private ArrayList<MapPoi> m160064a() {
                if (C114216sq.this.f342024e == 0) {
                    return null;
                }
                return C114216sq.this.f342023d.nativeGetPoisInScreen(C114216sq.this.f342024e);
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return null;
                }
                return C114216sq.this.f342023d.nativeGetPoisInScreen(C114216sq.this.f342024e);
            }
        }, (Object) null);
    }

    /* renamed from: z */
    public final boolean mo172964z() {
        return ((Boolean) mo172900a(new CallbackRunnable<Boolean>() {
            /* renamed from: a */
            private Boolean m160094a() {
                return C114216sq.this.f342024e == 0 ? Boolean.FALSE : Boolean.valueOf(C114216sq.this.f342023d.nativeGetAndResetDirty(C114216sq.this.f342024e));
            }

            public final /* synthetic */ Object run() {
                return C114216sq.this.f342024e == 0 ? Boolean.FALSE : Boolean.valueOf(C114216sq.this.f342023d.nativeGetAndResetDirty(C114216sq.this.f342024e));
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: b */
    private void m159781b(int i, int i2, int i3, int i4, int i5) {
        final int i6 = i;
        final int i7 = i2;
        final int i8 = i3;
        final int i9 = i4;
        final int i15 = i5;
        mo172930b((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeCheckTrafficBlockCacheForReplay(C114216sq.this.f342024e, i6, i7, i8, i9, i15);
                }
            }
        });
    }

    /* renamed from: c */
    private int m159787c(final String str) {
        return ((Integer) mo172900a(new CallbackRunnable<Integer>() {
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
        }, 0)).intValue();
    }

    /* renamed from: g */
    private void m159814g(final C114105qf qfVar) {
        if (this.f342024e != 0) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    int i = qfVar.f341513r;
                    if (i != -1) {
                        C114216sq.this.f342023d.nativeSetLineDrawArrow(C114216sq.this.f342024e, (long) i, qfVar.f341508a.f340281w);
                    }
                }
            });
        }
    }

    /* renamed from: i */
    private void m159823i(final C114105qf qfVar) {
        if (this.f342024e != 0) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    int i = qfVar.f341513r;
                    if (i != -1) {
                        C114216sq.this.f342023d.nativeSetDrawCap(C114216sq.this.f342024e, (long) i, qfVar.f341508a.f340284z);
                    }
                }
            });
        }
    }

    /* renamed from: j */
    private void m159827j(final C114105qf qfVar) {
        if (this.f342024e != 0) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    GeoPoint geoPoint;
                    C114105qf qfVar = qfVar;
                    int i = qfVar.f341513r;
                    if (i != -1 && (geoPoint = qfVar.f341512q) != null) {
                        C114216sq.this.f342023d.nativeLineInsertPoint(C114216sq.this.f342024e, (long) i, geoPoint, qfVar.f341511p);
                    }
                }
            });
        }
    }

    /* renamed from: k */
    private void m159831k(final C114105qf qfVar) {
        if (this.f342024e != 0) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    GeoPoint geoPoint;
                    C114105qf qfVar = qfVar;
                    int i = qfVar.f341513r;
                    if (i != -1 && (geoPoint = qfVar.f341512q) != null) {
                        C114216sq.this.f342023d.nativeLineClearPoint(C114216sq.this.f342024e, (long) i, geoPoint, qfVar.f341511p);
                    }
                }
            });
        }
    }

    /* renamed from: m */
    private void m159836m(final boolean z) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (0 != C114216sq.this.f342024e) {
                    C114216sq.this.f342023d.nativeSetBuilding3DEffect(C114216sq.this.f342024e, z);
                }
            }
        });
    }

    /* renamed from: n */
    private void m159838n(final boolean z) {
        if (this.f342024e != 0) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetIndoorBuildingPickEnabled(C114216sq.this.f342024e, z);
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo171854d() {
        mo172930b((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeLockEngine(C114216sq.this.f342024e);
                }
            }
        });
    }

    /* renamed from: e */
    public final int mo171855e() {
        return ((Integer) mo172900a(new CallbackRunnable<Integer>() {
            /* renamed from: a */
            private Integer m159948a() {
                if (C114216sq.this.f342024e == 0) {
                    return -1;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeClearCache(C114216sq.this.f342024e));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return -1;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeClearCache(C114216sq.this.f342024e));
            }
        }, -1)).intValue();
    }

    /* renamed from: f */
    public final void mo171856f() {
        mo172930b((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeUnlockEngine(C114216sq.this.f342024e);
                }
            }
        });
    }

    /* renamed from: l */
    public final void mo172950l() {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeShowStreetRoad(C114216sq.this.f342024e);
                }
            }
        });
    }

    /* renamed from: a */
    private void m159763a(C114008ob obVar) {
        this.f342025f = obVar;
    }

    /* renamed from: b */
    private void m159782b(final PolygonInfo polygonInfo) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    JNI c = C114216sq.this.f342023d;
                    long b = C114216sq.this.f342024e;
                    PolygonInfo polygonInfo = polygonInfo;
                    c.nativeUpdatePolygon(b, polygonInfo.polygonId, polygonInfo.borderLineId, polygonInfo);
                }
            }
        });
    }

    /* renamed from: d */
    private CityTrafficInfo m159793d(final String str) {
        return (CityTrafficInfo) mo172900a(new CallbackRunnable<CityTrafficInfo>() {
            /* renamed from: a */
            private CityTrafficInfo m160061a() {
                if (C114216sq.this.f342024e == 0) {
                    return null;
                }
                CityTrafficInfo cityTrafficInfo = new CityTrafficInfo();
                C114216sq.this.f342023d.nativeGetTrafficCityInfo(C114216sq.this.f342024e, str, cityTrafficInfo);
                return cityTrafficInfo;
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return null;
                }
                CityTrafficInfo cityTrafficInfo = new CityTrafficInfo();
                C114216sq.this.f342023d.nativeGetTrafficCityInfo(C114216sq.this.f342024e, str, cityTrafficInfo);
                return cityTrafficInfo;
            }
        }, (Object) null);
    }

    /* renamed from: f */
    private void m159810f(final String str) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeUpdateMapResource(C114216sq.this.f342024e, str);
                }
            }
        });
    }

    /* renamed from: h */
    private void m159818h(final C114105qf qfVar) {
        if (this.f342024e != 0) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    int i = qfVar.f341513r;
                    if (i != -1) {
                        C114216sq.this.f342023d.nativeSetLineDirectionArrowTextureName(C114216sq.this.f342024e, (long) i, qfVar.f341508a.f340262H);
                    }
                }
            });
        }
    }

    /* renamed from: l */
    private void m159832l(final int i) {
        if (0 != this.f342024e) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetIndoorMaskColor(C114216sq.this.f342024e, i);
                    }
                }
            });
        }
    }

    /* renamed from: m */
    private void m159835m(final int i) {
        if (0 != this.f342024e) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetLocationCircleColor(C114216sq.this.f342024e, i);
                    }
                }
            });
        }
    }

    /* renamed from: p */
    private void m159841p(final boolean z) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeEnableBaseMap(C114216sq.this.f342024e, z);
                }
            }
        });
    }

    /* renamed from: q */
    private void m159844q(final boolean z) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeEnableBuilding(C114216sq.this.f342024e, z);
                }
            }
        });
    }

    /* renamed from: o */
    public final GeoPoint mo172953o() {
        return (GeoPoint) mo172900a(new CallbackRunnable<GeoPoint>() {
            /* renamed from: a */
            private GeoPoint m160025a() {
                if (0 == C114216sq.this.f342024e) {
                    return null;
                }
                GeoPoint geoPoint = new GeoPoint();
                C114216sq.this.f342023d.nativeGetCenterMapPoint(C114216sq.this.f342024e, geoPoint);
                return geoPoint;
            }

            public final /* synthetic */ Object run() {
                if (0 == C114216sq.this.f342024e) {
                    return null;
                }
                GeoPoint geoPoint = new GeoPoint();
                C114216sq.this.f342023d.nativeGetCenterMapPoint(C114216sq.this.f342024e, geoPoint);
                return geoPoint;
            }
        }, new GeoPoint());
    }

    /* renamed from: a */
    private void m159764a(C114014ok okVar) {
        this.f342028i = okVar;
    }

    /* renamed from: b */
    private void m159784b(final C114105qf qfVar) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                C114105qf qfVar = qfVar;
                if (qfVar != null && qfVar.f341513r != -1) {
                    C114216sq.m159724a(C114216sq.this, qfVar);
                    C114216sq sqVar = C114216sq.this;
                    C114105qf qfVar2 = qfVar;
                    if (sqVar.f342024e != 0) {
                        sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(qfVar2) {
                            /* renamed from: a */
                            public final void mo54067a(GL10 gl10) {
                                C114105qf qfVar = r6;
                                int i = qfVar.f341513r;
                                if (i != -1) {
                                    C113736fs fsVar = qfVar.f341508a;
                                    int[] iArr = {fsVar.f340264J, fsVar.f340265K};
                                    C114216sq.this.f342023d.nativeSetTurnArrowStyle(C114216sq.this.f342024e, (long) i, iArr[0], iArr[1]);
                                }
                            }
                        });
                    }
                    C114216sq sqVar2 = C114216sq.this;
                    sqVar2.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(qfVar) {
                        /* renamed from: a */
                        public final void mo54067a(GL10 gl10) {
                            C114105qf.C114106a aVar;
                            C114105qf qfVar = r2;
                            int i = qfVar.f341513r;
                            if (i != -1 && (aVar = qfVar.f341514s) != null) {
                                C114216sq.this.f342023d.nativeSetTurnArrow(C114216sq.this.f342024e, (long) i, r2.f341508a.f340271m, aVar.f341522a, aVar.f341523b);
                            }
                        }
                    });
                    C114216sq sqVar3 = C114216sq.this;
                    C114105qf qfVar3 = qfVar;
                    if (sqVar3.f342024e != 0) {
                        sqVar3.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(qfVar3) {
                            /* renamed from: a */
                            public final void mo54067a(GL10 gl10) {
                                int i = qfVar.f341513r;
                                if (i != -1) {
                                    C114216sq.this.f342023d.nativeSetLineDrawArrow(C114216sq.this.f342024e, (long) i, qfVar.f341508a.f340281w);
                                }
                            }
                        });
                    }
                    C114105qf qfVar4 = qfVar;
                    if (qfVar4.f341508a.f340259E) {
                        C114216sq sqVar4 = C114216sq.this;
                        if (sqVar4.f342024e != 0) {
                            sqVar4.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(qfVar4) {
                                /* renamed from: a */
                                public final void mo54067a(GL10 gl10) {
                                    GeoPoint geoPoint;
                                    C114105qf qfVar = qfVar;
                                    int i = qfVar.f341513r;
                                    if (i != -1 && (geoPoint = qfVar.f341512q) != null) {
                                        C114216sq.this.f342023d.nativeLineClearPoint(C114216sq.this.f342024e, (long) i, geoPoint, qfVar.f341511p);
                                    }
                                }
                            });
                        }
                    } else {
                        C114216sq sqVar5 = C114216sq.this;
                        if (sqVar5.f342024e != 0) {
                            sqVar5.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(qfVar4) {
                                /* renamed from: a */
                                public final void mo54067a(GL10 gl10) {
                                    GeoPoint geoPoint;
                                    C114105qf qfVar = qfVar;
                                    int i = qfVar.f341513r;
                                    if (i != -1 && (geoPoint = qfVar.f341512q) != null) {
                                        C114216sq.this.f342023d.nativeLineInsertPoint(C114216sq.this.f342024e, (long) i, geoPoint, qfVar.f341511p);
                                    }
                                }
                            });
                        }
                    }
                    C114216sq sqVar6 = C114216sq.this;
                    C114105qf qfVar5 = qfVar;
                    if (sqVar6.f342024e != 0) {
                        sqVar6.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(qfVar5) {
                            /* renamed from: a */
                            public final void mo54067a(GL10 gl10) {
                                int i = qfVar.f341513r;
                                if (i != -1) {
                                    C114216sq.this.f342023d.nativeSetDrawCap(C114216sq.this.f342024e, (long) i, qfVar.f341508a.f340284z);
                                }
                            }
                        });
                    }
                    if (!C40002he.m42805a(qfVar.f341508a.f340262H)) {
                        C114216sq sqVar7 = C114216sq.this;
                        C114105qf qfVar6 = qfVar;
                        if (sqVar7.f342024e != 0) {
                            sqVar7.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(qfVar6) {
                                /* renamed from: a */
                                public final void mo54067a(GL10 gl10) {
                                    int i = qfVar.f341513r;
                                    if (i != -1) {
                                        C114216sq.this.f342023d.nativeSetLineDirectionArrowTextureName(C114216sq.this.f342024e, (long) i, qfVar.f341508a.f340262H);
                                    }
                                }
                            });
                        }
                    }
                    C114216sq sqVar8 = C114216sq.this;
                    sqVar8.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(qfVar) {
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void mo54067a(javax.microedition.khronos.opengles.GL10 r5) {
                            /*
                                r4 = this;
                                com.tencent.mapsdk.internal.sq r5 = com.tencent.mapsdk.internal.C114216sq.this
                                long r0 = r5.f342024e
                                r2 = 0
                                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                                if (r5 != 0) goto L_0x000d
                                return
                            L_0x000d:
                                com.tencent.mapsdk.internal.qf r5 = r2
                                int r0 = r5.f341513r
                                r1 = -1
                                if (r0 != r1) goto L_0x0015
                                return
                            L_0x0015:
                                com.tencent.mapsdk.internal.fs r5 = r5.f341508a
                                float r1 = r5.f340263I
                                r2 = 0
                                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                                if (r1 >= 0) goto L_0x001f
                                return
                            L_0x001f:
                                int r5 = r5.f340257C
                                r1 = 3
                                if (r5 == r1) goto L_0x003d
                                if (r5 != 0) goto L_0x0027
                                goto L_0x003d
                            L_0x0027:
                                com.tencent.mapsdk.internal.sq r5 = com.tencent.mapsdk.internal.C114216sq.this
                                com.tencent.mapsdk.engine.jni.JNI r5 = r5.f342023d
                                com.tencent.mapsdk.internal.sq r1 = com.tencent.mapsdk.internal.C114216sq.this
                                long r1 = r1.f342024e
                                com.tencent.mapsdk.internal.qf r3 = r2
                                com.tencent.mapsdk.internal.fs r3 = r3.f341508a
                                float r3 = r3.f340263I
                                r5.nativeSetLineFootPrintSpacing(r1, r0, r3)
                                return
                            L_0x003d:
                                com.tencent.mapsdk.internal.sq r5 = com.tencent.mapsdk.internal.C114216sq.this
                                com.tencent.mapsdk.engine.jni.JNI r5 = r5.f342023d
                                com.tencent.mapsdk.internal.sq r1 = com.tencent.mapsdk.internal.C114216sq.this
                                long r1 = r1.f342024e
                                com.tencent.mapsdk.internal.qf r3 = r2
                                com.tencent.mapsdk.internal.fs r3 = r3.f341508a
                                float r3 = r3.f340263I
                                r5.nativeSetLineArrowSpacing(r1, r0, r3)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114216sq.C11424737.mo54067a(javax.microedition.khronos.opengles.GL10):void");
                        }
                    });
                }
            }
        });
    }

    /* renamed from: d */
    private void m159797d(final int i, final int i2) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeUpdateMaskLayer(C114216sq.this.f342024e, i, i2);
                }
            }
        });
    }

    /* renamed from: f */
    private void m159809f(final C114105qf qfVar) {
        if (this.f342024e != 0) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    C114105qf qfVar = qfVar;
                    int i = qfVar.f341513r;
                    if (i != -1) {
                        C113736fs fsVar = qfVar.f341508a;
                        int[] iArr = {fsVar.f340264J, fsVar.f340265K};
                        C114216sq.this.f342023d.nativeSetTurnArrowStyle(C114216sq.this.f342024e, (long) i, iArr[0], iArr[1]);
                    }
                }
            });
        }
    }

    /* renamed from: g */
    private void m159815g(final String str) {
        if (0 != this.f342024e) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetCompassImage(C114216sq.this.f342024e, str);
                    }
                }
            });
        }
    }

    /* renamed from: j */
    private void m159825j(final int i) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeSetIndoorConfigType(C114216sq.this.f342024e, i);
                }
            }
        });
    }

    /* renamed from: k */
    private void m159830k(final int i) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (0 != C114216sq.this.f342024e && C114216sq.this.f342029j != null) {
                    C114216sq.this.f342023d.nativeSetIndoorFloor(C114216sq.this.f342024e, i);
                }
            }
        });
    }

    /* renamed from: n */
    private void m159837n(final int i) {
        C113961mq mqVar;
        if (0 != this.f342024e && (mqVar = this.f342029j) != null) {
            mqVar.mo172432a((C113961mq.C113963a) new C113961mq.C113963a() {

                /* renamed from: b */
                public final /* synthetic */ boolean f342274b = true;

                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetScaleLevel(C114216sq.this.f342024e, i, this.f342274b);
                    }
                }
            });
        }
    }

    /* renamed from: o */
    private void m159839o(final int i) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeSetLanguage(C114216sq.this.f342024e, i);
                }
            }
        });
    }

    /* renamed from: p */
    private boolean m159842p(final int i) {
        return ((Boolean) mo172900a(new CallbackRunnable<Boolean>() {
            /* renamed from: a */
            private Boolean m160066a() {
                return C114216sq.this.f342024e == 0 ? Boolean.FALSE : Boolean.valueOf(C114216sq.this.f342023d.checkMapLoadFinishedTask(C114216sq.this.f342024e, i));
            }

            public final /* synthetic */ Object run() {
                return C114216sq.this.f342024e == 0 ? Boolean.FALSE : Boolean.valueOf(C114216sq.this.f342023d.checkMapLoadFinishedTask(C114216sq.this.f342024e, i));
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: q */
    private void m159843q(final int i) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeSetMapFontSize(C114216sq.this.f342024e, i);
                }
            }
        });
    }

    /* renamed from: i */
    public final void mo172945i(final boolean z) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeSetTileOverlayEnabled(C114216sq.this.f342024e, z);
                }
            }
        });
    }

    /* renamed from: c */
    private void m159792c(final int i, final int i2) {
        mo172930b((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeSetTrafficMode(C114216sq.this.f342024e, i, i2);
                }
            }
        });
    }

    /* renamed from: d */
    private void m159800d(final C114105qf qfVar) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                int i;
                if (C114216sq.this.f342024e != 0 && (i = qfVar.f341513r) != -1) {
                    C114216sq.this.f342023d.nativeSetLineSelected(C114216sq.this.f342024e, (long) i, qfVar.isSelected());
                }
            }
        });
    }

    /* renamed from: e */
    private boolean m159806e(final String str) {
        return ((Boolean) mo172900a(new CallbackRunnable<Boolean>() {
            /* renamed from: a */
            private Boolean m159946a() {
                return C114216sq.this.f342024e == 0 ? Boolean.FALSE : Boolean.valueOf(C114216sq.this.f342023d.nativeHasStreetRoad(C114216sq.this.f342024e, str));
            }

            public final /* synthetic */ Object run() {
                return C114216sq.this.f342024e == 0 ? Boolean.FALSE : Boolean.valueOf(C114216sq.this.f342023d.nativeHasStreetRoad(C114216sq.this.f342024e, str));
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: i */
    private void m159824i(final String str) {
        if (this.f342024e != 0) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetServerHost(C114216sq.this.f342024e, str);
                    }
                }
            });
        }
    }

    /* renamed from: l */
    private void m159833l(final C114105qf qfVar) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo54067a(javax.microedition.khronos.opengles.GL10 r5) {
                /*
                    r4 = this;
                    com.tencent.mapsdk.internal.sq r5 = com.tencent.mapsdk.internal.C114216sq.this
                    long r0 = r5.f342024e
                    r2 = 0
                    int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r5 != 0) goto L_0x000d
                    return
                L_0x000d:
                    com.tencent.mapsdk.internal.qf r5 = r2
                    int r0 = r5.f341513r
                    r1 = -1
                    if (r0 != r1) goto L_0x0015
                    return
                L_0x0015:
                    com.tencent.mapsdk.internal.fs r5 = r5.f341508a
                    float r1 = r5.f340263I
                    r2 = 0
                    int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                    if (r1 >= 0) goto L_0x001f
                    return
                L_0x001f:
                    int r5 = r5.f340257C
                    r1 = 3
                    if (r5 == r1) goto L_0x003d
                    if (r5 != 0) goto L_0x0027
                    goto L_0x003d
                L_0x0027:
                    com.tencent.mapsdk.internal.sq r5 = com.tencent.mapsdk.internal.C114216sq.this
                    com.tencent.mapsdk.engine.jni.JNI r5 = r5.f342023d
                    com.tencent.mapsdk.internal.sq r1 = com.tencent.mapsdk.internal.C114216sq.this
                    long r1 = r1.f342024e
                    com.tencent.mapsdk.internal.qf r3 = r2
                    com.tencent.mapsdk.internal.fs r3 = r3.f341508a
                    float r3 = r3.f340263I
                    r5.nativeSetLineFootPrintSpacing(r1, r0, r3)
                    return
                L_0x003d:
                    com.tencent.mapsdk.internal.sq r5 = com.tencent.mapsdk.internal.C114216sq.this
                    com.tencent.mapsdk.engine.jni.JNI r5 = r5.f342023d
                    com.tencent.mapsdk.internal.sq r1 = com.tencent.mapsdk.internal.C114216sq.this
                    long r1 = r1.f342024e
                    com.tencent.mapsdk.internal.qf r3 = r2
                    com.tencent.mapsdk.internal.fs r3 = r3.f341508a
                    float r3 = r3.f340263I
                    r5.nativeSetLineArrowSpacing(r1, r0, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114216sq.C11424737.mo54067a(javax.microedition.khronos.opengles.GL10):void");
            }
        });
    }

    /* renamed from: a */
    public final boolean mo172923a(Context context, C114007oa oaVar, C114371w wVar, String str, String str2, String str3) {
        int[] iArr = new int[1];
        this.f342023d.initCallback(oaVar, wVar, this, this, this, this, this.f342029j.f340901i, this, this, this, this);
        this.f342024e = this.f342023d.nativeInitEngine(str, str2, str3, C113801hf.m157135a(context), 256, C113801hf.m157135a(context), iArr, false, Language.zh.ordinal());
        if (iArr[0] != 0) {
            C113889km.m157537a("init engine fail:" + iArr[0]);
            this.f342024e = 0;
            return false;
        }
        this.f342023d.nativeSetCenter(this.f342024e, new GeoPoint(39984186, 116307503), false);
        this.f342023d.registerCallback(this.f342024e);
        this.f342023d.nativeSetTrafficColor(this.f342024e, f342012n, f342014p, f342016r, -16777063);
        return true;
    }

    /* renamed from: b */
    public final void mo172577b(String str, C113931lg lgVar) {
        DataSource dataSource = DataSource.get(lgVar.f340789b);
        C113889km.m157545b(C0949kl.f2232b, "onRequestDownload DataSource:" + dataSource + " uri:" + str);
        if (dataSource == DataSource.TILE_OVERLAY) {
            MapTileID mapTileID = (MapTileID) lgVar.f340791d;
            int tileTag = mapTileID.getTileTag();
            C113889km.m157545b(C0949kl.f2232b, "onRequestDownload tileOverlayId:".concat(String.valueOf(tileTag)));
            C114110qj a = this.f342029j.f340878H.mo172732a(tileTag);
            if (a != null) {
                C113889km.m157550c(C0949kl.f2232b, "onRequestDownload found TileOverlay");
                C113934lj d = a.mo172012d();
                d.mo172357a(this.f342027h);
                d.mo172360a(str, (C113932lh) new C114116qn(a.f341568p), lgVar.f340790c);
                C113896kq.m157673e(C0949kl.f2232b, "req-count");
                C113896kq.m157673e(C0949kl.f2232b, "R/" + mapTileID.getX() + "-" + mapTileID.getY() + "-" + mapTileID.getZ());
                return;
            }
        }
        this.f342026g.mo172359a(str, this.f342029j.f340913u.mo172558d());
    }

    /* renamed from: h */
    public final void mo172944h(final boolean z) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (0 != C114216sq.this.f342024e) {
                    C114216sq.this.f342023d.nativeSetNeedDisplay(C114216sq.this.f342024e, z);
                }
            }
        });
    }

    /* renamed from: j */
    public final void mo172946j(final boolean z) {
        if (this.f342024e != 0) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSwitchEngineForeGround(C114216sq.this.f342024e, z);
                    }
                }
            });
        }
    }

    /* renamed from: k */
    public final void mo172948k(final boolean z) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeEnablePOI(C114216sq.this.f342024e, z);
                }
            }
        });
    }

    /* renamed from: e */
    private void m159805e(final C114105qf qfVar) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                C114105qf.C114106a aVar;
                C114105qf qfVar = qfVar;
                int i = qfVar.f341513r;
                if (i != -1 && (aVar = qfVar.f341514s) != null) {
                    C114216sq.this.f342023d.nativeSetTurnArrow(C114216sq.this.f342024e, (long) i, qfVar.f341508a.f340271m, aVar.f341522a, aVar.f341523b);
                }
            }
        });
    }

    /* renamed from: h */
    private void m159819h(final String str) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeMapLoadKMLFile(C114216sq.this.f342024e, str);
                }
            }
        });
    }

    /* renamed from: k */
    private int m159829k(final String str) {
        return ((Integer) mo172900a(new CallbackRunnable<Integer>() {
            /* renamed from: a */
            private Integer m160062a() {
                if (C114216sq.this.f342024e == 0) {
                    return -1;
                }
                return Integer.valueOf(C114216sq.this.f342023d.getIndoorOutlineZoom(C114216sq.this.f342024e, str));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return -1;
                }
                return Integer.valueOf(C114216sq.this.f342023d.getIndoorOutlineZoom(C114216sq.this.f342024e, str));
            }
        }, -1)).intValue();
    }

    /* renamed from: c */
    public final void mo172936c(final boolean z) {
        if (this.f342024e != 0 && this.f342029j != null) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeIndoorBuildingEnabled(C114216sq.this.f342024e, z);
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo172938d(final boolean z) {
        if (0 != this.f342024e && this.f342029j != null) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetIndoorBuildingStyle(C114216sq.this.f342024e, z ? 1 : 0);
                    }
                }
            });
        }
    }

    /* renamed from: f */
    public final void mo172942f(final boolean z) {
        if (0 != this.f342024e) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetLocationCompassMarkerHidden(C114216sq.this.f342024e, z);
                    }
                }
            });
        }
    }

    /* renamed from: g */
    public final void mo172943g(final boolean z) {
        if (0 != this.f342024e) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetLocationRedLineHidden(C114216sq.this.f342024e, z);
                    }
                }
            });
        }
    }

    /* renamed from: h */
    private String[] m159820h(final long j) {
        return (String[]) mo172924b(new CallbackRunnable<String[]>() {
            /* renamed from: a */
            private String[] m160108a() {
                return C114216sq.this.f342024e == 0 ? new String[0] : C114216sq.this.f342023d.nativeGetVariantNames(C114216sq.this.f342024e, j);
            }

            public final /* synthetic */ Object run() {
                return C114216sq.this.f342024e == 0 ? new String[0] : C114216sq.this.f342023d.nativeGetVariantNames(C114216sq.this.f342024e, j);
            }
        }, new String[0]);
    }

    /* renamed from: i */
    private int m159821i(final long j) {
        return ((Integer) mo172924b(new CallbackRunnable<Integer>() {
            /* renamed from: a */
            private Integer m160111a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeGetCurrentMaterialVariant(C114216sq.this.f342024e, j));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeGetCurrentMaterialVariant(C114216sq.this.f342024e, j));
            }
        }, 0)).intValue();
    }

    /* renamed from: j */
    private void m159828j(final String str) {
        if (this.f342024e != 0) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeMapSetSatelliteServerFullUrl(C114216sq.this.f342024e, str);
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo172940e(final boolean z) {
        if (0 != this.f342024e) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetLocationMarkerHidden(C114216sq.this.f342024e, z);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    private String m159790c(final GeoPoint geoPoint) {
        return (String) mo172900a(new CallbackRunnable<String>() {
            /* renamed from: a */
            private String m160003a() {
                if (0 == C114216sq.this.f342024e) {
                    return null;
                }
                return C114216sq.this.f342023d.nativeGetCurIndoorName(C114216sq.this.f342024e, geoPoint);
            }

            public final /* synthetic */ Object run() {
                if (0 == C114216sq.this.f342024e) {
                    return null;
                }
                return C114216sq.this.f342023d.nativeGetCurIndoorName(C114216sq.this.f342024e, geoPoint);
            }
        }, (Object) null);
    }

    /* renamed from: d */
    private void m159799d(final GeoPoint geoPoint) {
        this.f342029j.mo172432a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (0 != C114216sq.this.f342024e && C114216sq.this.f342029j != null) {
                    C114216sq.this.f342023d.nativeSetCenter(C114216sq.this.f342024e, geoPoint, false);
                }
            }
        });
    }

    /* renamed from: f */
    private void m159808f(final int i, final int i2) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeBringElementBelow(C114216sq.this.f342024e, i, i2);
                }
            }
        });
    }

    /* renamed from: g */
    public final void mo172581g() {
        C113961mq mqVar = this.f342029j;
        if (mqVar != null) {
            final C114367v vVar = mqVar.f340912t;
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    C114367v vVar = vVar;
                    if (vVar != null && vVar.f342796o != null) {
                        vVar.f342794m = vVar.f342797p.mo172953o();
                        int q = vVar.f342797p.mo172955q();
                        float p = vVar.f342797p.mo172954p();
                        C114367v.C114369a aVar = vVar.f342783b;
                        if (q != aVar.f342821q) {
                            vVar.f342796o.f340901i.mo171238c(C113744fy.f340316c);
                        } else if (p != aVar.f342820p) {
                            vVar.f342796o.f340901i.mo171238c(C113744fy.f340315b);
                        }
                        if (vVar.f342783b != null) {
                            float d = C114367v.m160533d(p);
                            if (d < vVar.mo173058a()) {
                                float f = C114367v.m160538f(d);
                                if (vVar.f342797p.mo172956r() > f) {
                                    vVar.mo173064b(f);
                                }
                            }
                            vVar.f342783b.mo173073a(q, p);
                        }
                        vVar.f342782a = vVar.f342797p.mo172959u();
                    }
                }
            });
        }
    }

    /* renamed from: h */
    public final void mo172578h() {
        List<C114016om> list;
        C113961mq mqVar = this.f342029j;
        if (mqVar != null && (list = mqVar.f340879I) != null && !list.isEmpty()) {
            for (C114016om h : mqVar.f340879I) {
                h.mo172578h();
            }
        }
    }

    /* renamed from: j */
    private void m159826j(final long j) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0 && j != 0) {
                    C114216sq.this.f342023d.nativeResetMonoColor(C114216sq.this.f342024e, j);
                }
            }
        });
    }

    /* renamed from: c */
    public final void mo172933c(final float f, final float f2) {
        C113961mq mqVar;
        if (0 != this.f342024e && (mqVar = this.f342029j) != null) {
            mqVar.mo172432a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeZoomIn(C114216sq.this.f342024e, f, f2);
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo172937d(final int i) {
        if (this.f342024e != 0 && this.f342029j != null) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeRemoveTileOverlay(C114216sq.this.f342024e, i);
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo172939e(final int i) {
        if (this.f342024e != 0 && this.f342029j != null) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeReloadTileOverlay(C114216sq.this.f342024e, i);
                    }
                }
            });
        }
    }

    /* renamed from: f */
    public final void mo172941f(final int i) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.removeLineText(C114216sq.this.f342024e, i);
                }
            }
        });
    }

    /* renamed from: f */
    private float[] m159811f(final long j) {
        return (float[]) mo172924b(new CallbackRunnable<float[]>() {
            /* renamed from: a */
            private float[] m160106a() {
                return C114216sq.this.f342024e == 0 ? new float[0] : C114216sq.this.f342023d.nativeGetGLModelSkeletonAnimationDuration(C114216sq.this.f342024e, j);
            }

            public final /* synthetic */ Object run() {
                return C114216sq.this.f342024e == 0 ? new float[0] : C114216sq.this.f342023d.nativeGetGLModelSkeletonAnimationDuration(C114216sq.this.f342024e, j);
            }
        }, new float[0]);
    }

    /* renamed from: i */
    public final void mo172579i() {
        List<C114016om> list;
        C113961mq mqVar = this.f342029j;
        if (mqVar != null && (list = mqVar.f340879I) != null && !list.isEmpty()) {
            for (C114016om i : mqVar.f340879I) {
                i.mo172579i();
            }
        }
    }

    /* renamed from: c */
    private void m159791c(final float f) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (0 != C114216sq.this.f342024e) {
                    C114216sq.this.f342023d.nativeSetRotate(C114216sq.this.f342024e, f, false);
                }
            }
        });
    }

    /* renamed from: d */
    private void m159798d(final long j) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0 && j != 0) {
                    C114216sq.this.f342023d.nativeStopGLModelSkeletonAnimation(C114216sq.this.f342024e, j);
                }
            }
        });
    }

    /* renamed from: e */
    private void m159804e(final int i, final int i2) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeBringElementAbove(C114216sq.this.f342024e, i, i2);
                }
            }
        });
    }

    /* renamed from: g */
    private void m159813g(final int i, final int i2) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeSetMarkerMainSubRelation(C114216sq.this.f342024e, i, i2);
                }
            }
        });
    }

    /* renamed from: d */
    private void m159796d(float f, float f2) {
        this.f342023d.scheduleClickOnNextRender(this.f342024e, f, f2);
    }

    /* renamed from: e */
    private int m159801e(final long j) {
        return ((Integer) mo172924b(new CallbackRunnable<Integer>() {
            /* renamed from: a */
            private Integer m160105a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeGetGLModelSkeletonAnimationCount(C114216sq.this.f342024e, j));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeGetGLModelSkeletonAnimationCount(C114216sq.this.f342024e, j));
            }
        }, 0)).intValue();
    }

    /* renamed from: g */
    private String[] m159816g(final long j) {
        return (String[]) mo172924b(new CallbackRunnable<String[]>() {
            /* renamed from: a */
            private String[] m160107a() {
                return C114216sq.this.f342024e == 0 ? new String[0] : C114216sq.this.f342023d.nativeGetGLModelSkeletonAnimationName(C114216sq.this.f342024e, j);
            }

            public final /* synthetic */ Object run() {
                return C114216sq.this.f342024e == 0 ? new String[0] : C114216sq.this.f342023d.nativeGetGLModelSkeletonAnimationName(C114216sq.this.f342024e, j);
            }
        }, new String[0]);
    }

    /* renamed from: c */
    public final void mo172934c(int i) {
        if (0 != this.f342024e) {
            this.f342023d.nativeSetMapStyle(this.f342024e, i, false);
        }
    }

    /* renamed from: d */
    private <T> T m159795d(CallbackRunnable<T> callbackRunnable, T t) {
        if (callbackRunnable == null || this.f342029j == null || this.f342024e == 0) {
            return t;
        }
        if (Thread.currentThread().getName().contains(C114342tg.f342673a)) {
            return mo172924b(callbackRunnable, t);
        }
        return m159803e(callbackRunnable, t);
    }

    /* renamed from: c */
    public final void mo171193c() {
        C114014ok okVar = this.f342028i;
        if (okVar != null) {
            okVar.mo171193c();
        }
    }

    /* renamed from: e */
    private <T> T m159803e(final CallbackRunnable<T> callbackRunnable, T t) {
        if (!(callbackRunnable == null || this.f342029j == null || this.f342024e == 0)) {
            this.f342029j.mo172432a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    callbackRunnable.run();
                }
            });
        }
        return t;
    }

    /* renamed from: c */
    public final void mo172935c(final long j) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeRemoveGLVisualizationOverlay(C114216sq.this.f342024e, j);
                }
            }
        });
    }

    /* renamed from: c */
    private <T> T m159789c(CallbackRunnable<T> callbackRunnable, T t) {
        if (this.f342029j == null || this.f342024e == 0) {
            return t;
        }
        try {
            if (this.f342029j == null) {
                return t;
            }
            if (this.f342024e == 0) {
                return t;
            }
            if (Thread.currentThread().getName().contains(C114342tg.f342673a)) {
                return mo172924b(callbackRunnable, t);
            }
            return m159803e(callbackRunnable, t);
        } catch (Exception e) {
            C113889km.m157546b(C0949kl.f2236f, "safeCallEngine", e);
            return t;
        }
    }

    /* renamed from: a */
    private int m159725a(final byte[] bArr, final int i) {
        return ((Integer) mo172900a(new CallbackRunnable<Integer>() {

            /* renamed from: c */
            public final /* synthetic */ boolean f342249c = true;

            /* renamed from: d */
            public final /* synthetic */ boolean f342250d = false;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Integer run() {
                synchronized (C114216sq.this.f342031l) {
                    if (C114216sq.this.f342024e == 0) {
                        return -1;
                    }
                    Integer valueOf = Integer.valueOf(C114216sq.this.f342023d.nativeRefreshTrafficData(C114216sq.this.f342024e, bArr, i, this.f342249c, this.f342250d));
                    return valueOf;
                }
            }
        }, -1)).intValue();
    }

    /* renamed from: a */
    private void m159744a(int i, int i2, int i3, int i4, int i5) {
        final int i6 = i;
        final int i7 = i2;
        final int i8 = i3;
        final int i9 = i4;
        final int i15 = i5;
        mo172930b((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeCheckTrafficBlockCache(C114216sq.this.f342024e, i6, i7, i8, i9, i15);
                }
            }
        });
    }

    /* renamed from: a */
    private int m159721a(final PolygonInfo polygonInfo) {
        return ((Integer) mo172900a(new CallbackRunnable<Integer>() {
            /* renamed from: a */
            private Integer m160073a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeAddPolygon(C114216sq.this.f342024e, polygonInfo));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeAddPolygon(C114216sq.this.f342024e, polygonInfo));
            }
        }, 0)).intValue();
    }

    /* renamed from: b */
    private void m159783b(final C114021ot otVar) {
        if (0 != this.f342024e) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        JNI c = C114216sq.this.f342023d;
                        long b = C114216sq.this.f342024e;
                        C114021ot otVar = otVar;
                        int i = otVar.f341002f;
                        String str = otVar.f341003g;
                        double d = otVar.f341005i;
                        double d2 = otVar.f341006j;
                        float f = otVar.f341009m;
                        float f2 = otVar.f341010n;
                        float f3 = otVar.f341017u;
                        float f4 = otVar.f341018v;
                        float f5 = otVar.f341016t;
                        float a = otVar.mo172582a();
                        C114021ot otVar2 = otVar;
                        c.nativeUpdateMarkerInfo(b, i, str, d, d2, f, f2, f3, f4, f5, a, otVar2.f341020x, otVar2.f341019w, otVar2.f341022z, otVar2.f340991A, otVar2.f340992B, otVar2.f340994D, otVar2.f340993C);
                    }
                }
            });
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m159786c(com.tencent.mapsdk.internal.C114105qf r13) {
        /*
            r12 = this;
            com.tencent.mapsdk.internal.fs r0 = r13.f341508a
            int r1 = r0.f340257C
            r2 = 1
            r3 = 0
            r4 = 3
            if (r1 != r4) goto L_0x000c
            r1 = 0
            r8 = 1
            goto L_0x000d
        L_0x000c:
            r8 = 0
        L_0x000d:
            int[] r4 = r13.f341510o
            r4 = r4[r3]
            r5 = 33
            if (r4 != r5) goto L_0x0018
            r1 = 2
            r7 = 2
            goto L_0x001f
        L_0x0018:
            r5 = 20
            r7 = r1
            if (r4 != r5) goto L_0x001f
            r9 = 1
            goto L_0x0020
        L_0x001f:
            r9 = 0
        L_0x0020:
            int[] r1 = new int[r3]
            java.util.List<java.lang.Integer> r0 = r0.f340266L
            if (r0 == 0) goto L_0x004c
            int r0 = r0.size()
            int[] r0 = new int[r0]
            r1 = 0
        L_0x002d:
            com.tencent.mapsdk.internal.fs r2 = r13.f341508a
            java.util.List<java.lang.Integer> r2 = r2.f340266L
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x004a
            com.tencent.mapsdk.internal.fs r2 = r13.f341508a
            java.util.List<java.lang.Integer> r2 = r2.f340266L
            java.lang.Object r2 = r2.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L_0x002d
        L_0x004a:
            r11 = r0
            goto L_0x004d
        L_0x004c:
            r11 = r1
        L_0x004d:
            int[] r0 = new int[r3]
            com.tencent.mapsdk.internal.fs r1 = r13.f341508a
            int[] r1 = r1.f340278t
            if (r1 == 0) goto L_0x0066
            int r0 = r1.length
            int[] r0 = new int[r0]
        L_0x0058:
            com.tencent.mapsdk.internal.fs r1 = r13.f341508a
            int[] r1 = r1.f340278t
            int r2 = r1.length
            if (r3 >= r2) goto L_0x0066
            r1 = r1[r3]
            r0[r3] = r1
            int r3 = r3 + 1
            goto L_0x0058
        L_0x0066:
            r10 = r0
            com.tencent.mapsdk.internal.sq$122 r0 = new com.tencent.mapsdk.internal.sq$122
            r4 = r0
            r5 = r12
            r6 = r13
            r4.<init>(r6, r7, r8, r9, r10, r11)
            r13 = -1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r13 = r12.m159789c(r0, r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114216sq.m159786c(com.tencent.mapsdk.internal.qf):int");
    }

    /* renamed from: a */
    private int m159719a(final CircleInfo circleInfo) {
        return ((Integer) mo172900a(new CallbackRunnable<Integer>() {
            /* renamed from: a */
            private Integer m160085a() {
                if (C114216sq.this.f342024e == 0 || circleInfo == null) {
                    return -1;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeAddCircle(C114216sq.this.f342024e, circleInfo));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0 || circleInfo == null) {
                    return -1;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeAddCircle(C114216sq.this.f342024e, circleInfo));
            }
        }, -1)).intValue();
    }

    /* renamed from: b */
    public final void mo172932b(final boolean z) {
        if (0 != this.f342024e) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetCompassVisible(C114216sq.this.f342024e, z);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private C114096qc m159777b(final GeoPoint geoPoint) {
        if (geoPoint == null) {
            geoPoint = new GeoPoint();
        }
        return (C114096qc) mo172900a(new CallbackRunnable<C114096qc>() {
            /* renamed from: a */
            private C114096qc m160000a() {
                if (0 == C114216sq.this.f342024e) {
                    return null;
                }
                return new C114096qc(C114216sq.this.f342023d.nativeGetActiveIndoorBuildingGUID(C114216sq.this.f342024e), C114216sq.this.f342023d.nativeGetCurIndoorName(C114216sq.this.f342024e, geoPoint), C114216sq.this.f342023d.nativeGetIndoorFloorNames(C114216sq.this.f342024e), C114216sq.this.f342023d.nativeGetIndoorCurrentFloorId(C114216sq.this.f342024e));
            }

            public final /* synthetic */ Object run() {
                if (0 == C114216sq.this.f342024e) {
                    return null;
                }
                return new C114096qc(C114216sq.this.f342023d.nativeGetActiveIndoorBuildingGUID(C114216sq.this.f342024e), C114216sq.this.f342023d.nativeGetCurIndoorName(C114216sq.this.f342024e, geoPoint), C114216sq.this.f342023d.nativeGetIndoorFloorNames(C114216sq.this.f342024e), C114216sq.this.f342023d.nativeGetIndoorCurrentFloorId(C114216sq.this.f342024e));
            }
        }, (Object) null);
    }

    /* renamed from: a */
    private void m159747a(final int i, final CircleInfo circleInfo) {
        if (this.f342024e != 0 && circleInfo != null) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    C114216sq.this.f342023d.nativeUpdateCircle(C114216sq.this.f342024e, i, circleInfo);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo172931b(final String str) {
        if (0 != this.f342024e) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetLocationCompassMarkerImage(C114216sq.this.f342024e, str);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m159745a(int i, int i2, boolean z, int[] iArr) {
        final int i3 = i;
        final int i4 = i2;
        final boolean z2 = z;
        final int[] iArr2 = iArr;
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0 && i3 >= 0 && C114216sq.this.f342029j != null) {
                    C114216sq.this.f342023d.nativeSetPolygonHidden(C114216sq.this.f342024e, i3, i4, z2, iArr2);
                }
            }
        });
    }

    /* renamed from: a */
    private void m159746a(final int i, final int i2, final int[] iArr) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0 && i >= 0 && C114216sq.this.f342029j != null) {
                    C114216sq.this.f342023d.nativeDeletePolygon(C114216sq.this.f342024e, i, i2, iArr);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo172926b(final float f, final float f2) {
        C113961mq mqVar;
        if (0 != this.f342024e && (mqVar = this.f342029j) != null) {
            mqVar.mo172432a((C113961mq.C113963a) new C113961mq.C113963a() {

                /* renamed from: c */
                public final /* synthetic */ boolean f342245c = false;

                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeMoveBy(C114216sq.this.f342024e, f, f2, this.f342245c);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private int m159720a(final MaskLayer maskLayer) {
        return ((Integer) mo172900a(new CallbackRunnable<Integer>() {
            /* renamed from: a */
            private Integer m159939a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeAddMaskLayer(C114216sq.this.f342024e, maskLayer));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeAddMaskLayer(C114216sq.this.f342024e, maskLayer));
            }
        }, 0)).intValue();
    }

    /* renamed from: b */
    private void m159779b(final int i, final int i2, final int i3) {
        if (0 != this.f342024e && this.f342029j != null) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetMarkerScaleLevelRange(C114216sq.this.f342024e, i, i2, i3);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private GeoPoint m159738a(final byte[] bArr, final float f, final float f2) {
        return (GeoPoint) mo172924b(new CallbackRunnable<GeoPoint>() {
            /* renamed from: a */
            private GeoPoint m159942a() {
                if (C114216sq.this.f342024e == 0) {
                    return new GeoPoint();
                }
                double[] dArr = new double[2];
                C114216sq.this.f342023d.nativeFromScreenLocation(C114216sq.this.f342024e, bArr, f, f2, dArr);
                return new GeoPoint((int) (dArr[1] * 1000000.0d), (int) (dArr[0] * 1000000.0d));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return new GeoPoint();
                }
                double[] dArr = new double[2];
                C114216sq.this.f342023d.nativeFromScreenLocation(C114216sq.this.f342024e, bArr, f, f2, dArr);
                return new GeoPoint((int) (dArr[1] * 1000000.0d), (int) (dArr[0] * 1000000.0d));
            }
        }, new GeoPoint());
    }

    /* renamed from: b */
    private void m159778b(final double d) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (0 != C114216sq.this.f342024e && C114216sq.this.f342029j != null) {
                    C114216sq.this.f342023d.nativeSetScale(C114216sq.this.f342024e, d, false);
                }
            }
        });
    }

    /* renamed from: a */
    public final PointF mo172898a(double d, double d2) {
        final double d3 = d;
        final double d4 = d2;
        return (PointF) mo172924b(new CallbackRunnable<PointF>() {

            /* renamed from: a */
            public final /* synthetic */ byte[] f342063a = null;

            /* renamed from: a */
            private PointF m159943a() {
                if (C114216sq.this.f342024e == 0) {
                    return new PointF();
                }
                float[] fArr = new float[2];
                C114216sq.this.f342023d.nativeToScreenLocation(C114216sq.this.f342024e, this.f342063a, d3, d4, fArr);
                return new PointF(fArr[0], fArr[1]);
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return new PointF();
                }
                float[] fArr = new float[2];
                C114216sq.this.f342023d.nativeToScreenLocation(C114216sq.this.f342024e, this.f342063a, d3, d4, fArr);
                return new PointF(fArr[0], fArr[1]);
            }
        }, new PointF());
    }

    /* renamed from: b */
    public final void mo172927b(final int i) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (0 != C114216sq.this.f342024e) {
                    C114216sq.this.f342023d.nativeSetMinScaleLevel(C114216sq.this.f342024e, i);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo172920a(final boolean z) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeSetSatelliteEnabled(C114216sq.this.f342024e, z);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo172925b(final float f) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (0 != C114216sq.this.f342024e) {
                    C114216sq.this.f342023d.nativeSetSkew(C114216sq.this.f342024e, f, false);
                }
            }
        });
    }

    /* renamed from: a */
    public final String mo172901a(final GeoPoint geoPoint) {
        return (String) mo172900a(new CallbackRunnable<String>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public String run() {
                byte[] nativeGetCityName;
                if (!(C114216sq.this.f342024e == 0 || (nativeGetCityName = C114216sq.this.f342023d.nativeGetCityName(C114216sq.this.f342024e, geoPoint)) == null)) {
                    try {
                        return new String(nativeGetCityName, "GBK").trim();
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return "";
            }
        }, "");
    }

    /* renamed from: b */
    public final void mo172928b(final int i, final int i2) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeSetTileOverlayPriority(C114216sq.this.f342024e, i, i2);
                }
            }
        });
    }

    /* renamed from: a */
    private int m159723a(final C114105qf qfVar) {
        return ((Integer) mo172900a(new CallbackRunnable<Integer>() {
            /* renamed from: a */
            private Integer m159956a() {
                C114105qf qfVar = qfVar;
                if (qfVar == null) {
                    return -1;
                }
                int i = qfVar.f341513r;
                return i != -1 ? Integer.valueOf(i) : Integer.valueOf(C114216sq.m159724a(C114216sq.this, qfVar));
            }

            public final /* synthetic */ Object run() {
                C114105qf qfVar = qfVar;
                if (qfVar == null) {
                    return -1;
                }
                int i = qfVar.f341513r;
                return i != -1 ? Integer.valueOf(i) : Integer.valueOf(C114216sq.m159724a(C114216sq.this, qfVar));
            }
        }, -1)).intValue();
    }

    /* renamed from: b */
    private void m159780b(int i, int i2, int i3, int i4) {
        final int i5 = i2;
        final int i6 = i;
        final int i7 = i3;
        final int i8 = i4;
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeSetTrafficColor(C114216sq.this.f342024e, i5, i6, i7, i8);
                }
            }
        });
    }

    /* renamed from: b */
    public final String mo171846b() {
        return (String) mo172900a(new CallbackRunnable<String>() {
            /* renamed from: a */
            private String m160071a() {
                return C114216sq.this.f342024e == 0 ? "" : C114216sq.this.f342023d.nativeGetEngineLogInfo(C114216sq.this.f342024e);
            }

            public final /* synthetic */ Object run() {
                return C114216sq.this.f342024e == 0 ? "" : C114216sq.this.f342023d.nativeGetEngineLogInfo(C114216sq.this.f342024e);
            }
        }, "");
    }

    /* renamed from: b */
    public final void mo172929b(final long j) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeRemoveEngineOverlay(j);
                }
            }
        });
    }

    /* renamed from: a */
    private void m159749a(final int i, final boolean z) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (i != -1) {
                    C114216sq.this.f342023d.nativeDeleteLine(C114216sq.this.f342024e, (long) i, z);
                }
            }
        });
    }

    /* renamed from: b */
    private void m159785b(final List<IndoorCellInfo> list) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeSetIndoorCellInfo(C114216sq.this.f342024e, list);
                }
            }
        });
    }

    /* renamed from: a */
    private boolean m159771a(final int i, final float f, final float f2) {
        if (i == -1) {
            return false;
        }
        return ((Boolean) mo172900a(new CallbackRunnable<Boolean>() {
            /* renamed from: a */
            private Boolean m159962a() {
                return Boolean.valueOf(C114216sq.this.f342023d.nativeOnTapLine((long) i, f, f2));
            }

            public final /* synthetic */ Object run() {
                return Boolean.valueOf(C114216sq.this.f342023d.nativeOnTapLine((long) i, f, f2));
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: b */
    public final void mo172930b(final C113961mq.C113963a aVar) {
        if (this.f342029j != null && this.f342024e != 0) {
            mo172900a(new CallbackRunnable<Object>() {
                public final Object run() {
                    aVar.mo54067a((GL10) null);
                    return null;
                }
            }, (Object) null);
        }
    }

    /* renamed from: a */
    public final TappedElement mo172899a(final float f, final float f2) {
        return (TappedElement) mo172900a(new CallbackRunnable<TappedElement>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public TappedElement run() {
                byte[] nativeOnTap;
                if (C114216sq.this.f342024e == 0 || (nativeOnTap = C114216sq.this.f342023d.nativeOnTap(C114216sq.this.f342024e, f, f2)) == null) {
                    return null;
                }
                try {
                    return TappedElement.fromBytes(nativeOnTap);
                } catch (Exception unused) {
                    return null;
                }
            }
        }, (Object) null);
    }

    /* renamed from: a */
    public final void mo172918a(final List<LatLngBounds> list) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (0 == C114216sq.this.f342024e) {
                    return;
                }
                if (list == null) {
                    C114216sq.this.f342023d.nativeSetBuildingBlackList(C114216sq.this.f342024e, (LatLngBounds[]) null);
                } else {
                    C114216sq.this.f342023d.nativeSetBuildingBlackList(C114216sq.this.f342024e, (LatLngBounds[]) list.toArray(new LatLngBounds[0]));
                }
            }
        });
    }

    /* renamed from: b */
    public final <T> T mo172924b(CallbackRunnable<T> callbackRunnable, T t) {
        return (callbackRunnable == null || this.f342029j == null || this.f342024e == 0) ? t : callbackRunnable.run();
    }

    /* renamed from: a */
    public final void mo172911a(GeoPoint geoPoint, float f, float f2, boolean z) {
        if (0 != this.f342024e && this.f342029j != null) {
            final GeoPoint geoPoint2 = geoPoint;
            final float f3 = f;
            final float f4 = f2;
            final boolean z2 = z;
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetLocationInfo(C114216sq.this.f342024e, ((double) geoPoint2.getLatitudeE6()) / 1000000.0d, ((double) geoPoint2.getLongitudeE6()) / 1000000.0d, f3, f4, z2);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m159767a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (0 != this.f342024e && this.f342029j != null) {
            final boolean z5 = z;
            final boolean z6 = z2;
            final boolean z7 = z3;
            final boolean z8 = z4;
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetLocationFollow(C114216sq.this.f342024e, z5, z6, z7, z8);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo172902a(final float f) {
        if (0 != this.f342024e && this.f342029j != null) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetLocationHeading(C114216sq.this.f342024e, f);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo172576a(String str, C113931lg lgVar) {
        DataSource dataSource = DataSource.get(lgVar.f340789b);
        C113889km.m157545b(C0949kl.f2232b, "onCancelDownload DataSource:" + dataSource + " uri:" + str);
        if (dataSource == DataSource.TILE_OVERLAY) {
            MapTileID mapTileID = (MapTileID) lgVar.f340791d;
            int tileTag = mapTileID.getTileTag();
            C113889km.m157545b(C0949kl.f2232b, "onCancelDownload tileOverlayId:".concat(String.valueOf(tileTag)));
            C114110qj a = this.f342029j.f340878H.mo172732a(tileTag);
            if (a != null) {
                C113889km.m157550c(C0949kl.f2232b, "onCancelDownload found TileOverlay");
                a.mo172012d().mo172358a(str);
                C113896kq.m157673e(C0949kl.f2232b, "cancel-count");
                C113896kq.m157673e(C0949kl.f2232b, "C/" + mapTileID.getX() + "-" + mapTileID.getY() + "-" + mapTileID.getZ());
                return;
            }
        }
        this.f342026g.mo172358a(str);
    }

    /* renamed from: a */
    private int m159722a(final C114021ot otVar) {
        return ((Integer) mo172900a(new CallbackRunnable<Integer>() {
            /* renamed from: a */
            private Integer m159981a() {
                if (0 == C114216sq.this.f342024e) {
                    return 0;
                }
                JNI c = C114216sq.this.f342023d;
                long b = C114216sq.this.f342024e;
                C114021ot otVar = otVar;
                String str = otVar.f341003g;
                double d = otVar.f341005i;
                double d2 = otVar.f341006j;
                float f = otVar.f341009m;
                float f2 = otVar.f341010n;
                float f3 = otVar.f341017u;
                float f4 = otVar.f341018v;
                float f5 = otVar.f341016t;
                float a = otVar.mo172582a();
                C114021ot otVar2 = otVar;
                return Integer.valueOf(c.nativeAddMarker(b, str, d, d2, f, f2, f3, f4, f5, a, otVar2.f341020x, otVar2.f341019w, otVar2.f341022z, otVar2.f340991A, otVar2.f340992B, otVar2.f340994D, otVar2.f340993C));
            }

            public final /* synthetic */ Object run() {
                if (0 == C114216sq.this.f342024e) {
                    return 0;
                }
                JNI c = C114216sq.this.f342023d;
                long b = C114216sq.this.f342024e;
                C114021ot otVar = otVar;
                String str = otVar.f341003g;
                double d = otVar.f341005i;
                double d2 = otVar.f341006j;
                float f = otVar.f341009m;
                float f2 = otVar.f341010n;
                float f3 = otVar.f341017u;
                float f4 = otVar.f341018v;
                float f5 = otVar.f341016t;
                float a = otVar.mo172582a();
                C114021ot otVar2 = otVar;
                return Integer.valueOf(c.nativeAddMarker(b, str, d, d2, f, f2, f3, f4, f5, a, otVar2.f341020x, otVar2.f341019w, otVar2.f341022z, otVar2.f340991A, otVar2.f340992B, otVar2.f340994D, otVar2.f340993C));
            }
        }, 0)).intValue();
    }

    /* renamed from: a */
    public final void mo172922a(final int[] iArr, final int i) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (0 != C114216sq.this.f342024e) {
                    C114216sq.this.f342023d.nativeDeleteIcons(C114216sq.this.f342024e, iArr, i);
                }
            }
        });
    }

    /* renamed from: a */
    private void m159769a(final int[] iArr, final int i, final boolean z) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (0 != C114216sq.this.f342024e) {
                    C114216sq.this.f342023d.nativeSetIconsHidden(C114216sq.this.f342024e, iArr, i, z);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo172907a(final int i, final int i2) {
        if (0 != this.f342024e) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetCompassPosition(C114216sq.this.f342024e, i, i2);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final double mo172894a(final Rect rect, final Rect rect2) {
        return ((Double) mo172900a(new CallbackRunnable<Double>() {
            /* renamed from: a */
            private Double m159990a() {
                return 0 == C114216sq.this.f342024e ? Double.valueOf(1.0d) : Double.valueOf(C114216sq.this.f342023d.nativeGetTargetScale(C114216sq.this.f342024e, rect, rect2));
            }

            public final /* synthetic */ Object run() {
                return 0 == C114216sq.this.f342024e ? Double.valueOf(1.0d) : Double.valueOf(C114216sq.this.f342023d.nativeGetTargetScale(C114216sq.this.f342024e, rect, rect2));
            }
        }, Double.valueOf(1.0d))).doubleValue();
    }

    /* renamed from: a */
    public final void mo172910a(final Rect rect, final Rect rect2, final boolean z) {
        if (0 != this.f342024e && this.f342029j != null) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeZoomToSpan(C114216sq.this.f342024e, rect, rect2, z);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m159743a(float f, float f2, float f3, float f4) {
        if (0 != this.f342024e) {
            final float f5 = f;
            final float f6 = f2;
            final float f7 = f3;
            final float f8 = f4;
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetIndoorActiveScreenArea(C114216sq.this.f342024e, f5, f6, f7, f8);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m159770a(final String[] strArr) {
        if (this.f342024e != 0) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetShowIndoorBuildingWhiteList(C114216sq.this.f342024e, strArr);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final int mo172897a(final String str, final float f, final float f2) {
        if (0 == this.f342024e) {
            return 0;
        }
        return ((Integer) mo172900a(new CallbackRunnable<Integer>() {
            /* renamed from: a */
            private Integer m160009a() {
                if (0 == C114216sq.this.f342024e) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeSetLocationMarkerImage(C114216sq.this.f342024e, str, f, f2));
            }

            public final /* synthetic */ Object run() {
                if (0 == C114216sq.this.f342024e) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeSetLocationMarkerImage(C114216sq.this.f342024e, str, f, f2));
            }
        }, 0)).intValue();
    }

    /* renamed from: a */
    public final void mo172917a(String str, String str2, String str3, String str4, String str5) {
        if (0 != this.f342024e) {
            final String str6 = str;
            final String str7 = str2;
            final String str8 = str3;
            final String str9 = str4;
            final String str10 = str5;
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetLocationCompassGroupImages(C114216sq.this.f342024e, str6, str7, str8, str9, str10);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo172904a(final float f, final int i, final LatLng latLng) {
        if (0 != this.f342024e) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetLocationRedLineInfo(C114216sq.this.f342024e, f, i, latLng);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo172913a(final GeoPoint geoPoint, final boolean z) {
        C113961mq mqVar;
        if (0 != this.f342024e && (mqVar = this.f342029j) != null) {
            mqVar.mo172432a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetCenter(C114216sq.this.f342024e, geoPoint, z);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo172912a(final GeoPoint geoPoint, final int i) {
        C113961mq mqVar;
        if (0 != this.f342024e && (mqVar = this.f342029j) != null) {
            mqVar.mo172432a((C113961mq.C113963a) new C113961mq.C113963a() {

                /* renamed from: c */
                public final /* synthetic */ boolean f342261c = true;

                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetCenterMapPointAndScaleLevel(C114216sq.this.f342024e, geoPoint, i, this.f342261c);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m159742a(final double d) {
        C113961mq mqVar;
        if (0 != this.f342024e && (mqVar = this.f342029j) != null) {
            mqVar.mo172432a((C113961mq.C113963a) new C113961mq.C113963a() {

                /* renamed from: b */
                public final /* synthetic */ boolean f342265b = false;

                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetScale(C114216sq.this.f342024e, d, this.f342265b);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m159762a(GeoPoint geoPoint, RectF rectF, int i, int i2, boolean z) {
        C113961mq mqVar;
        if (0 != this.f342024e && (mqVar = this.f342029j) != null) {
            final RectF rectF2 = rectF;
            final GeoPoint geoPoint2 = geoPoint;
            final int i3 = i;
            final int i4 = i2;
            final boolean z2 = z;
            mqVar.mo172432a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        JNI c = C114216sq.this.f342023d;
                        long b = C114216sq.this.f342024e;
                        RectF rectF = rectF2;
                        c.nativeSetFlagOfZoomToSpanForLocation(b, rectF.top, rectF.left, rectF.bottom, rectF.right);
                        C114216sq.this.f342023d.nativeZoomToSpanForNavigation(C114216sq.this.f342024e, geoPoint2, i3, i4, z2);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo172903a(final float f, final float f2, final boolean z) {
        if (0 != this.f342024e && this.f342029j != null) {
            m159803e(new CallbackRunnable<Boolean>() {
                /* renamed from: a */
                private Boolean m160054a() {
                    if (C114216sq.this.f342024e == 0) {
                        return Boolean.FALSE;
                    }
                    if (z) {
                        C114216sq.this.f342023d.nativeSetScreenCenterOffset(C114216sq.this.f342024e, f, f2, true);
                    } else {
                        C113707es esVar = C114216sq.this.f342029j.f340906n;
                        C113732fo a = esVar.mo172027a(C114216sq.this.mo172953o());
                        C114216sq.this.f342023d.nativeSetScreenCenterOffset(C114216sq.this.f342024e, f, f2, false);
                        C113732fo a2 = esVar.mo172027a(C114216sq.this.mo172953o());
                        double d = a2.f340215a;
                        double d2 = a2.f340216b;
                        C114216sq.this.f342023d.nativeSetCenter(C114216sq.this.f342024e, esVar.mo172025a(new C113732fo(d + (d - a.f340215a), d2 + (d2 - a.f340216b))), false);
                    }
                    return Boolean.TRUE;
                }

                public final /* synthetic */ Object run() {
                    if (C114216sq.this.f342024e == 0) {
                        return Boolean.FALSE;
                    }
                    if (z) {
                        C114216sq.this.f342023d.nativeSetScreenCenterOffset(C114216sq.this.f342024e, f, f2, true);
                    } else {
                        C113707es esVar = C114216sq.this.f342029j.f340906n;
                        C113732fo a = esVar.mo172027a(C114216sq.this.mo172953o());
                        C114216sq.this.f342023d.nativeSetScreenCenterOffset(C114216sq.this.f342024e, f, f2, false);
                        C113732fo a2 = esVar.mo172027a(C114216sq.this.mo172953o());
                        double d = a2.f340215a;
                        double d2 = a2.f340216b;
                        C114216sq.this.f342023d.nativeSetCenter(C114216sq.this.f342024e, esVar.mo172025a(new C113732fo(d + (d - a.f340215a), d2 + (d2 - a.f340216b))), false);
                    }
                    return Boolean.TRUE;
                }
            }, Boolean.FALSE);
        }
    }

    /* renamed from: a */
    public final void mo172909a(int i, int i2, int i3, int i4) {
        if (0 != this.f342024e && this.f342029j != null) {
            final int i5 = i;
            final int i6 = i2;
            final int i7 = i3;
            final int i8 = i4;
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetViewport(C114216sq.this.f342024e, i5, i6, i7, i8);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo172905a(final int i) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (0 != C114216sq.this.f342024e) {
                    C114216sq.this.f342023d.nativeSetMaxScaleLevel(C114216sq.this.f342024e, i);
                }
            }
        });
    }

    /* renamed from: a */
    public final int mo172896a(final TileOverlayCallback tileOverlayCallback, final boolean z) {
        return ((Integer) mo172900a(new CallbackRunnable<Integer>() {
            /* renamed from: a */
            private Integer m159977a() {
                if (C114216sq.this.f342024e == 0) {
                    return -1;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeAddTileOverlay(C114216sq.this.f342024e, tileOverlayCallback, z));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return -1;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeAddTileOverlay(C114216sq.this.f342024e, tileOverlayCallback, z));
            }
        }, -1)).intValue();
    }

    /* renamed from: a */
    public final void mo172908a(final int i, final int i2, final int i3) {
        if (this.f342024e != 0 && this.f342029j != null) {
            mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetTileOverlayDataLevelRange(C114216sq.this.f342024e, i, i2, i3);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m159765a(C114015ol olVar) {
        this.f342023d.setMapCallbackGetGLContext(olVar);
    }

    /* renamed from: a */
    public final void mo172906a(final int i, final float f) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeSetPriority(C114216sq.this.f342024e, i, f);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo172919a(final List<MapRouteSection> list, final List<GeoPoint> list2) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                List list;
                List list2;
                if (0 != C114216sq.this.f342024e && (list = list) != null && !list.isEmpty() && (list2 = list2) != null && !list2.isEmpty()) {
                    int size = list.size();
                    byte[][] bArr = new byte[size][];
                    for (int i = 0; i < size; i++) {
                        MapRouteSection mapRouteSection = (MapRouteSection) list.get(i);
                        if (mapRouteSection != null) {
                            bArr[i] = mapRouteSection.toBytes();
                        }
                    }
                    int size2 = list2.size();
                    C114216sq.this.f342023d.nativeAddRouteNameSegments(C114216sq.this.f342024e, bArr, size, (GeoPoint[]) list2.toArray(new GeoPoint[size2]), size2);
                }
            }
        });
    }

    /* renamed from: a */
    private AnnocationTextResult m159737a(final AnnocationText annocationText) {
        return (AnnocationTextResult) mo172900a(new CallbackRunnable<AnnocationTextResult>() {
            /* renamed from: a */
            private AnnocationTextResult m160042a() {
                if (0 == C114216sq.this.f342024e) {
                    return null;
                }
                return C114216sq.this.f342023d.nativeCreateAnnotationTextBitmap(C114216sq.this.f342024e, annocationText);
            }

            public final /* synthetic */ Object run() {
                if (0 == C114216sq.this.f342024e) {
                    return null;
                }
                return C114216sq.this.f342023d.nativeCreateAnnotationTextBitmap(C114216sq.this.f342024e, annocationText);
            }
        }, (Object) null);
    }

    /* renamed from: a */
    private List<Integer> m159741a(final Rect rect, final int i) {
        return (List) mo172900a(new CallbackRunnable<List<Integer>>() {
            /* renamed from: a */
            private List<Integer> m160044a() {
                ArrayList arrayList = null;
                if (0 == C114216sq.this.f342024e) {
                    return null;
                }
                int[] iArr = new int[100];
                int nativeQueryCityCodeList = C114216sq.this.f342023d.nativeQueryCityCodeList(C114216sq.this.f342024e, rect, i, iArr, 100);
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
                int nativeQueryCityCodeList = C114216sq.this.f342023d.nativeQueryCityCodeList(C114216sq.this.f342024e, rect, i, iArr, 100);
                if (nativeQueryCityCodeList <= 0) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(nativeQueryCityCodeList);
                for (int i = 0; i < nativeQueryCityCodeList; i++) {
                    arrayList.add(Integer.valueOf(iArr[i]));
                }
                return arrayList;
            }
        }, (Object) null);
    }

    /* renamed from: a */
    private void m159766a(final String str, final String str2, final String str3) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeResetEnginePath(C114216sq.this.f342024e, str, str2, str3);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo172916a(final String str, final String str2) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeSetBuildingToSpecificFloor(C114216sq.this.f342024e, str, str2);
                    if (C114216sq.this.f342028i != null) {
                        C114216sq.this.f342028i.mo171193c();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo172921a(final double[] dArr, final double[] dArr2, final int i) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.setRestrictBounds(C114216sq.this.f342024e, dArr, dArr2, i);
                }
            }
        });
    }

    /* renamed from: a */
    private int m159726a(final GeoPoint[] geoPointArr, final PolylineOptions.Text text) {
        return ((Integer) mo172900a(new CallbackRunnable<Integer>() {
            /* renamed from: a */
            private Integer m160068a() {
                if (C114216sq.this.f342024e == 0) {
                    return -1;
                }
                return Integer.valueOf(C114216sq.this.f342023d.addLineText(C114216sq.this.f342024e, geoPointArr, text));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return -1;
                }
                return Integer.valueOf(C114216sq.this.f342023d.addLineText(C114216sq.this.f342024e, geoPointArr, text));
            }
        }, -1)).intValue();
    }

    /* renamed from: a */
    private void m159748a(final int i, final PolylineOptions.Text text) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.setLineTextStyle(C114216sq.this.f342024e, i, text);
                }
            }
        });
    }

    /* renamed from: a */
    private long m159733a(final MarkerInfo markerInfo) {
        return ((Long) mo172900a(new CallbackRunnable<Long>() {
            /* renamed from: a */
            private Long m160072a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddMarker2(C114216sq.this.f342024e, markerInfo));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddMarker2(C114216sq.this.f342024e, markerInfo));
            }
        }, 0L)).longValue();
    }

    /* renamed from: a */
    public final int mo172895a(final long j) {
        return ((Integer) mo172900a(new CallbackRunnable<Integer>() {
            /* renamed from: a */
            private Integer m160074a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeGetEngineId(j));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0;
                }
                return Integer.valueOf(C114216sq.this.f342023d.nativeGetEngineId(j));
            }
        }, 0)).intValue();
    }

    /* renamed from: a */
    private void m159759a(final long j, final MarkerInfo markerInfo) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeUpdateMarker(j, markerInfo);
                }
            }
        });
    }

    /* renamed from: a */
    private long m159727a(final AggregationOverlayInfo aggregationOverlayInfo) {
        return ((Long) mo172900a(new CallbackRunnable<Long>() {
            /* renamed from: a */
            private Long m160080a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddAggregatioinOverlay(C114216sq.this.f342024e, aggregationOverlayInfo));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddAggregatioinOverlay(C114216sq.this.f342024e, aggregationOverlayInfo));
            }
        }, 0L)).longValue();
    }

    /* renamed from: a */
    private void m159753a(final long j, final AggregationOverlayInfo aggregationOverlayInfo) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeUpdateAggregatioinOverlay(C114216sq.this.f342024e, j, aggregationOverlayInfo);
                }
            }
        });
    }

    /* renamed from: a */
    private long m159731a(final HeatmapInfo heatmapInfo) {
        return ((Long) mo172900a(new CallbackRunnable<Long>() {
            /* renamed from: a */
            private Long m160082a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddHeatmapOverlay(C114216sq.this.f342024e, heatmapInfo));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddHeatmapOverlay(C114216sq.this.f342024e, heatmapInfo));
            }
        }, 0L)).longValue();
    }

    /* renamed from: a */
    private void m159757a(final long j, final HeatmapInfo heatmapInfo) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeUpdateHeatmapOverlay(C114216sq.this.f342024e, j, heatmapInfo);
                }
            }
        });
    }

    /* renamed from: a */
    private VectorHeatAggregationUnit m159739a(final long j, final LatLng latLng) {
        return (VectorHeatAggregationUnit) mo172900a(new CallbackRunnable<VectorHeatAggregationUnit>() {
            /* renamed from: a */
            private VectorHeatAggregationUnit m160086a() {
                if (C114216sq.this.f342024e == 0) {
                    return null;
                }
                return C114216sq.this.f342023d.getAggregationUnit(C114216sq.this.f342024e, j, latLng);
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return null;
                }
                return C114216sq.this.f342023d.getAggregationUnit(C114216sq.this.f342024e, j, latLng);
            }
        }, (Object) null);
    }

    /* renamed from: a */
    private long m159728a(final ArcLineOverlayInfo arcLineOverlayInfo) {
        return ((Long) mo172900a(new CallbackRunnable<Long>() {
            /* renamed from: a */
            private Long m160088a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddArcLineOverlay(C114216sq.this.f342024e, arcLineOverlayInfo));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddArcLineOverlay(C114216sq.this.f342024e, arcLineOverlayInfo));
            }
        }, 0L)).longValue();
    }

    /* renamed from: a */
    private void m159754a(final long j, final ArcLineOverlayInfo arcLineOverlayInfo) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeUpdateArcLineOverlay(C114216sq.this.f342024e, j, arcLineOverlayInfo);
                }
            }
        });
    }

    /* renamed from: a */
    private long m159734a(final ScatterPlotInfo scatterPlotInfo) {
        return ((Long) mo172900a(new CallbackRunnable<Long>() {
            /* renamed from: a */
            private Long m160090a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddScatterOverlay(C114216sq.this.f342024e, scatterPlotInfo));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddScatterOverlay(C114216sq.this.f342024e, scatterPlotInfo));
            }
        }, 0L)).longValue();
    }

    /* renamed from: a */
    private void m159760a(final long j, final ScatterPlotInfo scatterPlotInfo) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeUpdateScatterPlotOverlay(C114216sq.this.f342024e, j, scatterPlotInfo);
                }
            }
        });
    }

    /* renamed from: a */
    private long m159735a(final TrailOverlayInfo trailOverlayInfo) {
        return ((Long) mo172900a(new CallbackRunnable<Long>() {
            /* renamed from: a */
            private Long m160092a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddTrailOverlay(C114216sq.this.f342024e, trailOverlayInfo));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddTrailOverlay(C114216sq.this.f342024e, trailOverlayInfo));
            }
        }, 0L)).longValue();
    }

    /* renamed from: a */
    private void m159761a(final long j, final TrailOverlayInfo trailOverlayInfo) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeUpdateTrailOverlay(C114216sq.this.f342024e, j, trailOverlayInfo);
                }
            }
        });
    }

    /* renamed from: a */
    private long m159730a(final GroundOverlayInfo groundOverlayInfo) {
        return ((Long) mo172900a(new CallbackRunnable<Long>() {
            /* renamed from: a */
            private Long m160095a() {
                GroundOverlayInfo groundOverlayInfo;
                if (C114216sq.this.f342024e == 0 || (groundOverlayInfo = groundOverlayInfo) == null || !groundOverlayInfo.checkValid()) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddGroundOverlay(C114216sq.this.f342024e, groundOverlayInfo));
            }

            public final /* synthetic */ Object run() {
                GroundOverlayInfo groundOverlayInfo;
                if (C114216sq.this.f342024e == 0 || (groundOverlayInfo = groundOverlayInfo) == null || !groundOverlayInfo.checkValid()) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddGroundOverlay(C114216sq.this.f342024e, groundOverlayInfo));
            }
        }, 0L)).longValue();
    }

    /* renamed from: a */
    private void m159756a(final long j, final GroundOverlayInfo groundOverlayInfo) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0 && j != 0) {
                    C114216sq.this.f342023d.nativeUpdateGroundOverlay(C114216sq.this.f342024e, j, groundOverlayInfo);
                }
            }
        });
    }

    /* renamed from: a */
    private long m159732a(final IntersectionOverlayInfo intersectionOverlayInfo) {
        return ((Long) mo172900a(new CallbackRunnable<Long>() {
            /* renamed from: a */
            private Long m160099a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddIntersectionOverlay(C114216sq.this.f342024e, intersectionOverlayInfo));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddIntersectionOverlay(C114216sq.this.f342024e, intersectionOverlayInfo));
            }
        }, 0L)).longValue();
    }

    /* renamed from: a */
    private void m159758a(final long j, final IntersectionOverlayInfo intersectionOverlayInfo) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0 && j != 0) {
                    C114216sq.this.f342023d.nativeUpdateIntersectionOverlay(j, intersectionOverlayInfo);
                }
            }
        });
    }

    /* renamed from: a */
    private long m159729a(final GLModelInfo gLModelInfo) {
        return ((Long) mo172900a(new CallbackRunnable<Long>() {
            /* renamed from: a */
            private Long m160101a() {
                if (C114216sq.this.f342024e == 0) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddGLModel(C114216sq.this.f342024e, gLModelInfo));
            }

            public final /* synthetic */ Object run() {
                if (C114216sq.this.f342024e == 0) {
                    return 0L;
                }
                return Long.valueOf(C114216sq.this.f342023d.nativeAddGLModel(C114216sq.this.f342024e, gLModelInfo));
            }
        }, 0L)).longValue();
    }

    /* renamed from: a */
    private void m159755a(final long j, final GLModelInfo gLModelInfo) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0 && j != 0) {
                    C114216sq.this.f342023d.nativeUpdateGLModel(C114216sq.this.f342024e, j, gLModelInfo);
                }
            }
        });
    }

    /* renamed from: a */
    private void m159752a(long j, int i, float f, boolean z) {
        final long j2 = j;
        final int i2 = i;
        final float f2 = f;
        final boolean z2 = z;
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0 && j2 != 0) {
                    C114216sq.this.f342023d.nativeStartGLModelSkeletonAnimation(C114216sq.this.f342024e, j2, i2, f2, z2);
                }
            }
        });
    }

    /* renamed from: a */
    private void m159751a(final long j, final int i) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0 && j != 0) {
                    C114216sq.this.f342023d.nativeSetMaterialVariant(C114216sq.this.f342024e, j, i);
                }
            }
        });
    }

    /* renamed from: a */
    private void m159750a(long j, float f, float f2, float f3) {
        final long j2 = j;
        final float f4 = f;
        final float f5 = f2;
        final float f6 = f3;
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0 && j2 != 0) {
                    C114216sq.this.f342023d.nativeSetMonoColor(C114216sq.this.f342024e, j2, f4, f5, f6);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo172915a(final TrafficStyle trafficStyle) {
        mo172914a((C113961mq.C113963a) new C113961mq.C113963a() {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.setTrafficStyle(C114216sq.this.f342024e, trafficStyle);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo171845a(String str) {
        this.f342034z = str;
    }

    /* renamed from: a */
    public final String mo171844a() {
        String str = this.f342034z;
        this.f342034z = null;
        return str;
    }

    /* renamed from: a */
    public final void mo172574a(float f, float f2, long j, String str, String str2) {
        Pair<VectorOverlay, TencentMap.IClickedObject> pair;
        TencentMap.OnVectorOverlayClickListener onVectorOverlayClickListener;
        float f3 = f;
        float f4 = f2;
        C113961mq mqVar = this.f342029j;
        if (mqVar != null) {
            if (j > 0) {
                LatLng fromScreenLocation = mqVar.f340906n.fromScreenLocation(new Point((int) f3, (int) f4));
                C113971mt mtVar = mqVar.f340903k.f339824i.get(C113983nd.class);
                if (mtVar != null) {
                    pair = mtVar.mo172484a(fromScreenLocation, j, str, str2);
                } else {
                    pair = new Pair<>((Object) null, (Object) null);
                }
                Object obj = pair.first;
                if (!(obj == null || (onVectorOverlayClickListener = mqVar.f340881K) == null)) {
                    onVectorOverlayClickListener.onClicked((VectorOverlay) obj, (TencentMap.IClickedObject) pair.second);
                }
            } else {
                mqVar.f340882L.mo172042b(f, f2);
            }
            mqVar.f340882L = null;
        }
    }

    /* renamed from: a */
    private static void m159768a(double[] dArr, double d, double d2) {
        for (int i = 0; i < 4; i++) {
            int i2 = i + 0;
            int i3 = i2 + 12;
            dArr[i3] = dArr[i3] + (dArr[i2] * d) + (dArr[i2 + 4] * d2) + (dArr[i2 + 8] * 0.0d);
        }
    }

    /* renamed from: a */
    public final void mo172914a(final C113961mq.C113963a aVar) {
        if (this.f342029j != null && this.f342024e != 0) {
            m159789c(new CallbackRunnable<Object>() {
                public final Object run() {
                    aVar.mo54067a((GL10) null);
                    return null;
                }
            }, (Object) null);
        }
    }

    /* renamed from: a */
    public final <T> T mo172900a(CallbackRunnable<T> callbackRunnable, T t) {
        if (this.f342029j == null || this.f342024e == 0) {
            return t;
        }
        try {
            return mo172924b(callbackRunnable, t);
        } catch (Exception e) {
            C113889km.m157546b(C0949kl.f2236f, "safeCallSyncEngine", e);
            return t;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ int m159724a(com.tencent.mapsdk.internal.C114216sq r12, com.tencent.mapsdk.internal.C114105qf r13) {
        /*
            com.tencent.mapsdk.internal.fs r0 = r13.f341508a
            int r1 = r0.f340257C
            r2 = 1
            r3 = 0
            r4 = 3
            if (r1 != r4) goto L_0x000c
            r1 = 0
            r8 = 1
            goto L_0x000d
        L_0x000c:
            r8 = 0
        L_0x000d:
            int[] r4 = r13.f341510o
            r4 = r4[r3]
            r5 = 33
            if (r4 != r5) goto L_0x0018
            r1 = 2
            r7 = 2
            goto L_0x001f
        L_0x0018:
            r5 = 20
            r7 = r1
            if (r4 != r5) goto L_0x001f
            r9 = 1
            goto L_0x0020
        L_0x001f:
            r9 = 0
        L_0x0020:
            int[] r1 = new int[r3]
            java.util.List<java.lang.Integer> r0 = r0.f340266L
            if (r0 == 0) goto L_0x004c
            int r0 = r0.size()
            int[] r0 = new int[r0]
            r1 = 0
        L_0x002d:
            com.tencent.mapsdk.internal.fs r2 = r13.f341508a
            java.util.List<java.lang.Integer> r2 = r2.f340266L
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x004a
            com.tencent.mapsdk.internal.fs r2 = r13.f341508a
            java.util.List<java.lang.Integer> r2 = r2.f340266L
            java.lang.Object r2 = r2.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L_0x002d
        L_0x004a:
            r11 = r0
            goto L_0x004d
        L_0x004c:
            r11 = r1
        L_0x004d:
            int[] r0 = new int[r3]
            com.tencent.mapsdk.internal.fs r1 = r13.f341508a
            int[] r1 = r1.f340278t
            if (r1 == 0) goto L_0x0066
            int r0 = r1.length
            int[] r0 = new int[r0]
        L_0x0058:
            com.tencent.mapsdk.internal.fs r1 = r13.f341508a
            int[] r1 = r1.f340278t
            int r2 = r1.length
            if (r3 >= r2) goto L_0x0066
            r1 = r1[r3]
            r0[r3] = r1
            int r3 = r3 + 1
            goto L_0x0058
        L_0x0066:
            r10 = r0
            com.tencent.mapsdk.internal.sq$122 r0 = new com.tencent.mapsdk.internal.sq$122
            r4 = r0
            r5 = r12
            r6 = r13
            r4.<init>(r6, r7, r8, r9, r10, r11)
            r13 = -1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r12 = r12.m159789c(r0, r13)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114216sq.m159724a(com.tencent.mapsdk.internal.sq, com.tencent.mapsdk.internal.qf):int");
    }
}
