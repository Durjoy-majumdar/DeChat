package p813fl;

import androidx.recyclerview.widget.C54248l;
import gy3.C87412m;

/* renamed from: fl.j */
public final class C97910j extends C54248l.C54250b {

    /* renamed from: a */
    public final /* synthetic */ C97918n f287224a;

    public C97910j(C97918n nVar) {
        this.f287224a = nVar;
    }

    /* renamed from: a */
    public boolean mo11465a(int i, int i2) {
        C97934u0 u0Var = this.f287224a.f287235c.f287245c.get(i);
        C87412m.m108593f(u0Var, "data.tabList[oldItemPosition]");
        C97934u0 u0Var2 = u0Var;
        C97934u0 u0Var3 = this.f287224a.f287236d.f287245c.get(i2);
        C87412m.m108593f(u0Var3, "tempData.tabList[newItemPosition]");
        return mo11466b(i, i2) && u0Var2.f287264a.mo137248b(u0Var3.f287264a);
    }

    /* renamed from: b */
    public boolean mo11466b(int i, int i2) {
        C97934u0 u0Var = this.f287224a.f287235c.f287245c.get(i);
        C87412m.m108593f(u0Var, "data.tabList[oldItemPosition]");
        C97934u0 u0Var2 = this.f287224a.f287236d.f287245c.get(i2);
        C87412m.m108593f(u0Var2, "tempData.tabList[newItemPosition]");
        C97923p pVar = u0Var.f287264a;
        int i3 = pVar.f287250a;
        C97923p pVar2 = u0Var2.f287264a;
        return i3 == pVar2.f287250a && C87412m.m108589b(pVar, pVar2);
    }

    /* renamed from: d */
    public int mo11468d() {
        return this.f287224a.f287236d.f287245c.size();
    }

    /* renamed from: e */
    public int mo11469e() {
        return this.f287224a.f287235c.f287245c.size();
    }
}
