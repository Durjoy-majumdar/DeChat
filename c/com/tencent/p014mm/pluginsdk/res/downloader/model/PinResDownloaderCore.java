package com.tencent.p014mm.pluginsdk.res.downloader.model;

import android.content.Context;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.AppActiveEvent;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import p757xv.C118903j;
import p757xv.C118904l;
import p757xv.C91346k;
import p933be.C113159b;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.PinResDownloaderCore */
public final class PinResDownloaderCore extends C86301e {

    /* renamed from: d */
    public final C29060q f347758d = new C115897a(this);

    /* renamed from: e */
    public final IListener f347759e = new IListener<AppActiveEvent>(this, C40008f.f107254d) {
        {
            this.__eventId = 2123042947;
        }

        public boolean callback(IEvent iEvent) {
            boolean z;
            Class cls = C118904l.class;
            if (!((AppActiveEvent) iEvent).f78710d.f78711a) {
                if (((C118903j) C86312j.m106911c(C118903j.class)).mo76562e2(84)) {
                    ((C118904l) C86312j.m106911c(cls)).So0(CodecError.DEQUEUEOUTPUTBUFFER_ALWAYS_RETURN_TRY_AGAIN, C113159b.m154842h().mo165664a());
                    if (((C91346k) C86312j.m106911c(C91346k.class)).mo125330QL()) {
                        Log.m105928w("MicroMsg.PinResDownloaderCore", "skip resume onCallback for low energy: doze mode on!");
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        ((C118904l) C86312j.m106911c(cls)).mo76561bO(84);
                    }
                }
                ((C119157j) C119157j.f356862d).mo183876g(new C115906s(), "PostTaskCheckResume-Check");
            }
            return false;
        }
    };

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.PinResDownloaderCore$a */
    public class C115897a extends C29060q.C29061a {
        public C115897a(PinResDownloaderCore pinResDownloaderCore) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNetworkChange(int r6) {
            /*
                r5 = this;
                java.lang.Class<xv.l> r6 = p757xv.C118904l.class
                java.lang.Class<xv.j> r0 = p757xv.C118903j.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                xv.j r0 = (p757xv.C118903j) r0
                r1 = 84
                boolean r0 = r0.mo76562e2(r1)
                if (r0 == 0) goto L_0x0062
                be.b r0 = p933be.C113159b.m154842h()
                be.b$c r0 = r0.mo165664a()
                di3.d r2 = di3.C86312j.m106911c(r6)
                xv.l r2 = (p757xv.C118904l) r2
                r3 = 60001(0xea61, float:8.408E-41)
                r2.So0(r3, r0)
                r2 = 0
                java.lang.Class<xv.k> r3 = p757xv.C91346k.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                xv.k r3 = (p757xv.C91346k) r3
                boolean r3 = r3.mo125330QL()
                java.lang.String r4 = "MicroMsg.PinResDownloaderCore"
                if (r3 == 0) goto L_0x003e
                java.lang.String r0 = "skip resume onNetworkChange for low energy: doze mode on!"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
                goto L_0x0056
            L_0x003e:
                boolean r3 = p933be.C113159b.m154843i()
                if (r3 == 0) goto L_0x0057
                boolean r3 = r0.mo165679d()
                if (r3 != 0) goto L_0x0057
                boolean r0 = r0.mo165678c()
                if (r0 != 0) goto L_0x0057
                java.lang.String r0 = "skip resume onNetworkChange for low energy: bg & non-charging!"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            L_0x0056:
                r2 = 1
            L_0x0057:
                if (r2 == 0) goto L_0x0062
                di3.d r6 = di3.C86312j.m106911c(r6)
                xv.l r6 = (p757xv.C118904l) r6
                r6.mo76561bO(r1)
            L_0x0062:
                zt3.t r6 = zt3.C119157j.f356862d
                com.tencent.mm.pluginsdk.res.downloader.model.s r0 = new com.tencent.mm.pluginsdk.res.downloader.model.s
                r0.<init>()
                zt3.j r6 = (zt3.C119157j) r6
                java.lang.String r1 = "PostTaskCheckResume-Check"
                r6.mo183876g(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.res.downloader.model.PinResDownloaderCore.C115897a.onNetworkChange(int):void");
        }
    }

    static {
        new PinResDownloaderCore();
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        for (C115900h T5 : C115912u.m163042a()) {
            T5.mo176412T5();
        }
        C86709a0.m107529k().mo121126a(this.f347758d);
        this.f347759e.alive();
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C86709a0.m107529k().mo121129d(this.f347758d);
        this.f347759e.dead();
        for (C115900h l : C115912u.m163042a()) {
            l.mo176414l();
        }
    }
}
