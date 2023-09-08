package com.tencent.p014mm.plugin.finder.service;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.finder.service.f0 */
public enum C29986f0 implements C38174i<C29983e0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81175d;

    public Object get() {
        Object obj = this.f81175d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81175d;
                if (obj == obj2) {
                    obj = new C29983e0();
                    this.f81175d = obj;
                }
            }
        }
        return (C29983e0) obj;
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
        return "provider " + C29983e0.class.getName();
    }
}
