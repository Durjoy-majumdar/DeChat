package mo1;

import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8797q5;
import java.util.LinkedList;
import oo1.C11614d0;
import p823sg.C101614i;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C49098d51;
import te3.C49236e51;

/* renamed from: mo1.w0 */
public final class C11061w0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32821d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11061w0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
        super(0);
        this.f32821d = finderProfileHeaderUIC;
    }

    public Object invoke() {
        C49098d51 d512;
        int i;
        C49236e51 e512;
        LinkedList<C49098d51> linkedList;
        C49236e51 e513;
        LinkedList<C49098d51> linkedList2;
        C49236e51 e514;
        LinkedList<C49098d51> linkedList3;
        C101614i<String, FinderProfileHeaderUIC.C3463b> iVar = FinderProfileHeaderUIC.f16192h1;
        FinderProfileHeaderUIC.C3463b bVar = (FinderProfileHeaderUIC.C3463b) iVar.get(this.f32821d.f16213S0);
        if (!(bVar == null || (d512 = bVar.f16265d) == null)) {
            FinderProfileHeaderUIC finderProfileHeaderUIC = this.f32821d;
            FinderProfileHeaderUIC.C3463b bVar2 = (FinderProfileHeaderUIC.C3463b) iVar.get(finderProfileHeaderUIC.f16213S0);
            if (bVar2 == null || (e514 = bVar2.f16272k) == null || (linkedList3 = e514.f132697d) == null) {
                i = -1;
            } else {
                int i2 = 0;
                i = -1;
                for (T next : linkedList3) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        if (C87412m.m108589b(d512.f132122h, ((C49098d51) next).f132122h)) {
                            i = i2;
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
            if (i != -1) {
                C101614i<String, FinderProfileHeaderUIC.C3463b> iVar2 = FinderProfileHeaderUIC.f16192h1;
                FinderProfileHeaderUIC.C3463b bVar3 = (FinderProfileHeaderUIC.C3463b) iVar2.get(finderProfileHeaderUIC.f16213S0);
                if (!(bVar3 == null || (e513 = bVar3.f16272k) == null || (linkedList2 = e513.f132697d) == null)) {
                    C49098d51 remove = linkedList2.remove(i);
                }
                FinderProfileHeaderUIC.C3463b bVar4 = (FinderProfileHeaderUIC.C3463b) iVar2.get(finderProfileHeaderUIC.f16213S0);
                if (!(bVar4 == null || (e512 = bVar4.f16272k) == null || (linkedList = e512.f132697d) == null)) {
                    linkedList.add(i, d512);
                }
            }
        }
        FinderProfileHeaderUIC finderProfileHeaderUIC2 = this.f32821d;
        C11614d0 d0Var = finderProfileHeaderUIC2.f16220W;
        if (d0Var != null) {
            FinderProfileHeaderUIC.C3463b bVar5 = (FinderProfileHeaderUIC.C3463b) FinderProfileHeaderUIC.f16192h1.get(finderProfileHeaderUIC2.f16213S0);
            C8797q5.C8798a.m8619a(d0Var, bVar5 != null ? bVar5.f16272k : null, (String) null, 2, (Object) null);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("moreLiveListWidget");
        throw null;
    }
}
