package com.tencent.p014mm.feature.performance;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.feature.performance.c */
public enum C28919c implements C38174i<C114721b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79345d;

    public Object get() {
        Object obj = this.f79345d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79345d;
                if (obj == obj2) {
                    obj = new C114721b();
                    this.f79345d = obj;
                }
            }
        }
        return (C114721b) obj;
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
        return "provider " + C114721b.class.getName();
    }
}
