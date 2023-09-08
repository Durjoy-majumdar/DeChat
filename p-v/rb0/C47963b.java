package rb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import org.json.JSONException;
import org.json.JSONObject;
import p248ug.C52558c;
import te3.C49525g72;

/* renamed from: rb0.b */
public class C47963b implements C47968g0 {

    /* renamed from: a */
    public final /* synthetic */ String f128671a;

    public C47963b(C47961a aVar, String str) {
        this.f128671a = str;
    }

    /* renamed from: a */
    public void mo67591a(int i, int i2, String str, C47967f0 f0Var) {
        JSONObject jSONObject;
        Log.m105924i("MicroMsg.BizAttrRenovator", "onSceneEnd errType = " + i + ", errCode = " + i2 + ",errMsg = " + str);
        if (i == 0 && i2 == 0) {
            C49525g72 g722 = ((C48000p0) f0Var).f128746f;
            if (g722 == null) {
                g722 = new C49525g72();
            }
            Log.m105925i("MicroMsg.BizAttrRenovator", "resp : %s", g722.f133903d);
            C52558c SE = C48009v0.Fx0().mo72757SE(this.f128671a);
            try {
                jSONObject = Util.isNullOrNil(SE.field_extInfo) ? new JSONObject() : new JSONObject(SE.field_extInfo);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.BizAttrRenovator", "create Json object from extInfo error. %s.", e);
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("MMBizMenu", g722.f133903d);
            } catch (JSONException e2) {
                Log.m105921e("MicroMsg.BizAttrRenovator", "updateExtInfoAttrs MMBizMenu failed：value(%s), exception : %s.", g722.f133903d, e2);
            }
            if (!Util.isNullOrNil(g722.f133903d)) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WX_PAY_REVEIVE_PLUGIN_MENU_STRING_SYNC, g722.f133903d);
            }
            SE.field_extInfo = jSONObject.toString();
            C48009v0.Fx0().replace(SE);
            Log.m105924i("MicroMsg.BizAttrRenovator", "Update bizInfo attributes successfully.");
            return;
        }
        f0Var.getClass();
        Log.m105921e("MicroMsg.BizAttrRenovator", "scene.getType() = %s", 1769);
    }
}
