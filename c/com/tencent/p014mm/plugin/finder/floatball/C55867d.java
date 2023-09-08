package com.tencent.p014mm.plugin.finder.floatball;

import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.floatball.d */
public final class C55867d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FeedUpdateEvent f159141d;

    /* renamed from: e */
    public final /* synthetic */ FinderVideoPassiveMiniViewHelper f159142e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55867d(FeedUpdateEvent feedUpdateEvent, FinderVideoPassiveMiniViewHelper finderVideoPassiveMiniViewHelper) {
        super(0);
        this.f159141d = feedUpdateEvent;
        this.f159142e = finderVideoPassiveMiniViewHelper;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r0 = r0.f159103g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r7 = this;
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r7.f159141d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            r0.getClass()
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r7.f159141d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            int r0 = r0.f9175b
            r1 = 19
            if (r0 != r1) goto L_0x00a1
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r0 = r7.f159142e
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r0 = r0.f159093y
            r1 = 0
            if (r0 == 0) goto L_0x0025
            com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f159103g
            if (r0 == 0) goto L_0x0025
            long r2 = r0.getLiveId()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L_0x0026
        L_0x0025:
            r0 = r1
        L_0x0026:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "feedChangeListener id:"
            r2.append(r3)
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r7.f159141d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            long r3 = r3.f9174a
            r2.append(r3)
            java.lang.String r3 = " liveId:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ", liveStatus:"
            r2.append(r3)
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r7.f159141d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            int r3 = r3.f9182i
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FinderVideoPassive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r7.f159141d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r2.f9173d
            long r2 = r2.f9174a
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00a1
            if (r0 != 0) goto L_0x0067
            goto L_0x00a1
        L_0x0067:
            long r4 = r0.longValue()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00a1
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r7.f159141d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            int r0 = r0.f9182i
            r2 = 2
            if (r0 != r2) goto L_0x00a1
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r0 = r7.f159142e
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r0 = r0.mo77450A0()
            android.content.res.Resources r3 = r0.getResources()
            r4 = 2131837656(0x7f1142d8, float:1.9308513E38)
            java.lang.String r3 = r3.getString(r4)
            r0.setContentDescription(r3)
            r3 = 1
            r0.f160142f = r3
            r3 = 0
            r0.setMusicCtrlBtnStatus(r3)
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r0 = r7.f159142e
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r0 = r0.f159093y
            if (r0 == 0) goto L_0x009b
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r0.f159103g
        L_0x009b:
            if (r1 != 0) goto L_0x009e
            goto L_0x00a1
        L_0x009e:
            r1.setLiveStatus(r2)
        L_0x00a1:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.floatball.C55867d.invoke():java.lang.Object");
    }
}
