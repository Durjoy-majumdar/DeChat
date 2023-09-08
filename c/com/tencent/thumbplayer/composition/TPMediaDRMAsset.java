package com.tencent.thumbplayer.composition;

import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset;
import com.tencent.thumbplayer.utils.TPLogUtil;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TPMediaDRMAsset extends TPMediaCommonAsset implements ITPMediaDRMAsset {
    private static final String TAG = "TPMediaDRMAsset";
    private Map<String, String> mDrmPropertyMap = new HashMap();
    @TPCommonEnum.TP_DRM_TYPE
    private int mDrmType;
    private String mPlayUrl;

    public TPMediaDRMAsset(@TPCommonEnum.TP_DRM_TYPE int i, String str) {
        this.mPlayUrl = str;
        this.mDrmType = i;
    }

    public Map<String, String> getDrmAllProperties() {
        return this.mDrmPropertyMap;
    }

    public String getDrmPlayUrl() {
        return this.mPlayUrl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r2 = r1.mDrmPropertyMap.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getDrmProperty(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.mDrmPropertyMap
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000b
            goto L_0x0017
        L_0x000b:
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.mDrmPropertyMap
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r3 = r2
        L_0x0017:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.composition.TPMediaDRMAsset.getDrmProperty(java.lang.String, java.lang.String):java.lang.String");
    }

    @TPCommonEnum.TP_DRM_TYPE
    public int getDrmType() {
        return this.mDrmType;
    }

    public int getMediaType() {
        return 0;
    }

    public String getUrl() {
        try {
            return TPMediaCompositionXmlGenerator.buildXmlPathFromDrmAsset(this);
        } catch (IOException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            return "";
        }
    }

    public void setDrmPlayUrl(String str) {
        this.mPlayUrl = str;
    }

    public void setDrmProperty(String str, String str2) {
        this.mDrmPropertyMap.put(str, str2);
    }

    public void setDrmType(@TPCommonEnum.TP_DRM_TYPE int i) {
        this.mDrmType = i;
    }
}
