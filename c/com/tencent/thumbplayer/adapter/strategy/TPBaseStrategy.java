package com.tencent.thumbplayer.adapter.strategy;

import com.tencent.thumbplayer.adapter.TPPlaybackInfo;
import com.tencent.thumbplayer.adapter.strategy.model.TPStrategyConfig;
import com.tencent.thumbplayer.adapter.strategy.model.TPStrategyContext;
import com.tencent.thumbplayer.adapter.strategy.utils.TPStrategyUtils;

public abstract class TPBaseStrategy implements ITPStrategy {
    public TPStrategyConfig tpStrategyConfig;

    public TPBaseStrategy(TPStrategyConfig tPStrategyConfig) {
        this.tpStrategyConfig = tPStrategyConfig;
    }

    public boolean checkNeedDoRetry(TPStrategyContext tPStrategyContext) {
        return false;
    }

    public boolean isSystemPlayerEnable(TPPlaybackInfo tPPlaybackInfo) {
        if (TPStrategyUtils.isTVPlatform()) {
            return true;
        }
        return TPStrategyUtils.isSystemPlayerEnable() && TPStrategyUtils.enablePlayBySystemPlayer(tPPlaybackInfo);
    }

    public boolean isThumbPlayerEnable(TPPlaybackInfo tPPlaybackInfo) {
        return TPStrategyUtils.isTVPlatform() ? TPStrategyUtils.isThumbPlayerEnable() : TPStrategyUtils.isThumbPlayerEnable() && TPStrategyUtils.enablePlayByThumbPlayer(tPPlaybackInfo);
    }

    public int[] strategyForDec() {
        int decStrategy = this.tpStrategyConfig.getDecStrategy();
        if (decStrategy == 0) {
            return new int[]{102, 101};
        }
        if (decStrategy == 1) {
            return new int[]{102};
        } else if (decStrategy == 2) {
            return new int[]{102, 101};
        } else {
            if (decStrategy == 3) {
                return new int[]{101};
            } else if (decStrategy != 4) {
                return null;
            } else {
                return new int[]{101, 102};
            }
        }
    }

    public int strategyForOpen(TPPlaybackInfo tPPlaybackInfo) {
        int playerStrategy = this.tpStrategyConfig.getPlayerStrategy();
        if (playerStrategy != 0) {
            if (playerStrategy == 1) {
                return isThumbPlayerEnable(tPPlaybackInfo) ? 2 : 0;
            }
            if (playerStrategy != 2) {
                if (playerStrategy == 3) {
                    return isSystemPlayerEnable(tPPlaybackInfo) ? 1 : 0;
                }
                if (playerStrategy != 4) {
                    return 0;
                }
                if (isSystemPlayerEnable(tPPlaybackInfo)) {
                    return 1;
                }
                return TPStrategyUtils.isThumbPlayerEnable() ? 2 : 0;
            } else if (isThumbPlayerEnable(tPPlaybackInfo)) {
                return 2;
            } else {
                return TPStrategyUtils.isSystemPlayerEnable() ? 1 : 0;
            }
        } else if (isThumbPlayerEnable(tPPlaybackInfo)) {
            return 2;
        } else {
            return TPStrategyUtils.isSystemPlayerEnable() ? 1 : 0;
        }
    }

    public int strategyForRetry(TPPlaybackInfo tPPlaybackInfo, TPStrategyContext tPStrategyContext) {
        int playerStrategy = this.tpStrategyConfig.getPlayerStrategy();
        if (tPStrategyContext != null && tPStrategyContext.getPlayerType() == 0) {
            return strategyForOpen(tPPlaybackInfo);
        }
        if (!checkNeedDoRetry(tPStrategyContext)) {
            return 0;
        }
        return playerStrategy != 0 ? playerStrategy != 2 ? (playerStrategy == 4 && tPStrategyContext != null && tPStrategyContext.getPlayerType() == 1 && isThumbPlayerEnable(tPPlaybackInfo)) ? 2 : 0 : (tPStrategyContext == null || tPStrategyContext.getPlayerType() != 2 || !isSystemPlayerEnable(tPPlaybackInfo)) ? 0 : 1 : (tPStrategyContext == null || tPStrategyContext.getPlayerType() != 1) ? (tPStrategyContext == null || tPStrategyContext.getPlayerType() != 2 || !isSystemPlayerEnable(tPPlaybackInfo)) ? 0 : 1 : isThumbPlayerEnable(tPPlaybackInfo) ? 2 : 0;
    }
}
