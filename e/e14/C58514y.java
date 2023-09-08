package e14;

import a14.C53941r;
import a14.C53973z1;
import f14.C58907y;
import fy3.C32227p;
import gy3.C87413o;
import wx3.C66212f;

/* renamed from: e14.y */
public final class C58514y extends C87413o implements C32227p<Integer, C66212f.C66215b, Integer> {

    /* renamed from: d */
    public final /* synthetic */ C58510w<?> f167551d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58514y(C58510w<?> wVar) {
        super(2);
        this.f167551d = wVar;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        C66212f.C66215b bVar = (C66212f.C66215b) obj2;
        C66212f.C15602c key = bVar.getKey();
        C66212f.C66215b bVar2 = this.f167551d.f167544e.get(key);
        int i = C53973z1.f151221b0;
        if (key != C53973z1.C0004b.f3d) {
            return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : intValue + 1);
        }
        C53973z1 z1Var = (C53973z1) bVar2;
        C53973z1 z1Var2 = (C53973z1) bVar;
        while (true) {
            if (z1Var2 != null) {
                if (z1Var2 == z1Var || !(z1Var2 instanceof C58907y)) {
                    break;
                }
                C53941r a0 = ((C58907y) z1Var2).mo74527a0();
                z1Var2 = a0 != null ? a0.getParent() : null;
            } else {
                z1Var2 = null;
                break;
            }
        }
        if (z1Var2 == z1Var) {
            if (z1Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + z1Var2 + ", expected child of " + z1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
