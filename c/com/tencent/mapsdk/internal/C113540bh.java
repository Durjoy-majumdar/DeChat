package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.C104548ha;
import com.tencent.mapsdk.internal.C113497ab;
import com.tencent.mapsdk.internal.C113503ad;
import com.tencent.mapsdk.internal.C113558bl;
import com.tencent.mapsdk.internal.C113707es;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.mapsdk.internal.C114165rp;
import com.tencent.mapsdk.internal.C114211sn;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdate;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.CamerParameter;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayer;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.IOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;
import com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider;
import com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.bh */
public final class C113540bh implements C113516aj, C113517ak, C113518am, C113723fh {

    /* renamed from: a */
    public C113572bv f339762a = null;

    /* renamed from: b */
    public volatile C114322sx f339763b = null;

    /* renamed from: c */
    public Context f339764c = null;

    /* renamed from: d */
    public C113558bl f339765d = null;

    /* renamed from: e */
    public C114129qx f339766e = null;

    /* renamed from: f */
    public C114081ps f339767f;

    /* renamed from: g */
    public CameraPosition f339768g;

    /* renamed from: h */
    public final byte[] f339769h = new byte[0];

    /* renamed from: i */
    public C113707es f339770i;

    /* renamed from: j */
    public final C114211sn.C114214a f339771j = new C114211sn.C114214a() {
        /* renamed from: a */
        public final float mo171656a() {
            if (C113540bh.this.f339763b == null) {
                return 0.0f;
            }
            return ((VectorMap) C113540bh.this.f339763b.f339878e_).mo173491s();
        }

        /* renamed from: b */
        public final int mo171658b() {
            if (C113540bh.this.f339763b == null) {
                return 0;
            }
            return ((VectorMap) C113540bh.this.f339763b.f339878e_).mo173488p();
        }

        /* renamed from: c */
        public final GeoPoint mo171659c() {
            if (C113540bh.this.f339763b == null) {
                return null;
            }
            return ((VectorMap) C113540bh.this.f339763b.f339878e_).mo173489q();
        }

        /* renamed from: d */
        public final float mo171660d() {
            if (C113540bh.this.f339763b == null) {
                return 0.0f;
            }
            return ((VectorMap) C113540bh.this.f339763b.f339878e_).mo173493t();
        }

        /* renamed from: e */
        public final float mo171661e() {
            if (C113540bh.this.f339763b == null) {
                return 0.0f;
            }
            return ((VectorMap) C113540bh.this.f339763b.f339878e_).mo173494u();
        }

        /* renamed from: f */
        public final float mo171662f() {
            if (C113540bh.this.f339763b == null) {
                return 0.0f;
            }
            return C113540bh.this.mo171651D();
        }

        /* renamed from: g */
        public final GeoPoint mo171663g() {
            if (C113540bh.this.f339763b == null) {
                return null;
            }
            return C113540bh.this.f339763b.mo171620s();
        }

        /* renamed from: h */
        public final boolean mo171664h() {
            if (C113540bh.this.f339763b == null) {
                return false;
            }
            return C113540bh.this.f339763b.f342588o.f339625f;
        }

        /* renamed from: a */
        public final void mo171657a(Runnable runnable) {
            if (runnable != null && C113540bh.this.f339763b != null) {
                C113865kb.m157400a(runnable, 100);
            }
        }
    };

    /* renamed from: k */
    public C113726fk f339772k = new C113726fk() {
        /* renamed from: u */
        public final void mo171258u() {
            C113865kb.m157399a((Runnable) new Runnable() {
                public final void run() {
                    if (C113540bh.this.f339763b != null) {
                        C113540bh.this.f339763b.mo171552a(((VectorMap) C113540bh.this.f339763b.f339878e_).f342909o.f340912t.mo173058a());
                    }
                }
            });
        }
    };

    /* renamed from: l */
    private String f339773l = null;

    /* renamed from: m */
    private C114065pl f339774m = null;

    /* renamed from: n */
    private C114117qo f339775n = null;

    /* renamed from: o */
    private final GeoPoint f339776o = null;

    /* renamed from: p */
    private final GeoPoint f339777p = null;

    /* renamed from: q */
    private int f339778q = 0;

    /* renamed from: r */
    private int f339779r = 0;

    /* renamed from: s */
    private int f339780s = 0;

    /* renamed from: t */
    private int f339781t = 0;

    /* renamed from: u */
    private int f339782u = 0;

    /* renamed from: v */
    private int f339783v = 1000;

    /* renamed from: w */
    private float f339784w = 1.0f;

    /* renamed from: x */
    private final C113550b f339785x = new C113550b(false);

    /* renamed from: y */
    private final C113550b f339786y = new C113550b(true);

    /* renamed from: z */
    private C113503ad.C113511a f339787z = new C113503ad.C113511a() {
        /* renamed from: a */
        public final void mo171265a(C113831iz izVar) {
            C114322sx sxVar;
            VectorMap vectorMap;
            if (izVar.f340607z == 10000 && (izVar instanceof C114211sn) && (sxVar = C113540bh.this.f339763b) != null && (vectorMap = (VectorMap) sxVar.f339878e_) != null) {
                C114211sn snVar = (C114211sn) izVar;
                if (snVar.f341960Q) {
                    vectorMap.mo173456b((sxVar.f342569al / 2) - snVar.f341961R, (sxVar.f342570am / 2) - snVar.f341962S);
                }
                if (snVar.f342001h) {
                    vectorMap.mo173456b(snVar.f341954K, snVar.f341955L);
                }
                if (snVar.f341957N || snVar.f341956M || snVar.f341958O) {
                    vectorMap.f342909o.f340901i.mo171202a((float) ((double) ((float) snVar.f341959P)));
                }
                if (snVar.f341963T) {
                    int i = snVar.f341971aa;
                    int i2 = snVar.f341972ab;
                    vectorMap.mo173437a(i, i2);
                    if (snVar.f342000g) {
                        sxVar.mo171578b(i, i2);
                    }
                }
                if (snVar.f341973ac) {
                    vectorMap.mo173454b(snVar.f341977ag);
                }
                if (snVar.f341978ah) {
                    vectorMap.mo173436a(snVar.f341982al);
                }
                if (snVar.f341960Q) {
                    vectorMap.mo173456b(snVar.f341961R - (sxVar.f342569al / 2), snVar.f341962S - (sxVar.f342570am / 2));
                }
            }
        }
    };

    /* renamed from: com.tencent.mapsdk.internal.bh$a */
    public interface C113549a {
        /* renamed from: a */
        void mo171668a();
    }

    /* renamed from: com.tencent.mapsdk.internal.bh$b */
    public class C113550b implements C113549a {

        /* renamed from: b */
        private boolean f339803b;

        public C113550b(boolean z) {
            this.f339803b = z;
        }

        /* renamed from: a */
        public final void mo171668a() {
            float f;
            if (C113540bh.this.f339763b.f342569al != 0 && C113540bh.this.f339763b.f342570am != 0) {
                C113540bh.this.f339763b.f342522E = null;
                if (C113540bh.this.f339763b.f342562ae != null && C113540bh.this.f339763b.f342563af != null) {
                    LatLng latLng = new LatLng(0.0d, 0.0d);
                    if (C113540bh.this.f339763b.f342565ah == 0 && C113540bh.this.f339763b.f342566ai == 0 && C113540bh.this.f339763b.f342567aj == 0 && C113540bh.this.f339763b.f342568ak == 0) {
                        C113540bh bhVar = C113540bh.this;
                        f = bhVar.f339770i.mo172023a(bhVar.f339763b.f342562ae, C113540bh.this.f339763b.f342563af, 0, 0, 0, 0, latLng);
                    } else {
                        C113540bh bhVar2 = C113540bh.this;
                        f = bhVar2.f339770i.mo172023a(bhVar2.f339763b.f342562ae, C113540bh.this.f339763b.f342563af, C113540bh.this.f339763b.f342565ah, C113540bh.this.f339763b.f342566ai, C113540bh.this.f339763b.f342567aj, C113540bh.this.f339763b.f342568ak, latLng);
                    }
                    float f2 = f;
                    TencentMap.CancelableCallback cancelableCallback = C113540bh.this.f339763b.f342520C;
                    if (this.f339803b) {
                        C114211sn snVar = new C114211sn();
                        snVar.mo172887c(0.0f);
                        snVar.mo172888d(0.0f);
                        snVar.mo172886b((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
                        snVar.mo172882a(f2);
                        C113540bh bhVar3 = C113540bh.this;
                        snVar.f341970a = bhVar3.f339771j;
                        snVar.f341999f = cancelableCallback;
                        ((VectorMap) bhVar3.f339763b.f339878e_).mo173442a((C113831iz) snVar);
                    } else {
                        ((VectorMap) C113540bh.this.f339763b.f339878e_).mo173454b(0.0f);
                        ((VectorMap) C113540bh.this.f339763b.f339878e_).mo173436a(0.0f);
                        ((VectorMap) C113540bh.this.f339763b.f339878e_).mo173437a((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
                        C113540bh.this.mo171654a(f2, false, 0, (TencentMap.CancelableCallback) null);
                    }
                    C113540bh.this.f339763b.f342562ae = null;
                    C113540bh.this.f339763b.f342563af = null;
                    C113540bh.this.f339763b.f342565ah = 0;
                    C113540bh.this.f339763b.f342566ai = 0;
                    C113540bh.this.f339763b.f342567aj = 0;
                    C113540bh.this.f339763b.f342568ak = 0;
                    C113540bh.this.f339763b.f342520C = null;
                }
            }
        }
    }

    public C113540bh(C113536be beVar, C113572bv bvVar, TencentMapOptions tencentMapOptions) {
        Context applicationContext = beVar.getContext().getApplicationContext();
        this.f339764c = applicationContext;
        this.f339784w = C113801hf.m157135a(applicationContext);
        this.f339762a = bvVar;
        this.f339763b = (C114322sx) beVar.mo171634b();
        if (C104548ha.f309920b == null || C104548ha.C104549a.m139965b() == 0) {
            C104548ha.f309920b = new C104548ha.C104549a(this.f339764c, Math.max(10, tencentMapOptions.getMaxIconMemoryCacheSize()) * 1048576);
        } else {
            C104548ha.C104549a.m139963a();
        }
        this.f339763b.mo171561a((C113723fh) this);
        this.f339770i = ((VectorMap) this.f339763b.f339878e_).getProjection();
        ((VectorMap) this.f339763b.f339878e_).f342909o.f340901i.f339666D = this.f339787z;
        ((VectorMap) this.f339763b.f339878e_).mo173441a(this.f339772k);
        if (tencentMapOptions != null && !C40002he.m42805a(tencentMapOptions.getSubKey())) {
            this.f339773l = tencentMapOptions.getSubKey();
        }
        C114117qo qoVar = this.f339763b.f342647aD.f340878H;
        this.f339775n = qoVar;
        this.f339767f = new C114081ps(this.f339764c, qoVar, this.f339763b.mo172974S());
        this.f339766e = new C114129qx(this.f339764c, this.f339773l);
        if (this.f339765d == null) {
            this.f339765d = new C113558bl(beVar, this.f339763b.f339875d, this.f339762a);
        }
    }

    /* renamed from: E */
    private C113558bl m155991E() {
        return this.f339765d;
    }

    /* renamed from: F */
    private C114129qx m155992F() {
        return this.f339766e;
    }

    /* renamed from: G */
    private C114081ps m155993G() {
        return this.f339767f;
    }

    /* renamed from: H */
    private void m155994H() {
        if (this.f339763b != null) {
            ((VectorMap) this.f339763b.f339878e_).mo173457b(this.f339772k);
            C114322sx sxVar = this.f339763b;
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
            this.f339763b = null;
        }
        if (this.f339764c != null) {
            this.f339764c = null;
        }
        C104548ha.C104549a aVar = C104548ha.f309920b;
        if (aVar != null) {
            aVar.mo147865c();
        }
    }

    /* renamed from: I */
    private C114322sx m155995I() {
        return this.f339763b;
    }

    /* renamed from: J */
    private Context m155996J() {
        return this.f339764c;
    }

    /* renamed from: A */
    public final int mo171274A() {
        return this.f339783v;
    }

    /* renamed from: B */
    public final VisibleRegion mo171362B() {
        Point point = new Point(0, this.f339763b.f342570am);
        Point point2 = new Point(this.f339763b.f342569al, this.f339763b.f342570am);
        Point point3 = new Point(0, 0);
        Point point4 = new Point(this.f339763b.f342569al, 0);
        LatLng a = mo171364a(point);
        LatLng a2 = mo171364a(point2);
        LatLng a3 = mo171364a(point3);
        LatLng a4 = mo171364a(point4);
        return new VisibleRegion(a, a2, a3, a4, LatLngBounds.builder().include(a).include(a2).include(a3).include(a4).build());
    }

    /* renamed from: C */
    public final C113572bv mo171366C() {
        return this.f339762a;
    }

    /* renamed from: D */
    public final float mo171651D() {
        return ((VectorMap) this.f339763b.f339878e_).f342909o.f340912t.mo173058a();
    }

    /* renamed from: b */
    public final void mo171655b(int i, int i2) {
    }

    /* renamed from: e */
    public final void mo171333e() {
    }

    /* renamed from: f */
    public final int mo171336f() {
        int m = ((C113961mq) this.f339763b.f339876d_).f340901i.mo171250m();
        C114129qx qxVar = this.f339766e;
        if (qxVar != null) {
            return qxVar.mo172748b(m);
        }
        return 0;
    }

    /* renamed from: g */
    public final int mo171339g() {
        return -1;
    }

    /* renamed from: g */
    public final void mo171340g(boolean z) {
        if (this.f339763b != null) {
            this.f339763b.f342582i = z;
        }
    }

    /* renamed from: h */
    public final boolean mo171342h() {
        return ((VectorMap) this.f339763b.f339878e_).f342909o.f340909q;
    }

    /* renamed from: i */
    public final void mo171343i() {
    }

    /* renamed from: i */
    public final void mo171344i(boolean z) {
        if (this.f339763b != null && this.f339763b.f339878e_ != null) {
            VectorMap vectorMap = (VectorMap) this.f339763b.f339878e_;
            vectorMap.f342910p = z;
            vectorMap.f342909o.mo172460j(z);
        }
    }

    /* renamed from: j */
    public final void mo171345j() {
        this.f339762a.mo171857a();
        C113558bl blVar = this.f339765d;
        if (blVar != null) {
            blVar.mo171696j();
        }
    }

    /* renamed from: k */
    public final void mo171346k() {
    }

    /* renamed from: l */
    public final void mo171347l() {
    }

    /* renamed from: m */
    public final void mo171348m() {
        this.f339762a.mo171861c();
        C114065pl plVar = this.f339774m;
        if (plVar != null) {
            plVar.mo172653a();
            this.f339774m = null;
        }
        C113558bl blVar = this.f339765d;
        if (blVar != null) {
            ViewGroup viewGroup = blVar.f339835b;
            C114322sx sxVar = blVar.f339836c;
            if (!(viewGroup == null || sxVar == null)) {
                Handler handler = blVar.f339843j;
                if (handler != null) {
                    handler.removeCallbacksAndMessages((Object) null);
                }
                ((VectorMap) sxVar.f339878e_).f342909o.f340901i.mo171232b((C113727fl) blVar);
                sxVar.f342579av.remove(blVar);
                sxVar.mo171580b((C113717fb) blVar);
                viewGroup.removeAllViews();
                for (C113701eo c : blVar.f339842i) {
                    c.mo172000c();
                }
                blVar.f339842i.clear();
            }
            this.f339765d = null;
        }
    }

    /* renamed from: n */
    public final void mo171349n() {
        this.f339762a.mo171860b();
    }

    /* renamed from: o */
    public final String mo171350o() {
        return C113798hb.m157092i();
    }

    /* renamed from: p */
    public final Language mo171351p() {
        if (this.f339763b == null) {
            return Language.zh;
        }
        VectorMap vectorMap = (VectorMap) this.f339763b.f339878e_;
        return vectorMap == null ? Language.zh : vectorMap.f342909o.mo172413E();
    }

    /* renamed from: q */
    public final void mo171352q() {
        VectorMap vectorMap;
        if (this.f339763b != null && (vectorMap = (VectorMap) this.f339763b.f339878e_) != null) {
            vectorMap.clearRouteNameSegments();
        }
    }

    /* renamed from: r */
    public final int mo171353r() {
        IndoorBuilding indoorBuilding;
        if (this.f339763b == null || this.f339763b.f342588o == null || (indoorBuilding = this.f339763b.f342588o.f339626g) == null) {
            return -1;
        }
        return indoorBuilding.getActiveLevelIndex();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r4.f339763b.f342588o;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] mo171354s() {
        /*
            r4 = this;
            com.tencent.mapsdk.internal.sx r0 = r4.f339763b
            r1 = 0
            if (r0 == 0) goto L_0x0049
            com.tencent.mapsdk.internal.sx r0 = r4.f339763b
            com.tencent.mapsdk.internal.ab r0 = r0.f342588o
            if (r0 != 0) goto L_0x000c
            goto L_0x0049
        L_0x000c:
            com.tencent.mapsdk.internal.sx r0 = r4.f339763b
            com.tencent.mapsdk.internal.ab r0 = r0.f342588o
            com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding r2 = r0.f339626g
            if (r2 == 0) goto L_0x0049
            java.util.List r2 = r2.getLevels()
            if (r2 == 0) goto L_0x0049
            com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding r2 = r0.f339626g
            java.util.List r2 = r2.getLevels()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0027
            goto L_0x0049
        L_0x0027:
            com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding r0 = r0.f339626g
            java.util.List r0 = r0.getLevels()
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
        L_0x0034:
            int r3 = r0.size()
            if (r2 >= r3) goto L_0x0049
            java.lang.Object r3 = r0.get(r2)
            com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel r3 = (com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel) r3
            java.lang.String r3 = r3.getName()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L_0x0034
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113540bh.mo171354s():java.lang.String[]");
    }

    /* renamed from: t */
    public final String mo171355t() {
        if (this.f339763b == null || this.f339763b.f342588o == null) {
            return null;
        }
        IndoorBuilding indoorBuilding = this.f339763b.f342588o.f339626g;
        return indoorBuilding == null ? "" : indoorBuilding.getBuildingName();
    }

    /* renamed from: u */
    public final IndoorBuilding mo171356u() {
        if (this.f339763b == null || this.f339763b.f342588o == null) {
            return null;
        }
        return this.f339763b.f342588o.f339626g;
    }

    /* renamed from: v */
    public final String mo171357v() {
        IndoorBuilding indoorBuilding;
        if (this.f339763b == null || this.f339763b.f342588o == null || (indoorBuilding = this.f339763b.f342588o.f339626g) == null) {
            return null;
        }
        return indoorBuilding.getBuidlingId();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r0 = r2.f339763b.f342585l;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo171358w() {
        /*
            r2 = this;
            com.tencent.mapsdk.internal.sx r0 = r2.f339763b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.tencent.mapsdk.internal.sx r0 = r2.f339763b
            com.tencent.mapsdk.internal.qt r0 = r0.f342585l
            if (r0 == 0) goto L_0x0012
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlay r0 = r0.f341600b
            if (r0 == 0) goto L_0x0012
            r0 = 1
            return r0
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113540bh.mo171358w():boolean");
    }

    /* renamed from: x */
    public final boolean mo171359x() {
        if (this.f339763b == null) {
            return false;
        }
        return this.f339763b.f342574aq;
    }

    /* renamed from: y */
    public final ArrayList<MapPoi> mo171360y() {
        if (this.f339763b == null) {
            return null;
        }
        return this.f339763b.f342647aD.mo172415G();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00eb A[Catch:{ JSONException -> 0x0105 }] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo171361z() {
        /*
            r7 = this;
            android.content.Context r0 = r7.f339764c
            r1 = 0
            if (r0 == 0) goto L_0x0105
            com.tencent.mapsdk.internal.sx r0 = r7.f339763b
            if (r0 != 0) goto L_0x000b
            goto L_0x0105
        L_0x000b:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0105 }
            r0.<init>()     // Catch:{ JSONException -> 0x0105 }
            java.lang.String r2 = r7.f339773l     // Catch:{ JSONException -> 0x0105 }
            boolean r2 = com.tencent.mapsdk.internal.C40002he.m42805a((java.lang.String) r2)     // Catch:{ JSONException -> 0x0105 }
            if (r2 != 0) goto L_0x0021
            android.content.Context r2 = r7.f339764c     // Catch:{ JSONException -> 0x0105 }
            java.lang.String r3 = r7.f339773l     // Catch:{ JSONException -> 0x0105 }
            com.tencent.mapsdk.internal.mh r2 = com.tencent.mapsdk.internal.C113957mj.m157958a(r2, r3)     // Catch:{ JSONException -> 0x0105 }
            goto L_0x0027
        L_0x0021:
            android.content.Context r2 = r7.f339764c     // Catch:{ JSONException -> 0x0105 }
            com.tencent.mapsdk.internal.mk r2 = com.tencent.mapsdk.internal.C113958mk.m157962a(r2)     // Catch:{ JSONException -> 0x0105 }
        L_0x0027:
            java.lang.String r3 = "%s-%s-%s,%s-%s-%s,%s-%s-%s"
            r4 = 9
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ JSONException -> 0x0105 }
            r5 = 0
            java.lang.String r6 = "mapconfig"
            r4[r5] = r6     // Catch:{ JSONException -> 0x0105 }
            r5 = 1
            java.lang.String r6 = "mapConfigVersion"
            int r6 = r2.mo172397b(r6)     // Catch:{ JSONException -> 0x0105 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ JSONException -> 0x0105 }
            r4[r5] = r6     // Catch:{ JSONException -> 0x0105 }
            r5 = 2
            java.lang.String r6 = "mapConfigZipMd5"
            java.lang.String r6 = r2.mo172391a((java.lang.String) r6)     // Catch:{ JSONException -> 0x0105 }
            r4[r5] = r6     // Catch:{ JSONException -> 0x0105 }
            r5 = 3
            java.lang.String r6 = "indoormap_style"
            r4[r5] = r6     // Catch:{ JSONException -> 0x0105 }
            r5 = 4
            java.lang.String r6 = "indoormap_style_version"
            int r6 = r2.mo172397b(r6)     // Catch:{ JSONException -> 0x0105 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ JSONException -> 0x0105 }
            r4[r5] = r6     // Catch:{ JSONException -> 0x0105 }
            r5 = 5
            java.lang.String r6 = "indoormap_style_md5"
            java.lang.String r6 = r2.mo172391a((java.lang.String) r6)     // Catch:{ JSONException -> 0x0105 }
            r4[r5] = r6     // Catch:{ JSONException -> 0x0105 }
            r5 = 6
            java.lang.String r6 = "indoormap_style_night"
            r4[r5] = r6     // Catch:{ JSONException -> 0x0105 }
            r5 = 7
            java.lang.String r6 = "indoormap_style_night_version"
            int r6 = r2.mo172397b(r6)     // Catch:{ JSONException -> 0x0105 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ JSONException -> 0x0105 }
            r4[r5] = r6     // Catch:{ JSONException -> 0x0105 }
            r5 = 8
            java.lang.String r6 = "indoormap_style_night_md5"
            java.lang.String r2 = r2.mo172391a((java.lang.String) r6)     // Catch:{ JSONException -> 0x0105 }
            r4[r5] = r2     // Catch:{ JSONException -> 0x0105 }
            java.lang.String r2 = java.lang.String.format(r3, r4)     // Catch:{ JSONException -> 0x0105 }
            java.lang.String r3 = "cfgVer"
            r0.put(r3, r2)     // Catch:{ JSONException -> 0x0105 }
            android.content.Context r2 = r7.f339764c     // Catch:{ JSONException -> 0x0105 }
            int r2 = com.tencent.mapsdk.internal.C113801hf.m157140b(r2)     // Catch:{ JSONException -> 0x0105 }
            android.content.Context r3 = r7.f339764c     // Catch:{ JSONException -> 0x0105 }
            int r3 = com.tencent.mapsdk.internal.C113801hf.m157142c(r3)     // Catch:{ JSONException -> 0x0105 }
            java.lang.String r4 = "resolution"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0105 }
            java.lang.String r6 = "{"
            r5.<init>(r6)     // Catch:{ JSONException -> 0x0105 }
            r5.append(r2)     // Catch:{ JSONException -> 0x0105 }
            java.lang.String r2 = ","
            r5.append(r2)     // Catch:{ JSONException -> 0x0105 }
            r5.append(r3)     // Catch:{ JSONException -> 0x0105 }
            java.lang.String r2 = "}"
            r5.append(r2)     // Catch:{ JSONException -> 0x0105 }
            java.lang.String r2 = r5.toString()     // Catch:{ JSONException -> 0x0105 }
            r0.put(r4, r2)     // Catch:{ JSONException -> 0x0105 }
            float r2 = r7.f339784w     // Catch:{ JSONException -> 0x0105 }
            java.lang.String r3 = "density"
            double r4 = (double) r2     // Catch:{ JSONException -> 0x0105 }
            r0.put(r3, r4)     // Catch:{ JSONException -> 0x0105 }
            com.tencent.mapsdk.internal.sx r2 = r7.f339763b     // Catch:{ JSONException -> 0x0105 }
            M r2 = r2.f339878e_     // Catch:{ JSONException -> 0x0105 }
            com.tencent.mapsdk.vector.VectorMap r2 = (com.tencent.mapsdk.vector.VectorMap) r2     // Catch:{ JSONException -> 0x0105 }
            com.tencent.mapsdk.internal.mq r2 = r2.f342909o     // Catch:{ JSONException -> 0x0105 }
            if (r2 != 0) goto L_0x00ca
        L_0x00c8:
            r2 = r1
            goto L_0x00da
        L_0x00ca:
            com.tencent.mapsdk.internal.sq r2 = r2.f340899g     // Catch:{ JSONException -> 0x0105 }
            if (r2 != 0) goto L_0x00cf
            goto L_0x00c8
        L_0x00cf:
            com.tencent.mapsdk.internal.sq$48 r3 = new com.tencent.mapsdk.internal.sq$48     // Catch:{ JSONException -> 0x0105 }
            r3.<init>()     // Catch:{ JSONException -> 0x0105 }
            java.lang.Object r2 = r2.mo172900a(r3, r1)     // Catch:{ JSONException -> 0x0105 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x0105 }
        L_0x00da:
            java.lang.String r3 = "renderStatus"
            r0.put(r3, r2)     // Catch:{ JSONException -> 0x0105 }
            com.tencent.mapsdk.internal.sx r2 = r7.f339763b     // Catch:{ JSONException -> 0x0105 }
            M r2 = r2.f339878e_     // Catch:{ JSONException -> 0x0105 }
            com.tencent.mapsdk.vector.VectorMap r2 = (com.tencent.mapsdk.vector.VectorMap) r2     // Catch:{ JSONException -> 0x0105 }
            com.tencent.mapsdk.internal.mq r2 = r2.f342909o     // Catch:{ JSONException -> 0x0105 }
            if (r2 != 0) goto L_0x00eb
        L_0x00e9:
            r2 = r1
            goto L_0x00f4
        L_0x00eb:
            com.tencent.mapsdk.internal.sq r2 = r2.f340899g     // Catch:{ JSONException -> 0x0105 }
            if (r2 != 0) goto L_0x00f0
            goto L_0x00e9
        L_0x00f0:
            java.lang.String r2 = r2.mo171844a()     // Catch:{ JSONException -> 0x0105 }
        L_0x00f4:
            java.lang.String r3 = "renderError"
            r0.put(r3, r2)     // Catch:{ JSONException -> 0x0105 }
            java.lang.String r2 = "4.5.12.4.6"
            java.lang.String r3 = "sdkver"
            r0.put(r3, r2)     // Catch:{ JSONException -> 0x0105 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0105 }
            return r0
        L_0x0105:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113540bh.mo171361z():java.lang.String");
    }

    /* renamed from: b */
    public final Point mo171365b(LatLng latLng) {
        C114322sx sxVar;
        M m;
        C113732fo a;
        if (latLng == null || (sxVar = this.f339763b) == null || (m = sxVar.f339878e_) == null || ((VectorMap) m).getProjection() == null || (a = ((VectorMap) sxVar.f339878e_).getProjection().mo172027a(GeoPoint.from(latLng))) == null) {
            return null;
        }
        Point point = new Point();
        point.x = (int) Math.round(a.f340215a);
        point.y = (int) Math.round(a.f340216b);
        return point;
    }

    /* renamed from: c */
    public final float mo171327c() {
        return (float) ((VectorMap) this.f339763b.f339878e_).mo173487o();
    }

    /* renamed from: d */
    public final void mo171330d() {
        ((VectorMap) this.f339763b.f339878e_).mo173497w();
    }

    /* renamed from: e */
    public final void mo171334e(int i) {
        VectorMap vectorMap;
        if (this.f339763b != null && (vectorMap = (VectorMap) this.f339763b.f339878e_) != null) {
            C113961mq mqVar = vectorMap.f342909o;
            C114216sq sqVar = mqVar.f340899g;
            if (sqVar != null) {
                sqVar.mo172927b(i);
            }
            C114367v vVar = mqVar.f340912t;
            if (vVar != null) {
                vVar.f342783b.f342818n = i;
            }
            vectorMap.f342909o.f340914v = true;
        }
    }

    /* renamed from: a */
    private void m156010a(C113558bl.C113562a aVar) {
        C114175rr rrVar = this.f339765d.f339837d;
        if (rrVar != null) {
            rrVar.f341816d = aVar;
        }
    }

    /* renamed from: j */
    private void m156023j(boolean z) {
        this.f339762a.setZOrderMediaOverlay(z);
    }

    /* renamed from: c */
    private void m156020c(float f, float f2) {
        C113961mq mqVar = ((VectorMap) this.f339763b.f339878e_).f342909o;
        if (mqVar != null) {
            C113503ad adVar = mqVar.f340901i;
            adVar.f339667E = f;
            adVar.f339668F = f2;
        }
    }

    /* renamed from: d */
    public final void mo171332d(boolean z) {
        VectorMap vectorMap;
        C114216sq sqVar;
        if (this.f339763b != null && this.f339763b.f342588o != null && (vectorMap = this.f339763b.f342588o.f339623d) != null && (sqVar = vectorMap.f342909o.f340899g) != null && sqVar.f342024e != 0) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(z) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetIndoorBuildingPickEnabled(C114216sq.this.f342024e, r6);
                    }
                }
            });
        }
    }

    /* renamed from: h */
    public final void mo171341h(boolean z) {
        if (this.f339763b != null) {
            this.f339763b.f342574aq = z;
        }
    }

    /* renamed from: a */
    private void m156011a(C114165rp.C114173c cVar, TencentMapOptions tencentMapOptions) {
        C114165rp rpVar;
        C113558bl blVar = this.f339765d;
        if (tencentMapOptions != null && tencentMapOptions.getExtSurface() != null && (rpVar = blVar.f339838e) != null) {
            List<C114165rp.C114173c> list = rpVar.f341792r;
            if (!(list == null || cVar == null)) {
                list.add(cVar);
            }
            int extSurfaceWidth = tencentMapOptions.getExtSurfaceWidth();
            int extSurfaceHeight = tencentMapOptions.getExtSurfaceHeight();
            blVar.f339835b.measure(View.MeasureSpec.makeMeasureSpec(extSurfaceWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(extSurfaceHeight, 1073741824));
            blVar.mo171655b(extSurfaceWidth, extSurfaceHeight);
        }
    }

    /* renamed from: f */
    public final void mo171338f(boolean z) {
        if (this.f339763b != null) {
            this.f339763b.f342572ao = z;
        }
    }

    /* renamed from: f */
    public final void mo171337f(int i) {
        C114128qw a;
        if (i == 1000 || i == 1011 || i == 1008) {
            if (i == 1008) {
                this.f339763b.f342647aD.f339861d.mo172158e().f340394a++;
            }
            this.f339783v = i;
            if (i == 1000) {
                i = this.f339782u;
            }
            C114129qx qxVar = this.f339766e;
            if (!(qxVar == null || (a = qxVar.mo172746a(i)) == null)) {
                i = a.f341611a;
            }
            this.f339763b.f342647aD.mo172451c(i);
        }
    }

    /* renamed from: b */
    private void m156018b(boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (!z) {
            ((VectorMap) this.f339763b.f339878e_).mo173459c(((VectorMap) this.f339763b.f339878e_).mo173491s() / 2.0f);
            return;
        }
        C114211sn snVar = new C114211sn();
        snVar.mo172885b(-1.0f);
        snVar.f341970a = this.f339771j;
        snVar.f341999f = cancelableCallback;
        snVar.mo172884a(j);
        ((VectorMap) this.f339763b.f339878e_).mo173442a((C113831iz) snVar);
    }

    /* renamed from: c */
    public final void mo171329c(boolean z) {
        if (this.f339763b != null && this.f339763b.f342588o != null) {
            C113497ab abVar = this.f339763b.f342588o;
            int i = z ? C113497ab.C113501a.f339639b : C113497ab.C113501a.f339640c;
            abVar.f339622c = i;
            abVar.mo171188a(i);
        }
    }

    /* renamed from: d */
    public final void mo171331d(int i) {
        if (this.f339763b != null) {
            this.f339763b.f342583j = i;
            VectorMap vectorMap = (VectorMap) this.f339763b.f339878e_;
            if (vectorMap != null) {
                vectorMap.mo173455b(i);
                vectorMap.f342909o.f340914v = true;
            }
        }
    }

    /* renamed from: e */
    public final void mo171335e(boolean z) {
        if (this.f339763b != null) {
            if (z) {
                this.f339763b.mo171626y();
                return;
            }
            C114122qt qtVar = this.f339763b.f342585l;
            if (qtVar != null) {
                qtVar.mo172742b();
            }
        }
    }

    /* renamed from: a */
    public final LatLng mo171364a(Point point) {
        M m;
        C114322sx sxVar = this.f339763b;
        if (sxVar == null || (m = sxVar.f339878e_) == null || ((VectorMap) m).getProjection() == null) {
            return null;
        }
        return C113883ke.m157466a(((VectorMap) sxVar.f339878e_).getProjection().mo172025a(new C113732fo((double) point.x, (double) point.y)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = r3.f339763b.f342588o;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo171328c(int r4) {
        /*
            r3 = this;
            com.tencent.mapsdk.internal.sx r0 = r3.f339763b
            if (r0 == 0) goto L_0x0022
            com.tencent.mapsdk.internal.sx r0 = r3.f339763b
            com.tencent.mapsdk.internal.ab r0 = r0.f342588o
            if (r0 != 0) goto L_0x000b
            goto L_0x0022
        L_0x000b:
            com.tencent.mapsdk.internal.sx r0 = r3.f339763b
            com.tencent.mapsdk.internal.ab r0 = r0.f342588o
            com.tencent.mapsdk.internal.mq r1 = r0.f339624e
            if (r1 == 0) goto L_0x0022
            com.tencent.mapsdk.internal.sq r1 = r1.f340899g
            if (r1 == 0) goto L_0x001f
            com.tencent.mapsdk.internal.sq$156 r2 = new com.tencent.mapsdk.internal.sq$156
            r2.<init>(r4)
            r1.mo172914a((com.tencent.mapsdk.internal.C113961mq.C113963a) r2)
        L_0x001f:
            r0.mo171193c()
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113540bh.mo171328c(int):void");
    }

    /* renamed from: a */
    public final double mo171363a(double d) {
        return ((VectorMap) this.f339763b.f339878e_).getProjection().metersPerPixel(d);
    }

    /* renamed from: a */
    private void m156013a(boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (!z) {
            ((VectorMap) this.f339763b.f339878e_).mo173459c(((VectorMap) this.f339763b.f339878e_).mo173491s() * 2.0f);
            return;
        }
        C114211sn snVar = new C114211sn();
        snVar.mo172885b(1.0f);
        snVar.f341970a = this.f339771j;
        snVar.f341999f = cancelableCallback;
        snVar.mo172884a(j);
        ((VectorMap) this.f339763b.f339878e_).mo173442a((C113831iz) snVar);
    }

    /* renamed from: b */
    private void m156017b(float f, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        double d;
        if (this.f339763b != null && f != 0.0f) {
            if (!z) {
                if (f < 0.0f) {
                    d = Math.pow(2.0d, (double) Math.abs(f));
                } else {
                    d = Math.pow(0.5d, (double) Math.abs(f));
                }
                ((VectorMap) this.f339763b.f339878e_).mo173435a((double) (((VectorMap) this.f339763b.f339878e_).mo173491s() * ((float) (1.0d / d))));
                return;
            }
            C114211sn snVar = new C114211sn();
            snVar.mo172885b(f);
            snVar.f341970a = this.f339771j;
            snVar.f341999f = cancelableCallback;
            snVar.mo172884a(j);
            ((VectorMap) this.f339763b.f339878e_).mo173442a((C113831iz) snVar);
        }
    }

    /* renamed from: a */
    private void m156007a(float f, float f2, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (this.f339763b != null) {
            if (f != 0.0f || f2 != 0.0f) {
                if (!z) {
                    ((VectorMap) this.f339763b.f339878e_).mo173456b((int) f, (int) f2);
                    return;
                }
                C114211sn snVar = new C114211sn();
                int i = (int) f;
                int i2 = (int) f2;
                if (i == 0 && i2 == 0) {
                    snVar.f342001h = false;
                }
                snVar.f341952I = i;
                snVar.f341953J = i2;
                snVar.f342001h = true;
                snVar.f341970a = this.f339771j;
                snVar.f341999f = cancelableCallback;
                snVar.mo172884a(j);
                ((VectorMap) this.f339763b.f339878e_).mo173442a((C113831iz) snVar);
            }
        }
    }

    /* renamed from: b */
    private void m156016b(float f, float f2, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (z) {
            C114211sn snVar = new C114211sn();
            snVar.mo172887c(f);
            if (f2 >= 0.0f) {
                snVar.mo172888d(f2);
            }
            snVar.f341970a = this.f339771j;
            snVar.f341999f = cancelableCallback;
            snVar.mo172884a(j);
            ((VectorMap) this.f339763b.f339878e_).mo173442a((C113831iz) snVar);
            return;
        }
        ((VectorMap) this.f339763b.f339878e_).mo173454b(f);
        if (f2 >= 0.0f) {
            ((VectorMap) this.f339763b.f339878e_).mo173436a(f2);
        }
    }

    /* renamed from: a */
    public final void mo171654a(float f, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (this.f339763b != null) {
            if (!z) {
                ((VectorMap) this.f339763b.f339878e_).mo173435a((double) ((float) (1.0d / Math.pow(2.0d, (double) (20.0f - Math.min(f, (float) Math.min(((VectorMap) this.f339763b.f339878e_).mo173488p(), this.f339763b.f342588o.f339625f ? 22 : 20)))))));
                return;
            }
            C114211sn snVar = new C114211sn();
            snVar.mo172882a(f);
            snVar.f341970a = this.f339771j;
            snVar.f341999f = cancelableCallback;
            snVar.mo172884a(j);
            ((VectorMap) this.f339763b.f339878e_).mo173442a((C113831iz) snVar);
        }
    }

    /* renamed from: b */
    public final float mo171317b() {
        return (float) ((VectorMap) this.f339763b.f339878e_).mo173488p();
    }

    /* renamed from: b */
    private static List<C113709et> m156015b(List<IOverlay> list) {
        ArrayList arrayList = new ArrayList();
        for (IOverlay next : list) {
            if (next instanceof C113709et) {
                arrayList.add((C113709et) next);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo171322b(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        if (this.f339763b != null) {
            this.f339763b.f342525H = onCameraChangeListener;
        }
    }

    /* renamed from: b */
    public final void mo171325b(TencentMapGestureListener tencentMapGestureListener) {
        TencentMapGestureListenerList tencentMapGestureListenerList;
        if (this.f339763b != null && (tencentMapGestureListenerList = this.f339763b.f342656ax) != null) {
            tencentMapGestureListenerList.removeListener(tencentMapGestureListener);
        }
    }

    /* renamed from: b */
    public final void mo171326b(boolean z) {
        if (this.f339763b != null) {
            this.f339763b.f342538U = z;
        }
    }

    /* renamed from: a */
    private void m156006a(float f, float f2, float f3, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        double d;
        float f4 = f;
        float f5 = f2;
        float f6 = f3;
        if (this.f339763b != null && f4 != 0.0f) {
            if (!z) {
                if (f4 < 0.0f) {
                    d = Math.pow(2.0d, (double) Math.abs(f));
                } else {
                    d = Math.pow(0.5d, (double) Math.abs(f));
                }
                double d2 = (double) f5;
                double d3 = (double) f6;
                ((VectorMap) this.f339763b.f339878e_).f342909o.f340901i.mo171200a((double) ((float) (1.0d / d)), d2, d3, d2, d3, (Runnable) null);
                return;
            }
            C114211sn snVar = new C114211sn();
            snVar.mo172883a((int) f5, (int) f6);
            snVar.mo172885b(f4);
            snVar.f341970a = this.f339771j;
            snVar.f341999f = cancelableCallback;
            snVar.mo172884a(j);
            ((VectorMap) this.f339763b.f339878e_).mo173442a((C113831iz) snVar);
        }
    }

    /* renamed from: b */
    public final void mo171320b(int i) {
        if (this.f339763b != null) {
            this.f339763b.mo171554a(i);
        }
    }

    /* renamed from: b */
    public final void mo171319b(float f, float f2) {
        if (this.f339763b != null) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            this.f339763b.mo171592d((int) (((float) this.f339763b.f342569al) * f), (int) (((float) this.f339763b.f342570am) * f2));
            this.f339763b.f342535R = f;
            this.f339763b.f342536S = f2;
        }
    }

    /* renamed from: b */
    public final void mo171323b(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.f339763b.f342655aw.remove(onMapLoadedCallback);
    }

    /* renamed from: b */
    public final void mo171321b(C113718fc fcVar) {
        VectorMap vectorMap;
        if (this.f339763b != null && (vectorMap = (VectorMap) this.f339763b.f339878e_) != null) {
            vectorMap.f342909o.mo172448b(fcVar);
        }
    }

    /* renamed from: b */
    public final void mo171324b(Language language) {
        if (this.f339763b != null && this.f339763b.f342584k != null) {
            C114189rv rvVar = this.f339763b.f342584k;
            if (language != null) {
                C114185ru ruVar = rvVar.f341875b;
                if (ruVar.f341864j != language) {
                    ruVar.f341864j = language;
                    OverSeaTileProvider overSeaTileProvider = rvVar.f341876c;
                    if (overSeaTileProvider != null) {
                        overSeaTileProvider.onLanguageChange(language);
                    }
                    rvVar.mo172837a();
                }
            }
        }
    }

    /* renamed from: a */
    private void m156012a(CameraPosition cameraPosition, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (this.f339763b != null && cameraPosition != null) {
            GeoPoint from = GeoPoint.from(cameraPosition.target);
            float f = cameraPosition.zoom;
            float o = (float) ((VectorMap) this.f339763b.f339878e_).mo173487o();
            if (f < o) {
                f = o;
            }
            if (f > 20.0f) {
                f = 20.0f;
            }
            if (!z) {
                double pow = 1.0d / Math.pow(2.0d, (double) (20.0f - f));
                if (from != null) {
                    ((VectorMap) this.f339763b.f339878e_).mo173437a(from.getLatitudeE6(), from.getLongitudeE6());
                }
                ((VectorMap) this.f339763b.f339878e_).mo173435a((double) ((float) pow));
                ((VectorMap) this.f339763b.f339878e_).mo173454b(cameraPosition.bearing);
                if (cameraPosition.tilt >= 0.0f) {
                    ((VectorMap) this.f339763b.f339878e_).mo173436a(cameraPosition.tilt);
                    return;
                }
                return;
            }
            C114211sn snVar = new C114211sn();
            if (from != null) {
                snVar.mo172886b(from.getLatitudeE6(), from.getLongitudeE6());
            }
            snVar.mo172882a(f);
            snVar.mo172887c(cameraPosition.bearing);
            float f2 = cameraPosition.tilt;
            if (f2 >= 0.0f) {
                snVar.mo172888d(f2);
            }
            snVar.f341970a = this.f339771j;
            snVar.mo172884a(j);
            snVar.f341999f = cancelableCallback;
            ((VectorMap) this.f339763b.f339878e_).mo173442a((C113831iz) snVar);
        }
    }

    /* renamed from: b */
    public final int mo171318b(String str) {
        VectorMap vectorMap;
        C113961mq mqVar;
        C114216sq sqVar;
        if (this.f339763b == null || this.f339763b.f342588o == null || (vectorMap = this.f339763b.f342588o.f339623d) == null || (mqVar = vectorMap.f342909o) == null || (sqVar = mqVar.f340899g) == null) {
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

    /* renamed from: a */
    private void m156003a(double d, double d2, float f, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (this.f339763b != null) {
            int i = (int) (d * 1000000.0d);
            int i2 = (int) (d2 * 1000000.0d);
            float o = (float) ((VectorMap) this.f339763b.f339878e_).mo173487o();
            if (f < o) {
                f = o;
            }
            if (f > 20.0f) {
                f = 20.0f;
            }
            double pow = 1.0d / Math.pow(2.0d, (double) (20.0f - f));
            if (!z) {
                ((VectorMap) this.f339763b.f339878e_).mo173437a(i, i2);
                ((VectorMap) this.f339763b.f339878e_).mo173435a((double) ((float) pow));
                return;
            }
            C114211sn snVar = new C114211sn();
            snVar.mo172886b(i, i2);
            snVar.mo172882a(f);
            snVar.f341970a = this.f339771j;
            snVar.f341999f = cancelableCallback;
            snVar.mo172884a(j);
            ((VectorMap) this.f339763b.f339878e_).mo173442a((C113831iz) snVar);
        }
    }

    /* renamed from: a */
    private void m156004a(double d, double d2, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (this.f339763b != null) {
            int i = (int) (d * 1000000.0d);
            int i2 = (int) (d2 * 1000000.0d);
            if (!z) {
                ((VectorMap) this.f339763b.f339878e_).mo173437a(i, i2);
                return;
            }
            C114211sn snVar = new C114211sn();
            snVar.mo172886b(i, i2);
            snVar.f341970a = this.f339771j;
            snVar.f341999f = cancelableCallback;
            snVar.mo172884a(j);
            ((VectorMap) this.f339763b.f339878e_).mo173442a((C113831iz) snVar);
        }
    }

    /* renamed from: a */
    private int m155999a(LatLngBounds latLngBounds, int i, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        LatLngBounds latLngBounds2 = latLngBounds;
        int i2 = i;
        TencentMap.CancelableCallback cancelableCallback2 = cancelableCallback;
        if (!(latLngBounds2 == null || latLngBounds2.northeast == null || latLngBounds2.southwest == null)) {
            if (this.f339763b.f342569al == 0 || this.f339763b.f342570am == 0) {
                this.f339763b.f342562ae = latLngBounds2.southwest;
                this.f339763b.f342563af = latLngBounds2.northeast;
                this.f339763b.f342564ag = i2;
                this.f339763b.f342520C = cancelableCallback2;
                if (z) {
                    this.f339763b.f342522E = this.f339786y;
                } else {
                    this.f339763b.f342522E = this.f339785x;
                }
                int b = C113801hf.m157140b(this.f339764c);
                int c = C113801hf.m157142c(this.f339764c);
                int i3 = i2 * 2;
                if (this.f339778q + i3 + this.f339780s > b || i3 + this.f339779r + this.f339781t > c) {
                    return -1;
                }
                return 0;
            }
            this.f339763b.f342522E = null;
            LatLng latLng = new LatLng(0.0d, 0.0d);
            float a = this.f339770i.mo172023a(latLngBounds2.southwest, latLngBounds2.northeast, i, i, i, i, latLng);
            if (a < 0.0f) {
                return (int) a;
            }
            if (!z) {
                ((VectorMap) this.f339763b.f339878e_).mo173437a((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
                mo171654a(a, false, j, (TencentMap.CancelableCallback) null);
            } else {
                C114211sn snVar = new C114211sn();
                snVar.mo172886b((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
                snVar.mo172882a(a);
                snVar.f341970a = this.f339771j;
                snVar.f341999f = cancelableCallback2;
                snVar.mo172884a(j);
                ((VectorMap) this.f339763b.f339878e_).mo173442a((C113831iz) snVar);
            }
            return 0;
        }
        return -1;
    }

    /* renamed from: a */
    private int m155998a(LatLngBounds latLngBounds, int i, int i2, int i3, int i4, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        LatLngBounds latLngBounds2 = latLngBounds;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        TencentMap.CancelableCallback cancelableCallback2 = cancelableCallback;
        if (!(latLngBounds2 == null || latLngBounds2.northeast == null || latLngBounds2.southwest == null)) {
            if (this.f339763b.f342569al == 0 || this.f339763b.f342570am == 0) {
                this.f339763b.f342562ae = latLngBounds2.southwest;
                this.f339763b.f342563af = latLngBounds2.northeast;
                this.f339763b.f342565ah = i5;
                this.f339763b.f342566ai = i6;
                this.f339763b.f342567aj = i7;
                this.f339763b.f342568ak = i8;
                this.f339763b.f342520C = cancelableCallback2;
                if (z) {
                    this.f339763b.f342522E = this.f339786y;
                } else {
                    this.f339763b.f342522E = this.f339785x;
                }
                int b = C113801hf.m157140b(this.f339764c);
                int c = C113801hf.m157142c(this.f339764c);
                if (i5 + i6 + this.f339778q + this.f339780s > b || i7 + i8 + this.f339779r + this.f339781t > c) {
                    return -1;
                }
                return 0;
            }
            this.f339763b.f342522E = null;
            LatLng latLng = new LatLng();
            float a = this.f339770i.mo172023a(latLngBounds2.southwest, latLngBounds2.northeast, i, i2, i3, i4, latLng);
            if (a < 0.0f) {
                return (int) a;
            }
            if (!z) {
                ((VectorMap) this.f339763b.f339878e_).mo173437a((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
                mo171654a(a, false, j, (TencentMap.CancelableCallback) null);
                ((VectorMap) this.f339763b.f339878e_).mo173454b(0.0f);
                ((VectorMap) this.f339763b.f339878e_).mo173436a(0.0f);
            } else {
                C114211sn snVar = new C114211sn();
                snVar.mo172887c(0.0f);
                snVar.mo172888d(0.0f);
                snVar.mo172886b((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
                snVar.mo172882a(a);
                snVar.f341970a = this.f339771j;
                snVar.f341999f = cancelableCallback2;
                snVar.mo172884a(j);
                ((VectorMap) this.f339763b.f339878e_).mo173442a((C113831iz) snVar);
            }
            return 0;
        }
        return -1;
    }

    /* renamed from: a */
    private int m156000a(List<C113709et> list, int i, int i2, int i3, int i4, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        C113707es v = ((VectorMap) this.f339763b.f339878e_).getProjection();
        if (v == null) {
            return Integer.MIN_VALUE;
        }
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C113709et next : list) {
                if (!(next == null || next.getGroupBounds() == null)) {
                    arrayList.addAll(next.getGroupBounds());
                }
            }
            if (this.f339763b.f342569al == 0 || this.f339763b.f342570am == 0) {
                int b = C113801hf.m157140b(this.f339764c);
                int c = C113801hf.m157142c(this.f339764c);
                if (i5 + i6 > b || i7 + i8 > c) {
                    return -1;
                }
                return 0;
            } else if (i5 + i6 > this.f339763b.f342569al || i7 + i8 > this.f339763b.f342570am) {
                return -1;
            } else {
                Rect rect = new Rect(i, i7, i6, i8);
                final boolean z2 = z;
                final TencentMap.CancelableCallback cancelableCallback2 = cancelableCallback;
                final long j2 = j;
                v.mo172030a(arrayList, (List<GeoPoint>) null, rect, new C113707es.C113708a() {
                    /* renamed from: a */
                    public final void mo171665a(final float f, final GeoPoint geoPoint) {
                        if (C113540bh.this.f339763b != null) {
                            C113865kb.m157399a((Runnable) new Runnable() {
                                public final void run() {
                                    if (C113540bh.this.f339763b != null) {
                                        C1135433 r0 = C1135433.this;
                                        if (z2) {
                                            double b = (((double) ((int) C113540bh.this.mo171317b())) - (Math.log((double) (1.0f / f)) / Math.log(2.0d))) - 2.0d;
                                            if (b < 0.0d) {
                                                b = 0.0d;
                                            }
                                            C114211sn snVar = new C114211sn();
                                            snVar.mo172886b(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
                                            snVar.mo172882a((float) b);
                                            C1135433 r05 = C1135433.this;
                                            snVar.f341970a = C113540bh.this.f339771j;
                                            snVar.f341999f = cancelableCallback2;
                                            snVar.mo172884a(j2);
                                            ((VectorMap) C113540bh.this.f339763b.f339878e_).mo173442a((C113831iz) snVar);
                                            return;
                                        }
                                        GeoPoint geoPoint = geoPoint;
                                        ((VectorMap) C113540bh.this.f339763b.f339878e_).f342909o.f340901i.mo171206a(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6(), 1);
                                        ((VectorMap) C113540bh.this.f339763b.f339878e_).mo173435a((double) f);
                                    }
                                }
                            });
                        }
                    }
                });
                return 0;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final CameraPosition mo171282a() {
        LatLng a = C113883ke.m157466a(((VectorMap) this.f339763b.f339878e_).mo173489q());
        float t = ((VectorMap) this.f339763b.f339878e_).mo173493t();
        if (t < 0.0f) {
            t = (t % 360.0f) + 360.0f;
        }
        return CameraPosition.builder().zoom(mo171651D()).target(a).bearing(t).tilt(((VectorMap) this.f339763b.f339878e_).mo173494u()).build();
    }

    /* renamed from: a */
    public final int mo171280a(CameraUpdate cameraUpdate) {
        CamerParameter params;
        if (cameraUpdate == null || (params = cameraUpdate.getParams()) == null) {
            return -1;
        }
        switch (params.iCamerType) {
            case 0:
                m156013a(false, 0, (TencentMap.CancelableCallback) null);
                break;
            case 1:
                m156018b(false, 0, (TencentMap.CancelableCallback) null);
                break;
            case 2:
                m156007a(params.scrollBy_xPixel, params.scrollBy_yPixel, false, 0, (TencentMap.CancelableCallback) null);
                break;
            case 3:
                mo171654a(params.zoomTo_zoom, false, 0, (TencentMap.CancelableCallback) null);
                break;
            case 4:
                m156017b(params.zoomBy_amount, false, 0, (TencentMap.CancelableCallback) null);
                break;
            case 5:
                float f = params.zoomBy_Point_amount;
                Point point = params.zoomBy_Point_focus;
                m156006a(f, (float) point.x, (float) point.y, false, 0, (TencentMap.CancelableCallback) null);
                break;
            case 6:
                m156012a(params.newCameraPosition_cameraPosition, false, 0, (TencentMap.CancelableCallback) null);
                break;
            case 7:
                LatLng latLng = params.newLatLng_latLng;
                if (latLng != null) {
                    m156004a(latLng.latitude, latLng.longitude, false, 0, (TencentMap.CancelableCallback) null);
                    break;
                }
                break;
            case 8:
                LatLng latLng2 = params.newLatLngZoom_latLng;
                if (latLng2 != null) {
                    m156003a(latLng2.latitude, latLng2.longitude, params.newLatLngZoom_zoom, false, 0, (TencentMap.CancelableCallback) null);
                    break;
                }
                break;
            case 9:
                return m155999a(params.newLatLngBounds_bounds, params.newLatLngBounds_padding, false, 0, (TencentMap.CancelableCallback) null);
            case 10:
                LatLngBounds latLngBounds = params.newLatLngBounds_dimension_bounds;
                int i = params.newLatLngBounds_dimension_padding;
                return m155998a(latLngBounds, i, i, i, i, false, 0, (TencentMap.CancelableCallback) null);
            case 11:
                return m155998a(params.newLatLngBounds_dimension_bounds, params.newLatLngBoundsRects_padLeft, params.newLatLngBoundsRects_padRight, params.newLatLngBoundsRects_padTop, params.newLatLngBoundsRects_padBom, false, 0, (TencentMap.CancelableCallback) null);
            case 12:
                m156016b(params.rotateto_rotate, params.rotateto_skew, false, 0, (TencentMap.CancelableCallback) null);
                break;
            case 13:
                return m156000a(m156015b(params.elements), params.newLatLngBoundsRects_padLeft, params.newLatLngBoundsRects_padRight, params.newLatLngBoundsRects_padTop, params.newLatLngBoundsRects_padBom, false, 0, (TencentMap.CancelableCallback) null);
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo171281a(CameraUpdate cameraUpdate, long j, TencentMap.CancelableCallback cancelableCallback) {
        CamerParameter params;
        TencentMap.CancelableCallback cancelableCallback2 = cancelableCallback;
        if (cameraUpdate == null || (params = cameraUpdate.getParams()) == null) {
            return -1;
        }
        long j2 = j < 0 ? 0 : j;
        switch (params.iCamerType) {
            case 0:
                m156013a(true, j2, cancelableCallback2);
                return 0;
            case 1:
                m156018b(true, j2, cancelableCallback2);
                return 0;
            case 2:
                m156007a(params.scrollBy_xPixel, params.scrollBy_yPixel, true, j2, cancelableCallback);
                return 0;
            case 3:
                mo171654a(params.zoomTo_zoom, true, j2, cancelableCallback);
                return 0;
            case 4:
                m156017b(params.zoomBy_amount, true, j2, cancelableCallback);
                return 0;
            case 5:
                float f = params.zoomBy_Point_amount;
                Point point = params.zoomBy_Point_focus;
                m156006a(f, (float) point.x, (float) point.y, true, j2, cancelableCallback);
                return 0;
            case 6:
                m156012a(params.newCameraPosition_cameraPosition, true, j2, cancelableCallback);
                return 0;
            case 7:
                LatLng latLng = params.newLatLng_latLng;
                m156004a(latLng.latitude, latLng.longitude, true, j2, cancelableCallback);
                return 0;
            case 8:
                LatLng latLng2 = params.newLatLngZoom_latLng;
                m156003a(latLng2.latitude, latLng2.longitude, params.newLatLngZoom_zoom, true, j2, cancelableCallback);
                return 0;
            case 9:
                return m155999a(params.newLatLngBounds_bounds, params.newLatLngBounds_padding, true, j2, cancelableCallback);
            case 10:
                LatLngBounds latLngBounds = params.newLatLngBounds_dimension_bounds;
                int i = params.newLatLngBounds_dimension_padding;
                return m155998a(latLngBounds, i, i, i, i, true, j2, cancelableCallback);
            case 11:
                return m155998a(params.newLatLngBounds_dimension_bounds, params.newLatLngBoundsRects_padLeft, params.newLatLngBoundsRects_padRight, params.newLatLngBoundsRects_padTop, params.newLatLngBoundsRects_padBom, true, j2, cancelableCallback);
            case 12:
                m156016b(params.rotateto_rotate, params.rotateto_skew, true, j2, cancelableCallback);
                return 0;
            case 13:
                return m156000a(m156015b(params.elements), params.newLatLngBoundsRects_padLeft, params.newLatLngBoundsRects_padRight, params.newLatLngBoundsRects_padTop, params.newLatLngBoundsRects_padBom, true, j2, cancelableCallback);
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public final void mo171291a(int i) {
        int f = mo171336f();
        this.f339782u = i;
        if (i != f && f != 1011 && f != 1008) {
            C114129qx qxVar = this.f339766e;
            if (qxVar != null) {
                C114128qw a = qxVar.mo172746a(i);
                if (a != null) {
                    i = a.f341611a;
                    C113792gv gvVar = this.f339763b.f342647aD.f339861d;
                    if (gvVar != null) {
                        gvVar.mo172170q().mo172140a(a.f341612b);
                    }
                } else if (i >= 1000) {
                    i -= 1000;
                } else if (i > 8 && i < 989) {
                    i += 11;
                }
            }
            this.f339763b.f342647aD.mo172451c(i);
            C113798hb.m157098o();
        }
    }

    /* renamed from: a */
    public final void mo171316a(boolean z) {
        VectorMap vectorMap = (VectorMap) this.f339763b.f339878e_;
        if (z) {
            vectorMap.mo173458b(true);
        } else {
            vectorMap.mo173458b(false);
        }
    }

    /* renamed from: a */
    public final void mo171300a(TencentMap.OnMapClickListener onMapClickListener) {
        this.f339763b.f342592s = onMapClickListener;
    }

    /* renamed from: a */
    public final void mo171302a(TencentMap.OnMapLongClickListener onMapLongClickListener) {
        this.f339763b.f342595v = onMapLongClickListener;
    }

    /* renamed from: a */
    public final void mo171295a(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        if (this.f339763b != null) {
            this.f339763b.f342524G = onCameraChangeListener;
        }
    }

    /* renamed from: a */
    public final void mo171305a(TencentMap.OnScaleViewChangedListener onScaleViewChangedListener) {
        if (this.f339763b != null) {
            this.f339763b.f342523F = onScaleViewChangedListener;
        }
    }

    /* renamed from: a */
    public final void mo171297a(TencentMap.OnDismissCallback onDismissCallback) {
        this.f339763b.f342596w = onDismissCallback;
    }

    /* renamed from: a */
    public final void mo171308a(LatLng latLng, float f, float f2) {
        mo171310a(latLng, f, f2, 0.0f, true);
    }

    /* renamed from: a */
    public final void mo171310a(LatLng latLng, float f, float f2, float f3, boolean z) {
        C114211sn snVar = new C114211sn();
        snVar.mo172886b((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
        snVar.mo172882a(f3);
        snVar.mo172887c(f);
        snVar.mo172888d(f2);
        snVar.f341970a = this.f339771j;
        snVar.f342000g = true;
        snVar.mo172884a(1000);
        if (z) {
            snVar.mo172883a(this.f339763b.f342529L, this.f339763b.f342530M);
        } else {
            snVar.mo172883a(this.f339763b.f342531N, this.f339763b.f342532O);
        }
        ((VectorMap) this.f339763b.f339878e_).mo173497w();
        ((VectorMap) this.f339763b.f339878e_).mo173442a((C113831iz) snVar);
    }

    /* renamed from: a */
    public final float mo171276a(LatLng latLng, LatLng latLng2) {
        return mo171275a(0, 0, 0, 0, latLng, latLng2, (LatLng) null);
    }

    /* renamed from: a */
    public final void mo171293a(Handler handler, Bitmap.Config config, int i) {
        C114322sx sxVar = this.f339763b;
        sxVar.f342526I = handler;
        sxVar.f342528K = config;
        if (i > 0) {
            sxVar.f342527J = SystemClock.elapsedRealtime() + ((long) i);
        } else {
            sxVar.f342527J = MAlarmHandler.NEXT_FIRE_INTERVAL;
        }
        sxVar.mo171544H();
        sxVar.mo171542F();
    }

    /* renamed from: a */
    public final String mo171287a(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return ((VectorMap) this.f339763b.f339878e_).f342909o.mo172422a(GeoPoint.from(latLng));
    }

    /* renamed from: a */
    public final void mo171312a(TencentMapGestureListener tencentMapGestureListener) {
        if (this.f339763b != null) {
            C114322sx sxVar = this.f339763b;
            if (sxVar.f342656ax == null) {
                sxVar.f342656ax = new TencentMapGestureListenerList();
            }
            sxVar.f342656ax.addListener(tencentMapGestureListener);
        }
    }

    /* renamed from: a */
    public final void mo171289a(float f, float f2) {
        if (this.f339763b != null) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            this.f339763b.mo171587c((int) (((float) this.f339763b.f342569al) * f), (int) (((float) this.f339763b.f342570am) * f2));
            this.f339763b.f342533P = f;
            this.f339763b.f342534Q = f2;
        }
    }

    /* renamed from: a */
    public final void mo171292a(int i, int i2) {
        if (this.f339763b != null) {
            this.f339763b.mo171555a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo171296a(TencentMap.OnCompassClickedListener onCompassClickedListener) {
        if (this.f339763b != null) {
            this.f339763b.f342521D = onCompassClickedListener;
        }
    }

    /* renamed from: a */
    public final float mo171652a(float f, int i, int i2, int i3, int i4, LatLng latLng, LatLng latLng2) {
        int i5 = this.f339763b.f342569al;
        int i6 = this.f339763b.f342570am;
        if (i5 == 0 || i6 == 0 || latLng == null || latLng2 == null) {
            return 0.0f;
        }
        C113732fo a = this.f339770i.mo172026a(this.f339764c, latLng);
        C113732fo a2 = this.f339770i.mo172026a(this.f339764c, latLng2);
        double d = a2.f340215a - a.f340215a;
        double d2 = 0.0d;
        if (d < 0.0d) {
            d = Math.abs(d);
        }
        double d3 = a2.f340216b - a.f340216b;
        if (d3 < 0.0d) {
            d3 = Math.abs(d3);
        }
        double d4 = d * 1.0d;
        double d5 = d3 * 1.0d;
        int i7 = (i5 - i) - i2;
        int i8 = (i6 - i3) - i4;
        if (f == 90.0f) {
            f = 89.0f;
        }
        int cos = (int) (((double) i8) / Math.cos((((double) f) * 3.141592653589793d) / 180.0d));
        if (i7 <= 0) {
            i7 = 1;
        }
        if (cos <= 0) {
            cos = 1;
        }
        double log = Math.log(d4 / ((double) i7)) / Math.log(2.0d);
        double log2 = Math.log(d5 / ((double) cos)) / Math.log(2.0d);
        if (log < 0.0d) {
            log = 0.0d;
        }
        if (log2 >= 0.0d) {
            d2 = log2;
        }
        return (float) (20.0d - Math.max(log, d2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        if ((r7 + r9) <= com.tencent.mapsdk.internal.C113801hf.m157142c(r10)) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo171653a(int r6, int r7, int r8, int r9, boolean r10) {
        /*
            r5 = this;
            com.tencent.mapsdk.internal.sx r0 = r5.f339763b
            M r0 = r0.f339878e_
            com.tencent.mapsdk.vector.VectorMap r0 = (com.tencent.mapsdk.vector.VectorMap) r0
            com.tencent.mapsdk.internal.mq r0 = r0.f342909o
            com.tencent.mapsdk.internal.ad r0 = r0.f340901i
            r0.f339670H = r6
            r0.f339671I = r7
            r0.f339672J = r8
            r0.f339673K = r9
            android.graphics.Rect r1 = r0.f339665C
            r2 = 0
            r3 = -1
            if (r1 == 0) goto L_0x0047
            int r1 = r1.width()
            if (r1 <= 0) goto L_0x0047
            android.graphics.Rect r1 = r0.f339665C
            int r1 = r1.height()
            if (r1 <= 0) goto L_0x0047
            int r1 = r6 + r8
            android.graphics.Rect r4 = r0.f339665C
            int r4 = r4.width()
            if (r1 > r4) goto L_0x006b
            int r1 = r7 + r9
            android.graphics.Rect r4 = r0.f339665C
            int r4 = r4.height()
            if (r1 <= r4) goto L_0x003b
            goto L_0x006b
        L_0x003b:
            android.graphics.PointF r1 = r0.mo171197a()
            float r3 = r1.x
            float r1 = r1.y
            r0.mo171203a((float) r3, (float) r1, (boolean) r10)
            goto L_0x006e
        L_0x0047:
            com.tencent.mapsdk.internal.ad$1 r1 = new com.tencent.mapsdk.internal.ad$1
            r1.<init>(r10)
            r0.mo171218a((com.tencent.mapsdk.internal.C114020os) r1)
            com.tencent.mapsdk.internal.be r10 = r0.f339696z
            boolean r0 = r10 instanceof com.tencent.mapsdk.internal.C113961mq
            if (r0 == 0) goto L_0x006d
            com.tencent.mapsdk.internal.mq r10 = (com.tencent.mapsdk.internal.C113961mq) r10
            android.content.Context r10 = r10.getContext()
            int r0 = r6 + r8
            int r1 = com.tencent.mapsdk.internal.C113801hf.m157140b(r10)
            if (r0 > r1) goto L_0x006b
            int r0 = r7 + r9
            int r10 = com.tencent.mapsdk.internal.C113801hf.m157142c(r10)
            if (r0 <= r10) goto L_0x006e
        L_0x006b:
            r2 = -1
            goto L_0x006e
        L_0x006d:
            r2 = -2
        L_0x006e:
            if (r2 != 0) goto L_0x0078
            r5.f339778q = r6
            r5.f339779r = r7
            r5.f339780s = r8
            r5.f339781t = r9
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113540bh.mo171653a(int, int, int, int, boolean):int");
    }

    /* renamed from: a */
    public final float mo171279a(LatLngBounds latLngBounds, float f, int i, boolean z) {
        int i2;
        if (latLngBounds == null) {
            return 0.0f;
        }
        if (z) {
            i2 = this.f339763b.f342530M;
        } else {
            i2 = this.f339763b.f342532O;
        }
        float f2 = !z ? 0.0f : f;
        if (i2 < 0) {
            i2 = this.f339763b.f342569al / 2;
        }
        return mo171652a(f2, 0, 0, i, this.f339763b.f342570am - i2, latLngBounds.southwest, latLngBounds.northeast);
    }

    /* renamed from: a */
    public final float mo171278a(LatLng latLng, LatLng latLng2, float f, int i, boolean z) {
        if (latLng == null || latLng2 == null) {
            return 0.0f;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(latLng);
        builder.include(latLng2);
        return mo171652a(!z ? 0.0f : f, 0, 0, i, 0, builder.build().southwest, builder.build().northeast);
    }

    /* renamed from: a */
    public final float mo171277a(LatLng latLng, LatLng latLng2, float f, int i, int i2, int i3, int i4, boolean z) {
        LatLng latLng3 = latLng2;
        if (latLng == null || latLng3 == null) {
            return 0.0f;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(latLng);
        builder.include(latLng2);
        return mo171652a(!z ? 0.0f : f, i, i2, i3, i4, builder.build().southwest, builder.build().northeast);
    }

    /* renamed from: a */
    public final float mo171275a(int i, int i2, int i3, int i4, LatLng latLng, LatLng latLng2, LatLng latLng3) {
        return this.f339770i.mo172023a(latLng, latLng2, i, i2, i3, i4, latLng3);
    }

    /* renamed from: a */
    public final CameraPosition mo171283a(List<C113709et> list, List<LatLng> list2, int i, int i2, int i3, int i4) {
        List<LatLng> list3 = list2;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (this.f339763b.f342569al == 0 || this.f339763b.f342570am == 0) {
            int b = C113801hf.m157140b(this.f339764c);
            int c = C113801hf.m157142c(this.f339764c);
            if (i5 + i6 > b || i7 + i8 > c) {
                return null;
            }
        } else if (i5 + i6 > this.f339763b.f342569al || i7 + i8 > this.f339763b.f342570am) {
            return null;
        }
        C113707es v = ((VectorMap) this.f339763b.f339878e_).getProjection();
        if (v == null) {
            return null;
        }
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C113709et next : list) {
                if (!(next == null || next.getGroupBounds() == null)) {
                    arrayList.addAll(next.getGroupBounds());
                }
            }
            Rect rect = new Rect(i5, i7, i6, i8);
            this.f339768g = null;
            v.mo172030a(arrayList, GeoPoint.from(list2), rect, new C113707es.C113708a() {
                /* renamed from: a */
                public final void mo171665a(float f, GeoPoint geoPoint) {
                    LatLng a = C113883ke.m157466a(geoPoint);
                    double log = 20.0d - (Math.log((double) (1.0f / f)) / Math.log(2.0d));
                    if (log < 0.0d) {
                        log = 0.0d;
                    }
                    C113540bh bhVar = C113540bh.this;
                    bhVar.f339768g = new CameraPosition(a, (float) log, ((VectorMap) bhVar.f339763b.f339878e_).mo173494u(), ((VectorMap) C113540bh.this.f339763b.f339878e_).mo173493t());
                    synchronized (C113540bh.this.f339769h) {
                        C113540bh.this.f339769h.notifyAll();
                    }
                }
            });
            synchronized (this.f339769h) {
                try {
                    this.f339769h.wait(1000);
                } catch (InterruptedException e) {
                    C113889km.m157549c(Log.getStackTraceString(e));
                    Thread.currentThread().interrupt();
                }
            }
            return this.f339768g;
        } else if (list3 == null || list2.isEmpty()) {
            return null;
        } else {
            if (list2.size() == 1) {
                return new CameraPosition(list3.get(0), ((VectorMap) this.f339763b.f339878e_).f342909o.f340912t.mo173058a(), ((VectorMap) this.f339763b.f339878e_).mo173494u(), ((VectorMap) this.f339763b.f339878e_).mo173493t());
            }
            double d = 0.0d;
            double d2 = 0.0d;
            double d3 = 0.0d;
            double d4 = 0.0d;
            double d5 = 0.0d;
            for (LatLng next2 : list2) {
                if (next2 != null) {
                    if (d2 == d) {
                        d2 = next2.latitude;
                    }
                    if (d3 == d) {
                        d3 = next2.longitude;
                    }
                    double d6 = d2;
                    double d7 = d4;
                    if (d7 == d) {
                        d7 = next2.latitude;
                    }
                    double d8 = d5;
                    if (d8 == d) {
                        d8 = next2.longitude;
                    }
                    d5 = d8;
                    double d9 = next2.latitude;
                    double d15 = d6;
                    if (d9 < d15) {
                        d15 = d9;
                    }
                    if (d9 > d7) {
                        d7 = d9;
                    }
                    double d16 = next2.longitude;
                    if (d16 < d3) {
                        d3 = d16;
                    }
                    if (d16 > d5) {
                        d5 = d16;
                    }
                    int i9 = i;
                    int i15 = i2;
                    d4 = d7;
                    d2 = d15;
                } else {
                    double d17 = d4;
                    double d18 = d5;
                    int i16 = i;
                    int i17 = i2;
                    d2 = d2;
                    d = 0.0d;
                }
            }
            LatLng latLng = new LatLng(d2, d3);
            LatLng latLng2 = new LatLng(d4, d5);
            LatLng latLng3 = new LatLng(0.0d, 0.0d);
            float a = mo171275a(i, i2, i3, i4, latLng, latLng2, latLng3);
            if (a < 0.0f) {
                return null;
            }
            return new CameraPosition(latLng3, a, ((VectorMap) this.f339763b.f339878e_).mo173494u(), ((VectorMap) this.f339763b.f339878e_).mo173493t());
        }
    }

    /* renamed from: a */
    public final CameraPosition mo171284a(List<C113709et> list, List<LatLng> list2, int i, int i2, int i3, int i4, TencentMap.AsyncOperateCallback<CameraPosition> asyncOperateCallback) {
        List<LatLng> list3 = list2;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        final TencentMap.AsyncOperateCallback<CameraPosition> asyncOperateCallback2 = asyncOperateCallback;
        if (this.f339763b.f342569al == 0 || this.f339763b.f342570am == 0) {
            C113801hf.m157140b(this.f339764c);
            C113801hf.m157142c(this.f339764c);
        } else if (i5 + i6 > this.f339763b.f342569al || i7 + i8 > this.f339763b.f342570am) {
            if (asyncOperateCallback2 != null) {
                asyncOperateCallback2.onOperateFinished(null);
            }
            return null;
        }
        C113707es v = ((VectorMap) this.f339763b.f339878e_).getProjection();
        if (v == null) {
            return null;
        }
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C113709et next : list) {
                if (!(next == null || next.getGroupBounds() == null)) {
                    arrayList.addAll(next.getGroupBounds());
                }
            }
            Rect rect = new Rect(i, i7, i6, i8);
            this.f339768g = null;
            v.mo172030a(arrayList, GeoPoint.from(list2), rect, new C113707es.C113708a() {
                /* renamed from: a */
                public final void mo171665a(float f, GeoPoint geoPoint) {
                    LatLng a = C113883ke.m157466a(geoPoint);
                    double log = 20.0d - (Math.log((double) (1.0f / f)) / Math.log(2.0d));
                    if (log < 0.0d) {
                        log = 0.0d;
                    }
                    C113540bh bhVar = C113540bh.this;
                    bhVar.f339768g = new CameraPosition(a, (float) log, ((VectorMap) bhVar.f339763b.f339878e_).mo173494u(), ((VectorMap) C113540bh.this.f339763b.f339878e_).mo173493t());
                    TencentMap.AsyncOperateCallback asyncOperateCallback = asyncOperateCallback2;
                    if (asyncOperateCallback != null) {
                        asyncOperateCallback.onOperateFinished(C113540bh.this.f339768g);
                    }
                }
            });
            return null;
        } else if (list3 == null || list2.isEmpty()) {
            if (asyncOperateCallback2 != null) {
                asyncOperateCallback2.onOperateFinished(null);
            }
            return null;
        } else if (list2.size() == 1) {
            CameraPosition cameraPosition = new CameraPosition(list3.get(0), ((VectorMap) this.f339763b.f339878e_).mo173491s(), ((VectorMap) this.f339763b.f339878e_).mo173494u(), ((VectorMap) this.f339763b.f339878e_).mo173493t());
            if (asyncOperateCallback2 != null) {
                asyncOperateCallback2.onOperateFinished(cameraPosition);
            }
            return cameraPosition;
        } else {
            Iterator<LatLng> it = list2.iterator();
            double d = 0.0d;
            double d2 = 0.0d;
            double d3 = 0.0d;
            double d4 = 0.0d;
            double d5 = 0.0d;
            while (it.hasNext()) {
                LatLng next2 = it.next();
                if (next2 != null) {
                    if (d2 == d) {
                        d2 = next2.latitude;
                    }
                    if (d3 == d) {
                        d3 = next2.longitude;
                    }
                    double d6 = d2;
                    double d7 = d4;
                    if (d7 == d) {
                        d7 = next2.latitude;
                    }
                    Iterator<LatLng> it4 = it;
                    double d8 = d5;
                    if (d8 == d) {
                        d8 = next2.longitude;
                    }
                    d5 = d8;
                    double d9 = next2.latitude;
                    double d15 = d6;
                    if (d9 < d15) {
                        d15 = d9;
                    }
                    if (d9 > d7) {
                        d7 = d9;
                    }
                    double d16 = next2.longitude;
                    if (d16 < d3) {
                        d3 = d16;
                    }
                    if (d16 > d5) {
                        d5 = d16;
                    }
                    int i9 = i;
                    d4 = d7;
                    it = it4;
                    d2 = d15;
                } else {
                    double d17 = d4;
                    Iterator<LatLng> it5 = it;
                    double d18 = d5;
                    it = it5;
                    int i15 = i;
                    d2 = d2;
                    d = 0.0d;
                }
            }
            LatLng latLng = new LatLng(d2, d3);
            LatLng latLng2 = new LatLng(d4, d5);
            LatLng latLng3 = new LatLng(0.0d, 0.0d);
            float a = mo171275a(i, i2, i3, i4, latLng, latLng2, latLng3);
            if (a < 0.0f) {
                if (asyncOperateCallback2 != null) {
                    asyncOperateCallback2.onOperateFinished(null);
                }
                return null;
            }
            CameraPosition cameraPosition2 = new CameraPosition(latLng3, a, ((VectorMap) this.f339763b.f339878e_).mo173494u(), ((VectorMap) this.f339763b.f339878e_).mo173493t());
            if (asyncOperateCallback2 != null) {
                asyncOperateCallback2.onOperateFinished(cameraPosition2);
            }
            return cameraPosition2;
        }
    }

    /* renamed from: a */
    public final void mo171290a(float f, float f2, boolean z) {
        if (this.f339763b != null) {
            C113503ad adVar = ((VectorMap) this.f339763b.f339878e_).f342909o.f340901i;
            adVar.f339676N = true;
            adVar.mo171203a(f, f2, z);
        }
    }

    /* renamed from: a */
    public final void mo171309a(LatLng latLng, float f, float f2, float f3) {
        C114211sn snVar = new C114211sn();
        snVar.mo172886b((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
        snVar.mo172882a(f3);
        snVar.mo172887c(f);
        snVar.mo172888d(f2);
        snVar.f341970a = this.f339771j;
        snVar.f342000g = true;
        snVar.mo172884a(1000);
        ((VectorMap) this.f339763b.f339878e_).mo173497w();
        ((VectorMap) this.f339763b.f339878e_).mo173442a((C113831iz) snVar);
    }

    /* renamed from: a */
    private void m156008a(int i, int i2, int i3, int i4) {
        C114216sq sqVar;
        C113961mq mqVar = ((VectorMap) this.f339763b.f339878e_).f342909o;
        if (mqVar != null && (sqVar = mqVar.f340899g) != null) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(i2, i, i3, i4) {
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
    private void m156005a(float f, float f2, float f3) {
        C114322sx sxVar = this.f339763b;
        C113961mq mqVar = sxVar.f342647aD;
        if (mqVar != null) {
            float f4 = mqVar.f340901i.f339663A.f342783b.f342820p;
            float c = C114337tf.m160331c(f3);
            boolean z = ((double) Math.abs(f4 - c)) > 1.0E-4d;
            sxVar.f342649aF = 0;
            C113865kb.m157399a((Runnable) new Runnable((f2 - sxVar.f342648aE) / 10.0f, f, f2, f3, z, c) {
                public final void run() {
                    C114337tf tfVar = C114337tf.this;
                    float unused = tfVar.f342648aE = tfVar.f342648aE + r3;
                    C114337tf tfVar2 = C114337tf.this;
                    tfVar2.f342647aD.f340901i.mo171223b(r4, tfVar2.f342648aE, true);
                    if (C114337tf.m160329b(C114337tf.this) < 10) {
                        C113865kb.m157400a(this, 16);
                        return;
                    }
                    C114337tf.this.f342647aD.f340901i.mo171223b(r4, r5, true);
                    float f = r6;
                    if (f >= 3.0f && f <= 20.0f) {
                        if (r7) {
                            C114337tf.this.f342647aD.f340901i.mo171207a((int) r6, (Runnable) new Runnable() {
                                public final void run() {
                                    C114337tf.this.f342647aD.f340901i.mo171202a(r8);
                                }
                            });
                            return;
                        }
                        C114337tf.this.f342647aD.f340901i.mo171202a(r8);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo171301a(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.f339763b.f342655aw.add(onMapLoadedCallback);
    }

    /* renamed from: a */
    private float m155997a(double d, LatLng latLng) {
        C113707es esVar;
        if (latLng == null) {
            return 0.0f;
        }
        GeoPoint geoPoint = new GeoPoint((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
        C113961mq mqVar = ((VectorMap) this.f339763b.f339878e_).f342909o;
        if (!(mqVar.f340912t == null || (esVar = mqVar.f340906n) == null)) {
            double metersPerPixel = esVar.metersPerPixel(((double) geoPoint.getLatitudeE6()) / 1000000.0d);
            if (metersPerPixel != 0.0d) {
                return (float) (d / metersPerPixel);
            }
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final List<Rect> mo171288a(List<String> list) {
        C114105qf qfVar;
        ArrayList arrayList = null;
        if (list != null && !list.isEmpty()) {
            if (this.f339763b == null) {
                return null;
            }
            arrayList = new ArrayList(list.size());
            C113707es v = ((VectorMap) this.f339763b.f339878e_).getProjection();
            for (String c : list) {
                C114027oy c2 = this.f339763b.mo171586c(c);
                if (c2 != null) {
                    if (c2 instanceof C114030pa) {
                        arrayList.add(((C114030pa) c2).getScreenBound(v));
                    } else if ((c2 instanceof C114036pc) && (qfVar = ((C114036pc) c2).f341190a) != null) {
                        arrayList.add(qfVar.mo171426a(v));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo171307a(Language language) {
        VectorMap vectorMap;
        if (this.f339763b != null && (vectorMap = (VectorMap) this.f339763b.f339878e_) != null) {
            C113961mq mqVar = vectorMap.f342909o;
            if (mqVar.f340917y == null) {
                mqVar.f340917y = new C113961mq.C113965c();
            }
            C113961mq.C113965c cVar = mqVar.f340917y;
            if (C113961mq.this.f340899g != null) {
                C114216sq a = C113961mq.this.f340899g;
                a.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(language.ordinal()) {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (C114216sq.this.f342024e != 0) {
                            C114216sq.this.f342023d.nativeSetLanguage(C114216sq.this.f342024e, r2);
                        }
                    }
                });
                boolean unused = C113961mq.this.f340914v = true;
                C113961mq.this.f340914v = true;
                cVar.mo172465a(language);
            }
        }
    }

    /* renamed from: a */
    public final void mo171294a(C113718fc fcVar) {
        VectorMap vectorMap;
        if (this.f339763b != null && (vectorMap = (VectorMap) this.f339763b.f339878e_) != null) {
            vectorMap.f342909o.mo172430a(fcVar);
        }
    }

    /* renamed from: a */
    public final void mo171315a(List<MapRouteSection> list, List<LatLng> list2) {
        VectorMap vectorMap;
        if (this.f339763b != null && (vectorMap = (VectorMap) this.f339763b.f339878e_) != null) {
            List<GeoPoint> from = GeoPoint.from(list2);
            C113961mq mqVar = vectorMap.f342909o;
            if (mqVar.f340918z == null) {
                mqVar.f340918z = new C113961mq.C113966d();
            }
            C113961mq.C113966d dVar = mqVar.f340918z;
            dVar.f340930a = list;
            dVar.f340931b = from;
            C113961mq.this.f340899g.mo172919a(list, from);
        }
    }

    /* renamed from: a */
    public final void mo171304a(TencentMap.OnMarkerClickListener onMarkerClickListener) {
        this.f339763b.f342598y = onMarkerClickListener;
    }

    /* renamed from: a */
    public final void mo171299a(TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        this.f339763b.f342599z = onInfoWindowClickListener;
    }

    /* renamed from: a */
    public final void mo171298a(TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        this.f339763b.mo171568a(onIndoorStateChangeListener);
    }

    /* renamed from: a */
    public final void mo171303a(TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        this.f339763b.f342518A = onMapPoiClickListener;
    }

    /* renamed from: a */
    public final void mo171313a(String str) {
        C113961mq mqVar;
        if (this.f339763b != null && (mqVar = this.f339763b.f342647aD) != null) {
            C114216sq sqVar = mqVar.f340899g;
            if (sqVar != null) {
                sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(str) {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (C114216sq.this.f342024e != 0) {
                            C114216sq.this.f342023d.nativeMapLoadKMLFile(C114216sq.this.f342024e, r2);
                        }
                    }
                });
            }
            mqVar.f340914v = true;
        }
    }

    /* renamed from: a */
    public final TileOverlay mo171286a(TileOverlayOptions tileOverlayOptions) {
        C114117qo qoVar = this.f339775n;
        if (qoVar == null) {
            return null;
        }
        return qoVar.mo172738b(tileOverlayOptions);
    }

    /* renamed from: a */
    public final CustomLayer mo171285a(CustomLayerOptions customLayerOptions) {
        C114081ps psVar = this.f339767f;
        if (psVar == null || this.f339775n == null || psVar.f341366a == null) {
            return null;
        }
        customLayerOptions.getLayerId();
        C113896kq.m157668c(C0949kl.f2231a);
        C114117qo qoVar = psVar.f341366a;
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        String str = "custom_layer_" + C113904kw.m157758a(customLayerOptions.getLayerId());
        tileOverlayOptions.diskCacheDir(str);
        C114084pt a = psVar.mo172665a(customLayerOptions.getLayerId());
        C113896kq.m157655a(C0949kl.f2231a, XWalkReaderBasePlugin.PARAM_KEY_CACHE_DIR, (Object) str);
        if (a != null) {
            C113896kq.m157655a(C0949kl.f2231a, ProviderConstants.API_COLNAME_FEATURE_VERSION, (Object) a.f341379b);
            C113896kq.m157655a(C0949kl.f2231a, "minZoom", (Object) Integer.valueOf(a.f341381d));
            C113896kq.m157655a(C0949kl.f2231a, "maxZoom", (Object) Integer.valueOf(a.f341380c));
            C113896kq.m157655a(C0949kl.f2231a, "layerId", (Object) a.f341378a);
            tileOverlayOptions.tileProvider(new UrlTileProvider(a) {
                public final URL getTileUrl(int i, int i2, int i3) {
                    C114084pt ptVar = r5;
                    if (i3 <= ptVar.f341380c && i3 >= ptVar.f341381d) {
                        try {
                            return new URL(r5.mo172669a(i, i2, i3));
                        } catch (MalformedURLException unused) {
                        }
                    }
                    return null;
                }
            });
            tileOverlayOptions.versionInfo(a.f341379b);
        }
        C114110qj a2 = qoVar.mo172733a(tileOverlayOptions);
        C114084pt a3 = psVar.mo172665a(customLayerOptions.getLayerId());
        if (!(a2 == null || a3 == null)) {
            if (a3.f341382e) {
                a2.mo172013e();
                a3.f341382e = false;
            }
            a2.mo172728a(a3.f341381d, a3.f341380c);
        }
        psVar.f341366a.f341590h.f339861d.mo172156c().f340447a++;
        C113896kq.m157674e(C0949kl.f2231a);
        return new C113526au(a2);
    }

    /* renamed from: a */
    public final void mo171314a(String str, String str2) {
        C113961mq mqVar;
        if (this.f339763b != null && this.f339763b.f339878e_ != null && (mqVar = this.f339763b.f342647aD) != null) {
            mqVar.mo172438a(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo171311a(LatLngBounds latLngBounds, int i) {
        if (this.f339763b != null && this.f339763b.f339878e_ != null) {
            this.f339763b.f342647aD.mo172436a(latLngBounds, i);
        }
    }

    /* renamed from: a */
    public final void mo171306a(TencentMap.OnTrafficEventClickListener onTrafficEventClickListener) {
        if (this.f339763b != null && this.f339763b.f339878e_ != null) {
            this.f339763b.f342576as = onTrafficEventClickListener;
        }
    }
}
