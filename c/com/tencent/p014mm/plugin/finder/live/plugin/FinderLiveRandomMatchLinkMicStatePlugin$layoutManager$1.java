package com.tencent.p014mm.plugin.finder.live.plugin;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$layoutManager$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin$layoutManager$1 */
public final class FinderLiveRandomMatchLinkMicStatePlugin$layoutManager$1 extends LinearLayoutManager {

    /* renamed from: v */
    public final /* synthetic */ ViewGroup f15164v;

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin$layoutManager$1$a */
    public static final class C3177a extends C54256s {
        public C3177a(Context context) {
            super(context);
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            C87412m.m108594g(displayMetrics, "displayMetrics");
            return 5.0f / displayMetrics.density;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveRandomMatchLinkMicStatePlugin$layoutManager$1(ViewGroup viewGroup, Context context) {
        super(context, 0, false);
        this.f15164v = viewGroup;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        C3177a aVar = new C3177a(this.f15164v.getContext());
        aVar.f44872a = i;
        startSmoothScroll(aVar);
    }
}
