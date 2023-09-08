package u22;

import com.tencent.p014mm.app.C114661d0;
import com.tencent.p014mm.autogen.events.ResumeOrPauseTrackRoomEvent;
import f40.C86709a0;
import f40.C86718e;

/* renamed from: u22.d */
public class C37326d extends C114661d0.C28676a {
    public void onAppBackground(String str) {
        if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                ResumeOrPauseTrackRoomEvent resumeOrPauseTrackRoomEvent = new ResumeOrPauseTrackRoomEvent();
                resumeOrPauseTrackRoomEvent.f78939d.f78940a = false;
                resumeOrPauseTrackRoomEvent.publish();
            }
        }
    }

    public void onAppForeground(String str) {
        if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                ResumeOrPauseTrackRoomEvent resumeOrPauseTrackRoomEvent = new ResumeOrPauseTrackRoomEvent();
                resumeOrPauseTrackRoomEvent.f78939d.f78940a = true;
                resumeOrPauseTrackRoomEvent.publish();
            }
        }
    }
}
