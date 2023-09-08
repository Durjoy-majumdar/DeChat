package kg2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C50941qb3;
import te3.C51086rb3;
import y43.C79031e;
import y43.C79036x;
import y43.C79037y;

/* renamed from: kg2.f */
public class C76576f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f224108d;

    /* renamed from: e */
    public C47350c f224109e;

    /* renamed from: f */
    public String f224110f;

    /* renamed from: g */
    public String f224111g = "";

    /* renamed from: h */
    public boolean f224112h = false;

    /* renamed from: i */
    public String f224113i = "";

    /* renamed from: j */
    public int f224114j;

    /* renamed from: n */
    public ArrayList<C79037y> f224115n;

    /* renamed from: o */
    public ArrayList<C79037y> f224116o;

    /* renamed from: p */
    public C79031e f224117p;

    /* renamed from: q */
    public C79031e f224118q;

    /* renamed from: r */
    public C79031e f224119r;

    /* renamed from: s */
    public C79031e f224120s;

    /* renamed from: t */
    public C79031e f224121t;

    /* renamed from: u */
    public C79036x f224122u;

    /* renamed from: v */
    public int f224123v = 0;

    /* renamed from: w */
    public String f224124w = "";

    /* renamed from: x */
    public List<C76574a> f224125x;

    /* renamed from: y */
    public int f224126y;

    public C76576f(String str, int i) {
        this.f224110f = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50941qb3();
        bVar.f127067b = new C51086rb3();
        bVar.f127068c = "/cgi-bin/mmpay-bin/paychargeproxy";
        bVar.f127069d = 1571;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f224109e = a;
        C50941qb3 qb32 = (C50941qb3) a.f127055a.f127080a;
        qb32.f140236d = i;
        this.f224126y = i;
        Log.m105925i("MicroMsg.NetScenePayChargeProxy", "cmdId: %d", Integer.valueOf(i));
        if (!Util.isNullOrNil(this.f224110f)) {
            Log.m105925i("MicroMsg.NetScenePayChargeProxy", "hy: requesting phone num: %s", this.f224110f);
            qb32.f140237e = String.format("phone=%s", new Object[]{this.f224110f});
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f224108d = nVar;
        return dispatch(gVar, this.f224109e, this);
    }

    public int getType() {
        return 1571;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2;
        int i4 = i2;
        int i5 = i3;
        Log.m105925i("MicroMsg.NetScenePayChargeProxy", "hy: NetScenePayChargeProxy end: errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f224123v = i5;
        if (i4 == 0 && i5 == 0) {
            try {
                JSONObject jSONObject = new JSONObject(((C51086rb3) ((C47350c) uVar).f127056b.f127083a).f140808d);
                Log.m105919d("MicroMsg.NetScenePayChargeProxy", "tofutest: json: %s", jSONObject.toString());
                this.f224111g = jSONObject.optString("appId");
                this.f224123v = jSONObject.optInt("errCode", -1);
                this.f224124w = jSONObject.optString("errMsg", MMApplicationContext.getContext().getString(C0966R.string.kuz));
                if (this.f224123v < 0) {
                    this.f224112h = true;
                } else {
                    this.f224112h = false;
                }
                this.f224113i = jSONObject.optString("desc");
                this.f224114j = jSONObject.optInt("userTag", 0);
                JSONArray optJSONArray = jSONObject.optJSONArray("productList");
                if (optJSONArray != null) {
                    this.f224115n = new ArrayList<>();
                    this.f224116o = new ArrayList<>();
                    int i6 = 0;
                    while (i6 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i6);
                        JSONArray jSONArray = optJSONArray;
                        C79037y yVar = new C79037y();
                        yVar.f232103f = jSONObject2.optString("desc", "");
                        yVar.f232101d = jSONObject2.optString("id", "");
                        yVar.f232102e = jSONObject2.optString("name", "");
                        yVar.f232104g = jSONObject2.optInt("status", 0);
                        yVar.f232105h = jSONObject2.optString("url", "");
                        yVar.f232106i = jSONObject2.optInt("type");
                        yVar.f232107j = jSONObject2.optString("typeName");
                        yVar.f232109o = jSONObject2.optString("isColor", "0");
                        yVar.f232110p = jSONObject2.optString("colorCode", "0");
                        yVar.f232111q = jSONObject2.optInt("isReConfirm", 0);
                        yVar.f232112r = jSONObject2.optString("weappID");
                        yVar.f232113s = jSONObject2.optString("weappPath");
                        yVar.f232114t = jSONObject2.optInt("isRecommend", 0);
                        yVar.f232115u = jSONObject2.optString("recommendId", "");
                        if (yVar.f232106i == 1) {
                            this.f224115n.add(yVar);
                        } else {
                            yVar.f232108n = jSONObject2.optString("productAttr");
                            this.f224116o.add(yVar);
                        }
                        i6++;
                        int i7 = i2;
                        int i8 = i3;
                        optJSONArray = jSONArray;
                    }
                } else {
                    this.f224115n = null;
                    this.f224116o = null;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("weSim");
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("url");
                    String optString2 = optJSONObject.optString("name");
                    String optString3 = optJSONObject.optString("weappID");
                    String optString4 = optJSONObject.optString("weappPath");
                    if (Util.isNullOrNil(optString2)) {
                        Log.m105928w("MicroMsg.NetScenePayChargeProxy", "tf: weSim is missing");
                        this.f224120s = null;
                    } else {
                        C79031e eVar = new C79031e();
                        this.f224120s = eVar;
                        eVar.f232061d = optString;
                        eVar.f232062e = optString2;
                        eVar.f232063f = optString3;
                        eVar.f232064g = optString4;
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("wxRemind");
                if (optJSONObject2 != null) {
                    String optString5 = optJSONObject2.optString("url");
                    String optString6 = optJSONObject2.optString("name");
                    String optString7 = optJSONObject2.optString("weappID");
                    String optString8 = optJSONObject2.optString("weappPath");
                    if (Util.isNullOrNil(optString6)) {
                        Log.m105928w("MicroMsg.NetScenePayChargeProxy", "hy: remind unicom unnecessary element missing");
                        this.f224117p = null;
                    } else {
                        C79031e eVar2 = new C79031e();
                        this.f224117p = eVar2;
                        eVar2.f232061d = optString5;
                        eVar2.f232062e = optString6;
                        eVar2.f232063f = optString7;
                        eVar2.f232064g = optString8;
                    }
                } else {
                    this.f224117p = null;
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("wxCard");
                if (optJSONObject3 != null) {
                    String optString9 = optJSONObject3.optString("url");
                    String optString10 = optJSONObject3.optString("name");
                    String optString11 = optJSONObject3.optString("weappID");
                    String optString12 = optJSONObject3.optString("weappPath");
                    if (Util.isNullOrNil(optString10)) {
                        Log.m105928w("MicroMsg.NetScenePayChargeProxy", "hy: phone card necessary element missing");
                        this.f224118q = null;
                    } else {
                        C79031e eVar3 = new C79031e();
                        this.f224118q = eVar3;
                        eVar3.f232061d = optString9;
                        eVar3.f232062e = optString10;
                        eVar3.f232063f = optString11;
                        eVar3.f232064g = optString12;
                    }
                } else {
                    this.f224118q = null;
                }
                JSONObject optJSONObject4 = jSONObject.optJSONObject("wxWt");
                if (optJSONObject4 != null) {
                    String optString13 = optJSONObject4.optString("url");
                    String optString14 = optJSONObject4.optString("name");
                    String optString15 = optJSONObject4.optString("weappID");
                    String optString16 = optJSONObject4.optString("weappPath");
                    if (Util.isNullOrNil(optString14)) {
                        Log.m105928w("MicroMsg.NetScenePayChargeProxy", "hy: phone hall necessary element missing");
                        this.f224119r = null;
                    } else {
                        C79031e eVar4 = new C79031e();
                        this.f224119r = eVar4;
                        eVar4.f232061d = optString13;
                        eVar4.f232062e = optString14;
                        eVar4.f232063f = optString15;
                        eVar4.f232064g = optString16;
                    }
                } else {
                    this.f224119r = null;
                }
                JSONObject optJSONObject5 = jSONObject.optJSONObject("banner");
                if (optJSONObject5 != null) {
                    C79036x xVar = new C79036x();
                    this.f224122u = xVar;
                    xVar.f232096d = optJSONObject5.getInt("id");
                    this.f224122u.f232097e = optJSONObject5.optString("name");
                    this.f224122u.f232098f = optJSONObject5.optString("url");
                    this.f224122u.f232099g = optJSONObject5.optString("weappID");
                    this.f224122u.f232100h = optJSONObject5.optString("weappPath");
                } else {
                    this.f224122u = null;
                }
                JSONObject optJSONObject6 = jSONObject.optJSONObject("headEnter");
                if (optJSONObject6 != null) {
                    String optString17 = optJSONObject6.optString("name");
                    String optString18 = optJSONObject6.optString("url");
                    String optString19 = optJSONObject6.optString("weappID");
                    String optString20 = optJSONObject6.optString("weappPath");
                    if (Util.isNullOrNil(optString17)) {
                        Log.m105928w("MicroMsg.NetScenePayChargeProxy", "tf: headEnter is missing");
                        this.f224121t = null;
                    } else {
                        C79031e eVar5 = new C79031e();
                        this.f224121t = eVar5;
                        eVar5.f232062e = optString17;
                        eVar5.f232061d = optString18;
                        eVar5.f232063f = optString19;
                        eVar5.f232064g = optString20;
                    }
                } else {
                    this.f224121t = null;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("numberList");
                if (optJSONArray2 != null) {
                    boolean isNullOrNil = Util.isNullOrNil(this.f224110f);
                    if (optJSONArray2.length() <= 0) {
                        Log.m105929w("MicroMsg.NetScenePayChargeProxy", "number length is short! %s", Integer.valueOf(optJSONArray2.length()));
                        this.f224125x = null;
                    } else {
                        this.f224125x = new ArrayList();
                        for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                            JSONObject optJSONObject7 = optJSONArray2.optJSONObject(i9);
                            if (optJSONObject7 != null) {
                                String optString21 = optJSONObject7.optString("number");
                                String optString22 = optJSONObject7.optString("desc");
                                if (!Util.isNullOrNil(optString21)) {
                                    this.f224125x.add(new C76574a(optString21, "", optString22, 2));
                                }
                            }
                        }
                        Log.m105925i("MicroMsg.NetScenePayChargeProxy", "number list: %s, %s", Integer.valueOf(this.f224125x.size()), optJSONArray2.toString());
                    }
                } else {
                    this.f224125x = null;
                    Log.m105928w("MicroMsg.NetScenePayChargeProxy", "empty numberList");
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.NetScenePayChargeProxy", "hy: exception occurred when parsing json: %s", e.toString());
                this.f224112h = true;
                this.f224124w = MMApplicationContext.getContext().getString(C0966R.string.kuz);
            }
            str2 = str;
        } else {
            this.f224112h = true;
            str2 = Util.isNullOrNil(str) ? MMApplicationContext.getContext().getString(C0966R.string.krp) : str;
            this.f224124w = str2;
        }
        this.f224108d.onSceneEnd(i2, i3, str2, this);
    }
}
