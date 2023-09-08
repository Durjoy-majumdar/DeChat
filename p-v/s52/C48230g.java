package s52;

import c63.C67345b;
import c63.C67346c;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1643f;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C86484b;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p281yz.C79173v;
import te3.C51163rv3;
import te3.C51496u52;
import te3.C51648v52;

/* renamed from: s52.g */
public class C48230g extends C75123k0 {

    /* renamed from: d */
    public ArrayList<MallFunction> f129218d;

    /* renamed from: e */
    public C11385n f129219e;

    /* renamed from: f */
    public C47350c f129220f;

    /* renamed from: g */
    public int f129221g;

    public C48230g(int i, String str, int i2) {
        this(i, str, (String) null, (String) null, i2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129219e = nVar;
        return dispatch(gVar, this.f129220f, this);
    }

    public int getType() {
        return C1643f.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105924i("MicroMsg.NetSceneGetPayFunctionList", "errCode " + i3 + ", errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            C51648v52 v522 = (C51648v52) ((C47350c) uVar).f127056b.f127083a;
            Log.m105924i("MicroMsg.NetSceneGetPayFunctionList", "resp.PayFunctionList wallet_regionL " + this.f129221g + " " + v522.f143314d);
            try {
                if (!Util.isNullOrNil(v522.f143314d)) {
                    JSONObject jSONObject = new JSONObject(v522.f143314d);
                    String optString = jSONObject.optString("pay_func_list");
                    this.f129218d = C67345b.m79694h(new JSONArray(optString));
                    String optString2 = jSONObject.optString("global_activity_list");
                    String optString3 = jSONObject.optString("pay_banner_list");
                    String optString4 = jSONObject.optString("type_info_list");
                    C79173v vVar = (C79173v) C86312j.m106911c(C79173v.class);
                    vVar.getClass();
                    if (C86709a0.m107522a()) {
                        vVar.f232481p.mo59825a().mo58168jo(this.f129221g, optString, optString2, optString3, optString4, v522.f143317g);
                        C36626n.vx0().f97367d.clear();
                    } else {
                        throw new C86484b();
                    }
                }
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.NetSceneGetPayFunctionList", e, "", new Object[0]);
            }
        }
        this.f129219e.onSceneEnd(i2, i3, str, this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C48230g(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r7 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r10
            r10 = 1
            r0[r10] = r11
            java.lang.String r10 = "ISO-8859-1"
            java.lang.String r10 = java.net.URLEncoder.encode(r12, r10)
            java.lang.String r10 = r10.toString()
            r12 = 2
            r0[r12] = r10
            java.lang.String r10 = "appid=%s&funcid=%s&url=%s"
            java.lang.String r5 = java.lang.String.format(r10, r0)
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r11
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s52.C48230g.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public C48230g(int i, String str, String str2, String str3, int i2) {
        ArrayList<String> arrayList = null;
        this.f129218d = null;
        this.f129221g = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51496u52();
        bVar.f127067b = new C51648v52();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getpayfunctionlist";
        bVar.f127069d = C1643f.CTRL_INDEX;
        bVar.f127070e = WXWebReporter.WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_TEST_SYS_SUC;
        bVar.f127071f = 1000000227;
        C47350c a = bVar.mo72403a();
        this.f129220f = a;
        C51496u52 u522 = (C51496u52) a.f127055a.f127080a;
        u522.f142600d = str;
        LinkedList<C51163rv3> linkedList = new LinkedList<>();
        if (!Util.isNullOrNil(str2)) {
            MallNews mallNews = (MallNews) ((HashMap) C67346c.m79699b().f193199a).get(str2);
            if (mallNews != null && !Util.isNullOrNil(mallNews.f209747h)) {
                arrayList = new ArrayList<>();
                arrayList.add(mallNews.f209747h);
            }
        } else {
            C67346c b = C67346c.m79699b();
            b.getClass();
            arrayList = new ArrayList<>();
            for (MallNews mallNews2 : ((HashMap) b.f193199a).values()) {
                if (!Util.isNullOrNil(mallNews2.f209747h)) {
                    arrayList.add(mallNews2.f209747h);
                }
            }
            Log.m105918d("MicroMsg.MallNewsManager", "tickets.size : " + arrayList.size());
        }
        if (arrayList != null && arrayList.size() > 0) {
            String str4 = "";
            for (String str5 : arrayList) {
                C51163rv3 rv32 = new C51163rv3();
                rv32.mo73357f(str5);
                linkedList.add(rv32);
                str4 = str4 + "; + " + str5;
            }
            Log.m105918d("MicroMsg.NetSceneGetPayFunctionList", "post with list : " + str4);
        }
        u522.f142602f = linkedList;
        u522.f142601e = linkedList.size();
        if (Util.isNullOrNil(str3)) {
            u522.f142603g = String.format("tpa_country=%s", new Object[]{Integer.valueOf(i)});
        } else {
            u522.f142603g = String.format("%s&tpa_country=%s", new Object[]{str3, Integer.valueOf(i)});
        }
        u522.f142604h = i2;
        Log.m105918d("MicroMsg.NetSceneGetPayFunctionList", "telephonyNetIso " + str + " ExtInfo: " + u522.f142603g);
    }
}
