package pz0;

import android.text.TextUtils;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C51599uu2;
import te3.C51743vu2;

/* renamed from: pz0.f */
public class C47719f extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f128202d;

    /* renamed from: e */
    public C11385n f128203e;

    /* renamed from: f */
    public String f128204f;

    /* renamed from: g */
    public int f128205g = 0;

    /* renamed from: h */
    public String f128206h;

    /* renamed from: i */
    public int f128207i;

    /* renamed from: j */
    public String f128208j;

    /* renamed from: n */
    public String f128209n;

    public C47719f(String str, int i, int i2, int i3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51599uu2();
        bVar.f127067b = new C51743vu2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/marksharecard";
        bVar.f127069d = 1078;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f128202d = a;
        C51599uu2 uu22 = (C51599uu2) a.f127055a.f127080a;
        uu22.f143143d = str;
        uu22.f143145f = i2;
        uu22.f143144e = i;
        uu22.f143146g = i3;
        this.f128209n = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128203e = nVar;
        return dispatch(gVar, this.f128202d, this);
    }

    public int getType() {
        return 1078;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneMarkShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", 1078, Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            C51743vu2 vu22 = (C51743vu2) this.f128202d.f127056b.f127083a;
            Log.m105924i("MicroMsg.NetSceneMarkShareCard", "json_ret:" + vu22.f143705g);
            String str2 = vu22.f143705g;
            if (TextUtils.isEmpty(str2)) {
                Log.m105920e("MicroMsg.NetSceneMarkShareCard", "parseJson json_ret is empty!");
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    this.f128204f = jSONObject.optString("mark_user");
                    this.f128205g = jSONObject.optInt("mark_succ", 0);
                    this.f128206h = jSONObject.optString("mark_card_id");
                    this.f128207i = jSONObject.optInt("expire_time", 0);
                    this.f128208j = jSONObject.optString("pay_qrcode_wording");
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.NetSceneMarkShareCard", e, "", new Object[0]);
                }
            }
        }
        this.f128203e.onSceneEnd(i2, i3, str, this);
    }
}
