package on2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: on2.k */
public enum C35226k implements C38174i<C35221j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94422d;

    public Object get() {
        Object obj = this.f94422d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94422d;
                if (obj == obj2) {
                    obj = new C35221j();
                    this.f94422d = obj;
                }
            }
        }
        return (C35221j) obj;
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
        return "provider " + C35221j.class.getName();
    }
}
