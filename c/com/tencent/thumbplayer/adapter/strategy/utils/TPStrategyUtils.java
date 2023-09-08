package com.tencent.thumbplayer.adapter.strategy.utils;

import com.tencent.thumbplayer.adapter.TPPlaybackInfo;
import com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap;
import com.tencent.thumbplayer.core.common.TPNativeLibraryException;
import com.tencent.thumbplayer.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper;
import com.tencent.thumbplayer.utils.TPLogUtil;

public class TPStrategyUtils {
    private static final String TAG = "TPStrategyUtils";

    public static boolean enablePlayBySystemPlayer(TPPlaybackInfo tPPlaybackInfo) {
        if (tPPlaybackInfo.getVideoCodedId() == 0) {
            return true;
        }
        return isSupportMediaCodec(tPPlaybackInfo);
    }

    public static boolean enablePlayByThumbPlayer(TPPlaybackInfo tPPlaybackInfo) {
        return tPPlaybackInfo == null || tPPlaybackInfo.getVideoCodedId() == 0 || isSupportFFmpegCodec(tPPlaybackInfo) || isSupportMediaCodec(tPPlaybackInfo);
    }

    public static boolean isSupportFFmpegCodec(TPPlaybackInfo tPPlaybackInfo) {
        try {
            return TPThumbplayerCapabilityHelper.isVCodecCapabilitySupport(101, TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapCodecType.class, tPPlaybackInfo.getVideoCodedId()), (int) tPPlaybackInfo.getWidth(), (int) tPPlaybackInfo.getHeight(), tPPlaybackInfo.getVideoProfile(), tPPlaybackInfo.getVideoLevel());
        } catch (TPNativeLibraryException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            return false;
        }
    }

    public static boolean isSupportMediaCodec(TPPlaybackInfo tPPlaybackInfo) {
        try {
            return TPThumbplayerCapabilityHelper.isVCodecCapabilitySupport(102, TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapCodecType.class, tPPlaybackInfo.getVideoCodedId()), (int) tPPlaybackInfo.getWidth(), (int) tPPlaybackInfo.getHeight(), tPPlaybackInfo.getVideoProfile(), tPPlaybackInfo.getVideoLevel());
        } catch (TPNativeLibraryException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            return false;
        }
    }

    public static boolean isSystemPlayerEnable() {
        return true;
    }

    public static boolean isTVPlatform() {
        return false;
    }

    public static boolean isThumbPlayerEnable() {
        return TPNativeLibraryLoader.isLibLoadedAndTryToLoad();
    }
}
