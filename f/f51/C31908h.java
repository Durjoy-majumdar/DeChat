package f51;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: f51.h */
public enum C31908h implements C38174i<C45752g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85003d;

    public Object get() {
        Object obj = this.f85003d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85003d;
                if (obj == obj2) {
                    obj = new C45752g();
                    this.f85003d = obj;
                }
            }
        }
        return (C45752g) obj;
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
        return "provider " + C45752g.class.getName();
    }
}
