package com.tencent.p014mm.plugin.game.luggage;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.tencent.mm.plugin.game.luggage.l */
public class C41926l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f112937d;

    /* renamed from: e */
    public final /* synthetic */ String f112938e;

    /* renamed from: f */
    public final /* synthetic */ LuggageGameWebViewUI f112939f;

    public C41926l(LuggageGameWebViewUI luggageGameWebViewUI, View view, String str) {
        this.f112939f = luggageGameWebViewUI;
        this.f112937d = view;
        this.f112938e = str;
    }

    public void run() {
        ((FrameLayout) this.f112937d).removeView(this.f112939f.f112864h.get(this.f112938e));
        this.f112939f.f112864h.remove(this.f112938e);
    }
}
