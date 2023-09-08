package com.tencent.tavkit.composition.builder;

import com.tencent.tav.asset.Asset;
import com.tencent.tav.core.AudioMix;
import com.tencent.tav.core.AudioMixInputParameters;
import com.tencent.tav.core.MutableAudioMix;
import com.tencent.tav.core.composition.MutableVideoComposition;
import com.tencent.tav.core.composition.VideoComposition;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tavkit.composition.TAVComposition;
import com.tencent.tavkit.composition.TAVSource;
import com.tencent.tavkit.composition.audio.TAVAudioMixInputParameters;
import com.tencent.tavkit.composition.model.TAVTransitionableAudio;
import com.tencent.tavkit.composition.model.TAVTransitionableVideo;
import com.tencent.tavkit.composition.video.TAVVideoCompositing;
import com.tencent.tavkit.utils.CompositionUtils;
import java.util.List;

public class TAVCompositionBuilder {
    private static final String TAG = "TAVCompositionBuilder";
    private final BuilderModel builderModel;
    private boolean isAudioTracksMerge = true;
    private boolean isReloadChannels = true;
    private boolean isVideoTracksMerge = true;

    public TAVCompositionBuilder(TAVComposition tAVComposition) {
        this.builderModel = new BuilderModel(tAVComposition);
    }

    private AudioMix<? extends AudioMixInputParameters> buildAudioMix() {
        List<TAVAudioMixInputParameters> build = new AudioParamsBuilder(this.builderModel).build();
        if (build.size() == 0) {
            return null;
        }
        return new MutableAudioMix(build);
    }

    private Asset buildComposition() {
        if (this.isReloadChannels) {
            reloadChannels();
        }
        return new CompositionBuilder(this.builderModel, this.isVideoTracksMerge, this.isAudioTracksMerge).build();
    }

    private VideoComposition buildVideoComposition() {
        MutableVideoComposition mutableVideoComposition = new MutableVideoComposition();
        mutableVideoComposition.setFrameDuration(new CMTime(1, 30));
        mutableVideoComposition.setRenderSize(this.builderModel.getRenderSize());
        mutableVideoComposition.setRenderLayoutMode(this.builderModel.getRenderLayoutMode());
        mutableVideoComposition.setCustomVideoCompositorClass(TAVVideoCompositing.class);
        mutableVideoComposition.setInstructions(new VideoInstructionsBuilder(this.builderModel).build());
        return mutableVideoComposition;
    }

    private void reloadChannels() {
        for (List<? extends TAVTransitionableVideo> reloadVideoStartTimeWithTransitionableVideo : this.builderModel.getVideoChannels()) {
            CompositionUtils.reloadVideoStartTimeWithTransitionableVideo(reloadVideoStartTimeWithTransitionableVideo);
        }
        Logger.m144641d(TAG, "buildComposition: reloadVideoChannels = " + this.builderModel.getVideoChannels());
        for (List<? extends TAVTransitionableAudio> reloadAudioStartTimeWithTransitionableAudio : this.builderModel.getAudioChannels()) {
            CompositionUtils.reloadAudioStartTimeWithTransitionableAudio(reloadAudioStartTimeWithTransitionableAudio);
        }
        Logger.m144641d(TAG, "buildComposition: reloadAudioChannels = " + this.builderModel.getAudioChannels());
    }

    public TAVSource buildSource() {
        Logger.m144646i(TAG, "buildSource: begin, tavComposition = " + this.builderModel.getTavComposition());
        TAVSource tAVSource = new TAVSource();
        tAVSource.setAsset(buildComposition());
        tAVSource.setVideoComposition(buildVideoComposition());
        tAVSource.setAudioMix(buildAudioMix());
        Logger.m144646i(TAG, "buildSource: end, return source = " + tAVSource);
        return tAVSource;
    }

    public void setAudioTracksMerge(boolean z) {
        this.isAudioTracksMerge = z;
    }

    public void setReloadChannels(boolean z) {
        this.isReloadChannels = z;
    }

    public void setVideoTracksMerge(boolean z) {
        this.isVideoTracksMerge = z;
    }
}
