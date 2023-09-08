package com.tencent.p014mm.matrix;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import java.util.concurrent.TimeUnit;
import oa1.C117731d;
import ur3.C90728a;

/* renamed from: com.tencent.mm.matrix.l */
public final class C80993l implements C90728a {

    /* renamed from: a */
    public final MultiProcessMMKV f237877a = MultiProcessMMKV.getMultiDefault();

    /* renamed from: a */
    public int mo112814a(String str, int i) {
        int i2;
        if (!str.equals("clicfg_matrix_trace_evil_method_threshold") || (i2 = this.f237877a.getInt("clicfg_matrix_trace_evil_method_threshold", -1)) == -1) {
            String b = mo112815b(str, "");
            return Util.isNullOrNil(b) ? i : Util.getInt(b, i);
        }
        Log.m105925i("MicroMsg.XDynamicConfig", "[get] local! key=%s value=%s", str, Integer.valueOf(i2));
        return i2;
    }

    /* renamed from: b */
    public String mo112815b(String str, String str2) {
        if ("clicfg_matrix_resource_detect_interval_millis".equals(str) || "clicfg_matrix_resource_detect_interval_millis_bg".equals(str)) {
            if (BuildInfo.DEBUG) {
                Log.m105918d("MicroMsg.XDynamicConfig", "Matrix.ActivityRefWatcher: clicfg_matrix_resource_detect_interval_millis 30s");
                return String.valueOf(TimeUnit.SECONDS.toMillis(10));
            } else if (WeChatEnvironment.hasDebugger()) {
                Log.m105918d("MicroMsg.XDynamicConfig", "Matrix.ActivityRefWatcher: clicfg_matrix_resource_detect_interval_millis 60s");
                return String.valueOf(TimeUnit.SECONDS.toMillis(10));
            }
        }
        if ((!BuildInfo.DEBUG && !WeChatEnvironment.hasDebugger()) || !"clicfg_matrix_resource_max_detect_times".equals(str)) {
            return C117731d.m166007c().mo182444f(str, str2, false, false);
        }
        Log.m105918d("MicroMsg.XDynamicConfig", "Matrix.ActivityRefWatcher: clicfg_matrix_resource_max_detect_times 5");
        return String.valueOf(10);
    }

    /* renamed from: c */
    public boolean mo112816c(String str, boolean z) {
        String b = mo112815b(str, "");
        return Util.isNullOrNil(b) ? z : Util.getInt(b, z ? 1 : 0) != 0;
    }
}
