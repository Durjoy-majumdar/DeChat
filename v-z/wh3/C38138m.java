package wh3;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: wh3.m */
public class C38138m extends MAutoStorage<C38137l> {

    /* renamed from: e */
    public static final String[] f100782e = {MAutoStorage.getCreateSQLs(C38137l.f100781p, "EmotionDesignerInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f100783d;

    public C38138m(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C38137l.f100781p, "EmotionDesignerInfo", (String[]) null);
        this.f100783d = iSQLiteDatabase;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: te3.zy1} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r3 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        r3.close();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r3 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        return r2;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public te3.C52325zy1 mo61536jo(java.lang.String r13) {
        /*
            r12 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            java.lang.String r1 = "MicroMsg.emoji.EmotionDesignerInfo"
            r2 = 0
            if (r0 == 0) goto L_0x000f
            java.lang.String r13 = "getDesignerSimpleInfoResponseByID failed. Designer ID is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r13)
            return r2
        L_0x000f:
            java.lang.String r0 = "content"
            java.lang.String[] r5 = new java.lang.String[]{r0}
            java.lang.String r6 = "designerIDAndType=? "
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            r13 = 0
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            r7[r13] = r3
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r12.f100783d     // Catch:{ Exception -> 0x0058, all -> 0x0056 }
            java.lang.String r4 = "EmotionDesignerInfo"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 2
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0058, all -> 0x0056 }
            if (r3 == 0) goto L_0x0050
            boolean r4 = r3.moveToFirst()     // Catch:{ Exception -> 0x004e }
            if (r4 == 0) goto L_0x0050
            te3.zy1 r4 = new te3.zy1     // Catch:{ Exception -> 0x004e }
            r4.<init>()     // Catch:{ Exception -> 0x004e }
            byte[] r5 = r3.getBlob(r13)     // Catch:{ Exception -> 0x004e }
            r4.parseFrom(r5)     // Catch:{ Exception -> 0x004e }
            r2 = r4
            goto L_0x0050
        L_0x004e:
            r4 = move-exception
            goto L_0x005a
        L_0x0050:
            if (r3 == 0) goto L_0x006a
        L_0x0052:
            r3.close()
            goto L_0x006a
        L_0x0056:
            r13 = move-exception
            goto L_0x006d
        L_0x0058:
            r4 = move-exception
            r3 = r2
        L_0x005a:
            java.lang.String r5 = "exception:%s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x006b }
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r4)     // Catch:{ all -> 0x006b }
            r0[r13] = r4     // Catch:{ all -> 0x006b }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r5, r0)     // Catch:{ all -> 0x006b }
            if (r3 == 0) goto L_0x006a
            goto L_0x0052
        L_0x006a:
            return r2
        L_0x006b:
            r13 = move-exception
            r2 = r3
        L_0x006d:
            if (r2 == 0) goto L_0x0072
            r2.close()
        L_0x0072:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C38138m.mo61536jo(java.lang.String):te3.zy1");
    }
}
