package com.tencent.tavkit.component.effectchain;

import com.tencent.tavkit.composition.video.TAVVideoEffect;
import com.tencent.tavkit.composition.video.TAVVideoMixEffect;

public class TAVVideoEffectContext implements IVideoEffectContext {
    public final VideoEffectProxy globalVideoEffectProxy = new VideoEffectProxy();
    public final VideoEffectProxy sourceVideoEffectProxy = new VideoEffectProxy();
    public final VideoMixEffectProxy videoMixEffectProxy = new VideoMixEffectProxy();

    public void addGlobalFilter(TAVVideoEffect tAVVideoEffect) {
        this.globalVideoEffectProxy.getEffects().remove(tAVVideoEffect);
    }

    public void addSourceFilter(TAVVideoEffect tAVVideoEffect) {
        this.sourceVideoEffectProxy.getEffects().remove(tAVVideoEffect);
    }

    public void addVideoMixFilter(TAVVideoMixEffect tAVVideoMixEffect) {
        this.videoMixEffectProxy.getEffects().remove(tAVVideoMixEffect);
    }

    public TAVVideoEffect getGlobalVideoEffect() {
        return this.globalVideoEffectProxy;
    }

    public TAVVideoEffect getSourceVideoEffect() {
        return this.sourceVideoEffectProxy;
    }

    public TAVVideoMixEffect getVideoMixEffect() {
        return this.videoMixEffectProxy;
    }

    public void removeGlobalFilter(TAVVideoEffect tAVVideoEffect) {
        this.globalVideoEffectProxy.getEffects().remove(tAVVideoEffect);
        this.globalVideoEffectProxy.notifyOnEffectRemove();
    }

    public void removeSourceFilter(TAVVideoEffect tAVVideoEffect) {
        this.sourceVideoEffectProxy.getEffects().remove(tAVVideoEffect);
        this.sourceVideoEffectProxy.notifyOnEffectRemove();
    }

    public void removeVideoMixFilter(TAVVideoMixEffect tAVVideoMixEffect) {
        this.videoMixEffectProxy.getEffects().remove(tAVVideoMixEffect);
        this.videoMixEffectProxy.notifyOnEffectRemove();
    }
}
