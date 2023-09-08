package p813fl;

import gy3.C87412m;

/* renamed from: fl.p */
public abstract class C97923p {

    /* renamed from: a */
    public final int f287250a;

    public C97923p(int i) {
        this.f287250a = i;
    }

    /* renamed from: a */
    public boolean mo137247a(String str) {
        C87412m.m108594g(str, "groupId");
        return C87412m.m108589b(mo137249c(), str);
    }

    /* renamed from: b */
    public boolean mo137248b(Object obj) {
        if (equals(obj) && (obj instanceof C97923p)) {
            C97923p pVar = (C97923p) obj;
            return C87412m.m108589b(pVar.mo137250d(), mo137250d()) && C87412m.m108589b(pVar.mo137251e(), mo137251e());
        }
    }

    /* renamed from: c */
    public abstract String mo137249c();

    /* renamed from: d */
    public abstract String mo137250d();

    /* renamed from: e */
    public abstract String mo137251e();

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C97923p) && C87412m.m108589b(obj.getClass(), getClass())) {
            C97923p pVar = (C97923p) obj;
            return pVar.f287250a == this.f287250a && C87412m.m108589b(pVar.mo137249c(), mo137249c());
        }
    }
}
