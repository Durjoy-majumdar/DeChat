package com.tencent.p014mm.plugin.downloader.event;

import android.content.BroadcastReceiver;
import com.tencent.p014mm.plugin.downloader.event.DownloadEventBus;

/* renamed from: com.tencent.mm.plugin.downloader.event.DownloadEventBus$$b */
public class DownloadEventBus$$b extends BroadcastReceiver {
    public DownloadEventBus$$b(DownloadEventBus.C409121 r1) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00be A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x00e3
            if (r6 != 0) goto L_0x0006
            goto L_0x00e3
        L_0x0006:
            java.lang.String r5 = r6.getAction()
            java.lang.String r0 = "MicroMsg.DownloadEventBus"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r1 == 0) goto L_0x001b
            java.lang.String r5 = "action is null or nill, ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
            return
        L_0x001b:
            java.lang.String r1 = "android.intent.action.PACKAGE_ADDED"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = "android.intent.action.PACKAGE_REPLACED"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x002c
            return
        L_0x002c:
            r5 = 0
            r1 = 1
            java.lang.String r6 = r6.getDataString()     // Catch:{ Exception -> 0x0033 }
            goto L_0x0043
        L_0x0033:
            r6 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r6)
            r2[r5] = r6
            java.lang.String r6 = "%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r6, r2)
            java.lang.String r6 = ""
        L_0x0043:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r5] = r6
            java.lang.String r3 = "get added package name : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r2 == 0) goto L_0x0058
            java.lang.String r5 = "get installed broadcast, while the package name is null or nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
            return
        L_0x0058:
            java.lang.String r2 = "package:"
            boolean r2 = r6.startsWith(r2)
            if (r2 == 0) goto L_0x0067
            r2 = 8
            java.lang.String r6 = r6.substring(r2)
        L_0x0067:
            boolean r2 = f40.C86709a0.m107522a()
            if (r2 == 0) goto L_0x00de
            boolean r2 = f40.C86718e.m107551r()
            if (r2 == 0) goto L_0x0074
            goto L_0x00de
        L_0x0074:
            z41.b r0 = com.tencent.p014mm.plugin.downloader.model.C40933j.m44317f()
            r2 = 0
            if (r0 != 0) goto L_0x007c
            goto L_0x0089
        L_0x007c:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r3 == 0) goto L_0x008b
            java.lang.String r5 = "MicroMsg.FileDownloadInfoStorage"
            java.lang.String r6 = "Null or nil PakcageName"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
        L_0x0089:
            r6 = r2
            goto L_0x00b8
        L_0x008b:
            java.lang.String[] r3 = new java.lang.String[r1]
            r3[r5] = r6
            java.lang.String r5 = "select * from FileDownloadInfo where packageName=? order by downloadId desc"
            android.database.Cursor r5 = r0.rawQuery(r5, r3)
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            if (r5 != 0) goto L_0x009e
            goto L_0x00b8
        L_0x009e:
            boolean r0 = r5.moveToFirst()
            if (r0 == 0) goto L_0x00b5
        L_0x00a4:
            z41.a r0 = new z41.a
            r0.<init>()
            r0.convertFrom(r5)
            r6.add(r0)
            boolean r0 = r5.moveToNext()
            if (r0 != 0) goto L_0x00a4
        L_0x00b5:
            r5.close()
        L_0x00b8:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r6)
            if (r5 == 0) goto L_0x00bf
            return
        L_0x00bf:
            java.util.Iterator r5 = r6.iterator()
        L_0x00c3:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00d4
            java.lang.Object r6 = r5.next()
            z41.a r6 = (z41.C53736a) r6
            int r0 = r6.field_fileType
            if (r0 != r1) goto L_0x00c3
            r2 = r6
        L_0x00d4:
            if (r2 == 0) goto L_0x00dd
            r5 = 9
            long r0 = r2.field_downloadId
            com.tencent.p014mm.plugin.downloader.event.DownloadEventBus.m44272a(r5, r0)
        L_0x00dd:
            return
        L_0x00de:
            java.lang.String r5 = "no user login"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.downloader.event.DownloadEventBus$$b.onReceive(android.content.Context, android.content.Intent):void");
    }
}
