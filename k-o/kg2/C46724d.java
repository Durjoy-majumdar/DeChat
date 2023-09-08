package kg2;

import c63.C67346c;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83017j;
import com.tencent.p014mm.plugin.recharge.model.MallRechargeProduct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C50205l22;
import te3.C50342m22;

/* renamed from: kg2.d */
public class C46724d extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125777d;

    /* renamed from: e */
    public C47350c f125778e;

    /* renamed from: f */
    public MallRechargeProduct f125779f = null;

    /* renamed from: g */
    public List<MallRechargeProduct> f125780g = null;

    /* renamed from: h */
    public String f125781h;

    /* renamed from: i */
    public String f125782i = null;

    /* renamed from: j */
    public int f125783j;

    /* renamed from: n */
    public String f125784n;

    /* renamed from: o */
    public String f125785o;

    public C46724d(int i, String str, String str2, String str3, String str4, String str5) {
        this.f125781h = str;
        this.f125783j = i;
        this.f125784n = str5;
        this.f125785o = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50205l22();
        bVar.f127067b = new C50342m22();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getlatestpayproductinfo";
        bVar.f127069d = C83017j.CTRL_INDEX;
        bVar.f127070e = 229;
        bVar.f127071f = 1000000229;
        C47350c a = bVar.mo72403a();
        this.f125778e = a;
        C50205l22 l222 = (C50205l22) a.f127055a.f127080a;
        l222.f137135d = str;
        l222.f137137f = str3;
        l222.f137136e = str2;
        l222.f137138g = str4;
        l222.f137139h = C67346c.m79699b().mo91479c(str);
        Log.m105918d("MicroMsg.NetSceneGetLatestPayProductInfo", String.format("funcId:%s, appId:%s, productId:%s, remark:%s", new Object[]{str, str3, str2, str4}));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125777d = nVar;
        return dispatch(gVar, this.f125778e, this);
    }

    public int getType() {
        return C83017j.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String[] split;
        Log.m105918d("MicroMsg.NetSceneGetLatestPayProductInfo", "errCode " + i3 + ", errMsg " + str);
        C50342m22 m222 = (C50342m22) ((C47350c) uVar).f127056b.f127083a;
        StringBuilder sb = new StringBuilder();
        sb.append("resp.OurterRemark ");
        sb.append(m222.f137770g);
        Log.m105918d("MicroMsg.NetSceneGetLatestPayProductInfo", sb.toString());
        String str2 = m222.f137770g;
        this.f125782i = "";
        if (!Util.isNullOrNil(str2) && (split = str2.split("&")) != null && split.length > 0) {
            boolean z = true;
            for (String split2 : split) {
                String[] split3 = split2.split("=");
                if (split3.length == 2) {
                    if (!z) {
                        this.f125782i += " ";
                    } else {
                        z = false;
                    }
                    this.f125782i += split3[1];
                }
            }
        }
        if (!Util.isNullOrNil(m222.f137773j)) {
            try {
                this.f125780g = C76575b.m92144d(this.f125781h, new JSONObject(m222.f137773j).optJSONArray("product_info"));
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.NetSceneGetLatestPayProductInfo", e, "", new Object[0]);
            }
        }
        if (i2 == 0 && i3 == 0) {
            String str3 = m222.f137767d;
            Log.m105918d("MicroMsg.NetSceneGetLatestPayProductInfo", "resp.Product " + str3);
            if (!Util.isNullOrNil(str3)) {
                try {
                    MallRechargeProduct c = C76575b.m92143c(this.f125781h, new JSONObject(str3));
                    this.f125779f = c;
                    c.f203471h = this.f125782i;
                } catch (JSONException e2) {
                    Log.printErrStackTrace("MicroMsg.NetSceneGetLatestPayProductInfo", e2, "", new Object[0]);
                }
            }
        }
        Log.m105918d("MicroMsg.NetSceneGetLatestPayProductInfo", String.format("OutErrCode : %d ,OutErrMsg : %s , WxErrCode : %d , WxErrMsg : %s", new Object[]{Integer.valueOf(m222.f137768e), m222.f137769f, Integer.valueOf(m222.f137771h), m222.f137772i}));
        if (i3 == 0 && (i3 = m222.f137771h) == 0) {
            i3 = m222.f137768e;
        }
        if (Util.isNullOrNil(str)) {
            str = !Util.isNullOrNil(m222.f137772i) ? m222.f137772i : m222.f137769f;
        }
        this.f125777d.onSceneEnd(i2, i3, str, this);
    }
}
