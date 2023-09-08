package rs1;

import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: rs1.g3 */
public final class C13242g3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13181d3 f37601d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f37602e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13242g3(C13181d3 d3Var, C60905o oVar) {
        super(0);
        this.f37601d = d3Var;
        this.f37602e = oVar;
    }

    public Object invoke() {
        C13181d3 d3Var = this.f37601d;
        C60905o oVar = this.f37602e;
        d3Var.getClass();
        C87412m.m108594g(oVar, "holder");
        FinderDescPanelUIC finderDescPanelUIC = (FinderDescPanelUIC) ((C36570n) d3Var.f37765e).getValue();
        if (finderDescPanelUIC != null) {
            finderDescPanelUIC.mo5116c3(oVar);
        }
        return C13598b0.f38549a;
    }
}
