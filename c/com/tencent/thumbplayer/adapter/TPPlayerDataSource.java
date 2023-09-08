package com.tencent.thumbplayer.adapter;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.tencent.thumbplayer.adapter.player.TPUrlDataSource;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import java.util.HashMap;
import java.util.Map;

public class TPPlayerDataSource {
    public static final int TYPE_ASSET_FD = 4;
    public static final int TYPE_CLIP_INFO = 2;
    public static final int TYPE_DATA_SOURCE = 3;
    public static final int TYPE_PARCEL_FD = 1;
    public static final int TYPE_URL = 0;
    private AssetFileDescriptor mAssetFileDescriptor;
    private Map<String, String> mHttpHeaders;
    private ParcelFileDescriptor mParcelFileDescriptor;
    private ITPMediaAsset mTPMediaAsset;
    private int mType;
    private String mUrl;
    private TPUrlDataSource tpUrlDataSource;

    public TPPlayerDataSource() {
        this.mHttpHeaders = new HashMap();
    }

    public AssetFileDescriptor assetFileDescriptor() {
        return this.mAssetFileDescriptor;
    }

    public TPUrlDataSource getTpUrlDataSource() {
        return this.tpUrlDataSource;
    }

    public int getType() {
        return this.mType;
    }

    public Map<String, String> httpHeaders() {
        return this.mHttpHeaders;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.mUrl) && this.mParcelFileDescriptor == null && this.mAssetFileDescriptor == null && this.mTPMediaAsset == null && this.tpUrlDataSource == null) ? false : true;
    }

    public ITPMediaAsset mediaAsset() {
        return this.mTPMediaAsset;
    }

    public ParcelFileDescriptor parcelFileDescriptor() {
        return this.mParcelFileDescriptor;
    }

    public void setAssetFileDescriptor(AssetFileDescriptor assetFileDescriptor) {
        this.mUrl = null;
        this.mType = 4;
        this.mHttpHeaders.clear();
        this.mParcelFileDescriptor = null;
        this.mAssetFileDescriptor = assetFileDescriptor;
    }

    public void setHttpHeaders(Map<String, String> map) {
        this.mHttpHeaders.clear();
        Map<String, String> map2 = this.mHttpHeaders;
        if (map == null) {
            map = new HashMap<>(0);
        }
        map2.putAll(map);
    }

    public void setMediaClipInfo(ITPMediaAsset iTPMediaAsset) {
        this.mUrl = null;
        this.mType = 2;
        this.mHttpHeaders.clear();
        this.mParcelFileDescriptor = null;
        this.mAssetFileDescriptor = null;
        this.mTPMediaAsset = iTPMediaAsset;
    }

    public void setParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor) {
        this.mUrl = null;
        this.mType = 1;
        this.mHttpHeaders.clear();
        this.mParcelFileDescriptor = parcelFileDescriptor;
        this.mAssetFileDescriptor = null;
    }

    public void setTpUrlDataSource(TPUrlDataSource tPUrlDataSource) {
        this.mUrl = null;
        this.mType = 3;
        this.mParcelFileDescriptor = null;
        this.mAssetFileDescriptor = null;
        this.tpUrlDataSource = tPUrlDataSource;
    }

    public void setUrl(String str) {
        this.mUrl = str;
        this.mType = 0;
        this.mParcelFileDescriptor = null;
    }

    public String url() {
        return this.mUrl;
    }

    public TPPlayerDataSource(String str) {
        this.mUrl = str;
        this.mType = 0;
        this.mParcelFileDescriptor = null;
        this.mAssetFileDescriptor = null;
        this.mHttpHeaders = new HashMap(0);
    }

    public TPPlayerDataSource(String str, Map<String, String> map) {
        this.mUrl = str;
        this.mType = 0;
        this.mParcelFileDescriptor = null;
        this.mAssetFileDescriptor = null;
        HashMap hashMap = new HashMap();
        this.mHttpHeaders = hashMap;
        hashMap.putAll(map);
    }

    public TPPlayerDataSource(ParcelFileDescriptor parcelFileDescriptor) {
        this.mUrl = null;
        this.mType = 1;
        this.mParcelFileDescriptor = parcelFileDescriptor;
        this.mAssetFileDescriptor = null;
        this.mHttpHeaders = new HashMap(0);
    }

    public TPPlayerDataSource(AssetFileDescriptor assetFileDescriptor) {
        this.mUrl = null;
        this.mType = 4;
        this.mParcelFileDescriptor = null;
        this.mAssetFileDescriptor = assetFileDescriptor;
        this.mHttpHeaders = new HashMap(0);
    }

    public TPPlayerDataSource(ITPMediaAsset iTPMediaAsset) {
        this.mUrl = null;
        this.mType = 2;
        this.mParcelFileDescriptor = null;
        this.mAssetFileDescriptor = null;
        this.mHttpHeaders = new HashMap(0);
        this.mTPMediaAsset = iTPMediaAsset;
    }
}
