package vf1;

import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveBizListUI;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import qk1.C63218h0;
import qq3.C63318b;
import rx3.C13598b0;
import te3.C50249le;
import te3.C51204s62;

/* renamed from: vf1.p1 */
public final class C65721p1 implements C63318b {

    /* renamed from: a */
    public final /* synthetic */ FinderLiveBizListUI f189078a;

    /* renamed from: vf1.p1$a */
    public static final class C65722a extends C87413o implements C32228q<Integer, Integer, C51204s62, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveBizListUI f189079d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65722a(FinderLiveBizListUI finderLiveBizListUI) {
            super(3);
            this.f189079d = finderLiveBizListUI;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            ((Number) obj).intValue();
            ((Number) obj2).intValue();
            C51204s62 s622 = (C51204s62) obj3;
            C87412m.m108594g(s622, "resp");
            C63218h0 h0Var = this.f189079d.f158965s;
            LinkedList<C50249le> linkedList = s622.f141344d;
            C87412m.m108593f(linkedList, "resp.list");
            h0Var.getClass();
            int size = h0Var.f179392d.size();
            h0Var.f179392d.addAll(linkedList);
            h0Var.notifyItemRangeInserted(size, linkedList.size());
            WxRefreshLayout wxRefreshLayout = this.f189079d.f158961o;
            if (wxRefreshLayout != null) {
                wxRefreshLayout.mo26580f(true);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("refreshLayout");
            throw null;
        }
    }

    public C65721p1(FinderLiveBizListUI finderLiveBizListUI) {
        this.f189078a = finderLiveBizListUI;
    }

    /* renamed from: a */
    public void mo3374a(boolean z) {
    }

    public void onLoadMore() {
        FinderLiveBizListUI finderLiveBizListUI = this.f189078a;
        C65722a aVar = new C65722a(finderLiveBizListUI);
        int i = FinderLiveBizListUI.f158960v;
        finderLiveBizListUI.mo77423N7(aVar);
    }
}
