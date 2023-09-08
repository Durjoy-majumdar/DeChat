package id2;

import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import f40.C86709a0;
import fr3.C75790l;
import java.util.HashMap;
import java.util.Map;
import kd2.C76559f;
import org.json.JSONObject;
import p156gj.C87203t;

/* renamed from: id2.o */
public class C76310o extends C75790l {

    /* renamed from: j */
    public static String f223539j = "";

    /* renamed from: n */
    public static String f223540n = "";

    /* renamed from: d */
    public int f223541d = -1;

    /* renamed from: e */
    public String f223542e = "";

    /* renamed from: f */
    public String f223543f = "";

    /* renamed from: g */
    public String f223544g = "";

    /* renamed from: h */
    public String f223545h = "";

    /* renamed from: i */
    public final Map<String, String> f223546i;

    public C76310o(String str, int i) {
        HashMap hashMap = new HashMap();
        this.f223546i = hashMap;
        hashMap.put(TPDownloadProxyEnum.USER_DEVICE_ID, C87203t.m108273i());
        hashMap.put(AppMeasurement.Param.TIMESTAMP, str);
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "" + i);
        hashMap.put("sign", MD5Util.getMD5String(C87203t.m108273i() + "&" + str));
        StringBuilder sb = new StringBuilder();
        sb.append("");
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, ""));
        hashMap.put("code_ver", sb.toString());
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 568;
    }

    public int getTenpayCgicmd() {
        return 49;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlinequeryuser";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            f223539j = jSONObject.optString("limit_fee");
            f223540n = jSONObject.optString("is_show_order_detail");
            String optString = jSONObject.optString("pay_amount");
            String optString2 = jSONObject.optString("pay_number");
            String optString3 = jSONObject.optString("card_logos");
            C69963m.wx0().Cx0(196629, f223539j);
            C69963m.wx0().Cx0(196641, f223540n);
            C69963m.wx0().Cx0(196645, optString);
            C69963m.wx0().Cx0(196646, optString2);
            C69963m.wx0().Cx0(196615, optString3);
            C76559f.f224087e = optString3;
            jSONObject.optInt("retcode");
            jSONObject.optString("retmsg");
            this.f223541d = jSONObject.optInt("wx_error_type");
            this.f223542e = jSONObject.optString("wx_error_msg");
            this.f223543f = jSONObject.optString("get_code_flag");
            this.f223544g = jSONObject.optString("micropay_pause_flag");
            this.f223545h = jSONObject.optString("micropay_pause_word");
        }
    }
}
