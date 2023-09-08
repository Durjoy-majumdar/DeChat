package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import p1028re.C89928a;
import p1028re.C89931d;

/* renamed from: cj1.e */
public final class C0531e {

    /* renamed from: a */
    public static final C0531e f1296a = new C0531e();

    /* renamed from: b */
    public static final HashMap<String, List<byte[]>> f1297b = new HashMap<>();

    /* renamed from: cj1.e$a */
    public static final class C0532a implements C89928a {
        /* renamed from: a */
        public void mo391a(int i) {
            C0531e.f1296a.mo565a("systemTrim");
        }

        /* renamed from: b */
        public void mo392b() {
            C0531e.f1296a.mo565a("backgroundTrim");
        }
    }

    static {
        C89931d.f258426c.mo124253c(new C0532a());
    }

    /* renamed from: a */
    public final void mo565a(String str) {
        C87412m.m108594g(str, "prefix");
        try {
            Log.m105924i("FinderLiveActivityDataTransaction", str + " clear cache feed!");
            f1297b.clear();
        } catch (Exception e) {
            C58739j4 j4Var = C58739j4.f168176a;
            j4Var.mo83712h0(e, "FinderLiveActivityDataTransaction-" + str);
        }
    }
}
