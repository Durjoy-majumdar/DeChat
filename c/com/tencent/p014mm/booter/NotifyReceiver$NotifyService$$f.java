package com.tencent.p014mm.booter;

import android.content.Intent;
import com.tencent.p014mm.booter.NotifyReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import g40.C87134f;
import kj2.C117407d;

/* renamed from: com.tencent.mm.booter.NotifyReceiver$NotifyService$$f */
public class NotifyReceiver$NotifyService$$f implements C87134f {

    /* renamed from: d */
    public final /* synthetic */ long f237539d;

    /* renamed from: e */
    public final /* synthetic */ Intent f237540e;

    /* renamed from: f */
    public final /* synthetic */ NotifyReceiver.NotifyService f237541f;

    /* renamed from: com.tencent.mm.booter.NotifyReceiver$NotifyService$$f$a */
    public class C80805a implements Runnable {
        public C80805a() {
        }

        public void run() {
            Log.m105924i("MicroMsg.NotifyReceiver", "summerboot startupDone do delay notify task");
            NotifyReceiver$NotifyService$$f notifyReceiver$NotifyService$$f = NotifyReceiver$NotifyService$$f.this;
            notifyReceiver$NotifyService$$f.f237541f.mo112550j(notifyReceiver$NotifyService$$f.f237540e);
            C117407d.INSTANCE.idkeyStat(99, 215, 1, false);
        }
    }

    public NotifyReceiver$NotifyService$$f(NotifyReceiver.NotifyService notifyService, long j, Intent intent) {
        this.f237541f = notifyService;
        this.f237539d = j;
        this.f237540e = intent;
    }

    /* renamed from: e */
    public void mo1180e() {
        C86709a0.m107528h().mo121101p(this);
        this.f237541f.f237526j = null;
        long currentTimeMillis = System.currentTimeMillis() - this.f237539d;
        Log.m105925i("MicroMsg.NotifyReceiver", "summerboot startupDone[%b] take[%d]ms tid[%d] post last notify task", Boolean.valueOf(C86709a0.m107528h().f251724a.f251792d), Long.valueOf(currentTimeMillis), Long.valueOf(Thread.currentThread().getId()));
        C117407d dVar = C117407d.INSTANCE;
        dVar.mo160131h(11098, 3600, Long.valueOf(currentTimeMillis));
        dVar.idkeyStat(99, 214, 1, false);
        MMHandlerThread.postToMainThreadDelayed(new C80805a(), 500);
    }

    /* renamed from: g */
    public void mo1181g(boolean z) {
    }
}
