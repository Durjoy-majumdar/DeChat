package p608mo;

import com.tencent.p014mm.autogen.events.BizPlaceTopChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import rb0.C48009v0;

/* renamed from: mo.a */
public class C47081a extends IStaticListener<BizPlaceTopChangeEvent> {
    public boolean callback(IEvent iEvent) {
        C48009v0.Jx0().Ab0(((BizPlaceTopChangeEvent) iEvent).f107373d.f107374a);
        return true;
    }
}
