package zu0;

import gv0.C20849e;
import gv0.e$$e;

public class s$$c implements e$$e {

    /* renamed from: a */
    public final /* synthetic */ C23589s f67684a;

    public s$$c(C23589s sVar) {
        this.f67684a = sVar;
    }

    /* renamed from: a */
    public void mo37065a(C20849e eVar) {
        if (C23584k.f67611q.f67610k.get() > this.f67684a.f67680k) {
            while (true) {
                long j = C23584k.f67611q.f67610k.get();
                C23589s sVar = this.f67684a;
                if (j <= sVar.f67680k) {
                    break;
                }
                sVar.f67679j.close();
                this.f67684a.f67679j.block(500);
            }
        }
        eVar.mo32547o1();
        C23583j jVar = C23584k.f67611q;
        byte[] bArr = eVar.f58899y.value;
        jVar.f67610k.addAndGet((long) (bArr == null ? 0 : bArr.length));
        jVar.f67605f.open();
    }
}
