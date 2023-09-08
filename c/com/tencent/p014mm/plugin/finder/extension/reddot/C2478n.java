package com.tencent.p014mm.plugin.finder.extension.reddot;

import ad1.C54029c;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashSet;
import java.util.Iterator;
import te3.C49712hj1;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.n */
public final class C2478n implements C54029c {
    /* renamed from: b */
    public void mo2445b(String str, String str2) {
        C87412m.m108594g(str, "newDefaultUsername");
        C87412m.m108594g(str2, "rawDefaultUsername");
        HashSet<Integer> hashSet = C2482o.f12983a;
        Log.m105924i("Finder.RedDotDuplicateChecker", "refreshRedDot");
        C2479n0 n0Var = C2479n0.f12955a;
        Iterator<String> it = C2479n0.f12954K.iterator();
        while (it.hasNext()) {
            C2479n0.f12955a.mo2447b(it.next(), str);
        }
        C2479n0.m2357g(C2479n0.f12955a, str2, (String) null, false, 2, (Object) null);
        ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).f157802n.mo84538g(506365, 12, (C49712hj1) null);
    }
}
