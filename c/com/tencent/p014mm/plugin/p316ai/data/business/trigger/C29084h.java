package com.tencent.p014mm.plugin.p316ai.data.business.trigger;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.p316ai.data.business.trigger.edge.DiscoverExposeEdgeTrigger;
import com.tencent.p014mm.plugin.p316ai.data.business.trigger.edge.FinderGotTabTipsEdgeTrigger;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import java.util.HashSet;
import java.util.Iterator;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.h */
public class C29084h extends C86301e {

    /* renamed from: d */
    public final HashSet<C29082e> f79649d = new HashSet<>();

    public void onAccountInitialized(Context context) {
        Log.m105924i("MicroMsg.TriggerManager", "TriggerManager onAccountInitialized");
        Iterator<C29082e> it = this.f79649d.iterator();
        while (it.hasNext()) {
            it.next().mo22060a();
        }
    }

    public void onAccountReleased(Context context) {
        Log.m105924i("MicroMsg.TriggerManager", "TriggerManager onAccountReleased");
        Iterator<C29082e> it = this.f79649d.iterator();
        while (it.hasNext()) {
            it.next().mo22061b();
        }
    }

    public void onCreate(Context context) {
        Log.m105924i("MicroMsg.TriggerManager", "TriggerManager oncreate");
        this.f79649d.add(new FinderTrigger());
        this.f79649d.add(new FindMoreFriendsUIReporter());
        this.f79649d.add(new NearLiveTrigger());
        this.f79649d.add(new LiveNotifyMsgTrigger());
        this.f79649d.add(new SessionChangeTrigger());
        this.f79649d.add(new DiscoverExposeEdgeTrigger());
        this.f79649d.add(new FinderGotTabTipsEdgeTrigger());
    }
}
