package on1;

import cm1.C0740i2;
import gy3.C87412m;
import java.util.Iterator;
import java.util.List;
import on1.C11537n;

/* renamed from: on1.j0 */
public class C11532j0<T extends C0740i2> extends C11537n.C11544g<T> {

    /* renamed from: c */
    public final int f33857c;

    /* renamed from: d */
    public final T f33858d;

    /* renamed from: e */
    public final Object f33859e;

    public C11532j0(int i, long j, T t, Object obj, boolean z) {
        super(j, z);
        this.f33857c = i;
        this.f33858d = t;
        this.f33859e = obj;
    }

    /* renamed from: b */
    public int mo11485b(List<T> list) {
        int i;
        T t;
        C87412m.m108594g(list, "dataList");
        if (this.f33879a != -1) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C0740i2) it.next()).getItemId() == this.f33879a) {
                    break;
                }
                i++;
            }
        } else {
            i = this.f33857c;
        }
        if (!(i == -1 || (t = this.f33858d) == null)) {
            list.set(i, t);
        }
        return i;
    }
}
