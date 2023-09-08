package com.tencent.tavkit.composition.audio;

import com.tencent.tav.core.AudioTapProcessor;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.decoder.AudioInfo;
import com.tencent.tavkit.composition.model.TAVAudioConfiguration;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;

public class TAVAudioTapProcessor implements AudioTapProcessor {
    private List<TAVAudioConfigurationSegment> audioConfigurationSegmentList;
    private HashMap<String, AudioTapProcessor> audioTapProcessorHashMap = new HashMap<>();
    private AudioInfo destAudioInfo;

    public TAVAudioTapProcessor(List<TAVAudioConfigurationSegment> list) {
        this.audioConfigurationSegmentList = list;
    }

    public AudioInfo getDestAudioInfo() {
        return this.destAudioInfo;
    }

    public ByteBuffer processAudioPCM(CMTime cMTime, ByteBuffer byteBuffer, AudioInfo audioInfo) {
        this.destAudioInfo = audioInfo;
        for (TAVAudioConfigurationSegment next : this.audioConfigurationSegmentList) {
            if (next != null && next.compositionTimeRange.containsTime(cMTime)) {
                TAVAudioConfiguration tAVAudioConfiguration = next.audioConfiguration;
                if (tAVAudioConfiguration.getNodes() != null) {
                    for (TAVAudioProcessorNode next2 : tAVAudioConfiguration.getNodes()) {
                        String identifier = next2.getIdentifier();
                        AudioTapProcessor audioTapProcessor = this.audioTapProcessorHashMap.get(identifier);
                        if (audioTapProcessor == null) {
                            audioTapProcessor = next2.createAudioProcessor();
                            this.audioTapProcessorHashMap.put(identifier, audioTapProcessor);
                        }
                        if (audioTapProcessor != null) {
                            byteBuffer = audioTapProcessor.processAudioPCM(cMTime, byteBuffer, audioInfo);
                            this.destAudioInfo = audioTapProcessor.getDestAudioInfo();
                        }
                    }
                }
            }
        }
        return byteBuffer;
    }

    public void release() {
        for (AudioTapProcessor release : this.audioTapProcessorHashMap.values()) {
            release.release();
        }
    }

    public String toString() {
        return "TAVAudioTapProcessor{audioConfigurationSegmentList=" + this.audioConfigurationSegmentList + ", audioTapProcessorHashMap=" + this.audioTapProcessorHashMap + '}';
    }
}
