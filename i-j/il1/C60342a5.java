package il1;

import al1.C54130j;
import cl1.C54963d0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import qk1.C63262u1;
import qk1.C63270w1;
import rx3.C13598b0;

/* renamed from: il1.a5 */
public final class C60342a5 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60541x4 f172000d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60342a5(C60541x4 x4Var) {
        super(0);
        this.f172000d = x4Var;
    }

    public Object invoke() {
        ArrayList arrayList;
        Class cls = C54963d0.class;
        List<C54130j> list = ((C54963d0) this.f172000d.f172567f.mo87696x0(cls)).f154071n;
        C87412m.m108593f(list, "basePlugin.business(Live…ass.java).linkMicUserList");
        synchronized (list) {
            arrayList = new ArrayList();
            for (T next : list) {
                if (((C54130j) next).f152004h) {
                    arrayList.add(next);
                }
            }
        }
        this.f172000d.f172581w.clear();
        C60541x4 x4Var = this.f172000d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C54130j jVar = (C54130j) it.next();
            String str = jVar.f151999c;
            if (str != null) {
                x4Var.f172581w.put(str, jVar);
            }
        }
        C60541x4 x4Var2 = this.f172000d;
        x4Var2.f172564F = ((C54963d0) x4Var2.f172567f.mo87696x0(cls)).f154073p;
        C60541x4 x4Var3 = this.f172000d;
        C63262u1 u1Var = x4Var3.f172579u;
        HashMap<String, C54130j> hashMap = x4Var3.f172581w;
        u1Var.getClass();
        C87412m.m108594g(hashMap, "localApplyMicMap");
        u1Var.f179533e = hashMap;
        C60541x4 x4Var4 = this.f172000d;
        C63270w1 w1Var = x4Var4.f172580v;
        HashMap<String, C54130j> hashMap2 = x4Var4.f172581w;
        w1Var.getClass();
        C87412m.m108594g(hashMap2, "localApplyMicMap");
        w1Var.f179569e = hashMap2;
        C60541x4 x4Var5 = this.f172000d;
        x4Var5.f172579u.f179534f = ((C54963d0) x4Var5.f172567f.mo87696x0(cls)).f154073p;
        C60541x4 x4Var6 = this.f172000d;
        x4Var6.f172580v.f179570f = ((C54963d0) x4Var6.f172567f.mo87696x0(cls)).f154073p;
        return C13598b0.f38549a;
    }
}
