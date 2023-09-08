package s12;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.ArrayList;
import zh3.C91753f;

/* renamed from: s12.d */
public class C13613d extends MAutoStorage<C13612c> {

    /* renamed from: e */
    public static final String[] f38577e = {MAutoStorage.getCreateSQLs(C13612c.f38575u, "IPCallAddressItem")};

    /* renamed from: f */
    public static final String[] f38578f = {"*", "rowid"};

    /* renamed from: d */
    public ISQLiteDatabase f38579d;

    public C13613d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C13612c.f38575u, "IPCallAddressItem", (String[]) null);
        this.f38579d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public ArrayList<C13612c> mo13005Lo() {
        Cursor query = this.f38579d.query("IPCallAddressItem", f38578f, (String) null, (String[]) null, (String) null, (String) null, (String) null, 2);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    ArrayList<C13612c> arrayList = new ArrayList<>();
                    do {
                        C13612c cVar = new C13612c();
                        cVar.convertFrom(query);
                        arrayList.add(cVar);
                    } while (query.moveToNext());
                    return arrayList;
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.IPCallAddressStorage", "getAllAddress, error: %s", e.getMessage());
                return null;
            } finally {
                query.close();
            }
        }
        if (query != null) {
            query.close();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r13 == null) goto L_0x004a;
     */
    /* renamed from: Ow */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s12.C13612c mo13006Ow(java.lang.String r13) {
        /*
            r12 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r12.f38579d
            java.lang.String[] r4 = f38578f
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]
            r11 = 0
            r6[r11] = r13
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 2
            java.lang.String r3 = "IPCallAddressItem"
            java.lang.String r5 = "systemAddressBookUsername=?"
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r2 = r13.moveToFirst()     // Catch:{ Exception -> 0x0037 }
            if (r2 == 0) goto L_0x0031
            s12.c r2 = new s12.c     // Catch:{ Exception -> 0x0037 }
            r2.<init>()     // Catch:{ Exception -> 0x0037 }
            r2.convertFrom(r13)     // Catch:{ Exception -> 0x0037 }
            r13.close()
            return r2
        L_0x0031:
            r13.close()
            goto L_0x004a
        L_0x0035:
            r0 = move-exception
            goto L_0x004b
        L_0x0037:
            r2 = move-exception
            java.lang.String r3 = "MicroMsg.IPCallAddressStorage"
            java.lang.String r4 = "getByContactName error: %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0035 }
            r0[r11] = r2     // Catch:{ all -> 0x0035 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r0)     // Catch:{ all -> 0x0035 }
            if (r13 == 0) goto L_0x004a
            goto L_0x0031
        L_0x004a:
            return r1
        L_0x004b:
            if (r13 == 0) goto L_0x0050
            r13.close()
        L_0x0050:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s12.C13613d.mo13006Ow(java.lang.String):s12.c");
    }

    /* renamed from: Yt */
    public C13612c mo13007Yt(long j) {
        ISQLiteDatabase iSQLiteDatabase = this.f38579d;
        String[] strArr = f38578f;
        Cursor query = iSQLiteDatabase.query("IPCallAddressItem", strArr, "rowid=?", new String[]{j + ""}, (String) null, (String) null, (String) null, 2);
        try {
            if (query.moveToFirst()) {
                C13612c cVar = new C13612c();
                cVar.convertFrom(query);
                query.close();
                return cVar;
            }
        } catch (Exception e) {
            Log.m105919d("MicroMsg.IPCallAddressStorage", "getByLocalId error: %s", e.getMessage());
            if (query == null) {
                return null;
            }
        } catch (Throwable th) {
            if (query != null) {
                query.close();
            }
            throw th;
        }
        query.close();
        return null;
    }

    /* renamed from: bD */
    public Cursor mo13008bD(String str) {
        ISQLiteDatabase iSQLiteDatabase = this.f38579d;
        String[] strArr = f38578f;
        return iSQLiteDatabase.query("IPCallAddressItem", strArr, "systemAddressBookUsername LIKE ? or sortKey LIKE ?", new String[]{"%" + str + "%", "%" + str + "%"}, (String) null, (String) null, "upper(sortKey) asc");
    }

    /* renamed from: jo */
    public void mo13009jo(long j) {
        ISQLiteDatabase iSQLiteDatabase = this.f38579d;
        if ((iSQLiteDatabase instanceof C91753f) && j != -1) {
            ((C91753f) iSQLiteDatabase).endTransaction(j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r13 == null) goto L_0x0049;
     */
    /* renamed from: qq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s12.C13612c mo13010qq(java.lang.String r13) {
        /*
            r12 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r12.f38579d
            java.lang.String[] r4 = f38578f
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]
            r11 = 0
            r6[r11] = r13
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 2
            java.lang.String r3 = "IPCallAddressItem"
            java.lang.String r5 = "contactId=?"
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r2 = r13.moveToFirst()     // Catch:{ Exception -> 0x0036 }
            if (r2 == 0) goto L_0x0030
            s12.c r2 = new s12.c     // Catch:{ Exception -> 0x0036 }
            r2.<init>()     // Catch:{ Exception -> 0x0036 }
            r2.convertFrom(r13)     // Catch:{ Exception -> 0x0036 }
            r13.close()
            return r2
        L_0x0030:
            r13.close()
            goto L_0x0049
        L_0x0034:
            r0 = move-exception
            goto L_0x004a
        L_0x0036:
            r2 = move-exception
            java.lang.String r3 = "MicroMsg.IPCallAddressStorage"
            java.lang.String r4 = "getByContactId error: %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0034 }
            r0[r11] = r2     // Catch:{ all -> 0x0034 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r0)     // Catch:{ all -> 0x0034 }
            if (r13 == 0) goto L_0x0049
            goto L_0x0030
        L_0x0049:
            return r1
        L_0x004a:
            if (r13 == 0) goto L_0x004f
            r13.close()
        L_0x004f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s12.C13613d.mo13010qq(java.lang.String):s12.c");
    }
}
