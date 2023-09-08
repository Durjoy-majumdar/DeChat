package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.tencent.liteav.base.util.C17118l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;

/* renamed from: com.tencent.liteav.videoproducer.encoder.a */
public final class C17465a {

    /* renamed from: a */
    public final VideoEncoderDef.EncodeAbility f47406a;

    /* renamed from: b */
    private final C17118l f47407b;

    /* renamed from: com.tencent.liteav.videoproducer.encoder.a$a */
    public static class C17466a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C17465a f47408a = new C17465a((byte) 0);
    }

    public /* synthetic */ C17465a(byte b) {
        this();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = new com.tencent.liteav.base.storage.PersistStorage(com.tencent.liteav.base.storage.PersistStorage.GLOBAL_DOMAIN).getInt("Liteav.Video.android.local.encoder.enable.hw.hevc");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m17554a() {
        /*
            boolean r0 = com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig.isHWHevcEncodeAllowed()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            com.tencent.liteav.base.storage.PersistStorage r0 = new com.tencent.liteav.base.storage.PersistStorage
            java.lang.String r2 = "com.liteav.storage.global"
            r0.<init>(r2)
            java.lang.String r2 = "Liteav.Video.android.local.encoder.enable.hw.hevc"
            java.lang.Integer r0 = r0.getInt(r2)
            if (r0 == 0) goto L_0x001f
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x001f
            r0 = 1
            return r0
        L_0x001f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.encoder.C17465a.m17554a():boolean");
    }

    /* renamed from: b */
    public static boolean m17555b() {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        try {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
                if (mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            continue;
                            break;
                        }
                        String str = supportedTypes[i];
                        if (str.contains("video/hevc")) {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            if (capabilitiesForType == null || (videoCapabilities = capabilitiesForType.getVideoCapabilities()) == null) {
                                return false;
                            }
                            if (videoCapabilities.areSizeAndRateSupported(1080, 1920, 30.0d) && videoCapabilities.areSizeAndRateSupported(1920, 1080, 30.0d)) {
                                LiteavLog.m16902i("EncodeAbilityProvider", "got hevc encoder:%s, type:%s", mediaCodecInfo.getName(), str);
                                return true;
                            }
                        } else {
                            i++;
                        }
                    }
                }
            }
            LiteavLog.m16905w("EncodeAbilityProvider", "not got hevc encoder");
        } catch (Exception e) {
            LiteavLog.m16899e("EncodeAbilityProvider", "Meidacodec error:", (Throwable) e);
        }
        return false;
    }

    private C17465a() {
        VideoEncoderDef.EncodeAbility encodeAbility = new VideoEncoderDef.EncodeAbility();
        this.f47406a = encodeAbility;
        C17118l lVar = new C17118l();
        this.f47407b = lVar;
        lVar.mo19369a(C17495b.m17637a(this));
        synchronized (this) {
            encodeAbility.f47379c = m17554a();
        }
    }
}
