package com.tencent.tmsqmsp.oaid2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: com.tencent.tmsqmsp.oaid2.x */
public class C116486x {

    /* renamed from: g */
    public static volatile C116486x f349433g;

    /* renamed from: a */
    public C116485w f349434a = new C116485w("udid");

    /* renamed from: b */
    public C116485w f349435b = new C116485w("oaid");

    /* renamed from: c */
    public C116485w f349436c = new C116485w("aaid");

    /* renamed from: d */
    public C116485w f349437d = new C116485w("vaid");

    /* renamed from: e */
    public Boolean f349438e;

    /* renamed from: f */
    public BroadcastReceiver f349439f;

    /* renamed from: a */
    public static C106945z m164282a(Cursor cursor) {
        C106945z zVar = new C106945z((String) null, 0);
        if (cursor == null) {
            m164283b("parseValue fail, cursor is null.");
        } else if (!cursor.isClosed()) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex("value");
            if (columnIndex >= 0) {
                zVar.f320123c = cursor.getString(columnIndex);
            } else {
                m164283b("parseValue fail, index < 0.");
            }
            int columnIndex2 = cursor.getColumnIndex("code");
            if (columnIndex2 >= 0) {
                zVar.f320121a = cursor.getInt(columnIndex2);
            } else {
                m164283b("parseCode fail, index < 0.");
            }
            int columnIndex3 = cursor.getColumnIndex("expired");
            if (columnIndex3 >= 0) {
                zVar.f320122b = cursor.getLong(columnIndex3);
            } else {
                m164283b("parseExpired fail, index < 0.");
            }
        } else {
            m164283b("parseValue fail, cursor is closed.");
        }
        return zVar;
    }

    /* renamed from: b */
    public static void m164283b(String str) {
        C116445c.m164138a("MzOpenIdManager ".concat(String.valueOf(str)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b7, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c7, code lost:
        if (r2 != null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c9, code lost:
        r2.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x0039, B:14:0x0059] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x0039, B:16:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo179954a(android.content.Context r10, com.tencent.tmsqmsp.oaid2.C116485w r11) {
        /*
            r9 = this;
            r0 = 0
            if (r11 != 0) goto L_0x0005
            goto L_0x00cc
        L_0x0005:
            boolean r1 = r11.mo179951a()
            if (r1 != 0) goto L_0x00cd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "queryId : "
            r1.<init>(r2)
            java.lang.String r2 = r11.f349431c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            m164283b(r1)
            java.lang.String r1 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r3 = android.net.Uri.parse(r1)
            android.content.ContentResolver r2 = r10.getContentResolver()     // Catch:{ Exception -> 0x00c5, all -> 0x00be }
            r4 = 0
            r5 = 0
            r1 = 1
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ Exception -> 0x00c5, all -> 0x00be }
            java.lang.String r7 = r11.f349431c     // Catch:{ Exception -> 0x00c5, all -> 0x00be }
            r8 = 0
            r6[r8] = r7     // Catch:{ Exception -> 0x00c5, all -> 0x00be }
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00c5, all -> 0x00be }
            if (r2 != 0) goto L_0x0059
            r9.mo179956a((android.content.Context) r10, (boolean) r8)     // Catch:{ Exception -> 0x0057, all -> 0x00b7 }
            boolean r10 = r9.mo179956a((android.content.Context) r10, (boolean) r1)     // Catch:{ Exception -> 0x0057, all -> 0x00b7 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0057, all -> 0x00b7 }
            java.lang.String r1 = "forceQuery isSupported : "
            r11.<init>(r1)     // Catch:{ Exception -> 0x0057, all -> 0x00b7 }
            r11.append(r10)     // Catch:{ Exception -> 0x0057, all -> 0x00b7 }
            java.lang.String r10 = r11.toString()     // Catch:{ Exception -> 0x0057, all -> 0x00b7 }
            m164283b(r10)     // Catch:{ Exception -> 0x0057, all -> 0x00b7 }
            if (r2 == 0) goto L_0x0056
            r2.close()
        L_0x0056:
            return r0
        L_0x0057:
            goto L_0x00c7
        L_0x0059:
            com.tencent.tmsqmsp.oaid2.z r3 = m164282a((android.database.Cursor) r2)     // Catch:{ Exception -> 0x00ba, all -> 0x00b7 }
            java.lang.String r4 = r3.f320123c     // Catch:{ Exception -> 0x00ba, all -> 0x00b7 }
            r11.mo179950a((java.lang.String) r4)     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            long r5 = r3.f320122b     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            r11.mo179949a((long) r5)     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            int r5 = r3.f320121a     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            r11.mo179948a((int) r5)     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            r5.<init>()     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            java.lang.String r6 = r11.f349431c     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            r5.append(r6)     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            java.lang.String r6 = " errorCode : "
            r5.append(r6)     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            int r11 = r11.f349429a     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            r5.append(r11)     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            java.lang.String r11 = r5.toString()     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            m164283b(r11)     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            int r11 = r3.f320121a     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r11 != r3) goto L_0x0091
            r2.close()
            return r4
        L_0x0091:
            r9.mo179955a((android.content.Context) r10)     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            boolean r11 = r9.mo179956a((android.content.Context) r10, (boolean) r8)     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            if (r11 == 0) goto L_0x009e
            r2.close()
            return r4
        L_0x009e:
            boolean r10 = r9.mo179956a((android.content.Context) r10, (boolean) r1)     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            java.lang.String r1 = "not support, forceQuery isSupported: "
            r11.<init>(r1)     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            r11.append(r10)     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            java.lang.String r10 = r11.toString()     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            m164283b(r10)     // Catch:{ Exception -> 0x00c9, all -> 0x00b7 }
            r2.close()
            return r4
        L_0x00b7:
            r10 = move-exception
            r0 = r2
            goto L_0x00bf
        L_0x00ba:
            r2.close()
            return r0
        L_0x00be:
            r10 = move-exception
        L_0x00bf:
            if (r0 == 0) goto L_0x00c4
            r0.close()
        L_0x00c4:
            throw r10
        L_0x00c5:
            r2 = r0
        L_0x00c7:
            if (r2 == 0) goto L_0x00cc
        L_0x00c9:
            r2.close()
        L_0x00cc:
            return r0
        L_0x00cd:
            java.lang.String r10 = r11.f349432d
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.C116486x.mo179954a(android.content.Context, com.tencent.tmsqmsp.oaid2.w):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r10.resolveContentProvider("com.meizu.flyme.openidsdk", 0) == null) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        if (r10 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r10 != null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007d A[ExcHandler: all (r9v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r10 
      PHI: (r10v4 android.database.Cursor) = (r10v2 android.database.Cursor), (r10v5 android.database.Cursor) binds: [B:15:0x0036, B:20:0x0050] A[DONT_GENERATE, DONT_INLINE], Splitter:B:15:0x0036] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo179956a(android.content.Context r9, boolean r10) {
        /*
            r8 = this;
            java.lang.Boolean r0 = r8.f349438e
            r1 = 0
            if (r0 == 0) goto L_0x000d
            if (r10 != 0) goto L_0x000d
            boolean r1 = r0.booleanValue()
            goto L_0x008a
        L_0x000d:
            if (r9 != 0) goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0023
        L_0x0011:
            android.content.pm.PackageManager r10 = r9.getPackageManager()
            if (r10 != 0) goto L_0x0019
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            java.lang.String r2 = "com.meizu.flyme.openidsdk"
            android.content.pm.ProviderInfo r10 = r10.resolveContentProvider(r2, r1)
            if (r10 != 0) goto L_0x0023
            goto L_0x000f
        L_0x0023:
            if (r0 != 0) goto L_0x002f
            java.lang.String r9 = "is not Supported, for isLegalProvider : false"
            m164283b(r9)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.f349438e = r9
            goto L_0x008a
        L_0x002f:
            java.lang.String r10 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r3 = android.net.Uri.parse(r10)
            r10 = 0
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ Exception -> 0x004e, all -> 0x007d }
            r4 = 0
            r5 = 0
            java.lang.String r9 = "supported"
            java.lang.String[] r6 = new java.lang.String[]{r9}     // Catch:{ Exception -> 0x004e, all -> 0x007d }
            r7 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x004e, all -> 0x007d }
            if (r10 != 0) goto L_0x0050
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x004e, all -> 0x007d }
            r8.f349438e = r9     // Catch:{ Exception -> 0x004e, all -> 0x007d }
            goto L_0x0050
        L_0x004e:
            goto L_0x0084
        L_0x0050:
            com.tencent.tmsqmsp.oaid2.z r9 = m164282a((android.database.Cursor) r10)     // Catch:{ Exception -> 0x0079, all -> 0x007d }
            java.lang.String r9 = r9.f320123c     // Catch:{ Exception -> 0x0079, all -> 0x007d }
            java.lang.String r0 = "querySupport, result : "
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0079, all -> 0x007d }
            java.lang.String r0 = r0.concat(r2)     // Catch:{ Exception -> 0x0079, all -> 0x007d }
            m164283b(r0)     // Catch:{ Exception -> 0x0079, all -> 0x007d }
            java.lang.String r0 = "0"
            boolean r9 = r0.equals(r9)     // Catch:{ Exception -> 0x0079, all -> 0x007d }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x0079, all -> 0x007d }
            r8.f349438e = r9     // Catch:{ Exception -> 0x0079, all -> 0x007d }
            boolean r9 = r9.booleanValue()     // Catch:{ Exception -> 0x0079, all -> 0x007d }
            if (r10 == 0) goto L_0x0078
            r10.close()
        L_0x0078:
            return r9
        L_0x0079:
            if (r10 == 0) goto L_0x008a
            goto L_0x0087
        L_0x007d:
            r9 = move-exception
            if (r10 == 0) goto L_0x0083
            r10.close()
        L_0x0083:
            throw r9
        L_0x0084:
            if (r10 != 0) goto L_0x0087
            goto L_0x008a
        L_0x0087:
            r10.close()
        L_0x008a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.C116486x.mo179956a(android.content.Context, boolean):boolean");
    }

    /* renamed from: a */
    public final void mo179955a(Context context) {
        synchronized (this) {
            if (this.f349439f == null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
                C116484v vVar = new C116484v();
                this.f349439f = vVar;
                context.registerReceiver(vVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", (Handler) null);
            }
        }
    }

    /* renamed from: a */
    public static final C116486x m164281a() {
        if (f349433g == null) {
            synchronized (C116486x.class) {
                f349433g = new C116486x();
            }
        }
        return f349433g;
    }

    /* renamed from: a */
    public C116485w mo179953a(String str) {
        if ("oaid".equals(str)) {
            return this.f349435b;
        }
        if ("vaid".equals(str)) {
            return this.f349437d;
        }
        if ("aaid".equals(str)) {
            return this.f349436c;
        }
        if (!"udid".equals(str)) {
            return null;
        }
        return this.f349434a;
    }
}
