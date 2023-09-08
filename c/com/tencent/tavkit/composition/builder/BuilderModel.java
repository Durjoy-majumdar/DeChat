package com.tencent.tavkit.composition.builder;

import com.tencent.tav.core.composition.VideoComposition;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tavkit.composition.TAVComposition;
import com.tencent.tavkit.composition.model.TAVAudio;
import com.tencent.tavkit.composition.model.TAVTransitionableAudio;
import com.tencent.tavkit.composition.model.TAVTransitionableVideo;
import com.tencent.tavkit.composition.model.TAVVideo;
import com.tencent.tavkit.composition.video.TAVVideoEffect;
import com.tencent.tavkit.composition.video.TAVVideoMixEffect;
import java.util.ArrayList;
import java.util.List;

class BuilderModel {
    private final List<AudioMixInfo> audioTrackInfo = new ArrayList();
    private final List<AudioParamsInfo> mainAudioTrackInfo = new ArrayList();
    private final List<List<VideoInfo>> mainVideoTrackInfo = new ArrayList();
    private final List<VideoOverlayInfo> overlayTrackInfo = new ArrayList();
    private final TAVComposition tavComposition;

    public BuilderModel(TAVComposition tAVComposition) {
        this.tavComposition = tAVComposition;
    }

    public void addAudioTrackInfo(AudioMixInfo audioMixInfo) {
        this.audioTrackInfo.add(audioMixInfo);
    }

    public void addMainAudioTrackInfo(AudioParamsInfo audioParamsInfo) {
        this.mainAudioTrackInfo.add(audioParamsInfo);
    }

    public void addMainVideoTrackInfo(List<VideoInfo> list) {
        this.mainVideoTrackInfo.add(list);
    }

    public void addOverlayTrackInfo(VideoOverlayInfo videoOverlayInfo) {
        this.overlayTrackInfo.add(videoOverlayInfo);
    }

    public List<List<? extends TAVTransitionableAudio>> getAudioChannels() {
        return this.tavComposition.getAudioChannels();
    }

    public List<AudioMixInfo> getAudioTrackInfo() {
        return this.audioTrackInfo;
    }

    public int getBackgroundColor() {
        return this.tavComposition.getBackgroundColor();
    }

    public TAVVideoEffect getGlobalVideoEffect() {
        return this.tavComposition.getGlobalVideoEffect();
    }

    public List<AudioParamsInfo> getMainAudioTrackInfo() {
        return this.mainAudioTrackInfo;
    }

    public List<List<VideoInfo>> getMainVideoTrackInfo() {
        return this.mainVideoTrackInfo;
    }

    public List<? extends TAVAudio> getMixAudios() {
        return this.tavComposition.getAudios();
    }

    public List<VideoOverlayInfo> getOverlayTrackInfo() {
        return this.overlayTrackInfo;
    }

    public List<? extends TAVVideo> getOverlays() {
        return this.tavComposition.getOverlays();
    }

    public VideoComposition.RenderLayoutMode getRenderLayoutMode() {
        return this.tavComposition.getRenderLayoutMode();
    }

    public CGSize getRenderSize() {
        return this.tavComposition.getRenderSize();
    }

    public TAVComposition getTavComposition() {
        return this.tavComposition;
    }

    public List<List<? extends TAVTransitionableVideo>> getVideoChannels() {
        return this.tavComposition.getVideoChannels();
    }

    public TAVVideoMixEffect getVideoMixEffect() {
        return this.tavComposition.getVideoMixEffect();
    }
}
