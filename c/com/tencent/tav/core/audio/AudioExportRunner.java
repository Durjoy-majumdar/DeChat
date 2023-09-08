package com.tencent.tav.core.audio;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.EncoderWriter;
import com.tencent.tav.decoder.IDecoderTrack;
import com.tencent.tav.decoder.logger.Logger;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

public class AudioExportRunner implements Runnable {
    public static final int EDGE_DURATION_MS = 200;
    private static final int MAX_INPUT_SIZE = 8192;
    private static String MIME = "audio/mp4a-latm";
    public static final int PACKET_FPS = 44;
    public static final String TAG = "AudioEncoder";
    private static final long WAIT_TRANSIENT_MS = 20;
    private boolean enOfAudioInputStream = false;
    public IAudioSource<? extends IDecoderTrack> mAudioAsset;
    public IDecoderTrack mAudioDecoder;
    private MediaCodec mAudioEncoder;
    private ExportCallback mCallback;
    private boolean mCancel = false;
    private int mChannelCount = 1;
    private FileOutputStream mFos;
    private String mMime = MIME;
    private int mRate = EncoderWriter.OUTPUT_AUDIO_BIT_RATE;
    private int mSampleRate = 44100;
    private String mSavePath;
    public CMTimeRange mSelectedTimeRange;
    private int mStatus = 0;
    private AtomicBoolean mStop = new AtomicBoolean(false);
    private Thread mThread;

    public AudioExportRunner(IAudioSource<? extends IDecoderTrack> iAudioSource, CMTimeRange cMTimeRange) {
        this.mAudioAsset = iAudioSource;
        if (cMTimeRange == null) {
            this.mSelectedTimeRange = new CMTimeRange(CMTime.CMTimeZero, iAudioSource.getDuration());
        } else {
            this.mSelectedTimeRange = cMTimeRange;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int dequeueInputBuffer(android.media.MediaCodec r6) {
        /*
            r5 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            int r6 = r6.dequeueInputBuffer(r0)     // Catch:{ Exception -> 0x0009, Error -> 0x0007 }
            return r6
        L_0x0007:
            r0 = move-exception
            goto L_0x000a
        L_0x0009:
            r0 = move-exception
        L_0x000a:
            java.lang.String r1 = "AudioEncoder"
            java.lang.String r2 = "dequeueInputBuffer e = "
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x005c
            r3 = 23
            if (r3 > r2) goto L_0x004e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CodecException - isTransient = "
            r2.append(r3)
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r4 = r3.isTransient()
            r2.append(r4)
            java.lang.String r4 = " , isRecoverable = "
            r2.append(r4)
            boolean r4 = r3.isRecoverable()
            r2.append(r4)
            java.lang.String r4 = " , errorCode = "
            r2.append(r4)
            int r3 = r3.getErrorCode()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.tav.decoder.logger.Logger.m144643e(r1, r2)
        L_0x004e:
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1
            boolean r1 = r1.isTransient()
            if (r1 == 0) goto L_0x005c
            int r6 = r5.dequeueInputBuffer(r6)
            return r6
        L_0x005c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.core.audio.AudioExportRunner.dequeueInputBuffer(android.media.MediaCodec):int");
    }

    private ByteBuffer getInputBuffer(int i) {
        return this.mAudioEncoder.getInputBuffer(i);
    }

    private ByteBuffer getOutputBuffer(int i) {
        return this.mAudioEncoder.getOutputBuffer(i);
    }

    private void initAudioDecoder() {
        try {
            IDecoderTrack sourceAudioDecoder = this.mAudioAsset.getSourceAudioDecoder(this.mSelectedTimeRange);
            this.mAudioDecoder = sourceAudioDecoder;
            sourceAudioDecoder.start();
            CMTime start = this.mSelectedTimeRange.getStart();
            IDecoderTrack iDecoderTrack = this.mAudioDecoder;
            CMTime cMTime = CMTime.CMTimeZero;
            if (start.bigThan(cMTime)) {
                cMTime = start.sub(CMTime.fromMs(200));
            }
            iDecoderTrack.seekTo(cMTime, false, false);
        } catch (Throwable unused) {
        }
    }

    private void initAudioEncoder() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(MIME, this.mSampleRate, this.mChannelCount);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.mRate);
        createAudioFormat.setInteger("max-input-size", 8192);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType(this.mMime);
        this.mAudioEncoder = createEncoderByType;
        createEncoderByType.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
    }

    private boolean isFinish(MediaCodec.BufferInfo bufferInfo) {
        return bufferInfo.presentationTimeUs >= this.mSelectedTimeRange.getEndUs();
    }

    private boolean isValidBuffer(MediaCodec.BufferInfo bufferInfo) {
        return bufferInfo.size > 0 && bufferInfo.presentationTimeUs >= this.mSelectedTimeRange.getStartUs() && bufferInfo.presentationTimeUs <= this.mSelectedTimeRange.getEndUs() && (bufferInfo.flags & 2) == 0;
    }

    private void notifyProgressUpdate(long j) {
        CMTimeRange cMTimeRange;
        if (this.mCallback != null && (cMTimeRange = this.mSelectedTimeRange) != null) {
            this.mCallback.onProgress(this.mStatus, (((float) (j - cMTimeRange.getStartUs())) * 1.0f) / ((float) this.mSelectedTimeRange.getDurationUs()));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void queueInputBuffer(android.media.MediaCodec r6, int r7, int r8, int r9, long r10, int r12) {
        /*
            r5 = this;
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ Exception -> 0x0006, Error -> 0x0004 }
            return
        L_0x0004:
            r0 = move-exception
            goto L_0x0007
        L_0x0006:
            r0 = move-exception
        L_0x0007:
            java.lang.String r1 = "AudioEncoder"
            java.lang.String r2 = "queueInputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x005c
            r3 = 23
            if (r2 < r3) goto L_0x004b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CodecException - isTransient = "
            r2.append(r3)
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r4 = r3.isTransient()
            r2.append(r4)
            java.lang.String r4 = " , isRecoverable = "
            r2.append(r4)
            boolean r4 = r3.isRecoverable()
            r2.append(r4)
            java.lang.String r4 = " , errorCode = "
            r2.append(r4)
            int r3 = r3.getErrorCode()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.tav.decoder.logger.Logger.m144643e(r1, r2)
        L_0x004b:
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1
            boolean r1 = r1.isTransient()
            if (r1 == 0) goto L_0x005c
            r1 = 20
            r5.waitTime(r1)
            r5.queueInputBuffer(r6, r7, r8, r9, r10, r12)
        L_0x005c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.core.audio.AudioExportRunner.queueInputBuffer(android.media.MediaCodec, int, int, int, long, int):void");
    }

    private void readNextSample() {
        CMSampleBuffer readSample = this.mAudioDecoder.readSample();
        CMTime time = readSample.getTime();
        if (time.value <= 0 || time.getTimeUs() > this.mSelectedTimeRange.getEndUs()) {
            int i = (readSample.getState().getStateCode() > -1 ? 1 : (readSample.getState().getStateCode() == -1 ? 0 : -1));
            if (i >= 0 && !this.enOfAudioInputStream) {
                signalEndOfAudioStream();
                this.enOfAudioInputStream = true;
            }
            this.mStatus = i < 0 ? 255 : this.mStatus;
            return;
        }
        ByteBuffer sampleByteBuffer = readSample.getSampleByteBuffer();
        int limit = sampleByteBuffer.limit() - sampleByteBuffer.position();
        byte[] bArr = new byte[limit];
        sampleByteBuffer.get(bArr);
        writeAudioSample(time, limit, bArr);
    }

    private void signalEndOfAudioStream() {
        try {
            Logger.m144641d(TAG, "signalEndOfAudioStream: ");
            int dequeueInputBuffer = dequeueInputBuffer(this.mAudioEncoder);
            if (dequeueInputBuffer >= 0) {
                queueInputBuffer(this.mAudioEncoder, dequeueInputBuffer, 0, 0, 0, 4);
            }
        } catch (Throwable th) {
            Logger.m144644e(TAG, "signalEndOfAudioStream failed", th);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|(3:4|5|6)|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void stop() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mStop     // Catch:{ all -> 0x0036 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0028
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mStop     // Catch:{ all -> 0x0036 }
            r1 = 1
            r0.set(r1)     // Catch:{ all -> 0x0036 }
            com.tencent.tav.decoder.IDecoderTrack r0 = r2.mAudioDecoder     // Catch:{ Exception -> 0x0028 }
            r0.release()     // Catch:{ Exception -> 0x0028 }
            android.media.MediaCodec r0 = r2.mAudioEncoder     // Catch:{ Exception -> 0x0028 }
            r0.stop()     // Catch:{ Exception -> 0x0028 }
            android.media.MediaCodec r0 = r2.mAudioEncoder     // Catch:{ Exception -> 0x0028 }
            r0.release()     // Catch:{ Exception -> 0x0028 }
            java.io.FileOutputStream r0 = r2.mFos     // Catch:{ Exception -> 0x0028 }
            r0.flush()     // Catch:{ Exception -> 0x0028 }
            java.io.FileOutputStream r0 = r2.mFos     // Catch:{ Exception -> 0x0028 }
            r0.close()     // Catch:{ Exception -> 0x0028 }
        L_0x0028:
            com.tencent.tav.coremedia.CMTimeRange r0 = r2.mSelectedTimeRange     // Catch:{ all -> 0x0036 }
            long r0 = r0.getEndUs()     // Catch:{ all -> 0x0036 }
            r2.notifyProgressUpdate(r0)     // Catch:{ all -> 0x0036 }
            r0 = 0
            r2.mCancel = r0     // Catch:{ all -> 0x0036 }
            monitor-exit(r2)
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.core.audio.AudioExportRunner.stop():void");
    }

    private void waitTime(long j) {
        try {
            wait(j);
        } catch (InterruptedException unused) {
        }
    }

    private void write(byte[] bArr) {
        if (this.mFos == null) {
            this.mFos = new FileOutputStream(this.mSavePath);
        }
        this.mFos.write(bArr);
    }

    private void writeAudioSample(CMTime cMTime, int i, byte[] bArr) {
        int i2 = 0;
        while (i - i2 > 0) {
            int dequeueInputBuffer = this.mAudioEncoder.dequeueInputBuffer(-1);
            if (dequeueInputBuffer >= 0) {
                ByteBuffer inputBuffer = getInputBuffer(dequeueInputBuffer);
                inputBuffer.clear();
                int min = Math.min(inputBuffer.capacity(), i);
                inputBuffer.put(bArr, i2, min);
                i2 += min;
                this.mAudioEncoder.queueInputBuffer(dequeueInputBuffer, 0, min, cMTime.getTimeUs(), 1);
            }
        }
    }

    public synchronized void cancel() {
        this.mCancel = true;
    }

    public int getRate() {
        return this.mRate;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public String getSavePath() {
        return this.mSavePath;
    }

    public CMTimeRange getSelectedTimeRange() {
        return this.mSelectedTimeRange;
    }

    public void prepare() {
        initAudioDecoder();
        initAudioEncoder();
    }

    public void run() {
        Logger.m144641d(TAG, "encoder start - " + this);
        while (this.mStatus <= 1 && !this.mCancel) {
            try {
                readNextSample();
                writeAudioSample();
            } catch (Throwable unused) {
                this.mStatus = 255;
            }
        }
        if (this.mCancel) {
            this.mStatus = 4;
        }
        Logger.m144641d(TAG, "encoder finish - " + this + "  mStatus = " + this.mStatus);
        stop();
    }

    public void setAsset(IAudioSource<? extends IDecoderTrack> iAudioSource) {
        this.mAudioAsset = iAudioSource;
    }

    public void setCallback(ExportCallback exportCallback) {
        this.mCallback = exportCallback;
    }

    public void setMime(String str) {
        this.mMime = str;
    }

    public void setRate(int i) {
        this.mRate = i;
    }

    public void setSampleRate(int i) {
        this.mSampleRate = i;
    }

    public void setSavePath(String str) {
        this.mSavePath = str;
    }

    public void setSelectedTimeRange(CMTimeRange cMTimeRange) {
        this.mSelectedTimeRange = cMTimeRange;
    }

    public synchronized void start() {
        if (this.mThread == null) {
            this.mAudioEncoder.start();
            Thread thread = new Thread(this);
            this.mThread = thread;
            thread.start();
            this.mStop.set(false);
            this.mCancel = false;
            this.enOfAudioInputStream = false;
            this.mStatus = 1;
        }
    }

    private void writeAudioSample() {
        int dequeueOutputBuffer;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        do {
            dequeueOutputBuffer = this.mAudioEncoder.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer >= 0 && isValidBuffer(bufferInfo) && this.mStatus != 2) {
                if ((bufferInfo.flags & 4) != 0) {
                    Logger.m144641d(TAG, "writeAudioFrame: BUFFER_FLAG_END_OF_STREAM ");
                    this.mStatus = 2;
                }
                ByteBuffer outputBuffer = getOutputBuffer(dequeueOutputBuffer);
                outputBuffer.position(bufferInfo.offset);
                int i = bufferInfo.size;
                byte[] bArr = new byte[(i + 7)];
                outputBuffer.get(bArr, 7, i);
                EncoderUtils.addADTStoPacket(bArr, this.mChannelCount);
                Logger.m144648v(TAG, "dequeue finish - " + bufferInfo.presentationTimeUs + "--" + bufferInfo.flags + " -- " + bufferInfo.size + "  -  " + dequeueOutputBuffer + " endUs = " + this.mSelectedTimeRange.getEndUs());
                write(bArr);
                this.mAudioEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                if (this.mStatus != 2) {
                    notifyProgressUpdate(bufferInfo.presentationTimeUs);
                    continue;
                } else {
                    notifyProgressUpdate(this.mSelectedTimeRange.getEndUs());
                    continue;
                }
            } else if (isFinish(bufferInfo)) {
                this.mStatus = 2;
                continue;
            } else if (!(dequeueOutputBuffer == -1 || dequeueOutputBuffer == -2)) {
                if ((bufferInfo.flags & 4) != 0) {
                    Logger.m144641d(TAG, "writeAudioFrame: BUFFER_FLAG_END_OF_STREAM " + bufferInfo.size + "/" + bufferInfo.presentationTimeUs);
                    this.mStatus = 2;
                    this.mAudioEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                    continue;
                } else {
                    this.mAudioEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                    continue;
                }
            }
        } while (dequeueOutputBuffer >= 0);
    }
}
