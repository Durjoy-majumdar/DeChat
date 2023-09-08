package com.tencent.p014mm.modelsimple;

import android.content.Context;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CoreNetworkReadyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import eb0.C97625j3;
import ei3.C86522b;

@C86522b
/* renamed from: com.tencent.mm.modelsimple.AppBgFgService */
public class AppBgFgService extends C86301e {

    /* renamed from: d */
    public final C80401d f237941d = new C80401d(this) {
        /* renamed from: a */
        public void mo17850a() {
        }

        /* renamed from: b */
        public void mo17851b() {
            Log.m105924i("MicroMsg.AppBgFgService", "fg at launch");
            final AppBgFgService$1$$a appBgFgService$1$$a = new AppBgFgService$1$$a(this);
            if (C97625j3.m125815e() == null || C97625j3.m125815e().f256809d == null || C97625j3.m125815e().f256809d.mo55443A3() == null) {
                Log.m105924i("MicroMsg.AppBgFgService", "wait for core network");
                new IListener<CoreNetworkReadyEvent>(this, C40008f.f107254d) {
                    {
                        this.__eventId = 1756740982;
                    }

                    public boolean callback(IEvent iEvent) {
                        CoreNetworkReadyEvent coreNetworkReadyEvent = (CoreNetworkReadyEvent) iEvent;
                        Log.m105924i("MicroMsg.AppBgFgService", "core network ready callback");
                        appBgFgService$1$$a.run();
                        dead();
                        return false;
                    }
                }.alive();
            } else {
                Log.m105924i("MicroMsg.AppBgFgService", "core network ready");
                appBgFgService$1$$a.run();
            }
            AppExplicitBackgroundOwner.INSTANCE.removeLifecycleCallback((C80401d) this);
        }
    };

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        if (MMApplicationContext.isMainProcess()) {
            AppExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(this.f237941d);
        }
    }

    public void onCreate(Context context) {
        super.onCreate(context);
    }
}
