package com.tencent.thumbplayer.tplayer.reportv2.api;

import com.tencent.thumbplayer.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams;

public interface ITPPlayerInfoGetter {
    TPDynamicStatisticParams getDynamicStatisticParams(boolean z);

    TPGeneralPlayFlowParams getGeneralPlayFlowParams();
}
