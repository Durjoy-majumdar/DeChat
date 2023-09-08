package com.tencent.p014mm.plugin.appbrand.appusage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;
import android.util.Pair;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29223i1;
import com.tencent.p014mm.plugin.appbrand.appcache.C29224i3;
import com.tencent.p014mm.plugin.appbrand.appcache.C29227n1;
import com.tencent.p014mm.plugin.appbrand.appcache.C29229o1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81258h3;
import com.tencent.p014mm.plugin.appbrand.appusage.C29391u;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.wcdb.CursorWindowAllocationException;
import ii0.C87732a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import ki0.C33909b;
import p749xh.C38671u;
import p749xh.C66261f3;
import zh3.C91753f;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.l0 */
public final class C29378l0 extends MStorage {

    /* renamed from: g */
    public static final String[] f80163g = {MAutoStorage.getCreateSQLs(C29380b.f80167z, "AppBrandLauncherLayoutItem")};

    /* renamed from: d */
    public final C29381c f80164d;

    /* renamed from: e */
    public final C91753f f80165e;

    /* renamed from: f */
    public final C29382d f80166f = new C29382d((C29379a) null);

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.l0$b */
    public static final class C29380b extends C38671u {

        /* renamed from: z */
        public static final IAutoDBItem.MAutoDBInfo f80167z = C38671u.initAutoDBInfo(C38671u.class);

        public ContentValues convertTo() {
            this.systemRowid = 0;
            ContentValues convertTo = super.convertTo();
            int qq = C29378l0.m38693qq(this.field_brandId, this.field_versionType, this.field_scene);
            this.field_recordId = qq;
            convertTo.put("recordId", Integer.valueOf(qq));
            return convertTo;
        }

        public IAutoDBItem.MAutoDBInfo getDBInfo() {
            return f80167z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.l0$c */
    public static final class C29381c extends MAutoStorage<C29380b> {
        public C29381c(ISQLiteDatabase iSQLiteDatabase) {
            super(iSQLiteDatabase, C29380b.f80167z, "AppBrandLauncherLayoutItem", C38671u.f103840o);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.l0$d */
    public final class C29382d {
        public C29382d(C29379a aVar) {
        }

        /* renamed from: a */
        public ArrayList<AppBrandRecentTaskInfo> mo56648a(long j, int i) {
            C91753f fVar = C29378l0.this.f80165e;
            Locale locale = Locale.US;
            return C29378l0.m38692SE(fVar.query("AppBrandLauncherLayoutItem", (String[]) null, String.format(locale, "%s=? and %s<? ", new Object[]{TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, C66261f3.COL_UPDATETIME}), new String[]{String.valueOf(2), String.valueOf(j)}, (String) null, (String) null, String.format(locale, "%s desc limit %d offset 0 ", new Object[]{C66261f3.COL_UPDATETIME, Integer.valueOf(i)}), 2));
        }
    }

    public C29378l0(C91753f fVar) {
        this.f80165e = fVar;
        this.f80164d = new C29381c(fVar);
    }

    /* renamed from: SE */
    public static ArrayList<AppBrandRecentTaskInfo> m38692SE(Cursor cursor) {
        ArrayList<AppBrandRecentTaskInfo> arrayList;
        if (cursor == null) {
            return new ArrayList<>();
        }
        try {
            if (cursor.moveToFirst()) {
                LinkedList linkedList = new LinkedList();
                C29380b bVar = new C29380b();
                do {
                    bVar.convertFrom(cursor);
                    if (!Util.isNullOrNil(bVar.field_brandId)) {
                        AppBrandRecentTaskInfo c = C81661j.m100178c(String.valueOf(bVar.field_recordId), bVar.field_brandId, bVar.field_versionType, bVar.field_updateTime, bVar.field_usedInThirdPartyAppRecently, bVar.field_thirdPartyAppUsingDesc);
                        if (c != null) {
                            linkedList.add(c);
                        }
                    }
                } while (cursor.moveToNext());
                arrayList = new ArrayList<>(linkedList.size());
                arrayList.addAll(linkedList);
            } else {
                arrayList = new ArrayList<>();
            }
            return arrayList;
        } catch (SQLiteDiskIOException | CursorWindowAllocationException | com.tencent.wcdb.database.SQLiteDiskIOException e) {
            Log.m105921e("MicroMsg.AppBrandUsageStorage", "obtainHistoryList e=%s", e);
            return new ArrayList<>(0);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: qq */
    public static int m38693qq(String str, int i, int i2) {
        return String.format(Locale.US, "%s|%d|%d", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)}).hashCode();
    }

    /* renamed from: Lo */
    public boolean mo56638Lo(String str, int i) {
        Cursor rawQuery;
        boolean z = false;
        if (!Util.isNullOrNil(str) && (rawQuery = this.f80165e.rawQuery(String.format(Locale.US, "select count(*) from %s where %s=? and %s=? and %s=?", new Object[]{"AppBrandLauncherLayoutItem", "brandId", "versionType", TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE}), new String[]{str, String.valueOf(i), String.valueOf(2)})) != null) {
            if (rawQuery.moveToFirst() && rawQuery.getInt(0) > 0) {
                z = true;
            }
            rawQuery.close();
        }
        return z;
    }

    /* renamed from: Ow */
    public List<String> mo56639Ow(String str) {
        LinkedList linkedList = new LinkedList();
        if (!Util.isNullOrNil(str)) {
            Cursor query = this.f80165e.query("AppBrandLauncherLayoutItem", new String[]{"recordId"}, String.format(Locale.US, "%s=? and %s=?", new Object[]{TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "brandId"}), new String[]{String.valueOf(2), str}, (String) null, (String) null, (String) null);
            if (query == null) {
                return null;
            }
            if (query.moveToFirst()) {
                do {
                    int i = query.getInt(query.getColumnIndex("recordId"));
                    linkedList.add("" + i);
                } while (query.moveToNext());
            }
            query.close();
        }
        return linkedList;
    }

    /* renamed from: TE */
    public boolean mo56640TE(String str, int i) {
        return mo56644bF(str, i, 1);
    }

    /* renamed from: Yt */
    public int mo56641Yt() {
        int i = 0;
        Cursor rawQuery = this.f80165e.rawQuery(String.format(Locale.US, "select count(*) from %s where %s=?", new Object[]{"AppBrandLauncherLayoutItem", TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE}), new String[]{String.valueOf(2)});
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                i = rawQuery.getInt(0);
            }
            rawQuery.close();
        }
        return i;
    }

    public void add(MStorage.IOnStorageChange iOnStorageChange) {
        add("MicroMsg.AppBrandUsageStorage.WORKER", iOnStorageChange);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = java.lang.String.format("select count(*) from %s where %s=?", new java.lang.Object[]{"AppBrandLauncherLayoutItem", "recordId"});
     */
    /* renamed from: bD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo56643bD(java.lang.String r7, int r8) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r3 = "AppBrandLauncherLayoutItem"
            r2[r1] = r3
            java.lang.String r3 = "recordId"
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "select count(*) from %s where %s=?"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            zh3.f r3 = r6.f80165e
            java.lang.String[] r5 = new java.lang.String[r4]
            int r7 = m38693qq(r7, r8, r0)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r5[r1] = r7
            android.database.Cursor r7 = r3.rawQuery(r2, r5, r0)
            if (r7 == 0) goto L_0x004f
            boolean r8 = r7.isClosed()
            if (r8 == 0) goto L_0x0035
            goto L_0x004f
        L_0x0035:
            boolean r8 = r7.moveToFirst()     // Catch:{ all -> 0x004a }
            if (r8 == 0) goto L_0x0046
            int r8 = r7.getInt(r1)     // Catch:{ all -> 0x004a }
            if (r8 <= 0) goto L_0x0042
            r1 = 1
        L_0x0042:
            r7.close()
            return r1
        L_0x0046:
            r7.close()
            return r1
        L_0x004a:
            r8 = move-exception
            r7.close()
            throw r8
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appusage.C29378l0.mo56643bD(java.lang.String, int):boolean");
    }

    /* renamed from: bF */
    public boolean mo56644bF(String str, int i, int i2) {
        boolean z;
        String str2 = str;
        int i3 = i;
        if (Util.isNullOrNil(str)) {
            z = false;
        } else {
            boolean z2 = this.f80165e.delete("AppBrandLauncherLayoutItem", String.format(Locale.US, "%s=?", new Object[]{"recordId"}), new String[]{String.valueOf(m38693qq(str2, i3, 2))}) > 0;
            if (z2) {
                C29391u uVar = (C29391u) C81161g2.Bx0(C29391u.class);
                C29391u.C29392a aVar = C29391u.C29392a.USAGE_LIST;
                uVar.getClass();
                Log.m105925i("MicroMsg.AppBrandLocalUsageStorage", "removeUsage, username %s, type %d, scene %s", str2, Integer.valueOf(i), aVar);
                if (!Util.isNullOrNil(str)) {
                    C29389t tVar = new C29389t();
                    tVar.field_username = str2;
                    tVar.field_versionType = i3;
                    if (uVar.delete(tVar, false, C29389t.f80179r)) {
                        uVar.doNotify(MStorageEventData.EventType.SINGLE, 5, (Object) null);
                    }
                }
            }
            z = z2;
        }
        if (z) {
            new C55446p0(1001, false, i, 2, 2, str, i2, (String) null).mo9225i();
            doNotify(MStorageEventData.EventType.SINGLE, 5, String.valueOf(m38693qq(str2, i3, 2)));
        }
        return z;
    }

    /* renamed from: jo */
    public final boolean mo56645jo(String str, int i, int i2, boolean z, boolean z2, int i3, int i4, String str2) {
        boolean z3;
        boolean z4;
        int Yt;
        Cursor mI;
        C29229o1 o1Var;
        String str3 = str;
        int i5 = i;
        int i6 = i2;
        char c = 0;
        if (Util.isNullOrNil(str) || 999 == i5) {
            return false;
        }
        Locale locale = Locale.US;
        Cursor rawQuery = this.f80165e.rawQuery(String.format(locale, "select max(%s) from %s where %s=?", new Object[]{C66261f3.COL_UPDATETIME, "AppBrandLauncherLayoutItem", TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE}), new String[]{String.valueOf(i2)});
        long j = 0;
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                j = rawQuery.getLong(0);
            }
            rawQuery.close();
        }
        long max = Math.max(j + 1, Util.nowSecond());
        int qq = m38693qq(str, i, i2);
        ContentValues contentValues = new ContentValues(1);
        contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(max));
        contentValues.put("usedInThirdPartyAppRecently", Boolean.FALSE);
        contentValues.put("thirdPartyAppUsingDesc", "");
        boolean z5 = this.f80165e.update("AppBrandLauncherLayoutItem", contentValues, String.format(locale, "%s=?", new Object[]{"recordId"}), new String[]{String.valueOf(qq)}) > 0;
        if (z5) {
            doNotify(MStorageEventData.EventType.SINGLE, 3, String.valueOf(qq));
        }
        if (!z5) {
            C29380b bVar = new C29380b();
            bVar.field_updateTime = max;
            bVar.field_scene = i6;
            bVar.field_brandId = str3;
            bVar.field_versionType = i5;
            boolean kD = mo56646kD(bVar);
            if (kD) {
                doNotify(MStorageEventData.EventType.SINGLE, 2, String.valueOf(qq));
            }
            z4 = kD;
            z3 = z4;
        } else {
            z4 = true;
            z3 = false;
        }
        if (z4 && z) {
            Pair<Boolean, Integer> jo = ((C33909b) C81161g2.Bx0(C33909b.class)).mo59361jo("username", str3, 3, i3);
            if (((Boolean) jo.first).booleanValue()) {
                Log.m105925i("MicroMsg.AppBrandUsageStorage", "addRecord, addOk TRUE, cgi blocked by username(%s), scene(%d)", str3, Integer.valueOf(i3));
                C87732a.INSTANCE.mo122144a(((Integer) jo.second).intValue(), 165);
            } else {
                new C55446p0(i3, z2, i, 2, 1, str, i4, str2).mo9225i();
            }
        }
        if (z4 && !Util.isNullOrNil(str)) {
            String e = C81661j.m100180e(str);
            if (!Util.isNullOrNil(e) && (o1Var = (C29229o1) C81161g2.Bx0(C29229o1.class)) != null) {
                synchronized (C29223i1.f79873a) {
                    C29227n1 n1Var = new C29227n1();
                    n1Var.field_appId = e;
                    n1Var.field_type = i5;
                    String[] strArr = C29227n1.f79879t;
                    if (o1Var.get(n1Var, strArr)) {
                        n1Var.field_hit++;
                        n1Var.field_hitTimeMS = Util.nowMilliSecond();
                        o1Var.update(n1Var, strArr);
                    } else {
                        n1Var.field_hit = 1;
                        n1Var.field_hitTimeMS = Util.nowMilliSecond();
                        o1Var.insert(n1Var);
                    }
                }
            }
        }
        if (z3 && (Yt = mo56641Yt()) > 10000 && (mI = mo56647mI(new String[]{"recordId", "brandId", "versionType"}, Integer.MAX_VALUE, 10000, Integer.MAX_VALUE)) != null) {
            LinkedList linkedList = new LinkedList();
            int i7 = Yt - 10000;
            ArrayList arrayList = new ArrayList(i7);
            ArrayList arrayList2 = new ArrayList(i7);
            if (mI.moveToFirst()) {
                do {
                    linkedList.add(String.valueOf(mI.getInt(0)));
                    arrayList.add(mI.getString(1));
                    arrayList2.add(Integer.valueOf(mI.getInt(2)));
                } while (mI.moveToNext());
            }
            mI.close();
            if (!Util.isNullOrNil((List) linkedList)) {
                long beginTransaction = this.f80165e.beginTransaction(Thread.currentThread().getId());
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    C91753f fVar = this.f80165e;
                    Iterator it4 = it;
                    Locale locale2 = Locale.US;
                    Object[] objArr = new Object[1];
                    objArr[c] = "recordId";
                    fVar.delete("AppBrandLauncherLayoutItem", String.format(locale2, "%s=?", objArr), new String[]{(String) it.next()});
                    String str4 = str;
                    it = it4;
                    c = 0;
                }
                this.f80165e.endTransaction(beginTransaction);
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                ArrayList arrayList4 = new ArrayList(arrayList.size());
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    String e2 = C81661j.m100180e((String) arrayList.get(i8));
                    if (!Util.isNullOrNil(e2)) {
                        arrayList3.add(e2);
                        arrayList4.add((Integer) arrayList2.get(i8));
                    }
                }
                C81161g2.requireAccountInitializedOnDemand();
                if (C81161g2.f238471g != null) {
                    C81161g2.requireAccountInitializedOnDemand();
                    C81258h3 h3Var = C81161g2.f238471g;
                    h3Var.getClass();
                    if (arrayList3.size() > 0 && arrayList4.size() > 0 && arrayList3.size() == arrayList4.size()) {
                        Log.m105925i("MicroMsg.AppBrandWxaPkgStorage", "batchDeleteAppPkg, size %d", Integer.valueOf(arrayList3.size()));
                        h3Var.mo113537s(new C29224i3(h3Var, arrayList3, arrayList4));
                    }
                }
                doNotify(MStorageEventData.EventType.BATCH, 5, linkedList);
            }
        }
        if (z4 && 2 == i6) {
            ((C29391u) C81161g2.Bx0(C29391u.class)).mo56657jo(str, i5, C29391u.C29392a.USAGE_LIST);
        }
        return z4;
    }

    /* renamed from: kD */
    public final boolean mo56646kD(C29380b bVar) {
        if (bVar == null || Util.isNullOrNil(bVar.field_brandId)) {
            return false;
        }
        long q = this.f80165e.mo125627q("AppBrandLauncherLayoutItem", "", bVar.convertTo(), false);
        return q > 0 || q == ((long) bVar.field_recordId);
    }

    /* renamed from: mI */
    public Cursor mo56647mI(String[] strArr, int i, int i2, int i3) {
        String[] strArr2;
        String str;
        if (i3 == Integer.MAX_VALUE) {
            str = String.format(Locale.US, "%s=? order by %s desc limit %d offset %d", new Object[]{TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, C66261f3.COL_UPDATETIME, Integer.valueOf(i), Integer.valueOf(i2)});
            strArr2 = new String[]{String.valueOf(2)};
        } else {
            str = String.format(Locale.US, "%s=? and %s=? order by %s desc limit %d offset %d", new Object[]{TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "versionType", C66261f3.COL_UPDATETIME, Integer.valueOf(i), Integer.valueOf(i2)});
            strArr2 = new String[]{String.valueOf(2), String.valueOf(i3)};
        }
        return this.f80165e.query("AppBrandLauncherLayoutItem", strArr, str, strArr2, (String) null, (String) null, (String) null);
    }
}
