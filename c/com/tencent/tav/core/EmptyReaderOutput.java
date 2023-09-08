package com.tencent.tav.core;

import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMSampleState;
import com.tencent.tav.coremedia.CMTimeRange;
import java.util.List;

public class EmptyReaderOutput extends AssetReaderOutput {
    public void markConfigurationAsFinal() {
    }

    public CMSampleBuffer nextSampleBuffer(boolean z) {
        return new CMSampleBuffer(CMSampleState.fromError(-1));
    }

    public void release() {
    }

    public void resetForReadingTimeRanges(List<CMTimeRange> list) {
    }
}
