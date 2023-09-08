package com.tencent.tav.core.composition;

import com.tencent.tav.core.compositing.IVideoCompositionInstruction;
import com.tencent.tav.coremedia.CMTimeRange;
import java.util.ArrayList;
import java.util.List;

public class VideoCompositionInstruction implements IVideoCompositionInstruction {
    public int backgroundColor;
    public boolean enablePostProcessing;
    public List<VideoCompositionLayerInstruction> layerInstructions = new ArrayList();
    public int passthroughTrackID = -1;
    public List<Integer> requiredSourceTrackIDs = new ArrayList();
    public CMTimeRange timeRange;

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public List<? extends VideoCompositionLayerInstruction> getLayerInstructions() {
        return this.layerInstructions;
    }

    public int getPassthroughTrackID() {
        return this.passthroughTrackID;
    }

    public List<Integer> getRequiredSourceTrackIDs() {
        return this.requiredSourceTrackIDs;
    }

    public CMTimeRange getTimeRange() {
        return this.timeRange;
    }

    public boolean isEnablePostProcessing() {
        return this.enablePostProcessing;
    }
}
