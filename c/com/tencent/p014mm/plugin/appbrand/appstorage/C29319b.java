package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.b */
public final class C29319b {

    /* renamed from: a */
    public static final C29319b f80050a;

    /* renamed from: b */
    public static volatile boolean f80051b;

    /* renamed from: c */
    public static volatile int f80052c;

    static {
        C29319b bVar = new C29319b();
        f80050a = bVar;
        bVar.mo56587a();
    }

    /* renamed from: a */
    public final synchronized void mo56587a() {
        Log.m105924i("MicroMsg.AppBrandEncryptKVStorageTransferABTest", "[load]");
        boolean z = false;
        f80052c = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_storag_mmkv_transfer_to_encrypt_mmkv, 0);
        if (f80052c != 0) {
            z = true;
        }
        f80051b = z;
        Log.m105924i("MicroMsg.AppBrandEncryptKVStorageTransferABTest", "[load] isNeedTransfer=" + f80051b + "  phases=" + f80052c);
    }
}
