package cl1;

import cl1.C0680q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import rx3.C13598b0;
import sx3.C77813z;

/* renamed from: cl1.s1 */
public final class C0688s1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C0680q1 f1622d;

    /* renamed from: e */
    public final /* synthetic */ C0680q1.C0681a f1623e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0688s1(C0680q1 q1Var, C0680q1.C0681a aVar) {
        super(0);
        this.f1622d = q1Var;
        this.f1623e = aVar;
    }

    public Object invoke() {
        T t;
        LinkedList<C0680q1.C0681a> linkedList = this.f1622d.f1602f;
        C0680q1.C0681a aVar = this.f1623e;
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C0680q1.C0681a) t).f1604a.f1611d, aVar.f1604a.f1611d)) {
                break;
            }
        }
        if (t == null) {
            this.f1622d.f1602f.add(this.f1623e);
            LinkedList<C0680q1.C0681a> linkedList2 = this.f1622d.f1602f;
            if (linkedList2.size() > 1) {
                C77813z.m93909o(linkedList2, new C0687r1());
            }
            Log.m105924i("LiveToastManagerSlice", "offer state: " + this.f1623e + " toastList: " + this.f1622d.f1602f);
        }
        return C13598b0.f38549a;
    }
}
