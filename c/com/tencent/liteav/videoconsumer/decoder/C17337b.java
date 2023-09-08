package com.tencent.liteav.videoconsumer.decoder;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import com.tencent.liteav.base.util.C17118l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.b */
public final class C17337b {

    /* renamed from: a */
    public final VideoDecoderDef.DecodeAbility f46983a;

    /* renamed from: b */
    private final C17118l f46984b;

    /* renamed from: com.tencent.liteav.videoconsumer.decoder.b$a */
    public static class C17338a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C17337b f46985a = new C17337b((byte) 0);
    }

    public /* synthetic */ C17337b(byte b) {
        this();
    }

    /* renamed from: a */
    public static boolean m17267a() {
        return m17268b() || ExternalDecodeFactoryManager.m17221a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = new com.tencent.liteav.base.storage.PersistStorage(com.tencent.liteav.base.storage.PersistStorage.GLOBAL_DOMAIN).getInt("Liteav.Video.android.local.decoder.enable.hw.hevc");
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m17268b() {
        /*
            boolean r0 = com.tencent.liteav.videoconsumer.consumer.ServerVideoConsumerConfig.isHWHevcDecodeAllowed()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            com.tencent.liteav.base.storage.PersistStorage r0 = new com.tencent.liteav.base.storage.PersistStorage
            java.lang.String r2 = "com.liteav.storage.global"
            r0.<init>(r2)
            java.lang.String r2 = "Liteav.Video.android.local.decoder.enable.hw.hevc"
            java.lang.Integer r0 = r0.getInt(r2)
            if (r0 == 0) goto L_0x001f
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x001f
            r0 = 1
            return r0
        L_0x001f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoconsumer.decoder.C17337b.m17268b():boolean");
    }

    /* renamed from: c */
    public static boolean m17269c() {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z = false;
        try {
            MediaCodecList mediaCodecList = new MediaCodecList(0);
            MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
            int length = codecInfos.length;
            int i = 0;
            boolean z2 = false;
            while (i < length) {
                try {
                    MediaCodecInfo mediaCodecInfo = codecInfos[i];
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    if (!mediaCodecInfo.isEncoder()) {
                        int length2 = supportedTypes.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length2) {
                                break;
                            }
                            String str = supportedTypes[i2];
                            if (str.contains("video/hevc")) {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                if (capabilitiesForType != null && (videoCapabilities = capabilitiesForType.getVideoCapabilities()) != null) {
                                    boolean areSizeAndRateSupported = videoCapabilities.areSizeAndRateSupported(1080, 1920, 30.0d);
                                    boolean areSizeAndRateSupported2 = videoCapabilities.areSizeAndRateSupported(1920, 1080, 30.0d);
                                    LiteavLog.m16902i("DecodeAbilityProvider", "got hevc decoder:%s, type:%s, supportPort= %b,supportLand=%b", mediaCodecInfo.getName(), str, Boolean.valueOf(areSizeAndRateSupported), Boolean.valueOf(areSizeAndRateSupported2));
                                    if (!areSizeAndRateSupported2 || !areSizeAndRateSupported) {
                                        MediaFormat mediaFormat = null;
                                        if (areSizeAndRateSupported2 || areSizeAndRateSupported) {
                                            if (!areSizeAndRateSupported2) {
                                                mediaFormat = MediaFormat.createVideoFormat("video/hevc", 1920, 1080);
                                            } else if (!areSizeAndRateSupported) {
                                                mediaFormat = MediaFormat.createVideoFormat("video/hevc", 1080, 1920);
                                            }
                                        }
                                        if (mediaFormat != null) {
                                            String findDecoderForFormat = mediaCodecList.findDecoderForFormat(mediaFormat);
                                            LiteavLog.m16902i("DecodeAbilityProvider", "findDecoderForFormat hevc decodername:%s", findDecoderForFormat);
                                            if (findDecoderForFormat != null) {
                                            }
                                        }
                                    }
                                    z2 = true;
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                    i++;
                } catch (Exception e) {
                    e = e;
                    z = z2;
                    LiteavLog.m16899e("DecodeAbilityProvider", "Meidacodec error:", (Throwable) e);
                    return z;
                }
            }
            LiteavLog.m16901i("DecodeAbilityProvider", "support hevc decoder:".concat(String.valueOf(z2)));
            return z2;
        } catch (Exception e2) {
            e = e2;
            LiteavLog.m16899e("DecodeAbilityProvider", "Meidacodec error:", (Throwable) e);
            return z;
        }
    }

    private C17337b() {
        VideoDecoderDef.DecodeAbility decodeAbility = new VideoDecoderDef.DecodeAbility();
        this.f46983a = decodeAbility;
        C17118l lVar = new C17118l();
        this.f46984b = lVar;
        lVar.mo19369a(C17339c.m17271a(this));
        synchronized (this) {
            decodeAbility.f46928c = m17267a();
        }
    }
}
