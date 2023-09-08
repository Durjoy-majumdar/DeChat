package com.tencent.thumbplayer.adapter.strategy;

import com.tencent.thumbplayer.adapter.strategy.model.TPStrategyConfig;
import com.tencent.thumbplayer.adapter.strategy.model.TPStrategyContext;

public class TPDefaultStrategy extends TPBaseStrategy {
    public TPDefaultStrategy(TPStrategyConfig tPStrategyConfig) {
        super(tPStrategyConfig);
    }

    public boolean checkNeedDoRetry(TPStrategyContext tPStrategyContext) {
        return false;
    }
}
