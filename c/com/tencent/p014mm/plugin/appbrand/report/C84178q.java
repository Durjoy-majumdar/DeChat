package com.tencent.p014mm.plugin.appbrand.report;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.xweb.XWebSdk;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p757xv.C91350o;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C90364q0;
import yi0.C91452a;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.report.q */
public final class C84178q implements C91350o {

    /* renamed from: a */
    public static final C84178q f245831a = new C84178q();

    /* renamed from: a */
    public String mo116860a() {
        String sb;
        C91452a aVar = C91452a.f262179d;
        LinkedHashMap<C91452a.C91454b, Boolean> linkedHashMap = C91452a.f262181f;
        synchronized (linkedHashMap) {
            StringBuilder sb4 = new StringBuilder();
            if (linkedHashMap.size() > 0) {
                for (C91452a.C91454b next : linkedHashMap.keySet()) {
                    C87412m.m108593f(next, "it.next()");
                    sb4.append(next.f262184d);
                    sb4.append(';');
                }
            }
            sb = sb4.toString();
            C87412m.m108593f(sb, "appIdList.toString()");
        }
        return sb;
    }

    /* renamed from: b */
    public String mo116861b() {
        String str;
        C91452a aVar = C91452a.f262179d;
        LinkedHashMap<C91452a.C91454b, Boolean> linkedHashMap = C91452a.f262181f;
        synchronized (linkedHashMap) {
            if (linkedHashMap.size() > 0) {
                Set<C91452a.C91454b> keySet = linkedHashMap.keySet();
                C87412m.m108593f(keySet, "mRunningAppInfos.keys");
                str = ((C91452a.C91454b) C110818d0.m150922T(keySet)).f262185e;
            } else {
                str = "";
            }
        }
        return C112551y.m153814n(str, ",", " ", true);
    }

    /* renamed from: c */
    public String mo116862c() {
        ICommLibReader iCommLibReader = WxaCommLibRuntimeReader.f238555a;
        String i = iCommLibReader != null ? iCommLibReader.mo113377i() : null;
        return i == null ? "unknown" : i;
    }

    /* renamed from: d */
    public String mo116863d() {
        String str;
        C91452a aVar = C91452a.f262179d;
        LinkedHashMap<C91452a.C91454b, Boolean> linkedHashMap = C91452a.f262181f;
        synchronized (linkedHashMap) {
            if (linkedHashMap.size() > 0) {
                Set<C91452a.C91454b> keySet = linkedHashMap.keySet();
                C87412m.m108593f(keySet, "mRunningAppInfos.keys");
                str = ((C91452a.C91454b) C110818d0.m150922T(keySet)).f262184d;
            } else {
                str = "";
            }
        }
        return str;
    }

    /* renamed from: e */
    public String mo116864e() {
        int i;
        String valueOf = String.valueOf(XWebSdk.getAvailableVersion());
        C91452a aVar = C91452a.f262179d;
        LinkedHashMap<C91452a.C91454b, Boolean> linkedHashMap = C91452a.f262181f;
        synchronized (linkedHashMap) {
            if (linkedHashMap.size() > 0) {
                Set<C91452a.C91454b> keySet = linkedHashMap.keySet();
                C87412m.m108593f(keySet, "mRunningAppInfos.keys");
                i = ((C91452a.C91454b) C110818d0.m150922T(keySet)).f262189i;
            } else {
                i = 0;
            }
        }
        if (i == 0) {
            return valueOf;
        }
        return valueOf + "(skyline)";
    }

    public Map<String, String> getExtra() {
        return C90364q0.m113147f(new C13604l("CurrentAppIdList", mo116860a()), new C13604l("XWalkVersion", mo116864e()), new C13604l("WxaRuntimeVersion", mo116862c()), new C13604l("TopAppId", mo116863d()), new C13604l("TopAppName", mo116861b()));
    }

    public String getTag() {
        return "AppBrand";
    }
}
