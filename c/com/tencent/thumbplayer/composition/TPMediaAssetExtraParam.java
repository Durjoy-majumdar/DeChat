package com.tencent.thumbplayer.composition;

import com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam;
import com.tencent.thumbplayer.api.composition.ITPMediaAssetObjectParam;
import java.io.Serializable;
import java.util.HashMap;

public class TPMediaAssetExtraParam implements ITPMediaAssetExtraParam {
    private static final String TAG = "TPMediaAssetExtraParam";
    private HashMap<String, Serializable> mExtraParamMap = new HashMap<>();

    public int getExtraInt(String str) {
        if (this.mExtraParamMap.containsKey(str)) {
            return ((Integer) this.mExtraParamMap.get(str)).intValue();
        }
        return -1;
    }

    public ITPMediaAssetObjectParam getExtraObject(String str) {
        if (this.mExtraParamMap.get(str) instanceof ITPMediaAssetObjectParam) {
            return (ITPMediaAssetObjectParam) this.mExtraParamMap.get(str);
        }
        return null;
    }

    public String getExtraString(String str) {
        return this.mExtraParamMap.containsKey(str) ? (String) this.mExtraParamMap.get(str) : "";
    }

    public void setExtraInt(String str, int i) {
        this.mExtraParamMap.put(str, Integer.valueOf(i));
    }

    public void setExtraObject(String str, ITPMediaAssetObjectParam iTPMediaAssetObjectParam) {
        this.mExtraParamMap.put(str, iTPMediaAssetObjectParam);
    }

    public void setExtraString(String str, String str2) {
        this.mExtraParamMap.put(str, str2);
    }
}
