package com.tencent.tav.decoder;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.tencent.tav.codec.DefaultDecoderFactory;
import com.tencent.tav.codec.IDecoderFactory;
import com.tencent.tav.codec.IMediaCodec;
import com.tencent.tav.coremedia.CMSampleState;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.extractor.AssetExtractor;
import com.tencent.tav.report.AverageTimeReporter;
import com.tencent.xweb.IXWebBroadcastListener;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class AudioDecoder implements IDecoder {
    private static final int MAX_RETRY_COUNT = 10;
    private static final int MAX_WAIT_TIME = 1000;
    private static final String SCENE = "tav-audio-decoder";
    private static final long WAIT_TRANSIENT_MS = 2;
    /* access modifiers changed from: private */
    public static final ArrayList<String> nameList = new ArrayList<>();
    /* access modifiers changed from: private */
    public final String TAG;
    private MediaCodec.BufferInfo bufferInfo;
    private CMSampleState currentSampleState;
    private CMTime currentStartTime;
    private AudioInfo decodeAudioInfo;
    private ByteBuffer decodeBuffer;
    /* access modifiers changed from: private */
    public IMediaCodec decoder;
    /* access modifiers changed from: private */
    public final Object decoderCreateLock;
    private IDecoderFactory decoderFactory;
    private CMTime duration;
    private AssetExtractor extractor;
    private boolean extractorDone;
    private boolean isReleased;
    private int lastOutputBufferIndex;
    private long mLastVideoQueueTime;
    private long mTimeOffset;
    private MediaFormat mediaFormat;
    private AudioInfo outputAudioInfo;
    private ByteBuffer outputBuffer;
    private CMTime pFrameTime;
    private ArrayList<PendingFrame> pendingFrames;
    private boolean started;
    private CMTimeRange timeRange;
    public int trackIndex;

    public static class PendingFrame {
        public CMTime frameTime;
        public boolean isFirst = false;
        public CMTime seekStartTime;
        public long timeOffset = 0;

        public PendingFrame() {
            CMTime cMTime = CMTime.CMTimeZero;
            this.seekStartTime = cMTime;
            this.frameTime = cMTime;
        }
    }

    public AudioDecoder(String str) {
        this(str, (IDecoderFactory) null);
    }

    private void clearDecoder() {
        String str = this.TAG;
        Logger.m144648v(str, "clearDecoder " + getSourcePath());
        releaseOutputBuffer();
        if (this.pendingFrames.size() != 0 || this.extractorDone) {
            try {
                this.decoder.flush();
            } catch (Exception e) {
                Logger.m144644e(this.TAG, "clearDecoder", (Throwable) e);
            }
            this.pendingFrames.clear();
        }
        this.currentSampleState = new CMSampleState();
    }

    private synchronized boolean decoderConfigure(MediaFormat mediaFormat2) {
        int i = 0;
        while (true) {
            i++;
            try {
                String str = this.TAG;
                Logger.m144641d(str, "createdDecoder---time---" + i);
                if (i > 10) {
                    return false;
                }
                this.decoder.configure(mediaFormat2, (Surface) null, (MediaCrypto) null, 0);
                return true;
            } catch (Exception e) {
                Logger.m144644e(this.TAG, "decoderConfigure", (Throwable) e);
                if (e instanceof MediaCodec.CodecException) {
                    if (!((MediaCodec.CodecException) e).isTransient()) {
                        if (!((MediaCodec.CodecException) e).isRecoverable()) {
                            break;
                        }
                    }
                } else {
                    break;
                }
                this.decoder.release();
                throw e;
            }
        }
        this.decoder.release();
        throw e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int dequeueInputBuffer() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.tencent.tav.codec.IMediaCodec r0 = r4.decoder     // Catch:{ Exception -> 0x000f, Error -> 0x000d }
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = r0.dequeueInputBuffer(r1)     // Catch:{ Exception -> 0x000f, Error -> 0x000d }
            monitor-exit(r4)
            return r0
        L_0x000b:
            r0 = move-exception
            goto L_0x0071
        L_0x000d:
            r0 = move-exception
            goto L_0x0010
        L_0x000f:
            r0 = move-exception
        L_0x0010:
            java.lang.String r1 = r4.TAG     // Catch:{ all -> 0x000b }
            java.lang.String r2 = "dequeueInputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x000b }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x000b }
            boolean r2 = r0 instanceof android.media.MediaCodec.CodecException     // Catch:{ all -> 0x000b }
            if (r2 == 0) goto L_0x0070
            r2 = 23
            if (r1 < r2) goto L_0x005c
            java.lang.String r1 = r4.TAG     // Catch:{ all -> 0x000b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x000b }
            r2.<init>()     // Catch:{ all -> 0x000b }
            java.lang.String r3 = "CodecException - isTransient = "
            r2.append(r3)     // Catch:{ all -> 0x000b }
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3     // Catch:{ all -> 0x000b }
            boolean r3 = r3.isTransient()     // Catch:{ all -> 0x000b }
            r2.append(r3)     // Catch:{ all -> 0x000b }
            java.lang.String r3 = " , isRecoverable = "
            r2.append(r3)     // Catch:{ all -> 0x000b }
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3     // Catch:{ all -> 0x000b }
            boolean r3 = r3.isRecoverable()     // Catch:{ all -> 0x000b }
            r2.append(r3)     // Catch:{ all -> 0x000b }
            java.lang.String r3 = " , errorCode = "
            r2.append(r3)     // Catch:{ all -> 0x000b }
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3     // Catch:{ all -> 0x000b }
            int r3 = r3.getErrorCode()     // Catch:{ all -> 0x000b }
            r2.append(r3)     // Catch:{ all -> 0x000b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x000b }
            com.tencent.tav.decoder.logger.Logger.m144643e(r1, r2)     // Catch:{ all -> 0x000b }
        L_0x005c:
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1     // Catch:{ all -> 0x000b }
            boolean r1 = r1.isTransient()     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x0070
            r0 = 2
            r4.waitTime(r0)     // Catch:{ all -> 0x000b }
            int r0 = r4.dequeueInputBuffer()     // Catch:{ all -> 0x000b }
            monitor-exit(r4)
            return r0
        L_0x0070:
            throw r0     // Catch:{ all -> 0x000b }
        L_0x0071:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.AudioDecoder.dequeueInputBuffer():int");
    }

    private synchronized int dequeueOutputBuffer() {
        try {
        } catch (Exception e) {
            Logger.m144644e(this.TAG, "dequeueOutputBuffer", (Throwable) e);
            int i = Build.VERSION.SDK_INT;
            if (e instanceof MediaCodec.CodecException) {
                if (i >= 23) {
                    String str = this.TAG;
                    Logger.m144643e(str, "CodecException - isTransient = " + ((MediaCodec.CodecException) e).isTransient() + " , isRecoverable = " + ((MediaCodec.CodecException) e).isRecoverable() + " , errorCode = " + ((MediaCodec.CodecException) e).getErrorCode());
                }
                if (((MediaCodec.CodecException) e).isTransient()) {
                    waitTime(2);
                    return dequeueOutputBuffer();
                }
            }
            throw e;
        }
        return this.decoder.dequeueOutputBuffer(this.bufferInfo, 1000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f6, code lost:
        return r0;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:108:0x0228=Splitter:B:108:0x0228, B:11:0x0039=Splitter:B:11:0x0039, B:80:0x01bd=Splitter:B:80:0x01bd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.tencent.tav.coremedia.CMSampleState doReadSample(com.tencent.tav.coremedia.CMTime r19, boolean r20) {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            java.lang.String r0 = r1.TAG     // Catch:{ all -> 0x025b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x025b }
            r2.<init>()     // Catch:{ all -> 0x025b }
            java.lang.String r3 = "doReadSample - "
            r2.append(r3)     // Catch:{ all -> 0x025b }
            com.tencent.tav.extractor.AssetExtractor r3 = r1.extractor     // Catch:{ all -> 0x025b }
            java.lang.String r3 = r3.getSourcePath()     // Catch:{ all -> 0x025b }
            r2.append(r3)     // Catch:{ all -> 0x025b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x025b }
            com.tencent.tav.decoder.logger.Logger.m144648v(r0, r2)     // Catch:{ all -> 0x025b }
            r2 = -2
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r2)     // Catch:{ all -> 0x025b }
            boolean r4 = r1.started     // Catch:{ all -> 0x025b }
            r5 = -1
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x0228
            int r4 = r1.trackIndex     // Catch:{ all -> 0x025b }
            if (r4 != r5) goto L_0x0032
            goto L_0x0228
        L_0x0032:
            r4 = -3
            r1.releaseOutputBuffer(r6)     // Catch:{ Exception -> 0x021c }
            r8 = r2
            r6 = 0
        L_0x0039:
            java.util.ArrayList<com.tencent.tav.decoder.AudioDecoder$PendingFrame> r10 = r1.pendingFrames     // Catch:{ all -> 0x025b }
            int r10 = r10.size()     // Catch:{ all -> 0x025b }
            r11 = -1
            if (r10 > 0) goto L_0x0047
            boolean r10 = r1.extractorDone     // Catch:{ all -> 0x025b }
            if (r10 != 0) goto L_0x01bd
        L_0x0047:
            boolean r10 = r1.extractorDone     // Catch:{ Exception -> 0x01f7 }
            if (r10 != 0) goto L_0x004e
            r18.readFromExtractor()     // Catch:{ Exception -> 0x01f7 }
        L_0x004e:
            int r10 = r18.dequeueOutputBuffer()     // Catch:{ Exception -> 0x01f7 }
            r13 = -2
            if (r10 != r13) goto L_0x0098
            com.tencent.tav.codec.IMediaCodec r10 = r1.decoder     // Catch:{ Exception -> 0x01f7 }
            android.media.MediaFormat r10 = r10.getOutputFormat()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r11 = "pcm-encoding"
            boolean r11 = r10.containsKey(r11)     // Catch:{ Exception -> 0x01f7 }
            if (r11 == 0) goto L_0x006e
            com.tencent.tav.decoder.AudioInfo r11 = r1.decodeAudioInfo     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r12 = "pcm-encoding"
            int r12 = r10.getInteger(r12)     // Catch:{ Exception -> 0x01f7 }
            r11.pcmEncoding = r12     // Catch:{ Exception -> 0x01f7 }
            goto L_0x0073
        L_0x006e:
            com.tencent.tav.decoder.AudioInfo r11 = r1.decodeAudioInfo     // Catch:{ Exception -> 0x01f7 }
            r12 = 2
            r11.pcmEncoding = r12     // Catch:{ Exception -> 0x01f7 }
        L_0x0073:
            java.lang.String r11 = "sample-rate"
            boolean r11 = r10.containsKey(r11)     // Catch:{ Exception -> 0x01f7 }
            if (r11 == 0) goto L_0x0085
            com.tencent.tav.decoder.AudioInfo r11 = r1.decodeAudioInfo     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r12 = "sample-rate"
            int r12 = r10.getInteger(r12)     // Catch:{ Exception -> 0x01f7 }
            r11.sampleRate = r12     // Catch:{ Exception -> 0x01f7 }
        L_0x0085:
            java.lang.String r11 = "channel-count"
            boolean r11 = r10.containsKey(r11)     // Catch:{ Exception -> 0x01f7 }
            if (r11 == 0) goto L_0x0039
            com.tencent.tav.decoder.AudioInfo r11 = r1.decodeAudioInfo     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r12 = "channel-count"
            int r10 = r10.getInteger(r12)     // Catch:{ Exception -> 0x01f7 }
            r11.channelCount = r10     // Catch:{ Exception -> 0x01f7 }
            goto L_0x0039
        L_0x0098:
            r13 = 4
            if (r10 < 0) goto L_0x018c
            java.util.ArrayList<com.tencent.tav.decoder.AudioDecoder$PendingFrame> r14 = r1.pendingFrames     // Catch:{ Exception -> 0x01f7 }
            int r14 = r14.size()     // Catch:{ Exception -> 0x01f7 }
            if (r14 <= 0) goto L_0x018c
            android.media.MediaCodec$BufferInfo r0 = r1.bufferInfo     // Catch:{ Exception -> 0x01f7 }
            int r8 = r0.flags     // Catch:{ Exception -> 0x01f7 }
            if (r8 != r13) goto L_0x00e1
            int r0 = r0.size     // Catch:{ Exception -> 0x01f7 }
            if (r0 <= 0) goto L_0x00d4
            java.util.ArrayList<com.tencent.tav.decoder.AudioDecoder$PendingFrame> r0 = r1.pendingFrames     // Catch:{ Exception -> 0x01f7 }
            r0.remove(r7)     // Catch:{ Exception -> 0x01f7 }
            r1.lastOutputBufferIndex = r10     // Catch:{ Exception -> 0x01f7 }
            java.nio.ByteBuffer r0 = r1.getOutputBuffer(r10)     // Catch:{ Exception -> 0x01f7 }
            if (r0 == 0) goto L_0x00ce
            android.media.MediaCodec$BufferInfo r2 = r1.bufferInfo     // Catch:{ Exception -> 0x01f7 }
            int r2 = r2.offset     // Catch:{ Exception -> 0x01f7 }
            r0.position(r2)     // Catch:{ Exception -> 0x01f7 }
            android.media.MediaCodec$BufferInfo r2 = r1.bufferInfo     // Catch:{ Exception -> 0x01f7 }
            int r3 = r2.offset     // Catch:{ Exception -> 0x01f7 }
            int r2 = r2.size     // Catch:{ Exception -> 0x01f7 }
            int r3 = r3 + r2
            r0.limit(r3)     // Catch:{ Exception -> 0x01f7 }
            r1.decodeBuffer = r0     // Catch:{ Exception -> 0x01f7 }
            goto L_0x00d4
        L_0x00ce:
            r1.releaseOutputBuffer(r10, r7)     // Catch:{ Exception -> 0x01f7 }
            r0 = 0
            r1.decodeBuffer = r0     // Catch:{ Exception -> 0x01f7 }
        L_0x00d4:
            java.lang.String r0 = r1.TAG     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r2 = "doReadSample:[finish] bufferInfo.flags == MediaCodec.BUFFER_FLAG_END_OF_STREAM"
            com.tencent.tav.decoder.logger.Logger.m144646i(r0, r2)     // Catch:{ Exception -> 0x01f7 }
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r11)     // Catch:{ Exception -> 0x01f7 }
            monitor-exit(r18)
            return r0
        L_0x00e1:
            java.util.ArrayList<com.tencent.tav.decoder.AudioDecoder$PendingFrame> r0 = r1.pendingFrames     // Catch:{ Exception -> 0x01f7 }
            java.lang.Object r0 = r0.remove(r7)     // Catch:{ Exception -> 0x01f7 }
            com.tencent.tav.decoder.AudioDecoder$PendingFrame r0 = (com.tencent.tav.decoder.AudioDecoder.PendingFrame) r0     // Catch:{ Exception -> 0x01f7 }
            android.media.MediaCodec$BufferInfo r8 = r1.bufferInfo     // Catch:{ Exception -> 0x01f7 }
            long r8 = r8.presentationTimeUs     // Catch:{ Exception -> 0x01f7 }
            long r13 = r0.timeOffset     // Catch:{ Exception -> 0x01f7 }
            long r8 = r8 - r13
            com.tencent.tav.coremedia.CMSampleState r13 = new com.tencent.tav.coremedia.CMSampleState     // Catch:{ Exception -> 0x01f7 }
            com.tencent.tav.coremedia.CMTime r14 = new com.tencent.tav.coremedia.CMTime     // Catch:{ Exception -> 0x01f7 }
            r15 = 1000000(0xf4240, float:1.401298E-39)
            r14.<init>(r8, r15)     // Catch:{ Exception -> 0x01f7 }
            r13.<init>(r14)     // Catch:{ Exception -> 0x01f7 }
            java.util.ArrayList<com.tencent.tav.decoder.AudioDecoder$PendingFrame> r14 = r1.pendingFrames     // Catch:{ Exception -> 0x01f7 }
            int r14 = r14.size()     // Catch:{ Exception -> 0x01f7 }
            if (r14 != 0) goto L_0x0125
            boolean r14 = r1.extractorDone     // Catch:{ Exception -> 0x01f7 }
            if (r14 == 0) goto L_0x0125
            com.tencent.tav.coremedia.CMTime r14 = r0.seekStartTime     // Catch:{ Exception -> 0x01f7 }
            long r14 = r14.getTimeUs()     // Catch:{ Exception -> 0x01f7 }
            r16 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 + r16
            com.tencent.tav.coremedia.CMTime r11 = r1.duration     // Catch:{ Exception -> 0x01f7 }
            long r11 = r11.getTimeUs()     // Catch:{ Exception -> 0x01f7 }
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 < 0) goto L_0x0125
            com.tencent.tav.coremedia.CMSampleState r0 = new com.tencent.tav.coremedia.CMSampleState     // Catch:{ Exception -> 0x01f7 }
            com.tencent.tav.coremedia.CMTime r11 = r1.duration     // Catch:{ Exception -> 0x01f7 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x01f7 }
            goto L_0x0139
        L_0x0125:
            com.tencent.tav.coremedia.CMTime r0 = r0.seekStartTime     // Catch:{ Exception -> 0x01f7 }
            long r11 = r0.getTimeUs()     // Catch:{ Exception -> 0x01f7 }
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0138
            r1.releaseOutputBuffer(r10, r7)     // Catch:{ Exception -> 0x01f7 }
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r2)     // Catch:{ Exception -> 0x01f7 }
            goto L_0x0039
        L_0x0138:
            r0 = r13
        L_0x0139:
            android.media.MediaCodec$BufferInfo r11 = r1.bufferInfo     // Catch:{ Exception -> 0x01f7 }
            int r11 = r11.size     // Catch:{ Exception -> 0x01f7 }
            if (r11 <= 0) goto L_0x0183
            r1.lastOutputBufferIndex = r10     // Catch:{ Exception -> 0x01f7 }
            java.nio.ByteBuffer r2 = r1.getOutputBuffer(r10)     // Catch:{ Exception -> 0x01f7 }
            if (r2 == 0) goto L_0x015b
            android.media.MediaCodec$BufferInfo r3 = r1.bufferInfo     // Catch:{ Exception -> 0x01f7 }
            int r3 = r3.offset     // Catch:{ Exception -> 0x01f7 }
            r2.position(r3)     // Catch:{ Exception -> 0x01f7 }
            android.media.MediaCodec$BufferInfo r3 = r1.bufferInfo     // Catch:{ Exception -> 0x01f7 }
            int r6 = r3.offset     // Catch:{ Exception -> 0x01f7 }
            int r3 = r3.size     // Catch:{ Exception -> 0x01f7 }
            int r6 = r6 + r3
            r2.limit(r6)     // Catch:{ Exception -> 0x01f7 }
            r1.decodeBuffer = r2     // Catch:{ Exception -> 0x01f7 }
            goto L_0x01bd
        L_0x015b:
            r1.releaseOutputBuffer(r10, r7)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = r1.TAG     // Catch:{ Exception -> 0x01f7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f7 }
            r2.<init>()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r3 = "doReadSample:[error] "
            r2.append(r3)     // Catch:{ Exception -> 0x01f7 }
            android.media.MediaCodec$BufferInfo r3 = r1.bufferInfo     // Catch:{ Exception -> 0x01f7 }
            int r3 = r3.size     // Catch:{ Exception -> 0x01f7 }
            r2.append(r3)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r3 = " byteBuffer==null"
            r2.append(r3)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01f7 }
            com.tencent.tav.decoder.logger.Logger.m144643e(r0, r2)     // Catch:{ Exception -> 0x01f7 }
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r4)     // Catch:{ Exception -> 0x01f7 }
            monitor-exit(r18)
            return r0
        L_0x0183:
            r1.releaseOutputBuffer(r10, r7)     // Catch:{ Exception -> 0x01f7 }
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r2)     // Catch:{ Exception -> 0x01f7 }
            goto L_0x0039
        L_0x018c:
            if (r10 < 0) goto L_0x01aa
            android.media.MediaCodec$BufferInfo r0 = r1.bufferInfo     // Catch:{ Exception -> 0x01f7 }
            int r0 = r0.flags     // Catch:{ Exception -> 0x01f7 }
            if (r0 != r13) goto L_0x01a3
            java.lang.String r0 = r1.TAG     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r2 = "doReadSample:[finish] bufferInfo.flags == MediaCodec.BUFFER_FLAG_END_OF_STREAM 2"
            com.tencent.tav.decoder.logger.Logger.m144646i(r0, r2)     // Catch:{ Exception -> 0x01f7 }
            r2 = -1
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r2)     // Catch:{ Exception -> 0x01f7 }
            monitor-exit(r18)
            return r0
        L_0x01a3:
            r1.releaseOutputBuffer(r10, r7)     // Catch:{ Exception -> 0x01f7 }
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r2)     // Catch:{ Exception -> 0x01f7 }
        L_0x01aa:
            int r6 = r6 + 1
            r10 = 1000(0x3e8, float:1.401E-42)
            if (r6 <= r10) goto L_0x0039
            r2 = -4
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r2)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r2 = r1.TAG     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r3 = "doReadSample: [timeout] "
            com.tencent.tav.decoder.logger.Logger.m144643e(r2, r3)     // Catch:{ Exception -> 0x01f7 }
        L_0x01bd:
            java.lang.String r2 = r1.TAG     // Catch:{ all -> 0x025b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x025b }
            r3.<init>()     // Catch:{ all -> 0x025b }
            java.lang.String r4 = "doReadSample:[success] "
            r3.append(r4)     // Catch:{ all -> 0x025b }
            boolean r4 = r1.extractorDone     // Catch:{ all -> 0x025b }
            r3.append(r4)     // Catch:{ all -> 0x025b }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ all -> 0x025b }
            r3.append(r8)     // Catch:{ all -> 0x025b }
            java.lang.String r4 = "  "
            r3.append(r4)     // Catch:{ all -> 0x025b }
            r3.append(r0)     // Catch:{ all -> 0x025b }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x025b }
            com.tencent.tav.decoder.logger.Logger.m144648v(r2, r3)     // Catch:{ all -> 0x025b }
            boolean r2 = r1.extractorDone     // Catch:{ all -> 0x025b }
            if (r2 == 0) goto L_0x01f5
            r2 = 0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x01f5
            r2 = -1
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r2)     // Catch:{ all -> 0x025b }
        L_0x01f5:
            monitor-exit(r18)
            return r0
        L_0x01f7:
            r0 = move-exception
            java.lang.String r2 = r1.TAG     // Catch:{ all -> 0x025b }
            java.lang.String r3 = "doReadSample: error"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x025b }
            boolean r2 = r0 instanceof android.media.MediaCodec.CodecException     // Catch:{ all -> 0x025b }
            if (r2 == 0) goto L_0x0214
            r2 = r0
            android.media.MediaCodec$CodecException r2 = (android.media.MediaCodec.CodecException) r2     // Catch:{ all -> 0x025b }
            boolean r2 = r1.retryOnReadSampleError(r2)     // Catch:{ all -> 0x025b }
            if (r2 == 0) goto L_0x0214
            java.lang.String r2 = "catch exception, retry"
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r4, r2, r0)     // Catch:{ all -> 0x025b }
            monitor-exit(r18)
            return r0
        L_0x0214:
            java.lang.String r2 = "catch exception"
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r4, r2, r0)     // Catch:{ all -> 0x025b }
            monitor-exit(r18)
            return r0
        L_0x021c:
            r0 = move-exception
            r2 = r0
            r0 = -212(0xffffffffffffff2c, float:NaN)
            java.lang.String r3 = ""
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromExportError(r4, r0, r3, r2)     // Catch:{ all -> 0x025b }
            monitor-exit(r18)
            return r0
        L_0x0228:
            java.lang.String r0 = r1.TAG     // Catch:{ all -> 0x025b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x025b }
            r2.<init>()     // Catch:{ all -> 0x025b }
            java.lang.String r3 = "doReadSample:[failed] !started || trackIndex == -1 "
            r2.append(r3)     // Catch:{ all -> 0x025b }
            boolean r3 = r1.started     // Catch:{ all -> 0x025b }
            if (r3 != 0) goto L_0x023a
            r3 = 1
            goto L_0x023b
        L_0x023a:
            r3 = 0
        L_0x023b:
            r2.append(r3)     // Catch:{ all -> 0x025b }
            java.lang.String r3 = " - "
            r2.append(r3)     // Catch:{ all -> 0x025b }
            int r3 = r1.trackIndex     // Catch:{ all -> 0x025b }
            if (r3 != r5) goto L_0x0248
            goto L_0x0249
        L_0x0248:
            r6 = 0
        L_0x0249:
            r2.append(r6)     // Catch:{ all -> 0x025b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x025b }
            com.tencent.tav.decoder.logger.Logger.m144643e(r0, r2)     // Catch:{ all -> 0x025b }
            r2 = -100
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r2)     // Catch:{ all -> 0x025b }
            monitor-exit(r18)
            return r0
        L_0x025b:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.AudioDecoder.doReadSample(com.tencent.tav.coremedia.CMTime, boolean):com.tencent.tav.coremedia.CMSampleState");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.nio.ByteBuffer getInputBuffer(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.tencent.tav.codec.IMediaCodec r0 = r4.decoder     // Catch:{ Exception -> 0x000d, Error -> 0x000b }
            java.nio.ByteBuffer r5 = r0.getInputBuffer(r5)     // Catch:{ Exception -> 0x000d, Error -> 0x000b }
            monitor-exit(r4)
            return r5
        L_0x0009:
            r5 = move-exception
            goto L_0x006f
        L_0x000b:
            r0 = move-exception
            goto L_0x000e
        L_0x000d:
            r0 = move-exception
        L_0x000e:
            java.lang.String r1 = r4.TAG     // Catch:{ all -> 0x0009 }
            java.lang.String r2 = "getInputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0009 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0009 }
            boolean r2 = r0 instanceof android.media.MediaCodec.CodecException     // Catch:{ all -> 0x0009 }
            if (r2 == 0) goto L_0x006e
            r2 = 23
            if (r1 < r2) goto L_0x005a
            java.lang.String r1 = r4.TAG     // Catch:{ all -> 0x0009 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0009 }
            r2.<init>()     // Catch:{ all -> 0x0009 }
            java.lang.String r3 = "CodecException - isTransient = "
            r2.append(r3)     // Catch:{ all -> 0x0009 }
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3     // Catch:{ all -> 0x0009 }
            boolean r3 = r3.isTransient()     // Catch:{ all -> 0x0009 }
            r2.append(r3)     // Catch:{ all -> 0x0009 }
            java.lang.String r3 = " , isRecoverable = "
            r2.append(r3)     // Catch:{ all -> 0x0009 }
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3     // Catch:{ all -> 0x0009 }
            boolean r3 = r3.isRecoverable()     // Catch:{ all -> 0x0009 }
            r2.append(r3)     // Catch:{ all -> 0x0009 }
            java.lang.String r3 = " , errorCode = "
            r2.append(r3)     // Catch:{ all -> 0x0009 }
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3     // Catch:{ all -> 0x0009 }
            int r3 = r3.getErrorCode()     // Catch:{ all -> 0x0009 }
            r2.append(r3)     // Catch:{ all -> 0x0009 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0009 }
            com.tencent.tav.decoder.logger.Logger.m144643e(r1, r2)     // Catch:{ all -> 0x0009 }
        L_0x005a:
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1     // Catch:{ all -> 0x0009 }
            boolean r1 = r1.isTransient()     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x006e
            r0 = 2
            r4.waitTime(r0)     // Catch:{ all -> 0x0009 }
            java.nio.ByteBuffer r5 = r4.getInputBuffer(r5)     // Catch:{ all -> 0x0009 }
            monitor-exit(r4)
            return r5
        L_0x006e:
            throw r0     // Catch:{ all -> 0x0009 }
        L_0x006f:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.AudioDecoder.getInputBuffer(int):java.nio.ByteBuffer");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.nio.ByteBuffer getOutputBuffer(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.tencent.tav.codec.IMediaCodec r0 = r4.decoder     // Catch:{ Exception -> 0x000d, Error -> 0x000b }
            java.nio.ByteBuffer r5 = r0.getOutputBuffer(r5)     // Catch:{ Exception -> 0x000d, Error -> 0x000b }
            monitor-exit(r4)
            return r5
        L_0x0009:
            r5 = move-exception
            goto L_0x006f
        L_0x000b:
            r0 = move-exception
            goto L_0x000e
        L_0x000d:
            r0 = move-exception
        L_0x000e:
            java.lang.String r1 = r4.TAG     // Catch:{ all -> 0x0009 }
            java.lang.String r2 = "getOutputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0009 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0009 }
            boolean r2 = r0 instanceof android.media.MediaCodec.CodecException     // Catch:{ all -> 0x0009 }
            if (r2 == 0) goto L_0x006e
            r2 = 23
            if (r1 < r2) goto L_0x005a
            java.lang.String r1 = r4.TAG     // Catch:{ all -> 0x0009 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0009 }
            r2.<init>()     // Catch:{ all -> 0x0009 }
            java.lang.String r3 = "CodecException - isTransient = "
            r2.append(r3)     // Catch:{ all -> 0x0009 }
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3     // Catch:{ all -> 0x0009 }
            boolean r3 = r3.isTransient()     // Catch:{ all -> 0x0009 }
            r2.append(r3)     // Catch:{ all -> 0x0009 }
            java.lang.String r3 = " , isRecoverable = "
            r2.append(r3)     // Catch:{ all -> 0x0009 }
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3     // Catch:{ all -> 0x0009 }
            boolean r3 = r3.isRecoverable()     // Catch:{ all -> 0x0009 }
            r2.append(r3)     // Catch:{ all -> 0x0009 }
            java.lang.String r3 = " , errorCode = "
            r2.append(r3)     // Catch:{ all -> 0x0009 }
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3     // Catch:{ all -> 0x0009 }
            int r3 = r3.getErrorCode()     // Catch:{ all -> 0x0009 }
            r2.append(r3)     // Catch:{ all -> 0x0009 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0009 }
            com.tencent.tav.decoder.logger.Logger.m144643e(r1, r2)     // Catch:{ all -> 0x0009 }
        L_0x005a:
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1     // Catch:{ all -> 0x0009 }
            boolean r1 = r1.isTransient()     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x006e
            r0 = 2
            r4.waitTime(r0)     // Catch:{ all -> 0x0009 }
            java.nio.ByteBuffer r5 = r4.getOutputBuffer(r5)     // Catch:{ all -> 0x0009 }
            monitor-exit(r4)
            return r5
        L_0x006e:
            throw r0     // Catch:{ all -> 0x0009 }
        L_0x006f:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.AudioDecoder.getOutputBuffer(int):java.nio.ByteBuffer");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void queueInputBuffer(int r8, int r9, int r10, long r11, int r13) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.tencent.tav.codec.IMediaCodec r0 = r7.decoder     // Catch:{ Exception -> 0x0011, Error -> 0x000f }
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r0.queueInputBuffer(r1, r2, r3, r4, r6)     // Catch:{ Exception -> 0x0011, Error -> 0x000f }
            monitor-exit(r7)
            return
        L_0x000d:
            r8 = move-exception
            goto L_0x0070
        L_0x000f:
            r0 = move-exception
            goto L_0x0012
        L_0x0011:
            r0 = move-exception
        L_0x0012:
            java.lang.String r1 = r7.TAG     // Catch:{ all -> 0x000d }
            java.lang.String r2 = "queueInputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x000d }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x000d }
            boolean r2 = r0 instanceof android.media.MediaCodec.CodecException     // Catch:{ all -> 0x000d }
            if (r2 == 0) goto L_0x006f
            r2 = 23
            if (r1 < r2) goto L_0x005e
            java.lang.String r1 = r7.TAG     // Catch:{ all -> 0x000d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x000d }
            r2.<init>()     // Catch:{ all -> 0x000d }
            java.lang.String r3 = "CodecException - isTransient = "
            r2.append(r3)     // Catch:{ all -> 0x000d }
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3     // Catch:{ all -> 0x000d }
            boolean r3 = r3.isTransient()     // Catch:{ all -> 0x000d }
            r2.append(r3)     // Catch:{ all -> 0x000d }
            java.lang.String r3 = " , isRecoverable = "
            r2.append(r3)     // Catch:{ all -> 0x000d }
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3     // Catch:{ all -> 0x000d }
            boolean r3 = r3.isRecoverable()     // Catch:{ all -> 0x000d }
            r2.append(r3)     // Catch:{ all -> 0x000d }
            java.lang.String r3 = " , errorCode = "
            r2.append(r3)     // Catch:{ all -> 0x000d }
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3     // Catch:{ all -> 0x000d }
            int r3 = r3.getErrorCode()     // Catch:{ all -> 0x000d }
            r2.append(r3)     // Catch:{ all -> 0x000d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x000d }
            com.tencent.tav.decoder.logger.Logger.m144643e(r1, r2)     // Catch:{ all -> 0x000d }
        L_0x005e:
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1     // Catch:{ all -> 0x000d }
            boolean r1 = r1.isTransient()     // Catch:{ all -> 0x000d }
            if (r1 == 0) goto L_0x006f
            r1 = 2
            r7.waitTime(r1)     // Catch:{ all -> 0x000d }
            r7.queueInputBuffer(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x000d }
        L_0x006f:
            throw r0     // Catch:{ all -> 0x000d }
        L_0x0070:
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.AudioDecoder.queueInputBuffer(int, int, int, long, int):void");
    }

    private synchronized void readFromExtractor() {
        long sampleTime = this.extractor.getSampleTime();
        if (sampleTime < this.timeRange.getEndUs() && this.extractor.getSampleTrackIndex() != -1) {
            if (sampleTime != -1) {
                int dequeueInputBuffer = dequeueInputBuffer();
                if (dequeueInputBuffer >= 0) {
                    int readSampleData = this.extractor.readSampleData(getInputBuffer(dequeueInputBuffer), 0);
                    if (readSampleData >= 0) {
                        long startUs = (sampleTime - this.timeRange.getStartUs()) + this.mTimeOffset;
                        this.mLastVideoQueueTime = startUs;
                        queueInputBuffer(dequeueInputBuffer, 0, readSampleData, startUs, 0);
                        PendingFrame pendingFrame = new PendingFrame();
                        pendingFrame.timeOffset = this.mTimeOffset;
                        pendingFrame.frameTime = new CMTime((((float) sampleTime) * 1.0f) / ((float) TimeUnit.SECONDS.toMicros(1)));
                        pendingFrame.seekStartTime = this.currentStartTime.sub(this.timeRange.getStart());
                        if (this.pendingFrames.size() == 0) {
                            pendingFrame.isFirst = true;
                        }
                        this.pendingFrames.add(pendingFrame);
                    }
                    this.extractor.advance();
                }
            }
        }
        int dequeueInputBuffer2 = dequeueInputBuffer();
        if (dequeueInputBuffer2 >= 0) {
            queueInputBuffer(dequeueInputBuffer2, 0, 0, 0, 4);
            this.extractorDone = true;
        }
    }

    /* access modifiers changed from: private */
    public synchronized void releaseOutputBuffer() {
        releaseOutputBuffer(false);
    }

    private synchronized void reset() {
        if (!this.isReleased) {
            Logger.m144641d(this.TAG, "reset() called");
            try {
                this.decoder.reset();
                decoderConfigure(this.mediaFormat);
                start();
            } catch (Exception e) {
                Logger.m144644e(this.TAG, "reset: ", (Throwable) e);
            }
        } else {
            return;
        }
        return;
    }

    private boolean retryOnReadSampleError(MediaCodec.CodecException codecException) {
        if (codecException.isRecoverable()) {
            releaseOutputBuffer();
            reset();
            this.lastOutputBufferIndex = -1;
            this.pendingFrames.clear();
            this.extractor.seekTo(this.currentStartTime.getTimeUs() - this.timeRange.getStartUs(), 0);
            this.extractorDone = false;
        } else if (!codecException.isTransient()) {
            Logger.m144643e(this.TAG, "doReadSample:[error] retry failed");
            return true;
        }
        return false;
    }

    private synchronized void seekExtractorTo(long j) {
        this.extractor.seekTo(j, 2);
        if (this.extractor.getSampleTime() > j) {
            this.extractor.seekTo(j, 0);
        }
        clearDecoder();
        this.mTimeOffset = this.mLastVideoQueueTime + 10000000;
    }

    private synchronized void waitTime(long j) {
        try {
            wait(j);
        } catch (InterruptedException e) {
            Logger.m144644e(this.TAG, "waitTime", (Throwable) e);
        }
        return;
    }

    public void finalize() {
        super.finalize();
        release(false);
    }

    public AudioInfo getAudioInfo() {
        AudioInfo audioInfo = this.outputAudioInfo;
        return audioInfo != null ? audioInfo : this.decodeAudioInfo;
    }

    public AverageTimeReporter getDecodePerformance() {
        return null;
    }

    public String getSourcePath() {
        AssetExtractor assetExtractor = this.extractor;
        if (assetExtractor == null) {
            return null;
        }
        return assetExtractor.getSourcePath();
    }

    public synchronized boolean hasTrack() {
        return this.trackIndex != -1;
    }

    public boolean isStarted() {
        return this.started;
    }

    public CMTime nextFrameTime() {
        CMTime cMTime = this.pendingFrames.size() > 0 ? this.pendingFrames.get(0).frameTime : CMTime.CMTimeInvalid;
        Iterator<PendingFrame> it = this.pendingFrames.iterator();
        while (it.hasNext()) {
            cMTime = CMTime.min(it.next().frameTime, cMTime);
        }
        return cMTime;
    }

    public synchronized ByteBuffer outputBuffer() {
        ByteBuffer byteBuffer = this.decodeBuffer;
        if (byteBuffer == null) {
            return null;
        }
        ByteBuffer byteBuffer2 = this.outputBuffer;
        return byteBuffer2 == null ? byteBuffer : byteBuffer2;
    }

    public synchronized CMSampleState readSample() {
        return readSample(CMTime.CMTimeInvalid);
    }

    public synchronized void release() {
        release(true);
    }

    public synchronized void seekTo(CMTime cMTime) {
        String str = this.TAG;
        Logger.m144648v(str, "seekTo: " + cMTime + "  - " + this + "  " + this.currentStartTime + "  " + this.currentSampleState);
        if (this.started) {
            if (this.trackIndex != -1) {
                if (cMTime.getTimeUs() < 0) {
                    cMTime = CMTime.CMTimeZero;
                }
                CMTime add = this.timeRange.getStart().add(cMTime);
                this.currentStartTime = add;
                this.extractorDone = false;
                seekExtractorTo(add.getTimeUs());
                String str2 = this.TAG;
                Logger.m144648v(str2, "seekTo: finish - " + this.currentStartTime + "  " + this.extractor.getSampleTime());
                return;
            }
        }
        String str3 = this.TAG;
        Logger.m144643e(str3, "seekTo:failed [started " + this.started + "] [trackIndex " + this.trackIndex + "]");
    }

    public synchronized void start(CMTimeRange cMTimeRange) {
        start(cMTimeRange, CMTime.CMTimeZero);
    }

    public AudioDecoder(String str, IDecoderFactory iDecoderFactory) {
        this.TAG = "AudioDecoder@" + Integer.toHexString(hashCode());
        CMTime cMTime = CMTime.CMTimeZero;
        this.duration = cMTime;
        this.started = false;
        this.pendingFrames = new ArrayList<>();
        this.trackIndex = -1;
        this.isReleased = false;
        this.currentSampleState = new CMSampleState(cMTime);
        this.decodeAudioInfo = new AudioInfo();
        this.outputAudioInfo = null;
        this.decodeBuffer = null;
        this.outputBuffer = null;
        this.decoderCreateLock = new Object();
        this.pFrameTime = new CMTime(20, 600);
        this.lastOutputBufferIndex = -1;
        this.currentStartTime = CMTime.CMTimeInvalid;
        this.bufferInfo = new MediaCodec.BufferInfo();
        this.extractorDone = false;
        this.mTimeOffset = 0;
        this.mLastVideoQueueTime = 0;
        if (iDecoderFactory != null) {
            this.decoderFactory = iDecoderFactory;
        } else {
            this.decoderFactory = new DefaultDecoderFactory();
        }
        AssetExtractor assetExtractor = new AssetExtractor();
        this.extractor = assetExtractor;
        assetExtractor.setDataSource(str);
        while (this.extractor.getSampleTrackIndex() != -1) {
            AssetExtractor assetExtractor2 = this.extractor;
            assetExtractor2.unselectTrack(assetExtractor2.getSampleTrackIndex());
        }
        int firstTrackIndex = DecoderUtils.getFirstTrackIndex(this.extractor, "audio/");
        this.trackIndex = firstTrackIndex;
        if (firstTrackIndex == -1) {
            this.decodeBuffer = null;
            return;
        }
        this.extractor.selectTrack(firstTrackIndex);
        this.mediaFormat = this.extractor.getTrackFormat(this.trackIndex);
        this.duration = new CMTime((((float) this.extractor.getAudioDuration()) * 1.0f) / ((float) TimeUnit.SECONDS.toMicros(1)));
        if (this.mediaFormat.containsKey("frame-rate")) {
            this.pFrameTime = new CMTime((long) (600 / this.mediaFormat.getInteger("frame-rate")), 600);
        }
        String string = this.mediaFormat.getString("mime");
        synchronized (this.decoderCreateLock) {
            IMediaCodec createAudioDecoder = this.decoderFactory.createAudioDecoder(string, SCENE);
            this.decoder = createAudioDecoder;
            createAudioDecoder.setDataSource(this.extractor.getSourcePath());
            nameList.add(this.decoder.toString());
            if (decoderConfigure(this.mediaFormat)) {
                start();
            } else {
                throw new IllegalStateException("decoderConfigure failed!");
            }
        }
        this.decodeAudioInfo.sampleRate = this.mediaFormat.getInteger("sample-rate");
        this.decodeAudioInfo.channelCount = this.mediaFormat.getInteger("channel-count");
        AudioInfo audioInfo = new AudioInfo();
        audioInfo.channelCount = 1;
        audioInfo.sampleRate = 44100;
        audioInfo.pcmEncoding = 2;
    }

    public synchronized CMSampleState readSample(CMTime cMTime) {
        CMSampleState doReadSample;
        String str = this.TAG;
        Logger.m144648v(str, "readSample: " + cMTime + "  -  " + this.extractor.getSampleTime());
        doReadSample = doReadSample(cMTime, false);
        this.currentSampleState = doReadSample;
        if (doReadSample.stateMatchingTo(-1, -4) || !this.currentSampleState.getTime().smallThan(this.duration)) {
            clearDecoder();
        }
        String str2 = this.TAG;
        Logger.m144648v(str2, "readSample: finish " + cMTime + "  -  " + this.currentSampleState);
        return doReadSample;
    }

    private void releaseOutputBuffer(boolean z) {
        int i = this.lastOutputBufferIndex;
        if (i != -1) {
            try {
                releaseOutputBuffer(i, false);
            } catch (Exception e) {
                String str = this.TAG;
                Logger.m144644e(str, "releaseOutputBuffer " + z, (Throwable) e);
                if (z) {
                    throw e;
                }
            }
            this.lastOutputBufferIndex = -1;
        }
        this.decodeBuffer = null;
    }

    public synchronized void release(boolean z) {
        if (!this.isReleased) {
            String str = this.TAG;
            Logger.m144641d(str, "release:start " + z);
            if (z) {
                this.extractor.dispose();
                this.extractor = null;
            }
            this.started = false;
            this.isReleased = true;
            synchronized (this.decoderCreateLock) {
                if (this.decoder != null) {
                    new Thread() {
                        public void run() {
                            AudioDecoder audioDecoder;
                            AudioDecoder.this.releaseOutputBuffer();
                            synchronized (AudioDecoder.this.decoderCreateLock) {
                                try {
                                    AudioDecoder.this.decoder.stop();
                                } catch (Exception unused) {
                                    audioDecoder = AudioDecoder.this;
                                } catch (Exception e) {
                                    Logger.m144644e(AudioDecoder.this.TAG, "decoder.stop", (Throwable) e);
                                } catch (Throwable th) {
                                    IMediaCodec unused2 = AudioDecoder.this.decoder = null;
                                    throw th;
                                }
                                AudioDecoder.this.decoder.release();
                                AudioDecoder.nameList.remove(AudioDecoder.this.decoder.toString());
                                audioDecoder = AudioDecoder.this;
                                IMediaCodec unused3 = audioDecoder.decoder = null;
                                IMediaCodec unused4 = AudioDecoder.this.decoder = null;
                            }
                            return;
                        }
                    }.start();
                }
            }
            String str2 = this.TAG;
            Logger.m144641d(str2, "release:end " + z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void start(com.tencent.tav.coremedia.CMTimeRange r5, com.tencent.tav.coremedia.CMTime r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.TAG     // Catch:{ all -> 0x0073 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            r1.<init>()     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = "start:"
            r1.append(r2)     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = r4.getSourcePath()     // Catch:{ all -> 0x0073 }
            r1.append(r2)     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = " [timeRange "
            r1.append(r2)     // Catch:{ all -> 0x0073 }
            r1.append(r5)     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = "] [start "
            r1.append(r2)     // Catch:{ all -> 0x0073 }
            r1.append(r6)     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = "]"
            r1.append(r2)     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0073 }
            com.tencent.tav.decoder.logger.Logger.m144641d(r0, r1)     // Catch:{ all -> 0x0073 }
            int r0 = r4.trackIndex     // Catch:{ all -> 0x0073 }
            r1 = -1
            if (r0 != r1) goto L_0x003e
            java.lang.String r5 = r4.TAG     // Catch:{ all -> 0x0073 }
            java.lang.String r6 = "start: trackIndex == -1"
            com.tencent.tav.decoder.logger.Logger.m144643e(r5, r6)     // Catch:{ all -> 0x0073 }
            monitor-exit(r4)
            return
        L_0x003e:
            r4.clearDecoder()     // Catch:{ all -> 0x0073 }
            if (r5 != 0) goto L_0x004f
            com.tencent.tav.coremedia.CMTimeRange r5 = new com.tencent.tav.coremedia.CMTimeRange     // Catch:{ all -> 0x0073 }
            com.tencent.tav.coremedia.CMTime r0 = com.tencent.tav.coremedia.CMTime.CMTimeZero     // Catch:{ all -> 0x0073 }
            com.tencent.tav.coremedia.CMTime r1 = r4.duration     // Catch:{ all -> 0x0073 }
            r5.<init>(r0, r1)     // Catch:{ all -> 0x0073 }
            r4.timeRange = r5     // Catch:{ all -> 0x0073 }
            goto L_0x005e
        L_0x004f:
            com.tencent.tav.coremedia.CMTimeRange r0 = new com.tencent.tav.coremedia.CMTimeRange     // Catch:{ all -> 0x0073 }
            com.tencent.tav.coremedia.CMTime r1 = r5.getStart()     // Catch:{ all -> 0x0073 }
            com.tencent.tav.coremedia.CMTime r5 = r5.getDuration()     // Catch:{ all -> 0x0073 }
            r0.<init>(r1, r5)     // Catch:{ all -> 0x0073 }
            r4.timeRange = r0     // Catch:{ all -> 0x0073 }
        L_0x005e:
            r5 = 0
            r4.extractorDone = r5     // Catch:{ all -> 0x0073 }
            r5 = 1
            r4.started = r5     // Catch:{ all -> 0x0073 }
            long r0 = r6.getTimeUs()     // Catch:{ all -> 0x0073 }
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0071
            r4.seekTo(r6)     // Catch:{ all -> 0x0073 }
        L_0x0071:
            monitor-exit(r4)
            return
        L_0x0073:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.AudioDecoder.start(com.tencent.tav.coremedia.CMTimeRange, com.tencent.tav.coremedia.CMTime):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void releaseOutputBuffer(int r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.tencent.tav.codec.IMediaCodec r0 = r4.decoder     // Catch:{ Exception -> 0x000c, Error -> 0x000a }
            r0.releaseOutputBuffer(r5, r6)     // Catch:{ Exception -> 0x000c, Error -> 0x000a }
            monitor-exit(r4)
            return
        L_0x0008:
            r5 = move-exception
            goto L_0x006b
        L_0x000a:
            r0 = move-exception
            goto L_0x000d
        L_0x000c:
            r0 = move-exception
        L_0x000d:
            java.lang.String r1 = r4.TAG     // Catch:{ all -> 0x0008 }
            java.lang.String r2 = "releaseOutputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0008 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0008 }
            boolean r2 = r0 instanceof android.media.MediaCodec.CodecException     // Catch:{ all -> 0x0008 }
            if (r2 == 0) goto L_0x006a
            r2 = 23
            if (r1 < r2) goto L_0x0059
            java.lang.String r1 = r4.TAG     // Catch:{ all -> 0x0008 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0008 }
            r2.<init>()     // Catch:{ all -> 0x0008 }
            java.lang.String r3 = "CodecException - isTransient = "
            r2.append(r3)     // Catch:{ all -> 0x0008 }
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3     // Catch:{ all -> 0x0008 }
            boolean r3 = r3.isTransient()     // Catch:{ all -> 0x0008 }
            r2.append(r3)     // Catch:{ all -> 0x0008 }
            java.lang.String r3 = " , isRecoverable = "
            r2.append(r3)     // Catch:{ all -> 0x0008 }
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3     // Catch:{ all -> 0x0008 }
            boolean r3 = r3.isRecoverable()     // Catch:{ all -> 0x0008 }
            r2.append(r3)     // Catch:{ all -> 0x0008 }
            java.lang.String r3 = " , errorCode = "
            r2.append(r3)     // Catch:{ all -> 0x0008 }
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3     // Catch:{ all -> 0x0008 }
            int r3 = r3.getErrorCode()     // Catch:{ all -> 0x0008 }
            r2.append(r3)     // Catch:{ all -> 0x0008 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0008 }
            com.tencent.tav.decoder.logger.Logger.m144643e(r1, r2)     // Catch:{ all -> 0x0008 }
        L_0x0059:
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1     // Catch:{ all -> 0x0008 }
            boolean r1 = r1.isTransient()     // Catch:{ all -> 0x0008 }
            if (r1 == 0) goto L_0x006a
            r1 = 2
            r4.waitTime(r1)     // Catch:{ all -> 0x0008 }
            r4.releaseOutputBuffer(r5, r6)     // Catch:{ all -> 0x0008 }
        L_0x006a:
            throw r0     // Catch:{ all -> 0x0008 }
        L_0x006b:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.AudioDecoder.releaseOutputBuffer(int, boolean):void");
    }

    private synchronized void start() {
        try {
            this.decoder.start();
        } catch (Exception e) {
            Logger.m144644e(this.TAG, IXWebBroadcastListener.STAGE_START, (Throwable) e);
            int i = Build.VERSION.SDK_INT;
            if (e instanceof MediaCodec.CodecException) {
                if (i >= 23) {
                    String str = this.TAG;
                    Logger.m144643e(str, "CodecException - isTransient = " + ((MediaCodec.CodecException) e).isTransient() + " , isRecoverable = " + ((MediaCodec.CodecException) e).isRecoverable() + " , errorCode = " + ((MediaCodec.CodecException) e).getErrorCode());
                }
                if (((MediaCodec.CodecException) e).isTransient()) {
                    waitTime(2);
                    start();
                    return;
                } else if (((MediaCodec.CodecException) e).isRecoverable()) {
                    reset();
                    return;
                }
            }
            release();
            throw e;
        }
    }
}
