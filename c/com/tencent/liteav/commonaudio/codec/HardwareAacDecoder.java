package com.tencent.liteav.commonaudio.codec;

import android.media.MediaFormat;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.commonaudio.codec.AacMediaCodecWrapper;
import com.tencent.thumbplayer.tmediacodec.util.TUtils;
import java.nio.ByteBuffer;

public class HardwareAacDecoder {

    /* renamed from: a */
    private final AacMediaCodecWrapper f46340a = new AacMediaCodecWrapper(AacMediaCodecWrapper.C17161a.f46338b);

    public ByteBuffer decode(ByteBuffer byteBuffer) {
        return this.f46340a.processFrame(byteBuffer);
    }

    public int getCacheSize() {
        return this.f46340a.f46332b;
    }

    public int getOutputChannelCount() {
        MediaFormat mediaFormat = this.f46340a.f46331a;
        if (mediaFormat == null) {
            return -1;
        }
        try {
            return mediaFormat.getInteger("channel-count");
        } catch (Exception e) {
            Log.m97546e("HardwareAacDecoder", "getOutputChannelCount failed. ".concat(String.valueOf(e)), new Object[0]);
            return -1;
        }
    }

    public int getOutputSampleRate() {
        MediaFormat mediaFormat = this.f46340a.f46331a;
        if (mediaFormat == null) {
            return -1;
        }
        try {
            return mediaFormat.getInteger("sample-rate");
        } catch (Exception e) {
            Log.m97546e("HardwareAacDecoder", "getOutputSampleRate failed. ".concat(String.valueOf(e)), new Object[0]);
            return -1;
        }
    }

    public boolean init(int i, int i2, ByteBuffer byteBuffer) {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
        createAudioFormat.setString("mime", "audio/mp4a-latm");
        createAudioFormat.setByteBuffer(TUtils.CSD_0, byteBuffer);
        return this.f46340a.mo19433a(createAudioFormat);
    }

    public void unInit() {
        this.f46340a.mo19432a();
    }
}
