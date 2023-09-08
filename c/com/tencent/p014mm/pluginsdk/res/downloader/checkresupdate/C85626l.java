package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import com.tencent.p014mm.autogen.events.CheckResUpdatePostOperationEvent;
import com.tencent.p014mm.matrix.C55261a;
import com.tencent.p014mm.matrix.C55262j;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115908t;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85632g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;
import p757xv.C91346k;
import rd3.C48020a;
import zt3.C119143b;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.l */
public final class C85626l extends C85632g<C115880a> implements C91346k.C91347a {

    /* renamed from: c */
    public final C119143b f249569c = new C85632g.C85633a("MicroMsg.ResDownloader.CheckResUpdate.DecryptExecutor", 0, Integer.MAX_VALUE, new SynchronousQueue());

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.l$a */
    public static final class C85627a extends C85632g.C85636d<C115880a> {

        /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.l$a$a */
        public class C85628a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C115880a f249570d;

            public C85628a(C85627a aVar, C115880a aVar2) {
                this.f249570d = aVar2;
            }

            public void run() {
                CheckResUpdatePostOperationEvent checkResUpdatePostOperationEvent = new CheckResUpdatePostOperationEvent();
                CheckResUpdatePostOperationEvent.C114670a aVar = checkResUpdatePostOperationEvent.f343540d;
                C115880a aVar2 = this.f249570d;
                aVar.f343541a = aVar2.f347682b;
                aVar.f343542b = aVar2.f347683c;
                aVar.f343544d = aVar2.f347693m;
                aVar.f343543c = 1;
                checkResUpdatePostOperationEvent.publish();
            }
        }

        public C85627a(C115880a aVar) {
            super(aVar);
        }

        public void run() {
            boolean interrupted;
            Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DecryptTask", "%s: decryptTask, entered", ((C115880a) this.f249577d).f347681a);
            Req req = this.f249577d;
            C115880a aVar = (C115880a) req;
            int i = aVar.f347682b;
            int i2 = aVar.f347683c;
            int i3 = aVar.f347684d;
            try {
                String e = C115893m.m163016e((C115880a) req);
                if (!Util.isNullOrNil(e)) {
                    CheckResUpdateHelper.m162971c().mo176407h(i, i2, e, i3, ((C115880a) this.f249577d).f347692l);
                    if (!interrupted) {
                        return;
                    }
                    return;
                }
                C48020a.m53384a(((C115880a) this.f249577d).f347686f + ".decrypted");
                C48020a.m53384a(((C115880a) this.f249577d).f347686f + ".decompressed");
                if (Thread.interrupted()) {
                    Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DecryptTask", "%s: decrypting and interrupted", ((C115880a) this.f249577d).f347681a);
                    C48020a.m53384a(((C115880a) this.f249577d).f347686f);
                    C48020a.m53384a(((C115880a) this.f249577d).f347686f + ".decrypted");
                    C48020a.m53384a(((C115880a) this.f249577d).f347686f + ".decompressed");
                }
                C115908t.C115910b.f347790a.f347787d.post(new C85628a(this, (C115880a) this.f249577d));
            } finally {
                if (Thread.interrupted()) {
                    Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DecryptTask", "%s: decrypting and interrupted", ((C115880a) this.f249577d).f347681a);
                    C48020a.m53384a(((C115880a) this.f249577d).f347686f);
                    C48020a.m53384a(((C115880a) this.f249577d).f347686f + ".decrypted");
                    C48020a.m53384a(((C115880a) this.f249577d).f347686f + ".decompressed");
                }
            }
        }
    }

    public C85626l() {
        ((C91346k) C86312j.m106911c(C91346k.class)).mo125329Ja(this);
    }

    /* renamed from: a */
    public void mo119160a(boolean z) {
        C55261a aVar = C55262j.f157382a;
        if ((aVar == null ? false : aVar.mo76562e2(81)) && z && !((ConcurrentHashMap) this.f249574b).isEmpty()) {
            Log.m105928w("MicroMsg.ResDownloader.CheckResUpdate.DecryptExecutor", "#onAppLowEnergy, cancel all bg tasks");
            C55261a aVar2 = C55262j.f157382a;
            if (aVar2 != null) {
                aVar2.mo76561bO(81);
            }
            mo119165c();
        }
    }

    /* renamed from: d */
    public C119143b mo119161d() {
        return this.f249569c;
    }

    /* renamed from: f */
    public C85632g.C85636d mo113633f(C85632g.C85634b bVar) {
        return new C85627a((C115880a) bVar);
    }
}
