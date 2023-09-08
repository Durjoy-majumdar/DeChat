package w52;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;

/* renamed from: w52.j */
public class C38021j extends IStaticListener<PostSyncTaskEvent> {
    public boolean callback(IEvent iEvent) {
        PostSyncTaskEvent postSyncTaskEvent = (PostSyncTaskEvent) iEvent;
        if (!C97625j3.m125811a()) {
            Log.m105920e("MicroMsg.PostTaskMassSendListener", "has not set uin");
        } else {
            C38023l.xx0().getClass();
            if (!(Util.milliSecondsToNow(Util.nullAs((Long) C97625j3.m125812b().mo105906u().mo119684e(102409, (Object) null), 0)) > 900000)) {
                Log.m105918d("MicroMsg.PostTaskMassSendListener", "time limit");
            } else {
                C38023l.xx0().mo73767a();
                C53078f xx02 = C38023l.xx0();
                long nowMilliSecond = Util.nowMilliSecond();
                xx02.getClass();
                C97625j3.m125812b().mo105906u().mo119676J(102409, Long.valueOf(nowMilliSecond));
            }
        }
        return false;
    }
}
