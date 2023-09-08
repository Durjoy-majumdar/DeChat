package v53;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71648n1;
import org.json.JSONObject;

/* renamed from: v53.m0 */
public class C78351m0 {

    /* renamed from: a */
    public String f229599a;

    /* renamed from: b */
    public String f229600b;

    /* renamed from: c */
    public boolean f229601c;

    /* renamed from: d */
    public C78350l0 f229602d;

    /* renamed from: e */
    public String f229603e;

    /* renamed from: a */
    public static C78351m0 m94631a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C78351m0 m0Var = new C78351m0();
        m0Var.f229599a = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        m0Var.f229600b = jSONObject.optString("sub_title");
        m0Var.f229601c = jSONObject.optBoolean("is_lqt_user");
        m0Var.f229603e = jSONObject.optString("lqt_operate_id");
        C71648n1.m84125c(jSONObject.optString("lqt_trace_info"));
        JSONObject optJSONObject = jSONObject.optJSONObject("open_lqt_info");
        if (optJSONObject != null) {
            C78350l0 l0Var = new C78350l0();
            m0Var.f229602d = l0Var;
            l0Var.f229595a = optJSONObject.optString("open_info");
            m0Var.f229602d.f229596b = optJSONObject.optString("open_url");
            m0Var.f229602d.f229597c = optJSONObject.optInt("route_type");
            m0Var.f229602d.f229598d = optJSONObject.optString("appname");
        }
        return m0Var;
    }
}
