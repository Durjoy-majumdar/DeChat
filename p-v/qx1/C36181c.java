package qx1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qx1.c */
public enum C36181c implements C38174i<C36179b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96373d;

    public Object get() {
        Object obj = this.f96373d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96373d;
                if (obj == obj2) {
                    obj = new C36179b();
                    this.f96373d = obj;
                }
            }
        }
        return (C36179b) obj;
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
        return "provider " + C36179b.class.getName();
    }
}
