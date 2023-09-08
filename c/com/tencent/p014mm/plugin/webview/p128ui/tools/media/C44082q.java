package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86013q1;
import p243tn.C14050a;
import te3.C49399fa;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.q */
public final class C44082q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C49399fa f119429d;

    public C44082q(C49399fa faVar) {
        this.f119429d = faVar;
    }

    public final void run() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("MpShareVideoImage", 2);
        byte[] decodeBytes = mmkv.decodeBytes(this.f119429d.f133368f);
        String b = C14050a.m13405b(this.f119429d.f133370h);
        if (decodeBytes != null) {
            C86013q1.m106438T(b, decodeBytes, 0, decodeBytes.length);
        }
        mmkv.clearAll();
    }
}
