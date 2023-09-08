package j53;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;
import p206nj.C117627q;

/* renamed from: j53.s */
public class C76394s extends C75790l {

    /* renamed from: d */
    public String f223693d;

    /* renamed from: e */
    public int f223694e;

    /* renamed from: f */
    public String f223695f;

    /* renamed from: g */
    public int f223696g = -1;

    /* renamed from: h */
    public int f223697h = -1;

    /* renamed from: i */
    public String f223698i = "";

    /* renamed from: j */
    public int f223699j = -1;

    /* renamed from: n */
    public String f223700n = "";

    public C76394s(String str, int i, String str2, int i2) {
        this.f223693d = str;
        this.f223694e = i;
        this.f223695f = str2;
        HashMap hashMap = new HashMap();
        hashMap.put("cre_id", C117627q.m165908a(str));
        hashMap.put("cre_type", C117627q.m165908a(i + ""));
        hashMap.put("true_name", C117627q.m165908a(str2));
        hashMap.put("verifyScene", i2 + "");
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 2784;
    }

    public int getTenpayCgicmd() {
        return 2784;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/verifyuserrealnameinfo";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneVerifyUserRealNameInfo", "onGYNetEnd, errCode: %s, errMsg: %s, json: %s", Integer.valueOf(i), str, jSONObject);
        if (i == 0) {
            jSONObject.optString("retcode");
            jSONObject.optString("retmsg");
            this.f223696g = jSONObject.optInt("is_support_face", 0);
            this.f223697h = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            this.f223698i = jSONObject.optString("package");
            this.f223699j = jSONObject.optInt("is_need_cert");
            this.f223700n = jSONObject.optString("packagesign");
        }
    }
}
