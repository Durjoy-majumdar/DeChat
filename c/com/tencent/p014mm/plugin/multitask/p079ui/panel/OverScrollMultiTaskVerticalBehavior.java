package com.tencent.p014mm.plugin.multitask.p079ui.panel;

import aj3.C103374a;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import kotlin.Metadata;
import w92.C65943a;
import z92.C112618c;
import z92.C112619d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitask/ui/panel/OverScrollMultiTaskVerticalBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "<init>", "()V", "ui-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.ui.panel.OverScrollMultiTaskVerticalBehavior */
public final class OverScrollMultiTaskVerticalBehavior extends CoordinatorLayout.Behavior<WxRecyclerView> {

    /* renamed from: d */
    public C65943a f315167d;

    /* renamed from: m */
    public void mo78308m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        WxRecyclerView wxRecyclerView = (WxRecyclerView) view;
        C87412m.m108594g(coordinatorLayout, "coordinatorLayout");
        C87412m.m108594g(wxRecyclerView, "child");
        C87412m.m108594g(view2, "target");
        if (wxRecyclerView == view2) {
            RecyclerView.LayoutManager layoutManager = wxRecyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int E = linearLayoutManager.mo16959E();
            RecyclerView.C16613e adapter = wxRecyclerView.getAdapter();
            if (E != (adapter != null ? adapter.getItemCount() : -1) - 1 && linearLayoutManager.mo16957C() != 0) {
                return;
            }
            if (i4 > 0 && i5 == 0) {
                Log.m105918d("OverScrollMultiTaskVerticalBehavior", "onNestedScroll: start nested scroll Up dyUnconsumed = " + i4 + ", currTranslateY = " + wxRecyclerView.getTranslationY());
                wxRecyclerView.animate().cancel();
                wxRecyclerView.setTranslationY(wxRecyclerView.getTranslationY() - ((float) (i4 / 2)));
                C65943a aVar = this.f315167d;
                if (aVar != null) {
                    aVar.mo89982c();
                }
            } else if (i4 < 0 && i5 == 0) {
                Log.m105918d("OverScrollMultiTaskVerticalBehavior", "onNestedScroll: start nested scroll Down dyUnconsumed = " + i4 + ", currTranslateY = " + wxRecyclerView.getTranslationY());
                wxRecyclerView.animate().cancel();
                wxRecyclerView.setTranslationY(wxRecyclerView.getTranslationY() - ((float) (i4 / 2)));
                C65943a aVar2 = this.f315167d;
                if (aVar2 != null) {
                    aVar2.mo89982c();
                }
            }
        }
    }

    /* renamed from: s */
    public boolean mo5059s(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        WxRecyclerView wxRecyclerView = (WxRecyclerView) view;
        C87412m.m108594g(coordinatorLayout, "coordinatorLayout");
        C87412m.m108594g(wxRecyclerView, "child");
        C87412m.m108594g(view2, "directTargetChild");
        C87412m.m108594g(view3, "target");
        return wxRecyclerView == view3 && (i & 2) != 0 && i2 == 0;
    }

    /* renamed from: u */
    public void mo78309u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        WxRecyclerView wxRecyclerView = (WxRecyclerView) view;
        C87412m.m108594g(coordinatorLayout, "coordinatorLayout");
        C87412m.m108594g(wxRecyclerView, "child");
        C87412m.m108594g(view2, "target");
        if (i == 0) {
            if (wxRecyclerView.getTranslationY() < 0.0f) {
                Log.m105918d("OverScrollMultiTaskVerticalBehavior", "onStopNestedScroll Up : start anim translateY = " + wxRecyclerView.getTranslationY());
                C103374a.m137034a(wxRecyclerView).mo143288k(0.0f).mo143285h(new C112618c(this)).mo143286i();
            } else if (wxRecyclerView.getTranslationY() > 0.0f) {
                Log.m105918d("OverScrollMultiTaskVerticalBehavior", "onStopNestedScroll Down: start anim translateY = " + wxRecyclerView.getTranslationY());
                C103374a.m137034a(wxRecyclerView).mo143288k(0.0f).mo143285h(new C112619d(this)).mo143286i();
            }
        }
    }
}
