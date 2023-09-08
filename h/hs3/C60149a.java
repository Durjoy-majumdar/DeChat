package hs3;

import gy3.C87412m;
import org.json.JSONArray;

/* renamed from: hs3.a */
public final class C60149a {

    /* renamed from: a */
    public final String f171695a;

    /* renamed from: b */
    public final JSONArray f171696b;

    public C60149a(String str, JSONArray jSONArray) {
        C87412m.m108594g(str, "detectorSource");
        C87412m.m108594g(jSONArray, "traceDump");
        this.f171695a = str;
        this.f171696b = jSONArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60149a)) {
            return false;
        }
        C60149a aVar = (C60149a) obj;
        return C87412m.m108589b(this.f171695a, aVar.f171695a) && C87412m.m108589b(this.f171696b, aVar.f171696b);
    }

    public int hashCode() {
        return (this.f171695a.hashCode() * 31) + this.f171696b.hashCode();
    }

    public String toString() {
        return "DetectParams(detectorSource=" + this.f171695a + ", traceDump=" + this.f171696b + ')';
    }
}
