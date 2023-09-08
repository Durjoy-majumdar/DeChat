package com.tencent.p014mm.jni.emojihelper;

import android.graphics.Bitmap;

/* renamed from: com.tencent.mm.jni.emojihelper.EmojiRgbaCacheManagerJni */
public class EmojiRgbaCacheManagerJni {

    /* renamed from: com.tencent.mm.jni.emojihelper.EmojiRgbaCacheManagerJni$b */
    public static class C92693b {

        /* renamed from: a */
        public static EmojiRgbaCacheManagerJni f266764a = new EmojiRgbaCacheManagerJni((C92692a) null);
    }

    public EmojiRgbaCacheManagerJni(C92692a aVar) {
    }

    private native int nCheckCache(String str);

    private native int nCheckEmojiCache(String str, boolean z);

    private native int nClearAllCache();

    private native int nClearCache(boolean z);

    private native int nGetCacheFrame(String str, boolean z, Bitmap bitmap);

    private native int nGetCacheFrameHeight(String str, boolean z);

    private native int nGetCacheFrameTotalLength(String str, boolean z);

    private native int nGetCacheFrameWidth(String str, boolean z);

    private native int nGetCacheSize(boolean z);

    private native int nPutCacheFrame(String str, boolean z, Bitmap bitmap, int i, int i2);

    /* renamed from: a */
    public boolean mo126784a(boolean z) {
        return nClearCache(z) > 0;
    }

    /* renamed from: b */
    public int mo126785b(boolean z) {
        return nGetCacheSize(z);
    }
}
