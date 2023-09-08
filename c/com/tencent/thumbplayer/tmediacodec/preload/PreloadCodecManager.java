package com.tencent.thumbplayer.tmediacodec.preload;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import com.tencent.thumbplayer.tmediacodec.TCodecManager;
import com.tencent.thumbplayer.tmediacodec.TMediaCodec;
import com.tencent.thumbplayer.tmediacodec.preload.glrender.OutputSurface;
import com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy;
import com.tencent.thumbplayer.tmediacodec.util.LogUtils;
import com.tencent.thumbplayer.tmediacodec.util.TUtils;
import com.tencent.thumbplayer.tmediacodec.util.ThreadManager;
import java.util.Set;

public final class PreloadCodecManager {
    private static final String TAG = "PreloadCodecManager";
    private boolean mIsPreloaded;

    private MediaFormat getPreloadMediaFormat(String str) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        ReusePolicy reusePolicy = TCodecManager.getInstance().getReusePolicy();
        int i = reusePolicy.initWidth;
        int i2 = reusePolicy.initHeight;
        int max = Math.max(0, TUtils.getCodecMaxInputSize(str, i, i2));
        mediaFormat.setInteger("width", 1);
        mediaFormat.setInteger("height", 1);
        mediaFormat.setInteger("rotation-degrees", 0);
        mediaFormat.setInteger("max-input-size", Math.max(max, 0));
        mediaFormat.setInteger("max-width", i);
        mediaFormat.setInteger("max-height", i2);
        return mediaFormat;
    }

    private Surface getSurface() {
        return new OutputSurface(1, 1).getSurface();
    }

    public static boolean isInvalidMimeType(String str) {
        return TextUtils.equals(str, "video/avc") || TextUtils.equals(str, "video/hevc");
    }

    /* access modifiers changed from: private */
    public void preloadCodecByMimeType(String str) {
        Surface surface = getSurface();
        if (surface != null) {
            try {
                TMediaCodec createDecoderByType = TMediaCodec.createDecoderByType(str);
                createDecoderByType.configure(getPreloadMediaFormat(str), surface, (MediaCrypto) null, 0);
                createDecoderByType.start();
                createDecoderByType.stop();
                createDecoderByType.release();
                LogUtils.m21881d(TAG, "preloadCodecByMimeType sampleMimeType:" + str + " surface:" + surface + " success");
            } catch (Throwable th) {
                LogUtils.m21887w(TAG, "preloadCodecByMimeType sampleMimeType:" + str + " exception...", th);
            }
        } else {
            LogUtils.m21886w(TAG, "preloadCodecByMimeType sampleMimeType:" + str + " failed...");
        }
    }

    public final void preload(final Set<String> set) {
        if (!this.mIsPreloaded) {
            ThreadManager.execute(new Runnable() {
                public void run() {
                    for (String str : set) {
                        if (PreloadCodecManager.isInvalidMimeType(str)) {
                            PreloadCodecManager.this.preloadCodecByMimeType(str);
                        }
                    }
                }
            });
            return;
        }
        LogUtils.m21886w(TAG, "preload codec return, for isPreload:" + this.mIsPreloaded + " apiLevel:" + Build.VERSION.SDK_INT);
    }
}
