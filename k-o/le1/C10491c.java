package le1;

import android.util.SparseArray;
import cm1.C0707a0;
import com.tencent.p014mm.plugin.finder.feed.model.C2781d;
import gy3.C87412m;
import je1.C9342n1;

/* renamed from: le1.c */
public final class C10491c implements C10497i {

    /* renamed from: a */
    public SparseArray<C0707a0> f31729a = new SparseArray<>();

    /* renamed from: a */
    public boolean mo10786a(C2781d dVar, int i) {
        C87412m.m108594g(dVar, "loadedInfo");
        C0707a0 a0Var = this.f31729a.get(i);
        if (a0Var != null) {
            dVar.f13968e.add(0, a0Var);
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo10787b(C2781d dVar, int i) {
        C87412m.m108594g(dVar, "loadedInfo");
        return false;
    }

    /* renamed from: c */
    public boolean mo10788c(C9342n1.C9346d dVar, int i, int i2) {
        C87412m.m108594g(dVar, "resp");
        return false;
    }
}
