package com.tencent.p014mm.plugin.appbrand.keylogger;

import com.tencent.p014mm.plugin.appbrand.keylogger.C83224m;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83227o;
import com.tencent.p014mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import uo0.C90709a;
import uo0.C90712d;
import uo0.C90716l;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.n */
public final class C83226n {

    /* renamed from: a */
    public static C40483p f243073a = new C40483p();

    /* renamed from: b */
    public static boolean f243074b = false;

    /* renamed from: a */
    public static void m102124a(Class cls, String str, String str2) {
        String b;
        if (f243074b && (b = C83229q.m102137b(cls)) != null) {
            f243073a.mo63264a(b, "%d|%s|%s|%d|%s|%s", Long.valueOf(System.currentTimeMillis()), str, "CollectKeyInfo", 0, "", str2);
        }
    }

    /* renamed from: b */
    public static void m102125b(String str, C90709a aVar) {
        m102126c(str, aVar, "");
    }

    /* renamed from: c */
    public static void m102126c(String str, C90709a aVar, String str2) {
        if (f243074b) {
            String a = aVar.mo124834a();
            String name = aVar.name();
            boolean d = aVar.mo124837d();
            f243073a.mo63264a(a, "%d|%s|%s|%d|%s|%s", Long.valueOf(System.currentTimeMillis()), str, name, Integer.valueOf(d ? 1 : 0), String.format("fail:%s", new Object[]{str2}), "");
        }
        C83227o.m102134a(str, aVar, str2, "");
    }

    /* renamed from: d */
    public static void m102127d(String str, C90709a aVar, String str2, String str3, long j, long j2) {
        if (f243074b) {
            f243073a.mo63264a(aVar.mo124834a(), "%d|%s|%s|%d|%s|%s", Long.valueOf(j), str, aVar.name(), 0, "stepStart", str3);
            f243073a.mo63264a(aVar.mo124834a(), "%d|%s|%s|%d|%s|%s", Long.valueOf(j2), str, aVar.name(), Integer.valueOf(aVar.mo124837d() ? 1 : 0), String.format("fail:%s", new Object[]{str2}), str3);
        }
        C83227o.m102134a(str, aVar, str2, str3);
    }

    /* renamed from: e */
    public static void m102128e(String str, C90709a aVar) {
        if (f243074b) {
            String a = aVar.mo124834a();
            String name = aVar.name();
            boolean d = aVar.mo124837d();
            f243073a.mo63264a(a, "%d|%s|%s|%d|%s|%s", Long.valueOf(System.currentTimeMillis()), str, name, Integer.valueOf(d ? 1 : 0), "ok", "");
        }
        C83227o.C83228a aVar2 = C83227o.f243075a;
        C83224m.C83225a.f243072a.mo115468a(aVar.mo124834a(), str, aVar, C83227o.f243075a.mo115469a(aVar.mo124834a(), str, aVar));
    }

    /* renamed from: f */
    public static void m102129f(String str, C90709a aVar, String str2, long j, long j2) {
        if (f243074b) {
            f243073a.mo63264a(aVar.mo124834a(), "%d|%s|%s|%d|%s|%s", Long.valueOf(j), str, aVar.name(), 0, "stepStart", str2);
            f243073a.mo63264a(aVar.mo124834a(), "%d|%s|%s|%d|%s|%s", Long.valueOf(j2), str, aVar.name(), Integer.valueOf(aVar.mo124837d() ? 1 : 0), "ok", str2);
        }
        C83227o.C83228a aVar2 = C83227o.f243075a;
        C83224m.C83225a.f243072a.mo115468a(aVar.mo124834a(), str, aVar, j2 - j);
    }

    /* renamed from: g */
    public static void m102130g(String str, C90709a aVar) {
        if (f243074b) {
            f243073a.mo63264a(aVar.mo124834a(), "%d|%s|%s|%d|%s|%s", Long.valueOf(System.currentTimeMillis()), str, aVar.name(), 0, "stepStart", "");
        }
        C83227o.C83228a aVar2 = C83227o.f243075a;
        String a = aVar.mo124834a();
        aVar2.getClass();
        String format = String.format("%s#%s#%s", new Object[]{a, str, aVar.name()});
        ((ConcurrentHashMap) aVar2.f243076a).put(format, Long.valueOf(System.currentTimeMillis()));
        C83224m mVar = C83224m.C83225a.f243072a;
        List list = (List) ((HashMap) mVar.f243071a).get(aVar.mo124834a());
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ((C90712d) list.get(i)).mo116877a(str, aVar);
            }
        }
    }

    /* renamed from: h */
    public static IKeyStepAnalyser$StepLogInfo m102131h(String str) {
        Pattern pattern = C40483p.f108772b;
        if (!Util.isNullOrNil(str)) {
            Matcher matcher = C40483p.f108772b.matcher(str);
            str = matcher.find() ? matcher.group(1) : null;
        }
        if (Util.isNullOrNil(str)) {
            return null;
        }
        String[] split = str.split("\\|", -1);
        if (split == null) {
            Log.m105928w("WeAppKeyLogger", "parse items null");
            return null;
        } else if (split.length != 6) {
            Log.m105929w("WeAppKeyLogger", "parse items length illegal:%d", Integer.valueOf(split.length));
            return null;
        } else {
            try {
                IKeyStepAnalyser$StepLogInfo iKeyStepAnalyser$StepLogInfo = new IKeyStepAnalyser$StepLogInfo();
                iKeyStepAnalyser$StepLogInfo.f243051d = Util.getLong(split[0], 0);
                iKeyStepAnalyser$StepLogInfo.f243052e = split[1];
                iKeyStepAnalyser$StepLogInfo.f243053f = split[2];
                iKeyStepAnalyser$StepLogInfo.f243054g = Util.getInt(split[3], 1) == 1;
                iKeyStepAnalyser$StepLogInfo.f243055h = split[4];
                iKeyStepAnalyser$StepLogInfo.f243056i = split[5];
                return iKeyStepAnalyser$StepLogInfo;
            } catch (Exception e) {
                Log.m105925i("WeAppKeyLogger", "parse e:%s", e);
                return null;
            }
        }
    }

    /* renamed from: i */
    public static void m102132i(Class cls, String str) {
        List<C90716l> a = C83229q.m102136a(cls, (String) null);
        if (a != null) {
            m102128e(str, a.get(a.size() - 1).f260551a);
            List list = (List) ((HashMap) C83224m.C83225a.f243072a.f243071a).get(a.get(0).f260551a.mo124834a());
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    ((C90712d) list.get(i)).mo116878b(str);
                }
            }
        }
    }

    /* renamed from: j */
    public static void m102133j(Class cls, String str) {
        List<C90716l> a = C83229q.m102136a(cls, (String) null);
        if (a != null) {
            m102128e(str, a.get(0).f260551a);
            List list = (List) ((HashMap) C83224m.C83225a.f243072a.f243071a).get(a.get(0).f260551a.mo124834a());
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    ((C90712d) list.get(i)).mo116879c(str);
                }
            }
        }
    }
}
