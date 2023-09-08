package com.tencent.maas.camstudio;

import com.tencent.maas.instamovie.base.asset.MJAssetInfo;
import java.util.Map;

public class MJCamTemplateOverridingParams {
    public static final String ORIGINAL_VIDEO_ASSET_KEY = "CamOriginalVideoAsset";
    private Map<String, MJAssetInfo> assetInfosByKey;
    private MJBeautyAdjustmentDesc beautyAdjustmentDesc;
    private MJCamFilterDesc filterDesc;
    private MJCamMusicDesc musicDesc;

    public Map<String, MJAssetInfo> getAssetInfosByKey() {
        return this.assetInfosByKey;
    }

    public MJBeautyAdjustmentDesc getBeautyAdjustmentDesc() {
        return this.beautyAdjustmentDesc;
    }

    public MJCamFilterDesc getFilterDesc() {
        return this.filterDesc;
    }

    public MJCamMusicDesc getMusicDesc() {
        return this.musicDesc;
    }

    public void setAssetInfosByKey(Map<String, MJAssetInfo> map) {
        this.assetInfosByKey = map;
    }

    public void setBeautyAdjustmentDesc(MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc) {
        this.beautyAdjustmentDesc = mJBeautyAdjustmentDesc;
    }

    public void setFilterDesc(MJCamFilterDesc mJCamFilterDesc) {
        this.filterDesc = mJCamFilterDesc;
    }

    public void setMusicDesc(MJCamMusicDesc mJCamMusicDesc) {
        this.musicDesc = mJCamMusicDesc;
    }
}
