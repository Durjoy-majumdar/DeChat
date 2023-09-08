package dl0;

import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: dl0.c */
public final class C86342c extends C86341b {
    public static final int CTRL_INDEX = 1152;
    public static final String NAME = "openCustomerServiceChatForFakeNative";

    /* renamed from: g */
    public final boolean f251041g = true;

    /* renamed from: A */
    public int mo120727A(C81925i2 i2Var, JSONObject jSONObject, JSONObject jSONObject2) {
        C87412m.m108594g(jSONObject, "extInfo");
        C87412m.m108594g(jSONObject2, "data");
        super.mo120727A(i2Var, jSONObject, jSONObject2);
        return jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 8);
    }

    /* renamed from: w */
    public void mo120728w(OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest) {
        C87412m.m108594g(openIMKefuStartConversationRequest, "request");
        openIMKefuStartConversationRequest.f108518g = true;
    }

    /* renamed from: x */
    public boolean mo120729x() {
        return this.f251041g;
    }

    /* renamed from: z */
    public String mo120731z(C81925i2 i2Var, JSONObject jSONObject, JSONObject jSONObject2) {
        C87412m.m108594g(jSONObject, "extInfo");
        C87412m.m108594g(jSONObject2, "data");
        String optString = jSONObject.optString("entity", super.mo120731z(i2Var, jSONObject, jSONObject2));
        C87412m.m108593f(optString, "extInfo.optString(ENTITY…(service, extInfo, data))");
        return optString;
    }
}
