package rx2;

import com.tencent.p014mm.autogen.events.TalkRoomReportMgrEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import sx2.C118318d;

/* renamed from: rx2.g */
public class C36560g extends IStaticListener<TalkRoomReportMgrEvent> {
    public boolean callback(IEvent iEvent) {
        TalkRoomReportMgrEvent talkRoomReportMgrEvent = (TalkRoomReportMgrEvent) iEvent;
        if (!(talkRoomReportMgrEvent instanceof TalkRoomReportMgrEvent)) {
            Log.m105923f("MicroMsg.TalkRoomReportMgrListener", "mismatch %s", talkRoomReportMgrEvent.getClass().getName());
            return false;
        } else if (!talkRoomReportMgrEvent.f79030d.f79031a) {
            return false;
        } else {
            C118318d.xx0().f353630l = 1;
            return true;
        }
    }
}
