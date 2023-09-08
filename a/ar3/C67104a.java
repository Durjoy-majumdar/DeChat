package ar3;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import e21.C75481j0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONObject;
import sf0.C48374j0;
import te3.C51018qv3;
import te3.C51240sg2;
import te3.C64727tg2;

/* renamed from: ar3.a */
public abstract class C67104a extends C75123k0 {

    /* renamed from: d */
    public C11385n f192692d;

    /* renamed from: e */
    public C47350c f192693e;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f192692d = nVar;
        return dispatch(gVar, this.f192693e, this);
    }

    /* renamed from: j1 */
    public abstract String mo91201j1();

    /* renamed from: k1 */
    public abstract int mo91202k1();

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        String str2;
        int i4;
        String str3;
        int i5 = i2;
        int i6 = i3;
        String str4 = str;
        Log.m105924i("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + mo91202k1() + ", errType = " + i5 + ", errCode = " + i6 + ", errMsg = " + str4 + " " + getType());
        C64727tg2 tg22 = (C64727tg2) ((C47350c) uVar).f127056b.f127083a;
        if (i5 == 0 && i6 == 0) {
            int i7 = tg22.f185558e;
            String f = C48374j0.m53717f(tg22.f185557d);
            int i8 = 1000;
            if (i7 != 0 || Util.isNullOrNil(f)) {
                str3 = tg22.f185559f;
            } else {
                int i9 = tg22.f185561h;
                try {
                    JSONObject jSONObject = new JSONObject(f);
                    int i15 = jSONObject.getInt("retcode");
                    String optString = jSONObject.optString("retmsg");
                    if (Util.isNullOrNil(optString)) {
                        optString = tg22.f185562i;
                    }
                    if ((i15 == 0 && i9 == 0) || (this instanceof C75481j0)) {
                        onGYNetEnd(i15, optString, jSONObject);
                        i8 = i5;
                        i9 = i6;
                        optString = str4;
                    } else if (i9 == 0) {
                        i9 = -1000;
                    }
                    str3 = optString;
                    i4 = i9;
                } catch (Exception e) {
                    Log.printErrStackTrace("MiroMsg.NetSceneTenpayH5TransferBase", e, "", new Object[0]);
                    str3 = MMApplicationContext.getContext().getString(C0966R.string.krp);
                }
                str2 = str3;
                i6 = i4;
                i5 = i8;
            }
            i4 = 2;
            str2 = str3;
            i6 = i4;
            i5 = i8;
        } else {
            Map<String, String> parseXml = XmlParser.parseXml(str4, "e", (String) null);
            if (parseXml != null) {
                Log.m105918d("MiroMsg.NetSceneTenpayH5TransferBase", "CDN error!");
                str2 = parseXml.get(".e.Content");
            } else {
                str2 = MMApplicationContext.getContext().getString(C0966R.string.krp);
            }
        }
        if (i5 != 0) {
            Log.m105920e("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + mo91202k1() + ", errType = " + i5 + ", errCode = " + i6 + ", errMsg = " + str2);
        }
        this.f192692d.onSceneEnd(i5, i6, str2, this);
    }

    public abstract void onGYNetEnd(int i, String str, JSONObject jSONObject);

    public void setRequestData(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.f192693e == null) {
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C51240sg2();
            bVar.f127067b = new C64727tg2();
            bVar.f127068c = mo91201j1();
            bVar.f127069d = getType();
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C47350c a = bVar.mo72403a();
            this.f192693e = a;
            a.setIsUserCmd(true);
        }
        C51240sg2 sg22 = (C51240sg2) this.f192693e.f127055a.f127080a;
        sg22.f141493d = mo91202k1();
        sg22.f141494e = 1;
        Object[] array = map.keySet().toArray();
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (Object obj : array) {
            String str = map.get(obj);
            if (!Util.isNullOrNil(str)) {
                if (z) {
                    sb.append("&");
                }
                sb.append(obj);
                sb.append("=");
                sb.append(str);
                z = true;
            }
        }
        Log.m105924i("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + sg22.f141493d + ", req = " + sb.toString());
        byte[] bytes = sb.toString().getBytes();
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bytes);
        sg22.f141495f = qv32;
    }
}
