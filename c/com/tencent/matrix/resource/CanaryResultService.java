package com.tencent.matrix.resource;

import android.content.Context;
import android.content.Intent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import org.json.JSONObject;
import p1060we.C90970b;
import p269xe.C91185g;
import p723vf.C118672d;
import p761yd.C91441c;

public class CanaryResultService extends MatrixJobIntentService {
    /* renamed from: f */
    public static void m98094f(Context context, String str, String str2) {
        Intent intent = new Intent(context, CanaryResultService.class);
        intent.setAction("com.tencent.matrix.resource.result.action.REPORT_HPROF_RESULT");
        intent.putExtra("RESULT_PATH", str);
        intent.putExtra("RESULT_ACTIVITY", str2);
        MatrixJobIntentService.m98098a(context, CanaryResultService.class, -84148994, intent);
    }

    /* renamed from: d */
    public void mo112066d(Intent intent) {
        if (intent != null && "com.tencent.matrix.resource.result.action.REPORT_HPROF_RESULT".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("RESULT_PATH");
            String stringExtra2 = intent.getStringExtra("RESULT_ACTIVITY");
            if (stringExtra == null || stringExtra.isEmpty() || stringExtra2 == null || stringExtra2.isEmpty()) {
                C118672d.m167352b("Matrix.CanaryResultService", "resultPath or activityName is null or empty, skip reporting.", new Object[0]);
                return;
            }
            C91185g gVar = new C91185g(0);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("resultZipPath", stringExtra);
                jSONObject.put(EnvConsts.ACTIVITY_MANAGER_SRVNAME, stringExtra2);
                gVar.f261446d = jSONObject;
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.CanaryResultService", th, "unexpected exception, skip reporting.", new Object[0]);
            }
            C90970b a = C91441c.m114730d().mo125377a(C80530h.class);
            if (a != null) {
                a.onDetectIssue(gVar);
            }
        }
    }
}
