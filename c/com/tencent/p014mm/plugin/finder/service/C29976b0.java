package com.tencent.p014mm.plugin.finder.service;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.finder.service.b0 */
public enum C29976b0 implements C38174i<C41487a0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81153d;

    public Object get() {
        Object obj = this.f81153d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81153d;
                if (obj == obj2) {
                    obj = new C41487a0();
                    this.f81153d = obj;
                }
            }
        }
        return (C41487a0) obj;
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
        return "provider " + C41487a0.class.getName();
    }
}
