package jc2;

import android.database.Cursor;
import com.tencent.p014mm.plugin.newtips.model.C115626k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import eb0.C31543z5;
import java.util.ArrayList;
import java.util.List;
import qe3.C89625d;

/* renamed from: jc2.b */
public class C117342b extends MAutoStorage<C115626k> {

    /* renamed from: e */
    public static final Long f351288e = 1209600L;

    /* renamed from: f */
    public static final String[] f351289f = {MAutoStorage.getCreateSQLs(C115626k.f346851y0, "NewTipsInfo2")};

    /* renamed from: g */
    public static final String[] f351290g = {"CREATE INDEX IF NOT EXISTS uniqueIdIndex ON NewTipsInfo2 ( uniqueId )", "CREATE INDEX IF NOT EXISTS pathQueryIndex ON NewTipsInfo2 ( path,state,beginShowTime,disappearTime )"};

    /* renamed from: d */
    public ISQLiteDatabase f351291d;

    public C117342b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C115626k.f346851y0, "NewTipsInfo2", f351290g);
        this.f351291d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public List<C115626k> mo182004Lo(String str) {
        ArrayList arrayList = new ArrayList();
        if (Util.isNullOrNil(str)) {
            return arrayList;
        }
        ISQLiteDatabase iSQLiteDatabase = this.f351291d;
        String[] strArr = C115626k.f346851y0.columns;
        Cursor query = iSQLiteDatabase.query("NewTipsInfo2", strArr, "uniqueId=?", new String[]{str + ""}, (String) null, (String) null, (String) null);
        if (query == null) {
            return arrayList;
        }
        while (query.moveToNext()) {
            C115626k kVar = new C115626k();
            kVar.convertFrom(query);
            arrayList.add(kVar);
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.tencent.mm.sdk.storage.ISQLiteDatabase] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Ow */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo182005Ow(java.util.List<com.tencent.p014mm.plugin.newtips.model.C115626k> r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0047
            int r1 = r9.size()
            if (r1 > 0) goto L_0x000a
            goto L_0x0047
        L_0x000a:
            r1 = -1
            r3 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r8.f351291d
            boolean r5 = r4 instanceof zh3.C91753f
            if (r5 == 0) goto L_0x001a
            r3 = r4
            zh3.f r3 = (zh3.C91753f) r3
            long r1 = r3.mo125613a()
        L_0x001a:
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0040 }
            r4 = 0
        L_0x001f:
            boolean r5 = r9.hasNext()     // Catch:{ all -> 0x0040 }
            if (r5 == 0) goto L_0x003a
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x0040 }
            com.tencent.mm.plugin.newtips.model.k r5 = (com.tencent.p014mm.plugin.newtips.model.C115626k) r5     // Catch:{ all -> 0x0040 }
            if (r5 != 0) goto L_0x002f
            r5 = 0
            goto L_0x0035
        L_0x002f:
            long r6 = r5.systemRowid     // Catch:{ all -> 0x0040 }
            boolean r5 = r8.update((long) r6, r5)     // Catch:{ all -> 0x0040 }
        L_0x0035:
            if (r5 == 0) goto L_0x001f
            int r4 = r4 + 1
            goto L_0x001f
        L_0x003a:
            if (r3 == 0) goto L_0x003f
            r3.endTransaction(r1)
        L_0x003f:
            return r4
        L_0x0040:
            r9 = move-exception
            if (r3 == 0) goto L_0x0046
            r3.endTransaction(r1)
        L_0x0046:
            throw r9
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jc2.C117342b.mo182005Ow(java.util.List):int");
    }

    /* renamed from: Yt */
    public boolean insert(C115626k kVar) {
        if (kVar == null) {
            return false;
        }
        return super.insert(kVar);
    }

    public boolean deleteAllData() {
        int i;
        try {
            i = this.f351291d.delete("NewTipsInfo2", (String) null, (String[]) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.NewTips.NewTipsInfoStorage", "deleteAllData exception:%s", e.toString());
            i = 0;
        }
        return i > 0;
    }

    /* renamed from: jo */
    public final boolean mo182008jo(long j, C115626k kVar) {
        long j2 = kVar.field_exposureTime;
        if (j2 != 0 && j - j2 > f351288e.longValue()) {
            return false;
        }
        long j3 = kVar.field_overdueTime;
        if (j3 == 0) {
            return j < kVar.field_disappearTime;
        }
        long j4 = kVar.field_exposureTime == 0 ? j3 + j : kVar.field_exposureDisappearTime;
        long j5 = kVar.field_disappearTime;
        if (j5 != 0) {
            j4 = Math.min(j4, j5);
        }
        return j < j4;
    }

    /* renamed from: qq */
    public List<C115626k> mo182009qq(C117343c cVar) {
        C117343c cVar2 = cVar;
        if (cVar2 == null) {
            return new ArrayList();
        }
        if (cVar2.f351294c) {
            String str = cVar2.f351292a;
            ArrayList arrayList = new ArrayList();
            if (!Util.isNullOrNil(str)) {
                long a = C31543z5.m39451a() / 1000;
                ISQLiteDatabase iSQLiteDatabase = this.f351291d;
                String[] strArr = C115626k.f346851y0.columns;
                Cursor query = iSQLiteDatabase.query("NewTipsInfo2", strArr, "dynamicPath=? and state=? and beginShowTime<=? and maxClientVersion>=? and minClientVersion<=?", new String[]{str, "0", a + "", C89625d.f257841g + "", C89625d.f257841g + ""}, (String) null, (String) null, (String) null);
                if (query != null) {
                    while (query.moveToNext()) {
                        C115626k kVar = new C115626k();
                        kVar.convertFrom(query);
                        if (mo182008jo(a, kVar)) {
                            arrayList.add(kVar);
                        }
                    }
                }
            }
            return arrayList;
        }
        int i = cVar2.f351293b;
        ArrayList arrayList2 = new ArrayList();
        if (i != 0) {
            long a2 = C31543z5.m39451a() / 1000;
            ISQLiteDatabase iSQLiteDatabase2 = this.f351291d;
            String[] strArr2 = C115626k.f346851y0.columns;
            Cursor query2 = iSQLiteDatabase2.query("NewTipsInfo2", strArr2, "path=? and state=? and beginShowTime<=? and maxClientVersion>=? and minClientVersion<=?", new String[]{i + "", "0", a2 + "", C89625d.f257841g + "", C89625d.f257841g + ""}, (String) null, (String) null, (String) null);
            if (query2 != null) {
                while (query2.moveToNext()) {
                    C115626k kVar2 = new C115626k();
                    kVar2.convertFrom(query2);
                    if (mo182008jo(a2, kVar2)) {
                        arrayList2.add(kVar2);
                    }
                }
            }
        }
        return arrayList2;
    }
}
