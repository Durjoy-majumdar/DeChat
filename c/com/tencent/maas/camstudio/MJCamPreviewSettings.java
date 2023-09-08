package com.tencent.maas.camstudio;

import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;

public class MJCamPreviewSettings {
    private final DimensionLevel previewDimensionLevel;

    public MJCamPreviewSettings(DimensionLevel dimensionLevel) {
        this.previewDimensionLevel = dimensionLevel;
    }

    public int getPreviewDimensionLevel() {
        return this.previewDimensionLevel.getId();
    }
}
