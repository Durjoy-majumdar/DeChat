package y43;

import android.content.SharedPreferences;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.autogen.events.BankcardLogoReadyEvent;
import com.tencent.p014mm.autogen.events.SaveBankLogoEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import e63.C75556b;
import eb0.C75592q0;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: y43.z */
public class C38963z extends IStaticListener<SaveBankLogoEvent> {
    public boolean callback(IEvent iEvent) {
        LinkedList linkedList = ((SaveBankLogoEvent) iEvent).f78963d.f78965a;
        String str = C75556b.f221973a;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        try {
            if (C75556b.f221974b == null) {
                C75556b.f221974b = new HashMap();
            }
            SharedPreferences.Editor edit = MMApplicationContext.getContext().getSharedPreferences("bank_logo", 0).edit();
            int size = linkedList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                JSONObject jSONObject = new JSONObject((String) linkedList.get(i));
                String optString = C75592q0.m90763K() ? jSONObject.optString("bank_desc") : jSONObject.optString("bank_type");
                jSONObject.put(AppMeasurement.Param.TIMESTAMP, currentTimeMillis);
                String jSONObject2 = jSONObject.toString();
                if (Util.isNullOrNil(optString)) {
                    break;
                } else if (Util.isNullOrNil(jSONObject2)) {
                    break;
                } else {
                    edit.putString(optString, jSONObject2);
                    ((HashMap) C75556b.f221974b).put(optString, jSONObject2);
                    i++;
                }
            }
            edit.commit();
            Log.m105918d("MicroMsg.WalletBankLogoStorage", "update BankLogo config file. success!");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WalletBankLogoStorage", "parse band logo error. %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.WalletBankLogoStorage", e, "", new Object[0]);
        }
        new BankcardLogoReadyEvent().publish();
        return false;
    }
}
