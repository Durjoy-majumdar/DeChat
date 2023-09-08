package vf1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAtTimelineUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.j */
public final class C14780j extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ FinderAtTimelineUI f40762d;

    public C14780j(FinderAtTimelineUI finderAtTimelineUI) {
        this.f40762d = finderAtTimelineUI;
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [androidx.recyclerview.widget.RecyclerView$LayoutManager] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r9, int r10) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0.add(r1)
            java.lang.Object[] r7 = r0.toArray()
            r0.clear()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initManageAtFeed$1"
            java.lang.String r3 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r4 = "onScrollStateChanged"
            java.lang.String r5 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
            r6 = r8
            j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "recyclerView"
            gy3.C87412m.m108594g(r9, r0)
            super.onScrollStateChanged(r9, r10)
            if (r10 != 0) goto L_0x007c
            com.tencent.mm.plugin.finder.feed.ui.FinderAtTimelineUI r9 = r8.f40762d
            kf1.b r10 = r9.f14240v
            r0 = 0
            if (r10 == 0) goto L_0x0075
            com.tencent.mm.view.RefreshLoadMoreLayout r10 = r10.mo10308D()
            androidx.recyclerview.widget.RecyclerView r10 = r10.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r10 = r10.getLayoutManager()
            boolean r1 = r10 instanceof com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager
            if (r1 == 0) goto L_0x0046
            r0 = r10
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r0 = (com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager) r0
        L_0x0046:
            if (r0 == 0) goto L_0x0050
            r9.getClass()
            int r10 = r0.mo17004z()
            goto L_0x0051
        L_0x0050:
            r10 = -1
        L_0x0051:
            java.lang.String r0 = r9.f14237s
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "removeMessage:"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            int r0 = r9.f14236F
            if (r0 == r10) goto L_0x007c
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r9.f14235E
            r1 = 1001(0x3e9, float:1.403E-42)
            r0.removeMessages(r1)
            r9.f14236F = r10
            goto L_0x007c
        L_0x0075:
            java.lang.String r9 = "viewCallback"
            gy3.C87412m.m108603p(r9)
            throw r0
        L_0x007c:
            java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initManageAtFeed$1"
            java.lang.String r10 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r0 = "onScrollStateChanged"
            java.lang.String r1 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
            j20.C117292a.m165361g(r8, r9, r10, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vf1.C14780j.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initManageAtFeed$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderAtTimelineUI$initManageAtFeed$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
