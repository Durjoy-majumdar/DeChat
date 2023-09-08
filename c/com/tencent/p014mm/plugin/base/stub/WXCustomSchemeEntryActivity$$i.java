package com.tencent.p014mm.plugin.base.stub;

import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C117747y;
import wc3.C90945m;

/* renamed from: com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$i */
public class WXCustomSchemeEntryActivity$$i implements C90945m.C53147h, C90945m.C90953i {

    /* renamed from: a */
    public final C90945m.C53147h f247912a;

    /* renamed from: b */
    public final Runnable f247913b;

    /* renamed from: c */
    public volatile boolean f247914c = false;

    public WXCustomSchemeEntryActivity$$i(C90945m.C53147h hVar, Runnable runnable) {
        this.f247912a = hVar;
        this.f247913b = runnable;
    }

    /* renamed from: a */
    public void mo118058a() {
        Log.m105924i("MicroMsg.CustomSchemeDeepLinkCallBack", "onDeepLinkDone");
        this.f247913b.run();
    }

    /* renamed from: b */
    public void mo118059b() {
        Log.m105924i("MicroMsg.CustomSchemeDeepLinkCallBack", "markDeepLinkDoneWillBeCallback");
        this.f247914c = true;
    }

    /* renamed from: c */
    public void mo62709c(int i, int i2, String str, C117747y yVar, boolean z) {
        Log.m105924i("MicroMsg.CustomSchemeDeepLinkCallBack", "onSceneEndCallback");
        this.f247912a.mo62709c(i, i2, str, yVar, z);
        if (!this.f247914c) {
            Log.m105924i("MicroMsg.CustomSchemeDeepLinkCallBack", "onDeepLinkDone#onSceneEndCallback");
            this.f247913b.run();
        }
    }
}
