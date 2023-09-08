package o52;

import com.google.android.gms.actions.SearchIntents;
import gy3.C87412m;

/* renamed from: o52.b */
public final class C11353b {

    /* renamed from: a */
    public final String f33447a;

    /* renamed from: b */
    public final String f33448b;

    public C11353b(String str, String str2) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(str2, SearchIntents.EXTRA_QUERY);
        this.f33447a = str;
        this.f33448b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11353b)) {
            return false;
        }
        C11353b bVar = (C11353b) obj;
        return C87412m.m108589b(this.f33447a, bVar.f33447a) && C87412m.m108589b(this.f33448b, bVar.f33448b);
    }

    public int hashCode() {
        return (this.f33447a.hashCode() * 31) + this.f33448b.hashCode();
    }

    public String toString() {
        return "CreateFrameSetRootEvent(path=" + this.f33447a + ", query=" + this.f33448b + ')';
    }
}
