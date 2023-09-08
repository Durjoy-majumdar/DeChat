package com.tencent.p014mm.plugin.flash;

import au1.C0222b;
import com.tencent.p014mm.plugin.flash.C105349l;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.flash.g$$a */
public final /* synthetic */ class g$$a implements C105349l.C4396e {

    /* renamed from: a */
    public final /* synthetic */ C4389g f19033a;

    public /* synthetic */ g$$a(C4389g gVar) {
        this.f19033a = gVar;
    }

    /* renamed from: a */
    public final void mo5233a(Boolean bool, C105349l lVar) {
        C4389g gVar = this.f19033a;
        gVar.getClass();
        if (!bool.booleanValue()) {
            Log.m105920e("MicroMsg.FaceFlashManagerError", "camera start preview failed");
            C0222b.m173l("openCamera", -1);
            C0222b.m163b().f9686B = 1;
            gVar.f19032g.f19036c.mo5240K7(90038, "open camera failed");
        }
    }
}
