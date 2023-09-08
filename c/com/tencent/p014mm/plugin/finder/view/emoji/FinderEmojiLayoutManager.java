package com.tencent.p014mm.plugin.finder.view.emoji;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/emoji/FinderEmojiLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.emoji.FinderEmojiLayoutManager */
public final class FinderEmojiLayoutManager extends GridLayoutManager {

    /* renamed from: D */
    public final Rect f162279D = new Rect();

    public FinderEmojiLayoutManager(Context context, int i) {
        super(context, i);
    }

    public boolean canScrollVertically() {
        return false;
    }

    /* renamed from: k0 */
    public final void mo79941k0() {
        if (!this.f162279D.isEmpty()) {
            Rect rect = new Rect();
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt != null) {
                    if (getItemViewType(childAt) != 1) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Float.valueOf(1.0f));
                        C117292a.m165358d(childAt, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/emoji/FinderEmojiLayoutManager", "updateChildren", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        childAt.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                        C117292a.m165359e(childAt, "com/tencent/mm/plugin/finder/view/emoji/FinderEmojiLayoutManager", "updateChildren", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        childAt.setEnabled(true);
                    } else {
                        getDecoratedBoundsWithMargins(childAt, rect);
                        int decoratedRight = getDecoratedRight(childAt);
                        int decoratedBottom = getDecoratedBottom(childAt);
                        Rect rect2 = this.f162279D;
                        float decoratedTop = (decoratedRight <= rect2.left || decoratedBottom <= rect2.top) ? 1.0f : 1.0f - (((float) (decoratedBottom - this.f162279D.top)) / (((float) (decoratedBottom - getDecoratedTop(childAt))) * 0.4f));
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(Float.valueOf(decoratedTop));
                        C117292a.m165358d(childAt, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/emoji/FinderEmojiLayoutManager", "updateChildren", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        childAt.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                        C117292a.m165359e(childAt, "com/tencent/mm/plugin/finder/view/emoji/FinderEmojiLayoutManager", "updateChildren", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        childAt.setEnabled(((double) decoratedTop) > 0.7d);
                    }
                }
            }
        }
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        super.onLayoutChildren(rVar, wVar);
        mo79941k0();
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i, rVar, wVar);
        mo79941k0();
        return scrollHorizontallyBy;
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        int scrollVerticallyBy = super.scrollVerticallyBy(i, rVar, wVar);
        mo79941k0();
        return scrollVerticallyBy;
    }
}
