package com.tencent.p014mm.plugin.appbrand.backgroundrunning.service;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService */
public class AppBrandForegroundNotificationService extends Service {

    /* renamed from: d */
    public NotificationManager f239260d;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        Log.m105924i("MicroMsg.AppBrandForegroundNotificationService", "onCreate");
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.AppBrandForegroundNotificationService", "onDestroy");
        stopForeground(false);
        super.onDestroy();
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r17, int r18, int r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.String r2 = "MicroMsg.AppBrandForegroundNotificationService"
            java.lang.String r3 = "onStartCommand"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r3 = 2
            if (r0 == 0) goto L_0x0334
            android.os.Bundle r4 = r17.getExtras()
            if (r4 != 0) goto L_0x0017
            goto L_0x0334
        L_0x0017:
            java.lang.String r4 = "key_apps"
            java.util.ArrayList r0 = r0.getParcelableArrayListExtra(r4)
            java.lang.String r4 = "MicroMsg.AppBrand.AppBrandForegroundNotificationCommons"
            r5 = 0
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L_0x02e5
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L_0x002c
            goto L_0x02e5
        L_0x002c:
            java.lang.String r8 = "preProcessApps"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L_0x003a
            r8 = r7
            goto L_0x0085
        L_0x003a:
            com.tencent.mm.plugin.appbrand.backgroundrunning.k$b r8 = new com.tencent.mm.plugin.appbrand.backgroundrunning.k$b
            r8.<init>(r7)
            java.util.Iterator r9 = r0.iterator()
        L_0x0043:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0085
            java.lang.Object r10 = r9.next()
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp r10 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) r10
            java.lang.String r11 = r10.f239215o
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x006e
            java.util.List<com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp> r11 = r8.f239254a
            if (r11 != 0) goto L_0x0066
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r0.size()
            r11.<init>(r12)
            r8.f239254a = r11
        L_0x0066:
            java.util.List<com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp> r11 = r8.f239254a
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            r11.add(r10)
            goto L_0x0043
        L_0x006e:
            java.util.List<com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp> r11 = r8.f239255b
            if (r11 != 0) goto L_0x007d
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r0.size()
            r11.<init>(r12)
            r8.f239255b = r11
        L_0x007d:
            java.util.List<com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp> r11 = r8.f239255b
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            r11.add(r10)
            goto L_0x0043
        L_0x0085:
            if (r8 != 0) goto L_0x008e
            java.lang.String r0 = "buildForegroundNotifications, backgroundRunningApps is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x02eb
        L_0x008e:
            java.util.List<com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp> r0 = r8.f239255b
            if (r0 == 0) goto L_0x01be
            r9 = r0
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x009d
            goto L_0x01be
        L_0x009d:
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r10[r5] = r0
            java.lang.String r0 = "buildNormalForegroundNotification, apps:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r10)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r9.iterator()
            r11 = r7
        L_0x00b0:
            boolean r12 = r10.hasNext()
            r13 = 16
            r14 = 4
            if (r12 == 0) goto L_0x00e4
            java.lang.Object r12 = r10.next()
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp r12 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) r12
            int r15 = r12.f239209f
            boolean r15 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81583j.m100070b(r15, r14)
            if (r15 == 0) goto L_0x00cf
            int r11 = r12.f239209f
            if (r11 == r14) goto L_0x00ce
            r0.add(r12)
        L_0x00ce:
            r11 = r12
        L_0x00cf:
            int r14 = r12.f239209f
            boolean r14 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81583j.m100070b(r14, r13)
            if (r14 == 0) goto L_0x00e0
            int r11 = r12.f239209f
            if (r11 == r13) goto L_0x00de
            r0.add(r12)
        L_0x00de:
            r11 = r12
            goto L_0x00b0
        L_0x00e0:
            r0.add(r12)
            goto L_0x00b0
        L_0x00e4:
            if (r11 == 0) goto L_0x0121
            java.lang.Object[] r10 = new java.lang.Object[r3]
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r15 = 2131821025(0x7f1101e1, float:1.9274782E38)
            java.lang.String r12 = r12.getString(r15)
            java.lang.Object[] r15 = new java.lang.Object[r6]
            java.lang.String r11 = r11.f239211h
            r15[r5] = r11
            java.lang.String r11 = java.lang.String.format(r12, r15)
            r10[r5] = r11
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r12 = 2131821028(0x7f1101e4, float:1.9274788E38)
            java.lang.String r11 = r11.getString(r12)
            r10[r6] = r11
            java.lang.String r11 = "%s %s"
            java.lang.String r10 = java.lang.String.format(r11, r10)
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81583j.m100069a(r0)
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r5] = r10
            r12[r6] = r0
            java.lang.String r0 = java.lang.String.format(r11, r12)
            goto L_0x0125
        L_0x0121:
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81583j.m100069a(r0)
        L_0x0125:
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
        L_0x012a:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x013a
            java.lang.Object r11 = r9.next()
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp r11 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) r11
            int r11 = r11.f239209f
            r10 = r10 | r11
            goto L_0x012a
        L_0x013a:
            com.tencent.mm.plugin.appbrand.backgroundrunning.j[] r9 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81583j.values()
            int r11 = r9.length
            r15 = r7
            r12 = 0
        L_0x0141:
            if (r12 >= r11) goto L_0x0186
            r7 = r9[r12]
            int r6 = r7.f239252d
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r6 == r5) goto L_0x0180
            if (r6 == r14) goto L_0x0180
            if (r6 != r13) goto L_0x0151
            goto L_0x0180
        L_0x0151:
            boolean r5 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81583j.m100070b(r10, r6)
            if (r5 == 0) goto L_0x0180
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r5 == 0) goto L_0x0168
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r6 = r7.f239253e
            java.lang.String r15 = r5.getString(r6)
            goto L_0x0180
        L_0x0168:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r6 = 0
            r5[r6] = r15
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r7 = r7.f239253e
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            r5[r7] = r6
            java.lang.String r6 = "%s、%s"
            java.lang.String r15 = java.lang.String.format(r6, r5)
        L_0x0180:
            int r12 = r12 + 1
            r5 = 0
            r6 = 1
            r7 = 0
            goto L_0x0141
        L_0x0186:
            s2.e$c r5 = new s2.e$c
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r7 = "reminder_channel_id"
            r5.<init>(r6, r7)
            r6 = 1
            r5.mo124384i(r3, r6)
            r5.mo124383h(r0)
            r5.mo124382g(r15)
            r0 = 2131233736(0x7f080bc8, float:1.8083618E38)
            android.app.Notification r6 = r5.f258814z
            r6.icon = r0
            long r6 = java.lang.System.currentTimeMillis()
            android.app.Notification r0 = r5.f258814z
            r0.when = r6
            android.app.Notification r0 = r5.mo124378b()
            r5 = 8
            r0.flags = r5
            r5 = -1
            r0.defaults = r5
            com.tencent.mm.plugin.appbrand.backgroundrunning.k$c r5 = new com.tencent.mm.plugin.appbrand.backgroundrunning.k$c
            r6 = 1025(0x401, float:1.436E-42)
            r5.<init>(r0, r6)
            goto L_0x01c4
        L_0x01be:
            java.lang.String r0 = "buildNormalForegroundNotification, apps is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r5 = 0
        L_0x01c4:
            java.util.List<com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp> r0 = r8.f239254a
            if (r0 == 0) goto L_0x02bd
            r6 = r0
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x01d3
            goto L_0x02bd
        L_0x01d3:
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r7 = 0
            r8[r7] = r0
            java.lang.String r0 = "buildCustomForegroundNotifications, apps:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r8)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = r6.size()
            r7.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L_0x01eb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x02c3
            java.lang.Object r0 = r6.next()
            r8 = r0
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp r8 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) r8
            java.lang.String r0 = r8.f239215o
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x02aa
            java.lang.String r0 = r8.f239207d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x020a
            goto L_0x02aa
        L_0x020a:
            java.lang.String r0 = r8.f239207d
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r9 = com.tencent.p014mm.plugin.appbrand.C81682d.m100222b(r0)
            if (r9 != 0) goto L_0x0220
            r10 = 1
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r8 = r8.f239207d
            r11 = 0
            r0[r11] = r8
            java.lang.String r8 = "buildCustomForegroundNotifications, runtime of %s is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r8, r0)
            goto L_0x01eb
        L_0x0220:
            r10 = 1
            r11 = 0
            java.lang.String r0 = r8.f239215o
            java.lang.Class r0 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81584k.m100071a(r0)
            if (r0 != 0) goto L_0x0236
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r8 = r8.f239207d
            r0[r11] = r8
            java.lang.String r8 = "buildCustomForegroundNotifications, customNotificationLogicClass of %s is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r8, r0)
            goto L_0x01eb
        L_0x0236:
            com.tencent.mm.plugin.appbrand.jsapi.n r0 = r9.mo113032U(r0)
            com.tencent.mm.plugin.appbrand.backgroundrunning.CustomBackgroundRunningNotificationLogic r0 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.CustomBackgroundRunningNotificationLogic) r0
            if (r0 != 0) goto L_0x0295
            java.lang.String r0 = r8.f239215o
            java.lang.String r10 = r8.f239207d
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r11] = r0
            r13 = 1
            r12[r13] = r10
            java.lang.String r14 = "createCustomNotificationLogic, customNotificationLogicClassName:%s, appId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r14, r12)
            java.lang.Class r0 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81584k.m100071a(r0)     // Catch:{ Exception -> 0x0267 }
            java.lang.Class[] r12 = new java.lang.Class[r13]     // Catch:{ Exception -> 0x0267 }
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r12[r11] = r14     // Catch:{ Exception -> 0x0267 }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r12)     // Catch:{ Exception -> 0x0267 }
            java.lang.Object[] r12 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0267 }
            r12[r11] = r10     // Catch:{ Exception -> 0x0267 }
            java.lang.Object r0 = r0.newInstance(r12)     // Catch:{ Exception -> 0x0267 }
            com.tencent.mm.plugin.appbrand.backgroundrunning.CustomBackgroundRunningNotificationLogic r0 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.CustomBackgroundRunningNotificationLogic) r0     // Catch:{ Exception -> 0x0267 }
            goto L_0x0281
        L_0x0267:
            r0 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "createCustomNotificationLogic fail since "
            r10.append(r11)
            java.lang.String r0 = r0.toString()
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            r0 = 0
        L_0x0281:
            if (r0 != 0) goto L_0x0292
            r10 = 1
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r8 = r8.f239207d
            r9 = 0
            r0[r9] = r8
            java.lang.String r8 = "buildCustomForegroundNotifications, customNotificationLogic of %s is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r8, r0)
            goto L_0x01eb
        L_0x0292:
            r9.mo113059i(r0)
        L_0x0295:
            r0.mo113826e()
            com.tencent.mm.plugin.appbrand.backgroundrunning.k$c r8 = new com.tencent.mm.plugin.appbrand.backgroundrunning.k$c
            android.app.Notification r9 = r0.mo113824c()
            int r0 = r0.mo113825d()
            r8.<init>(r9, r0)
            r7.add(r8)
            goto L_0x01eb
        L_0x02aa:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r9 = r8.f239215o
            r10 = 0
            r0[r10] = r9
            java.lang.String r8 = r8.f239207d
            r9 = 1
            r0[r9] = r8
            java.lang.String r8 = "buildCustomForegroundNotifications, customNotificationLogicClassName:%s, appId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r8, r0)
            goto L_0x01eb
        L_0x02bd:
            java.lang.String r0 = "buildCustomForegroundNotifications, apps is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r7 = 0
        L_0x02c3:
            if (r5 != 0) goto L_0x02ce
            if (r7 == 0) goto L_0x02ea
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x02ce
            goto L_0x02ea
        L_0x02ce:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r5 == 0) goto L_0x02d8
            r0.add(r5)
        L_0x02d8:
            if (r7 == 0) goto L_0x02e3
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L_0x02e3
            r0.addAll(r7)
        L_0x02e3:
            r7 = r0
            goto L_0x02eb
        L_0x02e5:
            java.lang.String r0 = "buildForegroundNotifications, apps is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
        L_0x02ea:
            r7 = 0
        L_0x02eb:
            if (r7 == 0) goto L_0x032d
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x02f4
            goto L_0x032d
        L_0x02f4:
            r4 = 0
            java.lang.Object r0 = r7.get(r4)
            com.tencent.mm.plugin.appbrand.backgroundrunning.k$c r0 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81584k.C81587c) r0
            int r2 = r0.f239257b
            android.app.Notification r0 = r0.f239256a
            r1.startForeground(r2, r0)
            int r0 = r7.size()
            r2 = 1
            if (r2 >= r0) goto L_0x032c
            r6 = 1
        L_0x030a:
            if (r6 >= r0) goto L_0x032c
            java.lang.Object r2 = r7.get(r6)
            com.tencent.mm.plugin.appbrand.backgroundrunning.k$c r2 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81584k.C81587c) r2
            android.app.NotificationManager r4 = r1.f239260d
            if (r4 != 0) goto L_0x0320
            java.lang.String r4 = "notification"
            java.lang.Object r4 = r1.getSystemService(r4)
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4
            r1.f239260d = r4
        L_0x0320:
            android.app.NotificationManager r4 = r1.f239260d
            int r5 = r2.f239257b
            android.app.Notification r2 = r2.f239256a
            r4.notify(r5, r2)
            int r6 = r6 + 1
            goto L_0x030a
        L_0x032c:
            return r3
        L_0x032d:
            java.lang.String r0 = "onStartCommand, notificationWrappers is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return r3
        L_0x0334:
            java.lang.String r0 = "onStartCommand, intent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService.onStartCommand(android.content.Intent, int, int):int");
    }

    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        Log.m105924i("MicroMsg.AppBrandForegroundNotificationService", "onTaskRemoved");
        ((NotificationManager) MMApplicationContext.getContext().getSystemService("notification")).cancel(1025);
        stopSelf();
    }
}
