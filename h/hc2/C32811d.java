package hc2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: hc2.d */
public enum C32811d implements C38174i<C32808c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89256d;

    public Object get() {
        Object obj = this.f89256d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89256d;
                if (obj == obj2) {
                    obj = new C32808c();
                    this.f89256d = obj;
                }
            }
        }
        return (C32808c) obj;
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
        return "provider " + C32808c.class.getName();
    }
}
