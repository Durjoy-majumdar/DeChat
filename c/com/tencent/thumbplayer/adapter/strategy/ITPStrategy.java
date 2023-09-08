package com.tencent.thumbplayer.adapter.strategy;

import com.tencent.thumbplayer.adapter.TPPlaybackInfo;
import com.tencent.thumbplayer.adapter.strategy.model.TPStrategyContext;

public interface ITPStrategy {
    int[] strategyForDec();

    int strategyForOpen(TPPlaybackInfo tPPlaybackInfo);

    int strategyForRetry(TPPlaybackInfo tPPlaybackInfo, TPStrategyContext tPStrategyContext);
}
