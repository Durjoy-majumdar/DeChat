package g53;

import b63.C67210w;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.utils.C72516y;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import fr3.C75791m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: g53.g */
public class C75857g extends C75791m {

    /* renamed from: x */
    public Orders f222501x;

    /* renamed from: y */
    public C67210w f222502y;

    /* renamed from: z */
    public int f222503z = -1;

    public C75857g(C67210w wVar, Orders orders) {
        this.f222501x = orders;
        this.f222502y = wVar;
        ArrayList arrayList = (ArrayList) orders.f209542M;
        String str = arrayList.size() > 0 ? ((Orders.Commodity) arrayList.get(0)).f209606r : null;
        PayInfo payInfo = wVar.f192996n;
        if (payInfo == null) {
            Log.m105920e("MicroMsg.NetSceneTenpayPayVertify", "empty payInfo");
            return;
        }
        int i = payInfo.f212587e;
        this.f222503z = i;
        mo106090k1(orders.f209563e, str, i, payInfo.f212589g, wVar.f192987e, wVar.f192988f);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("flag", wVar.f192983a);
        hashMap.put("passwd", wVar.f192984b);
        boolean z = !Util.isNullOrNil(wVar.f192984b);
        Log.m105925i("MicroMsg.NetSceneTenpayPayVertify", "hy: has pwd: %b", Boolean.valueOf(z));
        setPayInfo(wVar.f192996n, hashMap, hashMap2, z);
        hashMap.put("verify_type", "" + wVar.f192993k);
        if (wVar.f192993k == 0) {
            hashMap.put("verify_code", wVar.f192985c);
        } else {
            hashMap.put("cre_tail", wVar.f192994l);
            hashMap.put("cre_type", wVar.f192995m);
        }
        hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, wVar.f192986d);
        hashMap.put("bank_type", wVar.f192987e);
        hashMap.put("bind_serial", wVar.f192988f);
        hashMap.put("arrive_type", wVar.f192990h);
        hashMap.put("default_favorcomposedid", wVar.f192991i);
        hashMap.put("favorcomposedid", wVar.f192992j);
        mo106136l1(hashMap);
        if (C75133p0.f221064a) {
            hashMap2.put("uuid_for_bindcard", C75133p0.f221066c);
            hashMap2.put("bindcard_scene", "" + C75133p0.f221065b);
        }
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    public int getFuncId() {
        int i = this.f222503z;
        if (i == 11) {
            return 1607;
        }
        return i == 21 ? 1606 : 462;
    }

    public int getTenpayCgicmd() {
        return 1;
    }

    public String getUri() {
        int i = this.f222503z;
        return i == 11 ? "/cgi-bin/mmpay-bin/tenpay/saveverify" : i == 21 ? "/cgi-bin/mmpay-bin/tenpay/fetchverify" : "/cgi-bin/mmpay-bin/tenpay/verify";
    }

    /* renamed from: j1 */
    public boolean mo105664j1() {
        int i = this.f222503z;
        return i == 11 || i == 21;
    }

    /* renamed from: l1 */
    public void mo106136l1(Map<String, String> map) {
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        super.onGYNetEnd(i, str, jSONObject);
        if (i == 0) {
            String optString = jSONObject.optString("bind_serial");
            Log.m105918d("MicroMsg.NetSceneTenpayPayVertify", "Pay Success! saving bind_serial:" + optString);
            if ("1".equals(jSONObject.optString("pay_flag"))) {
                setPaySuccess(true);
                Orders orders = this.f222501x;
                Orders.m84565g(jSONObject, orders);
                this.f222501x = orders;
            } else {
                setPaySuccess(false);
            }
            Log.m105924i("MicroMsg.NetSceneTenpayPayVertify", "mPayScene:" + this.f222503z);
            if (this.f222503z == 39) {
                Log.m105924i("MicroMsg.NetSceneTenpayPayVertify", "it's the sns scene, parse the sns pay data");
                C72516y.m84852a(jSONObject);
            } else {
                Log.m105924i("MicroMsg.NetSceneTenpayPayVertify", "it's not the sns scene");
            }
            Iterator it = ((ArrayList) C79143a.m95767f("PayProcess")).iterator();
            while (it.hasNext()) {
                ((C79148e) it.next()).f232423c.putInt("key_is_clear_failure", this.f222398w);
            }
        }
    }
}
