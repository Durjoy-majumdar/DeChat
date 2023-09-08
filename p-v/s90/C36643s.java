package s90;

import com.tencent.p014mm.autogen.events.AppMsgInsertEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import gy3.C87412m;
import zt3.C119157j;

/* renamed from: s90.s */
public final class C36643s extends IStaticListener<AppMsgInsertEvent> {
    public boolean callback(IEvent iEvent) {
        AppMsgInsertEvent appMsgInsertEvent = (AppMsgInsertEvent) iEvent;
        C87412m.m108594g(appMsgInsertEvent, "event");
        C72963f4 f4Var = appMsgInsertEvent.f78718d.f78719a;
        if (f4Var == null) {
            return true;
        }
        if (f4Var.mo108768t() == null || !C72996z1.m85840k5(f4Var.mo108768t())) {
            Log.m105928w("MicroMsg.AppMsgInsertEventListener", "doReportReceiveAppMsgFromNotifyMessage not from notifymessage and ignore");
            return true;
        }
        ((C119157j) C119157j.f356862d).mo183871b(new C36642r(this, f4Var), "ReportAppMsg");
        return true;
    }
}
