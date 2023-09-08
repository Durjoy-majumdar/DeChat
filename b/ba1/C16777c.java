package ba1;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import te3.C118434gg2;
import te3.C22505ka3;

/* renamed from: ba1.c */
public final class C16777c {
    /* renamed from: a */
    public static void m16409a(C22505ka3 ka32) {
        C22505ka3 last;
        C118434gg2 h = m16416h();
        if (h == null) {
            h = new C118434gg2();
        }
        C115411b.m162218a(ka32);
        if (!(h.f354028f.isEmpty() || (last = h.f354028f.getLast()) == null || last.f64099s == 1)) {
            String b = C115411b.m162219b(last.f64087d);
            String b2 = C115411b.m162219b(ka32.f64087d);
            if (b != null && b.equals(b2)) {
                last.f64099s = 1;
                last.f64093j = System.currentTimeMillis();
                Log.m105925i("HABBYGE-MALI.HellSessionDao", "onSessionClose-addSession: %s", last.f64087d);
            }
        }
        h.f354028f.addLast(ka32);
        h.f354029g = h.f354028f.size() - 1;
        if (!C115411b.m162229l(ka32.f64087d)) {
            h.f354034o = true;
        }
        Log.m105925i("HABBYGE-MALI.HellSessionDao", "addSession: %s, %b", ka32.f64087d, Boolean.valueOf(h.f354034o));
        m16419k(h);
    }

    /* renamed from: b */
    public static void m16410b(String str) {
        if (!TextUtils.isEmpty(str)) {
            Log.m105925i("HABBYGE-MALI.HellSessionDao", "HellSessionDao, clearCurSession: %s", str);
            C118434gg2 h = m16416h();
            if (h != null && !h.f354028f.isEmpty()) {
                int size = h.f354028f.size();
                Log.m105925i("HABBYGE-MALI.HellSessionDao", "clearCurSession, length: %s, %d", str, Integer.valueOf(size));
                for (int i = size - 1; i >= 0; i--) {
                    C22505ka3 ka32 = h.f354028f.get(i);
                    if (ka32 != null) {
                        Log.m105925i("HABBYGE-MALI.HellSessionDao", "clearCurSession, length: %s", ka32.f64087d);
                        if (str.equals(ka32.f64087d)) {
                            h.f354028f.remove(i);
                            h.f354029g = h.f354028f.size() - 1;
                            m16419k(h);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static C22505ka3 m16411c(C22505ka3 ka32, String str, long j) {
        C22505ka3 ka33 = new C22505ka3();
        ka33.f64087d = str;
        ka33.f64090g = ka32.f64090g;
        ka33.f64095o = ka32.f64095o;
        ka33.f64096p = false;
        ka33.f64099s = 0;
        ka33.f64091h = ka32.f64091h;
        ka33.f64097q = ka32.f64097q;
        ka33.f64094n = ka32.f64094n;
        ka33.f64095o = ka32.f64095o;
        ka33.f64088e = m16412d();
        ka33.f64092i = j;
        ka33.f64098r = ka32.f64098r;
        return ka33;
    }

    /* renamed from: d */
    public static long m16412d() {
        C118434gg2 h = m16416h();
        if (h == null) {
            h = new C118434gg2();
        }
        long j = h.f354033n;
        h.f354033n = 1 + j;
        m16419k(h);
        return j;
    }

    /* renamed from: e */
    public static C22505ka3 m16413e() {
        C118434gg2 h = m16416h();
        if (h != null && m16415g(h)) {
            return h.f354028f.get(h.f354029g);
        }
        return null;
    }

    /* renamed from: f */
    public static C22505ka3 m16414f(String str) {
        C118434gg2 h;
        int i;
        if (!(str == null || (h = m16416h()) == null || h.f354028f.isEmpty())) {
            for (int size = h.f354028f.size() - 1; size >= 0; size--) {
                C22505ka3 ka32 = h.f354028f.get(size);
                if (ka32 != null && str.equals(ka32.f64087d) && size - 1 >= 0) {
                    return h.f354028f.get(i);
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r1 = r2.f354029g;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m16415g(te3.C118434gg2 r2) {
        /*
            r0 = 0
            if (r2 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r2.f354029g
            if (r1 < 0) goto L_0x0011
            java.util.LinkedList<te3.ka3> r2 = r2.f354028f
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0011
            r0 = 1
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ba1.C16777c.m16415g(te3.gg2):boolean");
    }

    /* renamed from: h */
    public static C118434gg2 m16416h() {
        byte[] a = C116850b.m164831a("mmkv_key_hell_sessions");
        if (a != null && a.length > 0) {
            C118434gg2 gg22 = new C118434gg2();
            try {
                gg22.parseFrom(a);
                return gg22;
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.HellSessionDao", e, "HellSessionDao._read", new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: i */
    public static void m16417i(C118434gg2 gg22) {
        if (gg22 != null) {
            Log.m105924i("HABBYGE-MALI.HellSessionDao", "HellSessionDao, setHellSession");
            m16419k(gg22);
        }
    }

    /* renamed from: j */
    public static void m16418j(C22505ka3 ka32) {
        C118434gg2 h = m16416h();
        if (h != null && m16415g(h)) {
            C115411b.m162218a(ka32);
            h.f354028f.set(h.f354029g, ka32);
            Log.m105925i("HABBYGE-MALI.HellSessionDao", "updateCurSession, newSession: %s, %s, %d", ka32.f64087d, ka32.f64090g, Integer.valueOf(ka32.f64091h));
            if (!C115411b.m162229l(ka32.f64087d)) {
                h.f354034o = true;
            }
            m16419k(h);
        }
    }

    /* renamed from: k */
    public static void m16419k(C118434gg2 gg22) {
        if (gg22 != null) {
            try {
                C116850b.m164834d("mmkv_key_hell_sessions", gg22.toByteArray());
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.HellSessionDao", e, "HellSessionDao._writeBack: %s", e.getMessage());
            }
        }
    }
}
