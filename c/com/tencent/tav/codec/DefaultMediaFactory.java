package com.tencent.tav.codec;

import com.tencent.tav.decoder.AssetWriterAudioEncoder;
import com.tencent.tav.decoder.AssetWriterVideoEncoder;
import com.tencent.tav.decoder.DefaultEncoderFactory;
import com.tencent.tav.decoder.IEncoderFactory;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/tav/codec/DefaultMediaFactory;", "Lcom/tencent/tav/codec/IMediaFactory;", "encoderFactory", "Lcom/tencent/tav/decoder/IEncoderFactory;", "decoderFactory", "Lcom/tencent/tav/codec/IDecoderFactory;", "(Lcom/tencent/tav/decoder/IEncoderFactory;Lcom/tencent/tav/codec/IDecoderFactory;)V", "getDecoderFactory", "()Lcom/tencent/tav/codec/IDecoderFactory;", "getEncoderFactory", "()Lcom/tencent/tav/decoder/IEncoderFactory;", "createAudioDecoder", "Lcom/tencent/tav/codec/IMediaCodec;", "mimeType", "", "scene", "createVideoDecoder", "getAudioEncoder", "Lcom/tencent/tav/decoder/AssetWriterAudioEncoder;", "getVideoEncoder", "Lcom/tencent/tav/decoder/AssetWriterVideoEncoder;", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 1, 15})
public final class DefaultMediaFactory implements IMediaFactory {
    private final IDecoderFactory decoderFactory;
    private final IEncoderFactory encoderFactory;

    public DefaultMediaFactory(IEncoderFactory iEncoderFactory, IDecoderFactory iDecoderFactory) {
        this.encoderFactory = iEncoderFactory == null ? new DefaultEncoderFactory() : iEncoderFactory;
        this.decoderFactory = iDecoderFactory == null ? new DefaultDecoderFactory() : iDecoderFactory;
    }

    public IMediaCodec createAudioDecoder(String str, String str2) {
        C87412m.m108595h(str, "mimeType");
        C87412m.m108595h(str2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        return this.decoderFactory.createAudioDecoder(str, str2);
    }

    public IMediaCodec createVideoDecoder(String str) {
        C87412m.m108595h(str, "mimeType");
        IMediaCodec createVideoDecoder = this.decoderFactory.createVideoDecoder(str);
        C87412m.m108590c(createVideoDecoder, "decoderFactory.createVideoDecoder(mimeType)");
        return createVideoDecoder;
    }

    public AssetWriterAudioEncoder getAudioEncoder() {
        AssetWriterAudioEncoder audioEncoder = this.encoderFactory.getAudioEncoder();
        C87412m.m108590c(audioEncoder, "encoderFactory.getAudioEncoder()");
        return audioEncoder;
    }

    public final IDecoderFactory getDecoderFactory() {
        return this.decoderFactory;
    }

    public final IEncoderFactory getEncoderFactory() {
        return this.encoderFactory;
    }

    public AssetWriterVideoEncoder getVideoEncoder() {
        AssetWriterVideoEncoder videoEncoder = this.encoderFactory.getVideoEncoder();
        C87412m.m108590c(videoEncoder, "encoderFactory.getVideoEncoder()");
        return videoEncoder;
    }
}
