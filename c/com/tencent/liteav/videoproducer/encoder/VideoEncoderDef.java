package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaFormat;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.videobase.C17263h;

@JNINamespace("liteav::video")
public interface VideoEncoderDef {

    public enum BitrateMode {
        CBR(0),
        VBR(1),
        CQ(2);
        

        /* renamed from: d */
        private static final BitrateMode[] f47375d = null;
        public int mValue;

        /* access modifiers changed from: public */
        static {
            f47375d = values();
        }

        private BitrateMode(int i) {
            this.mValue = i;
        }

        /* renamed from: a */
        public static BitrateMode m17550a(int i) {
            for (BitrateMode bitrateMode : f47375d) {
                if (i == bitrateMode.mValue) {
                    return bitrateMode;
                }
            }
            return VBR;
        }
    }

    public static class EncodeAbility {

        /* renamed from: a */
        public boolean f47377a = true;

        /* renamed from: b */
        public boolean f47378b = false;

        /* renamed from: c */
        public boolean f47379c = false;

        public boolean isSupportHEVC() {
            return this.f47379c;
        }

        public boolean isSupportRPS() {
            return this.f47377a;
        }

        public boolean isSupportSVC() {
            return this.f47378b;
        }
    }

    public enum EncodeStrategy {
        PREFER_HARDWARE(0),
        PREFER_SOFTWARE(1),
        USE_HARDWARE_ONLY(2),
        USE_SOFTWARE_ONLY(3);
        

        /* renamed from: e */
        private static final EncodeStrategy[] f47384e = null;
        public int mValue;

        /* access modifiers changed from: public */
        static {
            f47384e = values();
        }

        private EncodeStrategy(int i) {
            this.mValue = i;
        }

        /* renamed from: a */
        public static EncodeStrategy m17551a(int i) {
            for (EncodeStrategy encodeStrategy : f47384e) {
                if (encodeStrategy.mValue == i) {
                    return encodeStrategy;
                }
            }
            return PREFER_HARDWARE;
        }
    }

    public enum EncoderProfile {
        PROFILE_BASELINE(1),
        PROFILE_MAIN(2),
        PROFILE_HIGH(3),
        PROFILE_BASELINERPS(4),
        PROFILE_MAINRPS(5),
        PROFILE_HIGHRPS(6);
        

        /* renamed from: g */
        private static final EncoderProfile[] f47392g = null;
        public int mValue;

        /* access modifiers changed from: public */
        static {
            f47392g = values();
        }

        private EncoderProfile(int i) {
            this.mValue = i;
        }

        /* renamed from: a */
        public static EncoderProfile m17552a(int i) {
            for (EncoderProfile encoderProfile : f47392g) {
                if (i == encoderProfile.mValue) {
                    return encoderProfile;
                }
            }
            return PROFILE_BASELINE;
        }
    }

    public static class EncoderProperty {

        /* renamed from: a */
        public C17464a f47394a;

        /* renamed from: b */
        public ReferenceStrategy f47395b;

        /* renamed from: c */
        public CodecType f47396c;

        public EncoderProperty(C17464a aVar, ReferenceStrategy referenceStrategy, CodecType codecType) {
            this.f47394a = aVar;
            this.f47395b = referenceStrategy;
            this.f47396c = codecType;
        }

        public int getCodecType() {
            return this.f47396c.mValue;
        }

        public int getEncoderType() {
            return this.f47394a.value;
        }

        public int getReferenceStrategy() {
            return this.f47395b.mValue;
        }
    }

    public enum ReferenceStrategy {
        FIX_GOP(0),
        RPS(1),
        SVC(2),
        UNLIMITED_GOP(3);
        

        /* renamed from: e */
        private static final ReferenceStrategy[] f47401e = null;
        public int mValue;

        /* access modifiers changed from: public */
        static {
            f47401e = values();
        }

        private ReferenceStrategy(int i) {
            this.mValue = i;
        }

        /* renamed from: a */
        public static ReferenceStrategy m17553a(int i) {
            for (ReferenceStrategy referenceStrategy : f47401e) {
                if (i == referenceStrategy.mValue) {
                    return referenceStrategy;
                }
            }
            return FIX_GOP;
        }
    }

    public interface VideoEncoderDataListener {
        void onEncodedFail(C17263h.C17268a aVar);

        void onEncodedNAL(EncodedVideoFrame encodedVideoFrame, boolean z);

        void onOutputFormatChanged(MediaFormat mediaFormat);
    }

    /* renamed from: com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$a */
    public enum C17464a {
        HARDWARE(1),
        SOFTWARE(2);
        
        public int value;

        private C17464a(int i) {
            this.value = i;
        }
    }
}
