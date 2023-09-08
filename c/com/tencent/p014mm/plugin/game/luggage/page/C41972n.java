package com.tencent.p014mm.plugin.game.luggage.page;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.webview.luggage.C5872b0;
import java.util.HashMap;
import p828wa.C53133t;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.n */
public class C41972n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f113063d;

    /* renamed from: e */
    public final /* synthetic */ String f113064e;

    /* renamed from: f */
    public final /* synthetic */ int f113065f;

    /* renamed from: g */
    public final /* synthetic */ int f113066g;

    /* renamed from: h */
    public final /* synthetic */ int f113067h;

    /* renamed from: i */
    public final /* synthetic */ int f113068i;

    /* renamed from: j */
    public final /* synthetic */ GameWebPage f113069j;

    public C41972n(GameWebPage gameWebPage, String str, String str2, int i, int i2, int i3, int i4) {
        this.f113069j = gameWebPage;
        this.f113063d = str;
        this.f113064e = str2;
        this.f113065f = i;
        this.f113066g = i2;
        this.f113067h = i3;
        this.f113068i = i4;
    }

    public void run() {
        GameWebPage gameWebPage = this.f113069j;
        gameWebPage.f117925P.post(new C5872b0(gameWebPage));
        this.f113069j.mo65806x();
        Bundle bundle = new Bundle();
        bundle.putAll(this.f113069j.f148261n);
        bundle.putString("rawUrl", this.f113063d);
        C41943b bVar = new C41943b(this.f113069j.f148198f, (C53133t) null, bundle);
        ((HashMap) this.f113069j.f112968n1).put(this.f113064e, bVar);
        this.f113069j.f117913C.addView(bVar.f148258h, new FrameLayout.LayoutParams(this.f113065f, this.f113066g));
        bVar.f148258h.setX(((float) this.f113067h) + this.f113069j.f117913C.getX());
        bVar.f148258h.setY(((float) this.f113068i) + this.f113069j.f117913C.getY());
        bVar.f117951u.setVisibility(8);
        bVar.f117925P.post(new C5872b0(bVar));
        bVar.mo65794c(this.f113063d, bundle);
    }
}
