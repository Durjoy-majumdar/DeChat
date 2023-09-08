package com.tencent.p014mm.plugin.finder.service;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.finder.service.h1 */
public enum C29989h1 implements C38174i<C56281g1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81184d;

    public Object get() {
        Object obj = this.f81184d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81184d;
                if (obj == obj2) {
                    obj = new C56281g1();
                    this.f81184d = obj;
                }
            }
        }
        return (C56281g1) obj;
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
        return "provider " + C56281g1.class.getName();
    }
}
