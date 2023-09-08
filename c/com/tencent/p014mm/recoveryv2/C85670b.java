package com.tencent.p014mm.recoveryv2;

import android.content.Context;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.recoveryv2.RecoveryCrash;
import df3.C86274c;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.recoveryv2.b */
public class C85670b {
    /* renamed from: a */
    public static void m105782a(Context context, String str, RecoveryCrash.Record record, C86274c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "fallback");
            jSONObject.put("time", record.f249631e);
            jSONObject.put("crash_count", record.f249630d);
            jSONObject.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, record.f249632f);
            jSONObject.put("actions", cVar.getDescription());
            context.getSharedPreferences("recovery_journal_fallback", 4).edit().putString(str, jSONObject.toString()).apply();
        } catch (Throwable th) {
            C85692k.m105839a("MicroMsg.recovery.journal", "put fallback desc fail", th);
        }
    }
}
