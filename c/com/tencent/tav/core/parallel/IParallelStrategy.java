package com.tencent.tav.core.parallel;

import com.tencent.tav.core.AssetParallelExportSession;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import java.util.ArrayList;

public interface IParallelStrategy {
    void calculateSubsection(AssetParallelExportSession assetParallelExportSession, ArrayList<PipelineIndicatorInfo> arrayList);

    int parallelSize();
}
