package com.tencent.p014mm.plugin.appbrand.launching;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CoreAccountInitializationNotifiedEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPrepareTask;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import f40.C86718e;
import g40.C87134f;
import ke3.C88144b;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareCall$2 */
public class AppBrandPrepareTask$PrepareCall$2 implements C87134f {

    /* renamed from: d */
    public final /* synthetic */ String f243206d;

    /* renamed from: e */
    public final /* synthetic */ String f243207e;

    /* renamed from: f */
    public final /* synthetic */ C1256g f243208f;

    /* renamed from: g */
    public final /* synthetic */ AppLaunchPrepareProcess f243209g;

    /* renamed from: h */
    public final /* synthetic */ int f243210h;

    /* renamed from: i */
    public final /* synthetic */ int f243211i;

    /* renamed from: j */
    public final /* synthetic */ AppBrandPrepareTask.PrepareParams f243212j;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareCall$2$a */
    public class C29557a implements Runnable {
        public C29557a(AppBrandPrepareTask$PrepareCall$2 appBrandPrepareTask$PrepareCall$2) {
        }

        public void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.f7586ke, 0).show();
            try {
                Intent intent = new Intent();
                intent.addFlags(268435456).addFlags(67108864);
                C88144b.m109801s(MMApplicationContext.getContext(), "com.tencent.mm.ui.LauncherUI", intent, (Bundle) null);
            } catch (Exception unused) {
            }
        }
    }

    public AppBrandPrepareTask$PrepareCall$2(AppBrandPrepareTask.C83252b bVar, String str, String str2, C1256g gVar, AppLaunchPrepareProcess appLaunchPrepareProcess, int i, int i2, AppBrandPrepareTask.PrepareParams prepareParams) {
        this.f243206d = str;
        this.f243207e = str2;
        this.f243208f = gVar;
        this.f243209g = appLaunchPrepareProcess;
        this.f243210h = i;
        this.f243211i = i2;
        this.f243212j = prepareParams;
    }

    /* renamed from: e */
    public void mo1180e() {
        Log.m105925i("MicroMsg.AppBrandPrepareTask", "PrepareCall#invoke onMMKernelStartupDone username[%s] appId[%s]", this.f243206d, this.f243207e);
        C86709a0.m107528h().mo121101p(this);
        boolean m = C86709a0.m107523b().mo121115m();
        boolean r = C86718e.m107551r();
        if (!m || r) {
            Log.m105925i("MicroMsg.AppBrandPrepareTask", "prepareCall, startup done, hasLogin %B, hold %B", Boolean.valueOf(m), Boolean.valueOf(r));
            MMHandlerThread.postToMainThread(new C29557a(this));
            if (this.f243208f != null) {
                AppBrandPrepareTask.PrepareResult prepareResult = new AppBrandPrepareTask.PrepareResult();
                prepareResult.f243185d = AppBrandPrepareTask.C83254d.EVENT_KILL_CLIENT_PROCESS;
                this.f243208f.mo894a(prepareResult);
                return;
            }
            return;
        }
        C832552 r0 = new IListener<CoreAccountInitializationNotifiedEvent>(C40008f.f107254d) {
            {
                this.__eventId = 19430116;
            }

            public boolean callback(IEvent iEvent) {
                if (((CoreAccountInitializationNotifiedEvent) iEvent) != null) {
                    dead();
                    Log.m105924i("MicroMsg.AppBrandPrepareTask", "prepareCall account notifyAllDone, start real prepare");
                }
                AppBrandPrepareTask$PrepareCall$2.this.f243209g.mo115526n();
                return false;
            }
        };
        if (C86709a0.m107523b().f251765p) {
            r0.callback((IEvent) null);
            return;
        }
        Log.m105924i("MicroMsg.AppBrandPrepareTask", "prepareCall account not notifyAllDone yet, wait for it");
        r0.alive();
    }

    /* renamed from: g */
    public void mo1181g(boolean z) {
        C86709a0.m107528h().mo121101p(this);
        Log.m105925i("MicroMsg.AppBrandPrepareTask", "kernel onExit(%b), kill prepare process appId[%s] type[%d] scene[%d] sessionId[%s]", Boolean.valueOf(z), this.f243207e, Integer.valueOf(this.f243210h), Integer.valueOf(this.f243211i), this.f243212j.f243174p);
        if (this.f243208f != null) {
            AppBrandPrepareTask.PrepareResult prepareResult = new AppBrandPrepareTask.PrepareResult();
            prepareResult.f243185d = AppBrandPrepareTask.C83254d.EVENT_KILL_CLIENT_PROCESS;
            this.f243208f.mo894a(prepareResult);
        }
    }
}
