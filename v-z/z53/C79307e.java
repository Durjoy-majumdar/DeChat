package z53;

import ae2.C39550b;
import b63.C113146l;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.JumpRemind;
import f40.C86709a0;
import ie3.C8883h;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C49107d72;
import te3.C77919e72;

/* renamed from: z53.e */
public class C79307e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f232820d;

    /* renamed from: e */
    public C47350c f232821e;

    /* renamed from: f */
    public long f232822f = 10;

    /* renamed from: g */
    public boolean f232823g = false;

    /* renamed from: h */
    public JumpRemind f232824h;

    /* renamed from: i */
    public C77919e72 f232825i;

    public C79307e(String str) {
        Log.m105925i("MicroMsg.NetSceneGetRealnameWording", "NetSceneGetRealnameWording call: %s", str);
        C47350c.C47352b bVar = new C47350c.C47352b();
        C49107d72 d722 = new C49107d72();
        d722.f132162d = C113146l.m154805c();
        d722.f132164f = str;
        if (!C8883h.m8692c()) {
            d722.f132163e = C8883h.f28150a;
        }
        bVar.f127066a = d722;
        bVar.f127067b = new C77919e72();
        bVar.f127068c = "/cgi-bin/mmpay-bin/getrealnamewording";
        bVar.f127069d = 1666;
        C47350c a = bVar.mo72403a();
        this.f232821e = a;
        a.setIsUserCmd(true);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f232820d = nVar;
        C39550b.m42181a().mo62165pk(this.f232821e, false);
        return dispatch(gVar, this.f232821e, this);
    }

    public int getType() {
        return 1666;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGetRealnameWording", "onGYNetEnd,errType=" + i2 + "errCode=" + i3);
        if (i2 == 0 && i3 == 0) {
            C77919e72 e722 = (C77919e72) ((C47350c) uVar).f127056b.f127083a;
            this.f232825i = e722;
            long j = e722.f227230p;
            if (j <= 0) {
                j = this.f232822f;
            }
            boolean z = e722.f227240z;
            this.f232823g = z;
            Log.m105925i("MicroMsg.NetSceneGetRealnameWording", "need_agree_duty %s", Boolean.valueOf(z));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("bindcardTitle", e722.f227223f);
                jSONObject.put("bindcardSubTitle", e722.f227224g);
                jSONObject.put("bindIdTitle", e722.f227225h);
                jSONObject.put("bindIdSubTitle", e722.f227226i);
                jSONObject.put("extral_wording", e722.f227227j);
                jSONObject.put("question_answer_switch", e722.f227228n);
                jSONObject.put("question_answer_url", e722.f227229o);
                jSONObject.put("cache_time", j);
                jSONObject.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(System.currentTimeMillis() / 1000));
                jSONObject.put("isShowBindCard", e722.f227231q);
                jSONObject.put("isShowBindCardVerify", e722.f227233s);
                jSONObject.put("isShowBindId", e722.f227232r);
                jSONObject.put("bindCardVerifyTitle", e722.f227234t);
                jSONObject.put("bindCardVerifySubtitle", e722.f227235u);
                jSONObject.put("bindCardVerifyAlertViewRightBtnTxt", e722.f227236v);
                jSONObject.put("bindCardVerifyAlertViewContent", e722.f227237w);
                jSONObject.put("isShowBindCardVerifyAlertView", e722.f227238x);
                LinkedList<String> linkedList = e722.f227239y;
                if (linkedList != null && linkedList.size() > 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Iterator<String> it = e722.f227239y.iterator();
                    boolean z2 = false;
                    while (it.hasNext()) {
                        String next = it.next();
                        if (z2) {
                            stringBuffer.append("\n");
                        }
                        stringBuffer.append(next);
                        z2 = true;
                    }
                    jSONObject.put("cache_header_titles", stringBuffer.toString());
                }
                jSONObject.put("isShowCapitalSecurity", e722.f227213B);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_REALNAME_SWITCH_WORDING_STRING_SYNC, jSONObject.toString());
                this.f232824h = JumpRemind.m90059d(e722.f227212A);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.NetSceneGetRealnameWording", e, "", new Object[0]);
            }
        }
        this.f232820d.onSceneEnd(i2, i3, str, this);
    }
}
