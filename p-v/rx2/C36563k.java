package rx2;

import com.tencent.p014mm.autogen.events.TalkRoomeStatusBarHideEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: rx2.k */
public class C36563k extends IStaticListener<TalkRoomeStatusBarHideEvent> {
    public boolean callback(IEvent iEvent) {
        TalkRoomeStatusBarHideEvent talkRoomeStatusBarHideEvent = (TalkRoomeStatusBarHideEvent) iEvent;
        if (!(talkRoomeStatusBarHideEvent instanceof TalkRoomeStatusBarHideEvent)) {
            Log.m105923f("TalkRoomeStatusBarHideListener", "mismatch %s", talkRoomeStatusBarHideEvent.getClass().getName());
        }
        return false;
    }
}
