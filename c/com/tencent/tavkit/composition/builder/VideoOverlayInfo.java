package com.tencent.tavkit.composition.builder;

import com.tencent.tav.asset.CompositionTrack;
import com.tencent.tavkit.composition.model.TAVVideo;
import com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction;

class VideoOverlayInfo {
    public CompositionTrack track;
    public TAVVideo video;

    public VideoOverlayInfo(CompositionTrack compositionTrack, TAVVideo tAVVideo) {
        this.track = compositionTrack;
        this.video = tAVVideo;
    }

    public TAVVideoCompositionLayerInstruction convertToLayerInstruction() {
        TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction = new TAVVideoCompositionLayerInstruction(this.track.getTrackID(), this.video.getVideoConfiguration(), this.video);
        tAVVideoCompositionLayerInstruction.setPreferredTransform(this.track.getPreferredTransform());
        tAVVideoCompositionLayerInstruction.setTimeRange(this.video.getTimeRange());
        return tAVVideoCompositionLayerInstruction;
    }
}
