package p639ow;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ow.g */
public enum C35328g implements C38174i<C35326f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94627d;

    public Object get() {
        Object obj = this.f94627d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94627d;
                if (obj == obj2) {
                    obj = new C35326f();
                    this.f94627d = obj;
                }
            }
        }
        return (C35326f) obj;
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
        return "provider " + C35326f.class.getName();
    }
}
