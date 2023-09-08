package com.tencent.p014mm.plugin.game.model;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.game.model.NotifyGameWebviewOperationListener;

/* renamed from: com.tencent.mm.plugin.game.model.c1 */
public class C42045c1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f113286d;

    /* renamed from: e */
    public final /* synthetic */ boolean f113287e;

    /* renamed from: f */
    public final /* synthetic */ C1256g f113288f;

    public C42045c1(NotifyGameWebviewOperationListener.C42032f fVar, Bundle bundle, boolean z, C1256g gVar) {
        this.f113286d = bundle;
        this.f113287e = z;
        this.f113288f = gVar;
    }

    public void run() {
        NotifyGameWebviewOperationListener.m45682e(this.f113286d, this.f113287e, this.f113288f);
    }
}
