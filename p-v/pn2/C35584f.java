package pn2;

import com.tencent.p014mm.autogen.events.ReportClickFindFriendShakeEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: pn2.f */
public class C35584f extends IStaticListener<ReportClickFindFriendShakeEvent> {
    public boolean callback(IEvent iEvent) {
        ReportClickFindFriendShakeEvent reportClickFindFriendShakeEvent = (ReportClickFindFriendShakeEvent) iEvent;
        if (!(reportClickFindFriendShakeEvent instanceof ReportClickFindFriendShakeEvent)) {
            Log.m105920e("MicroMsg.OnReportClickFindFriendShake", "mismatch event listener for ReportClickFindFriendShakeEvent");
        } else {
            C115669n nVar = C115669n.INSTANCE;
            reportClickFindFriendShakeEvent.f78924d.getClass();
            nVar.mo160131h(10221, 1);
        }
        return false;
    }
}
