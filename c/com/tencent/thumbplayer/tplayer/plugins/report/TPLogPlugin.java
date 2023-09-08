package com.tencent.thumbplayer.tplayer.plugins.report;

import com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase;
import com.tencent.thumbplayer.utils.TPLogUtil;

public class TPLogPlugin implements ITPPluginBase {
    public static final String TAG = "TPLogPlugin";

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onEvent(int i, int i2, int i3, String str, Object obj) {
        switch (i) {
            case 101:
                TPLogUtil.m21893d(TAG, "create player adapter");
                return;
            case 102:
                TPLogUtil.m21893d(TAG, "start prepare");
                return;
            case 103:
                TPLogUtil.m21893d(TAG, "on prepared");
                return;
            case 104:
                TPLogUtil.m21893d(TAG, "start play");
                return;
            case 106:
                TPLogUtil.m21893d(TAG, "on paused");
                return;
            case 107:
                TPLogUtil.m21893d(TAG, "on stoped");
                return;
            case 108:
                TPLogUtil.m21893d(TAG, "on error:" + i2);
                return;
            case 109:
                TPLogUtil.m21893d(TAG, "start seek");
                return;
            case 110:
                TPLogUtil.m21893d(TAG, "seek complete");
                return;
            case 111:
                TPLogUtil.m21893d(TAG, "on play complete");
                return;
            case 112:
                TPLogUtil.m21893d(TAG, "on release");
                return;
            case 113:
                TPLogUtil.m21893d(TAG, "on reset");
                return;
            default:
                return;
        }
    }
}
