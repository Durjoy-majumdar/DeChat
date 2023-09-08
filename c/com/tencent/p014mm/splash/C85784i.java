package com.tencent.p014mm.splash;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.splash.i */
public class C85784i implements Handler.Callback {

    /* renamed from: h */
    public static final Set<String> f249844h = new HashSet(Arrays.asList(new String[]{"com.tencent.mm.plugin.wear.model.service.WearDataLayerService", "com.tencent.mm.plugin.account.model.AccountAuthenticatorService", "com.tencent.mm.plugin.account.model.ContactsSyncService", "com.tencent.mm.plugin.hld.WxHldService", "com.tencent.mm.plugin.fcm.WCFirebaseMessagingService", "com.tencent.mm.plugin.fcm.FCMInstanceIDListenerService", "com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCEService", "com.tencent.smtt.sandbox.SandboxedProcessService0", "com.tencent.smtt.sandbox.SandboxedProcessService1", "com.google.firebase.iid.FirebaseInstanceIdService", "com.google.firebase.messaging.FirebaseMessagingService", "com.google.android.gms.auth.api.signin.RevocationBoundService"}));

    /* renamed from: i */
    public static boolean f249845i = false;

    /* renamed from: j */
    public static Runnable f249846j;

    /* renamed from: n */
    public static boolean f249847n = false;

    /* renamed from: d */
    public Context f249848d;

    /* renamed from: e */
    public Object f249849e;

    /* renamed from: f */
    public Handler.Callback f249850f;

    /* renamed from: g */
    public boolean f249851g = false;

    public C85784i(Context context, Object obj, Handler.Callback callback) {
        this.f249848d = context;
        this.f249849e = obj;
        this.f249850f = callback;
    }

    /* renamed from: a */
    public final void mo119632a(Object obj) {
        if (C11171e.m11045b(25)) {
            try {
                if (C85786k.f249859g == null) {
                    Field declaredField = Class.forName("android.app.ActivityThread$ActivityClientRecord").getDeclaredField("mPreserveWindow");
                    declaredField.setAccessible(true);
                    C85786k.f249859g = declaredField;
                }
                if (obj instanceof IBinder) {
                    if (C85786k.f249860h == null) {
                        Field declaredField2 = this.f249849e.getClass().getDeclaredField("mActivities");
                        declaredField2.setAccessible(true);
                        C85786k.f249860h = (Map) declaredField2.get(this.f249849e);
                    }
                    obj = C85786k.f249860h.get(obj);
                }
                C85781g.m105955c("WxSplash.SplashHackHandlerCallback", "preserveWindow is %s, will set false", Boolean.valueOf(((Boolean) C85786k.f249859g.get(obj)).booleanValue()));
                C85786k.f249859g.set(obj, Boolean.FALSE);
            } catch (Exception e) {
                C85781g.m105956d(e, "");
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r1.f249851g
            java.lang.String r3 = "WxSplash.SplashHackHandlerCallback"
            r4 = 0
            if (r2 == 0) goto L_0x0013
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "found a infinite call loop"
            com.tencent.p014mm.splash.C85781g.m105955c(r3, r2, r0)
            return r4
        L_0x0013:
            java.lang.String r2 = "SplashHack.handleMessage"
            bp3.C79760s.m96908a(r2)     // Catch:{ all -> 0x01c1 }
            f249847n = r4     // Catch:{ all -> 0x01c1 }
            java.lang.String r2 = "before handleMessage %s, splash %s, pending early %s"
            r5 = 3
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x01c1 }
            int r7 = r0.what     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01c1 }
            r6[r4] = r7     // Catch:{ all -> 0x01c1 }
            boolean r7 = com.tencent.p014mm.splash.C85781g.f249831i     // Catch:{ all -> 0x01c1 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x01c1 }
            r8 = 1
            r6[r8] = r7     // Catch:{ all -> 0x01c1 }
            boolean r7 = com.tencent.p014mm.splash.C85781g.f249832j     // Catch:{ all -> 0x01c1 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x01c1 }
            r9 = 2
            r6[r9] = r7     // Catch:{ all -> 0x01c1 }
            com.tencent.p014mm.splash.C85781g.m105955c(r3, r2, r6)     // Catch:{ all -> 0x01c1 }
            boolean r2 = f249845i     // Catch:{ all -> 0x01c1 }
            if (r2 == 0) goto L_0x005c
            int r2 = r0.what     // Catch:{ all -> 0x01c1 }
            r6 = 987654321(0x3ade68b1, float:0.0016968456)
            if (r2 != r6) goto L_0x005c
            java.lang.Runnable r0 = f249846j     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "verify hack received."
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ all -> 0x01c1 }
            com.tencent.p014mm.splash.C85781g.m105955c(r3, r0, r2)     // Catch:{ all -> 0x01c1 }
            java.lang.Runnable r0 = f249846j     // Catch:{ all -> 0x01c1 }
            r0.run()     // Catch:{ all -> 0x01c1 }
        L_0x0058:
            bp3.C79760s.m96909b()
            return r8
        L_0x005c:
            boolean r2 = com.tencent.p014mm.splash.C85781g.f249831i     // Catch:{ all -> 0x01c1 }
            if (r2 == 0) goto L_0x0107
            boolean r2 = com.tencent.p014mm.splash.C85781g.f249832j     // Catch:{ all -> 0x01c1 }
            if (r2 != 0) goto L_0x0107
            java.lang.String r2 = "handleMessage %s, splash %s"
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch:{ all -> 0x01c1 }
            int r7 = r0.what     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01c1 }
            r6[r4] = r7     // Catch:{ all -> 0x01c1 }
            boolean r7 = com.tencent.p014mm.splash.C85781g.f249831i     // Catch:{ all -> 0x01c1 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x01c1 }
            r6[r8] = r7     // Catch:{ all -> 0x01c1 }
            com.tencent.p014mm.splash.C85781g.m105955c(r3, r2, r6)     // Catch:{ all -> 0x01c1 }
            int r2 = r0.what     // Catch:{ all -> 0x01c1 }
            r6 = 113(0x71, float:1.58E-43)
            if (r2 == r6) goto L_0x0099
            r6 = 114(0x72, float:1.6E-43)
            if (r2 == r6) goto L_0x0099
            r6 = 115(0x73, float:1.61E-43)
            if (r2 == r6) goto L_0x0099
            r6 = 116(0x74, float:1.63E-43)
            if (r2 == r6) goto L_0x0099
            r6 = 121(0x79, float:1.7E-43)
            if (r2 == r6) goto L_0x0099
            r6 = 122(0x7a, float:1.71E-43)
            if (r2 == r6) goto L_0x0099
            r6 = 145(0x91, float:2.03E-43)
            if (r2 != r6) goto L_0x0107
        L_0x0099:
            android.content.Context r2 = r1.f249848d     // Catch:{ all -> 0x01c1 }
            android.app.PendingIntent r2 = com.tencent.p014mm.splash.C85793p.m105966a(r2)     // Catch:{ all -> 0x01c1 }
            if (r2 == 0) goto L_0x00ee
            r2 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x00a6 }
        L_0x00a6:
            int r2 = android.os.Process.myPid()     // Catch:{ all -> 0x01c1 }
            k20.a r3 = new k20.a     // Catch:{ all -> 0x01c1 }
            r3.<init>()     // Catch:{ all -> 0x01c1 }
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01c1 }
            r3.mo10233c(r2)     // Catch:{ all -> 0x01c1 }
            java.lang.Object r2 = new java.lang.Object     // Catch:{ all -> 0x01c1 }
            r2.<init>()     // Catch:{ all -> 0x01c1 }
            java.lang.Object[] r10 = r3.mo10232b()     // Catch:{ all -> 0x01c1 }
            java.lang.String r11 = "com/tencent/mm/splash/SplashHackHandlerCallback"
            java.lang.String r12 = "handleMessage"
            java.lang.String r13 = "(Landroid/os/Message;)Z"
            java.lang.String r14 = "android/os/Process_EXEC_"
            java.lang.String r15 = "killProcess"
            java.lang.String r16 = "(I)V"
            r9 = r2
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01c1 }
            java.lang.Object r3 = r3.mo10231a(r4)     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x01c1 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x01c1 }
            android.os.Process.killProcess(r3)     // Catch:{ all -> 0x01c1 }
            java.lang.String r10 = "com/tencent/mm/splash/SplashHackHandlerCallback"
            java.lang.String r11 = "handleMessage"
            java.lang.String r12 = "(Landroid/os/Message;)Z"
            java.lang.String r13 = "android/os/Process_EXEC_"
            java.lang.String r14 = "killProcess"
            java.lang.String r15 = "(I)V"
            r9 = r2
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x01c1 }
        L_0x00ee:
            android.os.Message r2 = android.os.Message.obtain()     // Catch:{ all -> 0x01c1 }
            r2.copyFrom(r0)     // Catch:{ all -> 0x01c1 }
            java.util.ArrayList<android.os.Message> r0 = com.tencent.p014mm.splash.C85781g.f249824b     // Catch:{ all -> 0x01c1 }
            r0.add(r2)     // Catch:{ all -> 0x01c1 }
            com.tencent.mm.splash.e r0 = com.tencent.p014mm.splash.C85781g.f249829g     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x0103
            r0 = 512(0x200, float:7.175E-43)
            p787ai.C79546a.m96577a(r0)     // Catch:{ all -> 0x01c1 }
        L_0x0103:
            bp3.C79760s.m96909b()
            return r8
        L_0x0107:
            int r2 = r0.what     // Catch:{ all -> 0x01c1 }
            r6 = 126(0x7e, float:1.77E-43)
            if (r2 == r6) goto L_0x0117
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01c1 }
            r7 = 28
            if (r6 < r7) goto L_0x013e
            r6 = 160(0xa0, float:2.24E-43)
            if (r2 != r6) goto L_0x013e
        L_0x0117:
            java.util.Set<com.tencent.mm.splash.SplashActivity> r2 = com.tencent.p014mm.splash.C85781g.f249830h     // Catch:{ all -> 0x01c1 }
            java.util.HashSet r2 = (java.util.HashSet) r2     // Catch:{ all -> 0x01c1 }
            int r2 = r2.size()     // Catch:{ all -> 0x01c1 }
            if (r2 <= 0) goto L_0x0123
            f249847n = r8     // Catch:{ all -> 0x01c1 }
        L_0x0123:
            java.lang.String r2 = "received a RELAUNCH_ACTIVITY message, with %s splash activity"
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch:{ all -> 0x01c1 }
            java.util.Set<com.tencent.mm.splash.SplashActivity> r7 = com.tencent.p014mm.splash.C85781g.f249830h     // Catch:{ all -> 0x01c1 }
            java.util.HashSet r7 = (java.util.HashSet) r7     // Catch:{ all -> 0x01c1 }
            int r7 = r7.size()     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01c1 }
            r6[r4] = r7     // Catch:{ all -> 0x01c1 }
            com.tencent.p014mm.splash.C85781g.m105955c(r3, r2, r6)     // Catch:{ all -> 0x01c1 }
            java.lang.Object r2 = r0.obj     // Catch:{ all -> 0x01c1 }
            r1.mo119632a(r2)     // Catch:{ all -> 0x01c1 }
        L_0x013e:
            int r2 = r0.what     // Catch:{ all -> 0x01c1 }
            r6 = 134(0x86, float:1.88E-43)
            if (r2 != r6) goto L_0x01ad
            java.lang.Object r2 = r0.obj     // Catch:{ all -> 0x01c1 }
            boolean r6 = r2 instanceof java.lang.String     // Catch:{ all -> 0x01c1 }
            if (r6 == 0) goto L_0x01ad
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01c1 }
            java.lang.String r6 = "DOS_PROOF: remote crash msg: %s"
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch:{ all -> 0x01c1 }
            r7[r4] = r2     // Catch:{ all -> 0x01c1 }
            com.tencent.p014mm.splash.C85781g.m105955c(r3, r6, r7)     // Catch:{ all -> 0x01c1 }
            java.lang.String r6 = "did not then call Service.startForeground()"
            boolean r6 = r2.contains(r6)     // Catch:{ all -> 0x01c1 }
            if (r6 == 0) goto L_0x01ad
            java.lang.String r6 = "ServiceRecord{"
            int r6 = r2.indexOf(r6)     // Catch:{ all -> 0x01c1 }
            if (r6 < 0) goto L_0x01ad
            java.lang.String r2 = r2.substring(r6)     // Catch:{ all -> 0x01c1 }
            java.lang.String r6 = " +"
            java.lang.String[] r2 = r2.split(r6)     // Catch:{ all -> 0x01c1 }
            int r6 = r2.length     // Catch:{ all -> 0x01c1 }
            if (r6 < r5) goto L_0x01ad
            r2 = r2[r9]     // Catch:{ all -> 0x01c1 }
            java.lang.String r5 = "}"
            boolean r5 = r2.endsWith(r5)     // Catch:{ all -> 0x01c1 }
            if (r5 == 0) goto L_0x0186
            int r5 = r2.length()     // Catch:{ all -> 0x01c1 }
            int r5 = r5 - r8
            java.lang.String r2 = r2.substring(r4, r5)     // Catch:{ all -> 0x01c1 }
        L_0x0186:
            java.lang.String r2 = r2.trim()     // Catch:{ all -> 0x01c1 }
            android.content.ComponentName r2 = android.content.ComponentName.unflattenFromString(r2)     // Catch:{ all -> 0x01c1 }
            java.util.Set<java.lang.String> r5 = f249844h     // Catch:{ all -> 0x01c1 }
            java.lang.String r6 = r2.getClassName()     // Catch:{ all -> 0x01c1 }
            java.util.HashSet r5 = (java.util.HashSet) r5     // Catch:{ all -> 0x01c1 }
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x01c1 }
            if (r5 == 0) goto L_0x01ad
            java.lang.String r0 = "DOS_PROOF: DOS related to '%s' was avoided."
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x01c1 }
            java.lang.String r2 = r2.getClassName()     // Catch:{ all -> 0x01c1 }
            r5[r4] = r2     // Catch:{ all -> 0x01c1 }
            com.tencent.p014mm.splash.C85781g.m105955c(r3, r0, r5)     // Catch:{ all -> 0x01c1 }
            bp3.C79760s.m96909b()
            return r8
        L_0x01ad:
            android.os.Handler$Callback r2 = r1.f249850f     // Catch:{ all -> 0x01c1 }
            if (r2 == 0) goto L_0x01bd
            r1.f249851g = r8     // Catch:{ all -> 0x01c1 }
            boolean r0 = r2.handleMessage(r0)     // Catch:{ all -> 0x01c1 }
            r1.f249851g = r4     // Catch:{ all -> 0x01c1 }
            bp3.C79760s.m96909b()
            return r0
        L_0x01bd:
            bp3.C79760s.m96909b()
            return r4
        L_0x01c1:
            r0 = move-exception
            bp3.C79760s.m96909b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.splash.C85784i.handleMessage(android.os.Message):boolean");
    }
}
