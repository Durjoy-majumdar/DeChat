package id2;

import b63.C113146l;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hilive.mediasdk.SdkInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONObject;
import te3.C50219l53;
import te3.C50357m53;

/* renamed from: id2.g */
public class C46217g extends C75123k0 {

    /* renamed from: d */
    public C11385n f124576d;

    /* renamed from: e */
    public final C47350c f124577e;

    /* renamed from: f */
    public String f124578f = "";

    /* renamed from: g */
    public int f124579g = -1;

    /* renamed from: h */
    public int f124580h = -1;

    /* renamed from: i */
    public String f124581i = "";

    /* renamed from: j */
    public int f124582j = 1;

    /* renamed from: n */
    public RealnameGuideHelper f124583n;

    /* renamed from: o */
    public String f124584o;

    /* renamed from: p */
    public String f124585p;

    /* renamed from: q */
    public String f124586q;

    /* renamed from: r */
    public String f124587r;

    /* renamed from: s */
    public String f124588s;

    public C46217g(int i, String str, String str2, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50219l53();
        bVar.f127067b = new C50357m53();
        bVar.f127068c = "/cgi-bin/mmpay-bin/offlinepayconfirm";
        bVar.f127069d = SdkInfo.ErrCode.kErrCodeFormatUnSupport;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C75228t.m90208A(str3);
        bVar.f127073h = 0;
        C47350c a = bVar.mo72403a();
        this.f124577e = a;
        C50219l53 l532 = (C50219l53) a.f127055a.f127080a;
        l532.f137184d = i;
        l532.f137185e = str;
        l532.f137186f = str2;
        l532.f137187g = C113146l.m154805c();
        this.f124582j = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124576d = nVar;
        return dispatch(gVar, this.f124577e, this);
    }

    public int getType() {
        return SdkInfo.ErrCode.kErrCodeFormatUnSupport;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        if (i2 != 0) {
            Log.m105920e("MicroMsg.NetSceneOfflinePayConfirm", "Cmd : " + SdkInfo.ErrCode.kErrCodeFormatUnSupport + ", errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        }
        C50357m53 m532 = (C50357m53) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            try {
                if (m532.f137846d != null) {
                    JSONObject jSONObject = new JSONObject(m532.f137846d);
                    this.f124578f = jSONObject.optString(FirebaseAnalytics.C113379b.TRANSACTION_ID);
                    this.f124579g = jSONObject.optInt("retcode");
                    jSONObject.optString("retmsg");
                    this.f124580h = jSONObject.optInt("wx_error_type");
                    this.f124581i = jSONObject.optString("wx_error_msg");
                    Log.m105919d("MicroMsg.NetSceneOfflinePayConfirm", "onGYNetEnd %s", jSONObject.toString());
                    if (jSONObject.has("real_name_info")) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("real_name_info");
                        this.f124584o = optJSONObject.optString("guide_flag");
                        this.f124585p = optJSONObject.optString("guide_wording");
                        this.f124586q = optJSONObject.optString("left_button_wording");
                        this.f124587r = optJSONObject.optString("right_button_wording");
                        this.f124588s = optJSONObject.optString("upload_credit_url");
                        if ("1".equals(this.f124584o) || "2".equals(this.f124584o)) {
                            RealnameGuideHelper realnameGuideHelper = new RealnameGuideHelper();
                            this.f124583n = realnameGuideHelper;
                            realnameGuideHelper.mo99373d(this.f124584o, this.f124585p, this.f124586q, this.f124587r, this.f124588s, 0);
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.NetSceneOfflinePayConfirm", e, "", new Object[0]);
                i2 = 1000;
                i3 = 2;
                str = MMApplicationContext.getContext().getString(C0966R.string.krp);
            }
        }
        C11385n nVar = this.f124576d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
