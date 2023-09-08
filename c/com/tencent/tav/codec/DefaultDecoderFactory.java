package com.tencent.tav.codec;

public class DefaultDecoderFactory implements IDecoderFactory {
    public IMediaCodec createAudioDecoder(String str, String str2) {
        return MediaCodecAnalyse.createDecoderByType(str, str2);
    }

    public IMediaCodec createVideoDecoder(String str) {
        return MediaCodecAnalyse.createDecoderByType(str, "video");
    }
}
