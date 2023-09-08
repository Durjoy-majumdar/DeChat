package p965fe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114513o0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import p1195ge.C116947b;
import p329d3.C116555h;

/* renamed from: fe.d */
public class C116860d implements C116555h<C114467i> {

    /* renamed from: a */
    public final /* synthetic */ C116862f f350262a;

    public C116860d(C116862f fVar) {
        this.f350262a = fVar;
    }

    public Object get() {
        C114467i iVar = new C114467i(this.f350262a.f350266c.f252126f, "topIndicator");
        iVar.mo173675s(JiffiesMonitorFeature.UidJiffiesSnapshot.class);
        iVar.mo173675s(CpuStatFeature.C114427b.class);
        iVar.mo173675s(CpuStatFeature.UidCpuStateSnapshot.class);
        iVar.mo173675s(C116947b.C116948a.class);
        iVar.mo173675s(C114513o0.C114515b.class);
        iVar.mo173678u(C114536x.C114543g.class, 500);
        iVar.mo173678u(C114536x.C114540d.class, 500);
        iVar.mo173678u(C114513o0.C114514a.class, 500);
        return iVar;
    }
}
