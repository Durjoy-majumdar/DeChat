package com.tencent.p014mm.plugin.game.model;

import android.os.Bundle;
import com.tencent.p014mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.plugin.game.luggage.C41985r;
import com.tencent.p014mm.plugin.game.luggage.page.C41962j;
import com.tencent.p014mm.sdk.platformtools.Log;
import p578js.C108769b;
import p828wa.C53133t;

/* renamed from: com.tencent.mm.plugin.game.model.b1 */
public class C42041b1 implements C108769b.C46571a {

    /* renamed from: a */
    public final /* synthetic */ String f113274a;

    /* renamed from: b */
    public final /* synthetic */ GameWebPerformanceInfo f113275b;

    /* renamed from: c */
    public final /* synthetic */ C1256g f113276c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f113277d;

    /* renamed from: com.tencent.mm.plugin.game.model.b1$a */
    public class C42042a implements Runnable {
        public C42042a() {
        }

        public void run() {
            C53133t c = C41985r.m45635c(C42041b1.this.f113274a);
            if (c != null) {
                ((C41962j) c.mo73819g()).setBlockNetworkImage(true);
                ((C41962j) c.mo73819g()).onPause();
            }
            C42041b1.this.f113275b.f108371x = System.currentTimeMillis();
            C42041b1 b1Var = C42041b1.this;
            C1256g gVar = b1Var.f113276c;
            Bundle bundle = b1Var.f113277d;
            String str = NotifyGameWebviewOperationListener.f113220h;
            if (gVar != null) {
                gVar.mo894a(bundle);
            }
        }
    }

    public C42041b1(String str, GameWebPerformanceInfo gameWebPerformanceInfo, C1256g gVar, Bundle bundle) {
        this.f113274a = str;
        this.f113275b = gameWebPerformanceInfo;
        this.f113276c = gVar;
        this.f113277d = bundle;
    }

    public void callback() {
        Log.m105925i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preLoadWePkgAndWebCore end, time = %d", Long.valueOf(System.currentTimeMillis()));
        C40319a0.m43495c(true, new C42042a());
    }
}
