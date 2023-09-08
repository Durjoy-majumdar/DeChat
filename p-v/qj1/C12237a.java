package qj1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: qj1.a */
public final class C12237a {

    /* renamed from: a */
    public boolean f35309a;

    /* renamed from: b */
    public ArrayList<Integer> f35310b;

    public C12237a() {
        this(false, (ArrayList) null, 3, (C8480h) null);
    }

    public C12237a(boolean z, ArrayList<Integer> arrayList, int i, C8480h hVar) {
        z = (i & 1) != 0 ? false : z;
        arrayList = (i & 2) != 0 ? new ArrayList<>() : arrayList;
        C87412m.m108594g(arrayList, "data");
        this.f35309a = z;
        this.f35310b = arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12237a)) {
            return false;
        }
        C12237a aVar = (C12237a) obj;
        return this.f35309a == aVar.f35309a && C87412m.m108589b(this.f35310b, aVar.f35310b);
    }

    public int hashCode() {
        boolean z = this.f35309a;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + this.f35310b.hashCode();
    }

    public String toString() {
        return "AudioStateData(isReady=" + this.f35309a + ", data=" + this.f35310b + ')';
    }
}
