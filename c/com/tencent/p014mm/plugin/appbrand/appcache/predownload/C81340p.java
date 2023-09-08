package com.tencent.p014mm.plugin.appbrand.appcache.predownload;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hi0.C32917b;
import hi0.C32918h;
import hi0.C32919i;
import hi0.C32920k;
import hi0.C32922o;
import hi0.C87495f;
import hi0.C87496g;
import hi0.C87497j;
import hi0.C87498l;
import hi0.C87499m;
import hi0.C87501n;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kr0.C88262c1;
import nr3.C89060f;
import te3.f75;
import te3.g75;
import te3.i75;
import te3.j75;
import te3.k75;
import te3.ke4;
import te3.l75;
import te3.m75;
import te3.n75;
import te3.o75;
import te3.p75;
import te3.q75;
import te3.r75;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.p */
public class C81340p {

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.p$a */
    public static class C81341a {

        /* renamed from: a */
        public final LinkedBlockingQueue<ke4> f238804a = new LinkedBlockingQueue<>();

        /* renamed from: b */
        public final int f238805b;

        /* renamed from: c */
        public final String f238806c;

        public C81341a(int i, String str) {
            this.f238805b = i;
            this.f238806c = str;
        }
    }

    /* renamed from: a */
    public static void m99758a(List<ke4> list, int i, String str) {
        C88262c1.C88265c cVar = C88262c1.C88265c.Fail_SvrRetListEmpty;
        if (Util.isNullOrNil((List) list)) {
            C81334h.f238795a.mo113610a(str, cVar);
            return;
        }
        C81341a aVar = new C81341a(i, str);
        for (ke4 next : list) {
            g75 g75 = next.f136724e;
            boolean z = true;
            if (g75 == null) {
                Log.m105921e("MicroMsg.AppBrand.PredownloadCmdProcessor", "processCmd, username %s, appId %s, nil Cmds", next.f136723d, next.f136725f);
            } else {
                Object[] objArr = new Object[14];
                objArr[0] = next.f136723d;
                objArr[1] = next.f136725f;
                objArr[2] = Boolean.valueOf(g75.f133907d != null);
                objArr[3] = Boolean.valueOf(next.f136724e.f133908e != null);
                objArr[4] = Boolean.valueOf(next.f136724e.f133909f != null);
                objArr[5] = Boolean.valueOf(next.f136724e.f133910g != null);
                objArr[6] = Boolean.valueOf(next.f136724e.f133911h != null);
                objArr[7] = Boolean.valueOf(next.f136724e.f133912i != null);
                objArr[8] = Boolean.valueOf(next.f136724e.f133913j != null);
                objArr[9] = Boolean.valueOf(next.f136724e.f133914n != null);
                objArr[10] = Boolean.valueOf(next.f136724e.f133915o != null);
                objArr[11] = Boolean.valueOf(next.f136724e.f133916p != null);
                objArr[12] = Boolean.valueOf(next.f136724e.f133917q != null);
                if (next.f136724e.f133918r == null) {
                    z = false;
                }
                objArr[13] = Boolean.valueOf(z);
                Log.m105925i("MicroMsg.AppBrand.PredownloadCmdProcessor", "processCmd, username %s appId %s, GetContact(%b), GetCode(%b), IssueContact(%b), IssueLaunch(%b), IssueDecryptKey(%s), UpdateVersion(%b), BlockCgiRequest(%b), PreLaunch(%b), InvalidCode(%b), InvalidContact(%b), PullGlobalConf(%b), GetExptInfo(%b)", objArr);
                i75 i75 = next.f136724e.f133907d;
                if (i75 != null) {
                    C89060f.m111324c(next.f136723d, next.f136725f, i75).mo123419C(new C87495f());
                }
                if (next.f136724e.f133908e != null) {
                    aVar.f238804a.add(next);
                }
                m75 m75 = next.f136724e.f133909f;
                if (m75 != null) {
                    C89060f.m111324c(next.f136723d, next.f136725f, m75).mo123419C(new C87497j());
                }
                o75 o75 = next.f136724e.f133910g;
                if (o75 != null) {
                    C89060f.m111324c(next.f136723d, next.f136725f, o75).mo123419C(new C87498l());
                }
                n75 n75 = next.f136724e.f133911h;
                if (n75 != null) {
                    C89060f.m111324c(next.f136723d, next.f136725f, n75).mo123419C(new C32920k());
                }
                r75 r75 = next.f136724e.f133912i;
                if (r75 != null) {
                    C89060f.m111324c(next.f136723d, next.f136725f, r75).mo123419C(new C32922o());
                }
                f75 f75 = next.f136724e.f133913j;
                if (f75 != null) {
                    C89060f.m111324c(next.f136723d, next.f136725f, f75).mo123419C(new C32917b());
                }
                p75 p75 = next.f136724e.f133914n;
                if (p75 != null) {
                    C89060f.m111324c(next.f136723d, next.f136725f, p75).mo123419C(new C87499m());
                }
                k75 k75 = next.f136724e.f133915o;
                if (k75 != null) {
                    C89060f.m111324c(next.f136723d, next.f136725f, k75).mo123419C(new C32918h());
                }
                l75 l75 = next.f136724e.f133916p;
                if (l75 != null) {
                    C89060f.m111324c(next.f136723d, next.f136725f, l75).mo123419C(new C32919i());
                }
                q75 q75 = next.f136724e.f133917q;
                if (q75 != null) {
                    C89060f.m111324c(next.f136723d, next.f136725f, q75).mo123419C(new C87501n());
                }
                j75 j75 = next.f136724e.f133918r;
                if (j75 != null) {
                    C89060f.m111324c(next.f136723d, next.f136725f, j75).mo123419C(new C87496g());
                }
            }
        }
        if (aVar.f238804a.isEmpty()) {
            C81334h.f238795a.mo113610a(aVar.f238806c, cVar);
        } else {
            ((C119157j) C119157j.f356862d).mo183884o(new p$a$$a(aVar));
        }
    }
}
