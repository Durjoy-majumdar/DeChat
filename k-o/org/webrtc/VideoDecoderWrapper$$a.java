package org.webrtc;

import org.webrtc.VideoDecoder;

public final /* synthetic */ class VideoDecoderWrapper$$a implements VideoDecoder.Callback {

    /* renamed from: a */
    public final /* synthetic */ long f61864a;

    public /* synthetic */ VideoDecoderWrapper$$a(long j) {
        this.f61864a = j;
    }

    public final void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.f61864a, videoFrame, num, num2);
    }
}
