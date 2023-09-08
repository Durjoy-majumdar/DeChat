package com.tencent.tavkit.composition.builder;

import com.tencent.tav.asset.CompositionTrack;
import com.tencent.tav.asset.CompositionTrackSegment;
import com.tencent.tavkit.composition.model.TAVTransitionableAudio;

class AudioInfo {
    public TAVTransitionableAudio audio;
    public CompositionTrack compositionTrack;

    public AudioInfo(CompositionTrack compositionTrack2, TAVTransitionableAudio tAVTransitionableAudio) {
        this.compositionTrack = compositionTrack2;
        this.audio = tAVTransitionableAudio;
    }

    public CompositionTrackSegment getCurrentSegmentBy() {
        for (int i = 0; i < this.compositionTrack.getSegments().size(); i++) {
            CompositionTrackSegment compositionTrackSegment = this.compositionTrack.getSegments().get(i);
            if (compositionTrackSegment.getTimeMapping().getTarget().equals(this.audio.getTimeRange())) {
                return compositionTrackSegment;
            }
        }
        return null;
    }
}
