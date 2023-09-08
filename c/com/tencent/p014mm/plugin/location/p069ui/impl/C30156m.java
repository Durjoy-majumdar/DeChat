package com.tencent.p014mm.plugin.location.p069ui.impl;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.m */
public enum C30156m implements C38174i<C115562l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81525d;

    public Object get() {
        Object obj = this.f81525d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81525d;
                if (obj == obj2) {
                    obj = new C115562l();
                    this.f81525d = obj;
                }
            }
        }
        return (C115562l) obj;
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
        return "provider " + C115562l.class.getName();
    }
}
