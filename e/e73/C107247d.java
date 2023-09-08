package e73;

import e73.C107248e;
import f40.C86709a0;
import pv2.C110259i;
import pv2.C110260j;
import pv2.C35701m;

/* renamed from: e73.d */
public class C107247d implements C35701m {

    /* renamed from: a */
    public final /* synthetic */ C107245c f320893a;

    public C107247d(C107245c cVar) {
        this.f320893a = cVar;
    }

    /* renamed from: n */
    public void mo59577n(int i, String str) {
        C107245c cVar = this.f320893a;
        if (!cVar.f320891h) {
            if (i == 0) {
                C110260j a = C110259i.m149874a();
                String str2 = a.f329808a;
                String str3 = a.f329809b;
                this.f320893a.getClass();
                C86709a0.m107524d().mo123460f(new C45551f(str2, str3));
                return;
            }
            C107248e.C107249a aVar = cVar.f320887d;
            if (aVar != null) {
                aVar.mo157720n(2, "init soter failed");
            }
        }
    }
}
