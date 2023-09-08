package com.tencent.p014mm.plugin.finder.feed;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0005"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderFeedSnsAdHandler$lifecycleObserver$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onResume", "onPause", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$lifecycleObserver$1 */
public final class FinderFeedSnsAdHandler$lifecycleObserver$1 implements C0124r {

    /* renamed from: d */
    public boolean f13043d;

    /* renamed from: e */
    public final /* synthetic */ FinderFeedSnsAdHandler f13044e;

    public FinderFeedSnsAdHandler$lifecycleObserver$1(FinderFeedSnsAdHandler finderFeedSnsAdHandler) {
        this.f13044e = finderFeedSnsAdHandler;
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public final void onPause() {
        FinderFeedSnsAdHandler finderFeedSnsAdHandler = this.f13044e;
        RecyclerView recyclerView = finderFeedSnsAdHandler.f30362g;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(finderFeedSnsAdHandler.f13033m);
        }
        FinderFeedSnsAdHandler finderFeedSnsAdHandler2 = this.f13044e;
        finderFeedSnsAdHandler2.f13032l = finderFeedSnsAdHandler2.mo2505i(finderFeedSnsAdHandler2.f13031k);
        this.f13044e.mo2503g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0044, code lost:
        r3 = r3.getAdapter();
     */
    @androidx.lifecycle.C112974b0(androidx.lifecycle.C39623j.C39625b.ON_RESUME)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r9 = this;
            boolean r0 = r9.f13043d
            r1 = 1
            if (r0 != 0) goto L_0x0009
            r9.f13043d = r1
            goto L_0x00e2
        L_0x0009:
            com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler r0 = r9.f13044e
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r0.f13031k
            boolean r2 = r0.mo2505i(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "changeAdFollowView isFollowCur:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " isFollowOnLeavePage:"
            r3.append(r4)
            boolean r4 = r0.f13032l
            r3.append(r4)
            java.lang.String r4 = ", lastFeedPos="
            r3.append(r4)
            int r4 = r0.f30359d
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Finder.FeedAdHandler"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            boolean r3 = r0.f13032l
            if (r3 == r2) goto L_0x00e2
            androidx.recyclerview.widget.RecyclerView r3 = r0.f30362g
            r4 = 0
            if (r3 == 0) goto L_0x004f
            androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
            if (r3 == 0) goto L_0x004f
            int r3 = r3.getItemCount()
            goto L_0x0050
        L_0x004f:
            r3 = 0
        L_0x0050:
            r5 = 25
            if (r2 == 0) goto L_0x00a0
            androidx.recyclerview.widget.RecyclerView r2 = r0.f30362g
            if (r2 == 0) goto L_0x007f
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
            if (r2 == 0) goto L_0x007f
            int r6 = r0.f30359d
            long r6 = r2.getItemId(r6)
            java.lang.Runnable r2 = r0.f13033m
            if (r2 == 0) goto L_0x006f
            androidx.recyclerview.widget.RecyclerView r8 = r0.f30362g
            if (r8 == 0) goto L_0x006f
            r8.removeCallbacks(r2)
        L_0x006f:
            com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$a r2 = new com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$a
            r2.<init>(r6)
            r0.f13033m = r2
            androidx.recyclerview.widget.RecyclerView r6 = r0.f30362g
            if (r6 == 0) goto L_0x007f
            r7 = 1000(0x3e8, double:4.94E-321)
            r6.postDelayed(r2, r7)
        L_0x007f:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f30362g
            if (r2 == 0) goto L_0x009c
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
            if (r2 == 0) goto L_0x009c
            int r6 = r0.f30359d
            rx3.l r7 = new rx3.l
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.<init>(r5, r8)
            r2.notifyItemChanged(r6, r7)
        L_0x009c:
            r0.mo2507k()
            goto L_0x00c4
        L_0x00a0:
            r0.f30361f = r4
            if (r3 <= 0) goto L_0x00be
            androidx.recyclerview.widget.RecyclerView r2 = r0.f30362g
            if (r2 == 0) goto L_0x00be
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
            if (r2 == 0) goto L_0x00be
            rx3.l r6 = new rx3.l
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r6.<init>(r5, r7)
            r2.notifyItemRangeChanged(r4, r3, r6)
        L_0x00be:
            long r5 = r0.f30358c
            r2 = 0
            r0.mo2508l(r5, r2)
        L_0x00c4:
            if (r3 <= 0) goto L_0x00e2
            androidx.recyclerview.widget.RecyclerView r0 = r0.f30362g
            if (r0 == 0) goto L_0x00e2
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x00e2
            rx3.l r2 = new rx3.l
            r5 = 29
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.<init>(r5, r1)
            r0.notifyItemRangeChanged(r4, r3, r2)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderFeedSnsAdHandler$lifecycleObserver$1.onResume():void");
    }
}
