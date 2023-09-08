package com.tencent.maas.model.composing;

import com.tencent.maas.model.MJSpatialInfo;
import java.util.Map;

public class MJTextOverlayDesc extends MJOverlayDesc {
    private final Map<String, Object> layerStyles;
    private final float maximumWidth;
    private final String text;
    private final Map<String, Object> textStyles;

    public MJTextOverlayDesc(MJSpatialInfo mJSpatialInfo, String str, float f, Map<String, Object> map, Map<String, Object> map2) {
        super(mJSpatialInfo, 0);
        this.text = str;
        this.maximumWidth = f;
        this.textStyles = map;
        this.layerStyles = map2;
    }

    public Map<String, Object> getLayerStyles() {
        return this.layerStyles;
    }

    public float getMaximumWidth() {
        return this.maximumWidth;
    }

    public String getText() {
        return this.text;
    }

    public Map<String, Object> getTextStyles() {
        return this.textStyles;
    }
}
