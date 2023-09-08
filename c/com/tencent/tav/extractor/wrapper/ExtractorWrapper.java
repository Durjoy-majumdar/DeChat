package com.tencent.tav.extractor.wrapper;

import android.text.TextUtils;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.extractor.AssetExtractor;
import java.io.File;

public class ExtractorWrapper {
    private long duration;
    private long lastUpdateTime;
    private int preferRotation;
    private String videoPath;
    private CGSize videoSize;

    public ExtractorWrapper(String str) {
        this.videoPath = str;
    }

    private boolean exit() {
        return !TextUtils.isEmpty(this.videoPath) && new File(this.videoPath).exists();
    }

    private void loadWith(AssetExtractor assetExtractor) {
        this.duration = assetExtractor.getDuration();
        this.videoSize = assetExtractor.getSize();
        this.preferRotation = assetExtractor.getPreferRotation();
        this.lastUpdateTime = new File(this.videoPath).lastModified();
    }

    private boolean needReload() {
        return this.lastUpdateTime != new File(this.videoPath).lastModified();
    }

    public void checkAndLoad(AssetExtractor assetExtractor) {
        if (exit() && needReload()) {
            loadWith(assetExtractor);
        }
    }

    public long getDuration() {
        return this.duration;
    }

    public int getPreferRotation() {
        return this.preferRotation;
    }

    public String getVideoPath() {
        return this.videoPath;
    }

    public CGSize getVideoSize() {
        return this.videoSize;
    }
}
