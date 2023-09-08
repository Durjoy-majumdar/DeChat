package h53;

import b63.C67210w;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.utils.C72516y;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import fr3.C75791m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: h53.j */
public class C76144j extends C75791m {

    /* renamed from: x */
    public Orders f223049x;

    /* renamed from: y */
    public int f223050y = -1;

    public C76144j(C67210w wVar, Orders orders) {
        int i;
        this.f223049x = orders;
        PayInfo payInfo = wVar.f192996n;
        if (payInfo != null) {
            this.f223050y = payInfo.f212587e;
            i = payInfo.f212589g;
        } else {
            i = -1;
        }
        ArrayList arrayList = (ArrayList) orders.f209542M;
        mo106090k1(orders.f209563e, arrayList.size() > 0 ? ((Orders.Commodity) arrayList.get(0)).f209606r : null, this.f223050y, i, wVar.f192987e, wVar.f192988f);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        boolean z = !Util.isNullOrNil(wVar.f192984b);
        Log.m105925i("MicroMsg.NetSceneTenpayVertifyReg", "hy: has pwd: %b", Boolean.valueOf(z));
        setPayInfo(wVar.f192996n, hashMap, hashMap2, z);
        hashMap.put("flag", wVar.f192983a);
        hashMap.put("passwd", wVar.f192984b);
        hashMap.put("verify_code", wVar.f192985c);
        hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, wVar.f192986d);
        hashMap.put("favorcomposedid", wVar.f192992j);
        hashMap.put("default_favorcomposedid", wVar.f192991i);
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    public int getFuncId() {
        int i = this.f223050y;
        if (i == 11) {
            return 1684;
        }
        if (i == 21) {
            return 1608;
        }
        return JsApiAddDownloadTask.CTRL_INDEX;
    }

    public int getTenpayCgicmd() {
        return 16;
    }

    public String getUri() {
        int i = this.f223050y;
        return i == 11 ? "/cgi-bin/mmpay-bin/tenpay/saveverifyreg" : i == 21 ? "/cgi-bin/mmpay-bin/tenpay/fetchverifyreg" : "/cgi-bin/mmpay-bin/tenpay/verifyreg";
    }

    /* renamed from: j1 */
    public boolean mo105664j1() {
        int i = this.f223050y;
        return i == 11 || i == 21;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        super.onGYNetEnd(i, str, jSONObject);
        if (i == 0) {
            String optString = jSONObject.optString("bind_serial");
            Log.m105918d("MicroMsg.NetSceneTenpayVertifyReg", "Pay Success! saving bind_serial:" + optString);
            if ("1".equals(jSONObject.optString("pay_flag"))) {
                setPaySuccess(true);
                Orders orders = this.f223049x;
                Orders.m84565g(jSONObject, orders);
                this.f223049x = orders;
            } else {
                setPaySuccess(false);
            }
            Log.m105924i("MicroMsg.NetSceneTenpayVertifyReg", "mPayScene:" + this.f223050y);
            if (this.f223050y == 39) {
                Log.m105924i("MicroMsg.NetSceneTenpayVertifyReg", "it's the sns scene, parse the sns pay data");
                C72516y.m84852a(jSONObject);
            } else {
                Log.m105924i("MicroMsg.NetSceneTenpayVertifyReg", "it's not the sns scene");
            }
            Iterator it = ((ArrayList) C79143a.m95767f("PayProcess")).iterator();
            while (it.hasNext()) {
                ((C79148e) it.next()).f232423c.putInt("key_is_clear_failure", this.f222398w);
            }
        }
    }
}
