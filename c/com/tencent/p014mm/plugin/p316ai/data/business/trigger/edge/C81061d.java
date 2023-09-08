package com.tencent.p014mm.plugin.p316ai.data.business.trigger.edge;

import com.tencent.p014mm.autogen.events.FinderSyncGotTabTipsEvent;
import com.tencent.p014mm.plugin.p316ai.data.business.trigger.edge.FinderGotTabTipsEdgeTrigger;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.edge.d */
public class C81061d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderSyncGotTabTipsEvent f238094d;

    /* renamed from: e */
    public final /* synthetic */ FinderGotTabTipsEdgeTrigger.C178582 f238095e;

    public C81061d(FinderGotTabTipsEdgeTrigger.C178582 r1, FinderSyncGotTabTipsEvent finderSyncGotTabTipsEvent) {
        this.f238095e = r1;
        this.f238094d = finderSyncGotTabTipsEvent;
    }

    public void run() {
        try {
            FinderGotTabTipsEdgeTrigger.this.mo112994i(this.f238094d);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FinderGotTabTipsEdgeTrigger", e, "Finder got red dot edge error.", new Object[0]);
        }
    }
}
