package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

import android.app.Service;
import android.content.Intent;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81591s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.l */
public class C81588l implements C81591s.C81592a {

    /* renamed from: a */
    public final LinkedList<Class<? extends Service>> f239258a = new LinkedList<>();

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fc, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f4  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo113864P(java.util.List<com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp> r8, com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel r9, int r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "MicroMsg.AppBrandForegroundNotificationManager"
            java.lang.String r1 = "onBackgroundRunningAppChanged, operation:%s, change:%s"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x00fd }
            r4 = 0
            r3[r4] = r9     // Catch:{ all -> 0x00fd }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00fd }
            r6 = 1
            r3[r6] = r5     // Catch:{ all -> 0x00fd }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)     // Catch:{ all -> 0x00fd }
            if (r10 != 0) goto L_0x0019
            monitor-exit(r7)
            return
        L_0x0019:
            if (r8 == 0) goto L_0x0024
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r4 = 1
            goto L_0x002b
        L_0x0024:
            java.lang.String r0 = "MicroMsg.AppBrandForegroundNotificationManager"
            java.lang.String r1 = "needForegroundNotify, apps is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00fd }
        L_0x002b:
            r0 = 0
            if (r10 == r2) goto L_0x00ca
            r1 = 4
            if (r10 != r1) goto L_0x0033
            goto L_0x00ca
        L_0x0033:
            if (r10 == r6) goto L_0x0038
            r1 = 3
            if (r10 != r1) goto L_0x006f
        L_0x0038:
            java.lang.String r10 = r9.f239226h     // Catch:{ all -> 0x00fd }
            if (r10 == 0) goto L_0x006f
            int r10 = r9.f239231p     // Catch:{ all -> 0x00fd }
            r1 = -1
            if (r10 == r1) goto L_0x006f
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r10 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.m103869I()     // Catch:{ all -> 0x00fd }
            int r1 = r9.f239231p     // Catch:{ all -> 0x00fd }
            com.tencent.luggage.sdk.processes.c r10 = r10.mo111388c(r1)     // Catch:{ all -> 0x00fd }
            com.tencent.mm.plugin.appbrand.task.k r10 = (com.tencent.p014mm.plugin.appbrand.task.C84310k) r10     // Catch:{ all -> 0x00fd }
            java.lang.Class<? extends android.app.Service> r10 = r10.f246196i     // Catch:{ all -> 0x00fd }
            int r9 = r9.f239225g     // Catch:{ all -> 0x00fd }
            if (r9 != r6) goto L_0x0064
            r9 = r8
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ all -> 0x00fd }
            r7.mo113865a(r9, r10)     // Catch:{ all -> 0x00fd }
            java.util.LinkedList<java.lang.Class<? extends android.app.Service>> r9 = r7.f239258a     // Catch:{ all -> 0x00fd }
            r9.remove(r10)     // Catch:{ all -> 0x00fd }
            java.util.LinkedList<java.lang.Class<? extends android.app.Service>> r9 = r7.f239258a     // Catch:{ all -> 0x00fd }
            r9.addFirst(r10)     // Catch:{ all -> 0x00fd }
            goto L_0x006f
        L_0x0064:
            r9 = r8
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ all -> 0x00fd }
            r7.mo113866b(r9, r10)     // Catch:{ all -> 0x00fd }
            java.util.LinkedList<java.lang.Class<? extends android.app.Service>> r9 = r7.f239258a     // Catch:{ all -> 0x00fd }
            r9.remove(r10)     // Catch:{ all -> 0x00fd }
        L_0x006f:
            if (r4 == 0) goto L_0x0099
            java.lang.String r9 = "MicroMsg.AppBrandForegroundNotificationManager"
            java.lang.String r10 = "onBackgroundRunningAppChanged, update notification by app changes"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)     // Catch:{ all -> 0x00fd }
            java.util.LinkedList<java.lang.Class<? extends android.app.Service>> r9 = r7.f239258a     // Catch:{ all -> 0x00fd }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x00fd }
            if (r9 != 0) goto L_0x0089
            java.util.LinkedList<java.lang.Class<? extends android.app.Service>> r9 = r7.f239258a     // Catch:{ all -> 0x00fd }
            java.lang.Object r9 = r9.getFirst()     // Catch:{ all -> 0x00fd }
            r0 = r9
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x00fd }
        L_0x0089:
            if (r0 == 0) goto L_0x0091
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x00fd }
            r7.mo113865a(r8, r0)     // Catch:{ all -> 0x00fd }
            goto L_0x00c8
        L_0x0091:
            java.lang.String r8 = "MicroMsg.AppBrandForegroundNotificationManager"
            java.lang.String r9 = "onBackgroundRunningAppChanged, update notification but foregroundServiceClass is null, ignored"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ all -> 0x00fd }
            goto L_0x00c8
        L_0x0099:
            java.lang.String r9 = "MicroMsg.AppBrandForegroundNotificationManager"
            java.lang.String r10 = "onBackgroundRunningAppChanged, cancel notification when no apps"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)     // Catch:{ all -> 0x00fd }
            java.util.LinkedList<java.lang.Class<? extends android.app.Service>> r9 = r7.f239258a     // Catch:{ all -> 0x00fd }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x00fd }
        L_0x00a6:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x00fd }
            if (r10 == 0) goto L_0x00c3
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x00fd }
            java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ all -> 0x00fd }
            if (r10 == 0) goto L_0x00bb
            r0 = r8
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x00fd }
            r7.mo113866b(r0, r10)     // Catch:{ all -> 0x00fd }
            goto L_0x00a6
        L_0x00bb:
            java.lang.String r10 = "MicroMsg.AppBrandForegroundNotificationManager"
            java.lang.String r0 = "onBackgroundRunningAppChanged, cancel notification but foregroundServiceClass is null, ignored"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ all -> 0x00fd }
            goto L_0x00a6
        L_0x00c3:
            java.util.LinkedList<java.lang.Class<? extends android.app.Service>> r8 = r7.f239258a     // Catch:{ all -> 0x00fd }
            r8.clear()     // Catch:{ all -> 0x00fd }
        L_0x00c8:
            monitor-exit(r7)
            return
        L_0x00ca:
            if (r4 == 0) goto L_0x00f4
            java.lang.String r9 = "MicroMsg.AppBrandForegroundNotificationManager"
            java.lang.String r10 = "onBackgroundRunningAppChanged, update notification by usage changes"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)     // Catch:{ all -> 0x00fd }
            java.util.LinkedList<java.lang.Class<? extends android.app.Service>> r9 = r7.f239258a     // Catch:{ all -> 0x00fd }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x00fd }
            if (r9 != 0) goto L_0x00e4
            java.util.LinkedList<java.lang.Class<? extends android.app.Service>> r9 = r7.f239258a     // Catch:{ all -> 0x00fd }
            java.lang.Object r9 = r9.getFirst()     // Catch:{ all -> 0x00fd }
            r0 = r9
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x00fd }
        L_0x00e4:
            if (r0 == 0) goto L_0x00ec
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x00fd }
            r7.mo113865a(r8, r0)     // Catch:{ all -> 0x00fd }
            goto L_0x00fb
        L_0x00ec:
            java.lang.String r8 = "MicroMsg.AppBrandForegroundNotificationManager"
            java.lang.String r9 = "onBackgroundRunningAppChanged, update notification but foregroundServiceClass is null, ignored"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ all -> 0x00fd }
            goto L_0x00fb
        L_0x00f4:
            java.lang.String r8 = "MicroMsg.AppBrandForegroundNotificationManager"
            java.lang.String r9 = "onBackgroundRunningAppChanged, update notification but notification is null, ignored"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ all -> 0x00fd }
        L_0x00fb:
            monitor-exit(r7)
            return
        L_0x00fd:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81588l.mo113864P(java.util.List, com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel, int):void");
    }

    /* renamed from: a */
    public final void mo113865a(ArrayList<? extends Parcelable> arrayList, Class<? extends Service> cls) {
        Intent intent = new Intent();
        intent.setClass(MMApplicationContext.getContext(), cls);
        intent.putParcelableArrayListExtra("key_apps", arrayList);
        Log.m105925i("MicroMsg.AppBrandForegroundNotificationManager", "onBackgroundRunningAppChanged, start foreground service:%s", cls);
        MMApplicationContext.getContext().startService(intent);
    }

    /* renamed from: b */
    public final void mo113866b(ArrayList<? extends Parcelable> arrayList, Class<? extends Service> cls) {
        Intent intent = new Intent();
        intent.setClass(MMApplicationContext.getContext(), cls);
        intent.putParcelableArrayListExtra("key_apps", arrayList);
        Log.m105925i("MicroMsg.AppBrandForegroundNotificationManager", "onBackgroundRunningAppChanged, stop foreground service:%s", cls);
        MMApplicationContext.getContext().stopService(intent);
    }
}
