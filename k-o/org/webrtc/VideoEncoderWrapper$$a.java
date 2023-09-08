package org.webrtc;

import org.webrtc.VideoEncoder;

public final /* synthetic */ class VideoEncoderWrapper$$a implements VideoEncoder.Callback {

    /* renamed from: a */
    public final /* synthetic */ long f61866a;

    public /* synthetic */ VideoEncoderWrapper$$a(long j) {
        this.f61866a = j;
    }

    public final void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.nativeOnEncodedFrame(this.f61866a, encodedImage);
    }
}
