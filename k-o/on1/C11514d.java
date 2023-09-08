package on1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import java.util.List;
import on1.C11537n;

/* renamed from: on1.d */
public class C11514d<T extends C0740i2> extends C11537n.C11538a<T> {

    /* renamed from: a */
    public final int f33827a;

    /* renamed from: b */
    public final long f33828b;

    /* renamed from: c */
    public final long f33829c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11514d(int i, long j, long j2, int i2, C8480h hVar) {
        super(false, 1, (C8480h) null);
        i = (i2 & 1) != 0 ? -1 : i;
        j = (i2 & 2) != 0 ? -1 : j;
        j2 = (i2 & 4) != 0 ? -1 : j2;
        this.f33827a = i;
        this.f33828b = j;
        this.f33829c = j2;
    }

    /* renamed from: b */
    public int mo11475b(List<T> list) {
        C87412m.m108594g(list, "dataList");
        int i = this.f33827a;
        if (this.f33828b != -1) {
            Iterator<T> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C0740i2) it.next()).getItemId() == this.f33828b) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        if (this.f33829c != -1) {
            Iterator<T> it4 = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    i = -1;
                    break;
                }
                C0740i2 i2Var = (C0740i2) it4.next();
                if ((i2Var instanceof BaseFinderFeed) && ((BaseFinderFeed) i2Var).mo3513o().getLocalId() == this.f33829c) {
                    i = i3;
                    break;
                }
                i3++;
            }
        }
        if (i <= -1 || i >= list.size()) {
            return -1;
        }
        list.remove(i);
        return i;
    }
}
