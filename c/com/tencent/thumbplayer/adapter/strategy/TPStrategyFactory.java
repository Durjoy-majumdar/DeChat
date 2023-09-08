package com.tencent.thumbplayer.adapter.strategy;

import com.tencent.thumbplayer.adapter.strategy.model.TPStrategyConfig;

public class TPStrategyFactory {
    public static ITPStrategy createStrategy(TPStrategyConfig tPStrategyConfig) {
        return tPStrategyConfig.isExtPlayerList() ? new TPExtStrategy(tPStrategyConfig) : new TPDefaultStrategy(tPStrategyConfig);
    }
}
