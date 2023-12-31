package com.tencent.tavkit.composition.builder;

import com.tencent.tav.asset.CompositionTrack;
import com.tencent.tavkit.composition.model.TAVAudio;

class AudioMixInfo {
    public TAVAudio audio;
    public CompositionTrack track;

    public AudioMixInfo(CompositionTrack compositionTrack, TAVAudio tAVAudio) {
        this.track = compositionTrack;
        this.audio = tAVAudio;
    }
}
