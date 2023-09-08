package li0;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.media.music.AppBrandMusicClientService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import li0.C88514d;

/* renamed from: li0.i */
public abstract class C88537i extends C88539j implements ComponentCallbacks2 {

    /* renamed from: e */
    public final AppBrandRuntime f255739e;

    /* renamed from: f */
    public int f255740f = 0;

    /* renamed from: g */
    public final AppBrandMusicClientService.C83612a f255741g = new C88538a();

    /* renamed from: li0.i$a */
    public class C88538a implements AppBrandMusicClientService.C83612a {
        public C88538a() {
        }

        /* renamed from: a */
        public void mo115924a() {
        }

        /* renamed from: b */
        public void mo115925b() {
            C88537i.this.mo123004c(1);
        }

        public void onStop() {
            C88537i.this.mo123004c(1);
        }
    }

    public C88537i(C88540k kVar, AppBrandRuntime appBrandRuntime) {
        super(kVar);
        this.f255739e = appBrandRuntime;
    }

    /* renamed from: a */
    public final void mo123002a(int i) {
        Log.m105925i("MicroMsg.MultipleConditionBackgroundState", "addFlag, appId:%s, flag: %d", this.f255739e.f238147j, Integer.valueOf(i));
        this.f255740f = i | this.f255740f;
    }

    /* renamed from: b */
    public final void mo123003b(String str) {
        int i;
        boolean z = (this.f255740f & 1024) != 0;
        if (z) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            i = runningAppProcessInfo.importance;
            if (100 != i) {
                mo123004c(1024);
            }
        } else {
            i = -1;
        }
        Log.m105925i("MicroMsg.MultipleConditionBackgroundState", "checkRemoveFlagForForegroundService(%s), hasFlag?:%b, importance:%d, currentPauseType:%s", str, Boolean.valueOf(z), Integer.valueOf(i), C83231l.m102143d(this.f255739e.f238147j));
    }

    /* renamed from: c */
    public final void mo123004c(int i) {
        Message message;
        Log.m105925i("MicroMsg.MultipleConditionBackgroundState", "removeFlag, appId:%s, flag: %d", this.f255739e.f238147j, Integer.valueOf(i));
        int i2 = (~i) & this.f255740f;
        this.f255740f = i2;
        if (i2 == 0) {
            Log.m105925i("MicroMsg.MultipleConditionBackgroundState", "onKeepFlagsCleared, appId:%s", this.f255739e.f238147j);
            C88514d.C88525i iVar = (C88514d.C88525i) this;
            if (C88514d.this.getCurrentMessage() != null) {
                message = Message.obtain(C88514d.this.getHandler());
                message.copyFrom(C88514d.this.getCurrentMessage());
            } else {
                message = null;
            }
            Object[] objArr = new Object[3];
            objArr[0] = "|Background";
            objArr[1] = Integer.valueOf(message == null ? -1 : message.what);
            objArr[2] = Boolean.valueOf(iVar.f255723h);
            Log.m105925i("MicroMsg.MultipleConditionBackgroundState", "onKeepFlagsCleared %s, currentMsg.what:%d, mIsSystemScreenOff:%b", objArr);
            if (iVar.f255723h) {
                C88514d.this.mo122987s(C88514d.C88522g.ON_SYSTEM_SCREEN_OFF, (Object) null);
            } else {
                C88514d.this.mo122987s(C88514d.C88522g.ON_BACKGROUND_KEEP_FLAGS_CLEARED, message);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01bf, code lost:
        if ((r1 == null ? null : r1.mo113136o(r0)) != null) goto L_0x01c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void enter() {
        /*
            r9 = this;
            java.lang.Class<com.tencent.mm.plugin.appbrand.backgroundrunning.v> r0 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81594v.class
            java.lang.Class<li0.a> r1 = li0.C88507a.class
            r2 = 0
            r9.f255740f = r2
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = r9.f255739e
            java.lang.String r3 = r3.f238147j
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r4 = r9.f255739e
            com.tencent.mm.plugin.appbrand.jsapi.m r4 = r4.mo113018M(r1)
            li0.a r4 = (li0.C88507a) r4
            r5 = 1
            if (r4 == 0) goto L_0x001c
            boolean r4 = r4.f255657d
            if (r4 == 0) goto L_0x001c
            r4 = 1
            goto L_0x001d
        L_0x001c:
            r4 = 0
        L_0x001d:
            if (r4 == 0) goto L_0x0051
            boolean r4 = com.tencent.p014mm.plugin.appbrand.media.music.AppBrandMusicClientService.m102644a(r3)
            if (r4 == 0) goto L_0x0056
            r9.mo123002a(r5)
            com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService r4 = com.tencent.p014mm.plugin.appbrand.media.music.AppBrandMusicClientService.f244185c
            com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$a r6 = r9.f255741g
            r4.getClass()
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 != 0) goto L_0x0056
            if (r6 != 0) goto L_0x0038
            goto L_0x0056
        L_0x0038:
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$a> r7 = r4.f244186a
            boolean r7 = r7.containsKey(r3)
            if (r7 != 0) goto L_0x0046
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$a> r4 = r4.f244186a
            r4.put(r3, r6)
            goto L_0x0056
        L_0x0046:
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$a> r7 = r4.f244186a
            r7.remove(r3)
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$a> r4 = r4.f244186a
            r4.put(r3, r6)
            goto L_0x0056
        L_0x0051:
            com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService r4 = com.tencent.p014mm.plugin.appbrand.media.music.AppBrandMusicClientService.f244185c
            r4.mo115919b(r3)
        L_0x0056:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r4 = r9.f255739e
            com.tencent.mm.plugin.appbrand.jsapi.m r1 = r4.mo113018M(r1)
            li0.a r1 = (li0.C88507a) r1
            boolean r1 = r1.f255658e
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            r4[r2] = r6
            java.lang.String r6 = "MicroMsg.MultipleConditionBackgroundState"
            java.lang.String r7 = "addKeepFlagLocationIfNeed, canKeepAliveLocation:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r4)
            if (r1 == 0) goto L_0x00a7
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r9.f255739e
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.lbs.d0> r4 = com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82581d0.class
            com.tencent.mm.plugin.appbrand.jsapi.n r1 = r1.mo113032U(r4)
            com.tencent.mm.plugin.appbrand.jsapi.lbs.d0 r1 = (com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82581d0) r1
            if (r1 == 0) goto L_0x00a7
            boolean r4 = r1.f241702n
            if (r4 == 0) goto L_0x0087
            boolean r4 = r1.f241701j
            if (r4 == 0) goto L_0x0087
            r4 = 1
            goto L_0x0088
        L_0x0087:
            r4 = 0
        L_0x0088:
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            boolean r8 = r1.f241702n
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r7[r2] = r8
            boolean r1 = r1.f241701j
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7[r5] = r1
            java.lang.String r1 = "addKeepFlagLocationIfNeed, isBackgroundMode:%s, isListening:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r7)
            if (r4 == 0) goto L_0x00a7
            r1 = 32
            r9.mo123002a(r1)
        L_0x00a7:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r9.f255739e
            com.tencent.mm.plugin.appbrand.jsapi.n r1 = r1.mo113032U(r0)
            com.tencent.mm.plugin.appbrand.backgroundrunning.v r1 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81594v) r1
            java.lang.String r4 = "addKeepFlagAppBrandLiveVOIPIfNeed, isVOIPing:%s"
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r1.mo113872c()
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r7[r2] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r7)
            if (r1 == 0) goto L_0x00c9
            r1 = 64
            r9.mo123002a(r1)
        L_0x00c9:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r9.f255739e
            java.lang.Class<com.tencent.mm.plugin.appbrand.backgroundrunning.u> r7 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81593u.class
            com.tencent.mm.plugin.appbrand.jsapi.n r1 = r1.mo113032U(r7)
            com.tencent.mm.plugin.appbrand.backgroundrunning.u r1 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81593u) r1
            if (r1 == 0) goto L_0x00ed
            boolean r1 = r1.mo110363P()
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r7[r2] = r8
            java.lang.String r8 = "addKeepFlagAppBrandAudioBackgroundPlayIfNeed, isNeedKeepAlive:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r7)
            if (r1 == 0) goto L_0x00ed
            r1 = 128(0x80, float:1.794E-43)
            r9.mo123002a(r1)
        L_0x00ed:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r9.f255739e
            com.tencent.mm.plugin.appbrand.jsapi.n r0 = r1.mo113032U(r0)
            com.tencent.mm.plugin.appbrand.backgroundrunning.v r0 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81594v) r0
            if (r0 == 0) goto L_0x010d
            boolean r0 = r0.mo113872c()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r1[r2] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r1)
            if (r0 == 0) goto L_0x010d
            r0 = 256(0x100, float:3.59E-43)
            r9.mo123002a(r0)
        L_0x010d:
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f$a r0 = com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82234f.f241133b
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r9.f255739e
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.m r0 = r0.mo114632a(r1)
            if (r0 != 0) goto L_0x011d
            java.lang.String r0 = "addKeepFlagBluetoothIfNeed, client is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x0154
        L_0x011d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "addKeepFlagBluetoothIfNeed, client: "
            r1.append(r4)
            java.lang.String r4 = r0.mo114621b()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            boolean r0 = r0.mo114618P()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "addKeepFlagBluetoothIfNeed, isNeedKeepAlive: "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            if (r0 == 0) goto L_0x0154
            r0 = 512(0x200, float:7.175E-43)
            r9.mo123002a(r0)
        L_0x0154:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r9.f255739e
            boolean r0 = r0.mo113069n0()
            if (r0 != 0) goto L_0x015d
            goto L_0x0186
        L_0x015d:
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo
            r0.<init>()
            android.app.ActivityManager.getMyMemoryState(r0)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            int r4 = r0.importance
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = "addKeepFlagForForegroundService processInfo.importance:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r1)
            r1 = 100
            int r0 = r0.importance
            if (r1 != r0) goto L_0x0186
            r0 = 1024(0x400, float:1.435E-42)
            r9.mo123002a(r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0.registerComponentCallbacks(r9)
        L_0x0186:
            com.tencent.mm.plugin.appbrand.l$e r0 = com.tencent.p014mm.plugin.appbrand.C83231l.m102143d(r3)
            int r0 = r0.ordinal()
            r1 = 4
            if (r0 == r1) goto L_0x01a2
            r3 = 6
            if (r0 == r3) goto L_0x019e
            r1 = 7
            if (r0 == r1) goto L_0x0198
            goto L_0x01cc
        L_0x0198:
            r0 = 16
            r9.mo123002a(r0)
            goto L_0x01cc
        L_0x019e:
            r9.mo123002a(r1)
            goto L_0x01cc
        L_0x01a2:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r9.f255739e     // Catch:{ IllegalAccessError -> 0x01c7 }
            com.tencent.mm.plugin.appbrand.e3 r0 = r0.f238142e     // Catch:{ IllegalAccessError -> 0x01c7 }
            if (r0 != 0) goto L_0x01a9
            goto L_0x01cc
        L_0x01a9:
            br0.c r0 = r0.getWindowAndroid()     // Catch:{ IllegalAccessError -> 0x01c7 }
            boolean r0 = r0.mo109912s5()     // Catch:{ IllegalAccessError -> 0x01c7 }
            if (r0 == 0) goto L_0x01c1
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r9.f255739e     // Catch:{ IllegalAccessError -> 0x01c7 }
            com.tencent.mm.plugin.appbrand.e3 r1 = r0.f238142e     // Catch:{ IllegalAccessError -> 0x01c7 }
            if (r1 != 0) goto L_0x01bb
            r0 = 0
            goto L_0x01bf
        L_0x01bb:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r1.mo113136o(r0)     // Catch:{ IllegalAccessError -> 0x01c7 }
        L_0x01bf:
            if (r0 == 0) goto L_0x01cc
        L_0x01c1:
            r0 = 8
            r9.mo123002a(r0)     // Catch:{ IllegalAccessError -> 0x01c7 }
            goto L_0x01cc
        L_0x01c7:
            r0 = move-exception
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r1 != 0) goto L_0x01d7
        L_0x01cc:
            int r0 = r9.f255740f
            r9.f255740f = r0
            super.enter()
            r9.mo123004c(r2)
            return
        L_0x01d7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: li0.C88537i.enter():void");
    }

    public void exit() {
        super.exit();
        this.f255740f = 0;
        AppBrandMusicClientService appBrandMusicClientService = AppBrandMusicClientService.f244185c;
        String str = this.f255739e.f238147j;
        appBrandMusicClientService.getClass();
        if (!TextUtils.isEmpty(str) && appBrandMusicClientService.f244186a.containsKey(str)) {
            appBrandMusicClientService.f244186a.remove(str);
        }
        try {
            MMApplicationContext.getContext().unregisterComponentCallbacks(this);
        } catch (Exception unused) {
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        mo123003b("onLowMemory");
    }

    public void onTrimMemory(int i) {
        Log.m105925i("MicroMsg.MultipleConditionBackgroundState", "onTrimMemory level:%d", Integer.valueOf(i));
        mo123003b("onTrimMemory");
    }

    public boolean processMessage(Message message) {
        if (C88514d.C88522g.m110408a(message.what) == C88514d.C88522g.ON_STOP_BACKGROUND_LOCATION_LISTENING) {
            Log.m105924i("MicroMsg.MultipleConditionBackgroundState", "processMessage, ON_STOP_BACKGROUND_LOCATION_LISTENING");
            mo123004c(32);
            return true;
        } else if (C88514d.C88522g.m110408a(message.what) == C88514d.C88522g.ON_STOP_BACKGROUND_LIVE_VOIP) {
            Log.m105924i("MicroMsg.MultipleConditionBackgroundState", "processMessage, ON_STOP_BACKGROUND_LIVE_VOIP");
            mo123004c(64);
            return true;
        } else if (C88514d.C88522g.m110408a(message.what) == C88514d.C88522g.ON_STOP_AUDIO_BACKGROUND_PLAY) {
            Log.m105924i("MicroMsg.MultipleConditionBackgroundState", "processMessage, ON_STOP_AUDIO_BACKGROUND_PLAY");
            mo123004c(128);
            return true;
        } else if (C88514d.C88522g.m110408a(message.what) == C88514d.C88522g.ON_STOP_BACKGROUND_VOIP_1v1) {
            Log.m105924i("MicroMsg.MultipleConditionBackgroundState", "processMessage, ON_STOP_BACKGROUND_LIVE_VOIP");
            mo123004c(256);
            return true;
        } else if (C88514d.C88522g.m110408a(message.what) == C88514d.C88522g.ON_CONTAINER_FORCED_MOVE_TO_BACK) {
            Log.m105925i("MicroMsg.MultipleConditionBackgroundState", "processMessage, ON_CONTAINER_FORCED_MOVE_TO_BACK, appId:%s", this.f255739e.f238147j);
            mo123004c(4);
            return true;
        } else if (C88514d.C88522g.m110408a(message.what) == C88514d.C88522g.ON_STOP_BACKGROUND_BLUETOOTH) {
            Log.m105924i("MicroMsg.MultipleConditionBackgroundState", "processMessage, ON_STOP_BACKGROUND_BLUETOOTH");
            mo123004c(512);
            return true;
        } else if (C88514d.C88522g.m110408a(message.what) == C88514d.C88522g.ON_RESET_TO_TOP_OF_STACK) {
            Log.m105924i("MicroMsg.MultipleConditionBackgroundState", "processMessage, ON_RESET_TO_TOP_OF_STACK");
            mo123004c(16);
            return true;
        } else if (C88514d.C88522g.m110408a(message.what) != C88514d.C88522g.CHECK_PROCESS_IMPORTANCE) {
            return super.processMessage(message);
        } else {
            mo123003b("CHECK_PROCESS_IMPORTANCE");
            return true;
        }
    }
}
