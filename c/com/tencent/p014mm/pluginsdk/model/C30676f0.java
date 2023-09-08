package com.tencent.p014mm.pluginsdk.model;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.pluginsdk.model.f0 */
public enum C30676f0 implements C38174i<C96780e0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82557d;

    public Object get() {
        Object obj = this.f82557d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82557d;
                if (obj == obj2) {
                    obj = new C96780e0();
                    this.f82557d = obj;
                }
            }
        }
        return (C96780e0) obj;
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
        return "provider " + C96780e0.class.getName();
    }
}
