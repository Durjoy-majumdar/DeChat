package com.tencent.p014mm.plugin.voip.p475ui;

import android.content.Context;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.sdk.json.JSONUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import gy3.C87412m;
import nd3.C88930e;
import nj3.C76912y0;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.voip.ui.g0 */
public final class C30538g0 implements C88930e {

    /* renamed from: a */
    public final /* synthetic */ String f82271a;

    public C30538g0(String str) {
        this.f82271a = str;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z;
        boolean z2 = false;
        if (iArr[0] != 0) {
            C76912y0.m92773l(MMApplicationContext.getContext(), "请给存储权限");
        } else if (C86013q1.m106450k(this.f82271a)) {
            String N = C86013q1.m106432N(this.f82271a);
            Log.m105924i("MicroMsg.VoipAutomatedTestSetupShell", "receive test config in path:" + this.f82271a + ", config:" + N);
            VoipAutomatedTestSetupShell voipAutomatedTestSetupShell = VoipAutomatedTestSetupShell.f82264a;
            C87412m.m108593f(N, "config");
            try {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VOIP_FACEBEAUTY_CUSTOM_STRING, new JSONObject(N).getJSONObject(V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY).toString());
                z = true;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VoipAutomatedTestSetupShell", e, "parse config error", new Object[0]);
                z = false;
            }
            VoipAutomatedTestSetupShell voipAutomatedTestSetupShell2 = VoipAutomatedTestSetupShell.f82264a;
            try {
                JSONArray jSONArray = new JSONObject(N).getJSONArray("qos");
                JSONArray jSONArray2 = new JSONArray();
                C87412m.m108593f(jSONArray, "jsonArray");
                JSONUtils.forEach(jSONArray, new C30539h0(jSONArray2));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VOIP_QOS_CUSTOM_STRING, jSONArray2.toString());
                C79758p.f233760a.mo109887j(C104160f.RepairerConfig_VOIP_TestEncodeParam_Int, 3);
                z2 = true;
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.VoipAutomatedTestSetupShell", e2, "parse config error", new Object[0]);
            }
            Context context = MMApplicationContext.getContext();
            C76912y0.m92773l(context, "设置美颜" + z + ",设置qos" + z2);
        } else {
            Log.m105920e("MicroMsg.VoipAutomatedTestSetupShell", "config path doest not exist:" + this.f82271a);
        }
    }
}
