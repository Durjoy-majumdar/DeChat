package r70;

import com.tencent.matrix.resource.C80530h;
import com.tencent.p014mm.plugin.performance.watchdogs.C85349q;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.XWebSdk;
import di3.C86312j;
import h81.C32735h;
import hm3.C32963h;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import r70.C89888c;

/* renamed from: r70.d */
public class C89892d implements C89888c.C89891c {

    /* renamed from: b */
    public static C89893a f258345b;

    /* renamed from: a */
    public final double f258346a = Math.random();

    /* renamed from: r70.d$a */
    public interface C89893a {
    }

    /* renamed from: a */
    public void mo124174a(C89888c.C89889a aVar) {
        if (!(aVar.f261447e instanceof C80530h)) {
            Log.m105920e("Matrix.ResourcePluginReporter", "reporter not match plugin");
            return;
        }
        try {
            int i = aVar.f261443a;
            JSONObject jSONObject = aVar.f261446d;
            String string = jSONObject.getString("dump_mode");
            Log.m105925i("Matrix.ResourcePluginReporter", "issueType = %s", Integer.valueOf(i));
            Log.m105925i("Matrix.ResourcePluginReporter", "content = %s", jSONObject.toString());
            if ("SILENCE_ANALYSE".equals(string)) {
                if (i == 0) {
                    Log.m105924i("Matrix.ResourcePluginReporter", "LEAK_FOUND");
                    mo124181b(jSONObject, 7);
                } else if (i == 2) {
                    Log.m105924i("Matrix.ResourcePluginReporter", "ERR_FILE_NOT_FOUND");
                    mo124181b(jSONObject, 1);
                } else if (i == 3) {
                    Log.m105924i("Matrix.ResourcePluginReporter", "ERR_ANALYSE_OOM");
                    mo124181b(jSONObject, 3);
                }
            } else if ("NO_DUMP".equals(string)) {
                if (i == 0) {
                    Class cls = C32735h.class;
                    if ((((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_matrix_resource_new_release_report_enable_v2, true) && this.f258346a < 1.0d / ((double) ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_matrix_resource_new_release_report_rate_v2, 10))) || WeChatEnvironment.hasDebugger()) {
                        mo124181b(jSONObject, 29);
                    }
                }
            } else if ("MANUAL_DUMP".equals(string)) {
                if (i == 0) {
                    Log.m105924i("Matrix.ResourcePluginReporter", "LEAK_FOUND");
                    mo124181b(jSONObject, 15);
                    if (Log.getLogLevel() <= 1) {
                        C32963h.f89563d.mo58892d(jSONObject.getString(EnvConsts.ACTIVITY_MANAGER_SRVNAME), jSONObject.getString("ref_key"), jSONObject.getString("hprof_path"), jSONObject.getString("leak_detail"));
                    }
                } else if (i == 2) {
                    Log.m105924i("Matrix.ResourcePluginReporter", "ERR_FILE_NOT_FOUND");
                    mo124181b(jSONObject, 17);
                } else if (i == 3) {
                    Log.m105924i("Matrix.ResourcePluginReporter", "ERR_ANALYSE_OOM");
                    mo124181b(jSONObject, 16);
                }
            } else if ("FORK_ANALYSE".equals(string)) {
                if (i == 0) {
                    Log.m105924i("Matrix.ResourcePluginReporter", "LEAK_FOUND");
                    mo124181b(jSONObject, 27);
                } else if (i == 5) {
                    Log.m105924i("Matrix.ResourcePluginReporter", "ERR_FILE_NOT_FOUND");
                    mo124181b(jSONObject, 28);
                }
            } else if (!"LAZY_FORK_ANALYZE".equals(string)) {
            } else {
                if (i == 0) {
                    Log.m105924i("Matrix.ResourcePluginReporter", "LEAK_FOUND");
                    mo124181b(jSONObject, 24);
                } else if (i == 2) {
                    Log.m105924i("Matrix.ResourcePluginReporter", "ERR_FILE_NOT_FOUND");
                    mo124181b(jSONObject, 26);
                } else if (i == 3) {
                    Log.m105924i("Matrix.ResourcePluginReporter", "ERR_ANALYSE_OOM");
                    mo124181b(jSONObject, 25);
                }
            }
        } catch (JSONException e) {
            Log.printErrStackTrace("Matrix.ResourcePluginReporter", e, "", new Object[0]);
            if (BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) {
                throw new RuntimeException("Matrix report error -- yves", e);
            }
            C115669n.INSTANCE.mo160131h(18573, "", android.util.Log.getStackTraceString(e), 0, 9, 0, BuildInfo.BUILD_TAG, BuildInfo.REV);
        }
    }

    /* renamed from: b */
    public final void mo124181b(JSONObject jSONObject, int i) {
        String str;
        int i2;
        if (f258345b != null) {
            try {
                ((C85349q.C85352c) f258345b).getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("X5Version", String.valueOf(0));
                hashMap.put("XWebVersion", String.valueOf(XWebSdk.getXWebSdkVersion()));
                str = new JSONObject(hashMap).toString().replace(",", ";");
            } catch (Throwable unused) {
            }
            i2 = jSONObject.getInt("retry_count");
            C115669n.INSTANCE.mo160131h(18573, jSONObject.getString(EnvConsts.ACTIVITY_MANAGER_SRVNAME), jSONObject.getString("leak_detail"), jSONObject.getString("cost_millis"), Integer.valueOf(i), Integer.valueOf(i2), BuildInfo.BUILD_TAG, BuildInfo.REV, str);
        }
        str = "";
        try {
            i2 = jSONObject.getInt("retry_count");
        } catch (Throwable unused2) {
            i2 = 0;
        }
        C115669n.INSTANCE.mo160131h(18573, jSONObject.getString(EnvConsts.ACTIVITY_MANAGER_SRVNAME), jSONObject.getString("leak_detail"), jSONObject.getString("cost_millis"), Integer.valueOf(i), Integer.valueOf(i2), BuildInfo.BUILD_TAG, BuildInfo.REV, str);
    }
}
