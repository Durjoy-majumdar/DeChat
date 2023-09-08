package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import gy3.C87412m;
import java.util.List;
import ob0.C47350c;
import ob0.C89132b;
import sx3.C110823p;
import te3.km4;
import te3.lm4;
import te3.sa4;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.o0 */
public final class C40434o0 extends C89132b<lm4> {

    /* renamed from: i */
    public static final int[] f108658i = {1, 2, 3, 4};

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.o0$a */
    public enum C40435a {
        None(0),
        Timeout(1),
        ClosePullDown(2),
        CloseCollectionList(3),
        History(4);
        

        /* renamed from: d */
        public final int f108665d;

        /* access modifiers changed from: public */
        C40435a(int i) {
            this.f108665d = i;
        }
    }

    public C40434o0(List<? extends sa4> list, int i) {
        C87412m.m108594g(list, "opList");
        if (BuildInfo.IS_FLAVOR_RED && !list.isEmpty()) {
            boolean x = C110823p.m151008x(f108658i, i);
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127067b = new lm4();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/updatestarrecord";
        bVar.f127069d = 1839;
        km4 km4 = new km4();
        km4.f136886e.addAll(list);
        km4.f136885d = i;
        bVar.f127066a = km4;
        mo123453j(bVar.mo72403a());
    }
}
