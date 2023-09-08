package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videoconsumer.decoder.C17334au;

@JNINamespace("liteav::video")
public interface VideoDecoderDef {

    public enum ConsumerScene {
        UNKNOWN(-1),
        LIVE(0),
        RTC(1);
        

        /* renamed from: d */
        private static final ConsumerScene[] f46924d = null;
        private int mValue;

        /* access modifiers changed from: public */
        static {
            f46924d = values();
        }

        private ConsumerScene(int i) {
            this.mValue = i;
        }

        /* renamed from: a */
        public static ConsumerScene m17242a(int i) {
            for (ConsumerScene consumerScene : f46924d) {
                if (consumerScene.mValue == i) {
                    return consumerScene;
                }
            }
            return UNKNOWN;
        }
    }

    public static class DecodeAbility {

        /* renamed from: a */
        public boolean f46926a = true;

        /* renamed from: b */
        public boolean f46927b = false;

        /* renamed from: c */
        public boolean f46928c = false;

        public boolean isSupportHEVC() {
            return this.f46928c;
        }

        public boolean isSupportRPS() {
            return this.f46926a;
        }

        public boolean isSupportSVC() {
            return this.f46927b;
        }
    }

    public static class DecoderProperty {

        /* renamed from: a */
        public C17334au.C17335a f46929a;

        /* renamed from: b */
        public CodecType f46930b;

        public DecoderProperty(C17334au.C17335a aVar, CodecType codecType) {
            this.f46929a = aVar;
            this.f46930b = codecType;
        }

        public int getCodecType() {
            return this.f46930b.mValue;
        }

        public int getDecoderType() {
            return this.f46929a.mValue;
        }
    }
}
