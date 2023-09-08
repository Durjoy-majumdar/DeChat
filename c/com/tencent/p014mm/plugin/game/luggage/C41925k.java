package com.tencent.p014mm.plugin.game.luggage;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.tencent.mm.plugin.game.luggage.k */
public class C41925k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f112933d;

    /* renamed from: e */
    public final /* synthetic */ View f112934e;

    /* renamed from: f */
    public final /* synthetic */ String f112935f;

    /* renamed from: g */
    public final /* synthetic */ LuggageGameWebViewUI f112936g;

    public C41925k(LuggageGameWebViewUI luggageGameWebViewUI, View view, View view2, String str) {
        this.f112936g = luggageGameWebViewUI;
        this.f112933d = view;
        this.f112934e = view2;
        this.f112935f = str;
    }

    public void run() {
        ((FrameLayout) this.f112933d).addView(this.f112934e);
        this.f112936g.f112864h.put(this.f112935f, this.f112934e);
    }
}
