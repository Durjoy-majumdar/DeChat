package p540gu;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: gu.c */
public enum C32534c implements C38174i<C32532b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86393d;

    public Object get() {
        Object obj = this.f86393d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86393d;
                if (obj == obj2) {
                    obj = new C32532b();
                    this.f86393d = obj;
                }
            }
        }
        return (C32532b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
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
        return "provider " + C32532b.class.getName();
    }
}
