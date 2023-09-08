package com.tencent.tav.decoder.decodecache;

import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMSampleState;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.DecoderTrackSegment;
import com.tencent.tav.decoder.IDecoder;
import com.tencent.tav.decoder.IDecoderTrack;
import com.tencent.tav.decoder.RenderContext;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.report.AverageTimeReporter;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CachedVideoDecoderTrack implements IDecoderTrack {
    private static final String TAG = "CachedVideoTrack";
    private CacheSegment currentFrameSegment;
    private CMSampleState lastSampleState = new CMSampleState();
    public final Object nextFrameDecoderLock = new Object();
    private CacheSegment nextFrameSegment;
    public RenderContext renderContext;
    public boolean revert;
    private SegmentDecoderThread segmentDecoder;
    private int segmentSize = 60;
    public CMTimeRange validTimeRange;

    public CachedVideoDecoderTrack(IDecoderTrack iDecoderTrack, boolean z) {
        this.revert = z;
        this.segmentDecoder = new SegmentDecoderThread(this, iDecoderTrack);
    }

    private void clearCurrentFrameSegment() {
        CacheSegment cacheSegment = this.currentFrameSegment;
        if (cacheSegment != null) {
            cacheSegment.clear();
            this.currentFrameSegment = null;
        }
    }

    private CMSampleBuffer decoderFrame(CMTime cMTime) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.segmentDecoder.decoderSegment(cMTime, countDownLatch);
        try {
            countDownLatch.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
        }
        return this.segmentDecoder.seekSampleBuffer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f7, code lost:
        r8.segmentDecoder.cancel = true;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x015d */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0174  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.tencent.tav.coremedia.CMSampleBuffer decoderSegment(com.tencent.tav.coremedia.CMTime r9) {
        /*
            r8 = this;
            com.tencent.tav.decoder.decodecache.RequestStatus r0 = new com.tencent.tav.decoder.decodecache.RequestStatus
            r0.<init>()
            com.tencent.tav.decoder.decodecache.CacheSegment r1 = r8.nextFrameSegment
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x00ff
            com.tencent.tav.coremedia.CMTimeRange r1 = r1.segmentTimeRange
            if (r1 == 0) goto L_0x00ff
            com.tencent.tav.decoder.decodecache.CacheSegment r1 = r8.nextFrameSegment
            com.tencent.tav.coremedia.CMTimeRange r1 = r1.segmentTimeRange
            boolean r1 = r1.containsTime(r9)
            if (r1 == 0) goto L_0x00ff
            java.lang.Object r1 = r8.nextFrameDecoderLock
            monitor-enter(r1)
            r8.clearCurrentFrameSegment()     // Catch:{ all -> 0x00fc }
            com.tencent.tav.decoder.decodecache.CacheSegment r4 = new com.tencent.tav.decoder.decodecache.CacheSegment     // Catch:{ all -> 0x00fc }
            com.tencent.tav.decoder.decodecache.CacheSegment r5 = r8.nextFrameSegment     // Catch:{ all -> 0x00fc }
            com.tencent.tav.coremedia.CMTimeRange r5 = r5.segmentTimeRange     // Catch:{ all -> 0x00fc }
            r4.<init>(r5)     // Catch:{ all -> 0x00fc }
            r8.currentFrameSegment = r4     // Catch:{ all -> 0x00fc }
            com.tencent.tav.decoder.decodecache.CacheSegment r4 = r8.nextFrameSegment     // Catch:{ all -> 0x00fc }
            java.util.List<com.tencent.tav.decoder.decodecache.CacheFrame> r4 = r4.cacheFrameList     // Catch:{ all -> 0x00fc }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00fc }
        L_0x0032:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00fc }
            if (r5 == 0) goto L_0x0044
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00fc }
            com.tencent.tav.decoder.decodecache.CacheFrame r5 = (com.tencent.tav.decoder.decodecache.CacheFrame) r5     // Catch:{ all -> 0x00fc }
            com.tencent.tav.decoder.decodecache.CacheSegment r6 = r8.currentFrameSegment     // Catch:{ all -> 0x00fc }
            r6.pushFrame(r5)     // Catch:{ all -> 0x00fc }
            goto L_0x0032
        L_0x0044:
            com.tencent.tav.decoder.decodecache.CacheSegment r4 = r8.currentFrameSegment     // Catch:{ all -> 0x00fc }
            com.tencent.tav.decoder.decodecache.CacheFrame r4 = r4.popFrame(r9)     // Catch:{ all -> 0x00fc }
            r5 = 1
            if (r4 == 0) goto L_0x00c8
            java.lang.String r9 = "CachedVideoTrack"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            r0.<init>()     // Catch:{ all -> 0x00fc }
            java.lang.String r6 = "readSample: hint nextFrameSegment "
            r0.append(r6)     // Catch:{ all -> 0x00fc }
            com.tencent.tav.coremedia.CMSampleBuffer r6 = r4.sampleBuffer     // Catch:{ all -> 0x00fc }
            if (r6 == 0) goto L_0x0064
            com.tencent.tav.coremedia.TextureInfo r6 = r6.getTextureInfo()     // Catch:{ all -> 0x00fc }
            if (r6 == 0) goto L_0x0064
            r2 = 1
        L_0x0064:
            r0.append(r2)     // Catch:{ all -> 0x00fc }
            java.lang.String r2 = "  "
            r0.append(r2)     // Catch:{ all -> 0x00fc }
            com.tencent.tav.coremedia.CMSampleBuffer r2 = r4.sampleBuffer     // Catch:{ all -> 0x00fc }
            if (r2 == 0) goto L_0x0079
            boolean r2 = r2.isNewFrame()     // Catch:{ all -> 0x00fc }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x00fc }
            goto L_0x007b
        L_0x0079:
            java.lang.String r2 = "null"
        L_0x007b:
            r0.append(r2)     // Catch:{ all -> 0x00fc }
            java.lang.String r2 = " time = "
            r0.append(r2)     // Catch:{ all -> 0x00fc }
            com.tencent.tav.coremedia.CMTime r2 = r4.realFrameTime     // Catch:{ all -> 0x00fc }
            r0.append(r2)     // Catch:{ all -> 0x00fc }
            java.lang.String r2 = "  "
            r0.append(r2)     // Catch:{ all -> 0x00fc }
            com.tencent.tav.coremedia.CMTime r2 = r4.frameTime     // Catch:{ all -> 0x00fc }
            r0.append(r2)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00fc }
            com.tencent.tav.decoder.logger.Logger.m144648v(r9, r0)     // Catch:{ all -> 0x00fc }
            com.tencent.tav.decoder.decodecache.CacheSegment r9 = new com.tencent.tav.decoder.decodecache.CacheSegment     // Catch:{ all -> 0x00fc }
            com.tencent.tav.coremedia.CMTimeRange r0 = new com.tencent.tav.coremedia.CMTimeRange     // Catch:{ all -> 0x00fc }
            com.tencent.tav.decoder.decodecache.CacheSegment r2 = r8.currentFrameSegment     // Catch:{ all -> 0x00fc }
            com.tencent.tav.coremedia.CMTime r2 = r2.getLastFrameTime()     // Catch:{ all -> 0x00fc }
            com.tencent.tav.coremedia.CMTime r5 = r8.getFrameDuration()     // Catch:{ all -> 0x00fc }
            int r6 = r8.segmentSize     // Catch:{ all -> 0x00fc }
            float r6 = (float) r6     // Catch:{ all -> 0x00fc }
            com.tencent.tav.coremedia.CMTime r5 = r5.multi((float) r6)     // Catch:{ all -> 0x00fc }
            r0.<init>(r2, r5)     // Catch:{ all -> 0x00fc }
            r9.<init>(r0)     // Catch:{ all -> 0x00fc }
            r8.nextFrameSegment = r9     // Catch:{ all -> 0x00fc }
            com.tencent.tav.decoder.decodecache.SegmentDecoderThread r0 = r8.segmentDecoder     // Catch:{ all -> 0x00fc }
            r0.decoderSegment((com.tencent.tav.decoder.decodecache.CacheSegment) r9, (com.tencent.tav.decoder.decodecache.RequestStatus) r3)     // Catch:{ all -> 0x00fc }
            com.tencent.tav.coremedia.CMSampleState r9 = new com.tencent.tav.coremedia.CMSampleState     // Catch:{ all -> 0x00fc }
            com.tencent.tav.coremedia.CMTime r0 = r4.frameTime     // Catch:{ all -> 0x00fc }
            r9.<init>(r0)     // Catch:{ all -> 0x00fc }
            r8.lastSampleState = r9     // Catch:{ all -> 0x00fc }
            com.tencent.tav.coremedia.CMSampleBuffer r9 = r4.sampleBuffer     // Catch:{ all -> 0x00fc }
            monitor-exit(r1)     // Catch:{ all -> 0x00fc }
            return r9
        L_0x00c8:
            java.lang.String r4 = "CachedVideoTrack"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            r6.<init>()     // Catch:{ all -> 0x00fc }
            java.lang.String r7 = "readSample: hint nextFrameSegment frame == null "
            r6.append(r7)     // Catch:{ all -> 0x00fc }
            com.tencent.tav.decoder.decodecache.CacheSegment r7 = r8.nextFrameSegment     // Catch:{ all -> 0x00fc }
            java.util.List<com.tencent.tav.decoder.decodecache.CacheFrame> r7 = r7.cacheFrameList     // Catch:{ all -> 0x00fc }
            int r7 = r7.size()     // Catch:{ all -> 0x00fc }
            r6.append(r7)     // Catch:{ all -> 0x00fc }
            java.lang.String r7 = "  "
            r6.append(r7)     // Catch:{ all -> 0x00fc }
            com.tencent.tav.decoder.decodecache.CacheSegment r7 = r8.currentFrameSegment     // Catch:{ all -> 0x00fc }
            java.util.List<com.tencent.tav.decoder.decodecache.CacheFrame> r7 = r7.cacheFrameList     // Catch:{ all -> 0x00fc }
            int r7 = r7.size()     // Catch:{ all -> 0x00fc }
            r6.append(r7)     // Catch:{ all -> 0x00fc }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00fc }
            com.tencent.tav.decoder.logger.Logger.m144649w(r4, r6)     // Catch:{ all -> 0x00fc }
            monitor-exit(r1)     // Catch:{ all -> 0x00fc }
            com.tencent.tav.decoder.decodecache.SegmentDecoderThread r1 = r8.segmentDecoder
            r1.cancel = r5
            goto L_0x0126
        L_0x00fc:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00fc }
            throw r9
        L_0x00ff:
            java.lang.String r1 = "CachedVideoTrack"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "readSample: hint nextFrameSegment --- "
            r4.append(r5)
            com.tencent.tav.decoder.decodecache.CacheSegment r5 = r8.nextFrameSegment
            if (r5 != 0) goto L_0x0112
            java.lang.String r5 = ""
            goto L_0x0114
        L_0x0112:
            com.tencent.tav.coremedia.CMTimeRange r5 = r5.segmentTimeRange
        L_0x0114:
            r4.append(r5)
            java.lang.String r5 = "  "
            r4.append(r5)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            com.tencent.tav.decoder.logger.Logger.m144649w(r1, r4)
        L_0x0126:
            java.lang.Object r1 = r8.nextFrameDecoderLock
            monitor-enter(r1)
            com.tencent.tav.decoder.decodecache.CacheSegment r4 = r8.nextFrameSegment     // Catch:{ all -> 0x01ea }
            if (r4 == 0) goto L_0x0130
            r4.clear()     // Catch:{ all -> 0x01ea }
        L_0x0130:
            com.tencent.tav.decoder.decodecache.CacheSegment r4 = new com.tencent.tav.decoder.decodecache.CacheSegment     // Catch:{ all -> 0x01ea }
            com.tencent.tav.coremedia.CMTimeRange r5 = new com.tencent.tav.coremedia.CMTimeRange     // Catch:{ all -> 0x01ea }
            com.tencent.tav.coremedia.CMTime r6 = r8.getFrameDuration()     // Catch:{ all -> 0x01ea }
            int r7 = r8.segmentSize     // Catch:{ all -> 0x01ea }
            float r7 = (float) r7     // Catch:{ all -> 0x01ea }
            com.tencent.tav.coremedia.CMTime r6 = r6.multi((float) r7)     // Catch:{ all -> 0x01ea }
            r5.<init>(r9, r6)     // Catch:{ all -> 0x01ea }
            r4.<init>(r5)     // Catch:{ all -> 0x01ea }
            r8.nextFrameSegment = r4     // Catch:{ all -> 0x01ea }
            com.tencent.tav.decoder.decodecache.SegmentDecoderThread r9 = r8.segmentDecoder     // Catch:{ all -> 0x01ea }
            r9.decoderSegment((com.tencent.tav.decoder.decodecache.CacheSegment) r4, (com.tencent.tav.decoder.decodecache.RequestStatus) r0)     // Catch:{ all -> 0x01ea }
            monitor-exit(r1)     // Catch:{ all -> 0x01ea }
            monitor-enter(r0)
            boolean r9 = r0.getFinish()     // Catch:{ InterruptedException -> 0x015d }
            if (r9 != 0) goto L_0x015d
            r4 = 10000(0x2710, double:4.9407E-320)
            r0.wait(r4)     // Catch:{ InterruptedException -> 0x015d }
            goto L_0x015d
        L_0x015a:
            r9 = move-exception
            goto L_0x01e8
        L_0x015d:
            monitor-exit(r0)     // Catch:{ all -> 0x015a }
            com.tencent.tav.decoder.decodecache.CacheSegment r9 = r8.nextFrameSegment
            java.util.List<com.tencent.tav.decoder.decodecache.CacheFrame> r9 = r9.cacheFrameList
            int r9 = r9.size()
            if (r9 != 0) goto L_0x0174
            com.tencent.tav.coremedia.CMSampleBuffer r9 = new com.tencent.tav.coremedia.CMSampleBuffer
            r0 = -1
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r0)
            r9.<init>((com.tencent.tav.coremedia.CMSampleState) r0)
            return r9
        L_0x0174:
            r8.clearCurrentFrameSegment()
            com.tencent.tav.decoder.decodecache.CacheSegment r9 = new com.tencent.tav.decoder.decodecache.CacheSegment
            com.tencent.tav.decoder.decodecache.CacheSegment r0 = r8.nextFrameSegment
            com.tencent.tav.coremedia.CMTimeRange r0 = r0.segmentTimeRange
            r9.<init>(r0)
            r8.currentFrameSegment = r9
            com.tencent.tav.decoder.decodecache.CacheSegment r9 = r8.nextFrameSegment
            java.util.List<com.tencent.tav.decoder.decodecache.CacheFrame> r9 = r9.cacheFrameList
            java.util.Iterator r9 = r9.iterator()
        L_0x018a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x019c
            java.lang.Object r0 = r9.next()
            com.tencent.tav.decoder.decodecache.CacheFrame r0 = (com.tencent.tav.decoder.decodecache.CacheFrame) r0
            com.tencent.tav.decoder.decodecache.CacheSegment r1 = r8.currentFrameSegment
            r1.pushFrame(r0)
            goto L_0x018a
        L_0x019c:
            java.lang.Object r9 = r8.nextFrameDecoderLock
            monitor-enter(r9)
            com.tencent.tav.decoder.decodecache.CacheSegment r0 = new com.tencent.tav.decoder.decodecache.CacheSegment     // Catch:{ all -> 0x01e5 }
            com.tencent.tav.coremedia.CMTimeRange r1 = new com.tencent.tav.coremedia.CMTimeRange     // Catch:{ all -> 0x01e5 }
            com.tencent.tav.decoder.decodecache.CacheSegment r4 = r8.currentFrameSegment     // Catch:{ all -> 0x01e5 }
            com.tencent.tav.coremedia.CMTime r4 = r4.getLastFrameTime()     // Catch:{ all -> 0x01e5 }
            com.tencent.tav.coremedia.CMTime r5 = r8.getFrameDuration()     // Catch:{ all -> 0x01e5 }
            int r6 = r8.segmentSize     // Catch:{ all -> 0x01e5 }
            float r6 = (float) r6     // Catch:{ all -> 0x01e5 }
            com.tencent.tav.coremedia.CMTime r5 = r5.multi((float) r6)     // Catch:{ all -> 0x01e5 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x01e5 }
            r0.<init>(r1)     // Catch:{ all -> 0x01e5 }
            r8.nextFrameSegment = r0     // Catch:{ all -> 0x01e5 }
            com.tencent.tav.decoder.decodecache.SegmentDecoderThread r1 = r8.segmentDecoder     // Catch:{ all -> 0x01e5 }
            r1.decoderSegment((com.tencent.tav.decoder.decodecache.CacheSegment) r0, (com.tencent.tav.decoder.decodecache.RequestStatus) r3)     // Catch:{ all -> 0x01e5 }
            monitor-exit(r9)     // Catch:{ all -> 0x01e5 }
            com.tencent.tav.decoder.decodecache.CacheSegment r9 = r8.currentFrameSegment
            if (r9 == 0) goto L_0x01e4
            java.util.List<com.tencent.tav.decoder.decodecache.CacheFrame> r9 = r9.cacheFrameList
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x01e4
            com.tencent.tav.decoder.decodecache.CacheSegment r9 = r8.currentFrameSegment
            java.util.List<com.tencent.tav.decoder.decodecache.CacheFrame> r9 = r9.cacheFrameList
            java.lang.Object r9 = r9.get(r2)
            com.tencent.tav.decoder.decodecache.CacheFrame r9 = (com.tencent.tav.decoder.decodecache.CacheFrame) r9
            com.tencent.tav.coremedia.CMSampleState r0 = new com.tencent.tav.coremedia.CMSampleState
            com.tencent.tav.coremedia.CMTime r1 = r9.frameTime
            r0.<init>(r1)
            r8.lastSampleState = r0
            com.tencent.tav.coremedia.CMSampleBuffer r9 = r9.sampleBuffer
            return r9
        L_0x01e4:
            return r3
        L_0x01e5:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01e5 }
            throw r0
        L_0x01e8:
            monitor-exit(r0)     // Catch:{ all -> 0x015a }
            throw r9
        L_0x01ea:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01ea }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.decodecache.CachedVideoDecoderTrack.decoderSegment(com.tencent.tav.coremedia.CMTime):com.tencent.tav.coremedia.CMSampleBuffer");
    }

    public void asyncReadNextSample(CMTime cMTime) {
    }

    public void clipRangeAndClearRange(CMTimeRange cMTimeRange) {
        this.segmentDecoder.decoderTrack.clipRangeAndClearRange(cMTimeRange);
    }

    public CMTime getCurrentSampleTime() {
        return this.lastSampleState.getTime();
    }

    public AverageTimeReporter getDecodePerformance() {
        return null;
    }

    public CMTime getDuration() {
        return this.segmentDecoder.decoderTrack.getDuration();
    }

    public CMTime getFrameDuration() {
        return this.segmentDecoder.decoderTrack.getFrameDuration();
    }

    public int getFrameRate() {
        return this.segmentDecoder.decoderTrack.getFrameRate();
    }

    public long getLaggingTime() {
        return 0;
    }

    public int getTrackId() {
        return this.segmentDecoder.decoderTrack.getTrackId();
    }

    public CMSampleBuffer readSample() {
        if (this.lastSampleState.isInvalid()) {
            return readSample(CMTime.CMTimeZero);
        }
        if (this.lastSampleState.getTime().smallThan(CMTime.CMTimeZero)) {
            return new CMSampleBuffer(this.lastSampleState);
        }
        return readSample(this.lastSampleState.getTime().add(getFrameDuration()));
    }

    public void release() {
        CacheSegment cacheSegment = this.currentFrameSegment;
        if (cacheSegment != null) {
            cacheSegment.clear();
        }
        CacheSegment cacheSegment2 = this.nextFrameSegment;
        if (cacheSegment2 != null) {
            cacheSegment2.clear();
        }
        synchronized (this.nextFrameDecoderLock) {
            SegmentDecoderThread segmentDecoderThread = this.segmentDecoder;
            if (segmentDecoderThread != null) {
                segmentDecoderThread.release();
                this.segmentDecoder = null;
            }
        }
    }

    public CMSampleBuffer seekTo(CMTime cMTime, boolean z, boolean z2) {
        Logger.m144648v(TAG, "seekTo: PlayerThreadMain " + cMTime);
        if (cMTime.bigThan(getFrameDuration())) {
            this.lastSampleState = new CMSampleState(cMTime.sub(getFrameDuration()));
        } else {
            this.lastSampleState = new CMSampleState(cMTime);
        }
        CacheSegment cacheSegment = this.currentFrameSegment;
        if (cacheSegment != null) {
            cacheSegment.clear();
            this.currentFrameSegment = null;
        }
        CacheSegment cacheSegment2 = this.nextFrameSegment;
        if (cacheSegment2 != null) {
            cacheSegment2.clear();
            this.nextFrameSegment = null;
        }
        if (!z) {
            return null;
        }
        CMSampleBuffer decoderFrame = decoderFrame(new CMTime(((float) (((cMTime.getTimeUs() / getFrameDuration().getTimeUs()) + ((long) (cMTime.getTimeUs() % getFrameDuration().getTimeUs() > 0 ? 1 : 0))) * getFrameDuration().getTimeUs())) / 1000000.0f));
        this.lastSampleState = decoderFrame == null ? CMSampleState.fromError(-1) : decoderFrame.getState();
        return decoderFrame;
    }

    public void setDecodeType(IDecoder.DecodeType decodeType) {
        this.segmentDecoder.decoderTrack.setDecodeType(decodeType);
    }

    public void setFrameRate(int i) {
        this.segmentDecoder.decoderTrack.setFrameRate(i);
    }

    public void setMaxFrameCacheSize(int i) {
        if (i > 0) {
            this.segmentSize = i;
            SegmentDecoderThread segmentDecoderThread = this.segmentDecoder;
            if (segmentDecoderThread != null) {
                segmentDecoderThread.texturePool.setMaxCacheLength(i);
            }
        }
    }

    public void setRevert(boolean z) {
        this.revert = z;
    }

    public void setTrackSegments(List<DecoderTrackSegment> list) {
        this.segmentDecoder.decoderTrack.setTrackSegments(list);
    }

    public void setVolume(float f) {
        this.segmentDecoder.decoderTrack.setVolume(f);
    }

    public void start() {
        start((IDecoderTrack.SurfaceCreator) null);
    }

    public void start(IDecoderTrack.SurfaceCreator surfaceCreator) {
        start(surfaceCreator, (CMTimeRange) null);
    }

    public void start(IDecoderTrack.SurfaceCreator surfaceCreator, CMTimeRange cMTimeRange) {
        this.validTimeRange = cMTimeRange;
        this.renderContext = (RenderContext) surfaceCreator;
        this.segmentDecoder.startForReady();
    }

    public CMSampleBuffer readSample(CMTime cMTime) {
        CacheFrame popFrame;
        if (cMTime.smallThan(CMTime.CMTimeZero)) {
            return readSample();
        }
        Logger.m144648v(TAG, "readSample: targetTime = " + cMTime);
        CacheSegment cacheSegment = this.currentFrameSegment;
        if (cacheSegment != null && (popFrame = cacheSegment.popFrame(cMTime)) != null) {
            this.lastSampleState = new CMSampleState(popFrame.frameTime);
            StringBuilder sb = new StringBuilder();
            sb.append("readSample: hint currentSegment ");
            CMSampleBuffer cMSampleBuffer = popFrame.sampleBuffer;
            sb.append((cMSampleBuffer == null || cMSampleBuffer.getTextureInfo() == null) ? false : true);
            sb.append("  ");
            CMSampleBuffer cMSampleBuffer2 = popFrame.sampleBuffer;
            sb.append(cMSampleBuffer2 != null ? Boolean.valueOf(cMSampleBuffer2.isNewFrame()) : "null");
            sb.append(" time = ");
            sb.append(popFrame.realFrameTime);
            sb.append("  ");
            sb.append(popFrame.frameTime);
            Logger.m144648v(TAG, sb.toString());
            return popFrame.sampleBuffer;
        } else if (!cMTime.smallThan(getDuration())) {
            this.lastSampleState = CMSampleState.fromError(-1);
            return new CMSampleBuffer(CMSampleState.fromError(-1));
        } else {
            CMSampleBuffer decoderSegment = decoderSegment(cMTime);
            if (decoderSegment != null) {
                Logger.m144648v(TAG, "readSample: hint currentSegment - " + decoderSegment.getTime());
                return decoderSegment;
            } else if (cMTime.bigThan(getDuration())) {
                this.lastSampleState = CMSampleState.fromError(-1);
                return new CMSampleBuffer(CMSampleState.fromError(-1));
            } else {
                this.lastSampleState = CMSampleState.fromError(-3);
                return new CMSampleBuffer(CMSampleState.fromError(-3));
            }
        }
    }
}
