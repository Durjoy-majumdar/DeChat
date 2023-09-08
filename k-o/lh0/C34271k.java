package lh0;

import com.tencent.p014mm.sdk.storage.MAutoStorage;
import sf0.C90189z;

/* renamed from: lh0.k */
public class C34271k extends C34256a<C34270j> {

    /* renamed from: e */
    public static final String[] f92382e = {MAutoStorage.getCreateSQLs(C34270j.f92381x, "FinderRedDotHistory")};

    /* renamed from: f */
    public static final String[] f92383f = {"CREATE INDEX IF NOT EXISTS FinderRedDotHistoryActionIndex ON FinderRedDotHistory(actionMs)"};

    public C34271k(C90189z.C90190a aVar) {
        super(aVar, C34270j.f92381x, "FinderRedDotHistory", f92383f);
    }

    /* renamed from: Lo */
    public int mo59517Lo() {
        return 7;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        if (r0 == 0) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0063, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0047, code lost:
        if (r0 != 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0049, code lost:
        r0.close();
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Ow */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo59529Ow(int r6) {
        /*
            r5 = this;
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            int r6 = r6 * 60
            int r6 = r6 * 1000
            long r2 = (long) r6
            long r2 = r0 - r2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r4 = "SELECT COUNT(*) FROM FinderRedDotHistory WHERE  ( actionMs >= "
            r6.append(r4)
            r6.append(r2)
            java.lang.String r2 = " AND "
            r6.append(r2)
            java.lang.String r2 = "actionMs"
            r6.append(r2)
            java.lang.String r2 = " <= "
            r6.append(r2)
            r6.append(r0)
            java.lang.String r0 = " ) "
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r0 = 0
            r1 = 0
            sf0.z$a r2 = r5.f92355d     // Catch:{ Exception -> 0x004f }
            android.database.Cursor r0 = r2.rawQuery(r6, r0, r1)     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x0047
            boolean r6 = r0.moveToFirst()     // Catch:{ Exception -> 0x004f }
            if (r6 == 0) goto L_0x0047
            int r1 = r0.getInt(r1)     // Catch:{ Exception -> 0x004f }
        L_0x0047:
            if (r0 == 0) goto L_0x0063
        L_0x0049:
            r0.close()
            goto L_0x0063
        L_0x004d:
            r6 = move-exception
            goto L_0x0064
        L_0x004f:
            r6 = move-exception
            java.lang.String r2 = "MicroMsg.FinderRedDotHistoryStorage"
            java.lang.String r3 = "select exposure error[%s]"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x004d }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x004d }
            r4[r1] = r6     // Catch:{ all -> 0x004d }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r4)     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0063
            goto L_0x0049
        L_0x0063:
            return r1
        L_0x0064:
            if (r0 == 0) goto L_0x0069
            r0.close()
        L_0x0069:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lh0.C34271k.mo59529Ow(int):int");
    }

    /* renamed from: Yt */
    public boolean mo59530Yt(C34270j jVar) {
        return super.insertNotify(jVar, false);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        if (r1 == 0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0070, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0055, code lost:
        if (r1 != 0) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0057, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: bD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo59531bD(int r6, com.tencent.p014mm.pointers.PInt r7, com.tencent.p014mm.pointers.PInt r8) {
        /*
            r5 = this;
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            int r6 = r6 * 60
            int r6 = r6 * 1000
            long r2 = (long) r6
            long r2 = r0 - r2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r4 = "SELECT SUM(hadFinderRedDot), SUM(hadFinderLiveRedDot) FROM FinderRedDotHistory WHERE  ( actionMs >= "
            r6.append(r4)
            r6.append(r2)
            java.lang.String r2 = " AND "
            r6.append(r2)
            java.lang.String r2 = "actionMs"
            r6.append(r2)
            java.lang.String r2 = " <= "
            r6.append(r2)
            r6.append(r0)
            java.lang.String r0 = " ) "
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r0 = 0
            r8.value = r0
            r7.value = r0
            r1 = 0
            r2 = 1
            sf0.z$a r3 = r5.f92355d     // Catch:{ Exception -> 0x005d }
            android.database.Cursor r1 = r3.rawQuery(r6, r1, r0)     // Catch:{ Exception -> 0x005d }
            if (r1 == 0) goto L_0x0055
            boolean r6 = r1.moveToFirst()     // Catch:{ Exception -> 0x005d }
            if (r6 == 0) goto L_0x0055
            int r6 = r1.getInt(r0)     // Catch:{ Exception -> 0x005d }
            r7.value = r6     // Catch:{ Exception -> 0x005d }
            int r6 = r1.getInt(r2)     // Catch:{ Exception -> 0x005d }
            r8.value = r6     // Catch:{ Exception -> 0x005d }
            r0 = 1
        L_0x0055:
            if (r1 == 0) goto L_0x0070
        L_0x0057:
            r1.close()
            goto L_0x0070
        L_0x005b:
            r6 = move-exception
            goto L_0x0071
        L_0x005d:
            r6 = move-exception
            java.lang.String r7 = "MicroMsg.FinderRedDotHistoryStorage"
            java.lang.String r8 = "select exposure error[%s]"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x005b }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x005b }
            r2[r0] = r6     // Catch:{ all -> 0x005b }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r8, r2)     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0070
            goto L_0x0057
        L_0x0070:
            return r0
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            r1.close()
        L_0x0076:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lh0.C34271k.mo59531bD(int, com.tencent.mm.pointers.PInt, com.tencent.mm.pointers.PInt):boolean");
    }

    /* renamed from: jo */
    public String mo59518jo() {
        return "ds";
    }

    /* renamed from: qq */
    public String mo59519qq() {
        return "FinderRedDotHistory";
    }
}
