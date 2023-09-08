package com.tencent.p014mm.plugin.appbrand.jsapi.webview;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.VideoJsCallback;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webview.c */
public abstract class C40477c implements VideoJsCallback {
    public void onVideoEmptied() {
    }

    public void onVideoEnded() {
    }

    public void onVideoEnterFullscreen(boolean z, long j, double d, double d2, boolean z2, boolean z3, double d3, double d4, double[] dArr) {
        Log.m105924i("MicroMsg.AppBrandXWVideoJsCallbackIMPL", "onVideoEnterFullScreen isVideoTag:" + z + ", view[" + 0 + ']');
    }

    public void onVideoError(int i, String str) {
        Log.m105920e("MicroMsg.AppBrandXWVideoJsCallbackIMPL", "onVideoError error:" + i + " msg:" + str + ", view[" + 0 + ']');
    }

    public void onVideoExitFullscreen() {
        Log.m105924i("MicroMsg.AppBrandXWVideoJsCallbackIMPL", "onVideoExitFullscreen, view[" + 0 + ']');
    }

    public void onVideoPause() {
    }

    public void onVideoPlay() {
    }

    public void onVideoPlaying() {
    }

    public void onVideoRateChange(double d) {
    }

    public void onVideoSeeked() {
    }

    public void onVideoSeeking() {
    }

    public void onVideoSizeUpdate(double d, double d2) {
    }

    public void onVideoTimeUpdate(double d, double d2, double[] dArr) {
    }

    public void onVideoVolumeChange(boolean z) {
    }

    public void onVideoWaiting() {
    }
}
