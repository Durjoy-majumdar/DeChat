package vf1;

import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveBizSearchUI;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import qk1.C63218h0;
import rx3.C13598b0;
import te3.C50249le;
import te3.C50328ly3;

/* renamed from: vf1.x1 */
public final class C65738x1 extends C87413o implements C32228q<Integer, Integer, C50328ly3, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveBizSearchUI f189103d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65738x1(FinderLiveBizSearchUI finderLiveBizSearchUI) {
        super(3);
        this.f189103d = finderLiveBizSearchUI;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        C50328ly3 ly32 = (C50328ly3) obj3;
        C87412m.m108594g(ly32, "resp");
        if (intValue == 0 && intValue2 == 0) {
            C63218h0 h0Var = this.f189103d.f158976u;
            LinkedList<C50249le> linkedList = ly32.f137718d;
            C87412m.m108593f(linkedList, "resp.list");
            h0Var.getClass();
            int size = h0Var.f179392d.size();
            h0Var.f179392d.addAll(linkedList);
            h0Var.notifyItemRangeInserted(size, linkedList.size());
        }
        WxRefreshLayout wxRefreshLayout = this.f189103d.f158970o;
        if (wxRefreshLayout != null) {
            wxRefreshLayout.mo26580f(true);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("refreshLayout");
        throw null;
    }
}
