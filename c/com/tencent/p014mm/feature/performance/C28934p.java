package com.tencent.p014mm.feature.performance;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.feature.performance.p */
public enum C28934p implements C38174i<C80863o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79382d;

    public Object get() {
        Object obj = this.f79382d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79382d;
                if (obj == obj2) {
                    obj = new C80863o();
                    this.f79382d = obj;
                }
            }
        }
        return (C80863o) obj;
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
        return "provider " + C80863o.class.getName();
    }
}
