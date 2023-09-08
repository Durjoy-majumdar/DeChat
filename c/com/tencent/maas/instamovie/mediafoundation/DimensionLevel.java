package com.tencent.maas.instamovie.mediafoundation;

import com.tencent.tavkit.component.TAVExporter;
import com.tencent.tavkit.component.TAVPlayer;
import com.tencent.wxmm.v2helper;
import com.tencent.xweb.util.WXWebReporter;
import java.util.HashMap;
import java.util.Map;

public enum DimensionLevel {
    DIMENSION_LEVEL_144(0, "144p"),
    DIMENSION_LEVEL_224(1, "224p"),
    DIMENSION_LEVEL_360(2, "360p"),
    DIMENSION_LEVEL_480(3, "480p"),
    DIMENSION_LEVEL_540(4, "540p"),
    DIMENSION_LEVEL_720(5, "720p"),
    DIMENSION_LEVEL_1080(6, "1080p"),
    DIMENSION_LEVEL_1440(7, "1440p"),
    DIMENSION_LEVEL_2160(8, "2160p");
    
    private static final int[][] TypicalPixelSizes = null;
    private static Map<Integer, DimensionLevel> mapForId;

    /* renamed from: id */
    private int f78591id;
    private String name;

    /* access modifiers changed from: public */
    static {
        mapForId = new HashMap();
        for (DimensionLevel dimensionLevel : values()) {
            mapForId.put(Integer.valueOf(dimensionLevel.f78591id), dimensionLevel);
        }
        TypicalPixelSizes = new int[][]{new int[]{0, 0}, new int[]{256, 144}, new int[]{400, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL}, new int[]{640, v2helper.VOIP_ENC_HEIGHT_LV1}, new int[]{848, 480}, new int[]{960, TAVPlayer.VIDEO_PLAYER_WIDTH}, new int[]{1280, TAVExporter.VIDEO_EXPORT_WIDTH}, new int[]{1920, 1080}, new int[]{2560, 1440}, new int[]{3840, 2160}};
    }

    private DimensionLevel(int i, String str) {
        this.f78591id = i;
        this.name = str;
    }

    public static DimensionLevel calcForPixelSize(PixelSize pixelSize) {
        int i = pixelSize.width * pixelSize.height;
        for (int i2 = 0; i2 < values().length; i2++) {
            int[] iArr = TypicalPixelSizes[i2];
            if (i < ((iArr[0] * iArr[1]) * 11) / 10) {
                return valueOf(i2);
            }
        }
        return null;
    }

    public static DimensionLevel parse(String str) {
        for (DimensionLevel dimensionLevel : values()) {
            if (str.equalsIgnoreCase(dimensionLevel.name)) {
                return dimensionLevel;
            }
        }
        return null;
    }

    public int getId() {
        return this.f78591id;
    }

    public String getName() {
        return this.name;
    }

    public static DimensionLevel valueOf(int i) {
        return mapForId.get(Integer.valueOf(i));
    }
}
