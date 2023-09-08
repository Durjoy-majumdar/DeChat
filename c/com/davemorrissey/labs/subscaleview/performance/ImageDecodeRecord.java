package com.davemorrissey.labs.subscaleview.performance;

import com.tencent.p014mm.sdk.platformtools.Log;

public class ImageDecodeRecord {
    private static final String TAG = "MicroMsg.ImageDecodeRecord";
    private int mPreviewLoadedTime = 0;
    private int mTileDecodeTime = 0;
    private int mTileInitTime = 0;

    public void addPreviewLoadedTime(int i) {
        this.mPreviewLoadedTime += i;
        Log.m105919d(TAG, "alvinluo addPreviewLoadedTime: %d, total: %d", Integer.valueOf(i), Integer.valueOf(this.mPreviewLoadedTime));
    }

    public void addTileDecodeTime(int i) {
        this.mTileDecodeTime += i;
        Log.m105919d(TAG, "alvinluo addTileDecodeTime: %d, total: %d", Integer.valueOf(i), Integer.valueOf(this.mTileDecodeTime));
    }

    public void addTileInitTime(int i) {
        this.mTileInitTime += i;
        Log.m105919d(TAG, "alvinluo addTileInitTime: %d, total: %d", Integer.valueOf(i), Integer.valueOf(this.mTileInitTime));
    }

    public int getMainImageDecodeTime() {
        return this.mTileInitTime + this.mTileDecodeTime;
    }

    public int getPreviewLoadedTime() {
        return this.mPreviewLoadedTime;
    }

    public int getTileDecodeTime() {
        return this.mTileDecodeTime;
    }

    public int getTileInitTime() {
        return this.mTileInitTime;
    }

    public void reset() {
        this.mPreviewLoadedTime = 0;
        this.mTileDecodeTime = 0;
    }
}
