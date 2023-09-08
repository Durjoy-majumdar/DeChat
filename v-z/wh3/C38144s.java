package wh3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: wh3.s */
public class C38144s extends MAutoStorage<C38143r> {

    /* renamed from: e */
    public static final String[] f100791e = {MAutoStorage.getCreateSQLs(C38143r.f100790z, "EmotionRewardTipInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f100792d;

    public C38144s(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
        this.f100792d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public boolean mo61540Lo(C38143r rVar) {
        if (rVar == null) {
            Log.m105928w("MicroMsg.emoji.EmotionRewardTipStorage", "save failed info is null");
            return false;
        }
        int i = (this.f100792d.replace("EmotionRewardTipInfo", "prodcutID", rVar.convertTo()) > 0 ? 1 : (this.f100792d.replace("EmotionRewardTipInfo", "prodcutID", rVar.convertTo()) == 0 ? 0 : -1));
        if (i > 0) {
            Log.m105924i("MicroMsg.emoji.EmotionRewardTipStorage", "save success");
        } else {
            Log.m105924i("MicroMsg.emoji.EmotionRewardTipStorage", "save failed");
        }
        return i > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wh3.C38143r mo61541jo() {
        /*
            r7 = this;
            java.lang.String r0 = "select * from EmotionRewardTipInfo order by modifyTime desc limit 1 "
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            r3 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r7.f100792d     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            r5 = 2
            android.database.Cursor r0 = r4.rawQuery(r0, r2, r5)     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            if (r0 == 0) goto L_0x0023
            boolean r2 = r0.moveToFirst()     // Catch:{ Exception -> 0x0021 }
            if (r2 == 0) goto L_0x0023
            wh3.r r2 = new wh3.r     // Catch:{ Exception -> 0x0021 }
            r2.<init>()     // Catch:{ Exception -> 0x0021 }
            r2.convertFrom(r0)     // Catch:{ Exception -> 0x0021 }
            r0.close()
            return r2
        L_0x0021:
            r2 = move-exception
            goto L_0x002d
        L_0x0023:
            if (r0 == 0) goto L_0x0040
        L_0x0025:
            r0.close()
            goto L_0x0040
        L_0x0029:
            r1 = move-exception
            goto L_0x0043
        L_0x002b:
            r2 = move-exception
            r0 = r3
        L_0x002d:
            java.lang.String r4 = "MicroMsg.emoji.EmotionRewardTipStorage"
            java.lang.String r5 = "getLastSendProductID failed. :%s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r2)     // Catch:{ all -> 0x0041 }
            r6[r1] = r2     // Catch:{ all -> 0x0041 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r6)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0040
            goto L_0x0025
        L_0x0040:
            return r3
        L_0x0041:
            r1 = move-exception
            r3 = r0
        L_0x0043:
            if (r3 == 0) goto L_0x0048
            r3.close()
        L_0x0048:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C38144s.mo61541jo():wh3.r");
    }

    /* renamed from: qq */
    public boolean mo61542qq(String str, int i) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.emoji.EmotionRewardTipStorage", "product id is null.");
            return false;
        }
        boolean execSQL = this.f100792d.execSQL("EmotionRewardTipInfo", "UPDATE EmotionRewardTipInfo SET flag=" + i + "," + "setFlagTime" + "=" + System.currentTimeMillis() + " WHERE " + "prodcutID" + "='" + str + "'");
        Log.m105925i("MicroMsg.emoji.EmotionRewardTipStorage", "updateFlag result:%b", Boolean.valueOf(execSQL));
        return execSQL;
    }
}
