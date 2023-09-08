package a22;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import d22.C75320d;
import eb0.C97625j3;

/* renamed from: a22.e */
public class C0010e extends IStaticListener<PostSyncTaskEvent> {
    public boolean callback(IEvent iEvent) {
        PostSyncTaskEvent postSyncTaskEvent = (PostSyncTaskEvent) iEvent;
        if (System.currentTimeMillis() - ((Long) C97625j3.m125812b().mo105906u().mo119684e(209408, 0L)).longValue() > 86400000) {
            Log.m105924i("MicroMsg.Label.PostTaskGetContactLabelListener", "cpan[callback] get contact label list.");
            C97625j3.m125815e().mo123460f(new C75320d());
            C97625j3.m125812b().mo105906u().mo119676J(209408, Long.valueOf((System.currentTimeMillis() - 86400000) + 1800000));
        }
        return false;
    }
}
