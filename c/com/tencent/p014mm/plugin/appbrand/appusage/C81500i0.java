package com.tencent.p014mm.plugin.appbrand.appusage;

import android.database.Cursor;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p749xh.C38517a0;
import sx3.C110818d0;
import te3.e55;
import zh3.C91753f;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.i0 */
public final class C81500i0 extends MStorage {

    /* renamed from: f */
    public static final String[] f239100f = {MAutoStorage.getCreateSQLs(C29371c.f80157u, "AppBrandStarApp")};

    /* renamed from: g */
    public static final C81503d<e55> f239101g = new C81501a();

    /* renamed from: h */
    public static final C81503d<LocalUsageInfo> f239102h = new C81502b();

    /* renamed from: d */
    public final C91753f f239103d;

    /* renamed from: e */
    public final C29372e f239104e;

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.i0$c */
    public static final class C29371c extends C38517a0 {

        /* renamed from: t */
        public static final String[] f80156t;

        /* renamed from: u */
        public static final IAutoDBItem.MAutoDBInfo f80157u = C38517a0.initAutoDBInfo(C29371c.class);

        static {
            String[] strArr = {"username", "versionType"};
            f80156t = strArr;
            String str = " PRIMARY KEY ( ";
            for (String str2 : strArr) {
                str = str + ", " + str2;
            }
            StringBuilder sb = new StringBuilder();
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = f80157u;
            sb.append(mAutoDBInfo.sql);
            sb.append(",");
            sb.append(str.replaceFirst(",", "") + " )");
            mAutoDBInfo.sql = sb.toString();
        }

        public IAutoDBItem.MAutoDBInfo getDBInfo() {
            return f80157u;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.i0$e */
    public static final class C29372e extends MAutoStorage<C29371c> {
        public C29372e(C91753f fVar) {
            super(fVar, C29371c.f80157u, "AppBrandStarApp", C38517a0.f101569i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.i0$a */
    public class C81501a implements C81503d<e55> {
        /* renamed from: a */
        public long mo113797a(Object obj) {
            return (long) ((e55) obj).f132709e;
        }

        /* renamed from: b */
        public int mo113798b(Object obj) {
            return ((e55) obj).f132710f;
        }

        /* renamed from: c */
        public String mo113799c(Object obj) {
            return ((e55) obj).f132708d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.i0$b */
    public class C81502b implements C81503d<LocalUsageInfo> {
        /* renamed from: a */
        public /* bridge */ /* synthetic */ long mo113797a(Object obj) {
            LocalUsageInfo localUsageInfo = (LocalUsageInfo) obj;
            return 0;
        }

        /* renamed from: b */
        public int mo113798b(Object obj) {
            return ((LocalUsageInfo) obj).f239042f;
        }

        /* renamed from: c */
        public String mo113799c(Object obj) {
            return ((LocalUsageInfo) obj).f239040d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.i0$d */
    public interface C81503d<T> {
        /* renamed from: a */
        long mo113797a(T t);

        /* renamed from: b */
        int mo113798b(T t);

        /* renamed from: c */
        String mo113799c(T t);
    }

    public C81500i0(C91753f fVar) {
        this.f239103d = fVar;
        this.f239104e = new C29372e(fVar);
    }

    /* renamed from: Lo */
    public <T> void mo113790Lo(Class<T> cls, List<T> list, Long l) {
        C81503d dVar;
        int i = 0;
        if (cls == e55.class) {
            dVar = f239101g;
        } else if (cls == LocalUsageInfo.class) {
            dVar = f239102h;
        } else if (BuildInfo.DEBUG) {
            throw new IllegalArgumentException(String.format(Locale.US, "invalid class %s", new Object[]{cls.getSimpleName()}));
        } else {
            return;
        }
        long beginTransaction = this.f239103d.beginTransaction(Thread.currentThread().getId());
        this.f239103d.delete("AppBrandStarApp", "", (String[]) null);
        if (!Util.isNullOrNil((List) list)) {
            List<T> h0 = list != null ? C110818d0.m150936h0(list) : null;
            C29371c cVar = new C29371c();
            for (T next : h0) {
                if (!Util.isNullOrNil(dVar.mo113799c(next))) {
                    cVar.field_username = dVar.mo113799c(next);
                    cVar.field_versionType = dVar.mo113798b(next);
                    cVar.field_updateTime = dVar.mo113797a(next);
                    i++;
                    cVar.field_orderSequence = ((long) i) * ((long) (C81506j0.m99996a() * 2));
                    this.f239103d.insert("AppBrandStarApp", (String) null, cVar.convertTo());
                }
            }
        }
        this.f239103d.endTransaction(beginTransaction);
        doNotify(MStorageEventData.EventType.BATCH, 3, l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fc, code lost:
        if (r4.moveToFirst() != false) goto L_0x00fe;
     */
    /* renamed from: Ow */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo> mo113791Ow(int r22, com.tencent.p014mm.plugin.appbrand.appusage.C68585h1.C68586a r23, int r24) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            com.tencent.mm.plugin.appbrand.appusage.h1$a r2 = com.tencent.p014mm.plugin.appbrand.appusage.C68585h1.C68586a.ASC
            if (r23 != 0) goto L_0x000b
            com.tencent.mm.plugin.appbrand.appusage.h1$a r3 = com.tencent.p014mm.plugin.appbrand.appusage.C68585h1.C68586a.DESC
            goto L_0x000d
        L_0x000b:
            r3 = r23
        L_0x000d:
            com.tencent.mm.plugin.appbrand.appusage.h1$a r4 = com.tencent.p014mm.plugin.appbrand.appusage.C68585h1.C68586a.UPDATE_TIME_DESC
            java.lang.String r5 = "$%s$%d@starapp"
            r6 = 2
            r7 = 0
            r8 = 0
            r9 = 1
            if (r3 != r4) goto L_0x008e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "select AppBrandStarApp.username, AppBrandStarApp.versionType, AppBrandLocalUsageRecord.updateTime from AppBrandStarApp left outer join AppBrandLocalUsageRecord on AppBrandStarApp.username = AppBrandLocalUsageRecord.username and AppBrandStarApp.versionType = AppBrandLocalUsageRecord.versionType order by AppBrandLocalUsageRecord.updateTime desc limit "
            r2.append(r3)
            int r0 = java.lang.Math.max(r0, r9)
            r2.append(r0)
            java.lang.String r0 = " offset 0"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            zh3.f r2 = r1.f239103d
            android.database.Cursor r4 = r2.rawQuery(r0, r7)
            if (r4 != 0) goto L_0x003b
            goto L_0x008d
        L_0x003b:
            boolean r0 = r4.moveToFirst()
            if (r0 != 0) goto L_0x0045
            r4.close()
            goto L_0x008d
        L_0x0045:
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
        L_0x004a:
            java.lang.String r12 = r4.getString(r8)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r0 == 0) goto L_0x0055
            goto L_0x0078
        L_0x0055:
            int r13 = r4.getInt(r9)
            long r14 = r4.getLong(r6)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r8] = r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r2[r9] = r3
            java.lang.String r11 = java.lang.String.format(r0, r5, r2)
            r16 = 0
            java.lang.String r17 = ""
            com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo r0 = com.tencent.p014mm.plugin.appbrand.config.C81661j.m100178c(r11, r12, r13, r14, r16, r17)
            r10.add(r0)
        L_0x0078:
            boolean r0 = r4.moveToNext()
            if (r0 != 0) goto L_0x004a
            r4.close()
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = r10.size()
            r7.<init>(r0)
            r7.addAll(r10)
        L_0x008d:
            return r7
        L_0x008e:
            if (r0 > 0) goto L_0x0095
            int r0 = com.tencent.p014mm.plugin.appbrand.appusage.C81506j0.m99996a()
            goto L_0x009d
        L_0x0095:
            int r4 = com.tencent.p014mm.plugin.appbrand.appusage.C81506j0.m99996a()
            int r0 = java.lang.Math.min(r4, r0)
        L_0x009d:
            r4 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r10 = "versionType"
            r11 = r24
            if (r11 == r4) goto L_0x00c0
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r8] = r10
            java.lang.String r13 = "%s=?"
            java.lang.String r4 = java.lang.String.format(r4, r13, r12)
            java.lang.String[] r12 = new java.lang.String[r9]
            java.lang.String r11 = java.lang.String.valueOf(r24)
            r12[r8] = r11
            r16 = r4
            r17 = r12
            goto L_0x00c4
        L_0x00c0:
            r16 = r7
            r17 = r16
        L_0x00c4:
            zh3.f r13 = r1.f239103d
            java.lang.String r4 = "username"
            java.lang.String[] r15 = new java.lang.String[]{r4, r10}
            r18 = 0
            r19 = 0
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Object[] r10 = new java.lang.Object[r6]
            java.lang.String r11 = "orderSequence"
            r10[r8] = r11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10[r9] = r0
            java.lang.String r0 = "%s desc limit %d offset 0"
            java.lang.String r20 = java.lang.String.format(r4, r0, r10)
            java.lang.String r14 = "AppBrandStarApp"
            android.database.Cursor r4 = r13.query(r14, r15, r16, r17, r18, r19, r20)
            if (r4 != 0) goto L_0x00ef
            return r7
        L_0x00ef:
            if (r2 != r3) goto L_0x00f8
            boolean r0 = r4.moveToLast()     // Catch:{ all -> 0x015d }
            if (r0 == 0) goto L_0x0159
            goto L_0x00fe
        L_0x00f8:
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x015d }
            if (r0 == 0) goto L_0x0159
        L_0x00fe:
            java.util.LinkedList r7 = new java.util.LinkedList     // Catch:{ all -> 0x015d }
            r7.<init>()     // Catch:{ all -> 0x015d }
            com.tencent.mm.plugin.appbrand.appusage.i0$c r10 = new com.tencent.mm.plugin.appbrand.appusage.i0$c     // Catch:{ all -> 0x015d }
            r10.<init>()     // Catch:{ all -> 0x015d }
        L_0x0108:
            r10.convertFrom(r4)     // Catch:{ SQLiteException -> 0x0131 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ SQLiteException -> 0x0131 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ SQLiteException -> 0x0131 }
            java.lang.String r12 = r10.field_username     // Catch:{ SQLiteException -> 0x0131 }
            r11[r8] = r12     // Catch:{ SQLiteException -> 0x0131 }
            int r12 = r10.field_versionType     // Catch:{ SQLiteException -> 0x0131 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x0131 }
            r11[r9] = r12     // Catch:{ SQLiteException -> 0x0131 }
            java.lang.String r13 = java.lang.String.format(r0, r5, r11)     // Catch:{ SQLiteException -> 0x0131 }
            java.lang.String r14 = r10.field_username     // Catch:{ SQLiteException -> 0x0131 }
            int r15 = r10.field_versionType     // Catch:{ SQLiteException -> 0x0131 }
            r16 = -1
            r18 = 0
            java.lang.String r19 = ""
            com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo r0 = com.tencent.p014mm.plugin.appbrand.config.C81661j.m100178c(r13, r14, r15, r16, r18, r19)     // Catch:{ SQLiteException -> 0x0131 }
            r7.add(r0)     // Catch:{ SQLiteException -> 0x0131 }
            goto L_0x013d
        L_0x0131:
            r0 = move-exception
            java.lang.String r11 = "MicroMsg.AppBrandStarAppStorage"
            java.lang.String r12 = "convertFrom get exception:%s"
            java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ all -> 0x015d }
            r13[r8] = r0     // Catch:{ all -> 0x015d }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r12, r13)     // Catch:{ all -> 0x015d }
        L_0x013d:
            if (r2 != r3) goto L_0x0146
            boolean r0 = r4.moveToPrevious()     // Catch:{ all -> 0x015d }
            if (r0 == 0) goto L_0x014c
            goto L_0x0108
        L_0x0146:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x015d }
            if (r0 != 0) goto L_0x0108
        L_0x014c:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x015d }
            int r2 = r7.size()     // Catch:{ all -> 0x015d }
            r0.<init>(r2)     // Catch:{ all -> 0x015d }
            r0.addAll(r7)     // Catch:{ all -> 0x015d }
            r7 = r0
        L_0x0159:
            r4.close()
            return r7
        L_0x015d:
            r0 = move-exception
            r2 = r0
            r4.close()     // Catch:{ all -> 0x0163 }
            goto L_0x0168
        L_0x0163:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)
        L_0x0168:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appusage.C81500i0.mo113791Ow(int, com.tencent.mm.plugin.appbrand.appusage.h1$a, int):java.util.ArrayList");
    }

    /* renamed from: Yt */
    public ArrayList<AppBrandRecentTaskInfo> mo113792Yt(int i, C68585h1.C68586a aVar) {
        return mo113791Ow(i, aVar, Integer.MAX_VALUE);
    }

    public void add(MStorage.IOnStorageChange iOnStorageChange) {
        add("MicroMsg.AppBrandStarAppStorage.WORKER", iOnStorageChange);
    }

    /* renamed from: bD */
    public boolean mo113793bD(String str, int i) {
        Cursor cursor = null;
        if (!Util.isNullOrNil(str)) {
            cursor = this.f239103d.query("AppBrandStarApp", (String[]) null, String.format(Locale.US, "%s=? and %s=?", new Object[]{"username", "versionType"}), new String[]{str, String.valueOf(i)}, (String) null, (String) null, (String) null);
        }
        if (cursor == null) {
            return false;
        }
        boolean moveToFirst = cursor.moveToFirst();
        cursor.close();
        return moveToFirst;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a7, code lost:
        if (r14 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fc A[SYNTHETIC, Splitter:B:53:0x00fc] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013f A[Catch:{ all -> 0x0130, all -> 0x0136, SQLiteException | SQLiteException -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01d2 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01d4 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo113794jo(java.lang.String r18, int r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r18)
            r4 = -1
            if (r0 == 0) goto L_0x000e
            return r4
        L_0x000e:
            boolean r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r19)
            r5 = 3
            java.lang.String r6 = "MicroMsg.AppBrandStarAppStorage"
            r7 = 2
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L_0x0063
            wi0.e0 r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0()
            java.lang.String r10 = "appInfo"
            java.lang.String[] r10 = new java.lang.String[]{r10}
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r0 = r0.mo114000LL(r2, r10)
            if (r0 == 0) goto L_0x005e
            java.lang.String r10 = r0.field_appInfo
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0033
            goto L_0x005e
        L_0x0033:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r0 = r0.mo113940m2()
            long r10 = r0.f239486b
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r0.toSeconds(r12)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r9] = r2
            java.lang.Long r14 = java.lang.Long.valueOf(r10)
            r0[r8] = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r12)
            r0[r7] = r14
            java.lang.String r14 = "checkIsAddStarBlocked username[%s] until[%d] now[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r14, r0)
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x005e
            r0 = 1
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            if (r0 == 0) goto L_0x0063
            r0 = -3
            return r0
        L_0x0063:
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r12 = "orderSequence"
            r5[r9] = r12
            java.lang.String r13 = "AppBrandStarApp"
            r5[r8] = r13
            r5[r7] = r12
            java.lang.String r14 = "select %s from %s order by %s asc limit 1 offset 0"
            java.lang.String r0 = java.lang.String.format(r0, r14, r5)
            r5 = 0
            zh3.f r14 = r1.f239103d     // Catch:{ Exception -> 0x00ac }
            android.database.Cursor r14 = r14.rawQuery(r0, r5, r7)     // Catch:{ Exception -> 0x00ac }
            if (r14 == 0) goto L_0x00a7
            boolean r0 = r14.isClosed()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x008d
            goto L_0x00a7
        L_0x008d:
            boolean r0 = r14.moveToFirst()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x00a9
            long r15 = r14.getLong(r9)     // Catch:{ all -> 0x009b }
            r14.close()     // Catch:{ Exception -> 0x00ac }
            goto L_0x00ae
        L_0x009b:
            r0 = move-exception
            r15 = r0
            r14.close()     // Catch:{ all -> 0x00a1 }
            goto L_0x00a6
        L_0x00a1:
            r0 = move-exception
            r14 = r0
            r15.addSuppressed(r14)     // Catch:{ Exception -> 0x00ac }
        L_0x00a6:
            throw r15     // Catch:{ Exception -> 0x00ac }
        L_0x00a7:
            if (r14 == 0) goto L_0x00ac
        L_0x00a9:
            r14.close()     // Catch:{ Exception -> 0x00ac }
        L_0x00ac:
            r15 = 0
        L_0x00ae:
            int r0 = com.tencent.p014mm.plugin.appbrand.appusage.C81506j0.m99996a()
            int r0 = r0 * 2
            long r4 = (long) r0
            long r4 = r15 - r4
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Long r15 = java.lang.Long.valueOf(r4)
            r0[r9] = r15
            java.lang.String r15 = "jacob add orderseq %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r15, r0)
            boolean r0 = r17.mo113793bD(r18, r19)
            if (r0 != 0) goto L_0x00f9
            int r0 = r17.mo113796qq()
            int r15 = com.tencent.p014mm.plugin.appbrand.appusage.C81506j0.m99996a()
            if (r0 < r15) goto L_0x00d6
            r0 = -2
            return r0
        L_0x00d6:
            com.tencent.mm.plugin.appbrand.appusage.i0$c r0 = new com.tencent.mm.plugin.appbrand.appusage.i0$c
            r0.<init>()
            r0.field_username = r2
            r0.field_versionType = r3
            r0.field_updateTime = r10
            r0.field_orderSequence = r4
            com.tencent.mm.plugin.appbrand.appusage.i0$e r4 = r1.f239104e
            r4.insertNotify(r0, r9)
            boolean r4 = r17.mo113793bD(r18, r19)
            if (r4 == 0) goto L_0x00f6
            java.lang.String r4 = "single"
            r1.doNotify(r4, r7, r0)
            r0 = 1
            goto L_0x00f7
        L_0x00f6:
            r0 = 0
        L_0x00f7:
            r4 = r0
            goto L_0x00fa
        L_0x00f9:
            r4 = 1
        L_0x00fa:
            if (r4 == 0) goto L_0x0175
            zh3.f r0 = r1.f239103d     // Catch:{ SQLiteException -> 0x0145, SQLiteException -> 0x0143 }
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ SQLiteException -> 0x0145, SQLiteException -> 0x0143 }
            java.lang.String r10 = "select * from %s order by %s asc limit 1 offset 1"
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ SQLiteException -> 0x0145, SQLiteException -> 0x0143 }
            r11[r9] = r13     // Catch:{ SQLiteException -> 0x0145, SQLiteException -> 0x0143 }
            r11[r8] = r12     // Catch:{ SQLiteException -> 0x0145, SQLiteException -> 0x0143 }
            java.lang.String r5 = java.lang.String.format(r5, r10, r11)     // Catch:{ SQLiteException -> 0x0145, SQLiteException -> 0x0143 }
            r10 = 0
            android.database.Cursor r5 = r0.rawQuery(r5, r10)     // Catch:{ SQLiteException -> 0x0145, SQLiteException -> 0x0143 }
            if (r5 == 0) goto L_0x013c
            boolean r0 = r5.moveToFirst()     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x013c
            com.tencent.mm.plugin.appbrand.appusage.i0$c r0 = new com.tencent.mm.plugin.appbrand.appusage.i0$c     // Catch:{ all -> 0x0130 }
            r0.<init>()     // Catch:{ all -> 0x0130 }
            r0.convertFrom(r5)     // Catch:{ all -> 0x0130 }
            te3.ra4 r10 = new te3.ra4     // Catch:{ all -> 0x0130 }
            r10.<init>()     // Catch:{ all -> 0x0130 }
            java.lang.String r11 = r0.field_username     // Catch:{ all -> 0x0130 }
            r10.f185147d = r11     // Catch:{ all -> 0x0130 }
            int r0 = r0.field_versionType     // Catch:{ all -> 0x0130 }
            r10.f185148e = r0     // Catch:{ all -> 0x0130 }
            goto L_0x013d
        L_0x0130:
            r0 = move-exception
            r10 = r0
            r5.close()     // Catch:{ all -> 0x0136 }
            goto L_0x013b
        L_0x0136:
            r0 = move-exception
            r5 = r0
            r10.addSuppressed(r5)     // Catch:{ SQLiteException -> 0x0145, SQLiteException -> 0x0143 }
        L_0x013b:
            throw r10     // Catch:{ SQLiteException -> 0x0145, SQLiteException -> 0x0143 }
        L_0x013c:
            r10 = 0
        L_0x013d:
            if (r5 == 0) goto L_0x0150
            r5.close()     // Catch:{ SQLiteException -> 0x0145, SQLiteException -> 0x0143 }
            goto L_0x0150
        L_0x0143:
            r0 = move-exception
            goto L_0x0146
        L_0x0145:
            r0 = move-exception
        L_0x0146:
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r5[r9] = r0
            java.lang.String r0 = "addStarApp, try query prev record e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r5)
            r10 = 0
        L_0x0150:
            te3.ra4 r0 = new te3.ra4
            r0.<init>()
            r0.f185147d = r2
            r0.f185148e = r3
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.c> r3 = com.tencent.p014mm.plugin.appbrand.appusage.C81470c.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            com.tencent.mm.plugin.appbrand.appusage.c r3 = (com.tencent.p014mm.plugin.appbrand.appusage.C81470c) r3
            te3.sa4 r5 = new te3.sa4
            r5.<init>()
            r5.f185399d = r0
            r5.f185403h = r8
            r5.f185400e = r10
            r10 = 0
            r5.f185401f = r10
            com.tencent.mm.plugin.appbrand.appusage.o0$a r0 = com.tencent.p014mm.plugin.appbrand.appusage.C40434o0.C40435a.History
            r3.xx0(r5, r0)
            goto L_0x0176
        L_0x0175:
            r10 = 0
        L_0x0176:
            java.lang.Class<kr0.w0> r0 = kr0.C76629w0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            kr0.w0 r0 = (kr0.C76629w0) r0
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r0 = r0.mo106879N2(r2)
            if (r0 == 0) goto L_0x01b5
            java.lang.String r2 = r0.field_appId
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x01b5
            wi0.d r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.m99451h1()
            java.lang.String r3 = r0.field_appId
            java.lang.String r3 = wi0.C90992p.C90996d.m114165a(r3)
            java.lang.String r5 = "true"
            java.lang.String r2 = r2.mo61553Lo(r3, r5)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x01b5
            wi0.d r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.m99451h1()
            java.lang.String r0 = r0.field_appId
            java.lang.String r0 = wi0.C90992p.C90996d.m114165a(r0)
            r2.mo61554c(r0)
            goto L_0x01d0
        L_0x01b5:
            java.lang.Object[] r2 = new java.lang.Object[r7]
            if (r0 != 0) goto L_0x01bb
            r3 = 1
            goto L_0x01bc
        L_0x01bb:
            r3 = 0
        L_0x01bc:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2[r9] = r3
            if (r0 != 0) goto L_0x01c6
            r5 = r10
            goto L_0x01c8
        L_0x01c6:
            java.lang.String r5 = r0.field_appId
        L_0x01c8:
            r2[r8] = r5
            java.lang.String r0 = "restore receive status fail, attributes is null: %b, appId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r2)
        L_0x01d0:
            if (r4 == 0) goto L_0x01d4
            r4 = 0
            goto L_0x01d5
        L_0x01d4:
            r4 = -1
        L_0x01d5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appusage.C81500i0.mo113794jo(java.lang.String, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a4  */
    /* renamed from: kD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo113795kD(java.lang.String r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.tencent.mm.plugin.appbrand.appusage.i0$c r0 = new com.tencent.mm.plugin.appbrand.appusage.i0$c
            r0.<init>()
            r0.field_username = r7
            r0.field_versionType = r8
            com.tencent.mm.plugin.appbrand.appusage.i0$e r2 = r6.f239104e
            java.lang.String r3 = "versionType"
            java.lang.String r4 = "username"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            boolean r2 = r2.get(r0, (java.lang.String[]) r3)
            r3 = 1
            if (r2 == 0) goto L_0x003b
            com.tencent.mm.plugin.appbrand.appusage.i0$e r2 = r6.f239104e
            java.lang.String[] r4 = com.tencent.p014mm.plugin.appbrand.appusage.C81500i0.C29371c.f80156t
            r2.delete(r0, (boolean) r1, (java.lang.String[]) r4)
            boolean r2 = r6.mo113793bD(r7, r8)
            if (r2 != 0) goto L_0x0039
            r2 = 5
            java.lang.String r4 = "single"
            r6.doNotify(r4, r2, r0)
            goto L_0x003b
        L_0x0039:
            r0 = 0
            goto L_0x003c
        L_0x003b:
            r0 = 1
        L_0x003c:
            r2 = 0
            r4 = 2
            if (r0 == 0) goto L_0x0065
            if (r9 == 0) goto L_0x0065
            te3.ra4 r9 = new te3.ra4
            r9.<init>()
            r9.f185147d = r7
            r9.f185148e = r8
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.c> r8 = com.tencent.p014mm.plugin.appbrand.appusage.C81470c.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            com.tencent.mm.plugin.appbrand.appusage.c r8 = (com.tencent.p014mm.plugin.appbrand.appusage.C81470c) r8
            te3.sa4 r5 = new te3.sa4
            r5.<init>()
            r5.f185399d = r9
            r5.f185403h = r4
            r5.f185400e = r2
            r5.f185401f = r2
            com.tencent.mm.plugin.appbrand.appusage.o0$a r9 = com.tencent.p014mm.plugin.appbrand.appusage.C40434o0.C40435a.History
            r8.xx0(r5, r9)
        L_0x0065:
            java.lang.Class<kr0.w0> r8 = kr0.C76629w0.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            kr0.w0 r8 = (kr0.C76629w0) r8
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r7 = r8.mo106879N2(r7)
            if (r7 == 0) goto L_0x00a4
            java.lang.String r8 = r7.field_appId
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x00a4
            wi0.d r8 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.m99451h1()
            java.lang.String r9 = r7.field_appId
            java.lang.String r9 = wi0.C90992p.C90996d.m114165a(r9)
            java.lang.String r5 = "true"
            java.lang.String r8 = r8.mo61553Lo(r9, r5)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x00a4
            wi0.d r8 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.m99451h1()
            java.lang.String r7 = r7.field_appId
            java.lang.String r7 = wi0.C90992p.C90996d.m114165a(r7)
            r8.mo61554c(r7)
            goto L_0x00c0
        L_0x00a4:
            java.lang.Object[] r8 = new java.lang.Object[r4]
            if (r7 != 0) goto L_0x00aa
            r9 = 1
            goto L_0x00ab
        L_0x00aa:
            r9 = 0
        L_0x00ab:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8[r1] = r9
            if (r7 != 0) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            java.lang.String r2 = r7.field_appId
        L_0x00b6:
            r8[r3] = r2
            java.lang.String r7 = "MicroMsg.AppBrandStarAppStorage"
            java.lang.String r9 = "restore receive status fail, attributes is null: %b, appId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r8)
        L_0x00c0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appusage.C81500i0.mo113795kD(java.lang.String, int, boolean):boolean");
    }

    /* renamed from: qq */
    public int mo113796qq() {
        Cursor rawQuery = this.f239103d.rawQuery("select count(*) from AppBrandStarApp", (String[]) null);
        int i = 0;
        if (rawQuery != null && !rawQuery.isClosed()) {
            if (rawQuery.moveToFirst()) {
                i = rawQuery.getInt(0);
            }
            rawQuery.close();
        }
        return i;
    }
}
