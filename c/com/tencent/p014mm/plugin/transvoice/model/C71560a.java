package com.tencent.p014mm.plugin.transvoice.model;

import com.tencent.p014mm.modelvoiceaddr.C92866b;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.transvoice.model.a */
public class C71560a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f207354d;

    /* renamed from: e */
    public final /* synthetic */ int f207355e;

    /* renamed from: f */
    public final /* synthetic */ int f207356f;

    /* renamed from: g */
    public final /* synthetic */ C71561b f207357g;

    public C71560a(C71561b bVar, int i, int i2, int i3) {
        this.f207357g = bVar;
        this.f207354d = i;
        this.f207355e = i2;
        this.f207356f = i3;
    }

    public void run() {
        Log.m105925i("MicroMsg.SceneVoiceInputAddr2", "error localCode = %s, errType = %s, errCode = %s.", Integer.valueOf(this.f207354d), Integer.valueOf(this.f207355e), Integer.valueOf(this.f207356f));
        C92866b.C68146d dVar = this.f207357g.f207360e;
        if (dVar != null) {
            dVar.mo21935c(this.f207354d, this.f207355e, this.f207356f, -1);
        }
        this.f207357g.mo98688b(false, true);
    }
}
