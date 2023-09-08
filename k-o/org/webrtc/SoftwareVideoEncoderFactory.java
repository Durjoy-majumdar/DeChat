package org.webrtc;

import java.util.ArrayList;
import java.util.HashMap;
import org.webrtc.VideoEncoderFactory;

public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    public static VideoCodecInfo[] supportedCodecs() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VideoCodecInfo(VideoCodecMimeType.VP8.toSdpCodecName(), new HashMap()));
        if (LibvpxVp9Encoder.nativeIsSupported()) {
            arrayList.add(new VideoCodecInfo(VideoCodecMimeType.VP9.toSdpCodecName(), new HashMap()));
        }
        if (LibaomAv1Encoder.nativeIsSupported()) {
            arrayList.add(new VideoCodecInfo(VideoCodecMimeType.AV1.toSdpCodecName(), new HashMap()));
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }

    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        String name = videoCodecInfo.getName();
        if (name.equalsIgnoreCase(VideoCodecMimeType.VP8.toSdpCodecName())) {
            return new LibvpxVp8Encoder();
        }
        if (name.equalsIgnoreCase(VideoCodecMimeType.VP9.toSdpCodecName()) && LibvpxVp9Encoder.nativeIsSupported()) {
            return new LibvpxVp9Encoder();
        }
        if (!name.equalsIgnoreCase(VideoCodecMimeType.AV1.toSdpCodecName()) || !LibaomAv1Encoder.nativeIsSupported()) {
            return null;
        }
        return new LibaomAv1Encoder();
    }

    public /* synthetic */ VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return C21875g.m25070a(this);
    }

    public /* synthetic */ VideoCodecInfo[] getImplementations() {
        return C21875g.m25071b(this);
    }

    public VideoCodecInfo[] getSupportedCodecs() {
        return supportedCodecs();
    }
}
