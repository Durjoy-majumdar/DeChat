package p370p7;

import android.util.Pair;
import p370p7.C21943m;
import p396x6.C23027v;

/* renamed from: p7.a */
public abstract class C21918a extends C23027v {

    /* renamed from: b */
    public final int f61969b;

    public C21918a(int i) {
        this.f61969b = i;
    }

    /* renamed from: a */
    public final int mo34967a(Object obj) {
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int intValue = !(obj2 instanceof Integer) ? -1 : ((Integer) obj2).intValue();
        if (intValue == -1) {
            return -1;
        }
        C21943m.C21946c cVar = (C21943m.C21946c) this;
        int a = cVar.f62119c.mo34967a(obj3);
        if (a == -1) {
            return -1;
        }
        return (intValue * cVar.f62120d) + a;
    }

    /* renamed from: c */
    public int mo34968c(int i, int i2) {
        C21943m.C21946c cVar = (C21943m.C21946c) this;
        int i3 = cVar.f62121e;
        int i4 = i / i3;
        int i5 = i3 * i4;
        int c = cVar.f62119c.mo34968c(i - i5, i2 == 2 ? 0 : i2);
        if (c != -1) {
            return i5 + c;
        }
        int i6 = i4 + 1;
        return i6 < this.f61969b ? i6 * cVar.f62121e : i2 == 2 ? 0 : -1;
    }

    /* renamed from: e */
    public final C23027v.C23029b mo34969e(int i, C23027v.C23029b bVar, boolean z) {
        C21943m.C21946c cVar = (C21943m.C21946c) this;
        int i2 = cVar.f62120d;
        int i3 = i / i2;
        cVar.f62119c.mo34969e(i - (i2 * i3), bVar, z);
        bVar.f66208c += cVar.f62121e * i3;
        if (z) {
            bVar.f66207b = Pair.create(Integer.valueOf(i3), bVar.f66207b);
        }
        return bVar;
    }

    /* renamed from: i */
    public final C23027v.C23030c mo34970i(int i, C23027v.C23030c cVar, boolean z, long j) {
        C21943m.C21946c cVar2 = (C21943m.C21946c) this;
        int i2 = cVar2.f62121e;
        int i3 = i / i2;
        int i4 = i2 * i3;
        int i5 = i3 * cVar2.f62120d;
        cVar2.f62119c.mo34970i(i - i4, cVar, z, j);
        cVar.f66222f += i5;
        cVar.f66223g += i5;
        return cVar;
    }
}
