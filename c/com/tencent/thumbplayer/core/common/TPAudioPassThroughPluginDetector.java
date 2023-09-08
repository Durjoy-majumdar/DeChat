package com.tencent.thumbplayer.core.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public class TPAudioPassThroughPluginDetector {
    private static final int DEFAULT_MAX_CHANNEL_COUNT = 8;
    private static final String TAG = "TPAudioPassThroughPluginDetector";
    private static boolean hasRegisterReceiver;
    private static boolean isInitted;
    private static List<AudioPassThroughPluginListener> listeners = new LinkedList();
    private static TPAudioPassThroughCapabilities mAudioPassThroughCapabilities = null;
    private static WeakReference<Context> mContextRef;
    private static Handler mHandler;
    private static boolean mIsAudioPassThroughPlugin = false;
    private static BroadcastReceiver mReceiver;

    public interface AudioPassThroughPluginListener {
        void onAudioPassThroughPlugin(boolean z);
    }

    public static class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        private HdmiAudioPlugBroadcastReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            TPNativeLog.printLog(2, TPAudioPassThroughPluginDetector.TAG, "HdmiAudioPlugBroadcastReceiver onReceive: " + intent.getAction());
            boolean z = false;
            int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0);
            if (intExtra != 0 && intExtra == 1) {
                z = true;
            }
            TPNativeLog.printLog(2, TPAudioPassThroughPluginDetector.TAG, "HdmiAudioPlugBroadcastReceiver audioPassThroughState:" + intExtra + " bPlugin:" + z);
            TPAudioPassThroughPluginDetector.onUpdateAudioCapabilities(new TPAudioPassThroughCapabilities(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)));
            TPAudioPassThroughPluginDetector.notifyAudioPassThroughStateChange(z);
        }
    }

    public static void addListener(AudioPassThroughPluginListener audioPassThroughPluginListener) {
        synchronized (TPAudioPassThroughPluginDetector.class) {
            if (listeners.add(audioPassThroughPluginListener) && !hasRegisterReceiver) {
                registerReceiver();
                hasRegisterReceiver = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void deinit() {
        /*
            java.lang.Class<com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector> r0 = com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.class
            monitor-enter(r0)
            boolean r1 = isInitted     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x001c
            java.lang.ref.WeakReference<android.content.Context> r1 = mContextRef     // Catch:{ all -> 0x001e }
            if (r1 != 0) goto L_0x000c
            goto L_0x001c
        L_0x000c:
            r1.clear()     // Catch:{ all -> 0x001e }
            r1 = 0
            isInitted = r1     // Catch:{ all -> 0x001e }
            r1 = 2
            java.lang.String r2 = "TPAudioPassThroughPluginDetector"
            java.lang.String r3 = "TPAudioPassThroughPluginDetector deinit succeed!"
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.deinit():void");
    }

    private static Looper getLooper() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static void init(Context context) {
        synchronized (TPAudioPassThroughPluginDetector.class) {
            TPNativeLog.printLog(2, TAG, "TPAudioPassThroughPluginDetector init enter!");
            if (!isInitted) {
                mContextRef = new WeakReference<>(context.getApplicationContext());
                isInitted = true;
                mHandler = new Handler(getLooper());
                registerReceiver();
                hasRegisterReceiver = true;
                TPNativeLog.printLog(2, TAG, "TPAudioPassThroughPluginDetector init succeed!");
            }
        }
    }

    public static boolean isAudioPassThroughPlugin() {
        boolean z;
        synchronized (TPAudioPassThroughPluginDetector.class) {
            z = mIsAudioPassThroughPlugin;
        }
        return z;
    }

    public static boolean isAudioPassThroughSupport(int i, int i2) {
        TPAudioPassThroughCapabilities tPAudioPassThroughCapabilities = mAudioPassThroughCapabilities;
        if (tPAudioPassThroughCapabilities != null) {
            return tPAudioPassThroughCapabilities.supportsEncoding(i) && i2 <= mAudioPassThroughCapabilities.getMaxChannelCount();
        }
        TPNativeLog.printLog(4, TAG, "isAudioPassThroughSupport failed, mAudioPassThroughCapabilities is not init yet!");
        return false;
    }

    /* access modifiers changed from: private */
    public static void notifyAudioPassThroughStateChange(boolean z) {
        if (mIsAudioPassThroughPlugin != z) {
            mIsAudioPassThroughPlugin = z;
            synchronized (TPAudioPassThroughPluginDetector.class) {
                for (AudioPassThroughPluginListener onAudioPassThroughPlugin : listeners) {
                    onAudioPassThroughPlugin.onAudioPassThroughPlugin(z);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static void onUpdateAudioCapabilities(TPAudioPassThroughCapabilities tPAudioPassThroughCapabilities) {
        if (!tPAudioPassThroughCapabilities.equals(mAudioPassThroughCapabilities)) {
            mAudioPassThroughCapabilities = tPAudioPassThroughCapabilities;
            TPNativeLog.printLog(2, TAG, "onUpdateAudioCapabilities AudioCapabilities:" + mAudioPassThroughCapabilities.toString());
        }
    }

    private static void registerReceiver() {
        TPNativeLog.printLog(2, TAG, "registerReceiver enter");
        if (Build.VERSION.SDK_INT >= 24) {
            if (!isInitted || mContextRef == null) {
                TPNativeLog.printLog(4, TAG, "registerReceiver failed, TPAudioPassThroughPluginDetector is not init yet!");
                return;
            }
            Intent intent = null;
            if (mReceiver == null) {
                mReceiver = new HdmiAudioPlugBroadcastReceiver();
            }
            Context context = mContextRef.get();
            if (context == null) {
                TPNativeLog.printLog(4, TAG, "registerReceiver failed, context is null, maybe is invalid!");
                return;
            }
            if (mReceiver != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.action.HDMI_AUDIO_PLUG");
                intent = context.registerReceiver(mReceiver, intentFilter, (String) null, mHandler);
            }
            mAudioPassThroughCapabilities = TPAudioPassThroughCapabilities.getCapabilities(context, intent);
            TPNativeLog.printLog(2, TAG, "registerReceiver leave");
        }
    }

    public static void removeListener(AudioPassThroughPluginListener audioPassThroughPluginListener) {
        synchronized (TPAudioPassThroughPluginDetector.class) {
            listeners.remove(audioPassThroughPluginListener);
            if (listeners.isEmpty() && hasRegisterReceiver) {
                unregisterReceiver();
                hasRegisterReceiver = false;
            }
        }
    }

    private static void unregisterReceiver() {
        WeakReference<Context> weakReference;
        if (!isInitted || (weakReference = mContextRef) == null) {
            TPNativeLog.printLog(4, TAG, "registerReceiver failed, TPAudioPassThroughPluginDetector is not init yet!");
            return;
        }
        Context context = weakReference.get();
        if (context == null) {
            TPNativeLog.printLog(4, TAG, "registerReceiver failed, context is null, maybe is invalid!");
        } else {
            context.unregisterReceiver(mReceiver);
        }
    }
}
