package com.tencent.tavkit.ciimage;

import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.logger.Logger;
import java.util.HashMap;

public class ThreadLocalTextureCache {
    private static final ThreadLocal<ThreadLocalTextureCache> TEXTURE_CACHE = new ThreadLocal<ThreadLocalTextureCache>() {
        public ThreadLocalTextureCache initialValue() {
            return new ThreadLocalTextureCache();
        }
    };
    private final String TAG;
    private final HashMap<String, TextureInfo> textureCache;

    public static ThreadLocalTextureCache getInstance() {
        return TEXTURE_CACHE.get();
    }

    public synchronized TextureInfo getTextureInfo(String str) {
        return this.textureCache.get(str);
    }

    public synchronized void putTextureInfo(String str, TextureInfo textureInfo) {
        String str2 = this.TAG;
        Logger.m144641d(str2, "putTextureInfo() called with: key = [" + str + "], textureInfo = [" + textureInfo + "]");
        this.textureCache.put(str, textureInfo);
    }

    public synchronized void release() {
        String str = this.TAG;
        Logger.m144641d(str, "release() called, textureCache = " + this.textureCache);
        for (TextureInfo release : this.textureCache.values()) {
            release.release();
        }
        this.textureCache.clear();
    }

    public synchronized void remove(String str) {
        this.textureCache.remove(str);
    }

    private ThreadLocalTextureCache() {
        String str = "ThreadLocalTextureCache@" + Integer.toHexString(hashCode());
        this.TAG = str;
        Logger.m144641d(str, "ThreadLocalTextureCache() called, thread = " + Thread.currentThread().getName());
        this.textureCache = new HashMap<>();
    }
}
