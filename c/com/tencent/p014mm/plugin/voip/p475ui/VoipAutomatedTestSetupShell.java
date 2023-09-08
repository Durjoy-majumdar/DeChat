package com.tencent.p014mm.plugin.voip.p475ui;

import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.pinus.ChildProcessServiceWrapper;
import gy3.C87412m;
import org.json.JSONObject;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.voip.ui.VoipAutomatedTestSetupShell */
public final class VoipAutomatedTestSetupShell {

    /* renamed from: a */
    public static final VoipAutomatedTestSetupShell f82264a = new VoipAutomatedTestSetupShell();

    /* renamed from: b */
    public static final String f82265b = (MMApplicationContext.getContext().getExternalFilesDir((String) null) + "/voip_test_result.json");

    /* renamed from: c */
    public static JSONObject f82266c;

    /* renamed from: d */
    public static JSONObject f82267d;

    /* renamed from: e */
    public static final VoipAutomatedTestSetupShell$listener$1 f82268e = new VoipAutomatedTestSetupShell$listener$1(C40008f.f107254d);

    /* renamed from: a */
    public final void mo57464a() {
        int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_VOIP_TestEncodeParam_Int, 0);
        JSONObject jSONObject = f82266c;
        JSONObject jSONObject2 = f82267d;
        if (e != 0 && jSONObject != null && jSONObject2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("write report to ");
            String str = f82265b;
            sb.append(str);
            Log.m105924i("MicroMsg.VoipAutomatedTestSetupShell", sb.toString());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("temperature", jSONObject);
            jSONObject3.put(ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, jSONObject2);
            C86013q1.m106447h(str);
            C86013q1.m106444e(str);
            String jSONObject4 = jSONObject3.toString();
            C87412m.m108593f(jSONObject4, "json.toString()");
            byte[] bytes = jSONObject4.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            C86013q1.m106438T(str, bytes, 0, bytes.length);
            f82266c = null;
            f82267d = null;
        }
    }
}
