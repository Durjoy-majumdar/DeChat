package com.tencent.tavkit.composition.audio;

import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tavkit.composition.model.TAVAudioConfiguration;

public class TAVAudioConfigurationSegment {
    public final TAVAudioConfiguration audioConfiguration;
    public final CMTimeRange compositionTimeRange;

    public TAVAudioConfigurationSegment(CMTimeRange cMTimeRange, TAVAudioConfiguration tAVAudioConfiguration) {
        this.audioConfiguration = tAVAudioConfiguration;
        this.compositionTimeRange = cMTimeRange;
    }

    public String toString() {
        return "TAVAudioConfigurationSegment{compositionTimeRange=" + this.compositionTimeRange.toSimpleString() + ", audioConfiguration=" + this.audioConfiguration + '}';
    }
}
