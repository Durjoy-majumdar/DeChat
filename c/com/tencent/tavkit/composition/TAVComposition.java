package com.tencent.tavkit.composition;

import com.tencent.tav.core.composition.VideoComposition;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tavkit.component.effectchain.IVideoEffectContext;
import com.tencent.tavkit.composition.model.TAVAudio;
import com.tencent.tavkit.composition.model.TAVTransitionableAudio;
import com.tencent.tavkit.composition.model.TAVTransitionableVideo;
import com.tencent.tavkit.composition.model.TAVVideo;
import com.tencent.tavkit.composition.video.TAVVideoEffect;
import com.tencent.tavkit.composition.video.TAVVideoMixEffect;
import com.tencent.tavkit.utils.ListUtils;
import java.util.ArrayList;
import java.util.List;

public class TAVComposition {
    private List<List<? extends TAVTransitionableAudio>> audioChannels;
    private List<? extends TAVAudio> audios;
    private int backgroundColor;
    private CMTime frameDuration;
    private TAVVideoEffect globalVideoEffect;
    private List<? extends TAVVideo> overlays;
    private VideoComposition.RenderLayoutMode renderLayoutMode;
    private CGSize renderSize;
    private TAVVideoEffect sourceVideoEffect;
    private List<List<? extends TAVTransitionableVideo>> videoChannels;
    private TAVVideoMixEffect videoMixEffect;

    public TAVComposition(TAVClip... tAVClipArr) {
        this((List<TAVClip>) ListUtils.listWithObjects(tAVClipArr));
    }

    public void addAudioChannel(List<? extends TAVTransitionableAudio> list) {
        if (this.audioChannels == null) {
            this.audioChannels = new ArrayList();
        }
        this.audioChannels.add(new ArrayList(list));
    }

    public void addVideoChannel(List<? extends TAVTransitionableVideo> list) {
        if (this.videoChannels == null) {
            this.videoChannels = new ArrayList();
        }
        this.videoChannels.add(new ArrayList(list));
    }

    public void attachVideoEffectChain(IVideoEffectContext iVideoEffectContext) {
        this.sourceVideoEffect = iVideoEffectContext.getSourceVideoEffect();
        this.videoMixEffect = iVideoEffectContext.getVideoMixEffect();
        this.globalVideoEffect = iVideoEffectContext.getGlobalVideoEffect();
    }

    public List<List<? extends TAVTransitionableAudio>> getAudioChannels() {
        return this.audioChannels;
    }

    public List<? extends TAVAudio> getAudios() {
        return this.audios;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public CMTime getDuration() {
        List<List<? extends TAVTransitionableVideo>> list = this.videoChannels;
        if (list == null) {
            return CMTime.CMTimeZero;
        }
        int size = list.size();
        CMTime cMTime = CMTime.CMTimeZero;
        CMTime cMTime2 = cMTime;
        for (int i = 0; i < size; i++) {
            List<TAVTransitionableVideo> list2 = this.videoChannels.get(i);
            if (list2 != null) {
                for (TAVTransitionableVideo tAVTransitionableVideo : list2) {
                    if (tAVTransitionableVideo != null) {
                        cMTime2 = cMTime2.add(tAVTransitionableVideo.getDuration());
                    }
                }
                if (cMTime2.bigThan(cMTime)) {
                    cMTime = cMTime2;
                }
                cMTime2 = CMTime.CMTimeZero;
            }
        }
        return cMTime;
    }

    public CMTime getFrameDuration() {
        return this.frameDuration;
    }

    public TAVVideoEffect getGlobalVideoEffect() {
        return this.globalVideoEffect;
    }

    public List<? extends TAVVideo> getOverlays() {
        return this.overlays;
    }

    public VideoComposition.RenderLayoutMode getRenderLayoutMode() {
        return this.renderLayoutMode;
    }

    public CGSize getRenderSize() {
        return this.renderSize;
    }

    public TAVVideoEffect getSourceVideoEffect() {
        return this.sourceVideoEffect;
    }

    public List<List<? extends TAVTransitionableVideo>> getVideoChannels() {
        return this.videoChannels;
    }

    public TAVVideoMixEffect getVideoMixEffect() {
        return this.videoMixEffect;
    }

    public void setAudioChannels(List<List<? extends TAVTransitionableAudio>> list) {
        this.audioChannels = list;
    }

    public void setAudios(List<? extends TAVAudio> list) {
        this.audios = list;
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public void setFrameDuration(CMTime cMTime) {
        this.frameDuration = cMTime;
    }

    public void setGlobalVideoEffect(TAVVideoEffect tAVVideoEffect) {
        this.globalVideoEffect = tAVVideoEffect;
    }

    public void setOverlays(List<? extends TAVVideo> list) {
        this.overlays = list;
    }

    public void setRenderLayoutMode(VideoComposition.RenderLayoutMode renderLayoutMode2) {
        this.renderLayoutMode = renderLayoutMode2;
    }

    public void setRenderSize(CGSize cGSize) {
        this.renderSize = cGSize;
    }

    public void setSourceVideoEffect(TAVVideoEffect tAVVideoEffect) {
        this.sourceVideoEffect = tAVVideoEffect;
    }

    public void setVideoChannels(List<List<? extends TAVTransitionableVideo>> list) {
        this.videoChannels = list;
    }

    public void setVideoMixEffect(TAVVideoMixEffect tAVVideoMixEffect) {
        this.videoMixEffect = tAVVideoMixEffect;
    }

    public String toString() {
        return "TAVComposition{\nrenderSize=" + this.renderSize + ", renderLayoutMode=" + this.renderLayoutMode + ", backgroundColor=" + this.backgroundColor + ", frameDuration=" + this.frameDuration + "\nvideoChannels=" + this.videoChannels + "\naudioChannels=" + this.audioChannels + "\noverlays=" + this.overlays + "\naudios=" + this.audios + '}';
    }

    public TAVComposition(List<TAVClip> list) {
        this(list, list);
    }

    public TAVComposition(List<? extends TAVTransitionableVideo> list, List<? extends TAVTransitionableAudio> list2) {
        this();
        addVideoChannel(list);
        addAudioChannel(list2);
    }

    public TAVComposition() {
        this.videoChannels = new ArrayList();
        this.audioChannels = new ArrayList();
        this.backgroundColor = -16777216;
    }
}
