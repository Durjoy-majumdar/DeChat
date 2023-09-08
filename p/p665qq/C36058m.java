package p665qq;

import com.tencent.p014mm.autogen.events.KvReportEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import la1.C61257a;
import la1.C61258b;
import zt3.C119157j;

/* renamed from: qq.m */
public class C36058m extends IStaticListener<KvReportEvent> {
    public boolean callback(IEvent iEvent) {
        KvReportEvent kvReportEvent = (KvReportEvent) iEvent;
        C61258b bVar = (C61258b) C86312j.m106911c(C61258b.class);
        bVar.getClass();
        if (kvReportEvent.f78853d.f78854a == 18762 || !MMApplicationContext.isMainProcess() || kvReportEvent.f78853d == null) {
            return false;
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C61257a(bVar, kvReportEvent));
        return false;
    }
}
