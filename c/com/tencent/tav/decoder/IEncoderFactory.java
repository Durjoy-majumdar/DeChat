package com.tencent.tav.decoder;

public interface IEncoderFactory {
    AssetWriterAudioEncoder getAudioEncoder();

    AssetWriterVideoEncoder getVideoEncoder();
}
