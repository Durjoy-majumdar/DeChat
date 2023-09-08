package rl1;

import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import rx3.C13598b0;
import te3.C48659a31;

/* renamed from: rl1.l */
public final class C13049l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13044k f37168d;

    /* renamed from: e */
    public final /* synthetic */ C48659a31 f37169e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13049l(C13044k kVar, C48659a31 a312) {
        super(0);
        this.f37168d = kVar;
        this.f37169e = a312;
    }

    public Object invoke() {
        ArrayList<C48659a31> arrayList = this.f37168d.f37153d;
        C48659a31 a312 = this.f37169e;
        Iterator<C48659a31> it = arrayList.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().f130267d == a312.f130267d) {
                break;
            }
            i++;
        }
        if (i >= 0 && i < this.f37168d.getItemCount()) {
            z = true;
        }
        if (z) {
            this.f37168d.notifyItemChanged(i, 1);
        }
        return C13598b0.f38549a;
    }
}
