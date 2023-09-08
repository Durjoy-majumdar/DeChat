package com.tencent.thumbplayer.api.richmedia;

public interface ITPRichMediaAsyncRequesterListener {
    void onFeatureDataRequestFailure(ITPRichMediaAsyncRequester iTPRichMediaAsyncRequester, int i, int i2, int i3);

    void onFeatureDataRequestSuccess(ITPRichMediaAsyncRequester iTPRichMediaAsyncRequester, int i, int i2, TPRichMediaFeatureData tPRichMediaFeatureData);

    void onRequesterError(ITPRichMediaAsyncRequester iTPRichMediaAsyncRequester, int i);

    void onRequesterPrepared(ITPRichMediaAsyncRequester iTPRichMediaAsyncRequester);
}
