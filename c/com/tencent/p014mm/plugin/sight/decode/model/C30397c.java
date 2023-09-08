package com.tencent.p014mm.plugin.sight.decode.model;

import com.tencent.p014mm.feature.sight.api.ISightJNIService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;

/* renamed from: com.tencent.mm.plugin.sight.decode.model.c */
public class C30397c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f81993d;

    /* renamed from: e */
    public final /* synthetic */ SightPlayController f81994e;

    public C30397c(SightPlayController sightPlayController, int i) {
        this.f81994e = sightPlayController;
        this.f81993d = i;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        ((ISightJNIService) C86312j.m106911c(ISightJNIService.class)).freeObj(this.f81993d);
        Log.m105919d("MicroMsg.SightPlayController", "#0x%x tick: do clear video %d, use %d ms", Integer.valueOf(this.f81994e.hashCode()), Integer.valueOf(this.f81993d), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
