package com.tencent.p014mm.plugin.emojicapture.p841ui.layout;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import k71.C60980a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.layout.StickerLayoutManager */
public final class StickerLayoutManager extends LinearLayoutManager {

    /* renamed from: v */
    public final int f158346v;

    /* renamed from: w */
    public final int f158347w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerLayoutManager(Context context, int i) {
        super(context, i, false);
        C87412m.m108594g(context, "context");
        this.f158346v = context.getResources().getDimensionPixelSize(C0966R.dimen.a3e);
        this.f158347w = context.getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
    }

    /* renamed from: c0 */
    public final void mo77149c0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                int position = getPosition(childAt);
                int left = (childAt.getLeft() + childAt.getRight()) / 2;
                int width = getWidth() / 2;
                int right = childAt.getRight() - childAt.getLeft();
                if (position == getItemCount() - 1 || Math.abs(left - width) < right / 2) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Float.valueOf(1.0f));
                    C117292a.m165358d(childAt, aVar.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                    C117292a.m165359e(childAt, "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Float.valueOf(0.3f));
                    C117292a.m165358d(childAt, aVar2.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(childAt, "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rVar, "recycler");
        C87412m.m108594g(wVar, "state");
        super.onLayoutChildren(rVar, wVar);
        mo77149c0();
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rVar, "recycler");
        C87412m.m108594g(wVar, "state");
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i, rVar, wVar);
        mo77149c0();
        return scrollHorizontallyBy;
    }

    public void scrollToPosition(int i) {
        int width = ((getWidth() - this.f158346v) / 2) - this.f158347w;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(width));
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
        C117292a.m165359e(this, "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(wVar, "state");
        Context context = recyclerView.getContext();
        C87412m.m108593f(context, "recyclerView.context");
        C60980a aVar = new C60980a(context);
        aVar.f44872a = i;
        startSmoothScroll(aVar);
    }
}
