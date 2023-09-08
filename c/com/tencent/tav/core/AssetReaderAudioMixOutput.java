package com.tencent.tav.core;

import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.codec.IDecoderFactory;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMSampleState;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.AudioInfo;
import com.tencent.tav.decoder.IDecoderTrack;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AssetReaderAudioMixOutput extends AssetReaderOutput {
    public static final String TAG = "AssetReaderAudioMixOutput";
    private AudioCompositionDecoderTrack audioCompositionDecoderTrack;
    private Map<String, Object> audioSettings;
    private ArrayList<AssetTrack> audioTracks;
    private boolean decoderStarted = false;

    public AssetReaderAudioMixOutput(ArrayList<AssetTrack> arrayList, Map<String, Object> map, IDecoderFactory iDecoderFactory) {
        this.audioTracks = arrayList;
        this.audioSettings = map;
        this.audioCompositionDecoderTrack = new AudioCompositionDecoderTrack(arrayList, 2, iDecoderFactory);
    }

    public Map<String, Object> getAudioSettings() {
        return this.audioSettings;
    }

    public ArrayList<AssetTrack> getAudioTracks() {
        return this.audioTracks;
    }

    public void markConfigurationAsFinal() {
    }

    public CMSampleBuffer nextSampleBuffer(boolean z) {
        CMSampleBuffer readSample = this.audioCompositionDecoderTrack.readSample();
        return readSample.getTime().smallThan(this.timeRange.getStart()) ? readSample : readSample.getTime().smallThan(this.timeRange.getEnd()) ? new CMSampleBuffer(readSample.getTime().sub(this.timeRange.getStart()), readSample.getSampleByteBuffer(), readSample.isNewFrame()) : new CMSampleBuffer(CMSampleState.fromError(-1));
    }

    public void release() {
        AudioCompositionDecoderTrack audioCompositionDecoderTrack2 = this.audioCompositionDecoderTrack;
        if (audioCompositionDecoderTrack2 != null) {
            audioCompositionDecoderTrack2.release();
        }
    }

    public void resetForReadingTimeRanges(List<CMTimeRange> list) {
    }

    public void setAudioInfo(AudioInfo audioInfo) {
        this.audioCompositionDecoderTrack.setAudioInfo(audioInfo);
    }

    public void setAudioMix(AudioMix audioMix) {
        AudioCompositionDecoderTrack audioCompositionDecoderTrack2 = this.audioCompositionDecoderTrack;
        if (audioCompositionDecoderTrack2 != null) {
            audioCompositionDecoderTrack2.setAudioMix(audioMix);
        }
    }

    public void start(IContextCreate iContextCreate, CMTimeRange cMTimeRange) {
        super.start(iContextCreate, cMTimeRange);
        AudioCompositionDecoderTrack audioCompositionDecoderTrack2 = this.audioCompositionDecoderTrack;
        if (audioCompositionDecoderTrack2 != null && !this.decoderStarted) {
            audioCompositionDecoderTrack2.start((IDecoderTrack.SurfaceCreator) null);
            this.audioCompositionDecoderTrack.seekTo(cMTimeRange.getStart(), false, true);
            this.decoderStarted = true;
        }
    }
}
