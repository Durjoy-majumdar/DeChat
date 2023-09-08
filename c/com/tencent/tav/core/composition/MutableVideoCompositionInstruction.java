package com.tencent.tav.core.composition;

import com.tencent.tav.coremedia.CMTimeRange;
import java.util.List;

public class MutableVideoCompositionInstruction extends VideoCompositionInstruction {
    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public void setEnablePostProcessing(boolean z) {
        this.enablePostProcessing = z;
    }

    public void setLayerInstructions(List<VideoCompositionLayerInstruction> list) {
        this.layerInstructions.clear();
        this.layerInstructions.addAll(list);
        this.requiredSourceTrackIDs.clear();
        for (VideoCompositionLayerInstruction trackID : list) {
            this.requiredSourceTrackIDs.add(Integer.valueOf(trackID.getTrackID()));
        }
    }

    public void setTimeRange(CMTimeRange cMTimeRange) {
        this.timeRange = cMTimeRange;
    }
}
