package x91;

import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import gy3.C8480h;
import gy3.C87412m;
import java.io.IOException;
import te3.C110960dr1;
import te3.C110970q14;

/* renamed from: x91.b */
public final class C23066b {

    /* renamed from: a */
    public static final C23067a f66278a = new C23067a((C8480h) null);

    /* renamed from: x91.b$a */
    public static final class C23067a {
        public C23067a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C110960dr1 mo36463a() {
            byte[] a = C116850b.m164831a("mmkv_fuzzy_pgs_io");
            if (a != null) {
                if (!(a.length == 0)) {
                    C110960dr1 dr12 = new C110960dr1();
                    try {
                        dr12.parseFrom(a);
                        return dr12;
                    } catch (Exception e) {
                        Log.printErrStackTrace("HABBYGE-MALI.FuzzyMatchDao", e, "FuzzyMatchDao, getFuzzyMatchInfo: %s", e.getMessage());
                    }
                }
            }
            return null;
        }

        /* renamed from: b */
        public final C110970q14 mo36464b(String str) {
            C110960dr1 a;
            if (str == null || (a = mo36463a()) == null) {
                return null;
            }
            int size = a.f331954d.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    return null;
                }
                C110970q14 q142 = a.f331954d.get(size);
                if (C87412m.m108589b(str, q142.f332254d)) {
                    return q142;
                }
            }
        }

        /* renamed from: c */
        public final Pair<C110970q14, Integer> mo36465c(String str) {
            C87412m.m108594g(str, "sessionId");
            C110960dr1 a = mo36463a();
            if (a == null) {
                a = new C110960dr1();
            }
            int size = a.f331954d.size();
            while (true) {
                size--;
                if (-1 < size) {
                    C110970q14 q142 = a.f331954d.get(size);
                    C87412m.m108593f(q142, "fuzzyMatchInfo.sessionFuzzyPaths[i]");
                    C110970q14 q143 = q142;
                    if (C87412m.m108589b(str, q143.f332254d)) {
                        Pair<C110970q14, Integer> create = Pair.create(q143, Integer.valueOf(size));
                        C87412m.m108593f(create, "create(tmpSessionPath, i)");
                        return create;
                    }
                } else {
                    C110970q14 q144 = new C110970q14();
                    a.f331954d.addLast(q144);
                    mo36466d(a);
                    Pair<C110970q14, Integer> create2 = Pair.create(q144, Integer.valueOf(a.f331954d.size() - 1));
                    C87412m.m108593f(create2, "create(tmpSessionPath, f…ssionFuzzyPaths.size - 1)");
                    return create2;
                }
            }
        }

        /* renamed from: d */
        public final void mo36466d(C110960dr1 dr12) {
            if (dr12 != null) {
                try {
                    byte[] byteArray = dr12.toByteArray();
                    if (byteArray != null) {
                        C116850b.m164834d("mmkv_fuzzy_pgs_io", byteArray);
                    }
                } catch (IOException e) {
                    Log.printErrStackTrace("HABBYGE-MALI.FuzzyMatchDao", e, "FuzzyMatchDao, setFuzzyMatchInfo: %s", e.getMessage());
                }
            }
        }

        /* renamed from: e */
        public final void mo36467e(C110970q14 q142) {
            if (q142 != null) {
                C110960dr1 a = mo36463a();
                if (a == null) {
                    a = new C110960dr1();
                    Log.m105924i("HABBYGE-MALI.FuzzyMatchDao", "updateSessionMatchInfo, addNew: " + q142.f332254d);
                    a.f331954d.addLast(q142);
                } else {
                    boolean z = false;
                    int size = a.f331954d.size() - 1;
                    while (true) {
                        if (-1 < size) {
                            C110970q14 q143 = a.f331954d.get(size);
                            if (q143 != null && C87412m.m108589b(q143.f332254d, q142.f332254d)) {
                                a.f331954d.set(size, q142);
                                z = true;
                                break;
                            }
                            size--;
                        } else {
                            break;
                        }
                    }
                    if (!z) {
                        Log.m105924i("HABBYGE-MALI.FuzzyMatchDao", "updateSessionMatchInfo, add: " + q142.f332254d);
                        a.f331954d.addLast(q142);
                    }
                }
                mo36466d(a);
            }
        }

        /* renamed from: f */
        public final void mo36468f(C110970q14 q142, int i) {
            if (q142 != null) {
                C110960dr1 a = mo36463a();
                if (a == null) {
                    a = new C110960dr1();
                    a.f331954d.addLast(q142);
                } else {
                    a.f331954d.set(i, q142);
                }
                mo36466d(a);
            }
        }
    }
}
