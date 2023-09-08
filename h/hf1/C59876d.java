package hf1;

import android.util.ArrayMap;
import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55716q0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import hf1.C59872b;
import ht1.C60152b4;
import ht1.C60200t1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import os1.C11739f;
import te3.C51978xi1;
import te3.C64586nn1;
import tf0.C64916p1;
import up1.C37521f;

/* renamed from: hf1.d */
public final class C59876d implements C59872b {

    /* renamed from: a */
    public final HashSet<String> f170939a;

    public C59876d() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("TLFollow");
        hashSet.add("TLRecommendTab");
        hashSet.add("finder_tl_hot_tab");
        this.f170939a = hashSet;
    }

    /* renamed from: a */
    public C55718s0 mo84825a(C59872b.C59874b bVar) {
        String str;
        C87412m.m108594g(bVar, "chain");
        C51978xi1 b = bVar.mo84827b();
        if (((C64916p1) C86312j.m106911c(C64916p1.class)).mo59665N()) {
            ArrayMap arrayMap = new ArrayMap();
            LinkedList<C64586nn1> linkedList = b.f144672g;
            if (linkedList != null) {
                for (C64586nn1 nn12 : linkedList) {
                    HashSet<String> hashSet = this.f170939a;
                    String str2 = "";
                    if (nn12 == null || (str = nn12.f184507i) == null) {
                        str = str2;
                    }
                    if (hashSet.contains(str)) {
                        String str3 = nn12.f184507i;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        arrayMap.put(str2, b);
                    }
                }
            }
            C37521f.f99374d.getClass();
            int intValue = C37521f.f99214K4.mo60266n().intValue();
            Log.m105924i("Finder.InnerDropTabRedDotInterceptor", "interceptTabRedDot dropValue:" + intValue);
            int i = ((C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).f34362i;
            C60152b4 Nt0 = ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0();
            Iterator it = arrayMap.keySet().iterator();
            if (it.hasNext()) {
                String str4 = (String) it.next();
                C87412m.m108593f(str4, "path");
                int a6 = Nt0.mo77256a6(str4);
                Log.m105924i("Finder.InnerDropTabRedDotInterceptor", "filter path:" + str4 + " redDotTabType:" + a6 + " currentTabType:" + i);
                C55716q0.f158580a.mo77300a(i, false, intValue, new C59875c(this, (C51978xi1) arrayMap.get(str4)));
            }
        }
        if (b.f144672g.isEmpty()) {
            return null;
        }
        return bVar.mo84828c(b);
    }
}
