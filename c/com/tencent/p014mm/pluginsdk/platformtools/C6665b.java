package com.tencent.p014mm.pluginsdk.platformtools;

import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mm.pluginsdk.platformtools.b */
public class C6665b {

    /* renamed from: a */
    public ConcurrentHashMap<String, Integer> f23995a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public ConcurrentHashMap<String, Long> f23996b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public boolean f23997c = false;

    static {
        new C6665b("default");
    }

    public C6665b(String str) {
        if (CrashReportFactory.hasDebuger()) {
            this.f23997c = true;
        }
    }

    /* renamed from: a */
    public void mo7583a(String str) {
        if (this.f23997c) {
            this.f23995a.put(str, Integer.valueOf((this.f23995a.containsKey(str) ? this.f23995a.get(str).intValue() : 0) + 1));
            if (System.currentTimeMillis() - (this.f23996b.containsKey(str) ? this.f23996b.get(str).longValue() : 0) > 1000) {
                this.f23995a.put(str, 0);
                this.f23996b.put(str, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
