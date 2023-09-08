package com.tencent.tav.core;

import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.decoder.AudioInfo;
import com.tencent.tav.decoder.AudioMixer;
import com.tencent.tav.decoder.factory.AVResampleFactory;
import com.tencent.tav.decoder.logger.Logger;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public class AudioCompositor {
    private final String TAG = ("AudioCompositor@" + Integer.toHexString(hashCode()));
    private AudioMixer audioMixer;
    private final AudioResample audioResample;
    private ShortBuffer currentSamples;
    private ShortBuffer lastSamples;

    public AudioCompositor(AudioInfo audioInfo) {
        this.audioMixer = new AudioMixer(audioInfo.sampleRate, audioInfo.channelCount);
        this.audioResample = new AudioResample();
    }

    private AudioInfo resample(CMSampleBuffer cMSampleBuffer, AudioInfo audioInfo) {
        ByteBuffer resample;
        ByteBuffer sampleByteBuffer = cMSampleBuffer.getSampleByteBuffer();
        if (sampleByteBuffer == null || sampleByteBuffer.limit() <= 0) {
            String str = this.audioResample.TAG;
            Logger.m144641d(str, "resample: 不进行重采样 byteBuffer = " + sampleByteBuffer);
            return audioInfo;
        }
        if (AVResampleFactory.getInstance().isResampleEnable() && (resample = this.audioResample.resample(sampleByteBuffer, audioInfo)) != null) {
            audioInfo = this.audioResample.getDestAudioInfo();
            sampleByteBuffer = resample;
        }
        cMSampleBuffer.setSampleByteBuffer(sampleByteBuffer);
        return audioInfo;
    }

    public synchronized void clear() {
        this.currentSamples = null;
        this.lastSamples = null;
    }

    public ByteBuffer processFrame(ByteBuffer byteBuffer, float f, float f2, AudioInfo audioInfo) {
        this.audioMixer.setAudioInfo(audioInfo.sampleRate, audioInfo.channelCount, audioInfo.pcmEncoding);
        return this.audioMixer.processBytes(byteBuffer, f2, f, 1.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059 A[Catch:{ all -> 0x01b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d A[Catch:{ all -> 0x01b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099 A[SYNTHETIC, Splitter:B:27:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0191 A[EDGE_INSN: B:83:0x0191->B:65:0x0191 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.tencent.tav.coremedia.CMSampleBuffer readMergeSample(com.tencent.tav.decoder.AudioDecoderTrack r17, com.tencent.tav.core.AudioMixInputParameters r18, com.tencent.tav.coremedia.CMSampleBuffer r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            monitor-enter(r16)
            if (r19 == 0) goto L_0x01c6
            java.nio.ByteBuffer r3 = r19.getSampleByteBuffer()     // Catch:{ all -> 0x01cd }
            if (r3 == 0) goto L_0x01c6
            if (r0 != 0) goto L_0x0013
            goto L_0x01c6
        L_0x0013:
            java.nio.ByteBuffer r3 = r19.getSampleByteBuffer()     // Catch:{ all -> 0x01cd }
            java.nio.ShortBuffer r3 = r3.asShortBuffer()     // Catch:{ all -> 0x01cd }
            int r3 = r3.limit()     // Catch:{ all -> 0x01cd }
            java.nio.ShortBuffer r4 = r1.currentSamples     // Catch:{ all -> 0x01cd }
            if (r4 == 0) goto L_0x0030
            int r4 = r4.capacity()     // Catch:{ all -> 0x01cd }
            if (r4 >= r3) goto L_0x002a
            goto L_0x0030
        L_0x002a:
            java.nio.ShortBuffer r4 = r1.currentSamples     // Catch:{ all -> 0x01cd }
            r4.clear()     // Catch:{ all -> 0x01cd }
            goto L_0x0047
        L_0x0030:
            int r4 = r3 * 2
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)     // Catch:{ all -> 0x01cd }
            java.nio.ByteBuffer r5 = r19.getSampleByteBuffer()     // Catch:{ all -> 0x01cd }
            java.nio.ByteOrder r5 = r5.order()     // Catch:{ all -> 0x01cd }
            r4.order(r5)     // Catch:{ all -> 0x01cd }
            java.nio.ShortBuffer r4 = r4.asShortBuffer()     // Catch:{ all -> 0x01cd }
            r1.currentSamples = r4     // Catch:{ all -> 0x01cd }
        L_0x0047:
            java.nio.ShortBuffer r4 = r1.lastSamples     // Catch:{ all -> 0x01cd }
            if (r4 == 0) goto L_0x008d
            int r4 = r4.remaining()     // Catch:{ all -> 0x01cd }
            if (r4 <= 0) goto L_0x008d
            java.nio.ShortBuffer r4 = r1.lastSamples     // Catch:{ all -> 0x01cd }
            int r4 = r4.remaining()     // Catch:{ all -> 0x01cd }
            if (r3 >= r4) goto L_0x007d
            java.nio.ShortBuffer r4 = r1.lastSamples     // Catch:{ all -> 0x01cd }
            int r4 = r4.position()     // Catch:{ all -> 0x01cd }
            java.nio.ShortBuffer r5 = r1.lastSamples     // Catch:{ all -> 0x01cd }
            int r5 = r5.limit()     // Catch:{ all -> 0x01cd }
            java.nio.ShortBuffer r6 = r1.lastSamples     // Catch:{ all -> 0x01cd }
            int r4 = r4 + r3
            r6.limit(r4)     // Catch:{ all -> 0x01cd }
            java.nio.ShortBuffer r6 = r1.currentSamples     // Catch:{ all -> 0x01cd }
            java.nio.ShortBuffer r7 = r1.lastSamples     // Catch:{ all -> 0x01cd }
            r6.put(r7)     // Catch:{ all -> 0x01cd }
            java.nio.ShortBuffer r6 = r1.lastSamples     // Catch:{ all -> 0x01cd }
            r6.limit(r5)     // Catch:{ all -> 0x01cd }
            java.nio.ShortBuffer r5 = r1.lastSamples     // Catch:{ all -> 0x01cd }
            r5.position(r4)     // Catch:{ all -> 0x01cd }
            goto L_0x008d
        L_0x007d:
            java.nio.ShortBuffer r4 = r1.currentSamples     // Catch:{ all -> 0x01cd }
            java.nio.ShortBuffer r5 = r1.lastSamples     // Catch:{ all -> 0x01cd }
            r4.put(r5)     // Catch:{ all -> 0x01cd }
            java.nio.ShortBuffer r4 = r1.lastSamples     // Catch:{ all -> 0x01cd }
            int r5 = r4.limit()     // Catch:{ all -> 0x01cd }
            r4.position(r5)     // Catch:{ all -> 0x01cd }
        L_0x008d:
            java.nio.ShortBuffer r4 = r1.currentSamples     // Catch:{ all -> 0x01cd }
            int r4 = r4.position()     // Catch:{ all -> 0x01cd }
            r5 = 0
            r6 = 0
        L_0x0095:
            r7 = -1
            if (r4 >= r3) goto L_0x0191
            com.tencent.tav.coremedia.CMTime r9 = r19.getTime()     // Catch:{ all -> 0x01b1 }
            com.tencent.tav.coremedia.CMSampleBuffer r9 = r0.readSample(r9)     // Catch:{ all -> 0x01b1 }
            java.lang.String r10 = r1.TAG     // Catch:{ all -> 0x01b1 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b1 }
            r11.<init>()     // Catch:{ all -> 0x01b1 }
            java.lang.String r12 = "readMergeSample: loopCount = "
            r11.append(r12)     // Catch:{ all -> 0x01b1 }
            int r12 = r6 + 1
            r11.append(r6)     // Catch:{ all -> 0x01b1 }
            java.lang.String r6 = ", audioBuffer = "
            r11.append(r6)     // Catch:{ all -> 0x01b1 }
            r11.append(r9)     // Catch:{ all -> 0x01b1 }
            java.lang.String r6 = r11.toString()     // Catch:{ all -> 0x01b1 }
            com.tencent.tav.decoder.logger.Logger.m144648v(r10, r6)     // Catch:{ all -> 0x01b1 }
            com.tencent.tav.coremedia.CMSampleState r6 = r9.getState()     // Catch:{ all -> 0x01b1 }
            int r6 = r6.getExportCode()     // Catch:{ all -> 0x01b1 }
            if (r6 >= 0) goto L_0x00cd
            monitor-exit(r16)
            return r9
        L_0x00cd:
            com.tencent.tav.coremedia.CMSampleState r6 = r9.getState()     // Catch:{ all -> 0x01b1 }
            long r10 = r6.getStateCode()     // Catch:{ all -> 0x01b1 }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x00db
            monitor-exit(r16)
            return r19
        L_0x00db:
            com.tencent.tav.coremedia.CMTime r6 = r9.getTime()     // Catch:{ all -> 0x01b1 }
            r0.asyncReadNextSample(r6)     // Catch:{ all -> 0x01b1 }
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x00ef
            com.tencent.tav.coremedia.CMTime r10 = r9.getTime()     // Catch:{ all -> 0x01b1 }
            float r10 = r2.getVolumeAtTime(r10)     // Catch:{ all -> 0x01b1 }
            goto L_0x00f1
        L_0x00ef:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00f1:
            java.nio.ByteBuffer r11 = r9.getSampleByteBuffer()     // Catch:{ all -> 0x01b1 }
            if (r11 == 0) goto L_0x018e
            java.nio.ByteBuffer r11 = r9.getSampleByteBuffer()     // Catch:{ all -> 0x01b1 }
            int r11 = r11.limit()     // Catch:{ all -> 0x01b1 }
            if (r11 > 0) goto L_0x0103
            goto L_0x018e
        L_0x0103:
            com.tencent.tav.decoder.AudioInfo r11 = r17.getAudioInfo()     // Catch:{ all -> 0x01b1 }
            com.tencent.tav.decoder.AudioInfo r11 = r1.resample(r9, r11)     // Catch:{ all -> 0x01b1 }
            if (r2 == 0) goto L_0x012a
            com.tencent.tav.core.AudioTapProcessor r13 = r18.getAudioTapProcessor()     // Catch:{ all -> 0x01b1 }
            if (r13 == 0) goto L_0x012a
            com.tencent.tav.core.AudioTapProcessor r13 = r18.getAudioTapProcessor()     // Catch:{ all -> 0x01b1 }
            com.tencent.tav.coremedia.CMTime r14 = r9.getTime()     // Catch:{ all -> 0x01b1 }
            java.nio.ByteBuffer r15 = r9.getSampleByteBuffer()     // Catch:{ all -> 0x01b1 }
            java.nio.ByteBuffer r11 = r13.processAudioPCM(r14, r15, r11)     // Catch:{ all -> 0x01b1 }
            r9.setSampleByteBuffer(r11)     // Catch:{ all -> 0x01b1 }
            com.tencent.tav.decoder.AudioInfo r11 = r13.getDestAudioInfo()     // Catch:{ all -> 0x01b1 }
        L_0x012a:
            java.nio.ByteBuffer r9 = r9.getSampleByteBuffer()     // Catch:{ all -> 0x01b1 }
            java.nio.ByteBuffer r6 = r1.processFrame(r9, r10, r6, r11)     // Catch:{ all -> 0x01b1 }
            java.nio.ShortBuffer r6 = r6.asShortBuffer()     // Catch:{ all -> 0x01b1 }
            int r9 = r6.limit()     // Catch:{ all -> 0x01b1 }
            int r10 = r3 - r4
            if (r9 <= r10) goto L_0x0184
            int r0 = r6.limit()     // Catch:{ all -> 0x01b1 }
            int r0 = r0 - r10
            java.nio.ShortBuffer r2 = r1.lastSamples     // Catch:{ all -> 0x01b1 }
            if (r2 == 0) goto L_0x0154
            int r2 = r2.capacity()     // Catch:{ all -> 0x01b1 }
            if (r2 >= r0) goto L_0x014e
            goto L_0x0154
        L_0x014e:
            java.nio.ShortBuffer r0 = r1.lastSamples     // Catch:{ all -> 0x01b1 }
            r0.clear()     // Catch:{ all -> 0x01b1 }
            goto L_0x016b
        L_0x0154:
            int r0 = r0 * 2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ all -> 0x01b1 }
            java.nio.ByteBuffer r2 = r19.getSampleByteBuffer()     // Catch:{ all -> 0x01b1 }
            java.nio.ByteOrder r2 = r2.order()     // Catch:{ all -> 0x01b1 }
            r0.order(r2)     // Catch:{ all -> 0x01b1 }
            java.nio.ShortBuffer r0 = r0.asShortBuffer()     // Catch:{ all -> 0x01b1 }
            r1.lastSamples = r0     // Catch:{ all -> 0x01b1 }
        L_0x016b:
            r6.position(r10)     // Catch:{ all -> 0x01b1 }
            java.nio.ShortBuffer r0 = r1.lastSamples     // Catch:{ all -> 0x01b1 }
            r0.put(r6)     // Catch:{ all -> 0x01b1 }
            java.nio.ShortBuffer r0 = r1.lastSamples     // Catch:{ all -> 0x01b1 }
            r0.flip()     // Catch:{ all -> 0x01b1 }
            r6.position(r5)     // Catch:{ all -> 0x01b1 }
            r6.limit(r10)     // Catch:{ all -> 0x01b1 }
            java.nio.ShortBuffer r0 = r1.currentSamples     // Catch:{ all -> 0x01b1 }
            r0.put(r6)     // Catch:{ all -> 0x01b1 }
            goto L_0x0191
        L_0x0184:
            java.nio.ShortBuffer r9 = r1.currentSamples     // Catch:{ all -> 0x01b1 }
            r9.put(r6)     // Catch:{ all -> 0x01b1 }
            int r6 = r6.limit()     // Catch:{ all -> 0x01b1 }
            int r4 = r4 + r6
        L_0x018e:
            r6 = r12
            goto L_0x0095
        L_0x0191:
            java.nio.ShortBuffer r0 = r1.currentSamples     // Catch:{ all -> 0x01b1 }
            r0.flip()     // Catch:{ all -> 0x01b1 }
            com.tencent.tav.decoder.AudioMixer r0 = r1.audioMixer     // Catch:{ all -> 0x01b1 }
            java.nio.ByteBuffer r2 = r19.getSampleByteBuffer()     // Catch:{ all -> 0x01b1 }
            java.nio.ShortBuffer r2 = r2.asShortBuffer()     // Catch:{ all -> 0x01b1 }
            java.nio.ShortBuffer r3 = r1.currentSamples     // Catch:{ all -> 0x01b1 }
            java.nio.ByteBuffer r0 = r0.mergeSamples(r2, r3)     // Catch:{ all -> 0x01b1 }
            com.tencent.tav.coremedia.CMSampleBuffer r2 = new com.tencent.tav.coremedia.CMSampleBuffer     // Catch:{ all -> 0x01b1 }
            com.tencent.tav.coremedia.CMTime r3 = r19.getTime()     // Catch:{ all -> 0x01b1 }
            r2.<init>((com.tencent.tav.coremedia.CMTime) r3, (java.nio.ByteBuffer) r0)     // Catch:{ all -> 0x01b1 }
            monitor-exit(r16)
            return r2
        L_0x01b1:
            r0 = move-exception
            java.lang.String r2 = r1.TAG     // Catch:{ all -> 0x01cd }
            java.lang.String r3 = "readMergeSample: "
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x01cd }
            com.tencent.tav.coremedia.CMSampleBuffer r2 = new com.tencent.tav.coremedia.CMSampleBuffer     // Catch:{ all -> 0x01cd }
            java.lang.String r3 = "catch error"
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r7, r3, r0)     // Catch:{ all -> 0x01cd }
            r2.<init>((com.tencent.tav.coremedia.CMSampleState) r0)     // Catch:{ all -> 0x01cd }
            monitor-exit(r16)
            return r2
        L_0x01c6:
            r0 = 0
            r1.currentSamples = r0     // Catch:{ all -> 0x01cd }
            r1.lastSamples = r0     // Catch:{ all -> 0x01cd }
            monitor-exit(r16)
            return r19
        L_0x01cd:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.core.AudioCompositor.readMergeSample(com.tencent.tav.decoder.AudioDecoderTrack, com.tencent.tav.core.AudioMixInputParameters, com.tencent.tav.coremedia.CMSampleBuffer):com.tencent.tav.coremedia.CMSampleBuffer");
    }

    public void setAudioInfo(AudioInfo audioInfo) {
        this.audioMixer = new AudioMixer(audioInfo.sampleRate, audioInfo.channelCount);
    }
}
