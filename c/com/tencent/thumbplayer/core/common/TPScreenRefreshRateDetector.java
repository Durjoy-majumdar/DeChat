package com.tencent.thumbplayer.core.common;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Display;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public class TPScreenRefreshRateDetector {
    public static final int DISPLAY_CHANGE = 10001;
    /* access modifiers changed from: private */
    public static String TAG = "TPScreenRefreshRateDetector";
    private static boolean isInitted;
    private static List<ScreenRefreshRateChangedListener> listeners = new LinkedList();
    private static WeakReference<Context> mContext;
    private static float mCurScreenRefreshRate = 60.0f;
    private static DisplayManager.DisplayListener mDisplayListener = new DisplayManager.DisplayListener() {
        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            if (i == 0) {
                TPScreenRefreshRateDetector.mHandler.sendEmptyMessage(10001);
            }
            String access$100 = TPScreenRefreshRateDetector.TAG;
            TPNativeLog.printLog(2, access$100, "onDisplayChanged displayId:" + i);
        }

        public void onDisplayRemoved(int i) {
        }
    };
    /* access modifiers changed from: private */
    public static DisplayManager mDisplayManager = null;
    /* access modifiers changed from: private */
    public static Handler mHandler;
    private static WindowManager mWindowManager;

    public interface ScreenRefreshRateChangedListener {
        void onScreenRefreshRateChanged(float f);
    }

    public static void addListener(ScreenRefreshRateChangedListener screenRefreshRateChangedListener) {
        synchronized (TPScreenRefreshRateDetector.class) {
            listeners.add(screenRefreshRateChangedListener);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void deinit() {
        /*
            java.lang.Class<com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector> r0 = com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.class
            monitor-enter(r0)
            boolean r1 = isInitted     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x001c
            java.lang.ref.WeakReference<android.content.Context> r1 = mContext     // Catch:{ all -> 0x001e }
            if (r1 != 0) goto L_0x000c
            goto L_0x001c
        L_0x000c:
            r1.clear()     // Catch:{ all -> 0x001e }
            r1 = 0
            isInitted = r1     // Catch:{ all -> 0x001e }
            r1 = 2
            java.lang.String r2 = TAG     // Catch:{ all -> 0x001e }
            java.lang.String r3 = "TPScreenRefreshRateDetector deinit succeed!"
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r1, r2, r3)     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.deinit():void");
    }

    private static Looper getLooper() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static float getScreenRefreshRate() {
        if (Build.VERSION.SDK_INT < 23) {
            TPNativeLog.printLog(4, TAG, "Current version can not get screen refresh rate, set default.");
            return mCurScreenRefreshRate;
        }
        WeakReference<Context> weakReference = mContext;
        if (weakReference == null) {
            TPNativeLog.printLog(4, TAG, "Current mContext is null, set default.");
            return mCurScreenRefreshRate;
        }
        Context context = weakReference.get();
        if (context != null) {
            if (mWindowManager == null) {
                mWindowManager = (WindowManager) context.getSystemService("window");
            }
            if (mDisplayManager == null) {
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                mDisplayManager = displayManager;
                displayManager.registerDisplayListener(mDisplayListener, mHandler);
            }
            WindowManager windowManager = mWindowManager;
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Display.Mode[] supportedModes = defaultDisplay.getSupportedModes();
                Display.Mode mode = defaultDisplay.getMode();
                String str = TAG;
                TPNativeLog.printLog(2, str, "getMode width:" + mode.getPhysicalWidth() + " height:" + mode.getPhysicalHeight() + " refreshRate:" + mode.getRefreshRate() + " ModeId:" + mode.getModeId());
                String str2 = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("getSupportedModes length:");
                sb.append(supportedModes.length);
                TPNativeLog.printLog(2, str2, sb.toString());
                for (int i = 0; i < supportedModes.length; i++) {
                    String str3 = TAG;
                    TPNativeLog.printLog(2, str3, "getSupportedModes width:" + supportedModes[i].getPhysicalWidth() + " height:" + supportedModes[i].getPhysicalHeight() + " refreshRate:" + supportedModes[i].getRefreshRate() + " ModeId:" + supportedModes[i].getModeId());
                }
                mCurScreenRefreshRate = mode.getRefreshRate();
            }
        }
        return mCurScreenRefreshRate;
    }

    public static void init(Context context) {
        synchronized (TPScreenRefreshRateDetector.class) {
            TPNativeLog.printLog(2, TAG, "TPScreenRefreshRateDetector init enter!");
            if (!isInitted) {
                mContext = new WeakReference<>(context.getApplicationContext());
                isInitted = true;
                initHandleMsg();
                TPNativeLog.printLog(2, TAG, "TPScreenRefreshRateDetector init succeed!");
            }
        }
    }

    public static void initHandleMsg() {
        mHandler = new Handler(getLooper()) {
            public void handleMessage(Message message) {
                if (message.what == 10001 && TPScreenRefreshRateDetector.mDisplayManager != null) {
                    Display display = TPScreenRefreshRateDetector.mDisplayManager.getDisplay(0);
                    String mode = display.getMode().toString();
                    String access$100 = TPScreenRefreshRateDetector.TAG;
                    TPNativeLog.printLog(2, access$100, "handleMessage DISPLAY_CHANGE, mode:" + mode.toString());
                    TPScreenRefreshRateDetector.notifyScreenRefreshRateChange(display.getMode().getRefreshRate());
                }
                super.handleMessage(message);
            }
        };
    }

    /* access modifiers changed from: private */
    public static void notifyScreenRefreshRateChange(float f) {
        boolean z;
        if (Math.abs(f - mCurScreenRefreshRate) >= 1.0f) {
            String str = TAG;
            TPNativeLog.printLog(2, str, "notifyScreenRefreshRateChange Change From " + mCurScreenRefreshRate + " to " + f);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mCurScreenRefreshRate = f;
            synchronized (TPScreenRefreshRateDetector.class) {
                for (ScreenRefreshRateChangedListener onScreenRefreshRateChanged : listeners) {
                    onScreenRefreshRateChanged.onScreenRefreshRateChanged(f);
                }
            }
        }
    }

    public static void removeListener(ScreenRefreshRateChangedListener screenRefreshRateChangedListener) {
        synchronized (TPScreenRefreshRateDetector.class) {
            listeners.remove(screenRefreshRateChangedListener);
        }
    }
}
