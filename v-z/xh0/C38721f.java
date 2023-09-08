package xh0;

import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import com.tencent.p014mm.plugin.announcement.C68571h;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C45612m0;

/* renamed from: xh0.f */
public class C38721f extends IStaticListener<RevokeMsgEvent> {
    public boolean callback(IEvent iEvent) {
        RevokeMsgEvent revokeMsgEvent = (RevokeMsgEvent) iEvent;
        if (Util.isNullOrNil(revokeMsgEvent.f78943d.f78949f)) {
            return false;
        }
        C45612m0.m50677D(revokeMsgEvent.f78943d.f78946c.mo108768t(), revokeMsgEvent.f78943d.f78949f);
        C68571h hVar = (C68571h) C86312j.m106911c(C68571h.class);
        C68571h.vx0(revokeMsgEvent.f78943d.f78944a);
        return false;
    }
}
