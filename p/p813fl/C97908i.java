package p813fl;

import androidx.recyclerview.widget.C54248l;
import gy3.C87412m;

/* renamed from: fl.i */
public final class C97908i extends C54248l.C54250b {

    /* renamed from: a */
    public final /* synthetic */ C97918n f287223a;

    public C97908i(C97918n nVar) {
        this.f287223a = nVar;
    }

    /* renamed from: a */
    public boolean mo11465a(int i, int i2) {
        C97923p pVar = this.f287223a.f287235c.f287244b.get(i);
        C87412m.m108593f(pVar, "data.groupList[oldItemPosition]");
        C97923p pVar2 = this.f287223a.f287236d.f287244b.get(i2);
        C87412m.m108593f(pVar2, "tempData.groupList[newItemPosition]");
        return pVar.mo137248b(pVar2);
    }

    /* renamed from: b */
    public boolean mo11466b(int i, int i2) {
        return C87412m.m108589b(this.f287223a.f287235c.f287244b.get(i), this.f287223a.f287236d.f287244b.get(i2));
    }

    /* renamed from: d */
    public int mo11468d() {
        return this.f287223a.f287236d.f287244b.size();
    }

    /* renamed from: e */
    public int mo11469e() {
        return this.f287223a.f287235c.f287244b.size();
    }
}
