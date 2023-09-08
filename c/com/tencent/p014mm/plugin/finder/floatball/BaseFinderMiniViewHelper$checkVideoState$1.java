package com.tencent.p014mm.plugin.finder.floatball;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderVideoStateActionEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/floatball/BaseFinderMiniViewHelper$checkVideoState$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderVideoStateActionEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper$checkVideoState$1 */
public final class BaseFinderMiniViewHelper$checkVideoState$1 extends IListener<FinderVideoStateActionEvent> {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderMiniViewHelper f159078d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseFinderMiniViewHelper$checkVideoState$1(BaseFinderMiniViewHelper baseFinderMiniViewHelper, C40008f fVar) {
        super(fVar);
        this.f159078d = baseFinderMiniViewHelper;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if ((r3 != null && r3.isPlaying()) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r7) {
        /*
            r6 = this;
            com.tencent.mm.autogen.events.FinderVideoStateActionEvent r7 = (com.tencent.p014mm.autogen.events.FinderVideoStateActionEvent) r7
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r7, r0)
            com.tencent.mm.autogen.events.FinderVideoStateActionEvent$a r0 = r7.f154816d
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000e
            goto L_0x0043
        L_0x000e:
            com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper r3 = r6.f159078d
            boolean r3 = r3.mo90541w()
            if (r3 == 0) goto L_0x0040
            com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper r3 = r6.f159078d
            r3.getClass()
            com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper r3 = r6.f159078d
            com.tencent.mm.plugin.ball.model.BallInfo r4 = r3.f311726d
            int r4 = r4.f311686d
            r5 = 32
            if (r4 == r5) goto L_0x0029
            r5 = 20
            if (r4 != r5) goto L_0x003e
        L_0x0029:
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r3 = r3.mo77450A0()
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = r3.getVideoView()
            if (r3 == 0) goto L_0x003b
            boolean r3 = r3.isPlaying()
            if (r3 != r2) goto L_0x003b
            r3 = 1
            goto L_0x003c
        L_0x003b:
            r3 = 0
        L_0x003c:
            if (r3 == 0) goto L_0x0040
        L_0x003e:
            r3 = 1
            goto L_0x0041
        L_0x0040:
            r3 = 0
        L_0x0041:
            r0.f154817a = r3
        L_0x0043:
            com.tencent.mm.autogen.events.FinderVideoStateActionEvent$a r7 = r7.f154816d
            if (r7 != 0) goto L_0x0048
            goto L_0x006a
        L_0x0048:
            com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper r0 = r6.f159078d
            boolean r0 = r0.mo90541w()
            if (r0 == 0) goto L_0x0068
            com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper r0 = r6.f159078d
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r0 = r0.mo77450A0()
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = r0.getVideoView()
            if (r0 == 0) goto L_0x0064
            boolean r0 = r0.isPlaying()
            if (r0 != r2) goto L_0x0064
            r0 = 1
            goto L_0x0065
        L_0x0064:
            r0 = 0
        L_0x0065:
            if (r0 == 0) goto L_0x0068
            r1 = 1
        L_0x0068:
            r7.f154818b = r1
        L_0x006a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.floatball.BaseFinderMiniViewHelper$checkVideoState$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
