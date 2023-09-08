package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderCommentChangeEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentChangeEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderCommentChangeEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$commentChangeEventListener$1 */
public final class FinderCommentDrawerPresenter$commentChangeEventListener$1 extends IListener<FinderCommentChangeEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderCommentDrawerPresenter f158658d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderCommentDrawerPresenter$commentChangeEventListener$1(FinderCommentDrawerPresenter finderCommentDrawerPresenter, C40008f fVar) {
        super(fVar);
        this.f158658d = finderCommentDrawerPresenter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r8) {
        /*
            r7 = this;
            com.tencent.mm.autogen.events.FinderCommentChangeEvent r8 = (com.tencent.p014mm.autogen.events.FinderCommentChangeEvent) r8
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r8, r0)
            com.tencent.mm.autogen.events.FinderCommentChangeEvent$a r0 = r8.f154754d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0026
            long r3 = r0.f154755a
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r0 = r7.f158658d
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.f158620i
            if (r0 == 0) goto L_0x001f
            long r5 = r0.getId()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x001f:
            java.lang.String r8 = "feedObj"
            gy3.C87412m.m108603p(r8)
            r8 = 0
            throw r8
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 != 0) goto L_0x002a
            goto L_0x005a
        L_0x002a:
            com.tencent.mm.plugin.finder.feed.e r0 = new com.tencent.mm.plugin.finder.feed.e
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r1 = r7.f158658d
            r0.<init>(r8, r1)
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            boolean r8 = gy3.C87412m.m108589b(r8, r1)
            if (r8 == 0) goto L_0x0047
            r0.invoke()
            goto L_0x0059
        L_0x0047:
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r8 = r7.f158658d
            ur1.g r8 = r8.f158622n
            if (r8 == 0) goto L_0x0059
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r8 = r8.mo89585j()
            com.tencent.mm.plugin.finder.feed.d r1 = new com.tencent.mm.plugin.finder.feed.d
            r1.<init>(r0)
            r8.post(r1)
        L_0x0059:
            r1 = 1
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter$commentChangeEventListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
