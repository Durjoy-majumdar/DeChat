package com.tencent.tav.decoder;

import android.view.Surface;
import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.asset.AssetTrackSegment;
import com.tencent.tav.codec.IDecoderFactory;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMPerformance;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMSampleState;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.IDecoder;
import com.tencent.tav.decoder.IDecoderTrack;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.decoder.thread.ReActionHandlerThread;
import com.tencent.tav.extractor.ExtractorUtils;
import com.tencent.tav.report.AverageTimeReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VideoDecoderTrack implements IDecoderTrack {
    public static boolean LOG_VERBOSE = false;
    public static boolean PRE_READ = true;
    /* access modifiers changed from: private */
    public static String TAG = "VDecoderTrack";
    private Surface _outputSurface;
    private float _speed;
    /* access modifiers changed from: private */
    public IVideoDecoder currentDecoder;
    private final Object currentDecoderLock;
    private CMSampleBuffer currentFrame;
    private CMTime currentSegmentStartTime;
    private boolean decodeError;
    private Exception decodeException;
    private final AverageTimeReporter decodeReporter;
    private IDecoder.DecodeType decodeType = IDecoder.DecodeType.Video;
    /* access modifiers changed from: private */
    public DecoderCreateThread decoderCreateThread;
    /* access modifiers changed from: private */
    public IDecoderFactory decoderFactory;
    private final DecoderThread decoderThread;
    private CMTime duration;
    private CMTime frameDuration = new CMTime(1, 44);
    private int frameRate = 44;
    /* access modifiers changed from: private */
    public boolean isReleased;
    /* access modifiers changed from: private */
    public CMSampleState lastSampleState;
    /* access modifiers changed from: private */
    public DecoderWrapper nextDecoder;
    /* access modifiers changed from: private */
    public final Object nextDecoderLock;
    /* access modifiers changed from: private */
    public CMSampleBuffer nextFrame;
    /* access modifiers changed from: private */
    public final Object nextFrameDecoderLock;
    /* access modifiers changed from: private */
    public ArrayList<AverageTimeReporter> preReadReporters = new ArrayList<>();
    private int segmentIndex = -1;
    /* access modifiers changed from: private */
    public ArrayList<DecoderTrackSegment> segments = new ArrayList<>();
    private boolean started;
    /* access modifiers changed from: private */
    public IDecoderTrack.SurfaceCreator surfaceCreator;
    private int trackId;

    public class DecoderCreateThread extends Thread {
        private Surface outputSurface;
        /* access modifiers changed from: private */
        public int segmentIndex;
        public DecoderAssetTrack videoAsset;

        private void checkCreateDecoder() {
            if (VideoDecoderTrack.this.nextDecoder != null && ExtractorUtils.isSameExtractor(VideoDecoderTrack.this.nextDecoder.extractor, this.videoAsset)) {
                return;
            }
            if (VideoDecoderTrack.this.nextDecoder == null) {
                createDecoder();
                return;
            }
            String access$400 = VideoDecoderTrack.TAG;
            Logger.m144641d(access$400, "DecoderCreateThread create - " + this.videoAsset.assetPath);
            if (!(VideoDecoderTrack.this.nextDecoder.decoder == null || VideoDecoderTrack.this.nextDecoder.decoder == VideoDecoderTrack.this.currentDecoder)) {
                releaseNextDecoder();
            }
            createDecoder();
        }

        private void createDecoder() {
            IVideoDecoder iVideoDecoder;
            Exception e;
            if (VideoDecoderTrack.this.segments != null && this.segmentIndex < VideoDecoderTrack.this.segments.size()) {
                try {
                    Surface surface = this.outputSurface;
                    DecoderAssetTrack decoderAssetTrack = this.videoAsset;
                    if (decoderAssetTrack.sourceType == 3) {
                        iVideoDecoder = new ImageDecoder();
                        try {
                            VideoDecoderTrack.this.free(surface);
                            iVideoDecoder.init(this.videoAsset.assetPath, ImageDecoder.IMAGE_DECODE_SIZE, (IDecoderTrack.SurfaceCreator) null);
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } else {
                        iVideoDecoder = new VideoDecoder(decoderAssetTrack.assetPath, surface, VideoDecoderTrack.this.surfaceCreator.videoTextureForSurface(this.outputSurface), VideoDecoderTrack.this.decoderFactory);
                    }
                    iVideoDecoder.start(VideoDecoderTrack.this.getSegment(this.segmentIndex).getTimeRange(), VideoDecoderTrack.this.getSegment(this.segmentIndex).getDecoderStartTime());
                    VideoDecoderTrack videoDecoderTrack = VideoDecoderTrack.this;
                    DecoderWrapper unused = videoDecoderTrack.nextDecoder = new DecoderWrapper();
                    VideoDecoderTrack.this.nextDecoder.outputSurface = surface;
                    VideoDecoderTrack.this.nextDecoder.decoder = iVideoDecoder;
                    VideoDecoderTrack.this.nextDecoder.extractor = this.videoAsset;
                    VideoDecoderTrack.this.nextDecoder.segmentIndex = this.segmentIndex;
                    ((AverageTimeReporter) VideoDecoderTrack.this.preReadReporters.get(this.segmentIndex)).add(iVideoDecoder.getPreReadCost());
                    Logger.m144641d(VideoDecoderTrack.TAG, "DecoderCreateThread success - " + this.videoAsset.assetPath);
                } catch (Exception e3) {
                    iVideoDecoder = null;
                    e = e3;
                    Logger.m144644e(VideoDecoderTrack.TAG, "createDecoder: ", (Throwable) e);
                    VideoDecoderTrack.this.tryReleaseDecoder(iVideoDecoder);
                }
            }
        }

        private void releaseNextDecoder() {
            synchronized (VideoDecoderTrack.this.nextDecoderLock) {
                if (VideoDecoderTrack.this.nextDecoder != null) {
                    VideoDecoderTrack.this.nextDecoder.release();
                    DecoderWrapper unused = VideoDecoderTrack.this.nextDecoder = null;
                }
            }
        }

        public void run() {
            String access$400 = VideoDecoderTrack.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("DecoderCreateThread start - ");
            sb.append(this.videoAsset.assetPath);
            sb.append(" - ");
            sb.append(this.outputSurface != null);
            Logger.m144641d(access$400, sb.toString());
            if (VideoDecoderTrack.this.isReleased) {
                DecoderCreateThread unused = VideoDecoderTrack.this.decoderCreateThread = null;
                return;
            }
            synchronized (VideoDecoderTrack.this.nextDecoderLock) {
                checkCreateDecoder();
            }
            DecoderCreateThread unused2 = VideoDecoderTrack.this.decoderCreateThread = null;
            if (VideoDecoderTrack.this.isReleased) {
                releaseNextDecoder();
            }
            String access$4002 = VideoDecoderTrack.TAG;
            Logger.m144641d(access$4002, "DecoderCreateThread finish - " + this.videoAsset.assetPath);
        }

        private DecoderCreateThread(DecoderAssetTrack decoderAssetTrack, Surface surface, int i) {
            super("DecoderCreateThread " + decoderAssetTrack.assetPath);
            this.videoAsset = decoderAssetTrack;
            this.outputSurface = surface;
            this.segmentIndex = i;
        }
    }

    public class DecoderThread extends ReActionHandlerThread {
        private static final String NAME = "VideoDecoder";

        private void doActionInDecoderLock() {
            if (VideoDecoderTrack.this.nextFrame != null) {
                if (VideoDecoderTrack.this.lastSampleState.isInvalid()) {
                    VideoDecoderTrack.this.logVerbose("DecoderThread doAction: CMTime.CMTimeZero");
                    VideoDecoderTrack videoDecoderTrack = VideoDecoderTrack.this;
                    CMSampleBuffer unused = videoDecoderTrack.nextFrame = videoDecoderTrack.doReadSample(CMTime.CMTimeZero, true);
                } else if (VideoDecoderTrack.this.lastSampleState.getStateCode() >= 0) {
                    VideoDecoderTrack.this.logVerbose("DecoderThread doAction: lastSampleTime.add(frameDuration) ");
                    CMSampleState state = VideoDecoderTrack.this.nextFrame.getState();
                    if (state == null) {
                        Logger.m144643e(VideoDecoderTrack.TAG, "frame state is null");
                        CMSampleBuffer unused2 = VideoDecoderTrack.this.nextFrame = new CMSampleBuffer(CMSampleState.fromError(-211));
                        return;
                    }
                    VideoDecoderTrack videoDecoderTrack2 = VideoDecoderTrack.this;
                    CMSampleBuffer unused3 = videoDecoderTrack2.nextFrame = videoDecoderTrack2.doReadSample(state.getTime(), true);
                }
            }
        }

        public void doAction() {
            synchronized (VideoDecoderTrack.this.nextFrameDecoderLock) {
                doActionInDecoderLock();
            }
        }

        private DecoderThread() {
            super(NAME);
        }
    }

    public class DecoderWrapper {
        public IVideoDecoder decoder;
        public DecoderAssetTrack extractor;
        public Surface outputSurface;
        public int segmentIndex;

        private DecoderWrapper() {
            this.segmentIndex = -1;
        }

        /* access modifiers changed from: private */
        public void release() {
            Logger.m144641d(VideoDecoderTrack.TAG, "Video DecoderWrapper release: ");
            VideoDecoderTrack.this.tryReleaseDecoder(this.decoder);
        }
    }

    public class ReleaseDecoderThread extends Thread {
        private IVideoDecoder decoder;

        public ReleaseDecoderThread(IVideoDecoder iVideoDecoder) {
            super("ReleaseDecoderThread");
            this.decoder = iVideoDecoder;
        }

        private void doRelease() {
            if (this.decoder != null) {
                Logger.m144641d(VideoDecoderTrack.TAG, "ReleaseDecoderThread start");
                this.decoder.release(true);
                VideoDecoderTrack.this.free(this.decoder.outputSurface());
                this.decoder = null;
                Logger.m144641d(VideoDecoderTrack.TAG, "ReleaseDecoderThread end");
            }
        }

        public void run() {
            doRelease();
        }

        public void start() {
            if (!(this.decoder instanceof VideoDecoder)) {
                doRelease();
            }
            super.start();
        }
    }

    public VideoDecoderTrack(AssetTrack assetTrack, IDecoderFactory iDecoderFactory) {
        CMTime cMTime = CMTime.CMTimeZero;
        this.currentSegmentStartTime = cMTime;
        this.lastSampleState = new CMSampleState();
        this.decoderCreateThread = null;
        this.nextDecoderLock = new Object();
        this.currentDecoderLock = new Object();
        this.nextFrameDecoderLock = new Object();
        this.isReleased = false;
        this.nextFrame = null;
        this.currentFrame = null;
        this.duration = cMTime;
        this.decoderThread = new DecoderThread();
        this.surfaceCreator = null;
        this.decodeReporter = new AverageTimeReporter();
        this._speed = 1.0f;
        this.started = false;
        this.decodeError = false;
        this.decodeException = null;
        this.decoderFactory = iDecoderFactory;
        this.trackId = assetTrack.getTrackID();
        List<AssetTrackSegment> segments2 = assetTrack.getSegments();
        ArrayList arrayList = new ArrayList();
        this.preReadReporters.clear();
        for (AssetTrackSegment decoderTrackSegment : segments2) {
            arrayList.add(new DecoderTrackSegment(assetTrack, decoderTrackSegment));
            this.preReadReporters.add(new AverageTimeReporter());
        }
        setTrackSegments(arrayList);
        setFrameRate(getFrameRate() > 0 ? getFrameRate() : (int) assetTrack.getNominalFrameRate());
        setVolume(assetTrack.getPreferredVolume());
        setDecodeType(IDecoder.DecodeType.Video);
        if (assetTrack.getTimeRange() != null) {
            clipRangeAndClearRange(assetTrack.getTimeRange().clone());
        }
    }

    private void clipRangeAndRemoveRange(CMTimeRange cMTimeRange) {
        if (cMTimeRange != null && cMTimeRange.getDurationUs() > 0 && this.segments.size() != 0) {
            CMTime start = cMTimeRange.getStart();
            CMTime end = cMTimeRange.getEnd();
            int findSegmentIndexAt = findSegmentIndexAt(start, false);
            if (findSegmentIndexAt != -1) {
                int findSegmentIndexAt2 = findSegmentIndexAt(end, false);
                if (findSegmentIndexAt2 == -1) {
                    findSegmentIndexAt2 = this.segments.size() - 1;
                } else if (getSegmentStartTime(findSegmentIndexAt2) == end) {
                    findSegmentIndexAt2--;
                }
                CMTime segmentStartTime = getSegmentStartTime(findSegmentIndexAt);
                CMTime segmentStartTime2 = getSegmentStartTime(findSegmentIndexAt2);
                DecoderTrackSegment segment = getSegment(findSegmentIndexAt);
                DecoderTrackSegment segment2 = getSegment(findSegmentIndexAt2);
                if (segment2.getTimeRange().getDurationUs() > 0 && !getSegmentStartTime(findSegmentIndexAt2 + 1).smallThan(cMTimeRange.getEnd())) {
                    CMTime sub = cMTimeRange.getEnd().sub(segmentStartTime2);
                    segment2.setTimeRange(new CMTimeRange(segment2.getTimeRange().getStart(), sub.divide((((float) segment2.getScaledDuration().getTimeUs()) * 1.0f) / ((float) segment2.getTimeRange().getDurationUs()))));
                    segment2.setScaledDuration(sub);
                }
                if (segment.getTimeRange().getDurationUs() > 0) {
                    float timeUs = (((float) segment.getScaledDuration().getTimeUs()) * 1.0f) / ((float) segment.getTimeRange().getDurationUs());
                    CMTime sub2 = cMTimeRange.getStart().sub(segmentStartTime);
                    CMTime divide = sub2.divide(timeUs);
                    segment.setTimeRange(new CMTimeRange(segment.getTimeRange().getStart().add(divide), segment.getTimeRange().getDuration().sub(divide)));
                    segment.setScaledDuration(segment.getScaledDuration().sub(sub2));
                }
                for (int size = this.segments.size() - 1; size >= 0; size--) {
                    if (size > findSegmentIndexAt2 || size < findSegmentIndexAt) {
                        this.segments.remove(size);
                    }
                }
                if (getSegmentStartTime(findSegmentIndexAt2 + 1).smallThan(cMTimeRange.getEnd())) {
                    this.segments.add(new DecoderTrackSegment(new CMTimeRange(CMTime.CMTimeZero, end.sub(segment2.getScaledDuration().add(segmentStartTime2))), (DecoderAssetTrack) null));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01f4, code lost:
        return r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01d1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0163 A[Catch:{ Exception -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0177 A[SYNTHETIC, Splitter:B:96:0x0177] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.tencent.tav.decoder.IVideoDecoder createDecoder(com.tencent.tav.decoder.DecoderTrackSegment r13, com.tencent.tav.coremedia.CMTime r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            com.tencent.tav.decoder.DecoderAssetTrack r0 = r13.getVideoAsset()     // Catch:{ all -> 0x01f5 }
            r1 = 0
            if (r0 != 0) goto L_0x000a
            monitor-exit(r12)
            return r1
        L_0x000a:
            java.lang.String r2 = TAG     // Catch:{ all -> 0x01f5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f5 }
            r3.<init>()     // Catch:{ all -> 0x01f5 }
            java.lang.String r4 = "createDecoder - "
            r3.append(r4)     // Catch:{ all -> 0x01f5 }
            java.lang.String r4 = r0.assetPath     // Catch:{ all -> 0x01f5 }
            r3.append(r4)     // Catch:{ all -> 0x01f5 }
            java.lang.String r4 = " - "
            r3.append(r4)     // Catch:{ all -> 0x01f5 }
            com.tencent.tav.decoder.IDecoderTrack$SurfaceCreator r4 = r12.surfaceCreator     // Catch:{ all -> 0x01f5 }
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0028
            r4 = 1
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            r3.append(r4)     // Catch:{ all -> 0x01f5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01f5 }
            com.tencent.tav.decoder.logger.Logger.m144646i(r2, r3)     // Catch:{ all -> 0x01f5 }
            r2 = 5
        L_0x0034:
            r3 = r1
        L_0x0035:
            if (r3 != 0) goto L_0x01f3
            if (r2 <= 0) goto L_0x01f3
            int r2 = r2 + -1
            com.tencent.tav.decoder.VideoDecoderTrack$DecoderCreateThread r4 = r12.decoderCreateThread     // Catch:{ all -> 0x01f5 }
            if (r4 == 0) goto L_0x00cb
            int r4 = r4.segmentIndex     // Catch:{ all -> 0x01f5 }
            java.util.ArrayList<com.tencent.tav.decoder.DecoderTrackSegment> r7 = r12.segments     // Catch:{ all -> 0x01f5 }
            int r7 = r7.size()     // Catch:{ all -> 0x01f5 }
            if (r4 >= r7) goto L_0x0148
            com.tencent.tav.decoder.DecoderTrackSegment r4 = r12.getSegment(r4)     // Catch:{ all -> 0x01f5 }
            com.tencent.tav.decoder.DecoderAssetTrack r4 = r4.getVideoAsset()     // Catch:{ all -> 0x01f5 }
            boolean r4 = com.tencent.tav.extractor.ExtractorUtils.isSameExtractor(r4, r0)     // Catch:{ all -> 0x01f5 }
            if (r4 == 0) goto L_0x0148
            java.lang.String r4 = TAG     // Catch:{ all -> 0x01f5 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f5 }
            r7.<init>()     // Catch:{ all -> 0x01f5 }
            java.lang.String r8 = "check  decoder 1 - "
            r7.append(r8)     // Catch:{ all -> 0x01f5 }
            java.lang.String r8 = r0.assetPath     // Catch:{ all -> 0x01f5 }
            r7.append(r8)     // Catch:{ all -> 0x01f5 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x01f5 }
            com.tencent.tav.decoder.logger.Logger.m144646i(r4, r7)     // Catch:{ all -> 0x01f5 }
            java.lang.Object r4 = r12.nextDecoderLock     // Catch:{ all -> 0x01f5 }
            monitor-enter(r4)     // Catch:{ all -> 0x01f5 }
            com.tencent.tav.decoder.VideoDecoderTrack$DecoderWrapper r7 = r12.nextDecoder     // Catch:{ all -> 0x00c8 }
            if (r7 == 0) goto L_0x00c5
            com.tencent.tav.decoder.DecoderAssetTrack r7 = r7.extractor     // Catch:{ all -> 0x00c8 }
            boolean r7 = com.tencent.tav.extractor.ExtractorUtils.isSameExtractor(r7, r0)     // Catch:{ all -> 0x00c8 }
            if (r7 == 0) goto L_0x00c5
            com.tencent.tav.decoder.VideoDecoderTrack$DecoderWrapper r7 = r12.nextDecoder     // Catch:{ all -> 0x00c8 }
            com.tencent.tav.decoder.IVideoDecoder r8 = r7.decoder     // Catch:{ all -> 0x00c8 }
            if (r8 == 0) goto L_0x00c5
            int r14 = r7.segmentIndex     // Catch:{ all -> 0x00c8 }
            com.tencent.tav.decoder.DecoderTrackSegment r14 = r12.getSegment(r14)     // Catch:{ all -> 0x00c8 }
            if (r14 == r13) goto L_0x0099
            com.tencent.tav.coremedia.CMTimeRange r14 = r13.getTimeRange()     // Catch:{ all -> 0x00c8 }
            com.tencent.tav.coremedia.CMTime r13 = r13.getDecoderStartTime()     // Catch:{ all -> 0x00c8 }
            r8.start(r14, r13)     // Catch:{ all -> 0x00c8 }
        L_0x0099:
            r12.nextDecoder = r1     // Catch:{ all -> 0x00c8 }
            java.lang.String r13 = TAG     // Catch:{ all -> 0x00c8 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c8 }
            r14.<init>()     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "hint decoder - "
            r14.append(r0)     // Catch:{ all -> 0x00c8 }
            com.tencent.tav.decoder.IDecoderTrack$SurfaceCreator r0 = r12.surfaceCreator     // Catch:{ all -> 0x00c8 }
            if (r0 != 0) goto L_0x00ac
            r5 = 1
        L_0x00ac:
            r14.append(r5)     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "  "
            r14.append(r0)     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = r8.getSourcePath()     // Catch:{ all -> 0x00c8 }
            r14.append(r0)     // Catch:{ all -> 0x00c8 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x00c8 }
            com.tencent.tav.decoder.logger.Logger.m144646i(r13, r14)     // Catch:{ all -> 0x00c8 }
            monitor-exit(r4)     // Catch:{ all -> 0x00c8 }
            monitor-exit(r12)
            return r8
        L_0x00c5:
            monitor-exit(r4)     // Catch:{ all -> 0x00c8 }
            goto L_0x0148
        L_0x00c8:
            r13 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00c8 }
            throw r13     // Catch:{ all -> 0x01f5 }
        L_0x00cb:
            java.lang.String r4 = TAG     // Catch:{ all -> 0x01f5 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f5 }
            r7.<init>()     // Catch:{ all -> 0x01f5 }
            java.lang.String r8 = "check  decoder - "
            r7.append(r8)     // Catch:{ all -> 0x01f5 }
            java.lang.String r8 = r0.assetPath     // Catch:{ all -> 0x01f5 }
            r7.append(r8)     // Catch:{ all -> 0x01f5 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x01f5 }
            com.tencent.tav.decoder.logger.Logger.m144646i(r4, r7)     // Catch:{ all -> 0x01f5 }
            com.tencent.tav.decoder.VideoDecoderTrack$DecoderWrapper r4 = r12.nextDecoder     // Catch:{ all -> 0x01f5 }
            if (r4 == 0) goto L_0x0148
            com.tencent.tav.decoder.DecoderAssetTrack r4 = r4.extractor     // Catch:{ all -> 0x01f5 }
            boolean r4 = com.tencent.tav.extractor.ExtractorUtils.isSameExtractor(r4, r0)     // Catch:{ all -> 0x01f5 }
            if (r4 == 0) goto L_0x0148
            com.tencent.tav.decoder.VideoDecoderTrack$DecoderWrapper r4 = r12.nextDecoder     // Catch:{ all -> 0x01f5 }
            com.tencent.tav.decoder.IVideoDecoder r4 = r4.decoder     // Catch:{ all -> 0x01f5 }
            if (r4 == 0) goto L_0x0148
            java.lang.Object r4 = r12.nextDecoderLock     // Catch:{ all -> 0x01f5 }
            monitor-enter(r4)     // Catch:{ all -> 0x01f5 }
            com.tencent.tav.decoder.VideoDecoderTrack$DecoderWrapper r7 = r12.nextDecoder     // Catch:{ all -> 0x0145 }
            if (r7 == 0) goto L_0x0143
            com.tencent.tav.decoder.DecoderAssetTrack r8 = r7.extractor     // Catch:{ all -> 0x0145 }
            if (r8 != r0) goto L_0x0143
            com.tencent.tav.decoder.IVideoDecoder r8 = r7.decoder     // Catch:{ all -> 0x0145 }
            if (r8 == 0) goto L_0x0143
            int r14 = r7.segmentIndex     // Catch:{ all -> 0x0145 }
            com.tencent.tav.decoder.DecoderTrackSegment r14 = r12.getSegment(r14)     // Catch:{ all -> 0x0145 }
            if (r14 == r13) goto L_0x0117
            com.tencent.tav.coremedia.CMTimeRange r14 = r13.getTimeRange()     // Catch:{ all -> 0x0145 }
            com.tencent.tav.coremedia.CMTime r13 = r13.getDecoderStartTime()     // Catch:{ all -> 0x0145 }
            r8.start(r14, r13)     // Catch:{ all -> 0x0145 }
        L_0x0117:
            r12.nextDecoder = r1     // Catch:{ all -> 0x0145 }
            java.lang.String r13 = TAG     // Catch:{ all -> 0x0145 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0145 }
            r14.<init>()     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = "hint decoder - "
            r14.append(r0)     // Catch:{ all -> 0x0145 }
            com.tencent.tav.decoder.IDecoderTrack$SurfaceCreator r0 = r12.surfaceCreator     // Catch:{ all -> 0x0145 }
            if (r0 != 0) goto L_0x012a
            r5 = 1
        L_0x012a:
            r14.append(r5)     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = "  "
            r14.append(r0)     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = r8.getSourcePath()     // Catch:{ all -> 0x0145 }
            r14.append(r0)     // Catch:{ all -> 0x0145 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x0145 }
            com.tencent.tav.decoder.logger.Logger.m144646i(r13, r14)     // Catch:{ all -> 0x0145 }
            monitor-exit(r4)     // Catch:{ all -> 0x0145 }
            monitor-exit(r12)
            return r8
        L_0x0143:
            monitor-exit(r4)     // Catch:{ all -> 0x0145 }
            goto L_0x0148
        L_0x0145:
            r13 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0145 }
            throw r13     // Catch:{ all -> 0x01f5 }
        L_0x0148:
            com.tencent.tav.decoder.IDecoderTrack$SurfaceCreator r4 = r12.surfaceCreator     // Catch:{ Exception -> 0x01ad }
            if (r4 == 0) goto L_0x015d
            com.tencent.tav.coremedia.CGSize r7 = r0.size     // Catch:{ Exception -> 0x01ad }
            int r8 = r0.preferRotation     // Catch:{ Exception -> 0x01ad }
            if (r7 == 0) goto L_0x015d
            float r9 = r7.width     // Catch:{ Exception -> 0x01ad }
            int r9 = (int) r9     // Catch:{ Exception -> 0x01ad }
            float r7 = r7.height     // Catch:{ Exception -> 0x01ad }
            int r7 = (int) r7     // Catch:{ Exception -> 0x01ad }
            android.view.Surface r4 = r4.createOutputSurface(r9, r7, r8)     // Catch:{ Exception -> 0x01ad }
            goto L_0x015e
        L_0x015d:
            r4 = r1
        L_0x015e:
            int r7 = r0.sourceType     // Catch:{ Exception -> 0x01a8 }
            r8 = 3
            if (r7 != r8) goto L_0x0177
            com.tencent.tav.decoder.ImageDecoder r7 = new com.tencent.tav.decoder.ImageDecoder     // Catch:{ Exception -> 0x01a8 }
            r7.<init>()     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r3 = r0.assetPath     // Catch:{ Exception -> 0x0171 }
            com.tencent.tav.coremedia.CGSize r8 = com.tencent.tav.decoder.ImageDecoder.IMAGE_DECODE_SIZE     // Catch:{ Exception -> 0x0171 }
            r7.init(r3, r8, r1)     // Catch:{ Exception -> 0x0171 }
        L_0x016f:
            r3 = r7
            goto L_0x0187
        L_0x0171:
            r3 = move-exception
            r11 = r4
            r4 = r3
            r3 = r7
            r7 = r11
            goto L_0x01af
        L_0x0177:
            com.tencent.tav.decoder.VideoDecoder r7 = new com.tencent.tav.decoder.VideoDecoder     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r8 = r0.assetPath     // Catch:{ Exception -> 0x01a8 }
            com.tencent.tav.decoder.IDecoderTrack$SurfaceCreator r9 = r12.surfaceCreator     // Catch:{ Exception -> 0x01a8 }
            com.tencent.tav.decoder.VideoTexture r9 = r9.videoTextureForSurface(r4)     // Catch:{ Exception -> 0x01a8 }
            com.tencent.tav.codec.IDecoderFactory r10 = r12.decoderFactory     // Catch:{ Exception -> 0x01a8 }
            r7.<init>(r8, r4, r9, r10)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x016f
        L_0x0187:
            com.tencent.tav.coremedia.CMTimeRange r7 = r13.getTimeRange()     // Catch:{ Exception -> 0x01a8 }
            r3.start(r7, r14)     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r7 = TAG     // Catch:{ Exception -> 0x01a8 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a8 }
            r8.<init>()     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r9 = "createDecoder new Decoder success - "
            r8.append(r9)     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r9 = r0.assetPath     // Catch:{ Exception -> 0x01a8 }
            r8.append(r9)     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01a8 }
            com.tencent.tav.decoder.logger.Logger.m144646i(r7, r8)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x0035
        L_0x01a8:
            r7 = move-exception
            r11 = r7
            r7 = r4
            r4 = r11
            goto L_0x01af
        L_0x01ad:
            r4 = move-exception
            r7 = r1
        L_0x01af:
            java.lang.String r8 = TAG     // Catch:{ all -> 0x01f5 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f5 }
            r9.<init>()     // Catch:{ all -> 0x01f5 }
            java.lang.String r10 = " createDecoder "
            r9.append(r10)     // Catch:{ all -> 0x01f5 }
            java.lang.String r10 = r4.getMessage()     // Catch:{ all -> 0x01f5 }
            r9.append(r10)     // Catch:{ all -> 0x01f5 }
            r9.append(r4)     // Catch:{ all -> 0x01f5 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x01f5 }
            com.tencent.tav.decoder.logger.Logger.m144643e(r8, r9)     // Catch:{ all -> 0x01f5 }
            r12.free(r7)     // Catch:{ all -> 0x01f5 }
            if (r3 == 0) goto L_0x01df
            r3.release(r6)     // Catch:{ Exception -> 0x01de, all -> 0x01dc }
            android.view.Surface r3 = r3.outputSurface()     // Catch:{ Exception -> 0x01de, all -> 0x01dc }
            r12.free(r3)     // Catch:{ Exception -> 0x01de, all -> 0x01dc }
            goto L_0x01df
        L_0x01dc:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x01f5 }
        L_0x01de:
        L_0x01df:
            if (r2 != 0) goto L_0x0034
            java.lang.String r3 = r0.assetPath     // Catch:{ all -> 0x01f5 }
            if (r3 == 0) goto L_0x0034
            java.lang.String r7 = ""
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x01f5 }
            if (r3 != 0) goto L_0x0034
            r12.decodeError = r6     // Catch:{ all -> 0x01f5 }
            r12.decodeException = r4     // Catch:{ all -> 0x01f5 }
            goto L_0x0034
        L_0x01f3:
            monitor-exit(r12)
            return r3
        L_0x01f5:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.VideoDecoderTrack.createDecoder(com.tencent.tav.decoder.DecoderTrackSegment, com.tencent.tav.coremedia.CMTime):com.tencent.tav.decoder.IVideoDecoder");
    }

    private void createNextDecoder(int i) {
        int i2;
        ArrayList<DecoderTrackSegment> arrayList = this.segments;
        if (arrayList != null && PRE_READ && (i2 = i + 1) < arrayList.size() && this.decoderCreateThread == null) {
            DecoderAssetTrack videoAsset = getSegment(i2).getVideoAsset();
            if (videoAsset != null) {
                DecoderWrapper decoderWrapper = this.nextDecoder;
                if (decoderWrapper == null || !ExtractorUtils.isSameExtractor(decoderWrapper.extractor, videoAsset)) {
                    createDecoder(videoAsset, i2);
                    return;
                }
                return;
            }
            DecoderWrapper decoderWrapper2 = this.nextDecoder;
            if (decoderWrapper2 != null && decoderWrapper2.segmentIndex != i) {
                decoderWrapper2.decoder.start(getSegment(i).getTimeRange());
                this.nextDecoder.segmentIndex = i;
            }
        }
    }

    private CMSampleBuffer createSampleBuffer(boolean z) {
        CMSampleBuffer cMSampleBuffer = this.currentFrame;
        if (cMSampleBuffer != null) {
            return createSampleBuffer(this.lastSampleState, cMSampleBuffer.getTextureInfo(), z);
        }
        CMSampleState cMSampleState = this.lastSampleState;
        IVideoDecoder iVideoDecoder = this.currentDecoder;
        return createSampleBuffer(cMSampleState, iVideoDecoder == null ? null : iVideoDecoder.getTextureInfo(), z);
    }

    private synchronized CMSampleBuffer doReadSample(CMTime cMTime) {
        return doReadSample(cMTime, false);
    }

    private int findSegmentIndexAt(CMTime cMTime, boolean z) {
        boolean z2;
        CMTime cMTime2 = CMTime.CMTimeZero;
        Iterator<DecoderTrackSegment> it = this.segments.iterator();
        boolean z3 = false;
        int i = 0;
        while (true) {
            z2 = true;
            if (!it.hasNext()) {
                break;
            }
            CMTime scaledDuration = it.next().getScaledDuration();
            if (cMTime.compare(cMTime2) >= 0 && cMTime.smallThan(cMTime2.add(scaledDuration))) {
                z3 = true;
                break;
            }
            cMTime2 = cMTime2.add(scaledDuration);
            i++;
        }
        if (z3 || cMTime != cMTime2 || i <= 0 || !z) {
            z2 = z3;
        } else {
            i--;
        }
        if (z2) {
            return i;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public void free(Surface surface) {
        if (surface != null) {
            try {
                this.surfaceCreator.free(surface);
            } catch (Exception unused) {
            }
        }
    }

    private DecoderTrackSegment getCurrentSegment() {
        return getSegment(this.segmentIndex);
    }

    /* access modifiers changed from: private */
    public DecoderTrackSegment getSegment(int i) {
        return this.segments.get(i);
    }

    private CMTime getSegmentStartTime(int i) {
        CMTime cMTime = CMTime.CMTimeZero;
        int i2 = 0;
        while (i2 < i && i2 < this.segments.size()) {
            cMTime = CMTime.add(cMTime, getSegment(i2).getScaledDuration());
            i2++;
        }
        return cMTime;
    }

    /* access modifiers changed from: private */
    public void logVerbose(String str) {
        Logger.m144648v(TAG, str);
    }

    private boolean needSwitchNextFrame(CMSampleBuffer cMSampleBuffer, CMSampleBuffer cMSampleBuffer2, CMTime cMTime) {
        if (cMSampleBuffer == null) {
            return true;
        }
        CMTime time = cMSampleBuffer2.getTime();
        CMTime cMTime2 = CMTime.CMTimeZero;
        if (time.smallThan(cMTime2)) {
            return true;
        }
        long timeUs = cMSampleBuffer2.getTime().getTimeUs();
        long timeUs2 = cMTime.getTimeUs();
        if (cMSampleBuffer2.isNewFrame()) {
            int i = 0;
            while (i < this.segmentIndex && i < this.segments.size()) {
                cMTime2.add(this.segments.get(i).getScaledDuration());
                i++;
            }
            if (cMTime.bigThan(cMSampleBuffer.getTime()) && !cMTime.smallThan(cMTime2)) {
                return true;
            }
        }
        return Math.abs(timeUs2) >= Math.abs(timeUs);
    }

    private boolean nextSegment(boolean z) {
        String str = TAG;
        Logger.m144641d(str, "nextSegment:" + z);
        int i = this.segmentIndex + 1;
        this.segmentIndex = i;
        this._outputSurface = null;
        boolean z2 = false;
        if (i >= this.segments.size()) {
            this.segmentIndex = -1;
            return false;
        }
        CMTime segmentStartTime = getSegmentStartTime(this.segmentIndex);
        this.currentSegmentStartTime = segmentStartTime;
        this.lastSampleState = new CMSampleState(segmentStartTime);
        DecoderTrackSegment currentSegment = getCurrentSegment();
        if (currentSegment.getVideoAsset() != null) {
            synchronized (this.currentDecoderLock) {
                IVideoDecoder iVideoDecoder = this.currentDecoder;
                if (!(iVideoDecoder == null || iVideoDecoder.getSourcePath() == null)) {
                    new ReleaseDecoderThread(this.currentDecoder).start();
                    this.currentDecoder = null;
                }
            }
            IVideoDecoder createDecoder = createDecoder(currentSegment, z ? getCurrentSegment().getDecoderStartTime() : CMTime.CMTimeInvalid);
            synchronized (this.currentDecoderLock) {
                this.currentDecoder = createDecoder;
                if (createDecoder != null && createDecoder.hasTrack()) {
                    if (z) {
                        this.currentDecoder.seekTo(currentSegment.getDecoderStartTime());
                    }
                    this._outputSurface = this.currentDecoder.outputSurface();
                }
            }
        } else {
            Logger.m144641d(TAG, "nextSegment: videoAsset is null");
            synchronized (this.currentDecoderLock) {
                if (this.currentDecoder != null) {
                    new ReleaseDecoderThread(this.currentDecoder).start();
                    this.currentDecoder = null;
                }
            }
        }
        if (currentSegment.getScaledDuration().getTimeUs() > 0) {
            this._speed = (((float) currentSegment.getTimeRange().getDurationUs()) * 1.0f) / ((float) currentSegment.getScaledDuration().getTimeUs());
        }
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("nextSegment:");
        if (this.currentDecoder == null) {
            z2 = true;
        }
        sb.append(z2);
        sb.append(" ");
        sb.append(this._speed);
        Logger.m144641d(str2, sb.toString());
        return true;
    }

    private void release(Surface surface) {
        if (surface != null) {
            try {
                surface.release();
            } catch (Exception unused) {
            }
        }
    }

    private void releaseDecoder() {
        if (this.currentDecoder != null) {
            synchronized (this.currentDecoderLock) {
                IVideoDecoder iVideoDecoder = this.currentDecoder;
                if (!(iVideoDecoder == null || iVideoDecoder.getSourcePath() == null)) {
                    this.decodeReporter.add(this.currentDecoder.getDecodePerformance());
                    new ReleaseDecoderThread(this.currentDecoder).start();
                    this.currentDecoder = null;
                }
            }
        }
    }

    private CMTime segmentsDuration() {
        return getSegmentStartTime(this.segments.size());
    }

    private CMSampleBuffer switchToNextFrame() {
        VideoTexture texture;
        this.currentFrame = createSampleBuffer(this.nextFrame.getState(), this.nextFrame.getTextureInfo(), this.nextFrame.isNewFrame());
        if (this.nextFrame.isNewFrame()) {
            CMSampleBuffer cMSampleBuffer = this.nextFrame;
            if ((cMSampleBuffer instanceof CacheSampleBuffer) && (texture = ((CacheSampleBuffer) cMSampleBuffer).getTexture()) != null && !Thread.currentThread().getName().equals("VideoDecoder")) {
                logVerbose("readSample: awaitNewImage: " + this.nextFrame.getTime());
                try {
                    texture.awaitNewImage();
                } catch (Throwable th) {
                    Logger.m144644e(TAG, "readSample: videoTexture.awaitNewImage() error", th);
                    return createSampleBuffer(CMSampleState.fromError(-3));
                }
            }
        }
        this.nextFrame = createSampleBuffer(new CMSampleState());
        if (!this.currentFrame.getTime().smallThan(CMTime.CMTimeZero)) {
            return null;
        }
        this.lastSampleState = this.currentFrame.getState();
        return createSampleBuffer(this.currentFrame.getState());
    }

    /* access modifiers changed from: private */
    public void tryReleaseDecoder(IVideoDecoder iVideoDecoder) {
        if (iVideoDecoder != null) {
            try {
                iVideoDecoder.release(true);
                free(iVideoDecoder.outputSurface());
            } catch (Exception e) {
                Logger.m144644e(TAG, "tryReleaseDecoder Exception, ignore", (Throwable) e);
            }
        }
    }

    private boolean unNeedReDecoderNextFrame(CMTime cMTime) {
        CMSampleBuffer cMSampleBuffer = this.nextFrame;
        boolean z = cMSampleBuffer != null && cMSampleBuffer.getTime().bigThan(cMTime);
        CMSampleBuffer cMSampleBuffer2 = this.nextFrame;
        return z || (cMSampleBuffer2 != null && this.currentFrame != null && cMSampleBuffer2.getTime().bigThan(this.currentFrame.getTime()));
    }

    public synchronized void asyncReadNextSample(CMTime cMTime) {
        if (!unNeedReDecoderNextFrame(cMTime)) {
            if (!this.isReleased) {
                this.nextFrame = new CMSampleBuffer(cMTime);
                synchronized (this.decoderThread) {
                    this.decoderThread.action();
                }
            }
        }
    }

    public void clipRangeAndClearRange(CMTimeRange cMTimeRange) {
        if (cMTimeRange != null && cMTimeRange.getDurationUs() > 0 && this.segments.size() != 0) {
            CMTime start = cMTimeRange.getStart();
            CMTime end = cMTimeRange.getEnd();
            CMTime segmentsDuration = segmentsDuration();
            clipRangeAndRemoveRange(cMTimeRange);
            if (start.getValue() != 0) {
                this.segments.add(0, new DecoderTrackSegment(new CMTimeRange(CMTime.CMTimeZero, start), (DecoderAssetTrack) null));
            }
            if (end.getTimeUs() < segmentsDuration.getTimeUs()) {
                this.segments.add(new DecoderTrackSegment(new CMTimeRange(end, new CMTime(segmentsDuration.getTimeSeconds() - end.getTimeSeconds())), (DecoderAssetTrack) null));
            }
        }
    }

    public CMTime getCurrentSampleTime() {
        return this.lastSampleState.getTime();
    }

    public AverageTimeReporter getDecodePerformance() {
        return this.decodeReporter;
    }

    public CMTime getDuration() {
        CMTime cMTime = this.duration;
        CMTime cMTime2 = CMTime.CMTimeZero;
        if (cMTime == cMTime2) {
            Iterator<DecoderTrackSegment> it = this.segments.iterator();
            while (it.hasNext()) {
                cMTime2 = cMTime2.add(it.next().getScaledDuration());
            }
            this.duration = cMTime2;
        }
        return this.duration;
    }

    public CMTime getFrameDuration() {
        return this.frameDuration;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public long getLaggingTime() {
        long j = 0;
        for (int i = 1; i < this.preReadReporters.size(); i++) {
            j += Math.max(0, this.preReadReporters.get(i).average() - (this.segments.get(i).getScaledDuration().getTimeUs() / 1000));
        }
        return j;
    }

    public int getTrackId() {
        return this.trackId;
    }

    public CMSampleBuffer readSample() {
        if (this.lastSampleState.isInvalid()) {
            return readSample(CMTime.CMTimeZero);
        }
        return readSample(this.lastSampleState.getTime().add(this.frameDuration));
    }

    public CMSampleBuffer seekTo(CMTime cMTime, boolean z, boolean z2) {
        logVerbose("seekTo:[time " + cMTime + "] [needRead " + z + "] [quickSeek " + z2 + "]");
        synchronized (this.nextFrameDecoderLock) {
            this.currentFrame = null;
            this.nextFrame = null;
        }
        synchronized (this) {
            if (this.started) {
                if (!this.isReleased) {
                    int findSegmentIndexAt = findSegmentIndexAt(cMTime, true);
                    if (findSegmentIndexAt == -1) {
                        this.segmentIndex = -1;
                        String str = TAG;
                        Logger.m144643e(str, "seekTo: [failed] [index " + findSegmentIndexAt + "]");
                        return null;
                    }
                    CMTime segmentStartTime = getSegmentStartTime(findSegmentIndexAt);
                    if (this.segmentIndex != findSegmentIndexAt || this.currentDecoder == null) {
                        this.segmentIndex = findSegmentIndexAt - 1;
                        nextSegment(false);
                    }
                    CMTime multi = cMTime.sub(segmentStartTime).multi(this._speed);
                    DecoderTrackSegment currentSegment = getCurrentSegment();
                    IVideoDecoder iVideoDecoder = this.currentDecoder;
                    if (iVideoDecoder == null) {
                        this.lastSampleState = new CMSampleState(cMTime);
                        Logger.m144643e(TAG, "seekTo: [failed] [currentDecoder == null]");
                        return null;
                    }
                    iVideoDecoder.seekTo(currentSegment.getDecoderStartTime().add(multi), z2);
                    if (cMTime.bigThan(this.frameDuration)) {
                        this.lastSampleState = new CMSampleState(cMTime.sub(this.frameDuration));
                    } else {
                        this.lastSampleState = new CMSampleState(cMTime);
                    }
                    CMSampleBuffer readSample = z ? readSample() : null;
                    this.currentFrame = null;
                    this.nextFrame = null;
                    logVerbose("seekTo: [success] [lastSampleState " + this.lastSampleState + "] [sampleBuffer " + readSample + "]");
                    return readSample;
                }
            }
            String str2 = TAG;
            Logger.m144643e(str2, "seekTo: [failed] [started " + this.started + "] [isReleased " + this.isReleased + "]");
            return null;
        }
    }

    public void setDecodeType(IDecoder.DecodeType decodeType2) {
        this.decodeType = decodeType2;
    }

    public void setFrameRate(int i) {
        this.frameRate = i;
        this.frameDuration = new CMTime((long) (600 / i), 600);
    }

    public void setTrackSegments(List<DecoderTrackSegment> list) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        this.segments.clear();
        this.segments.addAll(list);
    }

    public void setVolume(float f) {
    }

    public void start() {
        start((IDecoderTrack.SurfaceCreator) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        r0 = r1.surfaceCreator;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        if (r0 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        r0 = createSampleBuffer(r1.lastSampleState);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r0 = createSampleBuffer(r1.lastSampleState, r0.videoTextureForSurface(r1._outputSurface), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0092, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fc, code lost:
        if (r7.getStateCode() < 0) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fe, code lost:
        logVerbose("doReadSample: step 3 ");
        r3 = r7.getTime().sub(r2.getDecoderStartTime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011b, code lost:
        if (r3.bigThan(r2.getTimeRange().getDuration()) == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011d, code lost:
        r3 = r2.getTimeRange().getDuration();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0125, code lost:
        r4 = new com.tencent.tav.coremedia.CMSampleState(r1.currentSegmentStartTime.add(r3.divide(r1._speed)), r7.performance);
        logVerbose("readSample: currentTime = " + r0 + "  sampleState = " + r4);
        r0 = createSampleBuffer(r4, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0159, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0162, code lost:
        if (r7.stateMatchingTo(-3) != false) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0164, code lost:
        r0 = createSampleBuffer(r1.lastSampleState);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r0 = createSampleBuffer(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0171, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.tencent.tav.coremedia.CMSampleBuffer doReadSample(com.tencent.tav.coremedia.CMTime r17, boolean r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            monitor-enter(r16)
            java.lang.String r2 = "doReadSample: step 1 "
            r1.logVerbose(r2)     // Catch:{ all -> 0x01c2 }
            boolean r2 = r1.isReleased     // Catch:{ all -> 0x01c2 }
            r3 = -100
            if (r2 == 0) goto L_0x0016
            com.tencent.tav.coremedia.CMSampleBuffer r0 = r1.createSampleBuffer((long) r3)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r16)
            return r0
        L_0x0016:
            r5 = -3
            if (r0 != 0) goto L_0x0020
            com.tencent.tav.coremedia.CMSampleBuffer r0 = r1.createSampleBuffer((long) r5)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r16)
            return r0
        L_0x0020:
            int r2 = r1.segmentIndex     // Catch:{ all -> 0x01c2 }
            r7 = -1
            r8 = -1
            if (r2 != r7) goto L_0x003c
            com.tencent.tav.coremedia.CMSampleState r0 = r1.lastSampleState     // Catch:{ all -> 0x01c2 }
            long r5 = r0.getStateCode()     // Catch:{ all -> 0x01c2 }
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0036
            com.tencent.tav.coremedia.CMSampleBuffer r0 = r1.createSampleBuffer((long) r8)     // Catch:{ all -> 0x01c2 }
            goto L_0x003a
        L_0x0036:
            com.tencent.tav.coremedia.CMSampleBuffer r0 = r1.createSampleBuffer((long) r3)     // Catch:{ all -> 0x01c2 }
        L_0x003a:
            monitor-exit(r16)
            return r0
        L_0x003c:
            com.tencent.tav.decoder.DecoderTrackSegment r2 = r16.getCurrentSegment()     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMSampleState r7 = com.tencent.tav.coremedia.CMSampleState.fromError(r8)     // Catch:{ all -> 0x01c2 }
            r10 = 0
            r11 = 0
        L_0x0046:
            java.lang.String r12 = "doReadSample: step 2 "
            r1.logVerbose(r12)     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.decoder.IVideoDecoder r12 = r1.currentDecoder     // Catch:{ all -> 0x01c2 }
            r13 = 1
            if (r12 != 0) goto L_0x0093
            com.tencent.tav.coremedia.CMSampleState r12 = new com.tencent.tav.coremedia.CMSampleState     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMSampleState r14 = r1.lastSampleState     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r14 = r14.getTime()     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r15 = r1.frameDuration     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r14 = r14.add((com.tencent.tav.coremedia.CMTime) r15)     // Catch:{ all -> 0x01c2 }
            r12.<init>(r14)     // Catch:{ all -> 0x01c2 }
            r1.lastSampleState = r12     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r12 = r1.currentSegmentStartTime     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r14 = r2.getScaledDuration()     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r12 = r12.add((com.tencent.tav.coremedia.CMTime) r14)     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMSampleState r14 = r1.lastSampleState     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r14 = r14.getTime()     // Catch:{ all -> 0x01c2 }
            boolean r12 = r14.smallThan(r12)     // Catch:{ all -> 0x01c2 }
            if (r12 == 0) goto L_0x00d6
            com.tencent.tav.decoder.IDecoderTrack$SurfaceCreator r0 = r1.surfaceCreator     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x0085
            com.tencent.tav.coremedia.CMSampleState r0 = r1.lastSampleState     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMSampleBuffer r0 = r1.createSampleBuffer((com.tencent.tav.coremedia.CMSampleState) r0)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r16)
            return r0
        L_0x0085:
            com.tencent.tav.coremedia.CMSampleState r2 = r1.lastSampleState     // Catch:{ all -> 0x01c2 }
            android.view.Surface r3 = r1._outputSurface     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.decoder.VideoTexture r0 = r0.videoTextureForSurface(r3)     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMSampleBuffer r0 = r1.createSampleBuffer((com.tencent.tav.coremedia.CMSampleState) r2, (com.tencent.tav.decoder.VideoTexture) r0, (boolean) r10)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r16)
            return r0
        L_0x0093:
            com.tencent.tav.coremedia.CMTime r7 = r1.currentSegmentStartTime     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r7 = r0.sub(r7)     // Catch:{ all -> 0x01c2 }
            float r12 = r1._speed     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r7 = r7.multi((float) r12)     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r12 = com.tencent.tav.coremedia.CMTime.CMTimeZero     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r7 = r7.limitMin(r12)     // Catch:{ all -> 0x01c2 }
            long r14 = r7.getTimeUs()     // Catch:{ all -> 0x01c2 }
            float r12 = (float) r14     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r14 = r2.getScaledDuration()     // Catch:{ all -> 0x01c2 }
            long r14 = r14.getTimeUs()     // Catch:{ all -> 0x01c2 }
            float r14 = (float) r14     // Catch:{ all -> 0x01c2 }
            float r15 = r1._speed     // Catch:{ all -> 0x01c2 }
            float r14 = r14 * r15
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x00c0
            com.tencent.tav.coremedia.CMSampleState r7 = com.tencent.tav.coremedia.CMSampleState.fromError(r8)     // Catch:{ all -> 0x01c2 }
            goto L_0x00d6
        L_0x00c0:
            com.tencent.tav.coremedia.CMTime r11 = r2.getDecoderStartTime()     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r7 = r7.add((com.tencent.tav.coremedia.CMTime) r11)     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.decoder.IVideoDecoder r11 = r1.currentDecoder     // Catch:{ all -> 0x01c2 }
            if (r11 != 0) goto L_0x00d1
            com.tencent.tav.coremedia.CMSampleState r7 = com.tencent.tav.coremedia.CMSampleState.fromError(r3)     // Catch:{ all -> 0x01c2 }
            goto L_0x00d5
        L_0x00d1:
            com.tencent.tav.coremedia.CMSampleState r7 = r11.readSample(r7)     // Catch:{ all -> 0x01c2 }
        L_0x00d5:
            r11 = 1
        L_0x00d6:
            long[] r12 = new long[r13]     // Catch:{ all -> 0x01c2 }
            r12[r10] = r8     // Catch:{ all -> 0x01c2 }
            boolean r12 = r7.stateMatchingTo(r12)     // Catch:{ all -> 0x01c2 }
            if (r12 != 0) goto L_0x0172
            com.tencent.tav.coremedia.CMTime r12 = r7.getTime()     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTimeRange r14 = r2.getTimeRange()     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r14 = r14.getDuration()     // Catch:{ all -> 0x01c2 }
            boolean r12 = r12.bigThan(r14)     // Catch:{ all -> 0x01c2 }
            if (r12 == 0) goto L_0x00f4
            goto L_0x0172
        L_0x00f4:
            long r3 = r7.getStateCode()     // Catch:{ all -> 0x01c2 }
            r8 = 0
            int r11 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r11 < 0) goto L_0x015a
            java.lang.String r3 = "doReadSample: step 3 "
            r1.logVerbose(r3)     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r3 = r7.getTime()     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r4 = r2.getDecoderStartTime()     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r3 = r3.sub(r4)     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTimeRange r4 = r2.getTimeRange()     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r4 = r4.getDuration()     // Catch:{ all -> 0x01c2 }
            boolean r4 = r3.bigThan(r4)     // Catch:{ all -> 0x01c2 }
            if (r4 == 0) goto L_0x0125
            com.tencent.tav.coremedia.CMTimeRange r2 = r2.getTimeRange()     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r3 = r2.getDuration()     // Catch:{ all -> 0x01c2 }
        L_0x0125:
            com.tencent.tav.coremedia.CMTime r2 = r1.currentSegmentStartTime     // Catch:{ all -> 0x01c2 }
            float r4 = r1._speed     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r3 = r3.divide((float) r4)     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r2 = r2.add((com.tencent.tav.coremedia.CMTime) r3)     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMPerformance r3 = r7.performance     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMSampleState r4 = new com.tencent.tav.coremedia.CMSampleState     // Catch:{ all -> 0x01c2 }
            r4.<init>(r2, r3)     // Catch:{ all -> 0x01c2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r2.<init>()     // Catch:{ all -> 0x01c2 }
            java.lang.String r3 = "readSample: currentTime = "
            r2.append(r3)     // Catch:{ all -> 0x01c2 }
            r2.append(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "  sampleState = "
            r2.append(r0)     // Catch:{ all -> 0x01c2 }
            r2.append(r4)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01c2 }
            r1.logVerbose(r0)     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMSampleBuffer r0 = r1.createSampleBuffer(r4, r13)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r16)
            return r0
        L_0x015a:
            long[] r0 = new long[r13]     // Catch:{ all -> 0x01c2 }
            r0[r10] = r5     // Catch:{ all -> 0x01c2 }
            boolean r0 = r7.stateMatchingTo(r0)     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x016c
            com.tencent.tav.coremedia.CMSampleState r0 = r1.lastSampleState     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMSampleBuffer r0 = r1.createSampleBuffer((com.tencent.tav.coremedia.CMSampleState) r0)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r16)
            return r0
        L_0x016c:
            com.tencent.tav.coremedia.CMSampleBuffer r0 = r1.createSampleBuffer((com.tencent.tav.coremedia.CMSampleState) r7)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r16)
            return r0
        L_0x0172:
            com.tencent.tav.coremedia.CMTime r2 = r2.getScaledDuration()     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r12 = r1.currentSegmentStartTime     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r2 = r2.add((com.tencent.tav.coremedia.CMTime) r12)     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r12 = r1.frameDuration     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMTime r2 = r2.sub(r12)     // Catch:{ all -> 0x01c2 }
            boolean r2 = r2.bigThan(r0)     // Catch:{ all -> 0x01c2 }
            if (r2 == 0) goto L_0x01a0
            if (r11 == 0) goto L_0x0195
            com.tencent.tav.decoder.IVideoDecoder r2 = r1.currentDecoder     // Catch:{ all -> 0x01c2 }
            if (r2 == 0) goto L_0x0195
            boolean r2 = r2.isLastFrameValid()     // Catch:{ all -> 0x01c2 }
            if (r2 == 0) goto L_0x0195
            r10 = 1
        L_0x0195:
            com.tencent.tav.coremedia.CMSampleState r2 = new com.tencent.tav.coremedia.CMSampleState     // Catch:{ all -> 0x01c2 }
            r2.<init>(r0)     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMSampleBuffer r0 = r1.createSampleBuffer(r2, r10)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r16)
            return r0
        L_0x01a0:
            if (r18 == 0) goto L_0x01ac
            java.lang.String r0 = TAG     // Catch:{ all -> 0x01c2 }
            java.lang.String r2 = "async read finish , skip it!"
            com.tencent.tav.decoder.logger.Logger.m144641d(r0, r2)     // Catch:{ all -> 0x01c2 }
            r0 = 0
            monitor-exit(r16)
            return r0
        L_0x01ac:
            boolean r2 = r1.nextSegment(r13)     // Catch:{ all -> 0x01c2 }
            if (r2 != 0) goto L_0x01bc
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r8)     // Catch:{ all -> 0x01c2 }
            com.tencent.tav.coremedia.CMSampleBuffer r0 = r1.createSampleBuffer(r0, r10)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r16)
            return r0
        L_0x01bc:
            com.tencent.tav.decoder.DecoderTrackSegment r2 = r16.getCurrentSegment()     // Catch:{ all -> 0x01c2 }
            goto L_0x0046
        L_0x01c2:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.VideoDecoderTrack.doReadSample(com.tencent.tav.coremedia.CMTime, boolean):com.tencent.tav.coremedia.CMSampleBuffer");
    }

    public synchronized void release() {
        this.decoderThread.release();
        String str = TAG;
        Logger.m144641d(str, "release: start " + this);
        this.isReleased = true;
        this.segments.clear();
        IVideoDecoder iVideoDecoder = this.currentDecoder;
        if (iVideoDecoder != null) {
            this.decodeReporter.add(iVideoDecoder.getDecodePerformance());
            this.currentDecoder.release(true);
            release(this.currentDecoder.outputSurface());
            this.currentDecoder = null;
        }
        synchronized (this.nextDecoderLock) {
            DecoderWrapper decoderWrapper = this.nextDecoder;
            if (decoderWrapper != null) {
                decoderWrapper.release();
                this.nextDecoder = null;
            }
        }
        CMSampleBuffer cMSampleBuffer = this.currentFrame;
        if (!(cMSampleBuffer == null || cMSampleBuffer.getTextureInfo() == null)) {
            this.currentFrame.getTextureInfo().release();
        }
        CMSampleBuffer cMSampleBuffer2 = this.nextFrame;
        if (!(cMSampleBuffer2 == null || !(cMSampleBuffer2 instanceof CacheSampleBuffer) || ((CacheSampleBuffer) cMSampleBuffer2).getTexture() == null)) {
            ((CacheSampleBuffer) this.nextFrame).getTexture().release();
        }
        Logger.m144641d(TAG, "release: finish");
    }

    public void start(IDecoderTrack.SurfaceCreator surfaceCreator2) {
        start(surfaceCreator2, (CMTimeRange) null);
    }

    public void start(IDecoderTrack.SurfaceCreator surfaceCreator2, CMTimeRange cMTimeRange) {
        String str = TAG;
        Logger.m144641d(str, "VideoDecoderTrack start:" + cMTimeRange);
        if (this.segments.size() == 0) {
            release();
            return;
        }
        this.isReleased = false;
        this.started = true;
        this.surfaceCreator = surfaceCreator2;
        this.segmentIndex = -1;
        this.decoderThread.start();
        clipRangeAndRemoveRange(cMTimeRange);
        nextSegment(true);
        Logger.m144641d(TAG, "VideoDecoderTrack start finish:");
    }

    private CMSampleBuffer createSampleBuffer(CMSampleState cMSampleState, boolean z) {
        TextureInfo textureInfo;
        IVideoDecoder iVideoDecoder = this.currentDecoder;
        if (iVideoDecoder instanceof VideoDecoder) {
            return createSampleBuffer(cMSampleState, this.surfaceCreator.videoTextureForSurface(this._outputSurface), z);
        }
        if (iVideoDecoder == null) {
            textureInfo = null;
        } else {
            textureInfo = iVideoDecoder.getTextureInfo();
        }
        return createSampleBuffer(cMSampleState, textureInfo, z);
    }

    public CMSampleBuffer readSample(CMTime cMTime) {
        CMSampleBuffer switchToNextFrame;
        CMSampleBuffer cMSampleBuffer;
        logVerbose("readSample: start expectFrameTime = " + cMTime);
        if (this.isReleased) {
            releaseDecoder();
            return createSampleBuffer(CMSampleState.fromError(-100));
        } else if (cMTime.bigThan(getDuration())) {
            releaseDecoder();
            return createSampleBuffer(CMSampleState.fromError(-1));
        } else if (this.decodeError) {
            return new CMSampleBuffer(CMSampleState.fromExportError(-3, -201, "", this.decodeException));
        } else {
            CMSampleBuffer cMSampleBuffer2 = this.currentFrame;
            if (cMSampleBuffer2 == null || cMSampleBuffer2.getTime().getTimeUs() < 0 || this.currentFrame.getTextureInfo() == null || this.currentFrame.getTime().smallThan(cMTime)) {
                logVerbose("readSample: step 1 ");
                CMTime add = cMTime.sub(this.frameDuration).add(new CMTime(1, cMTime.timeScale));
                if (findSegmentIndexAt(cMTime, false) != this.segmentIndex || (cMSampleBuffer = this.nextFrame) == null || cMSampleBuffer.getState().getStateCode() < 0 || this.decodeType != IDecoder.DecodeType.Video) {
                    logVerbose("readSample:" + add + " nextFrame not hit");
                    if (findSegmentIndexAt(cMTime, false) != this.segmentIndex) {
                        this.nextFrame = doReadSample(cMTime);
                    } else {
                        this.nextFrame = doReadSample(add);
                    }
                } else {
                    synchronized (this.nextFrameDecoderLock) {
                        CMSampleBuffer cMSampleBuffer3 = this.nextFrame;
                        if (cMSampleBuffer3 == null || cMSampleBuffer3.getState().getStateCode() < -1 || (this.nextFrame.getTextureInfo() == null && this.nextFrame.getSampleByteBuffer() == null)) {
                            logVerbose("readSample:" + add + " nextFrame not hit time");
                            this.nextFrame = doReadSample(add);
                        }
                    }
                }
                logVerbose("readSample: step 2 ");
                boolean needSwitchNextFrame = needSwitchNextFrame(this.currentFrame, this.nextFrame, cMTime);
                StringBuilder sb = new StringBuilder();
                sb.append("readSample: needSwitch: ");
                sb.append(needSwitchNextFrame);
                sb.append(" expectFrameTime = ");
                sb.append(cMTime);
                sb.append(" currentFrame = ");
                CMSampleBuffer cMSampleBuffer4 = this.currentFrame;
                sb.append(cMSampleBuffer4 == null ? CMTime.CMTimeZero : cMSampleBuffer4.getTime());
                sb.append("  nextFrame = ");
                sb.append(this.nextFrame);
                logVerbose(sb.toString());
                if (needSwitchNextFrame && (switchToNextFrame = switchToNextFrame()) != null) {
                    return switchToNextFrame;
                }
                logVerbose("readSample: step 3 ");
                createNextDecoder(this.segmentIndex);
                CMSampleState cMSampleState = new CMSampleState(cMTime);
                this.lastSampleState = cMSampleState;
                cMSampleState.performance = this.currentFrame.getState().performance;
                logVerbose("readSample: step 4 ");
                return createSampleBuffer(needSwitchNextFrame);
            }
            CMSampleState cMSampleState2 = new CMSampleState(cMTime);
            this.lastSampleState = cMSampleState2;
            CMSampleBuffer createSampleBuffer = createSampleBuffer(cMSampleState2, this.currentFrame.getTextureInfo(), false);
            createSampleBuffer.getState().performance.stage = CMPerformance.CMPerformanceStage.DECODE_JUMP;
            return createSampleBuffer;
        }
    }

    private CMSampleBuffer createSampleBuffer(long j) {
        return createSampleBuffer(CMSampleState.fromError(j));
    }

    private CMSampleBuffer createSampleBuffer(CMSampleState cMSampleState) {
        return new CMSampleBuffer(cMSampleState);
    }

    private CMSampleBuffer createSampleBuffer(CMSampleState cMSampleState, VideoTexture videoTexture, boolean z) {
        CacheSampleBuffer cacheSampleBuffer = new CacheSampleBuffer(cMSampleState, videoTexture == null ? null : videoTexture.getTextureInfo(), z);
        cacheSampleBuffer.setTexture(videoTexture);
        return cacheSampleBuffer;
    }

    private CMSampleBuffer createSampleBuffer(CMSampleState cMSampleState, TextureInfo textureInfo, boolean z) {
        return new CMSampleBuffer(cMSampleState, textureInfo, z);
    }

    private void createDecoder(DecoderAssetTrack decoderAssetTrack, int i) {
        CGSize cGSize;
        try {
            IDecoderTrack.SurfaceCreator surfaceCreator2 = this.surfaceCreator;
            if (surfaceCreator2 != null && (cGSize = decoderAssetTrack.size) != null) {
                DecoderAssetTrack decoderAssetTrack2 = decoderAssetTrack;
                DecoderCreateThread decoderCreateThread2 = new DecoderCreateThread(decoderAssetTrack2, surfaceCreator2.createOutputSurface((int) cGSize.width, (int) cGSize.height, decoderAssetTrack.preferRotation), i);
                this.decoderCreateThread = decoderCreateThread2;
                decoderCreateThread2.start();
            }
        } catch (Exception e) {
            Logger.m144644e(TAG, "createNextDecoder: try start DecoderCreateThread", (Throwable) e);
        }
    }
}
