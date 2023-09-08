package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.view.View;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabData2;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.m */
public class C42300m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f114378d;

    /* renamed from: e */
    public final /* synthetic */ GameTabWidget2 f114379e;

    public C42300m(GameTabWidget2 gameTabWidget2, String str) {
        this.f114379e = gameTabWidget2;
        this.f114378d = str;
    }

    public void run() {
        if (!Util.isNullOrNil(this.f114378d)) {
            Iterator it = ((ArrayList) this.f114379e.f114300n).iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view != null && (view.getTag() instanceof GameTabData2.TabItem) && this.f114378d.equals(((GameTabData2.TabItem) view.getTag()).f114267d)) {
                    view.performClick();
                    return;
                }
            }
        }
    }
}
