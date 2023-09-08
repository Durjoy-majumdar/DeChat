package com.tencent.tav.decoder;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import com.tencent.tav.codec.DefaultDecoderFactory;
import com.tencent.tav.codec.IDecoderFactory;
import com.tencent.tav.codec.IMediaCodec;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMPerformance;
import com.tencent.tav.coremedia.CMSampleState;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.IDecoderTrack;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.extractor.AssetExtractor;
import com.tencent.tav.report.AverageTimeReporter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class VideoDecoder implements IVideoDecoder {
    private static final int MAX_WAIT_TIME = 1000;
    public final String TAG;
    /* access modifiers changed from: private */
    public List<Long> allFrameTime;
    private MediaCodec.BufferInfo bufferInfo;
    private VideoCropInfo cropInfo;
    private CMSampleState currentDecoderState;
    private CMSampleState currentStartState;
    private final AverageTimeReporter decodeReporter;
    private IDecoderFactory decoderFactory;
    private CMTime duration;
    /* access modifiers changed from: private */
    public AssetExtractor extractor;
    private boolean extractorDone;
    /* access modifiers changed from: private */
    public long frameDurationUs;
    public boolean isReleased;
    public boolean lastFrameValid;
    private int lastOutputBufferIndex;
    private long mLastVideoQueueTime;
    private long mTimeOffset;
    private IMediaCodec mediaCodecWrapper;
    private MediaFormat mediaFormat;
    /* access modifiers changed from: private */
    public AssetExtractor mirrorExtractor;
    private ByteBuffer outputBuffer;
    private Surface outputSurface;
    private CMTime pFrameTime;
    private ArrayList<PendingFrame> pendingFrames;
    private long preReadCost;
    private CMTime preReadTime;
    private boolean readSampleFinish;
    private boolean started;
    /* access modifiers changed from: private */
    public CMTimeRange timeRange;
    private int trackIndex;
    private VideoTexture videoTexture;

    public static class PendingFrame {
        /* access modifiers changed from: private */
        public CMTime seekStartTime;
        /* access modifiers changed from: private */
        public long timeOffset;

        private PendingFrame() {
            this.timeOffset = 0;
            this.seekStartTime = CMTime.CMTimeZero;
        }
    }

    public class SampleTime {
        /* access modifiers changed from: private */
        public CMSampleState sampleState;
        /* access modifiers changed from: private */
        public long timeUs;

        private SampleTime() {
        }

        /* access modifiers changed from: private */
        public void fixCMTime() {
            if (this.sampleState.getTime().smallThan(CMTime.CMTimeZero)) {
                this.sampleState = new CMSampleState(CMTime.fromUs(VideoDecoder.this.frameDurationUs));
            }
        }

        public String toString() {
            return "SampleTime{sampleState=" + this.sampleState + ", timeUs=" + this.timeUs + '}';
        }
    }

    public VideoDecoder(String str) {
        this(str, (Surface) null, (VideoTexture) null, (IDecoderFactory) null);
    }

    private void clearDecoder() {
        String str = this.TAG;
        Logger.m144641d(str, "clearDecoder " + getSourcePath());
        releaseOutputBuffer();
        if (this.pendingFrames.size() != 0 || this.extractorDone) {
            try {
                this.mediaCodecWrapper.flush();
            } catch (Exception e) {
                Logger.m144644e(this.TAG, "flushDecoder", (Throwable) e);
            }
            this.pendingFrames.clear();
        }
        this.currentDecoderState = new CMSampleState();
    }

    private void createMirrorExtractor() {
        new Thread() {
            public void run() {
                try {
                    long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                    AssetExtractor assetExtractor = new AssetExtractor();
                    assetExtractor.setDataSource(VideoDecoder.this.extractor.getSourcePath());
                    while (assetExtractor.getSampleTrackIndex() != -1) {
                        assetExtractor.unselectTrack(assetExtractor.getSampleTrackIndex());
                    }
                    assetExtractor.selectTrack(DecoderUtils.getFirstTrackIndex(assetExtractor, "video/"));
                    assetExtractor.seekTo(VideoDecoder.this.timeRange == null ? 0 : VideoDecoder.this.timeRange.getStartUs(), 0);
                    ArrayList arrayList = new ArrayList();
                    while (assetExtractor.getSampleTime() != -1) {
                        arrayList.add(Long.valueOf(assetExtractor.getSampleTime()));
                        assetExtractor.advance();
                    }
                    VideoDecoder.this.allFrameTime.addAll(arrayList);
                    AssetExtractor unused = VideoDecoder.this.mirrorExtractor = assetExtractor;
                    String str = VideoDecoder.this.TAG;
                    Logger.m144641d(str, "Decoder: MirrorExtractor Init " + (SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
                } catch (Exception e) {
                    Logger.m144644e(VideoDecoder.this.TAG, "createMirrorExtractor", (Throwable) e);
                }
            }
        }.start();
    }

    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r6v9 */
    private void doReadFrames(SampleTime sampleTime, CMTime cMTime, boolean z) {
        int dequeueOutputBuffer;
        int i;
        SampleTime sampleTime2 = sampleTime;
        CMTime cMTime2 = cMTime;
        boolean z2 = z;
        long currentTimeMillis = System.currentTimeMillis();
        String str = this.TAG;
        Logger.m144648v(str, "doReadFrames() called with: sampleTime = [" + sampleTime2 + "], targetTime = [" + cMTime2 + "], justCache = [" + z2 + "]");
        if (this.pendingFrames.size() == 0 && this.extractorDone) {
            Logger.m144646i(this.TAG, "doReadFrames:[unRead]pendingFrames.size() == 0 && extractorDone");
        }
        ? r6 = 0;
        int i2 = 0;
        while (true) {
            if (this.pendingFrames.size() <= 0 && this.extractorDone) {
                break;
            }
            if (!this.extractorDone) {
                sampleTime.sampleState.performance = readFromExtractor();
            }
            this.bufferInfo.set(0, 0, 0, 0);
            dequeueOutputBuffer = this.mediaCodecWrapper.dequeueOutputBuffer(this.bufferInfo, 1000);
            Trace.endSection();
            String str2 = this.TAG;
            Logger.m144648v(str2, "doReadFrames outputBufferIndex:" + dequeueOutputBuffer + ", presentationTimeUs:" + this.bufferInfo.presentationTimeUs);
            MediaCodec.BufferInfo bufferInfo2 = this.bufferInfo;
            if ((bufferInfo2.flags & 4) != 0) {
                if (bufferInfo2.size > 0 && dequeueOutputBuffer >= 0 && this.pendingFrames.size() > 0) {
                    this.pendingFrames.remove(r6);
                    this.mediaCodecWrapper.releaseOutputBuffer(dequeueOutputBuffer, true);
                }
                Logger.m144646i(this.TAG, "doReadFrames:[finish] bufferInfo.flags == MediaCodec.BUFFER_FLAG_END_OF_STREAM");
                CMSampleState unused = sampleTime2.sampleState = CMSampleState.fromError(-1);
                return;
            }
            if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.mediaCodecWrapper.getOutputFormat();
                this.cropInfo = new VideoCropInfo();
                if (outputFormat.containsKey("width") && outputFormat.containsKey("height")) {
                    this.cropInfo.width = outputFormat.getInteger("width");
                    this.cropInfo.height = outputFormat.getInteger("height");
                }
                if (outputFormat.containsKey("crop-left") && outputFormat.containsKey("crop-right") && outputFormat.containsKey("crop-top") && outputFormat.containsKey("crop-bottom")) {
                    this.cropInfo.cropLeft = outputFormat.getInteger("crop-left");
                    this.cropInfo.cropTop = outputFormat.getInteger("crop-top");
                    this.cropInfo.cropRight = outputFormat.getInteger("crop-right") + 1;
                    this.cropInfo.cropBottom = outputFormat.getInteger("crop-bottom") + 1;
                }
                String str3 = this.TAG;
                Object[] objArr = new Object[7];
                objArr[r6] = Integer.valueOf(this.cropInfo.width);
                objArr[1] = Integer.valueOf(this.cropInfo.height);
                objArr[2] = Integer.valueOf(this.cropInfo.cropLeft);
                objArr[3] = Integer.valueOf(this.cropInfo.cropTop);
                objArr[4] = Integer.valueOf(this.cropInfo.cropRight);
                objArr[5] = Integer.valueOf(this.cropInfo.cropBottom);
                objArr[6] = outputFormat;
                Logger.m144646i(str3, String.format("newFormat size:[%d,%d], crop:[%d,%d,%d,%d], newFormat:%s", objArr));
                VideoTexture videoTexture2 = this.videoTexture;
                if (videoTexture2 != null) {
                    videoTexture2.setCropInfo(this.cropInfo);
                }
            }
            if (dequeueOutputBuffer < 0 || this.pendingFrames.size() <= 0) {
                int i3 = i2;
                if (dequeueOutputBuffer >= 0) {
                    String str4 = this.TAG;
                    Logger.m144649w(str4, "doReadFrames:[failed] pendingFrames.size() == " + this.pendingFrames.size());
                    this.mediaCodecWrapper.releaseOutputBuffer(dequeueOutputBuffer, false);
                    CMSampleState unused2 = sampleTime2.sampleState = CMSampleState.fromError(-2);
                }
                int i4 = i3 + 1;
                if (i4 > 1000) {
                    Logger.m144643e(this.TAG, "doReadFrames: [timeout] ");
                    CMSampleState unused3 = sampleTime2.sampleState = CMSampleState.fromError(-4);
                    break;
                }
                i2 = i4;
            } else {
                if (this.bufferInfo.size <= 0) {
                    this.mediaCodecWrapper.releaseOutputBuffer(dequeueOutputBuffer, r6);
                    String str5 = this.TAG;
                    Logger.m144643e(str5, "doReadFrames:[failed] bufferInfo.size == " + this.bufferInfo.size);
                    CMSampleState unused4 = sampleTime2.sampleState = CMSampleState.fromError(-2);
                    i = i2;
                } else {
                    PendingFrame remove = this.pendingFrames.remove(r6);
                    long unused5 = sampleTime2.timeUs = this.bufferInfo.presentationTimeUs - remove.timeOffset;
                    CMSampleState unused6 = sampleTime2.sampleState = new CMSampleState(new CMTime((((float) sampleTime.timeUs) * 1.0f) / ((float) TimeUnit.SECONDS.toMicros(1)))).inherit(sampleTime.sampleState);
                    boolean z3 = this.pendingFrames.isEmpty() && this.extractorDone;
                    if (!z3) {
                        i = i2;
                        if (remove.seekStartTime.getTimeUs() > sampleTime.timeUs + (this.frameDurationUs / 2)) {
                            this.mediaCodecWrapper.releaseOutputBuffer(dequeueOutputBuffer, false);
                            Logger.m144648v(this.TAG, "doReadFrames:[failed] pendingFrame.seekStartTime.getTimeUs() > sampleTime.timeUs");
                            CMSampleState unused7 = sampleTime2.sampleState = CMSampleState.fromError(-2);
                        }
                    } else {
                        i = i2;
                    }
                    if (this.outputSurface == null || z2) {
                        this.lastOutputBufferIndex = dequeueOutputBuffer;
                        ByteBuffer outputBuffer2 = this.mediaCodecWrapper.getOutputBuffer(dequeueOutputBuffer);
                    } else {
                        if (z3) {
                            CMSampleState unused8 = sampleTime2.sampleState = new CMSampleState(this.duration);
                        }
                        boolean z4 = cMTime.getTimeUs() - sampleTime.sampleState.getTime().getTimeUs() <= this.frameDurationUs / 2;
                        boolean z5 = cMTime.getTimeUs() >= this.duration.getTimeUs();
                        if (z4 || z5 || z3) {
                            this.mediaCodecWrapper.releaseOutputBuffer(dequeueOutputBuffer, true);
                            sampleTime.sampleState.performance.markEnd();
                            sampleTime.fixCMTime();
                        } else {
                            this.mediaCodecWrapper.releaseOutputBuffer(dequeueOutputBuffer, false);
                            String str6 = this.TAG;
                            Logger.m144648v(str6, "doReadFrames:[failed] targetTime.getTimeUs() - sampleTime.cmTime.getTimeUs() == " + (cMTime.getTimeUs() - sampleTime.sampleState.getTime().getTimeUs()) + " targetTime = " + cMTime2 + "  duration = " + this.duration + " pendingFrames.size() = " + this.pendingFrames.size() + " extractorDone = " + this.extractorDone);
                            CMSampleState unused9 = sampleTime2.sampleState = CMSampleState.fromError(-2);
                        }
                    }
                }
                i2 = i;
            }
            r6 = 0;
        }
        this.lastOutputBufferIndex = dequeueOutputBuffer;
        ByteBuffer outputBuffer22 = this.mediaCodecWrapper.getOutputBuffer(dequeueOutputBuffer);
        if (outputBuffer22 != null) {
            outputBuffer22.position(this.bufferInfo.offset);
            MediaCodec.BufferInfo bufferInfo3 = this.bufferInfo;
            outputBuffer22.limit(bufferInfo3.offset + bufferInfo3.size);
            this.outputBuffer = outputBuffer22;
            sampleTime.fixCMTime();
            if (this.extractorDone && sampleTime.timeUs < 0 && !z2) {
                String str7 = this.TAG;
                Logger.m144646i(str7, "doReadFrames: extractorDone && sampleTime.timeUs < 0, sampleTime = " + sampleTime2);
                CMSampleState unused10 = sampleTime2.sampleState = CMSampleState.fromError(-1);
            }
            String str8 = this.TAG;
            Logger.m144646i(str8, "readFrameCost " + (System.currentTimeMillis() - currentTimeMillis));
            return;
        }
        this.mediaCodecWrapper.releaseOutputBuffer(dequeueOutputBuffer, false);
        String str9 = this.TAG;
        Logger.m144643e(str9, "doReadFrames:[error] " + this.bufferInfo.size + " byteBuffer==null");
        CMSampleState unused11 = sampleTime2.sampleState = CMSampleState.fromError(-3);
    }

    private synchronized CMSampleState doReadSample(CMTime cMTime, boolean z) {
        boolean z2 = true;
        if (!cMTime.bigThan(this.timeRange.getDuration()) || z) {
            if (this.extractorDone && this.pendingFrames.size() == 0 && this.timeRange.containsTime(cMTime) && !this.readSampleFinish) {
                Logger.m144649w(this.TAG, "error state , and will go correct it ! ");
            }
            this.preReadTime = CMTime.CMTimeInvalid;
            if (this.started) {
                if (this.trackIndex != -1) {
                    releaseOutputBuffer();
                    SampleTime sampleTime = new SampleTime();
                    CMSampleState unused = sampleTime.sampleState = CMSampleState.fromError(-2);
                    long unused2 = sampleTime.timeUs = -2;
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        doReadFrames(sampleTime, cMTime, z);
                        this.decodeReporter.add(System.currentTimeMillis() - currentTimeMillis);
                        String str = this.TAG;
                        Logger.m144648v(str, "doReadSample:[success] " + this.extractorDone + " " + sampleTime.timeUs + "  " + sampleTime.sampleState);
                        return sampleTime.sampleState;
                    } catch (Exception e) {
                        return onReadFramesException(e);
                    }
                }
            }
            String str2 = this.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("doReadSample:[unStart]  !started || trackIndex == -1 ");
            sb.append(!this.started);
            sb.append(" - ");
            if (this.trackIndex != -1) {
                z2 = false;
            }
            sb.append(z2);
            Logger.m144643e(str2, sb.toString());
            return CMSampleState.fromError(-100);
        }
        String str3 = this.TAG;
        Logger.m144646i(str3, "doReadSample:[finish] targetTime.bigThan(timeRange.getDuration()) is" + cMTime.bigThan(this.timeRange.getDuration()) + "&& !justCache is" + true);
        return CMSampleState.fromError(-1);
    }

    private boolean hasPreReadAndFirstFrameSeek(CMTime cMTime) {
        return cMTime == CMTime.CMTimeZero && this.preReadTime != CMTime.CMTimeInvalid && this.lastOutputBufferIndex != -1 && !this.currentDecoderState.isInvalid();
    }

    private boolean initExtractor(String str) {
        AssetExtractor assetExtractor = new AssetExtractor();
        this.extractor = assetExtractor;
        assetExtractor.setDataSource(str);
        while (this.extractor.getSampleTrackIndex() != -1) {
            AssetExtractor assetExtractor2 = this.extractor;
            assetExtractor2.unselectTrack(assetExtractor2.getSampleTrackIndex());
        }
        int firstTrackIndex = DecoderUtils.getFirstTrackIndex(this.extractor, "video/");
        this.trackIndex = firstTrackIndex;
        if (firstTrackIndex == -1) {
            this.outputSurface = null;
            this.outputBuffer = null;
            return false;
        }
        this.extractor.selectTrack(firstTrackIndex);
        return true;
    }

    private boolean moreCloseCurrentThenSeek(CMTime cMTime) {
        if (this.mirrorExtractor == null) {
            return false;
        }
        long timeUs = this.currentDecoderState.getTime().getTimeUs();
        this.mirrorExtractor.seekTo(cMTime.getTimeUs(), 2);
        if (this.mirrorExtractor.getSampleTime() > cMTime.getTimeUs()) {
            this.mirrorExtractor.seekTo(cMTime.getTimeUs(), 0);
        }
        long sampleTime = this.mirrorExtractor.getSampleTime();
        return sampleTime <= timeUs && this.currentDecoderState.getTime().getTimeUs() >= sampleTime && this.currentDecoderState.getTime().getTimeUs() < cMTime.getTimeUs() + this.pFrameTime.getTimeUs() && timeUs <= cMTime.getTimeUs();
    }

    private CMSampleState onReadFramesException(Exception exc) {
        Logger.m144644e(this.TAG, "onReadFramesException: ", (Throwable) exc);
        if (!(exc instanceof MediaCodec.CodecException)) {
            return CMSampleState.fromError(-3);
        }
        MediaCodec.CodecException codecException = (MediaCodec.CodecException) exc;
        if (codecException.isRecoverable()) {
            releaseOutputBuffer();
            this.mediaCodecWrapper.reset();
            this.lastOutputBufferIndex = -1;
            this.pendingFrames.clear();
            this.extractor.seekTo(this.currentStartState.getTime().getTimeUs() - this.timeRange.getStartUs(), 0);
            this.extractorDone = false;
            return CMSampleState.fromError(-3);
        }
        if (codecException.isTransient()) {
            Logger.m144643e(this.TAG, "doReadSample:[error] isTransient() is true");
        }
        Logger.m144643e(this.TAG, "doReadSample:[error] retry failed");
        return CMSampleState.fromError(-3);
    }

    private synchronized void preReadSample() {
        this.lastFrameValid = false;
        CMSampleState doReadSample = doReadSample(CMTime.CMTimeInvalid, true);
        this.currentDecoderState = doReadSample;
        if (!doReadSample.getTime().smallThan(CMTime.CMTimeZero)) {
            this.currentDecoderState = this.currentStartState;
        }
        this.preReadTime = this.currentDecoderState.getTime();
        String str = this.TAG;
        Logger.m144646i(str, "preReadSample: " + getSourcePath() + " preReadTime = " + this.preReadTime + ", lastOutputBufferIndex = " + this.lastOutputBufferIndex);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009a, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.tencent.tav.coremedia.CMPerformance readFromExtractor() {
        /*
            r13 = this;
            monitor-enter(r13)
            com.tencent.tav.extractor.AssetExtractor r0 = r13.extractor     // Catch:{ all -> 0x009b }
            long r0 = r0.getSampleTime()     // Catch:{ all -> 0x009b }
            java.lang.String r2 = r13.TAG     // Catch:{ all -> 0x009b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r3.<init>()     // Catch:{ all -> 0x009b }
            java.lang.String r4 = "doReadFrames readFromExtractor sampleTime:"
            r3.append(r4)     // Catch:{ all -> 0x009b }
            r3.append(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r4 = ", timeRangeEnd:"
            r3.append(r4)     // Catch:{ all -> 0x009b }
            com.tencent.tav.coremedia.CMTimeRange r4 = r13.timeRange     // Catch:{ all -> 0x009b }
            long r4 = r4.getEndUs()     // Catch:{ all -> 0x009b }
            r3.append(r4)     // Catch:{ all -> 0x009b }
            java.lang.String r4 = ", trackIndex: "
            r3.append(r4)     // Catch:{ all -> 0x009b }
            com.tencent.tav.extractor.AssetExtractor r4 = r13.extractor     // Catch:{ all -> 0x009b }
            int r4 = r4.getSampleTrackIndex()     // Catch:{ all -> 0x009b }
            r3.append(r4)     // Catch:{ all -> 0x009b }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x009b }
            com.tencent.tav.decoder.logger.Logger.m144648v(r2, r3)     // Catch:{ all -> 0x009b }
            com.tencent.tav.coremedia.CMTimeRange r2 = r13.timeRange     // Catch:{ all -> 0x009b }
            long r2 = r2.getEndUs()     // Catch:{ all -> 0x009b }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0059
            com.tencent.tav.extractor.AssetExtractor r2 = r13.extractor     // Catch:{ all -> 0x009b }
            int r2 = r2.getSampleTrackIndex()     // Catch:{ all -> 0x009b }
            r3 = -1
            if (r2 == r3) goto L_0x0059
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0053
            goto L_0x0059
        L_0x0053:
            com.tencent.tav.coremedia.CMPerformance r0 = r13.readSampleData()     // Catch:{ all -> 0x009b }
            monitor-exit(r13)
            return r0
        L_0x0059:
            com.tencent.tav.coremedia.CMPerformance r2 = new com.tencent.tav.coremedia.CMPerformance     // Catch:{ all -> 0x009b }
            r2.<init>()     // Catch:{ all -> 0x009b }
            com.tencent.tav.coremedia.CMTimeRange r3 = r13.timeRange     // Catch:{ all -> 0x009b }
            long r3 = r3.getEndUs()     // Catch:{ all -> 0x009b }
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x006c
            com.tencent.tav.coremedia.CMPerformance r2 = r13.readSampleData()     // Catch:{ all -> 0x009b }
        L_0x006c:
            com.tencent.tav.codec.IMediaCodec r3 = r13.mediaCodecWrapper     // Catch:{ all -> 0x009b }
            r4 = 1000(0x3e8, double:4.94E-321)
            int r7 = r3.dequeueInputBuffer(r4)     // Catch:{ all -> 0x009b }
            if (r7 < 0) goto L_0x0099
            java.lang.String r3 = r13.TAG     // Catch:{ all -> 0x009b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r4.<init>()     // Catch:{ all -> 0x009b }
            java.lang.String r5 = "doReadFrames readFromExtractor queue end of steam sampleTime:"
            r4.append(r5)     // Catch:{ all -> 0x009b }
            r4.append(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x009b }
            com.tencent.tav.decoder.logger.Logger.m144648v(r3, r0)     // Catch:{ all -> 0x009b }
            com.tencent.tav.codec.IMediaCodec r6 = r13.mediaCodecWrapper     // Catch:{ all -> 0x009b }
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 4
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x009b }
            r0 = 1
            r13.extractorDone = r0     // Catch:{ all -> 0x009b }
        L_0x0099:
            monitor-exit(r13)
            return r2
        L_0x009b:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.VideoDecoder.readFromExtractor():com.tencent.tav.coremedia.CMPerformance");
    }

    private CMPerformance readSampleData() {
        long sampleTime = this.extractor.getSampleTime();
        CMPerformance cMPerformance = new CMPerformance(CMPerformance.CMPerformanceStage.DECODE_WAIT);
        cMPerformance.markStart();
        Trace.beginSection("decode-wait");
        int dequeueInputBuffer = this.mediaCodecWrapper.dequeueInputBuffer(1000);
        Trace.endSection();
        if (dequeueInputBuffer >= 0) {
            cMPerformance.markEnd();
            CMPerformance cMPerformance2 = new CMPerformance(CMPerformance.CMPerformanceStage.EXTRACTOR);
            cMPerformance2.addPreNode(cMPerformance);
            cMPerformance2.markStart();
            int readSampleData = this.extractor.readSampleData(this.mediaCodecWrapper.getInputBuffer(dequeueInputBuffer), 0);
            cMPerformance2.markEnd();
            if (readSampleData >= 0) {
                this.mLastVideoQueueTime = (sampleTime - this.timeRange.getStartUs()) + this.mTimeOffset;
                String str = this.TAG;
                Logger.m144648v(str, "doReadFrames readSampleData queueInputBuffer sampleTime:" + sampleTime);
                this.mediaCodecWrapper.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.mLastVideoQueueTime, 0);
                Trace.beginSection("decode");
                CMPerformance cMPerformance3 = new CMPerformance(CMPerformance.CMPerformanceStage.DECODE);
                cMPerformance3.preNodes.add(cMPerformance2);
                cMPerformance3.markStart();
                PendingFrame pendingFrame = new PendingFrame();
                long unused = pendingFrame.timeOffset = this.mTimeOffset;
                CMTime unused2 = pendingFrame.seekStartTime = this.currentStartState.getTime();
                this.pendingFrames.add(pendingFrame);
                cMPerformance = cMPerformance3;
            } else {
                cMPerformance = cMPerformance2;
            }
            this.extractor.advance();
        }
        return cMPerformance;
    }

    private CMSampleState renderCacheBuffer() {
        String str = this.TAG;
        Logger.m144648v(str, "renderCacheBuffer: cache hit - " + this.currentDecoderState);
        try {
            this.mediaCodecWrapper.releaseOutputBuffer(this.lastOutputBufferIndex, true);
            this.lastOutputBufferIndex = -1;
            if (this.currentDecoderState.getTime().bigThan(this.timeRange.getEnd())) {
                this.currentDecoderState = CMSampleState.fromError(-1);
                this.pendingFrames.clear();
                this.extractorDone = true;
            }
            CMSampleState cMSampleState = this.currentDecoderState;
            cMSampleState.performance.stage = CMPerformance.CMPerformanceStage.DECODE_CACHE;
            return cMSampleState;
        } catch (Exception e) {
            Logger.m144644e(this.TAG, "renderCacheBuffer: ", (Throwable) e);
            return CMSampleState.fromError(-2);
        }
    }

    private synchronized void seekExtractorTo(long j) {
        this.extractor.seekTo(j, 2);
        if (this.extractor.getSampleTime() > j) {
            this.extractor.seekTo(j, 0);
        }
        clearDecoder();
        this.mTimeOffset = this.mLastVideoQueueTime + 10000000;
    }

    public void finalize() {
        super.finalize();
        release(false);
    }

    public VideoCropInfo getCropInfo() {
        return this.cropInfo;
    }

    public AverageTimeReporter getDecodePerformance() {
        return this.decodeReporter;
    }

    public long getPreReadCost() {
        return this.preReadCost;
    }

    public String getSourcePath() {
        AssetExtractor assetExtractor = this.extractor;
        if (assetExtractor == null) {
            return null;
        }
        return assetExtractor.getSourcePath();
    }

    public TextureInfo getTextureInfo() {
        return null;
    }

    public synchronized boolean hasTrack() {
        return this.trackIndex != -1;
    }

    public void init(String str, CGSize cGSize, IDecoderTrack.SurfaceCreator surfaceCreator) {
    }

    public boolean isLastFrameValid() {
        return this.lastFrameValid;
    }

    public boolean isStarted() {
        return this.started;
    }

    public CMTime nextFrameTime(CMTime cMTime) {
        long timeUs = cMTime.getTimeUs();
        for (Long longValue : this.allFrameTime) {
            long longValue2 = longValue.longValue();
            if (timeUs < longValue2) {
                return new CMTime((((float) longValue2) / 1000.0f) / 1000.0f);
            }
        }
        return this.currentDecoderState.getTime().add(this.pFrameTime);
    }

    public synchronized ByteBuffer outputBuffer() {
        return this.outputBuffer;
    }

    public synchronized Surface outputSurface() {
        return this.outputSurface;
    }

    public synchronized CMSampleState readSample() {
        return readSample(CMTime.CMTimeInvalid);
    }

    public void release() {
    }

    public synchronized void release(boolean z) {
        if (!this.isReleased) {
            String str = this.TAG;
            Logger.m144646i(str, "release:start " + z);
            if (z) {
                this.extractor.dispose();
                this.extractor = null;
            }
            AssetExtractor assetExtractor = this.mirrorExtractor;
            if (assetExtractor != null) {
                assetExtractor.dispose();
                this.mirrorExtractor = null;
            }
            this.started = false;
            this.isReleased = true;
            IMediaCodec iMediaCodec = this.mediaCodecWrapper;
            if (iMediaCodec != null) {
                iMediaCodec.release();
            }
            String str2 = this.TAG;
            Logger.m144646i(str2, "release:end " + z);
            String str3 = this.TAG;
            Logger.m144646i(str3, "decode performance:" + this.decodeReporter);
        }
    }

    public void releaseOutputBuffer() {
        int i = this.lastOutputBufferIndex;
        if (i != -1) {
            try {
                this.mediaCodecWrapper.releaseOutputBuffer(i, false);
            } catch (Exception e) {
                Logger.m144644e(this.TAG, "releaseOutputBuffer", (Throwable) e);
            }
            this.lastOutputBufferIndex = -1;
        }
        this.outputBuffer = null;
    }

    public synchronized void seekTo(CMTime cMTime) {
        seekTo(cMTime, true);
    }

    public synchronized void start(CMTimeRange cMTimeRange) {
        start(cMTimeRange, CMTime.CMTimeZero);
    }

    public void switchFrame() {
    }

    public VideoDecoder(String str, Surface surface, VideoTexture videoTexture2, IDecoderFactory iDecoderFactory) {
        String str2 = "VideoDecoder@" + Integer.toHexString(hashCode());
        this.TAG = str2;
        this.frameDurationUs = 33333;
        this.duration = CMTime.CMTimeZero;
        this.pFrameTime = new CMTime(20, 600);
        this.trackIndex = -1;
        this.bufferInfo = new MediaCodec.BufferInfo();
        this.outputBuffer = null;
        this.currentDecoderState = new CMSampleState();
        this.preReadTime = CMTime.CMTimeInvalid;
        this.pendingFrames = new ArrayList<>();
        this.allFrameTime = new ArrayList();
        this.isReleased = false;
        this.started = false;
        this.lastFrameValid = false;
        this.lastOutputBufferIndex = -1;
        this.preReadCost = 0;
        this.decodeReporter = new AverageTimeReporter();
        this.mTimeOffset = 10000000;
        this.mLastVideoQueueTime = 0;
        this.currentStartState = new CMSampleState();
        this.extractorDone = false;
        this.readSampleFinish = false;
        Logger.m144641d(str2, "create VideoDecoder start");
        if (iDecoderFactory != null) {
            this.decoderFactory = iDecoderFactory;
        } else {
            this.decoderFactory = new DefaultDecoderFactory();
        }
        if (surface != null) {
            this.outputSurface = surface;
        }
        if (videoTexture2 != null) {
            this.videoTexture = videoTexture2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (initExtractor(str)) {
            createMirrorExtractor();
            this.mediaFormat = this.extractor.getTrackFormat(this.trackIndex);
            this.duration = new CMTime((((float) this.extractor.getDuration()) * 1.0f) / ((float) TimeUnit.SECONDS.toMicros(1)));
            if (this.mediaFormat.containsKey("frame-rate")) {
                int integer = this.mediaFormat.getInteger("frame-rate");
                this.pFrameTime = new CMTime((long) (600 / integer), 600);
                this.frameDurationUs = (long) (1000000 / integer);
            }
            IMediaCodec createVideoDecoder = this.decoderFactory.createVideoDecoder(this.mediaFormat.getString("mime"));
            this.mediaCodecWrapper = createVideoDecoder;
            this.extractor.setIsSoft(createVideoDecoder.isSoft());
            this.mediaCodecWrapper.setDataSource(str);
            this.mediaCodecWrapper.configure(this.mediaFormat, surface, (MediaCrypto) null, 0);
            this.mediaCodecWrapper.bindSurfaceTexture(this.videoTexture.surfaceTexture());
            this.mediaCodecWrapper.start();
            Logger.m144641d(str2, "create VideoDecoder end " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c2 A[DONT_GENERATE, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.tencent.tav.coremedia.CMSampleState readSample(com.tencent.tav.coremedia.CMTime r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = r7.TAG     // Catch:{ all -> 0x011a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x011a }
            r1.<init>()     // Catch:{ all -> 0x011a }
            java.lang.String r2 = "readSample: "
            r1.append(r2)     // Catch:{ all -> 0x011a }
            r1.append(r8)     // Catch:{ all -> 0x011a }
            java.lang.String r2 = ", currentDecoderTime = "
            r1.append(r2)     // Catch:{ all -> 0x011a }
            com.tencent.tav.coremedia.CMSampleState r2 = r7.currentDecoderState     // Catch:{ all -> 0x011a }
            r1.append(r2)     // Catch:{ all -> 0x011a }
            java.lang.String r2 = ",  extractor.getSampleTime() = "
            r1.append(r2)     // Catch:{ all -> 0x011a }
            com.tencent.tav.extractor.AssetExtractor r2 = r7.extractor     // Catch:{ all -> 0x011a }
            long r2 = r2.getSampleTime()     // Catch:{ all -> 0x011a }
            r1.append(r2)     // Catch:{ all -> 0x011a }
            java.lang.String r2 = ", lastOutputBufferIndex = "
            r1.append(r2)     // Catch:{ all -> 0x011a }
            int r2 = r7.lastOutputBufferIndex     // Catch:{ all -> 0x011a }
            r1.append(r2)     // Catch:{ all -> 0x011a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x011a }
            com.tencent.tav.decoder.logger.Logger.m144648v(r0, r1)     // Catch:{ all -> 0x011a }
            r0 = 0
            r7.lastFrameValid = r0     // Catch:{ all -> 0x011a }
            android.view.Surface r1 = r7.outputSurface()     // Catch:{ all -> 0x011a }
            r2 = 1
            if (r1 == 0) goto L_0x004a
            int r1 = r7.lastOutputBufferIndex     // Catch:{ all -> 0x011a }
            r3 = -1
            if (r1 == r3) goto L_0x004a
            r1 = 1
            goto L_0x004b
        L_0x004a:
            r1 = 0
        L_0x004b:
            com.tencent.tav.coremedia.CMSampleState r3 = r7.currentDecoderState     // Catch:{ all -> 0x011a }
            com.tencent.tav.coremedia.CMTime r3 = r3.getTime()     // Catch:{ all -> 0x011a }
            boolean r3 = r3.smallThan(r8)     // Catch:{ all -> 0x011a }
            if (r3 == 0) goto L_0x0066
            boolean r3 = r7.extractorDone     // Catch:{ all -> 0x011a }
            if (r3 == 0) goto L_0x0064
            java.util.ArrayList<com.tencent.tav.decoder.VideoDecoder$PendingFrame> r3 = r7.pendingFrames     // Catch:{ all -> 0x011a }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x011a }
            if (r3 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r3 = 0
            goto L_0x0067
        L_0x0066:
            r3 = 1
        L_0x0067:
            if (r1 == 0) goto L_0x0071
            if (r3 == 0) goto L_0x0071
            com.tencent.tav.coremedia.CMSampleState r8 = r7.renderCacheBuffer()     // Catch:{ all -> 0x011a }
            monitor-exit(r7)
            return r8
        L_0x0071:
            com.tencent.tav.coremedia.CMSampleState r1 = r7.doReadSample(r8, r0)     // Catch:{ all -> 0x011a }
            com.tencent.tav.coremedia.CMSampleState r3 = r7.currentDecoderState     // Catch:{ all -> 0x011a }
            boolean r3 = r3.isInvalid()     // Catch:{ all -> 0x011a }
            r4 = -1
            if (r3 != 0) goto L_0x00c2
            com.tencent.tav.coremedia.CMTime r3 = r1.getTime()     // Catch:{ all -> 0x011a }
            com.tencent.tav.coremedia.CMTimeRange r6 = r7.timeRange     // Catch:{ all -> 0x011a }
            com.tencent.tav.coremedia.CMTime r6 = r6.getDuration()     // Catch:{ all -> 0x011a }
            boolean r3 = r3.bigThan(r6)     // Catch:{ all -> 0x011a }
            if (r3 == 0) goto L_0x00c2
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r4)     // Catch:{ all -> 0x011a }
            r7.currentDecoderState = r0     // Catch:{ all -> 0x011a }
            java.util.ArrayList<com.tencent.tav.decoder.VideoDecoder$PendingFrame> r0 = r7.pendingFrames     // Catch:{ all -> 0x011a }
            r0.clear()     // Catch:{ all -> 0x011a }
            r7.extractorDone = r2     // Catch:{ all -> 0x011a }
            java.lang.String r0 = r7.TAG     // Catch:{ all -> 0x011a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x011a }
            r1.<init>()     // Catch:{ all -> 0x011a }
            java.lang.String r3 = "readSample: finish "
            r1.append(r3)     // Catch:{ all -> 0x011a }
            r1.append(r8)     // Catch:{ all -> 0x011a }
            java.lang.String r8 = "  -  "
            r1.append(r8)     // Catch:{ all -> 0x011a }
            com.tencent.tav.coremedia.CMSampleState r8 = r7.currentDecoderState     // Catch:{ all -> 0x011a }
            r1.append(r8)     // Catch:{ all -> 0x011a }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x011a }
            com.tencent.tav.decoder.logger.Logger.m144648v(r0, r8)     // Catch:{ all -> 0x011a }
            r7.readSampleFinish = r2     // Catch:{ all -> 0x011a }
            com.tencent.tav.coremedia.CMSampleState r8 = r7.currentDecoderState     // Catch:{ all -> 0x011a }
            monitor-exit(r7)
            return r8
        L_0x00c2:
            r7.currentDecoderState = r1     // Catch:{ all -> 0x011a }
            r3 = 2
            long[] r3 = new long[r3]     // Catch:{ all -> 0x011a }
            r3[r0] = r4     // Catch:{ all -> 0x011a }
            r4 = -4
            r3[r2] = r4     // Catch:{ all -> 0x011a }
            boolean r0 = r1.stateMatchingTo(r3)     // Catch:{ all -> 0x011a }
            if (r0 != 0) goto L_0x00e1
            com.tencent.tav.coremedia.CMSampleState r0 = r7.currentDecoderState     // Catch:{ all -> 0x011a }
            com.tencent.tav.coremedia.CMTime r0 = r0.getTime()     // Catch:{ all -> 0x011a }
            com.tencent.tav.coremedia.CMTime r2 = r7.duration     // Catch:{ all -> 0x011a }
            boolean r0 = r0.smallThan(r2)     // Catch:{ all -> 0x011a }
            if (r0 != 0) goto L_0x00e4
        L_0x00e1:
            r7.clearDecoder()     // Catch:{ all -> 0x011a }
        L_0x00e4:
            java.lang.String r0 = r7.TAG     // Catch:{ all -> 0x011a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x011a }
            r2.<init>()     // Catch:{ all -> 0x011a }
            java.lang.String r3 = "readSample: finish flag = "
            r2.append(r3)     // Catch:{ all -> 0x011a }
            boolean r3 = r7.lastFrameValid     // Catch:{ all -> 0x011a }
            r2.append(r3)     // Catch:{ all -> 0x011a }
            java.lang.String r3 = " - "
            r2.append(r3)     // Catch:{ all -> 0x011a }
            boolean r3 = r7.extractorDone     // Catch:{ all -> 0x011a }
            r2.append(r3)     // Catch:{ all -> 0x011a }
            java.lang.String r3 = ", time = "
            r2.append(r3)     // Catch:{ all -> 0x011a }
            r2.append(r8)     // Catch:{ all -> 0x011a }
            java.lang.String r8 = "  -  "
            r2.append(r8)     // Catch:{ all -> 0x011a }
            com.tencent.tav.coremedia.CMSampleState r8 = r7.currentDecoderState     // Catch:{ all -> 0x011a }
            r2.append(r8)     // Catch:{ all -> 0x011a }
            java.lang.String r8 = r2.toString()     // Catch:{ all -> 0x011a }
            com.tencent.tav.decoder.logger.Logger.m144648v(r0, r8)     // Catch:{ all -> 0x011a }
            monitor-exit(r7)
            return r1
        L_0x011a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.VideoDecoder.readSample(com.tencent.tav.coremedia.CMTime):com.tencent.tav.coremedia.CMSampleState");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void seekTo(com.tencent.tav.coremedia.CMTime r4, boolean r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.TAG     // Catch:{ all -> 0x00af }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            r1.<init>()     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "seekTo: "
            r1.append(r2)     // Catch:{ all -> 0x00af }
            r1.append(r4)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "  - "
            r1.append(r2)     // Catch:{ all -> 0x00af }
            r1.append(r3)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "  "
            r1.append(r2)     // Catch:{ all -> 0x00af }
            com.tencent.tav.coremedia.CMSampleState r2 = r3.currentStartState     // Catch:{ all -> 0x00af }
            r1.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "  "
            r1.append(r2)     // Catch:{ all -> 0x00af }
            com.tencent.tav.coremedia.CMSampleState r2 = r3.currentDecoderState     // Catch:{ all -> 0x00af }
            r1.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00af }
            com.tencent.tav.decoder.logger.Logger.m144648v(r0, r1)     // Catch:{ all -> 0x00af }
            boolean r0 = r3.started     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x00a6
            int r0 = r3.trackIndex     // Catch:{ all -> 0x00af }
            r1 = -1
            if (r0 != r1) goto L_0x003d
            goto L_0x00a6
        L_0x003d:
            com.tencent.tav.coremedia.CMTime r0 = com.tencent.tav.coremedia.CMTime.CMTimeZero     // Catch:{ all -> 0x00af }
            boolean r1 = r4.smallThan(r0)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0046
            r4 = r0
        L_0x0046:
            com.tencent.tav.coremedia.CMTimeRange r0 = r3.timeRange     // Catch:{ all -> 0x00af }
            com.tencent.tav.coremedia.CMTime r0 = r0.getStart()     // Catch:{ all -> 0x00af }
            com.tencent.tav.coremedia.CMTime r0 = r0.add((com.tencent.tav.coremedia.CMTime) r4)     // Catch:{ all -> 0x00af }
            if (r5 == 0) goto L_0x0058
            boolean r5 = r3.moreCloseCurrentThenSeek(r4)     // Catch:{ all -> 0x00af }
            if (r5 != 0) goto L_0x00a4
        L_0x0058:
            com.tencent.tav.coremedia.CMSampleState r5 = r3.currentDecoderState     // Catch:{ all -> 0x00af }
            com.tencent.tav.coremedia.CMTime r5 = r5.getTime()     // Catch:{ all -> 0x00af }
            boolean r5 = r4.equalsTo(r5)     // Catch:{ all -> 0x00af }
            if (r5 != 0) goto L_0x00a4
            boolean r5 = r3.hasPreReadAndFirstFrameSeek(r4)     // Catch:{ all -> 0x00af }
            if (r5 == 0) goto L_0x006b
            goto L_0x00a4
        L_0x006b:
            com.tencent.tav.coremedia.CMSampleState r5 = new com.tencent.tav.coremedia.CMSampleState     // Catch:{ all -> 0x00af }
            r5.<init>(r4)     // Catch:{ all -> 0x00af }
            r3.currentStartState = r5     // Catch:{ all -> 0x00af }
            long r4 = r0.getTimeUs()     // Catch:{ all -> 0x00af }
            r3.seekExtractorTo(r4)     // Catch:{ all -> 0x00af }
            r4 = 0
            r3.extractorDone = r4     // Catch:{ all -> 0x00af }
            java.lang.String r4 = r3.TAG     // Catch:{ all -> 0x00af }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            r5.<init>()     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "seekTo: finish - "
            r5.append(r0)     // Catch:{ all -> 0x00af }
            com.tencent.tav.coremedia.CMSampleState r0 = r3.currentStartState     // Catch:{ all -> 0x00af }
            r5.append(r0)     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "  "
            r5.append(r0)     // Catch:{ all -> 0x00af }
            com.tencent.tav.extractor.AssetExtractor r0 = r3.extractor     // Catch:{ all -> 0x00af }
            long r0 = r0.getSampleTime()     // Catch:{ all -> 0x00af }
            r5.append(r0)     // Catch:{ all -> 0x00af }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00af }
            com.tencent.tav.decoder.logger.Logger.m144648v(r4, r5)     // Catch:{ all -> 0x00af }
            monitor-exit(r3)
            return
        L_0x00a4:
            monitor-exit(r3)
            return
        L_0x00a6:
            java.lang.String r4 = r3.TAG     // Catch:{ all -> 0x00af }
            java.lang.String r5 = "seekTo: [failed] !started || trackIndex == -1 "
            com.tencent.tav.decoder.logger.Logger.m144643e(r4, r5)     // Catch:{ all -> 0x00af }
            monitor-exit(r3)
            return
        L_0x00af:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.VideoDecoder.seekTo(com.tencent.tav.coremedia.CMTime, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0080, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void start(com.tencent.tav.coremedia.CMTimeRange r6, com.tencent.tav.coremedia.CMTime r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r5.TAG     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r1.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "start:"
            r1.append(r2)     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = r5.getSourcePath()     // Catch:{ all -> 0x0081 }
            r1.append(r2)     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = " [timeRange "
            r1.append(r2)     // Catch:{ all -> 0x0081 }
            r1.append(r6)     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "] [start "
            r1.append(r2)     // Catch:{ all -> 0x0081 }
            r1.append(r7)     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "]"
            r1.append(r2)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0081 }
            com.tencent.tav.decoder.logger.Logger.m144641d(r0, r1)     // Catch:{ all -> 0x0081 }
            int r0 = r5.trackIndex     // Catch:{ all -> 0x0081 }
            r1 = -1
            if (r0 != r1) goto L_0x003e
            java.lang.String r6 = r5.TAG     // Catch:{ all -> 0x0081 }
            java.lang.String r7 = "start: trackIndex == -1"
            com.tencent.tav.decoder.logger.Logger.m144643e(r6, r7)     // Catch:{ all -> 0x0081 }
            monitor-exit(r5)
            return
        L_0x003e:
            r5.clearDecoder()     // Catch:{ all -> 0x0081 }
            if (r6 != 0) goto L_0x004f
            com.tencent.tav.coremedia.CMTimeRange r6 = new com.tencent.tav.coremedia.CMTimeRange     // Catch:{ all -> 0x0081 }
            com.tencent.tav.coremedia.CMTime r0 = com.tencent.tav.coremedia.CMTime.CMTimeZero     // Catch:{ all -> 0x0081 }
            com.tencent.tav.coremedia.CMTime r1 = r5.duration     // Catch:{ all -> 0x0081 }
            r6.<init>(r0, r1)     // Catch:{ all -> 0x0081 }
            r5.timeRange = r6     // Catch:{ all -> 0x0081 }
            goto L_0x005e
        L_0x004f:
            com.tencent.tav.coremedia.CMTimeRange r0 = new com.tencent.tav.coremedia.CMTimeRange     // Catch:{ all -> 0x0081 }
            com.tencent.tav.coremedia.CMTime r1 = r6.getStart()     // Catch:{ all -> 0x0081 }
            com.tencent.tav.coremedia.CMTime r6 = r6.getDuration()     // Catch:{ all -> 0x0081 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0081 }
            r5.timeRange = r0     // Catch:{ all -> 0x0081 }
        L_0x005e:
            r6 = 0
            r5.extractorDone = r6     // Catch:{ all -> 0x0081 }
            r0 = 1
            r5.started = r0     // Catch:{ all -> 0x0081 }
            long r0 = r7.getTimeUs()     // Catch:{ all -> 0x0081 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x007f
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0081 }
            r5.seekTo(r7, r6)     // Catch:{ all -> 0x0081 }
            r5.preReadSample()     // Catch:{ all -> 0x0081 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0081 }
            long r6 = r6 - r0
            r5.preReadCost = r6     // Catch:{ all -> 0x0081 }
        L_0x007f:
            monitor-exit(r5)
            return
        L_0x0081:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.VideoDecoder.start(com.tencent.tav.coremedia.CMTimeRange, com.tencent.tav.coremedia.CMTime):void");
    }
}
