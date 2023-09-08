package com.tencent.thumbplayer.composition;

import com.tencent.thumbplayer.api.composition.ITPMediaUrlAsset;
import com.tencent.thumbplayer.utils.TPLogUtil;
import java.io.IOException;

public class TPMediaUrlAsset extends TPMediaCommonAsset implements ITPMediaUrlAsset {
    private static final String TAG = "TPMediaUrlAsset";
    private String mStreamUrl;

    public TPMediaUrlAsset(String str) {
        this.mStreamUrl = str;
    }

    public int getMediaType() {
        return 0;
    }

    public String getStreamUrl() {
        return this.mStreamUrl;
    }

    public String getUrl() {
        try {
            return TPMediaCompositionXmlGenerator.buildXmlPathFromUrlAsset(this);
        } catch (IOException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            return "";
        }
    }

    public void setStreamUrl(String str) {
        this.mStreamUrl = str;
    }
}
