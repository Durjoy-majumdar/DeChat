package com.tencent.p014mm.plugin.appbrand.jsruntime;

import a70.C112760b;
import android.os.Process;
import com.eclipsesource.mmv8.C80135V8;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import h81.C32735h;
import org.json.JSONException;
import p774zg.C39348q0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.x */
public class C29555x {

    /* renamed from: a */
    public static boolean f80475a = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.x$a */
    public class C29556a implements C39348q0.C39349a {
    }

    static {
        m38804a();
    }

    /* renamed from: a */
    public static void m38804a() {
        Class cls = C32735h.class;
        if (!f80475a) {
            String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_v8_init_flag_v8_98, "--min_semi_space_size=4 --max_semi_space_size=8 --wasm_lazy_compilation");
            if (BuildInfo.DEBUG) {
                String Y602 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_v8_tracing_config, "{\"record_mode\": \"record-continuously\", \"included_categories\": [\"v8\", \"v8.wasm.detailed\", \"disabled-by-default-v8.runtime_stats\"]}");
                boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_v8_tracing_auto_start, false);
                if (!Util.isNullOrNil(Y602)) {
                    try {
                        C86013q1.m106461v(C112760b.m154229f());
                        C80135V8.setTracingInfo(Y602, C112760b.m154229f() + "v8_trace_" + Process.myPid() + ".json", wf);
                        Log.m105925i("MicroMsg.AppBrandJsRuntimeFactory", "set trace info %s", Y602);
                    } catch (JSONException unused) {
                        Log.m105920e("MicroMsg.AppBrandJsRuntimeFactory", "invalid v8 tracing config");
                    }
                }
            }
            if (C29553m0.f80469a.mo56809b()) {
                Y60 = Y60 + " " + C29553m0.f80471c;
            }
            Log.m105925i("MicroMsg.AppBrandJsRuntimeFactory", "set v8 flag:%s", Y60);
            C80135V8.setFlags(Y60);
            f80475a = true;
            C39348q0.f105765c = new C29556a();
        }
    }

    /* renamed from: b */
    public static void m38805b(int i) {
        if (i >= 0) {
            MultiProcessMMKV.getMMKV("MicroMsg.AppBrandJsRuntimeFactory", 2).encode("V8MinimalCodeLength", i);
        }
    }
}
