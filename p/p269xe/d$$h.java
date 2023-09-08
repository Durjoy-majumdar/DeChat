package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114444c;
import com.tencent.matrix.batterycanary.monitor.feature.C114451e;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114513o0;
import com.tencent.matrix.batterycanary.monitor.feature.C114519q0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.matrix.batterycanary.monitor.feature.C80364g;
import com.tencent.matrix.batterycanary.monitor.feature.C80368h0;
import com.tencent.matrix.batterycanary.monitor.feature.C80373t0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.ArrayList;
import p1177ce.C113314g;
import p212oe.C117750b;
import p212oe.C117776s;
import p212oe.C117777t;
import p212oe.b$$g;

/* renamed from: xe.d$$h */
public class d$$h extends C117777t {
    public d$$h(C118873d dVar, C113314g gVar, String str) {
        super(gVar, str);
    }

    /* renamed from: a */
    public void mo182522a() {
        mo182530b(false);
        this.f352286a.mo173675s(CpuStatFeature.C114427b.class);
        C114467i iVar = this.f352286a;
        iVar.mo173675s(C114444c.C114446c.class);
        iVar.mo173675s(C114519q0.C114523c.class);
        iVar.mo173675s(C80364g.C80367b.class);
        iVar.mo173675s(C80373t0.C80376b.class);
        iVar.mo173675s(C80368h0.C80371b.class);
        C114467i iVar2 = this.f352286a;
        iVar2.mo173675s(C114451e.C114458h.class);
        iVar2.mo173675s(C114536x.C114543g.class);
        iVar2.mo173675s(C114536x.C114541e.class);
        iVar2.mo173675s(C114513o0.C114515b.class);
        iVar2.mo173675s(b$$g.class);
        C114467i iVar3 = this.f352286a;
        if (iVar3 instanceof C117776s) {
            C117776s sVar = (C117776s) iVar3;
            synchronized (sVar.f352273s) {
                sVar.f352271q = new ArrayList();
            }
        }
        if (MMApplicationContext.isMainProcess()) {
            mo182531c();
        }
        mo182533e(C117750b.m166045c());
    }
}
