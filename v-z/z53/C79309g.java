package z53;

import b63.C67193m;
import b63.C67209v;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.wallet_core.model.C45118l0;
import com.tencent.p014mm.wallet_core.model.C75117g0;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import com.tenpay.android.wechat.TenpayUtil;
import gy3.C87412m;
import java.util.HashMap;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONObject;
import te3.C51018qv3;
import te3.tf4;
import te3.uf4;

/* renamed from: z53.g */
public class C79309g extends C75117g0 {

    /* renamed from: d */
    public String f232830d;

    /* renamed from: e */
    public boolean f232831e;

    /* renamed from: f */
    public boolean f232832f;

    /* renamed from: g */
    public long f232833g;

    /* renamed from: h */
    public String f232834h;

    /* renamed from: i */
    public String f232835i;

    /* renamed from: j */
    public String f232836j;

    /* renamed from: n */
    public C67209v f232837n;

    /* renamed from: o */
    public C67193m f232838o;

    /* renamed from: p */
    public String f232839p;

    /* renamed from: q */
    public String f232840q;

    /* renamed from: r */
    public String f232841r;

    public C79309g(String str, String str2, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("flag", "1");
        hashMap.put("true_name", str);
        hashMap.put("identify_card", str2);
        hashMap.put("cre_type", "1");
        hashMap.put("realname_scene", i + "");
        Log.m105925i("MicroMsg.NetSceneRealNameVerify", "realname_scene=%d", Integer.valueOf(i));
        setRequestData(hashMap);
    }

    public void configRequest(boolean z, boolean z2) {
        C47350c commReqResp = getCommReqResp();
        if (commReqResp == null) {
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new tf4();
            bVar.f127067b = new uf4();
            bVar.f127068c = "/cgi-bin/mmpay-bin/tenpay/realnameauthen";
            bVar.f127069d = 1616;
            bVar.f127070e = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD;
            bVar.f127071f = 1000000185;
            commReqResp = bVar.mo72403a();
            commReqResp.setIsUserCmd(true);
        }
        tf4 tf4 = (tf4) commReqResp.f127055a.f127080a;
        if (z2) {
            tf4.f185552e = 1;
        }
        setCommReqResp(commReqResp);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.callback = nVar;
        return dispatch(gVar, this.f221047rr, this);
    }

    public int doSceneSimulately(C47350c cVar, C114770g gVar, C11385n nVar) {
        tf4 tf4 = (tf4) cVar.f127055a.f127080a;
        C51018qv3 qv32 = tf4.f185553f;
        if (qv32 != null) {
            new String(qv32.f140574f.f257327a);
        }
        C51018qv3 qv33 = tf4.f185554g;
        if (qv33 != null) {
            new String(qv33.f140574f.f257327a);
        }
        MMApplicationContext.getContext();
        return -1;
    }

    public String getEncryptUrl(String str) {
        return TenpayUtil.signWith3Des(str);
    }

    public int getPayCgicmd() {
        return 0;
    }

    public C45118l0 getRetModel(C47350c cVar) {
        uf4 uf4 = (uf4) cVar.f127056b.f127083a;
        C45118l0 l0Var = new C45118l0();
        int i = uf4.f185734g;
        l0Var.f122388c = uf4.f185733f;
        l0Var.f122387b = uf4.f185732e;
        l0Var.f122386a = uf4.f185731d;
        l0Var.f122390e = uf4.f185736i;
        l0Var.f122389d = uf4.f185735h;
        return l0Var;
    }

    public int getType() {
        return 1616;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        C67193m mVar;
        if (i == 0) {
            this.f232830d = jSONObject.optString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            this.f232831e = jSONObject.optBoolean("is_need_bind");
            this.f232832f = jSONObject.optBoolean("is_need_face");
            jSONObject.optBoolean("is_need_Laund");
            jSONObject.optString("laundh5");
            this.f232833g = jSONObject.optLong(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            this.f232834h = jSONObject.optString("package", "");
            this.f232835i = jSONObject.optString("packagesign", "");
            this.f232836j = jSONObject.optString("addbankword");
            this.f232841r = this.f232830d;
            this.f232837n = C67209v.m79540b(jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("under_age_mid_dialog");
            if (optJSONObject != null) {
                String optString = optJSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                C87412m.m108593f(optString, "it.optString(\"title\")");
                String optString2 = optJSONObject.optString("wording");
                C87412m.m108593f(optString2, "it.optString(\"wording\")");
                String optString3 = optJSONObject.optString("btn_cancel");
                C87412m.m108593f(optString3, "it.optString(\"btn_cancel\")");
                String optString4 = optJSONObject.optString("btn_confirm");
                C87412m.m108593f(optString4, "it.optString(\"btn_confirm\")");
                mVar = new C67193m(optString, optString2, optString3, optString4);
            } else {
                mVar = null;
            }
            this.f232838o = mVar;
            this.f232839p = jSONObject.optString("under_age_session_id");
            this.f232840q = jSONObject.optString("underage_msg_preview");
        }
    }

    public String parseErrDialogCancelBtnText(JSONObject jSONObject) {
        return jSONObject.optString("error_btn_cancel");
    }

    public String parseErrDialogOkBtnText(JSONObject jSONObject) {
        return jSONObject.optString("error_btn_confirm");
    }

    public void putToReqText(C47350c cVar, C51018qv3 qv32) {
        ((tf4) cVar.f127055a.f127080a).f185553f = qv32;
    }

    public void putToWXReqText(C47350c cVar, C51018qv3 qv32) {
        ((tf4) cVar.f127055a.f127080a).f185554g = qv32;
    }

    public C79309g(String str, String str2, int i, int i2, Profession profession, String str3, String str4, String str5, String str6, long j, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, int i3) {
        Profession profession2 = profession;
        String str14 = str10;
        HashMap hashMap = new HashMap();
        hashMap.put("flag", "1");
        String str15 = str;
        hashMap.put("true_name", str);
        String str16 = str2;
        hashMap.put("identify_card", str2);
        StringBuilder sb = new StringBuilder();
        int i4 = i;
        sb.append(i);
        sb.append("");
        hashMap.put("realname_scene", sb.toString());
        hashMap.put("cre_type", String.valueOf(i2));
        if (profession2 != null) {
            hashMap.put("profession_name", profession2.f209290d);
            hashMap.put("profession_type", String.valueOf(profession2.f209291e));
        }
        String str17 = str3;
        hashMap.put("user_country", str3);
        String str18 = str4;
        hashMap.put("user_province", str4);
        String str19 = str5;
        hashMap.put("user_city", str5);
        String str20 = str6;
        hashMap.put("cre_expire_date", str6);
        hashMap.put("creid_renewal", String.valueOf(j));
        hashMap.put("birth_date", str7);
        hashMap.put("nationality", str8);
        hashMap.put("session_id", str9);
        hashMap.put("cre_effect_date", str14);
        hashMap.put("cre_effective_date", str14);
        hashMap.put("entry_scene", String.valueOf(i3));
        hashMap.put("detail_address", str11);
        hashMap.put("sex", str12);
        if (z) {
            hashMap.put("is_close_marketing", "true");
        }
        hashMap.put("cre_expire_date_plain", str13);
        Log.m105925i("MicroMsg.NetSceneRealNameVerify", "realname_scene=%d", Integer.valueOf(i3));
        setRequestData(hashMap);
    }
}
