package qb2;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C87412m;
import kb2.C60995i;

/* renamed from: qb2.c */
public final class C62600c extends BaseStateAction {

    /* renamed from: a */
    public final C62601a f177787a;

    /* renamed from: b */
    public final C60995i f177788b;

    /* renamed from: qb2.c$a */
    public enum C62601a {
        Gallery,
        Select,
        CheckBox
    }

    public C62600c(C62601a aVar, C60995i iVar) {
        C87412m.m108594g(aVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(iVar, "item");
        this.f177787a = aVar;
        this.f177788b = iVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62600c)) {
            return false;
        }
        C62600c cVar = (C62600c) obj;
        return this.f177787a == cVar.f177787a && C87412m.m108589b(this.f177788b, cVar.f177788b);
    }

    public int hashCode() {
        return (this.f177787a.hashCode() * 31) + this.f177788b.hashCode();
    }

    public String toString() {
        return "SelectAction(source=" + this.f177787a + ", item=" + this.f177788b + ')';
    }
}
