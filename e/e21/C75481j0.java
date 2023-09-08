package e21;

import ar3.C67104a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: e21.j0 */
public class C75481j0 extends C67104a {

    /* renamed from: f */
    public int f221809f;

    /* renamed from: g */
    public String f221810g;

    /* renamed from: h */
    public String f221811h;

    /* renamed from: i */
    public int f221812i;

    /* renamed from: j */
    public String f221813j;

    /* renamed from: n */
    public String f221814n;

    /* renamed from: o */
    public String f221815o;

    /* renamed from: p */
    public String f221816p;

    /* renamed from: q */
    public String f221817q;

    /* renamed from: r */
    public String f221818r;

    /* renamed from: s */
    public int f221819s;

    /* renamed from: t */
    public String f221820t;

    /* renamed from: u */
    public String f221821u;

    /* renamed from: v */
    public String f221822v;

    /* renamed from: w */
    public String f221823w;

    /* renamed from: x */
    public long f221824x;

    /* renamed from: y */
    public String f221825y;

    public C75481j0(int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("set_amount", String.valueOf(i));
        hashMap.put("wallet_type", String.valueOf(i2));
        setRequestData(hashMap);
        Log.m105925i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "setAmount: %s, walletType: %s", Integer.valueOf(i), Integer.valueOf(i2));
    }

    public int getType() {
        return 1335;
    }

    /* renamed from: j1 */
    public String mo91201j1() {
        return "/cgi-bin/mmpay-bin/h5f2ftransfergetqrcode";
    }

    /* renamed from: k1 */
    public int mo91202k1() {
        return 1335;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        this.f221809f = jSONObject.optInt("retcode", 0);
        this.f221810g = jSONObject.optString("retmsg", "");
        this.f221811h = jSONObject.optString("qrcode_url", "");
        this.f221812i = jSONObject.optInt("alert_type", 0);
        this.f221813j = jSONObject.optString("alert_title", "");
        this.f221814n = jSONObject.optString("left_button_text", "");
        this.f221815o = jSONObject.optString("right_button_text", "");
        this.f221816p = jSONObject.optString("right_button_url", "");
        this.f221817q = jSONObject.optString("bottom_text", "");
        this.f221818r = jSONObject.optString("bottom_url", "");
        this.f221819s = jSONObject.optInt(FirebaseAnalytics.C113379b.CURRENCY, 0);
        this.f221820t = jSONObject.optString("currencyunit", "");
        this.f221821u = jSONObject.optString("notice", "");
        this.f221822v = jSONObject.optString("notice_url", "");
        this.f221823w = jSONObject.optString("recv_realname", "");
        if (jSONObject.optInt("set_amount", 0) == 0) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_HK_PAY_URL_STRING, this.f221811h);
            Log.m105925i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "set payurl: %s", this.f221811h);
        }
        Log.m105919d("MicroMsg.NetSceneH5F2fTransferGetQrCode", "url: %s, currency: %s", this.f221811h, Integer.valueOf(this.f221819s));
    }

    public C75481j0(long j, int i, String str, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("amount", String.valueOf(j));
        hashMap.put("set_amount", String.valueOf(i));
        try {
            if (!Util.isNullOrNil(str)) {
                hashMap.put("desc", URLEncoder.encode(str, "UTF-8"));
            }
        } catch (UnsupportedEncodingException e) {
            Log.printErrStackTrace("MicroMsg.NetSceneH5F2fTransferGetQrCode", e, "", new Object[0]);
        }
        hashMap.put("wallet_type", String.valueOf(i2));
        setRequestData(hashMap);
        this.f221824x = j;
        this.f221825y = str;
        Log.m105925i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "amount: %d, setAmount: %s, desc: %s, walletType: %s", Long.valueOf(j), Integer.valueOf(i), str, Integer.valueOf(i2));
    }
}
