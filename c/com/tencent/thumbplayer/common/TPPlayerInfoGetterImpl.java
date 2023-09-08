package com.tencent.thumbplayer.common;

import com.tencent.thumbplayer.adapter.player.ITPPlayerBase;
import com.tencent.thumbplayer.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tplayer.reportv2.api.ITPPlayerInfoGetter;
import com.tencent.thumbplayer.utils.TPLogUtil;

public class TPPlayerInfoGetterImpl implements ITPPlayerInfoGetter {
    private static final String TAG = "TPPlayerInfoGetterImpl";
    private ITPPlayerBase mPlayerBase;

    public TPPlayerInfoGetterImpl(ITPPlayerBase iTPPlayerBase) {
        this.mPlayerBase = iTPPlayerBase;
    }

    public TPDynamicStatisticParams getDynamicStatisticParams(boolean z) {
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            TPLogUtil.m21894e(TAG, "playerBase is null, return default dynamic statistic params");
            return new TPDynamicStatisticParams();
        }
        TPDynamicStatisticParams dynamicStatisticParams = iTPPlayerBase.getDynamicStatisticParams(z);
        if (dynamicStatisticParams != null) {
            return dynamicStatisticParams;
        }
        TPLogUtil.m21894e(TAG, "cannot get params from core, return default dynamic statistic params");
        return new TPDynamicStatisticParams();
    }

    public TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            TPLogUtil.m21894e(TAG, "playerBase is null, return default general play flow params");
            return new TPGeneralPlayFlowParams();
        }
        TPGeneralPlayFlowParams generalPlayFlowParams = iTPPlayerBase.getGeneralPlayFlowParams();
        if (generalPlayFlowParams != null) {
            return generalPlayFlowParams;
        }
        TPLogUtil.m21894e(TAG, "cannot get params from core, return default general play flow params");
        return new TPGeneralPlayFlowParams();
    }
}
