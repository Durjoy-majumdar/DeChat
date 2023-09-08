package kf1;

import cm1.C0747l;
import com.tencent.p014mm.plugin.finder.feed.FinderSelectContract$SelectPresenter;
import fy3.C32226l;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C52271zj0;

/* renamed from: kf1.b9 */
public final class C9637b9 extends C87413o implements C32226l<LinkedList<C52271zj0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ FinderSelectContract$SelectPresenter f29957d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9637b9(FinderSelectContract$SelectPresenter finderSelectContract$SelectPresenter) {
        super(1);
        this.f29957d = finderSelectContract$SelectPresenter;
    }

    public Object invoke(Object obj) {
        C13598b0 b0Var;
        LinkedList<C52271zj0> linkedList = (LinkedList) obj;
        FinderSelectContract$SelectPresenter finderSelectContract$SelectPresenter = this.f29957d;
        C89349b bVar = finderSelectContract$SelectPresenter.f13221g;
        if (bVar != null) {
            return bVar;
        }
        if (linkedList != null) {
            if (finderSelectContract$SelectPresenter.f13222h.isEmpty()) {
                ArrayList<C0747l> arrayList = finderSelectContract$SelectPresenter.f13222h;
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (C52271zj0 lVar : linkedList) {
                    arrayList2.add(new C0747l(lVar));
                }
                arrayList.addAll(arrayList2);
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        return b0Var;
    }
}
