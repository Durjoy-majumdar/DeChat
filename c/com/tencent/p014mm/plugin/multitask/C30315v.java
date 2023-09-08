package com.tencent.p014mm.plugin.multitask;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.multitask.v */
public enum C30315v implements C38174i<C105925u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81841d;

    public Object get() {
        Object obj = this.f81841d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81841d;
                if (obj == obj2) {
                    obj = new C105925u();
                    this.f81841d = obj;
                }
            }
        }
        return (C105925u) obj;
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
        return "provider " + C105925u.class.getName();
    }
}
