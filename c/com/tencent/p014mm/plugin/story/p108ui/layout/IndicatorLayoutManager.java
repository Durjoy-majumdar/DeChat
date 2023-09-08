package com.tencent.p014mm.plugin.story.p108ui.layout;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/layout/IndicatorLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.layout.IndicatorLayoutManager */
public final class IndicatorLayoutManager extends LinearLayoutManager {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndicatorLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        C87412m.m108594g(context, "context");
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rVar, "recycler");
        C87412m.m108594g(wVar, "state");
        super.onLayoutChildren(rVar, wVar);
        Log.m105924i("MicroMsg.IndicatorLayoutManager", "onLayoutChildren: " + getItemCount() + ' ' + getChildCount());
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i, rVar, wVar);
        Log.m105924i("MicroMsg.IndicatorLayoutManager", "scrollHorizontallyBy: " + getItemCount() + ' ' + getChildCount());
        return scrollHorizontallyBy;
    }

    public void scrollToPosition(int i) {
        int z = mo17004z();
        int D = mo16958D();
        if (i - z < 2) {
            super.scrollToPosition(i - 2);
        } else if (D - i < 2) {
            super.scrollToPosition(i + 2);
        }
    }
}
