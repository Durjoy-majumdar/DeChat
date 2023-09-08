package com.tencent.p014mm.chatroom.plugin.listener;

import com.tencent.p014mm.autogen.events.NotifyGroupToolsResetEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p644pi.C77089d;
import p684si.C36674e;

/* renamed from: com.tencent.mm.chatroom.plugin.listener.k */
public class C28892k extends IStaticListener<NotifyGroupToolsResetEvent> {
    public boolean callback(IEvent iEvent) {
        NotifyGroupToolsResetEvent notifyGroupToolsResetEvent = (NotifyGroupToolsResetEvent) iEvent;
        Class cls = C77089d.class;
        if ((notifyGroupToolsResetEvent instanceof NotifyGroupToolsResetEvent) && notifyGroupToolsResetEvent.f78880d.f78881a != null) {
            C36674e jo = ((C77089d) C86312j.m106911c(cls)).xx0().mo60800jo(notifyGroupToolsResetEvent.f78880d.f78881a.mo108768t());
            if (jo == null) {
                Log.m105919d("MicroMsg.NotifyGroupToolsResetListener", "NotifyGroupToolsResetEvent(%s) groupTools is null", notifyGroupToolsResetEvent.f78880d.f78881a.mo108768t());
            } else if (jo.field_queryState == 0) {
                Log.m105919d("MicroMsg.NotifyGroupToolsResetListener", "NotifyGroupToolsResetEvent(%s) groupTools is COL_STATE_NEED_QUERY", notifyGroupToolsResetEvent.f78880d.f78881a.mo108768t());
            } else {
                jo.field_queryState = 0;
                Log.m105925i("MicroMsg.NotifyGroupToolsResetListener", "NotifyGroupToolsResetEvent(%s) result:%s", notifyGroupToolsResetEvent.f78880d.f78881a.mo108768t(), Boolean.valueOf(((C77089d) C86312j.m106911c(cls)).xx0().update(jo, new String[0])));
            }
        }
        return false;
    }
}
