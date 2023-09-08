package s12;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: s12.l */
public class C13615l extends MAutoStorage<C13614k> {

    /* renamed from: e */
    public static final String[] f38581e = {MAutoStorage.getCreateSQLs(C13614k.f38580x, "IPCallRecord")};

    /* renamed from: f */
    public static final String[] f38582f = {"*", "rowid"};

    /* renamed from: d */
    public ISQLiteDatabase f38583d;

    public C13615l(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C13614k.f38580x, "IPCallRecord", (String[]) null);
        this.f38583d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public void mo13011Lo(C13614k kVar) {
        if (kVar != null) {
            update(kVar.systemRowid, kVar);
        }
    }

    /* renamed from: jo */
    public Cursor mo13012jo(long j) {
        ISQLiteDatabase iSQLiteDatabase = this.f38583d;
        String[] strArr = f38582f;
        return iSQLiteDatabase.query("IPCallRecord", strArr, "addressId=?", new String[]{j + ""}, (String) null, (String) null, "calltime desc");
    }
}
