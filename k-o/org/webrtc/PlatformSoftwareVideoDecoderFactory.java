package org.webrtc;

import android.media.MediaCodecInfo;
import org.webrtc.EglBase;
import org.webrtc.Predicate;

public class PlatformSoftwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    private static final Predicate<MediaCodecInfo> defaultAllowedPredicate = new Predicate<MediaCodecInfo>() {
        public /* synthetic */ Predicate and(Predicate predicate) {
            return Predicate.CC.m25031a(this, predicate);
        }

        public /* synthetic */ Predicate negate() {
            return Predicate.CC.m25032b(this);
        }

        /* renamed from: or */
        public /* synthetic */ Predicate mo34528or(Predicate predicate) {
            return Predicate.CC.m25033c(this, predicate);
        }

        public boolean test(MediaCodecInfo mediaCodecInfo) {
            return MediaCodecUtils.isSoftwareOnly(mediaCodecInfo);
        }
    };

    public PlatformSoftwareVideoDecoderFactory(EglBase.Context context) {
        super(context, defaultAllowedPredicate);
    }

    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }
}
