package com.tencent.maas.model.composing;

import com.tencent.maas.model.MJSpatialInfo;
import java.util.List;
import java.util.Map;

public class MJLyricsOverlayDesc extends MJOverlayDesc {
    private final Map<String, Object> layerStyles;
    private final List<WXMusicLyricInfo> lyricInfos;
    private final float maximunWidth;
    private final Map<String, Object> textStyles;

    public MJLyricsOverlayDesc(MJSpatialInfo mJSpatialInfo, List<WXMusicLyricInfo> list, float f, Map<String, Object> map, Map<String, Object> map2) {
        super(mJSpatialInfo, 0);
        this.lyricInfos = list;
        this.maximunWidth = f;
        this.textStyles = map;
        this.layerStyles = map2;
    }

    public Map<String, Object> getLayerStyles() {
        return this.layerStyles;
    }

    public List<WXMusicLyricInfo> getLyricInfos() {
        return this.lyricInfos;
    }

    public float getMaximunWidth() {
        return this.maximunWidth;
    }

    public Map<String, Object> getTextStyles() {
        return this.textStyles;
    }
}
