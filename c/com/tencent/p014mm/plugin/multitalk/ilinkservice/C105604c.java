package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.model.C105806i0;
import com.tencent.p014mm.plugin.multitalk.model.C105853x;
import com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import v82.C111452h1;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.c */
public class C105604c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105689s f314069d;

    /* renamed from: e */
    public final /* synthetic */ C105608d f314070e;

    public C105604c(C105608d dVar, C105689s sVar) {
        this.f314070e = dVar;
        this.f314069d = sVar;
    }

    public void run() {
        if (this.f314070e.f314075a != null) {
            Log.m105924i("MicroMsg.Multitalk.ILink2MtCallBack", "onInviteOrAcceptTimeout");
            MultiTalkGroup a = this.f314070e.mo150488a(this.f314069d);
            MultiTalkManager multiTalkManager = this.f314070e.f314075a;
            multiTalkManager.getClass();
            C105853x.m142235f(2, C105806i0.m142152e(a));
            multiTalkManager.mo150667j(a, C111452h1.Inviting, false, true, true, false);
        }
    }
}
