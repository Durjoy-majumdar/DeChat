package com.tencent.p014mm.booter;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.booter.NotifyReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;

/* renamed from: com.tencent.mm.booter.l */
public class C28869l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NotifyReceiver.C80803b f79264d;

    public C28869l(NotifyReceiver.C80803b bVar) {
        this.f79264d = bVar;
    }

    public void run() {
        if (C86709a0.m107523b().mo121114l()) {
            if (Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(15, (Object) null)) == 0) {
                Log.m105920e("MicroMsg.NotifyReceiver", "not init finish , do not post sync task");
                return;
            }
            long nowMilliSecond = Util.nowMilliSecond();
            long j = NotifyReceiver.C80803b.f237527d;
            if (nowMilliSecond - j <= 0 || nowMilliSecond - j >= 10000) {
                NotifyReceiver.C80803b.f237527d = nowMilliSecond;
                Log.m105924i("MicroMsg.NotifyReceiver", "begin post sync task");
                long currentTicks = Util.currentTicks();
                new PostSyncTaskEvent().publish();
                Log.m105925i("MicroMsg.NotifyReceiver", "end post sync task, cost=%d, Idle done", Long.valueOf(Util.ticksToNow(currentTicks)));
                this.f79264d.mo112555a(3000);
                return;
            }
            Log.m105919d("MicroMsg.NotifyReceiver", "sync task limit now - last : %d", Long.valueOf(nowMilliSecond - j));
        }
    }

    public String toString() {
        return super.toString() + "|doPostSyncTask";
    }
}
