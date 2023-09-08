package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114513o0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import oa1.C117731d;
import p1177ce.C113314g;
import p737wf.C38088a;

/* renamed from: oe.t */
public abstract class C117777t {

    /* renamed from: a */
    public final C114467i f352286a;

    public C117777t(C113314g gVar, String str) {
        this.f352286a = new C117776s(gVar, str);
        mo182522a();
    }

    /* renamed from: a */
    public abstract void mo182522a();

    /* renamed from: b */
    public C117777t mo182530b(boolean z) {
        this.f352286a.mo173675s(JiffiesMonitorFeature.JiffiesSnapshot.class);
        if (z) {
            this.f352286a.mo173675s(JiffiesMonitorFeature.UidJiffiesSnapshot.class);
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(oa1.C117731d.m166007c().mo182444f("clicfg_battery_health_acc_ms", "1", false, true));
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p212oe.C117777t mo182531c() {
        /*
            r8 = this;
            java.lang.Class<ge.b$a> r0 = p1195ge.C116947b.C116948a.class
            oa1.d r1 = oa1.C117731d.m166007c()
            java.lang.String r2 = "clicfg_battery_health_enable"
            java.lang.String r3 = "1"
            r4 = 0
            r5 = 1
            java.lang.String r1 = r1.mo182444f(r2, r3, r4, r5)
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007a
            com.tencent.matrix.batterycanary.monitor.feature.i r1 = r8.f352286a
            r1.mo173675s(r0)
            com.tencent.matrix.batterycanary.monitor.feature.i r1 = r8.f352286a
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature$UidCpuStateSnapshot> r2 = com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature.UidCpuStateSnapshot.class
            r1.mo173675s(r2)
            com.tencent.matrix.batterycanary.monitor.feature.i r1 = r8.f352286a
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.o0$b> r2 = com.tencent.matrix.batterycanary.monitor.feature.C114513o0.C114515b.class
            r1.mo173675s(r2)
            com.tencent.matrix.batterycanary.monitor.feature.i r1 = r8.f352286a
            boolean r2 = r1 instanceof p212oe.C117776s
            if (r2 == 0) goto L_0x007a
            java.lang.String r1 = r1.f343167p
            java.lang.String r2 = "biz"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x007a
            com.tencent.matrix.batterycanary.monitor.feature.i r1 = r8.f352286a
            oe.s r1 = (p212oe.C117776s) r1
            java.lang.String r1 = r1.mo182526y()
            java.lang.String r2 = "ExplicitBg"
            boolean r6 = r2.equals(r1)
            if (r6 != 0) goto L_0x0051
            java.lang.String r6 = "ExplicitFg"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x007a
        L_0x0051:
            oa1.d r6 = oa1.C117731d.m166007c()
            java.lang.String r7 = "clicfg_battery_health_acc_ms"
            java.lang.String r3 = r6.mo182444f(r7, r3, r4, r5)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r3)
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x007a
            if (r7 != 0) goto L_0x0075
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0071
            r1 = 600000(0x927c0, double:2.964394E-318)
            goto L_0x0074
        L_0x0071:
            r1 = 300000(0x493e0, double:1.482197E-318)
        L_0x0074:
            r3 = r1
        L_0x0075:
            com.tencent.matrix.batterycanary.monitor.feature.i r1 = r8.f352286a
            r1.mo173678u(r0, r3)
        L_0x007a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p212oe.C117777t.mo182531c():oe.t");
    }

    /* renamed from: d */
    public C117777t mo182532d(long j) {
        boolean equals = C117731d.m166007c().mo182444f("clicfg_battery_allpid_enable", "1", false, true).equals("1");
        boolean equals2 = C117731d.m166007c().mo182444f("clicfg_battery_thermal_sample_2", "1", false, true).equals("1");
        boolean equals3 = C117731d.m166007c().mo182444f("clicfg_battery_cpu_sample", "1", false, true).equals("1");
        C114467i iVar = this.f352286a;
        iVar.mo173678u(C114536x.C114541e.class, j);
        iVar.mo173678u(C114536x.C114543g.class, j);
        iVar.mo173678u(C114513o0.C114515b.class, j);
        if (equals2) {
            C114467i iVar2 = this.f352286a;
            iVar2.mo173678u(C114536x.C114548k.class, j);
            iVar2.mo173678u(C114536x.C114542f.class, j);
            iVar2.mo173678u(b$$h.class, j);
            iVar2.mo173678u(b$$k.class, j);
            iVar2.mo173678u(b$$l.class, j);
            if (C38088a.f100678a) {
                C114467i iVar3 = this.f352286a;
                iVar3.mo173678u(b$$i.class, j);
                iVar3.mo173678u(b$$j.class, j);
            }
        }
        if (equals3) {
            this.f352286a.mo173678u(CpuStatFeature.C114427b.class, j);
            this.f352286a.mo173678u(C114536x.C114540d.class, j);
        }
        if (equals) {
            this.f352286a.mo173678u(JiffiesMonitorFeature.UidJiffiesSnapshot.class, j);
        }
        return this;
    }

    /* renamed from: e */
    public C117777t mo182533e(long j) {
        C114467i iVar = this.f352286a;
        if (iVar instanceof C117776s) {
            ((C117776s) iVar).f343160i.putLong("extra_report_during", j);
        }
        return this;
    }
}
