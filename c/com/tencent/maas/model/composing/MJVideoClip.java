package com.tencent.maas.model.composing;

import com.tencent.maas.base.Rect2;
import com.tencent.maas.instamovie.base.asset.MJAssetInfo;
import com.tencent.maas.model.time.MJTimeRange;

public class MJVideoClip extends MJClip {
    private final Rect2 contentCropRect;
    private final MJContentSpatialDesc contentSpatialDesc;
    private final MJTimeRange timeRangeInAsset;

    public MJVideoClip(MJAssetInfo mJAssetInfo) {
        super(mJAssetInfo);
        this.timeRangeInAsset = MJTimeRange.InvalidTimeRange;
        this.contentSpatialDesc = null;
        this.contentCropRect = null;
    }

    public Rect2 getContentCropRect() {
        return this.contentCropRect;
    }

    public MJContentSpatialDesc getContentSpatialDesc() {
        return this.contentSpatialDesc;
    }

    public MJTimeRange getTimeRangeInAsset() {
        return this.timeRangeInAsset;
    }

    public MJVideoClip(MJAssetInfo mJAssetInfo, MJTimeRange mJTimeRange) {
        super(mJAssetInfo);
        this.timeRangeInAsset = mJTimeRange;
        this.contentSpatialDesc = null;
        this.contentCropRect = null;
    }

    public MJVideoClip(MJAssetInfo mJAssetInfo, MJTimeRange mJTimeRange, MJContentSpatialDesc mJContentSpatialDesc, Rect2 rect2) {
        super(mJAssetInfo);
        this.timeRangeInAsset = mJTimeRange;
        this.contentSpatialDesc = mJContentSpatialDesc;
        this.contentCropRect = rect2;
    }
}
