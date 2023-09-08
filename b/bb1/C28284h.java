package bb1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: bb1.h */
public enum C28284h implements C38174i<C28283g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77868d;

    public Object get() {
        Object obj = this.f77868d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77868d;
                if (obj == obj2) {
                    obj = new C28283g();
                    this.f77868d = obj;
                }
            }
        }
        return (C28283g) obj;
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
        return "provider " + C28283g.class.getName();
    }
}
