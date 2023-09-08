package wy0;

import com.tencent.p014mm.autogen.events.WxFileIndexDirtyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import gy3.C87412m;

/* renamed from: wy0.a0 */
public final class C38361a0 extends IStaticListener<WxFileIndexDirtyEvent> {
    public boolean callback(IEvent iEvent) {
        WxFileIndexDirtyEvent wxFileIndexDirtyEvent = (WxFileIndexDirtyEvent) iEvent;
        C87412m.m108594g(wxFileIndexDirtyEvent, "event");
        long j = wxFileIndexDirtyEvent.f79070d.f79071a;
        if (j <= 0) {
            return true;
        }
        C102506a.f301832a.mo142123h(j);
        return true;
    }
}
