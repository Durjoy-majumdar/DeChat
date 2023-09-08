package com.tencent.tav.decoder;

import android.util.Log;
import android.view.Surface;
import com.tencent.tav.codec.IDecoderFactory;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMSampleState;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.tav.decoder.IDecoder;
import com.tencent.tav.decoder.IDecoderTrack;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.decoder.thread.ReActionHandlerThread;
import com.tencent.tav.report.AverageTimeReporter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AudioDecoderTrack implements IDecoderTrack {
    /* access modifiers changed from: private */
    public static String TAG = "AudioDecoderTrack";
    /* access modifiers changed from: private */
    public float _speed;
    private AudioInfo audioInfo;
    private AudioMixer audioMixer;
    /* access modifiers changed from: private */
    public AudioDecoder currentDecoder;
    private final Object currentDecoderLock;
    private CMTime currentSegmentStartTime;
    private boolean decodeError;
    private Exception decodeException;
    private IDecoder.DecodeType decodeType;
    /* access modifiers changed from: private */
    public AudioDecoderCreateThread decoderCreateThread;
    /* access modifiers changed from: private */
    public IDecoderFactory decoderFactory;
    private final DecoderThread decoderThread;
    private CMTime duration;
    private ByteBuffer emptyAudioBuffer;
    /* access modifiers changed from: private */
    public CMTime frameDuration;
    private int frameRate;
    private boolean isEmptyFrame;
    /* access modifiers changed from: private */
    public boolean isReleased;
    /* access modifiers changed from: private */
    public CMSampleState lastSampleState;
    /* access modifiers changed from: private */
    public DecoderWrapper nextDecoder;
    /* access modifiers changed from: private */
    public final Object nextDecoderLock;
    private boolean preRead;
    private int segmentIndex;
    /* access modifiers changed from: private */
    public ArrayList<DecoderTrackSegment> segments;
    private boolean started;
    private int trackID;
    /* access modifiers changed from: private */
    public float volume;

    public class AudioDecoderCreateThread extends Thread {
        public DecoderAssetTrack extractor;
        private Surface outputSurface;
        /* access modifiers changed from: private */
        public int segmentIndex;

        /* JADX WARNING: Can't wrap try/catch for region: R(5:36|(2:38|39)|40|41|(3:43|22|65)(1:64)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:48|(2:50|51)|52|53|(1:55)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00b7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00f8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0119 */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00bf A[Catch:{ Exception -> 0x0103 }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00df A[SYNTHETIC, Splitter:B:31:0x00df] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0100 A[Catch:{ Exception -> 0x0103 }] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x010d  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0121 A[Catch:{ Exception -> 0x012a }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x00b7=Splitter:B:18:0x00b7, B:40:0x00f8=Splitter:B:40:0x00f8} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void createDecoder() {
            /*
                r7 = this;
                java.lang.String r0 = "createDecoder: released"
                com.tencent.tav.decoder.AudioDecoderTrack r1 = com.tencent.tav.decoder.AudioDecoderTrack.this
                java.util.ArrayList r1 = r1.segments
                if (r1 == 0) goto L_0x012b
                int r1 = r7.segmentIndex
                com.tencent.tav.decoder.AudioDecoderTrack r2 = com.tencent.tav.decoder.AudioDecoderTrack.this
                java.util.ArrayList r2 = r2.segments
                int r2 = r2.size()
                if (r1 >= r2) goto L_0x012b
                com.tencent.tav.decoder.AudioDecoderTrack r1 = com.tencent.tav.decoder.AudioDecoderTrack.this
                boolean r1 = r1.isReleased
                if (r1 != 0) goto L_0x012b
                com.tencent.tav.decoder.DecoderAssetTrack r1 = r7.extractor
                java.lang.String r1 = r1.assetPath
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 == 0) goto L_0x002c
                goto L_0x012b
            L_0x002c:
                r1 = 0
                com.tencent.tav.decoder.AudioDecoder r2 = new com.tencent.tav.decoder.AudioDecoder     // Catch:{ Exception -> 0x00d0, all -> 0x00cb }
                com.tencent.tav.decoder.DecoderAssetTrack r3 = r7.extractor     // Catch:{ Exception -> 0x00d0, all -> 0x00cb }
                java.lang.String r3 = r3.assetPath     // Catch:{ Exception -> 0x00d0, all -> 0x00cb }
                com.tencent.tav.decoder.AudioDecoderTrack r4 = com.tencent.tav.decoder.AudioDecoderTrack.this     // Catch:{ Exception -> 0x00d0, all -> 0x00cb }
                com.tencent.tav.codec.IDecoderFactory r4 = r4.decoderFactory     // Catch:{ Exception -> 0x00d0, all -> 0x00cb }
                r2.<init>(r3, r4)     // Catch:{ Exception -> 0x00d0, all -> 0x00cb }
                com.tencent.tav.decoder.AudioDecoderTrack r3 = com.tencent.tav.decoder.AudioDecoderTrack.this     // Catch:{ Exception -> 0x00c9 }
                java.util.ArrayList r3 = r3.segments     // Catch:{ Exception -> 0x00c9 }
                int r4 = r7.segmentIndex     // Catch:{ Exception -> 0x00c9 }
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.decoder.DecoderTrackSegment r3 = (com.tencent.tav.decoder.DecoderTrackSegment) r3     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.coremedia.CMTimeRange r3 = r3.getTimeRange()     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.decoder.AudioDecoderTrack r4 = com.tencent.tav.decoder.AudioDecoderTrack.this     // Catch:{ Exception -> 0x00c9 }
                java.util.ArrayList r4 = r4.segments     // Catch:{ Exception -> 0x00c9 }
                int r5 = r7.segmentIndex     // Catch:{ Exception -> 0x00c9 }
                java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.decoder.DecoderTrackSegment r4 = (com.tencent.tav.decoder.DecoderTrackSegment) r4     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.coremedia.CMTime r4 = r4.getDecoderStartTime()     // Catch:{ Exception -> 0x00c9 }
                r2.start(r3, r4)     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.decoder.AudioDecoderTrack r3 = com.tencent.tav.decoder.AudioDecoderTrack.this     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r4 = new com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper     // Catch:{ Exception -> 0x00c9 }
                r4.<init>()     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.decoder.AudioDecoderTrack.DecoderWrapper unused = r3.nextDecoder = r4     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.decoder.AudioDecoderTrack r1 = com.tencent.tav.decoder.AudioDecoderTrack.this     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r1 = r1.nextDecoder     // Catch:{ Exception -> 0x00c9 }
                r1.decoder = r2     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.decoder.AudioDecoderTrack r1 = com.tencent.tav.decoder.AudioDecoderTrack.this     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r1 = r1.nextDecoder     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.decoder.DecoderAssetTrack r3 = r7.extractor     // Catch:{ Exception -> 0x00c9 }
                r1.extractor = r3     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.decoder.AudioDecoderTrack r1 = com.tencent.tav.decoder.AudioDecoderTrack.this     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r1 = r1.nextDecoder     // Catch:{ Exception -> 0x00c9 }
                int r3 = r7.segmentIndex     // Catch:{ Exception -> 0x00c9 }
                r1.segmentIndex = r3     // Catch:{ Exception -> 0x00c9 }
                java.lang.String r1 = com.tencent.tav.decoder.AudioDecoderTrack.TAG     // Catch:{ Exception -> 0x00c9 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c9 }
                r3.<init>()     // Catch:{ Exception -> 0x00c9 }
                java.lang.String r4 = "DecoderCreateThread success - "
                r3.append(r4)     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.decoder.DecoderAssetTrack r4 = r7.extractor     // Catch:{ Exception -> 0x00c9 }
                java.lang.String r4 = r4.assetPath     // Catch:{ Exception -> 0x00c9 }
                r3.append(r4)     // Catch:{ Exception -> 0x00c9 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.decoder.logger.Logger.m144641d(r1, r3)     // Catch:{ Exception -> 0x00c9 }
                com.tencent.tav.decoder.AudioDecoderTrack r1 = com.tencent.tav.decoder.AudioDecoderTrack.this
                boolean r1 = r1.isReleased
                if (r1 == 0) goto L_0x0103
                java.lang.String r1 = com.tencent.tav.decoder.AudioDecoderTrack.TAG
                com.tencent.tav.decoder.logger.Logger.m144641d(r1, r0)
                r2.release()     // Catch:{ Exception -> 0x00b7 }
            L_0x00b7:
                com.tencent.tav.decoder.AudioDecoderTrack r0 = com.tencent.tav.decoder.AudioDecoderTrack.this     // Catch:{ Exception -> 0x0103 }
                com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r0 = r0.nextDecoder     // Catch:{ Exception -> 0x0103 }
                if (r0 == 0) goto L_0x0103
                com.tencent.tav.decoder.AudioDecoderTrack r0 = com.tencent.tav.decoder.AudioDecoderTrack.this     // Catch:{ Exception -> 0x0103 }
            L_0x00c1:
                com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r0 = r0.nextDecoder     // Catch:{ Exception -> 0x0103 }
                r0.release()     // Catch:{ Exception -> 0x0103 }
                goto L_0x0103
            L_0x00c9:
                r1 = move-exception
                goto L_0x00d4
            L_0x00cb:
                r2 = move-exception
                r6 = r2
                r2 = r1
                r1 = r6
                goto L_0x0105
            L_0x00d0:
                r2 = move-exception
                r6 = r2
                r2 = r1
                r1 = r6
            L_0x00d4:
                java.lang.String r3 = com.tencent.tav.decoder.AudioDecoderTrack.TAG     // Catch:{ all -> 0x0104 }
                java.lang.String r4 = "createDecoder"
                com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r3, (java.lang.String) r4, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0104 }
                if (r2 == 0) goto L_0x00e4
                r2.release()     // Catch:{ Exception -> 0x00e3 }
                goto L_0x00e4
            L_0x00e3:
            L_0x00e4:
                com.tencent.tav.decoder.AudioDecoderTrack r1 = com.tencent.tav.decoder.AudioDecoderTrack.this
                boolean r1 = r1.isReleased
                if (r1 == 0) goto L_0x0103
                java.lang.String r1 = com.tencent.tav.decoder.AudioDecoderTrack.TAG
                com.tencent.tav.decoder.logger.Logger.m144641d(r1, r0)
                if (r2 == 0) goto L_0x00f8
                r2.release()     // Catch:{ Exception -> 0x00f8 }
            L_0x00f8:
                com.tencent.tav.decoder.AudioDecoderTrack r0 = com.tencent.tav.decoder.AudioDecoderTrack.this     // Catch:{ Exception -> 0x0103 }
                com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r0 = r0.nextDecoder     // Catch:{ Exception -> 0x0103 }
                if (r0 == 0) goto L_0x0103
                com.tencent.tav.decoder.AudioDecoderTrack r0 = com.tencent.tav.decoder.AudioDecoderTrack.this     // Catch:{ Exception -> 0x0103 }
                goto L_0x00c1
            L_0x0103:
                return
            L_0x0104:
                r1 = move-exception
            L_0x0105:
                com.tencent.tav.decoder.AudioDecoderTrack r3 = com.tencent.tav.decoder.AudioDecoderTrack.this
                boolean r3 = r3.isReleased
                if (r3 == 0) goto L_0x012a
                java.lang.String r3 = com.tencent.tav.decoder.AudioDecoderTrack.TAG
                com.tencent.tav.decoder.logger.Logger.m144641d(r3, r0)
                if (r2 == 0) goto L_0x0119
                r2.release()     // Catch:{ Exception -> 0x0119 }
            L_0x0119:
                com.tencent.tav.decoder.AudioDecoderTrack r0 = com.tencent.tav.decoder.AudioDecoderTrack.this     // Catch:{ Exception -> 0x012a }
                com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r0 = r0.nextDecoder     // Catch:{ Exception -> 0x012a }
                if (r0 == 0) goto L_0x012a
                com.tencent.tav.decoder.AudioDecoderTrack r0 = com.tencent.tav.decoder.AudioDecoderTrack.this     // Catch:{ Exception -> 0x012a }
                com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r0 = r0.nextDecoder     // Catch:{ Exception -> 0x012a }
                r0.release()     // Catch:{ Exception -> 0x012a }
            L_0x012a:
                throw r1
            L_0x012b:
                java.lang.String r0 = com.tencent.tav.decoder.AudioDecoderTrack.TAG
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "createDecoder skip - "
                r1.append(r2)
                com.tencent.tav.decoder.DecoderAssetTrack r2 = r7.extractor
                java.lang.String r2 = r2.assetPath
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.tav.decoder.logger.Logger.m144643e(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.AudioDecoderTrack.AudioDecoderCreateThread.createDecoder():void");
        }

        public void run() {
            String access$700 = AudioDecoderTrack.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("AudioDecoderCreateThread start - ");
            sb.append(this.extractor.assetPath);
            sb.append(" - ");
            sb.append(this.outputSurface != null);
            Logger.m144641d(access$700, sb.toString());
            if (AudioDecoderTrack.this.isReleased) {
                AudioDecoderCreateThread unused = AudioDecoderTrack.this.decoderCreateThread = null;
                return;
            }
            synchronized (AudioDecoderTrack.this.nextDecoderLock) {
                if (AudioDecoderTrack.this.nextDecoder == null || !AudioDecoderTrack.isSameExtractor(AudioDecoderTrack.this.nextDecoder.extractor, this.extractor)) {
                    if (AudioDecoderTrack.this.nextDecoder != null) {
                        String access$7002 = AudioDecoderTrack.TAG;
                        Logger.m144641d(access$7002, "AudioDecoderCreateThread create - " + this.extractor.assetPath);
                        if (!(AudioDecoderTrack.this.nextDecoder.decoder == null || AudioDecoderTrack.this.nextDecoder.decoder == AudioDecoderTrack.this.currentDecoder)) {
                            AudioDecoderTrack.this.nextDecoder.release();
                            DecoderWrapper unused2 = AudioDecoderTrack.this.nextDecoder = null;
                        }
                        createDecoder();
                    } else {
                        createDecoder();
                    }
                }
            }
            AudioDecoderCreateThread unused3 = AudioDecoderTrack.this.decoderCreateThread = null;
            if (AudioDecoderTrack.this.isReleased) {
                synchronized (AudioDecoderTrack.this.nextDecoderLock) {
                    if (AudioDecoderTrack.this.nextDecoder != null) {
                        AudioDecoderTrack.this.nextDecoder.release();
                        DecoderWrapper unused4 = AudioDecoderTrack.this.nextDecoder = null;
                    }
                }
            }
            String access$7003 = AudioDecoderTrack.TAG;
            Logger.m144641d(access$7003, "AudioDecoderCreateThread finish - " + this.extractor.assetPath);
        }

        private AudioDecoderCreateThread(DecoderAssetTrack decoderAssetTrack, Surface surface, int i) {
            super("AudioDCreateThread " + decoderAssetTrack.assetPath);
            this.extractor = decoderAssetTrack;
            this.outputSurface = surface;
            this.segmentIndex = i;
        }
    }

    public static class CacheBuffer {
        /* access modifiers changed from: private */
        public CMTime frameTime;
        /* access modifiers changed from: private */
        public CMTime preFrameTime;
        /* access modifiers changed from: private */
        public CMSampleBuffer sampleBuffer;

        private CacheBuffer() {
        }
    }

    public class DecoderThread extends ReActionHandlerThread {
        private static final String NAME = "AudioDecoderThread";
        /* access modifiers changed from: private */
        public final Object nextFrameDecoderLock = new Object();
        /* access modifiers changed from: private */
        public CacheBuffer pcmFrame;

        public DecoderThread() {
            super(NAME);
        }

        public void doAction() {
            CMSampleBuffer cMSampleBuffer;
            synchronized (this.nextFrameDecoderLock) {
                if (this.pcmFrame != null) {
                    if (AudioDecoderTrack.this.lastSampleState.getTime() == CMTime.CMTimeInvalid) {
                        Logger.m144648v(AudioDecoderTrack.TAG, "doAction: CMTime.CMTimeZero");
                        cMSampleBuffer = AudioDecoderTrack.this.doReadSample(CMTime.CMTimeZero);
                    } else if (!AudioDecoderTrack.this.lastSampleState.getTime().smallThan(CMTime.CMTimeZero)) {
                        Logger.m144648v(AudioDecoderTrack.TAG, "doAction: lastSampleTime.add(frameDuration)");
                        AudioDecoderTrack audioDecoderTrack = AudioDecoderTrack.this;
                        cMSampleBuffer = audioDecoderTrack.doReadSample(audioDecoderTrack.lastSampleState.getTime().add(AudioDecoderTrack.this.frameDuration));
                    } else {
                        cMSampleBuffer = null;
                    }
                    if (cMSampleBuffer != null) {
                        if (cMSampleBuffer.getSampleByteBuffer() != null) {
                            Logger.m144648v(AudioDecoderTrack.TAG, "doAction: processFrame [volume " + AudioDecoderTrack.this.volume + "] [_speed " + AudioDecoderTrack.this._speed + "]");
                            cMSampleBuffer.setSampleByteBuffer(AudioDecoderTrack.this.processFrame(cMSampleBuffer.getSampleByteBuffer(), 1.0f, AudioDecoderTrack.this._speed, AudioDecoderTrack.this.getAudioInfo()));
                            Logger.m144648v(AudioDecoderTrack.TAG, "doAction: processFrame finish [volume " + AudioDecoderTrack.this.volume + "] [_speed " + AudioDecoderTrack.this._speed + "]");
                        }
                        CacheBuffer cacheBuffer = new CacheBuffer();
                        this.pcmFrame = cacheBuffer;
                        CMTime unused = cacheBuffer.preFrameTime = AudioDecoderTrack.this.lastSampleState.getTime();
                        CMTime unused2 = this.pcmFrame.frameTime = cMSampleBuffer.getTime();
                    }
                }
            }
        }
    }

    public static class DecoderWrapper {
        public IDecoder decoder;
        public DecoderAssetTrack extractor;
        public int segmentIndex;

        private DecoderWrapper() {
            this.segmentIndex = -1;
        }

        /* access modifiers changed from: private */
        public void release() {
            Logger.m144641d(AudioDecoderTrack.TAG, "Audio DecoderWrapper release: ");
            try {
                IDecoder iDecoder = this.decoder;
                if (iDecoder != null) {
                    iDecoder.release();
                }
            } catch (Error | Exception unused) {
            }
        }
    }

    public static class ReleaseDecoderThread extends Thread {
        private IDecoder decoder;

        public ReleaseDecoderThread(IDecoder iDecoder) {
            super("ReleaseDecoderThread");
            this.decoder = iDecoder;
        }

        public void run() {
            IDecoder iDecoder = this.decoder;
            if (iDecoder != null) {
                iDecoder.release();
            }
        }
    }

    public AudioDecoderTrack() {
        this((IDecoderFactory) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0199, code lost:
        return r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.tencent.tav.decoder.IDecoder createDecoder(com.tencent.tav.decoder.DecoderTrackSegment r10, com.tencent.tav.coremedia.CMTime r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.tencent.tav.decoder.DecoderAssetTrack r0 = r10.getVideoAsset()     // Catch:{ all -> 0x019a }
            java.lang.String r1 = TAG     // Catch:{ all -> 0x019a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r2.<init>()     // Catch:{ all -> 0x019a }
            java.lang.String r3 = "createDecoder - "
            r2.append(r3)     // Catch:{ all -> 0x019a }
            java.lang.String r3 = r0.assetPath     // Catch:{ all -> 0x019a }
            r2.append(r3)     // Catch:{ all -> 0x019a }
            java.lang.String r3 = " - audio"
            r2.append(r3)     // Catch:{ all -> 0x019a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x019a }
            com.tencent.tav.decoder.logger.Logger.m144641d(r1, r2)     // Catch:{ all -> 0x019a }
            r1 = 5
            r2 = 0
        L_0x0024:
            r3 = r2
        L_0x0025:
            if (r3 != 0) goto L_0x0198
            if (r1 <= 0) goto L_0x0198
            int r1 = r1 + -1
            com.tencent.tav.decoder.AudioDecoderTrack$AudioDecoderCreateThread r4 = r9.decoderCreateThread     // Catch:{ all -> 0x019a }
            if (r4 == 0) goto L_0x009c
            int r4 = r4.segmentIndex     // Catch:{ all -> 0x019a }
            java.util.ArrayList<com.tencent.tav.decoder.DecoderTrackSegment> r5 = r9.segments     // Catch:{ all -> 0x019a }
            int r5 = r5.size()     // Catch:{ all -> 0x019a }
            if (r4 >= r5) goto L_0x0124
            java.util.ArrayList<com.tencent.tav.decoder.DecoderTrackSegment> r5 = r9.segments     // Catch:{ all -> 0x019a }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x019a }
            com.tencent.tav.decoder.DecoderTrackSegment r4 = (com.tencent.tav.decoder.DecoderTrackSegment) r4     // Catch:{ all -> 0x019a }
            com.tencent.tav.decoder.DecoderAssetTrack r4 = r4.getVideoAsset()     // Catch:{ all -> 0x019a }
            boolean r4 = isSameExtractor(r4, r0)     // Catch:{ all -> 0x019a }
            if (r4 == 0) goto L_0x0124
            java.lang.Object r4 = r9.nextDecoderLock     // Catch:{ all -> 0x019a }
            monitor-enter(r4)     // Catch:{ all -> 0x019a }
            com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r5 = r9.nextDecoder     // Catch:{ all -> 0x0099 }
            if (r5 == 0) goto L_0x0096
            com.tencent.tav.decoder.DecoderAssetTrack r5 = r5.extractor     // Catch:{ all -> 0x0099 }
            boolean r5 = isSameExtractor(r5, r0)     // Catch:{ all -> 0x0099 }
            if (r5 == 0) goto L_0x0096
            com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r5 = r9.nextDecoder     // Catch:{ all -> 0x0099 }
            com.tencent.tav.decoder.IDecoder r6 = r5.decoder     // Catch:{ all -> 0x0099 }
            if (r6 == 0) goto L_0x0096
            java.util.ArrayList<com.tencent.tav.decoder.DecoderTrackSegment> r11 = r9.segments     // Catch:{ all -> 0x0099 }
            int r0 = r5.segmentIndex     // Catch:{ all -> 0x0099 }
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0099 }
            if (r11 == r10) goto L_0x0077
            com.tencent.tav.coremedia.CMTimeRange r11 = r10.getTimeRange()     // Catch:{ all -> 0x0099 }
            com.tencent.tav.coremedia.CMTime r10 = r10.getDecoderStartTime()     // Catch:{ all -> 0x0099 }
            r6.start(r11, r10)     // Catch:{ all -> 0x0099 }
        L_0x0077:
            r9.nextDecoder = r2     // Catch:{ all -> 0x0099 }
            java.lang.String r10 = TAG     // Catch:{ all -> 0x0099 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            r11.<init>()     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "hint decoder - audio  "
            r11.append(r0)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r6.getSourcePath()     // Catch:{ all -> 0x0099 }
            r11.append(r0)     // Catch:{ all -> 0x0099 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0099 }
            com.tencent.tav.decoder.logger.Logger.m144641d(r10, r11)     // Catch:{ all -> 0x0099 }
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            monitor-exit(r9)
            return r6
        L_0x0096:
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            goto L_0x0124
        L_0x0099:
            r10 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            throw r10     // Catch:{ all -> 0x019a }
        L_0x009c:
            java.lang.String r4 = TAG     // Catch:{ all -> 0x019a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r5.<init>()     // Catch:{ all -> 0x019a }
            java.lang.String r6 = "check  decoder - "
            r5.append(r6)     // Catch:{ all -> 0x019a }
            java.lang.String r6 = r0.assetPath     // Catch:{ all -> 0x019a }
            r5.append(r6)     // Catch:{ all -> 0x019a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x019a }
            com.tencent.tav.decoder.logger.Logger.m144641d(r4, r5)     // Catch:{ all -> 0x019a }
            com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r4 = r9.nextDecoder     // Catch:{ all -> 0x019a }
            if (r4 == 0) goto L_0x0124
            com.tencent.tav.decoder.DecoderAssetTrack r4 = r4.extractor     // Catch:{ all -> 0x019a }
            boolean r4 = isSameExtractor(r4, r0)     // Catch:{ all -> 0x019a }
            if (r4 == 0) goto L_0x0124
            com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r4 = r9.nextDecoder     // Catch:{ all -> 0x019a }
            com.tencent.tav.decoder.IDecoder r4 = r4.decoder     // Catch:{ all -> 0x019a }
            if (r4 == 0) goto L_0x0124
            java.lang.Object r4 = r9.nextDecoderLock     // Catch:{ all -> 0x019a }
            monitor-enter(r4)     // Catch:{ all -> 0x019a }
            com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r5 = r9.nextDecoder     // Catch:{ all -> 0x0121 }
            if (r5 == 0) goto L_0x011f
            com.tencent.tav.decoder.DecoderAssetTrack r6 = r5.extractor     // Catch:{ all -> 0x0121 }
            if (r6 != r0) goto L_0x011f
            com.tencent.tav.decoder.IDecoder r6 = r5.decoder     // Catch:{ all -> 0x0121 }
            if (r6 == 0) goto L_0x011f
            java.util.ArrayList<com.tencent.tav.decoder.DecoderTrackSegment> r11 = r9.segments     // Catch:{ all -> 0x0121 }
            int r0 = r5.segmentIndex     // Catch:{ all -> 0x0121 }
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0121 }
            if (r11 == r10) goto L_0x00ea
            com.tencent.tav.coremedia.CMTimeRange r11 = r10.getTimeRange()     // Catch:{ all -> 0x0121 }
            com.tencent.tav.coremedia.CMTime r10 = r10.getDecoderStartTime()     // Catch:{ all -> 0x0121 }
            r6.start(r11, r10)     // Catch:{ all -> 0x0121 }
        L_0x00ea:
            java.lang.String r10 = TAG     // Catch:{ all -> 0x0121 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0121 }
            r11.<init>()     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "hint decoder - audio  "
            r11.append(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = r6.getSourcePath()     // Catch:{ all -> 0x0121 }
            r11.append(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = ", segmentIndex: "
            r11.append(r0)     // Catch:{ all -> 0x0121 }
            int r0 = r9.segmentIndex     // Catch:{ all -> 0x0121 }
            r11.append(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = ", nextDecoder.segmentIndex: "
            r11.append(r0)     // Catch:{ all -> 0x0121 }
            com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r0 = r9.nextDecoder     // Catch:{ all -> 0x0121 }
            int r0 = r0.segmentIndex     // Catch:{ all -> 0x0121 }
            r11.append(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0121 }
            com.tencent.tav.decoder.logger.Logger.m144641d(r10, r11)     // Catch:{ all -> 0x0121 }
            r9.nextDecoder = r2     // Catch:{ all -> 0x0121 }
            monitor-exit(r4)     // Catch:{ all -> 0x0121 }
            monitor-exit(r9)
            return r6
        L_0x011f:
            monitor-exit(r4)     // Catch:{ all -> 0x0121 }
            goto L_0x0124
        L_0x0121:
            r10 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0121 }
            throw r10     // Catch:{ all -> 0x019a }
        L_0x0124:
            com.tencent.tav.coremedia.CMTimeRange r4 = r10.getTimeRange()     // Catch:{ all -> 0x019a }
            if (r4 != 0) goto L_0x012c
            monitor-exit(r9)
            return r2
        L_0x012c:
            com.tencent.tav.decoder.AudioDecoder r4 = new com.tencent.tav.decoder.AudioDecoder     // Catch:{ Exception -> 0x0159 }
            java.lang.String r5 = r0.assetPath     // Catch:{ Exception -> 0x0159 }
            com.tencent.tav.codec.IDecoderFactory r6 = r9.decoderFactory     // Catch:{ Exception -> 0x0159 }
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x0159 }
            com.tencent.tav.coremedia.CMTimeRange r3 = r10.getTimeRange()     // Catch:{ Exception -> 0x0157 }
            r4.start(r3, r11)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r3 = TAG     // Catch:{ Exception -> 0x0157 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0157 }
            r5.<init>()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r6 = "createDecoder new Decoder success - "
            r5.append(r6)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r6 = r0.assetPath     // Catch:{ Exception -> 0x0157 }
            r5.append(r6)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0157 }
            com.tencent.tav.decoder.logger.Logger.m144641d(r3, r5)     // Catch:{ Exception -> 0x0157 }
            r3 = r4
            goto L_0x0025
        L_0x0157:
            r3 = move-exception
            goto L_0x015d
        L_0x0159:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
        L_0x015d:
            java.lang.String r5 = TAG     // Catch:{ all -> 0x019a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r6.<init>()     // Catch:{ all -> 0x019a }
            java.lang.String r7 = " createDecoder "
            r6.append(r7)     // Catch:{ all -> 0x019a }
            java.lang.String r7 = r3.getMessage()     // Catch:{ all -> 0x019a }
            r6.append(r7)     // Catch:{ all -> 0x019a }
            r6.append(r3)     // Catch:{ all -> 0x019a }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x019a }
            com.tencent.tav.decoder.logger.Logger.m144643e(r5, r6)     // Catch:{ all -> 0x019a }
            if (r4 == 0) goto L_0x0183
            r4.release()     // Catch:{ Exception -> 0x0182, all -> 0x0180 }
            goto L_0x0183
        L_0x0180:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x019a }
        L_0x0182:
        L_0x0183:
            if (r1 != 0) goto L_0x0024
            java.lang.String r4 = r0.assetPath     // Catch:{ all -> 0x019a }
            if (r4 == 0) goto L_0x0024
            java.lang.String r5 = ""
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x019a }
            if (r4 != 0) goto L_0x0024
            r4 = 1
            r9.decodeError = r4     // Catch:{ all -> 0x019a }
            r9.decodeException = r3     // Catch:{ all -> 0x019a }
            goto L_0x0024
        L_0x0198:
            monitor-exit(r9)
            return r3
        L_0x019a:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.AudioDecoderTrack.createDecoder(com.tencent.tav.decoder.DecoderTrackSegment, com.tencent.tav.coremedia.CMTime):com.tencent.tav.decoder.IDecoder");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void createNextDecoder(int r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.ArrayList<com.tencent.tav.decoder.DecoderTrackSegment> r0 = r8.segments     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0075
            boolean r1 = r8.preRead     // Catch:{ all -> 0x0077 }
            if (r1 != 0) goto L_0x000a
            goto L_0x0075
        L_0x000a:
            int r6 = r9 + 1
            int r0 = r0.size()     // Catch:{ all -> 0x0077 }
            if (r6 < r0) goto L_0x0014
            monitor-exit(r8)
            return
        L_0x0014:
            com.tencent.tav.decoder.AudioDecoderTrack$AudioDecoderCreateThread r0 = r8.decoderCreateThread     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0073
            java.util.ArrayList<com.tencent.tav.decoder.DecoderTrackSegment> r0 = r8.segments     // Catch:{ all -> 0x0077 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0077 }
            com.tencent.tav.decoder.DecoderTrackSegment r0 = (com.tencent.tav.decoder.DecoderTrackSegment) r0     // Catch:{ all -> 0x0077 }
            com.tencent.tav.decoder.DecoderAssetTrack r4 = r0.getVideoAsset()     // Catch:{ all -> 0x0077 }
            if (r4 == 0) goto L_0x004a
            com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r9 = r8.nextDecoder     // Catch:{ all -> 0x0077 }
            if (r9 == 0) goto L_0x0032
            com.tencent.tav.decoder.DecoderAssetTrack r9 = r9.extractor     // Catch:{ all -> 0x0077 }
            boolean r9 = isSameExtractor(r9, r4)     // Catch:{ all -> 0x0077 }
            if (r9 != 0) goto L_0x0073
        L_0x0032:
            com.tencent.tav.decoder.AudioDecoderTrack$AudioDecoderCreateThread r9 = new com.tencent.tav.decoder.AudioDecoderTrack$AudioDecoderCreateThread     // Catch:{ Exception -> 0x0041 }
            r5 = 0
            r7 = 0
            r2 = r9
            r3 = r8
            r2.<init>(r4, r5, r6)     // Catch:{ Exception -> 0x0041 }
            r8.decoderCreateThread = r9     // Catch:{ Exception -> 0x0041 }
            r9.start()     // Catch:{ Exception -> 0x0041 }
            goto L_0x0073
        L_0x0041:
            r9 = move-exception
            java.lang.String r0 = TAG     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = "createNextDecoder"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r0, (java.lang.String) r1, (java.lang.Throwable) r9)     // Catch:{ all -> 0x0077 }
            goto L_0x0073
        L_0x004a:
            com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r0 = r8.nextDecoder     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0073
            if (r9 < 0) goto L_0x0073
            java.util.ArrayList<com.tencent.tav.decoder.DecoderTrackSegment> r0 = r8.segments     // Catch:{ all -> 0x0077 }
            int r0 = r0.size()     // Catch:{ all -> 0x0077 }
            if (r9 >= r0) goto L_0x0073
            com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r0 = r8.nextDecoder     // Catch:{ all -> 0x0077 }
            int r1 = r0.segmentIndex     // Catch:{ all -> 0x0077 }
            if (r1 == r9) goto L_0x0073
            com.tencent.tav.decoder.IDecoder r0 = r0.decoder     // Catch:{ all -> 0x0077 }
            java.util.ArrayList<com.tencent.tav.decoder.DecoderTrackSegment> r1 = r8.segments     // Catch:{ all -> 0x0077 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x0077 }
            com.tencent.tav.decoder.DecoderTrackSegment r1 = (com.tencent.tav.decoder.DecoderTrackSegment) r1     // Catch:{ all -> 0x0077 }
            com.tencent.tav.coremedia.CMTimeRange r1 = r1.getTimeRange()     // Catch:{ all -> 0x0077 }
            r0.start(r1)     // Catch:{ all -> 0x0077 }
            com.tencent.tav.decoder.AudioDecoderTrack$DecoderWrapper r0 = r8.nextDecoder     // Catch:{ all -> 0x0077 }
            r0.segmentIndex = r9     // Catch:{ all -> 0x0077 }
        L_0x0073:
            monitor-exit(r8)
            return
        L_0x0075:
            monitor-exit(r8)
            return
        L_0x0077:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.AudioDecoderTrack.createNextDecoder(int):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        return r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.tav.coremedia.CMSampleBuffer doReadSample(com.tencent.tav.coremedia.CMTime r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = r10.isReleased     // Catch:{ all -> 0x01b9 }
            r0 = -1
            if (r11 == 0) goto L_0x0019
            java.lang.String r11 = TAG     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = "doReadSample: has released"
            com.tencent.tav.decoder.logger.Logger.m144643e(r11, r2)     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMSampleBuffer r11 = new com.tencent.tav.coremedia.CMSampleBuffer     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r0)     // Catch:{ all -> 0x01b9 }
            r11.<init>((com.tencent.tav.coremedia.CMSampleState) r0)     // Catch:{ all -> 0x01b9 }
            monitor-exit(r10)     // Catch:{ all -> 0x01b9 }
            return r11
        L_0x0019:
            com.tencent.tav.coremedia.CMSampleState r11 = com.tencent.tav.coremedia.CMSampleState.fromError(r0)     // Catch:{ all -> 0x01b9 }
            r2 = 0
            r10.isEmptyFrame = r2     // Catch:{ all -> 0x01b9 }
            int r2 = r10.segmentIndex     // Catch:{ all -> 0x01b9 }
            r3 = -1
            r4 = -100
            if (r2 != r3) goto L_0x004d
            java.lang.String r11 = TAG     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = "doReadSample: segmentIndex == -1"
            com.tencent.tav.decoder.logger.Logger.m144646i(r11, r2)     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMSampleState r11 = r10.lastSampleState     // Catch:{ all -> 0x01b9 }
            long r2 = r11.getStateCode()     // Catch:{ all -> 0x01b9 }
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 >= 0) goto L_0x0042
            com.tencent.tav.coremedia.CMSampleBuffer r11 = new com.tencent.tav.coremedia.CMSampleBuffer     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r4)     // Catch:{ all -> 0x01b9 }
            r11.<init>((com.tencent.tav.coremedia.CMSampleState) r0)     // Catch:{ all -> 0x01b9 }
            goto L_0x004b
        L_0x0042:
            com.tencent.tav.coremedia.CMSampleBuffer r11 = new com.tencent.tav.coremedia.CMSampleBuffer     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r0)     // Catch:{ all -> 0x01b9 }
            r11.<init>((com.tencent.tav.coremedia.CMSampleState) r0)     // Catch:{ all -> 0x01b9 }
        L_0x004b:
            monitor-exit(r10)     // Catch:{ all -> 0x01b9 }
            return r11
        L_0x004d:
            java.util.ArrayList<com.tencent.tav.decoder.DecoderTrackSegment> r3 = r10.segments     // Catch:{ all -> 0x01b9 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.decoder.DecoderTrackSegment r2 = (com.tencent.tav.decoder.DecoderTrackSegment) r2     // Catch:{ all -> 0x01b9 }
        L_0x0055:
            com.tencent.tav.decoder.AudioDecoder r3 = r10.currentDecoder     // Catch:{ all -> 0x01b9 }
            r6 = 1
            if (r3 != 0) goto L_0x0094
            com.tencent.tav.coremedia.CMSampleState r3 = r10.lastSampleState     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r3 = r3.getTime()     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r7 = r10.frameDuration     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r3 = r3.add((com.tencent.tav.coremedia.CMTime) r7)     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMSampleState r7 = r10.lastSampleState     // Catch:{ all -> 0x01b9 }
            boolean r7 = r7.isInvalid()     // Catch:{ all -> 0x01b9 }
            if (r7 == 0) goto L_0x0070
            com.tencent.tav.coremedia.CMTime r3 = com.tencent.tav.coremedia.CMTime.CMTimeZero     // Catch:{ all -> 0x01b9 }
        L_0x0070:
            com.tencent.tav.coremedia.CMTime r7 = r10.currentSegmentStartTime     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r8 = r2.getScaledDuration()     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r7 = r7.add((com.tencent.tav.coremedia.CMTime) r8)     // Catch:{ all -> 0x01b9 }
            boolean r7 = r3.smallThan(r7)     // Catch:{ all -> 0x01b9 }
            if (r7 == 0) goto L_0x00c3
            r10.isEmptyFrame = r6     // Catch:{ all -> 0x01b9 }
            java.lang.String r11 = TAG     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = "doReadSample: return emptyBuffer currentDecoder == null"
            com.tencent.tav.decoder.logger.Logger.m144648v(r11, r0)     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMSampleBuffer r11 = new com.tencent.tav.coremedia.CMSampleBuffer     // Catch:{ all -> 0x01b9 }
            java.nio.ByteBuffer r0 = r10.outputBuffer()     // Catch:{ all -> 0x01b9 }
            r11.<init>((com.tencent.tav.coremedia.CMTime) r3, (java.nio.ByteBuffer) r0)     // Catch:{ all -> 0x01b9 }
            monitor-exit(r10)     // Catch:{ all -> 0x01b9 }
            return r11
        L_0x0094:
            com.tencent.tav.coremedia.CMSampleState r11 = r10.lastSampleState     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r11 = r11.getTime()     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r3 = r10.currentSegmentStartTime     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r11 = r11.sub(r3)     // Catch:{ all -> 0x01b9 }
            float r3 = r10._speed     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r11 = r11.multi((float) r3)     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r3 = r2.getScaledDuration()     // Catch:{ all -> 0x01b9 }
            float r7 = r10._speed     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r3 = r3.multi((float) r7)     // Catch:{ all -> 0x01b9 }
            boolean r11 = r11.bigThan(r3)     // Catch:{ all -> 0x01b9 }
            if (r11 == 0) goto L_0x00bb
            com.tencent.tav.coremedia.CMSampleState r11 = com.tencent.tav.coremedia.CMSampleState.fromError(r0)     // Catch:{ all -> 0x01b9 }
            goto L_0x00c3
        L_0x00bb:
            com.tencent.tav.decoder.AudioDecoder r11 = r10.currentDecoder     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r3 = com.tencent.tav.coremedia.CMTime.CMTimeInvalid     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMSampleState r11 = r11.readSample(r3)     // Catch:{ all -> 0x01b9 }
        L_0x00c3:
            long r7 = r11.getStateCode()     // Catch:{ all -> 0x01b9 }
            r3 = 0
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x0136
            com.tencent.tav.coremedia.CMTime r2 = r2.getScaledDuration()     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r7 = r10.currentSegmentStartTime     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r2 = r2.add((com.tencent.tav.coremedia.CMTime) r7)     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMSampleState r7 = r10.lastSampleState     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r7 = r7.getTime()     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r8 = r10.frameDuration     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r7 = r7.add((com.tencent.tav.coremedia.CMTime) r8)     // Catch:{ all -> 0x01b9 }
            boolean r2 = r2.bigThan(r7)     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0109
            com.tencent.tav.decoder.AudioDecoder r11 = r10.currentDecoder     // Catch:{ all -> 0x01b9 }
            if (r11 != 0) goto L_0x00f1
            java.nio.ByteBuffer r11 = r10.getEmptyAudioBuffer()     // Catch:{ all -> 0x01b9 }
            goto L_0x00f5
        L_0x00f1:
            java.nio.ByteBuffer r11 = r11.outputBuffer()     // Catch:{ all -> 0x01b9 }
        L_0x00f5:
            java.lang.String r0 = TAG     // Catch:{ all -> 0x01b9 }
            java.lang.String r1 = "doReadSample: finish && !end"
            com.tencent.tav.decoder.logger.Logger.m144648v(r0, r1)     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMSampleBuffer r0 = new com.tencent.tav.coremedia.CMSampleBuffer     // Catch:{ all -> 0x01b9 }
            if (r11 != 0) goto L_0x0104
            java.nio.ByteBuffer r11 = r10.getEmptyAudioBuffer()     // Catch:{ all -> 0x01b9 }
        L_0x0104:
            r0.<init>((com.tencent.tav.coremedia.CMTime) r7, (java.nio.ByteBuffer) r11)     // Catch:{ all -> 0x01b9 }
            monitor-exit(r10)     // Catch:{ all -> 0x01b9 }
            return r0
        L_0x0109:
            boolean r2 = r10.nextSegment(r6)     // Catch:{ all -> 0x01b9 }
            if (r2 != 0) goto L_0x012a
            java.lang.String r11 = TAG     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = "doReadSample: finish && end && next failed"
            com.tencent.tav.decoder.logger.Logger.m144648v(r11, r2)     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMSampleBuffer r11 = new com.tencent.tav.coremedia.CMSampleBuffer     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r0)     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.decoder.AudioDecoder r1 = r10.currentDecoder     // Catch:{ all -> 0x01b9 }
            if (r1 != 0) goto L_0x0121
            goto L_0x0125
        L_0x0121:
            java.nio.ByteBuffer r3 = r1.outputBuffer()     // Catch:{ all -> 0x01b9 }
        L_0x0125:
            r11.<init>((com.tencent.tav.coremedia.CMSampleState) r0, (java.nio.ByteBuffer) r3)     // Catch:{ all -> 0x01b9 }
            monitor-exit(r10)     // Catch:{ all -> 0x01b9 }
            return r11
        L_0x012a:
            java.util.ArrayList<com.tencent.tav.decoder.DecoderTrackSegment> r2 = r10.segments     // Catch:{ all -> 0x01b9 }
            int r3 = r10.segmentIndex     // Catch:{ all -> 0x01b9 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.decoder.DecoderTrackSegment r2 = (com.tencent.tav.decoder.DecoderTrackSegment) r2     // Catch:{ all -> 0x01b9 }
            goto L_0x0055
        L_0x0136:
            long r0 = r11.getStateCode()     // Catch:{ all -> 0x01b9 }
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0197
            com.tencent.tav.coremedia.CMTime r11 = r11.getTime()     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r0 = r2.getDecoderStartTime()     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r11 = r11.sub(r0)     // Catch:{ all -> 0x01b9 }
            float r0 = r10._speed     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r11 = r11.divide((float) r0)     // Catch:{ all -> 0x01b9 }
            long r0 = r11.getTimeUs()     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r4 = r2.getScaledDuration()     // Catch:{ all -> 0x01b9 }
            long r4 = r4.getTimeUs()     // Catch:{ all -> 0x01b9 }
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0166
            com.tencent.tav.coremedia.CMTime r11 = r2.getScaledDuration()     // Catch:{ all -> 0x01b9 }
        L_0x0166:
            com.tencent.tav.coremedia.CMTime r0 = r10.currentSegmentStartTime     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMTime r11 = r11.add((com.tencent.tav.coremedia.CMTime) r0)     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMSampleState r0 = new com.tencent.tav.coremedia.CMSampleState     // Catch:{ all -> 0x01b9 }
            r0.<init>(r11)     // Catch:{ all -> 0x01b9 }
            java.lang.String r11 = TAG     // Catch:{ all -> 0x01b9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            r1.<init>()     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = "doReadSample: [success] "
            r1.append(r2)     // Catch:{ all -> 0x01b9 }
            r1.append(r0)     // Catch:{ all -> 0x01b9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.decoder.logger.Logger.m144648v(r11, r1)     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMSampleBuffer r11 = new com.tencent.tav.coremedia.CMSampleBuffer     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.decoder.AudioDecoder r1 = r10.currentDecoder     // Catch:{ all -> 0x01b9 }
            if (r1 != 0) goto L_0x018e
            goto L_0x0192
        L_0x018e:
            java.nio.ByteBuffer r3 = r1.outputBuffer()     // Catch:{ all -> 0x01b9 }
        L_0x0192:
            r11.<init>((com.tencent.tav.coremedia.CMSampleState) r0, (java.nio.ByteBuffer) r3)     // Catch:{ all -> 0x01b9 }
            monitor-exit(r10)     // Catch:{ all -> 0x01b9 }
            return r11
        L_0x0197:
            long r0 = r11.getStateCode()     // Catch:{ all -> 0x01b9 }
            r2 = -3
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x01b2
            long r0 = r11.getStateCode()     // Catch:{ all -> 0x01b9 }
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x01b2
            com.tencent.tav.coremedia.CMSampleBuffer r11 = new com.tencent.tav.coremedia.CMSampleBuffer     // Catch:{ all -> 0x01b9 }
            com.tencent.tav.coremedia.CMSampleState r0 = r10.lastSampleState     // Catch:{ all -> 0x01b9 }
            r11.<init>((com.tencent.tav.coremedia.CMSampleState) r0)     // Catch:{ all -> 0x01b9 }
            monitor-exit(r10)     // Catch:{ all -> 0x01b9 }
            return r11
        L_0x01b2:
            com.tencent.tav.coremedia.CMSampleBuffer r0 = new com.tencent.tav.coremedia.CMSampleBuffer     // Catch:{ all -> 0x01b9 }
            r0.<init>((com.tencent.tav.coremedia.CMSampleState) r11)     // Catch:{ all -> 0x01b9 }
            monitor-exit(r10)     // Catch:{ all -> 0x01b9 }
            return r0
        L_0x01b9:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x01b9 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.AudioDecoderTrack.doReadSample(com.tencent.tav.coremedia.CMTime):com.tencent.tav.coremedia.CMSampleBuffer");
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

    private CMTime getSegmentStartTime(int i) {
        CMTime cMTime = CMTime.CMTimeZero;
        for (int i2 = 0; i2 < i; i2++) {
            cMTime = CMTime.add(cMTime, this.segments.get(i2).getScaledDuration());
        }
        return cMTime;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.assetPath;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isSameExtractor(com.tencent.tav.decoder.DecoderAssetTrack r0, com.tencent.tav.decoder.DecoderAssetTrack r1) {
        /*
            if (r0 == 0) goto L_0x0012
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = r0.assetPath
            if (r0 == 0) goto L_0x0012
            java.lang.String r1 = r1.assetPath
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.AudioDecoderTrack.isSameExtractor(com.tencent.tav.decoder.DecoderAssetTrack, com.tencent.tav.decoder.DecoderAssetTrack):boolean");
    }

    private boolean nextSegment(boolean z) {
        String str = TAG;
        Logger.m144641d(str, "nextSegment:" + z);
        int i = this.segmentIndex + 1;
        this.segmentIndex = i;
        boolean z2 = false;
        if (i >= this.segments.size()) {
            this.segmentIndex = -1;
            return false;
        }
        CMTime segmentStartTime = getSegmentStartTime(this.segmentIndex);
        this.currentSegmentStartTime = segmentStartTime;
        CMSampleState cMSampleState = new CMSampleState(segmentStartTime);
        this.lastSampleState = cMSampleState;
        if (cMSampleState.getTime().equalsTo(CMTime.CMTimeZero)) {
            this.lastSampleState = new CMSampleState();
        }
        DecoderTrackSegment decoderTrackSegment = this.segments.get(this.segmentIndex);
        if (decoderTrackSegment.getVideoAsset() != null) {
            synchronized (this.currentDecoderLock) {
                AudioDecoder audioDecoder = this.currentDecoder;
                if (!(audioDecoder == null || audioDecoder.getSourcePath() == null)) {
                    new ReleaseDecoderThread(this.currentDecoder).start();
                    this.currentDecoder = null;
                }
            }
            IDecoder createDecoder = createDecoder(decoderTrackSegment, z ? this.segments.get(this.segmentIndex).getDecoderStartTime() : CMTime.CMTimeInvalid);
            synchronized (this.currentDecoderLock) {
                this.currentDecoder = (AudioDecoder) createDecoder;
                AudioMixer audioMixer2 = this.audioMixer;
                if (audioMixer2 != null) {
                    audioMixer2.release();
                }
                this.audioMixer = new AudioMixer();
                AudioDecoder audioDecoder2 = this.currentDecoder;
                if (audioDecoder2 != null && audioDecoder2.hasTrack() && z) {
                    this.currentDecoder.seekTo(decoderTrackSegment.getDecoderStartTime());
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
        if (decoderTrackSegment.getScaledDuration().getTimeUs() > 0) {
            this._speed = (((float) decoderTrackSegment.getTimeRange().getDurationUs()) * 1.0f) / ((float) decoderTrackSegment.getScaledDuration().getTimeUs());
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

    public void asyncReadNextSample(CMTime cMTime) {
        if (this.decoderThread.pcmFrame == null) {
            synchronized (this.decoderThread) {
                if (this.decoderThread.pcmFrame == null) {
                    this.decoderThread.action();
                }
            }
        }
    }

    public void clipRangeAndClearRange(CMTimeRange cMTimeRange) {
        if (cMTimeRange != null && cMTimeRange.getDurationUs() > 0 && this.segments.size() != 0) {
            CMTime start = cMTimeRange.getStart();
            CMTime end = cMTimeRange.getEnd();
            CMTime duration2 = duration();
            clipRangeAndRemoveRange(cMTimeRange);
            if (start.getValue() != 0) {
                this.segments.add(0, new DecoderTrackSegment(new CMTimeRange(CMTime.CMTimeZero, start), (DecoderAssetTrack) null));
            }
            if (end.getTimeUs() < duration2.getTimeUs()) {
                this.segments.add(new DecoderTrackSegment(new CMTimeRange(end, new CMTime(duration2.getTimeSeconds() - end.getTimeSeconds())), (DecoderAssetTrack) null));
            }
        }
    }

    public void clipRangeAndRemoveRange(CMTimeRange cMTimeRange) {
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
                DecoderTrackSegment decoderTrackSegment = this.segments.get(findSegmentIndexAt);
                DecoderTrackSegment decoderTrackSegment2 = this.segments.get(findSegmentIndexAt2);
                CMTime sub = cMTimeRange.getEnd().sub(segmentStartTime2);
                decoderTrackSegment2.setTimeRange(new CMTimeRange(decoderTrackSegment2.getTimeRange().getStart(), sub.divide((((float) decoderTrackSegment2.getScaledDuration().getTimeUs()) * 1.0f) / ((float) decoderTrackSegment2.getTimeRange().getDurationUs()))));
                decoderTrackSegment2.setScaledDuration(sub);
                CMTime sub2 = cMTimeRange.getStart().sub(segmentStartTime);
                CMTime divide = sub2.divide((((float) decoderTrackSegment.getScaledDuration().getTimeUs()) * 1.0f) / ((float) decoderTrackSegment.getTimeRange().getDurationUs()));
                decoderTrackSegment.setTimeRange(new CMTimeRange(decoderTrackSegment.getTimeRange().getStart().add(divide), decoderTrackSegment.getTimeRange().getDuration().sub(divide)));
                decoderTrackSegment.setScaledDuration(decoderTrackSegment.getScaledDuration().sub(sub2));
                for (int size = this.segments.size() - 1; size >= 0; size--) {
                    if (size > findSegmentIndexAt2 || size < findSegmentIndexAt) {
                        this.segments.remove(size);
                    }
                }
            }
        }
    }

    public CMTime duration() {
        return getSegmentStartTime(this.segments.size());
    }

    public AudioInfo getAudioInfo() {
        AudioDecoder audioDecoder = this.currentDecoder;
        return audioDecoder != null ? audioDecoder.getAudioInfo() : this.audioInfo;
    }

    public CMTime getCurrentSampleTime() {
        return this.lastSampleState.getTime();
    }

    public AverageTimeReporter getDecodePerformance() {
        return null;
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

    public ByteBuffer getEmptyAudioBuffer() {
        if (this.emptyAudioBuffer == null) {
            AudioInfo audioInfo2 = this.audioInfo;
            long timeUs = (((long) (audioInfo2.channelCount * audioInfo2.sampleRate)) * this.frameDuration.getTimeUs()) / TimeUtil.SECOND_TO_US;
            int i = (int) timeUs;
            ByteBuffer allocate = ByteBuffer.allocate(i * 2);
            this.emptyAudioBuffer = allocate;
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            short[] sArr = new short[i];
            for (int i2 = 0; ((long) i2) < timeUs; i2++) {
                sArr[i2] = 0;
            }
            this.emptyAudioBuffer.asShortBuffer().put(sArr, 0, i);
        }
        this.emptyAudioBuffer.position(0);
        return this.emptyAudioBuffer;
    }

    public CMTime getFrameDuration() {
        return this.frameDuration;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public long getLaggingTime() {
        return 0;
    }

    public int getTrackID() {
        return this.trackID;
    }

    public int getTrackId() {
        return this.trackID;
    }

    public ByteBuffer outputBuffer() {
        if (this.isEmptyFrame) {
            return getEmptyAudioBuffer();
        }
        AudioDecoder audioDecoder = this.currentDecoder;
        if (audioDecoder == null) {
            return null;
        }
        return audioDecoder.outputBuffer();
    }

    public synchronized ByteBuffer processFrame(ByteBuffer byteBuffer, float f, float f2, AudioInfo audioInfo2) {
        if (this.audioMixer.getDestAudioChannelCount() != audioInfo2.channelCount) {
            this.audioMixer.release();
            this.audioMixer = new AudioMixer(audioInfo2.sampleRate, audioInfo2.channelCount);
        }
        return this.audioMixer.processBytes(byteBuffer, f2, f, 1.0f);
    }

    public CMSampleBuffer readSample() {
        return readSample(CMTime.CMTimeInvalid);
    }

    public synchronized void release() {
        Logger.m144641d(TAG, "release: start ");
        this.decoderThread.release();
        this.isReleased = true;
        AudioDecoder audioDecoder = this.currentDecoder;
        if (audioDecoder != null) {
            audioDecoder.release();
            this.currentDecoder = null;
        }
        synchronized (this.nextDecoderLock) {
            DecoderWrapper decoderWrapper = this.nextDecoder;
            if (decoderWrapper != null) {
                decoderWrapper.release();
                this.nextDecoder = null;
            }
        }
        Logger.m144641d(TAG, "release: finish ");
    }

    public CMSampleBuffer seekTo(CMTime cMTime, boolean z, boolean z2) {
        String str = TAG;
        Logger.m144648v(str, "seekTo:[time " + cMTime + "] [needRead " + z + "] [quickSeek " + z2 + "]");
        if (this.isReleased) {
            Logger.m144643e(TAG, "seekTo: [failed] has released");
            return new CMSampleBuffer(CMSampleState.fromError(-1));
        }
        synchronized (this.decoderThread.nextFrameDecoderLock) {
            CacheBuffer unused = this.decoderThread.pcmFrame = null;
        }
        if (!this.started) {
            String str2 = TAG;
            Logger.m144649w(str2, "seekTo: [failed] un started, stack = " + Log.getStackTraceString(new RuntimeException()));
            return null;
        }
        int findSegmentIndexAt = findSegmentIndexAt(cMTime, true);
        if (findSegmentIndexAt == -1) {
            this.segmentIndex = -1;
            Logger.m144643e(TAG, "seekTo: [failed] segmentIndex = -1");
            return null;
        }
        CMTime segmentStartTime = getSegmentStartTime(findSegmentIndexAt);
        if (this.segmentIndex != findSegmentIndexAt || this.currentDecoder == null) {
            this.segmentIndex = findSegmentIndexAt - 1;
            nextSegment(false);
        }
        CMTime multi = cMTime.sub(segmentStartTime).multi(this._speed);
        DecoderTrackSegment decoderTrackSegment = this.segments.get(this.segmentIndex);
        AudioDecoder audioDecoder = this.currentDecoder;
        if (audioDecoder == null) {
            this.lastSampleState = new CMSampleState(cMTime);
            Logger.m144641d(TAG, "seekTo: [failed] currentDecoder == null ");
            return null;
        }
        audioDecoder.seekTo(decoderTrackSegment.getDecoderStartTime().add(multi));
        if (cMTime.bigThan(this.frameDuration)) {
            this.lastSampleState = new CMSampleState(cMTime.sub(this.frameDuration));
        } else {
            this.lastSampleState = new CMSampleState(cMTime);
        }
        String str3 = TAG;
        Logger.m144648v(str3, "seekTo: [success] [lastSampleState " + this.lastSampleState + "]");
        return null;
    }

    public void setAudioInfo(AudioInfo audioInfo2) {
        this.audioInfo = audioInfo2.clone();
        if (this.emptyAudioBuffer != null) {
            this.emptyAudioBuffer = null;
        }
    }

    public void setDecodeType(IDecoder.DecodeType decodeType2) {
        this.decodeType = decodeType2;
    }

    public void setFrameRate(int i) {
        this.frameDuration = this.frameDuration.divide((float) (i / this.frameRate));
        this.frameRate = i;
    }

    public void setTrackID(int i) {
        this.trackID = i;
    }

    public void setTrackSegments(List<DecoderTrackSegment> list) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        this.segments.clear();
        this.segments.addAll(list);
    }

    public void setVolume(float f) {
        this.volume = f;
    }

    public float speed() {
        return this._speed;
    }

    public void start() {
        start((IDecoderTrack.SurfaceCreator) null);
    }

    public AudioDecoderTrack(IDecoderFactory iDecoderFactory) {
        this.preRead = false;
        this.frameDuration = new CMTime(92880, 1000000);
        this.frameRate = 11;
        this.volume = 1.0f;
        this.trackID = -1;
        this.segments = new ArrayList<>();
        this.decodeType = IDecoder.DecodeType.Audio;
        this.segmentIndex = -1;
        CMTime cMTime = CMTime.CMTimeZero;
        this.currentSegmentStartTime = cMTime;
        this.lastSampleState = new CMSampleState();
        this.decoderCreateThread = null;
        this.nextDecoderLock = new Object();
        this.currentDecoderLock = new Object();
        this.isReleased = false;
        this.decoderThread = new DecoderThread();
        this.audioMixer = new AudioMixer();
        this.audioInfo = new AudioInfo();
        this.isEmptyFrame = false;
        this.decodeError = false;
        this.decodeException = null;
        this._speed = 1.0f;
        this.started = false;
        this.duration = cMTime;
        this.decoderFactory = iDecoderFactory;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0089, code lost:
        r6 = doReadSample(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
        if (r6.getSampleByteBuffer() == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        r0 = r5._speed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009a, code lost:
        if (r0 <= 0.1f) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a0, code lost:
        if (r0 >= 16.0f) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a2, code lost:
        r6.setSampleByteBuffer(processFrame(r6.getSampleByteBuffer(), r5.volume, r5._speed, getAudioInfo()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b5, code lost:
        r5.lastSampleState = r6.getState();
        createNextDecoder(r5.segmentIndex);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c0, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.tav.coremedia.CMSampleBuffer readSample(com.tencent.tav.coremedia.CMTime r6) {
        /*
            r5 = this;
            boolean r0 = r5.isReleased
            if (r0 == 0) goto L_0x0017
            java.lang.String r6 = TAG
            java.lang.String r0 = "readSample: [error] has released"
            com.tencent.tav.decoder.logger.Logger.m144643e(r6, r0)
            com.tencent.tav.coremedia.CMSampleBuffer r6 = new com.tencent.tav.coremedia.CMSampleBuffer
            r0 = -1
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r0)
            r6.<init>((com.tencent.tav.coremedia.CMSampleState) r0)
            return r6
        L_0x0017:
            boolean r0 = r5.decodeError
            if (r0 == 0) goto L_0x002d
            com.tencent.tav.coremedia.CMSampleBuffer r6 = new com.tencent.tav.coremedia.CMSampleBuffer
            r0 = -3
            r2 = -202(0xffffffffffffff36, float:NaN)
            java.lang.String r3 = ""
            java.lang.Exception r4 = r5.decodeException
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromExportError(r0, r2, r3, r4)
            r6.<init>((com.tencent.tav.coremedia.CMSampleState) r0)
            return r6
        L_0x002d:
            com.tencent.tav.decoder.AudioDecoderTrack$DecoderThread r0 = r5.decoderThread
            java.lang.Object r0 = r0.nextFrameDecoderLock
            monitor-enter(r0)
            com.tencent.tav.decoder.AudioDecoderTrack$DecoderThread r1 = r5.decoderThread     // Catch:{ all -> 0x00c1 }
            com.tencent.tav.decoder.AudioDecoderTrack$CacheBuffer r1 = r1.pcmFrame     // Catch:{ all -> 0x00c1 }
            if (r1 == 0) goto L_0x0088
            com.tencent.tav.decoder.AudioDecoderTrack$DecoderThread r1 = r5.decoderThread     // Catch:{ all -> 0x00c1 }
            com.tencent.tav.decoder.AudioDecoderTrack$CacheBuffer r1 = r1.pcmFrame     // Catch:{ all -> 0x00c1 }
            com.tencent.tav.coremedia.CMTime r1 = r1.frameTime     // Catch:{ all -> 0x00c1 }
            com.tencent.tav.coremedia.CMSampleState r2 = r5.lastSampleState     // Catch:{ all -> 0x00c1 }
            com.tencent.tav.coremedia.CMTime r2 = r2.getTime()     // Catch:{ all -> 0x00c1 }
            if (r1 != r2) goto L_0x0088
            com.tencent.tav.decoder.AudioDecoderTrack$DecoderThread r6 = r5.decoderThread     // Catch:{ all -> 0x00c1 }
            com.tencent.tav.decoder.AudioDecoderTrack$CacheBuffer r6 = r6.pcmFrame     // Catch:{ all -> 0x00c1 }
            com.tencent.tav.coremedia.CMSampleBuffer r6 = r6.sampleBuffer     // Catch:{ all -> 0x00c1 }
            com.tencent.tav.coremedia.CMSampleState r1 = new com.tencent.tav.coremedia.CMSampleState     // Catch:{ all -> 0x00c1 }
            com.tencent.tav.decoder.AudioDecoderTrack$DecoderThread r2 = r5.decoderThread     // Catch:{ all -> 0x00c1 }
            com.tencent.tav.decoder.AudioDecoderTrack$CacheBuffer r2 = r2.pcmFrame     // Catch:{ all -> 0x00c1 }
            com.tencent.tav.coremedia.CMTime r2 = r2.frameTime     // Catch:{ all -> 0x00c1 }
            r1.<init>(r2)     // Catch:{ all -> 0x00c1 }
            r5.lastSampleState = r1     // Catch:{ all -> 0x00c1 }
            int r1 = r5.segmentIndex     // Catch:{ all -> 0x00c1 }
            r5.createNextDecoder(r1)     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = TAG     // Catch:{ all -> 0x00c1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            r2.<init>()     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = "readSample: [success] hit asyncRead - "
            r2.append(r3)     // Catch:{ all -> 0x00c1 }
            com.tencent.tav.coremedia.CMSampleState r3 = r5.lastSampleState     // Catch:{ all -> 0x00c1 }
            r2.append(r3)     // Catch:{ all -> 0x00c1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00c1 }
            com.tencent.tav.decoder.logger.Logger.m144648v(r1, r2)     // Catch:{ all -> 0x00c1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
            return r6
        L_0x0088:
            monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
            com.tencent.tav.coremedia.CMSampleBuffer r6 = r5.doReadSample(r6)
            java.nio.ByteBuffer r0 = r6.getSampleByteBuffer()
            if (r0 == 0) goto L_0x00b5
            float r0 = r5._speed
            r1 = 1036831949(0x3dcccccd, float:0.1)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b5
            r1 = 1098907648(0x41800000, float:16.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b5
            java.nio.ByteBuffer r0 = r6.getSampleByteBuffer()
            float r1 = r5.volume
            float r2 = r5._speed
            com.tencent.tav.decoder.AudioInfo r3 = r5.getAudioInfo()
            java.nio.ByteBuffer r0 = r5.processFrame(r0, r1, r2, r3)
            r6.setSampleByteBuffer(r0)
        L_0x00b5:
            com.tencent.tav.coremedia.CMSampleState r0 = r6.getState()
            r5.lastSampleState = r0
            int r0 = r5.segmentIndex
            r5.createNextDecoder(r0)
            return r6
        L_0x00c1:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.AudioDecoderTrack.readSample(com.tencent.tav.coremedia.CMTime):com.tencent.tav.coremedia.CMSampleBuffer");
    }

    public void start(IDecoderTrack.SurfaceCreator surfaceCreator) {
        start(surfaceCreator, (CMTimeRange) null);
    }

    public void start(IDecoderTrack.SurfaceCreator surfaceCreator, CMTimeRange cMTimeRange) {
        if (this.segments.size() == 0) {
            release();
            return;
        }
        this.isReleased = false;
        this.decoderThread.start();
        this.started = true;
        this.segmentIndex = -1;
        clipRangeAndRemoveRange(cMTimeRange);
        nextSegment(true);
    }
}
