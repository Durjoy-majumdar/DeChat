package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105165o;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import n11.C109669c;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.i0 */
public class C105150i0 implements C105165o.C105166a {

    /* renamed from: a */
    public final /* synthetic */ C105181w f312218a;

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.i0$a */
    public class C105151a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f312219d;

        public C105151a(ArrayList arrayList) {
            this.f312219d = arrayList;
        }

        public void run() {
            C105181w wVar = C105150i0.this.f312218a;
            if (wVar.f312381n != C105181w.C85161i.InRoom) {
                Log.m105928w("MicroMsg.OpenVoice.OpenVoiceService", "hy: onSpeakerListChanged but not in room!");
                return;
            }
            C85147b<ArrayList<C109669c>> bVar = wVar.f312394y;
            if (bVar != null) {
                bVar.mo118169a(0, 0, "on talklist change", this.f312219d);
            }
        }
    }

    public C105150i0(C105181w wVar) {
        this.f312218a = wVar;
    }

    /* renamed from: a */
    public void mo149470a(ArrayList<C109669c> arrayList) {
        Log.m105927v("MicroMsg.OpenVoice.OpenVoiceService", "hy: current talking members are %s", arrayList);
        this.f312218a.mo149500g(new C105151a(arrayList));
    }
}
