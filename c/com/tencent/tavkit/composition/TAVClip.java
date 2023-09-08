package com.tencent.tavkit.composition;

import com.tencent.tav.asset.Asset;
import com.tencent.tav.asset.CompositionTrack;
import com.tencent.tav.asset.MutableComposition;
import com.tencent.tav.asset.MutableCompositionTrack;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tavkit.ciimage.CIImage;
import com.tencent.tavkit.composition.audio.TAVAudioTransition;
import com.tencent.tavkit.composition.model.TAVAudioConfiguration;
import com.tencent.tavkit.composition.model.TAVTransition;
import com.tencent.tavkit.composition.model.TAVTransitionableAudio;
import com.tencent.tavkit.composition.model.TAVTransitionableVideo;
import com.tencent.tavkit.composition.model.TAVVideoConfiguration;
import com.tencent.tavkit.composition.resource.TAVAssetTrackResource;
import com.tencent.tavkit.composition.resource.TAVEmptyResource;
import com.tencent.tavkit.composition.resource.TAVImageResource;
import com.tencent.tavkit.composition.resource.TAVResource;
import com.tencent.tavkit.composition.resource.TrackInfo;
import com.tencent.tavkit.composition.video.TAVVideoTransition;
import com.tencent.tavkit.utils.CompositionUtils;
import java.util.HashMap;

public class TAVClip implements TAVTransitionableVideo, TAVTransitionableAudio, Cloneable {
    private final String TAG;
    private TAVAudioConfiguration audioConfiguration;
    private HashMap<String, Object> extraTrackInfoMap;
    private TAVResource resource;
    private CMTime startTime;
    private TAVTransition transition;
    private TAVVideoConfiguration videoConfiguration;

    public TAVClip() {
        this.TAG = "TAVClip@" + Integer.toHexString(hashCode());
        this.extraTrackInfoMap = new HashMap<>();
        this.startTime = CMTime.CMTimeZero;
        this.audioConfiguration = new TAVAudioConfiguration();
        this.videoConfiguration = new TAVVideoConfiguration();
    }

    public CompositionTrack audioCompositionTrackForComposition(MutableComposition mutableComposition, int i, boolean z) {
        TrackInfo trackInfoForType = this.resource.trackInfoForType(2, i);
        MutableCompositionTrack mutableCompositionTrack = null;
        if (trackInfoForType == null) {
            return null;
        }
        CMTimeRange cMTimeRange = new CMTimeRange(this.startTime, trackInfoForType.getScaleToDuration());
        if (z) {
            mutableCompositionTrack = CompositionUtils.mutableTrackCompatibleWithTimeRange(mutableComposition, cMTimeRange, 2);
        }
        if (mutableCompositionTrack == null && trackInfoForType.getMediaType() != 0) {
            mutableCompositionTrack = mutableComposition.addMutableTrackWithMediaType(trackInfoForType.getMediaType(), 0);
        }
        if (mutableCompositionTrack != null) {
            CompositionUtils.insertTimeRangeToTrack(trackInfoForType, mutableCompositionTrack, cMTimeRange);
        }
        return mutableCompositionTrack;
    }

    public void fitToSpeed(float f) {
        if (f != 0.0f) {
            this.resource.setScaledDuration(this.resource.getSourceTimeRange().getDuration().multi(1.0f / f));
        }
    }

    public TAVAudioConfiguration getAudioConfiguration() {
        return this.audioConfiguration;
    }

    public TAVAudioTransition getAudioTransition() {
        TAVTransition tAVTransition = this.transition;
        if (tAVTransition != null) {
            return tAVTransition.getAudioTransition();
        }
        return null;
    }

    public CMTime getDuration() {
        return this.resource.getScaledDuration();
    }

    public Object getExtraTrackInfo(String str) {
        return this.extraTrackInfoMap.get(str);
    }

    public TAVResource getResource() {
        return this.resource;
    }

    public CMTime getStartTime() {
        return this.startTime;
    }

    public CMTimeRange getTargetTimeRange() {
        return new CMTimeRange(this.startTime, getDuration());
    }

    public CMTimeRange getTimeRange() {
        return getTargetTimeRange();
    }

    public TAVTransition getTransition() {
        return this.transition;
    }

    public TAVVideoConfiguration getVideoConfiguration() {
        return this.videoConfiguration;
    }

    public TAVVideoTransition getVideoTransition() {
        TAVTransition tAVTransition = this.transition;
        if (tAVTransition != null) {
            return tAVTransition.getVideoTransition();
        }
        return null;
    }

    public int numberOfAudioTracks() {
        return this.resource.tracksForType(2).size();
    }

    public int numberOfVideoTracks() {
        return this.resource.tracksForType(1).size();
    }

    public void putExtraTrackInfo(String str, Object obj) {
        this.extraTrackInfoMap.put(str, obj);
    }

    public void setAudioConfiguration(TAVAudioConfiguration tAVAudioConfiguration) {
        this.audioConfiguration = tAVAudioConfiguration;
    }

    public void setDuration(CMTime cMTime) {
        this.resource.setScaledDuration(cMTime);
    }

    public void setResource(TAVResource tAVResource) {
        this.resource = tAVResource;
    }

    public void setStartTime(CMTime cMTime) {
        this.startTime = cMTime;
        TAVVideoConfiguration tAVVideoConfiguration = this.videoConfiguration;
        if (tAVVideoConfiguration != null) {
            tAVVideoConfiguration.updateTimeRange(getTimeRange());
        }
    }

    public void setTransition(TAVTransition tAVTransition) {
        this.transition = tAVTransition;
    }

    public void setVideoConfiguration(TAVVideoConfiguration tAVVideoConfiguration) {
        this.videoConfiguration = tAVVideoConfiguration;
    }

    public CIImage sourceImageAtTime(CMTime cMTime, CGSize cGSize) {
        return this.resource.imageAtTime(cMTime, cGSize);
    }

    public String toString() {
        return "TAVClip{resource=" + this.resource + ", videoConfiguration=" + this.videoConfiguration + ", startTime=" + this.startTime + ", transition=" + this.transition + ", extraTrackInfoMap=" + this.extraTrackInfoMap + '}';
    }

    public CompositionTrack videoCompositionTrackForComposition(MutableComposition mutableComposition, int i, boolean z) {
        TrackInfo trackInfoForType = this.resource.trackInfoForType(1, i);
        MutableCompositionTrack mutableCompositionTrack = null;
        if (trackInfoForType == null) {
            return null;
        }
        CMTimeRange cMTimeRange = new CMTimeRange(this.startTime, trackInfoForType.getScaleToDuration());
        if (z) {
            mutableCompositionTrack = CompositionUtils.mutableTrackCompatibleWithTimeRange(mutableComposition, cMTimeRange, 1);
        }
        if (mutableCompositionTrack == null && trackInfoForType.getMediaType() != 0) {
            mutableCompositionTrack = mutableComposition.addMutableTrackWithMediaType(trackInfoForType.getMediaType(), -1);
        }
        if (mutableCompositionTrack != null) {
            CompositionUtils.insertTimeRangeToTrack(trackInfoForType, mutableCompositionTrack, cMTimeRange);
        }
        return mutableCompositionTrack;
    }

    public TAVClip clone() {
        TAVClip tAVClip = new TAVClip();
        tAVClip.resource = this.resource.clone();
        tAVClip.videoConfiguration = this.videoConfiguration.clone();
        tAVClip.audioConfiguration = this.audioConfiguration.clone();
        TAVTransition tAVTransition = this.transition;
        if (tAVTransition != null) {
            tAVClip.transition = tAVTransition;
        }
        tAVClip.extraTrackInfoMap = new HashMap<>(this.extraTrackInfoMap);
        return tAVClip;
    }

    public TAVClip(TAVResource tAVResource) {
        this();
        this.resource = tAVResource;
    }

    public TAVClip(Asset asset) {
        this((TAVResource) new TAVAssetTrackResource(asset));
    }

    public TAVClip(CIImage cIImage, CMTime cMTime) {
        this((TAVResource) new TAVImageResource(cIImage, cMTime));
    }

    public TAVClip(CMTime cMTime) {
        this(cMTime, false);
    }

    public TAVClip(CMTime cMTime, boolean z) {
        this((TAVResource) new TAVEmptyResource(cMTime, z));
    }
}
