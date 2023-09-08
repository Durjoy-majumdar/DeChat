package com.tencent.thumbplayer.richmedia;

import com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer;
import com.tencent.thumbplayer.api.richmedia.TPRichMediaFeatureData;

public interface ITPInnerRichMediaSynchronizer extends ITPRichMediaSynchronizer {

    public interface ITPRichMediaInnerSynchronizerListener {
        long onGetCurrentPositionMs(ITPRichMediaSynchronizer iTPRichMediaSynchronizer);
    }

    TPRichMediaFeatureData getCurrentPositionMsFeatureData(long j, int[] iArr);

    void seek(long j);

    void setInnerListener(ITPRichMediaInnerSynchronizerListener iTPRichMediaInnerSynchronizerListener);

    void setPlaybackRate(float f);
}
