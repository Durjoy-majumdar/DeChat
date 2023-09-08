package com.tencent.tav.player;

import com.tencent.tav.asset.AssetTrack;

public class PlayerItemTrack {
    private AssetTrack assetTrack;
    private float currentVideoFrameRate;
    private boolean enabled = true;
    private String videoFieldMode;

    public AssetTrack getAssetTrack() {
        return this.assetTrack;
    }

    public float getCurrentVideoFrameRate() {
        return this.currentVideoFrameRate;
    }

    public String getVideoFieldMode() {
        return this.videoFieldMode;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setAssetTrack(AssetTrack assetTrack2) {
        this.assetTrack = assetTrack2;
    }

    public void setCurrentVideoFrameRate(float f) {
        this.currentVideoFrameRate = f;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setVideoFieldMode(String str) {
        this.videoFieldMode = str;
    }
}
