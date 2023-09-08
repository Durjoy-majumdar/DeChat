package p813fl;

import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;

/* renamed from: fl.a */
public abstract class C97887a implements C97907h0 {

    /* renamed from: a */
    public final C97923p f287177a;

    /* renamed from: b */
    public final C97903f0 f287178b;

    /* renamed from: c */
    public final LinkedList<C97927q0> f287179c = new LinkedList<>();

    public C97887a(C97923p pVar) {
        C87412m.m108594g(pVar, "groupInfo");
        this.f287177a = pVar;
        this.f287178b = new C97903f0(pVar);
    }

    /* renamed from: a */
    public List<C97927q0> mo127614a() {
        return this.f287179c;
    }

    /* renamed from: b */
    public boolean mo127615b() {
        return true;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C97887a) && C87412m.m108589b(((C97887a) obj).f287177a.mo137249c(), this.f287177a.mo137249c());
    }

    /* renamed from: l */
    public final C97923p mo127617l() {
        return this.f287177a;
    }
}
