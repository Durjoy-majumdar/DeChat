package com.tencent.p014mm.plugin.game;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import sw1.C48478n;

/* renamed from: com.tencent.mm.plugin.game.v$$a */
public final /* synthetic */ class v$$a implements Runnable {
    public final void run() {
        try {
            ((C48478n) C86312j.m106911c(C48478n.class)).mo65689kS();
            Log.m105924i("MicroMsg.PluginGame", "clearExpiredMiniGameVideo done");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.PluginGame", e, "", new Object[0]);
        }
    }
}
