package com.tencent.p014mm.plugin.finder.service;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.finder.service.d0 */
public enum C29981d0 implements C38174i<C29978c0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81163d;

    public Object get() {
        Object obj = this.f81163d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81163d;
                if (obj == obj2) {
                    obj = new C29978c0();
                    this.f81163d = obj;
                }
            }
        }
        return (C29978c0) obj;
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
        return "provider " + C29978c0.class.getName();
    }
}
