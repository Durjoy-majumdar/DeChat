package org.webrtc;

import org.webrtc.VideoEncoder;

/* renamed from: org.webrtc.f */
public final /* synthetic */ class C21874f {
    /* renamed from: a */
    public static long m25066a(VideoEncoder videoEncoder) {
        return 0;
    }

    /* renamed from: b */
    public static VideoEncoder.ResolutionBitrateLimits[] m25067b(VideoEncoder videoEncoder) {
        return new VideoEncoder.ResolutionBitrateLimits[0];
    }

    /* renamed from: c */
    public static boolean m25068c(VideoEncoder videoEncoder) {
        return true;
    }

    /* renamed from: d */
    public static VideoCodecStatus m25069d(VideoEncoder videoEncoder, VideoEncoder.RateControlParameters rateControlParameters) {
        return videoEncoder.setRateAllocation(rateControlParameters.bitrate, (int) Math.ceil(rateControlParameters.framerateFps));
    }
}
