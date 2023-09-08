package com.tencent.p014mm.plugin.p316ai.data.business.trigger;

import com.tencent.p014mm.sdk.platformtools.Log;
import lh0.C34262g;
import lh0.C34270j;

/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.b */
public class C29081b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C34270j f79646d;

    public C29081b(FindMoreFriendsUIReporter findMoreFriendsUIReporter, C34270j jVar) {
        this.f79646d = jVar;
    }

    public void run() {
        C34262g vx02 = C34262g.vx0();
        vx02.requireAccountInitialized();
        Log.m105925i("MicroMsg.FindMoreFriendsUIReporter", "saveFinderRedDotHistory [%b] history[%s]", Boolean.valueOf(vx02.f92367e.mo59530Yt(this.f79646d)), this.f79646d);
    }
}
