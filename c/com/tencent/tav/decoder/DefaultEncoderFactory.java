package com.tencent.tav.decoder;

public class DefaultEncoderFactory implements IEncoderFactory {
    public AssetWriterAudioEncoder getAudioEncoder() {
        return new MediaCodecAudioEncoder();
    }

    public AssetWriterVideoEncoder getVideoEncoder() {
        return new MediaCodecAssetWriterVideoEncoder();
    }
}
