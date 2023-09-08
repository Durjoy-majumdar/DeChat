package j53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONException;
import org.json.JSONObject;
import te3.hj4;
import te3.ij4;

/* renamed from: j53.h */
public class C46426h extends C75123k0 {

    /* renamed from: d */
    public final C47350c f125030d;

    /* renamed from: e */
    public C11385n f125031e;

    /* renamed from: f */
    public ij4 f125032f;

    /* renamed from: g */
    public C46427a f125033g;

    /* renamed from: j53.h$a */
    public static class C46427a {

        /* renamed from: a */
        public int f125034a;

        /* renamed from: b */
        public String f125035b;

        /* renamed from: c */
        public boolean f125036c;

        /* renamed from: d */
        public boolean f125037d;

        /* renamed from: e */
        public String f125038e;

        /* renamed from: f */
        public String f125039f;

        /* renamed from: g */
        public boolean f125040g;

        /* renamed from: h */
        public String f125041h;

        /* renamed from: i */
        public String f125042i;

        /* renamed from: j */
        public String f125043j;

        /* renamed from: a */
        public String mo71827a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("ret_code", this.f125034a);
                jSONObject.put("ret_msg", this.f125035b);
                jSONObject.put("is_show", this.f125036c);
                jSONObject.put("is_open", this.f125037d);
                jSONObject.put("entrance_name", this.f125038e);
                jSONObject.put("wording", this.f125039f);
                jSONObject.put("is_new_user", this.f125040g);
                jSONObject.put("compliance_item_wording", this.f125041h);
                jSONObject.put("compliance_item_title", this.f125042i);
                jSONObject.put("compliance_item_link", this.f125043j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.mobileRemit.NetSceneMobileRemitGetSwitch", "MobileRemitSwitchConfig getJSONObjectString() Exception: %s", e.getMessage());
                return "";
            }
        }

        public String toString() {
            return "MobileRemitSwitchConfig{ret_code=" + this.f125034a + ", ret_msg='" + this.f125035b + '\'' + ", is_show=" + this.f125036c + ", is_open=" + this.f125037d + ", entrance_name='" + this.f125038e + '\'' + ", wording='" + this.f125039f + '\'' + ", is_new_user='" + this.f125040g + ", compliance_item_wording='" + this.f125041h + '\'' + ", compliance_item_title='" + this.f125042i + '\'' + ", compliance_item_link='" + this.f125043j + '\'' + '}';
        }
    }

    public C46426h(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        hj4 hj4 = new hj4();
        hj4.f134691d = i;
        bVar.f127066a = hj4;
        bVar.f127067b = new ij4();
        bVar.f127068c = "/cgi-bin/mmpay-bin/transferphonegetswitch";
        bVar.f127069d = 1813;
        this.f125030d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125031e = nVar;
        return dispatch(gVar, this.f125030d, this);
    }

    public int getType() {
        return 1813;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105929w("MicroMsg.mobileRemit.NetSceneMobileRemitGetSwitch", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f125032f = (ij4) ((C47350c) uVar).f127056b.f127083a;
        }
        this.f125031e.onSceneEnd(i2, i3, str, this);
    }
}
