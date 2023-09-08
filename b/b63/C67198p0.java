package b63;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: b63.p0 */
public class C67198p0 {

    /* renamed from: a */
    public ArrayList<Bankcard> f192926a = new ArrayList<>();

    /* renamed from: b */
    public String f192927b;

    /* renamed from: a */
    public Bankcard mo91298a(String str) {
        Bankcard bankcard = null;
        if (this.f192926a.size() > 0) {
            Iterator<Bankcard> it = this.f192926a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Bankcard next = it.next();
                if (next.field_bindSerial.equals(str)) {
                    bankcard = next;
                    break;
                }
            }
            if (bankcard == null) {
                Log.m105920e("MicroMsg.WalletRepaymentBankcardMgr", "getBankcardBySerialNo return null");
            } else {
                Log.m105924i("MicroMsg.WalletRepaymentBankcardMgr", "getBankcardBySerialNo succ");
            }
        } else {
            Log.m105920e("MicroMsg.WalletRepaymentBankcardMgr", "repayment bankcard list size is 0");
        }
        return bankcard;
    }

    /* renamed from: b */
    public Bankcard mo91299b() {
        if (!mo91300c()) {
            Log.m105920e("MicroMsg.WalletRepaymentBankcardMgr", "Repayment card list is null");
            return null;
        } else if (!TextUtils.isEmpty(this.f192927b)) {
            return mo91298a(this.f192927b);
        } else {
            Log.m105924i("MicroMsg.WalletRepaymentBankcardMgr", "last_use_card_serialno is empty,return the first one");
            return this.f192926a.get(0);
        }
    }

    /* renamed from: c */
    public boolean mo91300c() {
        return this.f192926a.size() > 0;
    }
}
