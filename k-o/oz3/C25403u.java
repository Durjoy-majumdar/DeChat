package oz3;

import d04.C24442a;
import e04.C24469d;
import gy3.C87412m;
import vy3.C26384c;
import vz3.C22827d;
import vz3.C26408b;
import wy3.C26447e;

/* renamed from: oz3.u */
public final class C25403u {
    /* renamed from: a */
    public static final String m32594a(C21911y yVar, C26447e eVar, String str) {
        String str2;
        C87412m.m108594g(yVar, "<this>");
        C87412m.m108594g(eVar, "classDescriptor");
        C87412m.m108594g(str, "jvmDescriptor");
        C26384c cVar = C26384c.f73585a;
        C22827d i = C24442a.m30540g(eVar).mo35982i();
        C87412m.m108593f(i, "fqNameSafe.toUnsafe()");
        C26408b g = cVar.mo53374g(i);
        if (g != null) {
            str2 = C24469d.m30612b(g).mo51171e();
            C87412m.m108593f(str2, "byClassId(it).internalName");
        } else {
            str2 = C25376e.m32539a(eVar, C25361a0.f71864a);
        }
        C87412m.m108594g(str2, "internalName");
        return str2 + '.' + str;
    }
}
