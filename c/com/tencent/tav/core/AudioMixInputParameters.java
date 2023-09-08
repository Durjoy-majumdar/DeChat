package com.tencent.tav.core;

import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import java.util.ArrayList;
import java.util.Iterator;

public class AudioMixInputParameters {
    public AudioTapProcessor audioTapProcessor;
    public String audioTimePitchAlgorithm;
    public int trackID;
    public ArrayList<VolumeRange> volumeRanges = new ArrayList<>();

    public static class VolumeRange {
        public float endVolume;
        public float startVolume;
        public CMTimeRange timeRange;
    }

    public AudioMixInputParameters(int i, String str) {
        this.trackID = i;
        this.audioTimePitchAlgorithm = str;
    }

    public boolean containsTime(CMTime cMTime) {
        Iterator<VolumeRange> it = this.volumeRanges.iterator();
        while (it.hasNext()) {
            if (it.next().timeRange.containsTime(cMTime)) {
                return true;
            }
        }
        return false;
    }

    public AudioTapProcessor getAudioTapProcessor() {
        return this.audioTapProcessor;
    }

    public String getAudioTimePitchAlgorithm() {
        return this.audioTimePitchAlgorithm;
    }

    public int getTrackID() {
        return this.trackID;
    }

    public float getVolumeAtTime(CMTime cMTime) {
        VolumeRange volumeRange;
        long timeUs = cMTime.getTimeUs();
        Iterator<VolumeRange> it = this.volumeRanges.iterator();
        while (true) {
            if (!it.hasNext()) {
                volumeRange = null;
                break;
            }
            volumeRange = it.next();
            if (timeUs >= volumeRange.timeRange.getStart().getTimeUs() && timeUs < volumeRange.timeRange.getEnd().getTimeUs()) {
                break;
            }
        }
        if (volumeRange == null) {
            return 1.0f;
        }
        long timeUs2 = timeUs - volumeRange.timeRange.getStart().getTimeUs();
        float f = volumeRange.startVolume;
        return f + ((volumeRange.endVolume - f) * ((((float) timeUs2) * 1.0f) / ((float) volumeRange.timeRange.getDuration().getTimeUs())));
    }

    public VolumeRange getVolumeRampAtTimeRange(CMTime cMTime) {
        Iterator<VolumeRange> it = this.volumeRanges.iterator();
        while (it.hasNext()) {
            VolumeRange next = it.next();
            if (next.timeRange.containsTime(cMTime)) {
                return next;
            }
        }
        return null;
    }

    public String toString() {
        return "AudioMixInputParameters{trackID=" + this.trackID + ", audioTimePitchAlgorithm='" + this.audioTimePitchAlgorithm + '\'' + ", audioTapProcessor=" + this.audioTapProcessor + ", volumeRanges=" + this.volumeRanges + '}';
    }
}
