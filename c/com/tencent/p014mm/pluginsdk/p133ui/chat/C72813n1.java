package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.content.ContentResolver;
import android.content.Context;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.n1 */
public class C72813n1 {

    /* renamed from: a */
    public Context f212208a;

    /* renamed from: b */
    public ContentResolver f212209b;

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.n1$a */
    public interface C72814a {
        int getYFromBottom();
    }

    public C72813n1(Context context) {
        this.f212208a = context;
        this.f212209b = context.getContentResolver();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00bd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00be  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.tencent.p014mm.pluginsdk.p133ui.chat.C72810m1> mo100636a(int r17, boolean r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.String r2 = "MicroMsg.RecentPhotoTips.ImageQuery"
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "date_added desc limit "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r11 = r4.toString()
            java.lang.String r4 = "_id"
            java.lang.String r5 = "_data"
            java.lang.String r12 = "date_added"
            java.lang.String[] r8 = new java.lang.String[]{r4, r5, r12}
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r9
            r14 = 0
            r15 = 1
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = ""
            r13 = 30
            if (r9 < r13) goto L_0x0086
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0144 }
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo()     // Catch:{ Exception -> 0x0144 }
            int r9 = r9.targetSdkVersion     // Catch:{ Exception -> 0x0144 }
            if (r9 < r13) goto L_0x0086
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ Exception -> 0x0144 }
            r9.<init>()     // Catch:{ Exception -> 0x0144 }
            java.lang.String r11 = "android:query-arg-limit"
            r9.putInt(r11, r0)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r0 = "android:query-arg-sort-columns"
            java.lang.String[] r11 = new java.lang.String[]{r12}     // Catch:{ Exception -> 0x0144 }
            r9.putStringArray(r0, r11)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r0 = "android:query-arg-sort-direction"
            r9.putInt(r0, r15)     // Catch:{ Exception -> 0x0144 }
            if (r18 == 0) goto L_0x007c
            java.lang.String r0 = "android:query-arg-sql-selection"
            java.lang.String r11 = "date_added <= ?"
            r9.putString(r0, r11)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r0 = "android:query-arg-sql-selection-args"
            java.lang.String[] r11 = new java.lang.String[r15]     // Catch:{ Exception -> 0x0144 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0144 }
            r13.<init>()     // Catch:{ Exception -> 0x0144 }
            r13.append(r6)     // Catch:{ Exception -> 0x0144 }
            r13.append(r10)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r6 = r13.toString()     // Catch:{ Exception -> 0x0144 }
            r11[r14] = r6     // Catch:{ Exception -> 0x0144 }
            r9.putStringArray(r0, r11)     // Catch:{ Exception -> 0x0144 }
        L_0x007c:
            android.content.ContentResolver r0 = r1.f212209b     // Catch:{ Exception -> 0x0144 }
            android.net.Uri r6 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0144 }
            r7 = 0
            android.database.Cursor r0 = r0.query(r6, r8, r9, r7)     // Catch:{ Exception -> 0x0144 }
            goto L_0x00bb
        L_0x0086:
            if (r18 == 0) goto L_0x00b1
            java.lang.String r0 = "query excludeImageWithFeatureDate"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ Exception -> 0x0144 }
            android.content.ContentResolver r0 = r1.f212209b     // Catch:{ Exception -> 0x0144 }
            android.net.Uri r9 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0144 }
            java.lang.String r13 = "date_added <= ?"
            java.lang.String[] r14 = new java.lang.String[r15]     // Catch:{ Exception -> 0x0144 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0144 }
            r15.<init>()     // Catch:{ Exception -> 0x0144 }
            r15.append(r6)     // Catch:{ Exception -> 0x0144 }
            r15.append(r10)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r6 = r15.toString()     // Catch:{ Exception -> 0x0144 }
            r7 = 0
            r14[r7] = r6     // Catch:{ Exception -> 0x0144 }
            r6 = r0
            r7 = r9
            r9 = r13
            r10 = r14
            android.database.Cursor r0 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0144 }
            goto L_0x00bb
        L_0x00b1:
            android.content.ContentResolver r6 = r1.f212209b     // Catch:{ Exception -> 0x0144 }
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0144 }
            r9 = 0
            r10 = 0
            android.database.Cursor r0 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0144 }
        L_0x00bb:
            if (r0 != 0) goto L_0x00be
            return r3
        L_0x00be:
            boolean r6 = r0.moveToFirst()
            if (r6 == 0) goto L_0x0140
        L_0x00c4:
            int r6 = r0.getColumnIndexOrThrow(r4)
            java.lang.String r6 = r0.getString(r6)
            int r7 = r0.getColumnIndexOrThrow(r5)
            java.lang.String r7 = r0.getString(r7)
            int r8 = r0.getColumnIndexOrThrow(r12)
            java.lang.String r8 = r0.getString(r8)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r9 != 0) goto L_0x0135
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r9 != 0) goto L_0x00e9
            goto L_0x0135
        L_0x00e9:
            java.lang.String r9 = a70.C112760b.m154240l()
            boolean r9 = r7.startsWith(r9)
            if (r9 == 0) goto L_0x00f9
            java.lang.String r6 = "exclude weixin path image"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            goto L_0x013a
        L_0x00f9:
            com.tencent.mm.pluginsdk.ui.chat.m1 r9 = new com.tencent.mm.pluginsdk.ui.chat.m1
            r9.<init>()
            r10 = 0
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r6, r10)
            r9.f212203a = r13
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r8, r10)
            r9.f212205c = r10
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r6 != 0) goto L_0x011a
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r6 == 0) goto L_0x011a
            r9.f212204b = r7
        L_0x011a:
            java.lang.String r6 = r9.f212204b
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x0131
            java.lang.String r6 = r9.f212204b
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x0131
            java.lang.String r6 = "thumb file and orignal file both not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r6)
            goto L_0x013a
        L_0x0131:
            r3.add(r9)
            goto L_0x013a
        L_0x0135:
            java.lang.String r6 = "file not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r6)
        L_0x013a:
            boolean r6 = r0.moveToNext()
            if (r6 != 0) goto L_0x00c4
        L_0x0140:
            r0.close()
            return r3
        L_0x0144:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = r0.toString()
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = "query photo exception e : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r3)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.chat.C72813n1.mo100636a(int, boolean):java.util.ArrayList");
    }
}
