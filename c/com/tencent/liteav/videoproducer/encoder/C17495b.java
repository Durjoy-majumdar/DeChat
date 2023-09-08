package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.base.storage.PersistStorage;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;

/* renamed from: com.tencent.liteav.videoproducer.encoder.b */
final /* synthetic */ class C17495b implements Runnable {

    /* renamed from: a */
    private final C17465a f47485a;

    private C17495b(C17465a aVar) {
        this.f47485a = aVar;
    }

    /* renamed from: a */
    public static Runnable m17637a(C17465a aVar) {
        return new C17495b(aVar);
    }

    public final void run() {
        C17465a aVar = this.f47485a;
        boolean z = false;
        boolean b = (ServerVideoProducerConfig.isHWHevcEncodeAllowed() && LiteavSystemInfo.getSystemOSVersionInt() >= 21) ? C17465a.m17555b() : false;
        PersistStorage persistStorage = new PersistStorage(PersistStorage.GLOBAL_DOMAIN);
        persistStorage.put("Liteav.Video.android.local.encoder.enable.hw.hevc", b ? 1 : 0);
        persistStorage.commit();
        synchronized (aVar) {
            VideoEncoderDef.EncodeAbility encodeAbility = aVar.f47406a;
            if (C17465a.m17554a()) {
                z = true;
            }
            encodeAbility.f47379c = z;
        }
    }
}
