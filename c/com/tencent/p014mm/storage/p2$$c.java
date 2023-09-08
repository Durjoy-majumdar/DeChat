package com.tencent.p014mm.storage;

import java.util.Comparator;

/* renamed from: com.tencent.mm.storage.p2$$c */
public class p2$$c implements Comparator<p2$$e> {
    public p2$$c(C30764p2 p2Var) {
    }

    public int compare(Object obj, Object obj2) {
        p2$$e p2__e = (p2$$e) obj;
        p2$$e p2__e2 = (p2$$e) obj2;
        if (p2__e == null && p2__e2 == null) {
            return 0;
        }
        if (p2__e != null) {
            if (p2__e2 != null) {
                int i = p2__e.f82732d;
                if (i != 81 && p2__e2.f82732d != 81) {
                    int i2 = p2__e.f82730b;
                    int i3 = p2__e2.f82730b;
                    if (i2 == i3) {
                        return 0;
                    }
                    if (i2 > i3) {
                        return 1;
                    }
                } else if (i == p2__e2.f82732d) {
                }
            }
            return 1;
        }
        return -1;
    }
}
