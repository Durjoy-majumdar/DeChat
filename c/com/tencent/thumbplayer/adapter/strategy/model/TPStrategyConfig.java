package com.tencent.thumbplayer.adapter.strategy.model;

import com.tencent.thumbplayer.adapter.TPPlaybackParams;
import com.tencent.thumbplayer.adapter.strategy.utils.TPStrategyUtils;
import com.tencent.thumbplayer.api.TPOptionalParam;

public class TPStrategyConfig {
    public int decStrategy = 2;
    public boolean mIsExtPlayerList = false;
    public int[] mPlayerList;
    public int playerStrategy = 2;

    public TPStrategyConfig(TPPlaybackParams tPPlaybackParams) {
        if (TPStrategyUtils.isTVPlatform()) {
            this.playerStrategy = 4;
            this.decStrategy = 2;
        }
        if (tPPlaybackParams != null) {
            TPOptionalParam optionalParam = tPPlaybackParams.getOptionalParam(210);
            if (optionalParam == null || optionalParam.getParamType() != 4) {
                TPOptionalParam optionalParam2 = tPPlaybackParams.getOptionalParam(202);
                if (optionalParam2 != null && optionalParam2.getParamType() == 2 && isPlayerStrategyVaild(optionalParam2.getParamLong().value)) {
                    this.playerStrategy = (int) optionalParam2.getParamLong().value;
                }
                TPOptionalParam optionalParam3 = tPPlaybackParams.getOptionalParam(203);
                if (optionalParam3 != null && optionalParam3.getParamType() == 2 && isDecStrategyVaild(optionalParam3.getParamLong().value)) {
                    this.decStrategy = (int) optionalParam3.getParamLong().value;
                }
                checkParamsIllegal(this.playerStrategy, this.decStrategy);
                return;
            }
            this.mPlayerList = optionalParam.getParamQueueInt().queueValue;
            this.mIsExtPlayerList = true;
        }
    }

    private void checkParamsIllegal(int i, int i2) {
        if (i == 3 && i2 == 3) {
            throw new IllegalArgumentException("can not soft with systemplayer");
        }
    }

    private boolean isDecStrategyVaild(long j) {
        return j > 0 && j < 5;
    }

    private boolean isPlayerStrategyVaild(long j) {
        return j > 0 && j < 5;
    }

    public int getDecStrategy() {
        return this.decStrategy;
    }

    public int[] getPlayerList() {
        return this.mPlayerList;
    }

    public int getPlayerStrategy() {
        return this.playerStrategy;
    }

    public boolean isExtPlayerList() {
        return this.mIsExtPlayerList;
    }
}
