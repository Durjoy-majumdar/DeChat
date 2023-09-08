package e63;

import android.database.Cursor;
import b63.C54429o0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import te3.C64419hc3;

/* renamed from: e63.k */
public class C31435k extends MAutoStorage<C54429o0> {

    /* renamed from: e */
    public static final String[] f84137e = {MAutoStorage.getCreateSQLs(C54429o0.f152660y, "WalletRegionGreyAreaList")};

    /* renamed from: d */
    public ISQLiteDatabase f84138d;

    public C31435k(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C54429o0.f152660y, "WalletRegionGreyAreaList", (String[]) null);
        this.f84138d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public void mo58170Lo(int i, C64419hc3 hc32) {
        C54429o0 o0Var = new C54429o0();
        o0Var.field_wallet_region = i;
        try {
            o0Var.field_wallet_grey_item_buf = hc32.toByteArray();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WalletRegionGreyItemStg", "setWalletRegionGreyItem error " + e.getMessage());
        }
        super.replace(o0Var);
    }

    /* renamed from: jo */
    public C54429o0 mo58171jo(int i) {
        String str = "select * from WalletRegionGreyAreaList where wallet_region = " + i;
        Cursor rawQuery = this.f84138d.rawQuery(str, (String[]) null, 2);
        Log.m105924i("MicroMsg.WalletRegionGreyItemStg", "getWalletRegionGreyItem " + str);
        if (rawQuery == null) {
            return new C54429o0();
        }
        C54429o0 o0Var = new C54429o0();
        if (rawQuery.moveToNext()) {
            o0Var = new C54429o0();
            o0Var.convertFrom(rawQuery);
        }
        Log.m105924i("MicroMsg.WalletRegionGreyItemStg", "get grey item ");
        rawQuery.close();
        return o0Var;
    }
}
