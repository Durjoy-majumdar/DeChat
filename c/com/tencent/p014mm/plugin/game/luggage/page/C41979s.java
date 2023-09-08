package com.tencent.p014mm.plugin.game.luggage.page;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.s */
public class C41979s implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ long f113081a;

    /* renamed from: b */
    public final /* synthetic */ GameWebPage f113082b;

    public C41979s(GameWebPage gameWebPage, long j) {
        this.f113082b = gameWebPage;
        this.f113081a = j;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        Log.m105925i("MicroMsg.GameWebPage", "execute game_performance.js costtime:%d", Long.valueOf(System.currentTimeMillis() - this.f113081a));
        this.f113082b.f117925P.post(new C41978r(this));
    }
}
