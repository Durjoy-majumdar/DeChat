package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.TestPreloadPreviewNotifyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/view/TestPreloadPreview$notifyListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/TestPreloadPreviewNotifyEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.TestPreloadPreview$notifyListener$1 */
public final class TestPreloadPreview$notifyListener$1 extends IListener<TestPreloadPreviewNotifyEvent> {

    /* renamed from: d */
    public final /* synthetic */ TestPreloadPreview f18059d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TestPreloadPreview$notifyListener$1(TestPreloadPreview testPreloadPreview, C40008f fVar) {
        super(fVar);
        this.f18059d = testPreloadPreview;
    }

    public boolean callback(IEvent iEvent) {
        TestPreloadPreviewNotifyEvent testPreloadPreviewNotifyEvent = (TestPreloadPreviewNotifyEvent) iEvent;
        C87412m.m108594g(testPreloadPreviewNotifyEvent, "event");
        TestPreloadPreview testPreloadPreview = this.f18059d;
        TestPreloadPreviewNotifyEvent.C1152a aVar = testPreloadPreviewNotifyEvent.f9563d;
        testPreloadPreview.f162175x = aVar.f9567d;
        testPreloadPreview.f162176y = aVar.f9566c;
        int i = aVar.f9565b;
        testPreloadPreview.f162177z = i;
        if (i == 1) {
            long j = aVar.f9568e;
            if (j != 0) {
                testPreloadPreview.f162168q.add(Long.valueOf(j));
            }
        }
        TestPreloadPreview.m65251f(this.f18059d);
        return true;
    }
}
