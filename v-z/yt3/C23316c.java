package yt3;

import ot3.C21881e;
import tt3.C22553e;
import ut3.C22662b;

/* renamed from: yt3.c */
public abstract class C23316c extends C23317d {
    /* renamed from: e */
    public void mo36802e(C22553e eVar) {
    }

    /* renamed from: h */
    public void mo36803h(String str, int i) {
        C21881e.m25082a("Soter.BaseSoterPrepareKeyTask", "soter: marking preference. key: %s, status: %d", str, Integer.valueOf(i));
        synchronized (C22662b.class) {
            if (C22662b.m26538b().mo35775c() != null) {
                C22662b.m26538b().mo35775c().edit().putInt(str, i).commit();
            }
        }
    }
}
