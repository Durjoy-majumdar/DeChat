package com.tencent.thumbplayer.core.player;

import com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams;

public interface ITPNativePlayerEventRecordCallback {
    void onDrmInfo(TPGeneralPlayFlowParams.TPPlayerDrmParams tPPlayerDrmParams);
}
