package hz0;

import android.text.TextUtils;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C48776ax1;
import te3.C48921bx1;
import te3.C51854wn;

/* renamed from: hz0.a0 */
public class C46139a0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f124330d;

    /* renamed from: e */
    public C11385n f124331e;

    /* renamed from: f */
    public String f124332f;

    /* renamed from: g */
    public int f124333g;

    /* renamed from: h */
    public String f124334h;

    /* renamed from: i */
    public int f124335i;

    /* renamed from: j */
    public String f124336j;

    public C46139a0(LinkedList<C51854wn> linkedList, int i, String str, String str2, String str3, String str4, String str5, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48776ax1();
        bVar.f127067b = new C48921bx1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getcardlistfromapp";
        bVar.f127069d = 1079;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f124330d = a;
        C48776ax1 ax12 = (C48776ax1) a.f127055a.f127080a;
        ax12.f130821d = linkedList;
        ax12.f130822e = i;
        ax12.f130824g = str;
        ax12.f130825h = str2;
        ax12.f130827j = str3;
        ax12.f130826i = str4;
        ax12.f130828n = str5;
        ax12.f130829o = i2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124331e = nVar;
        return dispatch(gVar, this.f124330d, this);
    }

    public int getType() {
        return 1079;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, errType = " + i2 + " errCode = " + i3 + " netType = " + 1079);
        if (i2 == 0 && i3 == 0) {
            String str2 = ((C48921bx1) this.f124330d.f127056b.f127083a).f131368d;
            this.f124332f = str2;
            if (TextUtils.isEmpty(str2)) {
                Log.m105920e("MicroMsg.NetSceneGetCardListFromApp", "parseRespData json_ret is empty!");
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(this.f124332f);
                    this.f124333g = jSONObject.optInt("accept_button_status", 0);
                    this.f124334h = jSONObject.optString("accept_button_wording");
                    this.f124335i = jSONObject.optInt("private_status", 0);
                    this.f124336j = jSONObject.optString("private_wording");
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.NetSceneGetCardListFromApp", e, "", new Object[0]);
                    Log.m105920e("MicroMsg.NetSceneGetCardListFromApp", "parseRespData:" + e.getMessage());
                }
            }
        }
        this.f124331e.onSceneEnd(i2, i3, str, this);
    }
}
