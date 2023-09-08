package com.tencent.tavkit.composition.video;

import com.tencent.tav.core.composition.VideoCompositionInstruction;
import com.tencent.tav.coremedia.CMTimeRange;
import java.util.ArrayList;
import java.util.List;

public class TAVVideoCompositionInstruction extends VideoCompositionInstruction {
    private static final String TAG = "TAVVideoCompositionInst";
    private List<List<TAVVideoCompositionLayerInstruction>> channelLayers = new ArrayList();
    private TAVVideoEffect globalVideoEffect;
    private List<TAVVideoCompositionLayerInstruction> overlayLayers = new ArrayList();
    private TAVVideoEffect sourceVideoEffect;
    private final CMTimeRange timeRange;
    private TAVVideoMixEffect videoMixEffect;

    public TAVVideoCompositionInstruction(List<Integer> list, CMTimeRange cMTimeRange) {
        this.requiredSourceTrackIDs = list;
        this.timeRange = cMTimeRange;
        this.enablePostProcessing = false;
        this.backgroundColor = -16777216;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public List<List<TAVVideoCompositionLayerInstruction>> getChannelLayers() {
        return this.channelLayers;
    }

    public TAVVideoEffect getGlobalVideoEffect() {
        return this.globalVideoEffect;
    }

    public List<TAVVideoCompositionLayerInstruction> getLayerInstructions() {
        ArrayList arrayList = new ArrayList();
        for (List<TAVVideoCompositionLayerInstruction> addAll : this.channelLayers) {
            arrayList.addAll(addAll);
        }
        arrayList.addAll(this.overlayLayers);
        return arrayList;
    }

    public List<TAVVideoCompositionLayerInstruction> getOverlayLayers() {
        return this.overlayLayers;
    }

    public int getPassthroughTrackID() {
        return -1;
    }

    public TAVVideoEffect getSourceVideoEffect() {
        return this.sourceVideoEffect;
    }

    public CMTimeRange getTimeRange() {
        return this.timeRange;
    }

    public TAVVideoMixEffect getVideoMixEffect() {
        return this.videoMixEffect;
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public void setChannelLayers(List<List<TAVVideoCompositionLayerInstruction>> list) {
        if (list != null) {
            this.channelLayers = list;
        }
    }

    public void setEnablePostProcessing(boolean z) {
        this.enablePostProcessing = z;
    }

    public void setGlobalVideoEffect(TAVVideoEffect tAVVideoEffect) {
        this.globalVideoEffect = tAVVideoEffect;
    }

    public void setOverlayLayers(List<TAVVideoCompositionLayerInstruction> list) {
        if (list != null) {
            this.overlayLayers = list;
            this.requiredSourceTrackIDs.clear();
            for (TAVVideoCompositionLayerInstruction trackID : list) {
                this.requiredSourceTrackIDs.add(Integer.valueOf(trackID.getTrackID()));
            }
        }
    }

    public void setSourceVideoEffect(TAVVideoEffect tAVVideoEffect) {
        this.sourceVideoEffect = tAVVideoEffect;
    }

    public void setVideoMixEffect(TAVVideoMixEffect tAVVideoMixEffect) {
        this.videoMixEffect = tAVVideoMixEffect;
    }

    public String toString() {
        return "TAVVideoCompositionInstruction{timeRange=" + this.timeRange.toSimpleString() + ", backgroundColor=" + this.backgroundColor + ", overlayLayers=" + this.overlayLayers + '}';
    }
}
