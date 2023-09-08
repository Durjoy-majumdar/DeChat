package com.tencent.p014mm.p136ui.conversation.banner;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.NetworkDiagnoseResultEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.ui.conversation.banner.NetWarnBanner$1 */
class NetWarnBanner$1 extends IListener<NetworkDiagnoseResultEvent> {

    /* renamed from: d */
    public final /* synthetic */ C116083i0 f348358d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetWarnBanner$1(C116083i0 i0Var, C0125s sVar) {
        super(sVar);
        this.f348358d = i0Var;
        this.__eventId = 829538561;
    }

    public boolean callback(IEvent iEvent) {
        NetworkDiagnoseResultEvent networkDiagnoseResultEvent = (NetworkDiagnoseResultEvent) iEvent;
        boolean z = true;
        Log.m105927v("MicroMsg.NetWarnView", "diagnose callback, stage:%d, status:%d", Integer.valueOf(networkDiagnoseResultEvent.f343573d.f343575b), Integer.valueOf(networkDiagnoseResultEvent.f343573d.f343574a));
        NetworkDiagnoseResultEvent.C114680a aVar = networkDiagnoseResultEvent.f343573d;
        int i = aVar.f343575b;
        if (i == 0) {
            C116083i0 i0Var = this.f348358d;
            i0Var.f348381x = 33;
            if (aVar.f343574a != 0) {
                z = false;
            }
            i0Var.f348382y = z;
        } else if (i == 1) {
            C116083i0 i0Var2 = this.f348358d;
            i0Var2.f348381x = 66;
            if (aVar.f343574a != 0) {
                z = false;
            }
            i0Var2.f348383z = z;
        } else if (i == 2) {
            C116083i0 i0Var3 = this.f348358d;
            if (aVar.f343574a != 0) {
                z = false;
            }
            i0Var3.f348363A = z;
        }
        if (aVar.f343576c) {
            C116083i0 i0Var4 = this.f348358d;
            i0Var4.f348381x = 0;
            i0Var4.f348380w = 0;
            i0Var4.f348364B = aVar.f343577d;
            MTimerHandler mTimerHandler = i0Var4.f348365C;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
                i0Var4.f348365C = null;
            }
            MMHandlerThread.postToMainThread(new C116080f0(this));
        }
        MMHandlerThread.postToMainThread(new C116081g0(this));
        return false;
    }
}
