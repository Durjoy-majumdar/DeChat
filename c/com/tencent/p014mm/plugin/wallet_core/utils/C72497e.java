package com.tencent.p014mm.plugin.wallet_core.utils;

import b63.C67183e;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletBankCardSelectUI;
import com.tencent.p014mm.plugin.wallet_core.utils.BankcardLogoHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import e63.C75556b;
import hp3.C87581a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.e */
public class C72497e implements C87581a<Object, Object> {

    /* renamed from: a */
    public final /* synthetic */ List f210896a;

    /* renamed from: b */
    public final /* synthetic */ Map f210897b;

    /* renamed from: c */
    public final /* synthetic */ BankcardLogoHelper.C72483b f210898c;

    public C72497e(BankcardLogoHelper bankcardLogoHelper, List list, Map map, BankcardLogoHelper.C72483b bVar) {
        this.f210896a = list;
        this.f210897b = map;
        this.f210898c = bVar;
    }

    public Object call(Object obj) {
        Iterator it = this.f210896a.iterator();
        while (true) {
            C67183e eVar = null;
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Bankcard bankcard = (Bankcard) it.next();
            String str = bankcard.field_bankcardType;
            if (C75556b.f221974b == null) {
                C75556b.m90594d();
            }
            if (!Util.isNullOrNil((String) ((HashMap) C75556b.f221974b).get(str))) {
                String str2 = (String) ((HashMap) C75556b.f221974b).get(str);
                if (!Util.isNullOrNil(str2)) {
                    C67183e eVar2 = new C67183e();
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        long optLong = jSONObject.optLong(AppMeasurement.Param.TIMESTAMP, 0);
                        eVar2.f192875a = jSONObject.getString("logo2x_url");
                        eVar2.f192876b = jSONObject.getString("bg2x_url");
                        eVar2.f192877c = jSONObject.getString("wl2x_url");
                        if ((System.currentTimeMillis() / 1000) - optLong <= 7200) {
                            z = false;
                        }
                        eVar2.f192881g = z;
                        eVar2.f192878d = C75556b.m90591a(eVar2.f192875a);
                        eVar2.f192882h = jSONObject.optString("bank_name_pinyin", "");
                        eVar = eVar2;
                    } catch (JSONException e) {
                        Log.printErrStackTrace("MicroMsg.WalletBankLogoStorage", e, "", new Object[0]);
                    }
                }
            }
            this.f210897b.put(bankcard.field_bankcardType, eVar);
        }
        BankcardLogoHelper.C72483b bVar = this.f210898c;
        if (bVar != null) {
            Map map = this.f210897b;
            Log.m105925i("WalletBankCardSelectUI", "get logo callback: %s", Integer.valueOf(map.size()));
            WalletBankCardSelectUI.this.refreshData(map);
        }
        return null;
    }
}
