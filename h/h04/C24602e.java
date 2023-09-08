package h04;

import gy3.C87412m;
import n04.C25143j0;
import n04.C25176s0;
import wy3.C26447e;

/* renamed from: h04.e */
public class C24602e implements C24603f, C24605h {

    /* renamed from: a */
    public final C26447e f70200a;

    /* renamed from: b */
    public final C26447e f70201b;

    public C24602e(C26447e eVar, C24602e eVar2) {
        C87412m.m108594g(eVar, "classDescriptor");
        this.f70200a = eVar;
        this.f70201b = eVar;
    }

    public boolean equals(Object obj) {
        C26447e eVar = this.f70200a;
        C26447e eVar2 = null;
        C24602e eVar3 = obj instanceof C24602e ? (C24602e) obj : null;
        if (eVar3 != null) {
            eVar2 = eVar3.f70200a;
        }
        return C87412m.m108589b(eVar, eVar2);
    }

    public C25143j0 getType() {
        C25176s0 s = this.f70200a.mo36111s();
        C87412m.m108593f(s, "classDescriptor.defaultType");
        return s;
    }

    public int hashCode() {
        return this.f70200a.hashCode();
    }

    /* renamed from: k */
    public final C26447e mo51311k() {
        return this.f70200a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Class{");
        C25176s0 s = this.f70200a.mo36111s();
        C87412m.m108593f(s, "classDescriptor.defaultType");
        sb.append(s);
        sb.append('}');
        return sb.toString();
    }
}
