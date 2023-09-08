package com.tencent.p014mm.feature.performance;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.feature.performance.e */
public enum C28924e implements C38174i<C80861d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79353d;

    public Object get() {
        Object obj = this.f79353d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79353d;
                if (obj == obj2) {
                    obj = new C80861d();
                    this.f79353d = obj;
                }
            }
        }
        return (C80861d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C80861d.class.getName();
    }
}
