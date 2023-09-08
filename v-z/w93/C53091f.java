package w93;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40327m;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.net.URLEncoder;
import java.util.HashMap;
import u10.C52415a;

/* renamed from: w93.f */
public class C53091f {

    /* renamed from: t */
    public static HashMap<String, C53091f> f148164t = new HashMap<>();

    /* renamed from: a */
    public long f148165a;

    /* renamed from: b */
    public long f148166b;

    /* renamed from: c */
    public long f148167c;

    /* renamed from: d */
    public long f148168d;

    /* renamed from: e */
    public long f148169e;

    /* renamed from: f */
    public long f148170f;

    /* renamed from: g */
    public long f148171g;

    /* renamed from: h */
    public long f148172h;

    /* renamed from: i */
    public long f148173i;

    /* renamed from: j */
    public long f148174j;

    /* renamed from: k */
    public long f148175k;

    /* renamed from: l */
    public long f148176l;

    /* renamed from: m */
    public long f148177m;

    /* renamed from: n */
    public long f148178n;

    /* renamed from: o */
    public long f148179o;

    /* renamed from: p */
    public long f148180p;

    /* renamed from: q */
    public long f148181q;

    /* renamed from: r */
    public long f148182r;

    /* renamed from: s */
    public long f148183s;

    /* renamed from: w93.f$a */
    public static class C53092a implements C80883e<Bundle, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            int i = bundle.getInt("type");
            String string = bundle.getString("url");
            long j = bundle.getLong("time", System.currentTimeMillis());
            switch (i) {
                case 1:
                    C53091f.m59454i(string, j);
                    return;
                case 2:
                    HashMap<String, C53091f> hashMap = C53091f.f148164t;
                    if (!Util.isNullOrNil(string)) {
                        if (!C53091f.m59449d()) {
                            C53091f.m59456k(2, string, j);
                            return;
                        } else if (C53091f.m59448c(string) != null) {
                            C53091f.m59448c(string).f148167c = j;
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 3:
                    HashMap<String, C53091f> hashMap2 = C53091f.f148164t;
                    if (!Util.isNullOrNil(string)) {
                        if (!C53091f.m59449d()) {
                            C53091f.m59456k(3, string, j);
                            return;
                        } else if (C53091f.m59448c(string) != null) {
                            C53091f.m59448c(string).f148168d = j;
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 4:
                    HashMap<String, C53091f> hashMap3 = C53091f.f148164t;
                    if (!Util.isNullOrNil(string)) {
                        if (!C53091f.m59449d()) {
                            C53091f.m59456k(4, string, j);
                            return;
                        } else if (C53091f.m59448c(string) != null) {
                            C53091f.m59448c(string).f148169e = j;
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 5:
                    C53091f.m59453h(string, j);
                    return;
                case 6:
                    C53091f.m59452g(string, j);
                    return;
                case 7:
                    C53091f.m59458m(string, j);
                    return;
                case 8:
                    C53091f.m59457l(string, j);
                    return;
                case 9:
                    C53091f.m59455j(string, j);
                    return;
                case 10:
                    C53091f.m59450e(string, j);
                    return;
                case 11:
                    C53091f.m59451f(string, j);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public static C53091f m59446a(String str) {
        if (f148164t.containsKey(str)) {
            f148164t.remove(str);
        }
        C53091f fVar = new C53091f();
        f148164t.put(str, fVar);
        return fVar;
    }

    /* renamed from: b */
    public static C53091f m59447b(String str) {
        if (f148164t.containsKey(str)) {
            return f148164t.get(str);
        }
        C53091f fVar = new C53091f();
        f148164t.put(str, fVar);
        return fVar;
    }

    /* renamed from: c */
    public static C53091f m59448c(String str) {
        return f148164t.get(str);
    }

    /* renamed from: d */
    public static boolean m59449d() {
        return C44594n1.m49045a() || MMApplicationContext.isToolsProcess();
    }

    /* renamed from: e */
    public static void m59450e(String str, long j) {
        if (!Util.isNullOrNil(str)) {
            if (!m59449d()) {
                m59456k(10, str, j);
            } else if (m59448c(str) != null) {
                m59448c(str).f148174j = j;
            }
        }
    }

    /* renamed from: f */
    public static void m59451f(String str, long j) {
        if (!Util.isNullOrNil(str)) {
            if (m59449d()) {
                C53091f c = m59448c(str);
                if (c != null) {
                    c.f148175k = j;
                    c.f148180p = j;
                    return;
                }
                return;
            }
            m59456k(11, str, j);
        }
    }

    /* renamed from: g */
    public static void m59452g(String str, long j) {
        if (!Util.isNullOrNil(str)) {
            if (!m59449d()) {
                m59456k(6, str, j);
            } else if (m59448c(str) != null) {
                m59448c(str).f148171g = j;
            }
        }
    }

    /* renamed from: h */
    public static void m59453h(String str, long j) {
        if (!Util.isNullOrNil(str)) {
            if (!m59449d()) {
                m59456k(5, str, j);
            } else if (m59448c(str) != null) {
                m59448c(str).f148170f = j;
            }
        }
    }

    /* renamed from: i */
    public static void m59454i(String str, long j) {
        if (!Util.isNullOrNil(str)) {
            if (!m59449d()) {
                m59456k(1, str, j);
            } else if (m59448c(str) != null) {
                m59448c(str).f148166b = j;
            }
        }
    }

    /* renamed from: j */
    public static void m59455j(String str, long j) {
        if (!Util.isNullOrNil(str)) {
            if (!m59449d()) {
                m59456k(9, str, j);
            } else if (m59448c(str) != null) {
                m59448c(str).f148165a = j;
                try {
                    C52415a.m58668a().mo62980b(6, URLEncoder.encode(str), "", 0);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: k */
    public static void m59456k(int i, String str, long j) {
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        bundle.putString("url", str);
        bundle.putLong("time", j);
        ((C40327m) C86312j.m106911c(C40327m.class)).Ku0(bundle, C53092a.class, (C1256g) null);
    }

    /* renamed from: l */
    public static void m59457l(String str, long j) {
        if (!Util.isNullOrNil(str)) {
            if (!m59449d()) {
                m59456k(8, str, j);
            } else if (m59448c(str) != null) {
                m59448c(str).f148173i = j;
            }
        }
    }

    /* renamed from: m */
    public static void m59458m(String str, long j) {
        if (!Util.isNullOrNil(str)) {
            if (!m59449d()) {
                m59456k(7, str, j);
            } else if (m59448c(str) != null) {
                m59448c(str).f148172h = j;
            }
        }
    }
}
