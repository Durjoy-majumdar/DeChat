package com.tencent.tav.codec;

public interface IDecoderFactory {
    IMediaCodec createAudioDecoder(String str, String str2);

    IMediaCodec createVideoDecoder(String str);
}
