package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1177ce.C113287a;
import p1177ce.C113291d;
import p269xe.d$$i;
import p269xe.d$$j;
import p981ie.C87705i;

/* renamed from: oe.m$$c */
public final /* synthetic */ class m$$c implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C117770m f352212a;

    public /* synthetic */ m$$c(C117770m mVar) {
        this.f352212a = mVar;
    }

    public final void accept(Object obj) {
        C117770m mVar = this.f352212a;
        mVar.getClass();
        Log.m105924i("MicroMsg.BusinessJiffiesMonitor", "finish, bizName = " + mVar.f352207a + ", minutes = " + ((C113287a) obj).mo165841e());
        C114467i iVar = mVar.f352209c;
        if ((iVar instanceof C117776s) && ((C117776s) iVar).mo182525A()) {
            if ("VoIp".equals(mVar.f352207a) || "MultiTalk".equals(mVar.f352207a)) {
                C113291d.C113292a.C113308d dVar = new C113291d.C113292a.C113308d();
                dVar.mo165870i();
                dVar.f339024a.append("| BizTest: '");
                dVar.f339024a.append(mVar.f352207a);
                dVar.mo165862a("'\n");
                new d$$i().mo165859a(mVar.f352209c, dVar);
                dVar.mo165867f();
                dVar.mo165865d();
            }
            if ("VoIp".equals(mVar.f352207a) || "MultiTalk".equals(mVar.f352207a)) {
                C114490k0.C114491a.C114503c.C114505b q = mVar.f352209c.mo173673q(b$$i.class);
                if (q == null || q.f343234f >= ((double) 35)) {
                    C114490k0.C114491a.C114503c.C114505b q2 = mVar.f352209c.mo173673q(C114536x.C114541e.class);
                    if (q2 != null && q2.f343234f < ((double) 35)) {
                        Log.m105924i("MicroMsg.BusinessJiffiesMonitor", "skip for low temp, batt = " + q2.f343234f);
                        return;
                    }
                } else {
                    Log.m105924i("MicroMsg.BusinessJiffiesMonitor", "skip for low temp, oppo = " + q.f343234f);
                    return;
                }
            }
            new d$$j("biz").mo183582a(mVar.f352209c);
        }
    }
}
