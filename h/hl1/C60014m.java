package hl1;

import cl1.C54963d0;
import rx3.C13604l;
import vk1.C65762c;

/* renamed from: hl1.m */
public final class C60014m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171299d;

    public C60014m(C59988k kVar) {
        this.f171299d = kVar;
    }

    public final void run() {
        C59988k startUIC;
        Class cls = C54963d0.class;
        if (((C54963d0) this.f171299d.mo83051g(cls)).f154053G) {
            C65762c cVar = this.f171299d.f166848f;
            if (cVar != null) {
                cVar.notifySEIMicUserChange(cVar != null ? cVar.getCurrentMicData() : null, true, (C13604l<Integer, Integer>) null);
            }
        } else if (((C54963d0) this.f171299d.mo83051g(cls)).f154073p != null) {
            C65762c cVar2 = this.f171299d.f166848f;
            if (cVar2 != null) {
                cVar2.notifyPKMicUserChange(false);
            }
        } else {
            C65762c cVar3 = this.f171299d.f166848f;
            if (cVar3 != null) {
                cVar3.notifyAudienceMicUserChange(false);
            }
        }
        C65762c cVar4 = this.f171299d.f166848f;
        if (cVar4 != null && (startUIC = cVar4.getStartUIC()) != null) {
            C59988k.m69861q(startUIC, (C13604l) null, false, 3, (Object) null);
        }
    }
}
