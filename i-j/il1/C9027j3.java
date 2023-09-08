package il1;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C89132b;
import qk1.C12850y0;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C50465my0;
import te3.C52188yz0;

/* renamed from: il1.j3 */
public final class C9027j3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8953d3 f28504d;

    /* renamed from: e */
    public final /* synthetic */ C89132b.C89134c<C52188yz0> f28505e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9027j3(C8953d3 d3Var, C89132b.C89134c<C52188yz0> cVar) {
        super(0);
        this.f28504d = d3Var;
        this.f28505e = cVar;
    }

    public Object invoke() {
        C8953d3 d3Var = this.f28504d;
        d3Var.f28280G = false;
        C89132b.C89134c<C52188yz0> cVar = this.f28505e;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            d3Var.setResp((C52188yz0) cVar.f256796d);
            C12850y0 y0Var = this.f28504d.f28277D;
            LinkedList<C50465my0> linkedList = ((C52188yz0) this.f28505e.f256796d).f145588g;
            C87412m.m108593f(linkedList, "it.resp.members");
            y0Var.getClass();
            int size = y0Var.f36767d.size();
            if (!linkedList.isEmpty()) {
                ArrayList<C12850y0.C12854d> arrayList = y0Var.f36767d;
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (C50465my0 dVar : linkedList) {
                    arrayList2.add(new C12850y0.C12854d(dVar, 1));
                }
                arrayList.addAll(arrayList2);
                y0Var.notifyItemRangeChanged(size, linkedList.size());
            }
        }
        return C13598b0.f38549a;
    }
}
