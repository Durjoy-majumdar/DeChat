package v22;

import cc0.C92411b;
import com.tencent.p014mm.autogen.events.ResumeOrPauseTrackRoomEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import t22.C118351p;
import t22.C118355y;
import t22.C77832s;

/* renamed from: v22.t */
public class C118640t extends IStaticListener<ResumeOrPauseTrackRoomEvent> {
    public boolean callback(IEvent iEvent) {
        ResumeOrPauseTrackRoomEvent resumeOrPauseTrackRoomEvent = (ResumeOrPauseTrackRoomEvent) iEvent;
        Log.m105918d("ResumeOrPauseTrackRoomListener", "trackEvent state " + resumeOrPauseTrackRoomEvent.f78939d.f78940a);
        if (resumeOrPauseTrackRoomEvent.f78939d.f78940a) {
            if (!C77832s.Ax0().mo183159b() || !C77832s.Ax0().f353754w) {
                return false;
            }
            C77832s.Ax0().mo183162e();
            return false;
        } else if (!C77832s.Ax0().mo183159b()) {
            return false;
        } else {
            C118355y Ax0 = C77832s.Ax0();
            Ax0.getClass();
            Log.m105918d("MicorMsg.TrackRefreshManager", "pause refresh");
            Ax0.f353754w = true;
            C92411b bVar = Ax0.f353740f;
            if (bVar != null) {
                bVar.mo126408b(Ax0.f353736G);
            }
            C118351p pVar = Ax0.f353741g;
            if (pVar == null) {
                return false;
            }
            pVar.mo183154d(Ax0.f353737H);
            return false;
        }
    }
}
