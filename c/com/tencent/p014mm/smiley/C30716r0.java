package com.tencent.p014mm.smiley;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.smiley.r0 */
public enum C30716r0 implements C38174i<C96963p0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82621d;

    public Object get() {
        Object obj = this.f82621d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82621d;
                if (obj == obj2) {
                    obj = C96963p0.wx0();
                    this.f82621d = obj;
                }
            }
        }
        return (C96963p0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C30715q0.class;
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
        return "provider " + C96963p0.class.getName();
    }
}
