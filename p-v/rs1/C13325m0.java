package rs1;

import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rs1.m0 */
public final class C13325m0 extends C87413o implements C32226l<RecyclerViewDrawerSquares.C45117c, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileDrawerUIC f37799d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13325m0(FinderProfileDrawerUIC finderProfileDrawerUIC) {
        super(1);
        this.f37799d = finderProfileDrawerUIC;
    }

    public Object invoke(Object obj) {
        RecyclerViewDrawerSquares.C45117c cVar = (RecyclerViewDrawerSquares.C45117c) obj;
        C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
        FinderProfileDrawerUIC finderProfileDrawerUIC = this.f37799d;
        if (finderProfileDrawerUIC != null) {
            finderProfileDrawerUIC.f18772o.add(cVar);
        }
        return C13598b0.f38549a;
    }
}
