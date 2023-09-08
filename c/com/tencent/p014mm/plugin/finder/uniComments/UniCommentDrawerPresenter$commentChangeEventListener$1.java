package com.tencent.p014mm.plugin.finder.uniComments;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.UniCommentChangeEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$commentChangeEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/UniCommentChangeEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$commentChangeEventListener$1 */
public final class UniCommentDrawerPresenter$commentChangeEventListener$1 extends IListener<UniCommentChangeEvent> {

    /* renamed from: d */
    public final /* synthetic */ UniCommentDrawerPresenter f161410d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UniCommentDrawerPresenter$commentChangeEventListener$1(UniCommentDrawerPresenter uniCommentDrawerPresenter, C40008f fVar) {
        super(fVar);
        this.f161410d = uniCommentDrawerPresenter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r8) {
        /*
            r7 = this;
            com.tencent.mm.autogen.events.UniCommentChangeEvent r8 = (com.tencent.p014mm.autogen.events.UniCommentChangeEvent) r8
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r8, r0)
            com.tencent.mm.autogen.events.UniCommentChangeEvent$a r0 = r8.f154888d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0025
            long r3 = r0.f154889a
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r0 = r7.f161410d
            qq1.a r0 = r0.f161380h
            if (r0 == 0) goto L_0x001e
            int r0 = r0.f179674f
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x001e:
            java.lang.String r8 = "feedObj"
            gy3.C87412m.m108603p(r8)
            r8 = 0
            throw r8
        L_0x0025:
            r0 = 0
        L_0x0026:
            if (r0 != 0) goto L_0x0029
            goto L_0x0059
        L_0x0029:
            com.tencent.mm.plugin.finder.uniComments.c r0 = new com.tencent.mm.plugin.finder.uniComments.c
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r1 = r7.f161410d
            r0.<init>(r8, r1)
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            boolean r8 = gy3.C87412m.m108589b(r8, r1)
            if (r8 == 0) goto L_0x0046
            r0.invoke()
            goto L_0x0058
        L_0x0046:
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r8 = r7.f161410d
            lq1.g0 r8 = r8.f161382j
            if (r8 == 0) goto L_0x0058
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer r8 = r8.mo86312i()
            com.tencent.mm.plugin.finder.uniComments.b r1 = new com.tencent.mm.plugin.finder.uniComments.b
            r1.<init>(r0)
            r8.post(r1)
        L_0x0058:
            r1 = 1
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter$commentChangeEventListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
