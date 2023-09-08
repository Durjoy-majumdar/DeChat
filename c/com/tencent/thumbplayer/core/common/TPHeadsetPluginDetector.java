package com.tencent.thumbplayer.core.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TPHeadsetPluginDetector {
    private static final int AUDIO_TYPE_BLUETOOTH_A2DP = 2;
    private static final int AUDIO_TYPE_BUILTIN_OTHERS = 99;
    private static final int AUDIO_TYPE_BUILTIN_SPEAKER = 0;
    private static final int AUDIO_TYPE_HEADPHONES = 1;
    private static final String TAG = "TPHeadsetPluginDetector";
    private static boolean hasRegisterReceiver;
    private static boolean isInitted;
    private static List<HeadsetPluginListener> listeners = new LinkedList();
    private static WeakReference<Context> mContextRef;
    /* access modifiers changed from: private */
    public static Set<Integer> mCurOutputs = null;
    private static BroadcastReceiver mReceiver;

    public interface HeadsetPluginListener {
        void onHeadsetPlugin(Set<Integer> set, Set<Integer> set2);
    }

    public static class HeadsetPluginReceiver extends BroadcastReceiver {
        private HeadsetPluginReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            TPNativeLog.printLog(2, TPHeadsetPluginDetector.TAG, "onReceive: " + intent.getAction());
            Set access$100 = TPHeadsetPluginDetector.getAudioOutputs();
            int i = 0;
            if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                if (intent.hasExtra("state")) {
                    i = intent.getIntExtra("state", 0);
                }
                if (access$100 != null) {
                    if (i == 0) {
                        access$100.remove(1);
                    } else if (i == 1) {
                        access$100.add(1);
                    }
                }
                TPHeadsetPluginDetector.notifyAudioOutputStateChange(TPHeadsetPluginDetector.mCurOutputs, access$100);
            } else if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                if (access$100 != null) {
                    access$100.remove(1);
                }
                TPHeadsetPluginDetector.notifyAudioOutputStateChange(TPHeadsetPluginDetector.mCurOutputs, access$100);
            } else if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                if (access$100 != null) {
                    if (intExtra == 2) {
                        access$100.add(2);
                    } else if (intExtra == 0) {
                        access$100.remove(2);
                    }
                }
                TPHeadsetPluginDetector.notifyAudioOutputStateChange(TPHeadsetPluginDetector.mCurOutputs, access$100);
            }
        }
    }

    public static void addHeadsetPluginListener(HeadsetPluginListener headsetPluginListener) {
        synchronized (TPHeadsetPluginDetector.class) {
            if (listeners.add(headsetPluginListener) && !hasRegisterReceiver) {
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
            java.lang.Class<com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector> r0 = com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.class
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
            java.lang.String r2 = "TPHeadsetPluginDetector"
            java.lang.String r3 = "HeadsetPluginDetector deinit succeed!"
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.deinit():void");
    }

    private static AudioManager getAudioManager() {
        WeakReference<Context> weakReference;
        if (!isInitted || (weakReference = mContextRef) == null) {
            TPNativeLog.printLog(4, TAG, "getAudioManager failed, HeadsetPluginDetector is not init yet!");
            return null;
        }
        Context context = weakReference.get();
        if (context == null) {
            TPNativeLog.printLog(4, TAG, "getAudioManager failed, context is null, maybe is invalid!");
            return null;
        }
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            return audioManager;
        }
        TPNativeLog.printLog(4, TAG, "getAudioManager failed, audioMgr is null!");
        return null;
    }

    /* access modifiers changed from: private */
    public static Set<Integer> getAudioOutputs() {
        HashSet hashSet = new HashSet();
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            return hashSet;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            AudioDeviceInfo[] devices = audioManager.getDevices(2);
            if (devices != null) {
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    if (audioDeviceInfo.getType() == 2) {
                        hashSet.add(0);
                    } else if (audioDeviceInfo.getType() == 8) {
                        hashSet.add(2);
                    } else if (audioDeviceInfo.getType() == 3) {
                        hashSet.add(1);
                    }
                }
            }
        } else {
            hashSet.add(0);
            if (isHeadsetPlugin()) {
                hashSet.add(1);
            }
            if (isBluetoothPlugin()) {
                hashSet.add(2);
            }
        }
        return hashSet;
    }

    public static Set<Integer> getCurrentRoutes() {
        return mCurOutputs;
    }

    public static void init(Context context) {
        synchronized (TPHeadsetPluginDetector.class) {
            if (!isInitted) {
                mContextRef = new WeakReference<>(context.getApplicationContext());
                isInitted = true;
                initCurrentOutputs();
                TPNativeLog.printLog(2, TAG, "HeadsetPluginDetector init succeed!");
            }
        }
    }

    private static void initCurrentOutputs() {
        mCurOutputs = getAudioOutputs();
    }

    public static boolean isAudioRouteTypeOn(int i) {
        Set<Integer> set = mCurOutputs;
        if (set == null) {
            return false;
        }
        return set.contains(Integer.valueOf(i));
    }

    public static boolean isBluetoothPlugin() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            return false;
        }
        return audioManager.isBluetoothA2dpOn();
    }

    public static boolean isHeadsetPlugin() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            return false;
        }
        return audioManager.isWiredHeadsetOn();
    }

    /* access modifiers changed from: private */
    public static void notifyAudioOutputStateChange(Set<Integer> set, Set<Integer> set2) {
        if (set == null || set2 == null || set.size() != set2.size() || !set2.containsAll(set)) {
            mCurOutputs = set2;
            synchronized (TPHeadsetPluginDetector.class) {
                for (HeadsetPluginListener onHeadsetPlugin : listeners) {
                    onHeadsetPlugin.onHeadsetPlugin(set, set2);
                }
            }
        }
    }

    private static boolean registerDeviceCallback() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            return false;
        }
        audioManager.registerAudioDeviceCallback(new AudioDeviceCallback() {
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                TPNativeLog.printLog(2, TPHeadsetPluginDetector.TAG, "onAudioDevicesAdded!");
                TPHeadsetPluginDetector.notifyAudioOutputStateChange(TPHeadsetPluginDetector.mCurOutputs, TPHeadsetPluginDetector.getAudioOutputs());
            }

            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                TPNativeLog.printLog(2, TPHeadsetPluginDetector.TAG, "onAudioDevicesRemoved!");
                TPHeadsetPluginDetector.notifyAudioOutputStateChange(TPHeadsetPluginDetector.mCurOutputs, TPHeadsetPluginDetector.getAudioOutputs());
            }
        }, (Handler) null);
        return true;
    }

    private static void registerReceiver() {
        WeakReference<Context> weakReference;
        if (Build.VERSION.SDK_INT < 23 || !registerDeviceCallback()) {
            if (mReceiver == null) {
                mReceiver = new HeadsetPluginReceiver();
            }
            if (!isInitted || (weakReference = mContextRef) == null) {
                TPNativeLog.printLog(4, TAG, "registerReceiver failed, TPHeadsetPluginDetector is not init yet!");
                return;
            }
            Context context = weakReference.get();
            if (context == null) {
                TPNativeLog.printLog(4, TAG, "registerReceiver failed, context is null, maybe is invalid!");
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
            intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
            context.registerReceiver(mReceiver, intentFilter);
        }
    }

    public static void removeHeadsetPluginListener(HeadsetPluginListener headsetPluginListener) {
        synchronized (TPHeadsetPluginDetector.class) {
            listeners.remove(headsetPluginListener);
            if (listeners.isEmpty() && hasRegisterReceiver) {
                unregisterReceiver();
                hasRegisterReceiver = false;
            }
        }
    }

    private static void unregisterReceiver() {
        WeakReference<Context> weakReference;
        if (!isInitted || (weakReference = mContextRef) == null) {
            TPNativeLog.printLog(4, TAG, "registerReceiver failed, HeadsetPluginDetector is not init yet!");
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
