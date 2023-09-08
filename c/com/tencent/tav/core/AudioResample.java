package com.tencent.tav.core;

import com.tencent.tav.coremedia.IAVResample;
import com.tencent.tav.decoder.AudioInfo;
import com.tencent.tav.decoder.factory.AVResampleFactory;
import com.tencent.tav.decoder.logger.Logger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class AudioResample {
    public final String TAG;
    private IAVResample avResample;
    private final AudioInfo destAudioInfo;
    private ByteBuffer destBuffer;
    private AudioInfo srcAudioInfo;

    public AudioResample() {
        this(newDefaultDestAudioInfo());
    }

    private boolean compareAudioInfo(AudioInfo audioInfo) {
        AudioInfo audioInfo2 = this.srcAudioInfo;
        return audioInfo2 != null && audioInfo2.pcmEncoding == audioInfo.pcmEncoding && audioInfo2.channelCount == audioInfo.channelCount && audioInfo2.sampleRate == audioInfo.sampleRate;
    }

    private static AudioInfo newDefaultDestAudioInfo() {
        AudioInfo audioInfo = new AudioInfo();
        audioInfo.channelCount = 1;
        audioInfo.sampleRate = 44100;
        audioInfo.pcmEncoding = 2;
        return audioInfo;
    }

    public AudioInfo getDestAudioInfo() {
        return this.destAudioInfo;
    }

    public ByteBuffer resample(ByteBuffer byteBuffer, AudioInfo audioInfo) {
        String str = this.TAG;
        Logger.m144648v(str, "resample() called with: srcBuffer = [" + byteBuffer + "], srcAudioInfo = [" + audioInfo + "]， thread = " + Thread.currentThread().getName());
        if (!compareAudioInfo(audioInfo) && AVResampleFactory.getInstance().isResampleEnable()) {
            AVResampleFactory instance = AVResampleFactory.getInstance();
            int i = audioInfo.sampleRate;
            int i2 = audioInfo.channelCount;
            AudioInfo audioInfo2 = this.destAudioInfo;
            IAVResample newAVResample = instance.newAVResample(i, i2, audioInfo2.sampleRate, audioInfo2.channelCount);
            this.avResample = newAVResample;
            this.srcAudioInfo = audioInfo;
            String name = newAVResample != null ? newAVResample.getClass().getName() : "null";
            String str2 = this.TAG;
            Logger.m144646i(str2, "resample: 创建重采样库，class = " + name + ", srcAudioInfo = " + audioInfo + ", thread = " + Thread.currentThread().getName());
        }
        IAVResample iAVResample = this.avResample;
        if (iAVResample == null) {
            Logger.m144649w(this.TAG, "resample: avResample 创建失败！");
            return null;
        }
        byte[] resample = iAVResample.resample(byteBuffer, byteBuffer.limit());
        ByteBuffer byteBuffer2 = this.destBuffer;
        if (byteBuffer2 == null || resample.length > byteBuffer2.limit()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(resample.length);
            this.destBuffer = allocateDirect;
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.destBuffer.clear();
        this.destBuffer.put(resample);
        this.destBuffer.position(0);
        this.destBuffer.limit(resample.length);
        return this.destBuffer;
    }

    public AudioResample(AudioInfo audioInfo) {
        String str = "AudioResample@" + Integer.toHexString(hashCode());
        this.TAG = str;
        this.destAudioInfo = audioInfo;
        Logger.m144646i(str, "AudioResample() called with: destAudioInfo = [" + audioInfo + "], thread = " + Thread.currentThread().getName());
    }
}
