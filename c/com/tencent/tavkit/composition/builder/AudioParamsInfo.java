package com.tencent.tavkit.composition.builder;

import java.util.HashMap;
import java.util.List;

class AudioParamsInfo {
    public List<AudioInfo> audioInfos;
    public HashMap<String, AudioTransitionInfo> transitionMap;

    public AudioParamsInfo(List<AudioInfo> list, HashMap<String, AudioTransitionInfo> hashMap) {
        this.audioInfos = list;
        this.transitionMap = hashMap;
    }
}
