package ba1;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import f91.C116850b;
import java.util.Iterator;
import java.util.List;
import te3.C110974w14;
import te3.C118427eg2;
import te3.C118464s14;
import te3.C118472u14;
import te3.C64764v14;
import te3.xr4;

/* renamed from: ba1.i */
public final class C113156i {
    /* renamed from: a */
    public static C64764v14 m154833a(String str) {
        int i = C116711b.m164584i();
        if (i == 0) {
            return null;
        }
        byte[] a = C116850b.m164831a(str + i);
        if (a != null && a.length > 0) {
            C64764v14 v142 = new C64764v14();
            try {
                v142.parseFrom(a);
                return v142;
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.SessionPageMatchingCache", e, "SessionPageMatchingCache.read: %s", e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m154834b(C64764v14 v142, String str) {
        int i;
        if (v142 != null && (i = C116711b.m164584i()) != 0) {
            try {
                C116850b.m164834d(str + i, v142.toByteArray());
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.SessionPageMatchingCache", e, "SessionPageMatchingCache.write: %s", e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public static void m154835c(C118427eg2 eg22) {
        C64764v14 v142;
        C110974w14 w142;
        C118427eg2 eg23 = eg22;
        if (eg23 != null && !TextUtils.isEmpty(eg23.f353972g)) {
            String str = eg23.f353972g;
            if (TextUtils.isEmpty(str) || (v142 = m154833a("mmkv_key_hellSPMatchinghe_")) == null || v142.f185819d.isEmpty() || !str.equals(v142.f185819d.get(0).f354477f)) {
                v142 = null;
            }
            if (v142 == null) {
                m154837e();
                return;
            }
            Log.m105925i("HABBYGE-MALI.SessionPageMatchingCache", "SessionPageMatchingCache, addPage: %s", eg23.f353972g);
            String b = C115411b.m162219b(eg23.f353972g);
            if (b != null) {
                List<C110974w14> f = C115411b.m162223f(b, true);
                if (f == null || f.isEmpty()) {
                    m154837e();
                    return;
                }
                for (int size = v142.f185819d.size() - 1; size >= 0; size--) {
                    C118472u14 u142 = v142.f185819d.get(size);
                    Iterator<C110974w14> it = f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            w142 = null;
                            break;
                        }
                        w142 = it.next();
                        if (w142.f332315e == u142.f354478g) {
                            break;
                        }
                    }
                    if (w142 != null) {
                        int i = u142.f354475d;
                        if (i <= 0 || i >= w142.f332316f.size() - 1) {
                            v142.f185819d.remove(size);
                        } else {
                            String h = C116711b.m164583h(u142.f354480i.getLast().f353969d);
                            if (h == null) {
                                v142.f185819d.remove(size);
                            } else {
                                String h2 = C116711b.m164583h(eg23.f353969d);
                                if (h.equals(h2)) {
                                    Log.m105925i("HABBYGE-MALI.SessionPageMatchingCache", "SessionPageMatchingCache, addPage, 7Event: %s", h2);
                                } else {
                                    C118464s14 s142 = w142.f332316f.get(u142.f354475d + 1);
                                    if (s142 == null) {
                                        v142.f185819d.remove(size);
                                    } else {
                                        String h3 = C116711b.m164583h(s142.f354328d);
                                        if (h3 == null) {
                                            v142.f185819d.remove(size);
                                        } else if (h3.equals(h2)) {
                                            Log.m105925i("HABBYGE-MALI.SessionPageMatchingCache", "SessionPageMatchingCache, addPage, real: %s", h2);
                                            u142.f354480i.addLast(eg23);
                                            int i2 = u142.f354475d + 1;
                                            u142.f354475d = i2;
                                            if (i2 == w142.f332316f.size() - 1) {
                                                u142.f354475d = -1;
                                                u142.f354476e = true;
                                                Log.m105925i("HABBYGE-MALI.SessionPageMatchingCache", "move2SuccessCache: %s, %s, %s", u142.f354479h, u142.f354477f, Long.valueOf(u142.f354478g));
                                                C64764v14 a = m154833a("mmkv_key_hellSPMatchSuche_");
                                                if (a == null) {
                                                    a = new C64764v14();
                                                }
                                                a.f185819d.addLast(u142);
                                                m154834b(a, "mmkv_key_hellSPMatchSuche_");
                                                v142.f185819d.remove(size);
                                            }
                                        } else {
                                            Log.m105925i("HABBYGE-MALI.SessionPageMatchingCache", "SessionPageMatchingCache, addPage, misMatch: %s, %s", h2, h3);
                                            v142.f185819d.remove(size);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        v142.f185819d.remove(size);
                    }
                }
                if (v142.f185819d.isEmpty()) {
                    m154837e();
                } else {
                    m154834b(v142, "mmkv_key_hellSPMatchinghe_");
                }
            }
        }
    }

    /* renamed from: d */
    public static void m154836d(xr4 xr4, String str, C64764v14 v142, boolean z) {
        C118427eg2 last;
        String h;
        if (v142 != null && !v142.f185819d.isEmpty()) {
            boolean z2 = false;
            String h2 = C116711b.m164583h(str);
            Iterator<C118472u14> it = v142.f185819d.iterator();
            while (it.hasNext()) {
                C118472u14 next = it.next();
                if (!(next == null || next.f354480i.isEmpty() || (last = next.f354480i.getLast()) == null || (h = C116711b.m164583h(last.f353969d)) == null || !h.equals(h2))) {
                    last.f353976n.add(xr4);
                    z2 = true;
                }
            }
            if (!z2) {
                return;
            }
            if (z) {
                m154834b(v142, "mmkv_key_hellSPMatchinghe_");
            } else {
                m154834b(v142, "mmkv_key_hellSPMatchSuche_");
            }
        }
    }

    /* renamed from: e */
    public static void m154837e() {
        int i = C116711b.m164584i();
        if (i != 0) {
            try {
                C116850b.m164834d("mmkv_key_hellSPMatchinghe_" + i, new byte[0]);
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.SessionPageMatchingCache", e, "SessionPageMatchingCache.reset: %s", e.getMessage());
            }
        }
    }
}
