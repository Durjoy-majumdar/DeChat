package iw2;

import fy3.C32224a;
import gw2.C98266k;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: iw2.h0 */
public final class C98839h0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f289756d;

    /* renamed from: e */
    public final /* synthetic */ C98830g0 f289757e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98839h0(boolean z, C98830g0 g0Var) {
        super(0);
        this.f289756d = z;
        this.f289757e = g0Var;
    }

    public Object invoke() {
        if (this.f289756d) {
            int size = this.f289757e.f289727j.size();
            C98830g0 g0Var = this.f289757e;
            int i = g0Var.f289731q;
            boolean z = false;
            if (i >= 0 && i < size) {
                ArrayList<C98266k> arrayList = g0Var.f289727j.get(i);
                C87412m.m108593f(arrayList, "dateGalleryMap[deleteRowIndex]");
                ArrayList arrayList2 = arrayList;
                int size2 = arrayList2.size();
                int i2 = this.f289757e.f289732r;
                if (i2 >= 0 && i2 < size2) {
                    z = true;
                }
                if (z) {
                    arrayList2.remove(i2);
                    C98830g0 g0Var2 = this.f289757e;
                    String str = g0Var2.f289736v.get(g0Var2.f289731q);
                    C87412m.m108593f(str, "dateList[deleteRowIndex]");
                    String str2 = str;
                    this.f289757e.mo138209o(str2, arrayList2);
                    if (arrayList2.isEmpty()) {
                        this.f289757e.f289727j.remove(arrayList2);
                        C98830g0 g0Var3 = this.f289757e;
                        g0Var3.f289736v.remove(g0Var3.f289731q);
                        C98830g0 g0Var4 = this.f289757e;
                        g0Var4.f289728n.remove(g0Var4.f289731q);
                        this.f289757e.f289729o.remove(str2);
                    }
                }
            }
        }
        this.f289757e.f289724g.mo134401i(this.f289756d);
        C98830g0 g0Var5 = this.f289757e;
        g0Var5.f289731q = -1;
        g0Var5.f289732r = -1;
        return C13598b0.f38549a;
    }
}
