package com.tencent.liteav.commonaudio.codec;

import android.media.MediaFormat;
import com.tencent.liteav.commonaudio.codec.AacMediaCodecWrapper;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import java.nio.ByteBuffer;

public class HardwareAacEncoder {

    /* renamed from: a */
    private final AacMediaCodecWrapper f46341a = new AacMediaCodecWrapper(AacMediaCodecWrapper.C17161a.f46337a);

    public ByteBuffer encode(ByteBuffer byteBuffer) {
        return this.f46341a.processFrame(byteBuffer);
    }

    public boolean init(int i, int i2, int i3) {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
        createAudioFormat.setInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, i3);
        createAudioFormat.setInteger("aac-profile", 2);
        return this.f46341a.mo19433a(createAudioFormat);
    }

    public void unInit() {
        this.f46341a.mo19432a();
    }
}
