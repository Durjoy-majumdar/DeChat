package com.tencent.p014mm.plugin.game.model;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.game.model.NotifyGameWebviewOperationListener;
import com.tencent.p014mm.plugin.wepkg.model.BaseWepkgProcessTask;
import com.tencent.p014mm.plugin.wepkg.model.C44488a;
import com.tencent.p014mm.plugin.wepkg.model.WepkgCrossProcessTask;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;

/* renamed from: com.tencent.mm.plugin.game.model.d1 */
public class C42048d1 extends C44488a {

    /* renamed from: b */
    public final /* synthetic */ Bundle f113290b;

    /* renamed from: c */
    public final /* synthetic */ boolean f113291c;

    /* renamed from: d */
    public final /* synthetic */ C1256g f113292d;

    /* renamed from: com.tencent.mm.plugin.game.model.d1$a */
    public class C42049a implements Runnable {
        public C42049a() {
        }

        public void run() {
            C42048d1 d1Var = C42048d1.this;
            NotifyGameWebviewOperationListener.m45682e(d1Var.f113290b, d1Var.f113291c, d1Var.f113292d);
        }
    }

    public C42048d1(NotifyGameWebviewOperationListener.C42032f fVar, Bundle bundle, boolean z, C1256g gVar) {
        this.f113290b = bundle;
        this.f113291c = z;
        this.f113292d = gVar;
    }

    /* renamed from: a */
    public void mo66027a(BaseWepkgProcessTask baseWepkgProcessTask) {
        if ((baseWepkgProcessTask instanceof WepkgCrossProcessTask) && baseWepkgProcessTask.f120608f) {
            WepkgCrossProcessTask wepkgCrossProcessTask = (WepkgCrossProcessTask) baseWepkgProcessTask;
            C44536d.m48918d().postToWorker(new C42049a());
        }
    }
}
