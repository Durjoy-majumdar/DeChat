package on1;

import cm1.C0740i2;
import gy3.C87412m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import on1.C11537n;

/* renamed from: on1.p */
public class C11547p<T extends C0740i2> extends C11537n.C11540c<T> {

    /* renamed from: c */
    public final int f33882c;

    /* renamed from: d */
    public final long f33883d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11547p(java.util.List r1, int r2, long r3, boolean r5, int r6, gy3.C8480h r7) {
        /*
            r0 = this;
            r7 = r6 & 4
            if (r7 == 0) goto L_0x0006
            r3 = -1
        L_0x0006:
            r6 = r6 & 8
            if (r6 == 0) goto L_0x000b
            r5 = 0
        L_0x000b:
            java.lang.String r6 = "feeds"
            gy3.C87412m.m108594g(r1, r6)
            r0.<init>(r1, r5)
            r0.f33882c = r2
            r0.f33883d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: on1.C11547p.<init>(java.util.List, int, long, boolean, int, gy3.h):void");
    }

    /* renamed from: b */
    public Set<Integer> mo11492b(List<T> list) {
        C87412m.m108594g(list, "dataList");
        HashSet hashSet = new HashSet();
        int i = this.f33882c;
        if (this.f33883d != -1) {
            Iterator<T> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C0740i2) it.next()).getItemId() == this.f33883d) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        if (i == -1) {
            i = list.size();
        }
        list.addAll(i, this.f33873a);
        for (int i3 = 0; i3 < this.f33873a.size(); i3++) {
            hashSet.add(Integer.valueOf(i));
            i++;
        }
        return hashSet;
    }
}
