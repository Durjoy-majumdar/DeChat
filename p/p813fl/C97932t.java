package p813fl;

import gy3.C87412m;

/* renamed from: fl.t */
public final class C97932t extends C97923p {

    /* renamed from: b */
    public final C97928r f287261b;

    /* renamed from: c */
    public final C97930s f287262c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97932t(C97928r rVar, C97930s sVar) {
        super(0);
        C87412m.m108594g(rVar, "groupInfo");
        C87412m.m108594g(sVar, "setInfo");
        this.f287261b = rVar;
        this.f287262c = sVar;
    }

    /* renamed from: b */
    public boolean mo137248b(Object obj) {
        if (super.mo137248b(obj) && (obj instanceof C97932t)) {
            C97932t tVar = (C97932t) obj;
            return this.f287261b.mo137248b(tVar.f287261b) && this.f287262c.mo137248b(tVar.f287262c);
        }
    }

    /* renamed from: c */
    public String mo137249c() {
        return this.f287261b.mo137249c();
    }

    /* renamed from: d */
    public String mo137250d() {
        return this.f287261b.mo137250d();
    }

    /* renamed from: e */
    public String mo137251e() {
        return this.f287261b.mo137251e();
    }
}
