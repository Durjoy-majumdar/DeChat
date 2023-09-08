package com.tencent.p014mm.plugin.sport.model;

import com.tencent.p014mm.storage.C85798u1;

/* renamed from: com.tencent.mm.plugin.sport.model.l */
public class C85480l extends C85798u1 {
    public C85480l(String str) {
        super(str);
    }

    /* renamed from: d */
    public synchronized long mo118846d(int i, long j) {
        if (mo119668i()) {
            return this.f249888i.mo119640e(i, j);
        }
        Object a = mo119660a(i);
        if (a instanceof Long) {
            return ((Long) a).longValue();
        } else if (!(a instanceof Integer)) {
            return j;
        } else {
            return ((Integer) a).longValue();
        }
    }
}
