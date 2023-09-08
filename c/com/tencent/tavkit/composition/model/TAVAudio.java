package com.tencent.tavkit.composition.model;

public interface TAVAudio extends TAVCompositionTimeRange, TAVAudioCompositionTrack {
    TAVAudioConfiguration getAudioConfiguration();
}
