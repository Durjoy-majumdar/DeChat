package os2;

import android.database.Cursor;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import ft3.C45807d;

/* renamed from: os2.b0 */
public class C35287b0 extends MAutoStorage<C35285a0> {

    /* renamed from: e */
    public static final String[] f94542e = {MAutoStorage.getCreateSQLs(C35285a0.f94540t, "snsDraft")};

    /* renamed from: f */
    public static String f94543f = " (snsDraft.extFlag & 2 != 0 ) ";

    /* renamed from: g */
    public static String f94544g = " order by snsDraft.timestamp desc";

    /* renamed from: d */
    public ISQLiteDatabase f94545d;

    public C35287b0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C35285a0.f94540t, "snsDraft", (String[]) null);
        this.f94545d = iSQLiteDatabase;
        Log.m105924i("MicroMsg.SnsDraftStorage", "createDraftStorage " + iSQLiteDatabase + "  " + Thread.currentThread().getId());
    }

    /* renamed from: Lo */
    public void mo60185Lo(int i) {
        C35285a0 a0Var;
        SnsMethodCalculate.markStartTimeMs("genSentDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        Cursor rawQuery = this.f94545d.rawQuery("select *,rowid from snsDraft  where " + f94543f + f94544g + " limit 1", (String[]) null, 2);
        try {
            if (rawQuery.moveToFirst()) {
                a0Var = new C35285a0();
                a0Var.convertFrom(rawQuery);
            } else {
                a0Var = null;
            }
            rawQuery.close();
            if (a0Var != null) {
                mo60186Yt("draft_sent_" + i, a0Var.field_draft, 0);
                mo60186Yt(a0Var.field_key, (byte[]) null, 0);
            }
            SnsMethodCalculate.markEndTimeMs("genSentDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        } catch (Throwable th) {
            rawQuery.close();
            SnsMethodCalculate.markEndTimeMs("genSentDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
            throw th;
        }
    }

    /* renamed from: Yt */
    public void mo60186Yt(String str, byte[] bArr, int i) {
        SnsMethodCalculate.markStartTimeMs("writeDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = bArr == null ? null : Integer.valueOf(bArr.length);
        Log.m105925i("MicroMsg.SnsDraftStorage", "writeDraft: %s, %s", objArr);
        C35285a0 a0Var = new C35285a0();
        a0Var.field_key = str;
        a0Var.field_timestamp = System.currentTimeMillis();
        a0Var.field_draft = bArr;
        a0Var.field_extFlag = i;
        super.replace(a0Var);
        SnsMethodCalculate.markEndTimeMs("writeDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
    }

    /* renamed from: jo */
    public void mo60187jo(boolean z) {
        String str;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SNS_OPEN_UPLOAD_NEWTEXT_DRAFT_STRING_SYNC;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_SNS_OPEN_UPLOAD_DRAFT_MEDIA_STRING_SYNC;
        SnsMethodCalculate.markStartTimeMs("checkOldDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        if (z) {
            C86709a0.m107528h();
            str = (String) C86709a0.m107535s().mo121142i().mo119685f(aVar, (Object) null);
        } else {
            C86709a0.m107528h();
            str = (String) C86709a0.m107535s().mo121142i().mo119685f(aVar2, (Object) null);
        }
        if (!Util.isNullOrNil(str)) {
            byte[] b = C45807d.m51085b(str);
            if (!Util.isNullOrNil(b)) {
                if (z) {
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
                    mo60186Yt("draft_text", b, 0);
                } else {
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(aVar2, "");
                    mo60186Yt("draft_normal", b, 0);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkOldDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
    }

    /* renamed from: qq */
    public C35285a0 mo60188qq(String str) {
        SnsMethodCalculate.markStartTimeMs("readDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        C35285a0 a0Var = new C35285a0();
        Integer num = null;
        Cursor rawQuery = this.f94545d.rawQuery("select *,rowid from snsDraft  where snsDraft.key='" + str + "' limit 1", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            a0Var.convertFrom(rawQuery);
            rawQuery.close();
            Object[] objArr = new Object[2];
            objArr[0] = str;
            byte[] bArr = a0Var.field_draft;
            if (bArr != null) {
                num = Integer.valueOf(bArr.length);
            }
            objArr[1] = num;
            Log.m105925i("MicroMsg.SnsDraftStorage", "readDraft: %s, %s", objArr);
            SnsMethodCalculate.markEndTimeMs("readDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
            return a0Var;
        }
        rawQuery.close();
        SnsMethodCalculate.markEndTimeMs("readDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        return null;
    }
}
