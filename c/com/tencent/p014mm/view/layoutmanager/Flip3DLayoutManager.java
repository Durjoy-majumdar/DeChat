package com.tencent.p014mm.view.layoutmanager;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/view/layoutmanager/Flip3DLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.layoutmanager.Flip3DLayoutManager */
public final class Flip3DLayoutManager extends LinearLayoutManager {

    /* renamed from: v */
    public boolean f165719v = true;

    /* renamed from: w */
    public boolean f165720w = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Flip3DLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c0 */
    public final void mo82583c0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                float width = ((float) getWidth()) / 2.0f;
                float left = ((((float) ((childAt.getLeft() + childAt.getRight()) / 2)) - width) / ((float) getWidth())) * 45.0f;
                childAt.setPivotX(width);
                childAt.setPivotY(((float) getHeight()) / 2.0f);
                if (left < 0.0f) {
                    childAt.setPivotX((float) getWidth());
                } else {
                    childAt.setPivotX(0.0f);
                }
                childAt.setRotationY(left);
            }
        }
    }

    public boolean canScrollHorizontally() {
        return super.canScrollHorizontally() && this.f165720w;
    }

    public boolean canScrollVertically() {
        return super.canScrollVertically() && this.f165719v;
    }

    public void onLayoutCompleted(RecyclerView.C16628w wVar) {
        super.onLayoutCompleted(wVar);
        mo82583c0();
        Log.m105924i("MicroMsg.Flip3DLayoutManager", "onLayoutCompleted childCount:" + getChildCount());
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rVar, "recycler");
        C87412m.m108594g(wVar, "state");
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i, rVar, wVar);
        mo82583c0();
        Log.m105924i("MicroMsg.Flip3DLayoutManager", "scrollHorizontallyBy childCount:" + getChildCount() + ", dx:" + i);
        return scrollHorizontallyBy;
    }

    public void scrollToPosition(int i) {
        super.scrollToPosition(i);
        Log.m105924i("MicroMsg.Flip3DLayoutManager", "scrollToPosition childCount:" + getChildCount() + ", position:" + i);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        super.smoothScrollToPosition(recyclerView, wVar, i);
        Log.m105924i("MicroMsg.Flip3DLayoutManager", "smoothScrollToPosition childCount:" + getChildCount() + ", position:" + i);
    }
}
