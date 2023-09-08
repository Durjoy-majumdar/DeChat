package p813fl;

import gy3.C87412m;
import te3.C49978jd3;

/* renamed from: fl.f0 */
public final class C97903f0 extends C97927q0 {

    /* renamed from: b */
    public final C97923p f287197b;

    /* renamed from: c */
    public C49978jd3 f287198c;

    /* renamed from: d */
    public boolean f287199d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97903f0(C97923p pVar) {
        super(2);
        C87412m.m108594g(pVar, "groupInfo");
        this.f287197b = pVar;
    }

    /* renamed from: a */
    public boolean mo136854a(Object obj) {
        if (equals(obj) && (obj instanceof C97903f0)) {
            C97903f0 f0Var = (C97903f0) obj;
            C49978jd3 jd32 = f0Var.f287198c;
            String str = null;
            Integer valueOf = jd32 != null ? Integer.valueOf(jd32.f136019d) : null;
            C49978jd3 jd33 = this.f287198c;
            if (C87412m.m108589b(valueOf, jd33 != null ? Integer.valueOf(jd33.f136019d) : null)) {
                C49978jd3 jd34 = f0Var.f287198c;
                String str2 = jd34 != null ? jd34.f136020e : null;
                C49978jd3 jd35 = this.f287198c;
                if (C87412m.m108589b(str2, jd35 != null ? jd35.f136020e : null)) {
                    C49978jd3 jd36 = f0Var.f287198c;
                    String str3 = jd36 != null ? jd36.f136021f : null;
                    C49978jd3 jd37 = this.f287198c;
                    if (jd37 != null) {
                        str = jd37.f136021f;
                    }
                    return C87412m.m108589b(str3, str) && f0Var.f287199d == this.f287199d;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        return super.equals(obj) && (obj instanceof C97903f0) && C87412m.m108589b(((C97903f0) obj).f287197b.mo137249c(), this.f287197b.mo137249c());
    }
}
