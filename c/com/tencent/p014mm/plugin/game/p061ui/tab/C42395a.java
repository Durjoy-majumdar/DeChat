package com.tencent.p014mm.plugin.game.p061ui.tab;

import com.tencent.p014mm.plugin.game.p061ui.tab.GameTabBridgeUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.game.ui.tab.a */
public class C42395a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameTabBridgeUI.C42387a f114687d;

    public C42395a(GameTabBridgeUI.C42387a aVar) {
        this.f114687d = aVar;
    }

    public void run() {
        Log.m105925i("MicroMsg.GameTabBridgeUI", "load tools process, web page load time:%d", Long.valueOf(System.currentTimeMillis() - this.f114687d.f114668d));
        if (GameTabWidget.f114683f == GameTabBridgeUI.this.hashCode()) {
            GameTabBridgeUI.C42387a aVar = this.f114687d;
            GameTabWidget.m46064d(GameTabBridgeUI.this, aVar.f114669e, false, true, true, false);
            return;
        }
        Log.m105925i("MicroMsg.GameTabBridgeUI", "GameTabWidget.mHashCode(%d) != hashCode(%d), dont need turn page!", Integer.valueOf(GameTabWidget.f114683f), Integer.valueOf(GameTabBridgeUI.this.hashCode()));
    }
}
