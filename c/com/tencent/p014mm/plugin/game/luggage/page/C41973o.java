package com.tencent.p014mm.plugin.game.luggage.page;

import android.widget.FrameLayout;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.o */
public class C41973o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f113070d;

    /* renamed from: e */
    public final /* synthetic */ int f113071e;

    /* renamed from: f */
    public final /* synthetic */ int f113072f;

    /* renamed from: g */
    public final /* synthetic */ int f113073g;

    /* renamed from: h */
    public final /* synthetic */ int f113074h;

    /* renamed from: i */
    public final /* synthetic */ GameWebPage f113075i;

    public C41973o(GameWebPage gameWebPage, String str, int i, int i2, int i3, int i4) {
        this.f113075i = gameWebPage;
        this.f113070d = str;
        this.f113071e = i;
        this.f113072f = i2;
        this.f113073g = i3;
        this.f113074h = i4;
    }

    public void run() {
        C41943b bVar = (C41943b) ((HashMap) this.f113075i.f112968n1).get(this.f113070d);
        if (bVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bVar.f148258h.getLayoutParams();
            layoutParams.width = this.f113071e;
            layoutParams.height = this.f113072f;
            bVar.f148258h.setLayoutParams(layoutParams);
            bVar.f148258h.setX(((float) this.f113073g) + this.f113075i.f117913C.getX());
            bVar.f148258h.setY(((float) this.f113074h) + this.f113075i.f117913C.getY());
        }
    }
}
