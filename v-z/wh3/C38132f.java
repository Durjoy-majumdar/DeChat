package wh3;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.Iterator;
import te3.C50850pm2;
import te3.C51325t03;

/* renamed from: wh3.f */
public class C38132f extends MAutoStorage<C38131e> {

    /* renamed from: f */
    public static final String[] f100769f = {MAutoStorage.getCreateSQLs(C38131e.f100768z, "EmojiInfoDesc")};

    /* renamed from: g */
    public static final String[] f100770g = {"create index if not exists descGroupIdIndex on EmojiInfoDesc ( groupId )", "create index if not exists descMd5Index on EmojiInfoDesc ( md5 )"};

    /* renamed from: d */
    public ISQLiteDatabase f100771d;

    /* renamed from: e */
    public SharedPreferences f100772e = PreferenceManager.getDefaultSharedPreferences(MMApplicationContext.getContext());

    public C38132f(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
        this.f100771d = iSQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r8 != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r8 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        return r1;
     */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo61531Lo(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = "download_flag"
            r0[r1] = r2
            java.lang.String r3 = "EmojiInfoDesc"
            r4 = 1
            r0[r4] = r3
            java.lang.String r3 = "groupId"
            r5 = 2
            r0[r5] = r3
            java.lang.String r3 = "select %s from %s where %s=?"
            java.lang.String r0 = java.lang.String.format(r3, r0)
            java.lang.String[] r3 = new java.lang.String[r4]
            r3[r1] = r8
            r8 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r7.f100771d     // Catch:{ Exception -> 0x003f }
            android.database.Cursor r8 = r6.rawQuery(r0, r3, r5)     // Catch:{ Exception -> 0x003f }
            if (r8 == 0) goto L_0x0037
            boolean r0 = r8.moveToFirst()     // Catch:{ Exception -> 0x003f }
            if (r0 == 0) goto L_0x0037
            int r0 = r8.getColumnIndex(r2)     // Catch:{ Exception -> 0x003f }
            int r0 = r8.getInt(r0)     // Catch:{ Exception -> 0x003f }
            r0 = r0 & r4
            if (r0 != r4) goto L_0x0037
            r1 = 1
        L_0x0037:
            if (r8 == 0) goto L_0x0052
        L_0x0039:
            r8.close()
            goto L_0x0052
        L_0x003d:
            r0 = move-exception
            goto L_0x0053
        L_0x003f:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.emoji.EmojiInfoDescStorage"
            java.lang.String r3 = "[isPurChase] Exception:%s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x003d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x003d }
            r4[r1] = r0     // Catch:{ all -> 0x003d }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r3, r4)     // Catch:{ all -> 0x003d }
            if (r8 == 0) goto L_0x0052
            goto L_0x0039
        L_0x0052:
            return r1
        L_0x0053:
            if (r8 == 0) goto L_0x0058
            r8.close()
        L_0x0058:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.C38132f.mo61531Lo(java.lang.String):boolean");
    }

    public boolean insert(IAutoDBItem iAutoDBItem) {
        C38131e eVar = (C38131e) iAutoDBItem;
        if (eVar == null) {
            return false;
        }
        String str = eVar.field_md5;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (!(str.length() == 32)) {
            return false;
        }
        eVar.field_md5_lang = eVar.field_md5 + eVar.field_lang;
        long replace = this.f100771d.replace("EmojiInfoDesc", "md5_lang", eVar.convertTo());
        if (replace != -1) {
            String str3 = eVar.field_md5;
            if (str3 != null) {
                str2 = str3;
            }
            doNotify(str2);
        }
        return replace >= 0;
    }

    /* renamed from: jo */
    public void mo61532jo(C51325t03 t032, String str, String str2) {
        if (t032.f141885d == null) {
            Log.m105928w("MicroMsg.emoji.EmojiInfoDescStorage", "msg desc list is null");
            return;
        }
        C38131e eVar = new C38131e();
        eVar.field_groupId = str;
        eVar.field_md5 = str2;
        Iterator<C50850pm2> it = t032.f141885d.iterator();
        while (it.hasNext()) {
            C50850pm2 next = it.next();
            eVar.field_desc = next.f139836e;
            eVar.field_lang = next.f139835d;
            eVar.field_md5_lang = eVar.field_md5 + eVar.field_lang;
            this.f100771d.replace("EmojiInfoDesc", "md5_lang", eVar.convertTo());
        }
    }
}
