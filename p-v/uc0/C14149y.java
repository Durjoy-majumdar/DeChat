package uc0;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C116756s5;
import f40.C86709a0;

/* renamed from: uc0.y */
public class C14149y extends IStaticListener<PostSyncTaskEvent> {
    public boolean callback(IEvent iEvent) {
        PostSyncTaskEvent postSyncTaskEvent = (PostSyncTaskEvent) iEvent;
        if (Util.secondsToNow(Util.nullAs((Long) C86709a0.m107535s().mo121142i().mo119684e(66818, (Object) null), 0)) * 1000 > 1800000) {
            int nullAs = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(66820, (Object) null), -99999);
            if (nullAs != -99999) {
                C116756s5.m164689b(9, nullAs + "");
                C86709a0.m107535s().mo121142i().mo119676J(66820, -99999);
            }
            C86709a0.m107535s().mo121142i().mo119676J(66818, Long.valueOf(Util.nowSecond()));
        }
        return false;
    }
}
