package com.tencent.thumbplayer.api;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester;
import com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer;
import com.tencent.thumbplayer.log.TPLoggerContext;
import com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer;
import com.tencent.thumbplayer.richmedia.async.TPRichMediaAsyncRequester;
import com.tencent.thumbplayer.tplayer.TPPlayer;
import com.tencent.thumbplayer.tplayer.TPPlayerProxy;
import com.tencent.thumbplayer.utils.TPLogUtil;

public class TPPlayerFactory {
    private static final String LOG_TAG = "TPPlayerFactory";

    public static ITPRichMediaAsyncRequester createRichMediaASyncRequester(Context context) {
        try {
            return new TPRichMediaAsyncRequester(context.getApplicationContext());
        } catch (UnsupportedOperationException e) {
            TPLogUtil.m21894e(LOG_TAG, "Failed to create rich media async requester:" + e.getMessage());
            return null;
        }
    }

    public static ITPRichMediaSynchronizer createRichMediaSynchronizer(Context context) {
        try {
            return new TPRichMediaSynchronizer(context.getApplicationContext());
        } catch (UnsupportedOperationException e) {
            TPLogUtil.m21894e(LOG_TAG, "Failed to create rich media synchronizer:" + e.getMessage());
            return null;
        }
    }

    public static ITPPlayer createTPPlayer(Context context) {
        return (ITPPlayer) new TPPlayerProxy(new TPPlayer(context)).getProxyInstance();
    }

    public static TPSurface createTPSurface(SurfaceTexture surfaceTexture) {
        return new TPSurface(surfaceTexture);
    }

    public static ITPPlayer createTPPlayer(Context context, TPLoggerContext tPLoggerContext) {
        return (ITPPlayer) new TPPlayerProxy(new TPPlayer(context, (Looper) null, (Looper) null, tPLoggerContext)).getProxyInstance();
    }

    public static ITPPlayer createTPPlayer(Context context, Looper looper) {
        return (ITPPlayer) new TPPlayerProxy(new TPPlayer(context, looper)).getProxyInstance();
    }

    public static ITPPlayer createTPPlayer(Context context, Looper looper, Looper looper2) {
        return (ITPPlayer) new TPPlayerProxy(new TPPlayer(context, looper, looper2)).getProxyInstance();
    }

    public static ITPPlayer createTPPlayer(Context context, Looper looper, Looper looper2, TPLoggerContext tPLoggerContext) {
        return (ITPPlayer) new TPPlayerProxy(new TPPlayer(context, looper, looper2, tPLoggerContext)).getProxyInstance();
    }
}
