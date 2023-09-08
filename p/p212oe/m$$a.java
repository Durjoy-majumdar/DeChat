package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import p1071ae.C112785a;
import p1177ce.C113287a;
import p269xe.C118872b;

/* renamed from: oe.m$$a */
public final /* synthetic */ class m$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117770m f352210d;

    public /* synthetic */ m$$a(C117770m mVar) {
        this.f352210d = mVar;
    }

    public final void run() {
        C117770m mVar = this.f352210d;
        C114467i iVar = mVar.f352209c;
        if (iVar != null) {
            iVar.mo173662f();
            C112785a aVar = C112785a.f337705f;
            C117776s sVar = (C117776s) mVar.f352209c;
            boolean z = false;
            if (aVar.f337707b) {
                String y = sVar.mo182526y();
                if (aVar.mo164540c().equals(y) || aVar.mo164541d().equals(y)) {
                    z = true;
                }
            }
            if (z) {
                synchronized (aVar.f337706a) {
                    String y2 = sVar.mo182526y();
                    if (aVar.mo164540c().equals(y2) || aVar.mo164541d().equals(y2)) {
                        aVar.mo164538a("Overall", sVar);
                        C113287a aVar2 = sVar.f343163l;
                        if (aVar2 != null && aVar2.f338976n >= 600000) {
                            aVar.mo164539b();
                        }
                    }
                    aVar.mo164538a(C118872b.m167605b(sVar), sVar);
                }
                aVar.mo164543f();
            }
            mVar.f352209c.mo173664h(new m$$c(mVar));
            mVar.f352209c.mo173658a();
            mVar.f352209c = null;
        }
    }
}
