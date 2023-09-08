package xx1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: xx1.h */
public enum C38883h implements C38174i<C53466g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104802d;

    public Object get() {
        Object obj = this.f104802d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104802d;
                if (obj == obj2) {
                    obj = new C53466g();
                    this.f104802d = obj;
                }
            }
        }
        return (C53466g) obj;
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
        return "provider " + C53466g.class.getName();
    }
}
