package com.tencent.tav.core;

import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.core.AudioMixInputParameters;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import java.util.Iterator;

public class MutableAudioMixInputParameters extends AudioMixInputParameters {
    public MutableAudioMixInputParameters(AssetTrack assetTrack, String str) {
        super(assetTrack.getTrackID(), str);
    }

    public void setAudioTapProcessor(AudioTapProcessor audioTapProcessor) {
        this.audioTapProcessor = audioTapProcessor;
    }

    public void setAudioTimePitchAlgorithm(String str) {
        this.audioTimePitchAlgorithm = str;
    }

    public void setTrackID(int i) {
        this.trackID = i;
    }

    public void setVolumeAtTime(float f, CMTime cMTime) {
    }

    public void setVolumeForTimeRange(float f) {
        Iterator<AudioMixInputParameters.VolumeRange> it = this.volumeRanges.iterator();
        while (it.hasNext()) {
            AudioMixInputParameters.VolumeRange next = it.next();
            next.startVolume = f;
            next.endVolume = f;
        }
    }

    public void setVolumeRampForTimeRange(float f, float f2, CMTimeRange cMTimeRange) {
        AudioMixInputParameters.VolumeRange volumeRange = new AudioMixInputParameters.VolumeRange();
        volumeRange.timeRange = cMTimeRange;
        volumeRange.startVolume = f;
        volumeRange.endVolume = f2;
        this.volumeRanges.add(0, volumeRange);
    }

    public MutableAudioMixInputParameters(AssetTrack assetTrack) {
        super(assetTrack.getTrackID(), "");
    }

    public void setVolumeForTimeRange(float f, CMTimeRange cMTimeRange) {
        setVolumeRampForTimeRange(f, f, cMTimeRange);
    }
}
