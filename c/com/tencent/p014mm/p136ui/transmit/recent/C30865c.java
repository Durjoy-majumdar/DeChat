package com.tencent.p014mm.p136ui.transmit.recent;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.ui.transmit.recent.c */
public enum C30865c implements C38174i<C74924b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82896d;

    public Object get() {
        Object obj = this.f82896d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82896d;
                if (obj == obj2) {
                    obj = new C74924b();
                    this.f82896d = obj;
                }
            }
        }
        return (C74924b) obj;
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
        return "provider " + C74924b.class.getName();
    }
}
