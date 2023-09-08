package j63;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C50503n63;
import te3.C50641o63;

/* renamed from: j63.g */
public class C46447g extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125119d;

    /* renamed from: e */
    public C47350c f125120e;

    /* renamed from: f */
    public C50641o63 f125121f;

    /* renamed from: g */
    public int f125122g = 0;

    /* renamed from: h */
    public String f125123h = "";

    public C46447g(String str, String str2, int i, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50503n63();
        bVar.f127067b = new C50641o63();
        bVar.f127069d = 1958;
        bVar.f127068c = "/cgi-bin/mmpay-bin/openecardauth";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f125120e = a;
        C50503n63 n632 = (C50503n63) a.f127055a.f127080a;
        n632.f138443d = str;
        n632.f138444e = str2;
        n632.f138445f = i;
        n632.f138446g = str3;
        Log.m105925i("MicroMsg.NetSceneOpenECardAuth", "cardType: %s, scene: %d, token: %s, wxp_passwd_enc==null: %s", str, Integer.valueOf(i), str3, Boolean.valueOf(Util.isNullOrNil(str2)));
        Log.m105925i("MicroMsg.NetSceneOpenECardAuth", "cardType: %s, scene: %d", str, Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125119d = nVar;
        return dispatch(gVar, this.f125120e, this);
    }

    public int getType() {
        return 1958;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneOpenECardAuth", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C50641o63 o632 = (C50641o63) ((C47350c) uVar).f127056b.f127083a;
        this.f125121f = o632;
        C50641o63 o633 = this.f125121f;
        Log.m105925i("MicroMsg.NetSceneOpenECardAuth", "ret_code: %d, ret_msg: %s, is_token_invalid: %s", Integer.valueOf(o632.f138982d), o633.f138983e, Boolean.valueOf(o633.f138987i));
        if (!Util.isNullOrNil(this.f125121f.f138984f)) {
            Log.m105919d("MicroMsg.NetSceneOpenECardAuth", "rettext: %s", this.f125121f.f138984f);
            try {
                JSONObject jSONObject = new JSONObject(this.f125121f.f138984f);
                this.f125122g = jSONObject.optInt("retcode", 0);
                this.f125123h = jSONObject.optString("retmsg", "");
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.NetSceneOpenECardAuth", e, "", new Object[0]);
            }
        }
        C11385n nVar = this.f125119d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
