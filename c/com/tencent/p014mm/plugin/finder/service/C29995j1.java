package com.tencent.p014mm.plugin.finder.service;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.finder.service.j1 */
public enum C29995j1 implements C38174i<C29991i1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81198d;

    public Object get() {
        Object obj = this.f81198d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81198d;
                if (obj == obj2) {
                    obj = new C29991i1();
                    this.f81198d = obj;
                }
            }
        }
        return (C29991i1) obj;
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
        return "provider " + C29991i1.class.getName();
    }
}
