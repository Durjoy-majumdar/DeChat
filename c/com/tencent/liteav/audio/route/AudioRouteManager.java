package com.tencent.liteav.audio.route;

import android.content.Context;
import android.media.AudioManager;
import android.os.HandlerThread;
import com.tencent.liteav.audio.route.C17069b;
import com.tencent.liteav.audio.route.C17082m;
import com.tencent.liteav.audio.route.C17092n;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.C17111b;

@JNINamespace("liteav::audio")
public class AudioRouteManager extends C17092n.C17093a {
    private static final int BLUETOOTH_SCO_RECONNECT_INTERVAL = 1000;
    private static final long IN_CALL_DETECTION_TIME = 500;
    private static final String TAG = "AudioRouteManager";
    private final AudioManager mAudioManager;
    /* access modifiers changed from: private */
    public final C17081l mAudioRouteSupervisor;
    private final C17092n mBroadcastReceiver;
    private C17067a mCurrentAudioIOScene;
    private String mCurrentRouteConfig;
    private C17069b.C17070a mCurrentRouteType;
    private C17067a mExpectedAudioIOScene;
    private final Runnable mForceUpdateRouteRunnable;
    private C17111b mHandler = null;
    private boolean mIsServiceStarted = false;
    /* access modifiers changed from: private */
    public final long mNativeAudioRouteManager;
    private C17082m.C17084a mSwitcher;
    private C17082m.C17084a.C17086a mSwitcherListener;

    public AudioRouteManager(long j) {
        C17067a aVar = C17067a.STOPPED;
        this.mCurrentAudioIOScene = aVar;
        this.mExpectedAudioIOScene = aVar;
        this.mCurrentRouteType = C17069b.C17070a.NONE;
        this.mSwitcher = null;
        this.mCurrentRouteConfig = "";
        this.mForceUpdateRouteRunnable = C17072c.m16849a(this);
        this.mSwitcherListener = new C17082m.C17084a.C17086a() {
            /* renamed from: a */
            public final void mo19317a(C17069b.C17070a aVar) {
                AudioRouteManager.nativeNotifyAudioRouteChangedFromJava(AudioRouteManager.this.mNativeAudioRouteManager, aVar.ordinal());
            }

            /* renamed from: b */
            public final void mo19318b(C17069b.C17070a aVar) {
                C17069b.C17070a aVar2 = C17069b.C17070a.BLUETOOTH_HEADSET;
                if (aVar == aVar2) {
                    Log.m97549w(AudioRouteManager.TAG, "switch to bluetooth failed, set it unavailable and update route again", new Object[0]);
                    AudioRouteManager.this.mAudioRouteSupervisor.mo19329a(aVar2, false);
                    AudioRouteManager.this.autoCheckRouteUpdate(false);
                    return;
                }
                Log.m97549w(AudioRouteManager.TAG, "switch to %s failed, do nothing", aVar);
            }
        };
        this.mNativeAudioRouteManager = j;
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mAudioRouteSupervisor = new C17081l();
        this.mAudioManager = (AudioManager) applicationContext.getSystemService("audio");
        this.mBroadcastReceiver = new C17092n(applicationContext, this);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void autoCheckRouteUpdate(boolean r7) {
        /*
            r6 = this;
            com.tencent.liteav.audio.route.a r0 = r6.mCurrentAudioIOScene
            com.tencent.liteav.audio.route.a r1 = com.tencent.liteav.audio.route.C17067a.STOPPED
            if (r0 != r1) goto L_0x000a
            r6.destroySwitcher()
            return
        L_0x000a:
            com.tencent.liteav.audio.route.l r0 = r6.mAudioRouteSupervisor
            boolean r1 = r0.f46062c
            r2 = 0
            if (r1 != 0) goto L_0x001c
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "AudioRouteSupervisor"
            java.lang.String r3 = "err in getHighestPriorityRoute(), it's not been initialized yet"
            com.tencent.liteav.base.Log.m97546e(r1, r3, r0)
            goto L_0x004e
        L_0x001c:
            java.util.HashMap<com.tencent.liteav.audio.route.b$a, com.tencent.liteav.audio.route.b> r0 = r0.f46061b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = r2
        L_0x0027:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0049
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            com.tencent.liteav.audio.route.b r3 = (com.tencent.liteav.audio.route.C17069b) r3
            if (r3 == 0) goto L_0x0027
            boolean r4 = r3.f46036b
            if (r4 == 0) goto L_0x0027
            if (r1 == 0) goto L_0x0047
            int r4 = r3.f46037c
            int r5 = r1.f46037c
            if (r4 < r5) goto L_0x0027
        L_0x0047:
            r1 = r3
            goto L_0x0027
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            com.tencent.liteav.audio.route.b$a r0 = r1.f46035a
            goto L_0x0050
        L_0x004e:
            com.tencent.liteav.audio.route.b$a r0 = com.tencent.liteav.audio.route.C17081l.f46060a
        L_0x0050:
            com.tencent.liteav.audio.route.b$a r1 = r6.mCurrentRouteType
            if (r1 != r0) goto L_0x0056
            if (r7 == 0) goto L_0x0099
        L_0x0056:
            r6.mCurrentRouteType = r0
            r6.destroySwitcher()
            android.media.AudioManager r7 = r6.mAudioManager
            com.tencent.liteav.base.util.b r1 = r6.mHandler
            com.tencent.liteav.audio.route.a r3 = r6.mCurrentAudioIOScene
            int[] r4 = com.tencent.liteav.audio.route.C17082m.C170831.f46063a
            int r0 = r0.ordinal()
            r0 = r4[r0]
            r4 = 1
            if (r0 == r4) goto L_0x0088
            r4 = 2
            if (r0 == r4) goto L_0x0082
            r4 = 3
            if (r0 == r4) goto L_0x007c
            r4 = 4
            if (r0 == r4) goto L_0x0076
            goto L_0x008d
        L_0x0076:
            com.tencent.liteav.audio.route.m$b r2 = new com.tencent.liteav.audio.route.m$b
            r2.<init>(r7, r1, r3)
            goto L_0x008d
        L_0x007c:
            com.tencent.liteav.audio.route.m$e r2 = new com.tencent.liteav.audio.route.m$e
            r2.<init>(r7, r1, r3)
            goto L_0x008d
        L_0x0082:
            com.tencent.liteav.audio.route.m$d r2 = new com.tencent.liteav.audio.route.m$d
            r2.<init>(r7, r1, r3)
            goto L_0x008d
        L_0x0088:
            com.tencent.liteav.audio.route.m$c r2 = new com.tencent.liteav.audio.route.m$c
            r2.<init>(r7, r1, r3)
        L_0x008d:
            r6.mSwitcher = r2
            com.tencent.liteav.audio.route.m$a$a r7 = r6.mSwitcherListener
            r2.mo19332a((com.tencent.liteav.audio.route.C17082m.C17084a.C17086a) r7)
            com.tencent.liteav.audio.route.m$a r7 = r6.mSwitcher
            r7.mo19330a()
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.audio.route.AudioRouteManager.autoCheckRouteUpdate(boolean):void");
    }

    private void destroySwitcher() {
        C17082m.C17084a aVar = this.mSwitcher;
        if (aVar != null) {
            aVar.mo19334b();
            this.mSwitcher = null;
        }
    }

    /* access modifiers changed from: private */
    public void handleBluetoothHeadsetChangedInternal(boolean z) {
        if (!this.mIsServiceStarted) {
            Log.m97547i(TAG, "ignore bluetooth headset changing, AudioRouteManager is not started", new Object[0]);
        } else if (this.mAudioRouteSupervisor.mo19329a(C17069b.C17070a.BLUETOOTH_HEADSET, z)) {
            autoCheckRouteUpdate(false);
        }
    }

    /* access modifiers changed from: private */
    public void handleBluetoothSCOChangedInternal(boolean z) {
        C17082m.C17084a aVar = this.mSwitcher;
        if (aVar != null) {
            aVar.mo19333a(z);
        }
        removeCallbacksOnWorkThread(this.mForceUpdateRouteRunnable);
        if (!z && this.mIsServiceStarted && this.mCurrentAudioIOScene != C17067a.STOPPED) {
            runOnWorkThread(this.mForceUpdateRouteRunnable, 1000);
        }
    }

    /* access modifiers changed from: private */
    public void handleWiredHeadsetChangedInternal(boolean z) {
        if (!this.mIsServiceStarted) {
            Log.m97547i(TAG, "ignore wired headset changing, AudioRouteManager is not started", new Object[0]);
        } else if (this.mAudioRouteSupervisor.mo19329a(C17069b.C17070a.WIRED_HEADSET, z)) {
            autoCheckRouteUpdate(false);
        }
    }

    public static /* synthetic */ void lambda$notifyAudioIOSceneChanged$2(AudioRouteManager audioRouteManager, int i) {
        audioRouteManager.mExpectedAudioIOScene = C17067a.m16846a(i);
        audioRouteManager.notifyAudioIOSceneChangedInternal();
    }

    /* access modifiers changed from: private */
    public static native void nativeNotifyAudioRouteChangedFromJava(long j, int i);

    /* access modifiers changed from: private */
    public void notifyAudioIOSceneChangedInternal() {
        Log.m97547i(TAG, "notify audio io scene changed, %s -> %s", this.mCurrentAudioIOScene, this.mExpectedAudioIOScene);
        if (this.mCurrentAudioIOScene != this.mExpectedAudioIOScene) {
            if (this.mAudioManager.getMode() == 2) {
                runOnWorkThread(C17074e.m16851a(this), 500);
                return;
            }
            int a = C17067a.m16845a(this.mExpectedAudioIOScene);
            Log.m97547i(TAG, "setMode to ".concat(String.valueOf(a)), new Object[0]);
            try {
                this.mAudioManager.setMode(a);
            } catch (Exception unused) {
                Log.m97549w(TAG, "AudioManager setMode failed, ignore it", new Object[0]);
            }
            C17067a aVar = this.mExpectedAudioIOScene;
            this.mCurrentAudioIOScene = aVar;
            C17082m.C17084a aVar2 = this.mSwitcher;
            if (aVar2 != null) {
                aVar2.mo19331a(aVar);
            } else {
                autoCheckRouteUpdate(false);
            }
        }
    }

    private void removeCallbacksOnWorkThread(Runnable runnable) {
        C17111b bVar = this.mHandler;
        if (bVar != null) {
            bVar.removeCallbacks(runnable);
        }
    }

    private void runOnWorkThread(Runnable runnable) {
        C17111b bVar = this.mHandler;
        if (bVar != null) {
            bVar.post(runnable);
        }
    }

    private void runOnWorkThreadAndWaitDone(Runnable runnable, long j) {
        C17111b bVar = this.mHandler;
        if (bVar != null) {
            bVar.mo19362a(runnable, j);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setHandFreeModeEnabledInternal(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.mIsServiceStarted
            r1 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r0 = "AudioRouteManager"
            java.lang.String r1 = "set handfree mode failed, AudioRouteManager is not started"
            com.tencent.liteav.base.Log.m97549w(r0, r1, r7)
            return
        L_0x0010:
            com.tencent.liteav.audio.route.l r0 = r6.mAudioRouteSupervisor
            boolean r2 = r0.f46062c
            java.lang.String r3 = "AudioRouteSupervisor"
            if (r2 != 0) goto L_0x0021
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r0 = "error in setHandFreeModeEnabled(), it's not been initialized yet"
            com.tencent.liteav.base.Log.m97546e(r3, r0, r7)
        L_0x001f:
            r7 = 0
            goto L_0x0062
        L_0x0021:
            java.util.HashMap<com.tencent.liteav.audio.route.b$a, com.tencent.liteav.audio.route.b> r2 = r0.f46061b
            com.tencent.liteav.audio.route.b$a r4 = com.tencent.liteav.audio.route.C17069b.C17070a.SPEAKERPHONE
            java.lang.Object r2 = r2.get(r4)
            com.tencent.liteav.audio.route.b r2 = (com.tencent.liteav.audio.route.C17069b) r2
            java.util.HashMap<com.tencent.liteav.audio.route.b$a, com.tencent.liteav.audio.route.b> r0 = r0.f46061b
            com.tencent.liteav.audio.route.b$a r4 = com.tencent.liteav.audio.route.C17069b.C17070a.EARPHONE
            java.lang.Object r0 = r0.get(r4)
            com.tencent.liteav.audio.route.b r0 = (com.tencent.liteav.audio.route.C17069b) r0
            if (r2 == 0) goto L_0x0059
            if (r0 != 0) goto L_0x003a
            goto L_0x0059
        L_0x003a:
            int r3 = r2.f46037c
            int r4 = r0.f46037c
            int r3 = java.lang.Math.min(r3, r4)
            int r4 = r2.f46037c
            int r5 = r0.f46037c
            int r4 = java.lang.Math.max(r4, r5)
            if (r7 == 0) goto L_0x004e
            r5 = r4
            goto L_0x004f
        L_0x004e:
            r5 = r3
        L_0x004f:
            r2.f46037c = r5
            if (r7 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r3 = r4
        L_0x0055:
            r0.f46037c = r3
            r7 = 1
            goto L_0x0062
        L_0x0059:
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r0 = "setHandFreeModeEnabled failed, speakerphone or earphone not existed"
            com.tencent.liteav.base.Log.m97546e(r3, r0, r7)
            goto L_0x001f
        L_0x0062:
            if (r7 == 0) goto L_0x0067
            r6.autoCheckRouteUpdate(r1)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.audio.route.AudioRouteManager.setHandFreeModeEnabledInternal(boolean):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b9 A[LOOP:0: B:19:0x005f->B:36:0x00b9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x002a A[EDGE_INSN: B:47:0x002a->B:9:0x002a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startInternal(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = r10.mIsServiceStarted
            java.lang.String r1 = "AudioRouteManager"
            r2 = 0
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = r10.mCurrentRouteConfig
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0010
            return
        L_0x0010:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "AudioRouteManager's been started, stop it first"
            com.tencent.liteav.base.Log.m97549w(r1, r3, r0)
            r10.stopInternal()
        L_0x001a:
            com.tencent.liteav.audio.route.l r0 = r10.mAudioRouteSupervisor
            boolean r3 = r0.f46062c
            java.lang.String r4 = "AudioRouteSupervisor"
            r5 = 1
            if (r3 == 0) goto L_0x002d
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "error in initialize(), it's already intialized"
            com.tencent.liteav.base.Log.m97549w(r4, r3, r0)
        L_0x002a:
            r0 = 0
            goto L_0x00bf
        L_0x002d:
            java.lang.String r3 = java.lang.String.valueOf(r11)
            java.lang.String r6 = "initialize from string: "
            java.lang.String r3 = r6.concat(r3)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            com.tencent.liteav.base.Log.m97547i(r4, r3, r6)
            if (r11 == 0) goto L_0x002a
            int r3 = r11.length()
            if (r3 > 0) goto L_0x0045
            goto L_0x002a
        L_0x0045:
            java.lang.String r3 = "[\n\r]"
            java.lang.String r6 = ""
            java.lang.String r3 = r11.replace(r3, r6)
            int r6 = r3.length()
            if (r6 > 0) goto L_0x0054
            goto L_0x002a
        L_0x0054:
            java.lang.String r6 = ";"
            java.lang.String[] r3 = r3.split(r6)
            int r6 = r3.length
            if (r6 > 0) goto L_0x005e
            goto L_0x002a
        L_0x005e:
            r6 = 0
        L_0x005f:
            int r7 = r3.length
            if (r6 >= r7) goto L_0x00bc
            r7 = r3[r6]
            com.tencent.liteav.audio.route.b$a r7 = com.tencent.liteav.audio.route.C17069b.C17070a.m16848a(r7)
            com.tencent.liteav.audio.route.b$a r8 = com.tencent.liteav.audio.route.C17069b.C17070a.NONE
            if (r7 != r8) goto L_0x007d
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "error, unknown route name: "
            java.lang.String r7 = r8.concat(r7)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            com.tencent.liteav.base.Log.m97546e(r4, r7, r8)
        L_0x007b:
            r7 = 0
            goto L_0x00b5
        L_0x007d:
            java.util.HashMap<com.tencent.liteav.audio.route.b$a, com.tencent.liteav.audio.route.b> r8 = r0.f46061b
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L_0x0095
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "error, existed route name: "
            java.lang.String r7 = r8.concat(r7)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            com.tencent.liteav.base.Log.m97546e(r4, r7, r8)
            goto L_0x007b
        L_0x0095:
            com.tencent.liteav.audio.route.b$a r8 = com.tencent.liteav.audio.route.C17069b.C17070a.EARPHONE
            if (r7 == r8) goto L_0x00a0
            com.tencent.liteav.audio.route.b$a r8 = com.tencent.liteav.audio.route.C17069b.C17070a.SPEAKERPHONE
            if (r7 != r8) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r8 = 0
            goto L_0x00a1
        L_0x00a0:
            r8 = 1
        L_0x00a1:
            com.tencent.liteav.audio.route.b r9 = new com.tencent.liteav.audio.route.b
            r9.<init>(r7, r6, r8)
            java.util.HashMap<com.tencent.liteav.audio.route.b$a, com.tencent.liteav.audio.route.b> r8 = r0.f46061b
            r8.put(r7, r9)
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r8[r2] = r7
            java.lang.String r7 = "add audio route, name: %s"
            com.tencent.liteav.base.Log.m97547i(r4, r7, r8)
            r7 = 1
        L_0x00b5:
            if (r7 != 0) goto L_0x00b9
            goto L_0x002a
        L_0x00b9:
            int r6 = r6 + 1
            goto L_0x005f
        L_0x00bc:
            r0.f46062c = r5
            r0 = 1
        L_0x00bf:
            if (r0 != 0) goto L_0x00c9
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.String r0 = "AudioRouteManager start failed"
            com.tencent.liteav.base.Log.m97546e(r1, r0, r11)
            return
        L_0x00c9:
            com.tencent.liteav.audio.route.n r0 = r10.mBroadcastReceiver
            com.tencent.liteav.audio.route.n$b r1 = r0.f46081b
            if (r1 != 0) goto L_0x00d8
            com.tencent.liteav.audio.route.n$b r1 = new com.tencent.liteav.audio.route.n$b
            android.content.Context r2 = r0.f46080a
            r1.<init>(r2)
            r0.f46081b = r1
        L_0x00d8:
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r2 = "android.intent.action.HEADSET_PLUG"
            r1.addAction(r2)
            java.lang.String r2 = "android.bluetooth.adapter.action.STATE_CHANGED"
            r1.addAction(r2)
            java.lang.String r2 = "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED"
            r1.addAction(r2)
            java.lang.String r2 = "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"
            r1.addAction(r2)
            android.content.Context r2 = r0.f46080a
            r2.registerReceiver(r0, r1)
            r10.updateAudioRouteStatus()
            r10.mCurrentRouteConfig = r11
            r10.mIsServiceStarted = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.audio.route.AudioRouteManager.startInternal(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public void stopInternal() {
        Log.m97547i(TAG, "stopInternal", new Object[0]);
        if (!this.mIsServiceStarted) {
            Log.m97546e(TAG, "AudioRouteManager is not started", new Object[0]);
            return;
        }
        destroySwitcher();
        try {
            this.mAudioManager.setMode(0);
        } catch (Exception unused) {
            Log.m97549w(TAG, "AudioManager setMode failed, ignore it", new Object[0]);
        }
        this.mCurrentRouteType = C17069b.C17070a.NONE;
        C17067a aVar = C17067a.STOPPED;
        this.mCurrentAudioIOScene = aVar;
        this.mExpectedAudioIOScene = aVar;
        C17092n nVar = this.mBroadcastReceiver;
        Context context = nVar.f46080a;
        if (context != null) {
            try {
                context.unregisterReceiver(nVar);
            } catch (Exception unused2) {
            }
            C17092n.C17094b bVar = nVar.f46081b;
            if (bVar != null) {
                synchronized (bVar.f46085c) {
                    if (!(bVar.f46083a == null || bVar.f46084b == null)) {
                        bVar.mo19340b();
                        bVar.f46084b = null;
                    }
                }
                nVar.f46081b = null;
            }
        }
        C17081l lVar = this.mAudioRouteSupervisor;
        if (!lVar.f46062c) {
            Log.m97549w("AudioRouteSupervisor", "error in uninitialize(), it's not been initialized yet", new Object[0]);
        } else {
            lVar.f46061b.clear();
            lVar.f46062c = false;
        }
        this.mCurrentRouteConfig = "";
        this.mIsServiceStarted = false;
    }

    private void updateAudioRouteStatus() {
        C17092n nVar = this.mBroadcastReceiver;
        if (nVar == null) {
            this.mAudioRouteSupervisor.mo19329a(C17069b.C17070a.BLUETOOTH_HEADSET, false);
        } else {
            C17081l lVar = this.mAudioRouteSupervisor;
            C17069b.C17070a aVar = C17069b.C17070a.BLUETOOTH_HEADSET;
            C17092n.C17094b bVar = nVar.f46081b;
            lVar.mo19329a(aVar, bVar == null ? false : bVar.mo19339a());
        }
        this.mAudioRouteSupervisor.mo19329a(C17069b.C17070a.WIRED_HEADSET, this.mAudioManager.isWiredHeadsetOn());
        this.mAudioRouteSupervisor.mo19329a(C17069b.C17070a.SPEAKERPHONE, true);
        this.mAudioRouteSupervisor.mo19329a(C17069b.C17070a.EARPHONE, true);
        autoCheckRouteUpdate(false);
    }

    public void initialize() {
        HandlerThread handlerThread = new HandlerThread("AudioRouteManagerLooper");
        handlerThread.start();
        this.mHandler = new C17111b(handlerThread.getLooper());
    }

    public void notifyAudioIOSceneChanged(int i, long j) {
        runOnWorkThreadAndWaitDone(C17077h.m16854a(this, i), j);
    }

    public void onBluetoothConnectionChanged(boolean z) {
        runOnWorkThread(C17080k.m16857a(this, z));
    }

    public void onBluetoothSCOConnected(boolean z) {
        runOnWorkThread(C17073d.m16850a(this, z));
    }

    public void onWiredHeadsetConnectionChanged(boolean z) {
        runOnWorkThread(C17079j.m16856a(this, z));
    }

    public void setHandFreeModeEnabled(boolean z) {
        runOnWorkThread(C17078i.m16855a(this, z));
    }

    public void start(String str) {
        runOnWorkThread(C17075f.m16852a(this, str));
    }

    public void stop() {
        runOnWorkThread(C17076g.m16853a(this));
    }

    public void uninitialize() {
        C17111b bVar = this.mHandler;
        this.mHandler = null;
        if (bVar != null) {
            bVar.mo19360a();
            try {
                bVar.getLooper().getThread().join();
            } catch (InterruptedException unused) {
            }
        }
    }

    private void runOnWorkThread(Runnable runnable, long j) {
        C17111b bVar = this.mHandler;
        if (bVar != null) {
            bVar.postDelayed(runnable, j);
        }
    }
}
