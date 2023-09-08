package com.tencent.tavkit.composition.builder;

import com.tencent.tav.asset.CompositionTrack;
import com.tencent.tavkit.composition.model.TAVTransitionableVideo;

class VideoInfo {
    public TAVTransitionableVideo clip;
    public CompositionTrack compositionTrack;

    public VideoInfo(CompositionTrack compositionTrack2, TAVTransitionableVideo tAVTransitionableVideo) {
        this.compositionTrack = compositionTrack2;
        this.clip = tAVTransitionableVideo;
    }
}
