package b63;

import android.database.Cursor;
import android.util.SparseArray;
import c63.C67345b;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.util.ArrayList;
import org.json.JSONArray;
import p749xh.C38628o9;

/* renamed from: b63.a0 */
public class C28261a0 extends C38628o9 {

    /* renamed from: z */
    public static IAutoDBItem.MAutoDBInfo f77822z = C38628o9.initAutoDBInfo(C28261a0.class);

    /* renamed from: x */
    public ArrayList<MallFunction> f77823x = new ArrayList<>();

    /* renamed from: y */
    public SparseArray<String> f77824y;

    public C28261a0() {
        new ArrayList();
        new ArrayList();
        this.f77824y = new SparseArray<>();
    }

    public void convertFrom(Cursor cursor) {
        super.convertFrom(cursor);
        String str = this.field_function_list;
        String str2 = this.field_new_list;
        String str3 = this.field_banner_list;
        String str4 = this.field_type_name_list;
        try {
            if (!Util.isNullOrNil(str)) {
                this.f77823x = C67345b.m79694h(new JSONArray(str));
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WalletFunciontListInfo", e, "", new Object[0]);
        }
        try {
            if (!Util.isNullOrNil(str2)) {
                C67345b.m79695i(new JSONArray(str2));
            }
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.WalletFunciontListInfo", e2, "", new Object[0]);
        }
        try {
            if (!Util.isNullOrNil(str3)) {
                C67345b.m79693g(new JSONArray(str3));
            }
        } catch (Exception e3) {
            Log.printErrStackTrace("MicroMsg.WalletFunciontListInfo", e3, "", new Object[0]);
        }
        try {
            if (!Util.isNullOrNil(str4)) {
                this.f77824y = C67345b.m79697k(new JSONArray(str4));
            }
        } catch (Exception e4) {
            this.f77824y = null;
            Log.printErrStackTrace("MicroMsg.WalletFunciontListInfo", e4, "", new Object[0]);
        }
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f77822z;
    }
}
