package com.tencent.p014mm.plugin.game.luggage.page;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wepkg.event.C44477b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p828wa.C53104i;
import p828wa.C53106j;
import p828wa.C53115k;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.p */
public class C41974p extends C44477b {

    /* renamed from: a */
    public final /* synthetic */ GameWebPage f113076a;

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.p$a */
    public class C41975a implements Runnable {
        public C41975a() {
        }

        public void run() {
            GameWebPage gameWebPage = C41974p.this.f113076a;
            int i = GameWebPage.f112952E1;
            gameWebPage.getClass();
            FrameLayout frameLayout = new FrameLayout(gameWebPage.f148196d);
            gameWebPage.f112969o1 = frameLayout;
            frameLayout.setBackgroundColor(0);
            gameWebPage.f112969o1.setClickable(true);
            gameWebPage.f117949s.addView(gameWebPage.f112969o1, new FrameLayout.LayoutParams(-1, -1));
            gameWebPage.f112969o1.addView(LayoutInflater.from(gameWebPage.f148196d).inflate(C0966R.C0971layout.f359861b80, gameWebPage.f117949s, false), new FrameLayout.LayoutParams(-2, -2, 17));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.p$b */
    public class C41976b implements Runnable {
        public C41976b() {
        }

        public void run() {
            GameWebPage gameWebPage = C41974p.this.f113076a;
            if (gameWebPage.f112970p1) {
                gameWebPage.f112970p1 = false;
                if (!((Activity) gameWebPage.f148196d).isFinishing()) {
                    GameWebPage gameWebPage2 = C41974p.this.f113076a;
                    gameWebPage2.f112971q1 = true;
                    C53106j jVar = C53106j.this;
                    String t = gameWebPage2.mo67941t();
                    Bundle bundle = C41974p.this.f113076a.f148261n;
                    C53104i a = jVar.f148207g.mo65728a(t, bundle);
                    if (a == null) {
                        Log.m105921e("LuggagePageContainer", "No page specified for url %s", t);
                        return;
                    }
                    a.mo65794c(t, bundle);
                    jVar.f148203c.postDelayed(new C53115k(jVar, a), 500);
                }
            }
        }
    }

    public C41974p(GameWebPage gameWebPage) {
        this.f113076a = gameWebPage;
    }

    /* renamed from: a */
    public void mo65875a(String str) {
        GameWebPage gameWebPage = this.f113076a;
        gameWebPage.f112970p1 = true;
        gameWebPage.f117925P.postDelayed(new C41975a(), 500);
    }

    /* renamed from: b */
    public void mo65876b(boolean z) {
        Log.m105924i("MicroMsg.GameWebPage", "onPkgReady");
        this.f113076a.f117925P.post(new C41976b());
    }

    /* renamed from: c */
    public void mo65877c() {
        C41962j jVar = (C41962j) this.f113076a.f148259i.mo73819g();
        if (!Util.isNullOrNil(jVar.f113037E)) {
            jVar.post(new C41968k(jVar));
        }
    }
}
