package com.tencent.p014mm.plugin.websearch;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.websearch.p */
public enum C30561p implements C38174i<C5835o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82335d;

    public Object get() {
        Object obj = this.f82335d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82335d;
                if (obj == obj2) {
                    obj = new C5835o();
                    this.f82335d = obj;
                }
            }
        }
        return (C5835o) obj;
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
        return "provider " + C5835o.class.getName();
    }
}
