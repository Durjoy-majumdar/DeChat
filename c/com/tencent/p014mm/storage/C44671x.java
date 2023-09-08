package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import kj2.C117407d;

/* renamed from: com.tencent.mm.storage.x */
public final class C44671x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f121102d;

    public C44671x(String str) {
        this.f121102d = str;
    }

    public final void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("replaceAdData replace lastTraceId=");
        C19627t tVar = C19627t.f55586a;
        sb.append(C19627t.f55593h);
        Log.m105918d("MicroMsg.BizCardLogic", sb.toString());
        C117407d.INSTANCE.mo182089r(1454, 156, 1);
        tVar.mo25822D(this.f121102d);
    }
}
