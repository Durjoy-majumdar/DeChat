package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44579p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import ld2.C46848g;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import p154fy.C87120h;
import pe3.C47465a;
import te3.C48717ai0;
import te3.C49388f7;
import te3.C52064y4;
import te3.C52178yw3;
import te3.vj4;
import te3.wj4;

/* renamed from: com.tencent.mm.modelsimple.i0 */
public class C40360i0 extends C117747y implements C1311n, C87120h {

    /* renamed from: d */
    public C11385n f108461d;

    /* renamed from: e */
    public C47350c f108462e;

    /* renamed from: f */
    public String f108463f;

    public C40360i0(String str, int i, LinkedList<C52064y4> linkedList) {
        mo63049k1(str, i, linkedList, "", "", 0, (C49388f7) null);
    }

    /* renamed from: H0 */
    public String mo63046H0() {
        wj4 wj4 = (wj4) this.f108462e.f127056b.f127083a;
        if (wj4 == null) {
            return null;
        }
        return wj4.f144097f;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f108461d = nVar;
        return dispatch(gVar, this.f108462e, this);
    }

    public int getType() {
        return 1200;
    }

    /* renamed from: h */
    public wj4 mo63047h() {
        C47465a aVar;
        C47350c cVar = this.f108462e;
        if (cVar == null || (aVar = cVar.f127056b.f127083a) == null) {
            return null;
        }
        return (wj4) aVar;
    }

    /* renamed from: j1 */
    public final JSONObject mo63048j1(int i, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("jumpType", i);
            jSONObject2.put("wording", jSONObject.optString("wording"));
            jSONObject2.put("extra", jSONObject.optString("extra"));
            if (i == 1) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("appusername", jSONObject.optString("username") + "@app");
                jSONObject3.put("path", jSONObject.optString("path"));
                jSONObject2.put("miniAppInfo", jSONObject3);
            } else if (i != 2) {
                return null;
            } else {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", jSONObject.optString("url"));
                jSONObject2.put("html5Info", jSONObject4);
            }
            return jSONObject2;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.NetSceneTranslateLink", e, "parseFinderComponentJumpInfo exception", new Object[0]);
            return null;
        }
    }

    /* renamed from: k1 */
    public final void mo63049k1(String str, int i, LinkedList<C52064y4> linkedList, String str2, String str3, int i2, C49388f7 f7Var) {
        Log.m105924i("MicroMsg.NetSceneTranslateLink", "ticket link = " + str + "; scene = " + i + "; token = " + str2 + "; sdkVersion = " + str3 + "; authenticationResult = " + i2);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new vj4();
        bVar.f127067b = new wj4();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/translatelink";
        bVar.f127069d = 1200;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f108462e = a;
        vj4 vj4 = (vj4) a.f127055a.f127080a;
        vj4.f143527d = str;
        vj4.f143528e = i;
        vj4.f143530g = linkedList;
        vj4.f143531h = str2;
        vj4.f143532i = str3;
        vj4.f143534n = i2;
        vj4.f143535o = f7Var;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneTranslateLink", "swap deep link with ticket onGYNetEnd:[%d,%d,%s]", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f108461d.onSceneEnd(i2, i3, str, this);
    }

    /* renamed from: s */
    public String mo63050s(String str) {
        String str2;
        C44561j c;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            if (!Util.isNullOrNil(this.f108463f)) {
                C44579p Bx0 = C46848g.Bx0();
                Bx0.getClass();
                if (str != null) {
                    if (str.length() != 0) {
                        str2 = Bx0.mo69376qq(C46848g.Bx0().mo69371Lo(str), str, 1);
                        if (Util.isNullOrNil(str2) && (c = C46848g.Ax0().mo69367c(str, 3000)) != null) {
                            str2 = C46848g.Bx0().mo69376qq(c, str, 1);
                        }
                        JSONObject jSONObject = new JSONObject(this.f108463f);
                        jSONObject.put("iconurl", Util.nullAs(str2, ""));
                        return jSONObject.toString();
                    }
                }
                Log.m105920e("MicroMsg.AppInfoStorage", "hasIconUrl, appId is null");
                str2 = null;
                str2 = C46848g.Bx0().mo69376qq(c, str, 1);
                JSONObject jSONObject2 = new JSONObject(this.f108463f);
                jSONObject2.put("iconurl", Util.nullAs(str2, ""));
                return jSONObject2.toString();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.NetSceneTranslateLink", e, "getFinderJumpInfo exception", new Object[0]);
        }
        return null;
    }

    /* renamed from: x */
    public void mo63051x(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("jumpType");
            jSONObject.remove("jumpType");
            JSONObject j1 = mo63048j1(optInt, jSONObject);
            if (j1 == null) {
                Log.m105928w("MicroMsg.NetSceneTranslateLink", "setFinderJumpInfo jumpInfo invalid");
                return;
            }
            this.f108463f = j1.toString();
            j1.remove("jumpType");
            Log.m105925i("MicroMsg.NetSceneTranslateLink", "setFinderJumpInfo finderJumpInfo: %s, jumpInfo: %s", str, j1);
            C52178yw3 yw32 = new C52178yw3();
            C48717ai0 ai02 = new C48717ai0();
            yw32.f145550d = ai02;
            ai02.f130548d = optInt;
            ai02.f130549e = j1.toString();
            ((vj4) this.f108462e.f127055a.f127080a).f143533j = yw32;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.NetSceneTranslateLink", e, "setFinderComponentInfo exception", new Object[0]);
        }
    }

    public C40360i0(String str, int i, LinkedList<C52064y4> linkedList, String str2, String str3, int i2, C49388f7 f7Var) {
        mo63049k1(str, i, linkedList, str2, str3, i2, f7Var);
    }
}
