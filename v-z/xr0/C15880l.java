package xr0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: xr0.l */
public final class C15880l extends RecyclerView.C0129l {
    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        RecyclerView.C16631z P0 = recyclerView.mo17031P0(view);
        if (P0 != null && (P0 instanceof C91332m)) {
            C91332m mVar = (C91332m) P0;
            View view2 = mVar.f261962C;
            int j = mVar.mo17363j();
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            int i = j == (adapter != null ? adapter.getItemCount() : -1) + -1 ? 8 : 0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListItemDecoration", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListItemDecoration", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
