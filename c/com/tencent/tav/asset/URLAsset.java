package com.tencent.tav.asset;

import com.tencent.tav.asset.AsynchronousKeyValueLoading;
import java.net.URL;
import java.util.List;

public final class URLAsset extends Asset {
    public String audiovisualMIMETypes;
    public String audiovisualTypes;

    public URLAsset(String str) {
        super(str);
    }

    public String getAudiovisualMIMETypes() {
        return this.audiovisualMIMETypes;
    }

    public String getAudiovisualTypes() {
        return this.audiovisualTypes;
    }

    public void loadValuesAsynchronouslyForKeys(List<String> list, AsynchronousKeyValueLoading.loadCallback loadcallback) {
    }

    public int statusOfValueForKey(String str) {
        return 1;
    }

    public URLAsset(URL url) {
        super(url);
    }
}
