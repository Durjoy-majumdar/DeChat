package com.tencent.p014mm.plugin.normsg;

import android.os.Bundle;
import com.tencent.p014mm.plugin.normsg.C115634f;
import com.tencent.p014mm.sdk.platformtools.Log;
import jm2.C117361f;

/* renamed from: com.tencent.mm.plugin.normsg.h */
public class C30323h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f81854d;

    public C30323h(C115634f.C30322f fVar, Bundle bundle) {
        this.f81854d = bundle;
    }

    public void run() {
        Log.m105924i("MicroMsg.NormsgSourceImpl", "run wkat");
        C117361f.INSTANCE.mo182026MB(this.f81854d.getByteArray("WKWAR"));
    }
}
