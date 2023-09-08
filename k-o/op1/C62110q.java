package op1;

import ak1.C54067f0;
import ak1.C54108o;
import cm1.C0740i2;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import rx3.C13598b0;
import sk1.C63965x;

/* renamed from: op1.q */
public final class C62110q extends C87413o implements C32227p<Integer, C63965x, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62084h f176616d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62110q(C62084h hVar) {
        super(2);
        this.f176616d = hVar;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        C63965x xVar = (C63965x) obj2;
        Class cls = C54108o.class;
        if (intValue >= 0 && intValue < this.f176616d.f176535i.size()) {
            C0740i2 remove = this.f176616d.f176535i.remove(intValue);
            C87412m.m108593f(remove, "goodsAndAdList.removeAt(dataPos)");
            C0740i2 i2Var = remove;
            if (i2Var instanceof C63965x) {
                C62084h hVar = this.f176616d;
                C63965x xVar2 = (C63965x) i2Var;
                Iterator<C0740i2> it = hVar.f176535i.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (it.next() instanceof C63965x) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == -1) {
                    hVar.f176535i.addLast(xVar2);
                } else {
                    hVar.f176535i.add(i, xVar2);
                }
            }
            if (this.f176616d.f176532f) {
                ((C54108o) C86312j.m106911c(cls)).getClass();
                C54067f0 f0Var = C54108o.f151869h;
                Long remove2 = f0Var.f151454e0.remove(intValue);
                C87412m.m108593f(remove2, "getService(HellLiveRepor…ductIds.removeAt(dataPos)");
                long longValue = remove2.longValue();
                ((C54108o) C86312j.m106911c(cls)).getClass();
                f0Var.f151454e0.add(0, Long.valueOf(longValue));
            }
            C62084h hVar2 = this.f176616d;
            hVar2.notifyItemMoved(hVar2.f176539p.indexOf(2) + intValue, this.f176616d.f176539p.indexOf(2));
            C62084h hVar3 = this.f176616d;
            int indexOf = hVar3.f176539p.indexOf(2);
            C62084h hVar4 = this.f176616d;
            int i2 = intValue + 1;
            if (i2 >= hVar4.f176535i.size()) {
                i2 = this.f176616d.f176535i.size();
            }
            hVar3.notifyItemRangeChanged(indexOf, hVar4.f176539p.indexOf(2) + i2);
        }
        return C13598b0.f38549a;
    }
}
