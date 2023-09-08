package com.tencent.thumbplayer.composition;

import com.tencent.thumbplayer.api.composition.ITPMediaAssetOrderedMap;
import com.tencent.thumbplayer.utils.TPLogUtil;

public class TPMediaAssetOrderedMap implements ITPMediaAssetOrderedMap {
    private static final String TAG = "TPMediaAssetOrderedMap";
    private StringBuilder mOrderedStrings = new StringBuilder();

    public void addKeyValue(String str, String str2) {
        TPLogUtil.m21897i(TAG, "addKeyValue key:" + str + "=" + str2);
        StringBuilder sb = this.mOrderedStrings;
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        sb.append(";");
    }

    public String getKeyValueStr() {
        TPLogUtil.m21897i(TAG, "getKeyValueStr " + this.mOrderedStrings.toString());
        return this.mOrderedStrings.toString();
    }
}
