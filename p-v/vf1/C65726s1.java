package vf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveBizListUI;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import qk1.C63218h0;
import rx3.C13598b0;
import te3.C50249le;
import te3.C51204s62;

/* renamed from: vf1.s1 */
public final class C65726s1 extends C87413o implements C32228q<Integer, Integer, C51204s62, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveBizListUI f189083d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65726s1(FinderLiveBizListUI finderLiveBizListUI) {
        super(3);
        this.f189083d = finderLiveBizListUI;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        C51204s62 s622 = (C51204s62) obj3;
        C87412m.m108594g(s622, "resp");
        View view = this.f189083d.f158964r;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$requestList$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/GetProfileScreenCastResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$requestList$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/GetProfileScreenCastResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (intValue == 0 && intValue2 == 0) {
                C63218h0 h0Var = this.f189083d.f158965s;
                LinkedList<C50249le> linkedList = s622.f141344d;
                C87412m.m108593f(linkedList, "resp.list");
                h0Var.getClass();
                h0Var.f179392d = linkedList;
                h0Var.notifyDataSetChanged();
            } else {
                View view2 = this.f189083d.f158963q;
                if (view2 != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$requestList$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/GetProfileScreenCastResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$requestList$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/GetProfileScreenCastResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    C87412m.m108603p("retryView");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
        C87412m.m108603p("loadingView");
        throw null;
    }
}
