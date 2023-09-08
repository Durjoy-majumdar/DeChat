package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONArray;

/* renamed from: com.tencent.mapsdk.internal.ab */
public final class C113497ab implements C113722fg, C114014ok {

    /* renamed from: a */
    public C113955mh f339620a;

    /* renamed from: b */
    public C113735fr f339621b;

    /* renamed from: c */
    public int f339622c = C113501a.f339638a;

    /* renamed from: d */
    public VectorMap f339623d;

    /* renamed from: e */
    public C113961mq f339624e;

    /* renamed from: f */
    public boolean f339625f;

    /* renamed from: g */
    public IndoorBuilding f339626g;

    /* renamed from: h */
    private boolean f339627h;

    /* renamed from: i */
    private C114322sx f339628i;

    /* renamed from: j */
    private TencentMap.OnIndoorStateChangeListener f339629j;

    /* renamed from: com.tencent.mapsdk.internal.ab$3 */
    public static /* synthetic */ class C1135003 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f339637a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        static {
            /*
                int[] r0 = com.tencent.mapsdk.internal.C113497ab.C113501a.m155531a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f339637a = r0
                r1 = 1
                int r2 = com.tencent.mapsdk.internal.C113497ab.C113501a.f339639b     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = f339637a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.tencent.mapsdk.internal.C113497ab.C113501a.f339638a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = f339637a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.tencent.mapsdk.internal.C113497ab.C113501a.f339640c     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r1 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113497ab.C1135003.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ab$a */
    public enum C113501a {
        ;
        

        /* renamed from: a */
        public static final int f339638a = 1;

        /* renamed from: b */
        public static final int f339639b = 2;

        /* renamed from: c */
        public static final int f339640c = 3;

        /* access modifiers changed from: public */
        static {
            f339641d = new int[]{1, 2, 3};
        }

        /* renamed from: a */
        public static int[] m155531a() {
            return (int[]) f339641d.clone();
        }
    }

    public C113497ab(C114322sx sxVar, String str) {
        JSONArray jSONArray = null;
        this.f339629j = null;
        this.f339623d = null;
        this.f339625f = false;
        this.f339626g = null;
        this.f339628i = sxVar;
        if (sxVar != null) {
            if (str == null) {
                this.f339620a = C113958mk.m157962a(sxVar.mo171543G());
            } else {
                this.f339620a = C113957mj.m157958a(sxVar.mo171543G(), str);
            }
            C114322sx sxVar2 = this.f339628i;
            this.f339623d = (VectorMap) sxVar2.f339878e_;
            this.f339624e = sxVar2.f342647aD;
            int b = this.f339620a.mo172397b(C0939el.f2168B);
            int b2 = this.f339620a.mo172397b(C0939el.f2169C);
            String a = this.f339620a.mo172391a(C0939el.f2170D);
            try {
                if (!TextUtils.isEmpty(a)) {
                    jSONArray = new JSONArray(a);
                }
            } catch (Exception e) {
                C113889km.m157539a(C0949kl.f2244n, "indoor auth init failed", (Throwable) e);
            }
            if (!(b == -1 || b2 == -1 || jSONArray == null)) {
                this.f339621b = new C113735fr(b, b2, jSONArray);
            }
            VectorMap vectorMap = this.f339623d;
            if (vectorMap != null) {
                vectorMap.mo171700a(mo171187a());
                if (b2 == 1) {
                    this.f339623d.mo173445a(mo171192b());
                }
            }
            mo171190a(false);
        }
        VectorMap vectorMap2 = this.f339623d;
        if (vectorMap2 != null) {
            vectorMap2.mo173440a((C113722fg) this);
            this.f339623d.f342909o.mo172434a((C114014ok) this);
            this.f339629j = new C114319su(this.f339628i);
        }
    }

    /* renamed from: d */
    private void m155513d() {
        int b = this.f339620a.mo172397b(C0939el.f2168B);
        int b2 = this.f339620a.mo172397b(C0939el.f2169C);
        String a = this.f339620a.mo172391a(C0939el.f2170D);
        JSONArray jSONArray = null;
        try {
            if (!TextUtils.isEmpty(a)) {
                jSONArray = new JSONArray(a);
            }
        } catch (Exception e) {
            C113889km.m157539a(C0949kl.f2244n, "indoor auth init failed", (Throwable) e);
        }
        if (!(b == -1 || b2 == -1 || jSONArray == null)) {
            this.f339621b = new C113735fr(b, b2, jSONArray);
        }
        VectorMap vectorMap = this.f339623d;
        if (vectorMap != null) {
            vectorMap.mo171700a(mo171187a());
            if (b2 == 1) {
                this.f339623d.mo173445a(mo171192b());
            }
        }
    }

    /* renamed from: e */
    private boolean m155514e() {
        C113735fr frVar = this.f339621b;
        return frVar != null && frVar.mo172096a();
    }

    /* renamed from: f */
    private boolean m155515f() {
        return this.f339625f;
    }

    /* renamed from: g */
    private void m155516g() {
        M m;
        C114322sx sxVar = this.f339628i;
        if (sxVar != null && (m = sxVar.f339878e_) != null && !this.f339625f) {
            VectorMap vectorMap = (VectorMap) m;
            int min = Math.min(20, sxVar.f342583j);
            if (vectorMap.f342909o.f340912t.mo173058a() < ((float) min)) {
                vectorMap.mo173455b(min);
            }
        }
    }

    /* renamed from: h */
    private void m155517h() {
        IndoorBuilding indoorBuilding = this.f339626g;
        if (indoorBuilding != null) {
            String buidlingId = indoorBuilding.getBuidlingId();
            int activeLevelIndex = this.f339626g.getActiveLevelIndex();
            List<IndoorLevel> levels = this.f339626g.getLevels();
            if (levels != null && activeLevelIndex < levels.size()) {
                String name = levels.get(activeLevelIndex).getName();
                if (!C40002he.m42805a(buidlingId) && !C40002he.m42805a(name)) {
                    this.f339624e.mo172438a(buidlingId, name);
                }
            }
        }
    }

    /* renamed from: i */
    private IndoorBuilding m155518i() {
        return this.f339626g;
    }

    /* renamed from: j */
    private String m155519j() {
        IndoorBuilding indoorBuilding = this.f339626g;
        if (indoorBuilding == null) {
            return null;
        }
        return indoorBuilding.getBuidlingId();
    }

    /* renamed from: k */
    private int m155520k() {
        IndoorBuilding indoorBuilding = this.f339626g;
        if (indoorBuilding == null) {
            return -1;
        }
        return indoorBuilding.getActiveLevelIndex();
    }

    /* renamed from: l */
    private String[] m155521l() {
        IndoorBuilding indoorBuilding = this.f339626g;
        if (indoorBuilding == null || indoorBuilding.getLevels() == null || this.f339626g.getLevels().isEmpty()) {
            return null;
        }
        List<IndoorLevel> levels = this.f339626g.getLevels();
        String[] strArr = new String[levels.size()];
        for (int i = 0; i < levels.size(); i++) {
            strArr[i] = levels.get(i).getName();
        }
        return strArr;
    }

    /* renamed from: m */
    private String m155522m() {
        IndoorBuilding indoorBuilding = this.f339626g;
        return indoorBuilding == null ? "" : indoorBuilding.getBuildingName();
    }

    /* renamed from: n */
    private IndoorBuilding m155523n() {
        return this.f339626g;
    }

    /* renamed from: c */
    public final void mo171193c() {
        C114322sx sxVar;
        M m;
        if (this.f339627h && (sxVar = this.f339628i) != null && (m = sxVar.f339878e_) != null) {
            GeoPoint geoPoint = new GeoPoint();
            C114216sq sqVar = ((VectorMap) m).f342909o.f340899g;
            C114096qc qcVar = (C114096qc) sqVar.mo172900a(new CallbackRunnable<C114096qc>(geoPoint) {
                /* renamed from: a */
                private C114096qc m160000a() {
                    if (0 == C114216sq.this.f342024e) {
                        return null;
                    }
                    return new C114096qc(C114216sq.this.f342023d.nativeGetActiveIndoorBuildingGUID(C114216sq.this.f342024e), C114216sq.this.f342023d.nativeGetCurIndoorName(C114216sq.this.f342024e, r2), C114216sq.this.f342023d.nativeGetIndoorFloorNames(C114216sq.this.f342024e), C114216sq.this.f342023d.nativeGetIndoorCurrentFloorId(C114216sq.this.f342024e));
                }

                public final /* synthetic */ Object run() {
                    if (0 == C114216sq.this.f342024e) {
                        return null;
                    }
                    return new C114096qc(C114216sq.this.f342023d.nativeGetActiveIndoorBuildingGUID(C114216sq.this.f342024e), C114216sq.this.f342023d.nativeGetCurIndoorName(C114216sq.this.f342024e, r2), C114216sq.this.f342023d.nativeGetIndoorFloorNames(C114216sq.this.f342024e), C114216sq.this.f342023d.nativeGetIndoorCurrentFloorId(C114216sq.this.f342024e));
                }
            }, null);
            if (qcVar != null) {
                final LatLng latLng = new LatLng((((double) geoPoint.getLatitudeE6()) * 1.0d) / 1000000.0d, (((double) geoPoint.getLongitudeE6()) * 1.0d) / 1000000.0d);
                final String str = qcVar.f341455a;
                final String str2 = qcVar.f341456b;
                final String[] strArr = qcVar.f341458d;
                final int i = qcVar.f341457c;
                C113865kb.m157399a((Runnable) new Runnable() {
                    public final void run() {
                        C113497ab.this.mo171189a(str, str2, latLng, strArr, i);
                    }
                });
            }
        }
    }

    /* renamed from: b */
    private void m155510b(boolean z) {
        int i = z ? C113501a.f339639b : C113501a.f339640c;
        this.f339622c = i;
        mo171188a(i);
    }

    /* renamed from: a */
    private void m155507a(C113735fr frVar) {
        if (frVar != null) {
            this.f339621b = frVar;
            C113889km.m157545b(C0949kl.f2236f, "IndoorAuth:".concat(String.valueOf(frVar)));
            this.f339620a.mo172393a(C0939el.f2168B, frVar.f340240c);
            this.f339620a.mo172393a(C0939el.f2169C, frVar.f340241d);
            JSONArray jSONArray = frVar.f340242e;
            if (jSONArray != null) {
                this.f339620a.mo172395a(C0939el.f2170D, jSONArray.toString());
            }
            VectorMap vectorMap = this.f339623d;
            if (vectorMap != null) {
                vectorMap.mo171700a(mo171187a());
                if (mo171187a() == 1) {
                    this.f339623d.mo173445a(mo171192b());
                }
            }
        } else {
            this.f339620a.mo172396a(new String[]{C0939el.f2168B, C0939el.f2169C, C0939el.f2170D});
        }
        if (this.f339621b == null) {
            this.f339621b = new C113735fr();
        }
        C113865kb.m157399a((Runnable) new Runnable() {
            public final void run() {
                C113497ab abVar = C113497ab.this;
                int i = abVar.f339622c;
                if (i == C113501a.f339638a) {
                    abVar.mo171190a(abVar.f339621b.mo172096a());
                } else {
                    abVar.mo171188a(i);
                }
            }
        });
    }

    /* renamed from: b */
    public final String[] mo171192b() {
        C113735fr frVar = this.f339621b;
        if (frVar != null) {
            return frVar.f340243f;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo171191b(int i) {
        C114322sx sxVar;
        if (this.f339627h && (sxVar = this.f339628i) != null && sxVar.f339878e_ != null && sxVar.f342587n != null && !this.f339625f) {
            m155516g();
        }
    }

    /* renamed from: c */
    private void m155511c(int i) {
        C113961mq mqVar = this.f339624e;
        if (mqVar != null) {
            C114216sq sqVar = mqVar.f340899g;
            if (sqVar != null) {
                sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(i) {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (0 != C114216sq.this.f342024e && C114216sq.this.f342029j != null) {
                            C114216sq.this.f342023d.nativeSetIndoorFloor(C114216sq.this.f342024e, r2);
                        }
                    }
                });
            }
            mo171193c();
        }
    }

    /* renamed from: c */
    private void m155512c(boolean z) {
        C114216sq sqVar;
        VectorMap vectorMap = this.f339623d;
        if (vectorMap != null && (sqVar = vectorMap.f342909o.f340899g) != null && sqVar.f342024e != 0) {
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

    /* renamed from: a */
    public final void mo171188a(int i) {
        int i2 = C1135003.f339637a[i - 1];
        if (i2 == 1) {
            mo171190a(true);
        } else if (i2 == 2 || i2 == 3) {
            mo171190a(false);
        }
    }

    /* renamed from: a */
    public final void mo171190a(boolean z) {
        this.f339627h = z;
        if (this.f339624e != null) {
            if (!m155514e()) {
                this.f339624e.mo172454d(false);
                return;
            }
            this.f339624e.mo172454d(z);
            if (!z && this.f339625f) {
                mo171189a((String) null, (String) null, (LatLng) null, (String[]) null, -1);
            }
        }
    }

    /* renamed from: a */
    public final int mo171187a() {
        C113735fr frVar = this.f339621b;
        return (frVar == null || !frVar.mo172097b()) ? 0 : 1;
    }

    /* renamed from: a */
    public final void mo171189a(String str, String str2, LatLng latLng, String[] strArr, int i) {
        M m;
        C114097qd qdVar;
        C114097qd qdVar2;
        C113792gv gvVar;
        C114322sx sxVar = this.f339628i;
        if (sxVar != null && (m = sxVar.f339878e_) != null) {
            VectorMap vectorMap = (VectorMap) m;
            int p = vectorMap.mo173488p();
            if (str == null || strArr == null || strArr.length <= 0 || i < 0 || p < 16) {
                m155516g();
                if (this.f339625f) {
                    this.f339625f = false;
                    this.f339626g = null;
                    C114322sx sxVar2 = this.f339628i;
                    if (!(sxVar2 == null || (qdVar = sxVar2.f342587n) == null)) {
                        qdVar.mo172694a((IndoorBuilding) null);
                    }
                    TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener = this.f339629j;
                    if (onIndoorStateChangeListener != null) {
                        onIndoorStateChangeListener.onIndoorBuildingDeactivated();
                        return;
                    }
                    return;
                }
                return;
            }
            TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener2 = this.f339629j;
            if (onIndoorStateChangeListener2 != null && !this.f339625f) {
                this.f339625f = true;
                onIndoorStateChangeListener2.onIndoorBuildingFocused();
            }
            vectorMap.mo173455b(Math.min(this.f339628i.f342583j, 22));
            if (this.f339629j != null) {
                ArrayList arrayList = new ArrayList();
                for (String indoorLevel : strArr) {
                    arrayList.add(new IndoorLevel(indoorLevel));
                }
                try {
                    IndoorBuilding indoorBuilding = this.f339626g;
                    if (indoorBuilding != null && indoorBuilding.getBuidlingId().equals(str) && this.f339626g.getActiveLevelIndex() == i) {
                        return;
                    }
                } catch (Exception unused) {
                }
                IndoorBuilding indoorBuilding2 = this.f339626g;
                if ((indoorBuilding2 == null || !str.equals(indoorBuilding2.getBuidlingId())) && (gvVar = this.f339624e.f339861d) != null) {
                    gvVar.mo172157d().f340399a.mo172141a();
                }
                IndoorBuilding indoorBuilding3 = new IndoorBuilding(str, str2, latLng, arrayList, i);
                this.f339626g = indoorBuilding3;
                C114322sx sxVar3 = this.f339628i;
                if (!(sxVar3 == null || (qdVar2 = sxVar3.f342587n) == null || !qdVar2.f341487c)) {
                    qdVar2.mo172694a(indoorBuilding3);
                }
                this.f339629j.onIndoorLevelActivated(this.f339626g);
            }
        }
    }

    /* renamed from: a */
    private void m155508a(String str, String str2) {
        C113961mq mqVar = this.f339624e;
        if (mqVar != null) {
            mqVar.mo172438a(str, str2);
        }
    }

    /* renamed from: a */
    private int m155505a(String str) {
        C113961mq mqVar;
        C114216sq sqVar;
        VectorMap vectorMap = this.f339623d;
        if (vectorMap == null || (mqVar = vectorMap.f342909o) == null || (sqVar = mqVar.f340899g) == null) {
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
}
