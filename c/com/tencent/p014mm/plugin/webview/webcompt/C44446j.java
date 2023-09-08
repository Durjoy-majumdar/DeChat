package com.tencent.p014mm.plugin.webview.webcompt;

import android.os.PowerManager;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.plugin.webview.webcompt.C44408c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.j */
public final class C44446j extends C114668z.C104589a {

    /* renamed from: d */
    public boolean f120541d;

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.j$a */
    public static final class C44447a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C44446j f120542d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44447a(C44446j jVar) {
            super(0);
            this.f120542d = jVar;
        }

        public Object invoke() {
            if (!this.f120542d.f120541d) {
                Object systemService = MMApplicationContext.getContext().getSystemService("power");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                if (!((PowerManager) systemService).isInteractive() || !Util.isTopApplication(MMApplicationContext.getContext())) {
                    C44408c.C44410b bVar = C44408c.f120395e;
                    bVar.getClass();
                    Log.m105924i(C44408c.f120397g, "jsEngine pause");
                    this.f120542d.f120541d = true;
                    C44408c.C44410b.m48781b(bVar).pause();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.j$b */
    public static final class C44448b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C44446j f120543d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44448b(C44446j jVar) {
            super(0);
            this.f120543d = jVar;
        }

        public Object invoke() {
            if (this.f120543d.f120541d) {
                C44408c.C44410b bVar = C44408c.f120395e;
                bVar.getClass();
                Log.m105924i(C44408c.f120397g, "jsEngine resume");
                this.f120543d.f120541d = false;
                C44408c.C44410b.m48781b(bVar).resume();
            }
            return C13598b0.f38549a;
        }
    }

    public void onAppBackground(String str) {
        C61926c.m72666K(10000, new C44447a(this));
    }

    public void onAppForeground(String str) {
        C61926c.m72668M(new C44448b(this));
    }
}
