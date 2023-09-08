package id2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import com.tencent.xweb.util.WXWebReporter;
import com.tenpay.android.wechat.TenpayUtil;
import ie3.C8883h;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONObject;
import p206nj.C117627q;
import sf0.C48374j0;
import te3.C51018qv3;
import te3.tf4;
import te3.uf4;

/* renamed from: id2.i */
public abstract class C76305i extends C75123k0 {

    /* renamed from: d */
    public C11385n f223505d;

    /* renamed from: e */
    public C47350c f223506e;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f223505d = nVar;
        return dispatch(gVar, this.f223506e, this);
    }

    public int getFuncId() {
        return 385;
    }

    public abstract int getTenpayCgicmd();

    public int getType() {
        return 385;
    }

    public String getUri() {
        return "/cgi-bin/micromsg-bin/tenpay";
    }

    /* renamed from: j1 */
    public void mo106542j1(int i, String str, String str2) {
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        String str2;
        int i4;
        String str3;
        int i5 = i2;
        int i6 = i3;
        String str4 = str;
        Log.m105924i("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + getTenpayCgicmd() + ", errType = " + i5 + ", errCode = " + i6 + ", errMsg = " + str4);
        uf4 uf4 = (uf4) ((C47350c) uVar).f127056b.f127083a;
        if (i5 == 0 && i6 == 0) {
            int i7 = 1000;
            if (uf4.f185732e == 0) {
                String f = C48374j0.m53717f(uf4.f185731d);
                try {
                    JSONObject jSONObject = new JSONObject(f);
                    int i8 = jSONObject.getInt("retcode");
                    str2 = uf4.f185736i;
                    if (Util.isNullOrNil(str2)) {
                        str2 = jSONObject.optString("retmsg");
                    }
                    int i9 = uf4.f185735h;
                    if (i8 == 0 && i9 == 0) {
                        onGYNetEnd(i8, str2, jSONObject);
                        i8 = i6;
                        str2 = str4;
                    } else {
                        Log.m105924i("MicroMsg.NetSceneTenpayOfflineBase", "ErrCode tenpayErrType : " + i9);
                        if (i9 != 0) {
                            i8 = i9;
                        }
                        if (i8 == 0) {
                            i8 = -1000;
                        }
                        Log.m105918d("MicroMsg.NetSceneTenpayOfflineBase", "ErrCode errMsg : " + str2);
                        i5 = 1000;
                    }
                    mo106542j1(uf4.f185735h, uf4.f185736i, f);
                    i7 = i5;
                    i4 = i8;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.NetSceneTenpayOfflineBase", e, "", new Object[0]);
                    str3 = MMApplicationContext.getContext().getString(C0966R.string.krp);
                }
            } else {
                str3 = uf4.f185733f;
                i4 = 2;
            }
            i6 = i4;
            i5 = i7;
            str4 = str2;
        } else {
            Map<String, String> parseXml = XmlParser.parseXml(str4, "e", (String) null);
            if (parseXml != null) {
                Log.m105918d("MicroMsg.NetSceneTenpayOfflineBase", "CDN error!");
                str4 = parseXml.get(".e.Content");
            }
        }
        if (i5 != 0) {
            Log.m105920e("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + getTenpayCgicmd() + ", errType = " + i5 + ", errCode = " + i6 + ", errMsg = " + str4);
        }
        this.f223505d.onSceneEnd(i5, i6, str4, this);
        Log.m105918d("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + getTenpayCgicmd() + ", errType = " + i5 + ", errCode = " + i6 + ", errMsg = " + str4);
    }

    public abstract void onGYNetEnd(int i, String str, JSONObject jSONObject);

    public void setRequestData(Map<String, String> map) {
        String str;
        if (map == null) {
            map = new HashMap<>();
        }
        if (!C8883h.m8692c()) {
            map.put("jsapi_reqkey", C8883h.f28150a);
        }
        if (this.f223506e == null) {
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new tf4();
            bVar.f127067b = new uf4();
            String uri = getUri();
            int funcId = getFuncId();
            bVar.f127068c = uri;
            bVar.f127069d = funcId;
            bVar.f127070e = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD;
            bVar.f127071f = 1000000185;
            this.f223506e = bVar.mo72403a();
        }
        tf4 tf4 = (tf4) this.f223506e.f127055a.f127080a;
        tf4.f185551d = getTenpayCgicmd();
        tf4.f185552e = 1;
        Object[] array = map.keySet().toArray();
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        while (true) {
            str = "&";
            if (i >= array.length) {
                break;
            }
            Object obj = array[i];
            String str2 = map.get(obj);
            if (!Util.isNullOrNil(str2)) {
                if (z) {
                    sb.append(str);
                }
                sb.append(obj);
                sb.append("=");
                sb.append(str2);
                z = true;
            }
            i++;
        }
        String signWith3Des = TenpayUtil.signWith3Des(sb.toString());
        StringBuilder sb4 = new StringBuilder();
        boolean z2 = false;
        for (Object obj2 : array) {
            String str3 = map.get(obj2);
            if (!Util.isNullOrNil(str3)) {
                if (z2) {
                    sb4.append(str);
                }
                sb4.append(obj2);
                sb4.append("=");
                sb4.append(C117627q.m165908a(str3));
                z2 = true;
            }
        }
        if (!z2) {
            str = "";
        }
        sb4.append(str);
        sb4.append("WCPaySign");
        sb4.append("=");
        sb4.append(signWith3Des);
        byte[] bytes = sb4.toString().getBytes();
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bytes);
        tf4.f185553f = qv32;
    }
}
