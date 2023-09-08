package com.tencent.tav.core;

import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.asset.AssetTrackSegment;
import com.tencent.tav.asset.CompositionTrackSegment;
import com.tencent.tav.codec.IDecoderFactory;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMSampleState;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.AudioDecoderTrack;
import com.tencent.tav.decoder.AudioInfo;
import com.tencent.tav.decoder.AudioMixer;
import com.tencent.tav.decoder.DecoderAssetTrack;
import com.tencent.tav.decoder.DecoderTrackSegment;
import com.tencent.tav.decoder.IDecoder;
import com.tencent.tav.decoder.IDecoderTrack;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.decoder.thread.ReActionHandlerThread;
import com.tencent.tav.report.AverageTimeReporter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class AudioCompositionDecoderTrack implements IDecoderTrack {
    private static final String TAG = "AudioCompositionDecoder";
    private CMSampleBuffer _lastReadAudioBuffer;
    private HashMap<Integer, AudioCompositor> audioCompositorMap;
    /* access modifiers changed from: private */
    public AudioInfo audioInfo;
    private AudioMix audioMix;
    private List<AssetTrack> audioTracks;
    private IDecoderFactory decoderFactory;
    private boolean decoderStarted;
    private final DecoderThread decoderThread;
    private ArrayList<AudioDecoderTrack> decoderTrackList;
    private AudioMixer mAudioMixer;
    /* access modifiers changed from: private */
    public float rate;
    /* access modifiers changed from: private */
    public float volume;

    public class DecoderThread extends ReActionHandlerThread {
        private static final String NAME = "AudioDecoderThread";
        /* access modifiers changed from: private */
        public final Object nextFrameDecoderLock = new Object();
        /* access modifiers changed from: private */
        public CMSampleBuffer pcmFrame;

        public DecoderThread() {
            super(NAME);
        }

        public void doAction() {
            synchronized (this.nextFrameDecoderLock) {
                Logger.m144648v(AudioCompositionDecoderTrack.TAG, "doAction: start ");
                CMSampleBuffer access$200 = AudioCompositionDecoderTrack.this.doReadSample();
                this.pcmFrame = access$200;
                if (access$200.getSampleByteBuffer() != null) {
                    CMSampleBuffer cMSampleBuffer = this.pcmFrame;
                    cMSampleBuffer.setSampleByteBuffer(AudioCompositionDecoderTrack.this.processFrame(cMSampleBuffer.getSampleByteBuffer(), AudioCompositionDecoderTrack.this.volume, AudioCompositionDecoderTrack.this.rate, AudioCompositionDecoderTrack.this.audioInfo));
                }
                Logger.m144648v(AudioCompositionDecoderTrack.TAG, "doAction: finish ");
            }
        }

        public void run() {
            super.run();
        }
    }

    public AudioCompositionDecoderTrack(List<AssetTrack> list, int i) {
        this(list, i, (IDecoderFactory) null);
    }

    private DecoderTrackSegment createDecoderTrackSegment(AssetTrack assetTrack, AssetTrackSegment assetTrackSegment) {
        DecoderAssetTrack decoderAssetTrack;
        if (!assetTrackSegment.isEmpty()) {
            decoderAssetTrack = new DecoderAssetTrack();
            decoderAssetTrack.assetPath = assetTrack.getSourcePath();
            decoderAssetTrack.trackId = assetTrack.getTrackID();
            decoderAssetTrack.mediaType = assetTrack.getMediaType();
            decoderAssetTrack.size = assetTrack.getNaturalSize();
            decoderAssetTrack.preferredTransform = assetTrack.getPreferredTransform();
            decoderAssetTrack.preferredVolume = assetTrack.getPreferredVolume();
            decoderAssetTrack.frameRate = (int) assetTrack.getNominalFrameRate();
        } else {
            decoderAssetTrack = null;
        }
        CMTimeRange source = assetTrackSegment.getTimeMapping().getSource();
        DecoderTrackSegment decoderTrackSegment = new DecoderTrackSegment(new CMTimeRange(source.getStart(), source.getDuration()), decoderAssetTrack);
        decoderTrackSegment.setScaledDuration(assetTrackSegment.getScaleDuration());
        return decoderTrackSegment;
    }

    /* access modifiers changed from: private */
    public synchronized CMSampleBuffer doReadSample() {
        CMTime cMTime;
        Logger.m144648v(TAG, "doReadSample: start ");
        if (this.decoderTrackList.isEmpty()) {
            Logger.m144643e(TAG, "doReadSample:[finish] decoderTrackList.isEmpty ");
            return new CMSampleBuffer(CMSampleState.fromError(-100));
        }
        AudioDecoderTrack audioDecoderTrack = this.decoderTrackList.get(0);
        CMSampleBuffer readSample = audioDecoderTrack.readSample();
        if (readSample.getState().getStateCode() < -1) {
            Logger.m144643e(TAG, "doReadSample:[failed]");
            return readSample;
        }
        this._lastReadAudioBuffer = readSample;
        ByteBuffer sampleByteBuffer = readSample.getSampleByteBuffer();
        if (this._lastReadAudioBuffer.getSampleByteBuffer() == null) {
            sampleByteBuffer = audioDecoderTrack.getEmptyAudioBuffer();
        }
        if (sampleByteBuffer != null) {
            sampleByteBuffer.position(0);
        }
        CMSampleBuffer cMSampleBuffer = new CMSampleBuffer(this._lastReadAudioBuffer.getTime(), sampleByteBuffer);
        int size = this.decoderTrackList.size() - 1;
        while (true) {
            cMTime = null;
            if (size <= 0) {
                break;
            }
            AudioDecoderTrack audioDecoderTrack2 = this.decoderTrackList.get(size);
            AudioCompositor audioCompositor = this.audioCompositorMap.get(Integer.valueOf(audioDecoderTrack2.getTrackID()));
            if (audioCompositor != null) {
                Logger.m144648v(TAG, "doReadSample: readMergeSample " + size);
                AudioMix audioMix2 = this.audioMix;
                cMSampleBuffer = audioCompositor.readMergeSample(audioDecoderTrack2, audioMix2 != null ? audioMix2.getInputParametersWithTrackID(audioDecoderTrack2.getTrackID()) : null, cMSampleBuffer);
                Logger.m144648v(TAG, "doReadSample: readMergeSample finish " + size);
                if (cMSampleBuffer != null && cMSampleBuffer.getState().getStateCode() < -1) {
                    break;
                }
            } else {
                Logger.m144643e(TAG, "doReadSample: audioCompositorMap.get(decoderTrack.getTrackID(), return null!");
            }
            size--;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("doReadSample:[success]  ");
        if (cMSampleBuffer != null) {
            cMTime = cMSampleBuffer.getTime();
        }
        sb.append(cMTime);
        Logger.m144648v(TAG, sb.toString());
        return cMSampleBuffer;
    }

    private void initAudioDecodeTracks(CMTimeRange cMTimeRange) {
        if (this.audioTracks != null) {
            synchronized (this) {
                this.decoderTrackList.clear();
            }
            AudioDecoderTrack audioDecoderTrack = new AudioDecoderTrack();
            ArrayList arrayList = new ArrayList();
            arrayList.add(createDecoderTrackSegment((AssetTrack) null, new CompositionTrackSegment(new CMTimeRange(CMTime.CMTimeZero, cMTimeRange == null ? getDuration() : cMTimeRange.getDuration()))));
            audioDecoderTrack.setTrackID(0);
            audioDecoderTrack.setTrackSegments(arrayList);
            audioDecoderTrack.setVolume(0.0f);
            audioDecoderTrack.setDecodeType(IDecoder.DecodeType.Audio);
            audioDecoderTrack.setAudioInfo(this.audioInfo);
            this.decoderTrackList.add(audioDecoderTrack);
            for (AssetTrack next : this.audioTracks) {
                if (next.getMediaType() == 2) {
                    AudioDecoderTrack audioDecoderTrack2 = new AudioDecoderTrack(this.decoderFactory);
                    AudioCompositor audioCompositor = new AudioCompositor(this.audioInfo);
                    List<AssetTrackSegment> segments = next.getSegments();
                    ArrayList arrayList2 = new ArrayList();
                    for (AssetTrackSegment assetTrackSegment : segments) {
                        if (assetTrackSegment instanceof CompositionTrackSegment) {
                            arrayList2.add(createDecoderTrackSegment(next, (CompositionTrackSegment) assetTrackSegment));
                        } else {
                            arrayList2.add(createDecoderTrackSegment(next, assetTrackSegment));
                        }
                    }
                    audioDecoderTrack2.setTrackID(next.getTrackID());
                    audioDecoderTrack2.setTrackSegments(arrayList2);
                    audioDecoderTrack2.setFrameRate((int) next.getNominalFrameRate());
                    audioDecoderTrack2.setVolume(next.getPreferredVolume());
                    audioDecoderTrack2.setDecodeType(IDecoder.DecodeType.Audio);
                    audioDecoderTrack2.setAudioInfo(this.audioInfo);
                    if (next.getTimeRange() != null) {
                        audioDecoderTrack2.clipRangeAndClearRange(new CMTimeRange(next.getTimeRange().getStart(), next.getTimeRange().getDuration()));
                    }
                    this.decoderTrackList.add(audioDecoderTrack2);
                    this.audioCompositorMap.put(Integer.valueOf(next.getTrackID()), audioCompositor);
                }
            }
        }
    }

    private void initAudioMix() {
        List<AssetTrack> list = this.audioTracks;
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (AssetTrack next : this.audioTracks) {
                if (next != null) {
                    MutableAudioMixInputParameters mutableAudioMixInputParameters = new MutableAudioMixInputParameters(next, (String) null);
                    mutableAudioMixInputParameters.setVolumeForTimeRange(next.getPreferredVolume(), next.getTimeRange());
                    arrayList.add(mutableAudioMixInputParameters);
                }
            }
            this.audioMix = new AudioMix(arrayList);
        }
    }

    public synchronized void addTrack(AssetTrack assetTrack) {
        this.audioTracks.add(assetTrack);
    }

    public void asyncReadNextSample(CMTime cMTime) {
        Logger.m144648v(TAG, "asyncReadNextSample: " + cMTime);
        if (this.decoderThread.pcmFrame == null) {
            synchronized (this.decoderThread.nextFrameDecoderLock) {
                if (this.decoderThread.pcmFrame == null) {
                    this.decoderThread.action();
                }
            }
        }
    }

    public void clipRangeAndClearRange(CMTimeRange cMTimeRange) {
    }

    public CMTime getCurrentSampleTime() {
        return this.decoderTrackList.get(0).getCurrentSampleTime();
    }

    public AverageTimeReporter getDecodePerformance() {
        return null;
    }

    public CMTime getDuration() {
        CMTime cMTime = CMTime.CMTimeZero;
        for (AssetTrack duration : this.audioTracks) {
            CMTime duration2 = duration.getDuration();
            if (duration2.bigThan(cMTime)) {
                cMTime = duration2;
            }
        }
        return cMTime;
    }

    public CMTime getFrameDuration() {
        return CMTime.CMTimeZero;
    }

    public int getFrameRate() {
        return 0;
    }

    public long getLaggingTime() {
        return 0;
    }

    public int getTrackId() {
        return 0;
    }

    public synchronized ByteBuffer processFrame(ByteBuffer byteBuffer, float f, float f2, AudioInfo audioInfo2) {
        this.mAudioMixer.setAudioInfo(audioInfo2.sampleRate, audioInfo2.channelCount, audioInfo2.pcmEncoding);
        return this.mAudioMixer.processBytes(byteBuffer, f2, f, 1.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r0 = doReadSample();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r0 == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r0.getSampleByteBuffer() == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r0.setSampleByteBuffer(processFrame(r0.getSampleByteBuffer(), r5.volume, r5.rate, r5.audioInfo));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.tav.coremedia.CMSampleBuffer readSample() {
        /*
            r5 = this;
            java.util.ArrayList<com.tencent.tav.decoder.AudioDecoderTrack> r0 = r5.decoderTrackList
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0014
            com.tencent.tav.coremedia.CMSampleBuffer r0 = new com.tencent.tav.coremedia.CMSampleBuffer
            r1 = -100
            com.tencent.tav.coremedia.CMSampleState r1 = com.tencent.tav.coremedia.CMSampleState.fromError(r1)
            r0.<init>((com.tencent.tav.coremedia.CMSampleState) r1)
            return r0
        L_0x0014:
            com.tencent.tav.core.AudioCompositionDecoderTrack$DecoderThread r0 = r5.decoderThread
            java.lang.Object r0 = r0.nextFrameDecoderLock
            monitor-enter(r0)
            com.tencent.tav.core.AudioCompositionDecoderTrack$DecoderThread r1 = r5.decoderThread     // Catch:{ all -> 0x0050 }
            com.tencent.tav.coremedia.CMSampleBuffer r1 = r1.pcmFrame     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0031
            com.tencent.tav.core.AudioCompositionDecoderTrack$DecoderThread r1 = r5.decoderThread     // Catch:{ all -> 0x0050 }
            com.tencent.tav.coremedia.CMSampleBuffer r1 = r1.pcmFrame     // Catch:{ all -> 0x0050 }
            com.tencent.tav.core.AudioCompositionDecoderTrack$DecoderThread r2 = r5.decoderThread     // Catch:{ all -> 0x0050 }
            r3 = 0
            com.tencent.tav.coremedia.CMSampleBuffer unused = r2.pcmFrame = r3     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r1
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            com.tencent.tav.coremedia.CMSampleBuffer r0 = r5.doReadSample()
            if (r0 == 0) goto L_0x004f
            java.nio.ByteBuffer r1 = r0.getSampleByteBuffer()
            if (r1 == 0) goto L_0x004f
            java.nio.ByteBuffer r1 = r0.getSampleByteBuffer()
            float r2 = r5.volume
            float r3 = r5.rate
            com.tencent.tav.decoder.AudioInfo r4 = r5.audioInfo
            java.nio.ByteBuffer r1 = r5.processFrame(r1, r2, r3, r4)
            r0.setSampleByteBuffer(r1)
        L_0x004f:
            return r0
        L_0x0050:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.core.AudioCompositionDecoderTrack.readSample():com.tencent.tav.coremedia.CMSampleBuffer");
    }

    public synchronized void release() {
        Logger.m144641d(TAG, "release: " + this);
        Iterator<AudioDecoderTrack> it = this.decoderTrackList.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.decoderTrackList.clear();
        this.audioTracks.clear();
        this.decoderThread.release();
        Logger.m144641d(TAG, "release: finish" + this);
    }

    public synchronized void removeTrack(AssetTrack assetTrack) {
        this.audioTracks.remove(assetTrack);
    }

    public CMSampleBuffer seekTo(CMTime cMTime, boolean z, boolean z2) {
        Logger.m144648v(TAG, "seekTo:[timeUs " + cMTime + "] [needRead " + z + "] [quickSeek " + z2 + "]");
        synchronized (this.decoderThread.nextFrameDecoderLock) {
            CMSampleBuffer unused = this.decoderThread.pcmFrame = null;
        }
        Iterator<AudioDecoderTrack> it = this.decoderTrackList.iterator();
        while (it.hasNext()) {
            AudioDecoderTrack next = it.next();
            Logger.m144648v(TAG, "seekTo: " + next);
            next.seekTo(cMTime, false, z2);
        }
        synchronized (this) {
            this._lastReadAudioBuffer = null;
            for (AudioCompositor clear : this.audioCompositorMap.values()) {
                clear.clear();
            }
        }
        return null;
    }

    public void setAudioInfo(AudioInfo audioInfo2) {
        this.audioInfo = audioInfo2.clone();
        this.mAudioMixer = new AudioMixer(audioInfo2.sampleRate, audioInfo2.channelCount);
        Iterator<AudioDecoderTrack> it = this.decoderTrackList.iterator();
        while (it.hasNext()) {
            it.next().setAudioInfo(audioInfo2);
        }
        for (AudioCompositor audioInfo3 : this.audioCompositorMap.values()) {
            audioInfo3.setAudioInfo(audioInfo2);
        }
    }

    public void setAudioMix(AudioMix audioMix2) {
        this.audioMix = audioMix2;
    }

    public void setDecodeType(IDecoder.DecodeType decodeType) {
    }

    public void setFrameRate(int i) {
        Iterator<AudioDecoderTrack> it = this.decoderTrackList.iterator();
        while (it.hasNext()) {
            it.next().setFrameRate(i);
        }
    }

    public void setRate(float f) {
        this.rate = f;
    }

    public void setTrackSegments(List<DecoderTrackSegment> list) {
    }

    public void setVolume(float f) {
        List<AudioMixInputParameters> inputParameters;
        Logger.m144646i(TAG, "setVolume: " + f);
        AudioMix audioMix2 = this.audioMix;
        if (!(audioMix2 == null || (inputParameters = audioMix2.getInputParameters()) == null)) {
            for (AudioMixInputParameters audioMixInputParameters : inputParameters) {
                if (audioMixInputParameters != null && (audioMixInputParameters instanceof MutableAudioMixInputParameters)) {
                    ((MutableAudioMixInputParameters) audioMixInputParameters).setVolumeForTimeRange(f);
                }
            }
        }
        this.volume = f;
    }

    public void start() {
        start((IDecoderTrack.SurfaceCreator) null);
    }

    public AudioCompositionDecoderTrack(List<AssetTrack> list, int i, IDecoderFactory iDecoderFactory) {
        this.audioTracks = new ArrayList();
        this.decoderTrackList = new ArrayList<>();
        this.audioCompositorMap = new HashMap<>();
        this.volume = 1.0f;
        this.rate = 1.0f;
        this.decoderStarted = false;
        this.decoderThread = new DecoderThread();
        this.mAudioMixer = new AudioMixer();
        this.audioInfo = new AudioInfo();
        this.decoderFactory = iDecoderFactory;
        this.audioTracks = list;
        initAudioDecodeTracks((CMTimeRange) null);
        initAudioMix();
    }

    public void start(IDecoderTrack.SurfaceCreator surfaceCreator) {
        start(surfaceCreator, (CMTimeRange) null);
    }

    public void start(IDecoderTrack.SurfaceCreator surfaceCreator, CMTimeRange cMTimeRange) {
        int i;
        Logger.m144641d(TAG, "start: " + cMTimeRange);
        if (!this.decoderStarted) {
            Logger.m144641d(TAG, "start: " + this);
            this.decoderThread.start();
            initAudioDecodeTracks(cMTimeRange);
            this.decoderStarted = true;
            CMTimeRange cMTimeRange2 = null;
            for (int i2 = 0; i2 < this.decoderTrackList.size(); i2++) {
                if (i2 <= 0 || i2 - 1 >= this.audioTracks.size()) {
                    cMTimeRange2 = new CMTimeRange(CMTime.CMTimeZero, getDuration());
                } else {
                    AssetTrack assetTrack = this.audioTracks.get(i);
                    if (!(assetTrack == null || assetTrack.getTimeRange() == null)) {
                        cMTimeRange2 = new CMTimeRange(assetTrack.getTimeRange().getStart(), assetTrack.getTimeRange().getDuration());
                    }
                }
                this.decoderTrackList.get(i2).start((IDecoderTrack.SurfaceCreator) null, cMTimeRange2);
            }
        }
    }

    private DecoderTrackSegment createDecoderTrackSegment(AssetTrack assetTrack, CompositionTrackSegment compositionTrackSegment) {
        DecoderAssetTrack decoderAssetTrack;
        if (!compositionTrackSegment.isEmpty()) {
            decoderAssetTrack = new DecoderAssetTrack();
            decoderAssetTrack.trackId = compositionTrackSegment.getSourceTrackID();
            decoderAssetTrack.mediaType = assetTrack.getMediaType();
            decoderAssetTrack.assetPath = compositionTrackSegment.getSourcePath();
            decoderAssetTrack.preferredTransform = assetTrack.getPreferredTransform();
            decoderAssetTrack.size = assetTrack.getNaturalSize();
            decoderAssetTrack.frameRate = (int) assetTrack.getNominalFrameRate();
            decoderAssetTrack.preferredVolume = assetTrack.getPreferredVolume();
        } else {
            decoderAssetTrack = null;
        }
        CMTimeRange source = compositionTrackSegment.getTimeMapping().getSource();
        DecoderTrackSegment decoderTrackSegment = new DecoderTrackSegment(new CMTimeRange(source.getStart(), source.getDuration()), decoderAssetTrack);
        decoderTrackSegment.setScaledDuration(compositionTrackSegment.getScaleDuration());
        return decoderTrackSegment;
    }

    public CMSampleBuffer readSample(CMTime cMTime) {
        return readSample();
    }

    public AudioCompositionDecoderTrack(int i) {
        this(i, (IDecoderFactory) null);
    }

    public AudioCompositionDecoderTrack(int i, IDecoderFactory iDecoderFactory) {
        this.audioTracks = new ArrayList();
        this.decoderTrackList = new ArrayList<>();
        this.audioCompositorMap = new HashMap<>();
        this.volume = 1.0f;
        this.rate = 1.0f;
        this.decoderStarted = false;
        this.decoderThread = new DecoderThread();
        this.mAudioMixer = new AudioMixer();
        this.audioInfo = new AudioInfo();
        this.decoderFactory = iDecoderFactory;
        initAudioDecodeTracks((CMTimeRange) null);
        initAudioMix();
    }
}
