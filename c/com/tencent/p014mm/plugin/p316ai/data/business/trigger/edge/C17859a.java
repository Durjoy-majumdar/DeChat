package com.tencent.p014mm.plugin.p316ai.data.business.trigger.edge;

import com.tencent.p014mm.autogen.events.EnterFindMoreFriendsUIEvent;
import com.tencent.p014mm.plugin.p316ai.data.business.trigger.edge.DiscoverExposeEdgeTrigger;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.edge.a */
public class C17859a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EnterFindMoreFriendsUIEvent f49232d;

    /* renamed from: e */
    public final /* synthetic */ DiscoverExposeEdgeTrigger.C178561 f49233e;

    public C17859a(DiscoverExposeEdgeTrigger.C178561 r1, EnterFindMoreFriendsUIEvent enterFindMoreFriendsUIEvent) {
        this.f49233e = r1;
        this.f49232d = enterFindMoreFriendsUIEvent;
    }

    public void run() {
        try {
            DiscoverExposeEdgeTrigger.this.mo112994i(this.f49232d);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.DiscoverExposeEdgeTrigger", e, "discover expose edge trigger error.", new Object[0]);
        }
    }
}
