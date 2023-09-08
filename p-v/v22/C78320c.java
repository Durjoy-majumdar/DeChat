package v22;

import com.tencent.p014mm.autogen.events.ExitTrackRoomEvent;
import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dd0.C75350g;
import eb0.C75592q0;
import ed0.C75610d;
import java.util.LinkedList;
import s22.C77611a;
import sx2.C48497j;
import t22.C118355y;
import t22.C77832s;
import t22.C77833z;
import te3.gf4;

/* renamed from: v22.c */
public class C78320c extends IStaticListener<ExitTrackRoomEvent> {
    public boolean callback(IEvent iEvent) {
        C77611a d;
        ExitTrackRoomEvent exitTrackRoomEvent = (ExitTrackRoomEvent) iEvent;
        Log.m105925i("ExitTrackRoomListener", "exit track trackMgr:%s event:%s", ((C118355y) C75610d.m90860b()).f353752u, exitTrackRoomEvent.f193553d.f193554a);
        C77832s.Ax0().mo183163f();
        if (!Util.isNullOrNil(((C77833z) C75610d.m90859a()).mo107949b())) {
            C77832s.Ax0().mo183158a(1);
            TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
            talkRoomServerEvent.f154883d.f154886b = true;
            talkRoomServerEvent.publish();
        }
        if (!Util.isNullOrNil(exitTrackRoomEvent.f193553d.f193554a) && (d = C77832s.Bx0().mo107951d(exitTrackRoomEvent.f193553d.f193554a)) != null) {
            d.f226268e.remove(C75592q0.m90789s());
            C77832s.Bx0().mo107956i(exitTrackRoomEvent.f193553d.f193554a, d.f226268e, d.f226270g, d.f226269f, d.f226271h, (String) null, (String) null);
            if (C75350g.m90357a() != null) {
                ((C48497j) C75350g.m90357a()).mo73133g(exitTrackRoomEvent.f193553d.f193554a, (LinkedList<gf4>) null, (String) null, (String) null, 1);
            }
        }
        return false;
    }
}
