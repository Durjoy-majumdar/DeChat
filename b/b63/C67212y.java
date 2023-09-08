package b63;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import z53.C79306a;

/* renamed from: b63.y */
public class C67212y {

    /* renamed from: a */
    public SparseArray<String> f193006a = null;

    /* renamed from: b */
    public List<ElementQuery> f193007b = null;

    /* renamed from: c */
    public List<C79306a> f193008c;

    /* renamed from: a */
    public ElementQuery mo91345a(String str) {
        List<ElementQuery> list = this.f193007b;
        if (list == null || list.size() == 0) {
            Log.m105928w("MicroMsg.WalletBankElementManager", "hy: no element from given banktype");
            return null;
        }
        for (ElementQuery next : this.f193007b) {
            String str2 = next.f209516s;
            if (str2 != null && str2.equals(str)) {
                return next;
            }
        }
        Log.m105929w("MicroMsg.WalletBankElementManager", "hy: not found given banktype: %s", str);
        return null;
    }

    /* renamed from: b */
    public String mo91346b(Context context, int i) {
        SparseArray<String> sparseArray = this.f193006a;
        if (sparseArray != null) {
            String str = sparseArray.get(i);
            if (!Util.isNullOrNil(str)) {
                return str;
            }
        }
        return context.getString(C0966R.string.koe);
    }
}
