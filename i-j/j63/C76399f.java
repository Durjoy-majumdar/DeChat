package j63;

import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C77975p63;
import te3.C77985q63;

/* renamed from: j63.f */
public class C76399f extends C75123k0 {

    /* renamed from: d */
    public C11385n f223705d;

    /* renamed from: e */
    public C47350c f223706e;

    /* renamed from: f */
    public C77985q63 f223707f;

    /* renamed from: g */
    public String f223708g;

    /* renamed from: h */
    public String f223709h;

    /* renamed from: i */
    public String f223710i;

    /* renamed from: j */
    public int f223711j;

    /* renamed from: n */
    public String f223712n;

    public C76399f(String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2, int i2, String str6) {
        this(str, str2, str3, str4, str5, i, z, false, z2, i2, str6);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f223705d = nVar;
        return dispatch(gVar, this.f223706e, this);
    }

    public int getType() {
        return Exif.PARSE_EXIF_ERROR_CORRUPT;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneOpenECard", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C77985q63 q632 = (C77985q63) ((C47350c) uVar).f127056b.f127083a;
        this.f223707f = q632;
        Log.m105925i("MicroMsg.NetSceneOpenECard", "ret_code: %d, ret_msg: %s", Integer.valueOf(q632.f228111d), this.f223707f.f228112e);
        if (!Util.isNullOrNil(this.f223707f.f228113f)) {
            Log.m105919d("MicroMsg.NetSceneOpenECard", "rettext: %s", this.f223707f.f228113f);
            try {
                JSONObject jSONObject = new JSONObject(this.f223707f.f228113f);
                this.f223711j = jSONObject.optInt("retcode", 0);
                this.f223712n = jSONObject.optString("retmsg", "");
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.NetSceneOpenECard", e, "", new Object[0]);
            }
        }
        C11385n nVar = this.f223705d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    public C76399f(String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2, boolean z3, int i2, String str6) {
        this.f223711j = 0;
        this.f223712n = "";
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77975p63();
        bVar.f127067b = new C77985q63();
        bVar.f127069d = Exif.PARSE_EXIF_ERROR_CORRUPT;
        bVar.f127068c = "/cgi-bin/mmpay-bin/openecard";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f223706e = a;
        C77975p63 p632 = (C77975p63) a.f127055a.f127080a;
        p632.f227980d = str;
        p632.f227981e = str2;
        a.setIsUserCmd(true);
        if (z) {
            p632.f227982f = str3;
        } else {
            p632.f227983g = str3;
        }
        if (z2) {
            p632.f227987n = 1;
        } else {
            p632.f227987n = 0;
        }
        p632.f227984h = str4;
        p632.f227985i = str5;
        p632.f227986j = i;
        p632.f227988o = z3;
        p632.f227989p = i2;
        p632.f227990q = str6;
        this.f223708g = str3;
        this.f223709h = str4;
        this.f223710i = str5;
        Log.m105919d("MicroMsg.NetSceneOpenECard", "cardNo: %s", str3);
        Log.m105925i("MicroMsg.NetSceneOpenECard", "cardType: %s, reqSerial: %s, openScene: %s, mobileNo: %s, bankType: %s, bankCardInfo: %s, fromScene: %s", str, str2, Integer.valueOf(i), str4, str5, str6, Integer.valueOf(i2));
    }

    public C76399f(String str, String str2, int i) {
        this.f223711j = 0;
        this.f223712n = "";
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77975p63();
        bVar.f127067b = new C77985q63();
        bVar.f127069d = Exif.PARSE_EXIF_ERROR_CORRUPT;
        bVar.f127068c = "/cgi-bin/mmpay-bin/openecard";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f223706e = a;
        C77975p63 p632 = (C77975p63) a.f127055a.f127080a;
        p632.f227980d = str;
        p632.f227981e = str2;
        a.setIsUserCmd(true);
        p632.f227987n = 0;
        p632.f227986j = i;
        p632.f227989p = 1;
        p632.f227988o = true;
        Log.m105925i("MicroMsg.NetSceneOpenECard", "create NetSceneOpenECard with reuse exist card, cardType: %s, reqSerial: %s, openScene: %s", str, str2, Integer.valueOf(i));
    }
}
