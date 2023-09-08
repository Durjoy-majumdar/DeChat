package com.tencent.maas.model.composing;

import com.tencent.maas.base.Rect2;
import com.tencent.maas.instamovie.base.asset.MJAssetInfo;
import com.tencent.maas.model.time.MJTime;

public class MJImageClip extends MJClip {
    private final Rect2 contentCropRect;
    private final MJContentSpatialDesc contentSpatialDesc;
    private final MJTime duration;

    public MJImageClip(MJAssetInfo mJAssetInfo, MJTime mJTime) {
        super(mJAssetInfo);
        this.duration = mJTime;
        this.contentSpatialDesc = null;
        this.contentCropRect = null;
    }

    public Rect2 getContentCropRect() {
        return this.contentCropRect;
    }

    public MJContentSpatialDesc getContentSpatialDesc() {
        return this.contentSpatialDesc;
    }

    public MJTime getDuration() {
        return this.duration;
    }

    public MJImageClip(MJAssetInfo mJAssetInfo, MJTime mJTime, MJContentSpatialDesc mJContentSpatialDesc, Rect2 rect2) {
        super(mJAssetInfo);
        this.duration = mJTime;
        this.contentSpatialDesc = mJContentSpatialDesc;
        this.contentCropRect = rect2;
    }
}
