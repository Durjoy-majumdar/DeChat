package com.tencent.p014mm.p136ui.conversation.banner;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.InitEndEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.conversation.banner.TryNewInitBanner$1 */
class TryNewInitBanner$1 extends IListener<InitEndEvent> {

    /* renamed from: d */
    public final /* synthetic */ C30849l0 f82868d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TryNewInitBanner$1(C30849l0 l0Var, C0125s sVar) {
        super(sVar);
        this.f82868d = l0Var;
        this.__eventId = -1671484961;
    }

    public boolean callback(IEvent iEvent) {
        if (((InitEndEvent) iEvent).f78840d.f78841a) {
            C30849l0 l0Var = this.f82868d;
            l0Var.f82872n = false;
            l0Var.mo7970e();
        } else {
            Log.m105925i("MicroMsg.TryNewInitBanner", "summerinit onSceneEnd -1 show tryNewInitBanner[%s]", this.f82868d);
            C30849l0 l0Var2 = this.f82868d;
            l0Var2.f82872n = true;
            l0Var2.mo7970e();
        }
        return false;
    }
}
