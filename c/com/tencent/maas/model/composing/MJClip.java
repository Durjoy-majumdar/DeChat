package com.tencent.maas.model.composing;

import com.tencent.maas.instamovie.base.asset.MJAssetInfo;

public class MJClip {
    private final MJAssetInfo assetInfo;

    public MJClip(MJAssetInfo mJAssetInfo) {
        this.assetInfo = mJAssetInfo;
    }

    public MJAssetInfo getAssetInfo() {
        return this.assetInfo;
    }
}
