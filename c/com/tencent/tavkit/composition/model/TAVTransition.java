package com.tencent.tavkit.composition.model;

import com.tencent.tav.core.MutableAudioMixInputParameters;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tavkit.composition.audio.TAVAudioTransition;
import com.tencent.tavkit.composition.video.TAVVideoTransition;

public class TAVTransition {
    private TAVAudioTransition audioTransition;
    private CMTime duration;
    private TAVVideoTransition videoTransition;

    public static class EmptyAudioTransition implements TAVAudioTransition {
        private CMTime duration;
        private String identifier;

        public EmptyAudioTransition(CMTime cMTime) {
            this.duration = cMTime;
        }

        public void applyNextAudioMixInputParameters(MutableAudioMixInputParameters mutableAudioMixInputParameters, CMTimeRange cMTimeRange) {
        }

        public void applyPreviousAudioMixInputParameters(MutableAudioMixInputParameters mutableAudioMixInputParameters, CMTimeRange cMTimeRange) {
        }

        public CMTime getDuration() {
            return this.duration;
        }

        public String getIdentifier() {
            return this.identifier;
        }

        public void setIdentifier(String str) {
            this.identifier = str;
        }
    }

    public static class EmptyVideoTransition implements TAVVideoTransition {
        private CMTime duration;

        public EmptyVideoTransition(CMTime cMTime) {
            this.duration = cMTime;
        }

        public TAVVideoTransition.Filter createFilter() {
            return null;
        }

        public String effectId() {
            return toString();
        }

        public CMTime getDuration() {
            return this.duration;
        }
    }

    public TAVTransition(CMTime cMTime) {
        this.duration = cMTime;
        this.audioTransition = new EmptyAudioTransition(cMTime);
        this.videoTransition = new EmptyVideoTransition(cMTime);
    }

    public TAVAudioTransition getAudioTransition() {
        return this.audioTransition;
    }

    public CMTime getDuration() {
        return this.duration;
    }

    public TAVVideoTransition getVideoTransition() {
        return this.videoTransition;
    }

    public void setAudioTransition(TAVAudioTransition tAVAudioTransition) {
        this.audioTransition = tAVAudioTransition;
    }

    public void setVideoTransition(TAVVideoTransition tAVVideoTransition) {
        this.videoTransition = tAVVideoTransition;
    }
}
