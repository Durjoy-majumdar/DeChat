package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.PreloadProcessChangeEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/view/TestPreloadPreview$listener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/PreloadProcessChangeEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.TestPreloadPreview$listener$1 */
public final class TestPreloadPreview$listener$1 extends IListener<PreloadProcessChangeEvent> {

    /* renamed from: d */
    public final /* synthetic */ TestPreloadPreview f162213d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TestPreloadPreview$listener$1(TestPreloadPreview testPreloadPreview, C40008f fVar) {
        super(fVar);
        this.f162213d = testPreloadPreview;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a A[LOOP:0: B:8:0x003a->B:11:0x0054, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r7) {
        /*
            r6 = this;
            com.tencent.mm.autogen.events.PreloadProcessChangeEvent r7 = (com.tencent.p014mm.autogen.events.PreloadProcessChangeEvent) r7
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r7, r0)
            com.tencent.mm.autogen.events.PreloadProcessChangeEvent$a r0 = r7.f154859d
            java.lang.String r0 = r0.f154860a
            r1 = 1
            if (r0 == 0) goto L_0x0061
            com.tencent.mm.plugin.finder.view.TestPreloadPreview r2 = r6.f162213d
            com.tencent.mm.plugin.finder.view.TestPreloadPreview$b r0 = com.tencent.p014mm.plugin.finder.view.TestPreloadPreview.m65246a(r2, r0)
            com.tencent.mm.autogen.events.PreloadProcessChangeEvent$a r3 = r7.f154859d
            int r4 = r3.f154862c
            r5 = 2
            if (r4 != r5) goto L_0x0020
            int r7 = r3.f154863d
            r0.f162188g = r7
            goto L_0x0056
        L_0x0020:
            int r4 = r3.f154861b
            r0.f162183b = r4
            r0.f162185d = r1
            java.lang.String r4 = r3.f154865f
            r0.f162186e = r4
            boolean r3 = r3.f154864e
            java.lang.String.valueOf(r3)
            r0.getClass()
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<cm1.i2> r0 = r2.f162162h
            if (r0 == 0) goto L_0x005a
            java.util.Iterator r0 = r0.iterator()
        L_0x003a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0056
            java.lang.Object r3 = r0.next()
            cm1.i2 r3 = (cm1.C0740i2) r3
            te3.rq2 r3 = com.tencent.p014mm.plugin.finder.view.TestPreloadPreview.m65248c(r2, r3)
            java.lang.String r3 = r3.f185275p
            com.tencent.mm.autogen.events.PreloadProcessChangeEvent$a r4 = r7.f154859d
            java.lang.String r4 = r4.f154860a
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x003a
        L_0x0056:
            com.tencent.p014mm.plugin.finder.view.TestPreloadPreview.m65251f(r2)
            goto L_0x0061
        L_0x005a:
            java.lang.String r7 = "data"
            gy3.C87412m.m108603p(r7)
            r7 = 0
            throw r7
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.TestPreloadPreview$listener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
