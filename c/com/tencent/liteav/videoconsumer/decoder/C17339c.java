package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.storage.PersistStorage;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.videoconsumer.consumer.ServerVideoConsumerConfig;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.c */
final /* synthetic */ class C17339c implements Runnable {

    /* renamed from: a */
    private final C17337b f46986a;

    private C17339c(C17337b bVar) {
        this.f46986a = bVar;
    }

    /* renamed from: a */
    public static Runnable m17271a(C17337b bVar) {
        return new C17339c(bVar);
    }

    public final void run() {
        C17337b bVar = this.f46986a;
        boolean z = false;
        if (ServerVideoConsumerConfig.isHWHevcDecodeAllowed() && LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
            z = C17337b.m17269c();
        }
        PersistStorage persistStorage = new PersistStorage(PersistStorage.GLOBAL_DOMAIN);
        persistStorage.put("Liteav.Video.android.local.decoder.enable.hw.hevc", z ? 1 : 0);
        persistStorage.commit();
        synchronized (bVar) {
            bVar.f46983a.f46928c = C17337b.m17267a();
        }
    }
}
