package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.pluginsdk.model.C19449k;
import gy3.C87412m;
import java.util.Set;

/* renamed from: com.tencent.mm.pluginsdk.model.r */
public final class C19461r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Set<String> f54990d;

    /* renamed from: e */
    public final /* synthetic */ long f54991e;

    public C19461r(Set<String> set, long j) {
        this.f54990d = set;
        this.f54991e = j;
    }

    public final void run() {
        C19449k.C19450a aVar;
        C19449k.C19451b bVar;
        C19449k.C19450a aVar2;
        Set<String> set = this.f54990d;
        long j = this.f54991e;
        for (String str : set) {
            if (!(str.length() == 0) && (bVar = C19449k.f54940b.get(str)) != null) {
                C19449k.C19450a aVar3 = bVar.f54969t.get(Integer.valueOf(bVar.f54964o));
                if (aVar3 != null) {
                    aVar3.mo25212b(j);
                }
                if (bVar.f54967r && (aVar2 = bVar.f54969t.get(9)) != null) {
                    aVar2.mo25212b(j);
                }
            }
        }
        Set<String> keySet = C19449k.f54940b.keySet();
        C87412m.m108593f(keySet, "reportInfoMap.keys");
        Set<String> set2 = this.f54990d;
        long j2 = this.f54991e;
        for (String str2 : keySet) {
            C19449k.C19451b bVar2 = C19449k.f54940b.get(str2);
            if (bVar2 != null && !set2.contains(bVar2.f54956g)) {
                C19449k.C19450a aVar4 = bVar2.f54969t.get(Integer.valueOf(bVar2.f54964o));
                if (aVar4 != null) {
                    aVar4.mo25211a(j2);
                }
                if (bVar2.f54967r && (aVar = bVar2.f54969t.get(9)) != null) {
                    aVar.mo25211a(j2);
                }
            }
        }
    }
}
