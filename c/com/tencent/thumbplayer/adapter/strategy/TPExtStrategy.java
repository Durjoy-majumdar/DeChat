package com.tencent.thumbplayer.adapter.strategy;

import android.text.TextUtils;
import com.tencent.thumbplayer.adapter.TPPlaybackInfo;
import com.tencent.thumbplayer.adapter.strategy.model.TPStrategyConfig;
import com.tencent.thumbplayer.adapter.strategy.model.TPStrategyContext;
import com.tencent.thumbplayer.utils.TPLogUtil;

public class TPExtStrategy extends TPBaseStrategy {
    private static final String TAG = "TPThumbPlayer[TPExtStrategy.java]";
    private int mCurId = 0;
    private int[] mPlayerList;

    public TPExtStrategy(TPStrategyConfig tPStrategyConfig) {
        super(tPStrategyConfig);
        int[] playerList = tPStrategyConfig.getPlayerList();
        this.mPlayerList = playerList;
        if (playerList == null || playerList.length == 0) {
            this.mPlayerList = new int[1];
        }
    }

    private boolean isUseSoftDec(String str) {
        return TextUtils.equals(str, "hd") || TextUtils.equals(str, "sd") || TextUtils.equals(str, "msd");
    }

    public int[] strategyForDec() {
        int[] iArr = {-1};
        int i = this.mCurId;
        int[] iArr2 = this.mPlayerList;
        if (i >= iArr2.length) {
            TPLogUtil.m21897i(TAG, "strategyForDec error, decType:" + iArr[0]);
            return iArr;
        }
        int i2 = iArr2[i];
        if (i2 == 1 || i2 == 2) {
            iArr[0] = 102;
        } else if (i2 == 3) {
            iArr[0] = 101;
        }
        TPLogUtil.m21897i(TAG, "strategyForDec, decType:" + iArr[0]);
        return iArr;
    }

    public int strategyForOpen(TPPlaybackInfo tPPlaybackInfo) {
        int[] iArr = this.mPlayerList;
        int length = iArr.length;
        int i = this.mCurId;
        int i2 = 0;
        int i3 = length > i ? iArr[i] : 0;
        if (!(i3 == 2 || i3 == 3) || isThumbPlayerEnable(tPPlaybackInfo)) {
            i2 = i3;
        }
        TPLogUtil.m21897i(TAG, "strategyForOpen, playerType:" + i2);
        return i2;
    }

    public int strategyForRetry(TPPlaybackInfo tPPlaybackInfo, TPStrategyContext tPStrategyContext) {
        int i;
        if (tPStrategyContext != null && tPStrategyContext.getPlayerType() == 0) {
            return strategyForOpen(tPPlaybackInfo);
        }
        int[] iArr = this.mPlayerList;
        int length = iArr.length - 1;
        int i2 = this.mCurId;
        int i3 = 0;
        if (length > i2) {
            int i4 = i2 + 1;
            this.mCurId = i4;
            i = iArr[i4];
        } else {
            i = 0;
        }
        if (!(i == 2 || i == 3) || isThumbPlayerEnable(tPPlaybackInfo)) {
            i3 = i;
        }
        TPLogUtil.m21897i(TAG, "strategyForRetry, playerType:" + i3);
        return i3;
    }
}
