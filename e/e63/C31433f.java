package e63;

import b63.C28261a0;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: e63.f */
public class C31433f extends MAutoStorage<C28261a0> {

    /* renamed from: e */
    public static final String[] f84133e = {MAutoStorage.getCreateSQLs(C28261a0.f77822z, "WalletFunciontList")};

    /* renamed from: d */
    public ISQLiteDatabase f84134d;

    public C31433f(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C28261a0.f77822z, "WalletFunciontList", (String[]) null);
        this.f84134d = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public void mo58168jo(int i, String str, String str2, String str3, String str4, int i2) {
        C28261a0 a0Var = new C28261a0();
        a0Var.field_wallet_region = i;
        a0Var.field_function_list = str;
        a0Var.field_new_list = str2;
        a0Var.field_banner_list = str3;
        a0Var.field_type_name_list = str4;
        a0Var.field_isShowSetting = i2;
        super.replace(a0Var);
    }
}
