package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.SystemClock;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.mapsdk.internal.C114367v;
import com.tencent.mapsdk.internal.C114375z;
import com.tencent.tencentmap.mapsdk.maps.MapParamConstants;
import com.tencent.tencentmap.mapsdk.maps.model.GeometryConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.ad */
public final class C113503ad implements C113726fk, C24211ig, C113835jc, C114008ob, C114017on {

    /* renamed from: P */
    private static final int f339643P = 20;

    /* renamed from: Q */
    private static final int f339644Q = 0;

    /* renamed from: R */
    private static final int f339645R = 1;

    /* renamed from: S */
    private static final int f339646S = 2;

    /* renamed from: T */
    private static final int f339647T = 3;

    /* renamed from: U */
    private static final int f339648U = 4;

    /* renamed from: a */
    public static final int f339649a = 12;

    /* renamed from: b */
    public static final int f339650b = 11;

    /* renamed from: c */
    public static final int f339651c = 10;

    /* renamed from: d */
    public static final int f339652d = 18;

    /* renamed from: e */
    public static final int f339653e = 13;

    /* renamed from: f */
    public static final int f339654f = 15;

    /* renamed from: g */
    public static final int f339655g = 15;

    /* renamed from: h */
    public static final int f339656h = 17;

    /* renamed from: i */
    public static final int f339657i = 18;

    /* renamed from: j */
    public static final int f339658j = 16;

    /* renamed from: k */
    public static final int f339659k = 18;

    /* renamed from: l */
    public static final int f339660l = 12;

    /* renamed from: m */
    public static int f339661m = 116307503;

    /* renamed from: n */
    public static int f339662n = 39984186;

    /* renamed from: A */
    public C114367v f339663A;

    /* renamed from: B */
    public C113707es f339664B;

    /* renamed from: C */
    public Rect f339665C;

    /* renamed from: D */
    public C113511a f339666D = null;

    /* renamed from: E */
    public float f339667E = 0.5f;

    /* renamed from: F */
    public float f339668F = 0.5f;

    /* renamed from: G */
    public boolean f339669G = false;

    /* renamed from: H */
    public int f339670H = 0;

    /* renamed from: I */
    public int f339671I = 0;

    /* renamed from: J */
    public int f339672J = 0;

    /* renamed from: K */
    public int f339673K = 0;

    /* renamed from: L */
    public boolean f339674L = false;

    /* renamed from: M */
    public boolean f339675M = false;

    /* renamed from: N */
    public boolean f339676N;

    /* renamed from: V */
    private List<C114020os> f339677V;

    /* renamed from: W */
    private List<C113722fg> f339678W;

    /* renamed from: X */
    private List<C113726fk> f339679X;

    /* renamed from: Y */
    private final List<C113727fl> f339680Y;

    /* renamed from: Z */
    private List<C113724fi> f339681Z;

    /* renamed from: aa */
    private Stack<C114367v> f339682aa = new Stack<>();

    /* renamed from: ab */
    private Rect f339683ab;

    /* renamed from: ac */
    private Runnable f339684ac;

    /* renamed from: o */
    public C114375z f339685o;

    /* renamed from: p */
    public C114085pu f339686p;

    /* renamed from: q */
    public List<C113719fd> f339687q;

    /* renamed from: r */
    public List<C55064ey> f339688r;

    /* renamed from: s */
    public List<C113716fa> f339689s;

    /* renamed from: t */
    public final byte[] f339690t = new byte[0];

    /* renamed from: u */
    public List<C113721ff> f339691u;

    /* renamed from: v */
    public List<C113533bb> f339692v;

    /* renamed from: w */
    public final byte[] f339693w = new byte[0];

    /* renamed from: x */
    public List<C113720fe> f339694x;

    /* renamed from: y */
    public C113532ba f339695y;

    /* renamed from: z */
    public C113536be f339696z;

    /* renamed from: com.tencent.mapsdk.internal.ad$a */
    public interface C113511a {
        /* renamed from: a */
        void mo171265a(C113831iz izVar);
    }

    public C113503ad(C113536be beVar) {
        this.f339696z = beVar;
        this.f339695y = (C113532ba) beVar.mo171634b();
        this.f339663A = beVar.mo171637e();
        this.f339664B = beVar.mo171636d();
        this.f339665C = beVar.mo171639g();
        C114375z zVar = new C114375z(this);
        this.f339685o = zVar;
        zVar.f342860i = this;
        mo171212a((C113533bb) zVar);
        this.f339678W = new CopyOnWriteArrayList();
        this.f339691u = new CopyOnWriteArrayList();
        this.f339687q = new CopyOnWriteArrayList();
        this.f339688r = new CopyOnWriteArrayList();
        this.f339677V = new CopyOnWriteArrayList();
        this.f339680Y = new CopyOnWriteArrayList();
        this.f339694x = new CopyOnWriteArrayList();
        this.f339681Z = new CopyOnWriteArrayList();
        this.f339679X = new CopyOnWriteArrayList();
        mo171208a(C104547ek.f309914a);
    }

    /* renamed from: A */
    private void m155540A() {
        C114375z zVar = this.f339685o;
        if (zVar != null) {
            zVar.mo173093a();
        }
    }

    /* renamed from: B */
    private void m155541B() {
        C114375z.C114376a aVar;
        C114375z zVar = this.f339685o;
        if (zVar != null && (aVar = zVar.f342855d) != null) {
            aVar.destroy();
        }
    }

    /* renamed from: C */
    private C114375z m155542C() {
        return this.f339685o;
    }

    /* renamed from: D */
    private void m155543D() {
        for (C113720fe next : this.f339694x) {
        }
    }

    /* renamed from: E */
    private void m155544E() {
        C113889km.m157537a("skew notifySkew");
        for (C113724fi next : this.f339681Z) {
        }
    }

    /* renamed from: F */
    private void m155545F() {
        GeoPoint geoPoint = new GeoPoint(f339662n, f339661m);
        C114367v vVar = this.f339663A;
        Rect g = this.f339696z.mo171639g();
        int latitudeE6 = geoPoint.getLatitudeE6();
        int longitudeE6 = geoPoint.getLongitudeE6();
        vVar.f342795n = g;
        vVar.f342784c = GeometryConstants.BOUNDARY_WORLD;
        vVar.mo173066c(13);
        vVar.mo173062a(0);
        vVar.mo173063a(latitudeE6, longitudeE6, false);
        this.f339696z.mo171638f().mo172932b(this.f339669G);
    }

    /* renamed from: G */
    private float m155546G() {
        return this.f339663A.f342783b.f342820p;
    }

    /* renamed from: H */
    private int m155547H() {
        return this.f339663A.f342783b.f342821q;
    }

    /* renamed from: I */
    private GeoPoint m155548I() {
        return this.f339663A.f342794m;
    }

    /* renamed from: J */
    private float m155549J() {
        return this.f339663A.f342783b.mo173072a();
    }

    /* renamed from: K */
    private void m155550K() {
        this.f339663A.mo173059a(0.0f);
        this.f339663A.mo173064b(0.0f);
        m155543D();
        m155544E();
        mo171236c();
    }

    /* renamed from: L */
    private void m155551L() {
        mo171252o();
        mo171201a((double) mo171245h(), (double) MapParamConstants.MAX_SKEW_ANGLE, true);
    }

    /* renamed from: M */
    private void m155552M() {
        mo171252o();
        mo171201a((double) mo171245h(), (double) MapParamConstants.MAX_SKEW_ANGLE, true);
    }

    /* renamed from: N */
    private boolean m155553N() {
        C114085pu puVar = this.f339686p;
        if (puVar == null) {
            return false;
        }
        boolean z = puVar.f341390c;
        puVar.f341390c = false;
        return z;
    }

    /* renamed from: O */
    private void m155554O() {
        mo171252o();
        mo171247j();
    }

    /* renamed from: P */
    private void m155555P() {
        mo171252o();
        this.f339685o.mo173098e();
        mo171199a(0.0d, 0.0d);
    }

    /* renamed from: Q */
    private void m155556Q() {
        mo171252o();
        this.f339685o.mo173098e();
        mo171199a((double) mo171245h(), (double) MapParamConstants.MAX_SKEW_ANGLE);
    }

    /* renamed from: R */
    private boolean m155557R() {
        C114367v.C114369a aVar = this.f339663A.f342783b;
        return aVar.f342821q > aVar.f342818n;
    }

    /* renamed from: S */
    private void m155558S() {
        mo171224b(0);
    }

    /* renamed from: T */
    private void m155559T() {
        for (C113719fd next : this.f339687q) {
        }
        mo171236c();
    }

    /* renamed from: U */
    private void m155560U() {
        for (C55064ey next : this.f339688r) {
        }
        m155559T();
    }

    /* renamed from: V */
    private void m155561V() {
        for (C113726fk next : this.f339679X) {
            if (next != null) {
                try {
                    next.mo171258u();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: W */
    private Rect m155562W() {
        GeoPoint s = mo171256s();
        GeoPoint t = mo171257t();
        return new Rect(s.getLongitudeE6(), s.getLatitudeE6(), t.getLongitudeE6(), t.getLatitudeE6());
    }

    /* renamed from: X */
    private void m155563X() {
        this.f339685o.mo173098e();
    }

    /* renamed from: Y */
    private boolean m155564Y() {
        return this.f339685o.mo173099f();
    }

    /* renamed from: Z */
    private boolean m155565Z() {
        return this.f339685o.mo173100g();
    }

    /* renamed from: aa */
    private C114367v m155590aa() {
        return this.f339663A;
    }

    /* renamed from: d */
    private void m155618d(double d) {
        if (d != 0.0d) {
            C114367v vVar = this.f339663A;
            vVar.mo173064b(vVar.f342797p.mo172956r() + ((float) d));
            mo171236c();
            m155544E();
        }
    }

    /* renamed from: j */
    private void m155633j(double d) {
        mo171201a((360.0d - d) % 360.0d, (double) mo171246i(), true);
    }

    /* renamed from: k */
    private void m155634k(double d) {
        this.f339685o.mo173098e();
        mo171233b(new C113831iz(100, new double[]{d}));
    }

    /* renamed from: l */
    private void m155635l(double d) {
        mo171201a((360.0d - d) % 360.0d, (double) MapParamConstants.MAX_SKEW_ANGLE, true);
    }

    /* renamed from: m */
    private static double m155636m(double d) {
        double d2 = d % 360.0d;
        return d2 > 180.0d ? d2 - 360.0d : d2 < -180.0d ? d2 + 360.0d : d2;
    }

    /* renamed from: v */
    private void m155637v() {
        this.f339676N = true;
    }

    /* renamed from: w */
    private boolean m155638w() {
        return this.f339676N;
    }

    /* renamed from: x */
    private boolean m155639x() {
        Rect rect = this.f339665C;
        return rect != null && rect.width() > 0 && this.f339665C.height() > 0;
    }

    /* renamed from: y */
    private C114375z m155640y() {
        C114375z zVar = this.f339685o;
        C114375z.C114376a aVar = zVar.f342855d;
        if (aVar != null) {
            aVar.destroy();
        }
        C114375z.C114376a aVar2 = new C114375z.C114376a();
        zVar.f342855d = aVar2;
        aVar2.start();
        return this.f339685o;
    }

    /* renamed from: z */
    private void m155641z() {
        C114375z zVar = this.f339685o;
        if (zVar != null) {
            zVar.mo173096b();
        }
    }

    /* renamed from: b */
    public final Rect mo171221b() {
        return new Rect(this.f339670H, this.f339671I, this.f339672J, this.f339673K);
    }

    /* renamed from: c */
    public final void mo171236c() {
        List<C113533bb> list = this.f339692v;
        if (list != null) {
            for (C113533bb next : list) {
                if (next != null) {
                    try {
                        next.mo171628a(this.f339663A);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo171241d() {
    }

    /* renamed from: e */
    public final void mo171242e() {
        try {
            C114367v vVar = (C114367v) this.f339663A.clone();
            C113889km.m157537a("mapParam stack saveMapParam:" + vVar.toString());
            this.f339682aa.push(vVar);
        } catch (CloneNotSupportedException unused) {
        }
    }

    /* renamed from: f */
    public final void mo171243f() {
        try {
            C114367v pop = this.f339682aa.pop();
            C114367v.C114369a aVar = pop.f342783b;
            int i = aVar.f342821q;
            C114367v.C114369a aVar2 = this.f339663A.f342783b;
            if (i != aVar2.f342821q) {
                mo171238c(C113744fy.f340316c);
            } else if (aVar.f342820p != aVar2.f342820p) {
                mo171238c(C113744fy.f340315b);
            }
            if (pop.f342797p.mo172957s() != this.f339663A.f342797p.mo172957s()) {
                pop.f342797p.mo172957s();
                m155543D();
            }
            if (pop.f342797p.mo172956r() != this.f339663A.f342797p.mo172956r()) {
                pop.f342797p.mo172956r();
                m155544E();
            }
            C114367v vVar = this.f339663A;
            vVar.f342782a = pop.f342782a;
            C114367v.C114369a aVar3 = vVar.f342783b;
            C114367v.C114369a aVar4 = pop.f342783b;
            aVar3.f342816l = aVar4.f342816l;
            aVar3.f342817m = aVar4.f342817m;
            aVar3.f342818n = aVar4.f342818n;
            aVar3.f342819o = aVar4.f342819o;
            aVar3.f342820p = aVar4.f342820p;
            aVar3.f342821q = aVar4.f342821q;
            vVar.f342784c.set(pop.f342784c);
            vVar.f342785d = pop.f342785d;
            vVar.f342786e = pop.f342786e;
            vVar.f342787f = pop.f342787f;
            vVar.f342788g = pop.f342788g;
            vVar.f342789h = pop.f342789h;
            vVar.f342790i = pop.f342790i;
            vVar.f342791j = pop.f342791j;
            vVar.f342792k = pop.f342792k;
            vVar.f342793l = pop.f342793l;
            vVar.f342794m.setGeoPoint(pop.f342794m);
            C113732fo foVar = vVar.f342798q;
            C113732fo foVar2 = pop.f342798q;
            foVar.mo172083a(foVar2.f340215a, foVar2.f340216b);
            vVar.f342795n = pop.f342795n;
            mo171236c();
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public final C114367v mo171244g() {
        try {
            return (C114367v) this.f339663A.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public final float mo171245h() {
        return this.f339663A.f342797p.mo172957s();
    }

    /* renamed from: i */
    public final float mo171246i() {
        return this.f339663A.f342797p.mo172956r();
    }

    /* renamed from: m */
    public final int mo171250m() {
        C114367v vVar = this.f339663A;
        C114216sq sqVar = vVar.f342797p;
        return sqVar == null ? vVar.f342782a : sqVar.mo172959u();
    }

    /* renamed from: n */
    public final void mo171251n() {
        mo171225b(this.f339683ab);
        for (C114020os next : this.f339677V) {
            if (next != null) {
                try {
                    next.mo171259a();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo171252o() {
        if (this.f339689s != null) {
            mo171248k();
            for (C113716fa next : this.f339689s) {
            }
        }
    }

    /* renamed from: p */
    public final void mo171253p() {
        for (C113721ff next : this.f339691u) {
        }
    }

    /* renamed from: q */
    public final Rect mo171254q() {
        C113732fo foVar = new C113732fo((double) this.f339696z.mo171639g().width(), (double) this.f339696z.mo171639g().height());
        GeoPoint a = this.f339664B.mo172025a(foVar);
        foVar.mo172083a(0.0d, (double) this.f339696z.mo171639g().height());
        GeoPoint a2 = this.f339664B.mo172025a(foVar);
        foVar.mo172083a((double) this.f339696z.mo171639g().width(), 0.0d);
        GeoPoint a3 = this.f339664B.mo172025a(foVar);
        foVar.mo172083a(0.0d, 0.0d);
        GeoPoint a4 = this.f339664B.mo172025a(foVar);
        return new Rect(Math.min(Math.min(Math.min(a4.getLongitudeE6(), a.getLongitudeE6()), a2.getLongitudeE6()), a3.getLongitudeE6()), Math.min(Math.min(Math.min(a4.getLatitudeE6(), a.getLatitudeE6()), a2.getLatitudeE6()), a3.getLatitudeE6()), Math.max(Math.max(Math.max(a4.getLongitudeE6(), a.getLongitudeE6()), a2.getLongitudeE6()), a3.getLongitudeE6()), Math.max(Math.max(Math.max(a4.getLatitudeE6(), a.getLatitudeE6()), a2.getLatitudeE6()), a3.getLatitudeE6()));
    }

    /* renamed from: r */
    public final Rect mo171255r() {
        if (this.f339664B == null) {
            return null;
        }
        C113732fo foVar = new C113732fo((double) this.f339670H, (double) this.f339671I);
        GeoPoint a = this.f339664B.mo172025a(foVar);
        foVar.mo172083a((double) (this.f339696z.mo171639g().width() - this.f339672J), (double) (this.f339696z.mo171639g().height() - this.f339673K));
        GeoPoint a2 = this.f339664B.mo172025a(foVar);
        return new Rect(Math.min(a.getLongitudeE6(), a2.getLongitudeE6()), Math.min(a.getLatitudeE6(), a2.getLatitudeE6()), Math.max(a.getLongitudeE6(), a2.getLongitudeE6()), Math.max(a.getLatitudeE6(), a2.getLatitudeE6()));
    }

    /* renamed from: s */
    public final GeoPoint mo171256s() {
        return this.f339664B.mo172025a(new C113732fo(0.0d, 0.0d));
    }

    /* renamed from: t */
    public final GeoPoint mo171257t() {
        return this.f339664B.mo172025a(new C113732fo((double) this.f339696z.mo171639g().width(), (double) this.f339696z.mo171639g().height()));
    }

    /* renamed from: u */
    public final void mo171258u() {
        for (C113726fk next : this.f339679X) {
            if (next != null) {
                try {
                    next.mo171258u();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private void m155600b(C113533bb bbVar) {
        if (this.f339692v != null) {
            synchronized (this.f339693w) {
                this.f339692v.remove(bbVar);
            }
        }
    }

    /* renamed from: g */
    private void m155630g(double d) {
        mo171202a((float) d);
    }

    /* renamed from: j */
    public final void mo171247j() {
        this.f339685o.mo173098e();
        mo171201a(0.0d, 0.0d, true);
    }

    /* renamed from: l */
    public final boolean mo171249l() {
        C114367v.C114369a aVar = this.f339663A.f342783b;
        return aVar.f342821q < aVar.f342819o;
    }

    /* renamed from: h */
    private void m155631h(double d) {
        this.f339685o.mo173098e();
        mo171233b(new C113831iz(102, new double[]{0.0d, d}));
    }

    /* renamed from: i */
    private void m155632i(double d) {
        this.f339685o.mo173098e();
        mo171233b(new C113831iz(102, new double[]{d, 0.0d}));
    }

    /* renamed from: k */
    public final boolean mo171248k() {
        return ((double) Math.abs(mo171246i())) > 1.0E-6d || Math.abs(mo171245h()) > 1.0f;
    }

    /* renamed from: a */
    private int m155567a(int i, int i2, int i3, int i4, final boolean z) {
        this.f339670H = i;
        this.f339671I = i2;
        this.f339672J = i3;
        this.f339673K = i4;
        Rect rect = this.f339665C;
        if (rect == null || rect.width() <= 0 || this.f339665C.height() <= 0) {
            mo171218a((C114020os) new C114020os() {
                /* renamed from: a */
                public final void mo171259a() {
                    PointF a = C113503ad.this.mo171197a();
                    C113503ad.this.mo171203a(a.x, a.y, z);
                    C113503ad.this.mo171234b((C114020os) this);
                }
            });
            C113536be beVar = this.f339696z;
            if (!(beVar instanceof C113961mq)) {
                return -2;
            }
            Context context = ((C113961mq) beVar).getContext();
            return (i + i3 > C113801hf.m157140b(context) || i2 + i4 > C113801hf.m157142c(context)) ? -1 : 0;
        } else if (i + i3 > this.f339665C.width() || i2 + i4 > this.f339665C.height()) {
            return -1;
        } else {
            PointF a = mo171197a();
            mo171203a(a.x, a.y, z);
            return 0;
        }
    }

    /* renamed from: c */
    private void m155610c(float f) {
        mo171198a((double) f);
    }

    /* renamed from: e */
    private void m155626e(double d) {
        if (d != 0.0d) {
            C114367v vVar = this.f339663A;
            vVar.mo173059a(vVar.f342797p.mo172957s() + ((float) d));
            mo171236c();
            m155543D();
        }
    }

    /* renamed from: c */
    private void m155609c(double d, double d2) {
        C114375z zVar = this.f339685o;
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

    /* renamed from: b */
    private void m155606b(boolean z) {
        this.f339669G = z;
        this.f339696z.mo171638f().mo172932b(this.f339669G);
    }

    /* renamed from: d */
    private void m155622d(C113831iz izVar) {
        C113831iz izVar2 = izVar;
        int i = izVar2.f340607z;
        if (i == 2) {
            C113532ba baVar = this.f339695y;
            if (baVar != null && baVar.getMapRenderView() != null) {
                this.f339695y.getMapRenderView().mo171862d();
            }
        } else if (i == 3) {
            double[] dArr = izVar2.f340601A;
            m155592b(dArr[0], dArr[1]);
        } else if (i == 4) {
            double[] dArr2 = izVar2.f340601A;
            mo171206a((int) dArr2[0], (int) dArr2[1], dArr2.length > 2 ? (int) dArr2[2] : 1);
        } else if (i == 6) {
            Runnable runnable = izVar2.f340605E;
            if (runnable != null) {
                runnable.run();
            }
        } else if (i == 120) {
            mo171202a((float) izVar2.f340601A[0]);
            double[] dArr3 = izVar2.f340601A;
            mo171206a((int) dArr3[1], (int) dArr3[2], 1);
        } else if (i != 10000) {
            switch (i) {
                case 100:
                    m155629f(izVar2.f340601A[0]);
                    return;
                case 101:
                    int width = this.f339696z.mo171639g().width();
                    int height = this.f339696z.mo171639g().height();
                    int i2 = width / 2;
                    int i3 = height / 2;
                    C114367v.C114370b bVar = this.f339663A.f342799r;
                    if (bVar != null) {
                        i2 = (int) (((float) i2) + (bVar.f342822a * ((float) width)));
                        i3 = (int) (((float) i3) + (bVar.f342823b * ((float) height)));
                    }
                    double d = (double) i2;
                    double[] dArr4 = izVar2.f340601A;
                    double d2 = (double) i3;
                    m155592b(d - dArr4[1], d2 - dArr4[2]);
                    m155629f(izVar2.f340601A[0]);
                    m155592b(dArr4[3] - d, dArr4[4] - d2);
                    return;
                case 102:
                    m155626e(izVar2.f340601A[0]);
                    m155618d(izVar2.f340601A[1]);
                    return;
                case 103:
                    double width2 = (double) (this.f339696z.mo171639g().width() / 2);
                    double[] dArr5 = izVar2.f340601A;
                    double height2 = (double) (this.f339696z.mo171639g().height() / 2);
                    m155592b(width2 - dArr5[1], height2 - dArr5[2]);
                    m155626e(izVar2.f340601A[0]);
                    double[] dArr6 = izVar2.f340601A;
                    m155592b(dArr6[3] - width2, dArr6[4] - height2);
                    return;
                case 104:
                    this.f339663A.mo173059a(0.0f);
                    this.f339663A.mo173064b(0.0f);
                    m155543D();
                    m155544E();
                    mo171236c();
                    return;
                default:
                    switch (i) {
                        case 108:
                            mo171202a((float) izVar2.f340601A[0]);
                            return;
                        case 109:
                            mo171222b(izVar2.f340601A[0]);
                            return;
                        case 110:
                            mo171198a(izVar2.f340601A[0]);
                            return;
                        default:
                            return;
                    }
            }
        } else {
            C113511a aVar = this.f339666D;
            if (aVar != null) {
                aVar.mo171265a(izVar2);
            }
        }
    }

    /* renamed from: b */
    private void m155604b(C113720fe feVar) {
        synchronized (this.f339694x) {
            this.f339694x.remove(feVar);
        }
    }

    /* renamed from: e */
    private void m155627e(int i) {
        mo171207a(i, (Runnable) new Runnable() {
            public final void run() {
                C113503ad.this.mo171201a(0.0d, 0.0d, false);
            }
        });
    }

    /* renamed from: e */
    private void m155628e(boolean z) {
        this.f339675M = z;
    }

    /* renamed from: b */
    public final void mo171230b(C113724fi fiVar) {
        synchronized (this.f339681Z) {
            C113889km.m157537a("skew addSkewListener");
            this.f339681Z.remove(fiVar);
        }
    }

    /* renamed from: c */
    public final void mo171237c(double d) {
        this.f339685o.mo173098e();
        mo171233b(new C113831iz(108, new double[]{d}));
    }

    /* renamed from: b */
    private void m155596b(int i, int i2) {
        mo171206a(i, i2, 1);
    }

    /* renamed from: b */
    private void m155593b(float f) {
        mo171222b((double) f);
    }

    /* renamed from: c */
    private void m155615c(Runnable runnable) {
        if (mo171249l()) {
            this.f339696z.mo171638f().mo172933c(((float) this.f339696z.mo171639g().width()) / 2.0f, ((float) this.f339696z.mo171639g().height()) / 2.0f);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    public final PointF mo171197a() {
        int i;
        Rect rect = this.f339665C;
        int i2 = 0;
        if (rect != null) {
            i2 = rect.width();
            i = this.f339665C.height();
        } else {
            i = 0;
        }
        int i3 = this.f339670H;
        int i4 = i3 + (((i2 - i3) - this.f339672J) / 2);
        int i5 = this.f339671I;
        int i6 = i5 + (((i - i5) - this.f339673K) / 2);
        if (i2 == 0 || i == 0) {
            return new PointF(0.5f, 0.5f);
        }
        return new PointF((((float) i4) * 1.0f) / ((float) i2), (((float) i6) * 1.0f) / ((float) i));
    }

    /* renamed from: b */
    private void m155592b(double d, double d2) {
        this.f339696z.mo171638f().mo172926b((float) d, (float) d2);
        m155560U();
        mo171236c();
    }

    /* renamed from: b */
    public final void mo171222b(double d) {
        if (C113904kw.m157741a(d - ((double) this.f339663A.f342797p.mo172957s())) != 0.0d) {
            this.f339663A.mo173059a((float) d);
            mo171236c();
            m155543D();
        }
    }

    /* renamed from: c */
    private void m155616c(boolean z) {
        mo171224b(z ? 12 : 0);
    }

    /* renamed from: c */
    public final void mo171238c(int i) {
        if (i != C113744fy.f340314a) {
            for (C113722fg next : this.f339678W) {
                if (next != null) {
                    next.mo171191b(i);
                }
            }
            mo171236c();
        }
    }

    /* renamed from: a */
    public final void mo171212a(C113533bb bbVar) {
        if (bbVar != null) {
            if (this.f339692v == null) {
                this.f339692v = new CopyOnWriteArrayList();
            }
            synchronized (this.f339693w) {
                if (!this.f339692v.contains(bbVar)) {
                    this.f339692v.add(bbVar);
                }
            }
        }
    }

    /* renamed from: b */
    private void m155595b(float f, float f2, Runnable runnable) {
        if (mo171249l()) {
            Rect rect = this.f339663A.f342795n;
            int height = rect.height();
            float t = this.f339696z.mo171638f().mo172958t();
            int i = rect.top;
            if (f2 >= ((float) i) && f2 < ((float) (i + height)) - t) {
                f2 = ((float) (i + height)) - t;
            }
            this.f339696z.mo171638f().mo172933c(f, f2);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: c */
    private void m155612c(GeoPoint geoPoint) {
        mo171211a(geoPoint, (Runnable) null);
    }

    /* renamed from: c */
    public final void mo171239c(Rect rect, Rect rect2) {
        if (rect != null) {
            if (rect.height() > 0 || rect.width() > 0) {
                m155576a(rect, rect2, false);
            }
            m155560U();
        }
    }

    /* renamed from: a */
    public final void mo171208a(Rect rect) {
        if (m155639x()) {
            float a = mo171196a(rect, this.f339665C);
            this.f339663A.mo173060a(rect);
            this.f339663A.mo173068e(a);
        }
    }

    /* renamed from: c */
    public final void mo171240c(C113831iz izVar) {
        if (izVar != null) {
            m155622d(izVar);
        }
    }

    /* renamed from: c */
    private float m155608c(GeoPoint geoPoint, GeoPoint geoPoint2) {
        int i;
        Rect rect = this.f339665C;
        int i2 = 0;
        if (rect != null) {
            i2 = rect.width();
            i = this.f339665C.height();
        } else {
            i = 0;
        }
        if (i2 == 0 || i == 0 || geoPoint == null || geoPoint2 == null) {
            return 1.0f;
        }
        C113732fo a = m155569a(geoPoint);
        C113732fo a2 = m155569a(geoPoint2);
        double d = a2.f340215a - a.f340215a;
        if (d < 0.0d) {
            d = Math.abs(d);
        }
        double d2 = a2.f340216b - a.f340216b;
        if (d2 < 0.0d) {
            d2 = Math.abs(d2);
        }
        double d3 = d * 1.0d;
        double d4 = d2 * 1.0d;
        int i3 = (i2 - this.f339670H) - this.f339672J;
        int i4 = (i - this.f339671I) - this.f339673K;
        if (i3 <= 0) {
            i3 = 1;
        }
        if (i4 <= 0) {
            i4 = 1;
        }
        float max = (float) (20.0d - Math.max(Math.log(d3 / ((double) i3)) / Math.log(2.0d), Math.log(d4 / ((double) i4)) / Math.log(2.0d)));
        return this.f339663A != null ? C114367v.C114369a.m160574a((int) max) : max;
    }

    /* renamed from: a */
    private void m155586a(C113720fe feVar) {
        if (feVar != null) {
            synchronized (this.f339694x) {
                if (!this.f339694x.contains(feVar)) {
                    this.f339694x.add(feVar);
                }
            }
        }
    }

    /* renamed from: b */
    private void m155607b(boolean z, Runnable runnable) {
        Runnable runnable2 = runnable;
        final double m = m155636m(0.0d - ((double) mo171245h()));
        final double i = 0.0d - ((double) mo171246i());
        if (m != 0.0d || i != 0.0d) {
            C113889km.m157537a("postRotateAndSkew distance:" + m + "," + i);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final float f = (float) (m * 0.10000000149011612d);
            C1135063 r142 = r0;
            final float f2 = (float) (0.10000000149011612d * i);
            C1135063 r0 = new C113831iz(new double[]{0.0d, 0.0d, 0.0d, 0.0d}, !z) {

                /* renamed from: f */
                public final /* synthetic */ double f339712f = 0.0d;

                /* renamed from: g */
                public final /* synthetic */ double f339713g = 0.0d;

                /* renamed from: a */
                public final boolean mo171260a() {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime;
                    double a = C104551iw.m139972a(elapsedRealtime, f);
                    double a2 = C104551iw.m139972a(elapsedRealtime, f2);
                    double[] dArr = this.f340601A;
                    dArr[2] = dArr[2] + Math.abs(a);
                    double[] dArr2 = this.f340601A;
                    dArr2[3] = dArr2[3] + Math.abs(a2);
                    boolean z = this.f340601A[2] >= Math.abs(m);
                    boolean z2 = this.f340601A[3] >= Math.abs(i);
                    if (z) {
                        this.f340601A[0] = this.f339712f - ((double) C113503ad.this.mo171245h());
                    } else {
                        this.f340601A[0] = a;
                    }
                    if (z2) {
                        this.f340601A[1] = this.f339713g - ((double) C113503ad.this.mo171246i());
                    } else {
                        this.f340601A[1] = a2;
                    }
                    return z && z2;
                }
            };
            mo171233b((C113831iz) r142);
            if (runnable2 != null) {
                C113831iz izVar = new C113831iz(runnable2);
                izVar.f340604D = true;
                izVar.f340602B = 0;
                mo171233b(izVar);
            }
        } else if (runnable2 != null) {
            C113831iz izVar2 = new C113831iz(runnable2);
            izVar2.f340604D = true;
            izVar2.f340602B = 0;
            mo171233b(izVar2);
        }
    }

    /* renamed from: a */
    public final void mo171214a(C113724fi fiVar) {
        if (fiVar != null) {
            synchronized (this.f339681Z) {
                C113889km.m157537a("skew addSkewListener");
                if (!this.f339681Z.contains(fiVar)) {
                    this.f339681Z.add(fiVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m155588a(C114094px pxVar) {
        if (this.f339686p == null) {
            this.f339686p = this.f339695y.mo171549M();
        }
        C114085pu puVar = this.f339686p;
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

    /* renamed from: f */
    private void m155629f(double d) {
        mo171202a((float) ((double) (this.f339663A.f342783b.f342820p * ((float) d))));
    }

    /* renamed from: c */
    private void m155613c(GeoPoint geoPoint, float f, Runnable runnable) {
        int i;
        GeoPoint geoPoint2 = geoPoint;
        Runnable runnable2 = runnable;
        if (geoPoint2 != null) {
            this.f339685o.mo173098e();
            double d = (double) this.f339663A.f342783b.f342820p;
            double d2 = (double) f;
            double d3 = d2 / d;
            int i2 = (d3 > 1.0d ? 1 : (d3 == 1.0d ? 0 : -1));
            if (i2 > 0) {
                i = (int) (d3 / 0.5d);
            } else if (d3 < 1.0d) {
                i = i2 != 0 ? (int) (0.5d / d3) : 0;
            } else {
                mo171228b(geoPoint2, runnable2);
                return;
            }
            int max = Math.max(60, Math.min(120, (i >> 1) << 1));
            double log10 = Math.log10(d) / Math.log10(2.0d);
            double log102 = Math.log10(d2) / Math.log10(2.0d);
            GeoPoint geoPoint3 = this.f339663A.f342794m;
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
                mo171233b(new C113831iz(120, new double[]{pow, a, a2}));
                GeoPoint geoPoint4 = geoPoint;
                runnable2 = runnable;
                i3 = i4;
                log10 = d4;
                log102 = d5;
            }
            if (runnable2 != null) {
                mo171233b(new C113831iz(runnable2));
            }
        }
    }

    /* renamed from: b */
    public final void mo171224b(int i) {
        if (this.f339663A.mo173062a(i)) {
            for (C113727fl next : this.f339680Y) {
                if (next != null) {
                    try {
                        next.mo171695i(i);
                    } catch (Exception unused) {
                    }
                }
            }
            mo171236c();
        }
    }

    /* renamed from: a */
    private void m155575a(int i, GeoPoint geoPoint) {
        mo171206a(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6(), 1);
        mo171204a(i);
    }

    /* renamed from: b */
    public final void mo171223b(float f, float f2, boolean z) {
        this.f339663A.mo173061a(f - 0.5f, f2 - 0.5f, z);
        mo171236c();
    }

    /* renamed from: d */
    private void m155619d(int i) {
        for (C113727fl next : this.f339680Y) {
            if (next != null) {
                try {
                    next.mo171695i(i);
                } catch (Exception unused) {
                }
            }
        }
        mo171236c();
    }

    /* renamed from: a */
    private void m155577a(GeoPoint geoPoint, float f, float f2, float f3) {
        mo171206a(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6(), 1);
        mo171202a(f);
        mo171222b((double) f2);
        mo171198a((double) f3);
    }

    /* renamed from: b */
    private void m155594b(float f, float f2) {
        this.f339667E = f;
        this.f339668F = f2;
    }

    /* renamed from: d */
    private void m155620d(Rect rect) {
        mo171226b(rect, (Rect) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r2 = (com.tencent.mapsdk.internal.C113961mq) r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo171225b(android.graphics.Rect r9) {
        /*
            r8 = this;
            android.graphics.Rect r0 = r8.f339665C
            if (r0 == 0) goto L_0x0037
            if (r9 != 0) goto L_0x0007
            goto L_0x0037
        L_0x0007:
            r8.f339683ab = r9
            com.tencent.mapsdk.internal.be r0 = r8.f339696z
            boolean r1 = r0 instanceof com.tencent.mapsdk.internal.C113961mq
            if (r1 == 0) goto L_0x0034
            r2 = r0
            com.tencent.mapsdk.internal.mq r2 = (com.tencent.mapsdk.internal.C113961mq) r2
            android.graphics.Rect r0 = r2.f340907o
            if (r0 == 0) goto L_0x0034
            r2.f340873C = r9
            int r0 = r0.width()
            android.graphics.Rect r1 = r2.f340907o
            int r1 = r1.height()
            int r3 = r9.left
            int r4 = r9.bottom
            int r5 = r9.right
            int r0 = r0 - r5
            int r5 = r0 - r3
            int r1 = r1 - r4
            int r9 = r9.top
            int r6 = r1 - r9
            r7 = 1
            r2.mo172428a((int) r3, (int) r4, (int) r5, (int) r6, (boolean) r7)
        L_0x0034:
            r8.mo171236c()
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113503ad.mo171225b(android.graphics.Rect):void");
    }

    /* renamed from: d */
    private float m155617d(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(this.f339696z.mo171639g());
        if (rect2 != null) {
            rect3.left += rect2.left;
            rect3.right -= rect2.right;
            rect3.top += rect2.top;
            rect3.bottom -= rect2.bottom;
        }
        return mo171196a(rect, rect3);
    }

    /* renamed from: a */
    public final void mo171204a(int i) {
        if (this.f339663A.mo173066c(i)) {
            mo171238c(C113744fy.f340316c);
        }
    }

    /* renamed from: a */
    public final void mo171206a(int i, int i2, int i3) {
        this.f339663A.mo173063a(i, i2, false);
        if (i3 == 1) {
            m155560U();
            mo171236c();
        }
    }

    /* renamed from: d */
    private boolean m155625d(GeoPoint geoPoint) {
        boolean z;
        if (geoPoint == null) {
            return true;
        }
        Rect r = mo171255r();
        boolean contains = r != null ? r.contains(geoPoint.getLongitudeE6(), geoPoint.getLatitudeE6()) : false;
        C113732fo a = this.f339664B.mo172027a(this.f339663A.f342794m);
        C113732fo a2 = this.f339664B.mo172027a(geoPoint);
        if (this.f339665C != null) {
            double abs = Math.abs(a.f340215a - a2.f340215a);
            double abs2 = Math.abs(a.f340216b - a2.f340216b);
            if (abs > ((double) this.f339665C.width()) || abs2 > ((double) this.f339665C.height())) {
                z = false;
                return contains && !z;
            }
        }
        z = true;
        if (contains) {
        }
    }

    /* renamed from: a */
    private void m155572a(float f, float f2) {
        C114216sq f3;
        C113536be beVar = this.f339696z;
        if (beVar != null && (f3 = beVar.mo171638f()) != null) {
            f3.mo172926b(f, f2);
            mo171236c();
        }
    }

    /* renamed from: c */
    private void m155614c(GeoPoint geoPoint, Runnable runnable) {
        if (geoPoint != null) {
            mo171209a(geoPoint, (float) this.f339663A.f342783b.f342821q, runnable);
        }
    }

    /* renamed from: a */
    public final float mo171196a(Rect rect, Rect rect2) {
        GeoPoint geoPoint = new GeoPoint(rect.top, rect.left);
        GeoPoint geoPoint2 = new GeoPoint(rect.bottom, rect.right);
        Rect rect3 = new Rect();
        rect3.left = Math.min(geoPoint.getLongitudeE6(), geoPoint2.getLongitudeE6());
        rect3.right = Math.max(geoPoint.getLongitudeE6(), geoPoint2.getLongitudeE6());
        rect3.top = Math.min(geoPoint.getLatitudeE6(), geoPoint2.getLatitudeE6());
        rect3.bottom = Math.max(geoPoint.getLatitudeE6(), geoPoint2.getLatitudeE6());
        return (float) this.f339696z.mo171638f().mo172894a(rect3, rect2);
    }

    /* renamed from: b */
    private void m155602b(C113716fa faVar) {
        if (this.f339689s != null) {
            synchronized (this.f339690t) {
                this.f339689s.remove(faVar);
            }
        }
    }

    /* renamed from: c */
    private void m155611c(Rect rect) {
        mo171226b(rect, (Rect) null);
    }

    /* renamed from: d */
    private void m155624d(boolean z) {
        this.f339674L = z;
    }

    /* renamed from: d */
    private void m155623d(Runnable runnable) {
        C113961mq mqVar;
        C114367v.C114369a aVar = this.f339663A.f342783b;
        if (aVar.f342821q > aVar.f342818n) {
            C114216sq f = this.f339696z.mo171638f();
            if (!(0 == f.f342024e || (mqVar = f.f342029j) == null)) {
                mqVar.mo172432a((C113961mq.C113963a) new C113961mq.C113963a() {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (C114216sq.this.f342024e != 0) {
                            C114216sq.this.f342023d.nativeZoomOut(C114216sq.this.f342024e);
                        }
                    }
                });
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: b */
    public final void mo171229b(C113722fg fgVar) {
        synchronized (this.f339678W) {
            this.f339678W.remove(fgVar);
        }
    }

    /* renamed from: a */
    private void m155576a(Rect rect, Rect rect2, boolean z) {
        if (m155639x()) {
            Rect rect3 = new Rect(this.f339665C);
            if (rect2 != null) {
                rect3.left += rect2.left;
                rect3.right -= rect2.right;
                rect3.top += rect2.top;
                rect3.bottom -= rect2.bottom;
            }
            GeoPoint geoPoint = new GeoPoint(rect.top, rect.left);
            GeoPoint geoPoint2 = new GeoPoint(rect.bottom, rect.right);
            Rect rect4 = new Rect();
            rect4.left = Math.min(geoPoint.getLongitudeE6(), geoPoint2.getLongitudeE6());
            rect4.right = Math.max(geoPoint.getLongitudeE6(), geoPoint2.getLongitudeE6());
            rect4.top = Math.min(geoPoint.getLatitudeE6(), geoPoint2.getLatitudeE6());
            rect4.bottom = Math.max(geoPoint.getLatitudeE6(), geoPoint2.getLatitudeE6());
            this.f339696z.mo171638f().mo172910a(rect4, rect3, z);
        }
    }

    /* renamed from: b */
    private void m155605b(C113721ff ffVar) {
        synchronized (this.f339691u) {
            this.f339691u.remove(ffVar);
        }
    }

    /* renamed from: b */
    public final void mo171231b(C113726fk fkVar) {
        synchronized (this.f339679X) {
            this.f339679X.remove(fkVar);
        }
    }

    /* renamed from: d */
    private void m155621d(GeoPoint geoPoint, Runnable runnable) {
        mo171210a(geoPoint, 18, runnable);
    }

    /* renamed from: b */
    private void m155603b(C113719fd fdVar) {
        synchronized (this.f339687q) {
            this.f339687q.remove(fdVar);
        }
    }

    /* renamed from: b */
    private void m155601b(C55064ey eyVar) {
        synchronized (this.f339688r) {
            this.f339688r.remove(eyVar);
        }
    }

    /* renamed from: b */
    public final void mo171234b(C114020os osVar) {
        synchronized (this.f339677V) {
            this.f339677V.remove(osVar);
        }
    }

    /* renamed from: a */
    public final void mo171202a(float f) {
        mo171238c(this.f339663A.mo173065c(f));
    }

    /* renamed from: a */
    private double m155566a(GeoPoint geoPoint, GeoPoint geoPoint2) {
        C113732fo a = this.f339664B.mo172027a(geoPoint);
        C113732fo a2 = this.f339664B.mo172027a(geoPoint2);
        double d = a2.f340215a - a.f340215a;
        double d2 = a2.f340216b - a.f340216b;
        return Math.sqrt((d * d) + (d2 * d2));
    }

    /* renamed from: b */
    public final void mo171232b(C113727fl flVar) {
        synchronized (this.f339680Y) {
            this.f339680Y.remove(flVar);
        }
    }

    /* renamed from: b */
    private void m155599b(GeoPoint geoPoint, Rect rect) {
        C113707es esVar = this.f339664B;
        C113732fo a = esVar.mo172027a(geoPoint);
        double centerX = ((double) rect.centerX()) - a.f340215a;
        double centerY = ((double) rect.centerY()) - a.f340216b;
        C113732fo a2 = esVar.mo172027a(this.f339663A.f342794m);
        a2.f340215a -= centerX;
        a2.f340216b -= centerY;
        mo171211a(esVar.mo172025a(a2), (Runnable) null);
    }

    /* renamed from: a */
    public final void mo171198a(double d) {
        if (d != ((double) this.f339663A.f342797p.mo172956r())) {
            this.f339663A.mo173064b((float) d);
            mo171236c();
            m155544E();
        }
    }

    /* renamed from: a */
    public final void mo171217a(C113831iz izVar) {
        this.f339685o.mo173098e();
        mo171233b(izVar);
    }

    /* renamed from: a */
    private void m155571a(double d, double d2, double d3, double d4, double d5) {
        this.f339685o.mo173098e();
        float width = ((float) this.f339696z.mo171639g().width()) / 2.0f;
        float height = ((float) this.f339696z.mo171639g().height()) / 2.0f;
        C114367v.C114370b bVar = this.f339663A.f342799r;
        if (this.f339675M) {
            if (bVar != null) {
                d2 = (double) (width + (bVar.f342822a * width * 2.0f));
                height += bVar.f342823b * height * 2.0f;
            } else {
                d2 = (double) width;
            }
            d3 = (double) height;
            d4 = d2;
            d5 = d3;
        }
        mo171240c(new C113831iz(103, new double[]{d, d2, d3, d4, d5}));
    }

    /* renamed from: b */
    private void m155598b(GeoPoint geoPoint, int i, Runnable runnable) {
        mo171210a(geoPoint, i, runnable);
    }

    /* renamed from: b */
    private float m155591b(GeoPoint geoPoint, GeoPoint geoPoint2) {
        if (!m155639x()) {
            return this.f339663A.f342783b.f342820p;
        }
        int latitudeE6 = geoPoint.getLatitudeE6();
        int longitudeE6 = geoPoint.getLongitudeE6();
        int latitudeE62 = geoPoint2.getLatitudeE6();
        int longitudeE62 = geoPoint2.getLongitudeE6();
        return mo171196a(new Rect(Math.min(longitudeE62, longitudeE6), Math.min(latitudeE62, latitudeE6), Math.max(longitudeE62, longitudeE6), Math.max(latitudeE62, latitudeE6)), this.f339665C);
    }

    /* renamed from: a */
    public final void mo171200a(double d, double d2, double d3, double d4, double d5, Runnable runnable) {
        double d6;
        double d7;
        double d8;
        double d9;
        this.f339685o.mo173098e();
        float width = ((float) this.f339696z.mo171639g().width()) / 2.0f;
        float height = ((float) this.f339696z.mo171639g().height()) / 2.0f;
        C114367v.C114370b bVar = this.f339663A.f342799r;
        if (this.f339674L) {
            if (bVar != null) {
                d7 = (double) (width + (bVar.f342822a * width * 2.0f));
                d9 = (double) (height + (bVar.f342823b * height * 2.0f));
            } else {
                d7 = (double) width;
                d9 = (double) height;
            }
            d6 = d9;
            d8 = d7;
        } else {
            d7 = d2;
            d9 = d3;
            d8 = d4;
            d6 = d5;
        }
        mo171233b(new C113831iz(101, new double[]{d, d7, d9, d8, d6}));
        C113831iz izVar = new C113831iz(runnable);
        izVar.f340604D = false;
        izVar.f340602B = 0;
        mo171233b(izVar);
    }

    /* renamed from: b */
    public final void mo171226b(Rect rect, Rect rect2) {
        if (m155639x()) {
            Rect rect3 = new Rect(this.f339665C);
            if (rect2 != null) {
                rect3.left += rect2.left;
                rect3.right -= rect2.right;
                rect3.top += rect2.top;
                rect3.bottom -= rect2.bottom;
            }
            m155576a(rect, rect2, true);
            m155560U();
        }
    }

    /* renamed from: a */
    private void m155573a(float f, float f2, Runnable runnable) {
        if (this.f339674L) {
            C114367v.C114370b bVar = this.f339663A.f342799r;
            if (bVar != null) {
                float width = ((float) this.f339696z.mo171639g().width()) * (bVar.f342822a + 0.5f);
                float f3 = width;
                f2 = (bVar.f342823b + 0.5f) * ((float) this.f339696z.mo171639g().height());
                f = f3;
            } else {
                mo171219a(runnable);
                return;
            }
        }
        if (mo171249l()) {
            Rect rect = this.f339663A.f342795n;
            int height = rect.height();
            float t = this.f339696z.mo171638f().mo172958t();
            int i = rect.top;
            if (f2 >= ((float) i) && f2 < ((float) (i + height)) - t) {
                f2 = ((float) (i + height)) - t;
            }
            this.f339696z.mo171638f().mo172933c(f, f2);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: b */
    public final void mo171233b(C113831iz izVar) {
        this.f339685o.mo173095a(izVar);
    }

    /* renamed from: b */
    public final void mo171227b(GeoPoint geoPoint, float f, Runnable runnable) {
        boolean z;
        int i;
        GeoPoint geoPoint2 = geoPoint;
        Runnable runnable2 = runnable;
        if (geoPoint2 != null) {
            this.f339685o.mo173098e();
            double d = (double) this.f339663A.f342783b.f342820p;
            double d2 = (double) f;
            double d3 = d2 / d;
            int i2 = (d3 > 1.0d ? 1 : (d3 == 1.0d ? 0 : -1));
            if (i2 > 0) {
                i = (int) (d3 / 0.5d);
                z = true;
            } else if (d3 < 1.0d) {
                i = i2 != 0 ? (int) (0.5d / d3) : 0;
                z = false;
            } else {
                mo171228b(geoPoint2, runnable2);
                return;
            }
            int max = Math.max(60, Math.min(120, (i >> 1) << 1));
            double log10 = Math.log10(d) / Math.log10(2.0d);
            double log102 = Math.log10(d2) / Math.log10(2.0d);
            GeoPoint geoPoint3 = this.f339663A.f342794m;
            if (z) {
                int i3 = 0;
                while (i3 < max) {
                    i3++;
                    long j = (long) max;
                    long j2 = (long) i3;
                    double d4 = log102;
                    double pow = Math.pow(2.0d, C104556ma.m140042c(log10, log102, j, j2));
                    double d5 = log10;
                    double e = C104556ma.m140045e((double) geoPoint3.getLatitudeE6(), (double) geoPoint.getLatitudeE6(), j, j2);
                    double e2 = C104556ma.m140045e((double) geoPoint3.getLongitudeE6(), (double) geoPoint.getLongitudeE6(), j, j2);
                    C113889km.m157537a("debug location anim zoomOut:" + e + "," + e2);
                    mo171233b(new C113831iz(120, new double[]{pow, e, e2}));
                    GeoPoint geoPoint4 = geoPoint;
                    Runnable runnable3 = runnable;
                    log102 = d4;
                    log10 = d5;
                    geoPoint3 = geoPoint3;
                }
            } else {
                double d6 = log10;
                double d7 = log102;
                GeoPoint geoPoint5 = geoPoint3;
                int i4 = 0;
                while (i4 < max) {
                    int i5 = i4 + 1;
                    long j3 = (long) max;
                    long j4 = (long) i5;
                    double pow2 = Math.pow(2.0d, C104556ma.m140040b(d6, d7, j3, j4));
                    double d8 = C104556ma.m140044d((double) geoPoint5.getLatitudeE6(), (double) geoPoint.getLatitudeE6(), j3, j4);
                    double d9 = C104556ma.m140044d((double) geoPoint5.getLongitudeE6(), (double) geoPoint.getLongitudeE6(), j3, j4);
                    C113889km.m157537a("debug location anim zoomin:" + d8 + "," + d9);
                    mo171233b(new C113831iz(120, new double[]{pow2, d8, d9}));
                    i4 = i5;
                }
            }
            Runnable runnable4 = runnable;
            if (runnable4 != null) {
                mo171233b(new C113831iz(runnable4));
            }
        }
    }

    /* renamed from: a */
    private void m155589a(boolean z, Runnable runnable) {
        Runnable runnable2 = runnable;
        this.f339685o.mo173098e();
        final double m = m155636m(0.0d - ((double) mo171245h()));
        final double i = 0.0d - ((double) mo171246i());
        if (m != 0.0d || i != 0.0d) {
            C113889km.m157537a("postRotateAndSkew distance:" + m + "," + i);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final float f = (float) (m * 0.10000000149011612d);
            C1135063 r142 = r0;
            final float f2 = (float) (0.10000000149011612d * i);
            C1135063 r0 = new C113831iz(new double[]{0.0d, 0.0d, 0.0d, 0.0d}, !z) {

                /* renamed from: f */
                public final /* synthetic */ double f339712f = 0.0d;

                /* renamed from: g */
                public final /* synthetic */ double f339713g = 0.0d;

                /* renamed from: a */
                public final boolean mo171260a() {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime;
                    double a = C104551iw.m139972a(elapsedRealtime, f);
                    double a2 = C104551iw.m139972a(elapsedRealtime, f2);
                    double[] dArr = this.f340601A;
                    dArr[2] = dArr[2] + Math.abs(a);
                    double[] dArr2 = this.f340601A;
                    dArr2[3] = dArr2[3] + Math.abs(a2);
                    boolean z = this.f340601A[2] >= Math.abs(m);
                    boolean z2 = this.f340601A[3] >= Math.abs(i);
                    if (z) {
                        this.f340601A[0] = this.f339712f - ((double) C113503ad.this.mo171245h());
                    } else {
                        this.f340601A[0] = a;
                    }
                    if (z2) {
                        this.f340601A[1] = this.f339713g - ((double) C113503ad.this.mo171246i());
                    } else {
                        this.f340601A[1] = a2;
                    }
                    return z && z2;
                }
            };
            mo171233b((C113831iz) r142);
            if (runnable2 != null) {
                C113831iz izVar = new C113831iz(runnable2);
                izVar.f340604D = true;
                izVar.f340602B = 0;
                mo171233b(izVar);
            }
        } else if (runnable2 != null) {
            C113831iz izVar2 = new C113831iz(runnable2);
            izVar2.f340604D = true;
            izVar2.f340602B = 0;
            mo171233b(izVar2);
        }
    }

    /* renamed from: b */
    public final void mo171228b(GeoPoint geoPoint, Runnable runnable) {
        if (geoPoint != null) {
            this.f339685o.mo173098e();
            GeoPoint geoPoint2 = this.f339663A.f342794m;
            double[] a = C113829ih.m157228a((double) geoPoint2.getLatitudeE6(), (double) (geoPoint.getLatitudeE6() - geoPoint2.getLatitudeE6()));
            double[] a2 = C113829ih.m157228a((double) geoPoint2.getLongitudeE6(), (double) (geoPoint.getLongitudeE6() - geoPoint2.getLongitudeE6()));
            for (int i = 0; i < 20; i++) {
                mo171233b(new C113831iz(4, new double[]{a[i], a2[i]}));
            }
            if (runnable != null) {
                mo171233b(new C113831iz(runnable));
            }
        }
    }

    /* renamed from: a */
    public final void mo171199a(double d, double d2) {
        double m = m155636m(d - ((double) mo171245h()));
        double i = d2 - ((double) mo171246i());
        if (m != 0.0d || i != 0.0d) {
            C113889km.m157537a("rotateAndSkew distance:" + m + "," + i);
            mo171233b(new C113831iz(102, new double[]{m, i, 0.0d, 0.0d}, true));
        }
    }

    /* renamed from: a */
    public final void mo171201a(double d, double d2, boolean z) {
        final double m = m155636m(d - ((double) mo171245h()));
        final double i = d2 - ((double) mo171246i());
        if (m != 0.0d || i != 0.0d) {
            C113889km.m157537a("postRotateAndSkew distance:" + m + "," + i);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final float f = (float) (m * 0.10000000149011612d);
            final float f2 = (float) (0.10000000149011612d * i);
            final double d3 = d;
            C1135052 r16 = r0;
            final double d4 = d2;
            C1135052 r0 = new C113831iz(new double[]{d, d2, 0.0d, 0.0d}, !z) {
                /* renamed from: a */
                public final boolean mo171260a() {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime;
                    double a = C104551iw.m139972a(elapsedRealtime, f);
                    double a2 = C104551iw.m139972a(elapsedRealtime, f2);
                    double[] dArr = this.f340601A;
                    dArr[2] = dArr[2] + Math.abs(a);
                    double[] dArr2 = this.f340601A;
                    dArr2[3] = dArr2[3] + Math.abs(a2);
                    boolean z = this.f340601A[2] >= Math.abs(m);
                    boolean z2 = this.f340601A[3] >= Math.abs(i);
                    if (z) {
                        this.f340601A[0] = d3 - ((double) C113503ad.this.mo171245h());
                    } else {
                        this.f340601A[0] = a;
                    }
                    if (z2) {
                        this.f340601A[1] = d4 - ((double) C113503ad.this.mo171246i());
                    } else {
                        this.f340601A[1] = a2;
                    }
                    return z && z2;
                }
            };
            mo171233b((C113831iz) r16);
        }
    }

    /* renamed from: a */
    public final void mo171203a(float f, float f2, boolean z) {
        this.f339663A.mo173061a(f - 0.5f, f2 - 0.5f, z);
        if (z) {
            mo171236c();
        }
    }

    /* renamed from: b */
    public final void mo171235b(Runnable runnable) {
        C113961mq mqVar;
        C114367v.C114369a aVar = this.f339663A.f342783b;
        if (aVar.f342821q > aVar.f342818n) {
            C114216sq f = this.f339696z.mo171638f();
            if (!(0 == f.f342024e || (mqVar = f.f342029j) == null)) {
                mqVar.mo172432a((C113961mq.C113963a) new C113961mq.C113963a() {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (C114216sq.this.f342024e != 0) {
                            C114216sq.this.f342023d.nativeZoomOut(C114216sq.this.f342024e);
                        }
                    }
                });
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    private void m155584a(C113716fa faVar) {
        if (faVar != null) {
            if (this.f339689s == null) {
                this.f339689s = new ArrayList();
            }
            synchronized (this.f339690t) {
                if (!this.f339689s.contains(faVar)) {
                    this.f339689s.add(faVar);
                }
            }
        }
    }

    /* renamed from: b */
    private void m155597b(GeoPoint geoPoint) {
        mo171211a(geoPoint, (Runnable) null);
    }

    /* renamed from: a */
    public final void mo171213a(C113722fg fgVar) {
        if (fgVar != null) {
            synchronized (this.f339678W) {
                if (!this.f339678W.contains(fgVar)) {
                    this.f339678W.add(fgVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m155587a(C113721ff ffVar) {
        if (ffVar != null) {
            synchronized (this.f339691u) {
                if (!this.f339691u.contains(ffVar)) {
                    this.f339691u.add(ffVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo171215a(C113726fk fkVar) {
        if (fkVar != null) {
            synchronized (this.f339679X) {
                if (!this.f339679X.contains(fkVar)) {
                    this.f339679X.add(fkVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m155585a(C113719fd fdVar) {
        if (fdVar != null) {
            synchronized (this.f339687q) {
                if (!this.f339687q.contains(fdVar)) {
                    this.f339687q.add(fdVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m155583a(C55064ey eyVar) {
        if (eyVar != null) {
            synchronized (this.f339688r) {
                if (!this.f339688r.contains(eyVar)) {
                    this.f339688r.add(eyVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo171218a(C114020os osVar) {
        if (osVar != null && !this.f339677V.contains(osVar)) {
            this.f339677V.add(osVar);
        }
    }

    /* renamed from: a */
    public final void mo171216a(C113727fl flVar) {
        if (flVar != null) {
            synchronized (this.f339680Y) {
                if (!this.f339680Y.contains(flVar)) {
                    this.f339680Y.add(flVar);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r1 > ((double) r11)) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m155578a(com.tencent.map.lib.models.GeoPoint r11, android.graphics.Rect r12) {
        /*
            r10 = this;
            com.tencent.mapsdk.internal.es r0 = r10.f339664B
            com.tencent.mapsdk.internal.fo r11 = r0.mo172027a((com.tencent.map.lib.models.GeoPoint) r11)
            double r1 = r11.f340215a
            int r1 = (int) r1
            double r2 = r11.f340216b
            int r2 = (int) r2
            boolean r1 = r12.contains(r1, r2)
            if (r1 == 0) goto L_0x0013
            return
        L_0x0013:
            double r1 = r11.f340215a
            int r3 = r12.left
            double r4 = (double) r3
            r6 = 0
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x0021
        L_0x001e:
            double r3 = (double) r3
            double r3 = r3 - r1
            goto L_0x002a
        L_0x0021:
            int r3 = r12.right
            double r4 = (double) r3
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0029
            goto L_0x001e
        L_0x0029:
            r3 = r6
        L_0x002a:
            double r1 = r11.f340216b
            int r11 = r12.top
            double r8 = (double) r11
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0037
        L_0x0033:
            double r11 = (double) r11
            double r6 = r11 - r1
            goto L_0x003f
        L_0x0037:
            int r11 = r12.bottom
            double r8 = (double) r11
            int r12 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x003f
            goto L_0x0033
        L_0x003f:
            com.tencent.mapsdk.internal.v r11 = r10.f339663A
            com.tencent.map.lib.models.GeoPoint r11 = r11.f342794m
            com.tencent.mapsdk.internal.fo r11 = r0.mo172027a((com.tencent.map.lib.models.GeoPoint) r11)
            double r1 = r11.f340215a
            double r1 = r1 - r3
            r11.f340215a = r1
            double r1 = r11.f340216b
            double r1 = r1 - r6
            r11.f340216b = r1
            com.tencent.map.lib.models.GeoPoint r11 = r0.mo172025a((com.tencent.mapsdk.internal.C113732fo) r11)
            r12 = 0
            r10.mo171211a((com.tencent.map.lib.models.GeoPoint) r11, (java.lang.Runnable) r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113503ad.m155578a(com.tencent.map.lib.models.GeoPoint, android.graphics.Rect):void");
    }

    /* renamed from: a */
    public final void mo171210a(GeoPoint geoPoint, int i, Runnable runnable) {
        mo171209a(geoPoint, (float) i, runnable);
    }

    /* renamed from: a */
    public final void mo171209a(GeoPoint geoPoint, float f, Runnable runnable) {
        if (geoPoint != null) {
            if (f >= 3.0f && f <= 20.0f) {
                this.f339696z.mo171638f().mo172912a(geoPoint, (int) f);
            }
            this.f339684ac = runnable;
        }
    }

    /* renamed from: a */
    public final void mo171207a(int i, Runnable runnable) {
        C113961mq mqVar;
        C114216sq f = this.f339696z.mo171638f();
        if (!(0 == f.f342024e || (mqVar = f.f342029j) == null)) {
            mqVar.mo172432a((C113961mq.C113963a) new C113961mq.C113963a(i) {

                /* renamed from: b */
                public final /* synthetic */ boolean f342274b = true;

                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (C114216sq.this.f342024e != 0) {
                        C114216sq.this.f342023d.nativeSetScaleLevel(C114216sq.this.f342024e, r6, this.f342274b);
                    }
                }
            });
        }
        runnable.run();
    }

    /* renamed from: a */
    private void m155574a(int i, final double d) {
        mo171207a(i, (Runnable) new Runnable() {
            public final void run() {
                C113503ad.this.mo171201a((360.0d - d) % 360.0d, (double) MapParamConstants.MAX_SKEW_ANGLE, false);
            }
        });
    }

    /* renamed from: a */
    private C24212ij m155570a(int i, Object obj, Object obj2) {
        if (i == 0) {
            return C24229it.m30234a((C24211ig) this, 0, 1);
        }
        if (i == 1) {
            return C24229it.m30233a((C24211ig) this, (C24236ix) new C113818hx(), new Object[]{obj, obj2});
        } else if (i == 2) {
            return C24229it.m30232a((C24211ig) this, 3, Math.log10(((Number) obj).doubleValue()) / Math.log10(2.0d), Math.log10(((Number) obj2).doubleValue()) / Math.log10(2.0d));
        } else if (i == 3) {
            double doubleValue = ((Number) obj).doubleValue();
            return C24229it.m30232a((C24211ig) this, 2, (double) mo171245h(), (((Number) obj2).doubleValue() - doubleValue) + ((double) mo171245h()));
        } else if (i != 4) {
            return null;
        } else {
            double doubleValue2 = ((Number) obj).doubleValue();
            return C24229it.m30232a((C24211ig) this, 4, (double) mo171246i(), (((Number) obj2).doubleValue() - doubleValue2) + ((double) mo171246i()));
        }
    }

    /* renamed from: a */
    public final void mo40962a(int i, Object obj) {
        if (i == 1) {
            GeoPoint geoPoint = (GeoPoint) obj;
            mo171206a(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6(), 2);
        } else if (i == 2) {
            m155626e(((Number) obj).doubleValue() - ((double) mo171245h()));
        } else if (i == 3) {
            mo171202a((float) Math.pow(2.0d, ((Number) obj).doubleValue()));
        } else if (i == 4) {
            m155618d(((Number) obj).doubleValue() - ((double) mo171246i()));
        }
    }

    /* renamed from: a */
    public final void mo171205a(int i, int i2) {
        m155592b((double) i, (double) i2);
    }

    /* renamed from: a */
    private void m155580a(C113511a aVar) {
        this.f339666D = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0108  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m155579a(final com.tencent.map.lib.models.GeoPoint r14, final com.tencent.mapsdk.internal.C113830ii r15) {
        /*
            r13 = this;
            android.graphics.Rect r0 = r13.mo171255r()
            r1 = 0
            if (r0 == 0) goto L_0x0014
            int r2 = r14.getLongitudeE6()
            int r3 = r14.getLatitudeE6()
            boolean r0 = r0.contains(r2, r3)
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            com.tencent.mapsdk.internal.ad$6 r2 = new com.tencent.mapsdk.internal.ad$6
            r2.<init>(r15)
            com.tencent.mapsdk.internal.v r15 = r13.f339663A
            com.tencent.mapsdk.internal.v$a r3 = r15.f342783b
            float r3 = r3.f342820p
            if (r0 != 0) goto L_0x010c
            com.tencent.map.lib.models.GeoPoint r15 = r15.f342794m
            com.tencent.mapsdk.internal.es r0 = r13.f339664B
            com.tencent.mapsdk.internal.fo r0 = r0.mo172027a((com.tencent.map.lib.models.GeoPoint) r15)
            com.tencent.mapsdk.internal.es r4 = r13.f339664B
            com.tencent.mapsdk.internal.fo r4 = r4.mo172027a((com.tencent.map.lib.models.GeoPoint) r14)
            android.graphics.Rect r5 = r13.f339665C
            r6 = 1
            if (r5 == 0) goto L_0x005f
            double r7 = r0.f340215a
            double r9 = r4.f340215a
            double r7 = r7 - r9
            double r7 = java.lang.Math.abs(r7)
            double r9 = r0.f340216b
            double r4 = r4.f340216b
            double r9 = r9 - r4
            double r4 = java.lang.Math.abs(r9)
            android.graphics.Rect r0 = r13.f339665C
            int r0 = r0.width()
            double r9 = (double) r0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x005d
            android.graphics.Rect r0 = r13.f339665C
            int r0 = r0.height()
            double r7 = (double) r0
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x005f
        L_0x005d:
            r0 = 0
            goto L_0x0060
        L_0x005f:
            r0 = 1
        L_0x0060:
            if (r0 != 0) goto L_0x0108
            android.graphics.Rect r0 = r13.f339665C
            if (r0 == 0) goto L_0x0071
            int r1 = r0.width()
            android.graphics.Rect r0 = r13.f339665C
            int r0 = r0.height()
            goto L_0x0072
        L_0x0071:
            r0 = 0
        L_0x0072:
            if (r1 == 0) goto L_0x00e2
            if (r0 == 0) goto L_0x00e2
            if (r15 == 0) goto L_0x00e2
            if (r14 != 0) goto L_0x007b
            goto L_0x00e2
        L_0x007b:
            com.tencent.mapsdk.internal.fo r4 = m155569a((com.tencent.map.lib.models.GeoPoint) r15)
            com.tencent.mapsdk.internal.fo r5 = m155569a((com.tencent.map.lib.models.GeoPoint) r14)
            double r7 = r5.f340215a
            double r9 = r4.f340215a
            double r7 = r7 - r9
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0092
            double r7 = java.lang.Math.abs(r7)
        L_0x0092:
            double r11 = r5.f340216b
            double r4 = r4.f340216b
            double r11 = r11 - r4
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x009f
            double r11 = java.lang.Math.abs(r11)
        L_0x009f:
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r7 * r4
            double r11 = r11 * r4
            int r4 = r13.f339670H
            int r1 = r1 - r4
            int r4 = r13.f339672J
            int r1 = r1 - r4
            int r4 = r13.f339671I
            int r0 = r0 - r4
            int r4 = r13.f339673K
            int r0 = r0 - r4
            if (r1 > 0) goto L_0x00b4
            r1 = 1
        L_0x00b4:
            if (r0 > 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r6 = r0
        L_0x00b8:
            double r0 = (double) r1
            double r7 = r7 / r0
            double r0 = java.lang.Math.log(r7)
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r7 = java.lang.Math.log(r4)
            double r0 = r0 / r7
            double r6 = (double) r6
            double r11 = r11 / r6
            double r6 = java.lang.Math.log(r11)
            double r4 = java.lang.Math.log(r4)
            double r6 = r6 / r4
            double r0 = java.lang.Math.max(r0, r6)
            r4 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r4 = r4 - r0
            float r0 = (float) r4
            com.tencent.mapsdk.internal.v r1 = r13.f339663A
            if (r1 == 0) goto L_0x00e4
            int r0 = (int) r0
            float r0 = com.tencent.mapsdk.internal.C114367v.C114369a.m160574a((int) r0)
            goto L_0x00e4
        L_0x00e2:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x00e4:
            int r1 = r14.getLatitudeE6()
            int r4 = r15.getLatitudeE6()
            int r1 = r1 + r4
            int r1 = r1 / 2
            int r4 = r14.getLongitudeE6()
            int r15 = r15.getLongitudeE6()
            int r4 = r4 + r15
            int r4 = r4 / 2
            com.tencent.map.lib.models.GeoPoint r15 = new com.tencent.map.lib.models.GeoPoint
            r15.<init>((int) r1, (int) r4)
            com.tencent.mapsdk.internal.ad$7 r1 = new com.tencent.mapsdk.internal.ad$7
            r1.<init>(r14, r3, r2)
            r13.mo171227b((com.tencent.map.lib.models.GeoPoint) r15, (float) r0, (java.lang.Runnable) r1)
            return
        L_0x0108:
            r13.mo171228b((com.tencent.map.lib.models.GeoPoint) r14, (java.lang.Runnable) r2)
            return
        L_0x010c:
            r13.mo171228b((com.tencent.map.lib.models.GeoPoint) r14, (java.lang.Runnable) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113503ad.m155579a(com.tencent.map.lib.models.GeoPoint, com.tencent.mapsdk.internal.ii):void");
    }

    /* renamed from: a */
    public static C113732fo m155569a(GeoPoint geoPoint) {
        double min = Math.min(Math.max(Math.sin((((double) geoPoint.getLatitudeE6()) / 1000000.0d) * 0.017453292519943295d), -0.9999d), 0.9999d);
        C113732fo foVar = new C113732fo();
        foVar.mo172083a(((((double) geoPoint.getLongitudeE6()) / 1000000.0d) * 745654.0444444445d) + 1.34217728E8d, (Math.log((min + 1.0d) / (1.0d - min)) * 4.272282972352698E7d * 0.5d) + 1.34217728E8d);
        return foVar;
    }

    /* renamed from: a */
    public final void mo171220a(boolean z) {
        if (z) {
            Runnable runnable = this.f339684ac;
            if (runnable != null) {
                runnable.run();
                this.f339684ac = null;
            }
            mo171236c();
        }
    }

    /* renamed from: a */
    public final void mo171219a(Runnable runnable) {
        if (mo171249l()) {
            this.f339696z.mo171638f().mo172933c(((float) this.f339696z.mo171639g().width()) / 2.0f, ((float) this.f339696z.mo171639g().height()) / 2.0f);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    public final void mo171211a(GeoPoint geoPoint, Runnable runnable) {
        if (geoPoint != null) {
            mo171209a(geoPoint, (float) this.f339663A.f342783b.f342821q, runnable);
        }
    }
}
