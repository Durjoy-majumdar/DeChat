package com.tencent.p014mm.plugin.collect.model.voice;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p564iq.C87790d;

/* renamed from: com.tencent.mm.plugin.collect.model.voice.d */
public class C115313d {

    /* renamed from: a */
    public C115309b f345563a = new C115309b();

    /* renamed from: com.tencent.mm.plugin.collect.model.voice.d$b */
    public static class C115315b {

        /* renamed from: a */
        public static C115313d f345564a = new C115313d((C115314a) null);
    }

    public C115313d(C115314a aVar) {
    }

    /* renamed from: a */
    public void mo175098a() {
        C115309b bVar = this.f345563a;
        bVar.f345556g = true;
        Thread thread = bVar.f345552c;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Log.m105925i("MicroMsg.OfflineVoice.InnerSynthesizer", "stop() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
        }
        try {
            if (((C87790d) C86312j.m106911c(C87790d.class)).W90()) {
                bVar.f345553d.release();
            }
        } catch (Throwable th) {
            Log.m105925i("MicroMsg.OfflineVoice.InnerSynthesizer", "destroy() Exception:%s %s", th.getClass().getSimpleName(), th.getMessage());
        }
        bVar.f345555f = false;
    }
}
