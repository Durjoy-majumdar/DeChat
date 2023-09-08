package sl2;

import com.tencent.p014mm.plugin.scanner.model.C30383k1;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38543c8;

/* renamed from: sl2.b */
public class C36681b extends MAutoStorage {

    /* renamed from: e */
    public static final String[] f97479e = {MAutoStorage.getCreateSQLs(C30383k1.f81979v, "ScanTranslationResult")};

    /* renamed from: d */
    public ISQLiteDatabase f97480d;

    public C36681b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C30383k1.f81979v, "ScanTranslationResult", (String[]) null);
        this.f97480d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public boolean mo60805Lo(C30383k1 k1Var) {
        return mo60806jo(k1Var.field_originMD5) != null ? replace(k1Var) : super.insert(k1Var);
    }

    /* renamed from: jo */
    public C38543c8 mo60806jo(String str) {
        C30383k1 k1Var = new C30383k1();
        k1Var.field_originMD5 = str;
        if (get(k1Var, new String[0])) {
            return k1Var;
        }
        return null;
    }
}
