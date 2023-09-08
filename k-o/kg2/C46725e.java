package kg2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83031z;
import com.tencent.p014mm.plugin.recharge.model.MallRechargeProduct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C51786w52;
import te3.C51927x52;

/* renamed from: kg2.e */
public class C46725e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125786d;

    /* renamed from: e */
    public C47350c f125787e;

    /* renamed from: f */
    public ArrayList<MallRechargeProduct> f125788f = null;

    /* renamed from: g */
    public String f125789g;

    /* renamed from: h */
    public String f125790h;

    /* renamed from: i */
    public String f125791i;

    /* renamed from: j */
    public String f125792j;

    /* renamed from: n */
    public String f125793n;

    public C46725e(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51786w52();
        bVar.f127067b = new C51927x52();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getpayfunctionproductlist";
        bVar.f127069d = C83031z.CTRL_INDEX;
        bVar.f127070e = 228;
        bVar.f127071f = 1000000228;
        C47350c a = bVar.mo72403a();
        this.f125787e = a;
        this.f125789g = str;
        ((C51786w52) a.f127055a.f127080a).f143864d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125786d = nVar;
        return dispatch(gVar, this.f125787e, this);
    }

    public int getType() {
        return C83031z.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneGetPayFunctionProductList", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            C51927x52 x522 = (C51927x52) ((C47350c) uVar).f127056b.f127083a;
            String str2 = x522.f144461d;
            Log.m105918d("MicroMsg.NetSceneGetPayFunctionProductList", "resp.ProductList " + str2);
            if (!Util.isNullOrNil(str2)) {
                try {
                    this.f125788f = C76575b.m92144d(this.f125789g, new JSONObject(str2).getJSONArray("pay_product_list"));
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.NetSceneGetPayFunctionProductList", e, "", new Object[0]);
                }
            }
            if (!Util.isNullOrNil(x522.f144462e)) {
                try {
                    JSONObject jSONObject = new JSONObject(x522.f144462e);
                    this.f125790h = jSONObject.optString("balance_link");
                    this.f125792j = jSONObject.optString("recharge_link");
                    this.f125791i = jSONObject.optString("balance_wording");
                    this.f125793n = jSONObject.optString("recharge_wording");
                } catch (JSONException e2) {
                    Log.printErrStackTrace("MicroMsg.NetSceneGetPayFunctionProductList", e2, "", new Object[0]);
                }
            }
        }
        this.f125786d.onSceneEnd(i2, i3, str, this);
    }
}
