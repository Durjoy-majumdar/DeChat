package com.tencent.thumbplayer.composition;

import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam;
import java.util.Map;

public class TPMediaCommonAsset implements ITPMediaAsset {
    private ITPMediaAssetExtraParam mExtraParam;
    private Map<String, String> mHttpHeader;

    public ITPMediaAssetExtraParam getExtraParam() {
        return this.mExtraParam;
    }

    public Map<String, String> getHttpHeader() {
        return this.mHttpHeader;
    }

    public int getMediaType() {
        return 0;
    }

    public String getUrl() {
        return "";
    }

    public void setExtraParam(ITPMediaAssetExtraParam iTPMediaAssetExtraParam) {
        this.mExtraParam = iTPMediaAssetExtraParam;
    }

    public void setHttpHeader(Map<String, String> map) {
        this.mHttpHeader = map;
    }
}
