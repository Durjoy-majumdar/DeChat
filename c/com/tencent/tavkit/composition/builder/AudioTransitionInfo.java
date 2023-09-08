package com.tencent.tavkit.composition.builder;

import com.tencent.tavkit.composition.audio.TAVAudioTransition;

class AudioTransitionInfo {
    public TAVAudioTransition next;
    public TAVAudioTransition prev;

    public AudioTransitionInfo(TAVAudioTransition tAVAudioTransition, TAVAudioTransition tAVAudioTransition2) {
        this.prev = tAVAudioTransition;
        this.next = tAVAudioTransition2;
    }
}
