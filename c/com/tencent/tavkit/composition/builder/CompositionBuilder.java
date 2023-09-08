package com.tencent.tavkit.composition.builder;

import com.tencent.tav.asset.CompositionTrack;
import com.tencent.tav.asset.MutableComposition;
import com.tencent.tavkit.composition.audio.TAVAudioTransition;
import com.tencent.tavkit.composition.model.TAVAudio;
import com.tencent.tavkit.composition.model.TAVTransitionableAudio;
import com.tencent.tavkit.composition.model.TAVTransitionableVideo;
import com.tencent.tavkit.composition.model.TAVVideo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class CompositionBuilder {
    private BuilderModel builderModel;
    private MutableComposition composition = new MutableComposition();
    private boolean isAudioTracksMerge;
    private boolean isVideoTracksMerge;

    public CompositionBuilder(BuilderModel builderModel2, boolean z, boolean z2) {
        this.builderModel = builderModel2;
        this.isVideoTracksMerge = z;
        this.isAudioTracksMerge = z2;
    }

    private AudioTransitionInfo getAudioTransitionInfo(List<? extends TAVTransitionableAudio> list, TAVAudioTransition tAVAudioTransition, TAVTransitionableAudio tAVTransitionableAudio, int i) {
        return (i != 0 || list.size() <= 1) ? i == list.size() - 1 ? new AudioTransitionInfo(tAVAudioTransition, (TAVAudioTransition) null) : new AudioTransitionInfo(tAVAudioTransition, tAVTransitionableAudio.getAudioTransition()) : new AudioTransitionInfo((TAVAudioTransition) null, tAVTransitionableAudio.getAudioTransition());
    }

    private void initCompositionWithAudioChannels() {
        for (List next : this.builderModel.getAudioChannels()) {
            TAVAudioTransition tAVAudioTransition = null;
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            for (int i = 0; i < next.size(); i++) {
                TAVTransitionableAudio tAVTransitionableAudio = (TAVTransitionableAudio) next.get(i);
                for (int i2 = 0; i2 < tAVTransitionableAudio.numberOfAudioTracks(); i2++) {
                    CompositionTrack audioCompositionTrackForComposition = tAVTransitionableAudio.audioCompositionTrackForComposition(this.composition, i2, this.isAudioTracksMerge);
                    if (audioCompositionTrackForComposition != null) {
                        arrayList.add(new AudioInfo(audioCompositionTrackForComposition, tAVTransitionableAudio));
                    }
                }
                hashMap.put(String.valueOf(i), getAudioTransitionInfo(next, tAVAudioTransition, tAVTransitionableAudio, i));
                tAVAudioTransition = tAVTransitionableAudio.getAudioTransition();
            }
            this.builderModel.addMainAudioTrackInfo(new AudioParamsInfo(arrayList, hashMap));
        }
    }

    private void initCompositionWithMixAudios(List<? extends TAVAudio> list) {
        if (list != null) {
            for (TAVAudio tAVAudio : list) {
                for (int i = 0; i < tAVAudio.numberOfAudioTracks(); i++) {
                    CompositionTrack audioCompositionTrackForComposition = tAVAudio.audioCompositionTrackForComposition(this.composition, i, this.isAudioTracksMerge);
                    if (audioCompositionTrackForComposition != null) {
                        this.builderModel.addAudioTrackInfo(new AudioMixInfo(audioCompositionTrackForComposition, tAVAudio));
                    }
                }
            }
        }
    }

    private void initCompositionWithOverlays(List<? extends TAVVideo> list) {
        if (list != null) {
            for (TAVVideo tAVVideo : list) {
                for (int i = 0; i < tAVVideo.numberOfVideoTracks(); i++) {
                    CompositionTrack videoCompositionTrackForComposition = tAVVideo.videoCompositionTrackForComposition(this.composition, i, this.isVideoTracksMerge);
                    if (videoCompositionTrackForComposition != null) {
                        this.builderModel.addOverlayTrackInfo(new VideoOverlayInfo(videoCompositionTrackForComposition, tAVVideo));
                    }
                }
            }
        }
    }

    private void initCompositionWithVideoChannels() {
        for (List<? extends TAVTransitionableVideo> it : this.builderModel.getVideoChannels()) {
            ArrayList arrayList = new ArrayList();
            for (TAVTransitionableVideo tAVTransitionableVideo : it) {
                for (int i = 0; i < tAVTransitionableVideo.numberOfVideoTracks(); i++) {
                    CompositionTrack videoCompositionTrackForComposition = tAVTransitionableVideo.videoCompositionTrackForComposition(this.composition, i, this.isVideoTracksMerge);
                    if (videoCompositionTrackForComposition != null) {
                        arrayList.add(new VideoInfo(videoCompositionTrackForComposition, tAVTransitionableVideo));
                    }
                }
            }
            this.builderModel.addMainVideoTrackInfo(arrayList);
        }
    }

    public MutableComposition build() {
        initCompositionWithVideoChannels();
        initCompositionWithAudioChannels();
        initCompositionWithOverlays(this.builderModel.getOverlays());
        initCompositionWithMixAudios(this.builderModel.getMixAudios());
        return this.composition;
    }
}
