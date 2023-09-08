package com.tencent.maas.model.composing;

import com.tencent.maas.model.MJSpatialInfo;
import com.tencent.maas.model.composing.MJComposingDefines;

public class MJStickerOverlayDesc extends MJOverlayDesc {
    private String filePath;
    private MJComposingDefines.MJTimingFillMode fillMode;
    private MJComposingDefines.MJStickerDecoderType stickerDecoderType;

    public MJStickerOverlayDesc(MJSpatialInfo mJSpatialInfo, MJComposingDefines.MJStickerDecoderType mJStickerDecoderType, MJComposingDefines.MJTimingFillMode mJTimingFillMode, String str) {
        super(mJSpatialInfo, 0);
        this.stickerDecoderType = mJStickerDecoderType;
        this.fillMode = mJTimingFillMode;
        this.filePath = str;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public MJComposingDefines.MJTimingFillMode getFillMode() {
        return this.fillMode;
    }

    public MJComposingDefines.MJStickerDecoderType getStickerDecoderType() {
        return this.stickerDecoderType;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setFillMode(MJComposingDefines.MJTimingFillMode mJTimingFillMode) {
        this.fillMode = mJTimingFillMode;
    }

    public void setStickerDecoderType(MJComposingDefines.MJStickerDecoderType mJStickerDecoderType) {
        this.stickerDecoderType = mJStickerDecoderType;
    }
}
