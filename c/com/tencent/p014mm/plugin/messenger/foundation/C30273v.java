package com.tencent.p014mm.plugin.messenger.foundation;

import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import ei3.C86522b;
import f62.C31941o0;
import f62.C31952w0;
import java.util.concurrent.ConcurrentHashMap;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.messenger.foundation.v */
public class C30273v extends C86301e implements C31941o0 {

    /* renamed from: d */
    public ConcurrentHashMap<Integer, C31952w0> f81769d = new ConcurrentHashMap<>();

    public C31952w0 get(int i) {
        return this.f81769d.get(Integer.valueOf(i));
    }

    /* renamed from: vI */
    public void mo57261vI(int i, C31952w0 w0Var) {
        if (!this.f81769d.containsKey(Integer.valueOf(i))) {
            this.f81769d.put(Integer.valueOf(i), w0Var);
        }
    }
}
