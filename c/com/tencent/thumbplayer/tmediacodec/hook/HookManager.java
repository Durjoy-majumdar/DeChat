package com.tencent.thumbplayer.tmediacodec.hook;

import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import com.tencent.thumbplayer.tmediacodec.hook.THookTextureView;
import com.tencent.thumbplayer.tmediacodec.util.LogUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class HookManager {
    private static final String TAG = "HookManager";
    /* access modifiers changed from: private */
    public static final Map<String, SurfaceCallback> sHoldCallbackMap = new ConcurrentHashMap();
    private static boolean sIsSurfaceMethodHooked;

    public static void hookSurfaceCallback(String str, SurfaceCallback surfaceCallback) {
        Map<String, SurfaceCallback> map = sHoldCallbackMap;
        map.put(str, surfaceCallback);
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "after hookSurfaceCallback size:" + map.size() + " mHoldCallbackMap:" + map);
        }
        if (!sIsSurfaceMethodHooked) {
            sIsSurfaceMethodHooked = true;
            THookTextureView.setHookCallback(new THookTextureView.SurfaceTextureHookCallback() {
                public boolean onSurfaceTextureDestroyedCalled(SurfaceTexture surfaceTexture) {
                    if (surfaceTexture == null) {
                        return true;
                    }
                    String obj = surfaceTexture.toString();
                    for (String equals : HookManager.sHoldCallbackMap.keySet()) {
                        if (TextUtils.equals(equals, obj)) {
                            SurfaceCallback surfaceCallback = (SurfaceCallback) HookManager.sHoldCallbackMap.get(obj);
                            if (surfaceCallback == null) {
                                return false;
                            }
                            surfaceCallback.onDestroy(surfaceTexture);
                            return false;
                        }
                    }
                    return true;
                }
            });
        }
    }

    public static void realReleaseSurfaceTexture(SurfaceTexture surfaceTexture) {
        try {
            LogUtils.m21886w(TAG, "realReleaseSurfaceTexture surfaceTexture:" + surfaceTexture);
            unHookSurfaceCallback(surfaceTexture.toString());
            surfaceTexture.release();
        } catch (Throwable th) {
            LogUtils.m21887w(TAG, "realReleaseSurfaceTexture surfaceTexture:" + surfaceTexture + " ignoreThrowable", th);
        }
    }

    public static void unHookSurfaceCallback(String str) {
        sHoldCallbackMap.remove(str);
    }
}
