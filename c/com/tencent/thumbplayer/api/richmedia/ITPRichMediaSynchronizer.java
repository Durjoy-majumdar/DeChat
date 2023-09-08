package com.tencent.thumbplayer.api.richmedia;

public interface ITPRichMediaSynchronizer {
    void deselectFeatureAsync(int i);

    TPRichMediaFeature[] getFeatures();

    void prepareAsync();

    void release();

    void reset();

    void selectFeatureAsync(int i, TPRichMediaRequestExtraInfo tPRichMediaRequestExtraInfo);

    void setListener(ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener);

    void setRichMediaSource(String str);
}
