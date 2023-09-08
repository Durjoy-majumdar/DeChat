package wh3;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import te3.C51468tz1;
import te3.z54;

/* renamed from: wh3.u */
public class C38146u extends MAutoStorage<C38145t> {

    /* renamed from: e */
    public static final String[] f100794e = {MAutoStorage.getCreateSQLs(C38145t.f100793p, "GetEmotionListCache")};

    /* renamed from: d */
    public ISQLiteDatabase f100795d;

    public C38146u(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
        this.f100795d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public byte[] mo61543Lo(String str) {
        Cursor query = this.f100795d.query("GetEmotionListCache", (String[]) null, "reqType=?", new String[]{str}, (String) null, (String) null, (String) null);
        byte[] bArr = null;
        if (query != null) {
            if (query.moveToFirst()) {
                bArr = new C38145t(query).field_cache;
            }
            query.close();
        }
        return bArr;
    }

    /* renamed from: Ow */
    public boolean mo61544Ow(z54 z54) {
        if (z54 == null) {
            return false;
        }
        try {
            mo61546jo("Smiley_panel_req_type");
            return insert(new C38145t("Smiley_panel_req_type", z54.toByteArray()));
        } catch (Exception e) {
            Log.m105921e("MicroMsg.emoji.Storage", "exception:%s", Util.stackTraceToString(e));
            return false;
        }
    }

    /* renamed from: Yt */
    public boolean mo61545Yt(int i, C51468tz1 tz12) {
        if (tz12 == null) {
            return false;
        }
        try {
            this.f100795d.delete("GetEmotionListCache", "reqType=?", new String[]{String.valueOf(i)});
            C38145t tVar = new C38145t(i + "", tz12.toByteArray());
            Log.m105919d("MicroMsg.emoji.Storage", "insert cache: %d", Integer.valueOf(i));
            return insert(tVar);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.emoji.Storage", "exception:%s", Util.stackTraceToString(e));
            return false;
        }
    }

    /* renamed from: jo */
    public boolean mo61546jo(String str) {
        return this.f100795d.delete("GetEmotionListCache", "reqType=?", new String[]{str}) > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r1 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r1 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* renamed from: qq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public te3.z54 mo61547qq() {
        /*
            r10 = this;
            r0 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r10.f100795d     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            java.lang.String r2 = "GetEmotionListCache"
            r3 = 0
            java.lang.String r4 = "reqType=?"
            java.lang.String r5 = "Smiley_panel_req_type"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            if (r1 == 0) goto L_0x0030
            boolean r2 = r1.moveToFirst()     // Catch:{ Exception -> 0x002e }
            if (r2 == 0) goto L_0x0030
            wh3.t r2 = new wh3.t     // Catch:{ Exception -> 0x002e }
            r2.<init>(r1)     // Catch:{ Exception -> 0x002e }
            te3.z54 r3 = new te3.z54     // Catch:{ Exception -> 0x002e }
            r3.<init>()     // Catch:{ Exception -> 0x002e }
            byte[] r2 = r2.field_cache     // Catch:{ Exception -> 0x002e }
            r3.parseFrom(r2)     // Catch:{ Exception -> 0x002e }
            r0 = r3
            goto L_0x0030
        L_0x002e:
            r2 = move-exception
            goto L_0x003d
        L_0x0030:
            if (r1 == 0) goto L_0x0051
        L_0x0032:
            r1.close()
            goto L_0x0051
        L_0x0036:
            r1 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x0053
        L_0x003b:
            r2 = move-exception
            r1 = r0
        L_0x003d:
            java.lang.String r3 = "MicroMsg.emoji.Storage"
            java.lang.String r4 = "exception:%s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0052 }
            r6 = 0
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r2)     // Catch:{ all -> 0x0052 }
            r5[r6] = r2     // Catch:{ all -> 0x0052 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r5)     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0051
            goto L_0x0032
        L_0x0051:
            return r0
        L_0x0052:
            r0 = move-exception
        L_0x0053:
            if (r1 == 0) goto L_0x0058
            r1.close()
        L_0x0058:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C38146u.mo61547qq():te3.z54");
    }
}
