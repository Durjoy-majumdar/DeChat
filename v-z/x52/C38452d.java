package x52;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: x52.d */
public enum C38452d implements C38174i<C38450c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101422d;

    public Object get() {
        Object obj = this.f101422d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101422d;
                if (obj == obj2) {
                    obj = new C38450c();
                    this.f101422d = obj;
                }
            }
        }
        return (C38450c) obj;
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
        return "provider " + C38450c.class.getName();
    }
}
