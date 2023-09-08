package id2;

import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fr3.C75790l;
import java.util.HashMap;
import kd2.C76555c;
import kd2.C76559f;
import org.json.JSONObject;

/* renamed from: id2.p */
public class C76311p extends C75790l {
    public C76311p(int i, int i2, int i3, int i4, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("residue_num", "" + i);
        hashMap.put("entry_scene", i2 + "");
        hashMap.put("is_snapshot", i3 + "");
        hashMap.put("user_view_digit", i4 + "");
        StringBuilder sb = new StringBuilder();
        sb.append("");
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, ""));
        hashMap.put("code_ver", sb.toString());
        hashMap.put("card_id", C76559f.f224093k);
        hashMap.put("user_card_id", C76559f.f224094l);
        hashMap.put("card_code", C76559f.f224095m);
        hashMap.put("ext_business_attach", str);
        hashMap.put("is_new_authcodes", str2);
        Bankcard a = C76555c.f224079a.mo106804a(false);
        if (a != null) {
            hashMap.put("prefer_bind_serial", a.field_bindSerial);
            hashMap.put("prefer_bank_type", a.field_bankcardType);
        }
        setRequestData(hashMap);
        Log.m105925i("MicroMsg.NetSceneTenpayWxOfflineShowCode", "hy: residue_num == %d, entryscene = %d,is_snapshot = %d, user_view_digit: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        Log.m105919d("MicroMsg.NetSceneTenpayWxOfflineShowCode", "card_id=%s,  user_card_id=%s,  card_code:%s ", C76559f.f224093k, C76559f.f224094l, C76559f.f224095m);
    }

    public int getFuncId() {
        return 1645;
    }

    public int getTenpayCgicmd() {
        return 102;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlineshowcode";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneTenpayWxOfflineShowCode", "onGynetEnd %s %s", Integer.valueOf(i), str);
    }
}
