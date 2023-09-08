package z53;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.RealNameBundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: z53.f */
public class C79308f extends C75790l {

    /* renamed from: d */
    public String f232826d;

    /* renamed from: e */
    public String f232827e;

    /* renamed from: f */
    public String f232828f;

    /* renamed from: g */
    public int f232829g;

    public C79308f(int i, String str, String str2, String str3, int i2, String str4, RealNameBundle realNameBundle, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("flag", i + "");
        hashMap.put("passwd", str);
        hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str2);
        hashMap.put("face_token", str3);
        hashMap.put("realname_scene", i2 + "");
        hashMap.put("session_id", str4);
        if (z) {
            hashMap.put("is_close_marketing", z + "");
        }
        Log.m105925i("MicroMsg.NetSceneRealNameReg", "realname_scene=%d", Integer.valueOf(i2));
        if (realNameBundle != null) {
            realNameBundle.mo99365a(hashMap);
        }
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1648;
    }

    public int getTenpayCgicmd() {
        return 1648;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/realnamereg";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105924i("MicroMsg.NetSceneRealNameReg", "errCode=" + str + ";errMsg=" + str);
        this.f232826d = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f232827e = jSONObject.optString("desc");
        this.f232828f = jSONObject.optString("page");
        this.f232829g = jSONObject.optInt("err_jump_page");
    }
}
