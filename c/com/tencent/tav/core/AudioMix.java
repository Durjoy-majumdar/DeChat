package com.tencent.tav.core;

import com.tencent.tav.core.AudioMixInputParameters;
import java.util.List;

public class AudioMix<InputParameters extends AudioMixInputParameters> {
    public List<InputParameters> inputParameters;

    public AudioMix(List<InputParameters> list) {
        this.inputParameters = list;
    }

    public List<InputParameters> getInputParameters() {
        return this.inputParameters;
    }

    public InputParameters getInputParametersWithTrackID(int i) {
        for (InputParameters inputparameters : this.inputParameters) {
            if (inputparameters.getTrackID() == i) {
                return inputparameters;
            }
        }
        return null;
    }

    public void release() {
        for (InputParameters inputparameters : this.inputParameters) {
            if (!(inputparameters == null || inputparameters.getAudioTapProcessor() == null)) {
                inputparameters.getAudioTapProcessor().release();
            }
        }
    }

    public String toString() {
        return "AudioMix{inputParameters=" + this.inputParameters + '}';
    }
}
