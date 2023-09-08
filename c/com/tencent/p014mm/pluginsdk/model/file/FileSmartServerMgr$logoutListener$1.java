package com.tencent.p014mm.pluginsdk.model.file;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.LogoutEvent;
import com.tencent.p014mm.lan_cs.SmartServer;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/pluginsdk/model/file/FileSmartServerMgr$logoutListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/LogoutEvent;", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.pluginsdk.model.file.FileSmartServerMgr$logoutListener$1 */
public final class FileSmartServerMgr$logoutListener$1 extends IListener<LogoutEvent> {
    public FileSmartServerMgr$logoutListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        LogoutEvent logoutEvent = (LogoutEvent) iEvent;
        C87412m.m108594g(logoutEvent, "event");
        Log.m105924i("MicroMsg.FileSmartServerMgr", "LogoutEvent " + logoutEvent.f78863d.f78864a);
        FileSmartServerMgr fileSmartServerMgr = FileSmartServerMgr.f211575a;
        SmartServer.Java2C.stopSmartServer();
        C13598b0 b0Var = C13598b0.f38549a;
        FileSmartServerMgr.f211576b = false;
        Log.m105924i("MicroMsg.FileSmartServerMgr", "stop result:" + b0Var);
        return false;
    }
}
