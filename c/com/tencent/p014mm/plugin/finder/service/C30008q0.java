package com.tencent.p014mm.plugin.finder.service;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.finder.service.q0 */
public enum C30008q0 implements C38174i<C56293p0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81227d;

    public Object get() {
        Object obj = this.f81227d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81227d;
                if (obj == obj2) {
                    obj = new C56293p0();
                    this.f81227d = obj;
                }
            }
        }
        return (C56293p0) obj;
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
        return "provider " + C56293p0.class.getName();
    }
}
