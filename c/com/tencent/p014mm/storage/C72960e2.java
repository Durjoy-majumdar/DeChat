package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.autogen.events.UpdateSearchIndexAtOnceEvent;
import com.tencent.p014mm.contact.C40294d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p749xh.C53339k1;
import p749xh.C78818m1;
import sx3.C64197v;

/* renamed from: com.tencent.mm.storage.e2 */
public class C72960e2 extends MAutoStorage<C72955b2> {

    /* renamed from: h */
    public static final String[] f212649h = {MAutoStorage.getCreateSQLs(C72955b2.f212642A, "ContactLabel")};

    /* renamed from: d */
    public ISQLiteDatabase f212650d;

    /* renamed from: e */
    public HashMap<String, int[]> f212651e = null;

    /* renamed from: f */
    public HashMap<Integer, ArrayList<String>> f212652f = null;

    /* renamed from: g */
    public HashMap<String, ArrayList<String>> f212653g = new HashMap<>();

    /* renamed from: com.tencent.mm.storage.e2$a */
    public enum C72961a {
        EQUAL,
        NOEQUAL,
        NOEXISTS
    }

    public C72960e2(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
        this.f212650d = iSQLiteDatabase;
        iSQLiteDatabase.execSQL("ContactLabel", "CREATE INDEX IF NOT EXISTS  contact_label_createtime_index ON ContactLabel ( createTime )");
    }

    /* renamed from: Ow */
    public static String m85573Ow(String str, C72955b2 b2Var) {
        if (b2Var == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(b2Var);
        return m85574bD(str, arrayList);
    }

    /* renamed from: bD */
    public static String m85574bD(String str, List<C72955b2> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        if (list == null || list.size() <= 0) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C72955b2 b2Var = list.get(i);
            if (b2Var != null) {
                sb.append(b2Var.field_labelID);
                if (i < size - 1) {
                    sb.append(" ");
                }
            }
        }
        Log.m105925i("MicroMsg.Label.ContactLabelStorage", "cpan[genNotifyString] event:%s", sb.toString());
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        if (r2 != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r2 != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* renamed from: DN */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo100943DN(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "labelName"
            java.lang.String r1 = "MicroMsg.Label.ContactLabelStorage"
            java.lang.String r5 = "labelID =?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]
            r12 = 0
            r6[r12] = r14
            r14 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r13.f212650d     // Catch:{ Exception -> 0x0057, all -> 0x0053 }
            java.lang.String r3 = "ContactLabel"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x0057, all -> 0x0053 }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 2
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0057, all -> 0x0053 }
            if (r2 == 0) goto L_0x004d
            boolean r3 = r2.moveToFirst()     // Catch:{ Exception -> 0x004b }
            if (r3 == 0) goto L_0x004d
            int r0 = r2.getColumnIndex(r0)     // Catch:{ Exception -> 0x004b }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x004b }
            java.lang.String r3 = "cpan[getLabelStrById] label string is %s"
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x004b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004b }
            r5.<init>()     // Catch:{ Exception -> 0x004b }
            r5.append(r0)     // Catch:{ Exception -> 0x004b }
            java.lang.String r6 = ""
            r5.append(r6)     // Catch:{ Exception -> 0x004b }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x004b }
            r4[r12] = r5     // Catch:{ Exception -> 0x004b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r4)     // Catch:{ Exception -> 0x004b }
            r2.close()
            return r0
        L_0x004b:
            r0 = move-exception
            goto L_0x0059
        L_0x004d:
            if (r2 == 0) goto L_0x0069
        L_0x004f:
            r2.close()
            goto L_0x0069
        L_0x0053:
            r0 = move-exception
            r2 = r14
            r14 = r0
            goto L_0x006b
        L_0x0057:
            r0 = move-exception
            r2 = r14
        L_0x0059:
            java.lang.String r3 = "cpan[getLabelStrById] exception %s"
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ all -> 0x006a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x006a }
            r4[r12] = r0     // Catch:{ all -> 0x006a }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r3, r4)     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x0069
            goto L_0x004f
        L_0x0069:
            return r14
        L_0x006a:
            r14 = move-exception
        L_0x006b:
            if (r2 == 0) goto L_0x0070
            r2.close()
        L_0x0070:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C72960e2.mo100943DN(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        if (r2 != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r2 != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* renamed from: LL */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo100944LL(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "labelID"
            java.lang.String r1 = "MicroMsg.Label.ContactLabelStorage"
            java.lang.String r5 = "labelName =?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]
            r12 = 0
            r6[r12] = r14
            r14 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r13.f212650d     // Catch:{ Exception -> 0x0057, all -> 0x0053 }
            java.lang.String r3 = "ContactLabel"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x0057, all -> 0x0053 }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 2
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0057, all -> 0x0053 }
            if (r2 == 0) goto L_0x004d
            boolean r3 = r2.moveToFirst()     // Catch:{ Exception -> 0x004b }
            if (r3 == 0) goto L_0x004d
            int r0 = r2.getColumnIndex(r0)     // Catch:{ Exception -> 0x004b }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x004b }
            java.lang.String r3 = "cpan[getLabelIdByStr] label id is %s"
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x004b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004b }
            r5.<init>()     // Catch:{ Exception -> 0x004b }
            r5.append(r0)     // Catch:{ Exception -> 0x004b }
            java.lang.String r6 = ""
            r5.append(r6)     // Catch:{ Exception -> 0x004b }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x004b }
            r4[r12] = r5     // Catch:{ Exception -> 0x004b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r4)     // Catch:{ Exception -> 0x004b }
            r2.close()
            return r0
        L_0x004b:
            r0 = move-exception
            goto L_0x0059
        L_0x004d:
            if (r2 == 0) goto L_0x0069
        L_0x004f:
            r2.close()
            goto L_0x0069
        L_0x0053:
            r0 = move-exception
            r2 = r14
            r14 = r0
            goto L_0x006b
        L_0x0057:
            r0 = move-exception
            r2 = r14
        L_0x0059:
            java.lang.String r3 = "cpan[getLabelIdByStr] exception %s"
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ all -> 0x006a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x006a }
            r4[r12] = r0     // Catch:{ all -> 0x006a }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r3, r4)     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x0069
            goto L_0x004f
        L_0x0069:
            return r14
        L_0x006a:
            r14 = move-exception
        L_0x006b:
            if (r2 == 0) goto L_0x0070
            r2.close()
        L_0x0070:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C72960e2.mo100944LL(java.lang.String):java.lang.String");
    }

    /* renamed from: Lo */
    public void mo100945Lo() {
        Log.m105927v("MicroMsg.Label.ContactLabelStorage", "cleanCache %s", Util.getStack());
        this.f212651e = null;
        this.f212652f = null;
    }

    /* renamed from: SE */
    public ArrayList<C72955b2> mo100946SE() {
        long nowMilliSecond = Util.nowMilliSecond();
        Cursor rawQuery = this.f212650d.rawQuery("select * from ContactLabel order by createTime ASC ", (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        ArrayList<C72955b2> arrayList = new ArrayList<>();
        while (rawQuery.moveToNext()) {
            C72955b2 b2Var = new C72955b2();
            b2Var.convertFrom(rawQuery);
            arrayList.add(b2Var);
        }
        rawQuery.close();
        Log.m105925i("MicroMsg.Label.ContactLabelStorage", "getAllContactLable time:%s count:%s stack:%s", Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)), Integer.valueOf(arrayList.size()), Util.getStack());
        return arrayList;
    }

    /* renamed from: TE */
    public ArrayList<String> mo100947TE() {
        long nowMilliSecond = Util.nowMilliSecond();
        Cursor query = this.f212650d.query("ContactLabel", new String[]{"labelName"}, (String) null, (String[]) null, (String) null, (String) null, "createTime ASC ", 2);
        if (query == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        while (query.moveToNext()) {
            arrayList.add(query.getString(0));
        }
        query.close();
        Log.m105925i("MicroMsg.Label.ContactLabelStorage", "getAllLabel time:%s count:%s stack:%s", Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)), Integer.valueOf(arrayList.size()), Util.getStack());
        return arrayList;
    }

    /* renamed from: TO */
    public boolean mo100948TO(boolean z, C72955b2 b2Var) {
        boolean insert = super.insert(b2Var);
        if (insert && z) {
            doNotify(m85573Ow("insert", b2Var));
        }
        return insert;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.tencent.mm.sdk.storage.ISQLiteDatabase] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Yt */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo100949Yt(java.util.List<com.tencent.p014mm.storage.C72955b2> r11) {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "MicroMsg.Label.ContactLabelStorage"
            if (r11 == 0) goto L_0x0072
            int r2 = r11.size()
            if (r2 > 0) goto L_0x000c
            goto L_0x0072
        L_0x000c:
            r2 = 0
            r3 = -1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r10.f212650d
            boolean r6 = r5 instanceof zh3.C91753f
            r7 = 1
            if (r6 == 0) goto L_0x0032
            r2 = r5
            zh3.f r2 = (zh3.C91753f) r2
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            long r3 = r3.getId()
            long r3 = r2.beginTransaction(r3)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r5[r0] = r6
            java.lang.String r6 = "begin deleteList in a transaction, ticket = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r5)
        L_0x0032:
            int r5 = r11.size()
            r6 = 0
        L_0x0037:
            if (r6 >= r5) goto L_0x004b
            java.lang.Object r8 = r11.get(r6)
            com.tencent.mm.storage.b2 r8 = (com.tencent.p014mm.storage.C72955b2) r8
            java.lang.String r9 = "labelID"
            java.lang.String[] r9 = new java.lang.String[]{r9}
            r10.mo100957qq(r0, r8, r9)
            int r6 = r6 + 1
            goto L_0x0037
        L_0x004b:
            if (r2 == 0) goto L_0x0055
            r2.endTransaction(r3)
            java.lang.String r0 = "end insertOrUpdateList transaction"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x0055:
            java.lang.String r0 = "delete"
            java.lang.String r11 = m85574bD(r0, r11)
            r10.doNotify(r11)
            java.lang.String r11 = "cpan[publishUpdateSearchIndexEvent]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
            com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent r11 = new com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent
            r11.<init>()
            com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent$a r0 = r11.f9570d
            r1 = 3000(0xbb8, double:1.482E-320)
            r0.f9571a = r1
            r11.publish()
            return r7
        L_0x0072:
            java.lang.String r11 = "cpan[deleteList] list is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C72960e2.mo100949Yt(java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r1 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        if (r1 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* renamed from: bF */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.storage.C72955b2 mo100950bF(java.lang.String r21) {
        /*
            r20 = this;
            java.lang.String r4 = "labelID =?"
            r10 = 1
            java.lang.String[] r5 = new java.lang.String[r10]
            r11 = 0
            r5[r11] = r21
            r12 = 0
            r13 = r20
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r13.f212650d     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            java.lang.String r2 = "ContactLabel"
            java.lang.String r14 = "labelID"
            java.lang.String r15 = "createTime"
            java.lang.String r16 = "isTemporary"
            java.lang.String r17 = "labelName"
            java.lang.String r18 = "labelPYFull"
            java.lang.String r19 = "labelPYShort"
            java.lang.String[] r3 = new java.lang.String[]{r14, r15, r16, r17, r18, r19}     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 2
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            if (r1 == 0) goto L_0x003d
            boolean r0 = r1.moveToFirst()     // Catch:{ Exception -> 0x003b }
            if (r0 == 0) goto L_0x003d
            com.tencent.mm.storage.b2 r0 = new com.tencent.mm.storage.b2     // Catch:{ Exception -> 0x003b }
            r0.<init>()     // Catch:{ Exception -> 0x003b }
            r0.convertFrom(r1)     // Catch:{ Exception -> 0x003b }
            r1.close()
            return r0
        L_0x003b:
            r0 = move-exception
            goto L_0x0044
        L_0x003d:
            if (r1 == 0) goto L_0x0058
            goto L_0x0055
        L_0x0040:
            r0 = move-exception
            goto L_0x005b
        L_0x0042:
            r0 = move-exception
            r1 = r12
        L_0x0044:
            java.lang.String r2 = "MicroMsg.Label.ContactLabelStorage"
            java.lang.String r3 = "cpan[getLabelByID] exception %s"
            java.lang.Object[] r4 = new java.lang.Object[r10]     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0059 }
            r4[r11] = r0     // Catch:{ all -> 0x0059 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r3, r4)     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0058
        L_0x0055:
            r1.close()
        L_0x0058:
            return r12
        L_0x0059:
            r0 = move-exception
            r12 = r1
        L_0x005b:
            if (r12 == 0) goto L_0x0060
            r12.close()
        L_0x0060:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C72960e2.mo100950bF(java.lang.String):com.tencent.mm.storage.b2");
    }

    /* renamed from: bO */
    public ArrayList<String> mo100951bO(String str) {
        long nowMilliSecond = Util.nowMilliSecond();
        int i = -1;
        int i2 = Util.getInt(str, -1);
        if (i2 == -1) {
            Log.m105921e("MicroMsg.Label.ContactLabelStorage", "getUserNameListById  failed id:%s", str);
            return null;
        } else if (this.f212653g.containsKey(str)) {
            return this.f212653g.get(str);
        } else {
            mo100952jo();
            ArrayList<String> arrayList = this.f212652f.get(Integer.valueOf(i2));
            Object[] objArr = new Object[4];
            objArr[0] = Long.valueOf(Util.milliSecondsToNow(nowMilliSecond));
            objArr[1] = str;
            if (arrayList != null) {
                i = arrayList.size();
            }
            objArr[2] = Integer.valueOf(i);
            objArr[3] = Util.getStack();
            Log.m105925i("MicroMsg.Label.ContactLabelStorage", "getUserNameListById time:%s id:%s count:%s stack:%s", objArr);
            return arrayList;
        }
    }

    public boolean delete(IAutoDBItem iAutoDBItem, String[] strArr) {
        return mo100957qq(true, (C72955b2) iAutoDBItem, strArr);
    }

    public boolean insert(IAutoDBItem iAutoDBItem) {
        return mo100948TO(true, (C72955b2) iAutoDBItem);
    }

    /* renamed from: jo */
    public final void mo100952jo() {
        if (this.f212651e == null || this.f212652f == null) {
            HashMap<String, int[]> hashMap = new HashMap<>();
            HashMap<Integer, ArrayList<String>> hashMap2 = new HashMap<>();
            long nowMilliSecond = Util.nowMilliSecond();
            SingleTable singleTable = C53339k1.f149474h1;
            Column column = C53339k1.f149478l1;
            SelectSql.Builder select = singleTable.select((List<? extends ISqlColumn>) C64197v.m75537f(C53339k1.f149475i1, column));
            Column column2 = C53339k1.f149476j1;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
            for (C72996z1 next : select.where(column2.bitAndEqual(1, 1).and(column.isNotNullOrEmpty())).build().multiQuery(C86709a0.m107535s().f251811i, C72996z1.class)) {
                String username = next.getUsername();
                String[] split = next.mo73974r2().split(",");
                if (split.length > 0) {
                    int[] iArr = new int[split.length];
                    for (int i = 0; i < split.length; i++) {
                        int i2 = Util.getInt(split[i], -1);
                        iArr[i] = i2;
                        if (hashMap2.containsKey(Integer.valueOf(i2))) {
                            hashMap2.get(Integer.valueOf(iArr[i])).add(username);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(username);
                            hashMap2.put(Integer.valueOf(iArr[i]), arrayList);
                        }
                    }
                    hashMap.put(username, iArr);
                }
            }
            Log.m105925i("MicroMsg.Label.ContactLabelStorage", "checkRebuildCache time:%s user:%s label:%s stack:%s", Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)), Integer.valueOf(hashMap.size()), Integer.valueOf(hashMap2.size()), Util.getStack());
            this.f212651e = hashMap;
            this.f212652f = hashMap2;
        }
    }

    /* renamed from: kD */
    public ArrayList<C72955b2> mo100953kD() {
        long nowMilliSecond = Util.nowMilliSecond();
        Cursor rawQuery = this.f212650d.rawQuery("select * from ContactLabel where isTemporary = 0  order by createTime ASC ", (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        ArrayList<C72955b2> arrayList = new ArrayList<>();
        while (rawQuery.moveToNext()) {
            C72955b2 b2Var = new C72955b2();
            b2Var.convertFrom(rawQuery);
            arrayList.add(b2Var);
        }
        rawQuery.close();
        Log.m105925i("MicroMsg.Label.ContactLabelStorage", "getAllContactLable time:%s count:%s stack:%s", Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)), Integer.valueOf(arrayList.size()), Util.getStack());
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r1 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        if (r1 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* renamed from: mI */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.storage.C72955b2 mo100954mI(java.lang.String r21) {
        /*
            r20 = this;
            java.lang.String r4 = "labelName =?"
            r10 = 1
            java.lang.String[] r5 = new java.lang.String[r10]
            r11 = 0
            r5[r11] = r21
            r12 = 0
            r13 = r20
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r13.f212650d     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            java.lang.String r2 = "ContactLabel"
            java.lang.String r14 = "labelID"
            java.lang.String r15 = "createTime"
            java.lang.String r16 = "isTemporary"
            java.lang.String r17 = "labelName"
            java.lang.String r18 = "labelPYFull"
            java.lang.String r19 = "labelPYShort"
            java.lang.String[] r3 = new java.lang.String[]{r14, r15, r16, r17, r18, r19}     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 2
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            if (r1 == 0) goto L_0x003d
            boolean r0 = r1.moveToFirst()     // Catch:{ Exception -> 0x003b }
            if (r0 == 0) goto L_0x003d
            com.tencent.mm.storage.b2 r0 = new com.tencent.mm.storage.b2     // Catch:{ Exception -> 0x003b }
            r0.<init>()     // Catch:{ Exception -> 0x003b }
            r0.convertFrom(r1)     // Catch:{ Exception -> 0x003b }
            r1.close()
            return r0
        L_0x003b:
            r0 = move-exception
            goto L_0x0044
        L_0x003d:
            if (r1 == 0) goto L_0x0058
            goto L_0x0055
        L_0x0040:
            r0 = move-exception
            goto L_0x005b
        L_0x0042:
            r0 = move-exception
            r1 = r12
        L_0x0044:
            java.lang.String r2 = "MicroMsg.Label.ContactLabelStorage"
            java.lang.String r3 = "cpan[getLabelIdByStr] exception %s"
            java.lang.Object[] r4 = new java.lang.Object[r10]     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0059 }
            r4[r11] = r0     // Catch:{ all -> 0x0059 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r3, r4)     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0058
        L_0x0055:
            r1.close()
        L_0x0058:
            return r12
        L_0x0059:
            r0 = move-exception
            r12 = r1
        L_0x005b:
            if (r12 == 0) goto L_0x0060
            r12.close()
        L_0x0060:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C72960e2.mo100954mI(java.lang.String):com.tencent.mm.storage.b2");
    }

    /* renamed from: mL */
    public ArrayList<String> mo100955mL(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        List<String> multiString = C78818m1.f231055j.select(C78818m1.f231056n).where(C78818m1.f231057o.inString(arrayList).and(C78818m1.f231058p.equal((Number) 0))).build().multiString(this.f212650d);
        if (multiString.isEmpty()) {
            return null;
        }
        return new ArrayList<>(multiString);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a0, code lost:
        if (r9 != null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        if (r9 != null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b7, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ba, code lost:
        r0 = com.tencent.p014mm.storage.C72960e2.C72961a.f212656f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00eb  */
    /* renamed from: nP */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo100956nP(java.util.List<com.tencent.p014mm.storage.C72955b2> r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = "MicroMsg.Label.ContactLabelStorage"
            r3 = 0
            if (r17 == 0) goto L_0x011c
            int r0 = r17.size()
            if (r0 > 0) goto L_0x000f
            goto L_0x011c
        L_0x000f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = -1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r1.f212650d
            boolean r8 = r0 instanceof zh3.C91753f
            r10 = 1
            if (r8 == 0) goto L_0x0040
            zh3.f r0 = (zh3.C91753f) r0
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            long r6 = r6.getId()
            long r6 = r0.beginTransaction(r6)
            java.lang.Object[] r8 = new java.lang.Object[r10]
            java.lang.Long r11 = java.lang.Long.valueOf(r6)
            r8[r3] = r11
            java.lang.String r11 = "begin insertOrUpdateList in a transaction, ticket = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r11, r8)
            r7 = r6
            r6 = r0
            goto L_0x0042
        L_0x0040:
            r7 = r6
            r6 = 0
        L_0x0042:
            java.util.Iterator r11 = r17.iterator()
        L_0x0046:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r0 = r11.next()
            r12 = r0
            com.tencent.mm.storage.b2 r12 = (com.tencent.p014mm.storage.C72955b2) r12
            if (r12 == 0) goto L_0x0046
            java.lang.String r0 = "select * from ContactLabel where labelID=?"
            java.lang.String[] r13 = new java.lang.String[r10]
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            int r15 = r12.field_labelID
            r14.append(r15)
            java.lang.String r15 = ""
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13[r3] = r14
            r14 = 2
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r1.f212650d     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            android.database.Cursor r9 = r9.rawQuery(r0, r13, r14)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            if (r9 == 0) goto L_0x00a0
            boolean r0 = r9.moveToFirst()     // Catch:{ Exception -> 0x009e }
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = "labelName"
            int r0 = r9.getColumnIndex(r0)     // Catch:{ Exception -> 0x009e }
            java.lang.String r0 = r9.getString(r0)     // Catch:{ Exception -> 0x009e }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r15)     // Catch:{ Exception -> 0x009e }
            java.lang.String r13 = r12.field_labelName     // Catch:{ Exception -> 0x009e }
            boolean r0 = r13.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x009e }
            if (r0 == 0) goto L_0x0096
            com.tencent.mm.storage.e2$a r0 = com.tencent.p014mm.storage.C72960e2.C72961a.EQUAL     // Catch:{ Exception -> 0x009e }
            goto L_0x0098
        L_0x0096:
            com.tencent.mm.storage.e2$a r0 = com.tencent.p014mm.storage.C72960e2.C72961a.NOEQUAL     // Catch:{ Exception -> 0x009e }
        L_0x0098:
            r9.close()
            goto L_0x00bc
        L_0x009c:
            r0 = move-exception
            goto L_0x00e9
        L_0x009e:
            r0 = move-exception
            goto L_0x00a8
        L_0x00a0:
            if (r9 == 0) goto L_0x00ba
            goto L_0x00b7
        L_0x00a3:
            r0 = move-exception
            r9 = 0
            goto L_0x00e9
        L_0x00a6:
            r0 = move-exception
            r9 = 0
        L_0x00a8:
            java.lang.String r13 = "cpan[checkEqualsName] exception %s"
            java.lang.Object[] r15 = new java.lang.Object[r10]     // Catch:{ all -> 0x009c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x009c }
            r15[r3] = r0     // Catch:{ all -> 0x009c }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r13, r15)     // Catch:{ all -> 0x009c }
            if (r9 == 0) goto L_0x00ba
        L_0x00b7:
            r9.close()
        L_0x00ba:
            com.tencent.mm.storage.e2$a r0 = com.tencent.p014mm.storage.C72960e2.C72961a.NOEXISTS
        L_0x00bc:
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0046
            if (r0 == r10) goto L_0x00db
            if (r0 == r14) goto L_0x00cd
            java.lang.String r0 = "cpan[insertOrUpdateList] unknow result."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x0046
        L_0x00cd:
            long r13 = java.lang.System.currentTimeMillis()
            r12.field_createTime = r13
            r1.mo100948TO(r3, r12)
            r4.add(r12)
            goto L_0x0046
        L_0x00db:
            java.lang.String r0 = "labelID"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1.mo100958uP(r3, r12, r0)
            r5.add(r12)
            goto L_0x0046
        L_0x00e9:
            if (r9 == 0) goto L_0x00ee
            r9.close()
        L_0x00ee:
            throw r0
        L_0x00ef:
            if (r6 == 0) goto L_0x00f9
            r6.endTransaction(r7)
            java.lang.String r0 = "end insertOrUpdateList transaction"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x00f9:
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x0108
            java.lang.String r0 = "insert"
            java.lang.String r0 = m85574bD(r0, r4)
            r1.doNotify(r0)
        L_0x0108:
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x0118
            java.lang.String r0 = "update"
            java.lang.String r0 = m85574bD(r0, r5)
            r1.doNotify(r0)
        L_0x0118:
            r16.mo100945Lo()
            return r3
        L_0x011c:
            java.lang.String r0 = "cpan[insertOrUpdateList] list is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C72960e2.mo100956nP(java.util.List):boolean");
    }

    /* renamed from: qq */
    public boolean mo100957qq(boolean z, C72955b2 b2Var, String... strArr) {
        boolean delete = super.delete(b2Var, strArr);
        if (delete && z) {
            doNotify(m85573Ow("delete", b2Var));
            Log.m105924i("MicroMsg.Label.ContactLabelStorage", "cpan[publishUpdateSearchIndexEvent]");
            UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent = new UpdateSearchIndexAtOnceEvent();
            updateSearchIndexAtOnceEvent.f9570d.f9571a = 3000;
            updateSearchIndexAtOnceEvent.publish();
        }
        mo100945Lo();
        return delete;
    }

    public boolean replace(IAutoDBItem iAutoDBItem) {
        C72955b2 b2Var = (C72955b2) iAutoDBItem;
        boolean replace = super.replace(b2Var);
        if (replace) {
            doNotify(m85573Ow("replace", b2Var));
        }
        mo100945Lo();
        return replace;
    }

    /* renamed from: uP */
    public boolean mo100958uP(boolean z, C72955b2 b2Var, String... strArr) {
        boolean update = super.update(b2Var, strArr);
        if (update && z) {
            doNotify(m85573Ow("update", b2Var));
        }
        mo100945Lo();
        return update;
    }

    public boolean update(IAutoDBItem iAutoDBItem, String[] strArr) {
        return mo100958uP(true, (C72955b2) iAutoDBItem, strArr);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.tencent.mm.sdk.storage.ISQLiteDatabase] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: vP */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo100959vP(java.util.List<com.tencent.p014mm.storage.C72955b2> r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.Label.ContactLabelStorage"
            r1 = 0
            if (r9 == 0) goto L_0x0076
            int r2 = r9.size()
            if (r2 > 0) goto L_0x000c
            goto L_0x0076
        L_0x000c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = -1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r8.f212650d
            boolean r7 = r6 instanceof zh3.C91753f
            if (r7 == 0) goto L_0x0037
            r3 = r6
            zh3.f r3 = (zh3.C91753f) r3
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            long r4 = r4.getId()
            long r4 = r3.beginTransaction(r4)
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            r6[r1] = r7
            java.lang.String r7 = "begin insertOrUpdateList in a transaction, ticket = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r7, r6)
        L_0x0037:
            java.util.Iterator r9 = r9.iterator()
        L_0x003b:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L_0x0056
            java.lang.Object r6 = r9.next()
            com.tencent.mm.storage.b2 r6 = (com.tencent.p014mm.storage.C72955b2) r6
            if (r6 == 0) goto L_0x003b
            java.lang.String r7 = "labelID"
            java.lang.String[] r7 = new java.lang.String[]{r7}
            r8.mo100958uP(r1, r6, r7)
            r2.add(r6)
            goto L_0x003b
        L_0x0056:
            if (r3 == 0) goto L_0x0060
            r3.endTransaction(r4)
            java.lang.String r9 = "end insertOrUpdateList transaction"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
        L_0x0060:
            int r9 = r2.size()
            if (r9 <= 0) goto L_0x0072
            if (r10 == 0) goto L_0x0072
            java.lang.String r9 = "update"
            java.lang.String r9 = m85574bD(r9, r2)
            r8.doNotify(r9)
        L_0x0072:
            r8.mo100945Lo()
            return r1
        L_0x0076:
            java.lang.String r9 = "cpan[updateLabelListSort] list is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C72960e2.mo100959vP(java.util.List, boolean):boolean");
    }
}
