package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.StartNearbyFromLauncherRecentsListEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WAMainFrameEnterHistoryListExposeStruct;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.RecentsReporter$1 */
class RecentsReporter$1 extends IListener<StartNearbyFromLauncherRecentsListEvent> {

    /* renamed from: d */
    public final /* synthetic */ C84635h0 f246901d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentsReporter$1(C84635h0 h0Var, C0125s sVar) {
        super(sVar);
        this.f246901d = h0Var;
        this.__eventId = 665515391;
    }

    public boolean callback(IEvent iEvent) {
        StartNearbyFromLauncherRecentsListEvent startNearbyFromLauncherRecentsListEvent = (StartNearbyFromLauncherRecentsListEvent) iEvent;
        WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct = this.f246901d.f246936d;
        if (wAMainFrameEnterHistoryListExposeStruct == null || wAMainFrameEnterHistoryListExposeStruct.f236471f > 0) {
            return false;
        }
        wAMainFrameEnterHistoryListExposeStruct.f236471f = 3;
        return false;
    }
}
