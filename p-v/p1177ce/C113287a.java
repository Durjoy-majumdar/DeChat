package p1177ce;

import com.tencent.matrix.batterycanary.monitor.feature.C114451e;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import java.util.concurrent.atomic.AtomicBoolean;
import p761yd.C91441c;
import p933be.C113173i;
import p933be.C79691a;
import p981ie.C117159b;
import p981ie.C117187w;

/* renamed from: ce.a */
public class C113287a {

    /* renamed from: a */
    public int f338963a;

    /* renamed from: b */
    public int f338964b;

    /* renamed from: c */
    public int f338965c;

    /* renamed from: d */
    public int f338966d;

    /* renamed from: e */
    public int f338967e;

    /* renamed from: f */
    public int f338968f;

    /* renamed from: g */
    public int f338969g;

    /* renamed from: h */
    public int f338970h;

    /* renamed from: i */
    public String f338971i = "";

    /* renamed from: j */
    public int f338972j;

    /* renamed from: k */
    public String f338973k = "";

    /* renamed from: l */
    public int f338974l;

    /* renamed from: m */
    public boolean f338975m = false;

    /* renamed from: n */
    public long f338976n;

    /* renamed from: o */
    public AtomicBoolean f338977o;

    /* renamed from: ce.a$a */
    public static final class C113288a extends C113287a {

        /* renamed from: p */
        public final C113314g f338978p;

        public C113288a(C113314g gVar) {
            this.f338978p = gVar;
        }

        /* renamed from: c */
        public int mo165839c() {
            return C117159b.m165201b(this.f338978p.mo165879a(), this.f338978p.f339064n);
        }

        /* renamed from: d */
        public int mo165840d() {
            return C117159b.m165213n(this.f338978p.mo165879a());
        }

        /* renamed from: e */
        public long mo165841e() {
            return 0;
        }

        /* renamed from: f */
        public boolean mo165842f() {
            return C117159b.m165217r(this.f338978p.mo165879a());
        }

        /* renamed from: g */
        public boolean mo165843g() {
            return C117159b.m165218s(this.f338978p.mo165879a());
        }

        /* renamed from: h */
        public boolean mo165844h() {
            return this.f338978p.f339064n;
        }
    }

    /* renamed from: a */
    public static C113287a m155093a() {
        C113173i iVar;
        if (!C91441c.m114729c() || (iVar = (C113173i) C91441c.m114730d().mo125377a(C113173i.class)) == null) {
            return m155094b(1);
        }
        C113288a aVar = new C113288a(iVar.f338613h);
        aVar.f338975m = true;
        return aVar;
    }

    /* renamed from: b */
    public static C113287a m155094b(long j) {
        if (j <= 0) {
            j = 0;
        }
        C113287a aVar = new C113287a();
        aVar.f338976n = j;
        C114451e eVar = (C114451e) C79691a.m96804a(C114451e.class);
        if (eVar != null) {
            C114451e.C114458h i = eVar.mo173652i(j);
            if (i.f343204c) {
                aVar.f338963a = ((Long) i.f343145e.f343211a).intValue();
                aVar.f338964b = ((Long) i.f343146f.f343211a).intValue();
                aVar.f338965c = ((Long) i.f343147g.f343211a).intValue();
                aVar.f338966d = ((Long) i.f343148h.f343211a).intValue();
                C117187w.C117192d j2 = eVar.mo173653j(j);
                C117187w.C117192d.C117193a b = j2.mo181114b();
                if (b != null) {
                    aVar.f338971i = b.f351077a;
                    aVar.f338972j = b.f351078b;
                    C117187w.C117192d.C117193a c = j2.mo181115c();
                    if (c != null) {
                        aVar.f338973k = c.f351077a;
                        aVar.f338974l = c.f351078b;
                    }
                    C114536x xVar = (C114536x) C79691a.m96804a(C114536x.class);
                    if (xVar != null) {
                        C114536x.C114546i k = xVar.mo173711k(j);
                        if (k.f343204c) {
                            aVar.f338967e = ((Long) k.f343318e.f343211a).intValue();
                            aVar.f338968f = ((Long) k.f343319f.f343211a).intValue();
                            aVar.f338969g = ((Long) k.f343320g.f343211a).intValue();
                            aVar.f338970h = ((Long) k.f343321h.f343211a).intValue();
                            aVar.f338975m = true;
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: c */
    public int mo165839c() {
        AtomicBoolean atomicBoolean = this.f338977o;
        if ((atomicBoolean != null && atomicBoolean.get()) || this.f338963a >= 50) {
            return 1;
        }
        if (this.f338965c >= 50) {
            return 3;
        }
        return this.f338966d >= 50 ? 4 : 2;
    }

    /* renamed from: d */
    public int mo165840d() {
        if (this.f338967e >= 50) {
            return 1;
        }
        if (this.f338969g >= 50) {
            return 3;
        }
        return this.f338970h >= 50 ? 4 : 2;
    }

    /* renamed from: e */
    public long mo165841e() {
        return Math.max(1, this.f338976n / 60000);
    }

    /* renamed from: f */
    public boolean mo165842f() {
        return mo165839c() == 3;
    }

    /* renamed from: g */
    public boolean mo165843g() {
        return mo165840d() == 1;
    }

    /* renamed from: h */
    public boolean mo165844h() {
        AtomicBoolean atomicBoolean = this.f338977o;
        return atomicBoolean != null ? atomicBoolean.get() : mo165839c() == 1;
    }

    public String toString() {
        return "AppStats{appFgRatio=" + this.f338963a + ", appBgRatio=" + this.f338964b + ", appFgSrvRatio=" + this.f338965c + ", appFloatRatio=" + this.f338966d + ", devChargingRatio=" + this.f338967e + ", devUnChargingRatio=" + this.f338968f + ", devSceneOffRatio=" + this.f338969g + ", devLowEnergyRatio=" + this.f338970h + ", sceneTop1='" + this.f338971i + '\'' + ", sceneTop1Ratio=" + this.f338972j + ", sceneTop2='" + this.f338973k + '\'' + ", sceneTop2Ratio=" + this.f338974l + ", isValid=" + this.f338975m + ", duringMillis=" + this.f338976n + ", foregroundOverride=" + this.f338977o + '}';
    }
}
