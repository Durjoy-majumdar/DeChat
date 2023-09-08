package com.tencent.xweb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.Surface;
import com.tencent.xweb.compatible.PinusAdaptClient;
import com.tencent.xweb.pinus.sdk.WebView;
import com.tencent.xweb.util.XWebLog;
import java.util.HashMap;

public class XWebExtendPluginClient extends PinusAdaptClient implements ExtendPluginClient {
    public static final String NATIVE_VIEW_TYPE = "native_view";
    private static final String TAG = "XWebExtendPluginClient";
    private final HashMap<Integer, XWebExtendPluginNativeViewClient> mNativeViewClientMap = new HashMap<>();
    public WebView obj;

    public XWebExtendPluginClient(XWebExtendInterface xWebExtendInterface) {
        super.init(xWebExtendInterface);
    }

    public void initPSWebView(WebView webView) {
        super.initPSWebView(webView);
    }

    public XWebExtendPluginNativeViewDelegate onNativeViewReady(int i) {
        return null;
    }

    public void onPluginDestroy(String str, int i) {
        if (NATIVE_VIEW_TYPE.equals(str) && this.mNativeViewClientMap.containsKey(Integer.valueOf(i))) {
            this.mNativeViewClientMap.get(Integer.valueOf(i)).dispose();
            this.mNativeViewClientMap.remove(Integer.valueOf(i));
        }
    }

    public void onPluginManagerDestroy() {
        XWebLog.m21911i(TAG, "[onPluginManagerDestroy]");
        for (XWebExtendPluginNativeViewClient dispose : this.mNativeViewClientMap.values()) {
            dispose.dispose();
        }
        this.mNativeViewClientMap.clear();
    }

    public void onPluginReady(String str, int i, SurfaceTexture surfaceTexture) {
    }

    public void onPluginReadyForGPUProcess(String str, int i, Surface surface) {
    }

    public void onPluginScreenshotTaken(String str, int i, Bitmap bitmap) {
    }

    public void onPluginSizeChanged(String str, int i, int i2, int i3, SurfaceTexture surfaceTexture) {
        if (NATIVE_VIEW_TYPE.equals(str)) {
            if (!this.mNativeViewClientMap.containsKey(Integer.valueOf(i))) {
                XWebExtendPluginNativeViewDelegate onNativeViewReady = onNativeViewReady(i);
                if (onNativeViewReady != null) {
                    XWebExtendPluginNativeViewClient xWebExtendPluginNativeViewClient = new XWebExtendPluginNativeViewClient((Context) null, surfaceTexture, i2, i3);
                    this.mNativeViewClientMap.put(Integer.valueOf(i), xWebExtendPluginNativeViewClient);
                    onNativeViewReady.setClient(xWebExtendPluginNativeViewClient);
                    xWebExtendPluginNativeViewClient.setDelegate(onNativeViewReady);
                } else {
                    XWebLog.m21909e(TAG, "onPluginSizeChanged, onNativeViewReady return null");
                    return;
                }
            }
            this.mNativeViewClientMap.get(Integer.valueOf(i)).onSizeChanged(i2, i3);
        }
        XWebLog.m21911i(TAG, "onPluginSizeChanged type:" + str + ", embedId:" + i + ", width:" + i2 + ", height:" + i3);
        if (surfaceTexture != null && i2 > 0 && i3 > 0) {
            surfaceTexture.setDefaultBufferSize(i2, i3);
        }
    }

    public void onPluginSizeChangedForGPUProcess(String str, int i, int i2, int i3, Surface surface) {
        if (NATIVE_VIEW_TYPE.equals(str)) {
            if (!this.mNativeViewClientMap.containsKey(Integer.valueOf(i))) {
                XWebExtendPluginNativeViewDelegate onNativeViewReady = onNativeViewReady(i);
                if (onNativeViewReady != null) {
                    XWebExtendPluginNativeViewClient xWebExtendPluginNativeViewClient = new XWebExtendPluginNativeViewClient((Context) null, surface, i2, i3);
                    this.mNativeViewClientMap.put(Integer.valueOf(i), xWebExtendPluginNativeViewClient);
                    onNativeViewReady.setClient(xWebExtendPluginNativeViewClient);
                    xWebExtendPluginNativeViewClient.setDelegate(onNativeViewReady);
                } else {
                    XWebLog.m21909e(TAG, "onPluginSizeChanged onNativeViewReady return null");
                    return;
                }
            }
            this.mNativeViewClientMap.get(Integer.valueOf(i)).onSizeChanged(i2, i3);
        }
    }

    public void onPluginTouch(String str, int i, MotionEvent motionEvent) {
        if (NATIVE_VIEW_TYPE.equals(str) && this.mNativeViewClientMap.containsKey(Integer.valueOf(i))) {
            this.mNativeViewClientMap.get(Integer.valueOf(i)).getRootView().dispatchTouchEvent(motionEvent);
        }
    }

    public void onPluginTouch(String str, int i, String str2) {
    }

    public void setPluginTextureScale(String str, int i, float f, float f2) {
        if (this.xwebType == 1) {
            this.psWebview.setPluginTextureScale(str, i, f, f2);
        }
    }

    public void takePluginScreenshot(String str, int i) {
        if (this.xwebType == 1) {
            this.psWebview.takePluginScreenshot(str, i);
        }
    }
}
