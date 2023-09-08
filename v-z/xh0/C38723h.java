package xh0;

import com.tencent.p014mm.autogen.events.RevokeNativeMsgEvent;
import com.tencent.p014mm.plugin.announcement.C68571h;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;

/* renamed from: xh0.h */
public class C38723h extends IStaticListener<RevokeNativeMsgEvent> {
    public boolean callback(IEvent iEvent) {
        RevokeNativeMsgEvent revokeNativeMsgEvent = (RevokeNativeMsgEvent) iEvent;
        if (Util.isNullOrNil(revokeNativeMsgEvent.f78950d.f78952b)) {
            return false;
        }
        C68571h hVar = (C68571h) C86312j.m106911c(C68571h.class);
        C68571h.vx0(revokeNativeMsgEvent.f78950d.f78951a);
        return false;
    }
}
