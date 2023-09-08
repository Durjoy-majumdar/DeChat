package com.tencent.p014mm.plugin.performance.diagnostic;

import android.text.TextUtils;
import ce2.C28546c;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.performance.diagnostic.e */
public class C30338e implements C28546c {

    /* renamed from: e */
    public static final C30338e f81885e = new C30338e();

    /* renamed from: d */
    public final Map<String, C30339a> f81886d = new HashMap();

    /* renamed from: com.tencent.mm.plugin.performance.diagnostic.e$a */
    public interface C30339a {
        /* renamed from: a */
        void mo57288a();
    }

    /* renamed from: a */
    public void mo57287a(String str, C30339a aVar) {
        if (TextUtils.isEmpty(str) || aVar == null) {
            Log.m105920e("MicroMsg.ReportLogic", "tag or reporter should not be null");
        } else {
            ((HashMap) this.f81886d).put(str, aVar);
        }
    }

    /* renamed from: b */
    public String mo56049b() {
        return ".cmd.diagnostic.report";
    }

    /* renamed from: c */
    public void mo56050c(Map<String, String> map) {
        for (Map.Entry entry : ((HashMap) this.f81886d).entrySet()) {
            if (map.containsKey(".cmd.diagnostic.report." + ((String) entry.getKey()))) {
                ((C30339a) entry.getValue()).mo57288a();
            }
        }
    }

    /* renamed from: d */
    public void mo56051d() {
    }
}
