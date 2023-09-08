package py2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: py2.g */
public enum C35743g implements C38174i<C35741f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95459d;

    public Object get() {
        Object obj = this.f95459d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95459d;
                if (obj == obj2) {
                    obj = new C35741f();
                    this.f95459d = obj;
                }
            }
        }
        return (C35741f) obj;
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
        return "provider " + C35741f.class.getName();
    }
}
