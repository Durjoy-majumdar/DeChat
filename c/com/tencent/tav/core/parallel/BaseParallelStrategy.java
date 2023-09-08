package com.tencent.tav.core.parallel;

import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.logger.Logger;
import java.util.ArrayList;

public abstract class BaseParallelStrategy implements IParallelStrategy {
    public static final String TAG = "SimpleParallelStrategy";

    public void addPipelineIndicator(int i, long j, long j2, ArrayList<PipelineIndicatorInfo> arrayList) {
        if (j >= 0 && j < j2) {
            Logger.m144647i(TAG, "index:%d  CMRange[%d %d]", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2));
            arrayList.add(new PipelineIndicatorInfo(1, i, new CMTimeRange(CMTime.fromMs(j), CMTime.fromMs(j2 - j))));
        }
    }
}
