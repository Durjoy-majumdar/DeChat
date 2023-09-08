package z53;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fr3.C75790l;
import org.json.JSONObject;

/* renamed from: z53.i */
public class C79310i extends C75790l {

    /* renamed from: d */
    public String f232842d;

    /* renamed from: e */
    public String f232843e;

    /* renamed from: f */
    public String f232844f;

    /* renamed from: g */
    public String f232845g;

    /* renamed from: h */
    public String f232846h;

    /* renamed from: i */
    public long f232847i;

    public int getFuncId() {
        return 1614;
    }

    public int getTenpayCgicmd() {
        return 1614;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/realnamegetduty";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105924i("MicroMsg.NetSceneRealnameGetDuty", "errCode=" + i + ";errMsg=" + str);
        if (i == 0 && jSONObject != null) {
            this.f232842d = jSONObject.optString("agreed_flag", "0");
            this.f232843e = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            this.f232844f = jSONObject.optString("service_protocol_wording", "");
            this.f232845g = jSONObject.optString("service_protocol_url", "");
            this.f232846h = jSONObject.optString("button_wording", "");
            long optLong = jSONObject.optLong("delay_expired_time", 0);
            this.f232847i = optLong;
            if (optLong > 0) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_REALNAME_DISCLAIMER_QUERY_EXPIRED_TIME_LONG_SYNC, Long.valueOf(System.currentTimeMillis() + (this.f232847i * 1000)));
            }
        }
    }
}
