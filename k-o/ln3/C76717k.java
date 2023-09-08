package ln3;

import androidx.recyclerview.widget.C54248l;
import gy3.C87412m;
import java.util.List;

/* renamed from: ln3.k */
public final class C76717k extends C54248l.C54250b {

    /* renamed from: a */
    public final List<C76709a<?>> f224445a;

    /* renamed from: b */
    public final List<C76709a<?>> f224446b;

    public C76717k(List<? extends C76709a<?>> list, List<? extends C76709a<?>> list2) {
        C87412m.m108594g(list, "oldList");
        C87412m.m108594g(list2, "newList");
        this.f224445a = list;
        this.f224446b = list2;
    }

    /* renamed from: a */
    public boolean mo11465a(int i, int i2) {
        try {
            return this.f224445a.get(i).mo106998f(this.f224446b.get(i2));
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo11466b(int i, int i2) {
        C76709a aVar = this.f224445a.get(i);
        C76709a aVar2 = this.f224446b.get(i2);
        return aVar.mo75c() == aVar2.mo75c() && aVar.getItemId() == aVar2.getItemId();
    }

    /* renamed from: d */
    public int mo11468d() {
        return this.f224446b.size();
    }

    /* renamed from: e */
    public int mo11469e() {
        return this.f224445a.size();
    }
}
