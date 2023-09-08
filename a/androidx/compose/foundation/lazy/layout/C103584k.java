package androidx.compose.foundation.lazy.layout;

import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p631o1.C109897y0;

/* renamed from: androidx.compose.foundation.lazy.layout.k */
public final class C103584k implements C109897y0 {

    /* renamed from: a */
    public final C103581i f305911a;

    /* renamed from: b */
    public final Map<Object, Integer> f305912b = new LinkedHashMap();

    public C103584k(C103581i iVar) {
        C87412m.m108594g(iVar, "factory");
        this.f305911a = iVar;
    }

    /* renamed from: a */
    public void mo144569a(C109897y0.C109898a aVar) {
        C87412m.m108594g(aVar, "slotIds");
        ((LinkedHashMap) this.f305912b).clear();
        Iterator<Object> it = aVar.iterator();
        while (it.hasNext()) {
            Object b = this.f305911a.mo144568b(it.next());
            Integer num = (Integer) ((LinkedHashMap) this.f305912b).get(b);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it.remove();
            } else {
                this.f305912b.put(b, Integer.valueOf(intValue + 1));
            }
        }
    }

    /* renamed from: b */
    public boolean mo144570b(Object obj, Object obj2) {
        return C87412m.m108589b(this.f305911a.mo144568b(obj), this.f305911a.mo144568b(obj2));
    }
}
