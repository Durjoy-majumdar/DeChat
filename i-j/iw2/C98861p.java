package iw2;

import androidx.recyclerview.widget.C54248l;
import gw2.C98266k;
import gy3.C87412m;
import java.util.List;

/* renamed from: iw2.p */
public final class C98861p extends C54248l.C54250b {

    /* renamed from: a */
    public final /* synthetic */ List<C98266k> f289799a;

    /* renamed from: b */
    public final /* synthetic */ List<C98266k> f289800b;

    public C98861p(List<C98266k> list, List<C98266k> list2) {
        this.f289799a = list;
        this.f289800b = list2;
    }

    /* renamed from: a */
    public boolean mo11465a(int i, int i2) {
        return C87412m.m108589b(this.f289799a.get(i), this.f289800b.get(i2));
    }

    /* renamed from: b */
    public boolean mo11466b(int i, int i2) {
        return this.f289799a.get(i).f288081d == this.f289800b.get(i2).f288081d;
    }

    /* renamed from: d */
    public int mo11468d() {
        return this.f289800b.size();
    }

    /* renamed from: e */
    public int mo11469e() {
        return this.f289799a.size();
    }
}
