package com.tencent.tav.decoder;

import android.graphics.Matrix;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.logger.Logger;
import java.util.ArrayList;
import java.util.List;

public class TexturePool implements ITexturePool {
    private static final String TAG = "TexturePool";
    private int MaxCacheLength = 60;
    private long MaxCacheSize = 207360000;
    private List<TextureInfo> textureInfoList = new ArrayList();

    public TexturePool() {
        Logger.m144641d(TAG, "TexturePool: create " + Thread.currentThread().getId());
    }

    private synchronized void adaptCacheSize() {
        while (this.textureInfoList.size() > 0 && this.textureInfoList.size() - this.MaxCacheLength > 0) {
            this.textureInfoList.get(0).release();
            this.textureInfoList.remove(0);
        }
    }

    private synchronized void adapterCacheMemorySize() {
        long j = 0;
        int i = 0;
        while (i < this.textureInfoList.size()) {
            TextureInfo textureInfo = this.textureInfoList.get(i);
            j += (long) (textureInfo.width * textureInfo.height);
            if (j > this.MaxCacheSize) {
                Logger.m144648v(TAG, "texture: release " + textureInfo + " - " + Thread.currentThread());
                textureInfo.release();
                this.textureInfoList.remove(i);
                i--;
            }
            i++;
        }
    }

    public synchronized TextureInfo popTexture(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.textureInfoList.size(); i4++) {
            TextureInfo textureInfo = this.textureInfoList.get(i4);
            if (textureInfo.textureType == i && textureInfo.width == i2 && textureInfo.height == i3) {
                Logger.m144648v(TAG, "popTexture: hint pool " + textureInfo.textureID);
                return this.textureInfoList.remove(i4);
            }
        }
        int createTexture = RenderContext.createTexture(i);
        adaptCacheSize();
        adapterCacheMemorySize();
        return new TextureInfo(createTexture, 3553, i2, i3, (Matrix) null, 0);
    }

    public synchronized void pushTexture(TextureInfo textureInfo) {
        for (int i = 0; i < this.textureInfoList.size(); i++) {
            TextureInfo textureInfo2 = this.textureInfoList.get(i);
            if (textureInfo2.textureType == textureInfo.textureType && textureInfo2.textureID == textureInfo.textureID) {
                Logger.m144648v(TAG, "pushTexture: hint pool  " + textureInfo2.textureID);
                textureInfo.release();
                return;
            }
        }
        Logger.m144648v(TAG, "pushTexture: push in " + textureInfo.textureID + " - " + Thread.currentThread());
        this.textureInfoList.add(textureInfo);
    }

    public synchronized void release() {
        Logger.m144641d(TAG, " release all " + Thread.currentThread().getId());
        for (int i = 0; i < this.textureInfoList.size(); i++) {
            this.textureInfoList.get(i).release();
        }
    }

    public void setMaxCacheLength(int i) {
        this.MaxCacheLength = i;
        adapterCacheMemorySize();
    }

    public void setMaxCacheSize(long j) {
        this.MaxCacheSize = j;
        adaptCacheSize();
    }
}
