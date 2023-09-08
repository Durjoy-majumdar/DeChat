package com.tencent.p014mm.plugin.story.p108ui.layout;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/layout/AvatarLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.layout.AvatarLayoutManager */
public final class AvatarLayoutManager extends LinearLayoutManager {

    /* renamed from: v */
    public final int f164525v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarLayoutManager(Context context, int i) {
        super(context, i, false);
        C87412m.m108594g(context, "context");
        this.f164525v = C76577a.m92151b(context, 0);
    }

    /* renamed from: V */
    public void mo16973V(int i, int i2) {
        super.mo16973V(i, i2);
        mo81032c0();
    }

    /* renamed from: c0 */
    public final void mo81032c0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C87412m.m108591d(childAt);
            int measuredHeight = childAt.getMeasuredHeight();
            int top = ((childAt.getTop() + childAt.getBottom()) / 2) - (getHeight() / 2);
            boolean z = true;
            if (measuredHeight - Math.abs(top) > this.f164525v) {
                float min = Math.min(((float) 1) - (((float) Math.abs(top)) / ((float) (measuredHeight - this.f164525v))), 1.0f);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(min));
                C117292a.m165358d(childAt, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/layout/AvatarLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                childAt.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(childAt, "com/tencent/mm/plugin/story/ui/layout/AvatarLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(0.0f));
                C117292a.m165358d(childAt, aVar2.mo10232b(), "com/tencent/mm/plugin/story/ui/layout/AvatarLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                childAt.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(childAt, "com/tencent/mm/plugin/story/ui/layout/AvatarLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (1.0f - childAt.getAlpha() >= 0.1f) {
                z = false;
            }
            childAt.setSelected(z);
        }
    }

    public boolean canScrollVertically() {
        return false;
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        super.onLayoutChildren(rVar, wVar);
        mo81032c0();
    }
}
