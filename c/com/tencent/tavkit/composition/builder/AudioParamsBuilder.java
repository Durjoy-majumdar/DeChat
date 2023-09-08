package com.tencent.tavkit.composition.builder;

import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tavkit.composition.audio.TAVAudioMixInputParameters;
import com.tencent.tavkit.composition.audio.TAVAudioTapProcessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class AudioParamsBuilder {
    private HashMap<Integer, TAVAudioMixInputParameters> audioMixInputParametersHashMap = new HashMap<>();
    private final BuilderModel builderModel;

    public AudioParamsBuilder(BuilderModel builderModel2) {
        this.builderModel = builderModel2;
    }

    private void buildAudioParametersByTrackInfo(AudioParamsInfo audioParamsInfo) {
        for (AudioInfo next : audioParamsInfo.audioInfos) {
            int trackID = next.compositionTrack.getTrackID();
            TAVAudioMixInputParameters tAVAudioMixInputParameters = this.audioMixInputParametersHashMap.get(Integer.valueOf(trackID));
            if (tAVAudioMixInputParameters == null) {
                tAVAudioMixInputParameters = new TAVAudioMixInputParameters(next.compositionTrack);
                this.audioMixInputParametersHashMap.put(Integer.valueOf(trackID), tAVAudioMixInputParameters);
            }
            tAVAudioMixInputParameters.addAudioConfiguration(new CMTimeRange(next.audio.getStartTime(), next.audio.getDuration()), next.audio.getAudioConfiguration());
            tAVAudioMixInputParameters.setAudioTapProcessor(new TAVAudioTapProcessor(tAVAudioMixInputParameters.getAudioConfigurationSegmentList()));
        }
    }

    private void buildBgAudioInputParameters() {
        for (AudioMixInfo next : this.builderModel.getAudioTrackInfo()) {
            int trackID = next.track.getTrackID();
            TAVAudioMixInputParameters tAVAudioMixInputParameters = this.audioMixInputParametersHashMap.get(Integer.valueOf(trackID));
            if (tAVAudioMixInputParameters == null) {
                tAVAudioMixInputParameters = new TAVAudioMixInputParameters(next.track);
                this.audioMixInputParametersHashMap.put(Integer.valueOf(trackID), tAVAudioMixInputParameters);
            }
            tAVAudioMixInputParameters.addAudioConfiguration(new CMTimeRange(next.audio.getStartTime(), next.audio.getDuration()), next.audio.getAudioConfiguration());
            tAVAudioMixInputParameters.setAudioTapProcessor(new TAVAudioTapProcessor(tAVAudioMixInputParameters.getAudioConfigurationSegmentList()));
        }
    }

    private void buildMainAudioInputParameters() {
        List<AudioParamsInfo> mainAudioTrackInfo = this.builderModel.getMainAudioTrackInfo();
        for (int i = 0; i < mainAudioTrackInfo.size(); i++) {
            buildAudioParametersByTrackInfo(mainAudioTrackInfo.get(i));
        }
    }

    public List<TAVAudioMixInputParameters> build() {
        buildMainAudioInputParameters();
        buildBgAudioInputParameters();
        return new ArrayList(this.audioMixInputParametersHashMap.values());
    }
}
