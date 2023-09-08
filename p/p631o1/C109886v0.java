package p631o1;

import java.util.LinkedHashMap;
import p175j0.C108509q;
import p175j0.C60647d0;
import p175j0.C60667k2;
import p631o1.C109874t;
import p658q1.C110301j;

/* renamed from: o1.v0 */
public final class C109886v0 implements C60647d0 {

    /* renamed from: a */
    public final /* synthetic */ C60667k2 f328833a;

    public C109886v0(C60667k2 k2Var) {
        this.f328833a = k2Var;
    }

    public void dispose() {
        C109874t a = ((C109888w0) this.f328833a.getValue()).mo161196a();
        C110301j jVar = a.f328797a;
        jVar.f329922q = true;
        for (C109874t.C109875a aVar : ((LinkedHashMap) a.f328801e).values()) {
            C108509q qVar = aVar.f328811c;
            if (qVar != null) {
                qVar.dispose();
            }
        }
        a.f328797a.mo161708I();
        jVar.f329922q = false;
        ((LinkedHashMap) a.f328801e).clear();
        ((LinkedHashMap) a.f328802f).clear();
        a.f328807k = 0;
        a.f328806j = 0;
        ((LinkedHashMap) a.f328804h).clear();
        a.mo161189b();
    }
}
