package p466cn;

import di3.C7335d;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import ou0.C110066a;
import ou0.C110071c;
import p492dn.C107058n;
import p492dn.C45426j;
import pu0.C110248b;
import qu0.C110472b;

@C86522b
/* renamed from: cn.a */
public final class C104381a extends C86301e implements C45426j {
    public boolean Jh0() {
        return C110472b.f330365a.mo161951b();
    }

    public C107058n n40() {
        Class cls = C110248b.class;
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(SubCoreAudio::class.java)");
        C110066a aVar = ((C110248b) c).f329779e;
        if (aVar != null) {
            return aVar;
        }
        C110071c cVar = new C110071c();
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(SubCoreAudio::class.java)");
        ((C110248b) c2).f329781g[0] = "music";
        return cVar;
    }
}
