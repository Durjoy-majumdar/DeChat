package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabWidget2;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.l */
public class C42299l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameTabWidget2 f114377d;

    public C42299l(GameTabWidget2 gameTabWidget2) {
        this.f114377d = gameTabWidget2;
    }

    public void run() {
        GameTabWidget2.C42265b bVar = this.f114377d.f114294e;
        if (bVar != null) {
            bVar.notifyDataSetInvalidated();
        }
    }
}
