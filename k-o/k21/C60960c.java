package k21;

import a14.C53973z1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import i21.C60242i;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kj2.C61103a;
import lu3.C34379c;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: k21.c */
public final class C60960c {

    /* renamed from: a */
    public static final C60961a f173618a = new C60961a((C8480h) null);

    /* renamed from: b */
    public static final ConcurrentHashMap<String, C60959b> f173619b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final ConcurrentHashMap<String, C60959b> f173620c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static final ReentrantLock f173621d = new ReentrantLock();

    /* renamed from: e */
    public static final ReentrantLock f173622e = new ReentrantLock();

    /* renamed from: f */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, C60959b>> f173623f = new ConcurrentHashMap<>();

    /* renamed from: k21.c$a */
    public static final class C60961a {

        /* renamed from: k21.c$a$a */
        public static final class C60962a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C60959b f173624d;

            /* renamed from: e */
            public final /* synthetic */ boolean f173625e;

            /* renamed from: f */
            public final /* synthetic */ boolean f173626f;

            public C60962a(C60959b bVar, boolean z, boolean z2) {
                this.f173624d = bVar;
                this.f173625e = z;
                this.f173626f = z2;
            }

            public final void run() {
                C60960c.f173618a.mo85920d(this.f173624d, this.f173625e, this.f173626f);
            }
        }

        /* renamed from: k21.c$a$b */
        public static final class C60963b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f173627d;

            /* renamed from: e */
            public final /* synthetic */ String f173628e;

            /* renamed from: f */
            public final /* synthetic */ C32224a<Object> f173629f;

            /* renamed from: g */
            public final /* synthetic */ ConcurrentHashMap<String, C34379c<?>> f173630g;

            public C60963b(String str, String str2, C32224a<? extends Object> aVar, ConcurrentHashMap<String, C34379c<?>> concurrentHashMap) {
                this.f173627d = str;
                this.f173628e = str2;
                this.f173629f = aVar;
                this.f173630g = concurrentHashMap;
            }

            public final void run() {
                try {
                    C60960c.f173618a.mo85926j(this.f173627d, this.f173628e, this.f173629f.invoke());
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" report job sessionId:");
                    sb.append(this.f173627d);
                    sb.append(", key:");
                    sb.append(this.f173628e);
                    sb.append(", job:");
                    int i = C53973z1.f151221b0;
                    sb.append(C53973z1.C0004b.f3d);
                    Log.printErrStackTrace("MicroMsg.StaticKvStat", e, sb.toString(), new Object[0]);
                }
                this.f173630g.remove(this.f173628e);
            }
        }

        public C60961a(C8480h hVar) {
        }

        /* renamed from: b */
        public static void m71444b(C60961a aVar, String str, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            aVar.getClass();
            C87412m.m108594g(str, "sessionId");
            aVar.mo85920d(aVar.mo85921e(str), z, z2);
        }

        /* renamed from: p */
        public static int m71445p(C60961a aVar, String str, String str2, String str3, Object obj, C60242i iVar, boolean z, String str4, String str5, int i, Object obj2) {
            JSONObject jSONObject;
            if ((i & 16) != 0) {
                iVar = C60242i.DEFAULT;
            }
            if ((i & 32) != 0) {
                z = false;
            }
            if ((i & 64) != 0) {
                str4 = "td";
            }
            if ((i & 128) != 0) {
                str5 = "#";
            }
            aVar.getClass();
            C87412m.m108594g(str, "sessionId");
            C87412m.m108594g(str2, "key");
            C87412m.m108594g(str3, "valueKey");
            C87412m.m108594g(obj, "value");
            C87412m.m108594g(iVar, "opeartionState");
            C87412m.m108594g(str4, "tdName");
            C87412m.m108594g(str5, "divider");
            C60959b f = aVar.mo85922f(str);
            if (f.f173614c.get(str2) == null) {
                f.f173614c.put(str2, new JSONArray());
            }
            Object obj3 = f.f173614c.get(str2);
            if (obj3 == null) {
                return 0;
            }
            JSONArray jSONArray = obj3 instanceof JSONArray ? (JSONArray) obj3 : null;
            if (jSONArray == null) {
                return 0;
            }
            if (z) {
                jSONObject = new JSONObject();
                jSONArray.put(jSONObject);
                jSONObject.put(str4, jSONArray.length());
            } else {
                jSONObject = jSONArray.optJSONObject(jSONArray.length() - 1);
            }
            if (jSONObject != null) {
                if (iVar == C60242i.APPEND) {
                    C60961a aVar2 = C60960c.f173618a;
                    int opt = jSONObject.opt(str3);
                    if (opt == null) {
                        opt = 0;
                    }
                    if (aVar2.mo85924h(opt) && aVar2.mo85924h(obj)) {
                        int opt2 = jSONObject.opt(str3);
                        if (opt2 == null) {
                            opt2 = 0;
                        }
                        jSONObject.put(str3, aVar2.mo85936u(opt2) + aVar2.mo85936u(obj));
                    } else if (!(obj instanceof String)) {
                        C13598b0 b0Var = C13598b0.f38549a;
                    } else if (jSONObject.opt(str3) instanceof String) {
                        jSONObject.put(str3, jSONObject.opt(str3) + str5 + obj);
                    } else {
                        jSONObject.put(str3, String.valueOf(obj));
                    }
                } else {
                    jSONObject.put(str3, obj);
                }
            }
            return jSONArray.length();
        }

        /* renamed from: a */
        public final void mo85918a(String str) {
            C87412m.m108594g(str, "sessionId");
            ConcurrentHashMap<String, C60959b> concurrentHashMap = C60960c.f173620c;
            if (concurrentHashMap.containsKey(str)) {
                concurrentHashMap.remove(str);
            }
        }

        /* renamed from: c */
        public final void mo85919c(String str, String str2, boolean z) {
            C87412m.m108594g(str, "sessionKey");
            C87412m.m108594g(str2, "clazz");
            ConcurrentHashMap concurrentHashMap = C60960c.f173623f.get(str);
            if (concurrentHashMap != null) {
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    try {
                        Object newInstance = Class.forName(str2).newInstance();
                        if (newInstance instanceof C61103a) {
                            ((C60959b) entry.getValue()).f173612a = (C61103a) newInstance;
                            C60960c.f173618a.mo85920d((C60959b) entry.getValue(), z, true);
                        }
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.StaticKvStat", "commitKey, clazz:" + str2 + " is error", e);
                    }
                }
            }
            C60960c.f173623f.remove(str);
        }

        /* renamed from: d */
        public final void mo85920d(C60959b bVar, boolean z, boolean z2) {
            if (bVar == null) {
                Log.m105920e("MicroMsg.StaticKvStat", "commit  session is null ");
            } else if (z || bVar.f173615d.size() == 0) {
                if (bVar.f173612a != null) {
                    try {
                        for (Map.Entry next : bVar.f173614c.entrySet()) {
                            C61103a aVar = bVar.f173612a;
                            C87412m.m108591d(aVar);
                            String str = (String) next.getKey();
                            Object value = next.getValue();
                            aVar.mo86052l(str, value instanceof C9558a ? C112551y.m153816p(next.getValue().toString(), ",", "#", false, 4, (Object) null) : value instanceof String ? C112551y.m153816p(next.getValue().toString(), ",", "#", false, 4, (Object) null) : value instanceof JSONArray ? C112551y.m153816p(next.getValue().toString(), ",", ";", false, 4, (Object) null) : next.getValue());
                        }
                        for (Map.Entry next2 : bVar.f173617f.entrySet()) {
                            C61103a aVar2 = bVar.f173612a;
                            C87412m.m108591d(aVar2);
                            String jSONArray = ((JSONArray) next2.getValue()).toString();
                            C87412m.m108593f(jSONArray, "item.value.toString()");
                            aVar2.mo86052l((String) next2.getKey(), C112551y.m153814n(jSONArray, ",", ";", false));
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.StaticKvStat", e, " writeValue  error", new Object[0]);
                    }
                    C61103a aVar3 = bVar.f173612a;
                    C87412m.m108591d(aVar3);
                    aVar3.mo86054n();
                }
                if (bVar.f173615d.size() > 0) {
                    for (Map.Entry next3 : bVar.f173615d.entrySet()) {
                        if (((C34379c) next3.getValue()).isDone()) {
                            ((C34379c) next3.getValue()).cancel(true);
                        }
                    }
                }
                for (Map.Entry next4 : C60960c.f173619b.entrySet()) {
                    if (C87412m.m108589b(next4.getValue(), bVar)) {
                        C60960c.f173619b.remove(next4.getKey());
                        return;
                    }
                }
            } else {
                int i = bVar.f173616e + 1;
                bVar.f173616e = i;
                if (i > 20) {
                    mo85920d(bVar, true, z2);
                } else {
                    ((C119157j) C119157j.f356862d).mo183878i(new C60962a(bVar, z, z2), 100);
                }
            }
        }

        /* renamed from: e */
        public final C60959b mo85921e(String str) {
            C87412m.m108594g(str, "sessionId");
            return C60960c.f173619b.get(str);
        }

        /* renamed from: f */
        public final C60959b mo85922f(String str) {
            C87412m.m108594g(str, "sessionId");
            ReentrantLock reentrantLock = C60960c.f173621d;
            reentrantLock.lock();
            C60959b bVar = C60960c.f173619b.get(str);
            if (bVar == null) {
                bVar = C60960c.f173620c.get(str);
            }
            if (bVar == null) {
                bVar = new C60959b();
                C60960c.f173620c.put(str, bVar);
            }
            reentrantLock.unlock();
            return bVar;
        }

        /* renamed from: g */
        public final C61103a mo85923g(String str) {
            C87412m.m108594g(str, "sessionId");
            C60959b e = mo85921e(str);
            if (e != null) {
                return e.f173612a;
            }
            return null;
        }

        /* renamed from: h */
        public final boolean mo85924h(Object obj) {
            return (obj instanceof Long) || (obj instanceof Integer);
        }

        /* renamed from: i */
        public final void mo85925i(String str, String str2) {
            C87412m.m108594g(str, "sessionId");
            C87412m.m108594g(str2, "clazz");
            ConcurrentHashMap<String, C60959b> concurrentHashMap = C60960c.f173620c;
            C60959b bVar = concurrentHashMap.containsKey(str) ? concurrentHashMap.get(str) : new C60959b();
            if (concurrentHashMap.containsKey(str)) {
                concurrentHashMap.remove(str);
            }
            Object newInstance = Class.forName(str2).newInstance();
            if (newInstance instanceof C61103a) {
                C87412m.m108591d(bVar);
                bVar.f173612a = (C61103a) newInstance;
                ConcurrentHashMap<String, C60959b> concurrentHashMap2 = C60960c.f173619b;
                if (concurrentHashMap2.containsKey(str)) {
                    Log.m105920e("MicroMsg.StaticKvStat", "sessionid " + str + " is duplicate, should remove it");
                    concurrentHashMap2.remove(str);
                }
                concurrentHashMap2.put(str, bVar);
            } else if (BuildInfo.DEBUG) {
                new IllegalAccessException("class name " + str2 + " is not AbsReportStruct");
            }
        }

        /* renamed from: j */
        public final void mo85926j(String str, String str2, Object obj) {
            C87412m.m108594g(str, "sessionId");
            C87412m.m108594g(str2, "key");
            C87412m.m108594g(obj, "value");
            mo85928l(str, str2, obj, C60242i.DEFAULT, "#");
        }

        /* renamed from: k */
        public final void mo85927k(String str, String str2, Object obj, C60242i iVar) {
            C87412m.m108594g(str, "sessionId");
            C87412m.m108594g(str2, "key");
            C87412m.m108594g(obj, "value");
            C87412m.m108594g(iVar, "opeartionState");
            mo85928l(str, str2, obj, iVar, "#");
        }

        /* renamed from: l */
        public final void mo85928l(String str, String str2, Object obj, C60242i iVar, String str3) {
            C87412m.m108594g(str, "sessionId");
            C87412m.m108594g(str2, "key");
            C87412m.m108594g(obj, "value");
            C87412m.m108594g(iVar, "opeartionState");
            C87412m.m108594g(str3, "separator");
            mo85929m(mo85922f(str), str2, obj, iVar, str3);
        }

        /* renamed from: m */
        public final void mo85929m(C60959b bVar, String str, Object obj, C60242i iVar, String str2) {
            C87412m.m108594g(bVar, "session");
            C87412m.m108594g(str, "key");
            C87412m.m108594g(obj, "value");
            C87412m.m108594g(iVar, "opeartionState");
            C87412m.m108594g(str2, "separator");
            int ordinal = iVar.ordinal();
            if (ordinal != 0) {
                int i = 1;
                if (ordinal == 1) {
                    Object obj2 = bVar.f173614c.get(str);
                    if (obj2 == null) {
                        bVar.f173614c.put(str, obj);
                        return;
                    }
                    ConcurrentHashMap<String, Object> concurrentHashMap = bVar.f173614c;
                    if (mo85924h(obj2) && mo85924h(obj)) {
                        obj = Long.valueOf(mo85936u(obj2) + mo85936u(obj));
                    } else if (!(obj2 instanceof String) || !(obj instanceof String)) {
                        Log.m105920e("MicroMsg.StaticKvStat", "report sessionid:" + bVar.f173613b + " key:" + str + " value:" + obj + " is not long value,append failed");
                    } else {
                        obj = obj2 + str2 + obj;
                    }
                    concurrentHashMap.put(str, obj);
                } else if (ordinal == 2) {
                    JSONArray jSONArray = bVar.f173617f.get(str);
                    if (jSONArray == null) {
                        jSONArray = new JSONArray();
                        bVar.f173617f.put(str, jSONArray);
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("aid", obj);
                    jSONObject.put("td", jSONArray.length() + 1);
                    jSONArray.put(jSONObject);
                } else if (ordinal == 3) {
                    Object obj3 = bVar.f173614c.get(str);
                    if (obj3 == null) {
                        bVar.f173614c.put(str, obj);
                        return;
                    }
                    ConcurrentHashMap<String, Object> concurrentHashMap2 = bVar.f173614c;
                    if (!mo85924h(obj3) || !mo85924h(obj)) {
                        Log.m105920e("MicroMsg.StaticKvStat", "report sessionid:" + bVar.f173613b + " key:" + str + " value:" + obj + " is not long value,elapse failed");
                    } else {
                        obj = Long.valueOf(mo85936u(obj) - mo85936u(obj3));
                    }
                    concurrentHashMap2.put(str, obj);
                } else if (ordinal == 4) {
                    if (bVar.f173614c.get(str) == null) {
                        bVar.f173614c.put(str, new HashMap());
                    }
                    Object obj4 = bVar.f173614c.get(str);
                    if (obj4 instanceof HashMap) {
                        HashMap hashMap = (HashMap) obj4;
                        Integer num = (Integer) hashMap.get(obj);
                        if (num != null) {
                            i = Integer.valueOf(num.intValue() + 1).intValue();
                        }
                        hashMap.put(obj, Integer.valueOf(i));
                    }
                }
            } else {
                bVar.f173614c.put(str, obj);
            }
        }

        /* renamed from: n */
        public final void mo85930n(String str, String str2, Object obj, Object obj2, C60242i iVar) {
            C87412m.m108594g(str, "sessionId");
            C87412m.m108594g(str2, "key");
            C87412m.m108594g(obj, "valueKey");
            C87412m.m108594g(obj2, "value");
            C87412m.m108594g(iVar, "opeartionState");
            mo85931o(str, str2, obj, obj2, iVar, ";");
        }

        /* renamed from: o */
        public final void mo85931o(String str, String str2, Object obj, Object obj2, C60242i iVar, String str3) {
            C87412m.m108594g(str, "sessionId");
            C87412m.m108594g(str2, "key");
            C87412m.m108594g(obj, "valueKey");
            C87412m.m108594g(obj2, "value");
            C87412m.m108594g(iVar, "opeartionState");
            C87412m.m108594g(str3, "separator");
            C60959b f = mo85922f(str);
            if (f.f173614c.get(str2) == null) {
                f.f173614c.put(str2, new C9558a(str3));
            }
            Object obj3 = f.f173614c.get(str2);
            if (obj3 instanceof C9558a) {
                C9558a aVar = (C9558a) obj3;
                if (!aVar.containsKey(obj)) {
                    aVar.put(obj, obj2);
                } else if (C60242i.REPEAT == iVar) {
                    aVar.put(obj, obj2);
                } else if (C60242i.APPEND == iVar) {
                    StringBuilder sb = new StringBuilder();
                    Object obj4 = aVar.get(obj);
                    sb.append(obj4 instanceof String ? (String) obj4 : null);
                    sb.append(str3);
                    sb.append(obj2);
                    aVar.put(obj, sb.toString());
                }
            }
        }

        /* renamed from: q */
        public final void mo85932q(String str, String str2, String str3, Object obj) {
            C87412m.m108594g(str, "sessionKey");
            C87412m.m108594g(str2, "sessionId");
            C87412m.m108594g(str3, "key");
            C87412m.m108594g(obj, "value");
            mo85934s(str, str2, str3, obj, C60242i.DEFAULT, "#");
        }

        /* renamed from: r */
        public final void mo85933r(String str, String str2, String str3, Object obj, C60242i iVar) {
            C87412m.m108594g(str, "sessionKey");
            C87412m.m108594g(str2, "sessionId");
            C87412m.m108594g(str3, "key");
            C87412m.m108594g(obj, "value");
            C87412m.m108594g(iVar, "opeartionState");
            mo85934s(str, str2, str3, obj, iVar, "#");
        }

        /* renamed from: s */
        public final void mo85934s(String str, String str2, String str3, Object obj, C60242i iVar, String str4) {
            C87412m.m108594g(str, "sessionKey");
            C87412m.m108594g(str2, "sessionId");
            C87412m.m108594g(str3, "key");
            C87412m.m108594g(obj, "value");
            C87412m.m108594g(iVar, "opeartionState");
            C87412m.m108594g(str4, "separator");
            ReentrantLock reentrantLock = C60960c.f173622e;
            reentrantLock.lock();
            ConcurrentHashMap concurrentHashMap = C60960c.f173623f.get(str);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap();
                C60960c.f173623f.put(str, concurrentHashMap);
            }
            C60959b bVar = (C60959b) concurrentHashMap.get(str2);
            if (bVar == null) {
                bVar = new C60959b();
                concurrentHashMap.put(str2, bVar);
            }
            reentrantLock.unlock();
            mo85929m(bVar, str3, obj, iVar, str4);
        }

        /* renamed from: t */
        public final void mo85935t(String str, String str2, C32224a<? extends Object> aVar) {
            ConcurrentHashMap<String, C34379c<?>> concurrentHashMap;
            C87412m.m108594g(str, "sessionId");
            C87412m.m108594g(str2, "key");
            C87412m.m108594g(aVar, "callback");
            C60959b e = mo85921e(str);
            if (e != null && (concurrentHashMap = e.f173615d) != null) {
                C119179t tVar = C119157j.f356862d;
                C60963b bVar = new C60963b(str, str2, aVar, concurrentHashMap);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                C34379c<?> i = jVar.mo183878i(bVar, 0);
                C87412m.m108593f(i, "sessionId: String, key: …ve(key)\n                }");
                concurrentHashMap.put(str2, i);
            }
        }

        /* renamed from: u */
        public final long mo85936u(Object obj) {
            if (obj instanceof Integer) {
                return (long) ((Number) obj).intValue();
            }
            C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.Long");
            return ((Long) obj).longValue();
        }
    }
}
