package hz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38538c1;

/* renamed from: hz0.k */
public class C33158k extends MAutoStorage<C33156j> {

    /* renamed from: e */
    public static final String[] f90008e = {MAutoStorage.getCreateSQLs(C33156j.f90006t, "CardQrCodeDataInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f90009d;

    public C33158k(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C33156j.f90006t, "CardQrCodeDataInfo", C38538c1.f101892i);
        this.f90009d = iSQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r7 != null) goto L_0x0041;
     */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<hz0.C33156j> mo58990Lo(java.lang.String r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r6.f90009d
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]
            r4 = 0
            r3[r4] = r7
            java.lang.String r7 = "select * from CardQrCodeDataInfo where card_id =? AND status=0"
            android.database.Cursor r7 = r1.rawQuery(r7, r3)
        L_0x0014:
            if (r7 == 0) goto L_0x003f
            boolean r1 = r7.moveToNext()     // Catch:{ Exception -> 0x002a }
            if (r1 == 0) goto L_0x003f
            hz0.j r1 = new hz0.j     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.convertFrom(r7)     // Catch:{ Exception -> 0x002a }
            r0.add(r1)     // Catch:{ Exception -> 0x002a }
            goto L_0x0014
        L_0x0028:
            r0 = move-exception
            goto L_0x003b
        L_0x002a:
            r1 = move-exception
            java.lang.String r3 = "MicroMsg.CardQrCodeDataInfoStorage"
            java.lang.String r5 = "getCardQrcodeByCardId error!"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0028 }
            r2[r4] = r1     // Catch:{ all -> 0x0028 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r5, r2)     // Catch:{ all -> 0x0028 }
            goto L_0x0041
        L_0x003b:
            r7.close()
            throw r0
        L_0x003f:
            if (r7 == 0) goto L_0x0044
        L_0x0041:
            r7.close()
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hz0.C33158k.mo58990Lo(java.lang.String):java.util.List");
    }

    /* renamed from: c */
    public boolean mo58991c(String str) {
        C33156j jVar = new C33156j();
        jVar.field_card_id = str;
        boolean delete = delete(jVar, "card_id");
        if (!delete) {
            Log.m105921e("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData by cardId  failure! card_id = %s", str);
        } else {
            Log.m105925i("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData by cardId  success! card_id = %s", str);
        }
        return delete;
    }

    /* renamed from: jo */
    public boolean mo58992jo(String str, String str2) {
        C33156j jVar = new C33156j();
        jVar.field_card_id = str;
        jVar.field_code_id = str2;
        boolean delete = delete(jVar, "card_id", "code_id");
        if (!delete) {
            Log.m105921e("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData  failure! card_id = %s, code_id = %s", jVar.field_card_id, jVar.field_code_id);
        } else {
            Log.m105925i("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData  success! card_id = %s, code_id = %s", jVar.field_card_id, jVar.field_code_id);
        }
        return delete;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r0 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r0 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        return r4;
     */
    /* renamed from: qq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hz0.C33156j mo58993qq(java.lang.String r8) {
        /*
            r7 = this;
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r7.f90009d
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]
            r3 = 0
            r2[r3] = r8
            java.lang.String r4 = "select * from CardQrCodeDataInfo where card_id =? AND status=1  limit 1"
            android.database.Cursor r0 = r0.rawQuery(r4, r2)
            java.lang.String r2 = "MicroMsg.CardQrCodeDataInfoStorage"
            r4 = 0
            if (r0 == 0) goto L_0x003c
            int r5 = r0.getCount()     // Catch:{ Exception -> 0x003a }
            if (r5 <= 0) goto L_0x003c
            r0.moveToPosition(r3)     // Catch:{ Exception -> 0x003a }
            hz0.j r5 = new hz0.j     // Catch:{ Exception -> 0x003a }
            r5.<init>()     // Catch:{ Exception -> 0x003a }
            r5.convertFrom(r0)     // Catch:{ Exception -> 0x0035 }
            java.lang.String r4 = "getCardQrcodeShowingByCardId  success! card_id = %s, code_id = %s "
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0035 }
            r6[r3] = r8     // Catch:{ Exception -> 0x0035 }
            java.lang.String r8 = r5.field_code_id     // Catch:{ Exception -> 0x0035 }
            r6[r1] = r8     // Catch:{ Exception -> 0x0035 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r6)     // Catch:{ Exception -> 0x0035 }
            r4 = r5
            goto L_0x0045
        L_0x0035:
            r8 = move-exception
            r4 = r5
            goto L_0x004b
        L_0x0038:
            r8 = move-exception
            goto L_0x005c
        L_0x003a:
            r8 = move-exception
            goto L_0x004b
        L_0x003c:
            java.lang.String r5 = "getCardQrcodeShowingByCardId  is empty! card_id = %s"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x003a }
            r6[r3] = r8     // Catch:{ Exception -> 0x003a }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r5, r6)     // Catch:{ Exception -> 0x003a }
        L_0x0045:
            if (r0 == 0) goto L_0x005b
        L_0x0047:
            r0.close()
            goto L_0x005b
        L_0x004b:
            java.lang.String r5 = "getCardQrcodeShowingByCardId error!"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0038 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x0038 }
            r1[r3] = r8     // Catch:{ all -> 0x0038 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r5, r1)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x005b
            goto L_0x0047
        L_0x005b:
            return r4
        L_0x005c:
            if (r0 == 0) goto L_0x0061
            r0.close()
        L_0x0061:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: hz0.C33158k.mo58993qq(java.lang.String):hz0.j");
    }
}
