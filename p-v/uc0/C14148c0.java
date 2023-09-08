package uc0;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;

/* renamed from: uc0.c0 */
public class C14148c0 extends IStaticListener<PostSyncTaskEvent> {
    /* renamed from: d */
    public static boolean m13486d() {
        return Util.secondsToNow(Long.valueOf(Util.nullAsNil((Long) C86709a0.m107535s().mo121142i().mo119684e(81938, (Object) null))).longValue()) * 1000 > 86400000;
    }

    public boolean callback(IEvent iEvent) {
        PostSyncTaskEvent postSyncTaskEvent = (PostSyncTaskEvent) iEvent;
        Log.m105918d("MicroMsg.PostTaskUpdateConfigListListener", "callback expired : " + m13486d());
        if (!m13486d()) {
            return false;
        }
        if (C14147c.f39578f == null) {
            C14147c.f39578f = new C14147c();
        }
        C14147c.f39578f.mo13557a();
        return false;
    }
}
