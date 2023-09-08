package u53;

import b63.C67209v;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import f40.C86709a0;
import fr3.C75790l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p823sg.C77710q;

/* renamed from: u53.a */
public class C78130a extends C75790l {

    /* renamed from: d */
    public Map<String, String> f228965d = new HashMap();

    /* renamed from: e */
    public Map<String, String> f228966e;

    /* renamed from: f */
    public String f228967f = null;

    /* renamed from: g */
    public String f228968g = null;

    /* renamed from: h */
    public C67209v f228969h;

    public C78130a(Authen authen, String str, String str2) {
        HashMap hashMap = new HashMap();
        this.f228966e = hashMap;
        setPayInfo(authen.f209382v, this.f228965d, hashMap);
        Map<String, String> map = this.f228965d;
        map.put("flag", "" + authen.f209367d);
        this.f228965d.put("bank_type", authen.f209370g);
        this.f228965d.put("mobile_area", authen.f209360M);
        this.f228965d.put("session_id", str2);
        if (!Util.isNullOrNil(authen.f209369f)) {
            this.f228965d.put("passwd", authen.f209369f);
        }
        if (!Util.isNullOrNil(authen.f209379s)) {
            this.f228965d.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, authen.f209379s);
        }
        if (!Util.isNullOrNil(authen.f209353F)) {
            C86709a0.m107528h();
            C77710q qVar = new C77710q(Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null), 0));
            this.f228965d.put("import_code", authen.f209353F);
            this.f228965d.put("qqid", qVar.toString());
            if (authen.f209374n > 0) {
                Map<String, String> map2 = this.f228965d;
                map2.put("cre_type", authen.f209374n + "");
            }
            this.f228965d.put("bind_serailno", authen.f209371h);
        }
        if (!Util.isNullOrNil(authen.f209383w)) {
            this.f228965d.put("first_name", authen.f209383w);
            this.f228965d.put("last_name", authen.f209384x);
            this.f228965d.put("country", authen.f209385y);
            this.f228965d.put("area", authen.f209386z);
            this.f228965d.put("city", authen.f209348A);
            this.f228965d.put("address", authen.f209349B);
            this.f228965d.put("phone_number", authen.f209350C);
            this.f228965d.put("zip_code", authen.f209351D);
            this.f228965d.put(Scopes.EMAIL, authen.f209352E);
            this.f228965d.put(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, LocaleUtil.getApplicationLanguage());
        }
        if (!Util.isNullOrNil(authen.f209372i)) {
            this.f228965d.put("true_name", authen.f209372i);
        }
        if (!Util.isNullOrNil(authen.f209373j)) {
            this.f228965d.put("identify_card", authen.f209373j);
        }
        if (authen.f209374n > 0) {
            Map<String, String> map3 = this.f228965d;
            map3.put("cre_type", authen.f209374n + "");
        }
        if (!Util.isNullOrNil(authen.f209375o)) {
            this.f228965d.put("mobile_no", authen.f209375o);
        }
        this.f228965d.put("bank_card_id", authen.f209376p);
        if (!Util.isNullOrNil(authen.f209377q)) {
            this.f228965d.put("cvv2", authen.f209377q);
        }
        if (!Util.isNullOrNil(authen.f209378r)) {
            this.f228965d.put("valid_thru", authen.f209378r);
        }
        int i = authen.f209367d;
        if (i == 1 || i == 2) {
            this.f228965d.put("creid_renewal", String.valueOf(authen.f209361N));
            this.f228965d.put("birth_date", authen.f209362P);
            this.f228965d.put("cre_expire_date", authen.f209363Q);
        }
        int i2 = authen.f209367d;
        if ((i2 == 2 || i2 == 5) && authen.f209364R == 1 && !Util.isNullOrNil(authen.f209365S)) {
            this.f228965d.put("verify_user_token", "1");
            this.f228965d.put("usertoken", authen.f209365S);
        }
        if (!Util.isNullOrNil(authen.f209366T) && authen.f209366T.isEmpty()) {
            this.f228965d.put("checkpayjsapi_token", authen.f209366T);
        }
        if (C75133p0.f221064a) {
            this.f228966e.put("uuid_for_bindcard", C75133p0.f221066c);
            Map<String, String> map4 = this.f228966e;
            map4.put("bindcard_scene", "" + C75133p0.f221065b);
        }
        if (!Util.isNullOrNil(str)) {
            this.f228965d.put("has_underage_alert", str);
        }
        setRequestData(this.f228965d);
        setWXRequestData(this.f228966e);
    }

    public int getFuncId() {
        return 471;
    }

    public int getTenpayCgicmd() {
        return 12;
    }

    public String getToken() {
        return this.f228968g;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/bindauthen";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f228967f = jSONObject.optString("req_key");
            this.f228968g = jSONObject.optString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            this.f228969h = C67209v.m79540b(jSONObject);
        }
    }

    public boolean resend() {
        super.resend();
        ((HashMap) this.f228965d).put("is_repeat_send", "1");
        setRequestData(this.f228965d);
        return true;
    }
}
